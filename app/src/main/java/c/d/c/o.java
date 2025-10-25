package c.d.c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
class o extends H<AtomicLongArray> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ H f4310a;

    o(H h2) {
        this.f4310a = h2;
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, AtomicLongArray atomicLongArray) throws IOException {
        dVar.d();
        int length = atomicLongArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            this.f4310a.a(dVar, Long.valueOf(atomicLongArray.get(i2)));
        }
        dVar.e();
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AtomicLongArray a(c.d.c.d.b bVar) {
        ArrayList arrayList = new ArrayList();
        bVar.b();
        while (bVar.f()) {
            arrayList.add(Long.valueOf(((Number) this.f4310a.a(bVar)).longValue()));
        }
        bVar.c();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
        }
        return atomicLongArray;
    }
}
