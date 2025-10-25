package com.google.firebase.auth.a.a;

import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.InterfaceC0327h;
import com.google.firebase.auth.internal.InterfaceC0412c;

/* renamed from: com.google.firebase.auth.a.a.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0383o extends Ka<com.google.firebase.auth.D, InterfaceC0412c> {
    private final c.d.a.b.e.c.X z;

    public C0383o(String str, String str2) {
        super(3);
        com.google.android.gms.common.internal.t.a(str, (Object) "email cannot be null or empty");
        this.z = new c.d.a.b.e.c.X(str, str2);
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final String b() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final AbstractC0329j<xa, com.google.firebase.auth.D> c() {
        AbstractC0329j.a aVarA = AbstractC0329j.a();
        aVarA.a(false);
        aVarA.a(this.u ? null : new c.d.a.b.b.c[]{c.d.a.b.e.c.Ha.f3812b});
        aVarA.a(new InterfaceC0327h(this) { // from class: com.google.firebase.auth.a.a.n

            /* renamed from: a, reason: collision with root package name */
            private final C0383o f5296a;

            {
                this.f5296a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC0327h
            public final void accept(Object obj, Object obj2) {
                this.f5296a.a((xa) obj, (c.d.a.b.h.i) obj2);
            }
        });
        return aVarA.a();
    }

    @Override // com.google.firebase.auth.a.a.Ka
    public final void d() {
        b((C0383o) new com.google.firebase.auth.internal.O(this.m.o()));
    }

    final /* synthetic */ void a(xa xaVar, c.d.a.b.h.i iVar) {
        this.f5253g = new Ra(this, iVar);
        if (this.u) {
            xaVar.h().c(this.z.n(), this.f5248b);
        } else {
            xaVar.h().a(this.z, this.f5248b);
        }
    }
}
