package io.flutter.embedding.engine.e;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final f.a.a.a.o f6029a;

    public f(io.flutter.embedding.engine.a.b bVar) {
        this.f6029a = new f.a.a.a.o(bVar, "flutter/navigation", f.a.a.a.j.f5662a);
    }

    public void a(String str) {
        f.a.a.a("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f6029a.a("setInitialRoute", str);
    }

    public void a() {
        f.a.a.a("NavigationChannel", "Sending message to pop route.");
        this.f6029a.a("popRoute", null);
    }
}
