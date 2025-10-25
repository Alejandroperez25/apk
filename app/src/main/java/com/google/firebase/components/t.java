package com.google.firebase.components;

import java.util.Map;

/* loaded from: classes.dex */
final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Map.Entry f5440a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.b.b.a f5441b;

    private t(Map.Entry entry, c.d.b.b.a aVar) {
        this.f5440a = entry;
        this.f5441b = aVar;
    }

    public static Runnable a(Map.Entry entry, c.d.b.b.a aVar) {
        return new t(entry, aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        ((c.d.b.b.b) this.f5440a.getKey()).a(this.f5441b);
    }
}
