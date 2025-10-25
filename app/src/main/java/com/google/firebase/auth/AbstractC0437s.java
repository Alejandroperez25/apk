package com.google.firebase.auth;

import c.d.a.b.e.c.Oa;
import java.util.List;

/* renamed from: com.google.firebase.auth.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0437s extends com.google.android.gms.common.internal.a.a implements G {
    public abstract InterfaceC0438t A();

    public abstract ha B();

    public abstract AbstractC0437s a(List<? extends G> list);

    public abstract void a(Oa oa);

    public abstract void b(List<ja> list);

    public abstract String i();

    public abstract boolean o();

    public abstract List<String> p();

    public abstract List<? extends G> q();

    public abstract AbstractC0437s r();

    public abstract c.d.b.e s();

    public abstract String t();

    public abstract Oa x();

    public abstract String y();

    public abstract String z();

    public c.d.a.b.h.h<C0439u> a(boolean z) {
        return FirebaseAuth.getInstance(s()).a(this, z);
    }

    public c.d.a.b.h.h<Void> u() {
        return FirebaseAuth.getInstance(s()).a(this);
    }

    public c.d.a.b.h.h<Void> a(AbstractC0403c abstractC0403c) {
        com.google.android.gms.common.internal.t.a(abstractC0403c);
        return FirebaseAuth.getInstance(s()).a(this, abstractC0403c);
    }

    public c.d.a.b.h.h<InterfaceC0404d> b(AbstractC0403c abstractC0403c) {
        com.google.android.gms.common.internal.t.a(abstractC0403c);
        return FirebaseAuth.getInstance(s()).b(this, abstractC0403c);
    }

    public c.d.a.b.h.h<InterfaceC0404d> c(AbstractC0403c abstractC0403c) {
        com.google.android.gms.common.internal.t.a(abstractC0403c);
        return FirebaseAuth.getInstance(s()).c(this, abstractC0403c);
    }

    public c.d.a.b.h.h<InterfaceC0404d> a(String str) {
        com.google.android.gms.common.internal.t.a(str);
        return FirebaseAuth.getInstance(s()).a(this, str);
    }

    public c.d.a.b.h.h<Void> a(H h2) {
        com.google.android.gms.common.internal.t.a(h2);
        return FirebaseAuth.getInstance(s()).a(this, h2);
    }

    public c.d.a.b.h.h<Void> b(String str) {
        com.google.android.gms.common.internal.t.a(str);
        return FirebaseAuth.getInstance(s()).b(this, str);
    }

    public c.d.a.b.h.h<Void> a(A a2) {
        return FirebaseAuth.getInstance(s()).a(this, a2);
    }

    public c.d.a.b.h.h<Void> c(String str) {
        com.google.android.gms.common.internal.t.a(str);
        return FirebaseAuth.getInstance(s()).c(this, str);
    }

    public c.d.a.b.h.h<Void> v() {
        return FirebaseAuth.getInstance(s()).b(this);
    }

    public c.d.a.b.h.h<Void> w() {
        return FirebaseAuth.getInstance(s()).a(this, false).a(new da(this));
    }
}
