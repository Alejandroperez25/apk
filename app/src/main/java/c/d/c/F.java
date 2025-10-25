package c.d.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f4103a = new D("DEFAULT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final F f4104b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ F[] f4105c;

    private F(String str, int i2) {
    }

    /* synthetic */ F(String str, int i2, D d2) {
        this(str, i2);
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f4105c.clone();
    }

    static {
        final String str = "STRING";
        final int i2 = 1;
        f4104b = new F(str, i2) { // from class: c.d.c.E
            {
                D d2 = null;
            }
        };
        f4105c = new F[]{f4103a, f4104b};
    }
}
