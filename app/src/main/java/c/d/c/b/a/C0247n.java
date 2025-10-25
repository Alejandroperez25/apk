package c.d.c.b.a;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: c.d.c.b.a.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247n extends c.d.c.H<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final c.d.c.I f4161a = new C0245l();

    /* renamed from: b, reason: collision with root package name */
    private final c.d.c.p f4162b;

    C0247n(c.d.c.p pVar) {
        this.f4162b = pVar;
    }

    @Override // c.d.c.H
    public Object a(c.d.c.d.b bVar) {
        switch (C0246m.f4160a[bVar.g().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                bVar.b();
                while (bVar.f()) {
                    arrayList.add(a(bVar));
                }
                bVar.c();
                return arrayList;
            case 2:
                c.d.c.b.y yVar = new c.d.c.b.y();
                bVar.d();
                while (bVar.f()) {
                    yVar.put(bVar.i(), a(bVar));
                }
                bVar.e();
                return yVar;
            case 3:
                return bVar.j();
            case 4:
                return Double.valueOf(bVar.m());
            case 5:
                return Boolean.valueOf(bVar.k());
            case 6:
                bVar.l();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Object obj) throws IOException {
        if (obj == null) {
            dVar.h();
            return;
        }
        c.d.c.H hA = this.f4162b.a((Class) obj.getClass());
        if (hA instanceof C0247n) {
            dVar.f();
            dVar.g();
        } else {
            hA.a(dVar, obj);
        }
    }
}
