package c.d.a.a.n.a;

import c.d.a.a.AbstractC0131c;
import c.d.a.a.c.f;
import c.d.a.a.m.H;
import c.d.a.a.m.u;
import c.d.a.a.q;
import c.d.a.a.r;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class b extends AbstractC0131c {
    private final r j;
    private final f k;
    private final u l;
    private long m;
    private a n;
    private long o;

    @Override // c.d.a.a.E
    public boolean c() {
        return true;
    }

    public b() {
        super(5);
        this.j = new r();
        this.k = new f(1);
        this.l = new u();
    }

    @Override // c.d.a.a.F
    public int a(q qVar) {
        return "application/x-camera-motion".equals(qVar.f3682g) ? 4 : 0;
    }

    @Override // c.d.a.a.AbstractC0131c, c.d.a.a.C.b
    public void a(int i2, Object obj) {
        if (i2 == 7) {
            this.n = (a) obj;
        } else {
            super.a(i2, obj);
        }
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void a(q[] qVarArr, long j) {
        this.m = j;
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void a(long j, boolean z) {
        w();
    }

    @Override // c.d.a.a.AbstractC0131c
    protected void r() {
        w();
    }

    @Override // c.d.a.a.E
    public void a(long j, long j2) {
        float[] fArrA;
        while (!h() && this.o < 100000 + j) {
            this.k.b();
            if (a(this.j, this.k, false) != -4 || this.k.d()) {
                return;
            }
            this.k.l();
            this.o = this.k.f1685d;
            if (this.n != null && (fArrA = a(this.k.f1684c)) != null) {
                a aVar = this.n;
                H.a(aVar);
                aVar.a(this.o - this.m, fArrA);
            }
        }
    }

    @Override // c.d.a.a.E
    public boolean b() {
        return h();
    }

    private float[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.l.a(byteBuffer.array(), byteBuffer.limit());
        this.l.c(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i2 = 0; i2 < 3; i2++) {
            fArr[i2] = Float.intBitsToFloat(this.l.q());
        }
        return fArr;
    }

    private void w() {
        this.o = 0L;
        if (this.n != null) {
            this.n.a();
        }
    }
}
