package io.flutter.view;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f6310a = false;

    public static void a(Context context) {
        if (f6310a) {
            return;
        }
        io.flutter.embedding.engine.b.a.a().a(context);
    }

    public static void a(Context context, String[] strArr) {
        if (f6310a) {
            return;
        }
        io.flutter.embedding.engine.b.a.a().a(context, strArr);
    }

    public static String a() {
        return io.flutter.embedding.engine.b.a.a().b();
    }

    public static String a(String str) {
        return io.flutter.embedding.engine.b.a.a().a(str);
    }

    public static String a(String str, String str2) {
        return io.flutter.embedding.engine.b.a.a().a(str, str2);
    }
}
