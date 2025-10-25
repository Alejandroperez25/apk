package c.d.a.a.f;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import c.d.a.a.AbstractC0131c;
import c.d.a.a.C0145h;
import c.d.a.a.d.j;
import c.d.a.a.f.g;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.D;
import c.d.a.a.m.F;
import c.d.a.a.m.H;
import c.d.a.a.m.o;
import c.d.a.a.m.s;
import c.d.a.a.q;
import c.d.a.a.r;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
/* loaded from: classes.dex */
public abstract class b extends AbstractC0131c {
    private static final byte[] j = H.i("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private float A;
    private float B;
    private boolean C;
    private ArrayDeque<c.d.a.a.f.a> D;
    private a E;
    private c.d.a.a.f.a F;
    private int G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private ByteBuffer[] Q;
    private ByteBuffer[] R;
    private long S;
    private int T;
    private int U;
    private ByteBuffer V;
    private boolean W;
    private boolean X;
    private int Y;
    private int Z;
    private boolean aa;
    private boolean ba;
    private boolean ca;
    private boolean da;
    private boolean ea;
    private boolean fa;
    protected c.d.a.a.c.e ga;
    private final e k;
    private final c.d.a.a.d.h<j> l;
    private final boolean m;
    private final float n;
    private final c.d.a.a.c.f o;
    private final c.d.a.a.c.f p;
    private final r q;
    private final D<q> r;
    private final List<Long> s;
    private final MediaCodec.BufferInfo t;
    private q u;
    private q v;
    private q w;
    private c.d.a.a.d.g<j> x;
    private c.d.a.a.d.g<j> y;
    private MediaCodec z;

    protected long C() {
        return 0L;
    }

    protected void D() {
    }

    protected abstract float a(float f2, q qVar, q[] qVarArr);

    protected abstract int a(MediaCodec mediaCodec, c.d.a.a.f.a aVar, q qVar, q qVar2);

    protected abstract int a(e eVar, c.d.a.a.d.h<j> hVar, q qVar);

    protected abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    protected abstract void a(c.d.a.a.c.f fVar);

    protected abstract void a(c.d.a.a.f.a aVar, MediaCodec mediaCodec, q qVar, MediaCrypto mediaCrypto, float f2);

    protected abstract void a(String str, long j2, long j3);

    protected abstract boolean a(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z, q qVar);

    protected boolean a(c.d.a.a.f.a aVar) {
        return true;
    }

    protected abstract void d(long j2);

    @Override // c.d.a.a.AbstractC0131c, c.d.a.a.F
    public final int o() {
        return 8;
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void p() {
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void q() {
    }

    protected boolean x() {
        return false;
    }

    public static class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f2373a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f2374b;

        /* renamed from: c, reason: collision with root package name */
        public final String f2375c;

        /* renamed from: d, reason: collision with root package name */
        public final String f2376d;

        /* renamed from: e, reason: collision with root package name */
        public final a f2377e;

        public a(q qVar, Throwable th, boolean z, int i2) {
            this("Decoder init failed: [" + i2 + "], " + qVar, th, qVar.f3682g, z, null, a(i2), null);
        }

        public a(q qVar, Throwable th, boolean z, String str) {
            this("Decoder init failed: " + str + ", " + qVar, th, qVar.f3682g, z, str, H.f3499a >= 21 ? a(th) : null, null);
        }

        private a(String str, Throwable th, String str2, boolean z, String str3, String str4, a aVar) {
            super(str, th);
            this.f2373a = str2;
            this.f2374b = z;
            this.f2375c = str3;
            this.f2376d = str4;
            this.f2377e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(a aVar) {
            return new a(getMessage(), getCause(), this.f2373a, this.f2374b, this.f2375c, this.f2376d, aVar);
        }

        @TargetApi(21)
        private static String a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private static String a(int i2) {
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i2 < 0 ? "neg_" : "") + Math.abs(i2);
        }
    }

    public b(int i2, e eVar, c.d.a.a.d.h<j> hVar, boolean z, float f2) {
        super(i2);
        AbstractC0170e.b(H.f3499a >= 16);
        AbstractC0170e.a(eVar);
        this.k = eVar;
        this.l = hVar;
        this.m = z;
        this.n = f2;
        this.o = new c.d.a.a.c.f(0);
        this.p = c.d.a.a.c.f.f();
        this.q = new r();
        this.r = new D<>();
        this.s = new ArrayList();
        this.t = new MediaCodec.BufferInfo();
        this.Y = 0;
        this.Z = 0;
        this.B = -1.0f;
        this.A = 1.0f;
    }

    @Override // c.d.a.a.F
    public final int a(q qVar) throws C0145h {
        try {
            return a(this.k, this.l, qVar);
        } catch (g.b e2) {
            throw C0145h.a(e2, u());
        }
    }

    protected List<c.d.a.a.f.a> a(e eVar, q qVar, boolean z) {
        return eVar.a(qVar.f3682g, z);
    }

    protected final void w() throws C0145h {
        boolean zA;
        if (this.z != null || this.u == null) {
            return;
        }
        this.x = this.y;
        String str = this.u.f3682g;
        MediaCrypto mediaCryptoA = null;
        if (this.x != null) {
            j jVar = (j) this.x.a();
            if (jVar == null) {
                if (this.x.b() == null) {
                    return;
                } else {
                    zA = false;
                }
            } else {
                mediaCryptoA = jVar.a();
                zA = jVar.a(str);
            }
            if (O()) {
                int iF = this.x.f();
                if (iF == 1) {
                    throw C0145h.a(this.x.b(), u());
                }
                if (iF != 4) {
                    return;
                }
            }
        } else {
            zA = false;
        }
        try {
            if (a(mediaCryptoA, zA)) {
                String str2 = this.F.f2365a;
                this.G = b(str2);
                this.H = c(str2);
                this.I = a(str2, this.u);
                this.J = a(str2);
                this.K = d(str2);
                this.L = e(str2);
                this.M = b(str2, this.u);
                this.P = b(this.F) || x();
                this.S = f() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                G();
                H();
                this.fa = true;
                this.ga.f1674a++;
            }
        } catch (a e2) {
            throw C0145h.a(e2, u());
        }
    }

    protected final q c(long j2) {
        q qVarA = this.r.a(j2);
        if (qVarA != null) {
            this.w = qVarA;
        }
        return qVarA;
    }

    protected final MediaCodec y() {
        return this.z;
    }

    protected final c.d.a.a.f.a z() {
        return this.F;
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void a(boolean z) {
        this.ga = new c.d.a.a.c.e();
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void a(long j2, boolean z) throws C0145h {
        this.ca = false;
        this.da = false;
        if (this.z != null) {
            B();
        }
        this.r.a();
    }

    @Override // c.d.a.a.AbstractC0131c, c.d.a.a.E
    public final void a(float f2) throws C0145h {
        this.A = f2;
        J();
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void r() {
        this.u = null;
        this.D = null;
        try {
            A();
            try {
                if (this.x != null) {
                    this.l.a(this.x);
                }
                try {
                    if (this.y != null && this.y != this.x) {
                        this.l.a(this.y);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.y != null && this.y != this.x) {
                        this.l.a(this.y);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.x != null) {
                    this.l.a(this.x);
                }
                try {
                    if (this.y != null && this.y != this.x) {
                        this.l.a(this.y);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.y != null && this.y != this.x) {
                        this.l.a(this.y);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    protected void A() {
        this.S = -9223372036854775807L;
        G();
        H();
        this.ea = false;
        this.W = false;
        this.s.clear();
        E();
        this.F = null;
        this.X = false;
        this.aa = false;
        this.I = false;
        this.J = false;
        this.G = 0;
        this.H = false;
        this.K = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.ba = false;
        this.Y = 0;
        this.Z = 0;
        this.C = false;
        if (this.z != null) {
            this.ga.f1675b++;
            try {
                this.z.stop();
                try {
                    this.z.release();
                    this.z = null;
                    if (this.x == null || this.y == this.x) {
                        return;
                    }
                    try {
                        this.l.a(this.x);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.z = null;
                    if (this.x != null && this.y != this.x) {
                        try {
                            this.l.a(this.x);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.z.release();
                    this.z = null;
                    if (this.x != null && this.y != this.x) {
                        try {
                            this.l.a(this.x);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.z = null;
                    if (this.x != null && this.y != this.x) {
                        try {
                            this.l.a(this.x);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    @Override // c.d.a.a.E
    public void a(long j2, long j3) throws C0145h {
        if (this.da) {
            D();
            return;
        }
        if (this.u == null) {
            this.p.b();
            int iA = a(this.q, this.p, true);
            if (iA != -5) {
                if (iA == -4) {
                    AbstractC0170e.b(this.p.d());
                    this.ca = true;
                    N();
                    return;
                }
                return;
            }
            b(this.q.f3685a);
        }
        w();
        if (this.z != null) {
            F.a("drainAndFeed");
            while (b(j2, j3)) {
            }
            while (I()) {
            }
            F.a();
        } else {
            this.ga.f1677d += b(j2);
            this.p.b();
            int iA2 = a(this.q, this.p, false);
            if (iA2 == -5) {
                b(this.q.f3685a);
            } else if (iA2 == -4) {
                AbstractC0170e.b(this.p.d());
                this.ca = true;
                N();
            }
        }
        this.ga.a();
    }

    protected void B() throws C0145h {
        this.S = -9223372036854775807L;
        G();
        H();
        this.fa = true;
        this.ea = false;
        this.W = false;
        this.s.clear();
        this.N = false;
        this.O = false;
        if (this.J || ((this.K && this.ba) || this.Z != 0)) {
            A();
            w();
        } else {
            this.z.flush();
            this.aa = false;
        }
        if (!this.X || this.u == null) {
            return;
        }
        this.Y = 1;
    }

    private boolean a(MediaCrypto mediaCrypto, boolean z) throws a {
        if (this.D == null) {
            try {
                this.D = new ArrayDeque<>(b(z));
                this.E = null;
            } catch (g.b e2) {
                throw new a(this.u, e2, z, -49998);
            }
        }
        if (this.D.isEmpty()) {
            throw new a(this.u, (Throwable) null, z, -49999);
        }
        do {
            c.d.a.a.f.a aVarPeekFirst = this.D.peekFirst();
            if (!a(aVarPeekFirst)) {
                return false;
            }
            try {
                a(aVarPeekFirst, mediaCrypto);
                return true;
            } catch (Exception e3) {
                o.a("MediaCodecRenderer", "Failed to initialize decoder: " + aVarPeekFirst, e3);
                this.D.removeFirst();
                a aVar = new a(this.u, e3, z, aVarPeekFirst.f2365a);
                if (this.E != null) {
                    this.E = this.E.a(aVar);
                } else {
                    this.E = aVar;
                }
            }
        } while (!this.D.isEmpty());
        throw this.E;
    }

    private List<c.d.a.a.f.a> b(boolean z) {
        List<c.d.a.a.f.a> listA = a(this.k, this.u, z);
        if (listA.isEmpty() && z) {
            listA = a(this.k, this.u, false);
            if (!listA.isEmpty()) {
                o.c("MediaCodecRenderer", "Drm session requires secure decoder for " + this.u.f3682g + ", but no secure decoder available. Trying to proceed with " + listA + ".");
            }
        }
        return listA;
    }

    private void a(c.d.a.a.f.a aVar, MediaCrypto mediaCrypto) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = aVar.f2365a;
        J();
        boolean z = this.B > this.n;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            F.a("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                F.a();
                F.a("configureCodec");
                a(aVar, mediaCodecCreateByCodecName, this.u, mediaCrypto, z ? this.B : -1.0f);
                this.C = z;
                F.a();
                F.a("startCodec");
                mediaCodecCreateByCodecName.start();
                F.a();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                a(mediaCodecCreateByCodecName);
                this.z = mediaCodecCreateByCodecName;
                this.F = aVar;
                a(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            } catch (Exception e2) {
                e = e2;
                if (mediaCodecCreateByCodecName != null) {
                    E();
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    private void a(MediaCodec mediaCodec) {
        if (H.f3499a < 21) {
            this.Q = mediaCodec.getInputBuffers();
            this.R = mediaCodec.getOutputBuffers();
        }
    }

    private void E() {
        if (H.f3499a < 21) {
            this.Q = null;
            this.R = null;
        }
    }

    private ByteBuffer b(int i2) {
        if (H.f3499a >= 21) {
            return this.z.getInputBuffer(i2);
        }
        return this.Q[i2];
    }

    private ByteBuffer c(int i2) {
        if (H.f3499a >= 21) {
            return this.z.getOutputBuffer(i2);
        }
        return this.R[i2];
    }

    private boolean F() {
        return this.U >= 0;
    }

    private void G() {
        this.T = -1;
        this.o.f1684c = null;
    }

    private void H() {
        this.U = -1;
        this.V = null;
    }

    private boolean I() throws C0145h, MediaCodec.CryptoException {
        int iPosition;
        int iA;
        if (this.z == null || this.Z == 2 || this.ca) {
            return false;
        }
        if (this.T < 0) {
            this.T = this.z.dequeueInputBuffer(0L);
            if (this.T < 0) {
                return false;
            }
            this.o.f1684c = b(this.T);
            this.o.b();
        }
        if (this.Z == 1) {
            if (!this.P) {
                this.ba = true;
                this.z.queueInputBuffer(this.T, 0, 0, 0L, 4);
                G();
            }
            this.Z = 2;
            return false;
        }
        if (this.N) {
            this.N = false;
            this.o.f1684c.put(j);
            this.z.queueInputBuffer(this.T, 0, j.length, 0L, 0);
            G();
            this.aa = true;
            return true;
        }
        if (this.ea) {
            iA = -4;
            iPosition = 0;
        } else {
            if (this.Y == 1) {
                for (int i2 = 0; i2 < this.u.f3684i.size(); i2++) {
                    this.o.f1684c.put(this.u.f3684i.get(i2));
                }
                this.Y = 2;
            }
            iPosition = this.o.f1684c.position();
            iA = a(this.q, this.o, false);
        }
        if (iA == -3) {
            return false;
        }
        if (iA == -5) {
            if (this.Y == 2) {
                this.o.b();
                this.Y = 1;
            }
            b(this.q.f3685a);
            return true;
        }
        if (this.o.d()) {
            if (this.Y == 2) {
                this.o.b();
                this.Y = 1;
            }
            this.ca = true;
            if (!this.aa) {
                N();
                return false;
            }
            try {
                if (!this.P) {
                    this.ba = true;
                    this.z.queueInputBuffer(this.T, 0, 0, 0L, 4);
                    G();
                }
                return false;
            } catch (MediaCodec.CryptoException e2) {
                throw C0145h.a(e2, u());
            }
        }
        if (this.fa && !this.o.e()) {
            this.o.b();
            if (this.Y == 2) {
                this.Y = 1;
            }
            return true;
        }
        this.fa = false;
        boolean zK = this.o.k();
        this.ea = c(zK);
        if (this.ea) {
            return false;
        }
        if (this.I && !zK) {
            s.a(this.o.f1684c);
            if (this.o.f1684c.position() == 0) {
                return true;
            }
            this.I = false;
        }
        try {
            long j2 = this.o.f1685d;
            if (this.o.c()) {
                this.s.add(Long.valueOf(j2));
            }
            if (this.v != null) {
                this.r.a(j2, (long) this.v);
                this.v = null;
            }
            this.o.l();
            a(this.o);
            if (zK) {
                this.z.queueSecureInputBuffer(this.T, 0, a(this.o, iPosition), j2, 0);
            } else {
                this.z.queueInputBuffer(this.T, 0, this.o.f1684c.limit(), j2, 0);
            }
            G();
            this.aa = true;
            this.Y = 0;
            this.ga.f1676c++;
            return true;
        } catch (MediaCodec.CryptoException e3) {
            throw C0145h.a(e3, u());
        }
    }

    private boolean c(boolean z) throws C0145h {
        if (this.x == null || (!z && this.m)) {
            return false;
        }
        int iF = this.x.f();
        if (iF != 1) {
            return iF != 4;
        }
        throw C0145h.a(this.x.b(), u());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void b(c.d.a.a.q r6) throws c.d.a.a.C0145h {
        /*
            r5 = this;
            c.d.a.a.q r0 = r5.u
            r5.u = r6
            r5.v = r6
            c.d.a.a.q r6 = r5.u
            c.d.a.a.d.f r6 = r6.j
            r1 = 0
            if (r0 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            c.d.a.a.d.f r2 = r0.j
        L11:
            boolean r6 = c.d.a.a.m.H.a(r6, r2)
            r2 = 1
            r6 = r6 ^ r2
            if (r6 == 0) goto L53
            c.d.a.a.q r6 = r5.u
            c.d.a.a.d.f r6 = r6.j
            if (r6 == 0) goto L51
            c.d.a.a.d.h<c.d.a.a.d.j> r6 = r5.l
            if (r6 == 0) goto L41
            c.d.a.a.d.h<c.d.a.a.d.j> r6 = r5.l
            android.os.Looper r1 = android.os.Looper.myLooper()
            c.d.a.a.q r3 = r5.u
            c.d.a.a.d.f r3 = r3.j
            c.d.a.a.d.g r6 = r6.a(r1, r3)
            r5.y = r6
            c.d.a.a.d.g<c.d.a.a.d.j> r6 = r5.y
            c.d.a.a.d.g<c.d.a.a.d.j> r1 = r5.x
            if (r6 != r1) goto L53
            c.d.a.a.d.h<c.d.a.a.d.j> r6 = r5.l
            c.d.a.a.d.g<c.d.a.a.d.j> r1 = r5.y
            r6.a(r1)
            goto L53
        L41:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.u()
            c.d.a.a.h r6 = c.d.a.a.C0145h.a(r6, r0)
            throw r6
        L51:
            r5.y = r1
        L53:
            c.d.a.a.d.g<c.d.a.a.d.j> r6 = r5.y
            c.d.a.a.d.g<c.d.a.a.d.j> r1 = r5.x
            r3 = 0
            if (r6 != r1) goto L99
            android.media.MediaCodec r6 = r5.z
            if (r6 == 0) goto L99
            android.media.MediaCodec r6 = r5.z
            c.d.a.a.f.a r1 = r5.F
            c.d.a.a.q r4 = r5.u
            int r6 = r5.a(r6, r1, r0, r4)
            r1 = 3
            if (r6 == r1) goto L74
            switch(r6) {
                case 0: goto L99;
                case 1: goto L9a;
                default: goto L6e;
            }
        L6e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L74:
            boolean r6 = r5.H
            if (r6 != 0) goto L99
            r5.X = r2
            r5.Y = r2
            int r6 = r5.G
            r1 = 2
            if (r6 == r1) goto L95
            int r6 = r5.G
            if (r6 != r2) goto L96
            c.d.a.a.q r6 = r5.u
            int r6 = r6.l
            int r1 = r0.l
            if (r6 != r1) goto L96
            c.d.a.a.q r6 = r5.u
            int r6 = r6.m
            int r0 = r0.m
            if (r6 != r0) goto L96
        L95:
            r3 = 1
        L96:
            r5.N = r3
            goto L9a
        L99:
            r2 = 0
        L9a:
            if (r2 != 0) goto La0
            r5.K()
            goto La3
        La0:
            r5.J()
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.f.b.b(c.d.a.a.q):void");
    }

    @Override // c.d.a.a.E
    public boolean b() {
        return this.da;
    }

    @Override // c.d.a.a.E
    public boolean c() {
        return (this.u == null || this.ea || (!v() && !F() && (this.S == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.S))) ? false : true;
    }

    private void J() throws C0145h {
        if (this.u == null || H.f3499a < 23) {
            return;
        }
        float fA = a(this.A, this.u, s());
        if (this.B == fA) {
            return;
        }
        this.B = fA;
        if (this.z == null || this.Z != 0) {
            return;
        }
        if (fA == -1.0f && this.C) {
            K();
            return;
        }
        if (fA != -1.0f) {
            if (this.C || fA > this.n) {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", fA);
                this.z.setParameters(bundle);
                this.C = true;
            }
        }
    }

    private void K() throws C0145h {
        this.D = null;
        if (this.aa) {
            this.Z = 1;
        } else {
            A();
            w();
        }
    }

    private boolean b(long j2, long j3) throws C0145h {
        boolean zA;
        int iDequeueOutputBuffer;
        if (!F()) {
            if (this.L && this.ba) {
                try {
                    iDequeueOutputBuffer = this.z.dequeueOutputBuffer(this.t, C());
                } catch (IllegalStateException unused) {
                    N();
                    if (this.da) {
                        A();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBuffer = this.z.dequeueOutputBuffer(this.t, C());
            }
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -2) {
                    L();
                    return true;
                }
                if (iDequeueOutputBuffer == -3) {
                    M();
                    return true;
                }
                if (this.P && (this.ca || this.Z == 2)) {
                    N();
                }
                return false;
            }
            if (this.O) {
                this.O = false;
                this.z.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return true;
            }
            if (this.t.size == 0 && (this.t.flags & 4) != 0) {
                N();
                return false;
            }
            this.U = iDequeueOutputBuffer;
            this.V = c(iDequeueOutputBuffer);
            if (this.V != null) {
                this.V.position(this.t.offset);
                this.V.limit(this.t.offset + this.t.size);
            }
            this.W = e(this.t.presentationTimeUs);
            c(this.t.presentationTimeUs);
        }
        if (this.L && this.ba) {
            try {
                zA = a(j2, j3, this.z, this.V, this.U, this.t.flags, this.t.presentationTimeUs, this.W, this.w);
            } catch (IllegalStateException unused2) {
                N();
                if (this.da) {
                    A();
                }
                return false;
            }
        } else {
            zA = a(j2, j3, this.z, this.V, this.U, this.t.flags, this.t.presentationTimeUs, this.W, this.w);
        }
        if (zA) {
            d(this.t.presentationTimeUs);
            boolean z = (this.t.flags & 4) != 0;
            H();
            if (!z) {
                return true;
            }
            N();
        }
        return false;
    }

    private void L() {
        MediaFormat outputFormat = this.z.getOutputFormat();
        if (this.G != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.O = true;
            return;
        }
        if (this.M) {
            outputFormat.setInteger("channel-count", 1);
        }
        a(this.z, outputFormat);
    }

    private void M() {
        if (H.f3499a < 21) {
            this.R = this.z.getOutputBuffers();
        }
    }

    private void N() throws C0145h {
        if (this.Z == 2) {
            A();
            w();
        } else {
            this.da = true;
            D();
        }
    }

    private boolean e(long j2) {
        int size = this.s.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.s.get(i2).longValue() == j2) {
                this.s.remove(i2);
                return true;
            }
        }
        return false;
    }

    private static MediaCodec.CryptoInfo a(c.d.a.a.c.f fVar, int i2) {
        MediaCodec.CryptoInfo cryptoInfoA = fVar.f1683b.a();
        if (i2 == 0) {
            return cryptoInfoA;
        }
        if (cryptoInfoA.numBytesOfClearData == null) {
            cryptoInfoA.numBytesOfClearData = new int[1];
        }
        int[] iArr = cryptoInfoA.numBytesOfClearData;
        iArr[0] = iArr[0] + i2;
        return cryptoInfoA;
    }

    private boolean O() {
        return "Amazon".equals(H.f3501c) && ("AFTM".equals(H.f3502d) || "AFTB".equals(H.f3502d));
    }

    private static boolean a(String str) {
        return H.f3499a < 18 || (H.f3499a == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (H.f3499a == 19 && H.f3502d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private int b(String str) {
        if (H.f3499a <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (H.f3502d.startsWith("SM-T585") || H.f3502d.startsWith("SM-A510") || H.f3502d.startsWith("SM-A520") || H.f3502d.startsWith("SM-J700"))) {
            return 2;
        }
        if (H.f3499a >= 24) {
            return 0;
        }
        if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
            return ("flounder".equals(H.f3500b) || "flounder_lte".equals(H.f3500b) || "grouper".equals(H.f3500b) || "tilapia".equals(H.f3500b)) ? 1 : 0;
        }
        return 0;
    }

    private static boolean c(String str) {
        return H.f3502d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean a(String str, q qVar) {
        return H.f3499a < 21 && qVar.f3684i.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean b(c.d.a.a.f.a aVar) {
        String str = aVar.f2365a;
        return (H.f3499a <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str))) || ("Amazon".equals(H.f3501c) && "AFTS".equals(H.f3502d) && aVar.f2370f);
    }

    private static boolean d(String str) {
        return (H.f3499a <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (H.f3499a <= 19 && (("hb2000".equals(H.f3500b) || "stvm8".equals(H.f3500b)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
    }

    private static boolean e(String str) {
        return H.f3499a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean b(String str, q qVar) {
        return H.f3499a <= 18 && qVar.t == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }
}
