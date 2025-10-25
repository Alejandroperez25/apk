package androidx.core.content.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import b.d.a$d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class c {

    public interface a {
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        private final b.d.d.a f545a;

        /* renamed from: b, reason: collision with root package name */
        private final int f546b;

        /* renamed from: c, reason: collision with root package name */
        private final int f547c;

        public d(b.d.d.a aVar, int i2, int i3) {
            this.f545a = aVar;
            this.f547c = i2;
            this.f546b = i3;
        }

        public b.d.d.a a() {
            return this.f545a;
        }

        public int b() {
            return this.f547c;
        }

        public int c() {
            return this.f546b;
        }
    }

    /* renamed from: androidx.core.content.a.c$c, reason: collision with other inner class name */
    public static final class C0007c {

        /* renamed from: a, reason: collision with root package name */
        private final String f539a;

        /* renamed from: b, reason: collision with root package name */
        private int f540b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f541c;

        /* renamed from: d, reason: collision with root package name */
        private String f542d;

        /* renamed from: e, reason: collision with root package name */
        private int f543e;

        /* renamed from: f, reason: collision with root package name */
        private int f544f;

        public C0007c(String str, int i2, boolean z, String str2, int i3, int i4) {
            this.f539a = str;
            this.f540b = i2;
            this.f541c = z;
            this.f542d = str2;
            this.f543e = i3;
            this.f544f = i4;
        }

        public String a() {
            return this.f539a;
        }

        public int b() {
            return this.f540b;
        }

        public boolean c() {
            return this.f541c;
        }

        public String d() {
            return this.f542d;
        }

        public int e() {
            return this.f543e;
        }

        public int f() {
            return this.f544f;
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final C0007c[] f538a;

        public b(C0007c[] c0007cArr) {
            this.f538a = c0007cArr;
        }

        public C0007c[] a() {
            return this.f538a;
        }
    }

    public static a a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return b(xmlPullParser, resources);
    }

    private static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return c(xmlPullParser, resources);
        }
        a(xmlPullParser);
        return null;
    }

    private static a c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a$d.FontFamily);
        String string = typedArrayObtainAttributes.getString(a$d.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(a$d.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(a$d.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(a$d.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(a$d.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(a$d.FontFamily_fontProviderFetchTimeout, 500);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                a(xmlPullParser);
            }
            return new d(new b.d.d.a(string, string2, string3, a(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(d(xmlPullParser, resources));
                } else {
                    a(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((C0007c[]) arrayList.toArray(new C0007c[arrayList.size()]));
    }

    private static int a(TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i2);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i2, typedValue);
        return typedValue.type;
    }

    public static List<List<byte[]>> a(Resources resources, int i2) throws Resources.NotFoundException {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(a(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static List<byte[]> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    private static C0007c d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a$d.FontFamilyFont);
        int i2 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(a$d.FontFamilyFont_fontWeight) ? a$d.FontFamilyFont_fontWeight : a$d.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(a$d.FontFamilyFont_fontStyle) ? a$d.FontFamilyFont_fontStyle : a$d.FontFamilyFont_android_fontStyle, 0);
        int i3 = typedArrayObtainAttributes.hasValue(a$d.FontFamilyFont_ttcIndex) ? a$d.FontFamilyFont_ttcIndex : a$d.FontFamilyFont_android_ttcIndex;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(a$d.FontFamilyFont_fontVariationSettings) ? a$d.FontFamilyFont_fontVariationSettings : a$d.FontFamilyFont_android_fontVariationSettings);
        int i4 = typedArrayObtainAttributes.getInt(i3, 0);
        int i5 = typedArrayObtainAttributes.hasValue(a$d.FontFamilyFont_font) ? a$d.FontFamilyFont_font : a$d.FontFamilyFont_android_font;
        int resourceId = typedArrayObtainAttributes.getResourceId(i5, 0);
        String string2 = typedArrayObtainAttributes.getString(i5);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        return new C0007c(string2, i2, z, string, i4, resourceId);
    }

    private static void a(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i2++;
                    break;
                case 3:
                    i2--;
                    break;
            }
        }
    }
}
