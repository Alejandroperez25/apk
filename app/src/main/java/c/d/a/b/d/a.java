package c.d.a.b.d;

import android.os.RemoteException;

@Deprecated
/* loaded from: classes.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f3767a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3768b;

    /* renamed from: c, reason: collision with root package name */
    private final T f3769c;

    private a(int i2, String str, T t) {
        this.f3767a = i2;
        this.f3768b = str;
        this.f3769c = t;
        c.a().a(this);
    }

    protected abstract T a(f fVar);

    @Deprecated
    /* renamed from: c.d.a.b.d.a$a, reason: collision with other inner class name */
    public static class C0046a extends a<Boolean> {
        public C0046a(int i2, String str, Boolean bool) {
            super(i2, str, bool);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // c.d.a.b.d.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean a(f fVar) {
            try {
                return Boolean.valueOf(fVar.getBooleanFlagValue(a(), b().booleanValue(), d()));
            } catch (RemoteException unused) {
                return b();
            }
        }
    }

    public final String a() {
        return this.f3768b;
    }

    public final T b() {
        return this.f3769c;
    }

    public T c() {
        return (T) c.b().a(this);
    }

    @Deprecated
    public static C0046a a(int i2, String str, Boolean bool) {
        return new C0046a(i2, str, bool);
    }

    @Deprecated
    public final int d() {
        return this.f3767a;
    }
}
