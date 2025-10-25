package com.innovaticx.strikepros.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import f.a.a.a.g;

/* loaded from: classes.dex */
class a implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g.a f5632a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f5633b;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    a(b bVar, g.a aVar) {
        this.f5633b = bVar;
        this.f5632a = aVar;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f5632a.a(Integer.valueOf((int) sensorEvent.values[0]));
    }
}
