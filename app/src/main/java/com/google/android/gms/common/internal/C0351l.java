package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.common.internal.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0351l {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f5056a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private c.d.a.b.b.e f5057b;

    public C0351l(c.d.a.b.b.e eVar) {
        t.a(eVar);
        this.f5057b = eVar;
    }

    public int a(Context context, a.f fVar) {
        t.a(context);
        t.a(fVar);
        if (!fVar.d()) {
            return 0;
        }
        int iE = fVar.e();
        int iA = this.f5056a.get(iE, -1);
        if (iA != -1) {
            return iA;
        }
        int i2 = 0;
        while (true) {
            if (i2 < this.f5056a.size()) {
                int iKeyAt = this.f5056a.keyAt(i2);
                if (iKeyAt > iE && this.f5056a.get(iKeyAt) == 0) {
                    iA = 0;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (iA == -1) {
            iA = this.f5057b.a(context, iE);
        }
        this.f5056a.put(iE, iA);
        return iA;
    }

    public void a() {
        this.f5056a.clear();
    }
}
