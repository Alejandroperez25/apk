package io.flutter.plugins.firebasemessaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.c;
import f.a.a.a.m;
import f.a.a.a.o;
import f.a.a.a.q;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends BroadcastReceiver implements o.c, q.b {

    /* renamed from: a, reason: collision with root package name */
    private final q.d f6220a;

    /* renamed from: b, reason: collision with root package name */
    private final o f6221b;

    public static void a(q.d dVar) {
        o oVar = new o(dVar.f(), "plugins.flutter.io/firebase_messaging");
        o oVar2 = new o(dVar.f(), "plugins.flutter.io/firebase_messaging_background");
        h hVar = new h(dVar, oVar);
        dVar.a(hVar);
        oVar.a(hVar);
        oVar2.a(hVar);
        FlutterFirebaseMessagingService.a(oVar2);
    }

    private h(q.d dVar, o oVar) {
        this.f6220a = dVar;
        this.f6221b = oVar;
        c.d.b.e.b(dVar.b());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("io.flutter.plugins.firebasemessaging.TOKEN");
        intentFilter.addAction("io.flutter.plugins.firebasemessaging.NOTIFICATION");
        b.j.a.b.a(dVar.b()).a(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (action.equals("io.flutter.plugins.firebasemessaging.TOKEN")) {
            this.f6221b.a("onToken", intent.getStringExtra("token"));
        } else if (action.equals("io.flutter.plugins.firebasemessaging.NOTIFICATION")) {
            this.f6221b.a("onMessage", a((com.google.firebase.messaging.c) intent.getParcelableExtra("notification")));
        }
    }

    private Map<String, Object> a(com.google.firebase.messaging.c cVar) {
        HashMap map = new HashMap();
        map.put("data", cVar.o());
        c.a aVarP = cVar.p();
        HashMap map2 = new HashMap();
        map2.put("title", aVarP != null ? aVarP.a() : null);
        map2.put("body", aVarP != null ? aVarP.b() : null);
        map.put("notification", map2);
        return map;
    }

    @Override // f.a.a.a.o.c
    public void a(m mVar, o.d dVar) {
        long jLongValue;
        if ("FcmDartService#start".equals(mVar.f5663a)) {
            long jLongValue2 = 0;
            try {
                Map map = (Map) mVar.f5664b;
                jLongValue = ((Long) map.get("setupHandle")).longValue();
                try {
                    jLongValue2 = ((Long) map.get("backgroundHandle")).longValue();
                } catch (Exception e2) {
                    e = e2;
                    Log.e("FirebaseMessagingPlugin", "There was an exception when getting callback handle from Dart side");
                    e.printStackTrace();
                    FlutterFirebaseMessagingService.b(this.f6220a.b(), jLongValue);
                    FlutterFirebaseMessagingService.a(this.f6220a.b(), jLongValue);
                    FlutterFirebaseMessagingService.a(this.f6220a.b(), Long.valueOf(jLongValue2));
                    dVar.a(true);
                    return;
                }
            } catch (Exception e3) {
                e = e3;
                jLongValue = 0;
            }
            FlutterFirebaseMessagingService.b(this.f6220a.b(), jLongValue);
            FlutterFirebaseMessagingService.a(this.f6220a.b(), jLongValue);
            FlutterFirebaseMessagingService.a(this.f6220a.b(), Long.valueOf(jLongValue2));
            dVar.a(true);
            return;
        }
        if ("FcmDartService#initialized".equals(mVar.f5663a)) {
            FlutterFirebaseMessagingService.b();
            dVar.a(true);
            return;
        }
        if ("configure".equals(mVar.f5663a)) {
            FirebaseInstanceId.a().d().a(new a(this));
            if (this.f6220a.d() != null) {
                a("onLaunch", this.f6220a.d().getIntent());
            }
            dVar.a(null);
            return;
        }
        if ("subscribeToTopic".equals(mVar.f5663a)) {
            com.google.firebase.messaging.a.a().a((String) mVar.a()).a(new b(this, dVar));
            return;
        }
        if ("unsubscribeFromTopic".equals(mVar.f5663a)) {
            com.google.firebase.messaging.a.a().b((String) mVar.a()).a(new c(this, dVar));
            return;
        }
        if ("getToken".equals(mVar.f5663a)) {
            FirebaseInstanceId.a().d().a(new d(this, dVar));
            return;
        }
        if ("deleteInstanceID".equals(mVar.f5663a)) {
            new Thread(new g(this, dVar)).start();
            return;
        }
        if ("autoInitEnabled".equals(mVar.f5663a)) {
            dVar.a(Boolean.valueOf(com.google.firebase.messaging.a.a().b()));
        } else {
            if ("setAutoInitEnabled".equals(mVar.f5663a)) {
                com.google.firebase.messaging.a.a().a(((Boolean) mVar.a()).booleanValue());
                dVar.a(null);
                return;
            }
            dVar.a();
        }
    }

    @Override // f.a.a.a.q.b
    public boolean onNewIntent(Intent intent) {
        boolean zA = a("onResume", intent);
        if (zA && this.f6220a.d() != null) {
            this.f6220a.d().setIntent(intent);
        }
        return zA;
    }

    private boolean a(String str, Intent intent) {
        if (!"FLUTTER_NOTIFICATION_CLICK".equals(intent.getAction()) && !"FLUTTER_NOTIFICATION_CLICK".equals(intent.getStringExtra("click_action"))) {
            return false;
        }
        HashMap map = new HashMap();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (String str2 : extras.keySet()) {
            Object obj = extras.get(str2);
            if (obj != null) {
                map3.put(str2, obj);
            }
        }
        map.put("notification", map2);
        map.put("data", map3);
        this.f6221b.a(str, map);
        return true;
    }
}
