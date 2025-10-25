package com.google.firebase.auth.a.a;

import c.d.a.b.e.c.C0182da;
import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.InterfaceC0327h;
import com.google.firebase.auth.internal.InterfaceC0412c;

/* renamed from: com.google.firebase.auth.a.a.qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0388qa extends Ka<Void, InterfaceC0412c> {
    private final com.google.firebase.auth.A z;

    public C0388qa(com.google.firebase.auth.A a2) {
        super(2);
        com.google.android.gms.common.internal.t.a(a2);
        this.z = a2;
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final String b() {
        return "updatePhoneNumber";
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final AbstractC0329j<xa, Void> c() {
        AbstractC0329j.a aVarA = AbstractC0329j.a();
        aVarA.a(false);
        aVarA.a(this.u ? null : new c.d.a.b.b.c[]{c.d.a.b.e.c.Ha.f3812b});
        aVarA.a(new InterfaceC0327h(this) { // from class: com.google.firebase.auth.a.a.pa

            /* renamed from: a, reason: collision with root package name */
            private final C0388qa f5299a;

            {
                this.f5299a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC0327h
            public final void accept(Object obj, Object obj2) {
                this.f5299a.a((xa) obj, (c.d.a.b.h.i) obj2);
            }
        });
        return aVarA.a();
    }

    @Override // com.google.firebase.auth.a.a.Ka
    public final void d() {
        ((InterfaceC0412c) this.f5251e).a(this.k, C0371i.a(this.f5249c, this.l));
        b((C0388qa) null);
    }

    final /* synthetic */ void a(xa xaVar, c.d.a.b.h.i iVar) {
        this.f5253g = new Ra(this, iVar);
        if (this.u) {
            xaVar.h().a(this.f5250d.y(), this.z, this.f5248b);
        } else {
            xaVar.h().a(new C0182da(this.f5250d.y(), this.z), this.f5248b);
        }
    }
}
