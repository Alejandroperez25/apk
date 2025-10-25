package c.d.a.b.b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b.a.a$i;
import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.a.a {

    /* renamed from: b, reason: collision with root package name */
    private final int f3728b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3729c;

    /* renamed from: d, reason: collision with root package name */
    private final PendingIntent f3730d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3731e;

    /* renamed from: a, reason: collision with root package name */
    public static final a f3727a = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new k();

    a(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.f3728b = i2;
        this.f3729c = i3;
        this.f3730d = pendingIntent;
        this.f3731e = str;
    }

    public a(int i2) {
        this(i2, null, null);
    }

    public a(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, null);
    }

    public a(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str);
    }

    public final boolean o() {
        return (this.f3729c == 0 || this.f3730d == null) ? false : true;
    }

    public final boolean p() {
        return this.f3729c == 0;
    }

    public final int q() {
        return this.f3729c;
    }

    public final PendingIntent r() {
        return this.f3730d;
    }

    public final String s() {
        return this.f3731e;
    }

    static String a(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case a$i.AppCompatTheme_actionModeBackground /* 17 */:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case a$i.AppCompatTheme_actionModeCopyDrawable /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3729c == aVar.f3729c && com.google.android.gms.common.internal.s.a(this.f3730d, aVar.f3730d) && com.google.android.gms.common.internal.s.a(this.f3731e, aVar.f3731e);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.s.a(Integer.valueOf(this.f3729c), this.f3730d, this.f3731e);
    }

    public final String toString() {
        s.a aVarA = com.google.android.gms.common.internal.s.a(this);
        aVarA.a("statusCode", a(this.f3729c));
        aVarA.a("resolution", this.f3730d);
        aVarA.a("message", this.f3731e);
        return aVarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3728b);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, q());
        com.google.android.gms.common.internal.a.c.a(parcel, 3, (Parcelable) r(), i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, s(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
