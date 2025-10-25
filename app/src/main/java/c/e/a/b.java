package c.e.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import f.a.a.a.g;
import f.a.a.a.q;

/* loaded from: classes.dex */
public final class b implements g.c {

    /* renamed from: a, reason: collision with root package name */
    private static Double f4464a;

    /* renamed from: b, reason: collision with root package name */
    private double f4465b;

    /* renamed from: d, reason: collision with root package name */
    private SensorEventListener f4467d;

    /* renamed from: e, reason: collision with root package name */
    private final SensorManager f4468e;

    /* renamed from: f, reason: collision with root package name */
    private final Sensor f4469f;

    /* renamed from: c, reason: collision with root package name */
    private double f4466c = 1.0d;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f4470g = new float[3];

    /* renamed from: h, reason: collision with root package name */
    private final float[] f4471h = new float[9];

    public static void a(q.d dVar) {
        new g(dVar.f(), "hemanthraj/flutter_compass").a(new b(dVar.b(), 11));
    }

    @Override // f.a.a.a.g.c
    public void a(Object obj, g.a aVar) {
        this.f4467d = a(aVar);
        this.f4468e.registerListener(this.f4467d, this.f4469f, 2);
        if (f4464a != null) {
            aVar.a(f4464a);
        }
    }

    @Override // f.a.a.a.g.c
    public void a(Object obj) {
        this.f4468e.unregisterListener(this.f4467d);
    }

    private SensorEventListener a(g.a aVar) {
        return new a(this, aVar);
    }

    private b(Context context, int i2) {
        this.f4468e = (SensorManager) context.getSystemService("sensor");
        this.f4469f = this.f4468e.getDefaultSensor(i2);
    }
}
