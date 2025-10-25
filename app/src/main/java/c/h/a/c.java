package c.h.a;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f4735a;

    /* renamed from: b, reason: collision with root package name */
    private int f4736b;

    /* renamed from: c, reason: collision with root package name */
    private int f4737c;

    /* renamed from: d, reason: collision with root package name */
    private int f4738d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4739e;

    /* renamed from: f, reason: collision with root package name */
    private int f4740f;

    public c(byte[] bArr, int i2, boolean z, int i3) {
        this.f4740f = 17;
        this.f4735a = bArr;
        this.f4738d = i2;
        this.f4739e = z;
        this.f4740f = i3;
        this.f4736b = 0;
        this.f4737c = bArr.length;
    }

    public c(byte[] bArr, int i2, int i3) {
        this.f4740f = 17;
        this.f4735a = bArr;
        this.f4736b = i2;
        this.f4737c = i3;
    }

    public byte[] a() {
        return this.f4735a;
    }

    public void a(byte[] bArr) {
        this.f4735a = bArr;
    }

    public int b() {
        return this.f4738d;
    }

    public boolean c() {
        return this.f4739e;
    }

    public int d() {
        return this.f4740f;
    }

    public int e() {
        return this.f4736b;
    }

    public int f() {
        return this.f4737c;
    }
}
