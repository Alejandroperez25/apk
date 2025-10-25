package c.d.a.a.e.h;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface G {

    public interface c {
        SparseArray<G> a();

        G a(int i2, b bVar);
    }

    void a();

    void a(c.d.a.a.m.E e2, c.d.a.a.e.i iVar, d dVar);

    void a(c.d.a.a.m.u uVar, int i2);

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2130a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2131b;

        /* renamed from: c, reason: collision with root package name */
        public final List<a> f2132c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f2133d;

        public b(int i2, String str, List<a> list, byte[] bArr) {
            List<a> listUnmodifiableList;
            this.f2130a = i2;
            this.f2131b = str;
            if (list == null) {
                listUnmodifiableList = Collections.emptyList();
            } else {
                listUnmodifiableList = Collections.unmodifiableList(list);
            }
            this.f2132c = listUnmodifiableList;
            this.f2133d = bArr;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f2127a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2128b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f2129c;

        public a(String str, int i2, byte[] bArr) {
            this.f2127a = str;
            this.f2128b = i2;
            this.f2129c = bArr;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f2134a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2135b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2136c;

        /* renamed from: d, reason: collision with root package name */
        private int f2137d;

        /* renamed from: e, reason: collision with root package name */
        private String f2138e;

        public d(int i2, int i3) {
            this(Integer.MIN_VALUE, i2, i3);
        }

        public d(int i2, int i3, int i4) {
            String str;
            if (i2 != Integer.MIN_VALUE) {
                str = i2 + "/";
            } else {
                str = "";
            }
            this.f2134a = str;
            this.f2135b = i3;
            this.f2136c = i4;
            this.f2137d = Integer.MIN_VALUE;
        }

        public void a() {
            this.f2137d = this.f2137d == Integer.MIN_VALUE ? this.f2135b : this.f2137d + this.f2136c;
            this.f2138e = this.f2134a + this.f2137d;
        }

        public int b() {
            d();
            return this.f2137d;
        }

        public String c() {
            d();
            return this.f2138e;
        }

        private void d() {
            if (this.f2137d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }
}
