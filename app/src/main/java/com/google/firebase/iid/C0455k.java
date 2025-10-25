package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import android.util.Log;
import b.a.a$i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.List;

/* renamed from: com.google.firebase.iid.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455k {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5545a;

    /* renamed from: b, reason: collision with root package name */
    private String f5546b;

    /* renamed from: c, reason: collision with root package name */
    private String f5547c;

    /* renamed from: d, reason: collision with root package name */
    private int f5548d;

    /* renamed from: e, reason: collision with root package name */
    private int f5549e = 0;

    public C0455k(Context context) {
        this.f5545a = context;
    }

    public final synchronized int a() {
        if (this.f5549e != 0) {
            return this.f5549e;
        }
        PackageManager packageManager = this.f5545a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.i.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f5549e = 1;
                return this.f5549e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f5549e = 2;
            return this.f5549e;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.i.h()) {
            this.f5549e = 2;
        } else {
            this.f5549e = 1;
        }
        return this.f5549e;
    }

    public static String a(c.d.b.e eVar) {
        String strD = eVar.e().d();
        if (strD != null) {
            return strD;
        }
        String strB = eVar.e().b();
        if (!strB.startsWith("1:")) {
            return strB;
        }
        String[] strArrSplit = strB.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String a(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) ((bArrDigest[0] & 15) + a$i.AppCompatTheme_windowActionBarOverlay);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final synchronized String b() {
        if (this.f5546b == null) {
            e();
        }
        return this.f5546b;
    }

    public final synchronized String c() {
        if (this.f5547c == null) {
            e();
        }
        return this.f5547c;
    }

    public final synchronized int d() {
        PackageInfo packageInfoA;
        if (this.f5548d == 0 && (packageInfoA = a("com.google.android.gms")) != null) {
            this.f5548d = packageInfoA.versionCode;
        }
        return this.f5548d;
    }

    private final synchronized void e() {
        PackageInfo packageInfoA = a(this.f5545a.getPackageName());
        if (packageInfoA != null) {
            this.f5546b = Integer.toString(packageInfoA.versionCode);
            this.f5547c = packageInfoA.versionName;
        }
    }

    private final PackageInfo a(String str) {
        try {
            return this.f5545a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
