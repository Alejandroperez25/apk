package b.c;

/* loaded from: classes.dex */
public class j<E> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f1028a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f1029b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f1030c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f1031d;

    /* renamed from: e, reason: collision with root package name */
    private int f1032e;

    public j() {
        this(10);
    }

    public j(int i2) {
        this.f1029b = false;
        if (i2 == 0) {
            this.f1030c = e.f990a;
            this.f1031d = e.f992c;
        } else {
            int iA = e.a(i2);
            this.f1030c = new int[iA];
            this.f1031d = new Object[iA];
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public j<E> m1clone() {
        try {
            j<E> jVar = (j) super.clone();
            jVar.f1030c = (int[]) this.f1030c.clone();
            jVar.f1031d = (Object[]) this.f1031d.clone();
            return jVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E a(int i2) {
        return a(i2, null);
    }

    public E a(int i2, E e2) {
        int iA = e.a(this.f1030c, this.f1032e, i2);
        return (iA < 0 || this.f1031d[iA] == f1028a) ? e2 : (E) this.f1031d[iA];
    }

    public void b(int i2) {
        int iA = e.a(this.f1030c, this.f1032e, i2);
        if (iA < 0 || this.f1031d[iA] == f1028a) {
            return;
        }
        this.f1031d[iA] = f1028a;
        this.f1029b = true;
    }

    private void c() {
        int i2 = this.f1032e;
        int[] iArr = this.f1030c;
        Object[] objArr = this.f1031d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1028a) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1029b = false;
        this.f1032e = i3;
    }

    public void b(int i2, E e2) {
        int iA = e.a(this.f1030c, this.f1032e, i2);
        if (iA >= 0) {
            this.f1031d[iA] = e2;
            return;
        }
        int i3 = ~iA;
        if (i3 < this.f1032e && this.f1031d[i3] == f1028a) {
            this.f1030c[i3] = i2;
            this.f1031d[i3] = e2;
            return;
        }
        if (this.f1029b && this.f1032e >= this.f1030c.length) {
            c();
            i3 = ~e.a(this.f1030c, this.f1032e, i2);
        }
        if (this.f1032e >= this.f1030c.length) {
            int iA2 = e.a(this.f1032e + 1);
            int[] iArr = new int[iA2];
            Object[] objArr = new Object[iA2];
            System.arraycopy(this.f1030c, 0, iArr, 0, this.f1030c.length);
            System.arraycopy(this.f1031d, 0, objArr, 0, this.f1031d.length);
            this.f1030c = iArr;
            this.f1031d = objArr;
        }
        if (this.f1032e - i3 != 0) {
            int i4 = i3 + 1;
            System.arraycopy(this.f1030c, i3, this.f1030c, i4, this.f1032e - i3);
            System.arraycopy(this.f1031d, i3, this.f1031d, i4, this.f1032e - i3);
        }
        this.f1030c[i3] = i2;
        this.f1031d[i3] = e2;
        this.f1032e++;
    }

    public int a() {
        if (this.f1029b) {
            c();
        }
        return this.f1032e;
    }

    public int c(int i2) {
        if (this.f1029b) {
            c();
        }
        return this.f1030c[i2];
    }

    public E d(int i2) {
        if (this.f1029b) {
            c();
        }
        return (E) this.f1031d[i2];
    }

    public void b() {
        int i2 = this.f1032e;
        Object[] objArr = this.f1031d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1032e = 0;
        this.f1029b = false;
    }

    public void c(int i2, E e2) {
        if (this.f1032e != 0 && i2 <= this.f1030c[this.f1032e - 1]) {
            b(i2, e2);
            return;
        }
        if (this.f1029b && this.f1032e >= this.f1030c.length) {
            c();
        }
        int i3 = this.f1032e;
        if (i3 >= this.f1030c.length) {
            int iA = e.a(i3 + 1);
            int[] iArr = new int[iA];
            Object[] objArr = new Object[iA];
            System.arraycopy(this.f1030c, 0, iArr, 0, this.f1030c.length);
            System.arraycopy(this.f1031d, 0, objArr, 0, this.f1031d.length);
            this.f1030c = iArr;
            this.f1031d = objArr;
        }
        this.f1030c[i3] = i2;
        this.f1031d[i3] = e2;
        this.f1032e = i3 + 1;
    }

    public String toString() {
        if (a() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1032e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1032e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            E eD = d(i2);
            if (eD != this) {
                sb.append(eD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
