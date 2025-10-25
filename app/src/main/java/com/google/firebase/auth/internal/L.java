package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class L {
    public static Status a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && strArrSplit[1] != null) {
            strArrSplit[1] = strArrSplit[1].trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        return listAsList.size() > 1 ? a((String) listAsList.get(0), (String) listAsList.get(1)) : a((String) listAsList.get(0), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.common.api.Status a(java.lang.String r4, java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.L.a(java.lang.String, java.lang.String):com.google.android.gms.common.api.Status");
    }
}
