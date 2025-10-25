package c.c.a.a;

import android.util.Log;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Mac f1319a;

    public a() {
        try {
            this.f1319a = Mac.getInstance("HmacSHA256");
        } catch (SecurityException e2) {
            Log.e("Crypto", "Security exception when getting HMAC", e2);
        } catch (NoSuchAlgorithmException unused) {
            Log.e("Crypto", "HMAC SHA256 does not exist");
        }
    }

    public byte[] a(byte[] bArr, byte[] bArr2, int i2) throws InvalidKeyException {
        try {
            this.f1319a.init(new SecretKeySpec(bArr2, 0, i2, "HmacSHA256"));
            return this.f1319a.doFinal(bArr);
        } catch (InvalidKeyException e2) {
            Log.e("Crypto", "Invalid key", e2);
            return null;
        }
    }
}
