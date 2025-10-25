package com.google.firebase.auth.a.a;

import c.d.a.b.e.c.Xa;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.AbstractC0403c;

/* loaded from: classes.dex */
final class Ma extends Ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ka f5259a;

    Ma(Ka ka) {
        this.f5259a = ka;
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void a(c.d.a.b.e.c.Oa oa) {
        boolean z = this.f5259a.f5247a == 1;
        int i2 = this.f5259a.f5247a;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i2);
        com.google.android.gms.common.internal.t.a(z, sb.toString());
        this.f5259a.k = oa;
        this.f5259a.e();
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void a(c.d.a.b.e.c.Oa oa, c.d.a.b.e.c.Ma ma) {
        boolean z = this.f5259a.f5247a == 2;
        int i2 = this.f5259a.f5247a;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i2);
        com.google.android.gms.common.internal.t.a(z, sb.toString());
        this.f5259a.k = oa;
        this.f5259a.l = ma;
        this.f5259a.e();
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void a(c.d.a.b.e.c.Ka ka) {
        boolean z = this.f5259a.f5247a == 3;
        int i2 = this.f5259a.f5247a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        com.google.android.gms.common.internal.t.a(z, sb.toString());
        this.f5259a.m = ka;
        this.f5259a.e();
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void a(Xa xa) {
        boolean z = this.f5259a.f5247a == 4;
        int i2 = this.f5259a.f5247a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        com.google.android.gms.common.internal.t.a(z, sb.toString());
        this.f5259a.n = xa;
        this.f5259a.e();
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void b() {
        boolean z = this.f5259a.f5247a == 5;
        int i2 = this.f5259a.f5247a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        com.google.android.gms.common.internal.t.a(z, sb.toString());
        this.f5259a.e();
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void c() {
        boolean z = this.f5259a.f5247a == 6;
        int i2 = this.f5259a.f5247a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        com.google.android.gms.common.internal.t.a(z, sb.toString());
        this.f5259a.e();
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void a(String str) {
        boolean z = this.f5259a.f5247a == 7;
        int i2 = this.f5259a.f5247a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        com.google.android.gms.common.internal.t.a(z, sb.toString());
        this.f5259a.o = str;
        this.f5259a.e();
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void c(String str) {
        boolean z = this.f5259a.f5247a == 8;
        int i2 = this.f5259a.f5247a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        com.google.android.gms.common.internal.t.a(z, sb.toString());
        this.f5259a.p = str;
        a(new La(this, str));
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void a(com.google.firebase.auth.A a2) {
        boolean z = this.f5259a.f5247a == 8;
        int i2 = this.f5259a.f5247a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        com.google.android.gms.common.internal.t.a(z, sb.toString());
        Ka.a(this.f5259a, true);
        this.f5259a.w = true;
        a(new Oa(this, a2));
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void b(String str) {
        boolean z = this.f5259a.f5247a == 8;
        int i2 = this.f5259a.f5247a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        com.google.android.gms.common.internal.t.a(z, sb.toString());
        this.f5259a.p = str;
        Ka.a(this.f5259a, true);
        this.f5259a.w = true;
        a(new Na(this, str));
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void c(Status status) {
        if (this.f5259a.f5247a != 8) {
            this.f5259a.b(status);
            this.f5259a.a(status);
        } else {
            Ka.a(this.f5259a, true);
            this.f5259a.w = false;
            a(new Qa(this, status));
        }
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void a(Status status, com.google.firebase.auth.A a2) {
        boolean z = this.f5259a.f5247a == 2;
        int i2 = this.f5259a.f5247a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        com.google.android.gms.common.internal.t.a(z, sb.toString());
        a(status, a2, (String) null, (String) null);
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void a(c.d.a.b.e.c.Ga ga) {
        a(ga.m(), ga.o(), ga.n(), ga.p());
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void a(c.d.a.b.e.c.Ja ja) {
        this.f5259a.t = ja;
        this.f5259a.a(com.google.firebase.auth.internal.L.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    private final void a(Status status, AbstractC0403c abstractC0403c, String str, String str2) {
        this.f5259a.b(status);
        this.f5259a.q = abstractC0403c;
        this.f5259a.r = str;
        this.f5259a.s = str2;
        if (this.f5259a.f5252f != null) {
            this.f5259a.f5252f.a(status);
        }
        this.f5259a.a(status);
    }

    @Override // com.google.firebase.auth.a.a.za
    public final void d() {
        boolean z = this.f5259a.f5247a == 9;
        int i2 = this.f5259a.f5247a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        com.google.android.gms.common.internal.t.a(z, sb.toString());
        this.f5259a.e();
    }

    private final void a(Sa sa) {
        this.f5259a.j.execute(new Pa(this, sa));
    }
}
