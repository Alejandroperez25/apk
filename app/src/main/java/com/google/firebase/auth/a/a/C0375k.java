package com.google.firebase.auth.a.a;

import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.InterfaceC0327h;
import com.google.firebase.auth.InterfaceC0404d;
import com.google.firebase.auth.internal.InterfaceC0412c;

/* renamed from: com.google.firebase.auth.a.a.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0375k extends Ka<InterfaceC0404d, InterfaceC0412c> {
    final c.d.a.b.e.c.R z;

    public C0375k(String str, String str2, String str3) {
        super(2);
        com.google.android.gms.common.internal.t.a(str, (Object) "email cannot be null or empty");
        com.google.android.gms.common.internal.t.a(str2, (Object) "password cannot be null or empty");
        this.z = new c.d.a.b.e.c.R(str, str2, str3);
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final String b() {
        return "createUserWithEmailAndPassword";
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final AbstractC0329j<xa, InterfaceC0404d> c() {
        AbstractC0329j.a aVarA = AbstractC0329j.a();
        aVarA.a(false);
        aVarA.a(this.u ? null : new c.d.a.b.b.c[]{c.d.a.b.e.c.Ha.f3812b});
        aVarA.a(new InterfaceC0327h(this) { // from class: com.google.firebase.auth.a.a.j

            /* renamed from: a, reason: collision with root package name */
            private final C0375k f5292a;

            {
                this.f5292a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC0327h
            public final void accept(Object obj, Object obj2) {
                C0375k c0375k = this.f5292a;
                xa xaVar = (xa) obj;
                c0375k.f5253g = new Ra(c0375k, (c.d.a.b.h.i) obj2);
                if (c0375k.u) {
                    xaVar.h().a(c0375k.z.n(), c0375k.z.o(), c0375k.f5248b);
                } else {
                    xaVar.h().a(c0375k.z, c0375k.f5248b);
                }
            }
        });
        return aVarA.a();
    }

    @Override // com.google.firebase.auth.a.a.Ka
    public final void d() {
        com.google.firebase.auth.internal.E eA = C0371i.a(this.f5249c, this.l);
        ((InterfaceC0412c) this.f5251e).a(this.k, eA);
        b((C0375k) new com.google.firebase.auth.internal.y(eA));
    }
}
