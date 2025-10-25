package c.d.c.d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes.dex */
public class d implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f4291a = new String[128];

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f4292b;

    /* renamed from: c, reason: collision with root package name */
    private final Writer f4293c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f4294d = new int[32];

    /* renamed from: e, reason: collision with root package name */
    private int f4295e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f4296f;

    /* renamed from: g, reason: collision with root package name */
    private String f4297g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4298h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4299i;
    private String j;
    private boolean k;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f4291a[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        f4291a[34] = "\\\"";
        f4291a[92] = "\\\\";
        f4291a[9] = "\\t";
        f4291a[8] = "\\b";
        f4291a[10] = "\\n";
        f4291a[13] = "\\r";
        f4291a[12] = "\\f";
        f4292b = (String[]) f4291a.clone();
        f4292b[60] = "\\u003c";
        f4292b[62] = "\\u003e";
        f4292b[38] = "\\u0026";
        f4292b[61] = "\\u003d";
        f4292b[39] = "\\u0027";
    }

    public d(Writer writer) {
        a(6);
        this.f4297g = ":";
        this.k = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f4293c = writer;
    }

    public final void a(String str) {
        if (str.length() == 0) {
            this.f4296f = null;
            this.f4297g = ":";
        } else {
            this.f4296f = str;
            this.f4297g = ": ";
        }
    }

    public final void a(boolean z) {
        this.f4298h = z;
    }

    public boolean a() {
        return this.f4298h;
    }

    public final void b(boolean z) {
        this.f4299i = z;
    }

    public final boolean b() {
        return this.f4299i;
    }

    public final void c(boolean z) {
        this.k = z;
    }

    public final boolean c() {
        return this.k;
    }

    public d d() throws IOException {
        j();
        a(1, "[");
        return this;
    }

    public d e() throws IOException {
        a(1, 2, "]");
        return this;
    }

    public d f() throws IOException {
        j();
        a(3, "{");
        return this;
    }

    public d g() throws IOException {
        a(3, 5, "}");
        return this;
    }

    private d a(int i2, String str) throws IOException {
        m();
        a(i2);
        this.f4293c.write(str);
        return this;
    }

    private d a(int i2, int i3, String str) throws IOException {
        int i4 = i();
        if (i4 != i3 && i4 != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.j != null) {
            throw new IllegalStateException("Dangling name: " + this.j);
        }
        this.f4295e--;
        if (i4 == i3) {
            k();
        }
        this.f4293c.write(str);
        return this;
    }

    private void a(int i2) {
        if (this.f4295e == this.f4294d.length) {
            int[] iArr = new int[this.f4295e * 2];
            System.arraycopy(this.f4294d, 0, iArr, 0, this.f4295e);
            this.f4294d = iArr;
        }
        int[] iArr2 = this.f4294d;
        int i3 = this.f4295e;
        this.f4295e = i3 + 1;
        iArr2[i3] = i2;
    }

    private int i() {
        if (this.f4295e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.f4294d[this.f4295e - 1];
    }

    private void b(int i2) {
        this.f4294d[this.f4295e - 1] = i2;
    }

    public d b(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.j != null) {
            throw new IllegalStateException();
        }
        if (this.f4295e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.j = str;
        return this;
    }

    private void j() throws IOException {
        if (this.j != null) {
            l();
            d(this.j);
            this.j = null;
        }
    }

    public d c(String str) throws IOException {
        if (str == null) {
            return h();
        }
        j();
        m();
        d(str);
        return this;
    }

    public d h() throws IOException {
        if (this.j != null) {
            if (this.k) {
                j();
            } else {
                this.j = null;
                return this;
            }
        }
        m();
        this.f4293c.write("null");
        return this;
    }

    public d d(boolean z) throws IOException {
        j();
        m();
        this.f4293c.write(z ? "true" : "false");
        return this;
    }

    public d a(Boolean bool) throws IOException {
        if (bool == null) {
            return h();
        }
        j();
        m();
        this.f4293c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public d a(long j) throws IOException {
        j();
        m();
        this.f4293c.write(Long.toString(j));
        return this;
    }

    public d a(Number number) throws IOException {
        if (number == null) {
            return h();
        }
        j();
        String string = number.toString();
        if (!this.f4298h && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        m();
        this.f4293c.append((CharSequence) string);
        return this;
    }

    public void flush() throws IOException {
        if (this.f4295e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4293c.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4293c.close();
        int i2 = this.f4295e;
        if (i2 > 1 || (i2 == 1 && this.f4294d[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4295e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.f4299i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = c.d.c.d.d.f4292b
            goto L9
        L7:
            java.lang.String[] r0 = c.d.c.d.d.f4291a
        L9:
            java.io.Writer r1 = r7.f4293c
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r8.length()
            r2 = 0
            r3 = 0
        L16:
            if (r2 >= r1) goto L45
            char r4 = r8.charAt(r2)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 >= r5) goto L25
            r4 = r0[r4]
            if (r4 != 0) goto L32
            goto L42
        L25:
            r5 = 8232(0x2028, float:1.1535E-41)
            if (r4 != r5) goto L2c
            java.lang.String r4 = "\\u2028"
            goto L32
        L2c:
            r5 = 8233(0x2029, float:1.1537E-41)
            if (r4 != r5) goto L42
            java.lang.String r4 = "\\u2029"
        L32:
            if (r3 >= r2) goto L3b
            java.io.Writer r5 = r7.f4293c
            int r6 = r2 - r3
            r5.write(r8, r3, r6)
        L3b:
            java.io.Writer r3 = r7.f4293c
            r3.write(r4)
            int r3 = r2 + 1
        L42:
            int r2 = r2 + 1
            goto L16
        L45:
            if (r3 >= r1) goto L4d
            java.io.Writer r0 = r7.f4293c
            int r1 = r1 - r3
            r0.write(r8, r3, r1)
        L4d:
            java.io.Writer r8 = r7.f4293c
            java.lang.String r0 = "\""
            r8.write(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.c.d.d.d(java.lang.String):void");
    }

    private void k() throws IOException {
        if (this.f4296f == null) {
            return;
        }
        this.f4293c.write("\n");
        int i2 = this.f4295e;
        for (int i3 = 1; i3 < i2; i3++) {
            this.f4293c.write(this.f4296f);
        }
    }

    private void l() throws IOException {
        int i2 = i();
        if (i2 == 5) {
            this.f4293c.write(44);
        } else if (i2 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        k();
        b(4);
    }

    private void m() throws IOException {
        switch (i()) {
            case 1:
                b(2);
                k();
                return;
            case 2:
                this.f4293c.append(',');
                k();
                return;
            case 3:
            case 5:
            default:
                throw new IllegalStateException("Nesting problem.");
            case 4:
                this.f4293c.append((CharSequence) this.f4297g);
                b(5);
                return;
            case 6:
                break;
            case 7:
                if (!this.f4298h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                break;
        }
        b(7);
    }
}
