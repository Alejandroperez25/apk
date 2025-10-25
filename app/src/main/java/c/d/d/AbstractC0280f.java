package c.d.d;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: c.d.d.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0280f implements Iterable<Byte>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0280f f4390a = new C0052f(AbstractC0290p.f4445c);

    /* renamed from: b, reason: collision with root package name */
    private static final c f4391b;

    /* renamed from: c, reason: collision with root package name */
    private int f4392c = 0;

    /* renamed from: c.d.d.f$c */
    private interface c {
        byte[] a(byte[] bArr, int i2, int i3);
    }

    /* renamed from: c.d.d.f$d */
    public interface d extends Iterator<Byte> {
    }

    abstract void a(AbstractC0278d abstractC0278d);

    protected abstract void a(byte[] bArr, int i2, int i3, int i4);

    public abstract byte b(int i2);

    protected abstract int b(int i2, int i3, int i4);

    public abstract AbstractC0280f b(int i2, int i3);

    public abstract boolean equals(Object obj);

    public abstract int size();

    static {
        boolean z = true;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        C0279e c0279e = null;
        f4391b = z ? new g(c0279e) : new a(c0279e);
    }

    /* renamed from: c.d.d.f$g */
    private static final class g implements c {
        private g() {
        }

        /* synthetic */ g(C0279e c0279e) {
            this();
        }

        @Override // c.d.d.AbstractC0280f.c
        public byte[] a(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }
    }

    /* renamed from: c.d.d.f$a */
    private static final class a implements c {
        private a() {
        }

        /* synthetic */ a(C0279e c0279e) {
            this();
        }

        @Override // c.d.d.AbstractC0280f.c
        public byte[] a(byte[] bArr, int i2, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }
    }

    AbstractC0280f() {
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public final Iterator<Byte> iterator2() {
        return new C0279e(this);
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public static AbstractC0280f a(byte[] bArr, int i2, int i3) {
        return new C0052f(f4391b.a(bArr, i2, i3));
    }

    public static AbstractC0280f a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    static AbstractC0280f b(byte[] bArr) {
        return new C0052f(bArr);
    }

    static AbstractC0280f b(byte[] bArr, int i2, int i3) {
        return new b(bArr, i2, i3);
    }

    public static AbstractC0280f a(String str) {
        return new C0052f(str.getBytes(AbstractC0290p.f4443a));
    }

    public final byte[] c() {
        int size = size();
        if (size == 0) {
            return AbstractC0290p.f4445c;
        }
        byte[] bArr = new byte[size];
        a(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: c.d.d.f$e */
    static abstract class e extends AbstractC0280f {
        e() {
        }

        @Override // c.d.d.AbstractC0280f, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }
    }

    public final int hashCode() {
        int iB = this.f4392c;
        if (iB == 0) {
            int size = size();
            iB = b(size, 0, size);
            if (iB == 0) {
                iB = 1;
            }
            this.f4392c = iB;
        }
        return iB;
    }

    protected final int d() {
        return this.f4392c;
    }

    static void a(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
        }
    }

    static int a(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* renamed from: c.d.d.f$f, reason: collision with other inner class name */
    private static class C0052f extends e {

        /* renamed from: d, reason: collision with root package name */
        protected final byte[] f4395d;

        protected int e() {
            return 0;
        }

        C0052f(byte[] bArr) {
            this.f4395d = bArr;
        }

        @Override // c.d.d.AbstractC0280f
        public byte b(int i2) {
            return this.f4395d[i2];
        }

        @Override // c.d.d.AbstractC0280f
        public int size() {
            return this.f4395d.length;
        }

        @Override // c.d.d.AbstractC0280f
        public final AbstractC0280f b(int i2, int i3) {
            int iA = AbstractC0280f.a(i2, i3, size());
            if (iA == 0) {
                return AbstractC0280f.f4390a;
            }
            return new b(this.f4395d, e() + i2, iA);
        }

        @Override // c.d.d.AbstractC0280f
        protected void a(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f4395d, i2, bArr, i3, i4);
        }

        @Override // c.d.d.AbstractC0280f
        final void a(AbstractC0278d abstractC0278d) {
            abstractC0278d.a(this.f4395d, e(), size());
        }

        @Override // c.d.d.AbstractC0280f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC0280f) || size() != ((AbstractC0280f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof C0052f) {
                C0052f c0052f = (C0052f) obj;
                int iD = d();
                int iD2 = c0052f.d();
                if (iD == 0 || iD2 == 0 || iD == iD2) {
                    return a(c0052f, 0, size());
                }
                return false;
            }
            return obj.equals(this);
        }

        final boolean a(AbstractC0280f abstractC0280f, int i2, int i3) {
            if (i3 > abstractC0280f.size()) {
                throw new IllegalArgumentException("Length too large: " + i3 + size());
            }
            int i4 = i2 + i3;
            if (i4 > abstractC0280f.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i2 + ", " + i3 + ", " + abstractC0280f.size());
            }
            if (abstractC0280f instanceof C0052f) {
                C0052f c0052f = (C0052f) abstractC0280f;
                byte[] bArr = this.f4395d;
                byte[] bArr2 = c0052f.f4395d;
                int iE = e() + i3;
                int iE2 = e();
                int iE3 = c0052f.e() + i2;
                while (iE2 < iE) {
                    if (bArr[iE2] != bArr2[iE3]) {
                        return false;
                    }
                    iE2++;
                    iE3++;
                }
                return true;
            }
            return abstractC0280f.b(i2, i4).equals(b(0, i3));
        }

        @Override // c.d.d.AbstractC0280f
        protected final int b(int i2, int i3, int i4) {
            return AbstractC0290p.a(i2, this.f4395d, e() + i3, i4);
        }
    }

    /* renamed from: c.d.d.f$b */
    private static final class b extends C0052f {

        /* renamed from: e, reason: collision with root package name */
        private final int f4393e;

        /* renamed from: f, reason: collision with root package name */
        private final int f4394f;

        b(byte[] bArr, int i2, int i3) {
            super(bArr);
            AbstractC0280f.a(i2, i2 + i3, bArr.length);
            this.f4393e = i2;
            this.f4394f = i3;
        }

        @Override // c.d.d.AbstractC0280f.C0052f, c.d.d.AbstractC0280f
        public byte b(int i2) {
            AbstractC0280f.a(i2, size());
            return this.f4395d[this.f4393e + i2];
        }

        @Override // c.d.d.AbstractC0280f.C0052f, c.d.d.AbstractC0280f
        public int size() {
            return this.f4394f;
        }

        @Override // c.d.d.AbstractC0280f.C0052f
        protected int e() {
            return this.f4393e;
        }

        @Override // c.d.d.AbstractC0280f.C0052f, c.d.d.AbstractC0280f
        protected void a(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f4395d, e() + i2, bArr, i3, i4);
        }
    }
}
