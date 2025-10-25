package com.google.firebase.auth.a.a;

import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.InterfaceC0327h;
import com.google.firebase.auth.C0405e;
import com.google.firebase.auth.InterfaceC0404d;
import com.google.firebase.auth.internal.InterfaceC0412c;

/* renamed from: com.google.firebase.auth.a.a.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0391s extends Ka<InterfaceC0404d, InterfaceC0412c> {
    private final C0405e z;

    public C0391s(C0405e c0405e) {
        super(2);
        com.google.android.gms.common.internal.t.a(c0405e, "credential cannot be null");
        this.z = c0405e;
        com.google.android.gms.common.internal.t.a(c0405e.n(), (Object) "email cannot be null");
        com.google.android.gms.common.internal.t.a(c0405e.q(), (Object) "password cannot be null");
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final String b() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final AbstractC0329j<xa, InterfaceC0404d> c() {
        AbstractC0329j.a aVarA = AbstractC0329j.a();
        aVarA.a(false);
        aVarA.a(this.u ? null : new c.d.a.b.b.c[]{c.d.a.b.e.c.Ha.f3812b});
        aVarA.a(new InterfaceC0327h(this) { // from class: com.google.firebase.auth.a.a.r

            /* renamed from: a, reason: collision with root package name */
            private final C0391s f5300a;

            {
                this.f5300a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC0327h
            public final void accept(Object obj, Object obj2) {
                this.f5300a.a((xa) obj, (c.d.a.b.h.i) obj2);
            }
        });
        return aVarA.a();
    }

    @Override // com.google.firebase.auth.a.a.Ka
    public final void d() {
        com.google.firebase.auth.internal.E eA = C0371i.a(this.f5249c, this.l);
        ((InterfaceC0412c) this.f5251e).a(this.k, eA);
        b((C0391s) new com.google.firebase.auth.internal.y(eA));
    }

    final /* synthetic */ void a(xa xaVar, c.d.a.b.h.i iVar) {
        this.f5253g = new Ra(this, iVar);
        if (this.u) {
            xaVar.h().a(this.z.n(), this.z.q(), this.f5250d.y(), this.f5248b);
        } else {
            xaVar.h().a(new c.d.a.b.e.c.Z(this.z.n(), this.z.q(), this.f5250d.y()), this.f5248b);
        }
    }
}
