package io.flutter.view;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import f.a.a.a.e;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.a$a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class k implements f.a.a.a.e {

    /* renamed from: a, reason: collision with root package name */
    private final io.flutter.app.f f6312a;

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.embedding.engine.a.b f6313b;

    /* renamed from: c, reason: collision with root package name */
    private p f6314c;

    /* renamed from: d, reason: collision with root package name */
    private final FlutterJNI f6315d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f6316e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6317f;

    /* renamed from: g, reason: collision with root package name */
    private final io.flutter.embedding.engine.d.d f6318g;

    public k(Context context) {
        this(context, false);
    }

    public k(Context context, boolean z) {
        this.f6318g = new j(this);
        this.f6316e = context;
        this.f6312a = new io.flutter.app.f(this, context);
        this.f6315d = new FlutterJNI();
        this.f6315d.addIsDisplayingFlutterUiListener(this.f6318g);
        this.f6313b = new io.flutter.embedding.engine.a.b(this.f6315d, context.getAssets());
        this.f6315d.addEngineLifecycleListener(new a(this, null));
        a(this, z);
        f();
    }

    public void a() {
        this.f6312a.a();
        this.f6314c = null;
    }

    public void b() {
        this.f6312a.d();
        this.f6313b.b();
        this.f6314c = null;
        this.f6315d.removeIsDisplayingFlutterUiListener(this.f6318g);
        this.f6315d.detachFromNativeAndReleaseResources();
        this.f6317f = false;
    }

    public io.flutter.embedding.engine.a.b c() {
        return this.f6313b;
    }

    public io.flutter.app.f d() {
        return this.f6312a;
    }

    public void a(p pVar, Activity activity) {
        this.f6314c = pVar;
        this.f6312a.a(pVar, activity);
    }

    public boolean e() {
        return this.f6315d.isAttached();
    }

    public void f() {
        if (!e()) {
            throw new AssertionError("Platform view is not attached");
        }
    }

    public void a(l lVar) {
        if (lVar.f6321b == null) {
            throw new AssertionError("An entrypoint must be specified");
        }
        f();
        if (this.f6317f) {
            throw new AssertionError("This Flutter engine instance is already running an application");
        }
        this.f6315d.runBundleAndSnapshotFromLibrary(lVar.f6320a, lVar.f6321b, lVar.f6322c, this.f6316e.getResources().getAssets());
        this.f6317f = true;
    }

    public boolean g() {
        return this.f6317f;
    }

    @Override // f.a.a.a.e
    public void a(String str, ByteBuffer byteBuffer) {
        this.f6313b.c().a(str, byteBuffer);
    }

    @Override // f.a.a.a.e
    public void a(String str, ByteBuffer byteBuffer, e.b bVar) {
        if (!e()) {
            Log.d("FlutterNativeView", "FlutterView.send called on a detached view, channel=" + str);
            return;
        }
        this.f6313b.c().a(str, byteBuffer, bVar);
    }

    @Override // f.a.a.a.e
    public void a(String str, e.a aVar) {
        this.f6313b.c().a(str, aVar);
    }

    FlutterJNI h() {
        return this.f6315d;
    }

    private void a(k kVar, boolean z) {
        this.f6315d.attachToNative(z);
        this.f6313b.a();
    }

    private final class a implements a$a {
        private a() {
        }

        /* synthetic */ a(k kVar, j jVar) {
            this();
        }

        @Override // io.flutter.embedding.engine.a$a
        public void a() {
            if (k.this.f6314c != null) {
                k.this.f6314c.l();
            }
            if (k.this.f6312a == null) {
                return;
            }
            k.this.f6312a.b();
        }
    }
}
