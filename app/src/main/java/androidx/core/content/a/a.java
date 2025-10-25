package androidx.core.content.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import b.d.a$a;
import b.d.a$d;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class a {
    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return a(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        return b(resources, xmlPullParser, attributeSet, theme);
    }

    private static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int i2 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrA = new int[iArr.length];
        int i3 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i2 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayA = a(resources, theme, attributeSet, a$d.ColorStateListItem);
                int color = typedArrayA.getColor(a$d.ColorStateListItem_android_color, -65281);
                float f2 = 1.0f;
                if (typedArrayA.hasValue(a$d.ColorStateListItem_android_alpha)) {
                    f2 = typedArrayA.getFloat(a$d.ColorStateListItem_android_alpha, 1.0f);
                } else if (typedArrayA.hasValue(a$d.ColorStateListItem_alpha)) {
                    f2 = typedArrayA.getFloat(a$d.ColorStateListItem_alpha, 1.0f);
                }
                typedArrayA.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i4 = 0;
                for (int i5 = 0; i5 < attributeCount; i5++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != a$a.alpha) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i4] = attributeNameResource;
                        i4 = i6;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i4);
                iArrA = e.a(iArrA, i3, a(color, f2));
                iArr = (int[][]) e.a(iArr, i3, iArrTrimStateSet);
                i3++;
            }
            i2 = 1;
        }
        int[] iArr3 = new int[i3];
        int[][] iArr4 = new int[i3][];
        System.arraycopy(iArrA, 0, iArr3, 0, i3);
        System.arraycopy(iArr, 0, iArr4, 0, i3);
        return new ColorStateList(iArr4, iArr3);
    }

    private static TypedArray a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private static int a(int i2, float f2) {
        return (i2 & 16777215) | (Math.round(Color.alpha(i2) * f2) << 24);
    }
}
