package c.d.a.a.j.f;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

/* loaded from: classes.dex */
abstract class d {
    public static e a(e eVar, String[] strArr, Map<String, e> map) {
        if (eVar == null && strArr == null) {
            return null;
        }
        int i2 = 0;
        if (eVar == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (eVar == null && strArr.length > 1) {
            e eVar2 = new e();
            int length = strArr.length;
            while (i2 < length) {
                eVar2.a(map.get(strArr[i2]));
                i2++;
            }
            return eVar2;
        }
        if (eVar != null && strArr != null && strArr.length == 1) {
            eVar.a(map.get(strArr[0]));
            return eVar;
        }
        if (eVar == null || strArr == null || strArr.length <= 1) {
            return eVar;
        }
        int length2 = strArr.length;
        while (i2 < length2) {
            eVar.a(map.get(strArr[i2]));
            i2++;
        }
        return eVar;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i2, int i3, e eVar) {
        if (eVar.a() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(eVar.a()), i2, i3, 33);
        }
        if (eVar.b()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (eVar.c()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (eVar.f()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(eVar.e()), i2, i3, 33);
        }
        if (eVar.h()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(eVar.g()), i2, i3, 33);
        }
        if (eVar.d() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(eVar.d()), i2, i3, 33);
        }
        if (eVar.j() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(eVar.j()), i2, i3, 33);
        }
        switch (eVar.k()) {
            case 1:
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) eVar.l(), true), i2, i3, 33);
                break;
            case 2:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(eVar.l()), i2, i3, 33);
                break;
            case 3:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(eVar.l() / 100.0f), i2, i3, 33);
                break;
        }
    }

    static void a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    static String a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }
}
