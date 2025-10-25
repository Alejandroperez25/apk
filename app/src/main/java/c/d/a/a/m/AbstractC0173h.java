package c.d.a.a.m;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: c.d.a.a.m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0173h {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f3517a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f3518b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f3519c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f3520d = new HashMap();

    private static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    static {
        f3520d.put("aliceblue", -984833);
        f3520d.put("antiquewhite", -332841);
        f3520d.put("aqua", -16711681);
        f3520d.put("aquamarine", -8388652);
        f3520d.put("azure", -983041);
        f3520d.put("beige", -657956);
        f3520d.put("bisque", -6972);
        f3520d.put("black", -16777216);
        f3520d.put("blanchedalmond", -5171);
        f3520d.put("blue", -16776961);
        f3520d.put("blueviolet", -7722014);
        f3520d.put("brown", -5952982);
        f3520d.put("burlywood", -2180985);
        f3520d.put("cadetblue", -10510688);
        f3520d.put("chartreuse", -8388864);
        f3520d.put("chocolate", -2987746);
        f3520d.put("coral", -32944);
        f3520d.put("cornflowerblue", -10185235);
        f3520d.put("cornsilk", -1828);
        f3520d.put("crimson", -2354116);
        f3520d.put("cyan", -16711681);
        f3520d.put("darkblue", -16777077);
        f3520d.put("darkcyan", -16741493);
        f3520d.put("darkgoldenrod", -4684277);
        f3520d.put("darkgray", -5658199);
        f3520d.put("darkgreen", -16751616);
        f3520d.put("darkgrey", -5658199);
        f3520d.put("darkkhaki", -4343957);
        f3520d.put("darkmagenta", -7667573);
        f3520d.put("darkolivegreen", -11179217);
        f3520d.put("darkorange", -29696);
        f3520d.put("darkorchid", -6737204);
        f3520d.put("darkred", -7667712);
        f3520d.put("darksalmon", -1468806);
        f3520d.put("darkseagreen", -7357297);
        f3520d.put("darkslateblue", -12042869);
        f3520d.put("darkslategray", -13676721);
        f3520d.put("darkslategrey", -13676721);
        f3520d.put("darkturquoise", -16724271);
        f3520d.put("darkviolet", -7077677);
        f3520d.put("deeppink", -60269);
        f3520d.put("deepskyblue", -16728065);
        f3520d.put("dimgray", -9868951);
        f3520d.put("dimgrey", -9868951);
        f3520d.put("dodgerblue", -14774017);
        f3520d.put("firebrick", -5103070);
        f3520d.put("floralwhite", -1296);
        f3520d.put("forestgreen", -14513374);
        f3520d.put("fuchsia", -65281);
        f3520d.put("gainsboro", -2302756);
        f3520d.put("ghostwhite", -460545);
        f3520d.put("gold", -10496);
        f3520d.put("goldenrod", -2448096);
        f3520d.put("gray", -8355712);
        f3520d.put("green", -16744448);
        f3520d.put("greenyellow", -5374161);
        f3520d.put("grey", -8355712);
        f3520d.put("honeydew", -983056);
        f3520d.put("hotpink", -38476);
        f3520d.put("indianred", -3318692);
        f3520d.put("indigo", -11861886);
        f3520d.put("ivory", -16);
        f3520d.put("khaki", -989556);
        f3520d.put("lavender", -1644806);
        f3520d.put("lavenderblush", -3851);
        f3520d.put("lawngreen", -8586240);
        f3520d.put("lemonchiffon", -1331);
        f3520d.put("lightblue", -5383962);
        f3520d.put("lightcoral", -1015680);
        f3520d.put("lightcyan", -2031617);
        f3520d.put("lightgoldenrodyellow", -329006);
        f3520d.put("lightgray", -2894893);
        f3520d.put("lightgreen", -7278960);
        f3520d.put("lightgrey", -2894893);
        f3520d.put("lightpink", -18751);
        f3520d.put("lightsalmon", -24454);
        f3520d.put("lightseagreen", -14634326);
        f3520d.put("lightskyblue", -7876870);
        f3520d.put("lightslategray", -8943463);
        f3520d.put("lightslategrey", -8943463);
        f3520d.put("lightsteelblue", -5192482);
        f3520d.put("lightyellow", -32);
        f3520d.put("lime", -16711936);
        f3520d.put("limegreen", -13447886);
        f3520d.put("linen", -331546);
        f3520d.put("magenta", -65281);
        f3520d.put("maroon", -8388608);
        f3520d.put("mediumaquamarine", -10039894);
        f3520d.put("mediumblue", -16777011);
        f3520d.put("mediumorchid", -4565549);
        f3520d.put("mediumpurple", -7114533);
        f3520d.put("mediumseagreen", -12799119);
        f3520d.put("mediumslateblue", -8689426);
        f3520d.put("mediumspringgreen", -16713062);
        f3520d.put("mediumturquoise", -12004916);
        f3520d.put("mediumvioletred", -3730043);
        f3520d.put("midnightblue", -15132304);
        f3520d.put("mintcream", -655366);
        f3520d.put("mistyrose", -6943);
        f3520d.put("moccasin", -6987);
        f3520d.put("navajowhite", -8531);
        f3520d.put("navy", -16777088);
        f3520d.put("oldlace", -133658);
        f3520d.put("olive", -8355840);
        f3520d.put("olivedrab", -9728477);
        f3520d.put("orange", -23296);
        f3520d.put("orangered", -47872);
        f3520d.put("orchid", -2461482);
        f3520d.put("palegoldenrod", -1120086);
        f3520d.put("palegreen", -6751336);
        f3520d.put("paleturquoise", -5247250);
        f3520d.put("palevioletred", -2396013);
        f3520d.put("papayawhip", -4139);
        f3520d.put("peachpuff", -9543);
        f3520d.put("peru", -3308225);
        f3520d.put("pink", -16181);
        f3520d.put("plum", -2252579);
        f3520d.put("powderblue", -5185306);
        f3520d.put("purple", -8388480);
        f3520d.put("rebeccapurple", -10079335);
        f3520d.put("red", -65536);
        f3520d.put("rosybrown", -4419697);
        f3520d.put("royalblue", -12490271);
        f3520d.put("saddlebrown", -7650029);
        f3520d.put("salmon", -360334);
        f3520d.put("sandybrown", -744352);
        f3520d.put("seagreen", -13726889);
        f3520d.put("seashell", -2578);
        f3520d.put("sienna", -6270419);
        f3520d.put("silver", -4144960);
        f3520d.put("skyblue", -7876885);
        f3520d.put("slateblue", -9807155);
        f3520d.put("slategray", -9404272);
        f3520d.put("slategrey", -9404272);
        f3520d.put("snow", -1286);
        f3520d.put("springgreen", -16711809);
        f3520d.put("steelblue", -12156236);
        f3520d.put("tan", -2968436);
        f3520d.put("teal", -16744320);
        f3520d.put("thistle", -2572328);
        f3520d.put("tomato", -40121);
        f3520d.put("transparent", 0);
        f3520d.put("turquoise", -12525360);
        f3520d.put("violet", -1146130);
        f3520d.put("wheat", -663885);
        f3520d.put("white", -1);
        f3520d.put("whitesmoke", -657931);
        f3520d.put("yellow", -256);
        f3520d.put("yellowgreen", -6632142);
    }

    public static int a(String str) {
        return a(str, false);
    }

    public static int b(String str) {
        return a(str, true);
    }

    private static int a(String str, boolean z) throws NumberFormatException {
        int i2;
        AbstractC0170e.a(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i3 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i3;
            }
            if (strReplace.length() == 9) {
                return ((i3 & 255) << 24) | (i3 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? f3519c : f3518b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    i2 = (int) (Float.parseFloat(matcher.group(4)) * 255.0f);
                } else {
                    i2 = Integer.parseInt(matcher.group(4), 10);
                }
                return a(i2, Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f3517a.matcher(strReplace);
            if (matcher2.matches()) {
                return a(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = f3520d.get(H.d(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    private static int a(int i2, int i3, int i4) {
        return a(255, i2, i3, i4);
    }
}
