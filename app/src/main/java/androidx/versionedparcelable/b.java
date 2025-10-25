package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected final b.c.b<String, Method> f873a;

    /* renamed from: b, reason: collision with root package name */
    protected final b.c.b<String, Method> f874b;

    /* renamed from: c, reason: collision with root package name */
    protected final b.c.b<String, Class> f875c;

    protected abstract void a(int i2);

    protected abstract void a(Parcelable parcelable);

    protected abstract void a(CharSequence charSequence);

    protected abstract void a(String str);

    protected abstract void a(boolean z);

    public void a(boolean z, boolean z2) {
    }

    protected abstract void a(byte[] bArr);

    public boolean a() {
        return false;
    }

    protected abstract void b();

    protected abstract boolean b(int i2);

    protected abstract b c();

    protected abstract void c(int i2);

    protected abstract int d();

    protected abstract String e();

    protected abstract byte[] f();

    protected abstract CharSequence g();

    protected abstract <T extends Parcelable> T h();

    protected abstract boolean i();

    public b(b.c.b<String, Method> bVar, b.c.b<String, Method> bVar2, b.c.b<String, Class> bVar3) {
        this.f873a = bVar;
        this.f874b = bVar2;
        this.f875c = bVar3;
    }

    public void a(boolean z, int i2) {
        c(i2);
        a(z);
    }

    public void a(byte[] bArr, int i2) {
        c(i2);
        a(bArr);
    }

    public void a(CharSequence charSequence, int i2) {
        c(i2);
        a(charSequence);
    }

    public void a(int i2, int i3) {
        c(i3);
        a(i2);
    }

    public void a(String str, int i2) {
        c(i2);
        a(str);
    }

    public void a(Parcelable parcelable, int i2) {
        c(i2);
        a(parcelable);
    }

    public boolean b(boolean z, int i2) {
        return !b(i2) ? z : i();
    }

    public int b(int i2, int i3) {
        return !b(i3) ? i2 : d();
    }

    public String b(String str, int i2) {
        return !b(i2) ? str : e();
    }

    public byte[] b(byte[] bArr, int i2) {
        return !b(i2) ? bArr : f();
    }

    public <T extends Parcelable> T b(T t, int i2) {
        return !b(i2) ? t : (T) h();
    }

    public CharSequence b(CharSequence charSequence, int i2) {
        return !b(i2) ? charSequence : g();
    }

    public void a(d dVar, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c(i2);
        a(dVar);
    }

    protected void a(d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (dVar == null) {
            a((String) null);
            return;
        }
        b(dVar);
        b bVarC = c();
        a((b) dVar, bVarC);
        bVarC.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(d dVar) {
        try {
            a(b((Class<? extends d>) dVar.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(dVar.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    public <T extends d> T b(T t, int i2) {
        return !b(i2) ? t : (T) j();
    }

    protected <T extends d> T j() {
        String strE = e();
        if (strE == null) {
            return null;
        }
        return (T) a(strE, c());
    }

    protected <T extends d> T a(String str, b bVar) {
        try {
            return (T) b(str).invoke(null, bVar);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    protected <T extends d> void a(T t, b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            a(t.getClass()).invoke(null, t, bVar);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    private Method b(String str) throws NoSuchMethodException, SecurityException {
        Method method = this.f873a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        this.f873a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Method a(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method = this.f874b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsB = b((Class<? extends d>) cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, b.class);
        this.f874b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private Class b(Class<? extends d> cls) throws ClassNotFoundException {
        Class cls2 = this.f875c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f875c.put(cls.getName(), cls3);
        return cls3;
    }
}
