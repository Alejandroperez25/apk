package b.d.a;

import android.graphics.Path;
import android.util.Log;
import b.a.a$i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b {
    static float[] a(float[] fArr, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i2 < 0 || i2 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = i3 - i2;
        int iMin = Math.min(i4, length - i2);
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, i2, fArr2, 0, iMin);
        return fArr2;
    }

    public static Path a(String str) {
        Path path = new Path();
        C0014b[] c0014bArrB = b(str);
        if (c0014bArrB == null) {
            return null;
        }
        try {
            C0014b.a(c0014bArrB, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing " + str, e2);
        }
    }

    public static C0014b[] b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        while (i2 < str.length()) {
            int iA = a(str, i2);
            String strTrim = str.substring(i3, iA).trim();
            if (strTrim.length() > 0) {
                a((ArrayList<C0014b>) arrayList, strTrim.charAt(0), c(strTrim));
            }
            i3 = iA;
            i2 = iA + 1;
        }
        if (i2 - i3 == 1 && i3 < str.length()) {
            a((ArrayList<C0014b>) arrayList, str.charAt(i3), new float[0]);
        }
        return (C0014b[]) arrayList.toArray(new C0014b[arrayList.size()]);
    }

    public static C0014b[] a(C0014b[] c0014bArr) {
        if (c0014bArr == null) {
            return null;
        }
        C0014b[] c0014bArr2 = new C0014b[c0014bArr.length];
        for (int i2 = 0; i2 < c0014bArr.length; i2++) {
            c0014bArr2[i2] = new C0014b(c0014bArr[i2]);
        }
        return c0014bArr2;
    }

    public static boolean a(C0014b[] c0014bArr, C0014b[] c0014bArr2) {
        if (c0014bArr == null || c0014bArr2 == null || c0014bArr.length != c0014bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < c0014bArr.length; i2++) {
            if (c0014bArr[i2].f1036a != c0014bArr2[i2].f1036a || c0014bArr[i2].f1037b.length != c0014bArr2[i2].f1037b.length) {
                return false;
            }
        }
        return true;
    }

    public static void b(C0014b[] c0014bArr, C0014b[] c0014bArr2) {
        for (int i2 = 0; i2 < c0014bArr2.length; i2++) {
            c0014bArr[i2].f1036a = c0014bArr2[i2].f1036a;
            for (int i3 = 0; i3 < c0014bArr2[i2].f1037b.length; i3++) {
                c0014bArr[i2].f1037b[i3] = c0014bArr2[i2].f1037b[i3];
            }
        }
    }

    private static int a(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    private static void a(ArrayList<C0014b> arrayList, char c2, float[] fArr) {
        arrayList.add(new C0014b(c2, fArr));
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        int f1034a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1035b;

        a() {
        }
    }

    private static float[] c(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i2 = 1;
            int i3 = 0;
            while (i2 < length) {
                a(str, i2, aVar);
                int i4 = aVar.f1034a;
                if (i2 < i4) {
                    fArr[i3] = Float.parseFloat(str.substring(i2, i4));
                    i3++;
                }
                i2 = aVar.f1035b ? i4 : i4 + 1;
            }
            return a(fArr, 0, i3);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[LOOP:0: B:3:0x0007->B:24:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r8, int r9, b.d.a.b.a r10) {
        /*
            r0 = 0
            r10.f1035b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L35
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L35;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L37
        L27:
            r10.f1035b = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.f1035b = r7
            goto L35
        L31:
            r2 = 0
            goto L37
        L33:
            r2 = 1
            goto L37
        L35:
            r2 = 0
            r4 = 1
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.f1034a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.a.b.a(java.lang.String, int, b.d.a.b$a):void");
    }

    /* renamed from: b.d.a.b$b, reason: collision with other inner class name */
    public static class C0014b {

        /* renamed from: a, reason: collision with root package name */
        public char f1036a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f1037b;

        C0014b(char c2, float[] fArr) {
            this.f1036a = c2;
            this.f1037b = fArr;
        }

        C0014b(C0014b c0014b) {
            this.f1036a = c0014b.f1036a;
            this.f1037b = b.a(c0014b.f1037b, 0, c0014b.f1037b.length);
        }

        public static void a(C0014b[] c0014bArr, Path path) {
            float[] fArr = new float[6];
            char c2 = 'm';
            for (int i2 = 0; i2 < c0014bArr.length; i2++) {
                a(path, fArr, c2, c0014bArr[i2].f1036a, c0014bArr[i2].f1037b);
                c2 = c0014bArr[i2].f1036a;
            }
        }

        public void a(C0014b c0014b, C0014b c0014b2, float f2) {
            this.f1036a = c0014b.f1036a;
            for (int i2 = 0; i2 < c0014b.f1037b.length; i2++) {
                this.f1037b[i2] = (c0014b.f1037b[i2] * (1.0f - f2)) + (c0014b2.f1037b[i2] * f2);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void a(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            int i2;
            int i3;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = fArr[5];
            switch (c3) {
                case a$i.AppCompatTheme_dropdownListPreferredItemHeight /* 65 */:
                case a$i.AppCompatTheme_textAppearanceListItem /* 97 */:
                    i2 = 7;
                    break;
                case a$i.AppCompatTheme_editTextColor /* 67 */:
                case a$i.AppCompatTheme_textAppearanceListItemSmall /* 99 */:
                    i2 = 6;
                    break;
                case a$i.AppCompatTheme_listDividerAlertDialog /* 72 */:
                case a$i.AppCompatTheme_ratingBarStyle /* 86 */:
                case a$i.AppCompatTheme_textColorAlertDialogListItem /* 104 */:
                case a$i.AppCompatTheme_windowMinWidthMajor /* 118 */:
                    i2 = 1;
                    break;
                case a$i.AppCompatTheme_listPreferredItemHeightLarge /* 76 */:
                case a$i.AppCompatTheme_listPreferredItemHeightSmall /* 77 */:
                case a$i.AppCompatTheme_popupWindowStyle /* 84 */:
                case a$i.AppCompatTheme_tooltipForegroundColor /* 108 */:
                case a$i.AppCompatTheme_tooltipFrameBackground /* 109 */:
                case a$i.AppCompatTheme_windowFixedWidthMajor /* 116 */:
                default:
                    i2 = 2;
                    break;
                case a$i.AppCompatTheme_panelMenuListTheme /* 81 */:
                case a$i.AppCompatTheme_popupMenuStyle /* 83 */:
                case a$i.AppCompatTheme_windowActionModeOverlay /* 113 */:
                case a$i.AppCompatTheme_windowFixedHeightMinor /* 115 */:
                    i2 = 4;
                    break;
                case a$i.AppCompatTheme_seekBarStyle /* 90 */:
                case 'z':
                    path.close();
                    path.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                    i2 = 2;
                    break;
            }
            float f17 = f11;
            float f18 = f12;
            float f19 = f15;
            float f20 = f16;
            int i4 = 0;
            char c4 = c2;
            while (i4 < fArr2.length) {
                float f21 = 0.0f;
                switch (c3) {
                    case a$i.AppCompatTheme_dropdownListPreferredItemHeight /* 65 */:
                        i3 = i4;
                        int i5 = i3 + 5;
                        int i6 = i3 + 6;
                        a(path, f17, f18, fArr2[i5], fArr2[i6], fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f17 = fArr2[i5];
                        f18 = fArr2[i6];
                        f14 = f18;
                        f13 = f17;
                        break;
                    case a$i.AppCompatTheme_editTextColor /* 67 */:
                        i3 = i4;
                        int i7 = i3 + 2;
                        int i8 = i3 + 3;
                        int i9 = i3 + 4;
                        int i10 = i3 + 5;
                        path.cubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i7], fArr2[i8], fArr2[i9], fArr2[i10]);
                        f17 = fArr2[i9];
                        float f22 = fArr2[i10];
                        float f23 = fArr2[i7];
                        float f24 = fArr2[i8];
                        f18 = f22;
                        f14 = f24;
                        f13 = f23;
                        break;
                    case a$i.AppCompatTheme_listDividerAlertDialog /* 72 */:
                        i3 = i4;
                        int i11 = i3 + 0;
                        path.lineTo(fArr2[i11], f18);
                        f17 = fArr2[i11];
                        break;
                    case a$i.AppCompatTheme_listPreferredItemHeightLarge /* 76 */:
                        i3 = i4;
                        int i12 = i3 + 0;
                        int i13 = i3 + 1;
                        path.lineTo(fArr2[i12], fArr2[i13]);
                        f17 = fArr2[i12];
                        f18 = fArr2[i13];
                        break;
                    case a$i.AppCompatTheme_listPreferredItemHeightSmall /* 77 */:
                        i3 = i4;
                        int i14 = i3 + 0;
                        f17 = fArr2[i14];
                        int i15 = i3 + 1;
                        f18 = fArr2[i15];
                        if (i3 > 0) {
                            path.lineTo(fArr2[i14], fArr2[i15]);
                            break;
                        } else {
                            path.moveTo(fArr2[i14], fArr2[i15]);
                            f20 = f18;
                            f19 = f17;
                            break;
                        }
                    case a$i.AppCompatTheme_panelMenuListTheme /* 81 */:
                        i3 = i4;
                        int i16 = i3 + 0;
                        int i17 = i3 + 1;
                        int i18 = i3 + 2;
                        int i19 = i3 + 3;
                        path.quadTo(fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                        f2 = fArr2[i16];
                        f3 = fArr2[i17];
                        f17 = fArr2[i18];
                        f18 = fArr2[i19];
                        f13 = f2;
                        f14 = f3;
                        break;
                    case a$i.AppCompatTheme_popupMenuStyle /* 83 */:
                        float f25 = f18;
                        float f26 = f17;
                        i3 = i4;
                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                            float f27 = (f26 * 2.0f) - f13;
                            f4 = (f25 * 2.0f) - f14;
                            f5 = f27;
                        } else {
                            f5 = f26;
                            f4 = f25;
                        }
                        int i20 = i3 + 0;
                        int i21 = i3 + 1;
                        int i22 = i3 + 2;
                        int i23 = i3 + 3;
                        path.cubicTo(f5, f4, fArr2[i20], fArr2[i21], fArr2[i22], fArr2[i23]);
                        f2 = fArr2[i20];
                        f3 = fArr2[i21];
                        f17 = fArr2[i22];
                        f18 = fArr2[i23];
                        f13 = f2;
                        f14 = f3;
                        break;
                    case a$i.AppCompatTheme_popupWindowStyle /* 84 */:
                        float f28 = f18;
                        float f29 = f17;
                        i3 = i4;
                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                            f28 = (f28 * 2.0f) - f14;
                            f29 = (f29 * 2.0f) - f13;
                        }
                        int i24 = i3 + 0;
                        int i25 = i3 + 1;
                        path.quadTo(f29, f28, fArr2[i24], fArr2[i25]);
                        f17 = fArr2[i24];
                        f18 = fArr2[i25];
                        f13 = f29;
                        f14 = f28;
                        break;
                    case a$i.AppCompatTheme_ratingBarStyle /* 86 */:
                        i3 = i4;
                        int i26 = i3 + 0;
                        path.lineTo(f17, fArr2[i26]);
                        f18 = fArr2[i26];
                        break;
                    case a$i.AppCompatTheme_textAppearanceListItem /* 97 */:
                        int i27 = i4 + 5;
                        float f30 = fArr2[i27] + f17;
                        int i28 = i4 + 6;
                        float f31 = fArr2[i28] + f18;
                        float f32 = fArr2[i4 + 0];
                        float f33 = fArr2[i4 + 1];
                        float f34 = fArr2[i4 + 2];
                        float f35 = f17;
                        boolean z = fArr2[i4 + 3] != 0.0f;
                        i3 = i4;
                        a(path, f17, f18, f30, f31, f32, f33, f34, z, fArr2[i4 + 4] != 0.0f);
                        f17 = f35 + fArr2[i27];
                        f18 += fArr2[i28];
                        f14 = f18;
                        f13 = f17;
                        break;
                    case a$i.AppCompatTheme_textAppearanceListItemSmall /* 99 */:
                        int i29 = i4 + 2;
                        int i30 = i4 + 3;
                        int i31 = i4 + 4;
                        int i32 = i4 + 5;
                        path.rCubicTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i29], fArr2[i30], fArr2[i31], fArr2[i32]);
                        f6 = fArr2[i29] + f17;
                        f7 = fArr2[i30] + f18;
                        f17 += fArr2[i31];
                        f18 += fArr2[i32];
                        f13 = f6;
                        f14 = f7;
                        i3 = i4;
                        break;
                    case a$i.AppCompatTheme_textColorAlertDialogListItem /* 104 */:
                        int i33 = i4 + 0;
                        path.rLineTo(fArr2[i33], 0.0f);
                        f17 += fArr2[i33];
                        i3 = i4;
                        break;
                    case a$i.AppCompatTheme_tooltipForegroundColor /* 108 */:
                        int i34 = i4 + 0;
                        int i35 = i4 + 1;
                        path.rLineTo(fArr2[i34], fArr2[i35]);
                        f17 += fArr2[i34];
                        f18 += fArr2[i35];
                        i3 = i4;
                        break;
                    case a$i.AppCompatTheme_tooltipFrameBackground /* 109 */:
                        int i36 = i4 + 0;
                        f17 += fArr2[i36];
                        int i37 = i4 + 1;
                        f18 += fArr2[i37];
                        if (i4 > 0) {
                            path.rLineTo(fArr2[i36], fArr2[i37]);
                        } else {
                            path.rMoveTo(fArr2[i36], fArr2[i37]);
                            f20 = f18;
                            f19 = f17;
                        }
                        i3 = i4;
                        break;
                    case a$i.AppCompatTheme_windowActionModeOverlay /* 113 */:
                        int i38 = i4 + 0;
                        int i39 = i4 + 1;
                        int i40 = i4 + 2;
                        int i41 = i4 + 3;
                        path.rQuadTo(fArr2[i38], fArr2[i39], fArr2[i40], fArr2[i41]);
                        f6 = fArr2[i38] + f17;
                        f7 = fArr2[i39] + f18;
                        f17 += fArr2[i40];
                        f18 += fArr2[i41];
                        f13 = f6;
                        f14 = f7;
                        i3 = i4;
                        break;
                    case a$i.AppCompatTheme_windowFixedHeightMinor /* 115 */:
                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                            float f36 = f17 - f13;
                            f8 = f18 - f14;
                            f9 = f36;
                        } else {
                            f9 = 0.0f;
                            f8 = 0.0f;
                        }
                        int i42 = i4 + 0;
                        int i43 = i4 + 1;
                        int i44 = i4 + 2;
                        int i45 = i4 + 3;
                        path.rCubicTo(f9, f8, fArr2[i42], fArr2[i43], fArr2[i44], fArr2[i45]);
                        f6 = fArr2[i42] + f17;
                        f7 = fArr2[i43] + f18;
                        f17 += fArr2[i44];
                        f18 += fArr2[i45];
                        f13 = f6;
                        f14 = f7;
                        i3 = i4;
                        break;
                    case a$i.AppCompatTheme_windowFixedWidthMajor /* 116 */:
                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                            f21 = f17 - f13;
                            f10 = f18 - f14;
                        } else {
                            f10 = 0.0f;
                        }
                        int i46 = i4 + 0;
                        int i47 = i4 + 1;
                        path.rQuadTo(f21, f10, fArr2[i46], fArr2[i47]);
                        float f37 = f21 + f17;
                        float f38 = f10 + f18;
                        f17 += fArr2[i46];
                        f18 += fArr2[i47];
                        f14 = f38;
                        f13 = f37;
                        i3 = i4;
                        break;
                    case a$i.AppCompatTheme_windowMinWidthMajor /* 118 */:
                        int i48 = i4 + 0;
                        path.rLineTo(0.0f, fArr2[i48]);
                        f18 += fArr2[i48];
                        i3 = i4;
                        break;
                    default:
                        i3 = i4;
                        break;
                }
                i4 = i3 + i2;
                c4 = c3;
            }
            fArr[0] = f17;
            fArr[1] = f18;
            fArr[2] = f13;
            fArr[3] = f14;
            fArr[4] = f19;
            fArr[5] = f20;
        }

        private static void a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
            double d2;
            double d3;
            double radians = Math.toRadians(f8);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d4 = f2;
            double d5 = d4 * dCos;
            double d6 = f3;
            double d7 = f6;
            double d8 = (d5 + (d6 * dSin)) / d7;
            double d9 = ((-f2) * dSin) + (d6 * dCos);
            double d10 = f7;
            double d11 = d9 / d10;
            double d12 = f5;
            double d13 = ((f4 * dCos) + (d12 * dSin)) / d7;
            double d14 = (((-f4) * dSin) + (d12 * dCos)) / d10;
            double d15 = d8 - d13;
            double d16 = d11 - d14;
            double d17 = (d8 + d13) / 2.0d;
            double d18 = (d11 + d14) / 2.0d;
            double d19 = (d15 * d15) + (d16 * d16);
            if (d19 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d20 = (1.0d / d19) - 0.25d;
            if (d20 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d19);
                float fSqrt = (float) (Math.sqrt(d19) / 1.99999d);
                a(path, f2, f3, f4, f5, f6 * fSqrt, f7 * fSqrt, f8, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d20);
            double d21 = d15 * dSqrt;
            double d22 = dSqrt * d16;
            if (z == z2) {
                d2 = d17 - d22;
                d3 = d18 + d21;
            } else {
                d2 = d17 + d22;
                d3 = d18 - d21;
            }
            double dAtan2 = Math.atan2(d11 - d3, d8 - d2);
            double dAtan22 = Math.atan2(d14 - d3, d13 - d2) - dAtan2;
            if (z2 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d23 = d2 * d7;
            double d24 = d3 * d10;
            a(path, (d23 * dCos) - (d24 * dSin), (d23 * dSin) + (d24 * dCos), d7, d10, d4, d6, radians, dAtan2, dAtan22);
        }

        private static void a(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
            double d11 = d4;
            int iCeil = (int) Math.ceil(Math.abs((d10 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d8);
            double dSin = Math.sin(d8);
            double dCos2 = Math.cos(d9);
            double dSin2 = Math.sin(d9);
            double d12 = -d11;
            double d13 = d12 * dCos;
            double d14 = d5 * dSin;
            double d15 = (d13 * dSin2) - (d14 * dCos2);
            double d16 = d12 * dSin;
            double d17 = d5 * dCos;
            double d18 = (dSin2 * d16) + (dCos2 * d17);
            double d19 = d10 / iCeil;
            int i2 = 0;
            double d20 = d7;
            double d21 = d18;
            double d22 = d15;
            double d23 = d6;
            double d24 = d9;
            while (i2 < iCeil) {
                double d25 = d24 + d19;
                double dSin3 = Math.sin(d25);
                double dCos3 = Math.cos(d25);
                double d26 = d19;
                double d27 = (d2 + ((d11 * dCos) * dCos3)) - (d14 * dSin3);
                double d28 = d3 + (d11 * dSin * dCos3) + (d17 * dSin3);
                double d29 = (d13 * dSin3) - (d14 * dCos3);
                double d30 = (dSin3 * d16) + (dCos3 * d17);
                double d31 = d25 - d24;
                double dTan = Math.tan(d31 / 2.0d);
                double dSin4 = (Math.sin(d31) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d23 + (d22 * dSin4)), (float) (d20 + (d21 * dSin4)), (float) (d27 - (dSin4 * d29)), (float) (d28 - (dSin4 * d30)), (float) d27, (float) d28);
                i2++;
                d20 = d28;
                d23 = d27;
                d24 = d25;
                d21 = d30;
                d22 = d29;
                d19 = d26;
                d17 = d17;
                d16 = d16;
                iCeil = iCeil;
                dCos = dCos;
                dSin = dSin;
                d11 = d4;
            }
        }
    }
}
