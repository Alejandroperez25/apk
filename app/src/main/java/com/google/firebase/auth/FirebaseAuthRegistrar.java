package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.auth.internal.InterfaceC0411b;
import com.google.firebase.components.e;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements com.google.firebase.components.j {
    @Override // com.google.firebase.components.j
    @Keep
    public List<com.google.firebase.components.e<?>> getComponents() {
        e.a aVarA = com.google.firebase.components.e.a(FirebaseAuth.class, InterfaceC0411b.class);
        aVarA.a(com.google.firebase.components.q.a(c.d.b.e.class));
        aVarA.a(ca.f5313a);
        aVarA.a();
        return Arrays.asList(aVarA.b(), c.d.b.e.f.a("fire-auth", "17.0.0"));
    }
}
