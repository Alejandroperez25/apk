package c.d.a.a.i.d;

import android.text.TextUtils;
import c.d.a.a.e.o;
import c.d.a.a.m.E;
import c.d.a.a.m.u;
import c.d.a.a.x;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class r implements c.d.a.a.e.g {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f2867a = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f2868b = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: c, reason: collision with root package name */
    private final String f2869c;

    /* renamed from: d, reason: collision with root package name */
    private final E f2870d;

    /* renamed from: f, reason: collision with root package name */
    private c.d.a.a.e.i f2872f;

    /* renamed from: h, reason: collision with root package name */
    private int f2874h;

    /* renamed from: e, reason: collision with root package name */
    private final u f2871e = new u();

    /* renamed from: g, reason: collision with root package name */
    private byte[] f2873g = new byte[1024];

    @Override // c.d.a.a.e.g
    public void a() {
    }

    public r(String str, E e2) {
        this.f2869c = str;
        this.f2870d = e2;
    }

    @Override // c.d.a.a.e.g
    public boolean a(c.d.a.a.e.h hVar) {
        hVar.b(this.f2873g, 0, 6, false);
        this.f2871e.a(this.f2873g, 6);
        if (c.d.a.a.j.h.i.b(this.f2871e)) {
            return true;
        }
        hVar.b(this.f2873g, 6, 3, false);
        this.f2871e.a(this.f2873g, 9);
        return c.d.a.a.j.h.i.b(this.f2871e);
    }

    @Override // c.d.a.a.e.g
    public void a(c.d.a.a.e.i iVar) {
        this.f2872f = iVar;
        iVar.a(new o.b(-9223372036854775807L));
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // c.d.a.a.e.g
    public int a(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) throws x {
        int length = (int) hVar.getLength();
        if (this.f2874h == this.f2873g.length) {
            this.f2873g = Arrays.copyOf(this.f2873g, ((length != -1 ? length : this.f2873g.length) * 3) / 2);
        }
        int i2 = hVar.read(this.f2873g, this.f2874h, this.f2873g.length - this.f2874h);
        if (i2 != -1) {
            this.f2874h += i2;
            if (length == -1 || this.f2874h != length) {
                return 0;
            }
        }
        b();
        return -1;
    }

    private void b() throws x {
        u uVar = new u(this.f2873g);
        c.d.a.a.j.h.i.a(uVar);
        long jA = 0;
        long jA2 = 0;
        while (true) {
            String strA = uVar.A();
            if (!TextUtils.isEmpty(strA)) {
                if (strA.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher = f2867a.matcher(strA);
                    if (!matcher.find()) {
                        throw new x("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strA);
                    }
                    Matcher matcher2 = f2868b.matcher(strA);
                    if (!matcher2.find()) {
                        throw new x("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strA);
                    }
                    jA2 = c.d.a.a.j.h.i.a(matcher.group(1));
                    jA = E.a(Long.parseLong(matcher2.group(1)));
                }
            } else {
                Matcher matcherC = c.d.a.a.j.h.i.c(uVar);
                if (matcherC == null) {
                    a(0L);
                    return;
                }
                long jA3 = c.d.a.a.j.h.i.a(matcherC.group(1));
                long jD = this.f2870d.d(E.b((jA + jA3) - jA2));
                c.d.a.a.e.q qVarA = a(jD - jA3);
                this.f2871e.a(this.f2873g, this.f2874h);
                qVarA.a(this.f2871e, this.f2874h);
                qVarA.a(jD, 1, this.f2874h, 0, null);
                return;
            }
        }
    }

    private c.d.a.a.e.q a(long j) {
        c.d.a.a.e.q qVarA = this.f2872f.a(0, 3);
        qVarA.a(c.d.a.a.q.a((String) null, "text/vtt", (String) null, -1, 0, this.f2869c, (c.d.a.a.d.f) null, j));
        this.f2872f.a();
        return qVarA;
    }
}
