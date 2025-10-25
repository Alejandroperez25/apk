package f.a.b.d;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class d {

    public interface e {
        c a(C0069d c0069d);

        C0069d a(a aVar);

        void a();

        void a(b bVar);

        void a(c cVar);

        void a(f fVar);

        void b(C0069d c0069d);

        void c(C0069d c0069d);

        void d(C0069d c0069d);
    }

    /* renamed from: f.a.b.d.d$d, reason: collision with other inner class name */
    public static class C0069d {

        /* renamed from: a, reason: collision with root package name */
        private Long f5777a;

        public Long a() {
            return this.f5777a;
        }

        public void a(Long l) {
            this.f5777a = l;
        }

        HashMap b() {
            HashMap map = new HashMap();
            map.put("textureId", this.f5777a);
            return map;
        }

        static C0069d a(HashMap map) {
            long jLongValue;
            C0069d c0069d = new C0069d();
            if (map.get("textureId") instanceof Integer) {
                jLongValue = ((Integer) map.get("textureId")).intValue();
            } else {
                jLongValue = ((Long) map.get("textureId")).longValue();
            }
            c0069d.f5777a = Long.valueOf(jLongValue);
            return c0069d;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f5769a;

        /* renamed from: b, reason: collision with root package name */
        private String f5770b;

        /* renamed from: c, reason: collision with root package name */
        private String f5771c;

        /* renamed from: d, reason: collision with root package name */
        private String f5772d;

        public String a() {
            return this.f5769a;
        }

        public String b() {
            return this.f5770b;
        }

        public String c() {
            return this.f5771c;
        }

        public String d() {
            return this.f5772d;
        }

        static a a(HashMap map) {
            a aVar = new a();
            aVar.f5769a = (String) map.get("asset");
            aVar.f5770b = (String) map.get("uri");
            aVar.f5771c = (String) map.get("packageName");
            aVar.f5772d = (String) map.get("formatHint");
            return aVar;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private Long f5773a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f5774b;

        public Long a() {
            return this.f5773a;
        }

        public Boolean b() {
            return this.f5774b;
        }

        static b a(HashMap map) {
            long jLongValue;
            b bVar = new b();
            if (map.get("textureId") instanceof Integer) {
                jLongValue = ((Integer) map.get("textureId")).intValue();
            } else {
                jLongValue = ((Long) map.get("textureId")).longValue();
            }
            bVar.f5773a = Long.valueOf(jLongValue);
            bVar.f5774b = (Boolean) map.get("isLooping");
            return bVar;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private Long f5778a;

        /* renamed from: b, reason: collision with root package name */
        private Double f5779b;

        public Long a() {
            return this.f5778a;
        }

        public Double b() {
            return this.f5779b;
        }

        static f a(HashMap map) {
            long jLongValue;
            f fVar = new f();
            if (map.get("textureId") instanceof Integer) {
                jLongValue = ((Integer) map.get("textureId")).intValue();
            } else {
                jLongValue = ((Long) map.get("textureId")).longValue();
            }
            fVar.f5778a = Long.valueOf(jLongValue);
            fVar.f5779b = (Double) map.get("volume");
            return fVar;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private Long f5775a;

        /* renamed from: b, reason: collision with root package name */
        private Long f5776b;

        public Long a() {
            return this.f5775a;
        }

        public Long b() {
            return this.f5776b;
        }

        public void a(Long l) {
            this.f5776b = l;
        }

        HashMap c() {
            HashMap map = new HashMap();
            map.put("textureId", this.f5775a);
            map.put("position", this.f5776b);
            return map;
        }

        static c a(HashMap map) {
            long jLongValue;
            long jLongValue2;
            c cVar = new c();
            if (map.get("textureId") instanceof Integer) {
                jLongValue = ((Integer) map.get("textureId")).intValue();
            } else {
                jLongValue = ((Long) map.get("textureId")).longValue();
            }
            cVar.f5775a = Long.valueOf(jLongValue);
            if (map.get("position") instanceof Integer) {
                jLongValue2 = ((Integer) map.get("position")).intValue();
            } else {
                jLongValue2 = ((Long) map.get("position")).longValue();
            }
            cVar.f5776b = Long.valueOf(jLongValue2);
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap b(Exception exc) {
        HashMap map = new HashMap();
        map.put("message", exc.toString());
        map.put("code", null);
        map.put("details", null);
        return map;
    }
}
