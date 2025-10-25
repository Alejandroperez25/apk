package c.h.a.b.a;

import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private AudioRecord f4675b;

    /* renamed from: c, reason: collision with root package name */
    private b f4676c;
    private a l;
    private HandlerThread m;

    /* renamed from: a, reason: collision with root package name */
    private final String f4674a = "MicrophoneManager";

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f4677d = ByteBuffer.allocateDirect(4096);

    /* renamed from: e, reason: collision with root package name */
    private byte[] f4678e = new byte[4096];

    /* renamed from: f, reason: collision with root package name */
    private boolean f4679f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4680g = false;

    /* renamed from: h, reason: collision with root package name */
    private int f4681h = 32000;

    /* renamed from: i, reason: collision with root package name */
    private int f4682i = 2;
    private int j = 12;
    private boolean k = false;

    public int c() {
        return 4096;
    }

    public d(b bVar) {
        this.f4676c = bVar;
    }

    public void a(int i2, boolean z, boolean z2, boolean z3) {
        this.f4681h = i2;
        if (!z) {
            this.j = 16;
        }
        this.f4675b = new AudioRecord(0, i2, this.j, this.f4682i, f());
        this.l = new a(this.f4675b.getAudioSessionId());
        if (z2) {
            this.l.a();
        }
        if (z3) {
            this.l.c();
        }
        Log.i("MicrophoneManager", "Microphone created, " + i2 + "hz, " + (z ? "Stereo" : "Mono"));
        this.f4680g = true;
    }

    public synchronized void a() {
        d();
        this.m = new HandlerThread("MicrophoneManager");
        this.m.start();
        new Handler(this.m.getLooper()).post(new c(this));
    }

    private void d() throws IllegalStateException {
        if (this.f4675b != null) {
            this.f4675b.startRecording();
            this.f4679f = true;
            Log.i("MicrophoneManager", "Microphone started");
            return;
        }
        Log.e("MicrophoneManager", "Error starting, microphone was stopped or not created, use createMicrophone() before start()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c.h.a.c e() {
        this.f4677d.rewind();
        int i2 = this.f4675b.read(this.f4677d, this.f4677d.remaining());
        if (i2 <= 0) {
            return null;
        }
        return new c.h.a.c(this.k ? this.f4678e : this.f4677d.array(), this.k ? 0 : this.f4677d.arrayOffset(), i2);
    }

    public synchronized void b() {
        this.f4679f = false;
        this.f4680g = false;
        if (Build.VERSION.SDK_INT >= 18) {
            this.m.quitSafely();
        } else {
            this.m.quit();
        }
        if (this.f4675b != null) {
            this.f4675b.setRecordPositionUpdateListener(null);
            this.f4675b.stop();
            this.f4675b.release();
            this.f4675b = null;
        }
        if (this.l != null) {
            this.l.b();
            this.l.d();
        }
        Log.i("MicrophoneManager", "Microphone stopped");
    }

    private int f() {
        return AudioRecord.getMinBufferSize(this.f4681h, this.j, 2) * 5;
    }
}
