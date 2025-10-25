package c.d.a.a.l;

import c.d.a.a.l.k;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface y extends k {

    /* renamed from: b, reason: collision with root package name */
    public static final c.d.a.a.m.w<String> f3476b = new c.d.a.a.m.w() { // from class: c.d.a.a.l.b
        @Override // c.d.a.a.m.w
        public final boolean a(Object obj) {
            return x.a((String) obj);
        }
    };

    public interface b extends k.a {
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, String> f3484a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private Map<String, String> f3485b;

        public synchronized Map<String, String> a() {
            if (this.f3485b == null) {
                this.f3485b = Collections.unmodifiableMap(new HashMap(this.f3484a));
            }
            return this.f3485b;
        }
    }

    public static abstract class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private final f f3477a = new f();

        protected abstract y a(f fVar);

        @Override // c.d.a.a.l.k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y a() {
            return a(this.f3477a);
        }
    }

    public static class c extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f3478a;

        /* renamed from: b, reason: collision with root package name */
        public final n f3479b;

        public c(String str, n nVar, int i2) {
            super(str);
            this.f3479b = nVar;
            this.f3478a = i2;
        }

        public c(IOException iOException, n nVar, int i2) {
            super(iOException);
            this.f3479b = nVar;
            this.f3478a = i2;
        }

        public c(String str, IOException iOException, n nVar, int i2) {
            super(str, iOException);
            this.f3479b = nVar;
            this.f3478a = i2;
        }
    }

    public static final class d extends c {

        /* renamed from: c, reason: collision with root package name */
        public final String f3480c;

        public d(String str, n nVar) {
            super("Invalid content type: " + str, nVar, 1);
            this.f3480c = str;
        }
    }

    public static final class e extends c {

        /* renamed from: c, reason: collision with root package name */
        public final int f3481c;

        /* renamed from: d, reason: collision with root package name */
        public final String f3482d;

        /* renamed from: e, reason: collision with root package name */
        public final Map<String, List<String>> f3483e;

        public e(int i2, String str, Map<String, List<String>> map, n nVar) {
            super("Response code: " + i2, nVar, 1);
            this.f3481c = i2;
            this.f3482d = str;
            this.f3483e = map;
        }
    }
}
