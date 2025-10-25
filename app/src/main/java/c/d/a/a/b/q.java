package c.d.a.a.b;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface q {

    public interface c {
        void a();

        void a(int i2);

        void a(int i2, long j, long j2);
    }

    long a(boolean z);

    c.d.a.a.z a(c.d.a.a.z zVar);

    void a();

    void a(float f2);

    void a(int i2);

    void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int i7);

    void a(j jVar);

    void a(c cVar);

    void a(t tVar);

    boolean a(int i2, int i3);

    boolean a(ByteBuffer byteBuffer, long j);

    boolean b();

    c.d.a.a.z d();

    void e();

    boolean f();

    void g();

    void h();

    void i();

    void pause();

    void reset();

    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }

        public a(String str) {
            super(str);
        }
    }

    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f1591a;

        public b(int i2, int i3, int i4, int i5) {
            super("AudioTrack init failed: " + i2 + ", Config(" + i3 + ", " + i4 + ", " + i5 + ")");
            this.f1591a = i2;
        }
    }

    public static final class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f1592a;

        public d(int i2) {
            super("AudioTrack write failed: " + i2);
            this.f1592a = i2;
        }
    }
}
