package c.d.a.a.e.b;

import android.util.Pair;
import c.d.a.a.e.b.e;
import c.d.a.a.e.q;
import c.d.a.a.m.AbstractC0172g;
import c.d.a.a.m.u;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f1763b = {5512, 11025, 22050, 44100};

    /* renamed from: c, reason: collision with root package name */
    private boolean f1764c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1765d;

    /* renamed from: e, reason: collision with root package name */
    private int f1766e;

    public b(q qVar) {
        super(qVar);
    }

    @Override // c.d.a.a.e.b.e
    protected boolean a(u uVar) throws e.a {
        if (!this.f1764c) {
            int iH = uVar.h();
            this.f1766e = (iH >> 4) & 15;
            if (this.f1766e == 2) {
                this.f1777a.a(c.d.a.a.q.a((String) null, "audio/mpeg", (String) null, -1, -1, 1, f1763b[(iH >> 2) & 3], (List<byte[]>) null, (c.d.a.a.d.f) null, 0, (String) null));
                this.f1765d = true;
            } else if (this.f1766e == 7 || this.f1766e == 8) {
                this.f1777a.a(c.d.a.a.q.a((String) null, this.f1766e == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, (iH & 1) == 1 ? 2 : 3, (List<byte[]>) null, (c.d.a.a.d.f) null, 0, (String) null));
                this.f1765d = true;
            } else if (this.f1766e != 10) {
                throw new e.a("Audio format not supported: " + this.f1766e);
            }
            this.f1764c = true;
        } else {
            uVar.d(1);
        }
        return true;
    }

    @Override // c.d.a.a.e.b.e
    protected void b(u uVar, long j) {
        if (this.f1766e == 2) {
            int iB = uVar.b();
            this.f1777a.a(uVar, iB);
            this.f1777a.a(j, 1, iB, 0, null);
            return;
        }
        int iH = uVar.h();
        if (iH == 0 && !this.f1765d) {
            byte[] bArr = new byte[uVar.b()];
            uVar.a(bArr, 0, bArr.length);
            Pair<Integer, Integer> pairA = AbstractC0172g.a(bArr);
            this.f1777a.a(c.d.a.a.q.a((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) pairA.second).intValue(), ((Integer) pairA.first).intValue(), (List<byte[]>) Collections.singletonList(bArr), (c.d.a.a.d.f) null, 0, (String) null));
            this.f1765d = true;
            return;
        }
        if (this.f1766e != 10 || iH == 1) {
            int iB2 = uVar.b();
            this.f1777a.a(uVar, iB2);
            this.f1777a.a(j, 1, iB2, 0, null);
        }
    }
}
