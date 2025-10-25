package c.d.a.a.j.b;

import c.d.a.a.m.u;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends c.d.a.a.j.b {
    private final b o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        u uVar = new u(list.get(0));
        this.o = new b(uVar.i(), uVar.i());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.a.a.j.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a(byte[] bArr, int i2, boolean z) {
        if (z) {
            this.o.a();
        }
        return new c(this.o.a(bArr, i2));
    }
}
