package com.google.firebase.auth.a.a;

import c.d.a.b.e.c.C0198la;
import c.d.a.b.e.c.Ya;
import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.InterfaceC0327h;
import com.google.firebase.auth.B;

/* renamed from: com.google.firebase.auth.a.a.ua, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0396ua extends Ka<Void, B.b> {
    private final C0198la z;

    public C0396ua(Ya ya) {
        super(8);
        com.google.android.gms.common.internal.t.a(ya);
        this.z = new C0198la(ya);
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final String b() {
        return "verifyPhoneNumber";
    }

    @Override // com.google.firebase.auth.a.a.Ka
    public final void d() {
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final AbstractC0329j<xa, Void> c() {
        AbstractC0329j.a aVarA = AbstractC0329j.a();
        aVarA.a(false);
        aVarA.a(this.u ? null : new c.d.a.b.b.c[]{c.d.a.b.e.c.Ha.f3812b});
        aVarA.a(new InterfaceC0327h(this) { // from class: com.google.firebase.auth.a.a.ta

            /* renamed from: a, reason: collision with root package name */
            private final C0396ua f5303a;

            {
                this.f5303a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC0327h
            public final void accept(Object obj, Object obj2) {
                this.f5303a.a((xa) obj, (c.d.a.b.h.i) obj2);
            }
        });
        return aVarA.a();
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
