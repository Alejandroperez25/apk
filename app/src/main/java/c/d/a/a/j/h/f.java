package c.d.a.a.j.h;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import c.d.a.a.m.o;

/* loaded from: classes.dex */
public final class f extends c.d.a.a.j.a {
    public final long o;
    public final long p;

    public f(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    public f(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public f(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4) {
        super(charSequence, alignment, f2, i2, i3, f3, i4, f4);
        this.o = j;
        this.p = j2;
    }

    public boolean a() {
        return this.f3078d == Float.MIN_VALUE && this.f3081g == Float.MIN_VALUE;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f3248a;

        /* renamed from: b, reason: collision with root package name */
        private long f3249b;

        /* renamed from: c, reason: collision with root package name */
        private SpannableStringBuilder f3250c;

        /* renamed from: d, reason: collision with root package name */
        private Layout.Alignment f3251d;

        /* renamed from: e, reason: collision with root package name */
        private float f3252e;

        /* renamed from: f, reason: collision with root package name */
        private int f3253f;

        /* renamed from: g, reason: collision with root package name */
        private int f3254g;

        /* renamed from: h, reason: collision with root package name */
        private float f3255h;

        /* renamed from: i, reason: collision with root package name */
        private int f3256i;
        private float j;

        public a() {
            a();
        }

        public void a() {
            this.f3248a = 0L;
            this.f3249b = 0L;
            this.f3250c = null;
            this.f3251d = null;
            this.f3252e = Float.MIN_VALUE;
            this.f3253f = Integer.MIN_VALUE;
            this.f3254g = Integer.MIN_VALUE;
            this.f3255h = Float.MIN_VALUE;
            this.f3256i = Integer.MIN_VALUE;
            this.j = Float.MIN_VALUE;
        }

        public f b() {
            if (this.f3255h != Float.MIN_VALUE && this.f3256i == Integer.MIN_VALUE) {
                c();
            }
            return new f(this.f3248a, this.f3249b, this.f3250c, this.f3251d, this.f3252e, this.f3253f, this.f3254g, this.f3255h, this.f3256i, this.j);
        }

        public a a(long j) {
            this.f3248a = j;
            return this;
        }

        public a b(long j) {
            this.f3249b = j;
            return this;
        }

        public a a(SpannableStringBuilder spannableStringBuilder) {
            this.f3250c = spannableStringBuilder;
            return this;
        }

        public a a(Layout.Alignment alignment) {
            this.f3251d = alignment;
            return this;
        }

        public a a(float f2) {
            this.f3252e = f2;
            return this;
        }

        public a a(int i2) {
            this.f3253f = i2;
            return this;
        }

        public a b(int i2) {
            this.f3254g = i2;
            return this;
        }

        public a b(float f2) {
            this.f3255h = f2;
            return this;
        }

        public a c(int i2) {
            this.f3256i = i2;
            return this;
        }

        public a c(float f2) {
            this.j = f2;
            return this;
        }

        private a c() {
            if (this.f3251d == null) {
                this.f3256i = Integer.MIN_VALUE;
            } else {
                switch (e.f3247a[this.f3251d.ordinal()]) {
                    case 1:
                        this.f3256i = 0;
                        break;
                    case 2:
                        this.f3256i = 1;
                        break;
                    case 3:
                        this.f3256i = 2;
                        break;
                    default:
                        o.c("WebvttCueBuilder", "Unrecognized alignment: " + this.f3251d);
                        this.f3256i = 0;
                        break;
                }
            }
            return this;
        }
    }
}
