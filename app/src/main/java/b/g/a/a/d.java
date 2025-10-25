package b.g.a.a;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f1191a;

    /* renamed from: b, reason: collision with root package name */
    private final float f1192b;

    protected d(float[] fArr) {
        this.f1191a = fArr;
        this.f1192b = 1.0f / (this.f1191a.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        int iMin = Math.min((int) ((this.f1191a.length - 1) * f2), this.f1191a.length - 2);
        return this.f1191a[iMin] + (((f2 - (iMin * this.f1192b)) / this.f1192b) * (this.f1191a[iMin + 1] - this.f1191a[iMin]));
    }
}
