package b.d.e;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import b.d.f.c;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class a implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f1103a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static Executor f1104b = null;

    public abstract C0015a a();

    /* renamed from: b.d.e.a$a, reason: collision with other inner class name */
    public static final class C0015a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f1105a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f1106b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1107c;

        /* renamed from: d, reason: collision with root package name */
        private final int f1108d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f1109e = null;

        /* renamed from: b.d.e.a$a$a, reason: collision with other inner class name */
        public static class C0016a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f1110a;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f1111b;

            /* renamed from: c, reason: collision with root package name */
            private int f1112c;

            /* renamed from: d, reason: collision with root package name */
            private int f1113d;

            public C0016a(TextPaint textPaint) {
                this.f1110a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f1112c = 1;
                    this.f1113d = 1;
                } else {
                    this.f1113d = 0;
                    this.f1112c = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f1111b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f1111b = null;
                }
            }

            public C0016a a(int i2) {
                this.f1112c = i2;
                return this;
            }

            public C0016a b(int i2) {
                this.f1113d = i2;
                return this;
            }

            public C0016a a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f1111b = textDirectionHeuristic;
                return this;
            }

            public C0015a a() {
                return new C0015a(this.f1110a, this.f1111b, this.f1112c, this.f1113d);
            }
        }

        C0015a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            this.f1105a = textPaint;
            this.f1106b = textDirectionHeuristic;
            this.f1107c = i2;
            this.f1108d = i3;
        }

        public C0015a(PrecomputedText.Params params) {
            this.f1105a = params.getTextPaint();
            this.f1106b = params.getTextDirection();
            this.f1107c = params.getBreakStrategy();
            this.f1108d = params.getHyphenationFrequency();
        }

        public TextPaint a() {
            return this.f1105a;
        }

        public TextDirectionHeuristic b() {
            return this.f1106b;
        }

        public int c() {
            return this.f1107c;
        }

        public int d() {
            return this.f1108d;
        }

        public boolean a(C0015a c0015a) {
            if (this.f1109e != null) {
                return this.f1109e.equals(c0015a.f1109e);
            }
            if ((Build.VERSION.SDK_INT >= 23 && (this.f1107c != c0015a.c() || this.f1108d != c0015a.d())) || this.f1105a.getTextSize() != c0015a.a().getTextSize() || this.f1105a.getTextScaleX() != c0015a.a().getTextScaleX() || this.f1105a.getTextSkewX() != c0015a.a().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f1105a.getLetterSpacing() != c0015a.a().getLetterSpacing() || !TextUtils.equals(this.f1105a.getFontFeatureSettings(), c0015a.a().getFontFeatureSettings()))) || this.f1105a.getFlags() != c0015a.a().getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (!this.f1105a.getTextLocales().equals(c0015a.a().getTextLocales())) {
                    return false;
                }
            } else if (Build.VERSION.SDK_INT >= 17 && !this.f1105a.getTextLocale().equals(c0015a.a().getTextLocale())) {
                return false;
            }
            return this.f1105a.getTypeface() == null ? c0015a.a().getTypeface() == null : this.f1105a.getTypeface().equals(c0015a.a().getTypeface());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0015a)) {
                return false;
            }
            C0015a c0015a = (C0015a) obj;
            if (a(c0015a)) {
                return Build.VERSION.SDK_INT < 18 || this.f1106b == c0015a.b();
            }
            return false;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return c.a(Float.valueOf(this.f1105a.getTextSize()), Float.valueOf(this.f1105a.getTextScaleX()), Float.valueOf(this.f1105a.getTextSkewX()), Float.valueOf(this.f1105a.getLetterSpacing()), Integer.valueOf(this.f1105a.getFlags()), this.f1105a.getTextLocales(), this.f1105a.getTypeface(), Boolean.valueOf(this.f1105a.isElegantTextHeight()), this.f1106b, Integer.valueOf(this.f1107c), Integer.valueOf(this.f1108d));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                return c.a(Float.valueOf(this.f1105a.getTextSize()), Float.valueOf(this.f1105a.getTextScaleX()), Float.valueOf(this.f1105a.getTextSkewX()), Float.valueOf(this.f1105a.getLetterSpacing()), Integer.valueOf(this.f1105a.getFlags()), this.f1105a.getTextLocale(), this.f1105a.getTypeface(), Boolean.valueOf(this.f1105a.isElegantTextHeight()), this.f1106b, Integer.valueOf(this.f1107c), Integer.valueOf(this.f1108d));
            }
            if (Build.VERSION.SDK_INT >= 18) {
                return c.a(Float.valueOf(this.f1105a.getTextSize()), Float.valueOf(this.f1105a.getTextScaleX()), Float.valueOf(this.f1105a.getTextSkewX()), Integer.valueOf(this.f1105a.getFlags()), this.f1105a.getTextLocale(), this.f1105a.getTypeface(), this.f1106b, Integer.valueOf(this.f1107c), Integer.valueOf(this.f1108d));
            }
            if (Build.VERSION.SDK_INT >= 17) {
                return c.a(Float.valueOf(this.f1105a.getTextSize()), Float.valueOf(this.f1105a.getTextScaleX()), Float.valueOf(this.f1105a.getTextSkewX()), Integer.valueOf(this.f1105a.getFlags()), this.f1105a.getTextLocale(), this.f1105a.getTypeface(), this.f1106b, Integer.valueOf(this.f1107c), Integer.valueOf(this.f1108d));
            }
            return c.a(Float.valueOf(this.f1105a.getTextSize()), Float.valueOf(this.f1105a.getTextScaleX()), Float.valueOf(this.f1105a.getTextSkewX()), Integer.valueOf(this.f1105a.getFlags()), this.f1105a.getTypeface(), this.f1106b, Integer.valueOf(this.f1107c), Integer.valueOf(this.f1108d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f1105a.getTextSize());
            sb.append(", textScaleX=" + this.f1105a.getTextScaleX());
            sb.append(", textSkewX=" + this.f1105a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.f1105a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f1105a.isElegantTextHeight());
            }
            if (Build.VERSION.SDK_INT >= 24) {
                sb.append(", textLocale=" + this.f1105a.getTextLocales());
            } else if (Build.VERSION.SDK_INT >= 17) {
                sb.append(", textLocale=" + this.f1105a.getTextLocale());
            }
            sb.append(", typeface=" + this.f1105a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f1105a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f1106b);
            sb.append(", breakStrategy=" + this.f1107c);
            sb.append(", hyphenationFrequency=" + this.f1108d);
            sb.append("}");
            return sb.toString();
        }
    }
}
