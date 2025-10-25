package c.d.d;

import b.a.a$i;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    static final int f4358a = a(1, 3);

    /* renamed from: b, reason: collision with root package name */
    static final int f4359b = a(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f4360c = a(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f4361d = a(3, 2);

    public static int a(int i2) {
        return i2 & 7;
    }

    static int a(int i2, int i3) {
        return (i2 << 3) | i3;
    }

    public static int b(int i2) {
        return i2 >>> 3;
    }

    public enum b {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(false),
        STRING(""),
        BYTE_STRING(AbstractC0280f.f4390a),
        ENUM(null),
        MESSAGE(null);

        private final Object k;

        b(Object obj) {
            this.k = obj;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4362a = new a("DOUBLE", 0, b.DOUBLE, 1);

        /* renamed from: b, reason: collision with root package name */
        public static final a f4363b = new a("FLOAT", 1, b.FLOAT, 5);

        /* renamed from: c, reason: collision with root package name */
        public static final a f4364c = new a("INT64", 2, b.LONG, 0);

        /* renamed from: d, reason: collision with root package name */
        public static final a f4365d = new a("UINT64", 3, b.LONG, 0);

        /* renamed from: e, reason: collision with root package name */
        public static final a f4366e = new a("INT32", 4, b.INT, 0);

        /* renamed from: f, reason: collision with root package name */
        public static final a f4367f = new a("FIXED64", 5, b.LONG, 1);

        /* renamed from: g, reason: collision with root package name */
        public static final a f4368g = new a("FIXED32", 6, b.INT, 5);

        /* renamed from: h, reason: collision with root package name */
        public static final a f4369h = new a("BOOL", 7, b.BOOLEAN, 0);

        /* renamed from: i, reason: collision with root package name */
        public static final a f4370i = new O("STRING", 8, b.STRING, 2);
        public static final a j = new P("GROUP", 9, b.MESSAGE, 3);
        public static final a k = new Q("MESSAGE", 10, b.MESSAGE, 2);
        public static final a l = new R("BYTES", 11, b.BYTE_STRING, 2);
        public static final a m = new a("UINT32", 12, b.INT, 0);
        public static final a n = new a("ENUM", 13, b.ENUM, 0);
        public static final a o = new a("SFIXED32", 14, b.INT, 5);
        public static final a p = new a("SFIXED64", 15, b.LONG, 1);
        public static final a q = new a("SINT32", 16, b.INT, 0);
        public static final a r = new a("SINT64", 17, b.LONG, 0);
        private static final /* synthetic */ a[] s = {f4362a, f4363b, f4364c, f4365d, f4366e, f4367f, f4368g, f4369h, f4370i, j, k, l, m, n, o, p, q, r};
        private final b t;
        private final int u;

        /* synthetic */ a(String str, int i2, b bVar, int i3, N n2) {
            this(str, i2, bVar, i3);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) s.clone();
        }

        private a(String str, int i2, b bVar, int i3) {
            this.t = bVar;
            this.u = i3;
        }

        public b a() {
            return this.t;
        }

        public int b() {
            return this.u;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4380a = new T("LOOSE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f4381b = new U("STRICT", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f4382c = new V("LAZY", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ c[] f4383d = {f4380a, f4381b, f4382c};

        abstract Object a(C0281g c0281g);

        private c(String str, int i2) {
        }

        /* synthetic */ c(String str, int i2, N n) {
            this(str, i2);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f4383d.clone();
        }
    }

    static Object a(C0281g c0281g, a aVar, c cVar) {
        switch (N.f4357a[aVar.ordinal()]) {
            case 1:
                return Double.valueOf(c0281g.c());
            case 2:
                return Float.valueOf(c0281g.d());
            case 3:
                return Long.valueOf(c0281g.f());
            case 4:
                return Long.valueOf(c0281g.e());
            case 5:
                return Integer.valueOf(c0281g.g());
            case 6:
                return Long.valueOf(c0281g.h());
            case 7:
                return Integer.valueOf(c0281g.i());
            case 8:
                return Boolean.valueOf(c0281g.j());
            case 9:
                return c0281g.m();
            case 10:
                return Integer.valueOf(c0281g.n());
            case 11:
                return Integer.valueOf(c0281g.p());
            case 12:
                return Long.valueOf(c0281g.q());
            case 13:
                return Integer.valueOf(c0281g.r());
            case 14:
                return Long.valueOf(c0281g.s());
            case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
                return cVar.a(c0281g);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case a$i.AppCompatTheme_actionModeBackground /* 17 */:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
