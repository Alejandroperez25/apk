package c.d.a.b.f.a;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class h extends c.d.a.b.e.a.a implements g {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // c.d.a.b.f.a.g
    public final void a(i iVar, e eVar) {
        Parcel parcelH = h();
        c.d.a.b.e.a.c.a(parcelH, iVar);
        c.d.a.b.e.a.c.a(parcelH, eVar);
        a(12, parcelH);
    }
}
