package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0456l extends AbstractC0454j<Bundle> {
    C0456l(int i2, int i3, Bundle bundle) {
        super(i2, 1, bundle);
    }

    @Override // com.google.firebase.iid.AbstractC0454j
    final boolean a() {
        return false;
    }

    @Override // com.google.firebase.iid.AbstractC0454j
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        a((C0456l) bundle2);
    }
}
