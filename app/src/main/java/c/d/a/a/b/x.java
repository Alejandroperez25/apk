package c.d.a.a.b;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import c.d.a.a.b.o;
import c.d.a.a.b.q;
import c.d.a.a.b.s;
import c.d.a.a.m.AbstractC0170e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class x implements q {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1627a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1628b = false;
    private c.d.a.a.z A;
    private long B;
    private long C;
    private ByteBuffer D;
    private int E;
    private int F;
    private long G;
    private long H;
    private int I;
    private long J;
    private long K;
    private int L;
    private int M;
    private long N;
    private float O;
    private o[] P;
    private ByteBuffer[] Q;
    private ByteBuffer R;
    private ByteBuffer S;
    private byte[] T;
    private int U;
    private int V;
    private boolean W;
    private boolean X;
    private int Y;
    private t Z;
    private boolean aa;
    private long ba;

    /* renamed from: c, reason: collision with root package name */
    private final k f1629c;

    /* renamed from: d, reason: collision with root package name */
    private final a f1630d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1631e;

    /* renamed from: f, reason: collision with root package name */
    private final u f1632f;

    /* renamed from: g, reason: collision with root package name */
    private final G f1633g;

    /* renamed from: h, reason: collision with root package name */
    private final o[] f1634h;

    /* renamed from: i, reason: collision with root package name */
    private final o[] f1635i;
    private final ConditionVariable j;
    private final s k;
    private final ArrayDeque<d> l;
    private q.c m;
    private AudioTrack n;
    private AudioTrack o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private j v;
    private boolean w;
    private boolean x;
    private int y;
    private c.d.a.a.z z;

    public interface a {
        long a();

        long a(long j);

        c.d.a.a.z a(c.d.a.a.z zVar);

        o[] b();
    }

    public static final class c extends RuntimeException {
        /* synthetic */ c(String str, v vVar) {
            this(str);
        }

        private c(String str) {
            super(str);
        }
    }

    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final o[] f1636a;

        /* renamed from: b, reason: collision with root package name */
        private final D f1637b = new D();

        /* renamed from: c, reason: collision with root package name */
        private final F f1638c = new F();

        public b(o... oVarArr) {
            this.f1636a = (o[]) Arrays.copyOf(oVarArr, oVarArr.length + 2);
            this.f1636a[oVarArr.length] = this.f1637b;
            this.f1636a[oVarArr.length + 1] = this.f1638c;
        }

        @Override // c.d.a.a.b.x.a
        public o[] b() {
            return this.f1636a;
        }

        @Override // c.d.a.a.b.x.a
        public c.d.a.a.z a(c.d.a.a.z zVar) {
            this.f1637b.a(zVar.f3725d);
            return new c.d.a.a.z(this.f1638c.a(zVar.f3723b), this.f1638c.b(zVar.f3724c), zVar.f3725d);
        }

        @Override // c.d.a.a.b.x.a
        public long a(long j) {
            return this.f1638c.a(j);
        }

        @Override // c.d.a.a.b.x.a
        public long a() {
            return this.f1637b.h();
        }
    }

    public x(k kVar, o[] oVarArr) {
        this(kVar, oVarArr, false);
    }

    public x(k kVar, o[] oVarArr, boolean z) {
        this(kVar, new b(oVarArr), z);
    }

    public x(k kVar, a aVar, boolean z) {
        this.f1629c = kVar;
        AbstractC0170e.a(aVar);
        this.f1630d = aVar;
        this.f1631e = z;
        this.j = new ConditionVariable(true);
        this.k = new s(new e(this, null));
        this.f1632f = new u();
        this.f1633g = new G();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C(), this.f1632f, this.f1633g);
        Collections.addAll(arrayList, aVar.b());
        this.f1634h = (o[]) arrayList.toArray(new o[arrayList.size()]);
        this.f1635i = new o[]{new z()};
        this.O = 1.0f;
        this.M = 0;
        this.v = j.f1567a;
        this.Y = 0;
        this.Z = new t(0, 0.0f);
        this.A = c.d.a.a.z.f3722a;
        this.V = -1;
        this.P = new o[0];
        this.Q = new ByteBuffer[0];
        this.l = new ArrayDeque<>();
    }

    @Override // c.d.a.a.b.q
    public void a(q.c cVar) {
        this.m = cVar;
    }

    @Override // c.d.a.a.b.q
    public boolean a(int i2, int i3) {
        if (c.d.a.a.m.H.c(i3)) {
            return i3 != 4 || c.d.a.a.m.H.f3499a >= 21;
        }
        if (this.f1629c == null || !this.f1629c.a(i3)) {
            return false;
        }
        return i2 == -1 || i2 <= this.f1629c.a();
    }

    @Override // c.d.a.a.b.q
    public long a(boolean z) {
        if (!p() || this.M == 0) {
            return Long.MIN_VALUE;
        }
        return this.N + c(b(Math.min(this.k.a(z), e(r()))));
    }

    @Override // c.d.a.a.b.q
    public void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int i7) throws IllegalStateException, q.a {
        int iE;
        boolean zA;
        this.r = i4;
        this.p = c.d.a.a.m.H.c(i2);
        this.q = this.f1631e && a(i3, 4) && c.d.a.a.m.H.d(i2);
        if (this.p) {
            this.F = c.d.a.a.m.H.b(i2, i3);
        }
        boolean z = this.p && i2 != 4;
        this.x = z && !this.q;
        if (c.d.a.a.m.H.f3499a < 21 && i3 == 8 && iArr == null) {
            iArr = new int[6];
            for (int i8 = 0; i8 < iArr.length; i8++) {
                iArr[i8] = i8;
            }
        }
        if (z) {
            this.f1633g.a(i6, i7);
            this.f1632f.a(iArr);
            iE = i2;
            zA = false;
            for (o oVar : u()) {
                try {
                    zA |= oVar.a(i4, i3, iE);
                    if (oVar.g()) {
                        i3 = oVar.c();
                        i4 = oVar.d();
                        iE = oVar.e();
                    }
                } catch (o.a e2) {
                    throw new q.a(e2);
                }
            }
        } else {
            iE = i2;
            zA = false;
        }
        int iA = a(i3, this.p);
        if (iA == 0) {
            throw new q.a("Unsupported channel count: " + i3);
        }
        if (!zA && p() && this.u == iE && this.s == i4 && this.t == iA) {
            return;
        }
        reset();
        this.w = z;
        this.s = i4;
        this.t = iA;
        this.u = iE;
        this.I = this.p ? c.d.a.a.m.H.b(this.u, i3) : -1;
        if (i5 == 0) {
            i5 = c();
        }
        this.y = i5;
    }

    private int c() {
        if (this.p) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.s, this.t, this.u);
            AbstractC0170e.b(minBufferSize != -2);
            return c.d.a.a.m.H.a(minBufferSize * 4, ((int) f(250000L)) * this.I, (int) Math.max(minBufferSize, f(750000L) * this.I));
        }
        int iC = c(this.u);
        if (this.u == 5) {
            iC *= 2;
        }
        return (int) ((iC * 250000) / 1000000);
    }

    private void j() {
        ArrayList arrayList = new ArrayList();
        for (o oVar : u()) {
            if (oVar.g()) {
                arrayList.add(oVar);
            } else {
                oVar.flush();
            }
        }
        int size = arrayList.size();
        this.P = (o[]) arrayList.toArray(new o[size]);
        this.Q = new ByteBuffer[size];
        k();
    }

    private void k() {
        for (int i2 = 0; i2 < this.P.length; i2++) {
            o oVar = this.P[i2];
            oVar.flush();
            this.Q[i2] = oVar.a();
        }
    }

    private void l() {
        this.j.block();
        this.o = s();
        int audioSessionId = this.o.getAudioSessionId();
        if (f1627a && c.d.a.a.m.H.f3499a < 21) {
            if (this.n != null && audioSessionId != this.n.getAudioSessionId()) {
                o();
            }
            if (this.n == null) {
                this.n = b(audioSessionId);
            }
        }
        if (this.Y != audioSessionId) {
            this.Y = audioSessionId;
            if (this.m != null) {
                this.m.a(audioSessionId);
            }
        }
        this.A = this.x ? this.f1630d.a(this.A) : c.d.a.a.z.f3722a;
        j();
        this.k.a(this.o, this.u, this.I, this.y);
        n();
        if (this.Z.f1613a != 0) {
            this.o.attachAuxEffect(this.Z.f1613a);
            this.o.setAuxEffectSendLevel(this.Z.f1614b);
        }
    }

    @Override // c.d.a.a.b.q
    public void i() throws IllegalStateException {
        this.X = true;
        if (p()) {
            this.k.a();
            this.o.play();
        }
    }

    @Override // c.d.a.a.b.q
    public void h() {
        if (this.M == 1) {
            this.M = 2;
        }
    }

    @Override // c.d.a.a.b.q
    public boolean a(ByteBuffer byteBuffer, long j) throws IllegalStateException, q.d {
        AbstractC0170e.a(this.R == null || byteBuffer == this.R);
        if (!p()) {
            l();
            if (this.X) {
                i();
            }
        }
        if (!this.k.a(r())) {
            return false;
        }
        if (this.R == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.p && this.L == 0) {
                this.L = a(this.u, byteBuffer);
                if (this.L == 0) {
                    return true;
                }
            }
            if (this.z != null) {
                if (!m()) {
                    return false;
                }
                c.d.a.a.z zVar = this.z;
                this.z = null;
                this.l.add(new d(this.f1630d.a(zVar), Math.max(0L, j), e(r()), null));
                j();
            }
            if (this.M == 0) {
                this.N = Math.max(0L, j);
                this.M = 1;
            } else {
                long jD = this.N + d(q() - this.f1633g.i());
                if (this.M == 1 && Math.abs(jD - j) > 200000) {
                    c.d.a.a.m.o.d("AudioTrack", "Discontinuity detected [expected " + jD + ", got " + j + "]");
                    this.M = 2;
                }
                if (this.M == 2) {
                    long j2 = j - jD;
                    this.N += j2;
                    this.M = 1;
                    if (this.m != null && j2 != 0) {
                        this.m.a();
                    }
                }
            }
            if (this.p) {
                this.G += byteBuffer.remaining();
            } else {
                this.H += this.L;
            }
            this.R = byteBuffer;
        }
        if (this.w) {
            a(j);
        } else {
            b(this.R, j);
        }
        if (!this.R.hasRemaining()) {
            this.R = null;
            return true;
        }
        if (!this.k.c(r())) {
            return false;
        }
        c.d.a.a.m.o.c("AudioTrack", "Resetting stalled audio track");
        reset();
        return true;
    }

    private void a(long j) throws q.d {
        ByteBuffer byteBuffer;
        int length = this.P.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.Q[i2 - 1];
            } else {
                byteBuffer = this.R != null ? this.R : o.f1588a;
            }
            if (i2 == length) {
                b(byteBuffer, j);
            } else {
                o oVar = this.P[i2];
                oVar.a(byteBuffer);
                ByteBuffer byteBufferA = oVar.a();
                this.Q[i2] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    private void b(ByteBuffer byteBuffer, long j) throws q.d {
        if (byteBuffer.hasRemaining()) {
            int iA = 0;
            if (this.S != null) {
                AbstractC0170e.a(this.S == byteBuffer);
            } else {
                this.S = byteBuffer;
                if (c.d.a.a.m.H.f3499a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    if (this.T == null || this.T.length < iRemaining) {
                        this.T = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.T, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.U = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (c.d.a.a.m.H.f3499a < 21) {
                int iB = this.k.b(this.J);
                if (iB > 0) {
                    iA = this.o.write(this.T, this.U, Math.min(iRemaining2, iB));
                    if (iA > 0) {
                        this.U += iA;
                        byteBuffer.position(byteBuffer.position() + iA);
                    }
                }
            } else if (this.aa) {
                AbstractC0170e.b(j != -9223372036854775807L);
                iA = a(this.o, byteBuffer, iRemaining2, j);
            } else {
                iA = a(this.o, byteBuffer, iRemaining2);
            }
            this.ba = SystemClock.elapsedRealtime();
            if (iA < 0) {
                throw new q.d(iA);
            }
            if (this.p) {
                this.J += iA;
            }
            if (iA == iRemaining2) {
                if (!this.p) {
                    this.K += this.L;
                }
                this.S = null;
            }
        }
    }

    @Override // c.d.a.a.b.q
    public void e() throws IllegalStateException {
        if (!this.W && p() && m()) {
            this.k.d(r());
            this.o.stop();
            this.E = 0;
            this.W = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0036 -> B:9:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m() throws c.d.a.a.b.q.d {
        /*
            r8 = this;
            int r0 = r8.V
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r8.w
            if (r0 == 0) goto Ld
            r0 = 0
            goto L10
        Ld:
            c.d.a.a.b.o[] r0 = r8.P
            int r0 = r0.length
        L10:
            r8.V = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r8.V
            c.d.a.a.b.o[] r5 = r8.P
            int r5 = r5.length
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r5) goto L3c
            c.d.a.a.b.o[] r4 = r8.P
            int r5 = r8.V
            r4 = r4[r5]
            if (r0 == 0) goto L2c
            r4.f()
        L2c:
            r8.a(r6)
            boolean r0 = r4.b()
            if (r0 != 0) goto L36
            return r3
        L36:
            int r0 = r8.V
            int r0 = r0 + r2
            r8.V = r0
            goto L12
        L3c:
            java.nio.ByteBuffer r0 = r8.S
            if (r0 == 0) goto L4a
            java.nio.ByteBuffer r0 = r8.S
            r8.b(r0, r6)
            java.nio.ByteBuffer r0 = r8.S
            if (r0 == 0) goto L4a
            return r3
        L4a:
            r8.V = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.b.x.m():boolean");
    }

    @Override // c.d.a.a.b.q
    public boolean b() {
        return !p() || (this.W && !f());
    }

    @Override // c.d.a.a.b.q
    public boolean f() {
        return p() && this.k.e(r());
    }

    @Override // c.d.a.a.b.q
    public c.d.a.a.z a(c.d.a.a.z zVar) {
        c.d.a.a.z zVar2;
        if (p() && !this.x) {
            this.A = c.d.a.a.z.f3722a;
            return this.A;
        }
        if (this.z != null) {
            zVar2 = this.z;
        } else {
            zVar2 = !this.l.isEmpty() ? this.l.getLast().f1639a : this.A;
        }
        if (!zVar.equals(zVar2)) {
            if (p()) {
                this.z = zVar;
            } else {
                this.A = this.f1630d.a(zVar);
            }
        }
        return this.A;
    }

    @Override // c.d.a.a.b.q
    public c.d.a.a.z d() {
        return this.A;
    }

    @Override // c.d.a.a.b.q
    public void a(j jVar) throws IllegalStateException {
        if (this.v.equals(jVar)) {
            return;
        }
        this.v = jVar;
        if (this.aa) {
            return;
        }
        reset();
        this.Y = 0;
    }

    @Override // c.d.a.a.b.q
    public void a(t tVar) {
        if (this.Z.equals(tVar)) {
            return;
        }
        int i2 = tVar.f1613a;
        float f2 = tVar.f1614b;
        if (this.o != null) {
            if (this.Z.f1613a != i2) {
                this.o.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.o.setAuxEffectSendLevel(f2);
            }
        }
        this.Z = tVar;
    }

    @Override // c.d.a.a.b.q
    public void a(int i2) throws IllegalStateException {
        AbstractC0170e.b(c.d.a.a.m.H.f3499a >= 21);
        if (this.aa && this.Y == i2) {
            return;
        }
        this.aa = true;
        this.Y = i2;
        reset();
    }

    @Override // c.d.a.a.b.q
    public void g() throws IllegalStateException {
        if (this.aa) {
            this.aa = false;
            this.Y = 0;
            reset();
        }
    }

    @Override // c.d.a.a.b.q
    public void a(float f2) {
        if (this.O != f2) {
            this.O = f2;
            n();
        }
    }

    private void n() {
        if (p()) {
            if (c.d.a.a.m.H.f3499a >= 21) {
                a(this.o, this.O);
            } else {
                b(this.o, this.O);
            }
        }
    }

    @Override // c.d.a.a.b.q
    public void pause() throws IllegalStateException {
        this.X = false;
        if (p() && this.k.c()) {
            this.o.pause();
        }
    }

    @Override // c.d.a.a.b.q
    public void reset() throws IllegalStateException {
        if (p()) {
            this.G = 0L;
            this.H = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0;
            if (this.z != null) {
                this.A = this.z;
                this.z = null;
            } else if (!this.l.isEmpty()) {
                this.A = this.l.getLast().f1639a;
            }
            this.l.clear();
            this.B = 0L;
            this.C = 0L;
            this.f1633g.h();
            this.R = null;
            this.S = null;
            k();
            this.W = false;
            this.V = -1;
            this.D = null;
            this.E = 0;
            this.M = 0;
            if (this.k.b()) {
                this.o.pause();
            }
            AudioTrack audioTrack = this.o;
            this.o = null;
            this.k.d();
            this.j.close();
            new v(this, audioTrack).start();
        }
    }

    @Override // c.d.a.a.b.q
    public void a() throws IllegalStateException {
        reset();
        o();
        for (o oVar : this.f1634h) {
            oVar.reset();
        }
        for (o oVar2 : this.f1635i) {
            oVar2.reset();
        }
        this.Y = 0;
        this.X = false;
    }

    private void o() {
        if (this.n == null) {
            return;
        }
        AudioTrack audioTrack = this.n;
        this.n = null;
        new w(this, audioTrack).start();
    }

    private long b(long j) {
        d dVarRemove = null;
        while (!this.l.isEmpty() && j >= this.l.getFirst().f1641c) {
            dVarRemove = this.l.remove();
        }
        if (dVarRemove != null) {
            this.A = dVarRemove.f1639a;
            this.C = dVarRemove.f1641c;
            this.B = dVarRemove.f1640b - this.N;
        }
        if (this.A.f3723b == 1.0f) {
            return (j + this.B) - this.C;
        }
        if (this.l.isEmpty()) {
            return this.B + this.f1630d.a(j - this.C);
        }
        return this.B + c.d.a.a.m.H.a(j - this.C, this.A.f3723b);
    }

    private long c(long j) {
        return j + e(this.f1630d.a());
    }

    private boolean p() {
        return this.o != null;
    }

    private long d(long j) {
        return (j * 1000000) / this.r;
    }

    private long e(long j) {
        return (j * 1000000) / this.s;
    }

    private long f(long j) {
        return (j * this.s) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long q() {
        return this.p ? this.G / this.F : this.H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        return this.p ? this.J / this.I : this.K;
    }

    private AudioTrack s() throws q.b {
        AudioTrack audioTrack;
        if (c.d.a.a.m.H.f3499a >= 21) {
            audioTrack = t();
        } else {
            int iH = c.d.a.a.m.H.h(this.v.f1570d);
            if (this.Y == 0) {
                audioTrack = new AudioTrack(iH, this.s, this.t, this.u, this.y, 1);
            } else {
                audioTrack = new AudioTrack(iH, this.s, this.t, this.u, this.y, 1, this.Y);
            }
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new q.b(state, this.s, this.t, this.y);
    }

    @TargetApi(21)
    private AudioTrack t() {
        AudioAttributes audioAttributesA;
        if (this.aa) {
            audioAttributesA = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            audioAttributesA = this.v.a();
        }
        return new AudioTrack(audioAttributesA, new AudioFormat.Builder().setChannelMask(this.t).setEncoding(this.u).setSampleRate(this.s).build(), this.y, 1, this.Y != 0 ? this.Y : 0);
    }

    private AudioTrack b(int i2) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i2);
    }

    private o[] u() {
        return this.q ? this.f1635i : this.f1634h;
    }

    private static int a(int i2, boolean z) {
        if (c.d.a.a.m.H.f3499a <= 28 && !z) {
            if (i2 == 7) {
                i2 = 8;
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                i2 = 6;
            }
        }
        if (c.d.a.a.m.H.f3499a <= 26 && "fugu".equals(c.d.a.a.m.H.f3500b) && !z && i2 == 1) {
            i2 = 2;
        }
        return c.d.a.a.m.H.e(i2);
    }

    private static int c(int i2) {
        if (i2 == 14) {
            return 3062500;
        }
        switch (i2) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static int a(int i2, ByteBuffer byteBuffer) {
        if (i2 == 7 || i2 == 8) {
            return y.a(byteBuffer);
        }
        if (i2 == 5) {
            return AbstractC0130h.a();
        }
        if (i2 == 6) {
            return AbstractC0130h.a(byteBuffer);
        }
        if (i2 == 14) {
            int iB = AbstractC0130h.b(byteBuffer);
            if (iB == -1) {
                return 0;
            }
            return AbstractC0130h.a(byteBuffer, iB) * 16;
        }
        throw new IllegalStateException("Unexpected audio encoding: " + i2);
    }

    @TargetApi(21)
    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    @TargetApi(21)
    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j) {
        if (this.D == null) {
            this.D = ByteBuffer.allocate(16);
            this.D.order(ByteOrder.BIG_ENDIAN);
            this.D.putInt(1431633921);
        }
        if (this.E == 0) {
            this.D.putInt(4, i2);
            this.D.putLong(8, j * 1000);
            this.D.position(0);
            this.E = i2;
        }
        int iRemaining = this.D.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.D, iRemaining, 1);
            if (iWrite < 0) {
                this.E = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iA = a(audioTrack, byteBuffer, i2);
        if (iA < 0) {
            this.E = 0;
            return iA;
        }
        this.E -= iA;
        return iA;
    }

    @TargetApi(21)
    private static void a(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    private static void b(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final c.d.a.a.z f1639a;

        /* renamed from: b, reason: collision with root package name */
        private final long f1640b;

        /* renamed from: c, reason: collision with root package name */
        private final long f1641c;

        /* synthetic */ d(c.d.a.a.z zVar, long j, long j2, v vVar) {
            this(zVar, j, j2);
        }

        private d(c.d.a.a.z zVar, long j, long j2) {
            this.f1639a = zVar;
            this.f1640b = j;
            this.f1641c = j2;
        }
    }

    private final class e implements s.a {
        private e() {
        }

        /* synthetic */ e(x xVar, v vVar) {
            this();
        }

        @Override // c.d.a.a.b.s.a
        public void a(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + x.this.q() + ", " + x.this.r();
            if (x.f1628b) {
                throw new c(str, null);
            }
            c.d.a.a.m.o.c("AudioTrack", str);
        }

        @Override // c.d.a.a.b.s.a
        public void b(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + x.this.q() + ", " + x.this.r();
            if (x.f1628b) {
                throw new c(str, null);
            }
            c.d.a.a.m.o.c("AudioTrack", str);
        }

        @Override // c.d.a.a.b.s.a
        public void a(long j) {
            c.d.a.a.m.o.c("AudioTrack", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // c.d.a.a.b.s.a
        public void a(int i2, long j) {
            if (x.this.m != null) {
                x.this.m.a(i2, j, SystemClock.elapsedRealtime() - x.this.ba);
            }
        }
    }
}
