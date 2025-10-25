package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.b.e.c.AbstractC0221x;
import c.d.a.b.e.c.Oa;
import com.google.firebase.auth.AbstractC0437s;
import com.google.firebase.auth.C0439u;
import com.google.firebase.auth.InterfaceC0438t;
import com.google.firebase.auth.T;
import com.google.firebase.auth.ha;
import com.google.firebase.auth.ja;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class E extends AbstractC0437s {
    public static final Parcelable.Creator<E> CREATOR = new D();

    /* renamed from: a, reason: collision with root package name */
    private Oa f5333a;

    /* renamed from: b, reason: collision with root package name */
    private A f5334b;

    /* renamed from: c, reason: collision with root package name */
    private String f5335c;

    /* renamed from: d, reason: collision with root package name */
    private String f5336d;

    /* renamed from: e, reason: collision with root package name */
    private List<A> f5337e;

    /* renamed from: f, reason: collision with root package name */
    private List<String> f5338f;

    /* renamed from: g, reason: collision with root package name */
    private String f5339g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f5340h;

    /* renamed from: i, reason: collision with root package name */
    private G f5341i;
    private boolean j;
    private T k;
    private C0420k l;

    E(Oa oa, A a2, String str, String str2, List<A> list, List<String> list2, String str3, Boolean bool, G g2, boolean z, T t, C0420k c0420k) {
        this.f5333a = oa;
        this.f5334b = a2;
        this.f5335c = str;
        this.f5336d = str2;
        this.f5337e = list;
        this.f5338f = list2;
        this.f5339g = str3;
        this.f5340h = bool;
        this.f5341i = g2;
        this.j = z;
        this.k = t;
        this.l = c0420k;
    }

    public E(c.d.b.e eVar, List<? extends com.google.firebase.auth.G> list) {
        com.google.android.gms.common.internal.t.a(eVar);
        this.f5335c = eVar.d();
        this.f5336d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f5339g = "2";
        a(list);
    }

    @Override // com.google.firebase.auth.G
    public String l() {
        return this.f5334b.l();
    }

    @Override // com.google.firebase.auth.G
    public Uri h() {
        return this.f5334b.h();
    }

    @Override // com.google.firebase.auth.G
    public String n() {
        return this.f5334b.n();
    }

    @Override // com.google.firebase.auth.G
    public String k() {
        return this.f5334b.k();
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public final String t() {
        Map map;
        if (this.f5333a == null || this.f5333a.q() == null || (map = (Map) AbstractC0419j.a(this.f5333a.q()).f().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    public final E d(String str) {
        this.f5339g = str;
        return this;
    }

    @Override // com.google.firebase.auth.G
    public String a() {
        return this.f5334b.a();
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public final c.d.b.e s() {
        return c.d.b.e.a(this.f5335c);
    }

    public final List<A> C() {
        return this.f5337e;
    }

    @Override // com.google.firebase.auth.AbstractC0437s, com.google.firebase.auth.G
    public String i() {
        return this.f5334b.i();
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public boolean o() {
        if (this.f5340h == null || this.f5340h.booleanValue()) {
            String strE = "";
            if (this.f5333a != null) {
                C0439u c0439uA = AbstractC0419j.a(this.f5333a.q());
                strE = c0439uA != null ? c0439uA.e() : "";
            }
            boolean z = true;
            if (q().size() > 1 || (strE != null && strE.equals("custom"))) {
                z = false;
            }
            this.f5340h = Boolean.valueOf(z);
        }
        return this.f5340h.booleanValue();
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public final List<String> p() {
        return this.f5338f;
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public final AbstractC0437s a(List<? extends com.google.firebase.auth.G> list) {
        com.google.android.gms.common.internal.t.a(list);
        this.f5337e = new ArrayList(list.size());
        this.f5338f = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.google.firebase.auth.G g2 = list.get(i2);
            if (g2.a().equals("firebase")) {
                this.f5334b = (A) g2;
            } else {
                this.f5338f.add(g2.a());
            }
            this.f5337e.add((A) g2);
        }
        if (this.f5334b == null) {
            this.f5334b = this.f5337e.get(0);
        }
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public List<? extends com.google.firebase.auth.G> q() {
        return this.f5337e;
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public final Oa x() {
        return this.f5333a;
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public final String z() {
        return x().q();
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public final String y() {
        return this.f5333a.t();
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public final void a(Oa oa) {
        com.google.android.gms.common.internal.t.a(oa);
        this.f5333a = oa;
    }

    @Override // com.google.firebase.auth.G
    public boolean j() {
        return this.f5334b.j();
    }

    public final void a(G g2) {
        this.f5341i = g2;
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public InterfaceC0438t A() {
        return this.f5341i;
    }

    public final void b(boolean z) {
        this.j = z;
    }

    public final boolean e() {
        return this.j;
    }

    public final void a(T t) {
        this.k = t;
    }

    public final T D() {
        return this.k;
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public final void b(List<ja> list) {
        this.l = C0420k.a(list);
    }

    public final List<ja> E() {
        if (this.l != null) {
            return this.l.o();
        }
        return AbstractC0221x.h();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, (Parcelable) x(), i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, (Parcelable) this.f5334b, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f5335c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f5336d, false);
        com.google.android.gms.common.internal.a.c.b(parcel, 5, this.f5337e, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 6, p(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 7, this.f5339g, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 8, Boolean.valueOf(o()), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 9, (Parcelable) A(), i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 10, this.j);
        com.google.android.gms.common.internal.a.c.a(parcel, 11, (Parcelable) this.k, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 12, (Parcelable) this.l, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public final /* synthetic */ ha B() {
        return new I(this);
    }

    @Override // com.google.firebase.auth.AbstractC0437s
    public final /* synthetic */ AbstractC0437s r() {
        this.f5340h = false;
        return this;
    }
}
