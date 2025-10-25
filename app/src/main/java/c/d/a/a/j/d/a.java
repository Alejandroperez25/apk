package c.d.a.a.j.d;

import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.m.o;
import c.d.a.a.m.p;
import c.d.a.a.m.u;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a extends c.d.a.a.j.b {
    private static final Pattern o = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    private final boolean p;
    private int q;
    private int r;
    private int s;
    private int t;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        if (list != null && !list.isEmpty()) {
            this.p = true;
            String strA = H.a(list.get(0));
            AbstractC0170e.a(strA.startsWith("Format: "));
            b(strA);
            a(new u(list.get(1)));
            return;
        }
        this.p = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.a.a.j.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b a(byte[] bArr, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        p pVar = new p();
        u uVar = new u(bArr, i2);
        if (!this.p) {
            a(uVar);
        }
        a(uVar, arrayList, pVar);
        c.d.a.a.j.a[] aVarArr = new c.d.a.a.j.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return new b(aVarArr, pVar.b());
    }

    private void a(u uVar) {
        String strA;
        do {
            strA = uVar.A();
            if (strA == null) {
                return;
            }
        } while (!strA.startsWith("[Events]"));
    }

    private void a(u uVar, List<c.d.a.a.j.a> list, p pVar) {
        while (true) {
            String strA = uVar.A();
            if (strA == null) {
                return;
            }
            if (!this.p && strA.startsWith("Format: ")) {
                b(strA);
            } else if (strA.startsWith("Dialogue: ")) {
                a(strA, list, pVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Format: "
            int r0 = r0.length()
            java.lang.String r7 = r7.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r7 = android.text.TextUtils.split(r7, r0)
            int r0 = r7.length
            r6.q = r0
            r0 = -1
            r6.r = r0
            r6.s = r0
            r6.t = r0
            r1 = 0
            r2 = 0
        L1c:
            int r3 = r6.q
            if (r2 >= r3) goto L6c
            r3 = r7[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = c.d.a.a.m.H.d(r3)
            int r4 = r3.hashCode()
            r5 = 100571(0x188db, float:1.4093E-40)
            if (r4 == r5) goto L52
            r5 = 3556653(0x36452d, float:4.983932E-39)
            if (r4 == r5) goto L48
            r5 = 109757538(0x68ac462, float:5.219839E-35)
            if (r4 == r5) goto L3e
            goto L5c
        L3e:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5c
            r3 = 0
            goto L5d
        L48:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5c
            r3 = 2
            goto L5d
        L52:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5c
            r3 = 1
            goto L5d
        L5c:
            r3 = -1
        L5d:
            switch(r3) {
                case 0: goto L67;
                case 1: goto L64;
                case 2: goto L61;
                default: goto L60;
            }
        L60:
            goto L69
        L61:
            r6.t = r2
            goto L69
        L64:
            r6.s = r2
            goto L69
        L67:
            r6.r = r2
        L69:
            int r2 = r2 + 1
            goto L1c
        L6c:
            int r7 = r6.r
            if (r7 == r0) goto L78
            int r7 = r6.s
            if (r7 == r0) goto L78
            int r7 = r6.t
            if (r7 != r0) goto L7a
        L78:
            r6.q = r1
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.j.d.a.b(java.lang.String):void");
    }

    private void a(String str, List<c.d.a.a.j.a> list, p pVar) {
        long jA;
        if (this.q == 0) {
            o.c("SsaDecoder", "Skipping dialogue line before complete format: " + str);
            return;
        }
        String[] strArrSplit = str.substring("Dialogue: ".length()).split(",", this.q);
        if (strArrSplit.length != this.q) {
            o.c("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jA2 = a(strArrSplit[this.r]);
        if (jA2 == -9223372036854775807L) {
            o.c("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        String str2 = strArrSplit[this.s];
        if (str2.trim().isEmpty()) {
            jA = -9223372036854775807L;
        } else {
            jA = a(str2);
            if (jA == -9223372036854775807L) {
                o.c("SsaDecoder", "Skipping invalid timing: " + str);
                return;
            }
        }
        list.add(new c.d.a.a.j.a(strArrSplit[this.t].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
        pVar.a(jA2);
        if (jA != -9223372036854775807L) {
            list.add(null);
            pVar.a(jA);
        }
    }

    public static long a(String str) {
        Matcher matcher = o.matcher(str);
        if (matcher.matches()) {
            return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
        }
        return -9223372036854775807L;
    }
}
