package c.d.a.a;

import java.io.IOException;

/* renamed from: c.d.a.a.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145h extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f2485a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2486b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f2487c;

    public static C0145h a(IOException iOException) {
        return new C0145h(0, iOException, -1);
    }

    public static C0145h a(Exception exc, int i2) {
        return new C0145h(1, exc, i2);
    }

    static C0145h a(RuntimeException runtimeException) {
        return new C0145h(2, runtimeException, -1);
    }

    private C0145h(int i2, Throwable th, int i3) {
        super(th);
        this.f2485a = i2;
        this.f2487c = th;
        this.f2486b = i3;
    }
}
