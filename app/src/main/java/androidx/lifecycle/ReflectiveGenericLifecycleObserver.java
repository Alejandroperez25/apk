package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.f;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f816a;

    /* renamed from: b, reason: collision with root package name */
    private final a.C0009a f817b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f816a = obj;
        this.f817b = a.f819a.b(this.f816a.getClass());
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f817b.a(iVar, aVar, this.f816a);
    }
}
