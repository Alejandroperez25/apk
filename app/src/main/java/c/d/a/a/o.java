package c.d.a.a;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f3674a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private static String f3675b = "goog.exo.core";

    public static synchronized String a() {
        return f3675b;
    }

    public static synchronized void a(String str) {
        if (f3674a.add(str)) {
            f3675b += ", " + str;
        }
    }
}
