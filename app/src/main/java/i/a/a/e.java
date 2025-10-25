package i.a.a;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import java.io.IOException;

/* loaded from: classes.dex */
public class e extends c implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    private String f5923a;

    /* renamed from: b, reason: collision with root package name */
    private String f5924b;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5927e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5928f;
    private MediaPlayer m;
    private b n;

    /* renamed from: c, reason: collision with root package name */
    private double f5925c = 1.0d;

    /* renamed from: d, reason: collision with root package name */
    private float f5926d = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    private d f5929g = d.RELEASE;

    /* renamed from: h, reason: collision with root package name */
    private String f5930h = "speakers";

    /* renamed from: i, reason: collision with root package name */
    private boolean f5931i = true;
    private boolean j = false;
    private boolean k = false;
    private int l = -1;

    e(b bVar, String str) {
        this.n = bVar;
        this.f5923a = str;
    }

    @Override // i.a.a.c
    void a(String str, boolean z, Context context) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (c.a(this.f5924b, str)) {
            return;
        }
        this.f5924b = str;
        if (this.f5931i) {
            this.m = b(context);
            this.f5931i = false;
        } else if (this.j) {
            this.m.reset();
            this.j = false;
        }
        a(str);
        this.m.setVolume((float) this.f5925c, (float) this.f5925c);
        this.m.setLooping(this.f5929g == d.LOOP);
        this.m.prepareAsync();
    }

    @Override // i.a.a.c
    void a(double d2) {
        if (this.f5925c != d2) {
            this.f5925c = d2;
            if (this.f5931i) {
                return;
            }
            float f2 = (float) d2;
            this.m.setVolume(f2, f2);
        }
    }

    @Override // i.a.a.c
    void a(String str, Context context) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (c.a(this.f5930h, str)) {
            return;
        }
        boolean z = this.k;
        if (z) {
            d();
        }
        this.f5930h = str;
        int currentPosition = this.m != null ? this.m.getCurrentPosition() : 0;
        this.f5931i = false;
        this.m = b(context);
        a(this.f5924b);
        try {
            this.m.prepare();
            a(currentPosition);
            if (z) {
                this.k = true;
                this.m.start();
            }
        } catch (IOException e2) {
            throw new RuntimeException("Unable to access resource", e2);
        }
    }

    @Override // i.a.a.c
    int b(double d2) {
        if (Build.VERSION.SDK_INT < 23) {
            throw new UnsupportedOperationException("The method 'setRate' is available only on Android SDK version 23 or higher!");
        }
        if (this.m == null) {
            return 0;
        }
        this.f5926d = (float) d2;
        this.m.setPlaybackParams(this.m.getPlaybackParams().setSpeed(this.f5926d));
        return 1;
    }

    @Override // i.a.a.c
    void a(boolean z, boolean z2, Context context) throws IllegalArgumentException {
        if (this.f5927e != z) {
            this.f5927e = z;
            if (!this.f5931i) {
                a(this.m, context);
            }
        }
        if (this.f5928f != z2) {
            this.f5928f = z2;
            if (this.f5931i || !this.f5928f) {
                return;
            }
            this.m.setWakeMode(context, 1);
        }
    }

    @Override // i.a.a.c
    void a(d dVar) {
        if (this.f5929g != dVar) {
            this.f5929g = dVar;
            if (this.f5931i) {
                return;
            }
            this.m.setLooping(dVar == d.LOOP);
        }
    }

    @Override // i.a.a.c
    int e() {
        return this.m.getDuration();
    }

    @Override // i.a.a.c
    int f() {
        return this.m.getCurrentPosition();
    }

    @Override // i.a.a.c
    String a() {
        return this.f5923a;
    }

    @Override // i.a.a.c
    boolean g() {
        return this.k && this.j;
    }

    @Override // i.a.a.c
    void a(Context context) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (this.k) {
            return;
        }
        this.k = true;
        if (this.f5931i) {
            this.f5931i = false;
            this.m = b(context);
            a(this.f5924b);
            this.m.prepareAsync();
            return;
        }
        if (this.j) {
            this.m.start();
            this.n.a(this);
        }
    }

    @Override // i.a.a.c
    void b() throws IllegalStateException {
        if (this.f5931i) {
            return;
        }
        if (this.f5929g != d.RELEASE) {
            if (this.k) {
                this.k = false;
                this.m.pause();
                this.m.seekTo(0);
                return;
            }
            return;
        }
        c();
    }

    @Override // i.a.a.c
    void c() throws IllegalStateException {
        if (this.f5931i) {
            return;
        }
        if (this.k) {
            this.m.stop();
        }
        this.m.reset();
        this.m.release();
        this.m = null;
        this.j = false;
        this.f5931i = true;
        this.k = false;
    }

    @Override // i.a.a.c
    void d() throws IllegalStateException {
        if (this.k) {
            this.k = false;
            this.m.pause();
        }
    }

    @Override // i.a.a.c
    void a(int i2) throws IllegalStateException {
        if (this.j) {
            this.m.seekTo(i2);
        } else {
            this.l = i2;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        this.j = true;
        this.n.b(this);
        if (this.k) {
            this.m.start();
            this.n.a(this);
        }
        if (this.l >= 0) {
            this.m.seekTo(this.l);
            this.l = -1;
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) throws IllegalStateException {
        if (this.f5929g != d.LOOP) {
            b();
        }
        this.n.c(this);
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        this.n.d(this);
    }

    private MediaPlayer b(Context context) throws IllegalArgumentException {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnSeekCompleteListener(this);
        a(mediaPlayer, context);
        mediaPlayer.setVolume((float) this.f5925c, (float) this.f5925c);
        mediaPlayer.setLooping(this.f5929g == d.LOOP);
        return mediaPlayer;
    }

    private void a(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        try {
            this.m.setDataSource(str);
        } catch (IOException e2) {
            throw new RuntimeException("Unable to access resource", e2);
        }
    }

    private void a(MediaPlayer mediaPlayer, Context context) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 21) {
            if (c.a(this.f5930h, "speakers")) {
                mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(this.f5927e ? 6 : 1).setContentType(2).build());
                return;
            }
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(2).build());
            if (context != null) {
                ((AudioManager) context.getSystemService("audio")).setSpeakerphoneOn(false);
                return;
            }
            return;
        }
        if (c.a(this.f5930h, "speakers")) {
            mediaPlayer.setAudioStreamType(this.f5927e ? 2 : 3);
        } else {
            mediaPlayer.setAudioStreamType(0);
        }
    }
}
