package c.d.a.a.i.e.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import c.d.a.a.d.f;
import c.d.a.a.e.e.m;
import c.d.a.a.e.e.p;
import c.d.a.a.i.e.a.a;
import c.d.a.a.l.D;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.AbstractC0172g;
import c.d.a.a.m.H;
import c.d.a.a.q;
import c.d.a.a.x;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public class b implements D.a<c.d.a.a.i.e.a.a> {

    /* renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f2900a;

    public b() {
        try {
            this.f2900a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    @Override // c.d.a.a.l.D.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.d.a.a.i.e.a.a a(Uri uri, InputStream inputStream) throws XmlPullParserException, x {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f2900a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (c.d.a.a.i.e.a.a) new e(null, uri.toString()).a(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e2) {
            throw new x(e2);
        }
    }

    /* renamed from: c.d.a.a.i.e.a.b$b, reason: collision with other inner class name */
    public static class C0033b extends x {
        public C0033b(String str) {
            super("Missing required field: " + str);
        }
    }

    private static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f2901a;

        /* renamed from: b, reason: collision with root package name */
        private final String f2902b;

        /* renamed from: c, reason: collision with root package name */
        private final a f2903c;

        /* renamed from: d, reason: collision with root package name */
        private final List<Pair<String, Object>> f2904d = new LinkedList();

        protected abstract Object a();

        protected void a(Object obj) {
        }

        protected abstract void b(XmlPullParser xmlPullParser);

        protected boolean b(String str) {
            return false;
        }

        protected void c(XmlPullParser xmlPullParser) {
        }

        protected void d(XmlPullParser xmlPullParser) {
        }

        public a(a aVar, String str, String str2) {
            this.f2903c = aVar;
            this.f2901a = str;
            this.f2902b = str2;
        }

        public final Object a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i2 = 0;
            while (true) {
                switch (xmlPullParser.getEventType()) {
                    case 1:
                        return null;
                    case 2:
                        String name = xmlPullParser.getName();
                        if (!this.f2902b.equals(name)) {
                            if (!z) {
                                break;
                            } else if (i2 <= 0) {
                                if (b(name)) {
                                    b(xmlPullParser);
                                    break;
                                } else {
                                    a aVarA = a(this, name, this.f2901a);
                                    if (aVarA != null) {
                                        a(aVarA.a(xmlPullParser));
                                        break;
                                    } else {
                                        i2 = 1;
                                        break;
                                    }
                                }
                            } else {
                                i2++;
                                break;
                            }
                        } else {
                            b(xmlPullParser);
                            z = true;
                            break;
                        }
                    case 3:
                        if (!z) {
                            continue;
                        } else if (i2 <= 0) {
                            String name2 = xmlPullParser.getName();
                            d(xmlPullParser);
                            if (!b(name2)) {
                                return a();
                            }
                            break;
                        } else {
                            i2--;
                            break;
                        }
                    case 4:
                        if (!z || i2 != 0) {
                            break;
                        } else {
                            c(xmlPullParser);
                            break;
                        }
                }
                xmlPullParser.next();
            }
        }

        private a a(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        protected final void a(String str, Object obj) {
            this.f2904d.add(Pair.create(str, obj));
        }

        protected final Object a(String str) {
            for (int i2 = 0; i2 < this.f2904d.size(); i2++) {
                Pair<String, Object> pair = this.f2904d.get(i2);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            if (this.f2903c == null) {
                return null;
            }
            return this.f2903c.a(str);
        }

        protected final String a(XmlPullParser xmlPullParser, String str) throws C0033b {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0033b(str);
        }

        protected final int a(XmlPullParser xmlPullParser, String str, int i2) throws x {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i2;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e2) {
                throw new x(e2);
            }
        }

        protected final int b(XmlPullParser xmlPullParser, String str) throws x {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e2) {
                    throw new x(e2);
                }
            }
            throw new C0033b(str);
        }

        protected final long a(XmlPullParser xmlPullParser, String str, long j) throws x {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e2) {
                throw new x(e2);
            }
        }

        protected final long c(XmlPullParser xmlPullParser, String str) throws x {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e2) {
                    throw new x(e2);
                }
            }
            throw new C0033b(str);
        }

        protected final boolean a(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }
    }

    private static class e extends a {

        /* renamed from: e, reason: collision with root package name */
        private final List<a.b> f2909e;

        /* renamed from: f, reason: collision with root package name */
        private int f2910f;

        /* renamed from: g, reason: collision with root package name */
        private int f2911g;

        /* renamed from: h, reason: collision with root package name */
        private long f2912h;

        /* renamed from: i, reason: collision with root package name */
        private long f2913i;
        private long j;
        private int k;
        private boolean l;
        private a.C0032a m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.k = -1;
            this.m = null;
            this.f2909e = new LinkedList();
        }

        @Override // c.d.a.a.i.e.a.b.a
        public void b(XmlPullParser xmlPullParser) {
            this.f2910f = b(xmlPullParser, "MajorVersion");
            this.f2911g = b(xmlPullParser, "MinorVersion");
            this.f2912h = a(xmlPullParser, "TimeScale", 10000000L);
            this.f2913i = c(xmlPullParser, "Duration");
            this.j = a(xmlPullParser, "DVRWindowLength", 0L);
            this.k = a(xmlPullParser, "LookaheadCount", -1);
            this.l = a(xmlPullParser, "IsLive", false);
            a("TimeScale", Long.valueOf(this.f2912h));
        }

        @Override // c.d.a.a.i.e.a.b.a
        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f2909e.add((a.b) obj);
            } else if (obj instanceof a.C0032a) {
                AbstractC0170e.b(this.m == null);
                this.m = (a.C0032a) obj;
            }
        }

        @Override // c.d.a.a.i.e.a.b.a
        public Object a() {
            a.b[] bVarArr = new a.b[this.f2909e.size()];
            this.f2909e.toArray(bVarArr);
            if (this.m != null) {
                c.d.a.a.d.f fVar = new c.d.a.a.d.f(new f.a(this.m.f2888a, "video/mp4", this.m.f2889b));
                for (a.b bVar : bVarArr) {
                    int i2 = bVar.f2891a;
                    if (i2 == 2 || i2 == 1) {
                        q[] qVarArr = bVar.j;
                        for (int i3 = 0; i3 < qVarArr.length; i3++) {
                            qVarArr[i3] = qVarArr[i3].a(fVar);
                        }
                    }
                }
            }
            return new c.d.a.a.i.e.a.a(this.f2910f, this.f2911g, this.f2912h, this.f2913i, this.j, this.k, this.l, this.m, bVarArr);
        }
    }

    private static class c extends a {

        /* renamed from: e, reason: collision with root package name */
        private boolean f2905e;

        /* renamed from: f, reason: collision with root package name */
        private UUID f2906f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f2907g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        @Override // c.d.a.a.i.e.a.b.a
        public boolean b(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // c.d.a.a.i.e.a.b.a
        public void b(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f2905e = true;
                this.f2906f = UUID.fromString(c(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // c.d.a.a.i.e.a.b.a
        public void c(XmlPullParser xmlPullParser) {
            if (this.f2905e) {
                this.f2907g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }

        @Override // c.d.a.a.i.e.a.b.a
        public void d(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f2905e = false;
            }
        }

        @Override // c.d.a.a.i.e.a.b.a
        public Object a() {
            return new a.C0032a(this.f2906f, m.a(this.f2906f, this.f2907g), a(this.f2907g));
        }

        private static p[] a(byte[] bArr) {
            return new p[]{new p(true, null, 8, b(bArr), 0, 0, null)};
        }

        private static byte[] b(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < bArr.length; i2 += 2) {
                sb.append((char) bArr[i2]);
            }
            String string = sb.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            a(bArrDecode, 0, 3);
            a(bArrDecode, 1, 2);
            a(bArrDecode, 4, 5);
            a(bArrDecode, 6, 7);
            return bArrDecode;
        }

        private static void a(byte[] bArr, int i2, int i3) {
            byte b2 = bArr[i2];
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }

        private static String c(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }
    }

    private static class f extends a {

        /* renamed from: e, reason: collision with root package name */
        private final String f2914e;

        /* renamed from: f, reason: collision with root package name */
        private final List<q> f2915f;

        /* renamed from: g, reason: collision with root package name */
        private int f2916g;

        /* renamed from: h, reason: collision with root package name */
        private String f2917h;

        /* renamed from: i, reason: collision with root package name */
        private long f2918i;
        private String j;
        private String k;
        private int l;
        private int m;
        private int n;
        private int o;
        private String p;
        private ArrayList<Long> q;
        private long r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f2914e = str;
            this.f2915f = new LinkedList();
        }

        @Override // c.d.a.a.i.e.a.b.a
        public boolean b(String str) {
            return "c".equals(str);
        }

        @Override // c.d.a.a.i.e.a.b.a
        public void b(XmlPullParser xmlPullParser) throws x {
            if ("c".equals(xmlPullParser.getName())) {
                e(xmlPullParser);
            } else {
                f(xmlPullParser);
            }
        }

        private void e(XmlPullParser xmlPullParser) throws x {
            int size = this.q.size();
            long jA = a(xmlPullParser, "t", -9223372036854775807L);
            int i2 = 1;
            if (jA == -9223372036854775807L) {
                if (size == 0) {
                    jA = 0;
                } else if (this.r != -1) {
                    jA = this.q.get(size - 1).longValue() + this.r;
                } else {
                    throw new x("Unable to infer start time");
                }
            }
            this.q.add(Long.valueOf(jA));
            this.r = a(xmlPullParser, "d", -9223372036854775807L);
            long jA2 = a(xmlPullParser, "r", 1L);
            if (jA2 > 1 && this.r == -9223372036854775807L) {
                throw new x("Repeated chunk with unspecified duration");
            }
            while (true) {
                long j = i2;
                if (j >= jA2) {
                    return;
                }
                this.q.add(Long.valueOf((this.r * j) + jA));
                i2++;
            }
        }

        private void f(XmlPullParser xmlPullParser) {
            this.f2916g = g(xmlPullParser);
            a("Type", Integer.valueOf(this.f2916g));
            if (this.f2916g == 3) {
                this.f2917h = a(xmlPullParser, "Subtype");
            } else {
                this.f2917h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            this.j = xmlPullParser.getAttributeValue(null, "Name");
            this.k = a(xmlPullParser, "Url");
            this.l = a(xmlPullParser, "MaxWidth", -1);
            this.m = a(xmlPullParser, "MaxHeight", -1);
            this.n = a(xmlPullParser, "DisplayWidth", -1);
            this.o = a(xmlPullParser, "DisplayHeight", -1);
            this.p = xmlPullParser.getAttributeValue(null, "Language");
            a("Language", this.p);
            this.f2918i = a(xmlPullParser, "TimeScale", -1);
            if (this.f2918i == -1) {
                this.f2918i = ((Long) a("TimeScale")).longValue();
            }
            this.q = new ArrayList<>();
        }

        private int g(XmlPullParser xmlPullParser) throws x {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if ("audio".equalsIgnoreCase(attributeValue)) {
                    return 1;
                }
                if ("video".equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if ("text".equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                throw new x("Invalid key value[" + attributeValue + "]");
            }
            throw new C0033b("Type");
        }

        @Override // c.d.a.a.i.e.a.b.a
        public void a(Object obj) {
            if (obj instanceof q) {
                this.f2915f.add((q) obj);
            }
        }

        @Override // c.d.a.a.i.e.a.b.a
        public Object a() {
            q[] qVarArr = new q[this.f2915f.size()];
            this.f2915f.toArray(qVarArr);
            return new a.b(this.f2914e, this.k, this.f2916g, this.f2917h, this.f2918i, this.j, this.l, this.m, this.n, this.o, this.p, qVarArr, this.q, this.r);
        }
    }

    private static class d extends a {

        /* renamed from: e, reason: collision with root package name */
        private q f2908e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        @Override // c.d.a.a.i.e.a.b.a
        public void b(XmlPullParser xmlPullParser) throws x {
            int iIntValue = ((Integer) a("Type")).intValue();
            String attributeValue = xmlPullParser.getAttributeValue(null, "Index");
            String str = (String) a("Name");
            int iB = b(xmlPullParser, "Bitrate");
            String strD = d(a(xmlPullParser, "FourCC"));
            if (iIntValue == 2) {
                this.f2908e = q.a(attributeValue, str, "video/mp4", strD, (String) null, iB, b(xmlPullParser, "MaxWidth"), b(xmlPullParser, "MaxHeight"), -1.0f, c(xmlPullParser.getAttributeValue(null, "CodecPrivateData")), 0);
                return;
            }
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    this.f2908e = q.a(attributeValue, str, "application/mp4", strD, (String) null, iB, 0, (String) a("Language"));
                    return;
                } else {
                    this.f2908e = q.b(attributeValue, str, "application/mp4", strD, null, iB, 0, null);
                    return;
                }
            }
            if (strD == null) {
                strD = "audio/mp4a-latm";
            }
            int iB2 = b(xmlPullParser, "Channels");
            int iB3 = b(xmlPullParser, "SamplingRate");
            List<byte[]> listC = c(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            if (listC.isEmpty() && "audio/mp4a-latm".equals(strD)) {
                listC = Collections.singletonList(AbstractC0172g.a(iB3, iB2));
            }
            this.f2908e = q.a(attributeValue, str, "audio/mp4", strD, (String) null, iB, iB2, iB3, listC, 0, (String) a("Language"));
        }

        @Override // c.d.a.a.i.e.a.b.a
        public Object a() {
            return this.f2908e;
        }

        private static List<byte[]> c(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrI = H.i(str);
                byte[][] bArrB = AbstractC0172g.b(bArrI);
                if (bArrB == null) {
                    arrayList.add(bArrI);
                } else {
                    Collections.addAll(arrayList, bArrB);
                }
            }
            return arrayList;
        }

        private static String d(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }
    }
}
