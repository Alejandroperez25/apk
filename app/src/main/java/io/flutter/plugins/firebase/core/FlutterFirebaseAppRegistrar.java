package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import c.d.b.e.f;
import com.google.firebase.components.e;
import com.google.firebase.components.j;
import java.util.Collections;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FlutterFirebaseAppRegistrar implements j {
    @Override // com.google.firebase.components.j
    public List<e<?>> getComponents() {
        return Collections.singletonList(f.a("flutter-fire-core", "0.4.4-3"));
    }
}
