package c.d.a.a.l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class h extends AbstractC0164g {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f3402e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f3403f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f3404g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f3405h;

    /* renamed from: i, reason: collision with root package name */
    private long f3406i;
    private boolean j;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public h(Context context) {
        super(false);
        this.f3402e = context.getContentResolver();
    }

    @Override // c.d.a.a.l.k
    public long a(n nVar) throws IOException {
        try {
            this.f3403f = nVar.f3417a;
            b(nVar);
            this.f3404g = this.f3402e.openAssetFileDescriptor(this.f3403f, "r");
            if (this.f3404g == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f3403f);
            }
            this.f3405h = new FileInputStream(this.f3404g.getFileDescriptor());
            long startOffset = this.f3404g.getStartOffset();
            long jSkip = this.f3405h.skip(nVar.f3422f + startOffset) - startOffset;
            if (jSkip != nVar.f3422f) {
                throw new EOFException();
            }
            long jPosition = -1;
            if (nVar.f3423g != -1) {
                this.f3406i = nVar.f3423g;
            } else {
                long length = this.f3404g.getLength();
                if (length == -1) {
                    FileChannel channel = this.f3405h.getChannel();
                    long size = channel.size();
                    if (size != 0) {
                        jPosition = size - channel.position();
                    }
                    this.f3406i = jPosition;
                } else {
                    this.f3406i = length - jSkip;
                }
            }
            this.j = true;
            c(nVar);
            return this.f3406i;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // c.d.a.a.l.k
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.f3406i == 0) {
            return -1;
        }
        try {
            if (this.f3406i != -1) {
                i3 = (int) Math.min(this.f3406i, i3);
            }
            int i4 = this.f3405h.read(bArr, i2, i3);
            if (i4 == -1) {
                if (this.f3406i == -1) {
                    return -1;
                }
                throw new a(new EOFException());
            }
            if (this.f3406i != -1) {
                this.f3406i -= i4;
            }
            a(i4);
            return i4;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // c.d.a.a.l.k
    public Uri b() {
        return this.f3403f;
    }

    @Override // c.d.a.a.l.k
    public void close() {
        this.f3403f = null;
        try {
            try {
                if (this.f3405h != null) {
                    this.f3405h.close();
                }
                this.f3405h = null;
                try {
                    try {
                        if (this.f3404g != null) {
                            this.f3404g.close();
                        }
                    } catch (IOException e2) {
                        throw new a(e2);
                    }
                } finally {
                    this.f3404g = null;
                    if (this.j) {
                        this.j = false;
                        c();
                    }
                }
            } catch (IOException e3) {
                throw new a(e3);
            }
        } catch (Throwable th) {
            this.f3405h = null;
            try {
                try {
                    if (this.f3404g != null) {
                        this.f3404g.close();
                    }
                    this.f3404g = null;
                    if (this.j) {
                        this.j = false;
                        c();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new a(e4);
                }
            } finally {
                this.f3404g = null;
                if (this.j) {
                    this.j = false;
                    c();
                }
            }
        }
    }
}
