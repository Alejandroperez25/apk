package c.d.a.a.j.h;

import c.d.a.a.j.h.f;
import c.d.a.a.m.H;
import c.d.a.a.m.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends c.d.a.a.j.b {
    private static final int o = H.h("payl");
    private static final int p = H.h("sttg");
    private static final int q = H.h("vttc");
    private final u r;
    private final f.a s;

    public b() {
        super("Mp4WebvttDecoder");
        this.r = new u();
        this.s = new f.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.a.a.j.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a(byte[] bArr, int i2, boolean z) throws c.d.a.a.j.f {
        this.r.a(bArr, i2);
        ArrayList arrayList = new ArrayList();
        while (this.r.b() > 0) {
            if (this.r.b() < 8) {
                throw new c.d.a.a.j.f("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iP = this.r.p();
            if (this.r.p() == q) {
                arrayList.add(a(this.r, this.s, iP - 8));
            } else {
                this.r.d(iP - 8);
            }
        }
        return new c(arrayList);
    }

    private static c.d.a.a.j.a a(u uVar, f.a aVar, int i2) throws c.d.a.a.j.f {
        aVar.a();
        while (i2 > 0) {
            if (i2 < 8) {
                throw new c.d.a.a.j.f("Incomplete vtt cue box header found.");
            }
            int iP = uVar.p();
            int iP2 = uVar.p();
            int i3 = iP - 8;
            String strA = H.a(uVar.f3567a, uVar.d(), i3);
            uVar.d(i3);
            i2 = (i2 - 8) - i3;
            if (iP2 == p) {
                g.a(strA, aVar);
            } else if (iP2 == o) {
                g.a((String) null, strA.trim(), aVar, (List<d>) Collections.emptyList());
            }
        }
        return aVar.b();
    }
}
