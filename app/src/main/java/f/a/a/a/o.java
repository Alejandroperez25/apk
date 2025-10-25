package f.a.a.a;

import android.util.Log;
import f.a.a.a.e;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final e f5667a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5668b;

    /* renamed from: c, reason: collision with root package name */
    private final p f5669c;

    public interface c {
        void a(m mVar, d dVar);
    }

    public interface d {
        void a();

        void a(Object obj);

        void a(String str, String str2, Object obj);
    }

    public o(e eVar, String str) {
        this(eVar, str, s.f5677a);
    }

    public o(e eVar, String str, p pVar) {
        this.f5667a = eVar;
        this.f5668b = str;
        this.f5669c = pVar;
    }

    public void a(String str, Object obj) {
        a(str, obj, null);
    }

    public void a(String str, Object obj, d dVar) {
        this.f5667a.a(this.f5668b, this.f5669c.a(new m(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void a(c cVar) {
        this.f5667a.a(this.f5668b, cVar == null ? null : new a(cVar));
    }

    private final class b implements e.b {

        /* renamed from: a, reason: collision with root package name */
        private final d f5672a;

        b(d dVar) {
            this.f5672a = dVar;
        }

        @Override // f.a.a.a.e.b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer != null) {
                    try {
                        this.f5672a.a(o.this.f5669c.b(byteBuffer));
                    } catch (h e2) {
                        this.f5672a.a(e2.f5659a, e2.getMessage(), e2.f5660b);
                    }
                } else {
                    this.f5672a.a();
                }
            } catch (RuntimeException e3) {
                Log.e("MethodChannel#" + o.this.f5668b, "Failed to handle method call result", e3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        private final c f5670a;

        a(c cVar) {
            this.f5670a = cVar;
        }

        @Override // f.a.a.a.e.a
        public void a(ByteBuffer byteBuffer, e.b bVar) {
            try {
                this.f5670a.a(o.this.f5669c.a(byteBuffer), new n(this, bVar));
            } catch (RuntimeException e2) {
                Log.e("MethodChannel#" + o.this.f5668b, "Failed to handle method call", e2);
                bVar.a(o.this.f5669c.a("error", e2.getMessage(), null));
            }
        }
    }
}
