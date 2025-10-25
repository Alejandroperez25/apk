package c.d.a.b.b;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.K;
import com.google.android.gms.common.internal.L;
import com.google.android.gms.common.internal.t;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
abstract class n extends L {

    /* renamed from: a, reason: collision with root package name */
    private int f3761a;

    protected n(byte[] bArr) {
        t.b(bArr.length == 25);
        this.f3761a = Arrays.hashCode(bArr);
    }

    abstract byte[] h();

    public int hashCode() {
        return this.f3761a;
    }

    public boolean equals(Object obj) {
        c.d.a.b.c.a aVarE;
        if (obj == null || !(obj instanceof K)) {
            return false;
        }
        try {
            K k = (K) obj;
            if (k.g() == hashCode() && (aVarE = k.e()) != null) {
                return Arrays.equals(h(), (byte[]) c.d.a.b.c.b.a(aVarE));
            }
            return false;
        } catch (RemoteException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.K
    public final c.d.a.b.c.a e() {
        return c.d.a.b.c.b.a(h());
    }

    @Override // com.google.android.gms.common.internal.K
    public final int g() {
        return hashCode();
    }

    protected static byte[] d(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}
