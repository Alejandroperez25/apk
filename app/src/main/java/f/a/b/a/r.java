package f.a.b.a;

import android.text.TextUtils;
import f.a.a.a.g;
import java.util.HashMap;

/* loaded from: classes.dex */
class r {

    /* renamed from: a, reason: collision with root package name */
    private g.a f5747a;

    enum a {
        ERROR,
        CAMERA_CLOSING
    }

    r(f.a.a.a.e eVar, long j) {
        new f.a.a.a.g(eVar, "flutter.io/cameraPlugin/cameraEvents" + j).a(new q(this));
    }

    void a() {
        a(a.CAMERA_CLOSING, (String) null);
    }

    void a(a aVar, String str) {
        if (this.f5747a == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("eventType", aVar.toString().toLowerCase());
        if (aVar == a.ERROR && !TextUtils.isEmpty(str)) {
            map.put("errorDescription", str);
        }
        this.f5747a.a(map);
    }
}
