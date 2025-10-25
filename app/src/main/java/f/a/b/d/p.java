package f.a.b.d;

import f.a.a.a.g;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class p implements g.a {

    /* renamed from: a, reason: collision with root package name */
    private g.a f5789a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<Object> f5790b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private boolean f5791c = false;

    p() {
    }

    public void a(g.a aVar) {
        this.f5789a = aVar;
        b();
    }

    @Override // f.a.a.a.g.a
    public void a() {
        b(new a());
        b();
        this.f5791c = true;
    }

    @Override // f.a.a.a.g.a
    public void a(String str, String str2, Object obj) {
        b(new b(str, str2, obj));
        b();
    }

    @Override // f.a.a.a.g.a
    public void a(Object obj) {
        b(obj);
        b();
    }

    private void b(Object obj) {
        if (this.f5791c) {
            return;
        }
        this.f5790b.add(obj);
    }

    private void b() {
        if (this.f5789a == null) {
            return;
        }
        Iterator<Object> it = this.f5790b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof a) {
                this.f5789a.a();
            } else if (next instanceof b) {
                b bVar = (b) next;
                this.f5789a.a(bVar.f5792a, bVar.f5793b, bVar.f5794c);
            } else {
                this.f5789a.a(next);
            }
        }
        this.f5790b.clear();
    }

    private static class a {
        private a() {
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        String f5792a;

        /* renamed from: b, reason: collision with root package name */
        String f5793b;

        /* renamed from: c, reason: collision with root package name */
        Object f5794c;

        b(String str, String str2, Object obj) {
            this.f5792a = str;
            this.f5793b = str2;
            this.f5794c = obj;
        }
    }
}
