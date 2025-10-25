package c.d.a.a.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import c.d.a.a.AbstractC0131c;
import c.d.a.a.C0145h;
import c.d.a.a.b.p;
import c.d.a.a.b.q;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

@TargetApi(16)
/* loaded from: classes.dex */
public class B extends c.d.a.a.f.b implements c.d.a.a.m.q {
    private final Context ha;
    private final p.a ia;
    private final q ja;
    private final long[] ka;
    private int la;
    private boolean ma;
    private boolean na;
    private boolean oa;
    private MediaFormat pa;
    private int qa;
    private int ra;
    private int sa;
    private int ta;
    private long ua;
    private boolean va;
    private boolean wa;
    private long xa;
    private int ya;

    protected void E() {
    }

    protected void a(int i2, long j, long j2) {
    }

    protected void b(int i2) {
    }

    @Override // c.d.a.a.AbstractC0131c, c.d.a.a.E
    public c.d.a.a.m.q n() {
        return this;
    }

    public B(Context context, c.d.a.a.f.e eVar, c.d.a.a.d.h<c.d.a.a.d.j> hVar, boolean z, Handler handler, p pVar, k kVar, o... oVarArr) {
        this(context, eVar, hVar, z, handler, pVar, new x(kVar, oVarArr));
    }

    public B(Context context, c.d.a.a.f.e eVar, c.d.a.a.d.h<c.d.a.a.d.j> hVar, boolean z, Handler handler, p pVar, q qVar) {
        super(1, eVar, hVar, z, 44100.0f);
        this.ha = context.getApplicationContext();
        this.ja = qVar;
        this.xa = -9223372036854775807L;
        this.ka = new long[10];
        this.ia = new p.a(handler, pVar);
        qVar.a(new a());
    }

    @Override // c.d.a.a.f.b
    protected int a(c.d.a.a.f.e eVar, c.d.a.a.d.h<c.d.a.a.d.j> hVar, c.d.a.a.q qVar) {
        boolean z;
        String str = qVar.f3682g;
        if (!c.d.a.a.m.r.a(str)) {
            return 0;
        }
        int i2 = c.d.a.a.m.H.f3499a >= 21 ? 32 : 0;
        boolean zA = AbstractC0131c.a(hVar, qVar.j);
        int i3 = 8;
        if (zA && a(qVar.t, str) && eVar.a() != null) {
            return i2 | 8 | 4;
        }
        if (("audio/raw".equals(str) && !this.ja.a(qVar.t, qVar.v)) || !this.ja.a(qVar.t, 2)) {
            return 1;
        }
        c.d.a.a.d.f fVar = qVar.j;
        if (fVar != null) {
            z = false;
            for (int i4 = 0; i4 < fVar.f1707d; i4++) {
                z |= fVar.a(i4).f1713f;
            }
        } else {
            z = false;
        }
        List<c.d.a.a.f.a> listA = eVar.a(qVar.f3682g, z);
        if (listA.isEmpty()) {
            return (!z || eVar.a(qVar.f3682g, false).isEmpty()) ? 1 : 2;
        }
        if (!zA) {
            return 2;
        }
        c.d.a.a.f.a aVar = listA.get(0);
        boolean zA2 = aVar.a(qVar);
        if (zA2 && aVar.b(qVar)) {
            i3 = 16;
        }
        return i3 | i2 | (zA2 ? 4 : 3);
    }

    @Override // c.d.a.a.f.b
    protected List<c.d.a.a.f.a> a(c.d.a.a.f.e eVar, c.d.a.a.q qVar, boolean z) {
        c.d.a.a.f.a aVarA;
        if (a(qVar.t, qVar.f3682g) && (aVarA = eVar.a()) != null) {
            return Collections.singletonList(aVarA);
        }
        return super.a(eVar, qVar, z);
    }

    protected boolean a(int i2, String str) {
        return this.ja.a(i2, c.d.a.a.m.r.h(str));
    }

    @Override // c.d.a.a.f.b
    protected void a(c.d.a.a.f.a aVar, MediaCodec mediaCodec, c.d.a.a.q qVar, MediaCrypto mediaCrypto, float f2) {
        this.la = a(aVar, qVar, s());
        this.na = f(aVar.f2365a);
        this.oa = g(aVar.f2365a);
        this.ma = aVar.f2371g;
        MediaFormat mediaFormatA = a(qVar, aVar.f2366b == null ? "audio/raw" : aVar.f2366b, this.la, f2);
        mediaCodec.configure(mediaFormatA, (Surface) null, mediaCrypto, 0);
        if (this.ma) {
            this.pa = mediaFormatA;
            this.pa.setString("mime", qVar.f3682g);
        } else {
            this.pa = null;
        }
    }

