package c.d.a.b.b;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class p extends n {

    /* renamed from: b, reason: collision with root package name */
    private static final WeakReference<byte[]> f3763b = new WeakReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<byte[]> f3764c;

    p(byte[] bArr) {
        super(bArr);
        this.f3764c = f3763b;
    }

    protected abstract byte[] i();

    @Override // c.d.a.b.b.n
    final byte[] h() {
        byte[] bArrI;
        synchronized (this) {
            bArrI = this.f3764c.get();
            if (bArrI == null) {
                bArrI = i();
                this.f3764c = new WeakReference<>(bArrI);
            }
        }
        return bArrI;
    }
}
