package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class j implements i {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, h> f6159a = new HashMap();

    j() {
    }

    @Override // io.flutter.plugin.platform.i
    public boolean a(String str, h hVar) {
        if (this.f6159a.containsKey(str)) {
            return false;
        }
        this.f6159a.put(str, hVar);
        return true;
    }

    h a(String str) {
        return this.f6159a.get(str);
    }
}
