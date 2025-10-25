package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.AbstractC0329j;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.api.internal.C0321a;
import com.google.android.gms.common.api.internal.C0323c;
import com.google.android.gms.common.api.internal.InterfaceC0328i;
import com.google.android.gms.common.api.internal.M;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.internal.C0344d;
import com.google.android.gms.common.internal.t;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4856a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a<O> f4857b;

    /* renamed from: c, reason: collision with root package name */
    private final O f4858c;

    /* renamed from: d, reason: collision with root package name */
    private final M<O> f4859d;

    /* renamed from: e, reason: collision with root package name */
    private final Looper f4860e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4861f;

    /* renamed from: g, reason: collision with root package name */
    private final e f4862g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC0328i f4863h;

    /* renamed from: i, reason: collision with root package name */
    protected final C0323c f4864i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4865a = new C0061a().a();

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC0328i f4866b;

        /* renamed from: c, reason: collision with root package name */
        public final Looper f4867c;

        /* renamed from: com.google.android.gms.common.api.d$a$a, reason: collision with other inner class name */
        public static class C0061a {

            /* renamed from: a, reason: collision with root package name */
            private InterfaceC0328i f4868a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f4869b;

            public C0061a a(InterfaceC0328i interfaceC0328i) {
                t.a(interfaceC0328i, "StatusExceptionMapper must not be null.");
                this.f4868a = interfaceC0328i;
                return this;
            }

            public a a() {
                if (this.f4868a == null) {
                    this.f4868a = new C0321a();
                }
                if (this.f4869b == null) {
                    this.f4869b = Looper.getMainLooper();
                }
                return new a(this.f4868a, this.f4869b);
            }
        }

        private a(InterfaceC0328i interfaceC0328i, Account account, Looper looper) {
            this.f4866b = interfaceC0328i;
            this.f4867c = looper;
        }
    }

    public d(Context context, com.google.android.gms.common.api.a<O> aVar, O o, a aVar2) {
        t.a(context, "Null context is not permitted.");
        t.a(aVar, "Api must not be null.");
        t.a(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f4856a = context.getApplicationContext();
        this.f4857b = aVar;
        this.f4858c = o;
        this.f4860e = aVar2.f4867c;
        this.f4859d = M.a(this.f4857b, this.f4858c);
        this.f4862g = new x(this);
        this.f4864i = C0323c.a(this.f4856a);
        this.f4861f = this.f4864i.c();
        this.f4863h = aVar2.f4866b;
        this.f4864i.a((d<?>) this);
    }

    @Deprecated
    public d(Context context, com.google.android.gms.common.api.a<O> aVar, O o, InterfaceC0328i interfaceC0328i) {
        a.C0061a c0061a = new a.C0061a();
        c0061a.a(interfaceC0328i);
        this(context, aVar, o, c0061a.a());
    }

    private final <TResult, A extends a.b> c.d.a.b.h.h<TResult> a(int i2, AbstractC0329j<A, TResult> abstractC0329j) {
        c.d.a.b.h.i iVar = new c.d.a.b.h.i();
        this.f4864i.a(this, i2, abstractC0329j, iVar, this.f4863h);
        return iVar.a();
    }

    public <TResult, A extends a.b> c.d.a.b.h.h<TResult> a(AbstractC0329j<A, TResult> abstractC0329j) {
        return a(0, abstractC0329j);
    }

    public <TResult, A extends a.b> c.d.a.b.h.h<TResult> b(AbstractC0329j<A, TResult> abstractC0329j) {
        return a(1, abstractC0329j);
    }

    public a.f a(Looper looper, C0323c.a<O> aVar) {
        return this.f4857b.a().a(this.f4856a, looper, c().a(), this.f4858c, aVar, aVar);
    }

    public final M<O> a() {
        return this.f4859d;
    }

    public final int b() {
        return this.f4861f;
    }

    protected C0344d.a c() {
        Account accountA;
        Set<Scope> setEmptySet;
        GoogleSignInAccount googleSignInAccountB;
        GoogleSignInAccount googleSignInAccountB2;
        C0344d.a aVar = new C0344d.a();
        if ((this.f4858c instanceof a.d.b) && (googleSignInAccountB2 = ((a.d.b) this.f4858c).b()) != null) {
            accountA = googleSignInAccountB2.q();
        } else {
            accountA = this.f4858c instanceof a.d.InterfaceC0059a ? ((a.d.InterfaceC0059a) this.f4858c).a() : null;
        }
        aVar.a(accountA);
        if ((this.f4858c instanceof a.d.b) && (googleSignInAccountB = ((a.d.b) this.f4858c).b()) != null) {
            setEmptySet = googleSignInAccountB.u();
        } else {
            setEmptySet = Collections.emptySet();
        }
        aVar.a(setEmptySet);
        aVar.b(this.f4856a.getClass().getName());
        aVar.a(this.f4856a.getPackageName());
        return aVar;
    }

    public B a(Context context, Handler handler) {
        return new B(context, handler, c().a());
    }
}
