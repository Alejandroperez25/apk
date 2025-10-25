package c.d.a.a.f;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.m.o;
import c.d.a.a.m.r;
import c.d.a.a.q;

@TargetApi(16)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2365a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2366b;

    /* renamed from: c, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f2367c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2368d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2369e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2370f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2371g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f2372h;

    public static a a(String str) {
        return new a(str, null, null, true, false, false);
    }

    public static a a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new a(str, str2, codecCapabilities, false, z, z2);
    }

    private a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        AbstractC0170e.a(str);
        this.f2365a = str;
        this.f2366b = str2;
        this.f2367c = codecCapabilities;
        this.f2371g = z;
        boolean z4 = true;
        this.f2368d = (z2 || codecCapabilities == null || !a(codecCapabilities)) ? false : true;
        this.f2369e = codecCapabilities != null && c(codecCapabilities);
        if (!z3 && (codecCapabilities == null || !e(codecCapabilities))) {
            z4 = false;
        }
        this.f2370f = z4;
        this.f2372h = r.b(str2);
    }

    public String toString() {
        return this.f2365a;
    }

    public MediaCodecInfo.CodecProfileLevel[] a() {
        return (this.f2367c == null || this.f2367c.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.f2367c.profileLevels;
    }

    public boolean a(q qVar) {
        if (!b(qVar.f3679d)) {
            return false;
        }
        if (this.f2372h) {
            if (qVar.l <= 0 || qVar.m <= 0) {
                return true;
            }
            if (H.f3499a >= 21) {
                return a(qVar.l, qVar.m, qVar.n);
            }
            boolean z = qVar.l * qVar.m <= g.b();
            if (!z) {
                c("legacyFrameSize, " + qVar.l + "x" + qVar.m);
            }
            return z;
        }
        if (H.f3499a >= 21) {
            if (qVar.u != -1 && !a(qVar.u)) {
                return false;
            }
            if (qVar.t != -1 && !b(qVar.t)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(String str) {
        String strF;
        if (str == null || this.f2366b == null || (strF = r.f(str)) == null) {
            return true;
        }
        if (!this.f2366b.equals(strF)) {
            c("codec.mime " + str + ", " + strF);
            return false;
        }
        Pair<Integer, Integer> pairA = g.a(str);
        if (pairA == null) {
            return true;
        }
        int iIntValue = ((Integer) pairA.first).intValue();
        int iIntValue2 = ((Integer) pairA.second).intValue();
        if (!this.f2372h && iIntValue != 42) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                return true;
            }
        }
        c("codec.profileLevel, " + str + ", " + strF);
        return false;
    }

    public boolean b(q qVar) {
        if (this.f2372h) {
            return this.f2368d;
        }
        Pair<Integer, Integer> pairA = g.a(qVar.f3679d);
        return pairA != null && ((Integer) pairA.first).intValue() == 42;
    }

    public boolean a(q qVar, q qVar2, boolean z) {
        if (this.f2372h) {
            return qVar.f3682g.equals(qVar2.f3682g) && qVar.o == qVar2.o && (this.f2368d || (qVar.l == qVar2.l && qVar.m == qVar2.m)) && ((!z && qVar2.s == null) || H.a(qVar.s, qVar2.s));
        }
        if (!"audio/mp4a-latm".equals(this.f2366b) || !qVar.f3682g.equals(qVar2.f3682g) || qVar.t != qVar2.t || qVar.u != qVar2.u) {
            return false;
        }
        Pair<Integer, Integer> pairA = g.a(qVar.f3679d);
        Pair<Integer, Integer> pairA2 = g.a(qVar2.f3679d);
        if (pairA == null || pairA2 == null) {
            return false;
        }
        return ((Integer) pairA.first).intValue() == 42 && ((Integer) pairA2.first).intValue() == 42;
    }

    @TargetApi(21)
    public boolean a(int i2, int i3, double d2) {
        if (this.f2367c == null) {
            c("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f2367c.getVideoCapabilities();
        if (videoCapabilities == null) {
            c("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i2, i3, d2)) {
            return true;
        }
        if (i2 >= i3 || !a(videoCapabilities, i3, i2, d2)) {
            c("sizeAndRate.support, " + i2 + "x" + i3 + "x" + d2);
            return false;
        }
        d("sizeAndRate.rotated, " + i2 + "x" + i3 + "x" + d2);
        return true;
    }

    @TargetApi(21)
    public Point a(int i2, int i3) {
        if (this.f2367c == null) {
            c("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f2367c.getVideoCapabilities();
        if (videoCapabilities == null) {
            c("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(H.a(i2, widthAlignment) * widthAlignment, H.a(i3, heightAlignment) * heightAlignment);
    }

    @TargetApi(21)
    public boolean a(int i2) {
        if (this.f2367c == null) {
            c("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.f2367c.getAudioCapabilities();
        if (audioCapabilities == null) {
            c("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i2)) {
            return true;
        }
        c("sampleRate.support, " + i2);
        return false;
    }

    @TargetApi(21)
    public boolean b(int i2) {
        if (this.f2367c == null) {
            c("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.f2367c.getAudioCapabilities();
        if (audioCapabilities == null) {
            c("channelCount.aCaps");
            return false;
        }
        if (a(this.f2365a, this.f2366b, audioCapabilities.getMaxInputChannelCount()) >= i2) {
            return true;
        }
        c("channelCount.support, " + i2);
        return false;
    }

    private void c(String str) {
        o.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f2365a + ", " + this.f2366b + "] [" + H.f3503e + "]");
    }

    private void d(String str) {
        o.a("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f2365a + ", " + this.f2366b + "] [" + H.f3503e + "]");
    }

    private static int a(String str, String str2, int i2) {
        int i3;
        if (i2 > 1 || ((H.f3499a >= 26 && i2 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i2;
        }
        if ("audio/ac3".equals(str2)) {
            i3 = 6;
        } else {
            i3 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        o.c("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i2 + " to " + i3 + "]");
        return i3;
    }

    private static boolean a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return H.f3499a >= 19 && b(codecCapabilities);
    }

    @TargetApi(19)
    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return H.f3499a >= 21 && d(codecCapabilities);
    }

    @TargetApi(21)
    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return H.f3499a >= 21 && f(codecCapabilities);
    }

    @TargetApi(21)
    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @TargetApi(21)
    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        if (d2 == -1.0d || d2 <= 0.0d) {
            return videoCapabilities.isSizeSupported(i2, i3);
        }
        return videoCapabilities.areSizeAndRateSupported(i2, i3, d2);
    }
}
