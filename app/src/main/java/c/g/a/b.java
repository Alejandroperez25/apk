package c.g.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c.g.a.C0307k$k;
import f.a.a.a.g;

/* loaded from: classes.dex */
class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f4474a;

    b(c cVar) {
        this.f4474a = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            switch (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)) {
                case 10:
                    g.a aVar = this.f4474a.f4475a;
                    C0307k$k.a aVarL = C0307k$k.l();
                    aVarL.a(C0307k$k.b.OFF);
                    aVar.a(aVarL.f().d());
                    break;
                case 11:
                    g.a aVar2 = this.f4474a.f4475a;
                    C0307k$k.a aVarL2 = C0307k$k.l();
                    aVarL2.a(C0307k$k.b.TURNING_ON);
                    aVar2.a(aVarL2.f().d());
                    break;
                case 12:
                    g.a aVar3 = this.f4474a.f4475a;
                    C0307k$k.a aVarL3 = C0307k$k.l();
                    aVarL3.a(C0307k$k.b.ON);
                    aVar3.a(aVarL3.f().d());
                    break;
                case 13:
                    g.a aVar4 = this.f4474a.f4475a;
                    C0307k$k.a aVarL4 = C0307k$k.l();
                    aVarL4.a(C0307k$k.b.TURNING_OFF);
                    aVar4.a(aVarL4.f().d());
                    break;
            }
        }
    }
}
