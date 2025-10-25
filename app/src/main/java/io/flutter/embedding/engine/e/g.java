package io.flutter.embedding.engine.e;

import android.graphics.Rect;
import f.a.a.a.o;
import io.flutter.embedding.engine.e.i;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class g implements o.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f6030a;

    g(i iVar) {
        this.f6030a = iVar;
    }

    @Override // f.a.a.a.o.c
    public void a(f.a.a.a.m mVar, o.d dVar) throws JSONException {
        i.c cVarA;
        if (this.f6030a.f6034b == null) {
            return;
        }
        String str = mVar.f5663a;
        Object obj = mVar.f5664b;
        f.a.a.a("PlatformChannel", "Received '" + str + "' message.");
        try {
            switch (str) {
                case "SystemSound.play":
                    try {
                        this.f6030a.f6034b.a(i.g.a((String) obj));
                        dVar.a(null);
                        return;
                    } catch (NoSuchFieldException e2) {
                        dVar.a("error", e2.getMessage(), null);
                        return;
                    }
                case "HapticFeedback.vibrate":
                    try {
                        this.f6030a.f6034b.a(i.e.a((String) obj));
                        dVar.a(null);
                        return;
                    } catch (NoSuchFieldException e3) {
                        dVar.a("error", e3.getMessage(), null);
                        return;
                    }
                case "SystemChrome.setPreferredOrientations":
                    try {
                        this.f6030a.f6034b.a(this.f6030a.a((JSONArray) obj));
                        dVar.a(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e4) {
                        dVar.a("error", e4.getMessage(), null);
                        return;
                    }
                case "SystemChrome.setApplicationSwitcherDescription":
                    try {
                        this.f6030a.f6034b.a(this.f6030a.a((JSONObject) obj));
                        dVar.a(null);
                        return;
                    } catch (JSONException e5) {
                        dVar.a("error", e5.getMessage(), null);
                        return;
                    }
                case "SystemChrome.setEnabledSystemUIOverlays":
                    try {
                        this.f6030a.f6034b.a(this.f6030a.c((JSONArray) obj));
                        dVar.a(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e6) {
                        dVar.a("error", e6.getMessage(), null);
                        return;
                    }
                case "SystemChrome.restoreSystemUIOverlays":
                    this.f6030a.f6034b.b();
                    dVar.a(null);
                    return;
                case "SystemChrome.setSystemUIOverlayStyle":
                    try {
                        this.f6030a.f6034b.a(this.f6030a.b((JSONObject) obj));
                        dVar.a(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e7) {
                        dVar.a("error", e7.getMessage(), null);
                        return;
                    }
                case "SystemNavigator.pop":
                    this.f6030a.f6034b.a();
                    dVar.a(null);
                    return;
                case "SystemGestures.getSystemGestureExclusionRects":
                    List<Rect> listC = this.f6030a.f6034b.c();
                    if (listC == null) {
                        dVar.a("error", "Exclusion rects only exist for Android API 29+.", null);
                        return;
                    } else {
                        dVar.a(this.f6030a.a((List<Rect>) listC));
                        return;
                    }
                case "SystemGestures.setSystemGestureExclusionRects":
                    if (!(obj instanceof JSONArray)) {
                        dVar.a("inputTypeError", "Input type is incorrect. Ensure that a List<Map<String, int>> is passed as the input for SystemGestureExclusionRects.setSystemGestureExclusionRects.", null);
                        return;
                    }
                    this.f6030a.f6034b.a(this.f6030a.b((JSONArray) obj));
                    dVar.a(null);
                    return;
                case "Clipboard.getData":
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            cVarA = i.c.a(str2);
                        } catch (NoSuchFieldException unused) {
                            dVar.a("error", "No such clipboard content format: " + str2, null);
                        }
                    } else {
                        cVarA = null;
                    }
                    CharSequence charSequenceA = this.f6030a.f6034b.a(cVarA);
                    if (charSequenceA != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("text", charSequenceA);
                        dVar.a(jSONObject);
                        return;
                    }
                    dVar.a(null);
                    return;
                case "Clipboard.setData":
                    this.f6030a.f6034b.a(((JSONObject) obj).getString("text"));
                    dVar.a(null);
                    return;
                default:
                    dVar.a();
                    return;
            }
        } catch (JSONException e8) {
            dVar.a("error", "JSON error: " + e8.getMessage(), null);
        }
        dVar.a("error", "JSON error: " + e8.getMessage(), null);
    }
}
