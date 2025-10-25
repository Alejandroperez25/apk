package c.d.c.b.a;

import java.io.IOException;
import java.util.BitSet;

/* loaded from: classes.dex */
class T extends c.d.c.H<BitSet> {
    T() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[SYNTHETIC] */
    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.BitSet a(c.d.c.d.b r7) throws c.d.c.d.e {
        /*
            r6 = this;
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r7.b()
            c.d.c.d.c r1 = r7.g()
            r2 = 0
            r3 = 0
        Le:
            c.d.c.d.c r4 = c.d.c.d.c.END_ARRAY
            if (r1 == r4) goto L70
            int[] r4 = c.d.c.b.a.aa.f4133a
            int r5 = r1.ordinal()
            r4 = r4[r5]
            r5 = 1
            switch(r4) {
                case 1: goto L5e;
                case 2: goto L59;
                case 3: goto L35;
                default: goto L1e;
            }
        L1e:
            c.d.c.C r7 = new c.d.c.C
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Invalid bitset value type: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.String r1 = r7.j()
            int r4 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L42
            if (r4 == 0) goto L40
            goto L64
        L40:
            r5 = 0
            goto L64
        L42:
            c.d.c.C r7 = new c.d.c.C
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L59:
            boolean r5 = r7.k()
            goto L64
        L5e:
            int r1 = r7.o()
            if (r1 == 0) goto L40
        L64:
            if (r5 == 0) goto L69
            r0.set(r3)
        L69:
            int r3 = r3 + 1
            c.d.c.d.c r1 = r7.g()
            goto Le
        L70:
            r7.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.c.b.a.T.a(c.d.c.d.b):java.util.BitSet");
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, BitSet bitSet) throws IOException {
        dVar.d();
        int length = bitSet.length();
        for (int i2 = 0; i2 < length; i2++) {
            dVar.a(bitSet.get(i2) ? 1L : 0L);
        }
        dVar.e();
    }
}
