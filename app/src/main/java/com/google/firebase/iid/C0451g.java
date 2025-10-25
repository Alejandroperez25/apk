package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0451g extends AbstractC0454j<Void> {
    C0451g(int i2, int i3, Bundle bundle) {
        super(i2, 2, bundle);
    }

    @Override // com.google.firebase.iid.AbstractC0454j
    final boolean a() {
        return true;
    }

    @Override // com.google.firebase.iid.AbstractC0454j
    final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            a((C0451g) null);
        } else {
            a(new C0453i(4, "Invalid response to one way request"));
        }
    }
}
