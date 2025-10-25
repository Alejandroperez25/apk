package c.d.c.b.a.a;

import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f4132a = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4 A[Catch: IllegalArgumentException -> 0x01b1, NumberFormatException -> 0x01b3, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01b5, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01b5, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x004f, B:19:0x005f, B:20:0x0061, B:22:0x006d, B:23:0x006f, B:25:0x0075, B:29:0x007f, B:35:0x008f, B:37:0x0097, B:38:0x00aa, B:46:0x00be, B:48:0x00c4, B:50:0x00cb, B:74:0x0178, B:54:0x00d5, B:55:0x00f0, B:56:0x00f1, B:60:0x010d, B:62:0x011a, B:65:0x0123, B:67:0x0142, B:70:0x0151, B:71:0x0173, B:73:0x0176, B:59:0x00fc, B:76:0x01a9, B:77:0x01b0, B:40:0x00ae, B:41:0x00b1), top: B:93:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9 A[Catch: IllegalArgumentException -> 0x01b1, NumberFormatException -> 0x01b3, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01b5, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01b5, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x004f, B:19:0x005f, B:20:0x0061, B:22:0x006d, B:23:0x006f, B:25:0x0075, B:29:0x007f, B:35:0x008f, B:37:0x0097, B:38:0x00aa, B:46:0x00be, B:48:0x00c4, B:50:0x00cb, B:74:0x0178, B:54:0x00d5, B:55:0x00f0, B:56:0x00f1, B:60:0x010d, B:62:0x011a, B:65:0x0123, B:67:0x0142, B:70:0x0151, B:71:0x0173, B:73:0x0176, B:59:0x00fc, B:76:0x01a9, B:77:0x01b0, B:40:0x00ae, B:41:0x00b1), top: B:93:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date a(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.c.b.a.a.a.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static boolean a(String str, int i2, char c2) {
        return i2 < str.length() && str.charAt(i2) == c2;
    }

    private static int a(String str, int i2, int i3) {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i4 = i2 + 1;
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i5 = -iDigit;
        } else {
            i4 = i2;
            i5 = 0;
        }
        while (i4 < i3) {
            int i6 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i5 = (i5 * 10) - iDigit2;
            i4 = i6;
        }
        return -i5;
    }

    private static int a(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '0' || cCharAt > '9') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }
}
