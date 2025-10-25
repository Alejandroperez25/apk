package androidx.core.content.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import b.d.a$d;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
abstract class d {
    static Shader a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayA = i.a(resources, theme, attributeSet, a$d.GradientColor);
        float fA = i.a(typedArrayA, xmlPullParser, "startX", a$d.GradientColor_android_startX, 0.0f);
        float fA2 = i.a(typedArrayA, xmlPullParser, "startY", a$d.GradientColor_android_startY, 0.0f);
        float fA3 = i.a(typedArrayA, xmlPullParser, "endX", a$d.GradientColor_android_endX, 0.0f);
        float fA4 = i.a(typedArrayA, xmlPullParser, "endY", a$d.GradientColor_android_endY, 0.0f);
        float fA5 = i.a(typedArrayA, xmlPullParser, "centerX", a$d.GradientColor_android_centerX, 0.0f);
        float fA6 = i.a(typedArrayA, xmlPullParser, "centerY", a$d.GradientColor_android_centerY, 0.0f);
        int iA = i.a(typedArrayA, xmlPullParser, "type", a$d.GradientColor_android_type, 0);
        int iB = i.b(typedArrayA, xmlPullParser, "startColor", a$d.GradientColor_android_startColor, 0);
        boolean zA = i.a(xmlPullParser, "centerColor");
        int iB2 = i.b(typedArrayA, xmlPullParser, "centerColor", a$d.GradientColor_android_centerColor, 0);
        int iB3 = i.b(typedArrayA, xmlPullParser, "endColor", a$d.GradientColor_android_endColor, 0);
        int iA2 = i.a(typedArrayA, xmlPullParser, "tileMode", a$d.GradientColor_android_tileMode, 0);
        float fA7 = i.a(typedArrayA, xmlPullParser, "gradientRadius", a$d.GradientColor_android_gradientRadius, 0.0f);
        typedArrayA.recycle();
        a aVarA = a(b(resources, xmlPullParser, attributeSet, theme), iB, iB3, zA, iB2);
        switch (iA) {
            case 1:
                if (fA7 <= 0.0f) {
                    throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                }
                return new RadialGradient(fA5, fA6, fA7, aVarA.f548a, aVarA.f549b, a(iA2));
            case 2:
                return new SweepGradient(fA5, fA6, aVarA.f548a, aVarA.f549b);
            default:
                return new LinearGradient(fA, fA2, fA3, fA4, aVarA.f548a, aVarA.f549b, a(iA2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new androidx.core.content.a.d.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.core.content.a.d.a b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = b.d.a$d.GradientColorItem
            android.content.res.TypedArray r3 = androidx.core.content.a.i.a(r8, r11, r10, r3)
            int r5 = b.d.a$d.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = b.d.a$d.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = b.d.a$d.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = b.d.a$d.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            androidx.core.content.a.d$a r8 = new androidx.core.content.a.d$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.a.d.b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.a.d$a");
    }

    private static a a(a aVar, int i2, int i3, boolean z, int i4) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new a(i2, i4, i3);
        }
        return new a(i2, i3);
    }

    private static Shader.TileMode a(int i2) {
        switch (i2) {
            case 1:
                return Shader.TileMode.REPEAT;
            case 2:
                return Shader.TileMode.MIRROR;
            default:
                return Shader.TileMode.CLAMP;
        }
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f548a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f549b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f548a = new int[size];
            this.f549b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.f548a[i2] = list.get(i2).intValue();
                this.f549b[i2] = list2.get(i2).floatValue();
            }
        }

        a(int i2, int i3) {
            this.f548a = new int[]{i2, i3};
            this.f549b = new float[]{0.0f, 1.0f};
        }

        a(int i2, int i3, int i4) {
            this.f548a = new int[]{i2, i3, i4};
            this.f549b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
