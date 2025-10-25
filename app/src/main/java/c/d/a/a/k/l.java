package c.d.a.a.k;

import c.d.a.a.G;
import c.d.a.a.m.H;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f3333a;

    /* renamed from: b, reason: collision with root package name */
    public final G[] f3334b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3335c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3336d;

    public l(G[] gArr, i[] iVarArr, Object obj) {
        this.f3334b = gArr;
        this.f3335c = new j(iVarArr);
        this.f3336d = obj;
        this.f3333a = gArr.length;
    }

    public boolean a(int i2) {
        return this.f3334b[i2] != null;
    }

    public boolean a(l lVar) {
        if (lVar == null || lVar.f3335c.f3328a != this.f3335c.f3328a) {
            return false;
        }
        for (int i2 = 0; i2 < this.f3335c.f3328a; i2++) {
            if (!a(lVar, i2)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(l lVar, int i2) {
        return lVar != null && H.a(this.f3334b[i2], lVar.f3334b[i2]) && H.a(this.f3335c.a(i2), lVar.f3335c.a(i2));
    }
}
