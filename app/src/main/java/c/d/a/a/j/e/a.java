package c.d.a.a.j.e;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import c.d.a.a.m.o;
import c.d.a.a.m.p;
import c.d.a.a.m.u;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a extends c.d.a.a.j.b {
    private static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    private static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder q;
    private final ArrayList<String> r;

    static float b(int i2) {
        switch (i2) {
            case 0:
                return 0.08f;
            case 1:
                return 0.5f;
            default:
                return 0.92f;
        }
    }

    public a() {
        super("SubripDecoder");
        this.q = new StringBuilder();
        this.r = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.a.a.j.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b a(byte[] bArr, int i2, boolean z) throws NumberFormatException {
        String str;
        ArrayList arrayList = new ArrayList();
        p pVar = new p();
        u uVar = new u(bArr, i2);
        while (true) {
            String strA = uVar.A();
            if (strA == null) {
                break;
            }
            if (strA.length() != 0) {
                try {
                    Integer.parseInt(strA);
                    String strA2 = uVar.A();
                    if (strA2 == null) {
                        o.c("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = o.matcher(strA2);
                    if (matcher.matches()) {
                        boolean z2 = true;
                        pVar.a(a(matcher, 1));
                        int i3 = 0;
                        if (TextUtils.isEmpty(matcher.group(6))) {
                            z2 = false;
                        } else {
                            pVar.a(a(matcher, 6));
                        }
                        this.q.setLength(0);
                        this.r.clear();
                        while (true) {
                            String strA3 = uVar.A();
                            if (TextUtils.isEmpty(strA3)) {
                                break;
                            }
                            if (this.q.length() > 0) {
                                this.q.append("<br>");
                            }
                            this.q.append(a(strA3, this.r));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.q.toString());
                        while (true) {
                            if (i3 >= this.r.size()) {
                                str = null;
                                break;
                            }
                            str = this.r.get(i3);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i3++;
                        }
                        arrayList.add(a(spannedFromHtml, str));
                        if (z2) {
                            arrayList.add(null);
                        }
                    } else {
                        o.c("SubripDecoder", "Skipping invalid timing: " + strA2);
                    }
                } catch (NumberFormatException unused) {
                    o.c("SubripDecoder", "Skipping invalid index: " + strA);
                }
            }
        }
        c.d.a.a.j.a[] aVarArr = new c.d.a.a.j.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return new b(aVarArr, pVar.b());
    }

    private String a(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = p.matcher(strTrim);
        int i2 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i2;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i2 += length;
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private c.d.a.a.j.a a(android.text.Spanned r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.j.e.a.a(android.text.Spanned, java.lang.String):c.d.a.a.j.a");
    }

    private static long a(Matcher matcher, int i2) {
        return ((Long.parseLong(matcher.group(i2 + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i2 + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i2 + 3)) * 1000) + Long.parseLong(matcher.group(i2 + 4))) * 1000;
    }
}
