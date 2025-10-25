package io.flutter.embedding.engine.e;

import f.a.a.a.o;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final f.a.a.a.o f6103a;

    /* renamed from: b, reason: collision with root package name */
    private e f6104b;

    /* renamed from: c, reason: collision with root package name */
    private final o.c f6105c = new o(this);

    public interface e {
        void a();

        void a(int i2);

        void a(int i2, a aVar);

        void a(d dVar);

        void b();

        void c();
    }

    public p(io.flutter.embedding.engine.a.b bVar) {
        this.f6103a = new f.a.a.a.o(bVar, "flutter/textinput", f.a.a.a.j.f5662a);
        this.f6103a.a(this.f6105c);
    }

    public void a() {
        this.f6103a.a("TextInputClient.requestExistingInputState", null);
    }

    public void a(int i2, String str, int i3, int i4, int i5, int i6) {
        f.a.a.a("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i3 + "\nSelection end: " + i4 + "\nComposing start: " + i5 + "\nComposing end: " + i6);
        HashMap map = new HashMap();
        map.put("text", str);
        map.put("selectionBase", Integer.valueOf(i3));
        map.put("selectionExtent", Integer.valueOf(i4));
        map.put("composingBase", Integer.valueOf(i5));
        map.put("composingExtent", Integer.valueOf(i6));
        this.f6103a.a("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i2), map));
    }

    public void a(int i2) {
        f.a.a.a("TextInputChannel", "Sending 'newline' message.");
        this.f6103a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.newline"));
    }

    public void b(int i2) {
        f.a.a.a("TextInputChannel", "Sending 'go' message.");
        this.f6103a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.go"));
    }

    public void c(int i2) {
        f.a.a.a("TextInputChannel", "Sending 'search' message.");
        this.f6103a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.search"));
    }

    public void d(int i2) {
        f.a.a.a("TextInputChannel", "Sending 'send' message.");
        this.f6103a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.send"));
    }

    public void e(int i2) {
        f.a.a.a("TextInputChannel", "Sending 'done' message.");
        this.f6103a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.done"));
    }

    public void f(int i2) {
        f.a.a.a("TextInputChannel", "Sending 'next' message.");
        this.f6103a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.next"));
    }

    public void g(int i2) {
        f.a.a.a("TextInputChannel", "Sending 'previous' message.");
        this.f6103a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.previous"));
    }

    public void h(int i2) {
        f.a.a.a("TextInputChannel", "Sending 'unspecified' message.");
        this.f6103a.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i2), "TextInputAction.unspecified"));
    }

    public void a(e eVar) {
        this.f6104b = eVar;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6106a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f6107b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f6108c;

        /* renamed from: d, reason: collision with root package name */
        public final c f6109d;

        /* renamed from: e, reason: collision with root package name */
        public final b f6110e;

        /* renamed from: f, reason: collision with root package name */
        public final Integer f6111f;

        /* renamed from: g, reason: collision with root package name */
        public final String f6112g;

        public static a a(JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            return new a(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), c.a(jSONObject.getString("textCapitalization")), b.a(jSONObject.getJSONObject("inputType")), a(string), jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"));
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.Integer a(java.lang.String r9) {
            /*
                int r0 = r9.hashCode()
                r1 = 7
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 6
                r7 = 1
                r8 = 0
                switch(r0) {
                    case -810971940: goto L61;
                    case -737377923: goto L57;
                    case -737089298: goto L4d;
                    case -737080013: goto L43;
                    case -736940669: goto L39;
                    case 469250275: goto L2f;
                    case 1241689507: goto L25;
                    case 1539450297: goto L1b;
                    case 2110497650: goto L10;
                    default: goto Lf;
                }
            Lf:
                goto L6b
            L10:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L6b
                r9 = 8
                goto L6c
            L1b:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L6b
                r9 = 0
                goto L6c
            L25:
                java.lang.String r0 = "TextInputAction.go"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L6b
                r9 = 4
                goto L6c
            L2f:
                java.lang.String r0 = "TextInputAction.search"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L6b
                r9 = 5
                goto L6c
            L39:
                java.lang.String r0 = "TextInputAction.send"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L6b
                r9 = 6
                goto L6c
            L43:
                java.lang.String r0 = "TextInputAction.none"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L6b
                r9 = 1
                goto L6c
            L4d:
                java.lang.String r0 = "TextInputAction.next"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L6b
                r9 = 7
                goto L6c
            L57:
                java.lang.String r0 = "TextInputAction.done"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L6b
                r9 = 3
                goto L6c
            L61:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r9 = r9.equals(r0)
                if (r9 == 0) goto L6b
                r9 = 2
                goto L6c
            L6b:
                r9 = -1
            L6c:
                switch(r9) {
                    case 0: goto L9c;
                    case 1: goto L97;
                    case 2: goto L92;
                    case 3: goto L8d;
                    case 4: goto L88;
                    case 5: goto L83;
                    case 6: goto L7e;
                    case 7: goto L79;
                    case 8: goto L74;
                    default: goto L6f;
                }
            L6f:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                return r9
            L74:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
                return r9
            L79:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
                return r9
            L7e:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                return r9
            L83:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
                return r9
            L88:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
                return r9
            L8d:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
                return r9
            L92:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                return r9
            L97:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
                return r9
            L9c:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.e.p.a.a(java.lang.String):java.lang.Integer");
        }

        public a(boolean z, boolean z2, boolean z3, c cVar, b bVar, Integer num, String str) {
            this.f6106a = z;
            this.f6107b = z2;
            this.f6108c = z3;
            this.f6109d = cVar;
            this.f6110e = bVar;
            this.f6111f = num;
            this.f6112g = str;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final f f6113a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f6114b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f6115c;

        public static b a(JSONObject jSONObject) {
            return new b(f.a(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }

        public b(f fVar, boolean z, boolean z2) {
            this.f6113a = fVar;
            this.f6114b = z;
            this.f6115c = z2;
        }
    }

    public enum f {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword");

        private final String j;

        static f a(String str) throws NoSuchFieldException {
            for (f fVar : values()) {
                if (fVar.j.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }

        f(String str) {
            this.j = str;
        }
    }

    public enum c {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        /* renamed from: f, reason: collision with root package name */
        private final String f6121f;

        static c a(String str) throws NoSuchFieldException {
            for (c cVar : values()) {
                if (cVar.f6121f.equals(str)) {
                    return cVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }

        c(String str) {
            this.f6121f = str;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f6122a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6123b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6124c;

        public static d a(JSONObject jSONObject) {
            return new d(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"));
        }

        public d(String str, int i2, int i3) {
            this.f6122a = str;
            this.f6123b = i2;
            this.f6124c = i3;
        }
    }
}
