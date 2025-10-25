package c.d.c.b;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class B {
    public static DateFormat a(int i2, int i3) {
        return new SimpleDateFormat(a(i2) + " " + b(i3), Locale.US);
    }

    private static String a(int i2) {
        switch (i2) {
            case 0:
                return "EEEE, MMMM d, yyyy";
            case 1:
                return "MMMM d, yyyy";
            case 2:
                return "MMM d, yyyy";
            case 3:
                return "M/d/yy";
            default:
                throw new IllegalArgumentException("Unknown DateFormat style: " + i2);
        }
    }

    private static String b(int i2) {
        switch (i2) {
            case 0:
            case 1:
                return "h:mm:ss a z";
            case 2:
                return "h:mm:ss a";
            case 3:
                return "h:mm a";
            default:
                throw new IllegalArgumentException("Unknown DateFormat style: " + i2);
        }
    }
}
