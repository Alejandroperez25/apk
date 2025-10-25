package c.d.a.a.f;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import b.a.a$i;
import c.d.a.a.m.H;
import c.d.a.a.m.o;
import c.d.a.a.m.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: d, reason: collision with root package name */
    private static final SparseIntArray f2383d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, Integer> f2384e;

    /* renamed from: f, reason: collision with root package name */
    private static final SparseIntArray f2385f;

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f2380a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<a, List<c.d.a.a.f.a>> f2381b = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static int f2386g = -1;

    /* renamed from: c, reason: collision with root package name */
    private static final SparseIntArray f2382c = new SparseIntArray();

    private interface c {
        int a();

        MediaCodecInfo a(int i2);

        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();
    }

    private static int a(int i2) {
        switch (i2) {
            case 1:
            case 2:
                return 25344;
            case 8:
            case 16:
            case a$i.AppCompatTheme_activityChooserViewStyle /* 32 */:
                return 101376;
            case a$i.AppCompatTheme_dropDownListViewStyle /* 64 */:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    public static class b extends Exception {
        private b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    static {
        f2382c.put(66, 1);
        f2382c.put(77, 2);
        f2382c.put(88, 4);
        f2382c.put(100, 8);
        f2382c.put(a$i.AppCompatTheme_viewInflaterClass, 16);
        f2382c.put(122, 32);
        f2382c.put(244, 64);
        f2383d = new SparseIntArray();
        f2383d.put(10, 1);
        f2383d.put(11, 4);
        f2383d.put(12, 8);
        f2383d.put(13, 16);
        f2383d.put(20, 32);
        f2383d.put(21, 64);
        f2383d.put(22, 128);
        f2383d.put(30, 256);
        f2383d.put(31, 512);
        f2383d.put(32, 1024);
        f2383d.put(40, 2048);
        f2383d.put(41, 4096);
        f2383d.put(42, 8192);
        f2383d.put(50, 16384);
        f2383d.put(51, 32768);
        f2383d.put(52, 65536);
        f2384e = new HashMap();
        f2384e.put("L30", 1);
        f2384e.put("L60", 4);
        f2384e.put("L63", 16);
        f2384e.put("L90", 64);
        f2384e.put("L93", 256);
        f2384e.put("L120", 1024);
        f2384e.put("L123", 4096);
        f2384e.put("L150", 16384);
        f2384e.put("L153", 65536);
        f2384e.put("L156", 262144);
        f2384e.put("L180", 1048576);
        f2384e.put("L183", 4194304);
        f2384e.put("L186", 16777216);
        f2384e.put("H30", 2);
        f2384e.put("H60", 8);
        f2384e.put("H63", 32);
        f2384e.put("H90", 128);
        f2384e.put("H93", 512);
        f2384e.put("H120", 2048);
        f2384e.put("H123", 8192);
        f2384e.put("H150", 32768);
        f2384e.put("H153", 131072);
        f2384e.put("H156", 524288);
        f2384e.put("H180", 2097152);
        f2384e.put("H183", 8388608);
        f2384e.put("H186", 33554432);
        f2385f = new SparseIntArray();
        f2385f.put(1, 1);
        f2385f.put(2, 2);
        f2385f.put(3, 3);
        f2385f.put(4, 4);
        f2385f.put(5, 5);
        f2385f.put(6, 6);
        f2385f.put(17, 17);
        f2385f.put(20, 20);
        f2385f.put(23, 23);
        f2385f.put(29, 29);
        f2385f.put(39, 39);
        f2385f.put(42, 42);
    }

    public static c.d.a.a.f.a a() {
        c.d.a.a.f.a aVarA = a("audio/raw", false);
        if (aVarA == null) {
            return null;
        }
        return c.d.a.a.f.a.a(aVarA.f2365a);
    }

    public static c.d.a.a.f.a a(String str, boolean z) {
        List<c.d.a.a.f.a> listB = b(str, z);
        if (listB.isEmpty()) {
            return null;
        }
        return listB.get(0);
    }

    public static synchronized List<c.d.a.a.f.a> b(String str, boolean z) {
        a aVar = new a(str, z);
        List<c.d.a.a.f.a> list = f2381b.get(aVar);
        if (list != null) {
            return list;
        }
        c eVar = H.f3499a >= 21 ? new e(z) : new d();
        ArrayList<c.d.a.a.f.a> arrayListA = a(aVar, eVar, str);
        if (z && arrayListA.isEmpty() && 21 <= H.f3499a && H.f3499a <= 23) {
            eVar = new d();
            arrayListA = a(aVar, eVar, str);
            if (!arrayListA.isEmpty()) {
                o.c("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListA.get(0).f2365a);
            }
        }
        if ("audio/eac3-joc".equals(str)) {
            arrayListA.addAll(a(new a("audio/eac3", aVar.f2388b), eVar, str));
        }
        a(str, arrayListA);
        List<c.d.a.a.f.a> listUnmodifiableList = Collections.unmodifiableList(arrayListA);
        f2381b.put(aVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static int b() {
        if (f2386g == -1) {
            int iMax = 0;
            c.d.a.a.f.a aVarA = a("video/avc", false);
            if (aVarA != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrA = aVarA.a();
                int length = codecProfileLevelArrA.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(a(codecProfileLevelArrA[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, H.f3499a >= 21 ? 345600 : 172800);
            }
            f2386g = iMax;
        }
        return f2386g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r6.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3006243: goto L3d;
                case 3006244: goto L33;
                case 3199032: goto L2a;
                case 3214780: goto L20;
                case 3356560: goto L16;
                default: goto L15;
            }
        L15:
            goto L47
        L16:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L47
            r2 = 4
            goto L48
        L20:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L47
            r2 = 1
            goto L48
        L2a:
            java.lang.String r5 = "hev1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L47
            goto L48
        L33:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L47
            r2 = 3
            goto L48
        L3d:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L47
            r2 = 2
            goto L48
        L47:
            r2 = -1
        L48:
            switch(r2) {
                case 0: goto L56;
                case 1: goto L56;
                case 2: goto L51;
                case 3: goto L51;
                case 4: goto L4c;
                default: goto L4b;
            }
        L4b:
            return r0
        L4c:
            android.util.Pair r6 = c(r6, r1)
            return r6
        L51:
            android.util.Pair r6 = b(r6, r1)
            return r6
        L56:
            android.util.Pair r6 = a(r6, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.f.g.a(java.lang.String):android.util.Pair");
    }

    private static ArrayList<c.d.a.a.f.a> a(a aVar, c cVar, String str) throws Exception {
        int i2;
        c cVar2 = cVar;
        try {
            ArrayList<c.d.a.a.f.a> arrayList = new ArrayList<>();
            String str2 = aVar.f2387a;
            int iA = cVar.a();
            boolean zB = cVar.b();
            int i3 = 0;
            while (i3 < iA) {
                MediaCodecInfo mediaCodecInfoA = cVar2.a(i3);
                String name = mediaCodecInfoA.getName();
                if (a(mediaCodecInfoA, name, zB, str)) {
                    String[] supportedTypes = mediaCodecInfoA.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i4 = 0;
                    while (i4 < length) {
                        String str3 = supportedTypes[i4];
                        if (str3.equalsIgnoreCase(str2)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(str3);
                                boolean zA = cVar2.a(str2, capabilitiesForType);
                                boolean zB2 = b(name);
                                if (zB) {
                                    i2 = iA;
                                    try {
                                        if (aVar.f2388b != zA) {
                                        }
                                        arrayList.add(c.d.a.a.f.a.a(name, str2, capabilitiesForType, zB2, false));
                                    } catch (Exception e2) {
                                        e = e2;
                                        if (H.f3499a <= 23 && !arrayList.isEmpty()) {
                                            o.d("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                            i4++;
                                            iA = i2;
                                            cVar2 = cVar;
                                        } else {
                                            o.d("MediaCodecUtil", "Failed to query codec " + name + " (" + str3 + ")");
                                            throw e;
                                        }
                                    }
                                } else {
                                    i2 = iA;
                                }
                                if (!zB && !aVar.f2388b) {
                                    arrayList.add(c.d.a.a.f.a.a(name, str2, capabilitiesForType, zB2, false));
                                } else if (!zB && zA) {
                                    arrayList.add(c.d.a.a.f.a.a(name + ".secure", str2, capabilitiesForType, zB2, true));
                                    return arrayList;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i2 = iA;
                            }
                        } else {
                            i2 = iA;
                        }
                        i4++;
                        iA = i2;
                        cVar2 = cVar;
                    }
                }
                i3++;
                iA = iA;
                cVar2 = cVar;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new b(e4);
        }
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (H.f3499a < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (H.f3499a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && ("a70".equals(H.f3500b) || ("Xiaomi".equals(H.f3501c) && H.f3500b.startsWith("HM")))) {
            return false;
        }
        if (H.f3499a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) && ("dlxu".equals(H.f3500b) || "protou".equals(H.f3500b) || "ville".equals(H.f3500b) || "villeplus".equals(H.f3500b) || "villec2".equals(H.f3500b) || H.f3500b.startsWith("gee") || "C6602".equals(H.f3500b) || "C6603".equals(H.f3500b) || "C6606".equals(H.f3500b) || "C6616".equals(H.f3500b) || "L36h".equals(H.f3500b) || "SO-02E".equals(H.f3500b))) {
            return false;
        }
        if (H.f3499a == 16 && "OMX.qcom.audio.decoder.aac".equals(str) && ("C1504".equals(H.f3500b) || "C1505".equals(H.f3500b) || "C1604".equals(H.f3500b) || "C1605".equals(H.f3500b))) {
            return false;
        }
        if (H.f3499a < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(H.f3501c) && (H.f3500b.startsWith("zeroflte") || H.f3500b.startsWith("zerolte") || H.f3500b.startsWith("zenlte") || "SC-05G".equals(H.f3500b) || "marinelteatt".equals(H.f3500b) || "404SC".equals(H.f3500b) || "SC-04G".equals(H.f3500b) || "SCV31".equals(H.f3500b)))) {
            return false;
        }
        if (H.f3499a <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(H.f3501c) && (H.f3500b.startsWith("d2") || H.f3500b.startsWith("serrano") || H.f3500b.startsWith("jflte") || H.f3500b.startsWith("santos") || H.f3500b.startsWith("t0"))) {
            return false;
        }
        if (H.f3499a <= 19 && H.f3500b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static void a(String str, List<c.d.a.a.f.a> list) {
        if ("audio/raw".equals(str)) {
            Collections.sort(list, new C0029g());
            return;
        }
        if (H.f3499a >= 21 || list.size() <= 1) {
            return;
        }
        String str2 = list.get(0).f2365a;
        if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
            Collections.sort(list, new f());
        }
    }

    private static boolean b(String str) {
        return H.f3499a <= 22 && ("ODROID-XU3".equals(H.f3502d) || "Nexus 10".equals(H.f3502d)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str));
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        int i2;
        if (strArr.length < 4) {
            o.c("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        Matcher matcher = f2380a.matcher(strArr[1]);
        if (!matcher.matches()) {
            o.c("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i2 = 1;
        } else {
            if (!"2".equals(strGroup)) {
                o.c("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i2 = 2;
        }
        Integer num = f2384e.get(strArr[3]);
        if (num == null) {
            o.c("MediaCodecUtil", "Unknown HEVC level string: " + matcher.group(1));
            return null;
        }
        return new Pair<>(Integer.valueOf(i2), num);
    }

    private static Pair<Integer, Integer> b(String str, String[] strArr) {
        Integer numValueOf;
        Integer numValueOf2;
        if (strArr.length < 2) {
            o.c("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                Integer numValueOf3 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
                numValueOf = numValueOf3;
            } else if (strArr.length >= 3) {
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                o.c("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int i2 = f2382c.get(numValueOf.intValue(), -1);
            if (i2 == -1) {
                o.c("MediaCodecUtil", "Unknown AVC profile: " + numValueOf);
                return null;
            }
            int i3 = f2383d.get(numValueOf2.intValue(), -1);
            if (i3 == -1) {
                o.c("MediaCodecUtil", "Unknown AVC level: " + numValueOf2);
                return null;
            }
            return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3));
        } catch (NumberFormatException unused) {
            o.c("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> c(String str, String[] strArr) throws NumberFormatException {
        if (strArr.length != 3) {
            o.c("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(r.a(Integer.parseInt(strArr[1], 16)))) {
                int i2 = f2385f.get(Integer.parseInt(strArr[2]), -1);
                if (i2 != -1) {
                    return new Pair<>(Integer.valueOf(i2), 0);
                }
            }
        } catch (NumberFormatException unused) {
            o.c("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    @TargetApi(21)
    private static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f2389a;

        /* renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f2390b;

        @Override // c.d.a.a.f.g.c
        public boolean b() {
            return true;
        }

        public e(boolean z) {
            this.f2389a = z ? 1 : 0;
        }

        @Override // c.d.a.a.f.g.c
        public int a() {
            c();
            return this.f2390b.length;
        }

        @Override // c.d.a.a.f.g.c
        public MediaCodecInfo a(int i2) {
            c();
            return this.f2390b[i2];
        }

        @Override // c.d.a.a.f.g.c
        public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        private void c() {
            if (this.f2390b == null) {
                this.f2390b = new MediaCodecList(this.f2389a).getCodecInfos();
            }
        }
    }

    private static final class d implements c {
        @Override // c.d.a.a.f.g.c
        public boolean b() {
            return false;
        }

        private d() {
        }

        @Override // c.d.a.a.f.g.c
        public int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // c.d.a.a.f.g.c
        public MediaCodecInfo a(int i2) {
            return MediaCodecList.getCodecInfoAt(i2);
        }

        @Override // c.d.a.a.f.g.c
        public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f2387a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f2388b;

        public a(String str, boolean z) {
            this.f2387a = str;
            this.f2388b = z;
        }

        public int hashCode() {
            return (((this.f2387a == null ? 0 : this.f2387a.hashCode()) + 31) * 31) + (this.f2388b ? 1231 : 1237);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.f2387a, aVar.f2387a) && this.f2388b == aVar.f2388b;
        }
    }

    /* renamed from: c.d.a.a.f.g$g, reason: collision with other inner class name */
    private static final class C0029g implements Comparator<c.d.a.a.f.a> {
        private C0029g() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c.d.a.a.f.a aVar, c.d.a.a.f.a aVar2) {
            return a(aVar) - a(aVar2);
        }

        private static int a(c.d.a.a.f.a aVar) {
            String str = aVar.f2365a;
            if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                return -1;
            }
            return (H.f3499a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : 1;
        }
    }

    private static final class f implements Comparator<c.d.a.a.f.a> {
        private f() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c.d.a.a.f.a aVar, c.d.a.a.f.a aVar2) {
            return a(aVar) - a(aVar2);
        }

        private static int a(c.d.a.a.f.a aVar) {
            return aVar.f2365a.startsWith("OMX.google") ? -1 : 0;
        }
    }
}
