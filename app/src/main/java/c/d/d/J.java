package c.d.d;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private static final J f4345a = new J(0, new int[0], new Object[0], false);

    /* renamed from: b, reason: collision with root package name */
    private int f4346b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f4347c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f4348d;

    /* renamed from: e, reason: collision with root package name */
    private int f4349e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4350f;

    public static J a() {
        return f4345a;
    }

    static J a(J j, J j2) {
        int i2 = j.f4346b + j2.f4346b;
        int[] iArrCopyOf = Arrays.copyOf(j.f4347c, i2);
        System.arraycopy(j2.f4347c, 0, iArrCopyOf, j.f4346b, j2.f4346b);
        Object[] objArrCopyOf = Arrays.copyOf(j.f4348d, i2);
        System.arraycopy(j2.f4348d, 0, objArrCopyOf, j.f4346b, j2.f4346b);
        return new J(i2, iArrCopyOf, objArrCopyOf, true);
    }

    private J() {
        this(0, new int[8], new Object[8], true);
    }

    private J(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f4349e = -1;
        this.f4346b = i2;
        this.f4347c = iArr;
        this.f4348d = objArr;
        this.f4350f = z;
    }

    public void b() {
        this.f4350f = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return this.f4346b == j.f4346b && Arrays.equals(this.f4347c, j.f4347c) && Arrays.deepEquals(this.f4348d, j.f4348d);
    }

    public int hashCode() {
        return ((((527 + this.f4346b) * 31) + Arrays.hashCode(this.f4347c)) * 31) + Arrays.deepHashCode(this.f4348d);
    }

    final void a(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f4346b; i3++) {
            z.a(sb, i2, String.valueOf(S.b(this.f4347c[i3])), this.f4348d[i3]);
        }
    }
}
