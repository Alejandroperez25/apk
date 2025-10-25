package com.google.firebase.auth.a.a;

import android.os.Parcel;
import b.a.a$i;
import c.d.a.b.e.c.AbstractBinderC0175a;
import c.d.a.b.e.c.C0204oa;
import c.d.a.b.e.c.Xa;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class Ba extends AbstractBinderC0175a implements za {
    public Ba() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    @Override // c.d.a.b.e.c.AbstractBinderC0175a
    protected final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                a((c.d.a.b.e.c.Oa) C0204oa.a(parcel, c.d.a.b.e.c.Oa.CREATOR));
                return true;
            case 2:
                a((c.d.a.b.e.c.Oa) C0204oa.a(parcel, c.d.a.b.e.c.Oa.CREATOR), (c.d.a.b.e.c.Ma) C0204oa.a(parcel, c.d.a.b.e.c.Ma.CREATOR));
                return true;
            case 3:
                a((c.d.a.b.e.c.Ka) C0204oa.a(parcel, c.d.a.b.e.c.Ka.CREATOR));
                return true;
            case 4:
                a((Xa) C0204oa.a(parcel, Xa.CREATOR));
                return true;
            case 5:
                c((Status) C0204oa.a(parcel, Status.CREATOR));
                return true;
            case 6:
                b();
                return true;
            case 7:
                c();
                return true;
            case 8:
                a(parcel.readString());
                return true;
            case 9:
                c(parcel.readString());
                return true;
            case 10:
                a((com.google.firebase.auth.A) C0204oa.a(parcel, com.google.firebase.auth.A.CREATOR));
                return true;
            case 11:
                b(parcel.readString());
                return true;
            case 12:
                a((Status) C0204oa.a(parcel, Status.CREATOR), (com.google.firebase.auth.A) C0204oa.a(parcel, com.google.firebase.auth.A.CREATOR));
                return true;
            case 13:
                d();
                return true;
            case 14:
                a((c.d.a.b.e.c.Ga) C0204oa.a(parcel, c.d.a.b.e.c.Ga.CREATOR));
                return true;
            case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
                a((c.d.a.b.e.c.Ja) C0204oa.a(parcel, c.d.a.b.e.c.Ja.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
