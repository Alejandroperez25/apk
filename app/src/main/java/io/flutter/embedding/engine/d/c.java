package io.flutter.embedding.engine.d;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.r;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;

@TargetApi(16)
/* loaded from: classes.dex */
public class c implements r {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f6003a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f6004b = new AtomicLong(0);

    /* renamed from: c, reason: collision with root package name */
    private boolean f6005c = false;

    /* renamed from: d, reason: collision with root package name */
    private final d f6006d = new io.flutter.embedding.engine.d.a(this);

    public c(FlutterJNI flutterJNI) {
        this.f6003a = flutterJNI;
        this.f6003a.addIsDisplayingFlutterUiListener(this.f6006d);
    }

    @Override // io.flutter.view.r
    public r.a a() {
        f.a.a.a("FlutterRenderer", "Creating a SurfaceTexture.");
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        a aVar = new a(this.f6004b.getAndIncrement(), surfaceTexture);
        f.a.a.a("FlutterRenderer", "New SurfaceTexture ID: " + aVar.c());
        a(aVar.c(), surfaceTexture);
        return aVar;
    }

    final class a implements r.a {

        /* renamed from: a, reason: collision with root package name */
        private final long f6007a;

        /* renamed from: b, reason: collision with root package name */
        private final SurfaceTexture f6008b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6009c;

        /* renamed from: d, reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f6010d = new b(this);

        a(long j, SurfaceTexture surfaceTexture) {
            this.f6007a = j;
            this.f6008b = surfaceTexture;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f6008b.setOnFrameAvailableListener(this.f6010d, new Handler());
            } else {
                this.f6008b.setOnFrameAvailableListener(this.f6010d);
            }
        }

        @Override // io.flutter.view.r.a
        public SurfaceTexture b() {
            return this.f6008b;
        }

        @Override // io.flutter.view.r.a
        public long c() {
            return this.f6007a;
        }

        @Override // io.flutter.view.r.a
        public void a() {
            if (this.f6009c) {
                return;
            }
            f.a.a.a("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f6007a + ").");
            this.f6008b.release();
            c.this.b(this.f6007a);
            this.f6009c = true;
        }
    }

    public void a(ByteBuffer byteBuffer, int i2) {
        this.f6003a.dispatchPointerDataPacket(byteBuffer, i2);
    }

    private void a(long j, SurfaceTexture surfaceTexture) {
        this.f6003a.registerTexture(j, surfaceTexture);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        this.f6003a.markTextureFrameAvailable(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        this.f6003a.unregisterTexture(j);
    }
}
