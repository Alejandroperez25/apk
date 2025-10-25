package c.d.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* renamed from: c.d.a.a.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0144g implements H {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2391a;

    /* renamed from: b, reason: collision with root package name */
    private c.d.a.a.d.h<c.d.a.a.d.j> f2392b;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2395e;

    /* renamed from: c, reason: collision with root package name */
    private int f2393c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f2394d = 5000;

    /* renamed from: f, reason: collision with root package name */
    private c.d.a.a.f.e f2396f = c.d.a.a.f.e.f2378a;

    protected void a(Context context, Handler handler, int i2, ArrayList<E> arrayList) {
    }

    public C0144g(Context context) {
        this.f2391a = context;
    }

    @Override // c.d.a.a.H
    public E[] a(Handler handler, c.d.a.a.n.s sVar, c.d.a.a.b.p pVar, c.d.a.a.j.k kVar, c.d.a.a.g.g gVar, c.d.a.a.d.h<c.d.a.a.d.j> hVar) {
        c.d.a.a.d.h<c.d.a.a.d.j> hVar2 = hVar == null ? this.f2392b : hVar;
        ArrayList<E> arrayList = new ArrayList<>();
        c.d.a.a.d.h<c.d.a.a.d.j> hVar3 = hVar2;
        a(this.f2391a, this.f2393c, this.f2396f, hVar3, this.f2395e, handler, sVar, this.f2394d, arrayList);
        a(this.f2391a, this.f2393c, this.f2396f, hVar3, this.f2395e, a(), handler, pVar, arrayList);
        a(this.f2391a, kVar, handler.getLooper(), this.f2393c, arrayList);
        a(this.f2391a, gVar, handler.getLooper(), this.f2393c, arrayList);
        a(this.f2391a, this.f2393c, arrayList);
        a(this.f2391a, handler, this.f2393c, arrayList);
        return (E[]) arrayList.toArray(new E[arrayList.size()]);
    }

    protected void a(Context context, int i2, c.d.a.a.f.e eVar, c.d.a.a.d.h<c.d.a.a.d.j> hVar, boolean z, Handler handler, c.d.a.a.n.s sVar, long j, ArrayList<E> arrayList) {
        arrayList.add(new c.d.a.a.n.o(context, eVar, j, hVar, z, handler, sVar, 50));
        if (i2 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i2 == 2) {
            size--;
        }
        try {
            arrayList.add(size, (E) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, c.d.a.a.n.s.class, Integer.TYPE).newInstance(true, Long.valueOf(j), handler, sVar, 50));
            c.d.a.a.m.o.b("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating VP9 extension", e2);
        }
    }

    protected void a(Context context, int i2, c.d.a.a.f.e eVar, c.d.a.a.d.h<c.d.a.a.d.j> hVar, boolean z, c.d.a.a.b.o[] oVarArr, Handler handler, c.d.a.a.b.p pVar, ArrayList<E> arrayList) {
        int i3;
        int i4;
        arrayList.add(new c.d.a.a.b.B(context, eVar, hVar, z, handler, pVar, c.d.a.a.b.k.a(context), oVarArr));
        if (i2 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i2 == 2) {
            size--;
        }
        try {
            try {
                i3 = size + 1;
                try {
                    arrayList.add(size, (E) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, c.d.a.a.b.p.class, c.d.a.a.b.o[].class).newInstance(handler, pVar, oVarArr));
                    c.d.a.a.m.o.b("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                i3 = size;
            }
            try {
                try {
                    i4 = i3 + 1;
                    try {
                        arrayList.add(i3, (E) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, c.d.a.a.b.p.class, c.d.a.a.b.o[].class).newInstance(handler, pVar, oVarArr));
                        c.d.a.a.m.o.b("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                    }
                } catch (ClassNotFoundException unused4) {
                    i4 = i3;
                }
                try {
                    arrayList.add(i4, (E) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, c.d.a.a.b.p.class, c.d.a.a.b.o[].class).newInstance(handler, pVar, oVarArr));
                    c.d.a.a.m.o.b("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e2);
                }
            } catch (Exception e3) {
                throw new RuntimeException("Error instantiating FLAC extension", e3);
            }
        } catch (Exception e4) {
            throw new RuntimeException("Error instantiating Opus extension", e4);
        }
    }

    protected void a(Context context, c.d.a.a.j.k kVar, Looper looper, int i2, ArrayList<E> arrayList) {
        arrayList.add(new c.d.a.a.j.l(kVar, looper));
    }

    protected void a(Context context, c.d.a.a.g.g gVar, Looper looper, int i2, ArrayList<E> arrayList) {
        arrayList.add(new c.d.a.a.g.h(gVar, looper));
    }

    protected void a(Context context, int i2, ArrayList<E> arrayList) {
        arrayList.add(new c.d.a.a.n.a.b());
    }

    protected c.d.a.a.b.o[] a() {
        return new c.d.a.a.b.o[0];
    }
}
