package c.d.a.a.l;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class E extends AbstractC0164g {

    /* renamed from: e, reason: collision with root package name */
    private final Resources f3369e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f3370f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f3371g;

    /* renamed from: h, reason: collision with root package name */
    private InputStream f3372h;

    /* renamed from: i, reason: collision with root package name */
    private long f3373i;
    private boolean j;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(IOException iOException) {
            super(iOException);
        }
    }

    public E(Context context) {
        super(false);
        this.f3369e = context.getResources();
    }

    @Override // c.d.a.a.l.k
    public long a(n nVar) throws NumberFormatException, IOException {
        try {
            this.f3370f = nVar.f3417a;
            if (!TextUtils.equals("rawresource", this.f3370f.getScheme())) {
                throw new a("URI must use scheme rawresource");
            }
            try {
                int i2 = Integer.parseInt(this.f3370f.getLastPathSegment());
                b(nVar);
                this.f3371g = this.f3369e.openRawResourceFd(i2);
                this.f3372h = new FileInputStream(this.f3371g.getFileDescriptor());
                this.f3372h.skip(this.f3371g.getStartOffset());
                if (this.f3372h.skip(nVar.f3422f) < nVar.f3422f) {
                    throw new EOFException();
                }
                long j = -1;
                if (nVar.f3423g != -1) {
                    this.f3373i = nVar.f3423g;
                } else {
                    long length = this.f3371g.getLength();
                    if (length != -1) {
                        j = length - nVar.f3422f;
                    }
                    this.f3373i = j;
                }
                this.j = true;
                c(nVar);
                return this.f3373i;
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.");
            }
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // c.d.a.a.l.k
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.f3373i == 0) {
            return -1;
        }
        try {
            if (this.f3373i != -1) {
                i3 = (int) Math.min(this.f3373i, i3);
            }
            int i4 = this.f3372h.read(bArr, i2, i3);
            if (i4 == -1) {
                if (this.f3373i == -1) {
                    return -1;
                }
                throw new a(new EOFException());
            }
            if (this.f3373i != -1) {
                this.f3373i -= i4;
            }
            a(i4);
            return i4;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // c.d.a.a.l.k
    public Uri b() {
        return this.f3370f;
    }

    @Override // c.d.a.a.l.k
    public void close() {
        this.f3370f = null;
        try {
            try {
                if (this.f3372h != null) {
                    this.f3372h.close();
                }
                this.f3372h = null;
                try {
                    try {
                        if (this.f3371g != null) {
                            this.f3371g.close();
                        }
                    } catch (IOException e2) {
                        throw new a(e2);
                    }
                } finally {
                    this.f3371g = null;
                    if (this.j) {
                        this.j = false;
                        c();
                    }
                }
            } catch (IOException e3) {
                throw new a(e3);
            }
        } catch (Throwable th) {
            this.f3372h = null;
            try {
                try {
                    if (this.f3371g != null) {
                        this.f3371g.close();
                    }
                    this.f3371g = null;
                    if (this.j) {
                        this.j = false;
                        c();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new a(e4);
                }
            } finally {
                this.f3371g = null;
                if (this.j) {
                    this.j = false;
                    c();
                }
            }
        }
    }
}
