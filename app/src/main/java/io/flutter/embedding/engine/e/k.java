package io.flutter.embedding.engine.e;

import f.a.a.a.o;
import io.flutter.embedding.engine.e.l;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class k implements o.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f6072a;

    k(l lVar) {
        this.f6072a = lVar;
    }

    @Override // f.a.a.a.o.c
    public void a(f.a.a.a.m mVar, o.d dVar) {
        if (this.f6072a.f6074b == null) {
        }
        f.a.a.a("PlatformViewsChannel", "Received '" + mVar.f5663a + "' message.");
        switch (mVar.f5663a) {
            case "create":
                b(mVar, dVar);
                break;
            case "dispose":
                c(mVar, dVar);
                break;
            case "resize":
                d(mVar, dVar);
                break;
            case "touch":
                e(mVar, dVar);
                break;
            case "setDirection":
                f(mVar, dVar);
                break;
            case "clearFocus":
                g(mVar, dVar);
                break;
            default:
                dVar.a();
                break;
        }
    }

    private void b(f.a.a.a.m mVar, o.d dVar) {
        Map map = (Map) mVar.a();
        try {
            dVar.a(Long.valueOf(this.f6072a.f6074b.a(new l.a(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null))));
        } catch (IllegalStateException e2) {
            dVar.a("error", l.b(e2), null);
        }
    }

    private void c(f.a.a.a.m mVar, o.d dVar) {
        try {
            this.f6072a.f6074b.a(((Integer) mVar.a()).intValue());
            dVar.a(null);
        } catch (IllegalStateException e2) {
            dVar.a("error", l.b(e2), null);
        }
    }

    private void d(f.a.a.a.m mVar, o.d dVar) {
        Map map = (Map) mVar.a();
        try {
            this.f6072a.f6074b.a(new l.b(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new j(this, dVar));
        } catch (IllegalStateException e2) {
            dVar.a("error", l.b(e2), null);
        }
    }

    private void e(f.a.a.a.m mVar, o.d dVar) {
        o.d dVar2;
        List list = (List) mVar.a();
        try {
            this.f6072a.f6074b.a(new l.c(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue()));
            dVar2 = dVar;
        } catch (IllegalStateException e2) {
            e = e2;
            dVar2 = dVar;
        }
        try {
            dVar2.a(null);
        } catch (IllegalStateException e3) {
            e = e3;
            dVar2.a("error", l.b(e), null);
        }
    }

    private void f(f.a.a.a.m mVar, o.d dVar) {
        Map map = (Map) mVar.a();
        try {
            this.f6072a.f6074b.a(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
            dVar.a(null);
        } catch (IllegalStateException e2) {
            dVar.a("error", l.b(e2), null);
        }
    }

    private void g(f.a.a.a.m mVar, o.d dVar) {
        try {
            this.f6072a.f6074b.b(((Integer) mVar.a()).intValue());
            dVar.a(null);
        } catch (IllegalStateException e2) {
            dVar.a("error", l.b(e2), null);
        }
    }
}
