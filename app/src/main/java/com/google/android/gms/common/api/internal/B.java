package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.C0344d;
import java.util.Set;

/* loaded from: classes.dex */
public final class B extends c.d.a.b.f.a.d implements e.a, e.b {

    /* renamed from: a, reason: collision with root package name */
    private static a.AbstractC0058a<? extends c.d.a.b.f.e, c.d.a.b.f.a> f4871a = c.d.a.b.f.b.f3996c;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4872b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f4873c;

    /* renamed from: d, reason: collision with root package name */
    private final a.AbstractC0058a<? extends c.d.a.b.f.e, c.d.a.b.f.a> f4874d;

    /* renamed from: e, reason: collision with root package name */
    private Set<Scope> f4875e;

    /* renamed from: f, reason: collision with root package name */
    private C0344d f4876f;

    /* renamed from: g, reason: collision with root package name */
    private c.d.a.b.f.e f4877g;

    /* renamed from: h, reason: collision with root package name */
    private E f4878h;

    public B(Context context, Handler handler, C0344d c0344d) {
        this(context, handler, c0344d, f4871a);
    }

    public B(Context context, Handler handler, C0344d c0344d, a.AbstractC0058a<? extends c.d.a.b.f.e, c.d.a.b.f.a> abstractC0058a) {
        this.f4872b = context;
        this.f4873c = handler;
        com.google.android.gms.common.internal.t.a(c0344d, "ClientSettings must not be null");
        this.f4876f = c0344d;
        this.f4875e = c0344d.c();
        this.f4874d = abstractC0058a;
    }

    public final void a(E e2) {
        if (this.f4877g != null) {
            this.f4877g.c();
        }
        this.f4876f.a(Integer.valueOf(System.identityHashCode(this)));
        this.f4877g = (c.d.a.b.f.e) this.f4874d.a(this.f4872b, this.f4873c.getLooper(), this.f4876f, this.f4876f.g(), this, this);
        this.f4878h = e2;
        if (this.f4875e == null || this.f4875e.isEmpty()) {
            this.f4873c.post(new C(this));
        } else {
            this.f4877g.connect();
        }
    }

    public final void h() {
        if (this.f4877g != null) {
            this.f4877g.c();
        }
    }

    @Override // com.google.android.gms.common.api.e.a
    public final void a(Bundle bundle) {
        this.f4877g.a(this);
    }

    @Override // com.google.android.gms.common.api.e.a
    public final void a(int i2) {
        this.f4877g.c();
    }

    @Override // com.google.android.gms.common.api.e.b
    public final void a(c.d.a.b.b.a aVar) {
        this.f4878h.b(aVar);
    }

    @Override // c.d.a.b.f.a.e
    public final void a(c.d.a.b.f.a.k kVar) {
        this.f4873c.post(new D(this, kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(c.d.a.b.f.a.k kVar) {
        c.d.a.b.b.a aVarO = kVar.o();
        if (aVarO.p()) {
            com.google.android.gms.common.internal.v vVarP = kVar.p();
            c.d.a.b.b.a aVarP = vVarP.p();
            if (!aVarP.p()) {
                String strValueOf = String.valueOf(aVarP);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(strValueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.f4878h.b(aVarP);
                this.f4877g.c();
                return;
            }
            this.f4878h.a(vVarP.o(), this.f4875e);
        } else {
            this.f4878h.b(aVarO);
        }
        this.f4877g.c();
    }
}
