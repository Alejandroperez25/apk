package c.d.a.a.l;

import android.net.Uri;
import android.util.Base64;
import c.d.a.a.m.H;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class i extends AbstractC0164g {

    /* renamed from: e, reason: collision with root package name */
    private n f3407e;

    /* renamed from: f, reason: collision with root package name */
    private int f3408f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f3409g;

    public i() {
        super(false);
    }

    @Override // c.d.a.a.l.k
    public long a(n nVar) throws c.d.a.a.x {
        b(nVar);
        this.f3407e = nVar;
        Uri uri = nVar.f3417a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new c.d.a.a.x("Unsupported scheme: " + scheme);
        }
        String[] strArrA = H.a(uri.getSchemeSpecificPart(), ",");
        if (strArrA.length != 2) {
            throw new c.d.a.a.x("Unexpected URI format: " + uri);
        }
        String str = strArrA[1];
        if (strArrA[0].contains(";base64")) {
            try {
                this.f3409g = Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                throw new c.d.a.a.x("Error while parsing Base64 encoded string: " + str, e2);
            }
        } else {
            this.f3409g = H.c(URLDecoder.decode(str, "US-ASCII"));
        }
        c(nVar);
        return this.f3409g.length;
    }

    @Override // c.d.a.a.l.k
    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int length = this.f3409g.length - this.f3408f;
        if (length == 0) {
            return -1;
        }
        int iMin = Math.min(i3, length);
        System.arraycopy(this.f3409g, this.f3408f, bArr, i2, iMin);
        this.f3408f += iMin;
        a(iMin);
        return iMin;
    }

    @Override // c.d.a.a.l.k
    public Uri b() {
        if (this.f3407e != null) {
            return this.f3407e.f3417a;
        }
        return null;
    }

    @Override // c.d.a.a.l.k
    public void close() {
        if (this.f3409g != null) {
            this.f3409g = null;
            c();
        }
        this.f3407e = null;
    }
}
