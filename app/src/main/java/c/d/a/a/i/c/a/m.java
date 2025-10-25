package c.d.a.a.i.c.a;

import java.util.Locale;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f2648a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f2649b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f2650c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2651d;

    public static m a(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new m(strArr, iArr, strArr2, a(str, strArr, iArr, strArr2));
    }

    private m(String[] strArr, int[] iArr, String[] strArr2, int i2) {
        this.f2648a = strArr;
        this.f2649b = iArr;
        this.f2650c = strArr2;
        this.f2651d = i2;
    }

    public String a(String str, long j, int i2, long j2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < this.f2651d; i3++) {
            sb.append(this.f2648a[i3]);
            if (this.f2649b[i3] == 1) {
                sb.append(str);
            } else if (this.f2649b[i3] == 2) {
                sb.append(String.format(Locale.US, this.f2650c[i3], Long.valueOf(j)));
            } else if (this.f2649b[i3] == 3) {
                sb.append(String.format(Locale.US, this.f2650c[i3], Integer.valueOf(i2)));
            } else if (this.f2649b[i3] == 4) {
                sb.append(String.format(Locale.US, this.f2650c[i3], Long.valueOf(j2)));
            }
        }
        sb.append(this.f2648a[this.f2651d]);
        return sb.toString();
    }

    private static int a(String str, String[] strArr, int[] iArr, String[] strArr2) {
        strArr[0] = "";
        int length = 0;
        int i2 = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            char c2 = 65535;
            if (iIndexOf == -1) {
                strArr[i2] = strArr[i2] + str.substring(length);
                length = str.length();
            } else {
                if (iIndexOf != length) {
                    strArr[i2] = strArr[i2] + str.substring(length, iIndexOf);
                } else if (str.startsWith("$$", length)) {
                    strArr[i2] = strArr[i2] + "$";
                    length += 2;
                } else {
                    int i3 = length + 1;
                    int iIndexOf2 = str.indexOf("$", i3);
                    String strSubstring = str.substring(i3, iIndexOf2);
                    if (strSubstring.equals("RepresentationID")) {
                        iArr[i2] = 1;
                    } else {
                        int iIndexOf3 = strSubstring.indexOf("%0");
                        String strSubstring2 = "%01d";
                        if (iIndexOf3 != -1) {
                            strSubstring2 = strSubstring.substring(iIndexOf3);
                            if (!strSubstring2.endsWith("d")) {
                                strSubstring2 = strSubstring2 + "d";
                            }
                            strSubstring = strSubstring.substring(0, iIndexOf3);
                        }
                        int iHashCode = strSubstring.hashCode();
                        if (iHashCode != -1950496919) {
                            if (iHashCode != 2606829) {
                                if (iHashCode == 38199441 && strSubstring.equals("Bandwidth")) {
                                    c2 = 1;
                                }
                            } else if (strSubstring.equals("Time")) {
                                c2 = 2;
                            }
                        } else if (strSubstring.equals("Number")) {
                            c2 = 0;
                        }
                        switch (c2) {
                            case 0:
                                iArr[i2] = 2;
                                break;
                            case 1:
                                iArr[i2] = 3;
                                break;
                            case 2:
                                iArr[i2] = 4;
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid template: " + str);
                        }
                        strArr2[i2] = strSubstring2;
                    }
                    i2++;
                    strArr[i2] = "";
                    iIndexOf = iIndexOf2 + 1;
                }
                length = iIndexOf;
            }
        }
        return i2;
    }
}
