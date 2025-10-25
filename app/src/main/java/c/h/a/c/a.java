package c.h.a.c;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c.h.a.c.a$a, reason: collision with other inner class name */
    public enum EnumC0054a {
        FIRST_COMPATIBLE_FOUND,
        SOFTWARE,
        HARDWARE
    }

    public static List<MediaCodecInfo> a(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            arrayList.addAll(Arrays.asList(new MediaCodecList(1).getCodecInfos()));
        } else {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i2 = 0; i2 < codecCount; i2++) {
                arrayList.add(MediaCodecList.getCodecInfoAt(i2));
            }
        }
        return z ? a(arrayList) : arrayList;
    }

    public static List<MediaCodecInfo> a(String str) {
        List<MediaCodecInfo> listC = c(str);
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : listC) {
            String lowerCase = mediaCodecInfo.getName().toLowerCase();
            if (!lowerCase.contains("omx.google") && !lowerCase.contains("sw")) {
                arrayList.add(mediaCodecInfo);
            }
        }
        return arrayList;
    }

    public static List<MediaCodecInfo> b(String str) {
        List<MediaCodecInfo> listC = c(str);
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : listC) {
            String lowerCase = mediaCodecInfo.getName().toLowerCase();
            if (lowerCase.contains("omx.google") || lowerCase.contains("sw")) {
                arrayList.add(mediaCodecInfo);
            }
        }
        return arrayList;
    }

    public static List<MediaCodecInfo> c(String str) {
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : a(true)) {
            if (mediaCodecInfo.isEncoder()) {
                for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        arrayList.add(mediaCodecInfo);
                    }
                }
            }
        }
        return arrayList;
    }

    private static List<MediaCodecInfo> a(List<MediaCodecInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : list) {
            if (d(mediaCodecInfo.getName())) {
                arrayList.add(mediaCodecInfo);
            }
        }
        return arrayList;
    }

    private static boolean d(String str) {
        return ((str.equals("OMX.qcom.video.encoder.avc") || str.equals("c2.qti.avc.encoder")) && Build.MODEL.equals("Pixel 3a")) ? false : true;
    }
}
