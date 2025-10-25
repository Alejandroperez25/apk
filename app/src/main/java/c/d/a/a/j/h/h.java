package c.d.a.a.j.h;

import android.text.TextUtils;
import c.d.a.a.j.h.f;
import c.d.a.a.m.u;
import c.d.a.a.x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends c.d.a.a.j.b {
    private final g o;
    private final u p;
    private final f.a q;
    private final a r;
    private final List<d> s;

    public h() {
        super("WebvttDecoder");
        this.o = new g();
        this.p = new u();
        this.q = new f.a();
        this.r = new a();
        this.s = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.a.a.j.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j a(byte[] bArr, int i2, boolean z) throws c.d.a.a.j.f {
        this.p.a(bArr, i2);
        this.q.a();
        this.s.clear();
        try {
            i.a(this.p);
            while (!TextUtils.isEmpty(this.p.A())) {
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                int iA = a(this.p);
                if (iA == 0) {
                    return new j(arrayList);
                }
                if (iA == 1) {
                    b(this.p);
                } else if (iA == 2) {
                    if (!arrayList.isEmpty()) {
                        throw new c.d.a.a.j.f("A style block was found after the first cue.");
                    }
                    this.p.A();
                    d dVarC = this.r.c(this.p);
                    if (dVarC != null) {
                        this.s.add(dVarC);
                    }
                } else if (iA == 3 && this.o.a(this.p, this.q, this.s)) {
                    arrayList.add(this.q.b());
                    this.q.a();
                }
            }
        } catch (x e2) {
            throw new c.d.a.a.j.f(e2);
        }
    }

    private static int a(u uVar) {
        int i2 = -1;
        int iD = 0;
        while (i2 == -1) {
            iD = uVar.d();
            String strA = uVar.A();
            if (strA == null) {
                i2 = 0;
            } else if ("STYLE".equals(strA)) {
                i2 = 2;
            } else {
                i2 = strA.startsWith("NOTE") ? 1 : 3;
            }
        }
        uVar.c(iD);
        return i2;
    }

    private static void b(u uVar) {
        while (!TextUtils.isEmpty(uVar.A())) {
        }
    }
}
