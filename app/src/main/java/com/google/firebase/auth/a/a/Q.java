package com.google.firebase.auth.a.a;

import c.d.a.b.e.c.C0186fa;
import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.InterfaceC0327h;
import com.google.firebase.auth.internal.InterfaceC0412c;

/* loaded from: classes.dex */
final class Q extends Ka<Void, InterfaceC0412c> {
    public Q() {
        super(2);
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final String b() {
        return "reload";
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final AbstractC0329j<xa, Void> c() {
        AbstractC0329j.a aVarA = AbstractC0329j.a();
        aVarA.a(false);
        aVarA.a(this.u ? null : new c.d.a.b.b.c[]{c.d.a.b.e.c.Ha.f3812b});
        aVarA.a(new InterfaceC0327h(this) { // from class: com.google.firebase.auth.a.a.P

            /* renamed from: a, reason: collision with root package name */
            private final Q f5263a;

            {
                this.f5263a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC0327h
            public final void accept(Object obj, Object obj2) {
                Q q = this.f5263a;
                xa xaVar = (xa) obj;
                q.f5253g = new Ra(q, (c.d.a.b.h.i) obj2);
                if (q.u) {
                    xaVar.h().e(q.f5250d.y(), q.f5248b);
                } else {
                    xaVar.h().a(new C0186fa(q.f5250d.y()), q.f5248b);
                }
            }
        });
        return aVarA.a();
    }

    @Override // com.google.firebase.auth.a.a.Ka
    public final void d() {
        ((InterfaceC0412c) this.f5251e).a(this.k, C0371i.a(this.f5249c, this.l));
        b((Q) null);
    }
}
