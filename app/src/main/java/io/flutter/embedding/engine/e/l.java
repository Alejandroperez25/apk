package io.flutter.embedding.engine.e;

import f.a.a.a.o;
import f.a.a.a.s;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final f.a.a.a.o f6073a;

    /* renamed from: b, reason: collision with root package name */
    private d f6074b;

    /* renamed from: c, reason: collision with root package name */
    private final o.c f6075c = new k(this);

    public interface d {
        long a(a aVar);

        void a(int i2);

        void a(int i2, int i3);

        void a(b bVar, Runnable runnable);

        void a(c cVar);

        void b(int i2);
    }

    public void a(int i2) {
        if (this.f6073a == null) {
            return;
        }
        this.f6073a.a("viewFocused", Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public l(io.flutter.embedding.engine.a.b bVar) {
        this.f6073a = new f.a.a.a.o(bVar, "flutter/platform_views", s.f5677a);
        this.f6073a.a(this.f6075c);
    }

    public void a(d dVar) {
        this.f6074b = dVar;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f6076a;

        /* renamed from: b, reason: collision with root package name */
        public final String f6077b;

        /* renamed from: c, reason: collision with root package name */
        public final double f6078c;

        /* renamed from: d, reason: collision with root package name */
        public final double f6079d;

        /* renamed from: e, reason: collision with root package name */
        public final int f6080e;

        /* renamed from: f, reason: collision with root package name */
        public final ByteBuffer f6081f;

        public a(int i2, String str, double d2, double d3, int i3, ByteBuffer byteBuffer) {
            this.f6076a = i2;
            this.f6077b = str;
            this.f6078c = d2;
            this.f6079d = d3;
            this.f6080e = i3;
            this.f6081f = byteBuffer;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f6082a;

        /* renamed from: b, reason: collision with root package name */
        public final double f6083b;

        /* renamed from: c, reason: collision with root package name */
        public final double f6084c;

        public b(int i2, double d2, double d3) {
            this.f6082a = i2;
            this.f6083b = d2;
            this.f6084c = d3;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f6085a;

        /* renamed from: b, reason: collision with root package name */
        public final Number f6086b;

        /* renamed from: c, reason: collision with root package name */
        public final Number f6087c;

        /* renamed from: d, reason: collision with root package name */
        public final int f6088d;

        /* renamed from: e, reason: collision with root package name */
        public final int f6089e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f6090f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f6091g;

        /* renamed from: h, reason: collision with root package name */
        public final int f6092h;

        /* renamed from: i, reason: collision with root package name */
        public final int f6093i;
        public final float j;
        public final float k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;

        c(int i2, Number number, Number number2, int i3, int i4, Object obj, Object obj2, int i5, int i6, float f2, float f3, int i7, int i8, int i9, int i10) {
            this.f6085a = i2;
            this.f6086b = number;
            this.f6087c = number2;
            this.f6088d = i3;
            this.f6089e = i4;
            this.f6090f = obj;
            this.f6091g = obj2;
            this.f6092h = i5;
            this.f6093i = i6;
            this.j = f2;
            this.k = f3;
            this.l = i7;
            this.m = i8;
            this.n = i9;
            this.o = i10;
        }
    }
}
