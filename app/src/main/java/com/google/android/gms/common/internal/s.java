package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class s {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a a(Object obj) {
        return new a(obj);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f5062a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f5063b;

        private a(Object obj) {
            t.a(obj);
            this.f5063b = obj;
            this.f5062a = new ArrayList();
        }

        public final a a(String str, Object obj) {
            List<String> list = this.f5062a;
            t.a(str);
            String str2 = str;
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(strValueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(strValueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f5063b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f5062a.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(this.f5062a.get(i2));
                if (i2 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }
}
