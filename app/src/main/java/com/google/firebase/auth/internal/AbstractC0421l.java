package com.google.firebase.auth.internal;

import android.text.TextUtils;
import c.d.a.b.e.c.AbstractC0221x;
import c.d.a.b.e.c.Pa;
import com.google.firebase.auth.ja;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.firebase.auth.internal.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0421l {
    public static List<ja> a(List<Pa> list) {
        if (list == null || list.isEmpty()) {
            return AbstractC0221x.h();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Pa> it = list.iterator();
        while (it.hasNext()) {
            Pa next = it.next();
            com.google.firebase.auth.L l = (next == null || TextUtils.isEmpty(next.o())) ? null : new com.google.firebase.auth.L(next.p(), next.l(), next.q(), next.o());
            if (l != null) {
                arrayList.add(l);
            }
        }
        return arrayList;
    }
}
