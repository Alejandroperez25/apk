package c.d.a.b.e.c;

import java.util.Map;

/* loaded from: classes.dex */
final class E<K, V> extends AbstractC0223y<K, V> {

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC0223y<Object, Object> f3798e = new E(null, new Object[0], 0);

    /* renamed from: f, reason: collision with root package name */
    private final transient Object f3799f;

    /* renamed from: g, reason: collision with root package name */
    private final transient Object[] f3800g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f3801h;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        r0[r6] = (byte) r2;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        r0[r6] = (short) r2;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        r0[r7] = r2;
        r3 = r3 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <K, V> c.d.a.b.e.c.E<K, V> a(int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.b.e.c.E.a(int, java.lang.Object[]):c.d.a.b.e.c.E");
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i2) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(objArr[i2]);
        String strValueOf4 = String.valueOf(objArr[i2 ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 39 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    private E(Object obj, Object[] objArr, int i2) {
        this.f3799f = obj;
        this.f3800g = objArr;
        this.f3801h = i2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3801h;
    }

    @Override // c.d.a.b.e.c.AbstractC0223y, java.util.Map
    public final V get(Object obj) {
        Object obj2 = this.f3799f;
        Object[] objArr = this.f3800g;
        int i2 = this.f3801h;
        if (obj == null) {
            return null;
        }
        if (i2 == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        }
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int iA = AbstractC0217v.a(obj.hashCode());
            while (true) {
                int i3 = iA & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return (V) objArr[i4 ^ 1];
                }
                iA = i3 + 1;
            }
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int iA2 = AbstractC0217v.a(obj.hashCode());
            while (true) {
                int i5 = iA2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (objArr[i6].equals(obj)) {
                    return (V) objArr[i6 ^ 1];
                }
                iA2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int iA3 = AbstractC0217v.a(obj.hashCode());
            while (true) {
                int i7 = iA3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (objArr[i8].equals(obj)) {
                    return (V) objArr[i8 ^ 1];
                }
                iA3 = i7 + 1;
            }
        }
    }

    @Override // c.d.a.b.e.c.AbstractC0223y
    final C<Map.Entry<K, V>> a() {
        return new D(this, this.f3800g, 0, this.f3801h);
    }

    @Override // c.d.a.b.e.c.AbstractC0223y
    final C<K> b() {
        return new F(this, new I(this.f3800g, 0, this.f3801h));
    }

    @Override // c.d.a.b.e.c.AbstractC0223y
    final AbstractC0215u<V> c() {
        return new I(this.f3800g, 1, this.f3801h);
    }
}
