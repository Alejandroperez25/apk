package c.d.a.a.b;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1567a = new a().a();

    /* renamed from: b, reason: collision with root package name */
    public final int f1568b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1569c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1570d;

    /* renamed from: e, reason: collision with root package name */
    private AudioAttributes f1571e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f1572a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f1573b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f1574c = 1;

        public a a(int i2) {
            this.f1572a = i2;
            return this;
        }

        public a b(int i2) {
            this.f1574c = i2;
            return this;
        }

        public j a() {
            return new j(this.f1572a, this.f1573b, this.f1574c);
        }
    }

    private j(int i2, int i3, int i4) {
        this.f1568b = i2;
        this.f1569c = i3;
        this.f1570d = i4;
    }

    @TargetApi(21)
    public AudioAttributes a() {
        if (this.f1571e == null) {
            this.f1571e = new AudioAttributes.Builder().setContentType(this.f1568b).setFlags(this.f1569c).setUsage(this.f1570d).build();
        }
        return this.f1571e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f1568b == jVar.f1568b && this.f1569c == jVar.f1569c && this.f1570d == jVar.f1570d;
    }

    public int hashCode() {
        return ((((527 + this.f1568b) * 31) + this.f1569c) * 31) + this.f1570d;
    }
}
