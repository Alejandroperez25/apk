package c.d.a.a.e;

import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
public interface o {
    a b(long j);

    boolean c();

    long d();

    public static final class b implements o {

        /* renamed from: a, reason: collision with root package name */
        private final long f2352a;

        /* renamed from: b, reason: collision with root package name */
        private final a f2353b;

        @Override // c.d.a.a.e.o
        public boolean c() {
            return false;
        }

        public b(long j) {
            this(j, 0L);
        }

        public b(long j, long j2) {
            this.f2352a = j;
            this.f2353b = new a(j2 == 0 ? p.f2354a : new p(0L, j2));
        }

        @Override // c.d.a.a.e.o
        public long d() {
            return this.f2352a;
        }

        @Override // c.d.a.a.e.o
        public a b(long j) {
            return this.f2353b;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final p f2350a;

        /* renamed from: b, reason: collision with root package name */
        public final p f2351b;

        public a(p pVar) {
            this(pVar, pVar);
        }

        public a(p pVar, p pVar2) {
            AbstractC0170e.a(pVar);
            this.f2350a = pVar;
            AbstractC0170e.a(pVar2);
            this.f2351b = pVar2;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f2350a);
            if (this.f2350a.equals(this.f2351b)) {
                str = "";
            } else {
                str = ", " + this.f2351b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2350a.equals(aVar.f2350a) && this.f2351b.equals(aVar.f2351b);
        }

        public int hashCode() {
            return (this.f2350a.hashCode() * 31) + this.f2351b.hashCode();
        }
    }
}
