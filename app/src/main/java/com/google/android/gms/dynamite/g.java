package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class g implements DynamiteModule.b {
    g() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0065b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0065b c0065b = new DynamiteModule.b.C0065b();
        c0065b.f5145a = aVar.a(context, str);
        if (c0065b.f5145a != 0) {
            c0065b.f5146b = aVar.a(context, str, false);
        } else {
            c0065b.f5146b = aVar.a(context, str, true);
        }
        if (c0065b.f5145a == 0 && c0065b.f5146b == 0) {
            c0065b.f5147c = 0;
        } else if (c0065b.f5146b >= c0065b.f5145a) {
            c0065b.f5147c = 1;
        } else {
            c0065b.f5147c = -1;
        }
        return c0065b;
    }
}
