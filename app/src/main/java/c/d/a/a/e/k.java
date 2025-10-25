package c.d.a.a.e;

import c.d.a.a.g.b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f2336a = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: b, reason: collision with root package name */
    public int f2337b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f2338c = -1;

    public boolean a(int i2) {
        int i3 = i2 >> 12;
        int i4 = i2 & 4095;
        if (i3 <= 0 && i4 <= 0) {
            return false;
        }
        this.f2337b = i3;
        this.f2338c = i4;
        return true;
    }

    public boolean a(c.d.a.a.g.b bVar) {
        for (int i2 = 0; i2 < bVar.f(); i2++) {
            b.a aVarA = bVar.a(i2);
            if (aVarA instanceof c.d.a.a.g.b.k) {
                c.d.a.a.g.b.k kVar = (c.d.a.a.g.b.k) aVarA;
                if ("iTunSMPB".equals(kVar.f2424b) && a(kVar.f2425c)) {
                    return true;
                }
            } else if (aVarA instanceof c.d.a.a.g.b.q) {
                c.d.a.a.g.b.q qVar = (c.d.a.a.g.b.q) aVarA;
                if ("com.apple.iTunes".equals(qVar.f2437a) && "iTunSMPB".equals(qVar.f2438b) && a(qVar.f2439c)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean a(String str) throws NumberFormatException {
        Matcher matcher = f2336a.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i2 = Integer.parseInt(matcher.group(1), 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f2337b = i2;
            this.f2338c = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f2337b == -1 || this.f2338c == -1) ? false : true;
    }
}
