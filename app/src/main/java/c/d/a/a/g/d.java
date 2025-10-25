package c.d.a.a.g;

import c.d.a.a.q;

/* loaded from: classes.dex */
class d implements e {
    d() {
    }

    @Override // c.d.a.a.g.e
    public boolean a(q qVar) {
        String str = qVar.f3682g;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    @Override // c.d.a.a.g.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c.d.a.a.g.c b(c.d.a.a.q r3) {
        /*
            r2 = this;
            java.lang.String r3 = r3.f3682g
            int r0 = r3.hashCode()
            r1 = -1248341703(0xffffffffb597d139, float:-1.1311269E-6)
            if (r0 == r1) goto L2a
            r1 = 1154383568(0x44ce7ed0, float:1651.9629)
            if (r0 == r1) goto L20
            r1 = 1652648887(0x62816bb7, float:1.1936958E21)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "application/x-scte35"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L34
            r3 = 2
            goto L35
        L20:
            java.lang.String r0 = "application/x-emsg"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L34
            r3 = 1
            goto L35
        L2a:
            java.lang.String r0 = "application/id3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L34
            r3 = 0
            goto L35
        L34:
            r3 = -1
        L35:
            switch(r3) {
                case 0: goto L4c;
                case 1: goto L46;
                case 2: goto L40;
                default: goto L38;
            }
        L38:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Attempted to create decoder for unsupported format"
            r3.<init>(r0)
            throw r3
        L40:
            c.d.a.a.g.c.d r3 = new c.d.a.a.g.c.d
            r3.<init>()
            return r3
        L46:
            c.d.a.a.g.a.c r3 = new c.d.a.a.g.a.c
            r3.<init>()
            return r3
        L4c:
            c.d.a.a.g.b.n r3 = new c.d.a.a.g.b.n
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.g.d.b(c.d.a.a.q):c.d.a.a.g.c");
    }
}
