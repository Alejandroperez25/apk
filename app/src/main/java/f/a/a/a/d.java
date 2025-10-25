package f.a.a.a;

import android.util.Log;
import f.a.a.a.e;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final e f5644a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5645b;

    /* renamed from: c, reason: collision with root package name */
    private final l<T> f5646c;

    public interface c<T> {
        void a(T t, InterfaceC0067d<T> interfaceC0067d);
    }

    /* renamed from: f.a.a.a.d$d, reason: collision with other inner class name */
    public interface InterfaceC0067d<T> {
        void a(T t);
    }

    public d(e eVar, String str, l<T> lVar) {
        this.f5644a = eVar;
        this.f5645b = str;
        this.f5646c = lVar;
    }

    public void a(T t) {
        a(t, null);
    }

    public void a(T t, InterfaceC0067d<T> interfaceC0067d) {
        this.f5644a.a(this.f5645b, this.f5646c.a((l<T>) t), interfaceC0067d != null ? new b(interfaceC0067d) : null);
    }

    public void a(c<T> cVar) {
        this.f5644a.a(this.f5645b, cVar != null ? new a(cVar) : null);
    }

    private final class b implements e.b {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0067d<T> f5649a;

        private b(InterfaceC0067d<T> interfaceC0067d) {
            this.f5649a = interfaceC0067d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.a.a.e.b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f5649a.a(d.this.f5646c.a(byteBuffer));
            } catch (RuntimeException e2) {
                Log.e("BasicMessageChannel#" + d.this.f5645b, "Failed to handle message reply", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        private final c<T> f5647a;

        private a(c<T> cVar) {
            this.f5647a = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.a.a.e.a
        public void a(ByteBuffer byteBuffer, e.b bVar) {
            try {
                this.f5647a.a(d.this.f5646c.a(byteBuffer), new f.a.a.a.c(this, bVar));
            } catch (RuntimeException e2) {
                Log.e("BasicMessageChannel#" + d.this.f5645b, "Failed to handle message", e2);
                bVar.a(null);
            }
        }
    }
}
