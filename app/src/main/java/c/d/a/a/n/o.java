package c.d.a.a.n;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import c.d.a.a.AbstractC0131c;
import c.d.a.a.C0145h;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.F;
import c.d.a.a.m.H;
import c.d.a.a.n.s;
import java.nio.ByteBuffer;
import java.util.List;

@TargetApi(16)
/* loaded from: classes.dex */
public class o extends c.d.a.a.f.b {
    private static final int[] ha = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean ia;
    private static boolean ja;
    private long Aa;
    private int Ba;
    private int Ca;
    private int Da;
    private long Ea;
    private int Fa;
    private float Ga;
    private int Ha;
    private int Ia;
    private int Ja;
    private float Ka;
    private int La;
    private int Ma;
    private int Na;
    private float Oa;
    private boolean Pa;
    private int Qa;
    b Ra;
    private long Sa;
    private long Ta;
    private int Ua;
    private p Va;
    private final Context ka;
    private final q la;
    private final s.a ma;
    private final long na;
    private final int oa;
    private final boolean pa;
    private final long[] qa;
    private final long[] ra;
    private a sa;
    private boolean ta;
    private Surface ua;
    private Surface va;
    private int wa;
    private boolean xa;
    private long ya;
    private long za;

    private static boolean f(long j) {
        return j < -30000;
    }

    private static boolean g(long j) {
        return j < -500000;
    }

    public o(Context context, c.d.a.a.f.e eVar, long j, c.d.a.a.d.h<c.d.a.a.d.j> hVar, boolean z, Handler handler, s sVar, int i2) {
        super(2, eVar, hVar, z, 30.0f);
        this.na = j;
        this.oa = i2;
        this.ka = context.getApplicationContext();
        this.la = new q(this.ka);
        this.ma = new s.a(handler, sVar);
        this.pa = M();
        this.qa = new long[10];
        this.ra = new long[10];
        this.Ta = -9223372036854775807L;
        this.Sa = -9223372036854775807L;
        this.za = -9223372036854775807L;
        this.Ha = -1;
        this.Ia = -1;
        this.Ka = -1.0f;
        this.Ga = -1.0f;
        this.wa = 1;
        I();
    }

    @Override // c.d.a.a.f.b
    protected int a(c.d.a.a.f.e eVar, c.d.a.a.d.h<c.d.a.a.d.j> hVar, c.d.a.a.q qVar) {
        boolean z;
        if (!c.d.a.a.m.r.b(qVar.f3682g)) {
            return 0;
        }
        c.d.a.a.d.f fVar = qVar.j;
        if (fVar != null) {
            z = false;
            for (int i2 = 0; i2 < fVar.f1707d; i2++) {
                z |= fVar.a(i2).f1713f;
            }
        } else {
            z = false;
        }
        List<c.d.a.a.f.a> listA = eVar.a(qVar.f3682g, z);
        if (listA.isEmpty()) {
            return (!z || eVar.a(qVar.f3682g, false).isEmpty()) ? 1 : 2;
        }
        if (!AbstractC0131c.a(hVar, fVar)) {
            return 2;
        }
        c.d.a.a.f.a aVar = listA.get(0);
        return (aVar.a(qVar) ? 4 : 3) | (aVar.b(qVar) ? 16 : 8) | (aVar.f2369e ? 32 : 0);
    }

