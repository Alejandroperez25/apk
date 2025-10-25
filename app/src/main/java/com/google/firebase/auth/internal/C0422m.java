package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import c.d.a.b.e.c.AbstractC0221x;
import c.d.a.b.e.c.bb;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.InterfaceC0404d;

/* renamed from: com.google.firebase.auth.internal.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422m {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC0221x<String> f5374a = AbstractC0221x.a("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: b, reason: collision with root package name */
    private static final C0422m f5375b = new C0422m();

    /* renamed from: c, reason: collision with root package name */
    private c.d.a.b.h.h<InterfaceC0404d> f5376c;

    /* renamed from: d, reason: collision with root package name */
    private long f5377d = 0;

    private C0422m() {
    }

    public static C0422m a() {
        return f5375b;
    }

    public static void a(Context context, bb bbVar, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("verifyAssertionRequest", com.google.android.gms.common.internal.a.e.b(bbVar));
        editorEdit.putString("operation", str);
        editorEdit.putString("tenantId", str2);
        editorEdit.putLong("timestamp", com.google.android.gms.common.util.f.b().a());
        editorEdit.commit();
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.q());
        editorEdit.putString("statusMessage", status.o());
        editorEdit.putLong("timestamp", com.google.android.gms.common.util.f.b().a());
        editorEdit.commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.firebase.auth.FirebaseAuth r11) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.C0422m.a(com.google.firebase.auth.FirebaseAuth):void");
    }

    public final void a(Context context) {
        com.google.android.gms.common.internal.t.a(context);
        a(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f5376c = null;
        this.f5377d = 0L;
    }

    private static void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        AbstractC0221x<String> abstractC0221x = f5374a;
        int size = abstractC0221x.size();
        int i2 = 0;
        while (i2 < size) {
            String str = abstractC0221x.get(i2);
            i2++;
            editorEdit.remove(str);
        }
        editorEdit.commit();
    }
}
