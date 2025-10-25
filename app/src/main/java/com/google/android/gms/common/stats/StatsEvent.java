package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public abstract class StatsEvent extends com.google.android.gms.common.internal.a.a implements ReflectedParcelable {
    public abstract long o();

    public abstract int p();

    public abstract long q();

    public abstract String r();

    public String toString() {
        long jO = o();
        int iP = p();
        long jQ = q();
        String strR = r();
        StringBuilder sb = new StringBuilder(String.valueOf(strR).length() + 53);
        sb.append(jO);
        sb.append("\t");
        sb.append(iP);
        sb.append("\t");
        sb.append(jQ);
        sb.append(strR);
        return sb.toString();
    }
}
