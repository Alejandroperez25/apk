package c.d.a.a.j.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.SparseArray;
import b.a.a$i;
import c.d.a.a.m.H;
import c.d.a.a.m.o;
import c.d.a.a.m.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f3124a = {0, 7, 8, 15};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f3125b = {0, 119, -120, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f3126c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: d, reason: collision with root package name */
    private final Paint f3127d = new Paint();

    /* renamed from: e, reason: collision with root package name */
    private final Paint f3128e;

    /* renamed from: f, reason: collision with root package name */
    private final Canvas f3129f;

    /* renamed from: g, reason: collision with root package name */
    private final C0038b f3130g;

    /* renamed from: h, reason: collision with root package name */
    private final a f3131h;

    /* renamed from: i, reason: collision with root package name */
    private final h f3132i;
    private Bitmap j;

    private static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public b(int i2, int i3) {
        this.f3127d.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f3127d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f3127d.setPathEffect(null);
        this.f3128e = new Paint();
        this.f3128e.setStyle(Paint.Style.FILL);
        this.f3128e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.f3128e.setPathEffect(null);
        this.f3129f = new Canvas();
        this.f3130g = new C0038b(719, 575, 0, 719, 0, 575);
        this.f3131h = new a(0, b(), c(), d());
        this.f3132i = new h(i2, i3);
    }

    public void a() {
        this.f3132i.a();
    }

    public List<c.d.a.a.j.a> a(byte[] bArr, int i2) {
        int i3;
        int i4;
        SparseArray<g> sparseArray;
        t tVar = new t(bArr, i2);
        while (tVar.a() >= 48 && tVar.c(8) == 15) {
            a(tVar, this.f3132i);
        }
        if (this.f3132i.f3176i == null) {
            return Collections.emptyList();
        }
        C0038b c0038b = this.f3132i.f3175h != null ? this.f3132i.f3175h : this.f3130g;
        if (this.j == null || c0038b.f3137a + 1 != this.j.getWidth() || c0038b.f3138b + 1 != this.j.getHeight()) {
            this.j = Bitmap.createBitmap(c0038b.f3137a + 1, c0038b.f3138b + 1, Bitmap.Config.ARGB_8888);
            this.f3129f.setBitmap(this.j);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = this.f3132i.f3176i.f3150d;
        for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
            e eVarValueAt = sparseArray2.valueAt(i5);
            f fVar = this.f3132i.f3170c.get(sparseArray2.keyAt(i5));
            int i6 = eVarValueAt.f3151a + c0038b.f3139c;
            int i7 = eVarValueAt.f3152b + c0038b.f3141e;
            float f2 = i6;
            float f3 = i7;
            this.f3129f.clipRect(f2, f3, Math.min(fVar.f3155c + i6, c0038b.f3140d), Math.min(fVar.f3156d + i7, c0038b.f3142f), Region.Op.REPLACE);
            a aVar = this.f3132i.f3171d.get(fVar.f3159g);
            if (aVar == null && (aVar = this.f3132i.f3173f.get(fVar.f3159g)) == null) {
                aVar = this.f3131h;
            }
            SparseArray<g> sparseArray3 = fVar.k;
            int i8 = 0;
            while (i8 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i8);
                g gVarValueAt = sparseArray3.valueAt(i8);
                c cVar = this.f3132i.f3172e.get(iKeyAt);
                c cVar2 = cVar == null ? this.f3132i.f3174g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    i4 = i8;
                    sparseArray = sparseArray3;
                    a(cVar2, aVar, fVar.f3158f, gVarValueAt.f3164c + i6, i7 + gVarValueAt.f3165d, cVar2.f3144b ? null : this.f3127d, this.f3129f);
                } else {
                    i4 = i8;
                    sparseArray = sparseArray3;
                }
                i8 = i4 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f3154b) {
                if (fVar.f3158f == 3) {
                    i3 = aVar.f3136d[fVar.f3160h];
                } else if (fVar.f3158f == 2) {
                    i3 = aVar.f3135c[fVar.f3161i];
                } else {
                    i3 = aVar.f3134b[fVar.j];
                }
                this.f3128e.setColor(i3);
                this.f3129f.drawRect(f2, f3, fVar.f3155c + i6, fVar.f3156d + i7, this.f3128e);
            }
            arrayList.add(new c.d.a.a.j.a(Bitmap.createBitmap(this.j, i6, i7, fVar.f3155c, fVar.f3156d), f2 / c0038b.f3137a, 0, f3 / c0038b.f3138b, 0, fVar.f3155c / c0038b.f3137a, fVar.f3156d / c0038b.f3138b));
            this.f3129f.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    private static void a(t tVar, h hVar) {
        int iC = tVar.c(8);
        int iC2 = tVar.c(16);
        int iC3 = tVar.c(16);
        int iC4 = tVar.c() + iC3;
        if (iC3 * 8 > tVar.a()) {
            o.c("DvbParser", "Data field length exceeds limit");
            tVar.b(tVar.a());
            return;
        }
        switch (iC) {
            case 16:
                if (iC2 == hVar.f3168a) {
                    d dVar = hVar.f3176i;
                    d dVarA = a(tVar, iC3);
                    if (dVarA.f3149c != 0) {
                        hVar.f3176i = dVarA;
                        hVar.f3170c.clear();
                        hVar.f3171d.clear();
                        hVar.f3172e.clear();
                        break;
                    } else if (dVar != null && dVar.f3148b != dVarA.f3148b) {
                        hVar.f3176i = dVarA;
                        break;
                    }
                }
                break;
            case a$i.AppCompatTheme_actionModeBackground /* 17 */:
                d dVar2 = hVar.f3176i;
                if (iC2 == hVar.f3168a && dVar2 != null) {
                    f fVarB = b(tVar, iC3);
                    if (dVar2.f3149c == 0) {
                        fVarB.a(hVar.f3170c.get(fVarB.f3153a));
                    }
                    hVar.f3170c.put(fVarB.f3153a, fVarB);
                    break;
                }
                break;
            case 18:
                if (iC2 == hVar.f3168a) {
                    a aVarC = c(tVar, iC3);
                    hVar.f3171d.put(aVarC.f3133a, aVarC);
                    break;
                } else if (iC2 == hVar.f3169b) {
                    a aVarC2 = c(tVar, iC3);
                    hVar.f3173f.put(aVarC2.f3133a, aVarC2);
                    break;
                }
                break;
            case 19:
                if (iC2 == hVar.f3168a) {
                    c cVarB = b(tVar);
                    hVar.f3172e.put(cVarB.f3143a, cVarB);
                    break;
                } else if (iC2 == hVar.f3169b) {
                    c cVarB2 = b(tVar);
                    hVar.f3174g.put(cVarB2.f3143a, cVarB2);
                    break;
                }
                break;
            case a$i.AppCompatTheme_actionModeCopyDrawable /* 20 */:
                if (iC2 == hVar.f3168a) {
                    hVar.f3175h = a(tVar);
                    break;
                }
                break;
        }
        tVar.d(iC4 - tVar.c());
    }

    private static C0038b a(t tVar) {
        int i2;
        int iC;
        int i3;
        int i4;
        tVar.b(4);
        boolean zE = tVar.e();
        tVar.b(3);
        int iC2 = tVar.c(16);
        int iC3 = tVar.c(16);
        if (zE) {
            int iC4 = tVar.c(16);
            int iC5 = tVar.c(16);
            int iC6 = tVar.c(16);
            iC = tVar.c(16);
            i2 = iC5;
            i4 = iC6;
            i3 = iC4;
        } else {
            i2 = iC2;
            iC = iC3;
            i3 = 0;
            i4 = 0;
        }
        return new C0038b(iC2, iC3, i3, i2, i4, iC);
    }

    private static d a(t tVar, int i2) {
        int iC = tVar.c(8);
        int iC2 = tVar.c(4);
        int iC3 = tVar.c(2);
        tVar.b(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int iC4 = tVar.c(8);
            tVar.b(8);
            i3 -= 6;
            sparseArray.put(iC4, new e(tVar.c(16), tVar.c(16)));
        }
        return new d(iC, iC2, iC3, sparseArray);
    }

    private static f b(t tVar, int i2) {
        int iC;
        int iC2;
        int iC3 = tVar.c(8);
        tVar.b(4);
        boolean zE = tVar.e();
        tVar.b(3);
        int i3 = 16;
        int iC4 = tVar.c(16);
        int iC5 = tVar.c(16);
        int iC6 = tVar.c(3);
        int iC7 = tVar.c(3);
        int i4 = 2;
        tVar.b(2);
        int iC8 = tVar.c(8);
        int iC9 = tVar.c(8);
        int iC10 = tVar.c(4);
        int iC11 = tVar.c(2);
        tVar.b(2);
        int i5 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i5 > 0) {
            int iC12 = tVar.c(i3);
            int iC13 = tVar.c(i4);
            int iC14 = tVar.c(i4);
            int iC15 = tVar.c(12);
            int i6 = iC11;
            tVar.b(4);
            int iC16 = tVar.c(12);
            i5 -= 6;
            if (iC13 == 1 || iC13 == 2) {
                i5 -= 2;
                iC = tVar.c(8);
                iC2 = tVar.c(8);
            } else {
                iC = 0;
                iC2 = 0;
            }
            sparseArray.put(iC12, new g(iC13, iC14, iC15, iC16, iC, iC2));
            iC11 = i6;
            i4 = 2;
            i3 = 16;
        }
        return new f(iC3, zE, iC4, iC5, iC6, iC7, iC8, iC9, iC10, iC11, sparseArray);
    }

    private static a c(t tVar, int i2) {
        int iC;
        int i3;
        int iC2;
        int iC3;
        int iC4;
        int i4 = 8;
        int iC5 = tVar.c(8);
        tVar.b(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int[] iArrB = b();
        int[] iArrC = c();
        int[] iArrD = d();
        while (i6 > 0) {
            int iC6 = tVar.c(i4);
            int iC7 = tVar.c(i4);
            int i7 = i6 - 2;
            int[] iArr = (iC7 & 128) != 0 ? iArrB : (iC7 & 64) != 0 ? iArrC : iArrD;
            if ((iC7 & 1) != 0) {
                iC3 = tVar.c(i4);
                iC4 = tVar.c(i4);
                iC = tVar.c(i4);
                iC2 = tVar.c(i4);
                i3 = i7 - 4;
            } else {
                int iC8 = tVar.c(6) << i5;
                int iC9 = tVar.c(4) << 4;
                iC = tVar.c(4) << 4;
                i3 = i7 - 2;
                iC2 = tVar.c(i5) << 6;
                iC3 = iC8;
                iC4 = iC9;
            }
            if (iC3 == 0) {
                iC4 = 0;
                iC = 0;
                iC2 = 255;
            }
            double d2 = iC3;
            double d3 = iC4 - 128;
            double d4 = iC - 128;
            iArr[iC6] = a((byte) (255 - (iC2 & 255)), H.a((int) (d2 + (1.402d * d3)), 0, 255), H.a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), H.a((int) (d2 + (d4 * 1.772d)), 0, 255));
            i6 = i3;
            iC5 = iC5;
            i4 = 8;
            i5 = 2;
        }
        return new a(iC5, iArrB, iArrC, iArrD);
    }

    private static c b(t tVar) {
        byte[] bArr;
        int iC = tVar.c(16);
        tVar.b(4);
        int iC2 = tVar.c(2);
        boolean zE = tVar.e();
        tVar.b(1);
        byte[] bArr2 = null;
        if (iC2 == 1) {
            tVar.b(tVar.c(8) * 16);
        } else {
            if (iC2 == 0) {
                int iC3 = tVar.c(16);
                int iC4 = tVar.c(16);
                if (iC3 > 0) {
                    bArr2 = new byte[iC3];
                    tVar.b(bArr2, 0, iC3);
                }
                if (iC4 > 0) {
                    bArr = new byte[iC4];
                    tVar.b(bArr, 0, iC4);
                }
            }
            return new c(iC, zE, bArr2, bArr);
        }
        bArr = bArr2;
        return new c(iC, zE, bArr2, bArr);
    }

    private static int[] b() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = a(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static void a(c cVar, a aVar, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i2 == 3) {
            iArr = aVar.f3136d;
        } else if (i2 == 2) {
            iArr = aVar.f3135c;
        } else {
            iArr = aVar.f3134b;
        }
        int[] iArr2 = iArr;
        a(cVar.f3145c, iArr2, i2, i3, i4, paint, canvas);
        a(cVar.f3146d, iArr2, i2, i3, i4 + 1, paint, canvas);
    }

    private static void a(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArrA;
        byte[] bArr2;
        byte[] bArr3;
        int iA;
        t tVar = new t(bArr);
        int i5 = i3;
        int i6 = i4;
        byte[] bArr4 = null;
        byte[] bArrA2 = null;
        while (tVar.a() != 0) {
            int iC = tVar.c(8);
            if (iC != 240) {
                switch (iC) {
                    case 16:
                        if (i2 != 3) {
                            if (i2 == 2) {
                                bArr3 = bArrA2 == null ? f3124a : bArrA2;
                            } else {
                                bArr2 = null;
                                iA = a(tVar, iArr, bArr2, i5, i6, paint, canvas);
                                tVar.f();
                                break;
                            }
                        } else {
                            bArr3 = bArr4 == null ? f3125b : bArr4;
                        }
                        bArr2 = bArr3;
                        iA = a(tVar, iArr, bArr2, i5, i6, paint, canvas);
                        tVar.f();
                    case a$i.AppCompatTheme_actionModeBackground /* 17 */:
                        iA = b(tVar, iArr, i2 == 3 ? f3126c : null, i5, i6, paint, canvas);
                        tVar.f();
                        break;
                    case 18:
                        iA = c(tVar, iArr, null, i5, i6, paint, canvas);
                        break;
                    default:
                        switch (iC) {
                            case a$i.AppCompatTheme_activityChooserViewStyle /* 32 */:
                                bArrA2 = a(4, 4, tVar);
                                continue;
                            case a$i.AppCompatTheme_alertDialogButtonGroupStyle /* 33 */:
                                bArrA = a(4, 8, tVar);
                                break;
                            case a$i.AppCompatTheme_alertDialogCenterButtons /* 34 */:
                                bArrA = a(16, 8, tVar);
                                break;
                            default:
                                continue;
                        }
                        bArr4 = bArrA;
                        break;
                }
                i5 = iA;
            } else {
                i6 += 2;
                i5 = i3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[LOOP:0: B:3:0x0009->B:29:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(c.d.a.a.m.t r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 2
            int r4 = r13.c(r3)
            r5 = 1
            if (r4 == 0) goto L15
            r12 = r2
            r3 = r4
        L13:
            r11 = 1
            goto L5c
        L15:
            boolean r4 = r13.e()
            if (r4 == 0) goto L28
            r4 = 3
            int r6 = r13.c(r4)
            int r4 = r4 + r6
            int r3 = r13.c(r3)
        L25:
            r12 = r2
            r11 = r4
            goto L5c
        L28:
            boolean r4 = r13.e()
            if (r4 == 0) goto L31
            r12 = r2
            r3 = 0
            goto L13
        L31:
            int r4 = r13.c(r3)
            switch(r4) {
                case 0: goto L59;
                case 1: goto L55;
                case 2: goto L49;
                case 3: goto L3c;
                default: goto L38;
            }
        L38:
            r12 = r2
            r3 = 0
            r11 = 0
            goto L5c
        L3c:
            r4 = 8
            int r4 = r13.c(r4)
            int r4 = r4 + 29
            int r3 = r13.c(r3)
            goto L25
        L49:
            r4 = 4
            int r4 = r13.c(r4)
            int r4 = r4 + 12
            int r3 = r13.c(r3)
            goto L25
        L55:
            r12 = r2
            r3 = 0
            r11 = 2
            goto L5c
        L59:
            r3 = 0
            r11 = 0
            r12 = 1
        L5c:
            if (r11 == 0) goto L7a
            if (r8 == 0) goto L7a
            if (r15 == 0) goto L64
            r3 = r15[r3]
        L64:
            r2 = r14[r3]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r11
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L7a:
            int r10 = r10 + r11
            if (r12 == 0) goto L7e
            return r10
        L7e:
            r2 = r12
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.j.b.b.a(c.d.a.a.m.t, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[LOOP:0: B:3:0x0009->B:32:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int b(c.d.a.a.m.t r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 4
            int r4 = r13.c(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L16
            r12 = r2
            r3 = r4
        L14:
            r11 = 1
            goto L69
        L16:
            boolean r4 = r13.e()
            if (r4 != 0) goto L2d
            r3 = 3
            int r3 = r13.c(r3)
            if (r3 == 0) goto L29
            int r3 = r3 + 2
            r12 = r2
            r11 = r3
            r3 = 0
            goto L69
        L29:
            r3 = 0
            r11 = 0
            r12 = 1
            goto L69
        L2d:
            boolean r4 = r13.e()
            if (r4 != 0) goto L3f
            int r4 = r13.c(r5)
            int r4 = r4 + r3
            int r3 = r13.c(r3)
        L3c:
            r12 = r2
            r11 = r4
            goto L69
        L3f:
            int r4 = r13.c(r5)
            switch(r4) {
                case 0: goto L66;
                case 1: goto L62;
                case 2: goto L57;
                case 3: goto L4a;
                default: goto L46;
            }
        L46:
            r12 = r2
            r3 = 0
            r11 = 0
            goto L69
        L4a:
            r4 = 8
            int r4 = r13.c(r4)
            int r4 = r4 + 25
            int r3 = r13.c(r3)
            goto L3c
        L57:
            int r4 = r13.c(r3)
            int r4 = r4 + 9
            int r3 = r13.c(r3)
            goto L3c
        L62:
            r12 = r2
            r3 = 0
            r11 = 2
            goto L69
        L66:
            r12 = r2
            r3 = 0
            goto L14
        L69:
            if (r11 == 0) goto L85
            if (r8 == 0) goto L85
            if (r15 == 0) goto L71
            r3 = r15[r3]
        L71:
            r2 = r14[r3]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r11
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L85:
            int r10 = r10 + r11
            if (r12 == 0) goto L89
            return r10
        L89:
            r2 = r12
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.j.b.b.b(c.d.a.a.m.t, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static int c(t tVar, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        int iC;
        boolean z;
        int i4;
        int i5 = i2;
        boolean z2 = false;
        while (true) {
            int iC2 = tVar.c(8);
            if (iC2 != 0) {
                z = z2;
                iC = iC2;
                i4 = 1;
            } else if (!tVar.e()) {
                int iC3 = tVar.c(7);
                if (iC3 != 0) {
                    z = z2;
                    i4 = iC3;
                    iC = 0;
                } else {
                    iC = 0;
                    i4 = 0;
                    z = true;
                }
            } else {
                int iC4 = tVar.c(7);
                iC = tVar.c(8);
                z = z2;
                i4 = iC4;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    iC = bArr[iC];
                }
                paint.setColor(iArr[iC]);
                canvas.drawRect(i5, i3, i5 + i4, i3 + 1, paint);
            }
            i5 += i4;
            if (z) {
                return i5;
            }
            z2 = z;
        }
    }

    private static byte[] a(int i2, int i3, t tVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) tVar.c(i3);
        }
        return bArr;
    }

    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f3168a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3169b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f3170c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f3171d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f3172e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f3173f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f3174g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        public C0038b f3175h;

        /* renamed from: i, reason: collision with root package name */
        public d f3176i;

        public h(int i2, int i3) {
            this.f3168a = i2;
            this.f3169b = i3;
        }

        public void a() {
            this.f3170c.clear();
            this.f3171d.clear();
            this.f3172e.clear();
            this.f3173f.clear();
            this.f3174g.clear();
            this.f3175h = null;
            this.f3176i = null;
        }
    }

    /* renamed from: c.d.a.a.j.b.b$b, reason: collision with other inner class name */
    private static final class C0038b {

        /* renamed from: a, reason: collision with root package name */
        public final int f3137a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3138b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3139c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3140d;

        /* renamed from: e, reason: collision with root package name */
        public final int f3141e;

        /* renamed from: f, reason: collision with root package name */
        public final int f3142f;

        public C0038b(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f3137a = i2;
            this.f3138b = i3;
            this.f3139c = i4;
            this.f3140d = i5;
            this.f3141e = i6;
            this.f3142f = i7;
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f3147a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3148b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3149c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f3150d;

        public d(int i2, int i3, int i4, SparseArray<e> sparseArray) {
            this.f3147a = i2;
            this.f3148b = i3;
            this.f3149c = i4;
            this.f3150d = sparseArray;
        }
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f3151a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3152b;

        public e(int i2, int i3) {
            this.f3151a = i2;
            this.f3152b = i3;
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f3153a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3154b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3155c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3156d;

        /* renamed from: e, reason: collision with root package name */
        public final int f3157e;

        /* renamed from: f, reason: collision with root package name */
        public final int f3158f;

        /* renamed from: g, reason: collision with root package name */
        public final int f3159g;

        /* renamed from: h, reason: collision with root package name */
        public final int f3160h;

        /* renamed from: i, reason: collision with root package name */
        public final int f3161i;
        public final int j;
        public final SparseArray<g> k;

        public f(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<g> sparseArray) {
            this.f3153a = i2;
            this.f3154b = z;
            this.f3155c = i3;
            this.f3156d = i4;
            this.f3157e = i5;
            this.f3158f = i6;
            this.f3159g = i7;
            this.f3160h = i8;
            this.f3161i = i9;
            this.j = i10;
            this.k = sparseArray;
        }

        public void a(f fVar) {
            if (fVar == null) {
                return;
            }
            SparseArray<g> sparseArray = fVar.k;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                this.k.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
            }
        }
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f3162a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3163b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3164c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3165d;

        /* renamed from: e, reason: collision with root package name */
        public final int f3166e;

        /* renamed from: f, reason: collision with root package name */
        public final int f3167f;

        public g(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f3162a = i2;
            this.f3163b = i3;
            this.f3164c = i4;
            this.f3165d = i5;
            this.f3166e = i6;
            this.f3167f = i7;
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f3133a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f3134b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f3135c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f3136d;

        public a(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f3133a = i2;
            this.f3134b = iArr;
            this.f3135c = iArr2;
            this.f3136d = iArr3;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f3143a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3144b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f3145c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f3146d;

        public c(int i2, boolean z, byte[] bArr, byte[] bArr2) {
            this.f3143a = i2;
            this.f3144b = z;
            this.f3145c = bArr;
            this.f3146d = bArr2;
        }
    }
}
