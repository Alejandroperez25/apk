package c.h.a.b.b.a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static int f4698a = 1;

    /* renamed from: d, reason: collision with root package name */
    private e f4701d;

    /* renamed from: e, reason: collision with root package name */
    private int f4702e;

    /* renamed from: f, reason: collision with root package name */
    private int f4703f;

    /* renamed from: g, reason: collision with root package name */
    private int f4704g;

    /* renamed from: h, reason: collision with root package name */
    private int f4705h;

    /* renamed from: i, reason: collision with root package name */
    private Context f4706i;

    /* renamed from: c, reason: collision with root package name */
    private List<c.h.a.b.b.a.a.a> f4700c = new ArrayList(f4698a);

    /* renamed from: b, reason: collision with root package name */
    private b f4699b = new b();

    public c() {
        for (int i2 = 0; i2 < f4698a; i2++) {
            this.f4700c.add(new c.h.a.b.b.a.a.b());
        }
        this.f4701d = new e();
    }

    public void a(Context context, int i2, int i3, int i4, int i5) {
        this.f4706i = context;
        this.f4702e = i2;
        this.f4703f = i3;
        this.f4704g = i4;
        this.f4705h = i5;
        this.f4699b.a(this.f4702e, this.f4703f, context, i4, i5);
        int i6 = 0;
        while (i6 < f4698a) {
            this.f4700c.get(i6).a(i6 == 0 ? this.f4699b.b() : this.f4700c.get(i6 - 1).b());
            this.f4700c.get(i6).a(this.f4702e, this.f4703f, context, i4, i5);
            this.f4700c.get(i6).c();
            i6++;
        }
        this.f4701d.a(i2, i3);
        this.f4701d.a(this.f4700c.get(f4698a - 1).b());
        this.f4701d.a(context);
    }

    public void a() {
        this.f4699b.c();
        Iterator<c.h.a.b.b.a.a.a> it = this.f4700c.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public void a(int i2, int i3, boolean z) {
        this.f4701d.a(i2, i3, z);
    }

    public void b() {
        this.f4699b.a();
        for (int i2 = 0; i2 < this.f4700c.size(); i2++) {
            this.f4700c.get(i2).a();
            this.f4700c.set(i2, new c.h.a.b.b.a.a.b());
        }
        this.f4701d.a();
    }

    public void a(boolean z) {
        this.f4701d.a(z);
    }

    public void c() {
        this.f4699b.d();
    }

    public SurfaceTexture d() {
        return this.f4699b.e();
    }

    public void a(int i2, c.h.a.b.b.a.a.a aVar) {
        int iF = this.f4700c.get(i2).f();
        d dVarG = this.f4700c.get(i2).g();
        this.f4700c.get(i2).a();
        this.f4700c.set(i2, aVar);
        this.f4700c.get(i2).a(iF);
        this.f4700c.get(i2).a(this.f4702e, this.f4703f, this.f4706i, this.f4704g, this.f4705h);
        this.f4700c.get(i2).a(dVarG);
    }

    public void a(int i2) {
        this.f4699b.a(i2);
    }
}
