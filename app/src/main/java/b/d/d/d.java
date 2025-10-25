package b.d.d;

import b.d.d.f;
import b.d.d.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
class d implements k.a<f.c> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1067a;

    d(String str) {
        this.f1067a = str;
    }

    @Override // b.d.d.k.a
    public void a(f.c cVar) {
        synchronized (f.f1070c) {
            ArrayList<k.a<f.c>> arrayList = f.f1071d.get(this.f1067a);
            if (arrayList == null) {
                return;
            }
            f.f1071d.remove(this.f1067a);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arrayList.get(i2).a(cVar);
            }
        }
    }
}
