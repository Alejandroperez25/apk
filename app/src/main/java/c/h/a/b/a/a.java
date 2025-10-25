package c.h.a.b.a;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.util.Log;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private int f4669b;

    /* renamed from: a, reason: collision with root package name */
    private final String f4668a = "AudioPostProcessEffect";

    /* renamed from: c, reason: collision with root package name */
    private AcousticEchoCanceler f4670c = null;

    /* renamed from: d, reason: collision with root package name */
    private AutomaticGainControl f4671d = null;

    /* renamed from: e, reason: collision with root package name */
    private NoiseSuppressor f4672e = null;

    public a(int i2) {
        this.f4669b = i2;
    }

    public void a() {
        if (AcousticEchoCanceler.isAvailable() && this.f4670c == null) {
            this.f4670c = AcousticEchoCanceler.create(this.f4669b);
            this.f4670c.setEnabled(true);
            Log.i("AudioPostProcessEffect", "EchoCanceler enabled");
            return;
        }
        Log.e("AudioPostProcessEffect", "This device don't support EchoCanceler");
    }

    public void b() {
        if (this.f4670c != null) {
            this.f4670c.setEnabled(false);
            this.f4670c.release();
            this.f4670c = null;
        }
    }

    public void c() {
        if (NoiseSuppressor.isAvailable() && this.f4672e == null) {
            this.f4672e = NoiseSuppressor.create(this.f4669b);
            this.f4672e.setEnabled(true);
            Log.i("AudioPostProcessEffect", "NoiseSuppressor enabled");
            return;
        }
        Log.e("AudioPostProcessEffect", "This device don't support NoiseSuppressor");
    }

    public void d() {
        if (this.f4672e != null) {
            this.f4672e.setEnabled(false);
            this.f4672e.release();
            this.f4672e = null;
        }
    }
}
