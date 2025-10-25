package io.flutter.embedding.engine.e;

import f.a.a.a.d;
import f.a.a.a.r;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.g;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final f.a.a.a.d<Object> f6013a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f6014b;

    /* renamed from: c, reason: collision with root package name */
    private a f6015c;

    /* renamed from: d, reason: collision with root package name */
    private final d.c<Object> f6016d = new io.flutter.embedding.engine.e.a(this);

    public interface a extends FlutterJNI.a {
        void a(int i2);

        void a(String str);

        void b(int i2);

        void b(String str);
    }

    public b(io.flutter.embedding.engine.a.b bVar, FlutterJNI flutterJNI) {
        this.f6013a = new f.a.a.a.d<>(bVar, "flutter/accessibility", r.f5674a);
        this.f6013a.a(this.f6016d);
        this.f6014b = flutterJNI;
    }

    public void a() {
        this.f6014b.setSemanticsEnabled(true);
    }

    public void b() {
        this.f6014b.setSemanticsEnabled(false);
    }

    public void a(int i2) {
        this.f6014b.setAccessibilityFeatures(i2);
    }

    public void a(int i2, g.b bVar) {
        this.f6014b.dispatchSemanticsAction(i2, bVar);
    }

    public void a(int i2, g.b bVar, Object obj) {
        this.f6014b.dispatchSemanticsAction(i2, bVar, obj);
    }

    public void a(a aVar) {
        this.f6015c = aVar;
        this.f6014b.setAccessibilityDelegate(aVar);
    }
}
