package c.d.a.a.l;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c.d.a.a.l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162e extends AbstractC0164g {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f3393e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f3394f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f3395g;

    /* renamed from: h, reason: collision with root package name */
    private long f3396h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3397i;

    /* renamed from: c.d.a.a.l.e$a */
    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public C0162e(Context context) {
        super(false);
        this.f3393e = context.getAssets();
    }

    @Override // c.d.a.a.l.k
    public long a(n nVar) throws a, EOFException {
        try {
            this.f3394f = nVar.f3417a;
            String path = this.f3394f.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            b(nVar);
            this.f3395g = this.f3393e.open(path, 1);
            if (this.f3395g.skip(nVar.f3422f) < nVar.f3422f) {
                throw new EOFException();
            }
            if (nVar.f3423g != -1) {
                this.f3396h = nVar.f3423g;
            } else {
                this.f3396h = this.f3395g.available();
                if (this.f3396h == 2147483647L) {
                    this.f3396h = -1L;
                }
            }
            this.f3397i = true;
            c(nVar);
            return this.f3396h;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // c.d.a.a.l.k
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.f3396h == 0) {
            return -1;
        }
        try {
            if (this.f3396h != -1) {
                i3 = (int) Math.min(this.f3396h, i3);
            }
            int i4 = this.f3395g.read(bArr, i2, i3);
            if (i4 == -1) {
                if (this.f3396h == -1) {
                    return -1;
                }
                throw new a(new EOFException());
            }
            if (this.f3396h != -1) {
                this.f3396h -= i4;
            }
            a(i4);
            return i4;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // c.d.a.a.l.k
    public Uri b() {
        return this.f3394f;
    }

    @Override // c.d.a.a.l.k
    public void close() {
        this.f3394f = null;
        try {
            try {
                if (this.f3395g != null) {
                    this.f3395g.close();
                }
            } catch (IOException e2) {
                throw new a(e2);
            }
        } finally {
            this.f3395g = null;
            if (this.f3397i) {
                this.f3397i = false;
                c();
            }
        }
    }
}
