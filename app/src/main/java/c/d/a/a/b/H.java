package c.d.a.a.b;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1535a = c.d.a.a.m.H.h("RIFF");

    /* renamed from: b, reason: collision with root package name */
    public static final int f1536b = c.d.a.a.m.H.h("WAVE");

    /* renamed from: c, reason: collision with root package name */
    public static final int f1537c = c.d.a.a.m.H.h("fmt ");

    /* renamed from: d, reason: collision with root package name */
    public static final int f1538d = c.d.a.a.m.H.h("data");

    public static int a(int i2, int i3) {
        if (i2 != 1) {
            if (i2 == 3) {
                return i3 == 32 ? 4 : 0;
            }
            if (i2 != 65534) {
                switch (i2) {
                    case 6:
                        return 536870912;
                    case 7:
                        return 268435456;
                    default:
                        return 0;
                }
            }
        }
        return c.d.a.a.m.H.b(i3);
    }
}
