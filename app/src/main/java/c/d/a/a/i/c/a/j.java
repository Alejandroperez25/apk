package c.d.a.a.i.c.a;

import android.net.Uri;
import c.d.a.a.i.c.a.k;
import c.d.a.a.q;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2624a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2625b;

    /* renamed from: c, reason: collision with root package name */
    public final q f2626c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2627d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2628e;

    /* renamed from: f, reason: collision with root package name */
    public final List<d> f2629f;

    /* renamed from: g, reason: collision with root package name */
    private final h f2630g;

    public abstract h d();

    public abstract c.d.a.a.i.c.h e();

    public abstract String f();

    public static j a(String str, long j, q qVar, String str2, k kVar, List<d> list) {
        return a(str, j, qVar, str2, kVar, list, null);
    }

    public static j a(String str, long j, q qVar, String str2, k kVar, List<d> list, String str3) {
        if (kVar instanceof k.e) {
            return new b(str, j, qVar, str2, (k.e) kVar, list, str3, -1L);
        }
        if (kVar instanceof k.a) {
            return new a(str, j, qVar, str2, (k.a) kVar, list);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    private j(String str, long j, q qVar, String str2, k kVar, List<d> list) {
        List<d> listUnmodifiableList;
        this.f2624a = str;
        this.f2625b = j;
        this.f2626c = qVar;
        this.f2627d = str2;
        if (list == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.f2629f = listUnmodifiableList;
        this.f2630g = kVar.a(this);
        this.f2628e = kVar.a();
    }

    public h c() {
        return this.f2630g;
    }

    public static class b extends j {

        /* renamed from: h, reason: collision with root package name */
        public final Uri f2632h;

        /* renamed from: i, reason: collision with root package name */
        public final long f2633i;
        private final String j;
        private final h k;
        private final l l;

        public b(String str, long j, q qVar, String str2, k.e eVar, List<d> list, String str3, long j2) {
            String str4;
            super(str, j, qVar, str2, eVar, list);
            this.f2632h = Uri.parse(str2);
            this.k = eVar.b();
            if (str3 != null) {
                str4 = str3;
            } else if (str != null) {
                str4 = str + "." + qVar.f3676a + "." + j;
            } else {
                str4 = null;
            }
            this.j = str4;
            this.f2633i = j2;
            this.l = this.k == null ? new l(new h(null, 0L, j2)) : null;
        }

        @Override // c.d.a.a.i.c.a.j
        public h d() {
            return this.k;
        }

        @Override // c.d.a.a.i.c.a.j
        public c.d.a.a.i.c.h e() {
            return this.l;
        }

        @Override // c.d.a.a.i.c.a.j
        public String f() {
            return this.j;
        }
    }

    public static class a extends j implements c.d.a.a.i.c.h {

        /* renamed from: h, reason: collision with root package name */
        private final k.a f2631h;

        @Override // c.d.a.a.i.c.a.j
        public h d() {
            return null;
        }

        @Override // c.d.a.a.i.c.a.j
        public c.d.a.a.i.c.h e() {
            return this;
        }

        @Override // c.d.a.a.i.c.a.j
        public String f() {
            return null;
        }

        public a(String str, long j, q qVar, String str2, k.a aVar, List<d> list) {
            super(str, j, qVar, str2, aVar, list);
            this.f2631h = aVar;
        }

        @Override // c.d.a.a.i.c.h
        public h b(long j) {
            return this.f2631h.a(this, j);
        }

        @Override // c.d.a.a.i.c.h
        public long b(long j, long j2) {
            return this.f2631h.a(j, j2);
        }

        @Override // c.d.a.a.i.c.h
        public long a(long j) {
            return this.f2631h.a(j);
        }

        @Override // c.d.a.a.i.c.h
        public long a(long j, long j2) {
            return this.f2631h.b(j, j2);
        }

        @Override // c.d.a.a.i.c.h
        public long b() {
            return this.f2631h.b();
        }

        @Override // c.d.a.a.i.c.h
        public int c(long j) {
            return this.f2631h.b(j);
        }

        @Override // c.d.a.a.i.c.h
        public boolean a() {
            return this.f2631h.c();
        }
    }
}
