package io.flutter.embedding.engine.a;

import android.content.res.AssetManager;
import f.a.a.a.e;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f5969a;

    /* renamed from: b, reason: collision with root package name */
    private final AssetManager f5970b;

    /* renamed from: c, reason: collision with root package name */
    private final c f5971c;

    /* renamed from: d, reason: collision with root package name */
    private final e f5972d;

    /* renamed from: f, reason: collision with root package name */
    private String f5974f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC0070b f5975g;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5973e = false;

    /* renamed from: h, reason: collision with root package name */
    private final e.a f5976h = new io.flutter.embedding.engine.a.a(this);

    /* renamed from: io.flutter.embedding.engine.a.b$b, reason: collision with other inner class name */
    interface InterfaceC0070b {
        void a(String str);
    }

    public b(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f5969a = flutterJNI;
        this.f5970b = assetManager;
        this.f5971c = new c(flutterJNI);
        this.f5971c.a("flutter/isolate", this.f5976h);
        this.f5972d = new a(this.f5971c, null);
    }

    public void a() {
        f.a.a.a("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f5969a.setPlatformMessageHandler(this.f5971c);
    }

    public void b() {
        f.a.a.a("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f5969a.setPlatformMessageHandler(null);
    }

    public e c() {
        return this.f5972d;
    }

    @Override // f.a.a.a.e
    @Deprecated
    public void a(String str, ByteBuffer byteBuffer) {
        this.f5972d.a(str, byteBuffer);
    }

    @Override // f.a.a.a.e
    @Deprecated
    public void a(String str, ByteBuffer byteBuffer, e.b bVar) {
        this.f5972d.a(str, byteBuffer, bVar);
    }

    @Override // f.a.a.a.e
    @Deprecated
    public void a(String str, e.a aVar) {
        this.f5972d.a(str, aVar);
    }

    private static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        private final c f5977a;

        /* synthetic */ a(c cVar, io.flutter.embedding.engine.a.a aVar) {
            this(cVar);
        }

        private a(c cVar) {
            this.f5977a = cVar;
        }

        @Override // f.a.a.a.e
        public void a(String str, ByteBuffer byteBuffer) {
            this.f5977a.a(str, byteBuffer, (e.b) null);
        }

        @Override // f.a.a.a.e
        public void a(String str, ByteBuffer byteBuffer, e.b bVar) {
            this.f5977a.a(str, byteBuffer, bVar);
        }

        @Override // f.a.a.a.e
        public void a(String str, e.a aVar) {
            this.f5977a.a(str, aVar);
        }
    }
}
