package c.d.a.a.j.h;

import android.text.TextUtils;
import b.a.a$i;
import c.d.a.a.m.AbstractC0173h;
import c.d.a.a.m.H;
import c.d.a.a.m.u;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f3234a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: b, reason: collision with root package name */
    private final u f3235b = new u();

    /* renamed from: c, reason: collision with root package name */
    private final StringBuilder f3236c = new StringBuilder();

    public d c(u uVar) {
        this.f3236c.setLength(0);
        int iD = uVar.d();
        b(uVar);
        this.f3235b.a(uVar.f3567a, uVar.d());
        this.f3235b.c(iD);
        String strB = b(this.f3235b, this.f3236c);
        if (strB == null || !"{".equals(a(this.f3235b, this.f3236c))) {
            return null;
        }
        d dVar = new d();
        a(dVar, strB);
        String strA = null;
        boolean z = false;
        while (!z) {
            int iD2 = this.f3235b.d();
            strA = a(this.f3235b, this.f3236c);
            boolean z2 = strA == null || "}".equals(strA);
            if (!z2) {
                this.f3235b.c(iD2);
                a(this.f3235b, dVar, this.f3236c);
            }
            z = z2;
        }
        if ("}".equals(strA)) {
            return dVar;
        }
        return null;
    }

    private static String b(u uVar, StringBuilder sb) {
        a(uVar);
        if (uVar.b() < 5 || !"::cue".equals(uVar.e(5))) {
            return null;
        }
        int iD = uVar.d();
        String strA = a(uVar, sb);
        if (strA == null) {
            return null;
        }
        if ("{".equals(strA)) {
            uVar.c(iD);
            return "";
        }
        String strD = "(".equals(strA) ? d(uVar) : null;
        String strA2 = a(uVar, sb);
        if (!")".equals(strA2) || strA2 == null) {
            return null;
        }
        return strD;
    }

    private static String d(u uVar) {
        int iD = uVar.d();
        int iC = uVar.c();
        boolean z = false;
        while (iD < iC && !z) {
            int i2 = iD + 1;
            z = ((char) uVar.f3567a[iD]) == ')';
            iD = i2;
        }
        return uVar.e((iD - 1) - uVar.d()).trim();
    }

    private static void a(u uVar, d dVar, StringBuilder sb) {
        a(uVar);
        String strD = d(uVar, sb);
        if (!"".equals(strD) && ":".equals(a(uVar, sb))) {
            a(uVar);
            String strC = c(uVar, sb);
            if (strC == null || "".equals(strC)) {
                return;
            }
            int iD = uVar.d();
            String strA = a(uVar, sb);
            if (!";".equals(strA)) {
                if (!"}".equals(strA)) {
                    return;
                } else {
                    uVar.c(iD);
                }
            }
            if ("color".equals(strD)) {
                dVar.a(AbstractC0173h.b(strC));
                return;
            }
            if ("background-color".equals(strD)) {
                dVar.b(AbstractC0173h.b(strC));
                return;
            }
            if ("text-decoration".equals(strD)) {
                if ("underline".equals(strC)) {
                    dVar.a(true);
                }
            } else {
                if ("font-family".equals(strD)) {
                    dVar.d(strC);
                    return;
                }
                if ("font-weight".equals(strD)) {
                    if ("bold".equals(strC)) {
                        dVar.b(true);
                    }
                } else if ("font-style".equals(strD) && "italic".equals(strC)) {
                    dVar.c(true);
                }
            }
        }
    }

    static void a(u uVar) {
        while (true) {
            for (boolean z = true; uVar.b() > 0 && z; z = false) {
                if (e(uVar) || f(uVar)) {
                    break;
                }
            }
            return;
        }
    }

    static String a(u uVar, StringBuilder sb) {
        a(uVar);
        if (uVar.b() == 0) {
            return null;
        }
        String strD = d(uVar, sb);
        if (!"".equals(strD)) {
            return strD;
        }
        return "" + ((char) uVar.h());
    }

    private static boolean e(u uVar) {
        switch (a(uVar, uVar.d())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case a$i.AppCompatTheme_activityChooserViewStyle /* 32 */:
                uVar.d(1);
                return true;
            default:
                return false;
        }
    }

    static void b(u uVar) {
        while (!TextUtils.isEmpty(uVar.A())) {
        }
    }

    private static char a(u uVar, int i2) {
        return (char) uVar.f3567a[i2];
    }

    private static String c(u uVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iD = uVar.d();
            String strA = a(uVar, sb);
            if (strA == null) {
                return null;
            }
            if ("}".equals(strA) || ";".equals(strA)) {
                uVar.c(iD);
                z = true;
            } else {
                sb2.append(strA);
            }
        }
        return sb2.toString();
    }

    private static boolean f(u uVar) {
        int iD = uVar.d();
        int iC = uVar.c();
        byte[] bArr = uVar.f3567a;
        if (iD + 2 > iC) {
            return false;
        }
        int i2 = iD + 1;
        if (bArr[iD] != 47) {
            return false;
        }
        int i3 = i2 + 1;
        if (bArr[i2] != 42) {
            return false;
        }
        while (true) {
            int i4 = i3 + 1;
            if (i4 < iC) {
                if (((char) bArr[i3]) == '*' && ((char) bArr[i4]) == '/') {
                    i3 = i4 + 1;
                    iC = i3;
                } else {
                    i3 = i4;
                }
            } else {
                uVar.d(iC - uVar.d());
                return true;
            }
        }
    }

    private static String d(u uVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iD = uVar.d();
        int iC = uVar.c();
        while (iD < iC && !z) {
            char c2 = (char) uVar.f3567a[iD];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                iD++;
                sb.append(c2);
            }
        }
        uVar.d(iD - uVar.d());
        return sb.toString();
    }

    private void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f3234a.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                dVar.c(matcher.group(1));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrA = H.a(str, "\\.");
        String str2 = strArrA[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            dVar.b(str2.substring(0, iIndexOf2));
            dVar.a(str2.substring(iIndexOf2 + 1));
        } else {
            dVar.b(str2);
        }
        if (strArrA.length > 1) {
            dVar.a((String[]) Arrays.copyOfRange(strArrA, 1, strArrA.length));
        }
    }
}
