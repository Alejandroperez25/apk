package c.d.a.a.e.e;

import c.d.a.a.e.q;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1983a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1984b;

    /* renamed from: c, reason: collision with root package name */
    public final q.a f1985c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1986d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1987e;

    public p(boolean z, String str, int i2, byte[] bArr, int i3, int i4, byte[] bArr2) {
        AbstractC0170e.a((bArr2 == null) ^ (i2 == 0));
        this.f1983a = z;
        this.f1984b = str;
        this.f1986d = i2;
        this.f1987e = bArr2;
        this.f1985c = new q.a(a(str), bArr, i3, i4);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c2 = 65535;
        int iHashCode = str.hashCode();
        if (iHashCode != 3046605) {
            if (iHashCode != 3046671) {
                if (iHashCode != 3049879) {
                    if (iHashCode == 3049895 && str.equals("cens")) {
                        c2 = 1;
                    }
                } else if (str.equals("cenc")) {
                    c2 = 0;
                }
            } else if (str.equals("cbcs")) {
                c2 = 3;
            }
        } else if (str.equals("cbc1")) {
            c2 = 2;
        }
        switch (c2) {
            case 0:
            case 1:
                break;
            case 2:
            case 3:
                break;
            default:
                c.d.a.a.m.o.c("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
