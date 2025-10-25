package io.flutter.embedding.engine.e;

import java.util.HashMap;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final f.a.a.a.d<Object> f6101a;

    public n(io.flutter.embedding.engine.a.b bVar) {
        this.f6101a = new f.a.a.a.d<>(bVar, "flutter/system", f.a.a.a.i.f5661a);
    }

    public void a() {
        f.a.a.a("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap map = new HashMap(1);
        map.put("type", "memoryPressure");
        this.f6101a.a((f.a.a.a.d<Object>) map);
    }
}
