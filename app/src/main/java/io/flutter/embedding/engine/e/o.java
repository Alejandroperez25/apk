package io.flutter.embedding.engine.e;

import f.a.a.a.o;
import io.flutter.embedding.engine.e.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class o implements o.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f6102a;

    o(p pVar) {
        this.f6102a = pVar;
    }

    @Override // f.a.a.a.o.c
    public void a(f.a.a.a.m mVar, o.d dVar) throws JSONException {
        Object obj;
        if (this.f6102a.f6104b == null) {
        }
        String str = mVar.f5663a;
        obj = mVar.f5664b;
        f.a.a.a("TextInputChannel", "Received '" + str + "' message.");
        switch (str) {
            case "TextInput.show":
                this.f6102a.f6104b.a();
                dVar.a(null);
                break;
            case "TextInput.hide":
                this.f6102a.f6104b.c();
                dVar.a(null);
                break;
            case "TextInput.setClient":
                try {
                    JSONArray jSONArray = (JSONArray) obj;
                    this.f6102a.f6104b.a(jSONArray.getInt(0), p.a.a(jSONArray.getJSONObject(1)));
                    dVar.a(null);
                    break;
                } catch (NoSuchFieldException | JSONException e2) {
                    dVar.a("error", e2.getMessage(), null);
                    return;
                }
            case "TextInput.setPlatformViewClient":
                this.f6102a.f6104b.a(((Integer) obj).intValue());
                break;
            case "TextInput.setEditingState":
                try {
                    this.f6102a.f6104b.a(p.d.a((JSONObject) obj));
                    dVar.a(null);
                    break;
                } catch (JSONException e3) {
                    dVar.a("error", e3.getMessage(), null);
                    return;
                }
            case "TextInput.clearClient":
                this.f6102a.f6104b.b();
                dVar.a(null);
                break;
            default:
                dVar.a();
                break;
        }
    }
}
