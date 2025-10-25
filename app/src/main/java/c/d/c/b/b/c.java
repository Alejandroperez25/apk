package c.d.c.b.b;

import c.d.c.v;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    private static Class f4200b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f4201c = b();

    /* renamed from: d, reason: collision with root package name */
    private final Field f4202d = c();

    c() {
    }

    @Override // c.d.c.b.b.b
    public void a(AccessibleObject accessibleObject) throws SecurityException {
        if (b(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new v("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
        }
    }

    boolean b(AccessibleObject accessibleObject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f4201c != null && this.f4202d != null) {
            try {
                f4200b.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f4201c, accessibleObject, Long.valueOf(((Long) f4200b.getMethod("objectFieldOffset", Field.class).invoke(this.f4201c, this.f4202d)).longValue()), true);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static Object b() throws NoSuchFieldException {
        try {
            f4200b = Class.forName("sun.misc.Unsafe");
            Field declaredField = f4200b.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }
}
