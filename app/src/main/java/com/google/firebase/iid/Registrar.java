package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.components.e;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public final class Registrar implements com.google.firebase.components.j {

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements com.google.firebase.iid.a.a {

        /* renamed from: a, reason: collision with root package name */
        private final FirebaseInstanceId f5508a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f5508a = firebaseInstanceId;
        }
    }

    @Override // com.google.firebase.components.j
    @Keep
    public final List<com.google.firebase.components.e<?>> getComponents() {
        e.a aVarA = com.google.firebase.components.e.a(FirebaseInstanceId.class);
        aVarA.a(com.google.firebase.components.q.a(c.d.b.e.class));
        aVarA.a(com.google.firebase.components.q.a(c.d.b.b.d.class));
        aVarA.a(com.google.firebase.components.q.a(c.d.b.e.g.class));
        aVarA.a(C0457m.f5550a);
        aVarA.a();
        com.google.firebase.components.e eVarB = aVarA.b();
        e.a aVarA2 = com.google.firebase.components.e.a(com.google.firebase.iid.a.a.class);
        aVarA2.a(com.google.firebase.components.q.a(FirebaseInstanceId.class));
        aVarA2.a(C0458n.f5551a);
        return Arrays.asList(eVarB, aVarA2.b(), c.d.b.e.f.a("fire-iid", "20.0.0"));
    }
}
