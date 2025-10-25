package c.d.a.a.c;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import c.d.a.a.m.H;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f1663a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f1664b;

    /* renamed from: c, reason: collision with root package name */
    public int f1665c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1666d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f1667e;

    /* renamed from: f, reason: collision with root package name */
    public int f1668f;

    /* renamed from: g, reason: collision with root package name */
    public int f1669g;

    /* renamed from: h, reason: collision with root package name */
    public int f1670h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f1671i;
    private final a j;

    public c() {
        this.f1671i = H.f3499a >= 16 ? b() : null;
        this.j = H.f3499a >= 24 ? new a(this.f1671i) : null;
    }

    public void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.f1668f = i2;
        this.f1666d = iArr;
        this.f1667e = iArr2;
        this.f1664b = bArr;
        this.f1663a = bArr2;
        this.f1665c = i3;
        this.f1669g = i4;
        this.f1670h = i5;
        if (H.f3499a >= 16) {
            c();
        }
    }

    @TargetApi(16)
    public MediaCodec.CryptoInfo a() {
        return this.f1671i;
    }

    @TargetApi(16)
    private MediaCodec.CryptoInfo b() {
        return new MediaCodec.CryptoInfo();
    }

    @TargetApi(16)
    private void c() {
        this.f1671i.numSubSamples = this.f1668f;
        this.f1671i.numBytesOfClearData = this.f1666d;
        this.f1671i.numBytesOfEncryptedData = this.f1667e;
        this.f1671i.key = this.f1664b;
        this.f1671i.iv = this.f1663a;
        this.f1671i.mode = this.f1665c;
        if (H.f3499a >= 24) {
            this.j.a(this.f1669g, this.f1670h);
        }
    }

    @TargetApi(24)
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f1672a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f1673b;

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f1672a = cryptoInfo;
            this.f1673b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i2, int i3) {
            this.f1673b.set(i2, i3);
            this.f1672a.setPattern(this.f1673b);
        }
    }
}
