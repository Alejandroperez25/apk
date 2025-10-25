package c.d.c.b.a;

import c.d.c.b.a.C0249p;
import java.lang.reflect.Field;

/* renamed from: c.d.c.b.a.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0248o extends C0249p.b {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Field f4163d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f4164e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c.d.c.H f4165f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c.d.c.p f4166g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c.d.c.c.a f4167h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f4168i;
    final /* synthetic */ C0249p j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0248o(C0249p c0249p, String str, boolean z, boolean z2, Field field, boolean z3, c.d.c.H h2, c.d.c.p pVar, c.d.c.c.a aVar, boolean z4) {
        super(str, z, z2);
        this.j = c0249p;
        this.f4163d = field;
        this.f4164e = z3;
        this.f4165f = h2;
        this.f4166g = pVar;
        this.f4167h = aVar;
        this.f4168i = z4;
    }

    @Override // c.d.c.b.a.C0249p.b
    void a(c.d.c.d.d dVar, Object obj) throws IllegalAccessException, IllegalArgumentException {
        (this.f4164e ? this.f4165f : new C0256w(this.f4166g, this.f4165f, this.f4167h.b())).a(dVar, this.f4163d.get(obj));
    }

    @Override // c.d.c.b.a.C0249p.b
    void a(c.d.c.d.b bVar, Object obj) throws IllegalAccessException, IllegalArgumentException {
        Object objA = this.f4165f.a(bVar);
        if (objA == null && this.f4168i) {
            return;
        }
        this.f4163d.set(obj, objA);
    }

    @Override // c.d.c.b.a.C0249p.b
    public boolean a(Object obj) {
        return this.f4177b && this.f4163d.get(obj) != obj;
    }
}
