package f.a.b.d;

import f.a.a.a.d;
import f.a.b.d.d;
import java.util.HashMap;

/* loaded from: classes.dex */
class i implements d.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d.e f5783a;

    i(d.e eVar) {
        this.f5783a = eVar;
    }

    @Override // f.a.a.a.d.c
    public void a(Object obj, d.InterfaceC0067d<Object> interfaceC0067d) {
        d.b bVarA = d.b.a((HashMap) obj);
        HashMap map = new HashMap();
        try {
            this.f5783a.a(bVarA);
            map.put("result", null);
        } catch (Exception e2) {
            map.put("error", d.b(e2));
        }
        interfaceC0067d.a(map);
    }
}
