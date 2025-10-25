package c.d.a.a.i.d;

import android.net.Uri;
import c.d.a.a.l.G;
import c.d.a.a.m.AbstractC0170e;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
class c implements c.d.a.a.l.k {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.a.a.l.k f2808a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f2809b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f2810c;

    /* renamed from: d, reason: collision with root package name */
    private CipherInputStream f2811d;

    public c(c.d.a.a.l.k kVar, byte[] bArr, byte[] bArr2) {
        this.f2808a = kVar;
        this.f2809b = bArr;
        this.f2810c = bArr2;
    }

    @Override // c.d.a.a.l.k
    public final void a(G g2) {
        this.f2808a.a(g2);
    }

    @Override // c.d.a.a.l.k
    public final long a(c.d.a.a.l.n nVar) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipherC = c();
            try {
                cipherC.init(2, new SecretKeySpec(this.f2809b, "AES"), new IvParameterSpec(this.f2810c));
                c.d.a.a.l.m mVar = new c.d.a.a.l.m(this.f2808a, nVar);
                this.f2811d = new CipherInputStream(mVar, cipherC);
                mVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // c.d.a.a.l.k
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        AbstractC0170e.a(this.f2811d);
        int i4 = this.f2811d.read(bArr, i2, i3);
        if (i4 < 0) {
            return -1;
        }
        return i4;
    }

    @Override // c.d.a.a.l.k
    public final Uri b() {
        return this.f2808a.b();
    }

    @Override // c.d.a.a.l.k
    public final Map<String, List<String>> a() {
        return this.f2808a.a();
    }

    @Override // c.d.a.a.l.k
    public void close() {
        if (this.f2811d != null) {
            this.f2811d = null;
            this.f2808a.close();
        }
    }

    protected Cipher c() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }
}
