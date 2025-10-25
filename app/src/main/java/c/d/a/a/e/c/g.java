package c.d.a.a.e.c;

import android.util.Pair;
import android.util.SparseArray;
import c.d.a.a.AbstractC0132d;
import c.d.a.a.b.AbstractC0130h;
import c.d.a.a.d.f;
import c.d.a.a.e.j;
import c.d.a.a.e.n;
import c.d.a.a.e.o;
import c.d.a.a.e.q;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.m.p;
import c.d.a.a.m.s;
import c.d.a.a.m.u;
import c.d.a.a.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class g implements c.d.a.a.e.g {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1799a = new j() { // from class: c.d.a.a.e.c.a
        @Override // c.d.a.a.e.j
        public final c.d.a.a.e.g[] a() {
            return g.b();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f1800b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f1801c = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f1802d = H.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f1803e = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f1804f = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: g, reason: collision with root package name */
    private static final UUID f1805g = new UUID(72057594037932032L, -9223371306706625679L);
    private b A;
    private boolean B;
    private int C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private long H;
    private p I;
    private p J;
    private boolean K;
    private int L;
    private long M;
    private long N;
    private int O;
    private int P;
    private int[] Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private byte Z;
    private int aa;
    private int ba;
    private int ca;
    private boolean da;
    private boolean ea;
    private c.d.a.a.e.i fa;

    /* renamed from: h, reason: collision with root package name */
    private final d f1806h;

    /* renamed from: i, reason: collision with root package name */
    private final i f1807i;
    private final SparseArray<b> j;
    private final boolean k;
    private final u l;
    private final u m;
    private final u n;
    private final u o;
    private final u p;
    private final u q;
    private final u r;
    private final u s;
    private final u t;
    private ByteBuffer u;
    private long v;
    private long w;
    private long x;
    private long y;
    private long z;

    @Override // c.d.a.a.e.g
    public void a() {
    }

    static /* synthetic */ c.d.a.a.e.g[] b() {
        return new c.d.a.a.e.g[]{new g()};
    }

    public g() {
        this(0);
    }

    public g(int i2) {
        this(new c.d.a.a.e.c.c(), i2);
    }

    g(d dVar, int i2) {
        this.w = -1L;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.F = -1L;
        this.G = -1L;
        this.H = -9223372036854775807L;
        this.f1806h = dVar;
        this.f1806h.a(new a());
        this.k = (i2 & 1) == 0;
        this.f1807i = new i();
        this.j = new SparseArray<>();
        this.n = new u(4);
        this.o = new u(ByteBuffer.allocate(4).putInt(-1).array());
        this.p = new u(4);
        this.l = new u(s.f3547a);
        this.m = new u(4);
        this.q = new u();
        this.r = new u();
        this.s = new u(8);
        this.t = new u();
    }

    @Override // c.d.a.a.e.g
    public boolean a(c.d.a.a.e.h hVar) {
        return new h().a(hVar);
    }

    @Override // c.d.a.a.e.g
    public void a(c.d.a.a.e.i iVar) {
        this.fa = iVar;
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        this.H = -9223372036854775807L;
        this.L = 0;
        this.f1806h.reset();
        this.f1807i.a();
        e();
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            this.j.valueAt(i2).b();
        }
    }

    @Override // c.d.a.a.e.g
    public int a(c.d.a.a.e.h hVar, n nVar) {
        this.da = false;
        boolean zA = true;
        while (zA && !this.da) {
            zA = this.f1806h.a(hVar);
            if (zA && a(nVar, hVar.c())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            this.j.valueAt(i2).a();
        }
        return -1;
    }

    void a(int i2, long j, long j2) throws x {
        if (i2 == 160) {
            this.ea = false;
            return;
        }
        if (i2 == 174) {
            this.A = new b();
            return;
        }
        if (i2 == 187) {
            this.K = false;
            return;
        }
        if (i2 == 19899) {
            this.C = -1;
            this.D = -1L;
            return;
        }
        if (i2 == 20533) {
            this.A.f1814f = true;
            return;
        }
        if (i2 == 21968) {
            this.A.v = true;
            return;
        }
        if (i2 != 25152) {
            if (i2 == 408125543) {
                if (this.w != -1 && this.w != j) {
                    throw new x("Multiple Segment elements not supported");
                }
                this.w = j;
                this.v = j2;
                return;
            }
            if (i2 == 475249515) {
                this.I = new p();
                this.J = new p();
            } else if (i2 == 524531317 && !this.B) {
                if (this.k && this.F != -1) {
                    this.E = true;
                } else {
                    this.fa.a(new o.b(this.z));
                    this.B = true;
                }
            }
        }
    }

    void a(int i2) throws x {
        if (i2 == 160) {
            if (this.L != 2) {
                return;
            }
            if (!this.ea) {
                this.T |= 1;
            }
            a(this.j.get(this.R), this.M);
            this.L = 0;
            return;
        }
        if (i2 == 174) {
            if (a(this.A.f1810b)) {
                this.A.a(this.fa, this.A.f1811c);
                this.j.put(this.A.f1811c, this.A);
            }
            this.A = null;
            return;
        }
        if (i2 == 19899) {
            if (this.C == -1 || this.D == -1) {
                throw new x("Mandatory element SeekID or SeekPosition not found");
            }
            if (this.C == 475249515) {
                this.F = this.D;
                return;
            }
            return;
        }
        if (i2 == 25152) {
            if (this.A.f1814f) {
                if (this.A.f1816h == null) {
                    throw new x("Encrypted Track found but ContentEncKeyID was not found");
                }
                this.A.j = new c.d.a.a.d.f(new f.a(AbstractC0132d.f1699a, "video/webm", this.A.f1816h.f2358b));
                return;
            }
            return;
        }
        if (i2 == 28032) {
            if (this.A.f1814f && this.A.f1815g != null) {
                throw new x("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i2 == 357149030) {
            if (this.x == -9223372036854775807L) {
                this.x = 1000000L;
            }
            if (this.y != -9223372036854775807L) {
                this.z = a(this.y);
                return;
            }
            return;
        }
        if (i2 != 374648427) {
            if (i2 == 475249515 && !this.B) {
                this.fa.a(f());
                this.B = true;
                return;
            }
            return;
        }
        if (this.j.size() == 0) {
            throw new x("No valid tracks were found");
        }
        this.fa.a();
    }

    void a(int i2, long j) throws x {
        switch (i2) {
            case 131:
                this.A.f1812d = (int) j;
                return;
            case 136:
                this.A.S = j == 1;
                return;
            case 155:
                this.N = a(j);
                return;
            case 159:
                this.A.L = (int) j;
                return;
            case 176:
                this.A.k = (int) j;
                return;
            case 179:
                this.I.a(a(j));
                return;
            case 186:
                this.A.l = (int) j;
                return;
            case 215:
                this.A.f1811c = (int) j;
                return;
            case 231:
                this.H = a(j);
                return;
            case 241:
                if (this.K) {
                    return;
                }
                this.J.a(j);
                this.K = true;
                return;
            case 251:
                this.ea = true;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw new x("ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw new x("DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw new x("EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw new x("ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw new x("AESSettingsCipherMode " + j + " not supported");
            case 20529:
                if (j == 0) {
                    return;
                }
                throw new x("ContentEncodingOrder " + j + " not supported");
            case 20530:
                if (j == 1) {
                    return;
                }
                throw new x("ContentEncodingScope " + j + " not supported");
            case 21420:
                this.D = j + this.w;
                return;
            case 21432:
                int i3 = (int) j;
                if (i3 == 3) {
                    this.A.u = 1;
                    return;
                }
                if (i3 != 15) {
                    switch (i3) {
                        case 0:
                            this.A.u = 0;
                            return;
                        case 1:
                            this.A.u = 2;
                            return;
                        default:
                            return;
                    }
                }
                this.A.u = 3;
                return;
            case 21680:
                this.A.m = (int) j;
                return;
            case 21682:
                this.A.o = (int) j;
                return;
            case 21690:
                this.A.n = (int) j;
                return;
            case 21930:
                this.A.R = j == 1;
                return;
            case 21945:
                switch ((int) j) {
                    case 1:
                        this.A.y = 2;
                        return;
                    case 2:
                        this.A.y = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                int i4 = (int) j;
                if (i4 != 1) {
                    if (i4 == 16) {
                        this.A.x = 6;
                        return;
                    } else if (i4 == 18) {
                        this.A.x = 7;
                        return;
                    } else {
                        switch (i4) {
                            case 6:
                            case 7:
                                break;
                            default:
                                return;
                        }
                    }
                }
                this.A.x = 3;
                return;
            case 21947:
                this.A.v = true;
                int i5 = (int) j;
                if (i5 == 1) {
                    this.A.w = 1;
                    return;
                } else {
                    if (i5 != 9) {
                        switch (i5) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                this.A.w = 2;
                                return;
                            default:
                                return;
                        }
                    }
                    this.A.w = 6;
                    return;
                }
            case 21948:
                this.A.z = (int) j;
                return;
            case 21949:
                this.A.A = (int) j;
                return;
            case 22186:
                this.A.O = j;
                return;
            case 22203:
                this.A.P = j;
                return;
            case 25188:
                this.A.M = (int) j;
                return;
            case 30321:
                switch ((int) j) {
                    case 0:
                        this.A.p = 0;
                        return;
                    case 1:
                        this.A.p = 1;
                        return;
                    case 2:
                        this.A.p = 2;
                        return;
                    case 3:
                        this.A.p = 3;
                        return;
                    default:
                        return;
                }
            case 2352003:
                this.A.f1813e = (int) j;
                return;
            case 2807729:
                this.x = j;
                return;
            default:
                return;
        }
    }

    void a(int i2, double d2) {
        if (i2 == 181) {
            this.A.N = (int) d2;
        }
        if (i2 == 17545) {
            this.y = (long) d2;
            return;
        }
        switch (i2) {
            case 21969:
                this.A.B = (float) d2;
                break;
            case 21970:
                this.A.C = (float) d2;
                break;
            case 21971:
                this.A.D = (float) d2;
                break;
            case 21972:
                this.A.E = (float) d2;
                break;
            case 21973:
                this.A.F = (float) d2;
                break;
            case 21974:
                this.A.G = (float) d2;
                break;
            case 21975:
                this.A.H = (float) d2;
                break;
            case 21976:
                this.A.I = (float) d2;
                break;
            case 21977:
                this.A.J = (float) d2;
                break;
            case 21978:
                this.A.K = (float) d2;
                break;
            default:
                switch (i2) {
                    case 30323:
                        this.A.q = (float) d2;
                        break;
                    case 30324:
                        this.A.r = (float) d2;
                        break;
                    case 30325:
                        this.A.s = (float) d2;
                        break;
                }
        }
    }

    void a(int i2, String str) throws x {
        if (i2 == 134) {
            this.A.f1810b = str;
            return;
        }
        if (i2 != 17026) {
            if (i2 == 21358) {
                this.A.f1809a = str;
                return;
            } else {
                if (i2 != 2274716) {
                    return;
                }
                this.A.T = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw new x("DocType " + str + " not supported");
    }

    void a(int i2, int i3, c.d.a.a.e.h hVar) throws x {
        long j;
        int i4;
        int i5 = 0;
        int i6 = 1;
        if (i2 != 161 && i2 != 163) {
            if (i2 == 16981) {
                this.A.f1815g = new byte[i3];
                hVar.readFully(this.A.f1815g, 0, i3);
                return;
            }
            if (i2 == 18402) {
                byte[] bArr = new byte[i3];
                hVar.readFully(bArr, 0, i3);
                this.A.f1816h = new q.a(1, bArr, 0, 0);
                return;
            }
            if (i2 == 21419) {
                Arrays.fill(this.p.f3567a, (byte) 0);
                hVar.readFully(this.p.f3567a, 4 - i3, i3);
                this.p.c(0);
                this.C = (int) this.p.n();
                return;
            }
            if (i2 == 25506) {
                this.A.f1817i = new byte[i3];
                hVar.readFully(this.A.f1817i, 0, i3);
                return;
            } else {
                if (i2 == 30322) {
                    this.A.t = new byte[i3];
                    hVar.readFully(this.A.t, 0, i3);
                    return;
                }
                throw new x("Unexpected id: " + i2);
            }
        }
        int i7 = 8;
        if (this.L == 0) {
            this.R = (int) this.f1807i.a(hVar, false, true, 8);
            this.S = this.f1807i.b();
            this.N = -9223372036854775807L;
            this.L = 1;
            this.n.a();
        }
        b bVar = this.j.get(this.R);
        if (bVar == null) {
            hVar.c(i3 - this.S);
            this.L = 0;
            return;
        }
        if (this.L == 1) {
            a(hVar, 3);
            int i8 = (this.n.f3567a[2] & 6) >> 1;
            if (i8 == 0) {
                this.P = 1;
                this.Q = a(this.Q, 1);
                this.Q[0] = (i3 - this.S) - 3;
            } else {
                if (i2 != 163) {
                    throw new x("Lacing only supported in SimpleBlocks.");
                }
                a(hVar, 4);
                this.P = (this.n.f3567a[3] & 255) + 1;
                this.Q = a(this.Q, this.P);
                if (i8 == 2) {
                    Arrays.fill(this.Q, 0, this.P, ((i3 - this.S) - 4) / this.P);
                } else if (i8 == 1) {
                    int i9 = 4;
                    int i10 = 0;
                    for (int i11 = 0; i11 < this.P - 1; i11++) {
                        this.Q[i11] = 0;
                        do {
                            i9++;
                            a(hVar, i9);
                            i4 = this.n.f3567a[i9 - 1] & 255;
                            int[] iArr = this.Q;
                            iArr[i11] = iArr[i11] + i4;
                        } while (i4 == 255);
                        i10 += this.Q[i11];
                    }
                    this.Q[this.P - 1] = ((i3 - this.S) - i9) - i10;
                } else if (i8 == 3) {
                    int i12 = 0;
                    int i13 = 4;
                    int i14 = 0;
                    while (i12 < this.P - i6) {
                        this.Q[i12] = i5;
                        i13++;
                        a(hVar, i13);
                        int i15 = i13 - 1;
                        if (this.n.f3567a[i15] == 0) {
                            throw new x("No valid varint length mask found");
                        }
                        int i16 = 0;
                        while (true) {
                            if (i16 >= i7) {
                                j = 0;
                                break;
                            }
                            int i17 = i6 << (7 - i16);
                            if ((this.n.f3567a[i15] & i17) != 0) {
                                int i18 = i13 + i16;
                                a(hVar, i18);
                                long j2 = (~i17) & this.n.f3567a[i15] & 255;
                                int i19 = i15 + 1;
                                long j3 = j2;
                                while (i19 < i18) {
                                    j3 = (j3 << i7) | (this.n.f3567a[i19] & 255);
                                    i19++;
                                    i18 = i18;
                                    i7 = 8;
                                }
                                int i20 = i18;
                                if (i12 > 0) {
                                    j3 -= (1 << ((i16 * 7) + 6)) - 1;
                                }
                                j = j3;
                                i13 = i20;
                            } else {
                                i16++;
                                i6 = 1;
                                i7 = 8;
                            }
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            throw new x("EBML lacing sample size out of range.");
                        }
                        int i21 = (int) j;
                        int[] iArr2 = this.Q;
                        if (i12 != 0) {
                            i21 += this.Q[i12 - 1];
                        }
                        iArr2[i12] = i21;
                        i14 += this.Q[i12];
                        i12++;
                        i5 = 0;
                        i6 = 1;
                        i7 = 8;
                    }
                    this.Q[this.P - 1] = ((i3 - this.S) - i13) - i14;
                } else {
                    throw new x("Unexpected lacing value: " + i8);
                }
            }
            this.M = this.H + a((this.n.f3567a[0] << 8) | (this.n.f3567a[1] & 255));
            this.T = ((bVar.f1812d == 2 || (i2 == 163 && (this.n.f3567a[2] & 128) == 128)) ? 1 : 0) | ((this.n.f3567a[2] & 8) == 8 ? Integer.MIN_VALUE : 0);
            this.L = 2;
            this.O = 0;
        }
        if (i2 == 163) {
            while (this.O < this.P) {
                a(hVar, bVar, this.Q[this.O]);
                a(bVar, this.M + ((this.O * bVar.f1813e) / 1000));
                this.O++;
            }
            this.L = 0;
            return;
        }
        a(hVar, bVar, this.Q[0]);
    }

    private void a(b bVar, long j) {
        if (bVar.Q != null) {
            bVar.Q.a(bVar, j);
        } else {
            if ("S_TEXT/UTF8".equals(bVar.f1810b)) {
                a(bVar, "%02d:%02d:%02d,%03d", 19, 1000L, f1801c);
            } else if ("S_TEXT/ASS".equals(bVar.f1810b)) {
                a(bVar, "%01d:%02d:%02d:%02d", 21, 10000L, f1804f);
            }
            bVar.U.a(j, this.T, this.ca, 0, bVar.f1816h);
        }
        this.da = true;
        e();
    }

    private void e() {
        this.U = 0;
        this.ca = 0;
        this.ba = 0;
        this.V = false;
        this.W = false;
        this.Y = false;
        this.aa = 0;
        this.Z = (byte) 0;
        this.X = false;
        this.q.a();
    }

    private void a(c.d.a.a.e.h hVar, int i2) {
        if (this.n.c() >= i2) {
            return;
        }
        if (this.n.e() < i2) {
            this.n.a(Arrays.copyOf(this.n.f3567a, Math.max(this.n.f3567a.length * 2, i2)), this.n.c());
        }
        hVar.readFully(this.n.f3567a, this.n.c(), i2 - this.n.c());
        this.n.b(i2);
    }

    private void a(c.d.a.a.e.h hVar, b bVar, int i2) throws x {
        if ("S_TEXT/UTF8".equals(bVar.f1810b)) {
            a(hVar, f1800b, i2);
            return;
        }
        if ("S_TEXT/ASS".equals(bVar.f1810b)) {
            a(hVar, f1803e, i2);
            return;
        }
        q qVar = bVar.U;
        if (!this.V) {
            if (bVar.f1814f) {
                this.T &= -1073741825;
                if (!this.W) {
                    hVar.readFully(this.n.f3567a, 0, 1);
                    this.U++;
                    if ((this.n.f3567a[0] & 128) == 128) {
                        throw new x("Extension bit is set in signal byte");
                    }
                    this.Z = this.n.f3567a[0];
                    this.W = true;
                }
                if ((this.Z & 1) == 1) {
                    boolean z = (this.Z & 2) == 2;
                    this.T |= 1073741824;
                    if (!this.X) {
                        hVar.readFully(this.s.f3567a, 0, 8);
                        this.U += 8;
                        this.X = true;
                        this.n.f3567a[0] = (byte) ((z ? 128 : 0) | 8);
                        this.n.c(0);
                        qVar.a(this.n, 1);
                        this.ca++;
                        this.s.c(0);
                        qVar.a(this.s, 8);
                        this.ca += 8;
                    }
                    if (z) {
                        if (!this.Y) {
                            hVar.readFully(this.n.f3567a, 0, 1);
                            this.U++;
                            this.n.c(0);
                            this.aa = this.n.h();
                            this.Y = true;
                        }
                        int i3 = this.aa * 4;
                        this.n.a(i3);
                        hVar.readFully(this.n.f3567a, 0, i3);
                        this.U += i3;
                        short s = (short) ((this.aa / 2) + 1);
                        int i4 = (s * 6) + 2;
                        if (this.u == null || this.u.capacity() < i4) {
                            this.u = ByteBuffer.allocate(i4);
                        }
                        this.u.position(0);
                        this.u.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.aa) {
                            int iV = this.n.v();
                            if (i5 % 2 == 0) {
                                this.u.putShort((short) (iV - i6));
                            } else {
                                this.u.putInt(iV - i6);
                            }
                            i5++;
                            i6 = iV;
                        }
                        int i7 = (i2 - this.U) - i6;
                        if (this.aa % 2 == 1) {
                            this.u.putInt(i7);
                        } else {
                            this.u.putShort((short) i7);
                            this.u.putInt(0);
                        }
                        this.t.a(this.u.array(), i4);
                        qVar.a(this.t, i4);
                        this.ca += i4;
                    }
                }
            } else if (bVar.f1815g != null) {
                this.q.a(bVar.f1815g, bVar.f1815g.length);
            }
            this.V = true;
        }
        int iC = i2 + this.q.c();
        if ("V_MPEG4/ISO/AVC".equals(bVar.f1810b) || "V_MPEGH/ISO/HEVC".equals(bVar.f1810b)) {
            byte[] bArr = this.m.f3567a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i8 = bVar.V;
            int i9 = 4 - bVar.V;
            while (this.U < iC) {
                if (this.ba == 0) {
                    a(hVar, bArr, i9, i8);
                    this.m.c(0);
                    this.ba = this.m.v();
                    this.l.c(0);
                    qVar.a(this.l, 4);
                    this.ca += 4;
                } else {
                    this.ba -= a(hVar, qVar, this.ba);
                }
            }
        } else {
            if (bVar.Q != null) {
                AbstractC0170e.b(this.q.c() == 0);
                bVar.Q.a(hVar, this.T, iC);
            }
            while (this.U < iC) {
                a(hVar, qVar, iC - this.U);
            }
        }
        if ("A_VORBIS".equals(bVar.f1810b)) {
            this.o.c(0);
            qVar.a(this.o, 4);
            this.ca += 4;
        }
    }

    private void a(c.d.a.a.e.h hVar, byte[] bArr, int i2) {
        int length = bArr.length + i2;
        if (this.r.e() < length) {
            this.r.f3567a = Arrays.copyOf(bArr, length + i2);
        } else {
            System.arraycopy(bArr, 0, this.r.f3567a, 0, bArr.length);
        }
        hVar.readFully(this.r.f3567a, bArr.length, i2);
        this.r.a(length);
    }

    private void a(b bVar, String str, int i2, long j, byte[] bArr) {
        a(this.r.f3567a, this.N, str, i2, j, bArr);
        bVar.U.a(this.r, this.r.c());
        this.ca += this.r.c();
    }

    private static void a(byte[] bArr, long j, String str, int i2, long j2, byte[] bArr2) {
        byte[] bArrC;
        if (j == -9223372036854775807L) {
            bArrC = bArr2;
        } else {
            int i3 = (int) (j / 3600000000L);
            long j3 = j - ((i3 * 3600) * 1000000);
            int i4 = (int) (j3 / 60000000);
            long j4 = j3 - ((i4 * 60) * 1000000);
            int i5 = (int) (j4 / 1000000);
            bArrC = H.c(String.format(Locale.US, str, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf((int) ((j4 - (i5 * 1000000)) / j2))));
        }
        System.arraycopy(bArrC, 0, bArr, i2, bArr2.length);
    }

    private void a(c.d.a.a.e.h hVar, byte[] bArr, int i2, int i3) {
        int iMin = Math.min(i3, this.q.b());
        hVar.readFully(bArr, i2 + iMin, i3 - iMin);
        if (iMin > 0) {
            this.q.a(bArr, i2, iMin);
        }
        this.U += i3;
    }

    private int a(c.d.a.a.e.h hVar, q qVar, int i2) {
        int iA;
        int iB = this.q.b();
        if (iB > 0) {
            iA = Math.min(i2, iB);
            qVar.a(this.q, iA);
        } else {
            iA = qVar.a(hVar, i2, false);
        }
        this.U += iA;
        this.ca += iA;
        return iA;
    }

    private o f() {
        if (this.w == -1 || this.z == -9223372036854775807L || this.I == null || this.I.a() == 0 || this.J == null || this.J.a() != this.I.a()) {
            this.I = null;
            this.J = null;
            return new o.b(this.z);
        }
        int iA = this.I.a();
        int[] iArr = new int[iA];
        long[] jArr = new long[iA];
        long[] jArr2 = new long[iA];
        long[] jArr3 = new long[iA];
        int i2 = 0;
        for (int i3 = 0; i3 < iA; i3++) {
            jArr3[i3] = this.I.a(i3);
            jArr[i3] = this.w + this.J.a(i3);
        }
        while (true) {
            int i4 = iA - 1;
            if (i2 < i4) {
                int i5 = i2 + 1;
                iArr[i2] = (int) (jArr[i5] - jArr[i2]);
                jArr2[i2] = jArr3[i5] - jArr3[i2];
                i2 = i5;
            } else {
                iArr[i4] = (int) ((this.w + this.v) - jArr[i4]);
                jArr2[i4] = this.z - jArr3[i4];
                this.I = null;
                this.J = null;
                return new c.d.a.a.e.b(iArr, jArr, jArr2, jArr3);
            }
        }
    }

    private boolean a(n nVar, long j) {
        if (this.E) {
            this.G = j;
            nVar.f2349a = this.F;
            this.E = false;
            return true;
        }
        if (!this.B || this.G == -1) {
            return false;
        }
        nVar.f2349a = this.G;
        this.G = -1L;
        return true;
    }

    private long a(long j) throws x {
        if (this.x == -9223372036854775807L) {
            throw new x("Can't scale timecode prior to timecodeScale being set.");
        }
        return H.d(j, this.x, 1000L);
    }

    private static boolean a(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str);
    }

    private static int[] a(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        return iArr.length >= i2 ? iArr : new int[Math.max(iArr.length * 2, i2)];
    }

    private final class a implements e {
        @Override // c.d.a.a.e.c.e
        public int b(int i2) {
            switch (i2) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 241:
                case 251:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 22186:
                case 22203:
                case 25188:
                case 30321:
                case 2352003:
                case 2807729:
                    return 2;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    return 3;
                case 160:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    return 1;
                case 161:
                case 163:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    return 4;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    return 5;
                default:
                    return 0;
            }
        }

        @Override // c.d.a.a.e.c.e
        public boolean c(int i2) {
            return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
        }

        private a() {
        }

        @Override // c.d.a.a.e.c.e
        public void a(int i2, long j, long j2) throws x {
            g.this.a(i2, j, j2);
        }

        @Override // c.d.a.a.e.c.e
        public void a(int i2) throws x {
            g.this.a(i2);
        }

        @Override // c.d.a.a.e.c.e
        public void a(int i2, long j) throws x {
            g.this.a(i2, j);
        }

        @Override // c.d.a.a.e.c.e
        public void a(int i2, double d2) {
            g.this.a(i2, d2);
        }

        @Override // c.d.a.a.e.c.e
        public void a(int i2, String str) throws x {
            g.this.a(i2, str);
        }

        @Override // c.d.a.a.e.c.e
        public void a(int i2, int i3, c.d.a.a.e.h hVar) throws x {
            g.this.a(i2, i3, hVar);
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f1818a = new byte[10];

        /* renamed from: b, reason: collision with root package name */
        private boolean f1819b;

        /* renamed from: c, reason: collision with root package name */
        private int f1820c;

        /* renamed from: d, reason: collision with root package name */
        private int f1821d;

        /* renamed from: e, reason: collision with root package name */
        private long f1822e;

        /* renamed from: f, reason: collision with root package name */
        private int f1823f;

        public void a() {
            this.f1819b = false;
        }

        public void a(c.d.a.a.e.h hVar, int i2, int i3) {
            if (!this.f1819b) {
                hVar.a(this.f1818a, 0, 10);
                hVar.b();
                if (AbstractC0130h.b(this.f1818a) == 0) {
                    return;
                }
                this.f1819b = true;
                this.f1820c = 0;
            }
            if (this.f1820c == 0) {
                this.f1823f = i2;
                this.f1821d = 0;
            }
            this.f1821d += i3;
        }

        public void a(b bVar, long j) {
            if (this.f1819b) {
                int i2 = this.f1820c;
                this.f1820c = i2 + 1;
                if (i2 == 0) {
                    this.f1822e = j;
                }
                if (this.f1820c < 16) {
                    return;
                }
                bVar.U.a(this.f1822e, this.f1823f, this.f1821d, 0, bVar.f1816h);
                this.f1820c = 0;
            }
        }

        public void a(b bVar) {
            if (!this.f1819b || this.f1820c <= 0) {
                return;
            }
            bVar.U.a(this.f1822e, this.f1823f, this.f1821d, 0, bVar.f1816h);
            this.f1820c = 0;
        }
    }

    private static final class b {
        public int A;
        public float B;
        public float C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public int L;
        public int M;
        public int N;
        public long O;
        public long P;
        public c Q;
        public boolean R;
        public boolean S;
        private String T;
        public q U;
        public int V;

        /* renamed from: a, reason: collision with root package name */
        public String f1809a;

        /* renamed from: b, reason: collision with root package name */
        public String f1810b;

        /* renamed from: c, reason: collision with root package name */
        public int f1811c;

        /* renamed from: d, reason: collision with root package name */
        public int f1812d;

        /* renamed from: e, reason: collision with root package name */
        public int f1813e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f1814f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f1815g;

        /* renamed from: h, reason: collision with root package name */
        public q.a f1816h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f1817i;
        public c.d.a.a.d.f j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public float q;
        public float r;
        public float s;
        public byte[] t;
        public int u;
        public boolean v;
        public int w;
        public int x;
        public int y;
        public int z;

        private b() {
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = 0;
            this.p = -1;
            this.q = 0.0f;
            this.r = 0.0f;
            this.s = 0.0f;
            this.t = null;
            this.u = -1;
            this.v = false;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 1000;
            this.A = 200;
            this.B = -1.0f;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = 1;
            this.M = -1;
            this.N = 8000;
            this.O = 0L;
            this.P = 0L;
            this.S = true;
            this.T = "eng";
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:142:0x032c  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x032e  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0336  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0357  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x0434  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0160  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(c.d.a.a.e.i r27, int r28) throws c.d.a.a.x {
            /*
                Method dump skipped, instructions count: 1442
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.e.c.g.b.a(c.d.a.a.e.i, int):void");
        }

        public void a() {
            if (this.Q != null) {
                this.Q.a(this);
            }
        }

        public void b() {
            if (this.Q != null) {
                this.Q.a();
            }
        }

        private byte[] c() {
            if (this.B == -1.0f || this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.put((byte) 0);
            byteBufferWrap.putShort((short) ((this.B * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.C * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferWrap.putShort((short) (this.J + 0.5f));
            byteBufferWrap.putShort((short) (this.K + 0.5f));
            byteBufferWrap.putShort((short) this.z);
            byteBufferWrap.putShort((short) this.A);
            return bArr;
        }

        private static Pair<String, List<byte[]>> a(u uVar) throws x {
            try {
                uVar.d(16);
                long jO = uVar.o();
                if (jO == 1482049860) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jO == 826496599) {
                    byte[] bArr = uVar.f3567a;
                    for (int iD = uVar.d() + 20; iD < bArr.length - 4; iD++) {
                        if (bArr[iD] == 0 && bArr[iD + 1] == 0 && bArr[iD + 2] == 1 && bArr[iD + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, iD, bArr.length)));
                        }
                    }
                    throw new x("Failed to find FourCC VC1 initialization data");
                }
                c.d.a.a.m.o.c("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new x("Error parsing FourCC private data");
            }
        }

        private static List<byte[]> a(byte[] bArr) throws x {
            try {
                if (bArr[0] != 2) {
                    throw new x("Error parsing vorbis codec private");
                }
                int i2 = 1;
                int i3 = 0;
                while (bArr[i2] == -1) {
                    i3 += 255;
                    i2++;
                }
                int i4 = i2 + 1;
                int i5 = i3 + bArr[i2];
                int i6 = 0;
                while (bArr[i4] == -1) {
                    i6 += 255;
                    i4++;
                }
                int i7 = i4 + 1;
                int i8 = i6 + bArr[i4];
                if (bArr[i7] != 1) {
                    throw new x("Error parsing vorbis codec private");
                }
                byte[] bArr2 = new byte[i5];
                System.arraycopy(bArr, i7, bArr2, 0, i5);
                int i9 = i7 + i5;
                if (bArr[i9] != 3) {
                    throw new x("Error parsing vorbis codec private");
                }
                int i10 = i9 + i8;
                if (bArr[i10] != 5) {
                    throw new x("Error parsing vorbis codec private");
                }
                byte[] bArr3 = new byte[bArr.length - i10];
                System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new x("Error parsing vorbis codec private");
            }
        }

        private static boolean b(u uVar) throws x {
            try {
                int iJ = uVar.j();
                if (iJ == 1) {
                    return true;
                }
                if (iJ != 65534) {
                    return false;
                }
                uVar.c(24);
                if (uVar.r() == g.f1805g.getMostSignificantBits()) {
                    if (uVar.r() == g.f1805g.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new x("Error parsing MS/ACM codec private");
            }
        }
    }
}
