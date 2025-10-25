package f.a.a.a;

import android.util.Log;
import f.a.a.a.e;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final e f5651a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5652b;

    /* renamed from: c, reason: collision with root package name */
    private final p f5653c;

    public interface a {
        void a();

        void a(Object obj);

        void a(String str, String str2, Object obj);
    }

    public interface c {
        void a(Object obj);

        void a(Object obj, a aVar);
    }

    public g(e eVar, String str) {
        this(eVar, str, s.f5677a);
    }

    public g(e eVar, String str, p pVar) {
        this.f5651a = eVar;
        this.f5652b = str;
        this.f5653c = pVar;
    }

    public void a(c cVar) {
        this.f5651a.a(this.f5652b, cVar == null ? null : new b(cVar));
    }

    private final class b implements e.a {

        /* renamed from: a, reason: collision with root package name */
        private final c f5654a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<a> f5655b = new AtomicReference<>(null);

        b(c cVar) {
            this.f5654a = cVar;
        }

        @Override // f.a.a.a.e.a
        public void a(ByteBuffer byteBuffer, e.b bVar) {
            m mVarA = g.this.f5653c.a(byteBuffer);
            if (mVarA.f5663a.equals("listen")) {
                a(mVarA.f5664b, bVar);
            } else if (mVarA.f5663a.equals("cancel")) {
                b(mVarA.f5664b, bVar);
            } else {
                bVar.a(null);
            }
        }

        private void a(Object obj, e.b bVar) {
            a aVar = new a();
            if (this.f5655b.getAndSet(aVar) != null) {
                try {
                    this.f5654a.a(null);
                } catch (RuntimeException e2) {
                    Log.e("EventChannel#" + g.this.f5652b, "Failed to close existing event stream", e2);
                }
            }
            try {
                this.f5654a.a(obj, aVar);
                bVar.a(g.this.f5653c.a((Object) null));
            } catch (RuntimeException e3) {
                this.f5655b.set(null);
                Log.e("EventChannel#" + g.this.f5652b, "Failed to open event stream", e3);
                bVar.a(g.this.f5653c.a("error", e3.getMessage(), null));
            }
        }

        private void b(Object obj, e.b bVar) {
            if (this.f5655b.getAndSet(null) == null) {
                bVar.a(g.this.f5653c.a("error", "No active stream to cancel", null));
                return;
            }
            try {
                this.f5654a.a(obj);
                bVar.a(g.this.f5653c.a((Object) null));
            } catch (RuntimeException e2) {
                Log.e("EventChannel#" + g.this.f5652b, "Failed to close event stream", e2);
                bVar.a(g.this.f5653c.a("error", e2.getMessage(), null));
            }
        }

        private final class a implements a {

            /* renamed from: a, reason: collision with root package name */
            final AtomicBoolean f5657a;

            private a() {
                this.f5657a = new AtomicBoolean(false);
            }

            @Override // f.a.a.a.g.a
            public void a(Object obj) {
                if (this.f5657a.get() || b.this.f5655b.get() != this) {
                    return;
                }
                g.this.f5651a.a(g.this.f5652b, g.this.f5653c.a(obj));
            }

            @Override // f.a.a.a.g.a
            public void a(String str, String str2, Object obj) {
                if (this.f5657a.get() || b.this.f5655b.get() != this) {
                    return;
                }
                g.this.f5651a.a(g.this.f5652b, g.this.f5653c.a(str, str2, obj));
            }

            @Override // f.a.a.a.g.a
            public void a() {
                if (this.f5657a.getAndSet(true) || b.this.f5655b.get() != this) {
                    return;
                }
                g.this.f5651a.a(g.this.f5652b, (ByteBuffer) null);
            }
        }
    }
}
