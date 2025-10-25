package org.chromium.support_lib_boundary.a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public class a {
    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
