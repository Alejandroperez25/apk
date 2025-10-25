package c.d.a.a.i.c.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import c.d.a.a.d.f;
import c.d.a.a.i.c.a.k;
import c.d.a.a.l.D;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.G;
import c.d.a.a.m.H;
import c.d.a.a.m.I;
import c.d.a.a.m.o;
import c.d.a.a.m.r;
import c.d.a.a.q;
import c.d.a.a.x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes.dex */
public class c extends DefaultHandler implements D.a<b> {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f2591a = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f2592b = Pattern.compile("CC([1-4])=.*");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f2593c = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: d, reason: collision with root package name */
    private final String f2594d;

    /* renamed from: e, reason: collision with root package name */
    private final XmlPullParserFactory f2595e;

    public c() {
        this(null);
    }

    public c(String str) {
        this.f2594d = str;
        try {
            this.f2595e = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    @Override // c.d.a.a.l.D.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b a(Uri uri, InputStream inputStream) throws XmlPullParserException, x {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f2595e.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() != 2 || !"MPD".equals(xmlPullParserNewPullParser.getName())) {
                throw new x("inputStream does not contain a valid media presentation description");
            }
            return c(xmlPullParserNewPullParser, uri.toString());
        } catch (XmlPullParserException e2) {
            throw new x(e2);
        }
    }

    protected b c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, NumberFormatException {
        long j;
        boolean z;
        long j2;
        long jB = b(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long jA = a(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long jA2 = a(xmlPullParser, "minBufferTime", -9223372036854775807L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        boolean z2 = false;
        boolean z3 = attributeValue != null && "dynamic".equals(attributeValue);
        long jA3 = z3 ? a(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long jA4 = z3 ? a(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jA5 = z3 ? a(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long jB2 = b(xmlPullParser, "publishTime", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        String strB = str;
        long j3 = z3 ? -9223372036854775807L : 0L;
        boolean z4 = false;
        n nVarC = null;
        Uri uri = null;
        g gVarL = null;
        while (true) {
            xmlPullParser.next();
            long j4 = jA4;
            if (I.b(xmlPullParser, "BaseURL")) {
                if (z2) {
                    j = j3;
                    z = z2;
                    j2 = jA3;
                    z2 = z;
                    j3 = j;
                } else {
                    strB = b(xmlPullParser, strB);
                    j2 = jA3;
                    z2 = true;
                }
            } else if (I.b(xmlPullParser, "ProgramInformation")) {
                j2 = jA3;
                gVarL = l(xmlPullParser);
            } else if (I.b(xmlPullParser, "UTCTiming")) {
                j2 = jA3;
                nVarC = c(xmlPullParser);
            } else if (I.b(xmlPullParser, "Location")) {
                j2 = jA3;
                uri = Uri.parse(xmlPullParser.nextText());
            } else {
                if (I.b(xmlPullParser, "Period") && !z4) {
                    z = z2;
                    Pair<f, Long> pairD = d(xmlPullParser, strB, j3);
                    j = j3;
                    f fVar = (f) pairD.first;
                    j2 = jA3;
                    if (fVar.f2612b != -9223372036854775807L) {
                        long jLongValue = ((Long) pairD.second).longValue();
                        long j5 = jLongValue == -9223372036854775807L ? -9223372036854775807L : jLongValue + fVar.f2612b;
                        arrayList.add(fVar);
                        j = j5;
                    } else {
                        if (!z3) {
                            throw new x("Unable to determine start of period " + arrayList.size());
                        }
                        z4 = true;
                    }
                } else {
                    j = j3;
                    z = z2;
                    j2 = jA3;
                    a(xmlPullParser);
                }
                z2 = z;
                j3 = j;
            }
            if (I.a(xmlPullParser, "MPD")) {
                if (jA == -9223372036854775807L) {
                    if (j3 != -9223372036854775807L) {
                        jA = j3;
                    } else if (!z3) {
                        throw new x("Unable to determine duration of static manifest.");
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new x("No periods found.");
                }
                return a(jB, jA, jA2, z3, j2, j4, jA5, jB2, gVarL, nVarC, uri, arrayList);
            }
            jA4 = j4;
            jA3 = j2;
        }
    }

    protected b a(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, g gVar, n nVar, Uri uri, List<f> list) {
        return new b(j, j2, j3, z, j4, j5, j6, j7, gVar, nVar, uri, list);
    }

    protected n c(XmlPullParser xmlPullParser) {
        return a(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    protected n a(String str, String str2) {
        return new n(str, str2);
    }

    protected Pair<f, Long> d(XmlPullParser xmlPullParser, String str, long j) throws XmlPullParserException, IOException, NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        long jA = a(xmlPullParser, "start", j);
        long jA2 = a(xmlPullParser, "duration", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        k kVarA = null;
        do {
            xmlPullParser.next();
            if (I.b(xmlPullParser, "BaseURL")) {
                if (!z) {
                    str = b(xmlPullParser, str);
                    z = true;
                }
            } else if (I.b(xmlPullParser, "AdaptationSet")) {
                arrayList.add(a(xmlPullParser, str, kVarA));
            } else if (I.b(xmlPullParser, "EventStream")) {
                arrayList2.add(h(xmlPullParser));
            } else if (I.b(xmlPullParser, "SegmentBase")) {
                kVarA = a(xmlPullParser, (k.e) null);
            } else if (I.b(xmlPullParser, "SegmentList")) {
                kVarA = a(xmlPullParser, (k.b) null);
            } else if (I.b(xmlPullParser, "SegmentTemplate")) {
                kVarA = a(xmlPullParser, (k.c) null);
            } else {
                a(xmlPullParser);
            }
        } while (!I.a(xmlPullParser, "Period"));
        return Pair.create(a(attributeValue, jA, arrayList, arrayList2), Long.valueOf(jA2));
    }

    protected f a(String str, long j, List<c.d.a.a.i.c.a.a> list, List<e> list2) {
        return new f(str, j, list, list2);
    }

    protected c.d.a.a.i.c.a.a a(XmlPullParser xmlPullParser, String str, k kVar) throws XmlPullParserException, NumberFormatException, IOException {
        int i2;
        String strC;
        String strB;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str2;
        XmlPullParser xmlPullParser2;
        ArrayList<d> arrayList5;
        k kVarA;
        int iA;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        int iA2 = a(xmlPullParser3, "id", -1);
        int iD = d(xmlPullParser);
        String str3 = null;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser3.getAttributeValue(null, "codecs");
        int iA3 = a(xmlPullParser3, "width", -1);
        int iA4 = a(xmlPullParser3, "height", -1);
        float fA = a(xmlPullParser3, -1.0f);
        int iA5 = a(xmlPullParser3, "audioSamplingRate", -1);
        String attributeValue3 = xmlPullParser3.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser3.getAttributeValue(null, "label");
        ArrayList arrayList6 = new ArrayList();
        ArrayList<d> arrayList7 = new ArrayList<>();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        String str4 = str;
        k kVar2 = kVar;
        int i3 = iD;
        String str5 = attributeValue3;
        String str6 = null;
        boolean z = false;
        int iF = 0;
        int iM = -1;
        ArrayList arrayList11 = arrayList6;
        while (true) {
            xmlPullParser.next();
            if (I.b(xmlPullParser3, "BaseURL")) {
                if (!z) {
                    strB = b(xmlPullParser3, str4);
                    strC = str5;
                    arrayList = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    arrayList5 = arrayList7;
                    arrayList4 = arrayList11;
                    str2 = str3;
                    xmlPullParser2 = xmlPullParser3;
                    z = true;
                    iA = i3;
                }
                i2 = i3;
                strC = str5;
                strB = str4;
                arrayList = arrayList10;
                arrayList2 = arrayList9;
                arrayList3 = arrayList8;
                arrayList5 = arrayList7;
                arrayList4 = arrayList11;
                str2 = str3;
                xmlPullParser2 = xmlPullParser3;
                iA = i2;
            } else {
                if (I.b(xmlPullParser3, "ContentProtection")) {
                    Pair<String, f.a> pairE = e(xmlPullParser);
                    if (pairE.first != null) {
                        str6 = (String) pairE.first;
                    }
                    if (pairE.second != null) {
                        arrayList11.add(pairE.second);
                    }
                } else if (I.b(xmlPullParser3, "ContentComponent")) {
                    strC = c(str5, xmlPullParser3.getAttributeValue(str3, "lang"));
                    strB = str4;
                    arrayList = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    arrayList5 = arrayList7;
                    arrayList4 = arrayList11;
                    str2 = str3;
                    xmlPullParser2 = xmlPullParser3;
                    iA = a(i3, d(xmlPullParser));
                } else if (I.b(xmlPullParser3, "Role")) {
                    iF |= f(xmlPullParser);
                } else if (I.b(xmlPullParser3, "AudioChannelConfiguration")) {
                    iM = m(xmlPullParser);
                } else {
                    if (I.b(xmlPullParser3, "Accessibility")) {
                        arrayList8.add(a(xmlPullParser3, "Accessibility"));
                    } else if (I.b(xmlPullParser3, "SupplementalProperty")) {
                        arrayList9.add(a(xmlPullParser3, "SupplementalProperty"));
                    } else if (I.b(xmlPullParser3, "Representation")) {
                        strC = str5;
                        strB = str4;
                        arrayList2 = arrayList9;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList11;
                        str2 = str3;
                        a aVarA = a(xmlPullParser, str4, attributeValue4, attributeValue, attributeValue2, iA3, iA4, fA, iM, iA5, strC, iF, arrayList3, kVar2);
                        int iA6 = a(i3, a(aVarA.f2596a));
                        arrayList = arrayList10;
                        arrayList.add(aVarA);
                        iA = iA6;
                        arrayList5 = arrayList7;
                        xmlPullParser2 = xmlPullParser;
                    } else {
                        i2 = i3;
                        strC = str5;
                        strB = str4;
                        arrayList = arrayList10;
                        arrayList2 = arrayList9;
                        arrayList3 = arrayList8;
                        ArrayList<d> arrayList12 = arrayList7;
                        arrayList4 = arrayList11;
                        str2 = str3;
                        xmlPullParser2 = xmlPullParser;
                        if (I.b(xmlPullParser2, "SegmentBase")) {
                            kVarA = a(xmlPullParser2, (k.e) kVar2);
                        } else if (I.b(xmlPullParser2, "SegmentList")) {
                            kVarA = a(xmlPullParser2, (k.b) kVar2);
                        } else if (I.b(xmlPullParser2, "SegmentTemplate")) {
                            kVarA = a(xmlPullParser2, (k.c) kVar2);
                        } else {
                            if (I.b(xmlPullParser2, "InbandEventStream")) {
                                arrayList5 = arrayList12;
                                arrayList5.add(a(xmlPullParser2, "InbandEventStream"));
                            } else {
                                arrayList5 = arrayList12;
                                if (I.b(xmlPullParser)) {
                                    g(xmlPullParser);
                                }
                            }
                            iA = i2;
                        }
                        kVar2 = kVarA;
                        iA = i2;
                        arrayList5 = arrayList12;
                    }
                    i2 = i3;
                    strC = str5;
                    strB = str4;
                    arrayList = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    arrayList5 = arrayList7;
                    arrayList4 = arrayList11;
                    str2 = str3;
                    xmlPullParser2 = xmlPullParser3;
                    iA = i2;
                }
                strC = str5;
                strB = str4;
                arrayList = arrayList10;
                arrayList2 = arrayList9;
                arrayList3 = arrayList8;
                arrayList5 = arrayList7;
                arrayList4 = arrayList11;
                str2 = str3;
                xmlPullParser2 = xmlPullParser3;
                iA = i3;
            }
            if (I.a(xmlPullParser2, "AdaptationSet")) {
                break;
            }
            xmlPullParser3 = xmlPullParser2;
            arrayList7 = arrayList5;
            i3 = iA;
            str4 = strB;
            arrayList9 = arrayList2;
            arrayList8 = arrayList3;
            arrayList11 = arrayList4;
            str3 = str2;
            arrayList10 = arrayList;
            str5 = strC;
        }
        ArrayList arrayList13 = new ArrayList(arrayList.size());
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList13.add(a((a) arrayList.get(i4), this.f2594d, str6, (ArrayList<f.a>) arrayList4, arrayList5));
        }
        return a(iA2, iA, arrayList13, arrayList3, arrayList2);
    }

    protected c.d.a.a.i.c.a.a a(int i2, int i3, List<j> list, List<d> list2, List<d> list3) {
        return new c.d.a.a.i.c.a.a(i2, i3, list, list2, list3);
    }

    protected int d(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    protected int a(q qVar) {
        String str = qVar.f3682g;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (r.b(str)) {
            return 2;
        }
        if (r.a(str)) {
            return 1;
        }
        return a(str) ? 3 : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c A[LOOP:0: B:39:0x009a->B:79:0x013c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r5v16, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.util.Pair<java.lang.String, c.d.a.a.d.f.a> e(org.xmlpull.v1.XmlPullParser r17) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.i.c.a.c.e(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    protected int f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strA = a(xmlPullParser, "schemeIdUri", (String) null);
        String strA2 = a(xmlPullParser, "value", (String) null);
        do {
            xmlPullParser.next();
        } while (!I.a(xmlPullParser, "Role"));
        return ("urn:mpeg:dash:role:2011".equals(strA) && "main".equals(strA2)) ? 1 : 0;
    }

    protected void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        a(xmlPullParser);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0142 A[LOOP:0: B:3:0x0058->B:43:0x0142, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106 A[EDGE_INSN: B:44:0x0106->B:37:0x0106 BREAK  A[LOOP:0: B:3:0x0058->B:43:0x0142], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected c.d.a.a.i.c.a.c.a a(org.xmlpull.v1.XmlPullParser r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, int r31, float r32, int r33, int r34, java.lang.String r35, int r36, java.util.List<c.d.a.a.i.c.a.d> r37, c.d.a.a.i.c.a.k r38) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.i.c.a.c.a(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, int, java.util.List, c.d.a.a.i.c.a.k):c.d.a.a.i.c.a.c$a");
    }

    protected q a(String str, String str2, String str3, int i2, int i3, float f2, int i4, int i5, int i6, String str4, int i7, List<d> list, String str5, List<d> list2) {
        String str6;
        int i8;
        int iB;
        String strB = b(str3, str5);
        if (strB != null) {
            if ("audio/eac3".equals(strB)) {
                strB = c(list2);
            }
            str6 = strB;
            if (r.b(str6)) {
                return q.a(str, str2, str3, str6, str5, i6, i2, i3, f2, (List<byte[]>) null, i7);
            }
            if (r.a(str6)) {
                return q.a(str, str2, str3, str6, str5, i6, i4, i5, (List<byte[]>) null, i7, str4);
            }
            if (a(str6)) {
                if ("application/cea-608".equals(str6)) {
                    iB = a(list);
                } else if ("application/cea-708".equals(str6)) {
                    iB = b(list);
                } else {
                    i8 = -1;
                    return q.a(str, str2, str3, str6, str5, i6, i7, str4, i8);
                }
                i8 = iB;
                return q.a(str, str2, str3, str6, str5, i6, i7, str4, i8);
            }
        } else {
            str6 = strB;
        }
        return q.b(str, str2, str3, str6, str5, i6, i7, str4);
    }

    protected j a(a aVar, String str, String str2, ArrayList<f.a> arrayList, ArrayList<d> arrayList2) {
        q qVarA = aVar.f2596a;
        if (aVar.f2599d != null) {
            str2 = aVar.f2599d;
        }
        ArrayList<f.a> arrayList3 = aVar.f2600e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            a(arrayList3);
            qVarA = qVarA.a(new c.d.a.a.d.f(str2, arrayList3));
        }
        ArrayList<d> arrayList4 = aVar.f2601f;
        arrayList4.addAll(arrayList2);
        return j.a(str, aVar.f2602g, qVarA, aVar.f2597b, aVar.f2598c, arrayList4);
    }

    protected k.e a(XmlPullParser xmlPullParser, k.e eVar) throws XmlPullParserException, NumberFormatException, IOException {
        long j;
        long j2;
        long jC = c(xmlPullParser, "timescale", eVar != null ? eVar.f2635b : 1L);
        long jC2 = c(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f2636c : 0L);
        long j3 = eVar != null ? eVar.f2645d : 0L;
        long j4 = eVar != null ? eVar.f2646e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j2 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j2) + 1;
        } else {
            j = j4;
            j2 = j3;
        }
        h hVarJ = eVar != null ? eVar.f2634a : null;
        do {
            xmlPullParser.next();
            if (I.b(xmlPullParser, "Initialization")) {
                hVarJ = j(xmlPullParser);
            } else {
                a(xmlPullParser);
            }
        } while (!I.a(xmlPullParser, "SegmentBase"));
        return a(hVarJ, jC, jC2, j2, j);
    }

    protected k.e a(h hVar, long j, long j2, long j3, long j4) {
        return new k.e(hVar, j, j2, j3, j4);
    }

    protected k.b a(XmlPullParser xmlPullParser, k.b bVar) throws XmlPullParserException, IOException {
        long jC = c(xmlPullParser, "timescale", bVar != null ? bVar.f2635b : 1L);
        long jC2 = c(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f2636c : 0L);
        long jC3 = c(xmlPullParser, "duration", bVar != null ? bVar.f2638e : -9223372036854775807L);
        long jC4 = c(xmlPullParser, "startNumber", bVar != null ? bVar.f2637d : 1L);
        List<h> arrayList = null;
        h hVarJ = null;
        List<k.d> listI = null;
        do {
            xmlPullParser.next();
            if (I.b(xmlPullParser, "Initialization")) {
                hVarJ = j(xmlPullParser);
            } else if (I.b(xmlPullParser, "SegmentTimeline")) {
                listI = i(xmlPullParser);
            } else if (I.b(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(k(xmlPullParser));
            } else {
                a(xmlPullParser);
            }
        } while (!I.a(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (hVarJ == null) {
                hVarJ = bVar.f2634a;
            }
            if (listI == null) {
                listI = bVar.f2639f;
            }
            if (arrayList == null) {
                arrayList = bVar.f2640g;
            }
        }
        return a(hVarJ, jC, jC2, jC4, jC3, listI, arrayList);
    }

    protected k.b a(h hVar, long j, long j2, long j3, long j4, List<k.d> list, List<h> list2) {
        return new k.b(hVar, j, j2, j3, j4, list, list2);
    }

    protected k.c a(XmlPullParser xmlPullParser, k.c cVar) throws XmlPullParserException, IOException {
        long jC = c(xmlPullParser, "timescale", cVar != null ? cVar.f2635b : 1L);
        long jC2 = c(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f2636c : 0L);
        long jC3 = c(xmlPullParser, "duration", cVar != null ? cVar.f2638e : -9223372036854775807L);
        long jC4 = c(xmlPullParser, "startNumber", cVar != null ? cVar.f2637d : 1L);
        h hVarJ = null;
        m mVarA = a(xmlPullParser, "media", cVar != null ? cVar.f2642h : null);
        m mVarA2 = a(xmlPullParser, "initialization", cVar != null ? cVar.f2641g : null);
        List<k.d> listI = null;
        do {
            xmlPullParser.next();
            if (I.b(xmlPullParser, "Initialization")) {
                hVarJ = j(xmlPullParser);
            } else if (I.b(xmlPullParser, "SegmentTimeline")) {
                listI = i(xmlPullParser);
            } else {
                a(xmlPullParser);
            }
        } while (!I.a(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (hVarJ == null) {
                hVarJ = cVar.f2634a;
            }
            if (listI == null) {
                listI = cVar.f2639f;
            }
        }
        return a(hVarJ, jC, jC2, jC4, jC3, listI, mVarA2, mVarA);
    }

    protected k.c a(h hVar, long j, long j2, long j3, long j4, List<k.d> list, m mVar, m mVar2) {
        return new k.c(hVar, j, j2, j3, j4, list, mVar, mVar2);
    }

    protected e h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strA = a(xmlPullParser, "schemeIdUri", "");
        String strA2 = a(xmlPullParser, "value", "");
        long jC = c(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (I.b(xmlPullParser, "Event")) {
                arrayList.add(a(xmlPullParser, strA, strA2, jC, byteArrayOutputStream));
            } else {
                a(xmlPullParser);
            }
        } while (!I.a(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        c.d.a.a.g.a.b[] bVarArr = new c.d.a.a.g.a.b[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            jArr[i2] = ((Long) pair.first).longValue();
            bVarArr[i2] = (c.d.a.a.g.a.b) pair.second;
        }
        return a(strA, strA2, jC, jArr, bVarArr);
    }

    protected e a(String str, String str2, long j, long[] jArr, c.d.a.a.g.a.b[] bVarArr) {
        return new e(str, str2, j, jArr, bVarArr);
    }

    protected Pair<Long, c.d.a.a.g.a.b> a(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        long jC = c(xmlPullParser, "id", 0L);
        long jC2 = c(xmlPullParser, "duration", -9223372036854775807L);
        long jC3 = c(xmlPullParser, "presentationTime", 0L);
        long jD = H.d(jC2, 1000L, j);
        long jD2 = H.d(jC3, 1000000L, j);
        String strA = a(xmlPullParser, "messageData", (String) null);
        byte[] bArrA = a(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jD2);
        if (strA != null) {
            bArrA = H.c(strA);
        }
        return Pair.create(lValueOf, a(str, str2, jC, jD, bArrA));
    }

    protected byte[] a(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, "UTF-8");
        xmlPullParser.nextToken();
        while (!I.a(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, false);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i2), xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeValue(i2));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected c.d.a.a.g.a.b a(String str, String str2, long j, long j2, byte[] bArr) {
        return new c.d.a.a.g.a.b(str, str2, j2, j, bArr);
    }

    protected List<k.d> i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jC = 0;
        do {
            xmlPullParser.next();
            if (I.b(xmlPullParser, "S")) {
                jC = c(xmlPullParser, "t", jC);
                long jC2 = c(xmlPullParser, "d", -9223372036854775807L);
                int iA = a(xmlPullParser, "r", 0) + 1;
                for (int i2 = 0; i2 < iA; i2++) {
                    arrayList.add(a(jC, jC2));
                    jC += jC2;
                }
            } else {
                a(xmlPullParser);
            }
        } while (!I.a(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    protected k.d a(long j, long j2) {
        return new k.d(j, j2);
    }

    protected m a(XmlPullParser xmlPullParser, String str, m mVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? m.a(attributeValue) : mVar;
    }

    protected h j(XmlPullParser xmlPullParser) {
        return b(xmlPullParser, "sourceURL", "range");
    }

    protected h k(XmlPullParser xmlPullParser) {
        return b(xmlPullParser, "media", "mediaRange");
    }

    protected h b(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return a(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return a(attributeValue, j, j2);
    }

    protected h a(String str, long j, long j2) {
        return new h(str, j, j2);
    }

    protected g l(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strA = a(xmlPullParser, "moreInformationURL", (String) null);
        String strA2 = a(xmlPullParser, "lang", (String) null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (I.b(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (I.b(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (I.b(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                a(xmlPullParser);
            }
            String str = strNextText3;
            if (I.a(xmlPullParser, "ProgramInformation")) {
                return new g(strNextText, strNextText2, str, strA, strA2);
            }
            strNextText3 = str;
        }
    }

    protected int m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strA = a(xmlPullParser, "schemeIdUri", (String) null);
        int iB = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(strA)) {
            iB = a(xmlPullParser, "value", -1);
        } else if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(strA)) {
            iB = b(xmlPullParser);
        }
        do {
            xmlPullParser.next();
        } while (!I.a(xmlPullParser, "AudioChannelConfiguration"));
        return iB;
    }

    public static void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (I.b(xmlPullParser)) {
            int i2 = 1;
            while (i2 != 0) {
                xmlPullParser.next();
                if (I.b(xmlPullParser)) {
                    i2++;
                } else if (I.a(xmlPullParser)) {
                    i2--;
                }
            }
        }
    }

    private static void a(ArrayList<f.a> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f.a aVar = arrayList.get(size);
            if (!aVar.f()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i2).b(aVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    private static String b(String str, String str2) {
        if (r.a(str)) {
            return r.e(str2);
        }
        if (r.b(str)) {
            return r.d(str2);
        }
        if (a(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            if ("application/x-rawcc".equals(str) && str2 != null) {
                if (str2.contains("cea708")) {
                    return "application/cea-708";
                }
                if (str2.contains("eia608") || str2.contains("cea608")) {
                    return "application/cea-608";
                }
            }
            return null;
        }
        if (str2 != null) {
            if (str2.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (str2.startsWith("wvtt")) {
                return "application/x-mp4-vtt";
            }
        }
        return null;
    }

    private static boolean a(String str) {
        return r.c(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    private static String c(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        AbstractC0170e.b(str.equals(str2));
        return str;
    }

    private static int a(int i2, int i3) {
        if (i2 == -1) {
            return i3;
        }
        if (i3 == -1) {
            return i2;
        }
        AbstractC0170e.b(i2 == i3);
        return i2;
    }

    protected static d a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strA = a(xmlPullParser, "schemeIdUri", "");
        String strA2 = a(xmlPullParser, "value", (String) null);
        String strA3 = a(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!I.a(xmlPullParser, str));
        return new d(strA, strA2, strA3);
    }

    protected static int a(List<d> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            d dVar = list.get(i2);
            if ("urn:scte:dash:cc:cea-608:2015".equals(dVar.f2603a) && dVar.f2604b != null) {
                Matcher matcher = f2592b.matcher(dVar.f2604b);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                o.c("MpdParser", "Unable to parse CEA-608 channel number from: " + dVar.f2604b);
            }
        }
        return -1;
    }

    protected static int b(List<d> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            d dVar = list.get(i2);
            if ("urn:scte:dash:cc:cea-708:2015".equals(dVar.f2603a) && dVar.f2604b != null) {
                Matcher matcher = f2593c.matcher(dVar.f2604b);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                o.c("MpdParser", "Unable to parse CEA-708 service block number from: " + dVar.f2604b);
            }
        }
        return -1;
    }

    protected static String c(List<d> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            d dVar = list.get(i2);
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(dVar.f2603a) && "ec+3".equals(dVar.f2604b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float a(XmlPullParser xmlPullParser, float f2) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f2;
        }
        Matcher matcher = f2591a.matcher(attributeValue);
        if (!matcher.matches()) {
            return f2;
        }
        int i2 = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? i2 / Integer.parseInt(r2) : i2;
    }

    protected static long a(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : H.f(attributeValue);
    }

    protected static long b(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : H.g(attributeValue);
    }

    protected static String b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        xmlPullParser.next();
        return G.b(str, xmlPullParser.getText());
    }

    protected static int a(XmlPullParser xmlPullParser, String str, int i2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i2 : Integer.parseInt(attributeValue);
    }

    protected static long c(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    protected static String a(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static int b(org.xmlpull.v1.XmlPullParser r5) {
        /*
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r5 = r5.getAttributeValue(r1, r0)
            java.lang.String r5 = c.d.a.a.m.H.d(r5)
            r0 = -1
            if (r5 != 0) goto Lf
            return r0
        Lf:
            int r1 = r5.hashCode()
            r2 = 1596796(0x185d7c, float:2.237588E-39)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L48
            r2 = 2937391(0x2cd22f, float:4.116161E-39)
            if (r1 == r2) goto L3e
            r2 = 3094035(0x2f3613, float:4.335666E-39)
            if (r1 == r2) goto L34
            r2 = 3133436(0x2fcffc, float:4.390879E-39)
            if (r1 == r2) goto L2a
            goto L52
        L2a:
            java.lang.String r1 = "fa01"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L52
            r5 = 3
            goto L53
        L34:
            java.lang.String r1 = "f801"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L52
            r5 = 2
            goto L53
        L3e:
            java.lang.String r1 = "a000"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L52
            r5 = 1
            goto L53
        L48:
            java.lang.String r1 = "4000"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L52
            r5 = 0
            goto L53
        L52:
            r5 = -1
        L53:
            switch(r5) {
                case 0: goto L5d;
                case 1: goto L5c;
                case 2: goto L5a;
                case 3: goto L57;
                default: goto L56;
            }
        L56:
            return r0
        L57:
            r5 = 8
            return r5
        L5a:
            r5 = 6
            return r5
        L5c:
            return r3
        L5d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.i.c.a.c.b(org.xmlpull.v1.XmlPullParser):int");
    }

    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final q f2596a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2597b;

        /* renamed from: c, reason: collision with root package name */
        public final k f2598c;

        /* renamed from: d, reason: collision with root package name */
        public final String f2599d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList<f.a> f2600e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList<d> f2601f;

        /* renamed from: g, reason: collision with root package name */
        public final long f2602g;

        public a(q qVar, String str, k kVar, String str2, ArrayList<f.a> arrayList, ArrayList<d> arrayList2, long j) {
            this.f2596a = qVar;
            this.f2597b = str;
            this.f2598c = kVar;
            this.f2599d = str2;
            this.f2600e = arrayList;
            this.f2601f = arrayList2;
            this.f2602g = j;
        }
    }
}
