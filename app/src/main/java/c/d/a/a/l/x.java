package c.d.a.a.l;

import android.text.TextUtils;
import c.d.a.a.m.H;

/* compiled from: HttpDataSource.java */
/* loaded from: classes.dex */
public abstract /* synthetic */ class x {
    public static /* synthetic */ boolean a(String str) {
        String strD = H.d(str);
        return (TextUtils.isEmpty(strD) || (strD.contains("text") && !strD.contains("text/vtt")) || strD.contains("html") || strD.contains("xml")) ? false : true;
    }
}
