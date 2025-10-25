package f.a.b.d;

import android.content.Context;
import android.util.LongSparseArray;
import f.a.a.a.q;
import f.a.b.d.d;
import io.flutter.view.r;

/* loaded from: classes.dex */
public class t implements io.flutter.embedding.engine.c.a, d.e {

    /* renamed from: a, reason: collision with root package name */
    private final LongSparseArray<s> f5803a = new LongSparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private a f5804b;

    /* JADX INFO: Access modifiers changed from: private */
    interface b {
        String a(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface c {
        String a(String str);
    }

    private t(final q.d dVar) {
        Context contextB = dVar.b();
        f.a.a.a.e eVarF = dVar.f();
        dVar.getClass();
        c cVar = new c() { // from class: f.a.b.d.b
            @Override // f.a.b.d.t.c
            public final String a(String str) {
                return dVar.a(str);
            }
        };
        dVar.getClass();
        this.f5804b = new a(contextB, eVarF, cVar, new b() { // from class: f.a.b.d.a
            @Override // f.a.b.d.t.b
            public final String a(String str, String str2) {
                return dVar.a(str, str2);
            }
        }, dVar.c());
        this.f5804b.a(this, dVar.f());
    }

    public static void a(q.d dVar) {
        final t tVar = new t(dVar);
        dVar.a(new q.g() { // from class: f.a.b.d.c
            @Override // f.a.a.a.q.g
            public final boolean a(io.flutter.view.k kVar) {
                return t.a(this.f5768a, kVar);
            }
        });
    }

    static /* synthetic */ boolean a(t tVar, io.flutter.view.k kVar) {
        tVar.c();
        return false;
    }

    private void b() {
        for (int i2 = 0; i2 < this.f5803a.size(); i2++) {
            this.f5803a.valueAt(i2).e();
        }
        this.f5803a.clear();
    }

    private void c() {
        b();
    }

    @Override // f.a.b.d.d.e
    public void a() {
        b();
    }

    @Override // f.a.b.d.d.e
    public d.C0069d a(d.a aVar) {
        r.a aVarA = this.f5804b.f5809e.a();
        f.a.a.a.g gVar = new f.a.a.a.g(this.f5804b.f5806b, "flutter.io/videoPlayer/videoEvents" + aVarA.c());
        if (aVar.a() == null) {
            this.f5803a.put(aVarA.c(), new s(this.f5804b.f5805a, gVar, aVarA, aVar.b(), aVar.d()));
        } else {
            String strA = aVar.c() != null ? this.f5804b.f5808d.a(aVar.a(), aVar.c()) : this.f5804b.f5807c.a(aVar.a());
            this.f5803a.put(aVarA.c(), new s(this.f5804b.f5805a, gVar, aVarA, "asset:///" + strA, null));
        }
        d.C0069d c0069d = new d.C0069d();
        c0069d.a(Long.valueOf(aVarA.c()));
        return c0069d;
    }

    @Override // f.a.b.d.d.e
    public void b(d.C0069d c0069d) {
        this.f5803a.get(c0069d.a().longValue()).e();
        this.f5803a.remove(c0069d.a().longValue());
    }

    @Override // f.a.b.d.d.e
    public void a(d.b bVar) {
        this.f5803a.get(bVar.a().longValue()).a(bVar.b().booleanValue());
    }

    @Override // f.a.b.d.d.e
    public void a(d.f fVar) {
        this.f5803a.get(fVar.a().longValue()).a(fVar.b().doubleValue());
    }

    @Override // f.a.b.d.d.e
    public void c(d.C0069d c0069d) {
        this.f5803a.get(c0069d.a().longValue()).b();
    }

    @Override // f.a.b.d.d.e
    public d.c a(d.C0069d c0069d) {
        s sVar = this.f5803a.get(c0069d.a().longValue());
        d.c cVar = new d.c();
        cVar.a(Long.valueOf(sVar.d()));
        sVar.a();
        return cVar;
    }

    @Override // f.a.b.d.d.e
    public void a(d.c cVar) {
        this.f5803a.get(cVar.a().longValue()).a(cVar.b().intValue());
    }

    @Override // f.a.b.d.d.e
    public void d(d.C0069d c0069d) {
        this.f5803a.get(c0069d.a().longValue()).c();
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f5805a;

        /* renamed from: b, reason: collision with root package name */
        private final f.a.a.a.e f5806b;

        /* renamed from: c, reason: collision with root package name */
        private final c f5807c;

        /* renamed from: d, reason: collision with root package name */
        private final b f5808d;

        /* renamed from: e, reason: collision with root package name */
        private final io.flutter.view.r f5809e;

        a(Context context, f.a.a.a.e eVar, c cVar, b bVar, io.flutter.view.r rVar) {
            this.f5805a = context;
            this.f5806b = eVar;
            this.f5807c = cVar;
            this.f5808d = bVar;
            this.f5809e = rVar;
        }

        void a(t tVar, f.a.a.a.e eVar) {
            e.a(eVar, tVar);
        }
    }
}
