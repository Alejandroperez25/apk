package c.d.c.b;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private static final int f4243a = c();

    private static int c() {
        return a(System.getProperty("java.version"));
    }

    static int a(String str) throws NumberFormatException {
        int iB = b(str);
        if (iB == -1) {
            iB = c(str);
        }
        if (iB == -1) {
            return 6;
        }
        return iB;
    }

    private static int b(String str) throws NumberFormatException {
        try {
            String[] strArrSplit = str.split("[._]");
            int i2 = Integer.parseInt(strArrSplit[0]);
            return (i2 != 1 || strArrSplit.length <= 1) ? i2 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int c(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int a() {
        return f4243a;
    }

    public static boolean b() {
        return f4243a >= 9;
    }
}
