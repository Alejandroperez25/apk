package c.d.a.a.j.h;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c.d.a.a.j.h.f;
import c.d.a.a.m.H;
import c.d.a.a.m.o;
import c.d.a.a.m.u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f3257a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f3258b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    private final StringBuilder f3259c = new StringBuilder();

    public boolean a(u uVar, f.a aVar, List<d> list) {
        String strA = uVar.A();
        if (strA == null) {
            return false;
        }
        Matcher matcher = f3257a.matcher(strA);
        if (matcher.matches()) {
            return a(null, matcher, uVar, aVar, this.f3259c, list);
        }
        String strA2 = uVar.A();
        if (strA2 == null) {
            return false;
        }
        Matcher matcher2 = f3257a.matcher(strA2);
        if (matcher2.matches()) {
            return a(strA.trim(), matcher2, uVar, aVar, this.f3259c, list);
        }
        return false;
    }

    static void a(String str, f.a aVar) {
        Matcher matcher = f3258b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            try {
                if ("line".equals(strGroup)) {
                    b(strGroup2, aVar);
                } else if ("align".equals(strGroup)) {
                    aVar.a(b(strGroup2));
                } else if ("position".equals(strGroup)) {
                    c(strGroup2, aVar);
                } else if ("size".equals(strGroup)) {
                    aVar.c(i.b(strGroup2));
                } else {
                    o.c("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                o.c("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static void a(String str, String str2, f.a aVar, List<d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str2.length()) {
            char cCharAt = str2.charAt(i2);
            if (cCharAt == '&') {
                i2++;
                int iIndexOf = str2.indexOf(59, i2);
                int iIndexOf2 = str2.indexOf(32, i2);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    a(str2.substring(i2, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i2 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt == '<') {
                int iA = i2 + 1;
                if (iA < str2.length()) {
                    boolean z = str2.charAt(iA) == '/';
                    iA = a(str2, iA);
                    int i3 = iA - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i2 + (z ? 2 : 1);
                    if (!z2) {
                        i3 = iA - 1;
                    }
                    String strSubstring = str2.substring(i4, i3);
                    String strD = d(strSubstring);
                    if (strD != null && c(strD)) {
                        if (z) {
                            while (!arrayDeque.isEmpty()) {
                                a aVar2 = (a) arrayDeque.pop();
                                a(str, aVar2, spannableStringBuilder, list, arrayList);
                                if (aVar2.f3261b.equals(strD)) {
                                    break;
                                }
                            }
                        } else if (!z2) {
                            arrayDeque.push(a.a(strSubstring, spannableStringBuilder.length()));
                        }
                    }
                }
                i2 = iA;
            } else {
                spannableStringBuilder.append(cCharAt);
                i2++;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (a) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        a(str, a.a(), spannableStringBuilder, list, arrayList);
        aVar.a(spannableStringBuilder);
    }

    private static boolean a(String str, Matcher matcher, u uVar, f.a aVar, StringBuilder sb, List<d> list) {
        try {
            aVar.a(i.a(matcher.group(1)));
            aVar.b(i.a(matcher.group(2)));
            a(matcher.group(3), aVar);
            sb.setLength(0);
            while (true) {
                String strA = uVar.A();
                if (!TextUtils.isEmpty(strA)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(strA.trim());
                } else {
                    a(str, sb.toString(), aVar, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            o.c("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return false;
        }
    }

    private static void b(String str, f.a aVar) throws NumberFormatException {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            aVar.b(a(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        } else {
            aVar.b(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            aVar.a(i.b(str));
            aVar.a(0);
            return;
        }
        int i2 = Integer.parseInt(str);
        if (i2 < 0) {
            i2--;
        }
        aVar.a(i2);
        aVar.a(1);
    }

    private static void c(String str, f.a aVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            aVar.c(a(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        } else {
            aVar.c(Integer.MIN_VALUE);
        }
        aVar.b(i.b(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r1) goto L3a
            r1 = -1074341483(0xffffffffbff6d995, float:-1.9285151)
            if (r0 == r1) goto L30
            r1 = 100571(0x188db, float:1.4093E-40)
            if (r0 == r1) goto L26
            r1 = 109757538(0x68ac462, float:5.219839E-35)
            if (r0 == r1) goto L1c
            goto L44
        L1c:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L44
            r0 = 0
            goto L45
        L26:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L44
            r0 = 3
            goto L45
        L30:
            java.lang.String r0 = "middle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L44
            r0 = 2
            goto L45
        L3a:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = -1
        L45:
            switch(r0) {
                case 0: goto L63;
                case 1: goto L62;
                case 2: goto L62;
                case 3: goto L61;
                default: goto L48;
            }
        L48:
            java.lang.String r0 = "WebvttCueParser"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid anchor value: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            c.d.a.a.m.o.c(r0, r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L61:
            return r2
        L62:
            return r3
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.j.h.g.a(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.text.Layout.Alignment b(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            switch(r0) {
                case -1364013995: goto L3a;
                case -1074341483: goto L30;
                case 100571: goto L26;
                case 3317767: goto L1c;
                case 108511772: goto L12;
                case 109757538: goto L8;
                default: goto L7;
            }
        L7:
            goto L44
        L8:
            java.lang.String r0 = "start"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L44
            r0 = 0
            goto L45
        L12:
            java.lang.String r0 = "right"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L44
            r0 = 5
            goto L45
        L1c:
            java.lang.String r0 = "left"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L26:
            java.lang.String r0 = "end"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L44
            r0 = 4
            goto L45
        L30:
            java.lang.String r0 = "middle"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L44
            r0 = 3
            goto L45
        L3a:
            java.lang.String r0 = "center"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L44
            r0 = 2
            goto L45
        L44:
            r0 = -1
        L45:
            switch(r0) {
                case 0: goto L66;
                case 1: goto L66;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L60;
                case 5: goto L60;
                default: goto L48;
            }
        L48:
            java.lang.String r0 = "WebvttCueParser"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid alignment value: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            c.d.a.a.m.o.c(r0, r3)
            r3 = 0
            return r3
        L60:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r3
        L63:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            return r3
        L66:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.j.h.g.b(java.lang.String):android.text.Layout$Alignment");
    }

    private static int a(String str, int i2) {
        int iIndexOf = str.indexOf(62, i2);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r2, android.text.SpannableStringBuilder r3) {
        /*
            int r0 = r2.hashCode()
            r1 = 3309(0xced, float:4.637E-42)
            if (r0 == r1) goto L35
            r1 = 3464(0xd88, float:4.854E-42)
            if (r0 == r1) goto L2b
            r1 = 96708(0x179c4, float:1.35517E-40)
            if (r0 == r1) goto L21
            r1 = 3374865(0x337f11, float:4.729193E-39)
            if (r0 == r1) goto L17
            goto L3f
        L17:
            java.lang.String r0 = "nbsp"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3f
            r0 = 2
            goto L40
        L21:
            java.lang.String r0 = "amp"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3f
            r0 = 3
            goto L40
        L2b:
            java.lang.String r0 = "lt"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3f
            r0 = 0
            goto L40
        L35:
            java.lang.String r0 = "gt"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = -1
        L40:
            switch(r0) {
                case 0: goto L71;
                case 1: goto L6b;
                case 2: goto L65;
                case 3: goto L5f;
                default: goto L43;
            }
        L43:
            java.lang.String r3 = "WebvttCueParser"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ignoring unsupported entity: '&"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ";'"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            c.d.a.a.m.o.c(r3, r2)
            goto L76
        L5f:
            r2 = 38
            r3.append(r2)
            goto L76
        L65:
            r2 = 32
            r3.append(r2)
            goto L76
        L6b:
            r2 = 62
            r3.append(r2)
            goto L76
        L71:
            r2 = 60
            r3.append(r2)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.j.h.g.a(java.lang.String, android.text.SpannableStringBuilder):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 1
            r2 = 0
            switch(r0) {
                case 98: goto L3c;
                case 99: goto L32;
                case 105: goto L28;
                case 117: goto L1e;
                case 118: goto L14;
                case 3314158: goto La;
                default: goto L9;
            }
        L9:
            goto L46
        La:
            java.lang.String r0 = "lang"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
            r3 = 3
            goto L47
        L14:
            java.lang.String r0 = "v"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
            r3 = 5
            goto L47
        L1e:
            java.lang.String r0 = "u"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
            r3 = 4
            goto L47
        L28:
            java.lang.String r0 = "i"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
            r3 = 2
            goto L47
        L32:
            java.lang.String r0 = "c"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
            r3 = 1
            goto L47
        L3c:
            java.lang.String r0 = "b"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
            r3 = 0
            goto L47
        L46:
            r3 = -1
        L47:
            switch(r3) {
                case 0: goto L4b;
                case 1: goto L4b;
                case 2: goto L4b;
                case 3: goto L4b;
                case 4: goto L4b;
                case 5: goto L4b;
                default: goto L4a;
            }
        L4a:
            return r2
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.j.h.g.c(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r7, c.d.a.a.j.h.g.a r8, android.text.SpannableStringBuilder r9, java.util.List<c.d.a.a.j.h.d> r10, java.util.List<c.d.a.a.j.h.g.b> r11) {
        /*
            int r0 = r8.f3262c
            int r1 = r9.length()
            java.lang.String r2 = r8.f3261b
            int r3 = r2.hashCode()
            r4 = 0
            r5 = 2
            r6 = 1
            switch(r3) {
                case 0: goto L4f;
                case 98: goto L45;
                case 99: goto L3b;
                case 105: goto L31;
                case 117: goto L27;
                case 118: goto L1d;
                case 3314158: goto L13;
                default: goto L12;
            }
        L12:
            goto L59
        L13:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L59
            r2 = 4
            goto L5a
        L1d:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L59
            r2 = 5
            goto L5a
        L27:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L59
            r2 = 2
            goto L5a
        L31:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L59
            r2 = 1
            goto L5a
        L3b:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L59
            r2 = 3
            goto L5a
        L45:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L59
            r2 = 0
            goto L5a
        L4f:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L59
            r2 = 6
            goto L5a
        L59:
            r2 = -1
        L5a:
            r3 = 33
            switch(r2) {
                case 0: goto L72;
                case 1: goto L69;
                case 2: goto L60;
                case 3: goto L7a;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L7a;
                default: goto L5f;
            }
        L5f:
            return
        L60:
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            r9.setSpan(r2, r0, r1, r3)
            goto L7a
        L69:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r5)
            r9.setSpan(r2, r0, r1, r3)
            goto L7a
        L72:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r6)
            r9.setSpan(r2, r0, r1, r3)
        L7a:
            r11.clear()
            a(r10, r7, r8, r11)
            int r7 = r11.size()
        L84:
            if (r4 >= r7) goto L94
            java.lang.Object r8 = r11.get(r4)
            c.d.a.a.j.h.g$b r8 = (c.d.a.a.j.h.g.b) r8
            c.d.a.a.j.h.d r8 = r8.f3266b
            a(r9, r8, r0, r1)
            int r4 = r4 + 1
            goto L84
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.j.h.g.a(java.lang.String, c.d.a.a.j.h.g$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, d dVar, int i2, int i3) {
        if (dVar == null) {
        }
        if (dVar.b() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(dVar.b()), i2, i3, 33);
        }
        if (dVar.c()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (dVar.d()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (dVar.g()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(dVar.f()), i2, i3, 33);
        }
        if (dVar.i()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(dVar.h()), i2, i3, 33);
        }
        if (dVar.e() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(dVar.e()), i2, i3, 33);
        }
        if (dVar.j() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(dVar.j()), i2, i3, 33);
        }
        switch (dVar.k()) {
            case 1:
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) dVar.l(), true), i2, i3, 33);
                break;
            case 2:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.l()), i2, i3, 33);
                break;
            case 3:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.l() / 100.0f), i2, i3, 33);
                break;
        }
    }

    private static String d(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        return H.b(strTrim, "[ \\.]")[0];
    }

    private static void a(List<d> list, String str, a aVar, List<b> list2) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = list.get(i2);
            int iA = dVar.a(str, aVar.f3261b, aVar.f3264e, aVar.f3263d);
            if (iA > 0) {
                list2.add(new b(iA, dVar));
            }
        }
        Collections.sort(list2);
    }

    private static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public final int f3265a;

        /* renamed from: b, reason: collision with root package name */
        public final d f3266b;

        public b(int i2, d dVar) {
            this.f3265a = i2;
            this.f3266b = dVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return this.f3265a - bVar.f3265a;
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final String[] f3260a = new String[0];

        /* renamed from: b, reason: collision with root package name */
        public final String f3261b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3262c;

        /* renamed from: d, reason: collision with root package name */
        public final String f3263d;

        /* renamed from: e, reason: collision with root package name */
        public final String[] f3264e;

        private a(String str, int i2, String str2, String[] strArr) {
            this.f3262c = i2;
            this.f3261b = str;
            this.f3263d = str2;
            this.f3264e = strArr;
        }

        public static a a(String str, int i2) {
            String str2;
            String[] strArr;
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return null;
            }
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrA = H.a(strTrim, "\\.");
            String str3 = strArrA[0];
            if (strArrA.length > 1) {
                strArr = (String[]) Arrays.copyOfRange(strArrA, 1, strArrA.length);
            } else {
                strArr = f3260a;
            }
            return new a(str3, i2, str2, strArr);
        }

        public static a a() {
            return new a("", 0, "", new String[0]);
        }
    }
}
