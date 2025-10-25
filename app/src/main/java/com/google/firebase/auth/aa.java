package com.google.firebase.auth;

import c.d.a.b.e.c.Oa;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.internal.InterfaceC0412c;

/* loaded from: classes.dex */
final class aa implements InterfaceC0412c, com.google.firebase.auth.internal.R {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f5310a;

    aa(FirebaseAuth firebaseAuth) {
        this.f5310a = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.InterfaceC0412c
    public final void a(Oa oa, AbstractC0437s abstractC0437s) {
        this.f5310a.a(abstractC0437s, oa, true);
    }

    @Override // com.google.firebase.auth.internal.R
    public final void a(Status status) {
        int iQ = status.q();
        if (iQ == 17011 || iQ == 17021 || iQ == 17005) {
            this.f5310a.e();
        }
    }
}
