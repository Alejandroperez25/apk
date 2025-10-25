package c.d.a.a.e.h;

import android.util.SparseArray;
import b.a.a$i;
import c.d.a.a.e.h.G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: c.d.a.a.e.h.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142i implements G.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f2178a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c.d.a.a.q> f2179b;

    public C0142i(int i2) {
        this(i2, Collections.singletonList(c.d.a.a.q.a(null, "application/cea-608", 0, null)));
    }

    public C0142i(int i2, List<c.d.a.a.q> list) {
        this.f2178a = i2;
        this.f2179b = list;
    }

    @Override // c.d.a.a.e.h.G.c
    public SparseArray<G> a() {
        return new SparseArray<>();
    }

    @Override // c.d.a.a.e.h.G.c
    public G a(int i2, G.b bVar) {
        switch (i2) {
            case 2:
                return new u(new m(b(bVar)));
            case 3:
            case 4:
                return new u(new s(bVar.f2131b));
            case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
                if (a(2)) {
                    return null;
                }
                return new u(new C0141h(false, bVar.f2131b));
            case a$i.AppCompatTheme_actionModeBackground /* 17 */:
                if (a(2)) {
                    return null;
                }
                return new u(new r(bVar.f2131b));
            case 21:
                return new u(new q());
            case a$i.AppCompatTheme_actionModeSplitBackground /* 27 */:
                if (a(4)) {
                    return null;
                }
                return new u(new o(a(bVar), a(1), a(8)));
            case a$i.AppCompatTheme_alertDialogTheme /* 36 */:
                return new u(new p(a(bVar)));
            case a$i.AppCompatTheme_searchViewStyle /* 89 */:
                return new u(new k(bVar.f2132c));
            case 129:
            case 135:
                return new u(new C0139f(bVar.f2131b));
            case 130:
                if (a(64)) {
                    return null;
                }
                break;
            case 134:
                if (a(16)) {
                    return null;
                }
                return new A(new C());
            case 138:
                break;
            default:
                return null;
        }
        return new u(new j(bVar.f2131b));
    }

    private B a(G.b bVar) {
        return new B(c(bVar));
    }

    private I b(G.b bVar) {
        return new I(c(bVar));
    }

    private List<c.d.a.a.q> c(G.b bVar) {
        String str;
        int i2;
        List<byte[]> listA;
        if (a(32)) {
            return this.f2179b;
        }
        c.d.a.a.m.u uVar = new c.d.a.a.m.u(bVar.f2133d);
        List<c.d.a.a.q> arrayList = this.f2179b;
        while (uVar.b() > 0) {
            int iH = uVar.h();
            int iD = uVar.d() + uVar.h();
            if (iH == 134) {
                arrayList = new ArrayList<>();
                int iH2 = uVar.h() & 31;
                for (int i3 = 0; i3 < iH2; i3++) {
                    String strE = uVar.e(3);
                    int iH3 = uVar.h();
                    boolean z = (iH3 & 128) != 0;
                    if (z) {
                        i2 = iH3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte bH = (byte) uVar.h();
                    uVar.d(1);
                    if (z) {
                        listA = c.d.a.a.j.a.d.a((bH & 64) != 0);
                    } else {
                        listA = null;
                    }
                    arrayList.add(c.d.a.a.q.a(null, str, null, -1, 0, strE, i2, null, Long.MAX_VALUE, listA));
                }
            }
            uVar.c(iD);
        }
        return arrayList;
    }

    private boolean a(int i2) {
        return (i2 & this.f2178a) != 0;
    }
}
