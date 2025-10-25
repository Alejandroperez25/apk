package c.d.a.a.b;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import b.a.a$i;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f1578a;

    /* renamed from: b, reason: collision with root package name */
    private final a f1579b;

    /* renamed from: c, reason: collision with root package name */
    private final b f1580c;

    /* renamed from: d, reason: collision with root package name */
    private j f1581d;

    /* renamed from: e, reason: collision with root package name */
    private int f1582e;

    /* renamed from: f, reason: collision with root package name */
    private int f1583f;

    /* renamed from: g, reason: collision with root package name */
    private float f1584g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f1585h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1586i;

    public interface b {
        void a(float f2);

        void b(int i2);
    }

    private int b(boolean z) {
        return z ? 1 : -1;
    }

    public m(Context context, b bVar) {
        this.f1578a = context == null ? null : (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.f1580c = bVar;
        this.f1579b = new a();
        this.f1582e = 0;
    }

    public float a() {
        return this.f1584g;
    }

    public int a(j jVar, boolean z, int i2) {
        if (this.f1581d == null && jVar == null) {
            return z ? 1 : -1;
        }
        AbstractC0170e.a(this.f1578a, "SimpleExoPlayer must be created with a context to handle audio focus.");
        if (!c.d.a.a.m.H.a(this.f1581d, jVar)) {
            this.f1581d = jVar;
            this.f1583f = a(jVar);
            AbstractC0170e.a(this.f1583f == 1 || this.f1583f == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
            if (z && (i2 == 2 || i2 == 3)) {
                return c();
            }
        }
        if (i2 == 1) {
            return b(z);
        }
        return a(z);
    }

    public int a(boolean z) {
        if (this.f1578a == null) {
            return 1;
        }
        if (z) {
            return c();
        }
        return -1;
    }

    public int a(boolean z, int i2) {
        if (this.f1578a == null) {
            return 1;
        }
        if (z) {
            return i2 == 1 ? b(z) : c();
        }
        d();
        return -1;
    }

    public void b() {
        if (this.f1578a == null) {
            return;
        }
        c(true);
    }

    private int c() {
        int iE;
        if (this.f1583f == 0) {
            if (this.f1582e != 0) {
                c(true);
            }
            return 1;
        }
        if (this.f1582e == 0) {
            if (c.d.a.a.m.H.f3499a >= 26) {
                iE = f();
            } else {
                iE = e();
            }
            this.f1582e = iE == 1 ? 1 : 0;
        }
        if (this.f1582e == 0) {
            return -1;
        }
        return this.f1582e == 2 ? 0 : 1;
    }

    private void d() {
        c(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        if (this.f1583f == 0 && this.f1582e == 0) {
            return;
        }
        if (this.f1583f != 1 || this.f1582e == -1 || z) {
            if (c.d.a.a.m.H.f3499a >= 26) {
                h();
            } else {
                g();
            }
            this.f1582e = 0;
        }
    }

    private int e() {
        AudioManager audioManager = this.f1578a;
        AbstractC0170e.a(audioManager);
        a aVar = this.f1579b;
        j jVar = this.f1581d;
        AbstractC0170e.a(jVar);
        return audioManager.requestAudioFocus(aVar, c.d.a.a.m.H.h(jVar.f1570d), this.f1583f);
    }

    private int f() {
        if (this.f1585h == null || this.f1586i) {
            AudioFocusRequest.Builder builder = this.f1585h == null ? new AudioFocusRequest.Builder(this.f1583f) : new AudioFocusRequest.Builder(this.f1585h);
            boolean zI = i();
            j jVar = this.f1581d;
            AbstractC0170e.a(jVar);
            this.f1585h = builder.setAudioAttributes(jVar.a()).setWillPauseWhenDucked(zI).setOnAudioFocusChangeListener(this.f1579b).build();
            this.f1586i = false;
        }
        AudioManager audioManager = this.f1578a;
        AbstractC0170e.a(audioManager);
        return audioManager.requestAudioFocus(this.f1585h);
    }

    private void g() {
        AudioManager audioManager = this.f1578a;
        AbstractC0170e.a(audioManager);
        audioManager.abandonAudioFocus(this.f1579b);
    }

    private void h() {
        if (this.f1585h != null) {
            AudioManager audioManager = this.f1578a;
            AbstractC0170e.a(audioManager);
            audioManager.abandonAudioFocusRequest(this.f1585h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        return this.f1581d != null && this.f1581d.f1568b == 1;
    }

    private static int a(j jVar) {
        if (jVar == null) {
            return 0;
        }
        switch (jVar.f1570d) {
            case 0:
                c.d.a.a.m.o.c("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                break;
            case 1:
            case 14:
                break;
            case 2:
            case 4:
                break;
            case 3:
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (jVar.f1568b == 1) {
                }
                break;
            case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
            default:
                c.d.a.a.m.o.c("AudioFocusManager", "Unidentified audio usage: " + jVar.f1570d);
                break;
            case 16:
                if (c.d.a.a.m.H.f3499a >= 19) {
                }
                break;
        }
        return 0;
    }

    private class a implements AudioManager.OnAudioFocusChangeListener {
        private a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i2) {
            if (i2 != 1) {
                switch (i2) {
                    case -3:
                        if (m.this.i()) {
                            m.this.f1582e = 2;
                            break;
                        } else {
                            m.this.f1582e = 3;
                            break;
                        }
                    case -2:
                        m.this.f1582e = 2;
                        break;
                    case -1:
                        m.this.f1582e = -1;
                        break;
                    default:
                        c.d.a.a.m.o.c("AudioFocusManager", "Unknown focus change type: " + i2);
                        return;
                }
            } else {
                m.this.f1582e = 1;
            }
            switch (m.this.f1582e) {
                case -1:
                    m.this.f1580c.b(-1);
                    m.this.c(true);
                    break;
                case 0:
                case 3:
                    break;
                case 1:
                    m.this.f1580c.b(1);
                    break;
                case 2:
                    m.this.f1580c.b(0);
                    break;
                default:
                    throw new IllegalStateException("Unknown audio focus state: " + m.this.f1582e);
            }
            float f2 = m.this.f1582e == 3 ? 0.2f : 1.0f;
            if (m.this.f1584g != f2) {
                m.this.f1584g = f2;
                m.this.f1580c.a(f2);
            }
        }
    }
}
