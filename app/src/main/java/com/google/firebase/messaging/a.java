package com.google.firebase.messaging;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f5590a = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: b, reason: collision with root package name */
    private static a f5591b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseInstanceId f5592c;

    public static synchronized a a() {
        if (f5591b == null) {
            f5591b = new a(FirebaseInstanceId.a());
        }
        return f5591b;
    }

    private a(FirebaseInstanceId firebaseInstanceId) {
        this.f5592c = firebaseInstanceId;
    }

    public boolean b() {
        return this.f5592c.k();
    }

    public void a(boolean z) {
        this.f5592c.b(z);
    }

    public c.d.a.b.h.h<Void> a(String str) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in subscribeToTopic.");
            str = str.substring(8);
        }
        if (str == null || !f5590a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("Invalid topic name: ");
            sb.append(str);
            sb.append(" does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}");
            throw new IllegalArgumentException(sb.toString());
        }
        FirebaseInstanceId firebaseInstanceId = this.f5592c;
        String strValueOf = String.valueOf("S!");
        String strValueOf2 = String.valueOf(str);
        return firebaseInstanceId.a(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }

    public c.d.a.b.h.h<Void> b(String str) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in unsubscribeFromTopic.");
            str = str.substring(8);
        }
        if (str == null || !f5590a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("Invalid topic name: ");
            sb.append(str);
            sb.append(" does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}");
            throw new IllegalArgumentException(sb.toString());
        }
        FirebaseInstanceId firebaseInstanceId = this.f5592c;
        String strValueOf = String.valueOf("U!");
        String strValueOf2 = String.valueOf(str);
        return firebaseInstanceId.a(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }
}
