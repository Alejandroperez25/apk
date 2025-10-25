package com.google.firebase.auth.internal;

import c.d.a.b.e.c.bb;
import com.google.firebase.auth.AbstractC0403c;
import com.google.firebase.auth.C0407g;
import com.google.firebase.auth.C0440v;
import com.google.firebase.auth.C0442x;
import com.google.firebase.auth.T;

/* loaded from: classes.dex */
public abstract class u {
    public static bb a(AbstractC0403c abstractC0403c, String str) {
        com.google.android.gms.common.internal.t.a(abstractC0403c);
        if (C0442x.class.isAssignableFrom(abstractC0403c.getClass())) {
            return C0442x.a((C0442x) abstractC0403c, str);
        }
        if (C0407g.class.isAssignableFrom(abstractC0403c.getClass())) {
            return C0407g.a((C0407g) abstractC0403c, str);
        }
        if (com.google.firebase.auth.E.class.isAssignableFrom(abstractC0403c.getClass())) {
            return com.google.firebase.auth.E.a((com.google.firebase.auth.E) abstractC0403c, str);
        }
        if (C0440v.class.isAssignableFrom(abstractC0403c.getClass())) {
            return C0440v.a((C0440v) abstractC0403c, str);
        }
        if (com.google.firebase.auth.C.class.isAssignableFrom(abstractC0403c.getClass())) {
            return com.google.firebase.auth.C.a((com.google.firebase.auth.C) abstractC0403c, str);
        }
        if (T.class.isAssignableFrom(abstractC0403c.getClass())) {
            return T.a((T) abstractC0403c, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
