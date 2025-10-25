package com.google.firebase.auth.a.a;

import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.InterfaceC0327h;
import com.google.firebase.auth.internal.InterfaceC0412c;

/* renamed from: com.google.firebase.auth.a.a.oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0384oa extends Ka<Void, InterfaceC0412c> {
    private final String z;

    public C0384oa(String str) {
        super(2);
        com.google.android.gms.common.internal.t.a(str, (Object) "password cannot be null or empty");
        this.z = str;
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final String b() {
        return "updatePassword";
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final AbstractC0329j<xa, Void> c() {
        AbstractC0329j.a aVarA = AbstractC0329j.a();
        aVarA.a(false);
        aVarA.a(this.u ? null : new c.d.a.b.b.c[]{c.d.a.b.e.c.Ha.f3812b});
        aVarA.a(new InterfaceC0327h(this) { // from class: com.google.firebase.auth.a.a.na

            /* renamed from: a, reason: collision with root package name */
            private final C0384oa f5297a;

            {
                this.f5297a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC0327h
            public final void accept(Object obj, Object obj2) {
                this.f5297a.a((xa) obj, (c.d.a.b.h.i) obj2);
            }
        });
        return aVarA.a();
    }

    @Override // com.google.firebase.auth.a.a.Ka
    public final void d() {
        ((InterfaceC0412c) this.f5251e).a(this.k, C0371i.a(this.f5249c, this.l));
        b((C0384oa) null);
    }

    final /* synthetic */ void a(xa xaVar, c.d.a.b.h.i iVar) {
        this.f5253g = new Ra(this, iVar);
        if (this.u) {
            xaVar.h().d(this.f5250d.y(), this.z, this.f5248b);
        } else {
            xaVar.h().a(new c.d.a.b.e.c.P(this.f5250d.y(), this.z), this.f5248b);
        }
    }
}
