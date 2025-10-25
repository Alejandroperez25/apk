package c.d.a.a.i.c;

import android.os.Handler;
import android.os.Message;
import c.d.a.a.e.q;
import c.d.a.a.i.z;
import c.d.a.a.l.InterfaceC0161d;
import c.d.a.a.m.H;
import c.d.a.a.m.u;
import c.d.a.a.r;
import c.d.a.a.x;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class l implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0161d f2727a;

    /* renamed from: b, reason: collision with root package name */
    private final b f2728b;

    /* renamed from: f, reason: collision with root package name */
    private c.d.a.a.i.c.a.b f2732f;

    /* renamed from: g, reason: collision with root package name */
    private long f2733g;
    private boolean j;
    private boolean k;

    /* renamed from: e, reason: collision with root package name */
    private final TreeMap<Long, Long> f2731e = new TreeMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final Handler f2730d = H.a((Handler.Callback) this);

    /* renamed from: c, reason: collision with root package name */
    private final c.d.a.a.g.a.c f2729c = new c.d.a.a.g.a.c();

    /* renamed from: h, reason: collision with root package name */
    private long f2734h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f2735i = -9223372036854775807L;

    public interface b {
        void a();

        void a(long j);
    }

    public l(c.d.a.a.i.c.a.b bVar, b bVar2, InterfaceC0161d interfaceC0161d) {
        this.f2732f = bVar;
        this.f2728b = bVar2;
        this.f2727a = interfaceC0161d;
    }

    public void a(c.d.a.a.i.c.a.b bVar) {
        this.j = false;
        this.f2733g = -9223372036854775807L;
        this.f2732f = bVar;
        c();
    }

    boolean a(long j) {
        boolean z = false;
        if (!this.f2732f.f2585d) {
            return false;
        }
        if (this.j) {
            return true;
        }
        Map.Entry<Long, Long> entryB = b(this.f2732f.f2589h);
        if (entryB != null && entryB.getValue().longValue() < j) {
            this.f2733g = entryB.getKey().longValue();
            d();
            z = true;
        }
        if (z) {
            e();
        }
        return z;
    }

    boolean a(c.d.a.a.i.b.d dVar) {
        if (!this.f2732f.f2585d) {
            return false;
        }
        if (this.j) {
            return true;
        }
        if (!(this.f2734h != -9223372036854775807L && this.f2734h < dVar.f2531f)) {
            return false;
        }
        e();
        return true;
    }

    void b(c.d.a.a.i.b.d dVar) {
        if (this.f2734h != -9223372036854775807L || dVar.f2532g > this.f2734h) {
            this.f2734h = dVar.f2532g;
        }
    }

    public static boolean a(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    public c a() {
        return new c(new z(this.f2727a));
    }

    public void b() {
        this.k = true;
        this.f2730d.removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.k) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        a(aVar.f2736a, aVar.f2737b);
        return true;
    }

    private void a(long j, long j2) {
        Long l = this.f2731e.get(Long.valueOf(j2));
        if (l == null) {
            this.f2731e.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f2731e.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    private Map.Entry<Long, Long> b(long j) {
        return this.f2731e.ceilingEntry(Long.valueOf(j));
    }

    private void c() {
        Iterator<Map.Entry<Long, Long>> it = this.f2731e.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f2732f.f2589h) {
                it.remove();
            }
        }
    }

    private void d() {
        this.f2728b.a(this.f2733g);
    }

    private void e() {
        if (this.f2735i == -9223372036854775807L || this.f2735i != this.f2734h) {
            this.j = true;
            this.f2735i = this.f2734h;
            this.f2728b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long b(c.d.a.a.g.a.b bVar) {
        try {
            return H.g(H.a(bVar.f2401e));
        } catch (x unused) {
            return -9223372036854775807L;
        }
    }

    public final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        private final z f2738a;

        /* renamed from: b, reason: collision with root package name */
        private final r f2739b = new r();

        /* renamed from: c, reason: collision with root package name */
        private final c.d.a.a.g.f f2740c = new c.d.a.a.g.f();

        c(z zVar) {
            this.f2738a = zVar;
        }

        @Override // c.d.a.a.e.q
        public void a(c.d.a.a.q qVar) {
            this.f2738a.a(qVar);
        }

        @Override // c.d.a.a.e.q
        public int a(c.d.a.a.e.h hVar, int i2, boolean z) {
            return this.f2738a.a(hVar, i2, z);
        }

        @Override // c.d.a.a.e.q
        public void a(u uVar, int i2) {
            this.f2738a.a(uVar, i2);
        }

        @Override // c.d.a.a.e.q
        public void a(long j, int i2, int i3, int i4, q.a aVar) {
            this.f2738a.a(j, i2, i3, i4, aVar);
            b();
        }

        public boolean a(long j) {
            return l.this.a(j);
        }

        public void a(c.d.a.a.i.b.d dVar) {
            l.this.b(dVar);
        }

        public boolean b(c.d.a.a.i.b.d dVar) {
            return l.this.a(dVar);
        }

        public void a() {
            this.f2738a.a();
        }

        private void b() {
            while (this.f2738a.d()) {
                c.d.a.a.g.f fVarC = c();
                if (fVarC != null) {
                    long j = fVarC.f1685d;
                    c.d.a.a.g.a.b bVar = (c.d.a.a.g.a.b) l.this.f2729c.a(fVarC).a(0);
                    if (l.a(bVar.f2397a, bVar.f2398b)) {
                        a(j, bVar);
                    }
                }
            }
            this.f2738a.m();
        }

        private c.d.a.a.g.f c() {
            this.f2740c.b();
            if (this.f2738a.a(this.f2739b, (c.d.a.a.c.f) this.f2740c, false, false, 0L) != -4) {
                return null;
            }
            this.f2740c.l();
            return this.f2740c;
        }

        private void a(long j, c.d.a.a.g.a.b bVar) {
            long jB = l.b(bVar);
            if (jB == -9223372036854775807L) {
                return;
            }
            a(j, jB);
        }

        private void a(long j, long j2) {
            l.this.f2730d.sendMessage(l.this.f2730d.obtainMessage(1, new a(j, j2)));
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f2736a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2737b;

        public a(long j, long j2) {
            this.f2736a = j;
            this.f2737b = j2;
        }
    }
}
