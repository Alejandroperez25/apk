package com.google.android.gms.common.api.internal;

import c.d.a.b.h.InterfaceC0229c;

/* JADX INFO: Add missing generic type declarations: [TResult] */
/* renamed from: com.google.android.gms.common.api.internal.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0332m<TResult> implements InterfaceC0229c<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ c.d.a.b.h.i f4954a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C0331l f4955b;

    C0332m(C0331l c0331l, c.d.a.b.h.i iVar) {
        this.f4955b = c0331l;
        this.f4954a = iVar;
    }

    @Override // c.d.a.b.h.InterfaceC0229c
    public final void a(c.d.a.b.h.h<TResult> hVar) {
        this.f4955b.f4953b.remove(this.f4954a);
    }
}
