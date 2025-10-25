package c.d.c.d;

import b.a.a$i;
import c.d.c.b.u;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes.dex */
public class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f4273a = ")]}'\n".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private final Reader f4274b;
    private long j;
    private int k;
    private String l;
    private int n;
    private String[] o;
    private int[] p;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4275c = false;

    /* renamed from: d, reason: collision with root package name */
    private final char[] f4276d = new char[1024];

    /* renamed from: e, reason: collision with root package name */
    private int f4277e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f4278f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f4279g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f4280h = 0;

    /* renamed from: i, reason: collision with root package name */
    int f4281i = 0;
    private int[] m = new int[32];

    static {
        u.f4244a = new a();
    }

    public b(Reader reader) {
        this.n = 0;
        int[] iArr = this.m;
        int i2 = this.n;
        this.n = i2 + 1;
        iArr[i2] = 6;
        this.o = new String[32];
        this.p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f4274b = reader;
    }

    public final void a(boolean z) {
        this.f4275c = z;
    }

    public final boolean a() {
        return this.f4275c;
    }

    public void b() {
        int iH = this.f4281i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 3) {
            a(1);
            this.p[this.n - 1] = 0;
            this.f4281i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + g() + q());
        }
    }

    public void c() {
        int iH = this.f4281i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 4) {
            this.n--;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f4281i = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + g() + q());
    }

    public void d() {
        int iH = this.f4281i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 1) {
            a(3);
            this.f4281i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + g() + q());
        }
    }

    public void e() {
        int iH = this.f4281i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 2) {
            this.n--;
            this.o[this.n] = null;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f4281i = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + g() + q());
    }

    public boolean f() {
        int iH = this.f4281i;
        if (iH == 0) {
            iH = h();
        }
        return (iH == 2 || iH == 4) ? false : true;
    }

    public c g() {
        int iH = this.f4281i;
        if (iH == 0) {
            iH = h();
        }
        switch (iH) {
            case 1:
                return c.BEGIN_OBJECT;
            case 2:
                return c.END_OBJECT;
            case 3:
                return c.BEGIN_ARRAY;
            case 4:
                return c.END_ARRAY;
            case 5:
            case 6:
                return c.BOOLEAN;
            case 7:
                return c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.STRING;
            case 12:
            case 13:
            case 14:
                return c.NAME;
            case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
            case 16:
                return c.NUMBER;
            case a$i.AppCompatTheme_actionModeBackground /* 17 */:
                return c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    int h() {
        int iB;
        int i2 = this.m[this.n - 1];
        if (i2 == 1) {
            this.m[this.n - 1] = 2;
        } else if (i2 == 2) {
            int iB2 = b(true);
            if (iB2 != 44) {
                if (iB2 != 59) {
                    if (iB2 == 93) {
                        this.f4281i = 4;
                        return 4;
                    }
                    b("Unterminated array");
                    throw null;
                }
                w();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                this.m[this.n - 1] = 4;
                if (i2 == 5 && (iB = b(true)) != 44) {
                    if (iB != 59) {
                        if (iB == 125) {
                            this.f4281i = 2;
                            return 2;
                        }
                        b("Unterminated object");
                        throw null;
                    }
                    w();
                }
                int iB3 = b(true);
                if (iB3 == 34) {
                    this.f4281i = 13;
                    return 13;
                }
                if (iB3 == 39) {
                    w();
                    this.f4281i = 12;
                    return 12;
                }
                if (iB3 == 125) {
                    if (i2 != 5) {
                        this.f4281i = 2;
                        return 2;
                    }
                    b("Expected name");
                    throw null;
                }
                w();
                this.f4277e--;
                if (a((char) iB3)) {
                    this.f4281i = 14;
                    return 14;
                }
                b("Expected name");
                throw null;
            }
            if (i2 == 4) {
                this.m[this.n - 1] = 5;
                int iB4 = b(true);
                if (iB4 != 58) {
                    if (iB4 == 61) {
                        w();
                        if ((this.f4277e < this.f4278f || b(1)) && this.f4276d[this.f4277e] == '>') {
                            this.f4277e++;
                        }
                    } else {
                        b("Expected ':'");
                        throw null;
                    }
                }
            } else if (i2 == 6) {
                if (this.f4275c) {
                    z();
                }
                this.m[this.n - 1] = 7;
            } else if (i2 == 7) {
                if (b(false) == -1) {
                    this.f4281i = 17;
                    return 17;
                }
                w();
                this.f4277e--;
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iB5 = b(true);
        if (iB5 == 34) {
            this.f4281i = 9;
            return 9;
        }
        if (iB5 == 39) {
            w();
            this.f4281i = 8;
            return 8;
        }
        if (iB5 != 44 && iB5 != 59) {
            if (iB5 == 91) {
                this.f4281i = 3;
                return 3;
            }
            if (iB5 != 93) {
                if (iB5 == 123) {
                    this.f4281i = 1;
                    return 1;
                }
                this.f4277e--;
                int iS = s();
                if (iS != 0) {
                    return iS;
                }
                int iT = t();
                if (iT != 0) {
                    return iT;
                }
                if (!a(this.f4276d[this.f4277e])) {
                    b("Expected value");
                    throw null;
                }
                w();
                this.f4281i = 10;
                return 10;
            }
            if (i2 == 1) {
                this.f4281i = 4;
                return 4;
            }
        }
        if (i2 == 1 || i2 == 2) {
            w();
            this.f4277e--;
            this.f4281i = 7;
            return 7;
        }
        b("Unexpected value");
        throw null;
    }

    private int s() {
        String str;
        String str2;
        int i2;
        char c2 = this.f4276d[this.f4277e];
        if (c2 == 't' || c2 == 'T') {
            str = "true";
            str2 = "TRUE";
            i2 = 5;
        } else if (c2 == 'f' || c2 == 'F') {
            str = "false";
            str2 = "FALSE";
            i2 = 6;
        } else {
            if (c2 != 'n' && c2 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i2 = 7;
        }
        int length = str.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.f4277e + i3 >= this.f4278f && !b(i3 + 1)) {
                return 0;
            }
            char c3 = this.f4276d[this.f4277e + i3];
            if (c3 != str.charAt(i3) && c3 != str2.charAt(i3)) {
                return 0;
            }
        }
        if ((this.f4277e + length < this.f4278f || b(length + 1)) && a(this.f4276d[this.f4277e + length])) {
            return 0;
        }
        this.f4277e += length;
        this.f4281i = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        if (a(r14) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r9 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
    
        if (r10 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
    
        if (r11 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a7, code lost:
    
        if (r13 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a9, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ac, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ad, code lost:
    
        r18.j = r11;
        r18.f4277e += r3;
        r18.f4281i = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b8, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b9, code lost:
    
        if (r9 == 2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bc, code lost:
    
        if (r9 == 4) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bf, code lost:
    
        if (r9 != 7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c4, code lost:
    
        r18.k = r3;
        r18.f4281i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ca, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cb, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int t() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.c.d.b.t():int");
    }

    private boolean a(char c2) throws e {
        switch (c2) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case a$i.AppCompatTheme_activityChooserViewStyle /* 32 */:
            case a$i.AppCompatTheme_buttonStyle /* 44 */:
            case a$i.AppCompatTheme_controlBackground /* 58 */:
            case a$i.AppCompatTheme_selectableItemBackground /* 91 */:
            case a$i.AppCompatTheme_spinnerDropDownItemStyle /* 93 */:
            case '{':
            case '}':
                return false;
            case a$i.AppCompatTheme_alertDialogStyle /* 35 */:
            case a$i.AppCompatTheme_checkedTextViewStyle /* 47 */:
            case a$i.AppCompatTheme_dialogCornerRadius /* 59 */:
            case a$i.AppCompatTheme_dialogTheme /* 61 */:
            case a$i.AppCompatTheme_selectableItemBackgroundBorderless /* 92 */:
                w();
                return false;
            default:
                return true;
        }
    }

    public String i() throws e {
        String strB;
        int iH = this.f4281i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 14) {
            strB = u();
        } else if (iH == 12) {
            strB = b('\'');
        } else if (iH == 13) {
            strB = b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + g() + q());
        }
        this.f4281i = 0;
        this.o[this.n - 1] = strB;
        return strB;
    }

    public String j() throws e {
        String str;
        int iH = this.f4281i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 10) {
            str = u();
        } else if (iH == 8) {
            str = b('\'');
        } else if (iH == 9) {
            str = b('\"');
        } else if (iH == 11) {
            str = this.l;
            this.l = null;
        } else if (iH == 15) {
            str = Long.toString(this.j);
        } else if (iH == 16) {
            str = new String(this.f4276d, this.f4277e, this.k);
            this.f4277e += this.k;
        } else {
            throw new IllegalStateException("Expected a string but was " + g() + q());
        }
        this.f4281i = 0;
        int[] iArr = this.p;
        int i2 = this.n - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public boolean k() {
        int iH = this.f4281i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 5) {
            this.f4281i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iH == 6) {
            this.f4281i = 0;
            int[] iArr2 = this.p;
            int i3 = this.n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + g() + q());
    }

    public void l() {
        int iH = this.f4281i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 7) {
            this.f4281i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + g() + q());
    }

    public double m() throws NumberFormatException, e {
        int iH = this.f4281i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            this.f4281i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (iH == 16) {
            this.l = new String(this.f4276d, this.f4277e, this.k);
            this.f4277e += this.k;
        } else if (iH == 8 || iH == 9) {
            this.l = b(iH == 8 ? '\'' : '\"');
        } else if (iH == 10) {
            this.l = u();
        } else if (iH != 11) {
            throw new IllegalStateException("Expected a double but was " + g() + q());
        }
        this.f4281i = 11;
        double d2 = Double.parseDouble(this.l);
        if (!this.f4275c && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new e("JSON forbids NaN and infinities: " + d2 + q());
        }
        this.l = null;
        this.f4281i = 0;
        int[] iArr2 = this.p;
        int i3 = this.n - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d2;
    }

    public long n() throws NumberFormatException {
        int iH = this.f4281i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            this.f4281i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (iH == 16) {
            this.l = new String(this.f4276d, this.f4277e, this.k);
            this.f4277e += this.k;
        } else if (iH == 8 || iH == 9 || iH == 10) {
            if (iH == 10) {
                this.l = u();
            } else {
                this.l = b(iH == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.l);
                this.f4281i = 0;
                int[] iArr2 = this.p;
                int i3 = this.n - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + g() + q());
        }
        this.f4281i = 11;
        double d2 = Double.parseDouble(this.l);
        long j2 = (long) d2;
        if (j2 != d2) {
            throw new NumberFormatException("Expected a long but was " + this.l + q());
        }
        this.l = null;
        this.f4281i = 0;
        int[] iArr3 = this.p;
        int i4 = this.n - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r5) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r2.append(r0, r5, r3 - r5);
        r10.f4277e = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String b(char r11) throws c.d.c.d.e {
        /*
            r10 = this;
            char[] r0 = r10.f4276d
            r1 = 0
            r2 = r1
        L4:
            int r3 = r10.f4277e
            int r4 = r10.f4278f
        L8:
            r5 = r3
        L9:
            r6 = 16
            r7 = 1
            if (r3 >= r4) goto L5c
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L28
            r10.f4277e = r8
            int r8 = r8 - r5
            int r8 = r8 - r7
            if (r2 != 0) goto L20
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r5, r8)
            return r11
        L20:
            r2.append(r0, r5, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L28:
            r9 = 92
            if (r3 != r9) goto L4f
            r10.f4277e = r8
            int r8 = r8 - r5
            int r8 = r8 - r7
            if (r2 != 0) goto L40
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L40:
            r2.append(r0, r5, r8)
            char r3 = r10.y()
            r2.append(r3)
            int r3 = r10.f4277e
            int r4 = r10.f4278f
            goto L8
        L4f:
            r6 = 10
            if (r3 != r6) goto L5a
            int r3 = r10.f4279g
            int r3 = r3 + r7
            r10.f4279g = r3
            r10.f4280h = r8
        L5a:
            r3 = r8
            goto L9
        L5c:
            if (r2 != 0) goto L6c
            int r2 = r3 - r5
            int r2 = r2 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r4.<init>(r2)
            r2 = r4
        L6c:
            int r4 = r3 - r5
            r2.append(r0, r5, r4)
            r10.f4277e = r3
            boolean r3 = r10.b(r7)
            if (r3 == 0) goto L7a
            goto L4
        L7a:
            java.lang.String r11 = "Unterminated string"
            r10.b(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.c.d.b.b(char):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String u() throws c.d.c.d.e {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = r1
        L3:
            r1 = 0
        L4:
            int r3 = r5.f4277e
            int r3 = r3 + r1
            int r4 = r5.f4278f
            if (r3 >= r4) goto L1c
            char[] r3 = r5.f4276d
            int r4 = r5.f4277e
            int r4 = r4 + r1
            char r3 = r3[r4]
            switch(r3) {
                case 9: goto L2a;
                case 10: goto L2a;
                case 12: goto L2a;
                case 13: goto L2a;
                case 32: goto L2a;
                case 35: goto L18;
                case 44: goto L2a;
                case 47: goto L18;
                case 58: goto L2a;
                case 59: goto L18;
                case 61: goto L18;
                case 91: goto L2a;
                case 92: goto L18;
                case 93: goto L2a;
                case 123: goto L2a;
                case 125: goto L2a;
                default: goto L15;
            }
        L15:
            int r1 = r1 + 1
            goto L4
        L18:
            r5.w()
            goto L2a
        L1c:
            char[] r3 = r5.f4276d
            int r3 = r3.length
            if (r1 >= r3) goto L2c
            int r3 = r1 + 1
            boolean r3 = r5.b(r3)
            if (r3 == 0) goto L2a
            goto L4
        L2a:
            r0 = r1
            goto L4c
        L2c:
            if (r2 != 0) goto L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r1, r3)
            r2.<init>(r3)
        L39:
            char[] r3 = r5.f4276d
            int r4 = r5.f4277e
            r2.append(r3, r4, r1)
            int r3 = r5.f4277e
            int r3 = r3 + r1
            r5.f4277e = r3
            r1 = 1
            boolean r1 = r5.b(r1)
            if (r1 != 0) goto L3
        L4c:
            if (r2 != 0) goto L58
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.f4276d
            int r3 = r5.f4277e
            r1.<init>(r2, r3, r0)
            goto L63
        L58:
            char[] r1 = r5.f4276d
            int r3 = r5.f4277e
            r2.append(r1, r3, r0)
            java.lang.String r1 = r2.toString()
        L63:
            int r2 = r5.f4277e
            int r2 = r2 + r0
            r5.f4277e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.c.d.b.u():java.lang.String");
    }

    private void c(char c2) throws e {
        char[] cArr = this.f4276d;
        do {
            int i2 = this.f4277e;
            int i3 = this.f4278f;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    this.f4277e = i4;
                    return;
                }
                if (c3 == '\\') {
                    this.f4277e = i4;
                    y();
                    i2 = this.f4277e;
                    i3 = this.f4278f;
                } else {
                    if (c3 == '\n') {
                        this.f4279g++;
                        this.f4280h = i4;
                    }
                    i2 = i4;
                }
            }
            this.f4277e = i2;
        } while (b(1));
        b("Unterminated string");
        throw null;
    }

    private void v() throws e {
        do {
            int i2 = 0;
            while (this.f4277e + i2 < this.f4278f) {
                switch (this.f4276d[this.f4277e + i2]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case a$i.AppCompatTheme_activityChooserViewStyle /* 32 */:
                    case a$i.AppCompatTheme_buttonStyle /* 44 */:
                    case a$i.AppCompatTheme_controlBackground /* 58 */:
                    case a$i.AppCompatTheme_selectableItemBackground /* 91 */:
                    case a$i.AppCompatTheme_spinnerDropDownItemStyle /* 93 */:
                    case '{':
                    case '}':
                        break;
                    case a$i.AppCompatTheme_alertDialogStyle /* 35 */:
                    case a$i.AppCompatTheme_checkedTextViewStyle /* 47 */:
                    case a$i.AppCompatTheme_dialogCornerRadius /* 59 */:
                    case a$i.AppCompatTheme_dialogTheme /* 61 */:
                    case a$i.AppCompatTheme_selectableItemBackgroundBorderless /* 92 */:
                        w();
                        break;
                    default:
                        i2++;
                }
                this.f4277e += i2;
                return;
            }
            this.f4277e += i2;
        } while (b(1));
    }

    public int o() throws NumberFormatException {
        int iH = this.f4281i;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            int i2 = (int) this.j;
            if (this.j != i2) {
                throw new NumberFormatException("Expected an int but was " + this.j + q());
            }
            this.f4281i = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (iH == 16) {
            this.l = new String(this.f4276d, this.f4277e, this.k);
            this.f4277e += this.k;
        } else if (iH == 8 || iH == 9 || iH == 10) {
            if (iH == 10) {
                this.l = u();
            } else {
                this.l = b(iH == 8 ? '\'' : '\"');
            }
            try {
                int i4 = Integer.parseInt(this.l);
                this.f4281i = 0;
                int[] iArr2 = this.p;
                int i5 = this.n - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + g() + q());
        }
        this.f4281i = 11;
        double d2 = Double.parseDouble(this.l);
        int i6 = (int) d2;
        if (i6 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.l + q());
        }
        this.l = null;
        this.f4281i = 0;
        int[] iArr3 = this.p;
        int i7 = this.n - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4281i = 0;
        this.m[0] = 8;
        this.n = 1;
        this.f4274b.close();
    }

    public void p() throws e {
        int i2 = 0;
        do {
            int iH = this.f4281i;
            if (iH == 0) {
                iH = h();
            }
            if (iH == 3) {
                a(1);
                i2++;
            } else if (iH == 1) {
                a(3);
                i2++;
            } else if (iH == 4 || iH == 2) {
                this.n--;
                i2--;
            } else if (iH == 14 || iH == 10) {
                v();
            } else if (iH == 8 || iH == 12) {
                c('\'');
            } else if (iH == 9 || iH == 13) {
                c('\"');
            } else if (iH == 16) {
                this.f4277e += this.k;
            }
            this.f4281i = 0;
        } while (i2 != 0);
        int[] iArr = this.p;
        int i3 = this.n - 1;
        iArr[i3] = iArr[i3] + 1;
        this.o[this.n - 1] = "null";
    }

    private void a(int i2) {
        if (this.n == this.m.length) {
            int[] iArr = new int[this.n * 2];
            int[] iArr2 = new int[this.n * 2];
            String[] strArr = new String[this.n * 2];
            System.arraycopy(this.m, 0, iArr, 0, this.n);
            System.arraycopy(this.p, 0, iArr2, 0, this.n);
            System.arraycopy(this.o, 0, strArr, 0, this.n);
            this.m = iArr;
            this.p = iArr2;
            this.o = strArr;
        }
        int[] iArr3 = this.m;
        int i3 = this.n;
        this.n = i3 + 1;
        iArr3[i3] = i2;
    }

    private boolean b(int i2) throws IOException {
        char[] cArr = this.f4276d;
        this.f4280h -= this.f4277e;
        if (this.f4278f != this.f4277e) {
            this.f4278f -= this.f4277e;
            System.arraycopy(cArr, this.f4277e, cArr, 0, this.f4278f);
        } else {
            this.f4278f = 0;
        }
        this.f4277e = 0;
        do {
            int i3 = this.f4274b.read(cArr, this.f4278f, cArr.length - this.f4278f);
            if (i3 == -1) {
                return false;
            }
            this.f4278f += i3;
            if (this.f4279g == 0 && this.f4280h == 0 && this.f4278f > 0 && cArr[0] == 65279) {
                this.f4277e++;
                this.f4280h++;
                i2++;
            }
        } while (this.f4278f < i2);
        return true;
    }

    private int b(boolean z) throws IOException {
        char[] cArr = this.f4276d;
        int i2 = this.f4277e;
        int i3 = this.f4278f;
        while (true) {
            if (i2 == i3) {
                this.f4277e = i2;
                if (!b(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + q());
                }
                i2 = this.f4277e;
                i3 = this.f4278f;
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.f4279g++;
                this.f4280h = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f4277e = i4;
                    if (i4 == i3) {
                        this.f4277e--;
                        boolean zB = b(2);
                        this.f4277e++;
                        if (!zB) {
                            return c2;
                        }
                    }
                    w();
                    char c3 = cArr[this.f4277e];
                    if (c3 == '*') {
                        this.f4277e++;
                        if (!a("*/")) {
                            b("Unterminated comment");
                            throw null;
                        }
                        i2 = this.f4277e + 2;
                        i3 = this.f4278f;
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.f4277e++;
                        x();
                        i2 = this.f4277e;
                        i3 = this.f4278f;
                    }
                } else if (c2 == '#') {
                    this.f4277e = i4;
                    w();
                    x();
                    i2 = this.f4277e;
                    i3 = this.f4278f;
                } else {
                    this.f4277e = i4;
                    return c2;
                }
            }
            i2 = i4;
        }
    }

    private void w() throws e {
        if (this.f4275c) {
            return;
        }
        b("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    private void x() {
        char c2;
        do {
            if (this.f4277e >= this.f4278f && !b(1)) {
                return;
            }
            char[] cArr = this.f4276d;
            int i2 = this.f4277e;
            this.f4277e = i2 + 1;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.f4279g++;
                this.f4280h = this.f4277e;
                return;
            }
        } while (c2 != '\r');
    }

    private boolean a(String str) {
        int length = str.length();
        while (true) {
            if (this.f4277e + length > this.f4278f && !b(length)) {
                return false;
            }
            if (this.f4276d[this.f4277e] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.f4276d[this.f4277e + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.f4279g++;
            this.f4280h = this.f4277e + 1;
            this.f4277e++;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + q();
    }

    String q() {
        return " at line " + (this.f4279g + 1) + " column " + ((this.f4277e - this.f4280h) + 1) + " path " + r();
    }

    public String r() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.n;
        for (int i3 = 0; i3 < i2; i3++) {
            switch (this.m[i3]) {
                case 1:
                case 2:
                    sb.append('[');
                    sb.append(this.p[i3]);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    if (this.o[i3] != null) {
                        sb.append(this.o[i3]);
                        break;
                    } else {
                        break;
                    }
            }
        }
        return sb.toString();
    }

    private char y() throws e {
        int i2;
        if (this.f4277e == this.f4278f && !b(1)) {
            b("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f4276d;
        int i3 = this.f4277e;
        this.f4277e = i3 + 1;
        char c2 = cArr[i3];
        if (c2 == '\n') {
            this.f4279g++;
            this.f4280h = this.f4277e;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            switch (c2) {
                case a$i.AppCompatTheme_windowFixedWidthMajor /* 116 */:
                    return '\t';
                case a$i.AppCompatTheme_windowFixedWidthMinor /* 117 */:
                    if (this.f4277e + 4 > this.f4278f && !b(4)) {
                        b("Unterminated escape sequence");
                        throw null;
                    }
                    char c3 = 0;
                    int i4 = this.f4277e;
                    int i5 = i4 + 4;
                    while (i4 < i5) {
                        char c4 = this.f4276d[i4];
                        char c5 = (char) (c3 << 4);
                        if (c4 >= '0' && c4 <= '9') {
                            i2 = c4 - '0';
                        } else if (c4 >= 'a' && c4 <= 'f') {
                            i2 = (c4 - 'a') + 10;
                        } else {
                            if (c4 < 'A' || c4 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f4276d, this.f4277e, 4));
                            }
                            i2 = (c4 - 'A') + 10;
                        }
                        c3 = (char) (c5 + i2);
                        i4++;
                    }
                    this.f4277e += 4;
                    return c3;
                default:
                    b("Invalid escape sequence");
                    throw null;
            }
        }
        return c2;
    }

    private IOException b(String str) throws e {
        throw new e(str + q());
    }

    private void z() throws IOException {
        b(true);
        this.f4277e--;
        if (this.f4277e + f4273a.length <= this.f4278f || b(f4273a.length)) {
            for (int i2 = 0; i2 < f4273a.length; i2++) {
                if (this.f4276d[this.f4277e + i2] != f4273a[i2]) {
                    return;
                }
            }
            this.f4277e += f4273a.length;
        }
    }
}
