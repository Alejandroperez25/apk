package f.a.b.e;

import java.util.HashMap;

/* loaded from: classes.dex */
class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5834a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f5835b;

    l(m mVar, String str) {
        this.f5835b = mVar;
        this.f5834a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        HashMap map = new HashMap();
        map.put("channel", this.f5835b.f5837b);
        map.put("message", this.f5834a);
        this.f5835b.f5836a.a("javascriptChannelMessage", map);
    }
}
