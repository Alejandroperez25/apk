package com.google.firebase.auth.a.a;

import c.d.a.b.e.c.C0194ja;
import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.InterfaceC0327h;
import com.google.firebase.auth.C0354a;
import com.google.firebase.auth.internal.InterfaceC0412c;

/* loaded from: classes.dex */
final class U extends Ka<Void, InterfaceC0412c> {
    private final String A;
    private final C0194ja z;

    public U(String str, C0354a c0354a, String str2, String str3) {
        super(4);
        com.google.android.gms.common.internal.t.a(str, (Object) "email cannot be null or empty");
        this.z = new C0194ja(str, c0354a, str2);
        this.A = str3;
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final String b() {
        return this.A;
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final AbstractC0329j<xa, Void> c() {
        AbstractC0329j.a aVarA = AbstractC0329j.a();
        aVarA.a(false);
        aVarA.a(this.u ? null : new c.d.a.b.b.c[]{c.d.a.b.e.c.Ha.f3812b});
        aVarA.a(new InterfaceC0327h(this) { // from class: com.google.firebase.auth.a.a.T

            /* renamed from: a, reason: collision with root package name */
            private final U f5270a;

            {
                this.f5270a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC0327h
            public final void accept(Object obj, Object obj2) {
                this.f5270a.a((xa) obj, (c.d.a.b.h.i) obj2);
            }
        });
        return aVarA.a();
    }

    @Override // com.google.firebase.auth.a.a.Ka
    public final void d() {
        b((U) null);
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
