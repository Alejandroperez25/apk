package c.d.c.b;

import c.d.c.C0232b;
import c.d.c.InterfaceC0231a;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements c.d.c.I, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public static final s f4236a = new s();

    /* renamed from: e, reason: collision with root package name */
    private boolean f4240e;

    /* renamed from: b, reason: collision with root package name */
    private double f4237b = -1.0d;

    /* renamed from: c, reason: collision with root package name */
    private int f4238c = 136;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4239d = true;

    /* renamed from: f, reason: collision with root package name */
    private List<InterfaceC0231a> f4241f = Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    private List<InterfaceC0231a> f4242g = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public s m2clone() {
        try {
            return (s) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // c.d.c.I
    public <T> c.d.c.H<T> a(c.d.c.p pVar, c.d.c.c.a<T> aVar) {
        Class<? super T> clsA = aVar.a();
        boolean zA = a(clsA);
        boolean z = zA || b(clsA, true);
        boolean z2 = zA || b(clsA, false);
        if (z || z2) {
            return new r(this, z2, z, pVar, aVar);
        }
        return null;
    }

    public boolean a(Field field, boolean z) {
        c.d.c.a.a aVar;
        if ((this.f4238c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f4237b != -1.0d && !a((c.d.c.a.d) field.getAnnotation(c.d.c.a.d.class), (c.d.c.a.e) field.getAnnotation(c.d.c.a.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f4240e && ((aVar = (c.d.c.a.a) field.getAnnotation(c.d.c.a.a.class)) == null || (!z ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f4239d && c(field.getType())) || b(field.getType())) {
            return true;
        }
        List<InterfaceC0231a> list = z ? this.f4241f : this.f4242g;
        if (list.isEmpty()) {
            return false;
        }
        C0232b c0232b = new C0232b(field);
        Iterator<InterfaceC0231a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a(c0232b)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(Class<?> cls) {
        if (this.f4237b == -1.0d || a((c.d.c.a.d) cls.getAnnotation(c.d.c.a.d.class), (c.d.c.a.e) cls.getAnnotation(c.d.c.a.e.class))) {
            return (!this.f4239d && c(cls)) || b(cls);
        }
        return true;
    }

    public boolean a(Class<?> cls, boolean z) {
        return a(cls) || b(cls, z);
    }

    private boolean b(Class<?> cls, boolean z) {
        Iterator<InterfaceC0231a> it = (z ? this.f4241f : this.f4242g).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean c(Class<?> cls) {
        return cls.isMemberClass() && !d(cls);
    }

    private boolean d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean a(c.d.c.a.d dVar, c.d.c.a.e eVar) {
        return a(dVar) && a(eVar);
    }

    private boolean a(c.d.c.a.d dVar) {
        return dVar == null || dVar.value() <= this.f4237b;
    }

    private boolean a(c.d.c.a.e eVar) {
        return eVar == null || eVar.value() > this.f4237b;
    }
}
