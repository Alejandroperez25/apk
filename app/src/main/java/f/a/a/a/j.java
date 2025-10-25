package f.a.a.a;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final j f5662a = new j();

    private j() {
    }

    @Override // f.a.a.a.p
    public ByteBuffer a(m mVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", mVar.f5663a);
            jSONObject.put("args", k.a(mVar.f5664b));
            return i.f5661a.a(jSONObject);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // f.a.a.a.p
    public m a(ByteBuffer byteBuffer) throws JSONException {
        try {
            Object objA = i.f5661a.a(byteBuffer);
            if (objA instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objA;
                Object obj = jSONObject.get("method");
                Object objB = b(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new m((String) obj, objB);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + objA);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // f.a.a.a.p
    public ByteBuffer a(Object obj) {
        return i.f5661a.a(new JSONArray().put(k.a(obj)));
    }

    @Override // f.a.a.a.p
    public ByteBuffer a(String str, String str2, Object obj) {
        return i.f5661a.a(new JSONArray().put(str).put(k.a(str2)).put(k.a(obj)));
    }

    @Override // f.a.a.a.p
    public Object b(ByteBuffer byteBuffer) throws JSONException {
        try {
            Object objA = i.f5661a.a(byteBuffer);
            if (objA instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objA;
                if (jSONArray.length() == 1) {
                    return b(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object objB = b(jSONArray.opt(1));
                    Object objB2 = b(jSONArray.opt(2));
                    if ((obj instanceof String) && (objB == null || (objB instanceof String))) {
                        throw new h((String) obj, (String) objB, objB2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + objA);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    Object b(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
