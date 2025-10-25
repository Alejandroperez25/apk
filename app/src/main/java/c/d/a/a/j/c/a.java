package c.d.a.a.j.c;

import android.graphics.Bitmap;
import b.a.a$i;
import c.d.a.a.j.d;
import c.d.a.a.m.H;
import c.d.a.a.m.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class a extends c.d.a.a.j.b {
    private final u o;
    private final u p;
    private final C0039a q;
    private Inflater r;

    public a() {
        super("PgsDecoder");
        this.o = new u();
        this.p = new u();
        this.q = new C0039a();
    }

    @Override // c.d.a.a.j.b
    protected d a(byte[] bArr, int i2, boolean z) {
        this.o.a(bArr, i2);
        a(this.o);
        this.q.b();
        ArrayList arrayList = new ArrayList();
        while (this.o.b() >= 3) {
            c.d.a.a.j.a aVarA = a(this.o, this.q);
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }

    private void a(u uVar) {
        if (uVar.b() <= 0 || uVar.f() != 120) {
            return;
        }
        if (this.r == null) {
            this.r = new Inflater();
        }
        if (H.a(uVar, this.p, this.r)) {
            uVar.a(this.p.f3567a, this.p.c());
        }
    }

    private static c.d.a.a.j.a a(u uVar, C0039a c0039a) {
        int iC = uVar.c();
        int iH = uVar.h();
        int i2 = uVar.i();
        int iD = uVar.d() + i2;
        c.d.a.a.j.a aVarA = null;
        if (iD > iC) {
            uVar.c(iC);
            return null;
        }
        if (iH == 128) {
            aVarA = c0039a.a();
            c0039a.b();
        } else {
            switch (iH) {
                case a$i.AppCompatTheme_actionModeCopyDrawable /* 20 */:
                    c0039a.a(uVar, i2);
                    break;
                case 21:
                    c0039a.b(uVar, i2);
                    break;
                case a$i.AppCompatTheme_actionModeFindDrawable /* 22 */:
                    c0039a.c(uVar, i2);
                    break;
            }
        }
        uVar.c(iD);
        return aVarA;
    }

    /* renamed from: c.d.a.a.j.c.a$a, reason: collision with other inner class name */
    private static final class C0039a {

        /* renamed from: a, reason: collision with root package name */
        private final u f3179a = new u();

        /* renamed from: b, reason: collision with root package name */
        private final int[] f3180b = new int[256];

        /* renamed from: c, reason: collision with root package name */
        private boolean f3181c;

        /* renamed from: d, reason: collision with root package name */
        private int f3182d;

        /* renamed from: e, reason: collision with root package name */
        private int f3183e;

        /* renamed from: f, reason: collision with root package name */
        private int f3184f;

        /* renamed from: g, reason: collision with root package name */
        private int f3185g;

        /* renamed from: h, reason: collision with root package name */
        private int f3186h;

        /* renamed from: i, reason: collision with root package name */
        private int f3187i;

        /* JADX INFO: Access modifiers changed from: private */
        public void a(u uVar, int i2) {
            if (i2 % 5 != 2) {
                return;
            }
            uVar.d(2);
            Arrays.fill(this.f3180b, 0);
            int i3 = i2 / 5;
            for (int i4 = 0; i4 < i3; i4++) {
                int iH = uVar.h();
                int iH2 = uVar.h();
                int iH3 = uVar.h();
                int iH4 = uVar.h();
                int iH5 = uVar.h();
                double d2 = iH2;
                double d3 = iH3 - 128;
                int i5 = (int) ((1.402d * d3) + d2);
                double d4 = iH4 - 128;
                this.f3180b[iH] = H.a((int) (d2 + (d4 * 1.772d)), 0, 255) | (H.a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255) << 8) | (iH5 << 24) | (H.a(i5, 0, 255) << 16);
            }
            this.f3181c = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(u uVar, int i2) {
            int iL;
            if (i2 < 4) {
                return;
            }
            uVar.d(3);
            int i3 = i2 - 4;
            if ((uVar.h() & 128) != 0) {
                if (i3 < 7 || (iL = uVar.l()) < 4) {
                    return;
                }
                this.f3186h = uVar.i();
                this.f3187i = uVar.i();
                this.f3179a.a(iL - 4);
                i3 -= 7;
            }
            int iD = this.f3179a.d();
            int iC = this.f3179a.c();
            if (iD >= iC || i3 <= 0) {
                return;
            }
            int iMin = Math.min(i3, iC - iD);
            uVar.a(this.f3179a.f3567a, iD, iMin);
            this.f3179a.c(iD + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(u uVar, int i2) {
            if (i2 < 19) {
                return;
            }
            this.f3182d = uVar.i();
            this.f3183e = uVar.i();
            uVar.d(11);
            this.f3184f = uVar.i();
            this.f3185g = uVar.i();
        }

        public c.d.a.a.j.a a() {
            int iH;
            if (this.f3182d == 0 || this.f3183e == 0 || this.f3186h == 0 || this.f3187i == 0 || this.f3179a.c() == 0 || this.f3179a.d() != this.f3179a.c() || !this.f3181c) {
                return null;
            }
            this.f3179a.c(0);
            int[] iArr = new int[this.f3186h * this.f3187i];
            int i2 = 0;
            while (i2 < iArr.length) {
                int iH2 = this.f3179a.h();
                if (iH2 != 0) {
                    iH = i2 + 1;
                    iArr[i2] = this.f3180b[iH2];
                } else {
                    int iH3 = this.f3179a.h();
                    if (iH3 != 0) {
                        iH = ((iH3 & 64) == 0 ? iH3 & 63 : ((iH3 & 63) << 8) | this.f3179a.h()) + i2;
                        Arrays.fill(iArr, i2, iH, (iH3 & 128) == 0 ? 0 : this.f3180b[this.f3179a.h()]);
                    }
                }
                i2 = iH;
            }
            return new c.d.a.a.j.a(Bitmap.createBitmap(iArr, this.f3186h, this.f3187i, Bitmap.Config.ARGB_8888), this.f3184f / this.f3182d, 0, this.f3185g / this.f3183e, 0, this.f3186h / this.f3182d, this.f3187i / this.f3183e);
        }

        public void b() {
            this.f3182d = 0;
            this.f3183e = 0;
            this.f3184f = 0;
            this.f3185g = 0;
            this.f3186h = 0;
            this.f3187i = 0;
            this.f3179a.a(0);
            this.f3181c = false;
        }
    }
}
