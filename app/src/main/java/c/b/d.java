package c.b;

import java.util.HashMap;

/* loaded from: classes.dex */
class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1295a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f1296b;

    d(e eVar, String str) {
        this.f1296b = eVar;
        this.f1295a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        HashMap map = new HashMap();
        map.put("channel", this.f1296b.f1298b);
        map.put("message", this.f1295a);
        this.f1296b.f1297a.a("javascriptChannelMessage", map);
    }
}
