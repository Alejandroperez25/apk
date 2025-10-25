package c.d.a.a.l;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import c.d.a.a.l.InterfaceC0163f;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.m.InterfaceC0171f;
import c.d.a.a.m.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class q implements InterfaceC0163f, G {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, int[]> f3434a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f3435b = {5700000, 3400000, 1900000, 1000000, 400000};

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f3436c = {169000, 129000, 114000, 102000, 87000};

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f3437d = {2100000, 1300000, 950000, 700000, 400000};

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f3438e = {6900000, 4300000, 2700000, 1600000, 450000};

    /* renamed from: f, reason: collision with root package name */
    private final c.d.a.a.m.l<InterfaceC0163f.a> f3439f;

    /* renamed from: g, reason: collision with root package name */
    private final c.d.a.a.m.z f3440g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC0171f f3441h;

    /* renamed from: i, reason: collision with root package name */
    private int f3442i;
    private long j;
    private long k;
    private long l;
    private long m;
    private long n;

    @Override // c.d.a.a.l.InterfaceC0163f
    public G a() {
        return this;
    }

    @Override // c.d.a.a.l.G
    public void c(k kVar, n nVar, boolean z) {
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f3443a;

        /* renamed from: b, reason: collision with root package name */
        private Handler f3444b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC0163f.a f3445c;

        /* renamed from: d, reason: collision with root package name */
        private SparseArray<Long> f3446d;

        /* renamed from: e, reason: collision with root package name */
        private int f3447e;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC0171f f3448f;

        @Deprecated
        public a() {
            this(null);
        }

        public a(Context context) {
            this.f3443a = context == null ? null : context.getApplicationContext();
            this.f3446d = a(H.b(context));
            this.f3447e = 2000;
            this.f3448f = InterfaceC0171f.f3513a;
        }

        public q a() {
            Long l = this.f3446d.get(H.a(this.f3443a));
            if (l == null) {
                l = this.f3446d.get(0);
            }
            q qVar = new q(l.longValue(), this.f3447e, this.f3448f);
            if (this.f3444b != null && this.f3445c != null) {
                qVar.a(this.f3444b, this.f3445c);
            }
            return qVar;
        }

        private static SparseArray<Long> a(String str) {
            int[] iArrB = b(str);
            SparseArray<Long> sparseArray = new SparseArray<>(6);
            sparseArray.append(0, 1000000L);
            sparseArray.append(2, Long.valueOf(q.f3435b[iArrB[0]]));
            sparseArray.append(3, Long.valueOf(q.f3436c[iArrB[1]]));
            sparseArray.append(4, Long.valueOf(q.f3437d[iArrB[2]]));
            sparseArray.append(5, Long.valueOf(q.f3438e[iArrB[3]]));
            sparseArray.append(7, Long.valueOf(q.f3435b[iArrB[0]]));
            return sparseArray;
        }

        private static int[] b(String str) {
            int[] iArr = q.f3434a.get(str);
            return iArr == null ? new int[]{2, 2, 2, 2} : iArr;
        }
    }

    private q(long j, int i2, InterfaceC0171f interfaceC0171f) {
        this.f3439f = new c.d.a.a.m.l<>();
        this.f3440g = new c.d.a.a.m.z(i2);
        this.f3441h = interfaceC0171f;
        this.n = j;
    }

    @Override // c.d.a.a.l.InterfaceC0163f
    public synchronized long b() {
        return this.n;
    }

    @Override // c.d.a.a.l.InterfaceC0163f
    public void a(Handler handler, InterfaceC0163f.a aVar) {
        this.f3439f.a(handler, aVar);
    }

    @Override // c.d.a.a.l.InterfaceC0163f
    public void a(InterfaceC0163f.a aVar) {
        this.f3439f.a((c.d.a.a.m.l<InterfaceC0163f.a>) aVar);
    }

    @Override // c.d.a.a.l.G
    public synchronized void b(k kVar, n nVar, boolean z) {
        if (z) {
            if (this.f3442i == 0) {
                this.j = this.f3441h.b();
            }
            this.f3442i++;
        }
    }

    @Override // c.d.a.a.l.G
    public synchronized void a(k kVar, n nVar, boolean z, int i2) {
        if (z) {
            this.k += i2;
        }
    }

    @Override // c.d.a.a.l.G
    public synchronized void a(k kVar, n nVar, boolean z) {
        if (z) {
            AbstractC0170e.b(this.f3442i > 0);
            long jB = this.f3441h.b();
            int i2 = (int) (jB - this.j);
            this.l += i2;
            this.m += this.k;
            if (i2 > 0) {
                this.f3440g.a((int) Math.sqrt(this.k), (this.k * 8000) / r6);
                if (this.l >= 2000 || this.m >= 524288) {
                    this.n = (long) this.f3440g.a(0.5f);
                }
            }
            a(i2, this.k, this.n);
            int i3 = this.f3442i - 1;
            this.f3442i = i3;
            if (i3 > 0) {
                this.j = jB;
            }
            this.k = 0L;
        }
    }

    private void a(final int i2, final long j, final long j2) {
        this.f3439f.a(new l.a() { // from class: c.d.a.a.l.a
            @Override // c.d.a.a.m.l.a
            public final void a(Object obj) {
                ((InterfaceC0163f.a) obj).b(i2, j, j2);
            }
        });
    }

    private static Map<String, int[]> c() {
        HashMap map = new HashMap();
        map.put("AD", new int[]{1, 0, 0, 0});
        map.put("AE", new int[]{1, 3, 4, 4});
        map.put("AF", new int[]{4, 4, 3, 2});
        map.put("AG", new int[]{3, 2, 1, 2});
        map.put("AI", new int[]{1, 0, 0, 2});
        map.put("AL", new int[]{1, 1, 1, 1});
        map.put("AM", new int[]{2, 2, 4, 3});
        map.put("AO", new int[]{2, 4, 2, 0});
        map.put("AR", new int[]{2, 3, 2, 3});
        map.put("AS", new int[]{3, 4, 4, 1});
        map.put("AT", new int[]{0, 1, 0, 0});
        map.put("AU", new int[]{0, 3, 0, 0});
        map.put("AW", new int[]{1, 1, 0, 4});
        map.put("AX", new int[]{0, 1, 0, 0});
        map.put("AZ", new int[]{3, 3, 2, 2});
        map.put("BA", new int[]{1, 1, 1, 2});
        map.put("BB", new int[]{0, 1, 0, 0});
        map.put("BD", new int[]{2, 1, 3, 2});
        map.put("BE", new int[]{0, 0, 0, 0});
        map.put("BF", new int[]{4, 4, 4, 1});
        map.put("BG", new int[]{0, 0, 0, 1});
        map.put("BH", new int[]{2, 1, 3, 4});
        map.put("BI", new int[]{4, 3, 4, 4});
        map.put("BJ", new int[]{4, 3, 4, 3});
        map.put("BL", new int[]{1, 0, 1, 2});
        map.put("BM", new int[]{1, 0, 0, 0});
        map.put("BN", new int[]{4, 3, 3, 3});
        map.put("BO", new int[]{2, 2, 1, 2});
        map.put("BQ", new int[]{1, 1, 2, 4});
        map.put("BR", new int[]{2, 3, 2, 2});
        map.put("BS", new int[]{1, 1, 0, 2});
        map.put("BT", new int[]{3, 0, 2, 1});
        map.put("BW", new int[]{4, 4, 2, 3});
        map.put("BY", new int[]{1, 1, 1, 1});
        map.put("BZ", new int[]{2, 3, 3, 1});
        map.put("CA", new int[]{0, 2, 2, 3});
        map.put("CD", new int[]{4, 4, 2, 1});
        map.put("CF", new int[]{4, 4, 3, 3});
        map.put("CG", new int[]{4, 4, 4, 4});
        map.put("CH", new int[]{0, 0, 0, 0});
        map.put("CI", new int[]{4, 4, 4, 4});
        map.put("CK", new int[]{2, 4, 2, 0});
        map.put("CL", new int[]{2, 2, 2, 3});
        map.put("CM", new int[]{3, 4, 3, 1});
        map.put("CN", new int[]{2, 0, 1, 2});
        map.put("CO", new int[]{2, 3, 2, 1});
        map.put("CR", new int[]{2, 2, 4, 4});
        map.put("CU", new int[]{4, 4, 4, 1});
        map.put("CV", new int[]{2, 2, 2, 4});
        map.put("CW", new int[]{1, 1, 0, 0});
        map.put("CX", new int[]{1, 2, 2, 2});
        map.put("CY", new int[]{1, 1, 0, 0});
        map.put("CZ", new int[]{0, 1, 0, 0});
        map.put("DE", new int[]{0, 2, 2, 2});
        map.put("DJ", new int[]{3, 4, 4, 0});
        map.put("DK", new int[]{0, 0, 0, 0});
        map.put("DM", new int[]{2, 0, 3, 4});
        map.put("DO", new int[]{3, 3, 4, 4});
        map.put("DZ", new int[]{3, 3, 4, 4});
        map.put("EC", new int[]{2, 3, 3, 1});
        map.put("EE", new int[]{0, 0, 0, 0});
        map.put("EG", new int[]{3, 3, 1, 1});
        map.put("EH", new int[]{2, 0, 2, 3});
        map.put("ER", new int[]{4, 2, 2, 2});
        map.put("ES", new int[]{0, 0, 1, 1});
        map.put("ET", new int[]{4, 4, 4, 0});
        map.put("FI", new int[]{0, 0, 1, 0});
        map.put("FJ", new int[]{3, 2, 3, 3});
        map.put("FK", new int[]{3, 4, 2, 1});
        map.put("FM", new int[]{4, 2, 4, 0});
        map.put("FO", new int[]{0, 0, 0, 1});
        map.put("FR", new int[]{1, 0, 2, 1});
        map.put("GA", new int[]{3, 3, 2, 1});
        map.put("GB", new int[]{0, 1, 3, 2});
        map.put("GD", new int[]{2, 0, 3, 0});
        map.put("GE", new int[]{1, 1, 0, 3});
        map.put("GF", new int[]{1, 2, 4, 4});
        map.put("GG", new int[]{0, 1, 0, 0});
        map.put("GH", new int[]{3, 2, 2, 2});
        map.put("GI", new int[]{0, 0, 0, 1});
        map.put("GL", new int[]{2, 4, 1, 4});
        map.put("GM", new int[]{4, 3, 3, 0});
        map.put("GN", new int[]{4, 4, 3, 4});
        map.put("GP", new int[]{2, 2, 1, 3});
        map.put("GQ", new int[]{4, 4, 3, 1});
        map.put("GR", new int[]{1, 1, 0, 1});
        map.put("GT", new int[]{3, 2, 3, 4});
        map.put("GU", new int[]{1, 0, 4, 4});
        map.put("GW", new int[]{4, 4, 4, 0});
        map.put("GY", new int[]{3, 4, 1, 0});
        map.put("HK", new int[]{0, 2, 3, 4});
        map.put("HN", new int[]{3, 3, 2, 2});
        map.put("HR", new int[]{1, 0, 0, 2});
        map.put("HT", new int[]{3, 3, 3, 3});
        map.put("HU", new int[]{0, 0, 1, 0});
        map.put("ID", new int[]{2, 3, 3, 4});
        map.put("IE", new int[]{0, 0, 1, 1});
        map.put("IL", new int[]{0, 1, 1, 3});
        map.put("IM", new int[]{0, 1, 0, 1});
        map.put("IN", new int[]{2, 3, 3, 4});
        map.put("IO", new int[]{4, 2, 2, 2});
        map.put("IQ", new int[]{3, 3, 4, 3});
        map.put("IR", new int[]{3, 2, 4, 4});
        map.put("IS", new int[]{0, 0, 0, 0});
        map.put("IT", new int[]{1, 0, 1, 3});
        map.put("JE", new int[]{0, 0, 0, 1});
        map.put("JM", new int[]{3, 3, 3, 2});
        map.put("JO", new int[]{1, 1, 1, 2});
        map.put("JP", new int[]{0, 1, 1, 2});
        map.put("KE", new int[]{3, 3, 3, 3});
        map.put("KG", new int[]{2, 2, 3, 3});
        map.put("KH", new int[]{1, 0, 4, 4});
        map.put("KI", new int[]{4, 4, 4, 4});
        map.put("KM", new int[]{4, 4, 2, 2});
        map.put("KN", new int[]{1, 0, 1, 3});
        map.put("KP", new int[]{1, 2, 2, 2});
        map.put("KR", new int[]{0, 4, 0, 2});
        map.put("KW", new int[]{1, 2, 1, 2});
        map.put("KY", new int[]{1, 1, 0, 2});
        map.put("KZ", new int[]{1, 2, 2, 3});
        map.put("LA", new int[]{3, 2, 2, 2});
        map.put("LB", new int[]{3, 2, 0, 0});
        map.put("LC", new int[]{2, 2, 1, 0});
        map.put("LI", new int[]{0, 0, 1, 2});
        map.put("LK", new int[]{1, 1, 2, 2});
        map.put("LR", new int[]{3, 4, 3, 1});
        map.put("LS", new int[]{3, 3, 2, 0});
        map.put("LT", new int[]{0, 0, 0, 1});
        map.put("LU", new int[]{0, 0, 1, 0});
        map.put("LV", new int[]{0, 0, 0, 0});
        map.put("LY", new int[]{4, 4, 4, 4});
        map.put("MA", new int[]{2, 1, 2, 2});
        map.put("MC", new int[]{1, 0, 1, 0});
        map.put("MD", new int[]{1, 1, 0, 0});
        map.put("ME", new int[]{1, 2, 2, 3});
        map.put("MF", new int[]{1, 4, 3, 3});
        map.put("MG", new int[]{3, 4, 1, 2});
        map.put("MH", new int[]{4, 0, 2, 3});
        map.put("MK", new int[]{1, 0, 0, 1});
        map.put("ML", new int[]{4, 4, 4, 4});
        map.put("MM", new int[]{2, 3, 1, 2});
        map.put("MN", new int[]{2, 2, 2, 4});
        map.put("MO", new int[]{0, 1, 4, 4});
        map.put("MP", new int[]{0, 0, 4, 4});
        map.put("MQ", new int[]{1, 1, 1, 3});
        map.put("MR", new int[]{4, 2, 4, 2});
        map.put("MS", new int[]{1, 2, 1, 2});
        map.put("MT", new int[]{0, 0, 0, 0});
        map.put("MU", new int[]{2, 2, 4, 4});
        map.put("MV", new int[]{4, 2, 0, 1});
        map.put("MW", new int[]{3, 2, 1, 1});
        map.put("MX", new int[]{2, 4, 3, 1});
        map.put("MY", new int[]{2, 3, 3, 3});
        map.put("MZ", new int[]{3, 3, 2, 4});
        map.put("NA", new int[]{4, 2, 1, 1});
        map.put("NC", new int[]{2, 1, 3, 3});
        map.put("NE", new int[]{4, 4, 4, 4});
        map.put("NF", new int[]{0, 2, 2, 2});
        map.put("NG", new int[]{3, 4, 2, 2});
        map.put("NI", new int[]{3, 4, 3, 3});
        map.put("NL", new int[]{0, 1, 3, 2});
        map.put("NO", new int[]{0, 0, 1, 0});
        map.put("NP", new int[]{2, 3, 2, 2});
        map.put("NR", new int[]{4, 3, 4, 1});
        map.put("NU", new int[]{4, 2, 2, 2});
        map.put("NZ", new int[]{0, 0, 0, 1});
        map.put("OM", new int[]{2, 2, 1, 3});
        map.put("PA", new int[]{1, 3, 2, 3});
        map.put("PE", new int[]{2, 2, 4, 4});
        map.put("PF", new int[]{2, 2, 0, 1});
        map.put("PG", new int[]{4, 4, 4, 4});
        map.put("PH", new int[]{3, 0, 4, 4});
        map.put("PK", new int[]{3, 3, 3, 3});
        map.put("PL", new int[]{1, 0, 1, 3});
        map.put("PM", new int[]{0, 2, 2, 3});
        map.put("PR", new int[]{2, 3, 4, 3});
        map.put("PS", new int[]{2, 3, 0, 4});
        map.put("PT", new int[]{1, 1, 1, 1});
        map.put("PW", new int[]{3, 2, 3, 0});
        map.put("PY", new int[]{2, 1, 3, 3});
        map.put("QA", new int[]{2, 3, 1, 2});
        map.put("RE", new int[]{1, 1, 2, 2});
        map.put("RO", new int[]{0, 1, 1, 3});
        map.put("RS", new int[]{1, 1, 0, 0});
        map.put("RU", new int[]{0, 1, 1, 1});
        map.put("RW", new int[]{3, 4, 3, 1});
        map.put("SA", new int[]{3, 2, 2, 3});
        map.put("SB", new int[]{4, 4, 3, 0});
        map.put("SC", new int[]{4, 2, 0, 1});
        map.put("SD", new int[]{3, 4, 4, 4});
        map.put("SE", new int[]{0, 0, 0, 0});
        map.put("SG", new int[]{1, 2, 3, 3});
        map.put("SH", new int[]{4, 2, 2, 2});
        map.put("SI", new int[]{0, 1, 0, 0});
        map.put("SJ", new int[]{3, 2, 0, 2});
        map.put("SK", new int[]{0, 1, 0, 1});
        map.put("SL", new int[]{4, 3, 2, 4});
        map.put("SM", new int[]{1, 0, 1, 1});
        map.put("SN", new int[]{4, 4, 4, 2});
        map.put("SO", new int[]{4, 4, 4, 3});
        map.put("SR", new int[]{3, 2, 2, 3});
        map.put("SS", new int[]{4, 3, 4, 2});
        map.put("ST", new int[]{3, 2, 2, 2});
        map.put("SV", new int[]{2, 3, 2, 3});
        map.put("SX", new int[]{2, 4, 2, 0});
        map.put("SY", new int[]{4, 4, 2, 0});
        map.put("SZ", new int[]{3, 4, 1, 1});
        map.put("TC", new int[]{2, 1, 2, 1});
        map.put("TD", new int[]{4, 4, 4, 3});
        map.put("TG", new int[]{3, 2, 2, 0});
        map.put("TH", new int[]{1, 3, 4, 4});
        map.put("TJ", new int[]{4, 4, 4, 4});
        map.put("TL", new int[]{4, 2, 4, 4});
        map.put("TM", new int[]{4, 1, 3, 3});
        map.put("TN", new int[]{2, 2, 1, 2});
        map.put("TO", new int[]{2, 3, 3, 1});
        map.put("TR", new int[]{1, 2, 0, 2});
        map.put("TT", new int[]{2, 1, 1, 0});
        map.put("TV", new int[]{4, 2, 2, 4});
        map.put("TW", new int[]{0, 0, 0, 1});
        map.put("TZ", new int[]{3, 3, 3, 2});
        map.put("UA", new int[]{0, 2, 1, 3});
        map.put("UG", new int[]{4, 3, 2, 2});
        map.put("US", new int[]{0, 1, 3, 3});
        map.put("UY", new int[]{2, 1, 2, 2});
        map.put("UZ", new int[]{4, 3, 2, 4});
        map.put("VA", new int[]{1, 2, 2, 2});
        map.put("VC", new int[]{2, 0, 3, 2});
        map.put("VE", new int[]{3, 4, 4, 3});
        map.put("VG", new int[]{3, 1, 3, 4});
        map.put("VI", new int[]{1, 0, 2, 4});
        map.put("VN", new int[]{0, 2, 4, 4});
        map.put("VU", new int[]{4, 1, 3, 2});
        map.put("WS", new int[]{3, 2, 3, 0});
        map.put("XK", new int[]{1, 2, 1, 0});
        map.put("YE", new int[]{4, 4, 4, 2});
        map.put("YT", new int[]{3, 1, 1, 2});
        map.put("ZA", new int[]{2, 3, 1, 2});
        map.put("ZM", new int[]{3, 3, 3, 1});
        map.put("ZW", new int[]{3, 3, 2, 1});
        return Collections.unmodifiableMap(map);
    }
}
