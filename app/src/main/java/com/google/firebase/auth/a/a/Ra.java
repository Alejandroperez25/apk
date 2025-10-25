package com.google.firebase.auth.a.a;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class Ra<ResultT, CallbackT> implements Ja<ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final Ka<ResultT, CallbackT> f5268a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.b.h.i<ResultT> f5269b;

    public Ra(Ka<ResultT, CallbackT> ka, c.d.a.b.h.i<ResultT> iVar) {
        this.f5268a = ka;
        this.f5269b = iVar;
    }

    @Override // com.google.firebase.auth.a.a.Ja
    public final void a(ResultT resultt, Status status) {
        com.google.android.gms.common.internal.t.a(this.f5269b, "completion source cannot be null");
        if (status != null) {
            if (this.f5268a.t != null) {
                this.f5269b.a(ya.a(FirebaseAuth.getInstance(this.f5268a.f5249c), this.f5268a.t));
                return;
            } else if (this.f5268a.q != null) {
                this.f5269b.a(ya.a(status, this.f5268a.q, this.f5268a.r, this.f5268a.s));
                return;
            } else {
                this.f5269b.a(ya.a(status));
                return;
            }
        }
        this.f5269b.a((c.d.a.b.h.i<ResultT>) resultt);
    }
}
