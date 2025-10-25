package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected final Status f4855a;

    public b(Status status) {
        int iQ = status.q();
        String strO = status.o() != null ? status.o() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(strO).length() + 13);
        sb.append(iQ);
        sb.append(": ");
        sb.append(strO);
        super(sb.toString());
        this.f4855a = status;
    }
}
