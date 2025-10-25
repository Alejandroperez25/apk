package c.d.a.a.i.d.a;

import android.net.Uri;
import android.util.Base64;
import c.d.a.a.AbstractC0132d;
import c.d.a.a.d.f;
import c.d.a.a.e.e.m;
import c.d.a.a.i.H;
import c.d.a.a.i.d.a.d;
import c.d.a.a.i.d.a.e;
import c.d.a.a.l.D;
import c.d.a.a.x;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g implements D.a<f> {
    private final d G;

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f2793a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f2794b = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f2795c = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f2796d = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f2797e = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f2798f = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f2799g = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f2800h = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f2801i = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern j = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern k = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern l = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern m = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern n = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern o = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern p = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern q = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern r = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern s = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern t = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern u = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern v = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern w = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern x = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern y = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern z = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern A = b("AUTOSELECT");
    private static final Pattern B = b("DEFAULT");
    private static final Pattern C = b("FORCED");
    private static final Pattern D = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern E = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern F = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public g() {
        this(d.f2767d);
    }

    public g(d dVar) {
        this.G = dVar;
    }

    @Override // c.d.a.a.l.D.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(Uri uri, InputStream inputStream) throws IOException {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!a(bufferedReader)) {
                throw new H("Input does not start with the #EXTM3U header.", uri);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    strTrim = line.trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                            arrayDeque.add(strTrim);
                            return a(new a(arrayDeque, bufferedReader), uri.toString());
                        }
                        if (strTrim.startsWith("#EXT-X-TARGETDURATION") || strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") || strTrim.startsWith("#EXTINF") || strTrim.startsWith("#EXT-X-KEY") || strTrim.startsWith("#EXT-X-BYTERANGE") || strTrim.equals("#EXT-X-DISCONTINUITY") || strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || strTrim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(strTrim);
                    }
                } else {
                    c.d.a.a.m.H.a((Closeable) bufferedReader);
                    throw new x("Failed to parse the playlist, could not identify any tags.");
                }
            }
            arrayDeque.add(strTrim);
            return a(this.G, new a(arrayDeque, bufferedReader), uri.toString());
        } finally {
            c.d.a.a.m.H.a((Closeable) bufferedReader);
        }
    }

    private static boolean a(BufferedReader bufferedReader) throws IOException {
        int i2 = bufferedReader.read();
        if (i2 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i2 = bufferedReader.read();
        }
        int iA = a(bufferedReader, true, i2);
        int length = "#EXTM3U".length();
        int i3 = iA;
        for (int i4 = 0; i4 < length; i4++) {
            if (i3 != "#EXTM3U".charAt(i4)) {
                return false;
            }
            i3 = bufferedReader.read();
        }
        return c.d.a.a.m.H.a(a(bufferedReader, false, i3));
    }

    private static int a(BufferedReader bufferedReader, boolean z2, int i2) throws IOException {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !c.d.a.a.m.H.a(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019b  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static c.d.a.a.i.d.a.d a(c.d.a.a.i.d.a.g.a r42, java.lang.String r43) throws c.d.a.a.x, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.i.d.a.g.a(c.d.a.a.i.d.a.g$a, java.lang.String):c.d.a.a.i.d.a.d");
    }

    private static e a(d dVar, a aVar, String str) throws x, NumberFormatException {
        String hexString;
        TreeMap treeMap;
        c.d.a.a.d.f fVar;
        f.a aVarA;
        d dVar2 = dVar;
        boolean z2 = dVar2.f2792c;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TreeMap treeMap2 = new TreeMap();
        long jC = -9223372036854775807L;
        int i2 = 0;
        int i3 = 1;
        boolean z3 = z2;
        String strA = "";
        long jA = -9223372036854775807L;
        int i4 = 0;
        String str2 = null;
        long jB = 0;
        boolean z4 = false;
        int i5 = 0;
        long j2 = 0;
        int iA = 1;
        boolean z5 = false;
        c.d.a.a.d.f fVar2 = null;
        long j3 = 0;
        long jB2 = 0;
        c.d.a.a.d.f fVar3 = null;
        boolean z6 = false;
        long j4 = -1;
        int i6 = 0;
        long j5 = 0;
        String strA2 = null;
        String str3 = null;
        e.a aVar2 = null;
        loop0: while (true) {
            long j6 = 0;
            while (aVar.a()) {
                String strB = aVar.b();
                if (strB.startsWith("#EXT")) {
                    arrayList2.add(strB);
                }
                if (strB.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String strA3 = a(strB, j, map);
                    if ("VOD".equals(strA3)) {
                        i4 = 1;
                    } else if ("EVENT".equals(strA3)) {
                        i4 = 2;
                    }
                } else if (strB.startsWith("#EXT-X-START")) {
                    jC = (long) (c(strB, n) * 1000000.0d);
                } else if (strB.startsWith("#EXT-X-MAP")) {
                    String strA4 = a(strB, t, map);
                    String strB2 = b(strB, p, map);
                    if (strB2 != null) {
                        String[] strArrSplit = strB2.split("@");
                        j4 = Long.parseLong(strArrSplit[i2]);
                        if (strArrSplit.length > i3) {
                            j3 = Long.parseLong(strArrSplit[i3]);
                        }
                    }
                    aVar2 = new e.a(strA4, j3, j4);
                    j3 = 0;
                    j4 = -1;
                } else if (strB.startsWith("#EXT-X-TARGETDURATION")) {
                    jA = 1000000 * a(strB, f2800h);
                } else if (strB.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    jB2 = b(strB, k);
                    j2 = jB2;
                } else if (strB.startsWith("#EXT-X-VERSION")) {
                    iA = a(strB, f2801i);
                } else {
                    if (strB.startsWith("#EXT-X-DEFINE")) {
                        String strB3 = b(strB, E, map);
                        if (strB3 != null) {
                            String str4 = dVar2.j.get(strB3);
                            if (str4 != null) {
                                map.put(strB3, str4);
                            }
                        } else {
                            map.put(a(strB, x, map), a(strB, D, map));
                        }
                    } else if (strB.startsWith("#EXTINF")) {
                        long jC2 = (long) (c(strB, l) * 1000000.0d);
                        strA = a(strB, m, "", map);
                        j6 = jC2;
                    } else if (strB.startsWith("#EXT-X-KEY")) {
                        String strA5 = a(strB, q, map);
                        String strA6 = a(strB, r, "identity", map);
                        if ("NONE".equals(strA5)) {
                            treeMap2.clear();
                            fVar3 = null;
                            strA2 = null;
                            str3 = null;
                        } else {
                            String strB4 = b(strB, u, map);
                            if ("identity".equals(strA6)) {
                                if ("AES-128".equals(strA5)) {
                                    strA2 = a(strB, t, map);
                                    str3 = strB4;
                                }
                            } else {
                                if (str2 == null) {
                                    str2 = ("SAMPLE-AES-CENC".equals(strA5) || "SAMPLE-AES-CTR".equals(strA5)) ? "cenc" : "cbcs";
                                }
                                if ("com.microsoft.playready".equals(strA6)) {
                                    aVarA = b(strB, map);
                                } else {
                                    aVarA = a(strB, strA6, map);
                                }
                                if (aVarA != null) {
                                    treeMap2.put(strA6, aVarA);
                                    str3 = strB4;
                                    fVar3 = null;
                                }
                                strA2 = null;
                            }
                            str3 = strB4;
                            strA2 = null;
                        }
                    } else if (strB.startsWith("#EXT-X-BYTERANGE")) {
                        String[] strArrSplit2 = a(strB, o, map).split("@");
                        j4 = Long.parseLong(strArrSplit2[i2]);
                        if (strArrSplit2.length > i3) {
                            j3 = Long.parseLong(strArrSplit2[i3]);
                        }
                    } else if (strB.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                        i5 = Integer.parseInt(strB.substring(strB.indexOf(58) + i3));
                        z4 = true;
                    } else if (strB.equals("#EXT-X-DISCONTINUITY")) {
                        i6++;
                    } else if (strB.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                        if (jB == 0) {
                            jB = AbstractC0132d.b(c.d.a.a.m.H.g(strB.substring(strB.indexOf(58) + i3))) - j5;
                        }
                    } else if (strB.equals("#EXT-X-GAP")) {
                        z6 = true;
                    } else if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                        z3 = true;
                    } else if (strB.equals("#EXT-X-ENDLIST")) {
                        z5 = true;
                    } else if (!strB.startsWith("#")) {
                        if (strA2 == null) {
                            hexString = null;
                        } else {
                            hexString = str3 != null ? str3 : Long.toHexString(jB2);
                        }
                        long j7 = jB2 + 1;
                        if (j4 == -1) {
                            j3 = 0;
                        }
                        if (fVar3 != null || treeMap2.isEmpty()) {
                            treeMap = treeMap2;
                            fVar = fVar3;
                        } else {
                            f.a[] aVarArr = (f.a[]) treeMap2.values().toArray(new f.a[i2]);
                            fVar = new c.d.a.a.d.f(str2, aVarArr);
                            if (fVar2 == null) {
                                f.a[] aVarArr2 = new f.a[aVarArr.length];
                                int i7 = 0;
                                while (i7 < aVarArr.length) {
                                    aVarArr2[i7] = aVarArr[i7].a((byte[]) null);
                                    i7++;
                                    treeMap2 = treeMap2;
                                }
                                treeMap = treeMap2;
                                fVar2 = new c.d.a.a.d.f(str2, aVarArr2);
                            } else {
                                treeMap = treeMap2;
                            }
                        }
                        arrayList.add(new e.a(c(strB, map), aVar2, strA, j6, i6, j5, fVar, strA2, hexString, j3, j4, z6));
                        j5 += j6;
                        strA = "";
                        if (j4 != -1) {
                            j3 += j4;
                        }
                        jB2 = j7;
                        fVar3 = fVar;
                        treeMap2 = treeMap;
                        dVar2 = dVar;
                        i2 = 0;
                        i3 = 1;
                        z6 = false;
                        j4 = -1;
                    }
                    treeMap2 = treeMap2;
                    dVar2 = dVar;
                    i2 = 0;
                    i3 = 1;
                }
            }
            break loop0;
        }
        return new e(i4, str, arrayList2, jC, jB, z4, i5, j2, iA, jA, z3, z5, jB != 0, fVar2, arrayList);
    }

    private static int a(String str) {
        int i2 = a(str, B, false) ? 1 : 0;
        if (a(str, C, false)) {
            i2 |= 2;
        }
        return a(str, A, false) ? i2 | 4 : i2;
    }

    private static int a(String str, Map<String, String> map) {
        String strB = b(str, f2796d, map);
        if (strB != null) {
            return Integer.parseInt(c.d.a.a.m.H.b(strB, "/")[0]);
        }
        return -1;
    }

    private static f.a b(String str, Map<String, String> map) throws x {
        if (!"1".equals(a(str, s, "1", map))) {
            return null;
        }
        String strA = a(str, t, map);
        return new f.a(AbstractC0132d.f1703e, "video/mp4", m.a(AbstractC0132d.f1703e, Base64.decode(strA.substring(strA.indexOf(44)), 0)));
    }

    private static f.a a(String str, String str2, Map<String, String> map) throws x {
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strA = a(str, t, map);
            return new f.a(AbstractC0132d.f1702d, "video/mp4", Base64.decode(strA.substring(strA.indexOf(44)), 0));
        }
        if (!"com.widevine".equals(str2)) {
            return null;
        }
        try {
            return new f.a(AbstractC0132d.f1702d, "hls", str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new x(e2);
        }
    }

    private static int a(String str, Pattern pattern) {
        return Integer.parseInt(a(str, pattern, (Map<String, String>) Collections.emptyMap()));
    }

    private static long b(String str, Pattern pattern) {
        return Long.parseLong(a(str, pattern, (Map<String, String>) Collections.emptyMap()));
    }

    private static double c(String str, Pattern pattern) {
        return Double.parseDouble(a(str, pattern, (Map<String, String>) Collections.emptyMap()));
    }

    private static String a(String str, Pattern pattern, Map<String, String> map) throws x {
        String strB = b(str, pattern, map);
        if (strB != null) {
            return strB;
        }
        throw new x("Couldn't match " + pattern.pattern() + " in " + str);
    }

    private static String b(String str, Pattern pattern, Map<String, String> map) {
        return a(str, pattern, null, map);
    }

    private static String a(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        return (map.isEmpty() || str2 == null) ? str2 : c(str2, map);
    }

    private static String c(String str, Map<String, String> map) {
        Matcher matcher = F.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static boolean a(String str, Pattern pattern, boolean z2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z2;
    }

    private static Pattern b(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static boolean a(List<d.a> list, String str) {
        if (str == null) {
            return true;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (str.equals(list.get(i2).f2773a)) {
                return true;
            }
        }
        return false;
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final BufferedReader f2802a;

        /* renamed from: b, reason: collision with root package name */
        private final Queue<String> f2803b;

        /* renamed from: c, reason: collision with root package name */
        private String f2804c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f2803b = queue;
            this.f2802a = bufferedReader;
        }

        public boolean a() throws IOException {
            if (this.f2804c != null) {
                return true;
            }
            if (!this.f2803b.isEmpty()) {
                this.f2804c = this.f2803b.poll();
                return true;
            }
            do {
                String line = this.f2802a.readLine();
                this.f2804c = line;
                if (line == null) {
                    return false;
                }
                this.f2804c = this.f2804c.trim();
            } while (this.f2804c.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                return null;
            }
            String str = this.f2804c;
            this.f2804c = null;
            return str;
        }
    }
}
