package c.d.c.b.a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: c.d.c.b.a.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0257x extends c.d.c.H<AtomicIntegerArray> {
    C0257x() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AtomicIntegerArray a(c.d.c.d.b bVar) {
        ArrayList arrayList = new ArrayList();
        bVar.b();
        while (bVar.f()) {
            try {
                arrayList.add(Integer.valueOf(bVar.o()));
            } catch (NumberFormatException e2) {
                throw new c.d.c.C(e2);
            }
        }
        bVar.c();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
        dVar.d();
        int length = atomicIntegerArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            dVar.a(atomicIntegerArray.get(i2));
        }
        dVar.e();
    }
}
