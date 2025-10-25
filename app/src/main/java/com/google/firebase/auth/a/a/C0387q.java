package com.google.firebase.auth.a.a;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.InterfaceC0327h;
import com.google.firebase.auth.C0439u;
import com.google.firebase.auth.internal.AbstractC0419j;
import com.google.firebase.auth.internal.InterfaceC0412c;

/* renamed from: com.google.firebase.auth.a.a.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0387q extends Ka<C0439u, InterfaceC0412c> {
    private final c.d.a.b.e.c.V z;

    public C0387q(String str) {
        super(1);
        com.google.android.gms.common.internal.t.a(str, (Object) "refresh token cannot be null");
        this.z = new c.d.a.b.e.c.V(str);
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final String b() {
        return "getAccessToken";
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final AbstractC0329j<xa, C0439u> c() {
        AbstractC0329j.a aVarA = AbstractC0329j.a();
        aVarA.a(false);
        aVarA.a(this.u ? null : new c.d.a.b.b.c[]{c.d.a.b.e.c.Ha.f3812b});
        aVarA.a(new InterfaceC0327h(this) { // from class: com.google.firebase.auth.a.a.p

            /* renamed from: a, reason: collision with root package name */
            private final C0387q f5298a;

            {
                this.f5298a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC0327h
            public final void accept(Object obj, Object obj2) {
                this.f5298a.a((xa) obj, (c.d.a.b.h.i) obj2);
            }
        });
        return aVarA.a();
    }

    @Override // com.google.firebase.auth.a.a.Ka
    public final void d() {
        if (TextUtils.isEmpty(this.k.p())) {
            this.k.b(this.z.o());
        }
        ((InterfaceC0412c) this.f5251e).a(this.k, this.f5250d);
        b((C0387q) AbstractC0419j.a(this.k.q()));
    }

    final /* synthetic */ void a(xa xaVar, c.d.a.b.h.i iVar) {
        this.f5253g = new Ra(this, iVar);
        if (this.u) {
            xaVar.h().b(this.z.o(), this.f5248b);
        } else {
            xaVar.h().a(this.z, this.f5248b);
        }
    }
}
