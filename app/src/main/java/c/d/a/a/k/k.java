package c.d.a.a.k;

import c.d.a.a.F;
import c.d.a.a.i.G;
import c.d.a.a.l.InterfaceC0163f;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private a f3331a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC0163f f3332b;

    public interface a {
    }

    public abstract l a(F[] fArr, G g2);

    public abstract void a(Object obj);

    public final void a(a aVar, InterfaceC0163f interfaceC0163f) {
        this.f3331a = aVar;
        this.f3332b = interfaceC0163f;
    }

    protected final InterfaceC0163f a() {
        InterfaceC0163f interfaceC0163f = this.f3332b;
        AbstractC0170e.a(interfaceC0163f);
        return interfaceC0163f;
    }
}