    @Override // c.d.a.a.f.b, c.d.a.a.AbstractC0131c
    protected void a(boolean z) {
        super.a(z);
        this.Qa = t().f1434b;
        this.Pa = this.Qa != 0;
        this.ma.a(this.ga);
        this.la.a();
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void a(c.d.a.a.q[] qVarArr, long j) {
        if (this.Ta == -9223372036854775807L) {
            this.Ta = j;
        } else {
            if (this.Ua == this.qa.length) {
                c.d.a.a.m.o.c("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + this.qa[this.Ua - 1]);
            } else {
                this.Ua++;
            }
            this.qa[this.Ua - 1] = j;
            this.ra[this.Ua - 1] = this.Sa;
        }
        super.a(qVarArr, j);
    }

    @Override // c.d.a.a.f.b, c.d.a.a.AbstractC0131c
    protected void a(long j, boolean z) throws C0145h {
        super.a(j, z);
        G();
        this.ya = -9223372036854775807L;
        this.Ca = 0;
        this.Sa = -9223372036854775807L;
        if (this.Ua != 0) {
            this.Ta = this.qa[this.Ua - 1];
            this.Ua = 0;
        }
        if (z) {
            F();
        } else {
            this.za = -9223372036854775807L;
        }
    }

    @Override // c.d.a.a.f.b, c.d.a.a.E
    public boolean c() {
        if (super.c() && (this.xa || ((this.va != null && this.ua == this.va) || y() == null || this.Pa))) {
            this.za = -9223372036854775807L;
            return true;
        }
        if (this.za == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.za) {
            return true;
        }
        this.za = -9223372036854775807L;
        return false;
    }

    @Override // c.d.a.a.f.b, c.d.a.a.AbstractC0131c
    protected void p() {
        super.p();
        this.Ba = 0;
        this.Aa = SystemClock.elapsedRealtime();
        this.Ea = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // c.d.a.a.f.b, c.d.a.a.AbstractC0131c
    protected void q() {
        this.za = -9223372036854775807L;
        L();
        super.q();
    }

    @Override // c.d.a.a.f.b, c.d.a.a.AbstractC0131c
    protected void r() {
        this.Ha = -1;
        this.Ia = -1;
        this.Ka = -1.0f;
        this.Ga = -1.0f;
        this.Ta = -9223372036854775807L;
        this.Sa = -9223372036854775807L;
        this.Ua = 0;
        I();
        G();
        this.la.b();
        this.Ra = null;
        this.Pa = false;
        try {
            super.r();
        } finally {
            this.ga.a();
            this.ma.b(this.ga);
        }
    }

    @Override // c.d.a.a.AbstractC0131c, c.d.a.a.C.b
    public void a(int i2, Object obj) throws C0145h {
        if (i2 == 1) {
            a((Surface) obj);
            return;
        }
        if (i2 != 4) {
            if (i2 == 6) {
                this.Va = (p) obj;
                return;
            } else {
                super.a(i2, obj);
                return;
            }
        }
        this.wa = ((Integer) obj).intValue();
        MediaCodec mediaCodecY = y();
        if (mediaCodecY != null) {
            mediaCodecY.setVideoScalingMode(this.wa);
        }
    }

    private void a(Surface surface) throws C0145h {
        if (surface == null) {
            if (this.va != null) {
                surface = this.va;
            } else {
                c.d.a.a.f.a aVarZ = z();
                if (aVarZ != null && b(aVarZ)) {
                    this.va = l.a(this.ka, aVarZ.f2370f);
                    surface = this.va;
                }
            }
        }
        if (this.ua != surface) {
            this.ua = surface;
            int iF = f();
            if (iF == 1 || iF == 2) {
                MediaCodec mediaCodecY = y();
                if (H.f3499a >= 23 && mediaCodecY != null && surface != null && !this.ta) {
                    a(mediaCodecY, surface);
                } else {
                    A();
                    w();
                }
            }
            if (surface != null && surface != this.va) {
                K();
                G();
                if (iF == 2) {
                    F();
                    return;
                }
                return;
            }
            I();
            G();
            return;
        }
        if (surface == null || surface == this.va) {
            return;
        }
        K();
        H();
    }

    @Override // c.d.a.a.f.b
    protected boolean a(c.d.a.a.f.a aVar) {
        return this.ua != null || b(aVar);
    }

    @Override // c.d.a.a.f.b
    protected boolean x() {
        return this.Pa;
    }

    @Override // c.d.a.a.f.b
    protected void a(c.d.a.a.f.a aVar, MediaCodec mediaCodec, c.d.a.a.q qVar, MediaCrypto mediaCrypto, float f2) {
        this.sa = a(aVar, qVar, s());
        MediaFormat mediaFormatA = a(qVar, this.sa, f2, this.pa, this.Qa);
        if (this.ua == null) {
            AbstractC0170e.b(b(aVar));
            if (this.va == null) {
                this.va = l.a(this.ka, aVar.f2370f);
            }
            this.ua = this.va;
        }
        mediaCodec.configure(mediaFormatA, this.ua, mediaCrypto, 0);
        if (H.f3499a < 23 || !this.Pa) {
            return;
        }
        this.Ra = new b(mediaCodec);
    }

    @Override // c.d.a.a.f.b
    protected int a(MediaCodec mediaCodec, c.d.a.a.f.a aVar, c.d.a.a.q qVar, c.d.a.a.q qVar2) {
        if (!aVar.a(qVar, qVar2, true) || qVar2.l > this.sa.f3651a || qVar2.m > this.sa.f3652b || b(aVar, qVar2) > this.sa.f3653c) {
            return 0;
        }
        return qVar.b(qVar2) ? 1 : 3;
    }

    @Override // c.d.a.a.f.b
    protected void A() {
        try {
            super.A();
        } finally {
            this.Da = 0;
            if (this.va != null) {
                if (this.ua == this.va) {
                    this.ua = null;
                }
                this.va.release();
                this.va = null;
            }
        }
    }

    @Override // c.d.a.a.f.b
    protected void B() throws C0145h {
        super.B();
        this.Da = 0;
    }

    @Override // c.d.a.a.f.b
    protected float a(float f2, c.d.a.a.q qVar, c.d.a.a.q[] qVarArr) {
        float fMax = -1.0f;
        for (c.d.a.a.q qVar2 : qVarArr) {
            float f3 = qVar2.n;
            if (f3 != -1.0f) {
                fMax = Math.max(fMax, f3);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f2;
    }

    @Override // c.d.a.a.f.b
    protected void a(String str, long j, long j2) {
        this.ma.a(str, j, j2);
        this.ta = a(str);
    }

    @Override // c.d.a.a.f.b
    protected void b(c.d.a.a.q qVar) throws C0145h {
        super.b(qVar);
        this.ma.a(qVar);
        this.Ga = qVar.p;
        this.Fa = qVar.o;
    }

    @Override // c.d.a.a.f.b
    protected void a(c.d.a.a.c.f fVar) {
        this.Da++;
        this.Sa = Math.max(fVar.f1685d, this.Sa);
        if (H.f3499a >= 23 || !this.Pa) {
            return;
        }
        e(fVar.f1685d);
    }

    @Override // c.d.a.a.f.b
    protected void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        a(mediaCodec, integer, integer2);
    }

    @Override // c.d.a.a.f.b
    protected boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j3, boolean z, c.d.a.a.q qVar) throws InterruptedException {
        if (this.ya == -9223372036854775807L) {
            this.ya = j;
        }
        long j4 = j3 - this.Ta;
        if (z) {
            a(mediaCodec, i2, j4);
            return true;
        }
        long j5 = j3 - j;
        if (this.ua == this.va) {
            if (!f(j5)) {
                return false;
            }
            a(mediaCodec, i2, j4);
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z2 = f() == 2;
        if (!this.xa || (z2 && d(j5, jElapsedRealtime - this.Ea))) {
            long jNanoTime = System.nanoTime();
            a(j4, jNanoTime, qVar);
            if (H.f3499a >= 21) {
                b(mediaCodec, i2, j4, jNanoTime);
                return true;
            }
            c(mediaCodec, i2, j4);
            return true;
        }
        if (!z2 || j == this.ya) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long jA = this.la.a(j3, ((j5 - (jElapsedRealtime - j2)) * 1000) + jNanoTime2);
        long j6 = (jA - jNanoTime2) / 1000;
        if (c(j6, j2) && a(mediaCodec, i2, j4, j)) {
            return false;
        }
        if (b(j6, j2)) {
            b(mediaCodec, i2, j4);
            return true;
        }
        if (H.f3499a >= 21) {
            if (j6 < 50000) {
                a(j4, jA, qVar);
                b(mediaCodec, i2, j4, jA);
                return true;
            }
        } else if (j6 < 30000) {
            if (j6 > 11000) {
                try {
                    Thread.sleep((j6 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            a(j4, jA, qVar);
            c(mediaCodec, i2, j4);
            return true;
        }
        return false;
    }

    private void a(MediaCodec mediaCodec, int i2, int i3) {
        this.Ha = i2;
        this.Ia = i3;
        this.Ka = this.Ga;
        if (H.f3499a >= 21) {
            if (this.Fa == 90 || this.Fa == 270) {
                int i4 = this.Ha;
                this.Ha = this.Ia;
                this.Ia = i4;
                this.Ka = 1.0f / this.Ka;
            }
        } else {
            this.Ja = this.Fa;
        }
        mediaCodec.setVideoScalingMode(this.wa);
    }

    private void a(long j, long j2, c.d.a.a.q qVar) {
        if (this.Va != null) {
            this.Va.a(j, j2, qVar);
        }
    }

    protected void e(long j) {
        c.d.a.a.q qVarC = c(j);
        if (qVarC != null) {
            a(y(), qVarC.l, qVarC.m);
        }
        J();
        E();
        d(j);
    }

    @Override // c.d.a.a.f.b
    protected void d(long j) {
        this.Da--;
        while (this.Ua != 0 && j >= this.ra[0]) {
            this.Ta = this.qa[0];
            this.Ua--;
            System.arraycopy(this.qa, 1, this.qa, 0, this.Ua);
            System.arraycopy(this.ra, 1, this.ra, 0, this.Ua);
        }
    }

    protected boolean b(long j, long j2) {
        return f(j);
    }

    protected boolean c(long j, long j2) {
        return g(j);
    }

    protected boolean d(long j, long j2) {
        return f(j) && j2 > 100000;
    }

    protected void a(MediaCodec mediaCodec, int i2, long j) {
        F.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i2, false);
        F.a();
        this.ga.f1679f++;
    }

    protected void b(MediaCodec mediaCodec, int i2, long j) {
        F.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i2, false);
        F.a();
        b(1);
    }

    protected boolean a(MediaCodec mediaCodec, int i2, long j, long j2) throws C0145h {
        int iB = b(j2);
        if (iB == 0) {
            return false;
        }
        this.ga.f1682i++;
        b(this.Da + iB);
        B();
        return true;
    }

    protected void b(int i2) {
        this.ga.f1680g += i2;
        this.Ba += i2;
        this.Ca += i2;
        this.ga.f1681h = Math.max(this.Ca, this.ga.f1681h);
        if (this.oa <= 0 || this.Ba < this.oa) {
            return;
        }
        L();
    }

    protected void c(MediaCodec mediaCodec, int i2, long j) {
        J();
        F.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i2, true);
        F.a();
        this.Ea = SystemClock.elapsedRealtime() * 1000;
        this.ga.f1678e++;
        this.Ca = 0;
        E();
    }

    @TargetApi(21)
    protected void b(MediaCodec mediaCodec, int i2, long j, long j2) {
        J();
        F.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i2, j2);
        F.a();
        this.Ea = SystemClock.elapsedRealtime() * 1000;
        this.ga.f1678e++;
        this.Ca = 0;
        E();
    }

    private boolean b(c.d.a.a.f.a aVar) {
        return H.f3499a >= 23 && !this.Pa && !a(aVar.f2365a) && (!aVar.f2370f || l.a(this.ka));
    }

    private void F() {
        this.za = this.na > 0 ? SystemClock.elapsedRealtime() + this.na : -9223372036854775807L;
    }

    private void G() {
        MediaCodec mediaCodecY;
        this.xa = false;
        if (H.f3499a < 23 || !this.Pa || (mediaCodecY = y()) == null) {
            return;
        }
        this.Ra = new b(mediaCodecY);
    }

    void E() {
        if (this.xa) {
            return;
        }
        this.xa = true;
        this.ma.a(this.ua);
    }

    private void H() {
        if (this.xa) {
            this.ma.a(this.ua);
        }
    }

    private void I() {
        this.La = -1;
        this.Ma = -1;
        this.Oa = -1.0f;
        this.Na = -1;
    }

    private void J() {
        if (this.Ha == -1 && this.Ia == -1) {
            return;
        }
        if (this.La == this.Ha && this.Ma == this.Ia && this.Na == this.Ja && this.Oa == this.Ka) {
            return;
        }
        this.ma.a(this.Ha, this.Ia, this.Ja, this.Ka);
        this.La = this.Ha;
        this.Ma = this.Ia;
        this.Na = this.Ja;
        this.Oa = this.Ka;
    }

    private void K() {
        if (this.La == -1 && this.Ma == -1) {
            return;
        }
        this.ma.a(this.La, this.Ma, this.Na, this.Oa);
    }

    private void L() {
        if (this.Ba > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.ma.a(this.Ba, jElapsedRealtime - this.Aa);
            this.Ba = 0;
            this.Aa = jElapsedRealtime;
        }
    }

    @TargetApi(23)
    private static void a(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @TargetApi(21)
    private static void a(MediaFormat mediaFormat, int i2) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i2);
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat a(c.d.a.a.q qVar, a aVar, float f2, boolean z, int i2) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", qVar.f3682g);
        mediaFormat.setInteger("width", qVar.l);
        mediaFormat.setInteger("height", qVar.m);
        c.d.a.a.f.h.a(mediaFormat, qVar.f3684i);
        c.d.a.a.f.h.a(mediaFormat, "frame-rate", qVar.n);
        c.d.a.a.f.h.a(mediaFormat, "rotation-degrees", qVar.o);
        c.d.a.a.f.h.a(mediaFormat, qVar.s);
        mediaFormat.setInteger("max-width", aVar.f3651a);
        mediaFormat.setInteger("max-height", aVar.f3652b);
        c.d.a.a.f.h.a(mediaFormat, "max-input-size", aVar.f3653c);
        if (H.f3499a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i2 != 0) {
            a(mediaFormat, i2);
        }
        return mediaFormat;
    }

    protected a a(c.d.a.a.f.a aVar, c.d.a.a.q qVar, c.d.a.a.q[] qVarArr) {
        int iA;
        int i2 = qVar.l;
        int i3 = qVar.m;
        int iB = b(aVar, qVar);
        if (qVarArr.length == 1) {
            if (iB != -1 && (iA = a(aVar, qVar.f3682g, qVar.l, qVar.m)) != -1) {
                iB = Math.min((int) (iB * 1.5f), iA);
            }
            return new a(i2, i3, iB);
        }
        int iMax = i3;
        int iMax2 = iB;
        boolean z = false;
        int iMax3 = i2;
        for (c.d.a.a.q qVar2 : qVarArr) {
            if (aVar.a(qVar, qVar2, false)) {
                z |= qVar2.l == -1 || qVar2.m == -1;
                iMax3 = Math.max(iMax3, qVar2.l);
                iMax = Math.max(iMax, qVar2.m);
                iMax2 = Math.max(iMax2, b(aVar, qVar2));
            }
        }
        if (z) {
            c.d.a.a.m.o.c("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax3 + "x" + iMax);
            Point pointA = a(aVar, qVar);
            if (pointA != null) {
                iMax3 = Math.max(iMax3, pointA.x);
                iMax = Math.max(iMax, pointA.y);
                iMax2 = Math.max(iMax2, a(aVar, qVar.f3682g, iMax3, iMax));
                c.d.a.a.m.o.c("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax3 + "x" + iMax);
            }
        }
        return new a(iMax3, iMax, iMax2);
    }

    private static Point a(c.d.a.a.f.a aVar, c.d.a.a.q qVar) {
        boolean z = qVar.m > qVar.l;
        int i2 = z ? qVar.m : qVar.l;
        int i3 = z ? qVar.l : qVar.m;
        float f2 = i3 / i2;
        for (int i4 : ha) {
            int i5 = (int) (i4 * f2);
            if (i4 <= i2 || i5 <= i3) {
                return null;
            }
            if (H.f3499a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point pointA = aVar.a(i6, i4);
                if (aVar.a(pointA.x, pointA.y, qVar.n)) {
                    return pointA;
                }
            } else {
                int iA = H.a(i4, 16) * 16;
                int iA2 = H.a(i5, 16) * 16;
                if (iA * iA2 <= c.d.a.a.f.g.b()) {
                    int i7 = z ? iA2 : iA;
                    if (z) {
                        iA2 = iA;
                    }
                    return new Point(i7, iA2);
                }
            }
        }
        return null;
    }

    private static int b(c.d.a.a.f.a aVar, c.d.a.a.q qVar) {
        if (qVar.f3683h != -1) {
            int size = qVar.f3684i.size();
            int length = 0;
            for (int i2 = 0; i2 < size; i2++) {
                length += qVar.f3684i.get(i2).length;
            }
            return qVar.f3683h + length;
        }
        return a(aVar, qVar.f3682g, qVar.l, qVar.m);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(c.d.a.a.f.a r5, java.lang.String r6, int r7, int r8) {
        /*
            r0 = -1
            if (r7 == r0) goto La1
            if (r8 != r0) goto L7
            goto La1
        L7:
            int r1 = r6.hashCode()
            r2 = 3
            r3 = 4
            r4 = 2
            switch(r1) {
                case -1664118616: goto L44;
                case -1662541442: goto L3a;
                case 1187890754: goto L30;
                case 1331836730: goto L26;
                case 1599127256: goto L1c;
                case 1599127257: goto L12;
                default: goto L11;
            }
        L11:
            goto L4e
        L12:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4e
            r6 = 5
            goto L4f
        L1c:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4e
            r6 = 3
            goto L4f
        L26:
            java.lang.String r1 = "video/avc"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4e
            r6 = 2
            goto L4f
        L30:
            java.lang.String r1 = "video/mp4v-es"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4e
            r6 = 1
            goto L4f
        L3a:
            java.lang.String r1 = "video/hevc"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4e
            r6 = 4
            goto L4f
        L44:
            java.lang.String r1 = "video/3gpp"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4e
            r6 = 0
            goto L4f
        L4e:
            r6 = -1
        L4f:
            switch(r6) {
                case 0: goto L98;
                case 1: goto L98;
                case 2: goto L59;
                case 3: goto L56;
                case 4: goto L53;
                case 5: goto L53;
                default: goto L52;
            }
        L52:
            return r0
        L53:
            int r7 = r7 * r8
            goto L9b
        L56:
            int r7 = r7 * r8
            goto L9a
        L59:
            java.lang.String r6 = "BRAVIA 4K 2015"
            java.lang.String r1 = c.d.a.a.m.H.f3502d
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L97
            java.lang.String r6 = "Amazon"
            java.lang.String r1 = c.d.a.a.m.H.f3501c
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L86
            java.lang.String r6 = "KFSOWI"
            java.lang.String r1 = c.d.a.a.m.H.f3502d
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L97
            java.lang.String r6 = "AFTS"
            java.lang.String r1 = c.d.a.a.m.H.f3502d
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L86
            boolean r5 = r5.f2370f
            if (r5 == 0) goto L86
            goto L97
        L86:
            r5 = 16
            int r6 = c.d.a.a.m.H.a(r7, r5)
            int r7 = c.d.a.a.m.H.a(r8, r5)
            int r6 = r6 * r7
            int r6 = r6 * 16
            int r7 = r6 * 16
            goto L9a
        L97:
            return r0
        L98:
            int r7 = r7 * r8
        L9a:
            r3 = 2
        L9b:
            int r7 = r7 * 3
            int r3 = r3 * 2
            int r7 = r7 / r3
            return r7
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.n.o.a(c.d.a.a.f.a, java.lang.String, int, int):int");
    }

    private static boolean M() {
        return "NVIDIA".equals(H.f3501c);
    }

    /* JADX WARN: Removed duplicated region for block: B:394:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0631 A[Catch: all -> 0x0639, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:13:0x0022, B:15:0x002c, B:413:0x0633, B:16:0x0030, B:19:0x0036, B:20:0x003d, B:395:0x0602, B:398:0x0608, B:410:0x062d, B:412:0x0631, B:403:0x0619, B:406:0x0623, B:397:0x0606, B:22:0x0042, B:25:0x004e, B:28:0x005a, B:31:0x0066, B:34:0x0072, B:37:0x007e, B:40:0x008a, B:43:0x0096, B:46:0x00a2, B:49:0x00ae, B:52:0x00ba, B:55:0x00c6, B:58:0x00d2, B:61:0x00de, B:64:0x00ea, B:67:0x00f6, B:70:0x0102, B:73:0x010e, B:76:0x011a, B:79:0x0126, B:82:0x0132, B:85:0x013e, B:88:0x0149, B:91:0x0155, B:94:0x0161, B:97:0x016d, B:100:0x0179, B:103:0x0185, B:106:0x0191, B:109:0x019d, B:112:0x01a9, B:115:0x01b5, B:118:0x01c1, B:121:0x01cd, B:124:0x01d9, B:127:0x01e5, B:130:0x01f1, B:133:0x01fd, B:136:0x0208, B:139:0x0214, B:142:0x0220, B:145:0x022c, B:148:0x0238, B:151:0x0244, B:154:0x0250, B:157:0x025c, B:160:0x0268, B:163:0x0274, B:166:0x0280, B:169:0x028c, B:172:0x0298, B:175:0x02a4, B:178:0x02b0, B:181:0x02bc, B:184:0x02c7, B:187:0x02d3, B:190:0x02df, B:193:0x02eb, B:196:0x02f7, B:199:0x0303, B:202:0x030f, B:205:0x031b, B:208:0x0327, B:211:0x0333, B:214:0x033f, B:217:0x034a, B:220:0x0355, B:223:0x0360, B:226:0x036c, B:229:0x0378, B:232:0x0384, B:235:0x0390, B:238:0x039c, B:241:0x03a8, B:244:0x03b4, B:247:0x03c0, B:250:0x03cc, B:253:0x03d8, B:256:0x03e4, B:259:0x03f0, B:262:0x03fc, B:265:0x0408, B:268:0x0414, B:271:0x0420, B:274:0x042c, B:277:0x0438, B:280:0x0444, B:283:0x0450, B:286:0x045c, B:289:0x0468, B:292:0x0474, B:295:0x0480, B:298:0x048c, B:301:0x0498, B:304:0x04a4, B:307:0x04b0, B:310:0x04bb, B:313:0x04c7, B:316:0x04d3, B:319:0x04df, B:322:0x04eb, B:325:0x04f6, B:328:0x0502, B:331:0x050e, B:334:0x051a, B:337:0x0526, B:340:0x0532, B:343:0x053e, B:346:0x054a, B:349:0x0556, B:352:0x0562, B:355:0x056e, B:358:0x057a, B:361:0x0586, B:364:0x0592, B:367:0x059e, B:370:0x05a9, B:373:0x05b4, B:376:0x05bf, B:379:0x05ca, B:382:0x05d5, B:385:0x05e0, B:388:0x05eb, B:391:0x05f6, B:414:0x0635), top: B:420:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean a(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 2354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.n.o.a(java.lang.String):boolean");
    }

    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f3651a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3652b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3653c;

        public a(int i2, int i3, int i4) {
            this.f3651a = i2;
            this.f3652b = i3;
            this.f3653c = i4;
        }
    }

    @TargetApi(23)
    private final class b implements MediaCodec.OnFrameRenderedListener {
        private b(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            if (this != o.this.Ra) {
                return;
            }
            o.this.e(j);
        }
    }
}
