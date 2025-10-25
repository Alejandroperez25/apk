package com.google.firebase.auth.a.a;

import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.InterfaceC0327h;
import com.google.firebase.auth.internal.InterfaceC0413d;

/* renamed from: com.google.firebase.auth.a.a.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0379m extends Ka<Void, InterfaceC0413d> {
    public C0379m() {
        super(5);
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final String b() {
        return "delete";
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final AbstractC0329j<xa, Void> c() {
        AbstractC0329j.a aVarA = AbstractC0329j.a();
        aVarA.a(false);
        aVarA.a(this.u ? null : new c.d.a.b.b.c[]{c.d.a.b.e.c.Ha.f3812b});
        aVarA.a(new InterfaceC0327h(this) { // from class: com.google.firebase.auth.a.a.l

            /* renamed from: a, reason: collision with root package name */
            private final C0379m f5294a;

            {
                this.f5294a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC0327h
            public final void accept(Object obj, Object obj2) {
                C0379m c0379m = this.f5294a;
                xa xaVar = (xa) obj;
                c0379m.f5253g = new Ra(c0379m, (c.d.a.b.h.i) obj2);
                if (c0379m.u) {
                    xaVar.h().a(c0379m.f5250d.y(), c0379m.f5248b);
                } else {
                    xaVar.h().a(new c.d.a.b.e.c.T(c0379m.f5250d.y()), c0379m.f5248b);
                }
            }
        });
        return aVarA.a();
    }

    @Override // com.google.firebase.auth.a.a.Ka
    public final void d() {
        ((InterfaceC0413d) this.f5251e).a();
        b((C0379m) null);
    }
}
