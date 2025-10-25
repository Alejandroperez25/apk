package c.e.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import f.a.a.a.g;

/* loaded from: classes.dex */
class a implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g.a f4462a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f4463b;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    a(b bVar, g.a aVar) {
        this.f4463b = bVar;
        this.f4462a = aVar;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f4463b.f4471h, sensorEvent.values);
        this.f4463b.f4465b = ((((Math.toDegrees(SensorManager.getOrientation(this.f4463b.f4471h, this.f4463b.f4470g)[0]) + 360.0d) % 360.0d) - Math.toDegrees(SensorManager.getOrientation(this.f4463b.f4471h, this.f4463b.f4470g)[2])) + 360.0d) % 360.0d;
        if (b.f4464a == null || Math.abs(b.f4464a.doubleValue() - this.f4463b.f4465b) >= this.f4463b.f4466c) {
            Double unused = b.f4464a = Double.valueOf(this.f4463b.f4465b);
            this.f4462a.a(Double.valueOf(this.f4463b.f4465b));
        }
    }
}
