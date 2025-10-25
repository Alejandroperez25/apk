package c.d.a.a.n;

import android.os.Handler;
import android.view.Surface;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.n.s;

/* loaded from: classes.dex */
public interface s {
    void a(int i2, int i3, int i4, float f2);

    void a(int i2, long j);

    void a(Surface surface);

    void a(c.d.a.a.q qVar);

    void a(String str, long j, long j2);

    void c(c.d.a.a.c.e eVar);

    void d(c.d.a.a.c.e eVar);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f3672a;

        /* renamed from: b, reason: collision with root package name */
        private final s f3673b;

        public a(Handler handler, s sVar) {
            Handler handler2;
            if (sVar != null) {
                AbstractC0170e.a(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.f3672a = handler2;
            this.f3673b = sVar;
        }

        public void a(final c.d.a.a.c.e eVar) {
            if (this.f3673b != null) {
                this.f3672a.post(new Runnable() { // from class: c.d.a.a.n.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3622a.f3673b.c(eVar);
                    }
                });
            }
        }

        public void a(final String str, final long j, final long j2) {
            if (this.f3673b != null) {
                this.f3672a.post(new Runnable() { // from class: c.d.a.a.n.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3615a.f3673b.a(str, j, j2);
                    }
                });
            }
        }

        public void a(final c.d.a.a.q qVar) {
            if (this.f3673b != null) {
                this.f3672a.post(new Runnable() { // from class: c.d.a.a.n.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3595a.f3673b.a(qVar);
                    }
                });
            }
        }

        public void a(final int i2, final long j) {
            if (this.f3673b != null) {
                this.f3672a.post(new Runnable() { // from class: c.d.a.a.n.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3626a.f3673b.a(i2, j);
                    }
                });
            }
        }

        public void a(final int i2, final int i3, final int i4, final float f2) {
            if (this.f3673b != null) {
                this.f3672a.post(new Runnable() { // from class: c.d.a.a.n.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3606a.f3673b.a(i2, i3, i4, f2);
                    }
                });
            }
        }

        public void a(final Surface surface) {
            if (this.f3673b != null) {
                this.f3672a.post(new Runnable() { // from class: c.d.a.a.n.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3600a.f3673b.a(surface);
                    }
                });
            }
        }

        public void b(final c.d.a.a.c.e eVar) {
            if (this.f3673b != null) {
                this.f3672a.post(new Runnable() { // from class: c.d.a.a.n.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.a(this.f3624a, eVar);
                    }
                });
            }
        }

        public static /* synthetic */ void a(a aVar, c.d.a.a.c.e eVar) {
            eVar.a();
            aVar.f3673b.d(eVar);
        }
    }
}
