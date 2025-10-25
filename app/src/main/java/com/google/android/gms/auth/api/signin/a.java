package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int iB = b.b(parcel);
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        String strI4 = null;
        Uri uri = null;
        String strI5 = null;
        String strI6 = null;
        ArrayList arrayListC = null;
        String strI7 = null;
        String strI8 = null;
        long jF = 0;
        int iE = 0;
        while (parcel.dataPosition() < iB) {
            int iA = b.a(parcel);
            switch (b.a(iA)) {
                case 1:
                    iE = b.e(parcel, iA);
                    break;
                case 2:
                    strI = b.i(parcel, iA);
                    break;
                case 3:
                    strI2 = b.i(parcel, iA);
                    break;
                case 4:
                    strI3 = b.i(parcel, iA);
                    break;
                case 5:
                    strI4 = b.i(parcel, iA);
                    break;
                case 6:
                    uri = (Uri) b.a(parcel, iA, Uri.CREATOR);
                    break;
                case 7:
                    strI5 = b.i(parcel, iA);
                    break;
                case 8:
                    jF = b.f(parcel, iA);
                    break;
                case 9:
                    strI6 = b.i(parcel, iA);
                    break;
                case 10:
                    arrayListC = b.c(parcel, iA, Scope.CREATOR);
                    break;
                case 11:
                    strI7 = b.i(parcel, iA);
                    break;
                case 12:
                    strI8 = b.i(parcel, iA);
                    break;
                default:
                    b.b(parcel, iA);
                    break;
            }
        }
        b.m(parcel, iB);
        return new GoogleSignInAccount(iE, strI, strI2, strI3, strI4, uri, strI5, jF, strI6, arrayListC, strI7, strI8);
    }
}
