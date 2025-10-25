package c.d.a.a.e.c;

import c.d.a.a.m.u;

/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final u f1824a = new u(8);

    /* renamed from: b, reason: collision with root package name */
    private int f1825b;

    public boolean a(c.d.a.a.e.h hVar) {
        long length = hVar.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i2 = (int) j;
        hVar.a(this.f1824a.f3567a, 0, 4);
        long jN = this.f1824a.n();
        this.f1825b = 4;
        while (jN != 440786851) {
            int i3 = this.f1825b + 1;
            this.f1825b = i3;
            if (i3 == i2) {
                return false;
            }
            hVar.a(this.f1824a.f3567a, 0, 1);
            jN = ((jN << 8) & (-256)) | (this.f1824a.f3567a[0] & 255);
        }
        long jB = b(hVar);
        long j2 = this.f1825b;
        if (jB == Long.MIN_VALUE || (length != -1 && j2 + jB >= length)) {
            return false;
        }
        while (true) {
            long j3 = j2 + jB;
            if (this.f1825b >= j3) {
                return ((long) this.f1825b) == j3;
            }
            if (b(hVar) == Long.MIN_VALUE) {
                return false;
            }
            long jB2 = b(hVar);
            if (jB2 < 0 || jB2 > 2147483647L) {
                break;
            }
            if (jB2 != 0) {
                int i4 = (int) jB2;
                hVar.a(i4);
                this.f1825b += i4;
            }
        }
        return false;
    }

    private long b(c.d.a.a.e.h hVar) {
        int i2 = 0;
        hVar.a(this.f1824a.f3567a, 0, 1);
        int i3 = this.f1824a.f3567a[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while ((i3 & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = i3 & (~i4);
        hVar.a(this.f1824a.f3567a, 1, i5);
        while (i2 < i5) {
            i2++;
            i6 = (this.f1824a.f3567a[i2] & 255) + (i6 << 8);
        }
        this.f1825b += i5 + 1;
        return i6;
    }
}
