package b.c;

/* loaded from: classes.dex */
public class f<E> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f993a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f994b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f995c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f996d;

    /* renamed from: e, reason: collision with root package name */
    private int f997e;

    public f() {
        this(10);
    }

    public f(int i2) {
        this.f994b = false;
        if (i2 == 0) {
            this.f995c = e.f991b;
            this.f996d = e.f992c;
        } else {
            int iB = e.b(i2);
            this.f995c = new long[iB];
            this.f996d = new Object[iB];
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public f<E> m0clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f995c = (long[]) this.f995c.clone();
            fVar.f996d = (Object[]) this.f996d.clone();
            return fVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E a(long j) {
        return a(j, null);
    }

    public E a(long j, E e2) {
        int iA = e.a(this.f995c, this.f997e, j);
        return (iA < 0 || this.f996d[iA] == f993a) ? e2 : (E) this.f996d[iA];
    }

    @Deprecated
    public void b(long j) {
        c(j);
    }

    public void c(long j) {
        int iA = e.a(this.f995c, this.f997e, j);
        if (iA < 0 || this.f996d[iA] == f993a) {
            return;
        }
        this.f996d[iA] = f993a;
        this.f994b = true;
    }

    private void b() {
        int i2 = this.f997e;
        long[] jArr = this.f995c;
        Object[] objArr = this.f996d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f993a) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f994b = false;
        this.f997e = i3;
    }

    public void b(long j, E e2) {
        int iA = e.a(this.f995c, this.f997e, j);
        if (iA >= 0) {
            this.f996d[iA] = e2;
            return;
        }
        int i2 = ~iA;
        if (i2 < this.f997e && this.f996d[i2] == f993a) {
            this.f995c[i2] = j;
            this.f996d[i2] = e2;
            return;
        }
        if (this.f994b && this.f997e >= this.f995c.length) {
            b();
            i2 = ~e.a(this.f995c, this.f997e, j);
        }
        if (this.f997e >= this.f995c.length) {
            int iB = e.b(this.f997e + 1);
            long[] jArr = new long[iB];
            Object[] objArr = new Object[iB];
            System.arraycopy(this.f995c, 0, jArr, 0, this.f995c.length);
            System.arraycopy(this.f996d, 0, objArr, 0, this.f996d.length);
            this.f995c = jArr;
            this.f996d = objArr;
        }
        if (this.f997e - i2 != 0) {
            int i3 = i2 + 1;
            System.arraycopy(this.f995c, i2, this.f995c, i3, this.f997e - i2);
            System.arraycopy(this.f996d, i2, this.f996d, i3, this.f997e - i2);
        }
        this.f995c[i2] = j;
        this.f996d[i2] = e2;
        this.f997e++;
    }

    public int a() {
        if (this.f994b) {
            b();
        }
        return this.f997e;
    }

    public long a(int i2) {
        if (this.f994b) {
            b();
        }
        return this.f995c[i2];
    }

    public E b(int i2) {
        if (this.f994b) {
            b();
        }
        return (E) this.f996d[i2];
    }

    public void c(long j, E e2) {
        if (this.f997e != 0 && j <= this.f995c[this.f997e - 1]) {
            b(j, e2);
            return;
        }
        if (this.f994b && this.f997e >= this.f995c.length) {
            b();
        }
        int i2 = this.f997e;
        if (i2 >= this.f995c.length) {
            int iB = e.b(i2 + 1);
            long[] jArr = new long[iB];
            Object[] objArr = new Object[iB];
            System.arraycopy(this.f995c, 0, jArr, 0, this.f995c.length);
            System.arraycopy(this.f996d, 0, objArr, 0, this.f996d.length);
            this.f995c = jArr;
            this.f996d = objArr;
        }
        this.f995c[i2] = j;
        this.f996d[i2] = e2;
        this.f997e = i2 + 1;
    }

    public String toString() {
        if (a() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f997e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f997e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(a(i2));
            sb.append('=');
            E eB = b(i2);
            if (eB != this) {
                sb.append(eB);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
