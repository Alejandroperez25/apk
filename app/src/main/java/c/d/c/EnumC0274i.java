package c.d.c;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c.d.c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class EnumC0274i implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0274i f4300a = new C0268c("IDENTITY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0274i f4301b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0274i f4302c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0274i f4303d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0274i f4304e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0274i f4305f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC0274i[] f4306g;

    private EnumC0274i(String str, int i2) {
    }

    /* synthetic */ EnumC0274i(String str, int i2, C0268c c0268c) {
        this(str, i2);
    }

    public static EnumC0274i valueOf(String str) {
        return (EnumC0274i) Enum.valueOf(EnumC0274i.class, str);
    }

    public static EnumC0274i[] values() {
        return (EnumC0274i[]) f4306g.clone();
    }

    static {
        final String str = "UPPER_CAMEL_CASE";
        final int i2 = 1;
        f4301b = new EnumC0274i(str, i2) { // from class: c.d.c.d
            {
                C0268c c0268c = null;
            }

            @Override // c.d.c.j
            public String a(Field field) {
                return EnumC0274i.a(field.getName());
            }
        };
        final String str2 = "UPPER_CAMEL_CASE_WITH_SPACES";
        final int i3 = 2;
        f4302c = new EnumC0274i(str2, i3) { // from class: c.d.c.e
            {
                C0268c c0268c = null;
            }

            @Override // c.d.c.j
            public String a(Field field) {
                return EnumC0274i.a(EnumC0274i.a(field.getName(), " "));
            }
        };
        final String str3 = "LOWER_CASE_WITH_UNDERSCORES";
        final int i4 = 3;
        f4303d = new EnumC0274i(str3, i4) { // from class: c.d.c.f
            {
                C0268c c0268c = null;
            }

            @Override // c.d.c.j
            public String a(Field field) {
                return EnumC0274i.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        final String str4 = "LOWER_CASE_WITH_DASHES";
        final int i5 = 4;
        f4304e = new EnumC0274i(str4, i5) { // from class: c.d.c.g
            {
                C0268c c0268c = null;
            }

            @Override // c.d.c.j
            public String a(Field field) {
                return EnumC0274i.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        final String str5 = "LOWER_CASE_WITH_DOTS";
        final int i6 = 5;
        f4305f = new EnumC0274i(str5, i6) { // from class: c.d.c.h
            {
                C0268c c0268c = null;
            }

            @Override // c.d.c.j
            public String a(Field field) {
                return EnumC0274i.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f4306g = new EnumC0274i[]{f4300a, f4301b, f4302c, f4303d, f4304e, f4305f};
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static String a(String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        char cCharAt = str.charAt(0);
        int length = str.length();
        while (i2 < length - 1 && !Character.isLetter(cCharAt)) {
            sb.append(cCharAt);
            i2++;
            cCharAt = str.charAt(i2);
        }
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        sb.append(a(Character.toUpperCase(cCharAt), str, i2 + 1));
        return sb.toString();
    }

    private static String a(char c2, String str, int i2) {
        if (i2 < str.length()) {
            return c2 + str.substring(i2);
        }
        return String.valueOf(c2);
    }
}
