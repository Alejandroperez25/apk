package g.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i extends h {
    public static boolean a(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean b(String str, String str2, boolean z) {
        g.b.a.c.b(str, "$this$startsWith");
        g.b.a.c.b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return a(str, 0, str2, 0, str2.length(), z);
    }

    public static boolean c(String str, String str2, boolean z) {
        g.b.a.c.b(str, "$this$endsWith");
        g.b.a.c.b(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return a(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean a(String str, int i2, String str2, int i3, int i4, boolean z) {
        g.b.a.c.b(str, "$this$regionMatches");
        g.b.a.c.b(str2, "other");
        if (!z) {
            return str.regionMatches(i2, str2, i3, i4);
        }
        return str.regionMatches(z, i2, str2, i3, i4);
    }
}
