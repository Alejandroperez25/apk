package c.d.c;

import c.d.c.b.a.C0235b;
import c.d.c.b.a.C0236c;
import c.d.c.b.a.C0238e;
import c.d.c.b.a.C0239f;
import c.d.c.b.a.C0244k;
import c.d.c.b.a.C0247n;
import c.d.c.b.a.C0249p;
import c.d.c.b.a.C0251r;
import c.d.c.b.a.C0253t;
import c.d.c.b.a.ia;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final c.d.c.c.a<?> f4311a = c.d.c.c.a.b(Object.class);

    /* renamed from: b, reason: collision with root package name */
    private final ThreadLocal<Map<c.d.c.c.a<?>, a<?>>> f4312b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<c.d.c.c.a<?>, H<?>> f4313c;

    /* renamed from: d, reason: collision with root package name */
    private final c.d.c.b.q f4314d;

    /* renamed from: e, reason: collision with root package name */
    private final C0239f f4315e;

    /* renamed from: f, reason: collision with root package name */
    final List<I> f4316f;

    /* renamed from: g, reason: collision with root package name */
    final c.d.c.b.s f4317g;

    /* renamed from: h, reason: collision with root package name */
    final j f4318h;

    /* renamed from: i, reason: collision with root package name */
    final Map<Type, q<?>> f4319i;
    final boolean j;
    final boolean k;
    final boolean l;
    final boolean m;
    final boolean n;
    final boolean o;
    final boolean p;
    final String q;
    final int r;
    final int s;
    final F t;
    final List<I> u;
    final List<I> v;

    public p() {
        this(c.d.c.b.s.f4236a, EnumC0274i.f4300a, Collections.emptyMap(), false, false, false, true, false, false, false, F.f4103a, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    p(c.d.c.b.s sVar, j jVar, Map<Type, q<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, F f2, String str, int i2, int i3, List<I> list, List<I> list2, List<I> list3) {
        this.f4312b = new ThreadLocal<>();
        this.f4313c = new ConcurrentHashMap();
        this.f4317g = sVar;
        this.f4318h = jVar;
        this.f4319i = map;
        this.f4314d = new c.d.c.b.q(map);
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.t = f2;
        this.q = str;
        this.r = i2;
        this.s = i3;
        this.u = list;
        this.v = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ia.Y);
        arrayList.add(C0247n.f4161a);
        arrayList.add(sVar);
        arrayList.addAll(list3);
        arrayList.add(ia.D);
        arrayList.add(ia.m);
        arrayList.add(ia.f4149g);
        arrayList.add(ia.f4151i);
        arrayList.add(ia.k);
        H<Number> hA = a(f2);
        arrayList.add(ia.a(Long.TYPE, Long.class, hA));
        arrayList.add(ia.a(Double.TYPE, Double.class, a(z7)));
        arrayList.add(ia.a(Float.TYPE, Float.class, b(z7)));
        arrayList.add(ia.x);
        arrayList.add(ia.o);
        arrayList.add(ia.q);
        arrayList.add(ia.a(AtomicLong.class, a(hA)));
        arrayList.add(ia.a(AtomicLongArray.class, b(hA)));
        arrayList.add(ia.s);
        arrayList.add(ia.z);
        arrayList.add(ia.F);
        arrayList.add(ia.H);
        arrayList.add(ia.a(BigDecimal.class, ia.B));
        arrayList.add(ia.a(BigInteger.class, ia.C));
        arrayList.add(ia.J);
        arrayList.add(ia.L);
        arrayList.add(ia.P);
        arrayList.add(ia.R);
        arrayList.add(ia.W);
        arrayList.add(ia.N);
        arrayList.add(ia.f4146d);
        arrayList.add(C0238e.f4140a);
        arrayList.add(ia.U);
        arrayList.add(C0253t.f4181a);
        arrayList.add(C0251r.f4179a);
        arrayList.add(ia.S);
        arrayList.add(C0235b.f4134a);
        arrayList.add(ia.f4144b);
        arrayList.add(new C0236c(this.f4314d));
        arrayList.add(new C0244k(this.f4314d, z2));
        this.f4315e = new C0239f(this.f4314d);
        arrayList.add(this.f4315e);
        arrayList.add(ia.Z);
        arrayList.add(new C0249p(this.f4314d, jVar, sVar, this.f4315e));
        this.f4316f = Collections.unmodifiableList(arrayList);
    }

    private H<Number> a(boolean z) {
        if (z) {
            return ia.v;
        }
        return new k(this);
    }

    private H<Number> b(boolean z) {
        if (z) {
            return ia.u;
        }
        return new l(this);
    }

    static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private static H<Number> a(F f2) {
        if (f2 == F.f4103a) {
            return ia.t;
        }
        return new m();
    }

    private static H<AtomicLong> a(H<Number> h2) {
        return new n(h2).a();
    }

    private static H<AtomicLongArray> b(H<Number> h2) {
        return new o(h2).a();
    }

    public <T> H<T> a(c.d.c.c.a<T> aVar) {
        H<T> h2 = (H) this.f4313c.get(aVar == null ? f4311a : aVar);
        if (h2 != null) {
            return h2;
        }
        Map<c.d.c.c.a<?>, a<?>> map = this.f4312b.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f4312b.set(map);
            z = true;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            Iterator<I> it = this.f4316f.iterator();
            while (it.hasNext()) {
                H<T> hA = it.next().a(this, aVar);
                if (hA != null) {
                    aVar3.a((H<?>) hA);
                    this.f4313c.put(aVar, hA);
                    return hA;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f4312b.remove();
            }
        }
    }

    public <T> H<T> a(I i2, c.d.c.c.a<T> aVar) {
        if (!this.f4316f.contains(i2)) {
            i2 = this.f4315e;
        }
        boolean z = false;
        for (I i3 : this.f4316f) {
            if (z) {
                H<T> hA = i3.a(this, aVar);
                if (hA != null) {
                    return hA;
                }
            } else if (i3 == i2) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public <T> H<T> a(Class<T> cls) {
        return a((c.d.c.c.a) c.d.c.c.a.b(cls));
    }

    public String a(Object obj) {
        if (obj == null) {
            return a((u) w.f4322a);
        }
        return a(obj, obj.getClass());
    }

    public String a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void a(Object obj, Type type, Appendable appendable) {
        try {
            a(obj, type, a(c.d.c.b.D.a(appendable)));
        } catch (IOException e2) {
            throw new v(e2);
        }
    }

    public void a(Object obj, Type type, c.d.c.d.d dVar) {
        H hA = a((c.d.c.c.a) c.d.c.c.a.a(type));
        boolean zA = dVar.a();
        dVar.a(true);
        boolean zB = dVar.b();
        dVar.b(this.m);
        boolean zC = dVar.c();
        dVar.c(this.j);
        try {
            try {
                hA.a(dVar, obj);
            } catch (IOException e2) {
                throw new v(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage(), e3);
            }
        } finally {
            dVar.a(zA);
            dVar.b(zB);
            dVar.c(zC);
        }
    }

    public String a(u uVar) {
        StringWriter stringWriter = new StringWriter();
        a(uVar, stringWriter);
        return stringWriter.toString();
    }

    public void a(u uVar, Appendable appendable) {
        try {
            a(uVar, a(c.d.c.b.D.a(appendable)));
        } catch (IOException e2) {
            throw new v(e2);
        }
    }

    public c.d.c.d.d a(Writer writer) throws IOException {
        if (this.l) {
            writer.write(")]}'\n");
        }
        c.d.c.d.d dVar = new c.d.c.d.d(writer);
        if (this.n) {
            dVar.a("  ");
        }
        dVar.c(this.j);
        return dVar;
    }

    public c.d.c.d.b a(Reader reader) {
        c.d.c.d.b bVar = new c.d.c.d.b(reader);
        bVar.a(this.o);
        return bVar;
    }

    public void a(u uVar, c.d.c.d.d dVar) {
        boolean zA = dVar.a();
        dVar.a(true);
        boolean zB = dVar.b();
        dVar.b(this.m);
        boolean zC = dVar.c();
        dVar.c(this.j);
        try {
            try {
                c.d.c.b.D.a(uVar, dVar);
            } catch (IOException e2) {
                throw new v(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage(), e3);
            }
        } finally {
            dVar.a(zA);
            dVar.b(zB);
            dVar.c(zC);
        }
    }

    public <T> T a(String str, Class<T> cls) {
        return (T) c.d.c.b.C.a((Class) cls).cast(a(str, (Type) cls));
    }

    public <T> T a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) a((Reader) new StringReader(str), type);
    }

    public <T> T a(Reader reader, Type type) {
        c.d.c.d.b bVarA = a(reader);
        T t = (T) a(bVarA, type);
        a(t, bVarA);
        return t;
    }

    private static void a(Object obj, c.d.c.d.b bVar) {
        if (obj != null) {
            try {
                if (bVar.g() == c.d.c.d.c.END_DOCUMENT) {
                } else {
                    throw new v("JSON document was not fully consumed.");
                }
            } catch (c.d.c.d.e e2) {
                throw new C(e2);
            } catch (IOException e3) {
                throw new v(e3);
            }
        }
    }

    public <T> T a(c.d.c.d.b bVar, Type type) {
        boolean zA = bVar.a();
        boolean z = true;
        bVar.a(true);
        try {
            try {
                try {
                    bVar.g();
                    z = false;
                    T tA = a((c.d.c.c.a) c.d.c.c.a.a(type)).a(bVar);
                    bVar.a(zA);
                    return tA;
                } catch (EOFException e2) {
                    if (!z) {
                        throw new C(e2);
                    }
                    bVar.a(zA);
                    return null;
                } catch (AssertionError e3) {
                    throw new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage(), e3);
                }
            } catch (IOException e4) {
                throw new C(e4);
            } catch (IllegalStateException e5) {
                throw new C(e5);
            }
        } catch (Throwable th) {
            bVar.a(zA);
            throw th;
        }
    }

    static class a<T> extends H<T> {

        /* renamed from: a, reason: collision with root package name */
        private H<T> f4320a;

        a() {
        }

        public void a(H<T> h2) {
            if (this.f4320a != null) {
                throw new AssertionError();
            }
            this.f4320a = h2;
        }

        @Override // c.d.c.H
        public T a(c.d.c.d.b bVar) {
            if (this.f4320a == null) {
                throw new IllegalStateException();
            }
            return this.f4320a.a(bVar);
        }

        @Override // c.d.c.H
        public void a(c.d.c.d.d dVar, T t) {
            if (this.f4320a == null) {
                throw new IllegalStateException();
            }
            this.f4320a.a(dVar, t);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.j + ",factories:" + this.f4316f + ",instanceCreators:" + this.f4314d + "}";
    }
}
