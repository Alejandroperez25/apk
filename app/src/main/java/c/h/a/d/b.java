package c.h.a.d;

/* loaded from: classes.dex */
public enum b {
    YUV420FLEXIBLE,
    YUV420PLANAR,
    YUV420SEMIPLANAR,
    YUV420PACKEDPLANAR,
    YUV420PACKEDSEMIPLANAR,
    YUV422FLEXIBLE,
    YUV422PLANAR,
    YUV422SEMIPLANAR,
    YUV422PACKEDPLANAR,
    YUV422PACKEDSEMIPLANAR,
    YUV444FLEXIBLE,
    YUV444INTERLEAVED,
    SURFACE,
    YUV420Dynamical;

    public int a() {
        switch (a.f4750a[ordinal()]) {
            case 1:
                return 2135033992;
            case 2:
                return 19;
            case 3:
                return 21;
            case 4:
                return 20;
            case 5:
                return 39;
            case 6:
                return 2135042184;
            case 7:
                return 22;
            case 8:
                return 24;
            case 9:
                return 23;
            case 10:
                return 40;
            case 11:
                return 2135181448;
            case 12:
                return 29;
            case 13:
                return 2130708361;
            default:
                return -1;
        }
    }
}
