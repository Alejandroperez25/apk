package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.AbstractC0329j;

/* JADX INFO: Add missing generic type declarations: [A, ResultT] */
/* loaded from: classes.dex */
final class G<A, ResultT> extends AbstractC0329j<A, ResultT> {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ AbstractC0329j.a f4892c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(AbstractC0329j.a aVar, c.d.a.b.b.c[] cVarArr, boolean z) {
        super(cVarArr, z);
        this.f4892c = aVar;
    }

    /* JADX WARN: Incorrect types in method signature: (TA;Lc/d/a/b/h/i<TResultT;>;)V */
    @Override // com.google.android.gms.common.api.internal.AbstractC0329j
    protected final void a(a.b bVar, c.d.a.b.h.i iVar) {
        this.f4892c.f4949a.accept(bVar, iVar);
    }
}
