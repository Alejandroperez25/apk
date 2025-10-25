package c.g.a;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import f.a.a.a.g;

/* loaded from: classes.dex */
class c implements g.c {

    /* renamed from: a, reason: collision with root package name */
    private g.a f4475a;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f4476b = new b(this);

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f4477c;

    c(h hVar) {
        this.f4477c = hVar;
    }

    @Override // f.a.a.a.g.c
    public void a(Object obj, g.a aVar) {
        this.f4475a = aVar;
        this.f4477c.f4486c.registerReceiver(this.f4476b, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    @Override // f.a.a.a.g.c
    public void a(Object obj) {
        this.f4475a = null;
        this.f4477c.f4486c.unregisterReceiver(this.f4476b);
    }
}
