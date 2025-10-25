package b.c;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class i<K, V> {

    /* renamed from: a, reason: collision with root package name */
    static Object[] f1021a;

    /* renamed from: b, reason: collision with root package name */
    static int f1022b;

    /* renamed from: c, reason: collision with root package name */
    static Object[] f1023c;

    /* renamed from: d, reason: collision with root package name */
    static int f1024d;

    /* renamed from: e, reason: collision with root package name */
    int[] f1025e;

    /* renamed from: f, reason: collision with root package name */
    Object[] f1026f;

    /* renamed from: g, reason: collision with root package name */
    int f1027g;

    private static int a(int[] iArr, int i2, int i3) {
        try {
            return e.a(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    int a(Object obj, int i2) {
        int i3 = this.f1027g;
        if (i3 == 0) {
            return -1;
        }
        int iA = a(this.f1025e, i3, i2);
        if (iA < 0 || obj.equals(this.f1026f[iA << 1])) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.f1025e[i4] == i2) {
            if (obj.equals(this.f1026f[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.f1025e[i5] == i2; i5--) {
            if (obj.equals(this.f1026f[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    int a() {
        int i2 = this.f1027g;
        if (i2 == 0) {
            return -1;
        }
        int iA = a(this.f1025e, i2, 0);
        if (iA < 0 || this.f1026f[iA << 1] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.f1025e[i3] == 0) {
            if (this.f1026f[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.f1025e[i4] == 0; i4--) {
            if (this.f1026f[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    private void e(int i2) {
        if (i2 == 8) {
            synchronized (i.class) {
                if (f1023c != null) {
                    Object[] objArr = f1023c;
                    this.f1026f = objArr;
                    f1023c = (Object[]) objArr[0];
                    this.f1025e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1024d--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (i.class) {
                if (f1021a != null) {
                    Object[] objArr2 = f1021a;
                    this.f1026f = objArr2;
                    f1021a = (Object[]) objArr2[0];
                    this.f1025e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1022b--;
                    return;
                }
            }
        }
        this.f1025e = new int[i2];
        this.f1026f = new Object[i2 << 1];
    }

    private static void a(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (i.class) {
                if (f1024d < 10) {
                    objArr[0] = f1023c;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1023c = objArr;
                    f1024d++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (i.class) {
                if (f1022b < 10) {
                    objArr[0] = f1021a;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1021a = objArr;
                    f1022b++;
                }
            }
        }
    }

    public i() {
        this.f1025e = e.f990a;
        this.f1026f = e.f992c;
        this.f1027g = 0;
    }

    public i(int i2) {
        if (i2 == 0) {
            this.f1025e = e.f990a;
            this.f1026f = e.f992c;
        } else {
            e(i2);
        }
        this.f1027g = 0;
    }

    public void clear() {
        if (this.f1027g > 0) {
            int[] iArr = this.f1025e;
            Object[] objArr = this.f1026f;
            int i2 = this.f1027g;
            this.f1025e = e.f990a;
            this.f1026f = e.f992c;
            this.f1027g = 0;
            a(iArr, objArr, i2);
        }
        if (this.f1027g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public void a(int i2) {
        int i3 = this.f1027g;
        if (this.f1025e.length < i2) {
            int[] iArr = this.f1025e;
            Object[] objArr = this.f1026f;
            e(i2);
            if (this.f1027g > 0) {
                System.arraycopy(iArr, 0, this.f1025e, 0, i3);
                System.arraycopy(objArr, 0, this.f1026f, 0, i3 << 1);
            }
            a(iArr, objArr, i3);
        }
        if (this.f1027g != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    int b(Object obj) {
        int i2 = this.f1027g * 2;
        Object[] objArr = this.f1026f;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int iA = a(obj);
        return iA >= 0 ? (V) this.f1026f[(iA << 1) + 1] : v;
    }

    public K b(int i2) {
        return (K) this.f1026f[i2 << 1];
    }

    public V c(int i2) {
        return (V) this.f1026f[(i2 << 1) + 1];
    }

    public V a(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        V v2 = (V) this.f1026f[i3];
        this.f1026f[i3] = v;
        return v2;
    }

    public boolean isEmpty() {
        return this.f1027g <= 0;
    }

    public V put(K k, V v) {
        int i2;
        int iA;
        int i3 = this.f1027g;
        if (k == null) {
            iA = a();
            i2 = 0;
        } else {
            int iHashCode = k.hashCode();
            i2 = iHashCode;
            iA = a(k, iHashCode);
        }
        if (iA >= 0) {
            int i4 = (iA << 1) + 1;
            V v2 = (V) this.f1026f[i4];
            this.f1026f[i4] = v;
            return v2;
        }
        int i5 = ~iA;
        if (i3 >= this.f1025e.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f1025e;
            Object[] objArr = this.f1026f;
            e(i6);
            if (i3 != this.f1027g) {
                throw new ConcurrentModificationException();
            }
            if (this.f1025e.length > 0) {
                System.arraycopy(iArr, 0, this.f1025e, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1026f, 0, objArr.length);
            }
            a(iArr, objArr, i3);
        }
        if (i5 < i3) {
            int i7 = i5 + 1;
            System.arraycopy(this.f1025e, i5, this.f1025e, i7, i3 - i5);
            System.arraycopy(this.f1026f, i5 << 1, this.f1026f, i7 << 1, (this.f1027g - i5) << 1);
        }
        if (i3 != this.f1027g || i5 >= this.f1025e.length) {
            throw new ConcurrentModificationException();
        }
        this.f1025e[i5] = i2;
        int i8 = i5 << 1;
        this.f1026f[i8] = k;
        this.f1026f[i8 + 1] = v;
        this.f1027g++;
        return null;
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int iA = a(obj);
        if (iA >= 0) {
            return d(iA);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int iA = a(obj);
        if (iA < 0) {
            return false;
        }
        V vC = c(iA);
        if (obj2 != vC && (obj2 == null || !obj2.equals(vC))) {
            return false;
        }
        d(iA);
        return true;
    }

    public V d(int i2) {
        int i3 = i2 << 1;
        V v = (V) this.f1026f[i3 + 1];
        int i4 = this.f1027g;
        int i5 = 0;
        if (i4 <= 1) {
            a(this.f1025e, this.f1026f, i4);
            this.f1025e = e.f990a;
            this.f1026f = e.f992c;
        } else {
            int i6 = i4 - 1;
            if (this.f1025e.length > 8 && this.f1027g < this.f1025e.length / 3) {
                int i7 = i4 > 8 ? i4 + (i4 >> 1) : 8;
                int[] iArr = this.f1025e;
                Object[] objArr = this.f1026f;
                e(i7);
                if (i4 != this.f1027g) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1025e, 0, i2);
                    System.arraycopy(objArr, 0, this.f1026f, 0, i3);
                }
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr, i8, this.f1025e, i2, i9);
                    System.arraycopy(objArr, i8 << 1, this.f1026f, i3, i9 << 1);
                }
            } else {
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(this.f1025e, i10, this.f1025e, i2, i11);
                    System.arraycopy(this.f1026f, i10 << 1, this.f1026f, i3, i11 << 1);
                }
                int i12 = i6 << 1;
                this.f1026f[i12] = null;
                this.f1026f[i12 + 1] = null;
            }
            i5 = i6;
        }
        if (i4 != this.f1027g) {
            throw new ConcurrentModificationException();
        }
        this.f1027g = i5;
        return v;
    }

    public V replace(K k, V v) {
        int iA = a(k);
        if (iA >= 0) {
            return a(iA, (int) v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int iA = a(k);
        if (iA < 0) {
            return false;
        }
        V vC = c(iA);
        if (vC != v && (v == null || !v.equals(vC))) {
            return false;
        }
        a(iA, (int) v2);
        return true;
    }

    public int size() {
        return this.f1027g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (size() != iVar.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1027g; i2++) {
                try {
                    K kB = b(i2);
                    V vC = c(i2);
                    Object obj2 = iVar.get(kB);
                    if (vC == null) {
                        if (obj2 != null || !iVar.containsKey(kB)) {
                            return false;
                        }
                    } else if (!vC.equals(obj2)) {
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
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        for (int i3 = 0; i3 < this.f1027g; i3++) {
            try {
                K kB2 = b(i3);
                V vC2 = c(i3);
                Object obj3 = map.get(kB2);
                if (vC2 == null) {
                    if (obj3 != null || !map.containsKey(kB2)) {
                        return false;
                    }
                } else if (!vC2.equals(obj3)) {
                    return false;
                }
            } catch (ClassCastException unused3) {
                return false;
            } catch (NullPointerException unused4) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int[] iArr = this.f1025e;
        Object[] objArr = this.f1026f;
        int i2 = this.f1027g;
        int i3 = 0;
        int i4 = 1;
        int iHashCode = 0;
        while (i3 < i2) {
            Object obj = objArr[i4];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i4 += 2;
        }
        return iHashCode;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1027g * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1027g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kB = b(i2);
            if (kB != this) {
                sb.append(kB);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vC = c(i2);
            if (vC != this) {
                sb.append(vC);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
