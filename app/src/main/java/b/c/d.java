package b.c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class d<E> implements Collection<E>, Set<E> {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f981a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    private static final Object[] f982b = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    private static Object[] f983c;

    /* renamed from: d, reason: collision with root package name */
    private static int f984d;

    /* renamed from: e, reason: collision with root package name */
    private static Object[] f985e;

    /* renamed from: f, reason: collision with root package name */
    private static int f986f;

    /* renamed from: g, reason: collision with root package name */
    private int[] f987g;

    /* renamed from: h, reason: collision with root package name */
    Object[] f988h;

    /* renamed from: i, reason: collision with root package name */
    int f989i;
    private h<E, E> j;

    private int a(Object obj, int i2) {
        int i3 = this.f989i;
        if (i3 == 0) {
            return -1;
        }
        int iA = e.a(this.f987g, i3, i2);
        if (iA < 0 || obj.equals(this.f988h[iA])) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.f987g[i4] == i2) {
            if (obj.equals(this.f988h[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.f987g[i5] == i2; i5--) {
            if (obj.equals(this.f988h[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    private int c() {
        int i2 = this.f989i;
        if (i2 == 0) {
            return -1;
        }
        int iA = e.a(this.f987g, i2, 0);
        if (iA < 0 || this.f988h[iA] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.f987g[i3] == 0) {
            if (this.f988h[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.f987g[i4] == 0; i4--) {
            if (this.f988h[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    private void e(int i2) {
        if (i2 == 8) {
            synchronized (d.class) {
                if (f985e != null) {
                    Object[] objArr = f985e;
                    this.f988h = objArr;
                    f985e = (Object[]) objArr[0];
                    this.f987g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f986f--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (d.class) {
                if (f983c != null) {
                    Object[] objArr2 = f983c;
                    this.f988h = objArr2;
                    f983c = (Object[]) objArr2[0];
                    this.f987g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f984d--;
                    return;
                }
            }
        }
        this.f987g = new int[i2];
        this.f988h = new Object[i2];
    }

    private static void a(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (f986f < 10) {
                    objArr[0] = f985e;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f985e = objArr;
                    f986f++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (d.class) {
                if (f984d < 10) {
                    objArr[0] = f983c;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f983c = objArr;
                    f984d++;
                }
            }
        }
    }

    public d() {
        this(0);
    }

    public d(int i2) {
        if (i2 == 0) {
            this.f987g = f981a;
            this.f988h = f982b;
        } else {
            e(i2);
        }
        this.f989i = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (this.f989i != 0) {
            a(this.f987g, this.f988h, this.f989i);
            this.f987g = f981a;
            this.f988h = f982b;
            this.f989i = 0;
        }
    }

    public void b(int i2) {
        if (this.f987g.length < i2) {
            int[] iArr = this.f987g;
            Object[] objArr = this.f988h;
            e(i2);
            if (this.f989i > 0) {
                System.arraycopy(iArr, 0, this.f987g, 0, this.f989i);
                System.arraycopy(objArr, 0, this.f988h, 0, this.f989i);
            }
            a(iArr, objArr, this.f989i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public int indexOf(Object obj) {
        return obj == null ? c() : a(obj, obj.hashCode());
    }

    public E c(int i2) {
        return (E) this.f988h[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f989i <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int iA;
        if (e2 == null) {
            iA = c();
            i2 = 0;
        } else {
            int iHashCode = e2.hashCode();
            i2 = iHashCode;
            iA = a(e2, iHashCode);
        }
        if (iA >= 0) {
            return false;
        }
        int i3 = ~iA;
        if (this.f989i >= this.f987g.length) {
            int i4 = 4;
            if (this.f989i >= 8) {
                i4 = (this.f989i >> 1) + this.f989i;
            } else if (this.f989i >= 4) {
                i4 = 8;
            }
            int[] iArr = this.f987g;
            Object[] objArr = this.f988h;
            e(i4);
            if (this.f987g.length > 0) {
                System.arraycopy(iArr, 0, this.f987g, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f988h, 0, objArr.length);
            }
            a(iArr, objArr, this.f989i);
        }
        if (i3 < this.f989i) {
            int i5 = i3 + 1;
            System.arraycopy(this.f987g, i3, this.f987g, i5, this.f989i - i3);
            System.arraycopy(this.f988h, i3, this.f988h, i5, this.f989i - i3);
        }
        this.f987g[i3] = i2;
        this.f988h[i3] = e2;
        this.f989i++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    public E d(int i2) {
        E e2 = (E) this.f988h[i2];
        if (this.f989i <= 1) {
            a(this.f987g, this.f988h, this.f989i);
            this.f987g = f981a;
            this.f988h = f982b;
            this.f989i = 0;
        } else {
            int i3 = 8;
            if (this.f987g.length > 8 && this.f989i < this.f987g.length / 3) {
                if (this.f989i > 8) {
                    i3 = (this.f989i >> 1) + this.f989i;
                }
                int[] iArr = this.f987g;
                Object[] objArr = this.f988h;
                e(i3);
                this.f989i--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f987g, 0, i2);
                    System.arraycopy(objArr, 0, this.f988h, 0, i2);
                }
                if (i2 < this.f989i) {
                    int i4 = i2 + 1;
                    System.arraycopy(iArr, i4, this.f987g, i2, this.f989i - i2);
                    System.arraycopy(objArr, i4, this.f988h, i2, this.f989i - i2);
                }
            } else {
                this.f989i--;
                if (i2 < this.f989i) {
                    int i5 = i2 + 1;
                    System.arraycopy(this.f987g, i5, this.f987g, i2, this.f989i - i2);
                    System.arraycopy(this.f988h, i5, this.f988h, i2, this.f989i - i2);
                }
                this.f988h[this.f989i] = null;
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f989i;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        Object[] objArr = new Object[this.f989i];
        System.arraycopy(this.f988h, 0, objArr, 0, this.f989i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f989i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f989i));
        }
        System.arraycopy(this.f988h, 0, tArr, 0, this.f989i);
        if (tArr.length > this.f989i) {
            tArr[this.f989i] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f989i; i2++) {
            try {
                if (!set.contains(c(i2))) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            } catch (NullPointerException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f987g;
        int i2 = this.f989i;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f989i * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f989i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E eC = c(i2);
            if (eC != this) {
                sb.append(eC);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    private h<E, E> d() {
        if (this.j == null) {
            this.j = new c(this);
        }
        return this.j;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return d().b().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        b(this.f989i + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f989i - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f988h[i2])) {
                d(i2);
                z = true;
            }
        }
        return z;
    }
}
