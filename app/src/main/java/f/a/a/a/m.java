package f.a.a.a;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f5663a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5664b;

    public m(String str, Object obj) {
        this.f5663a = str;
        this.f5664b = obj;
    }

    public <T> T a() {
        return (T) this.f5664b;
    }

    public <T> T a(String str) {
        if (this.f5664b == null) {
            return null;
        }
        if (this.f5664b instanceof Map) {
            return (T) ((Map) this.f5664b).get(str);
        }
        if (this.f5664b instanceof JSONObject) {
            return (T) ((JSONObject) this.f5664b).opt(str);
        }
        throw new ClassCastException();
    }
}
