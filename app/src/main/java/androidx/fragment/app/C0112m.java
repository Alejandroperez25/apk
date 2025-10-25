package androidx.fragment.app;

import androidx.fragment.app.ComponentCallbacksC0108i;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0112m {

    /* renamed from: a, reason: collision with root package name */
    private static final b.c.i<String, Class<?>> f747a = new b.c.i<>();

    private static Class<?> d(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Class<?> cls = f747a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f747a.put(str, cls2);
        return cls2;
    }

    static boolean a(ClassLoader classLoader, String str) {
        try {
            return ComponentCallbacksC0108i.class.isAssignableFrom(d(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<? extends ComponentCallbacksC0108i> b(ClassLoader classLoader, String str) {
        try {
            return d(classLoader, str);
        } catch (ClassCastException e2) {
            throw new ComponentCallbacksC0108i.b("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        } catch (ClassNotFoundException e3) {
            throw new ComponentCallbacksC0108i.b("Unable to instantiate fragment " + str + ": make sure class name exists", e3);
        }
    }

    public ComponentCallbacksC0108i c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new ComponentCallbacksC0108i.b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new ComponentCallbacksC0108i.b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new ComponentCallbacksC0108i.b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new ComponentCallbacksC0108i.b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }
}
