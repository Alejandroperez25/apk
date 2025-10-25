package c.d.a.b.f.a;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class f extends c.d.a.b.e.a.b implements e {
    public f() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // c.d.a.b.e.a.b
    protected boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 3:
                a((c.d.a.b.b.a) c.d.a.b.e.a.c.a(parcel, c.d.a.b.b.a.CREATOR), (b) c.d.a.b.e.a.c.a(parcel, b.CREATOR));
                break;
            case 4:
                a((Status) c.d.a.b.e.a.c.a(parcel, Status.CREATOR));
                break;
            case 5:
            default:
                return false;
            case 6:
                b((Status) c.d.a.b.e.a.c.a(parcel, Status.CREATOR));
                break;
            case 7:
                a((Status) c.d.a.b.e.a.c.a(parcel, Status.CREATOR), (GoogleSignInAccount) c.d.a.b.e.a.c.a(parcel, GoogleSignInAccount.CREATOR));
                break;
            case 8:
                a((k) c.d.a.b.e.a.c.a(parcel, k.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
