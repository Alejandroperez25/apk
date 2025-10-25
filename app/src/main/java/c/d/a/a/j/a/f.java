package c.d.a.a.j.a;

import c.d.a.a.j.i;
import c.d.a.a.j.j;
import c.d.a.a.m.AbstractC0170e;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
abstract class f implements c.d.a.a.j.e {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f3114a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<j> f3115b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityQueue<a> f3116c;

    /* renamed from: d, reason: collision with root package name */
    private a f3117d;

    /* renamed from: e, reason: collision with root package name */
    private long f3118e;

    /* renamed from: f, reason: collision with root package name */
    private long f3119f;

    @Override // c.d.a.a.c.d
    public void a() {
    }

    protected abstract void b(i iVar);

    protected abstract boolean f();

    protected abstract c.d.a.a.j.d g();

    public f() {
        int i2 = 0;
        while (true) {
            if (i2 >= 10) {
                break;
            }
            this.f3114a.add(new a());
            i2++;
        }
        this.f3115b = new ArrayDeque<>();
        for (int i3 = 0; i3 < 2; i3++) {
            this.f3115b.add(new b());
        }
        this.f3116c = new PriorityQueue<>();
    }

    @Override // c.d.a.a.j.e
    public void a(long j) {
        this.f3118e = j;
    }

    @Override // c.d.a.a.c.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public i c() {
        AbstractC0170e.b(this.f3117d == null);
        if (this.f3114a.isEmpty()) {
            return null;
        }
        this.f3117d = this.f3114a.pollFirst();
        return this.f3117d;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.d.a.a.c.d
    public void a(i iVar) {
        AbstractC0170e.a(iVar == this.f3117d);
        if (iVar.c()) {
            a(this.f3117d);
        } else {
            a aVar = this.f3117d;
            long j = this.f3119f;
            this.f3119f = 1 + j;
            aVar.f3120g = j;
            this.f3116c.add(this.f3117d);
        }
        this.f3117d = null;
    }

    @Override // c.d.a.a.c.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public j b() {
        if (this.f3115b.isEmpty()) {
            return null;
        }
        while (!this.f3116c.isEmpty() && this.f3116c.peek().f1685d <= this.f3118e) {
            a aVarPoll = this.f3116c.poll();
            if (aVarPoll.d()) {
                j jVarPollFirst = this.f3115b.pollFirst();
                jVarPollFirst.c(4);
                a(aVarPoll);
                return jVarPollFirst;
            }
            b(aVarPoll);
            if (f()) {
                c.d.a.a.j.d dVarG = g();
                if (!aVarPoll.c()) {
                    j jVarPollFirst2 = this.f3115b.pollFirst();
                    jVarPollFirst2.a(aVarPoll.f1685d, dVarG, Long.MAX_VALUE);
                    a(aVarPoll);
                    return jVarPollFirst2;
                }
            }
            a(aVarPoll);
        }
        return null;
    }

    private void a(a aVar) {
        aVar.b();
        this.f3114a.add(aVar);
    }

    protected void a(j jVar) {
        jVar.b();
        this.f3115b.add(jVar);
    }

    @Override // c.d.a.a.c.d
    public void flush() {
        this.f3119f = 0L;
        this.f3118e = 0L;
        while (!this.f3116c.isEmpty()) {
            a(this.f3116c.poll());
        }
        if (this.f3117d != null) {
            a(this.f3117d);
            this.f3117d = null;
        }
    }

    private static final class a extends i implements Comparable<a> {

        /* renamed from: g, reason: collision with root package name */
        private long f3120g;

        private a() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            if (d() != aVar.d()) {
                return d() ? 1 : -1;
            }
            long j = this.f1685d - aVar.f1685d;
            if (j == 0) {
                j = this.f3120g - aVar.f3120g;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    private final class b extends j {
        private b() {
        }

        @Override // c.d.a.a.c.g
        public final void f() {
            f.this.a((j) this);
        }
    }
}
