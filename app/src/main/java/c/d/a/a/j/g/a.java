package c.d.a.a.j.g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c.d.a.a.j.d;
import c.d.a.a.j.f;
import c.d.a.a.m.H;
import c.d.a.a.m.u;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends c.d.a.a.j.b {
    private static final int o = H.h("styl");
    private static final int p = H.h("tbox");
    private final u q;
    private boolean r;
    private int s;
    private int t;
    private String u;
    private float v;
    private int w;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.q = new u();
        a(list);
    }

    private void a(List<byte[]> list) {
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.s = bArr[24];
            this.t = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.u = "Serif".equals(H.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            this.w = bArr[25] * 20;
            this.r = (bArr[0] & 32) != 0;
            if (this.r) {
                this.v = ((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / this.w;
                this.v = H.a(this.v, 0.0f, 0.95f);
                return;
            } else {
                this.v = 0.85f;
                return;
            }
        }
        this.s = 0;
        this.t = -1;
        this.u = "sans-serif";
        this.r = false;
        this.v = 0.85f;
    }

    @Override // c.d.a.a.j.b
    protected d a(byte[] bArr, int i2, boolean z) throws f {
        this.q.a(bArr, i2);
        String strA = a(this.q);
        if (strA.isEmpty()) {
            return b.f3231a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
        a(spannableStringBuilder, this.s, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder, this.t, -1, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.u, "sans-serif", 0, spannableStringBuilder.length(), 16711680);
        float fA = this.v;
        while (this.q.b() >= 8) {
            int iD = this.q.d();
            int iP = this.q.p();
            int iP2 = this.q.p();
            if (iP2 == o) {
                a(this.q.b() >= 2);
                int i3 = this.q.i();
                for (int i4 = 0; i4 < i3; i4++) {
                    a(this.q, spannableStringBuilder);
                }
            } else if (iP2 == p && this.r) {
                a(this.q.b() >= 2);
                fA = H.a(this.q.i() / this.w, 0.0f, 0.95f);
            }
            this.q.c(iD + iP);
        }
        return new b(new c.d.a.a.j.a(spannableStringBuilder, null, fA, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }

    private static String a(u uVar) throws f {
        char cG;
        a(uVar.b() >= 2);
        int i2 = uVar.i();
        if (i2 == 0) {
            return "";
        }
        if (uVar.b() >= 2 && ((cG = uVar.g()) == 65279 || cG == 65534)) {
            return uVar.a(i2, Charset.forName("UTF-16"));
        }
        return uVar.a(i2, Charset.forName("UTF-8"));
    }

    private void a(u uVar, SpannableStringBuilder spannableStringBuilder) throws f {
        a(uVar.b() >= 12);
        int i2 = uVar.i();
        int i3 = uVar.i();
        uVar.d(2);
        int iH = uVar.h();
        uVar.d(1);
        int iP = uVar.p();
        a(spannableStringBuilder, iH, this.s, i2, i3, 0);
        b(spannableStringBuilder, iP, this.t, i2, i3, 0);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            boolean z = (i2 & 1) != 0;
            boolean z2 = (i2 & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
            }
            boolean z3 = (i2 & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
        }
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i2, int i3, int i4) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i2, i3, i4 | 33);
        }
    }

    private static void a(boolean z) throws f {
        if (!z) {
            throw new f("Unexpected subtitle format.");
        }
    }
}
