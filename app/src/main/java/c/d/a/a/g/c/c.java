package c.d.a.a.g.c;

import c.d.a.a.g.b;

/* loaded from: classes.dex */
public abstract class c implements b.a {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