    @Override // c.d.a.a.f.b
    protected int a(MediaCodec mediaCodec, c.d.a.a.f.a aVar, c.d.a.a.q qVar, c.d.a.a.q qVar2) {
        return (a(aVar, qVar2) <= this.la && aVar.a(qVar, qVar2, true) && qVar.w == 0 && qVar.x == 0 && qVar2.w == 0 && qVar2.x == 0) ? 1 : 0;
    }

    @Override // c.d.a.a.f.b
    protected float a(float f2, c.d.a.a.q qVar, c.d.a.a.q[] qVarArr) {
        int iMax = -1;
        for (c.d.a.a.q qVar2 : qVarArr) {
            int i2 = qVar2.u;
            if (i2 != -1) {
                iMax = Math.max(iMax, i2);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f2 * iMax;
    }

    @Override // c.d.a.a.f.b
    protected void a(String str, long j, long j2) {
        this.ia.a(str, j, j2);
    }

    @Override // c.d.a.a.f.b
    protected void b(c.d.a.a.q qVar) throws C0145h {
        super.b(qVar);
        this.ia.a(qVar);
        this.qa = "audio/raw".equals(qVar.f3682g) ? qVar.v : 2;
        this.ra = qVar.t;
        this.sa = qVar.w;
        this.ta = qVar.x;
    }

    @Override // c.d.a.a.f.b
    protected void a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C0145h {
        int iH;
        int[] iArr;
        if (this.pa != null) {
            iH = c.d.a.a.m.r.h(this.pa.getString("mime"));
            mediaFormat = this.pa;
        } else {
            iH = this.qa;
        }
        int i2 = iH;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.na && integer == 6 && this.ra < 6) {
            iArr = new int[this.ra];
            for (int i3 = 0; i3 < this.ra; i3++) {
                iArr[i3] = i3;
            }
        } else {
            iArr = null;
        }
        try {
            this.ja.a(i2, integer, integer2, 0, iArr, this.sa, this.ta);
        } catch (q.a e2) {
            throw C0145h.a(e2, u());
        }
    }

    @Override // c.d.a.a.f.b, c.d.a.a.AbstractC0131c
    protected void a(boolean z) {
        super.a(z);
        this.ia.a(this.ga);
        int i2 = t().f1434b;
        if (i2 != 0) {
            this.ja.a(i2);
        } else {
            this.ja.g();
        }
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void a(c.d.a.a.q[] qVarArr, long j) {
        super.a(qVarArr, j);
        if (this.xa != -9223372036854775807L) {
            if (this.ya == this.ka.length) {
                c.d.a.a.m.o.c("MediaCodecAudioRenderer", "Too many stream changes, so dropping change at " + this.ka[this.ya - 1]);
            } else {
                this.ya++;
            }
            this.ka[this.ya - 1] = this.xa;
        }
    }

    @Override // c.d.a.a.f.b, c.d.a.a.AbstractC0131c
    protected void a(long j, boolean z) throws C0145h {
        super.a(j, z);
        this.ja.reset();
        this.ua = j;
        this.va = true;
        this.wa = true;
        this.xa = -9223372036854775807L;
        this.ya = 0;
    }

    @Override // c.d.a.a.f.b, c.d.a.a.AbstractC0131c
    protected void p() {
        super.p();
        this.ja.i();
    }

    @Override // c.d.a.a.f.b, c.d.a.a.AbstractC0131c
    protected void q() {
        F();
        this.ja.pause();
        super.q();
    }

    @Override // c.d.a.a.f.b, c.d.a.a.AbstractC0131c
    protected void r() {
        try {
            this.xa = -9223372036854775807L;
            this.ya = 0;
            this.ja.a();
            try {
                super.r();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.r();
                throw th;
            } finally {
            }
        }
    }

    @Override // c.d.a.a.f.b, c.d.a.a.E
    public boolean b() {
        return super.b() && this.ja.b();
    }

    @Override // c.d.a.a.f.b, c.d.a.a.E
    public boolean c() {
        return this.ja.f() || super.c();
    }

    @Override // c.d.a.a.m.q
    public long a() {
        if (f() == 2) {
            F();
        }
        return this.ua;
    }

    @Override // c.d.a.a.m.q
    public c.d.a.a.z a(c.d.a.a.z zVar) {
        return this.ja.a(zVar);
    }

    @Override // c.d.a.a.m.q
    public c.d.a.a.z d() {
        return this.ja.d();
    }

    @Override // c.d.a.a.f.b
    protected void a(c.d.a.a.c.f fVar) {
        if (this.va && !fVar.c()) {
            if (Math.abs(fVar.f1685d - this.ua) > 500000) {
                this.ua = fVar.f1685d;
            }
            this.va = false;
        }
        this.xa = Math.max(fVar.f1685d, this.xa);
    }

    @Override // c.d.a.a.f.b
    protected void d(long j) {
        while (this.ya != 0 && j >= this.ka[0]) {
            this.ja.h();
            this.ya--;
            System.arraycopy(this.ka, 1, this.ka, 0, this.ya);
        }
    }

    @Override // c.d.a.a.f.b
    protected boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j3, boolean z, c.d.a.a.q qVar) throws C0145h {
        if (this.oa && j3 == 0 && (i3 & 4) != 0 && this.xa != -9223372036854775807L) {
            j3 = this.xa;
        }
        if (this.ma && (i3 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i2, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i2, false);
            this.ga.f1679f++;
            this.ja.h();
            return true;
        }
        try {
            if (!this.ja.a(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i2, false);
            this.ga.f1678e++;
            return true;
        } catch (q.b | q.d e2) {
            throw C0145h.a(e2, u());
        }
    }

    @Override // c.d.a.a.f.b
    protected void D() throws C0145h {
        try {
            this.ja.e();
        } catch (q.d e2) {
            throw C0145h.a(e2, u());
        }
    }

    @Override // c.d.a.a.AbstractC0131c, c.d.a.a.C.b
    public void a(int i2, Object obj) {
        if (i2 != 5) {
            switch (i2) {
                case 2:
                    this.ja.a(((Float) obj).floatValue());
                    break;
                case 3:
                    this.ja.a((j) obj);
                    break;
                default:
                    super.a(i2, obj);
                    break;
            }
        }
        this.ja.a((t) obj);
    }

    protected int a(c.d.a.a.f.a aVar, c.d.a.a.q qVar, c.d.a.a.q[] qVarArr) {
        int iA = a(aVar, qVar);
        if (qVarArr.length == 1) {
            return iA;
        }
        int iMax = iA;
        for (c.d.a.a.q qVar2 : qVarArr) {
            if (aVar.a(qVar, qVar2, false)) {
                iMax = Math.max(iMax, a(aVar, qVar2));
            }
        }
        return iMax;
    }

    private int a(c.d.a.a.f.a aVar, c.d.a.a.q qVar) {
        PackageManager packageManager;
        if (c.d.a.a.m.H.f3499a < 24 && "OMX.google.raw.decoder".equals(aVar.f2365a)) {
            boolean z = true;
            if (c.d.a.a.m.H.f3499a == 23 && (packageManager = this.ha.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            if (z) {
                return -1;
            }
        }
        return qVar.f3683h;
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat a(c.d.a.a.q qVar, String str, int i2, float f2) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", qVar.t);
        mediaFormat.setInteger("sample-rate", qVar.u);
        c.d.a.a.f.h.a(mediaFormat, qVar.f3684i);
        c.d.a.a.f.h.a(mediaFormat, "max-input-size", i2);
        if (c.d.a.a.m.H.f3499a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        return mediaFormat;
    }

    private void F() {
        long jA = this.ja.a(b());
        if (jA != Long.MIN_VALUE) {
            if (!this.wa) {
                jA = Math.max(this.ua, jA);
            }
            this.ua = jA;
            this.wa = false;
        }
    }

    private static boolean f(String str) {
        return c.d.a.a.m.H.f3499a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(c.d.a.a.m.H.f3501c) && (c.d.a.a.m.H.f3500b.startsWith("zeroflte") || c.d.a.a.m.H.f3500b.startsWith("herolte") || c.d.a.a.m.H.f3500b.startsWith("heroqlte"));
    }

    private static boolean g(String str) {
        return c.d.a.a.m.H.f3499a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(c.d.a.a.m.H.f3501c) && (c.d.a.a.m.H.f3500b.startsWith("baffin") || c.d.a.a.m.H.f3500b.startsWith("grand") || c.d.a.a.m.H.f3500b.startsWith("fortuna") || c.d.a.a.m.H.f3500b.startsWith("gprimelte") || c.d.a.a.m.H.f3500b.startsWith("j2y18lte") || c.d.a.a.m.H.f3500b.startsWith("ms01"));
    }

    private final class a implements q.c {
        private a() {
        }

        @Override // c.d.a.a.b.q.c
        public void a(int i2) {
            B.this.ia.a(i2);
            B.this.b(i2);
        }

        @Override // c.d.a.a.b.q.c
        public void a() {
            B.this.E();
            B.this.wa = true;
        }

        @Override // c.d.a.a.b.q.c
        public void a(int i2, long j, long j2) {
            B.this.ia.a(i2, j, j2);
            B.this.a(i2, j, j2);
        }
    }
}
