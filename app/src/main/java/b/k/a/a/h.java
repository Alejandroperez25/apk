package b.k.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class h implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private float[] f1238a;

    /* renamed from: b, reason: collision with root package name */
    private float[] f1239b;

    public h(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayA = androidx.core.content.a.i.a(resources, theme, attributeSet, a.l);
        a(typedArrayA, xmlPullParser);
        typedArrayA.recycle();
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (androidx.core.content.a.i.a(xmlPullParser, "pathData")) {
            String strA = androidx.core.content.a.i.a(typedArray, xmlPullParser, "pathData", 4);
            Path pathA = b.d.a.b.a(strA);
            if (pathA == null) {
                throw new InflateException("The path is null, which is created from " + strA);
            }
            a(pathA);
            return;
        }
        if (!androidx.core.content.a.i.a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!androidx.core.content.a.i.a(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float fA = androidx.core.content.a.i.a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float fA2 = androidx.core.content.a.i.a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean zA = androidx.core.content.a.i.a(xmlPullParser, "controlX2");
        if (zA != androidx.core.content.a.i.a(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (!zA) {
            a(fA, fA2);
        } else {
            a(fA, fA2, androidx.core.content.a.i.a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), androidx.core.content.a.i.a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        }
    }

    private void a(float f2, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f2, f3, 1.0f, 1.0f);
        a(path);
    }

    private void a(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        a(path);
    }

    private void a(Path path) {
        int i2 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f1238a = new float[iMin];
        this.f1239b = new float[iMin];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < iMin; i3++) {
            pathMeasure.getPosTan((i3 * length) / (iMin - 1), fArr, null);
            this.f1238a[i3] = fArr[0];
            this.f1239b[i3] = fArr[1];
        }
        if (Math.abs(this.f1238a[0]) <= 1.0E-5d && Math.abs(this.f1239b[0]) <= 1.0E-5d) {
            int i4 = iMin - 1;
            if (Math.abs(this.f1238a[i4] - 1.0f) <= 1.0E-5d && Math.abs(this.f1239b[i4] - 1.0f) <= 1.0E-5d) {
                int i5 = 0;
                float f2 = 0.0f;
                while (i2 < iMin) {
                    int i6 = i5 + 1;
                    float f3 = this.f1238a[i5];
                    if (f3 < f2) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f3);
                    }
                    this.f1238a[i2] = f3;
                    i2++;
                    f2 = f3;
                    i5 = i6;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f1238a[0]);
        sb.append(",");
        sb.append(this.f1239b[0]);
        sb.append(" end:");
        int i7 = iMin - 1;
        sb.append(this.f1238a[i7]);
        sb.append(",");
        sb.append(this.f1239b[i7]);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f1238a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.f1238a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float f3 = this.f1238a[length] - this.f1238a[i2];
        if (f3 == 0.0f) {
            return this.f1239b[i2];
        }
        float f4 = (f2 - this.f1238a[i2]) / f3;
        float f5 = this.f1239b[i2];
        return f5 + (f4 * (this.f1239b[length] - f5));
    }
}
