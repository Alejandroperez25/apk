package com.google.firebase.auth;

import java.util.Map;

/* renamed from: com.google.firebase.auth.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0439u {

    /* renamed from: a, reason: collision with root package name */
    private String f5401a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f5402b;

    public C0439u(String str, Map<String, Object> map) {
        this.f5401a = str;
        this.f5402b = map;
    }

    public String a() {
        return this.f5401a;
    }

    public long b() {
        return a("exp");
    }

    public long c() {
        return a("auth_time");
    }

    public long d() {
        return a("iat");
    }

    public String e() {
        Map map = (Map) this.f5402b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    public Map<String, Object> f() {
        return this.f5402b;
    }

    private final long a(String str) {
        Integer num = (Integer) this.f5402b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }
}
