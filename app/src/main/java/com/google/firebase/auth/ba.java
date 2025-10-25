package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.internal.InterfaceC0413d;

/* loaded from: classes.dex */
final class ba implements InterfaceC0413d {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AbstractC0437s f5311a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f5312b;

    ba(FirebaseAuth firebaseAuth, AbstractC0437s abstractC0437s) {
        this.f5312b = firebaseAuth;
        this.f5311a = abstractC0437s;
    }

    @Override // com.google.firebase.auth.internal.InterfaceC0413d
    public final void a() {
        if (this.f5312b.f5183f.i().equalsIgnoreCase(this.f5311a.i())) {
            this.f5312b.b();
        }
    }

    @Override // com.google.firebase.auth.internal.R
    public final void a(Status status) {
        if (status.q() == 17011 || status.q() == 17021 || status.q() == 17005) {
            this.f5312b.e();
        }
    }
}
