package c.d.a.a.j.a;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import b.a.a$i;
import c.d.a.a.j.i;
import c.d.a.a.j.j;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.o;
import c.d.a.a.m.t;
import c.d.a.a.m.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: g, reason: collision with root package name */
    private final u f3098g = new u();

    /* renamed from: h, reason: collision with root package name */
    private final t f3099h = new t();

    /* renamed from: i, reason: collision with root package name */
    private final int f3100i;
    private final a[] j;
    private a k;
    private List<c.d.a.a.j.a> l;
    private List<c.d.a.a.j.a> m;
    private b n;
    private int o;

    @Override // c.d.a.a.j.a.f, c.d.a.a.c.d
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // c.d.a.a.j.a.f, c.d.a.a.j.e
    public /* bridge */ /* synthetic */ void a(long j) {
        super.a(j);
    }

    @Override // c.d.a.a.j.a.f
    public /* bridge */ /* synthetic */ void a(i iVar) {
        super.a(iVar);
    }

    @Override // c.d.a.a.j.a.f
    /* renamed from: d */
    public /* bridge */ /* synthetic */ i c() {
        return super.c();
    }

    @Override // c.d.a.a.j.a.f
    /* renamed from: e */
    public /* bridge */ /* synthetic */ j b() {
        return super.b();
    }

    public c(int i2, List<byte[]> list) {
        this.f3100i = i2 == -1 ? 1 : i2;
        this.j = new a[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.j[i3] = new a();
        }
        this.k = this.j[0];
        o();
    }

    @Override // c.d.a.a.j.a.f, c.d.a.a.c.d
    public void flush() {
        super.flush();
        this.l = null;
        this.m = null;
        this.o = 0;
        this.k = this.j[this.o];
        o();
        this.n = null;
    }

    @Override // c.d.a.a.j.a.f
    protected boolean f() {
        return this.l != this.m;
    }

    @Override // c.d.a.a.j.a.f
    protected c.d.a.a.j.d g() {
        this.m = this.l;
        return new g(this.l);
    }

    @Override // c.d.a.a.j.a.f
    protected void b(i iVar) {
        this.f3098g.a(iVar.f1684c.array(), iVar.f1684c.limit());
        while (this.f3098g.b() >= 3) {
            int iH = this.f3098g.h() & 7;
            int i2 = iH & 3;
            boolean z = (iH & 4) == 4;
            byte bH = (byte) this.f3098g.h();
            byte bH2 = (byte) this.f3098g.h();
            if (i2 == 2 || i2 == 3) {
                if (z) {
                    if (i2 == 3) {
                        h();
                        int i3 = (bH & 192) >> 6;
                        int i4 = bH & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        this.n = new b(i3, i4);
                        byte[] bArr = this.n.f3112c;
                        b bVar = this.n;
                        int i5 = bVar.f3113d;
                        bVar.f3113d = i5 + 1;
                        bArr[i5] = bH2;
                    } else {
                        AbstractC0170e.a(i2 == 2);
                        if (this.n == null) {
                            o.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = this.n.f3112c;
                            b bVar2 = this.n;
                            int i6 = bVar2.f3113d;
                            bVar2.f3113d = i6 + 1;
                            bArr2[i6] = bH;
                            byte[] bArr3 = this.n.f3112c;
                            b bVar3 = this.n;
                            int i7 = bVar3.f3113d;
                            bVar3.f3113d = i7 + 1;
                            bArr3[i7] = bH2;
                        }
                    }
                    if (this.n.f3113d == (this.n.f3111b * 2) - 1) {
                        h();
                    }
                }
            }
        }
    }

    private void h() {
        if (this.n == null) {
            return;
        }
        i();
        this.n = null;
    }

    private void i() {
        if (this.n.f3113d != (this.n.f3111b * 2) - 1) {
            o.c("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.n.f3111b * 2) - 1) + ", but current index is " + this.n.f3113d + " (sequence number " + this.n.f3110a + "); ignoring packet");
            return;
        }
        this.f3099h.a(this.n.f3112c, this.n.f3113d);
        int iC = this.f3099h.c(3);
        int iC2 = this.f3099h.c(5);
        if (iC == 7) {
            this.f3099h.b(2);
            iC = this.f3099h.c(6);
            if (iC < 7) {
                o.c("Cea708Decoder", "Invalid extended service number: " + iC);
            }
        }
        if (iC2 == 0) {
            if (iC != 0) {
                o.c("Cea708Decoder", "serviceNumber is non-zero (" + iC + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (iC != this.f3100i) {
            return;
        }
        boolean z = false;
        while (this.f3099h.a() > 0) {
            int iC3 = this.f3099h.c(8);
            if (iC3 == 16) {
                int iC4 = this.f3099h.c(8);
                if (iC4 <= 31) {
                    c(iC4);
                } else {
                    if (iC4 <= 127) {
                        g(iC4);
                    } else if (iC4 <= 159) {
                        d(iC4);
                    } else if (iC4 <= 255) {
                        h(iC4);
                    } else {
                        o.c("Cea708Decoder", "Invalid extended command: " + iC4);
                    }
                    z = true;
                }
            } else if (iC3 <= 31) {
                a(iC3);
            } else {
                if (iC3 <= 127) {
                    e(iC3);
                } else if (iC3 <= 159) {
                    b(iC3);
                } else if (iC3 <= 255) {
                    f(iC3);
                } else {
                    o.c("Cea708Decoder", "Invalid base command: " + iC3);
                }
                z = true;
            }
        }
        if (z) {
            this.l = n();
        }
    }

    private void a(int i2) {
        if (i2 != 0) {
            if (i2 == 3) {
                this.l = n();
            }
            if (i2 == 8) {
                this.k.f();
                return;
            }
            switch (i2) {
                case 12:
                    o();
                    break;
                case 13:
                    this.k.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i2 >= 17 && i2 <= 23) {
                        o.c("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i2);
                        this.f3099h.b(8);
                        break;
                    } else if (i2 >= 24 && i2 <= 31) {
                        o.c("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i2);
                        this.f3099h.b(16);
                        break;
                    } else {
                        o.c("Cea708Decoder", "Invalid C0 command: " + i2);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b(int i2) {
        int i3 = 1;
        switch (i2) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i4 = i2 - 128;
                if (this.o != i4) {
                    this.o = i4;
                    this.k = this.j[i4];
                    break;
                }
                break;
            case 136:
                while (i3 <= 8) {
                    if (this.f3099h.e()) {
                        this.j[8 - i3].c();
                    }
                    i3++;
                }
                break;
            case 137:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f3099h.e()) {
                        this.j[8 - i5].a(true);
                    }
                }
                break;
            case 138:
                while (i3 <= 8) {
                    if (this.f3099h.e()) {
                        this.j[8 - i3].a(false);
                    }
                    i3++;
                }
                break;
            case 139:
                for (int i6 = 1; i6 <= 8; i6++) {
                    if (this.f3099h.e()) {
                        this.j[8 - i6].a(!r0.e());
                    }
                }
                break;
            case 140:
                while (i3 <= 8) {
                    if (this.f3099h.e()) {
                        this.j[8 - i3].b();
                    }
                    i3++;
                }
                break;
            case 141:
                this.f3099h.b(8);
                break;
            case 142:
                break;
            case 143:
                o();
                break;
            case 144:
                if (!this.k.d()) {
                    this.f3099h.b(16);
                    break;
                } else {
                    j();
                    break;
                }
            case 145:
                if (!this.k.d()) {
                    this.f3099h.b(24);
                    break;
                } else {
                    k();
                    break;
                }
            case 146:
                if (!this.k.d()) {
                    this.f3099h.b(16);
                    break;
                } else {
                    l();
                    break;
                }
            default:
                switch (i2) {
                    case 151:
                        if (!this.k.d()) {
                            this.f3099h.b(32);
                            break;
                        } else {
                            m();
                            break;
                        }
                    case 152:
                    case 153:
                    case 154:
                    case 155:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                        int i7 = i2 - 152;
                        i(i7);
                        if (this.o != i7) {
                            this.o = i7;
                            this.k = this.j[i7];
                            break;
                        }
                        break;
                    default:
                        o.c("Cea708Decoder", "Invalid C1 command: " + i2);
                        break;
                }
        }
    }

    private void c(int i2) {
        if (i2 <= 7) {
            return;
        }
        if (i2 <= 15) {
            this.f3099h.b(8);
        } else if (i2 <= 23) {
            this.f3099h.b(16);
        } else if (i2 <= 31) {
            this.f3099h.b(24);
        }
    }

    private void d(int i2) {
        if (i2 <= 135) {
            this.f3099h.b(32);
            return;
        }
        if (i2 <= 143) {
            this.f3099h.b(40);
        } else if (i2 <= 159) {
            this.f3099h.b(2);
            this.f3099h.b(this.f3099h.c(6) * 8);
        }
    }

    private void e(int i2) {
        if (i2 == 127) {
            this.k.a((char) 9835);
        } else {
            this.k.a((char) (i2 & 255));
        }
    }

    private void f(int i2) {
        this.k.a((char) (i2 & 255));
    }

    private void g(int i2) {
        if (i2 == 37) {
            this.k.a((char) 8230);
            return;
        }
        if (i2 == 42) {
            this.k.a((char) 352);
            return;
        }
        if (i2 == 44) {
            this.k.a((char) 338);
            return;
        }
        if (i2 != 63) {
            switch (i2) {
                case a$i.AppCompatTheme_activityChooserViewStyle /* 32 */:
                    this.k.a(' ');
                    break;
                case a$i.AppCompatTheme_alertDialogButtonGroupStyle /* 33 */:
                    this.k.a((char) 160);
                    break;
                default:
                    switch (i2) {
                        case a$i.AppCompatTheme_colorAccent /* 48 */:
                            this.k.a((char) 9608);
                            break;
                        case a$i.AppCompatTheme_colorBackgroundFloating /* 49 */:
                            this.k.a((char) 8216);
                            break;
                        case a$i.AppCompatTheme_colorButtonNormal /* 50 */:
                            this.k.a((char) 8217);
                            break;
                        case a$i.AppCompatTheme_colorControlActivated /* 51 */:
                            this.k.a((char) 8220);
                            break;
                        case a$i.AppCompatTheme_colorControlHighlight /* 52 */:
                            this.k.a((char) 8221);
                            break;
                        case a$i.AppCompatTheme_colorControlNormal /* 53 */:
                            this.k.a((char) 8226);
                            break;
                        default:
                            switch (i2) {
                                case a$i.AppCompatTheme_colorSwitchThumbNormal /* 57 */:
                                    this.k.a((char) 8482);
                                    break;
                                case a$i.AppCompatTheme_controlBackground /* 58 */:
                                    this.k.a((char) 353);
                                    break;
                                default:
                                    switch (i2) {
                                        case a$i.AppCompatTheme_dialogPreferredPadding /* 60 */:
                                            this.k.a((char) 339);
                                            break;
                                        case a$i.AppCompatTheme_dialogTheme /* 61 */:
                                            this.k.a((char) 8480);
                                            break;
                                        default:
                                            switch (i2) {
                                                case a$i.AppCompatTheme_windowMinWidthMajor /* 118 */:
                                                    this.k.a((char) 8539);
                                                    break;
                                                case a$i.AppCompatTheme_windowMinWidthMinor /* 119 */:
                                                    this.k.a((char) 8540);
                                                    break;
                                                case a$i.AppCompatTheme_windowNoTitle /* 120 */:
                                                    this.k.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.k.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.k.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.k.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.k.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.k.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.k.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.k.a((char) 9484);
                                                    break;
                                                default:
                                                    o.c("Cea708Decoder", "Invalid G2 character: " + i2);
                                                    break;
                                            }
                                    }
                            }
                    }
            }
            return;
        }
        this.k.a((char) 376);
    }

    private void h(int i2) {
        if (i2 == 160) {
            this.k.a((char) 13252);
            return;
        }
        o.c("Cea708Decoder", "Invalid G3 character: " + i2);
        this.k.a('_');
    }

    private void j() {
        this.k.a(this.f3099h.c(4), this.f3099h.c(2), this.f3099h.c(2), this.f3099h.e(), this.f3099h.e(), this.f3099h.c(3), this.f3099h.c(3));
    }

    private void k() {
        int iA = a.a(this.f3099h.c(2), this.f3099h.c(2), this.f3099h.c(2), this.f3099h.c(2));
        int iA2 = a.a(this.f3099h.c(2), this.f3099h.c(2), this.f3099h.c(2), this.f3099h.c(2));
        this.f3099h.b(2);
        this.k.b(iA, iA2, a.a(this.f3099h.c(2), this.f3099h.c(2), this.f3099h.c(2)));
    }

    private void l() {
        this.f3099h.b(4);
        int iC = this.f3099h.c(4);
        this.f3099h.b(2);
        this.k.a(iC, this.f3099h.c(6));
    }

    private void m() {
        int iA = a.a(this.f3099h.c(2), this.f3099h.c(2), this.f3099h.c(2), this.f3099h.c(2));
        int iC = this.f3099h.c(2);
        int iA2 = a.a(this.f3099h.c(2), this.f3099h.c(2), this.f3099h.c(2));
        if (this.f3099h.e()) {
            iC |= 4;
        }
        boolean zE = this.f3099h.e();
        int iC2 = this.f3099h.c(2);
        int iC3 = this.f3099h.c(2);
        int iC4 = this.f3099h.c(2);
        this.f3099h.b(8);
        this.k.a(iA, iA2, zE, iC, iC2, iC3, iC4);
    }

    private void i(int i2) {
        a aVar = this.j[i2];
        this.f3099h.b(2);
        boolean zE = this.f3099h.e();
        boolean zE2 = this.f3099h.e();
        boolean zE3 = this.f3099h.e();
        int iC = this.f3099h.c(3);
        boolean zE4 = this.f3099h.e();
        int iC2 = this.f3099h.c(7);
        int iC3 = this.f3099h.c(8);
        int iC4 = this.f3099h.c(4);
        int iC5 = this.f3099h.c(4);
        this.f3099h.b(2);
        int iC6 = this.f3099h.c(6);
        this.f3099h.b(2);
        aVar.a(zE, zE2, zE3, iC, zE4, iC2, iC3, iC5, iC6, iC4, this.f3099h.c(3), this.f3099h.c(3));
    }

    private List<c.d.a.a.j.a> n() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            if (!this.j[i2].a() && this.j[i2].e()) {
                arrayList.add(this.j[i2].h());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    private void o() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.j[i2].b();
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f3110a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3111b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f3112c;

        /* renamed from: d, reason: collision with root package name */
        int f3113d = 0;

        public b(int i2, int i3) {
            this.f3110a = i2;
            this.f3111b = i3;
            this.f3112c = new byte[(i3 * 2) - 1];
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f3101a = a(2, 2, 2, 0);

        /* renamed from: b, reason: collision with root package name */
        public static final int f3102b = a(0, 0, 0, 0);

        /* renamed from: c, reason: collision with root package name */
        public static final int f3103c = a(0, 0, 0, 3);

        /* renamed from: d, reason: collision with root package name */
        private static final int[] f3104d = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: e, reason: collision with root package name */
        private static final int[] f3105e = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: f, reason: collision with root package name */
        private static final int[] f3106f = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: g, reason: collision with root package name */
        private static final boolean[] f3107g = {false, false, false, true, true, true, false};

        /* renamed from: h, reason: collision with root package name */
        private static final int[] f3108h = {f3102b, f3103c, f3102b, f3102b, f3103c, f3102b, f3102b};

        /* renamed from: i, reason: collision with root package name */
        private static final int[] f3109i = {0, 1, 2, 3, 4, 3, 4};
        private static final int[] j = {0, 0, 0, 0, 0, 3, 3};
        private static final int[] k = {f3102b, f3102b, f3102b, f3102b, f3102b, f3103c, f3103c};
        private int A;
        private int B;
        private int C;
        private int D;
        private int E;
        private int F;
        private int G;
        private final List<SpannableString> l = new ArrayList();
        private final SpannableStringBuilder m = new SpannableStringBuilder();
        private boolean n;
        private boolean o;
        private int p;
        private boolean q;
        private int r;
        private int s;
        private int t;
        private int u;
        private boolean v;
        private int w;
        private int x;
        private int y;
        private int z;

        public a() {
            b();
        }

        public boolean a() {
            return !d() || (this.l.isEmpty() && this.m.length() == 0);
        }

        public void b() {
            c();
            this.n = false;
            this.o = false;
            this.p = 4;
            this.q = false;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 15;
            this.v = true;
            this.w = 0;
            this.x = 0;
            this.y = 0;
            this.z = f3102b;
            this.D = f3101a;
            this.F = f3102b;
        }

        public void c() {
            this.l.clear();
            this.m.clear();
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.E = -1;
            this.G = 0;
        }

        public boolean d() {
            return this.n;
        }

        public void a(boolean z) {
            this.o = z;
        }

        public boolean e() {
            return this.o;
        }

        public void a(boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.n = true;
            this.o = z;
            this.v = z2;
            this.p = i2;
            this.q = z4;
            this.r = i3;
            this.s = i4;
            this.t = i7;
            int i10 = i5 + 1;
            if (this.u != i10) {
                this.u = i10;
                while (true) {
                    if ((!z2 || this.l.size() < this.u) && this.l.size() < 15) {
                        break;
                    } else {
                        this.l.remove(0);
                    }
                }
            }
            if (i8 != 0 && this.x != i8) {
                this.x = i8;
                int i11 = i8 - 1;
                a(f3108h[i11], f3103c, f3107g[i11], 0, f3105e[i11], f3106f[i11], f3104d[i11]);
            }
            if (i9 == 0 || this.y == i9) {
                return;
            }
            this.y = i9;
            int i12 = i9 - 1;
            a(0, 1, 1, false, false, j[i12], f3109i[i12]);
            b(f3101a, k[i12], f3102b);
        }

        public void a(int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
            this.z = i2;
            this.w = i7;
        }

        public void a(int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6) {
            if (this.A != -1) {
                if (!z) {
                    this.m.setSpan(new StyleSpan(2), this.A, this.m.length(), 33);
                    this.A = -1;
                }
            } else if (z) {
                this.A = this.m.length();
            }
            if (this.B == -1) {
                if (z2) {
                    this.B = this.m.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.m.setSpan(new UnderlineSpan(), this.B, this.m.length(), 33);
                this.B = -1;
            }
        }

        public void b(int i2, int i3, int i4) {
            if (this.C != -1 && this.D != i2) {
                this.m.setSpan(new ForegroundColorSpan(this.D), this.C, this.m.length(), 33);
            }
            if (i2 != f3101a) {
                this.C = this.m.length();
                this.D = i2;
            }
            if (this.E != -1 && this.F != i3) {
                this.m.setSpan(new BackgroundColorSpan(this.F), this.E, this.m.length(), 33);
            }
            if (i3 != f3102b) {
                this.E = this.m.length();
                this.F = i3;
            }
        }

        public void a(int i2, int i3) {
            if (this.G != i2) {
                a('\n');
            }
            this.G = i2;
        }

        public void f() {
            int length = this.m.length();
            if (length > 0) {
                this.m.delete(length - 1, length);
            }
        }

        public void a(char c2) {
            if (c2 == '\n') {
                this.l.add(g());
                this.m.clear();
                if (this.A != -1) {
                    this.A = 0;
                }
                if (this.B != -1) {
                    this.B = 0;
                }
                if (this.C != -1) {
                    this.C = 0;
                }
                if (this.E != -1) {
                    this.E = 0;
                }
                while (true) {
                    if ((!this.v || this.l.size() < this.u) && this.l.size() < 15) {
                        return;
                    } else {
                        this.l.remove(0);
                    }
                }
            } else {
                this.m.append(c2);
            }
        }

        public SpannableString g() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.A, length, 33);
                }
                if (this.B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.B, length, 33);
                }
                if (this.C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.D), this.C, length, 33);
                }
                if (this.E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.F), this.E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public c.d.a.a.j.a.b h() {
            Layout.Alignment alignment;
            float f2;
            float f3;
            int i2;
            int i3;
            if (a()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.l.size(); i4++) {
                spannableStringBuilder.append((CharSequence) this.l.get(i4));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) g());
            switch (this.w) {
                case 0:
                case 3:
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                case 1:
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                case 2:
                    alignment = Layout.Alignment.ALIGN_CENTER;
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected justification value: " + this.w);
            }
            Layout.Alignment alignment2 = alignment;
            if (this.q) {
                f2 = this.s / 99.0f;
                f3 = this.r / 99.0f;
            } else {
                f2 = this.s / 209.0f;
                f3 = this.r / 74.0f;
            }
            float f4 = (f2 * 0.9f) + 0.05f;
            float f5 = (f3 * 0.9f) + 0.05f;
            if (this.t % 3 == 0) {
                i2 = 0;
            } else {
                i2 = this.t % 3 == 1 ? 1 : 2;
            }
            if (this.t / 3 == 0) {
                i3 = 0;
            } else {
                i3 = this.t / 3 == 1 ? 1 : 2;
            }
            return new c.d.a.a.j.a.b(spannableStringBuilder, alignment2, f5, 0, i2, f4, i3, Float.MIN_VALUE, this.z != f3102b, this.z, this.p);
        }

        public static int a(int i2, int i3, int i4) {
            return a(i2, i3, i4, 0);
        }

        public static int a(int i2, int i3, int i4, int i5) {
            int i6;
            AbstractC0170e.a(i2, 0, 4);
            AbstractC0170e.a(i3, 0, 4);
            AbstractC0170e.a(i4, 0, 4);
            AbstractC0170e.a(i5, 0, 4);
            switch (i5) {
                case 0:
                case 1:
                default:
                    i6 = 255;
                    break;
                case 2:
                    i6 = 127;
                    break;
                case 3:
                    i6 = 0;
                    break;
            }
            return Color.argb(i6, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0, i4 <= 1 ? 0 : 255);
        }
    }
}
