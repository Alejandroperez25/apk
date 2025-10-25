package com.google.firebase.components;

import java.util.Set;

/* loaded from: classes.dex */
final /* synthetic */ class l implements c.d.b.c.a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f5424a;

    private l(Set set) {
        this.f5424a = set;
    }

    public static c.d.b.c.a a(Set set) {
        return new l(set);
    }

    @Override // c.d.b.c.a
    public Object get() {
        return n.a(this.f5424a);
    }
}
