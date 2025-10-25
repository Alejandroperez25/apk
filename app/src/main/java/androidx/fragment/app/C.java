package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.f;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class C implements Parcelable {
    public static final Parcelable.Creator<C> CREATOR = new B();

    /* renamed from: a, reason: collision with root package name */
    final String f624a;

    /* renamed from: b, reason: collision with root package name */
    final String f625b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f626c;

    /* renamed from: d, reason: collision with root package name */
    final int f627d;

    /* renamed from: e, reason: collision with root package name */
    final int f628e;

    /* renamed from: f, reason: collision with root package name */
    final String f629f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f630g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f631h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f632i;
    final Bundle j;
    final boolean k;
    final int l;
    Bundle m;
    ComponentCallbacksC0108i n;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    C(ComponentCallbacksC0108i componentCallbacksC0108i) {
        this.f624a = componentCallbacksC0108i.getClass().getName();
        this.f625b = componentCallbacksC0108i.f730f;
        this.f626c = componentCallbacksC0108i.n;
        this.f627d = componentCallbacksC0108i.w;
        this.f628e = componentCallbacksC0108i.x;
        this.f629f = componentCallbacksC0108i.y;
        this.f630g = componentCallbacksC0108i.B;
        this.f631h = componentCallbacksC0108i.m;
        this.f632i = componentCallbacksC0108i.A;
        this.j = componentCallbacksC0108i.f731g;
        this.k = componentCallbacksC0108i.z;
        this.l = componentCallbacksC0108i.S.ordinal();
    }

    C(Parcel parcel) {
        this.f624a = parcel.readString();
        this.f625b = parcel.readString();
        this.f626c = parcel.readInt() != 0;
        this.f627d = parcel.readInt();
        this.f628e = parcel.readInt();
        this.f629f = parcel.readString();
        this.f630g = parcel.readInt() != 0;
        this.f631h = parcel.readInt() != 0;
        this.f632i = parcel.readInt() != 0;
        this.j = parcel.readBundle();
        this.k = parcel.readInt() != 0;
        this.m = parcel.readBundle();
        this.l = parcel.readInt();
    }

    public ComponentCallbacksC0108i a(ClassLoader classLoader, C0112m c0112m) {
        if (this.n == null) {
            if (this.j != null) {
                this.j.setClassLoader(classLoader);
            }
            this.n = c0112m.c(classLoader, this.f624a);
            this.n.b(this.j);
            if (this.m != null) {
                this.m.setClassLoader(classLoader);
                this.n.f727c = this.m;
            } else {
                this.n.f727c = new Bundle();
            }
            this.n.f730f = this.f625b;
            this.n.n = this.f626c;
            this.n.p = true;
            this.n.w = this.f627d;
            this.n.x = this.f628e;
            this.n.y = this.f629f;
            this.n.B = this.f630g;
            this.n.m = this.f631h;
            this.n.A = this.f632i;
            this.n.z = this.k;
            this.n.S = f.b.values()[this.l];
            if (w.f770c) {
                Log.v("FragmentManager", "Instantiated fragment " + this.n);
            }
        }
        return this.n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f624a);
        sb.append(" (");
        sb.append(this.f625b);
        sb.append(")}:");
        if (this.f626c) {
            sb.append(" fromLayout");
        }
        if (this.f628e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f628e));
        }
        if (this.f629f != null && !this.f629f.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f629f);
        }
        if (this.f630g) {
            sb.append(" retainInstance");
        }
        if (this.f631h) {
            sb.append(" removing");
        }
        if (this.f632i) {
            sb.append(" detached");
        }
        if (this.k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f624a);
        parcel.writeString(this.f625b);
        parcel.writeInt(this.f626c ? 1 : 0);
        parcel.writeInt(this.f627d);
        parcel.writeInt(this.f628e);
        parcel.writeString(this.f629f);
        parcel.writeInt(this.f630g ? 1 : 0);
        parcel.writeInt(this.f631h ? 1 : 0);
        parcel.writeInt(this.f632i ? 1 : 0);
        parcel.writeBundle(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.m);
        parcel.writeInt(this.l);
    }
}
