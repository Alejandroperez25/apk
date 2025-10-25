package b.k.a.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import b.d.a.b;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class f {
    private static boolean a(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public static Animator a(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i2);
        }
        return a(context, context.getResources(), context.getTheme(), i2);
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, int i2) {
        return a(context, resources, theme, i2, 1.0f);
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, int i2, float f2) throws Throwable {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                XmlResourceParser animation = resources.getAnimation(i2);
                try {
                    Animator animatorA = a(context, resources, theme, animation, f2);
                    if (animation != null) {
                        animation.close();
                    }
                    return animatorA;
                } catch (IOException e2) {
                    e = e2;
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                    notFoundException.initCause(e);
                    throw notFoundException;
                } catch (XmlPullParserException e3) {
                    e = e3;
                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                    notFoundException2.initCause(e);
                    throw notFoundException2;
                } catch (Throwable th) {
                    th = th;
                    xmlResourceParser = animation;
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (XmlPullParserException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static class a implements TypeEvaluator<b.C0014b[]> {

        /* renamed from: a, reason: collision with root package name */
        private b.C0014b[] f1236a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b.C0014b[] evaluate(float f2, b.C0014b[] c0014bArr, b.C0014b[] c0014bArr2) {
            if (!b.d.a.b.a(c0014bArr, c0014bArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (this.f1236a == null || !b.d.a.b.a(this.f1236a, c0014bArr)) {
                this.f1236a = b.d.a.b.a(c0014bArr);
            }
            for (int i2 = 0; i2 < c0014bArr.length; i2++) {
                this.f1236a[i2].a(c0014bArr[i2], c0014bArr2[i2], f2);
            }
            return this.f1236a;
        }
    }

    private static PropertyValuesHolder a(TypedArray typedArray, int i2, int i3, int i4, String str) {
        int color;
        int color2;
        int color3;
        float dimension;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        float dimension2;
        float dimension3;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i3);
        boolean z = typedValuePeekValue != null;
        int i5 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i4);
        boolean z2 = typedValuePeekValue2 != null;
        int i6 = z2 ? typedValuePeekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z && a(i5)) || (z2 && a(i6))) ? 3 : 0;
        }
        boolean z3 = i2 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i2 == 2) {
            String string = typedArray.getString(i3);
            String string2 = typedArray.getString(i4);
            b.C0014b[] c0014bArrB = b.d.a.b.b(string);
            b.C0014b[] c0014bArrB2 = b.d.a.b.b(string2);
            if (c0014bArrB == null && c0014bArrB2 == null) {
                return null;
            }
            if (c0014bArrB == null) {
                if (c0014bArrB2 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), c0014bArrB2);
                }
                return null;
            }
            a aVar = new a();
            if (c0014bArrB2 != null) {
                if (!b.d.a.b.a(c0014bArrB, c0014bArrB2)) {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, c0014bArrB, c0014bArrB2);
            } else {
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, c0014bArrB);
            }
            return propertyValuesHolderOfObject;
        }
        g gVarA = i2 == 3 ? g.a() : null;
        if (z3) {
            if (z) {
                if (i5 == 5) {
                    dimension2 = typedArray.getDimension(i3, 0.0f);
                } else {
                    dimension2 = typedArray.getFloat(i3, 0.0f);
                }
                if (z2) {
                    if (i6 == 5) {
                        dimension3 = typedArray.getDimension(i4, 0.0f);
                    } else {
                        dimension3 = typedArray.getFloat(i4, 0.0f);
                    }
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension2, dimension3);
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension2);
                }
            } else {
                if (i6 == 5) {
                    dimension = typedArray.getDimension(i4, 0.0f);
                } else {
                    dimension = typedArray.getFloat(i4, 0.0f);
                }
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z) {
            if (i5 == 5) {
                color2 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (a(i5)) {
                color2 = typedArray.getColor(i3, 0);
            } else {
                color2 = typedArray.getInt(i3, 0);
            }
            if (z2) {
                if (i6 == 5) {
                    color3 = (int) typedArray.getDimension(i4, 0.0f);
                } else if (a(i6)) {
                    color3 = typedArray.getColor(i4, 0);
                } else {
                    color3 = typedArray.getInt(i4, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z2) {
            if (i6 == 5) {
                color = (int) typedArray.getDimension(i4, 0.0f);
            } else if (a(i6)) {
                color = typedArray.getColor(i4, 0);
            } else {
                color = typedArray.getInt(i4, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt == null || gVarA == null) {
            return propertyValuesHolderOfInt;
        }
        propertyValuesHolderOfInt.setEvaluator(gVarA);
        return propertyValuesHolderOfInt;
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f2, XmlPullParser xmlPullParser) {
        long jA = androidx.core.content.a.i.a(typedArray, xmlPullParser, "duration", 1, 300);
        long jA2 = androidx.core.content.a.i.a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int iA = androidx.core.content.a.i.a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (androidx.core.content.a.i.a(xmlPullParser, "valueFrom") && androidx.core.content.a.i.a(xmlPullParser, "valueTo")) {
            if (iA == 4) {
                iA = a(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderA = a(typedArray, iA, 5, 6, "");
            if (propertyValuesHolderA != null) {
                valueAnimator.setValues(propertyValuesHolderA);
            }
        }
        valueAnimator.setDuration(jA);
        valueAnimator.setStartDelay(jA2);
        valueAnimator.setRepeatCount(androidx.core.content.a.i.a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(androidx.core.content.a.i.a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            a(valueAnimator, typedArray2, iA, f2, xmlPullParser);
        }
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, int i2, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strA = androidx.core.content.a.i.a(typedArray, xmlPullParser, "pathData", 1);
        if (strA != null) {
            String strA2 = androidx.core.content.a.i.a(typedArray, xmlPullParser, "propertyXName", 2);
            String strA3 = androidx.core.content.a.i.a(typedArray, xmlPullParser, "propertyYName", 3);
            if (i2 != 2) {
            }
            if (strA2 == null && strA3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            a(b.d.a.b.a(strA), objectAnimator, f2 * 0.5f, strA2, strA3);
            return;
        }
        objectAnimator.setPropertyName(androidx.core.content.a.i.a(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void a(Path path, ObjectAnimator objectAnimator, float f2, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f2)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f3 = length / (iMin - 1);
        int i2 = 0;
        float f4 = 0.0f;
        int i3 = 0;
        while (true) {
            if (i2 >= iMin) {
                break;
            }
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
            fArr[i2] = fArr3[0];
            fArr2[i2] = fArr3[1];
            f4 += f3;
            int i4 = i3 + 1;
            if (i4 < arrayList.size() && f4 > ((Float) arrayList.get(i4)).floatValue()) {
                pathMeasure2.nextContour();
                i3 = i4;
            }
            i2++;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f2) {
        return a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
    
        if (r23 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
    
        if (r13 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
    
        if (r2.hasNext() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0101, code lost:
    
        if (r24 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        r23.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0107, code lost:
    
        r23.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.k.a.a.f.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static PropertyValuesHolder[] a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i2;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray typedArrayA = androidx.core.content.a.i.a(resources, theme, attributeSet, b.k.a.a.a.f1222i);
                    String strA = androidx.core.content.a.i.a(typedArrayA, xmlPullParser, "propertyName", 3);
                    int iA = androidx.core.content.a.i.a(typedArrayA, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder propertyValuesHolderA = a(context, resources, theme, xmlPullParser, strA, iA);
                    if (propertyValuesHolderA == null) {
                        propertyValuesHolderA = a(typedArrayA, iA, 0, 1, strA);
                    }
                    if (propertyValuesHolderA != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(propertyValuesHolderA);
                    }
                    typedArrayA.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i2 = 0; i2 < size; i2++) {
                propertyValuesHolderArr[i2] = (PropertyValuesHolder) arrayList.get(i2);
            }
        }
        return propertyValuesHolderArr;
    }

    private static int a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayA = androidx.core.content.a.i.a(resources, theme, attributeSet, b.k.a.a.a.j);
        int i2 = 0;
        TypedValue typedValueB = androidx.core.content.a.i.b(typedArrayA, xmlPullParser, "value", 0);
        if ((typedValueB != null) && a(typedValueB.type)) {
            i2 = 3;
        }
        typedArrayA.recycle();
        return i2;
    }

    private static int a(TypedArray typedArray, int i2, int i3) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i4 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        return ((z && a(i4)) || (z2 && a(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
    }

    private static PropertyValuesHolder a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i2) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolderOfKeyframe = null;
        int iA = i2;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (iA == 4) {
                    iA = a(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe keyframeA = a(context, resources, theme, Xml.asAttributeSet(xmlPullParser), iA, xmlPullParser);
                if (keyframeA != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeA);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), a(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, a(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i3 = 0; i3 < size; i3++) {
                Keyframe keyframe3 = keyframeArr[i3];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i3 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i4 = size - 1;
                        if (i3 == i4) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i5 = i3;
                            for (int i6 = i3 + 1; i6 < i4 && keyframeArr[i6].getFraction() < 0.0f; i6++) {
                                i5 = i6;
                            }
                            a(keyframeArr, keyframeArr[i5 + 1].getFraction() - keyframeArr[i3 - 1].getFraction(), i3, i5);
                        }
                    }
                }
            }
            propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (iA == 3) {
                propertyValuesHolderOfKeyframe.setEvaluator(g.a());
            }
        }
        return propertyValuesHolderOfKeyframe;
    }

    private static Keyframe a(Keyframe keyframe, float f2) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f2);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f2);
        }
        return Keyframe.ofObject(f2);
    }

    private static void a(Keyframe[] keyframeArr, float f2, int i2, int i3) {
        float f3 = f2 / ((i3 - i2) + 2);
        while (i2 <= i3) {
            keyframeArr[i2].setFraction(keyframeArr[i2 - 1].getFraction() + f3);
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Keyframe a(android.content.Context r5, android.content.res.Resources r6, android.content.res.Resources.Theme r7, android.util.AttributeSet r8, int r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            int[] r0 = b.k.a.a.a.j
            android.content.res.TypedArray r6 = androidx.core.content.a.i.a(r6, r7, r8, r0)
            java.lang.String r7 = "fraction"
            r8 = 3
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = androidx.core.content.a.i.a(r6, r10, r7, r8, r0)
            java.lang.String r0 = "value"
            r1 = 0
            android.util.TypedValue r0 = androidx.core.content.a.i.b(r6, r10, r0, r1)
            r2 = 1
            if (r0 == 0) goto L1b
            r3 = 1
            goto L1c
        L1b:
            r3 = 0
        L1c:
            r4 = 4
            if (r9 != r4) goto L2c
            if (r3 == 0) goto L2b
            int r9 = r0.type
            boolean r9 = a(r9)
            if (r9 == 0) goto L2b
            r9 = 3
            goto L2c
        L2b:
            r9 = 0
        L2c:
            if (r3 == 0) goto L4c
            if (r9 == r8) goto L41
            switch(r9) {
                case 0: goto L35;
                case 1: goto L41;
                default: goto L33;
            }
        L33:
            r7 = 0
            goto L57
        L35:
            java.lang.String r8 = "value"
            r9 = 0
            float r8 = androidx.core.content.a.i.a(r6, r10, r8, r1, r9)
            android.animation.Keyframe r7 = android.animation.Keyframe.ofFloat(r7, r8)
            goto L57
        L41:
            java.lang.String r8 = "value"
            int r8 = androidx.core.content.a.i.a(r6, r10, r8, r1, r1)
            android.animation.Keyframe r7 = android.animation.Keyframe.ofInt(r7, r8)
            goto L57
        L4c:
            if (r9 != 0) goto L53
            android.animation.Keyframe r7 = android.animation.Keyframe.ofFloat(r7)
            goto L57
        L53:
            android.animation.Keyframe r7 = android.animation.Keyframe.ofInt(r7)
        L57:
            java.lang.String r8 = "interpolator"
            int r8 = androidx.core.content.a.i.c(r6, r10, r8, r2, r1)
            if (r8 <= 0) goto L66
            android.view.animation.Interpolator r5 = b.k.a.a.e.a(r5, r8)
            r7.setInterpolator(r5)
        L66:
            r6.recycle()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.k.a.a.f.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int, org.xmlpull.v1.XmlPullParser):android.animation.Keyframe");
    }

    private static ObjectAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        a(context, resources, theme, attributeSet, objectAnimator, f2, xmlPullParser);
        return objectAnimator;
    }

    private static ValueAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) {
        TypedArray typedArrayA = androidx.core.content.a.i.a(resources, theme, attributeSet, b.k.a.a.a.f1220g);
        TypedArray typedArrayA2 = androidx.core.content.a.i.a(resources, theme, attributeSet, b.k.a.a.a.k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        a(valueAnimator, typedArrayA, typedArrayA2, f2, xmlPullParser);
        int iC = androidx.core.content.a.i.c(typedArrayA, xmlPullParser, "interpolator", 0, 0);
        if (iC > 0) {
            valueAnimator.setInterpolator(e.a(context, iC));
        }
        typedArrayA.recycle();
        if (typedArrayA2 != null) {
            typedArrayA2.recycle();
        }
        return valueAnimator;
    }
}
