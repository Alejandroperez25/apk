package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;

/* renamed from: com.google.android.gms.common.api.internal.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0329j<A extends a.b, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.a.b.b.c[] f4947a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4948b;

    protected abstract void a(A a2, c.d.a.b.h.i<ResultT> iVar);

    /* renamed from: com.google.android.gms.common.api.internal.j$a */
    public static class a<A extends a.b, ResultT> {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC0327h<A, c.d.a.b.h.i<ResultT>> f4949a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4950b;

        /* renamed from: c, reason: collision with root package name */
        private c.d.a.b.b.c[] f4951c;

        private a() {
            this.f4950b = true;
        }

        public a<A, ResultT> a(InterfaceC0327h<A, c.d.a.b.h.i<ResultT>> interfaceC0327h) {
            this.f4949a = interfaceC0327h;
            return this;
        }

        public a<A, ResultT> a(c.d.a.b.b.c... cVarArr) {
            this.f4951c = cVarArr;
            return this;
        }

        public a<A, ResultT> a(boolean z) {
            this.f4950b = z;
            return this;
        }

        public AbstractC0329j<A, ResultT> a() {
            com.google.android.gms.common.internal.t.b(this.f4949a != null, "execute parameter required");
            return new G(this, this.f4951c, this.f4950b);
        }
    }

    private AbstractC0329j(c.d.a.b.b.c[] cVarArr, boolean z) {
        this.f4947a = cVarArr;
        this.f4948b = z;
    }

    public final c.d.a.b.b.c[] b() {
        return this.f4947a;
    }

    public boolean c() {
        return this.f4948b;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>();
    }
}
