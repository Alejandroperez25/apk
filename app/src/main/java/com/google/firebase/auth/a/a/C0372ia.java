package com.google.firebase.auth.a.a;

import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.InterfaceC0327h;
import com.google.firebase.auth.InterfaceC0404d;
import com.google.firebase.auth.internal.InterfaceC0412c;

/* renamed from: com.google.firebase.auth.a.a.ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0372ia extends Ka<InterfaceC0404d, InterfaceC0412c> {
    public C0372ia() {
        super(2);
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final String b() {
        return "unlinkEmailCredential";
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final AbstractC0329j<xa, InterfaceC0404d> c() {
        AbstractC0329j.a aVarA = AbstractC0329j.a();
        aVarA.a(false);
        aVarA.a(this.u ? null : new c.d.a.b.b.c[]{c.d.a.b.e.c.Ha.f3812b});
        aVarA.a(new InterfaceC0327h(this) { // from class: com.google.firebase.auth.a.a.ha

            /* renamed from: a, reason: collision with root package name */
            private final C0372ia f5288a;

            {
                this.f5288a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC0327h
            public final void accept(Object obj, Object obj2) {
                C0372ia c0372ia = this.f5288a;
                xa xaVar = (xa) obj;
                c0372ia.f5253g = new Ra(c0372ia, (c.d.a.b.h.i) obj2);
                if (c0372ia.u) {
                    xaVar.h().f(c0372ia.f5250d.y(), c0372ia.f5248b);
                } else {
                    xaVar.h().a(new c.d.a.b.e.c.Aa(c0372ia.f5250d.y()), c0372ia.f5248b);
                }
            }
        });
        return aVarA.a();
    }

    @Override // com.google.firebase.auth.a.a.Ka
    public final void d() {
        com.google.firebase.auth.internal.E eA = C0371i.a(this.f5249c, this.l);
        ((InterfaceC0412c) this.f5251e).a(this.k, eA);
        b((C0372ia) new com.google.firebase.auth.internal.y(eA));
    }
}
