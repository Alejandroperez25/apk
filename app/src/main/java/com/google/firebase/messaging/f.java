package com.google.firebase.messaging;

import android.R;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.f;
import b.a.a$i;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f5609a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    static e a(Context context, o oVar) throws JSONException, PackageManager.NameNotFoundException {
        Uri defaultUri;
        Intent intent;
        PendingIntent activity;
        Bundle bundleA = a(context.getPackageManager(), context.getPackageName());
        String packageName = context.getPackageName();
        String strB = b(context, oVar.a("gcm.n.android_channel_id"), bundleA);
        Resources resources = context.getResources();
        PackageManager packageManager = context.getPackageManager();
        f.d dVar = new f.d(context, strB);
        dVar.b(a(packageName, oVar, packageManager, resources));
        String strA = oVar.a(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strA)) {
            dVar.c(strA);
            f.c cVar = new f.c();
            cVar.a(strA);
            dVar.a(cVar);
        }
        dVar.a(a(packageManager, resources, packageName, oVar.a("gcm.n.icon"), bundleA));
        String strB2 = oVar.b();
        Integer num = null;
        if (TextUtils.isEmpty(strB2)) {
            defaultUri = null;
        } else if ("default".equals(strB2) || resources.getIdentifier(strB2, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 24 + String.valueOf(strB2).length());
            sb.append("android.resource://");
            sb.append(packageName);
            sb.append("/raw/");
            sb.append(strB2);
            defaultUri = Uri.parse(sb.toString());
        }
        if (defaultUri != null) {
            dVar.a(defaultUri);
        }
        String strA2 = oVar.a("gcm.n.click_action");
        if (TextUtils.isEmpty(strA2)) {
            Uri uriA = oVar.a();
            if (uriA != null) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(packageName);
                intent.setData(uriA);
            } else {
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
                intent = launchIntentForPackage;
            }
        } else {
            intent = new Intent(strA2);
            intent.setPackage(packageName);
            intent.setFlags(268435456);
        }
        if (intent == null) {
            activity = null;
        } else {
            intent.addFlags(67108864);
            intent.putExtras(oVar.e());
            activity = PendingIntent.getActivity(context, f5609a.incrementAndGet(), intent, 1073741824);
            if (oVar.b("google.c.a.e")) {
                activity = a(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(oVar.f()).putExtra("pending_intent", activity));
            }
        }
        dVar.a(activity);
        PendingIntent pendingIntentA = !oVar.b("google.c.a.e") ? null : a(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(oVar.f()));
        if (pendingIntentA != null) {
            dVar.b(pendingIntentA);
        }
        Integer numA = a(context, oVar.a("gcm.n.color"), bundleA);
        if (numA != null) {
            dVar.e(numA.intValue());
        }
        dVar.a(!oVar.b("gcm.n.sticky"));
        dVar.b(oVar.b("gcm.n.local_only"));
        String strA3 = oVar.a("gcm.n.ticker");
        if (strA3 != null) {
            dVar.d(strA3);
        }
        Integer numC = oVar.c("gcm.n.notification_priority");
        if (numC == null) {
            numC = null;
        } else if (numC.intValue() < -2 || numC.intValue() > 2) {
            String strValueOf = String.valueOf(numC);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 72);
            sb2.append("notificationPriority is invalid ");
            sb2.append(strValueOf);
            sb2.append(". Skipping setting notificationPriority.");
            Log.w("FirebaseMessaging", sb2.toString());
            numC = null;
        }
        if (numC != null) {
            dVar.d(numC.intValue());
        }
        Integer numC2 = oVar.c("gcm.n.visibility");
        if (numC2 == null) {
            numC2 = null;
        } else if (numC2.intValue() < -1 || numC2.intValue() > 1) {
            String strValueOf2 = String.valueOf(numC2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf2).length() + 53);
            sb3.append("visibility is invalid: ");
            sb3.append(strValueOf2);
            sb3.append(". Skipping setting visibility.");
            Log.w("NotificationParams", sb3.toString());
            numC2 = null;
        }
        if (numC2 != null) {
            dVar.f(numC2.intValue());
        }
        Integer numC3 = oVar.c("gcm.n.notification_count");
        if (numC3 != null) {
            if (numC3.intValue() < 0) {
                String strValueOf3 = String.valueOf(numC3);
                StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf3).length() + 67);
                sb4.append("notificationCount is invalid: ");
                sb4.append(strValueOf3);
                sb4.append(". Skipping setting notificationCount.");
                Log.w("FirebaseMessaging", sb4.toString());
            } else {
                num = numC3;
            }
        }
        if (num != null) {
            dVar.b(num.intValue());
        }
        Long lD = oVar.d("gcm.n.event_time");
        if (lD != null) {
            dVar.a(lD.longValue());
        }
        long[] jArrC = oVar.c();
        if (jArrC != null) {
            dVar.a(jArrC);
        }
        int[] iArrD = oVar.d();
        if (iArrD != null) {
            dVar.a(iArrD[0], iArrD[1], iArrD[2]);
        }
        int i2 = oVar.b("gcm.n.default_sound") ? 1 : 0;
        if (oVar.b("gcm.n.default_vibrate_timings")) {
            i2 |= 2;
        }
        if (oVar.b("gcm.n.default_light_settings")) {
            i2 |= 4;
        }
        dVar.c(i2);
        String strA4 = oVar.a("gcm.n.tag");
        if (TextUtils.isEmpty(strA4)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb5 = new StringBuilder(37);
            sb5.append("FCM-Notification:");
            sb5.append(jUptimeMillis);
            strA4 = sb5.toString();
        }
        return new e(dVar, strA4, 0);
    }

    private static CharSequence a(String str, o oVar, PackageManager packageManager, Resources resources) {
        String strA = oVar.a(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        try {
            return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager);
        } catch (PackageManager.NameNotFoundException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(strValueOf);
            Log.e("FirebaseMessaging", sb.toString());
            return "";
        }
    }

    @TargetApi(a$i.AppCompatTheme_actionModeShareDrawable)
    private static boolean a(Resources resources, int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i2, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i2);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i2);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    private static int a(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        int i2;
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && a(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && a(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        int i3 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i3 == 0 || !a(resources, i3)) {
            try {
                i2 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(strValueOf);
                Log.w("FirebaseMessaging", sb2.toString());
            }
        } else {
            i2 = i3;
        }
        return (i2 == 0 || !a(resources, i2)) ? R.drawable.sym_def_app_icon : i2;
    }

    private static Integer a(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i2 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 != 0) {
            try {
                return Integer.valueOf(androidx.core.content.a.c(context, i2));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    private static Bundle a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(strValueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    @TargetApi(a$i.AppCompatTheme_actionModeShareDrawable)
    private static String b(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                Log.w("FirebaseMessaging", sb.toString());
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string)) {
                if (notificationManager.getNotificationChannel(string) != null) {
                    return string;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            } else {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") != null) {
                return "fcm_fallback_notification_channel";
            }
            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), 3));
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static PendingIntent a(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, f5609a.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }
}
