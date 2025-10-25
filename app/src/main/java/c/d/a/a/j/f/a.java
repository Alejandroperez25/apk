package c.d.a.a.j.f;

import c.d.a.a.m.H;
import c.d.a.a.m.I;
import c.d.a.a.m.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class a extends c.d.a.a.j.b {
    private static final Pattern o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    private static final b u = new b(30.0f, 1, 1);
    private static final C0040a v = new C0040a(32, 15);
    private final XmlPullParserFactory w;

    public a() {
        super("TtmlDecoder");
        try {
            this.w = XmlPullParserFactory.newInstance();
            this.w.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.a.a.j.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(byte[] bArr, int i2, boolean z) throws XmlPullParserException, NumberFormatException, IOException, c.d.a.a.j.f {
        f fVar;
        c cVarB;
        C0040a c0040aA;
        b bVar;
        b bVar2;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.w.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            c cVar = null;
            map2.put("", new c.d.a.a.j.f.c(null));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar3 = u;
            C0040a c0040a = v;
            f fVar2 = null;
            int i3 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c.d.a.a.j.f.b bVar4 = (c.d.a.a.j.f.b) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            b bVarA = a(xmlPullParserNewPullParser);
                            c0040aA = a(xmlPullParserNewPullParser, v);
                            cVarB = b(xmlPullParserNewPullParser);
                            bVar2 = bVarA;
                        } else {
                            cVarB = cVar;
                            bVar2 = bVar3;
                            c0040aA = c0040a;
                        }
                        if (!b(name)) {
                            o.b("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i3++;
                            fVar = fVar2;
                            bVar = bVar2;
                        } else if ("head".equals(name)) {
                            fVar = fVar2;
                            bVar = bVar2;
                            a(xmlPullParserNewPullParser, map, c0040aA, cVarB, map2, map3);
                        } else {
                            fVar = fVar2;
                            bVar = bVar2;
                            try {
                                c.d.a.a.j.f.b bVarA2 = a(xmlPullParserNewPullParser, bVar4, map2, bVar);
                                arrayDeque.push(bVarA2);
                                if (bVar4 != null) {
                                    bVar4.a(bVarA2);
                                }
                            } catch (c.d.a.a.j.f e2) {
                                o.a("TtmlDecoder", "Suppressing parser error", e2);
                                i3++;
                            }
                        }
                    } else {
                        fVar = fVar2;
                        if (eventType == 4) {
                            bVar4.a(c.d.a.a.j.f.b.a(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            f fVar3 = xmlPullParserNewPullParser.getName().equals("tt") ? new f((c.d.a.a.j.f.b) arrayDeque.peek(), map, map2, map3) : fVar;
                            arrayDeque.pop();
                            cVarB = cVar;
                            c0040aA = c0040a;
                            fVar = fVar3;
                            bVar = bVar3;
                        }
                        cVarB = cVar;
                        bVar = bVar3;
                        c0040aA = c0040a;
                    }
                    bVar3 = bVar;
                    c0040a = c0040aA;
                    cVar = cVarB;
                } else {
                    fVar = fVar2;
                    if (eventType == 2) {
                        i3++;
                    } else if (eventType == 3) {
                        i3--;
                    }
                }
                fVar2 = fVar;
                xmlPullParserNewPullParser.next();
            }
            return fVar2;
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new c.d.a.a.j.f("Unable to decode source", e4);
        }
    }

    private b a(XmlPullParser xmlPullParser) throws NumberFormatException, c.d.a.a.j.f {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f2 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (H.a(attributeValue2, " ").length != 2) {
                throw new c.d.a.a.j.f("frameRateMultiplier doesn't have 2 parts");
            }
            f2 = Integer.parseInt(r1[0]) / Integer.parseInt(r1[1]);
        }
        int i3 = u.f3196b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = u.f3197c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new b(i2 * f2, i3, i4);
    }

    private C0040a a(XmlPullParser xmlPullParser, C0040a c0040a) throws NumberFormatException, c.d.a.a.j.f {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c0040a;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            o.c("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return c0040a;
        }
        try {
            int i2 = Integer.parseInt(matcher.group(1));
            int i3 = Integer.parseInt(matcher.group(2));
            if (i2 == 0 || i3 == 0) {
                throw new c.d.a.a.j.f("Invalid cell resolution " + i2 + " " + i3);
            }
            return new C0040a(i2, i3);
        } catch (NumberFormatException unused) {
            o.c("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return c0040a;
        }
    }

    private c b(XmlPullParser xmlPullParser) {
        String strD = I.d(xmlPullParser, "extent");
        if (strD == null) {
            return null;
        }
        Matcher matcher = s.matcher(strD);
        if (!matcher.matches()) {
            o.c("TtmlDecoder", "Ignoring non-pixel tts extent: " + strD);
            return null;
        }
        try {
            return new c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        } catch (NumberFormatException unused) {
            o.c("TtmlDecoder", "Ignoring malformed tts extent: " + strD);
            return null;
        }
    }

    private Map<String, e> a(XmlPullParser xmlPullParser, Map<String, e> map, C0040a c0040a, c cVar, Map<String, c.d.a.a.j.f.c> map2, Map<String, String> map3) throws XmlPullParserException, IOException, NumberFormatException {
        do {
            xmlPullParser.next();
            if (I.b(xmlPullParser, "style")) {
                String strD = I.d(xmlPullParser, "style");
                e eVarA = a(xmlPullParser, new e());
                if (strD != null) {
                    for (String str : a(strD)) {
                        eVarA.a(map.get(str));
                    }
                }
                if (eVarA.i() != null) {
                    map.put(eVarA.i(), eVarA);
                }
            } else if (I.b(xmlPullParser, "region")) {
                c.d.a.a.j.f.c cVarA = a(xmlPullParser, c0040a, cVar);
                if (cVarA != null) {
                    map2.put(cVarA.f3209a, cVarA);
                }
            } else if (I.b(xmlPullParser, "metadata")) {
                a(xmlPullParser, map3);
            }
        } while (!I.a(xmlPullParser, "head"));
        return map;
    }

    private void a(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strD;
        do {
            xmlPullParser.next();
            if (I.b(xmlPullParser, "image") && (strD = I.d(xmlPullParser, "id")) != null) {
                map.put(strD, xmlPullParser.nextText());
            }
        } while (!I.a(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private c.d.a.a.j.f.c a(org.xmlpull.v1.XmlPullParser r13, c.d.a.a.j.f.a.C0040a r14, c.d.a.a.j.f.a.c r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.j.f.a.a(org.xmlpull.v1.XmlPullParser, c.d.a.a.j.f.a$a, c.d.a.a.j.f.a$c):c.d.a.a.j.f.c");
    }

    private String[] a(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : H.a(strTrim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private c.d.a.a.j.f.e a(org.xmlpull.v1.XmlPullParser r12, c.d.a.a.j.f.e r13) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.j.f.a.a(org.xmlpull.v1.XmlPullParser, c.d.a.a.j.f.e):c.d.a.a.j.f.e");
    }

    private e a(e eVar) {
        return eVar == null ? new e() : eVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private c.d.a.a.j.f.b a(org.xmlpull.v1.XmlPullParser r21, c.d.a.a.j.f.b r22, java.util.Map<java.lang.String, c.d.a.a.j.f.c> r23, c.d.a.a.j.f.a.b r24) throws java.lang.NumberFormatException, c.d.a.a.j.f {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.j.f.a.a(org.xmlpull.v1.XmlPullParser, c.d.a.a.j.f.b, java.util.Map, c.d.a.a.j.f.a$b):c.d.a.a.j.f.b");
    }

    private static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static void a(String str, e eVar) throws c.d.a.a.j.f {
        Matcher matcher;
        String[] strArrA = H.a(str, "\\s+");
        if (strArrA.length == 1) {
            matcher = q.matcher(str);
        } else if (strArrA.length == 2) {
            matcher = q.matcher(strArrA[1]);
            o.c("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new c.d.a.a.j.f("Invalid number of entries for fontSize: " + strArrA.length + ".");
        }
        if (matcher.matches()) {
            String strGroup = matcher.group(3);
            char c2 = 65535;
            int iHashCode = strGroup.hashCode();
            if (iHashCode != 37) {
                if (iHashCode != 3240) {
                    if (iHashCode == 3592 && strGroup.equals("px")) {
                        c2 = 0;
                    }
                } else if (strGroup.equals("em")) {
                    c2 = 1;
                }
            } else if (strGroup.equals("%")) {
                c2 = 2;
            }
            switch (c2) {
                case 0:
                    eVar.c(1);
                    break;
                case 1:
                    eVar.c(2);
                    break;
                case 2:
                    eVar.c(3);
                    break;
                default:
                    throw new c.d.a.a.j.f("Invalid unit for fontSize: '" + strGroup + "'.");
            }
            eVar.a(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        throw new c.d.a.a.j.f("Invalid expression for fontSize: '" + str + "'.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long a(java.lang.String r14, c.d.a.a.j.f.a.b r15) throws java.lang.NumberFormatException, c.d.a.a.j.f {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.j.f.a.a(java.lang.String, c.d.a.a.j.f.a$b):long");
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final float f3195a;

        /* renamed from: b, reason: collision with root package name */
        final int f3196b;

        /* renamed from: c, reason: collision with root package name */
        final int f3197c;

        b(float f2, int i2, int i3) {
            this.f3195a = f2;
            this.f3196b = i2;
            this.f3197c = i3;
        }
    }

    /* renamed from: c.d.a.a.j.f.a$a, reason: collision with other inner class name */
    private static final class C0040a {

        /* renamed from: a, reason: collision with root package name */
        final int f3193a;

        /* renamed from: b, reason: collision with root package name */
        final int f3194b;

        C0040a(int i2, int i3) {
            this.f3193a = i2;
            this.f3194b = i3;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final int f3198a;

        /* renamed from: b, reason: collision with root package name */
        final int f3199b;

        c(int i2, int i3) {
            this.f3198a = i2;
            this.f3199b = i3;
        }
    }
}
