package io.flutter.embedding.engine.e;

import f.a.a.a.t;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final f.a.a.a.d<String> f6027a;

    public d(io.flutter.embedding.engine.a.b bVar) {
        this.f6027a = new f.a.a.a.d<>(bVar, "flutter/lifecycle", t.f5680b);
    }

    public void a() {
        f.a.a.a("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f6027a.a((f.a.a.a.d<String>) "AppLifecycleState.inactive");
    }

    public void b() {
        f.a.a.a("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f6027a.a((f.a.a.a.d<String>) "AppLifecycleState.resumed");
    }

    public void c() {
        f.a.a.a("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f6027a.a((f.a.a.a.d<String>) "AppLifecycleState.paused");
    }
}
