package io.flutter.plugins.firebasemessaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import f.a.a.a.o;
import f.a.a.a.q;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class FlutterFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: h, reason: collision with root package name */
    private static io.flutter.view.k f6207h;

    /* renamed from: i, reason: collision with root package name */
    private static o f6208i;
    private static Long j;
    private static q.c l;
    private static Context m;

    /* renamed from: g, reason: collision with root package name */
    private static AtomicBoolean f6206g = new AtomicBoolean(false);
    private static List<com.google.firebase.messaging.c> k = Collections.synchronizedList(new LinkedList());

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m = getApplicationContext();
        io.flutter.view.i.a(m, (String[]) null);
        if (f6206g.get()) {
            return;
        }
        a(m, m.getSharedPreferences("io.flutter.android_fcm_plugin", 0).getLong("background_setup_callback", 0L));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void a(com.google.firebase.messaging.c cVar) throws InterruptedException {
        if (b(this)) {
            Intent intent = new Intent("io.flutter.plugins.firebasemessaging.NOTIFICATION");
            intent.putExtra("notification", cVar);
            b.j.a.b.a(this).a(intent);
        } else {
            if (!f6206g.get()) {
                k.add(cVar);
                return;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Handler(getMainLooper()).post(new i(this, cVar, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                Log.i("FlutterFcmService", "Exception waiting to execute Dart callback", e2);
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void b(String str) {
        Intent intent = new Intent("io.flutter.plugins.firebasemessaging.TOKEN");
        intent.putExtra("token", str);
        b.j.a.b.a(this).a(intent);
    }

    public static void a(Context context, long j2) {
        io.flutter.view.i.a(context, (String[]) null);
        String strA = io.flutter.view.i.a();
        FlutterCallbackInformation flutterCallbackInformationLookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j2);
        if (flutterCallbackInformationLookupCallbackInformation == null) {
            Log.e("FlutterFcmService", "Fatal: failed to find callback");
            return;
        }
        f6207h = new io.flutter.view.k(context, true);
        if (strA == null || f6206g.get()) {
            return;
        }
        if (l == null) {
            throw new RuntimeException("PluginRegistrantCallback is not set.");
        }
        l lVar = new l();
        lVar.f6320a = strA;
        lVar.f6321b = flutterCallbackInformationLookupCallbackInformation.callbackName;
        lVar.f6322c = flutterCallbackInformationLookupCallbackInformation.callbackLibraryPath;
        f6207h.a(lVar);
        l.a(f6207h.d());
    }

    public static void b() {
        f6206g.set(true);
        synchronized (k) {
            Iterator<com.google.firebase.messaging.c> it = k.iterator();
            while (it.hasNext()) {
                b(m, it.next(), null);
            }
            k.clear();
        }
    }

    public static void a(o oVar) {
        f6208i = oVar;
    }

    public static void a(Context context, Long l2) {
        j = l2;
        context.getSharedPreferences("io.flutter.android_fcm_plugin", 0).edit().putLong("background_message_callback", l2.longValue()).apply();
    }

    public static void b(Context context, long j2) {
        context.getSharedPreferences("io.flutter.android_fcm_plugin", 0).edit().putLong("background_setup_callback", j2).apply();
    }

    public static Long a(Context context) {
        return Long.valueOf(context.getSharedPreferences("io.flutter.android_fcm_plugin", 0).getLong("background_message_callback", 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, com.google.firebase.messaging.c cVar, CountDownLatch countDownLatch) {
        if (f6208i == null) {
            throw new RuntimeException("setBackgroundChannel was not called before messages came in, exiting.");
        }
        o.d dVarA = countDownLatch != null ? new k(countDownLatch).a() : null;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (j == null) {
            j = a(context);
        }
        map.put("handle", j);
        if (cVar.o() != null) {
            map2.put("data", cVar.o());
        }
        if (cVar.p() != null) {
            map2.put("notification", cVar.p());
        }
        map.put("message", map2);
        f6208i.a("handleBackgroundMessage", map, dVarA);
    }

    private static boolean b(Context context) {
        if (((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked()) {
            return false;
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.importance == 100;
                }
            }
        }
        return false;
    }
}
