package c.h.b.a;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Log;
import c.h.a.a.b;
import c.h.a.b.a.d;
import c.h.a.b.c.e;
import c.h.a.d.c;
import c.h.a.d.f;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class a implements b, e, c, c.h.a.b.a.b {

    /* renamed from: a, reason: collision with root package name */
    private Context f4765a;

    /* renamed from: b, reason: collision with root package name */
    private c.h.a.b.c.a f4766b;

    /* renamed from: c, reason: collision with root package name */
    protected f f4767c;

    /* renamed from: d, reason: collision with root package name */
    private d f4768d;

    /* renamed from: e, reason: collision with root package name */
    private c.h.a.a.a f4769e;

    /* renamed from: f, reason: collision with root package name */
    private c.h.b.d.b f4770f;
    private c.h.b.c.b j;
    private int k;
    private int l;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4771g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4772h = true;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4773i = false;
    private c.h.b.c.a m = new c.h.b.c.a();

    protected abstract void a(String str);

    protected abstract void a(boolean z, int i2);

    protected abstract void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);

    protected abstract void c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    protected abstract void d();

    protected abstract void d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    public a(Context context) {
        this.f4765a = context;
        this.f4770f = new c.h.b.d.c(context);
        this.f4770f.c();
        this.f4766b = new c.h.a.b.c.a(this.f4770f.a(), context);
        h();
    }

    private void h() {
        this.f4767c = new f(this);
        this.f4768d = new d(this);
        this.f4769e = new c.h.a.a.a(this);
        this.j = new c.h.b.c.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(int r12, int r13, int r14, int r15, boolean r16, int r17, int r18) {
        /*
            r11 = this;
            r0 = r11
            boolean r1 = r0.f4773i
            if (r1 == 0) goto Ld
            int r1 = r0.k
            r3 = r12
            if (r3 != r1) goto Lb
            goto Le
        Lb:
            r4 = r13
            goto L13
        Ld:
            r3 = r12
        Le:
            int r1 = r0.l
            r4 = r13
            if (r4 == r1) goto L19
        L13:
            r11.c()
            r1 = 1
            r0.f4773i = r1
        L19:
            c.h.b.d.b r1 = r0.f4770f
            if (r1 != 0) goto L21
            c.h.a.d.b r1 = c.h.a.d.b.YUV420Dynamical
        L1f:
            r10 = r1
            goto L24
        L21:
            c.h.a.d.b r1 = c.h.a.d.b.SURFACE
            goto L1f
        L24:
            c.h.a.d.f r2 = r0.f4767c
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r18
            r8 = r16
            r9 = r17
            boolean r1 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.b.a.a.a(int, int, int, int, boolean, int, int):boolean");
    }

    public boolean a(int i2, int i3, int i4, int i5, boolean z, int i6) {
        return a(i2, i3, i4, i5, z, 2, i6);
    }

    public boolean a(int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.f4768d.a(i3, z, z2, z3);
        a(z, i3);
        return this.f4769e.a(i2, i3, z, this.f4768d.c());
    }

    public boolean a() {
        return a(640, 480, 30, 1228800, false, c.h.a.b.c.b.a(this.f4765a));
    }

    public boolean b() {
        return a(65536, 32000, true, false, false);
    }

    public void c() {
        if (!f() && this.f4773i && !(this.f4770f instanceof c.h.b.d.c)) {
            if (this.f4770f != null && Build.VERSION.SDK_INT >= 18) {
                this.f4770f.stop();
            }
            this.f4766b.a();
            this.f4773i = false;
            this.k = 0;
            this.l = 0;
            return;
        }
        Log.e("Camera1Base", "Streaming or preview stopped, ignored");
    }

    public void b(String str) throws IOException {
        this.f4771g = true;
        if (!this.j.a()) {
            i();
        } else {
            j();
        }
        a(str);
        this.f4773i = true;
    }

    private void i() throws IOException {
        this.f4767c.a();
        this.f4769e.a();
        k();
        this.f4768d.a();
        this.f4766b.a(this.f4767c.i());
        if ((!this.f4766b.b() && this.f4767c.g() != this.k) || this.f4767c.h() != this.l) {
            this.f4766b.a(this.f4767c.g(), this.f4767c.h(), this.f4767c.j());
        }
        this.f4773i = true;
    }

    private void j() {
        if (this.f4770f != null && Build.VERSION.SDK_INT >= 18) {
            this.f4770f.b();
        }
        this.f4767c.e();
        if (this.f4770f == null || Build.VERSION.SDK_INT < 18) {
            return;
        }
        this.f4770f.a(this.f4767c.f());
    }

    private void k() {
        if (this.f4770f == null || Build.VERSION.SDK_INT < 18) {
            return;
        }
        if (this.f4770f instanceof c.h.b.d.c) {
            this.f4770f = new c.h.b.d.c(this.f4765a);
            this.f4770f.c();
        }
        this.f4770f.b(this.f4767c.j());
        if (this.f4767c.i() == 90 || this.f4767c.i() == 270) {
            this.f4770f.a(this.f4767c.h(), this.f4767c.g());
        } else {
            this.f4770f.a(this.f4767c.g(), this.f4767c.h());
        }
        this.f4770f.a(0);
        if ((!this.f4766b.b() && this.f4767c.g() != this.k) || this.f4767c.h() != this.l) {
            this.f4770f.start();
        }
        if (this.f4767c.f() != null) {
            this.f4770f.a(this.f4767c.f());
        }
        this.f4766b.a(this.f4770f.a());
    }

    public void e() {
        if (this.f4771g) {
            this.f4771g = false;
            d();
        }
        if (this.j.b()) {
            return;
        }
        this.f4768d.b();
        if (this.f4770f != null && Build.VERSION.SDK_INT >= 18) {
            this.f4770f.b();
            if (this.f4770f instanceof c.h.b.d.c) {
                this.f4770f.stop();
                this.f4766b.a();
            }
        }
        this.f4767c.c();
        this.f4769e.c();
        this.j.c();
    }

    public boolean f() {
        return this.f4771g;
    }

    public boolean g() {
        return this.j.a();
    }

    @Override // c.h.a.a.b
    public void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.j.b(byteBuffer, bufferInfo);
        }
        if (this.f4771g) {
            c(byteBuffer, bufferInfo);
        }
    }

    @Override // c.h.a.d.c
    public void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (this.f4771g) {
            b(byteBuffer, byteBuffer2, null);
        }
    }

    @Override // c.h.a.d.c
    public void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        if (this.f4771g) {
            b(byteBuffer, byteBuffer2, byteBuffer3);
        }
    }

    @Override // c.h.a.d.c
    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.m.a();
        if (Build.VERSION.SDK_INT >= 18) {
            this.j.a(byteBuffer, bufferInfo);
        }
        if (this.f4771g) {
            d(byteBuffer, bufferInfo);
        }
    }

    @Override // c.h.a.b.a.b
    public void b(c.h.a.c cVar) throws MediaCodec.CryptoException {
        this.f4769e.b(cVar);
    }

    @Override // c.h.a.b.c.e
    public void a(c.h.a.c cVar) {
        this.f4767c.a(cVar);
    }

    @Override // c.h.a.d.c
    public void b(MediaFormat mediaFormat) {
        this.j.a(mediaFormat);
    }

    @Override // c.h.a.a.b
    public void a(MediaFormat mediaFormat) {
        this.j.b(mediaFormat);
    }
}
