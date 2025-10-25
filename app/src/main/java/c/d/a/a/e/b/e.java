package c.d.a.a.e.b;

import c.d.a.a.e.q;
import c.d.a.a.m.u;
import c.d.a.a.x;

/* loaded from: classes.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    protected final q f1777a;

    protected abstract boolean a(u uVar);

    protected abstract void b(u uVar, long j);

    public static final class a extends x {
        public a(String str) {
            super(str);
        }
    }

    protected e(q qVar) {
        this.f1777a = qVar;
    }

    public final void a(u uVar, long j) {
        if (a(uVar)) {
            b(uVar, j);
        }
    }
}
