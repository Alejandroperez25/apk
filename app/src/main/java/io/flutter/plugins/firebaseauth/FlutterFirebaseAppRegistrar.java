package io.flutter.plugins.firebaseauth;

import c.d.b.e.f;
import com.google.firebase.components.e;
import com.google.firebase.components.j;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class FlutterFirebaseAppRegistrar implements j {
    @Override // com.google.firebase.components.j
    public List<e<?>> getComponents() {
        return Collections.singletonList(f.a("flutter-fire-auth", "0.14.0-5"));
    }
}
