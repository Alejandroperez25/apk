package c.d.a.b.b;

import java.util.Arrays;

/* loaded from: classes.dex */
final class o extends n {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f3762b;

    o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f3762b = bArr;
    }

    @Override // c.d.a.b.b.n
    final byte[] h() {
        return this.f3762b;
    }
}
