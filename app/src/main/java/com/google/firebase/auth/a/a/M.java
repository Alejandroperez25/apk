package com.google.firebase.auth.a.a;

import c.d.a.b.e.c.C0224ya;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.InterfaceC0327h;
import com.google.firebase.auth.internal.InterfaceC0412c;

/* loaded from: classes.dex */
final class M extends Ka<Void, InterfaceC0412c> {
    private final C0224ya z;

    public M(com.google.firebase.auth.A a2, String str) {
        super(2);
        com.google.android.gms.common.internal.t.a(a2, "credential cannot be null");
        a2.a(false);
        this.z = new C0224ya(a2, str);
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final String b() {
        return "reauthenticateWithPhoneCredential";
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final AbstractC0329j<xa, Void> c() {
        AbstractC0329j.a aVarA = AbstractC0329j.a();
        aVarA.a(false);
        aVarA.a(this.u ? null : new c.d.a.b.b.c[]{c.d.a.b.e.c.Ha.f3812b});
        aVarA.a(new InterfaceC0327h(this) { // from class: com.google.firebase.auth.a.a.L

            /* renamed from: a, reason: collision with root package name */
            private final M f5257a;

            {
                this.f5257a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC0327h
            public final void accept(Object obj, Object obj2) {
                this.f5257a.a((xa) obj, (c.d.a.b.h.i) obj2);
            }
        });
        return aVarA.a();
    }

    @Override // com.google.firebase.auth.a.a.Ka
    public final void d() {
        com.google.firebase.auth.internal.E eA = C0371i.a(this.f5249c, this.l);
        if (this.f5250d.i().equalsIgnoreCase(eA.i())) {
            ((InterfaceC0412c) this.f5251e).a(this.k, eA);
            b((M) null);
        } else {
            a(new Status(17024));
        }
    }

    final /* synthetic */ void a(xa xaVar, c.d.a.b.h.i iVar) {
        this.f5253g = new Ra(this, iVar);
        if (this.u) {
            xaVar.h().a(this.z.o(), this.f5248b);
        } else {
            xaVar.h().a(this.z, this.f5248b);
        }
    }
}
