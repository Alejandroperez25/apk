package c.d.a.a.m;

import android.text.TextUtils;
import b.a.a$i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList<a> f3546a = new ArrayList<>();

    private static final class a {
    }

    public static String a(int i2) {
        if (i2 == 35) {
            return "video/hevc";
        }
        if (i2 == 64) {
            return "audio/mp4a-latm";
        }
        if (i2 == 163) {
            return "video/wvc1";
        }
        if (i2 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        switch (i2) {
            case a$i.AppCompatTheme_activityChooserViewStyle /* 32 */:
                return "video/mp4v-es";
            case a$i.AppCompatTheme_alertDialogButtonGroupStyle /* 33 */:
                return "video/avc";
            default:
                switch (i2) {
                    case a$i.AppCompatTheme_textAppearanceLargePopupMenu /* 96 */:
                    case a$i.AppCompatTheme_textAppearanceListItem /* 97 */:
                    case a$i.AppCompatTheme_textAppearanceListItemSecondary /* 98 */:
                    case a$i.AppCompatTheme_textAppearanceListItemSmall /* 99 */:
                    case a$i.AppCompatTheme_textAppearancePopupMenuHeader /* 100 */:
                    case a$i.AppCompatTheme_textAppearanceSearchResultSubtitle /* 101 */:
                        return "video/mpeg2";
                    case a$i.AppCompatTheme_textAppearanceSearchResultTitle /* 102 */:
                    case a$i.AppCompatTheme_textAppearanceSmallPopupMenu /* 103 */:
                    case a$i.AppCompatTheme_textColorAlertDialogListItem /* 104 */:
                        return "audio/mp4a-latm";
                    case a$i.AppCompatTheme_textColorSearchUrl /* 105 */:
                    case a$i.AppCompatTheme_toolbarStyle /* 107 */:
                        return "audio/mpeg";
                    case a$i.AppCompatTheme_toolbarNavigationButtonStyle /* 106 */:
                        return "video/mpeg";
                    default:
                        switch (i2) {
                            case 165:
                                return "audio/ac3";
                            case 166:
                                return "audio/eac3";
                            default:
                                switch (i2) {
                                    case 169:
                                    case 172:
                                        return "audio/vnd.dts";
                                    case 170:
                                    case 171:
                                        return "audio/vnd.dts.hd";
                                    case 173:
                                        return "audio/opus";
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static boolean a(String str) {
        return "audio".equals(j(str));
    }

    public static boolean b(String str) {
        return "video".equals(j(str));
    }

    public static boolean c(String str) {
        return "text".equals(j(str));
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : H.j(str)) {
            String strF = f(str2);
            if (strF != null && b(strF)) {
                return strF;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : H.j(str)) {
            String strF = f(str2);
            if (strF != null && a(strF)) {
                return strF;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String f(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.m.r.f(java.lang.String):java.lang.String");
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if (c(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        return l(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int h(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 5
            r2 = 0
            switch(r0) {
                case -2123537834: goto L3c;
                case -1095064472: goto L32;
                case 187078296: goto L28;
                case 1504578661: goto L1e;
                case 1505942594: goto L14;
                case 1556697186: goto La;
                default: goto L9;
            }
        L9:
            goto L46
        La:
            java.lang.String r0 = "audio/true-hd"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
            r3 = 5
            goto L47
        L14:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
            r3 = 4
            goto L47
        L1e:
            java.lang.String r0 = "audio/eac3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
            r3 = 1
            goto L47
        L28:
            java.lang.String r0 = "audio/ac3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
            r3 = 0
            goto L47
        L32:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
            r3 = 3
            goto L47
        L3c:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
            r3 = 2
            goto L47
        L46:
            r3 = -1
        L47:
            switch(r3) {
                case 0: goto L55;
                case 1: goto L53;
                case 2: goto L53;
                case 3: goto L51;
                case 4: goto L4e;
                case 5: goto L4b;
                default: goto L4a;
            }
        L4a:
            return r2
        L4b:
            r3 = 14
            return r3
        L4e:
            r3 = 8
            return r3
        L51:
            r3 = 7
            return r3
        L53:
            r3 = 6
            return r3
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.m.r.h(java.lang.String):int");
    }

    public static int i(String str) {
        return g(f(str));
    }

    private static String j(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Invalid mime type: " + str);
        }
        return str.substring(0, iIndexOf);
    }

    private static String k(String str) {
        int size = f3546a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = f3546a.get(i2);
            if (str.startsWith(aVar.codecPrefix)) {
                return aVar.mimeType;
            }
        }
        return null;
    }

    private static int l(String str) {
        int size = f3546a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = f3546a.get(i2);
            if (str.equals(aVar.mimeType)) {
                return aVar.trackType;
            }
        }
        return -1;
    }
}
