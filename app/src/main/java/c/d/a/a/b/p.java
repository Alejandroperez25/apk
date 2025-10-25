package c.d.a.a.b;

import android.os.Handler;
import c.d.a.a.b.p;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
public interface p {
    void a(int i2);

    void a(int i2, long j, long j2);

    void a(c.d.a.a.c.e eVar);

    void b(c.d.a.a.c.e eVar);

    void b(c.d.a.a.q qVar);

    void b(String str, long j, long j2);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f1589a;

        /* renamed from: b, reason: collision with root package name */
        private final p f1590b;

        public a(Handler handler, p pVar) {
            Handler handler2;
            if (pVar != null) {
                AbstractC0170e.a(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.f1589a = handler2;
            this.f1590b = pVar;
        }

        public void a(final c.d.a.a.c.e eVar) {
            if (this.f1590b != null) {
                this.f1589a.post(new Runnable() { // from class: c.d.a.a.b.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1545a.f1590b.b(eVar);
                    }
                });
            }
        }

        public void a(final String str, final long j, final long j2) {
            if (this.f1590b != null) {
                this.f1589a.post(new Runnable() { // from class: c.d.a.a.b.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1541a.f1590b.b(str, j, j2);
                    }
                });
            }
        }

        public void a(final c.d.a.a.q qVar) {
            if (this.f1590b != null) {
                this.f1589a.post(new Runnable() { // from class: c.d.a.a.b.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1539a.f1590b.b(qVar);
                    }
                });
            }
        }

        public void a(final int i2, final long j, final long j2) {
            if (this.f1590b != null) {
                this.f1589a.post(new Runnable() { // from class: c.d.a.a.b.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1551a.f1590b.a(i2, j, j2);
                    }
                });
            }
        }

        public void b(final c.d.a.a.c.e eVar) {
            if (this.f1590b != null) {
                this.f1589a.post(new Runnable() { // from class: c.d.a.a.b.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.a.a(this.f1549a, eVar);
                    }
                });
            }
        }

        public static /* synthetic */ void a(a aVar, c.d.a.a.c.e eVar) {
            eVar.a();
            aVar.f1590b.a(eVar);
        }

        public void a(final int i2) {
            if (this.f1590b != null) {
                this.f1589a.post(new Runnable() { // from class: c.d.a.a.b.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1547a.f1590b.a(i2);
                    }
                });
            }
        }
    }
}
