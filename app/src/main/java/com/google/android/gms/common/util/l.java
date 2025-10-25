package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final int f5125a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    private static final Method f5126b = a();

    /* renamed from: c, reason: collision with root package name */
    private static final Method f5127c = b();

    /* renamed from: d, reason: collision with root package name */
    private static final Method f5128d = c();

    /* renamed from: e, reason: collision with root package name */
    private static final Method f5129e = d();

    /* renamed from: f, reason: collision with root package name */
    private static final Method f5130f = e();

    /* renamed from: g, reason: collision with root package name */
    private static final Method f5131g = f();

    /* renamed from: h, reason: collision with root package name */
    private static final Method f5132h = g();

    private static WorkSource a(int i2, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WorkSource workSource = new WorkSource();
        a(workSource, i2, str);
        return workSource;
    }

    public static WorkSource a(Context context, String str) {
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfoA = c.d.a.b.b.c.b.a(context).a(str, 0);
            if (applicationInfoA == null) {
                String strValueOf = String.valueOf(str);
                Log.e("WorkSourceUtil", strValueOf.length() != 0 ? "Could not get applicationInfo from package: ".concat(strValueOf) : new String("Could not get applicationInfo from package: "));
                return null;
            }
            return a(applicationInfoA.uid, str);
        } catch (PackageManager.NameNotFoundException unused) {
            String strValueOf2 = String.valueOf(str);
            Log.e("WorkSourceUtil", strValueOf2.length() != 0 ? "Could not find package: ".concat(strValueOf2) : new String("Could not find package: "));
            return null;
        }
    }

    private static void a(WorkSource workSource, int i2, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f5127c != null) {
            if (str == null) {
                str = "";
            }
            try {
                f5127c.invoke(workSource, Integer.valueOf(i2), str);
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        if (f5126b != null) {
            try {
                f5126b.invoke(workSource, Integer.valueOf(i2));
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    private static int b(WorkSource workSource) {
        if (f5128d != null) {
            try {
                return ((Integer) f5128d.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
        return 0;
    }

    private static String a(WorkSource workSource, int i2) {
        if (f5130f == null) {
            return null;
        }
        try {
            return (String) f5130f.invoke(workSource, Integer.valueOf(i2));
        } catch (Exception e2) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            return null;
        }
    }

    public static List<String> a(WorkSource workSource) {
        int iB = workSource == null ? 0 : b(workSource);
        if (iB == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < iB; i2++) {
            String strA = a(workSource, i2);
            if (!k.b(strA)) {
                arrayList.add(strA);
            }
        }
        return arrayList;
    }

    public static boolean a(Context context) {
        return (context == null || context.getPackageManager() == null || c.d.a.b.b.c.b.a(context).a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    private static Method a() {
        try {
            return WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method b() {
        if (i.d()) {
            try {
                return WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static Method c() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method d() {
        try {
            return WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method e() {
        if (i.d()) {
            try {
                return WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static final Method f() {
        if (i.i()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static final Method g() {
        if (i.i()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
        return null;
    }
}
