package com.google.firebase.auth.a.a;

import c.d.a.b.e.c.C0216ua;
import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.InterfaceC0327h;
import com.google.firebase.auth.InterfaceC0404d;
import com.google.firebase.auth.internal.InterfaceC0412c;

/* renamed from: com.google.firebase.auth.a.a.ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0360ca extends Ka<InterfaceC0404d, InterfaceC0412c> {
    private final C0216ua z;

    public C0360ca(String str, String str2, String str3) {
        super(2);
        com.google.android.gms.common.internal.t.a(str, (Object) "email cannot be null or empty");
        com.google.android.gms.common.internal.t.a(str2, (Object) "password cannot be null or empty");
        this.z = new C0216ua(str, str2, str3);
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final String b() {
        return "signInWithEmailAndPassword";
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final AbstractC0329j<xa, InterfaceC0404d> c() {
        AbstractC0329j.a aVarA = AbstractC0329j.a();
        aVarA.a(false);
        aVarA.a(this.u ? null : new c.d.a.b.b.c[]{c.d.a.b.e.c.Ha.f3812b});
        aVarA.a(new InterfaceC0327h(this) { // from class: com.google.firebase.auth.a.a.ba

            /* renamed from: a, reason: collision with root package name */
            private final C0360ca f5277a;

            {
                this.f5277a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC0327h
            public final void accept(Object obj, Object obj2) {
                this.f5277a.a((xa) obj, (c.d.a.b.h.i) obj2);
            }
        });
        return aVarA.a();
    }

    @Override // com.google.firebase.auth.a.a.Ka
    public final void d() {
        com.google.firebase.auth.internal.E eA = C0371i.a(this.f5249c, this.l);
        ((InterfaceC0412c) this.f5251e).a(this.k, eA);
        b((C0360ca) new com.google.firebase.auth.internal.y(eA));
    }

    final /* synthetic */ void a(xa xaVar, c.d.a.b.h.i iVar) {
        this.f5253g = new Ra(this, iVar);
        if (this.u) {
            xaVar.h().b(this.z.n(), this.z.o(), this.f5248b);
        } else {
            xaVar.h().a(this.z, this.f5248b);
        }
    }
}
