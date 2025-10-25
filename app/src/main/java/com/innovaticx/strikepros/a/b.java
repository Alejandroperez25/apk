package com.innovaticx.strikepros.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import f.a.a.a.g;

/* loaded from: classes.dex */
public class b implements g.c {

    /* renamed from: a, reason: collision with root package name */
    private SensorEventListener f5634a;

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f5635b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f5636c;

    public b(Context context) {
        this.f5635b = (SensorManager) context.getSystemService("sensor");
        this.f5636c = this.f5635b.getDefaultSensor(19);
    }

    @Override // f.a.a.a.g.c
    public void a(Object obj, g.a aVar) {
        this.f5634a = a(aVar);
        this.f5635b.registerListener(this.f5634a, this.f5636c, 0);
    }

    @Override // f.a.a.a.g.c
    public void a(Object obj) {
        this.f5635b.unregisterListener(this.f5634a);
    }

    SensorEventListener a(g.a aVar) {
        return new a(this, aVar);
    }
}
