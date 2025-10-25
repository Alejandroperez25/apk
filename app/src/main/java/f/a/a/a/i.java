package f.a.a.a;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class i implements l<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final i f5661a = new i();

    private i() {
    }

    @Override // f.a.a.a.l
    public ByteBuffer a(Object obj) throws JSONException {
        if (obj == null) {
            return null;
        }
        Object objA = k.a(obj);
        if (objA instanceof String) {
            return t.f5680b.a(JSONObject.quote((String) objA));
        }
        return t.f5680b.a(objA.toString());
    }

    @Override // f.a.a.a.l
    public Object a(ByteBuffer byteBuffer) throws JSONException {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(t.f5680b.a(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }
}
