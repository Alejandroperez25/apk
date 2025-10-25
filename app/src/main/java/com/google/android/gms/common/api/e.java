package com.google.android.gms.common.api;

import android.os.Bundle;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<e> f4870a = Collections.newSetFromMap(new WeakHashMap());

    public interface a {
        void a(int i2);

        void a(Bundle bundle);
    }

    public interface b {
        void a(c.d.a.b.b.a aVar);
    }
}
