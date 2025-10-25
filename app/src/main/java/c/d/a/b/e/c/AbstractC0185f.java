package c.d.a.b.e.c;

/* renamed from: c.d.a.b.e.c.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0185f {
    protected AbstractC0185f() {
    }

    public abstract boolean b(char c2);

    public int a(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        AbstractC0195k.a(i2, length, "index");
        while (i2 < length) {
            if (b(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(char c2) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }
}
