package io.flutter.embedding.engine.e;

import android.graphics.Rect;
import f.a.a.a.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final f.a.a.a.o f6033a;

    /* renamed from: b, reason: collision with root package name */
    private f f6034b;

    /* renamed from: c, reason: collision with root package name */
    protected final o.c f6035c = new io.flutter.embedding.engine.e.g(this);

    public interface f {
        CharSequence a(c cVar);

        void a();

        void a(int i2);

        void a(a aVar);

        void a(e eVar);

        void a(g gVar);

        void a(h hVar);

        void a(String str);

        void a(ArrayList<Rect> arrayList);

        void a(List<EnumC0072i> list);

        void b();

        List<Rect> c();
    }

    public i(io.flutter.embedding.engine.a.b bVar) {
        this.f6033a = new f.a.a.a.o(bVar, "flutter/platform", f.a.a.a.j.f5662a);
        this.f6033a.a(this.f6035c);
    }

    public void a(f fVar) {
        this.f6034b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0056 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(org.json.JSONArray r7) throws java.lang.NoSuchFieldException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            int r4 = r7.length()
            if (r1 >= r4) goto L2f
            java.lang.String r4 = r7.getString(r1)
            io.flutter.embedding.engine.e.i$d r4 = io.flutter.embedding.engine.e.i.d.a(r4)
            int[] r5 = io.flutter.embedding.engine.e.h.f6031a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            switch(r4) {
                case 1: goto L27;
                case 2: goto L24;
                case 3: goto L21;
                case 4: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L29
        L1e:
            r2 = r2 | 8
            goto L29
        L21:
            r2 = r2 | 2
            goto L29
        L24:
            r2 = r2 | 4
            goto L29
        L27:
            r2 = r2 | 1
        L29:
            if (r3 != 0) goto L2c
            r3 = r2
        L2c:
            int r1 = r1 + 1
            goto L4
        L2f:
            r7 = 9
            r1 = 8
            r4 = 1
            switch(r2) {
                case 0: goto L54;
                case 1: goto L53;
                case 2: goto L52;
                case 3: goto L45;
                case 4: goto L44;
                case 5: goto L41;
                case 6: goto L45;
                case 7: goto L45;
                case 8: goto L40;
                case 9: goto L45;
                case 10: goto L3d;
                case 11: goto L3b;
                case 12: goto L45;
                case 13: goto L45;
                case 14: goto L45;
                case 15: goto L38;
                default: goto L37;
            }
        L37:
            goto L56
        L38:
            r7 = 13
            return r7
        L3b:
            r7 = 2
            return r7
        L3d:
            r7 = 11
            return r7
        L40:
            return r1
        L41:
            r7 = 12
            return r7
        L44:
            return r7
        L45:
            r2 = 4
            if (r3 == r2) goto L51
            if (r3 == r1) goto L50
            switch(r3) {
                case 1: goto L4f;
                case 2: goto L4e;
                default: goto L4d;
            }
        L4d:
            goto L56
        L4e:
            return r0
        L4f:
            return r4
        L50:
            return r1
        L51:
            return r7
        L52:
            return r0
        L53:
            return r4
        L54:
            r7 = -1
            return r7
        L56:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.e.i.a(org.json.JSONArray):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<Rect> b(JSONArray jSONArray) throws JSONException {
        ArrayList<Rect> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            try {
                arrayList.add(new Rect(jSONObject.getInt("left"), jSONObject.getInt("top"), jSONObject.getInt("right"), jSONObject.getInt("bottom")));
            } catch (JSONException unused) {
                throw new JSONException("Incorrect JSON data shape. To set system gesture exclusion rects, \na JSONObject with top, right, bottom and left values need to be set to int values.");
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<HashMap<String, Integer>> a(List<Rect> list) {
        ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
        for (Rect rect : list) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("top", Integer.valueOf(rect.top));
            map.put("right", Integer.valueOf(rect.right));
            map.put("bottom", Integer.valueOf(rect.bottom));
            map.put("left", Integer.valueOf(rect.left));
            arrayList.add(map);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a a(JSONObject jSONObject) throws JSONException {
        int i2 = jSONObject.getInt("primaryColor");
        if (i2 != 0) {
            i2 |= -16777216;
        }
        return new a(i2, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<EnumC0072i> c(JSONArray jSONArray) throws NoSuchFieldException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            switch (io.flutter.embedding.engine.e.h.f6032b[EnumC0072i.a(jSONArray.getString(i2)).ordinal()]) {
                case 1:
                    arrayList.add(EnumC0072i.TOP_OVERLAYS);
                    break;
                case 2:
                    arrayList.add(EnumC0072i.BOTTOM_OVERLAYS);
                    break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h b(JSONObject jSONObject) {
        b bVarA = !jSONObject.isNull("systemNavigationBarIconBrightness") ? b.a(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer numValueOf = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null;
        return new h(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? b.a(jSONObject.getString("statusBarIconBrightness")) : null, numValueOf, bVarA, jSONObject.isNull("systemNavigationBarDividerColor") ? null : Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")));
    }

    public enum g {
        CLICK("SystemSoundType.click");


        /* renamed from: c, reason: collision with root package name */
        private final String f6060c;

        static g a(String str) throws NoSuchFieldException {
            for (g gVar : values()) {
                if (gVar.f6060c.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }

        g(String str) {
            this.f6060c = str;
        }
    }

    public enum e {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        /* renamed from: g, reason: collision with root package name */
        private final String f6057g;

        static e a(String str) throws NoSuchFieldException {
            for (e eVar : values()) {
                if ((eVar.f6057g == null && str == null) || (eVar.f6057g != null && eVar.f6057g.equals(str))) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }

        e(String str) {
            this.f6057g = str;
        }
    }

    public enum d {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        /* renamed from: f, reason: collision with root package name */
        private String f6050f;

        static d a(String str) throws NoSuchFieldException {
            for (d dVar : values()) {
                if (dVar.f6050f.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }

        d(String str) {
            this.f6050f = str;
        }
    }

    /* renamed from: io.flutter.embedding.engine.e.i$i, reason: collision with other inner class name */
    public enum EnumC0072i {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        /* renamed from: d, reason: collision with root package name */
        private String f6069d;

        static EnumC0072i a(String str) throws NoSuchFieldException {
            for (EnumC0072i enumC0072i : values()) {
                if (enumC0072i.f6069d.equals(str)) {
                    return enumC0072i;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }

        EnumC0072i(String str) {
            this.f6069d = str;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f6036a;

        /* renamed from: b, reason: collision with root package name */
        public final String f6037b;

        public a(int i2, String str) {
            this.f6036a = i2;
            this.f6037b = str;
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f6061a;

        /* renamed from: b, reason: collision with root package name */
        public final b f6062b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f6063c;

        /* renamed from: d, reason: collision with root package name */
        public final b f6064d;

        /* renamed from: e, reason: collision with root package name */
        public final Integer f6065e;

        public h(Integer num, b bVar, Integer num2, b bVar2, Integer num3) {
            this.f6061a = num;
            this.f6062b = bVar;
            this.f6063c = num2;
            this.f6064d = bVar2;
            this.f6065e = num3;
        }
    }

    public enum b {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        /* renamed from: d, reason: collision with root package name */
        private String f6041d;

        static b a(String str) throws NoSuchFieldException {
            for (b bVar : values()) {
                if (bVar.f6041d.equals(str)) {
                    return bVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }

        b(String str) {
            this.f6041d = str;
        }
    }

    public enum c {
        PLAIN_TEXT("text/plain");


        /* renamed from: c, reason: collision with root package name */
        private String f6044c;

        static c a(String str) throws NoSuchFieldException {
            for (c cVar : values()) {
                if (cVar.f6044c.equals(str)) {
                    return cVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }

        c(String str) {
            this.f6044c = str;
        }
    }
}
