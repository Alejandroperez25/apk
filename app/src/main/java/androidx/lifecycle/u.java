package androidx.lifecycle;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final a f852a;

    /* renamed from: b, reason: collision with root package name */
    private final v f853b;

    public interface a {
        <T extends t> T a(Class<T> cls);
    }

    static abstract class b implements a {
        public abstract <T extends t> T a(String str, Class<T> cls);

        b() {
        }

        @Override // androidx.lifecycle.u.a
        public <T extends t> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }
    }

    public u(v vVar, a aVar) {
        this.f852a = aVar;
        this.f853b = vVar;
    }

    public <T extends t> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) a("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public <T extends t> T a(String str, Class<T> cls) {
        T t;
        T t2 = (T) this.f853b.a(str);
        if (cls.isInstance(t2)) {
            return t2;
        }
        if (this.f852a instanceof b) {
            t = (T) ((b) this.f852a).a(str, cls);
        } else {
            t = (T) this.f852a.a(cls);
        }
        this.f853b.a(str, t);
        return t;
    }
}
