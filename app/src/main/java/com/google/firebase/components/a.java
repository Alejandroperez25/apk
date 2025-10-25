package com.google.firebase.components;

import java.util.Set;

/* loaded from: classes.dex */
abstract class a implements f {
    a() {
    }

    @Override // com.google.firebase.components.f
    public <T> T a(Class<T> cls) {
        c.d.b.c.a<T> aVarB = b(cls);
        if (aVarB == null) {
            return null;
        }
        return aVarB.get();
    }

    @Override // com.google.firebase.components.f
    public <T> Set<T> d(Class<T> cls) {
        return c(cls).get();
    }
}
