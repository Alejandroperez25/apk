package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public abstract class a {
    public static <T> boolean a(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (s.a(tArr[i2], t)) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }
}
