package c.d.a.b.e.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.d.a.b.e.c.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201n {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0185f f3922a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3923b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0209r f3924c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3925d;

    private C0201n(InterfaceC0209r interfaceC0209r) {
        this(interfaceC0209r, false, C0193j.f3914b, Integer.MAX_VALUE);
    }

    private C0201n(InterfaceC0209r interfaceC0209r, boolean z, AbstractC0185f abstractC0185f, int i2) {
        this.f3924c = interfaceC0209r;
        this.f3923b = false;
        this.f3922a = abstractC0185f;
        this.f3925d = Integer.MAX_VALUE;
    }

    public static C0201n a(char c2) {
        C0189h c0189h = new C0189h(c2);
        AbstractC0195k.a(c0189h);
        return new C0201n(new C0199m(c0189h));
    }

    public final List<String> a(CharSequence charSequence) {
        AbstractC0195k.a(charSequence);
        Iterator<String> itA = this.f3924c.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itA.hasNext()) {
            arrayList.add(itA.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
