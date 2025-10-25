package com.google.firebase.auth.a.a;

import android.app.Activity;
import c.d.a.b.e.c.Xa;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0325e;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.firebase.auth.AbstractC0403c;
import com.google.firebase.auth.AbstractC0437s;
import com.google.firebase.auth.B;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
abstract class Ka<ResultT, CallbackT> implements InterfaceC0367g<xa, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    protected final int f5247a;

    /* renamed from: c, reason: collision with root package name */
    protected c.d.b.e f5249c;

    /* renamed from: d, reason: collision with root package name */
    protected AbstractC0437s f5250d;

    /* renamed from: e, reason: collision with root package name */
    protected CallbackT f5251e;

    /* renamed from: f, reason: collision with root package name */
    protected com.google.firebase.auth.internal.R f5252f;

    /* renamed from: g, reason: collision with root package name */
    protected Ja<ResultT> f5253g;

    /* renamed from: i, reason: collision with root package name */
    private Activity f5255i;
    protected Executor j;
    protected c.d.a.b.e.c.Oa k;
    protected c.d.a.b.e.c.Ma l;
    protected c.d.a.b.e.c.Ka m;
    protected Xa n;
    protected String o;
    protected String p;
    protected AbstractC0403c q;
    protected String r;
    protected String s;
    protected c.d.a.b.e.c.Ja t;
    protected boolean u;
    private boolean v;
    boolean w;
    private ResultT x;
    private Status y;

    /* renamed from: b, reason: collision with root package name */
    final Ma f5248b = new Ma(this);

    /* renamed from: h, reason: collision with root package name */
    protected final List<B.b> f5254h = new ArrayList();

    public Ka(int i2) {
        this.f5247a = i2;
    }

    public abstract void d();

    static class a extends LifecycleCallback {

        /* renamed from: b, reason: collision with root package name */
        private final List<B.b> f5256b;

        public static void a(Activity activity, List<B.b> list) {
            InterfaceC0325e interfaceC0325eA = LifecycleCallback.a(activity);
            if (((a) interfaceC0325eA.a("PhoneAuthActivityStopCallback", a.class)) == null) {
                new a(interfaceC0325eA, list);
            }
        }

        private a(InterfaceC0325e interfaceC0325e, List<B.b> list) {
            super(interfaceC0325e);
            this.f4900a.a("PhoneAuthActivityStopCallback", this);
            this.f5256b = list;
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void c() {
            synchronized (this.f5256b) {
                this.f5256b.clear();
            }
        }
    }

    public final Ka<ResultT, CallbackT> a(c.d.b.e eVar) {
        com.google.android.gms.common.internal.t.a(eVar, "firebaseApp cannot be null");
        this.f5249c = eVar;
        return this;
    }

    public final Ka<ResultT, CallbackT> a(AbstractC0437s abstractC0437s) {
        com.google.android.gms.common.internal.t.a(abstractC0437s, "firebaseUser cannot be null");
        this.f5250d = abstractC0437s;
        return this;
    }

    public final Ka<ResultT, CallbackT> a(CallbackT callbackt) {
        com.google.android.gms.common.internal.t.a(callbackt, "external callback cannot be null");
        this.f5251e = callbackt;
        return this;
    }

    public final Ka<ResultT, CallbackT> a(com.google.firebase.auth.internal.R r) {
        com.google.android.gms.common.internal.t.a(r, "external failure callback cannot be null");
        this.f5252f = r;
        return this;
    }

    public final Ka<ResultT, CallbackT> a(B.b bVar, Activity activity, Executor executor) {
        synchronized (this.f5254h) {
            List<B.b> list = this.f5254h;
            com.google.android.gms.common.internal.t.a(bVar);
            list.add(bVar);
        }
        this.f5255i = activity;
        if (this.f5255i != null) {
            a.a(activity, this.f5254h);
        }
        com.google.android.gms.common.internal.t.a(executor);
        this.j = executor;
        return this;
    }

    @Override // com.google.firebase.auth.a.a.InterfaceC0367g
    public final InterfaceC0367g<xa, ResultT> a() {
        this.u = true;
        return this;
    }

    public final void b(ResultT resultt) {
        this.v = true;
        this.w = true;
        this.x = resultt;
        this.f5253g.a(resultt, null);
    }

    public final void a(Status status) {
        this.v = true;
        this.w = false;
        this.y = status;
        this.f5253g.a(null, status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        d();
        com.google.android.gms.common.internal.t.a(this.v, "no success or failure set on method implementation");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Status status) {
        if (this.f5252f != null) {
            this.f5252f.a(status);
        }
    }

    static /* synthetic */ boolean a(Ka ka, boolean z) {
        ka.v = true;
        return true;
    }
}
