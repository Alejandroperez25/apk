package c.d.a.a.j.a;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import b.a.a$i;
import c.d.a.a.j.i;
import c.d.a.a.j.j;
import c.d.a.a.m.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f3084g = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f3085h = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f3086i = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] j = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, a$i.AppCompatTheme_textAppearanceSearchResultSubtitle, a$i.AppCompatTheme_textAppearanceSearchResultTitle, a$i.AppCompatTheme_textAppearanceSmallPopupMenu, a$i.AppCompatTheme_textColorAlertDialogListItem, a$i.AppCompatTheme_textColorSearchUrl, a$i.AppCompatTheme_toolbarNavigationButtonStyle, a$i.AppCompatTheme_toolbarStyle, a$i.AppCompatTheme_tooltipForegroundColor, a$i.AppCompatTheme_tooltipFrameBackground, a$i.AppCompatTheme_viewInflaterClass, a$i.AppCompatTheme_windowActionBar, a$i.AppCompatTheme_windowActionBarOverlay, a$i.AppCompatTheme_windowActionModeOverlay, a$i.AppCompatTheme_windowFixedHeightMajor, a$i.AppCompatTheme_windowFixedHeightMinor, a$i.AppCompatTheme_windowFixedWidthMajor, a$i.AppCompatTheme_windowFixedWidthMinor, a$i.AppCompatTheme_windowMinWidthMajor, a$i.AppCompatTheme_windowMinWidthMinor, a$i.AppCompatTheme_windowNoTitle, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] k = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] l = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] m = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private final int o;
    private final int p;
    private List<c.d.a.a.j.a> s;
    private List<c.d.a.a.j.a> t;
    private int u;
    private int v;
    private boolean w;
    private byte x;
    private byte y;
    private final u n = new u();
    private final ArrayList<C0036a> q = new ArrayList<>();
    private C0036a r = new C0036a(0, 4);

    private static boolean c(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 32;
    }

    private static boolean d(byte b2, byte b3) {
        return (b2 & 240) == 16 && (b3 & 192) == 64;
    }

    private static boolean e(byte b2, byte b3) {
        return (b2 & 247) == 23 && b3 >= 33 && b3 <= 35;
    }

    private static boolean f(byte b2, byte b3) {
        return (b2 & 247) == 20 && (b3 & 240) == 32;
    }

    private static boolean g(byte b2) {
        return (b2 & 240) == 16;
    }

    @Override // c.d.a.a.j.a.f, c.d.a.a.c.d
    public void a() {
    }

    @Override // c.d.a.a.j.a.f, c.d.a.a.j.e
    public /* bridge */ /* synthetic */ void a(long j2) {
        super.a(j2);
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

    public a(String str, int i2) {
        this.o = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        switch (i2) {
            case 3:
            case 4:
                this.p = 2;
                break;
            default:
                this.p = 1;
                break;
        }
        a(0);
        j();
    }

    @Override // c.d.a.a.j.a.f, c.d.a.a.c.d
    public void flush() {
        super.flush();
        this.s = null;
        this.t = null;
        a(0);
        b(4);
        j();
        this.w = false;
        this.x = (byte) 0;
        this.y = (byte) 0;
    }

    @Override // c.d.a.a.j.a.f
    protected boolean f() {
        return this.s != this.t;
    }

    @Override // c.d.a.a.j.a.f
    protected c.d.a.a.j.d g() {
        this.t = this.s;
        return new g(this.s);
    }

    @Override // c.d.a.a.j.a.f
    protected void b(i iVar) {
        this.n.a(iVar.f1684c.array(), iVar.f1684c.limit());
        boolean z = false;
        boolean zA = false;
        while (this.n.b() >= this.o) {
            byte bH = this.o == 2 ? (byte) -4 : (byte) this.n.h();
            byte bH2 = (byte) (this.n.h() & 127);
            byte bH3 = (byte) (this.n.h() & 127);
            if ((bH & 6) == 4 && (this.p != 1 || (bH & 1) == 0)) {
                if (this.p != 2 || (bH & 1) == 1) {
                    if (bH2 != 0 || bH3 != 0) {
                        if ((bH2 & 247) == 17 && (bH3 & 240) == 48) {
                            this.r.a(d(bH3));
                        } else if ((bH2 & 246) == 18 && (bH3 & 224) == 32) {
                            this.r.b();
                            if ((bH2 & 1) == 0) {
                                this.r.a(e(bH3));
                            } else {
                                this.r.a(f(bH3));
                            }
                        } else if ((bH2 & 224) == 0) {
                            zA = a(bH2, bH3);
                        } else {
                            this.r.a(c(bH2));
                            if ((bH3 & 224) != 0) {
                                this.r.a(c(bH3));
                            }
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            if (!zA) {
                this.w = false;
            }
            if (this.u == 1 || this.u == 3) {
                this.s = i();
            }
        }
    }

    private boolean a(byte b2, byte b3) {
        boolean zG = g(b2);
        if (zG) {
            if (this.w && this.x == b2 && this.y == b3) {
                this.w = false;
                return true;
            }
            this.w = true;
            this.x = b2;
            this.y = b3;
        }
        if (c(b2, b3)) {
            a(b3);
        } else if (d(b2, b3)) {
            b(b2, b3);
        } else if (e(b2, b3)) {
            this.r.e(b3 - 32);
        } else if (f(b2, b3)) {
            b(b3);
        }
        return zG;
    }

    private void a(byte b2) {
        this.r.a(' ');
        this.r.a((b2 >> 1) & 7, (b2 & 1) == 1);
    }

    private void b(byte b2, byte b3) {
        int i2 = f3084g[b2 & 7];
        if ((b3 & 32) != 0) {
            i2++;
        }
        if (i2 != this.r.c()) {
            if (this.u != 1 && !this.r.a()) {
                this.r = new C0036a(this.u, this.v);
                this.q.add(this.r);
            }
            this.r.c(i2);
        }
        boolean z = (b3 & 16) == 16;
        boolean z2 = (b3 & 1) == 1;
        int i3 = (b3 >> 1) & 7;
        this.r.a(z ? 8 : i3, z2);
        if (z) {
            this.r.d(f3085h[i3]);
        }
    }

    private void b(byte b2) {
        if (b2 == 32) {
            a(2);
            return;
        }
        if (b2 != 41) {
            switch (b2) {
                case a$i.AppCompatTheme_autoCompleteTextViewStyle /* 37 */:
                    a(1);
                    b(2);
                    break;
                case a$i.AppCompatTheme_borderlessButtonStyle /* 38 */:
                    a(1);
                    b(3);
                    break;
                case a$i.AppCompatTheme_buttonBarButtonStyle /* 39 */:
                    a(1);
                    b(4);
                    break;
                default:
                    if (this.u != 0) {
                        if (b2 == 33) {
                            this.r.b();
                            break;
                        } else if (b2 != 36) {
                            switch (b2) {
                                case a$i.AppCompatTheme_buttonStyle /* 44 */:
                                    this.s = Collections.emptyList();
                                    if (this.u == 1 || this.u == 3) {
                                        j();
                                        break;
                                    }
                                    break;
                                case a$i.AppCompatTheme_buttonStyleSmall /* 45 */:
                                    if (this.u == 1 && !this.r.a()) {
                                        this.r.d();
                                        break;
                                    }
                                    break;
                                case a$i.AppCompatTheme_checkboxStyle /* 46 */:
                                    j();
                                    break;
                                case a$i.AppCompatTheme_checkedTextViewStyle /* 47 */:
                                    this.s = i();
                                    j();
                                    break;
                            }
                        }
                    }
                    break;
            }
            return;
        }
        a(3);
    }

    private List<c.d.a.a.j.a> i() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            c.d.a.a.j.a aVarF = this.q.get(i2).f();
            if (aVarF != null) {
                arrayList.add(aVarF);
            }
        }
        return arrayList;
    }

    private void a(int i2) {
        if (this.u == i2) {
            return;
        }
        int i3 = this.u;
        this.u = i2;
        j();
        if (i3 == 3 || i2 == 1 || i2 == 0) {
            this.s = Collections.emptyList();
        }
    }

    private void b(int i2) {
        this.v = i2;
        this.r.b(i2);
    }

    private void j() {
        this.r.a(this.u);
        this.q.clear();
        this.q.add(this.r);
    }

    private static char c(byte b2) {
        return (char) j[(b2 & 127) - 32];
    }

    private static char d(byte b2) {
        return (char) k[b2 & 15];
    }

    private static char e(byte b2) {
        return (char) l[b2 & 31];
    }

    private static char f(byte b2) {
        return (char) m[b2 & 31];
    }

    /* renamed from: c.d.a.a.j.a.a$a, reason: collision with other inner class name */
    private static class C0036a {

        /* renamed from: a, reason: collision with root package name */
        private final List<C0037a> f3087a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f3088b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final StringBuilder f3089c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        private int f3090d;

        /* renamed from: e, reason: collision with root package name */
        private int f3091e;

        /* renamed from: f, reason: collision with root package name */
        private int f3092f;

        /* renamed from: g, reason: collision with root package name */
        private int f3093g;

        /* renamed from: h, reason: collision with root package name */
        private int f3094h;

        public C0036a(int i2, int i3) {
            a(i2);
            b(i3);
        }

        public void a(int i2) {
            this.f3093g = i2;
            this.f3087a.clear();
            this.f3088b.clear();
            this.f3089c.setLength(0);
            this.f3090d = 15;
            this.f3091e = 0;
            this.f3092f = 0;
        }

        public void b(int i2) {
            this.f3094h = i2;
        }

        public boolean a() {
            return this.f3087a.isEmpty() && this.f3088b.isEmpty() && this.f3089c.length() == 0;
        }

        public void b() {
            int length = this.f3089c.length();
            if (length > 0) {
                this.f3089c.delete(length - 1, length);
                for (int size = this.f3087a.size() - 1; size >= 0; size--) {
                    if (this.f3087a.get(size).f3097c != length) {
                        return;
                    }
                    r2.f3097c--;
                }
            }
        }

        public int c() {
            return this.f3090d;
        }

        public void c(int i2) {
            this.f3090d = i2;
        }

        public void d() {
            this.f3088b.add(e());
            this.f3089c.setLength(0);
            this.f3087a.clear();
            int iMin = Math.min(this.f3094h, this.f3090d);
            while (this.f3088b.size() >= iMin) {
                this.f3088b.remove(0);
            }
        }

        public void d(int i2) {
            this.f3091e = i2;
        }

        public void e(int i2) {
            this.f3092f = i2;
        }

        public void a(int i2, boolean z) {
            this.f3087a.add(new C0037a(i2, z, this.f3089c.length()));
        }

        public void a(char c2) {
            this.f3089c.append(c2);
        }

        public SpannableString e() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f3089c);
            int length = spannableStringBuilder.length();
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = -1;
            int i7 = -1;
            boolean z = false;
            while (i2 < this.f3087a.size()) {
                C0037a c0037a = this.f3087a.get(i2);
                boolean z2 = c0037a.f3096b;
                int i8 = c0037a.f3095a;
                if (i8 != 8) {
                    boolean z3 = i8 == 7;
                    if (i8 != 7) {
                        i7 = a.f3086i[i8];
                    }
                    z = z3;
                }
                int i9 = c0037a.f3097c;
                i2++;
                if (i9 != (i2 < this.f3087a.size() ? this.f3087a.get(i2).f3097c : length)) {
                    if (i3 != -1 && !z2) {
                        a(spannableStringBuilder, i3, i9);
                        i3 = -1;
                    } else if (i3 == -1 && z2) {
                        i3 = i9;
                    }
                    if (i4 != -1 && !z) {
                        b(spannableStringBuilder, i4, i9);
                        i4 = -1;
                    } else if (i4 == -1 && z) {
                        i4 = i9;
                    }
                    if (i7 != i6) {
                        a(spannableStringBuilder, i5, i9, i6);
                        i6 = i7;
                        i5 = i9;
                    }
                }
            }
            if (i3 != -1 && i3 != length) {
                a(spannableStringBuilder, i3, length);
            }
            if (i4 != -1 && i4 != length) {
                b(spannableStringBuilder, i4, length);
            }
            if (i5 != length) {
                a(spannableStringBuilder, i5, length, i6);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public c.d.a.a.j.a f() {
            float f2;
            int i2;
            int i3;
            int i4;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i5 = 0; i5 < this.f3088b.size(); i5++) {
                spannableStringBuilder.append((CharSequence) this.f3088b.get(i5));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) e());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i6 = this.f3091e + this.f3092f;
            int length = (32 - i6) - spannableStringBuilder.length();
            int i7 = i6 - length;
            if (this.f3093g == 2 && (Math.abs(i7) < 3 || length < 0)) {
                f2 = 0.5f;
                i2 = 1;
            } else if (this.f3093g != 2 || i7 <= 0) {
                f2 = ((i6 / 32.0f) * 0.8f) + 0.1f;
                i2 = 0;
            } else {
                f2 = (((32 - length) / 32.0f) * 0.8f) + 0.1f;
                i2 = 2;
            }
            if (this.f3093g == 1 || this.f3090d > 7) {
                i3 = (this.f3090d - 15) - 2;
                i4 = 2;
            } else {
                i3 = this.f3090d;
                i4 = 0;
            }
            return new c.d.a.a.j.a(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i3, 1, i4, f2, i2, Float.MIN_VALUE);
        }

        public String toString() {
            return this.f3089c.toString();
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }

        private static void b(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, i3, 33);
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4) {
            if (i4 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i2, i3, 33);
        }

        /* renamed from: c.d.a.a.j.a.a$a$a, reason: collision with other inner class name */
        private static class C0037a {

            /* renamed from: a, reason: collision with root package name */
            public final int f3095a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f3096b;

            /* renamed from: c, reason: collision with root package name */
            public int f3097c;

            public C0037a(int i2, boolean z, int i3) {
                this.f3095a = i2;
                this.f3096b = z;
                this.f3097c = i3;
            }
        }
    }
}
