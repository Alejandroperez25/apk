package com.google.firebase.auth.internal;

import com.google.firebase.auth.C0439u;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.firebase.auth.internal.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0419j {

    /* renamed from: a, reason: collision with root package name */
    private static final c.d.a.b.b.a.a f5372a = new c.d.a.b.b.a.a("GetTokenResultFactory", new String[0]);

    public static C0439u a(String str) {
        Map<String, Object> mapA;
        try {
            mapA = AbstractC0418i.a(str);
        } catch (c.d.a.b.e.c.L e2) {
            f5372a.a("Error parsing token claims", e2, new Object[0]);
            mapA = Collections.EMPTY_MAP;
        }
        return new C0439u(str, mapA);
    }
}
