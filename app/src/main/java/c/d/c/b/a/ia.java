package c.d.c.b.a;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
public abstract class ia {

    /* renamed from: a, reason: collision with root package name */
    public static final c.d.c.H<Class> f4143a = new H().a();

    /* renamed from: b, reason: collision with root package name */
    public static final c.d.c.I f4144b = a(Class.class, f4143a);

    /* renamed from: c, reason: collision with root package name */
    public static final c.d.c.H<BitSet> f4145c = new T().a();

    /* renamed from: d, reason: collision with root package name */
    public static final c.d.c.I f4146d = a(BitSet.class, f4145c);

    /* renamed from: e, reason: collision with root package name */
    public static final c.d.c.H<Boolean> f4147e = new ba();

    /* renamed from: f, reason: collision with root package name */
    public static final c.d.c.H<Boolean> f4148f = new ca();

    /* renamed from: g, reason: collision with root package name */
    public static final c.d.c.I f4149g = a(Boolean.TYPE, Boolean.class, f4147e);

    /* renamed from: h, reason: collision with root package name */
    public static final c.d.c.H<Number> f4150h = new da();

    /* renamed from: i, reason: collision with root package name */
    public static final c.d.c.I f4151i = a(Byte.TYPE, Byte.class, f4150h);
    public static final c.d.c.H<Number> j = new ea();
    public static final c.d.c.I k = a(Short.TYPE, Short.class, j);
    public static final c.d.c.H<Number> l = new fa();
    public static final c.d.c.I m = a(Integer.TYPE, Integer.class, l);
    public static final c.d.c.H<AtomicInteger> n = new ga().a();
    public static final c.d.c.I o = a(AtomicInteger.class, n);
    public static final c.d.c.H<AtomicBoolean> p = new ha().a();
    public static final c.d.c.I q = a(AtomicBoolean.class, p);
    public static final c.d.c.H<AtomicIntegerArray> r = new C0257x().a();
    public static final c.d.c.I s = a(AtomicIntegerArray.class, r);
    public static final c.d.c.H<Number> t = new C0258y();
    public static final c.d.c.H<Number> u = new C0259z();
    public static final c.d.c.H<Number> v = new A();
    public static final c.d.c.H<Number> w = new B();
    public static final c.d.c.I x = a(Number.class, w);
    public static final c.d.c.H<Character> y = new C();
    public static final c.d.c.I z = a(Character.TYPE, Character.class, y);
    public static final c.d.c.H<String> A = new D();
    public static final c.d.c.H<BigDecimal> B = new E();
    public static final c.d.c.H<BigInteger> C = new F();
    public static final c.d.c.I D = a(String.class, A);
    public static final c.d.c.H<StringBuilder> E = new G();
    public static final c.d.c.I F = a(StringBuilder.class, E);
    public static final c.d.c.H<StringBuffer> G = new I();
    public static final c.d.c.I H = a(StringBuffer.class, G);
    public static final c.d.c.H<URL> I = new J();
    public static final c.d.c.I J = a(URL.class, I);
    public static final c.d.c.H<URI> K = new K();
    public static final c.d.c.I L = a(URI.class, K);
    public static final c.d.c.H<InetAddress> M = new L();
    public static final c.d.c.I N = b(InetAddress.class, M);
    public static final c.d.c.H<UUID> O = new M();
    public static final c.d.c.I P = a(UUID.class, O);
    public static final c.d.c.H<Currency> Q = new N().a();
    public static final c.d.c.I R = a(Currency.class, Q);
    public static final c.d.c.I S = new P();
    public static final c.d.c.H<Calendar> T = new Q();
    public static final c.d.c.I U = b(Calendar.class, GregorianCalendar.class, T);
    public static final c.d.c.H<Locale> V = new R();
    public static final c.d.c.I W = a(Locale.class, V);
    public static final c.d.c.H<c.d.c.u> X = new S();
    public static final c.d.c.I Y = b(c.d.c.u.class, X);
    public static final c.d.c.I Z = new U();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a<T extends Enum<T>> extends c.d.c.H<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, T> f4152a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<T, String> f4153b = new HashMap();

        public a(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String strName = t.name();
                    c.d.c.a.c cVar = (c.d.c.a.c) cls.getField(strName).getAnnotation(c.d.c.a.c.class);
                    if (cVar != null) {
                        strName = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f4152a.put(str, t);
                        }
                    }
                    this.f4152a.put(strName, t);
                    this.f4153b.put(t, strName);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // c.d.c.H
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public T a(c.d.c.d.b bVar) {
            if (bVar.g() == c.d.c.d.c.NULL) {
                bVar.l();
                return null;
            }
            return this.f4152a.get(bVar.j());
        }

        @Override // c.d.c.H
        public void a(c.d.c.d.d dVar, T t) throws IOException {
            dVar.c(t == null ? null : this.f4153b.get(t));
        }
    }

    public static <TT> c.d.c.I a(Class<TT> cls, c.d.c.H<TT> h2) {
        return new V(cls, h2);
    }

    public static <TT> c.d.c.I a(Class<TT> cls, Class<TT> cls2, c.d.c.H<? super TT> h2) {
        return new W(cls, cls2, h2);
    }

    public static <TT> c.d.c.I b(Class<TT> cls, Class<? extends TT> cls2, c.d.c.H<? super TT> h2) {
        return new X(cls, cls2, h2);
    }

    public static <T1> c.d.c.I b(Class<T1> cls, c.d.c.H<T1> h2) {
        return new Z(cls, h2);
    }
}
