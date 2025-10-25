package c.d.d;

import c.d.d.C0287m;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes.dex */
class C<FieldDescriptorType> extends F<FieldDescriptorType, Object> {
    C(int i2) {
        super(i2, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.a((C<FieldDescriptorType>) obj, (C0287m.a) obj2);
    }

    @Override // c.d.d.F
    public void a() {
        if (!b()) {
            for (int i2 = 0; i2 < c(); i2++) {
                Map.Entry<FieldDescriptorType, Object> entryB = b(i2);
                if (((C0287m.a) entryB.getKey()).h()) {
                    entryB.setValue(Collections.unmodifiableList((List) entryB.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : e()) {
                if (((C0287m.a) entry.getKey()).h()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
