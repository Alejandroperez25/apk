package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    private static Object f4992a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f4993b;

    /* renamed from: c, reason: collision with root package name */
    private static String f4994c;

    /* renamed from: d, reason: collision with root package name */
    private static int f4995d;

    public static int a(Context context) {
        b(context);
        return f4995d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f4992a) {
            if (f4993b) {
                return;
            }
            f4993b = true;
            try {
                bundle = c.d.a.b.b.c.b.a(context).a(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("MetadataValueReader", "This should never happen.", e2);
            }
            if (bundle == null) {
                return;
            }
            f4994c = bundle.getString("com.google.app.id");
            f4995d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
