package io.flutter.plugins.firebasemessaging;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class FlutterFirebaseAppRegistrar implements com.google.firebase.components.j {
    @Override // com.google.firebase.components.j
    public List<com.google.firebase.components.e<?>> getComponents() {
        return Collections.singletonList(c.d.b.e.f.a("flutter-fire-fcm", "6.0.1"));
    }
}
