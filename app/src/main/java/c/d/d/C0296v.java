package c.d.d;

import c.d.d.S;
import c.d.d.x;

/* renamed from: c.d.d.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0296v<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f4453a;

    /* renamed from: b, reason: collision with root package name */
    private final K f4454b;

    /* renamed from: c, reason: collision with root package name */
    private final V f4455c;

    /* renamed from: c.d.d.v$a */
    static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final S.a f4456a;

        /* renamed from: b, reason: collision with root package name */
        public final K f4457b;

        /* renamed from: c, reason: collision with root package name */
        public final S.a f4458c;

        /* renamed from: d, reason: collision with root package name */
        public final V f4459d;

        public a(S.a aVar, K k, S.a aVar2, V v) {
            this.f4456a = aVar;
            this.f4457b = k;
            this.f4458c = aVar2;
            this.f4459d = v;
        }
    }

    private C0296v(S.a aVar, K k, S.a aVar2, V v) {
        this.f4453a = new a<>(aVar, k, aVar2, v);
        this.f4454b = k;
        this.f4455c = v;
    }

    public static <K, V> C0296v<K, V> a(S.a aVar, K k, S.a aVar2, V v) {
        return new C0296v<>(aVar, k, aVar2, v);
    }

    static <K, V> void a(AbstractC0283i abstractC0283i, a<K, V> aVar, K k, V v) {
        C0287m.a(abstractC0283i, aVar.f4456a, 1, k);
        C0287m.a(abstractC0283i, aVar.f4458c, 2, v);
    }

    static <K, V> int a(a<K, V> aVar, K k, V v) {
        return C0287m.a(aVar.f4456a, 1, k) + C0287m.a(aVar.f4458c, 2, v);
    }

    static <T> T a(C0281g c0281g, C0285k c0285k, S.a aVar, T t) throws C0291q {
        switch (C0295u.f4452a[aVar.ordinal()]) {
            case 1:
                x.a aVarB = ((x) t).b();
                c0281g.a(aVarB, c0285k);
                return (T) aVarB.g();
            case 2:
                return (T) Integer.valueOf(c0281g.o());
            case 3:
                throw new RuntimeException("Groups are not allowed in maps.");
            default:
                return (T) C0287m.a(c0281g, aVar, true);
        }
    }

    public void a(AbstractC0283i abstractC0283i, int i2, K k, V v) {
        abstractC0283i.c(i2, 2);
        abstractC0283i.k(a(this.f4453a, k, v));
        a(abstractC0283i, this.f4453a, k, v);
    }

    public int a(int i2, K k, V v) {
        return AbstractC0283i.a(i2) + AbstractC0283i.h(a(this.f4453a, k, v));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(w<K, V> wVar, C0281g c0281g, C0285k c0285k) throws C0291q {
        int iD = c0281g.d(c0281g.t());
        Object objA = this.f4453a.f4457b;
        Object objA2 = this.f4453a.f4459d;
        while (true) {
            int iA = c0281g.a();
            if (iA == 0) {
                break;
            }
            if (iA == S.a(1, this.f4453a.f4456a.b())) {
                objA = a(c0281g, c0285k, this.f4453a.f4456a, objA);
            } else if (iA == S.a(2, this.f4453a.f4458c.b())) {
                objA2 = a(c0281g, c0285k, this.f4453a.f4458c, objA2);
            } else if (!c0281g.c(iA)) {
                break;
            }
        }
        c0281g.b(0);
        c0281g.e(iD);
        wVar.put(objA, objA2);
    }
}
