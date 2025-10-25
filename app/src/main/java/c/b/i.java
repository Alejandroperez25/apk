package c.b;

import c.b.f;
import java.util.HashMap;

/* loaded from: classes.dex */
class i implements f.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f1303a;

    i(m mVar) {
        this.f1303a = mVar;
    }

    @Override // c.b.f.a
    public void a(int i2, int i3, int i4, int i5) {
        HashMap map = new HashMap();
        map.put("yDirection", Double.valueOf(i3));
        c.f1291a.a("onScrollYChanged", map);
        HashMap map2 = new HashMap();
        map2.put("xDirection", Double.valueOf(i2));
        c.f1291a.a("onScrollXChanged", map2);
    }
}
