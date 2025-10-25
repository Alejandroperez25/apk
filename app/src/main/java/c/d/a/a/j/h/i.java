package c.d.a.a.j.h;

import c.d.a.a.m.H;
import c.d.a.a.m.u;
import c.d.a.a.x;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f3267a = Pattern.compile("^NOTE(( |\t).*)?$");

    public static void a(u uVar) throws x {
        int iD = uVar.d();
        if (b(uVar)) {
            return;
        }
        uVar.c(iD);
        throw new x("Expected WEBVTT. Got " + uVar.A());
    }

    public static boolean b(u uVar) {
        String strA = uVar.A();
        return strA != null && strA.startsWith("WEBVTT");
    }

    public static long a(String str) {
        String[] strArrB = H.b(str, "\\.");
        long j = 0;
        for (String str2 : H.a(strArrB[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrB.length == 2) {
            j2 += Long.parseLong(strArrB[1]);
        }
        return j2 * 1000;
    }

    public static float b(String str) {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    public static Matcher c(u uVar) {
        String strA;
        while (true) {
            String strA2 = uVar.A();
            if (strA2 == null) {
                return null;
            }
            if (f3267a.matcher(strA2).matches()) {
                do {
                    strA = uVar.A();
                    if (strA != null) {
                    }
                } while (!strA.isEmpty());
            } else {
                Matcher matcher = g.f3257a.matcher(strA2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
