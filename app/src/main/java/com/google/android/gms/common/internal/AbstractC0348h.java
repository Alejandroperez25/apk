package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC0343c;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0348h<T extends IInterface> extends AbstractC0343c<T> implements a.f, i$a {
    private final C0344d D;
    private final Set<Scope> E;
    private final Account F;

    protected Set<Scope> a(Set<Scope> set) {
        return set;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected AbstractC0348h(Context context, Looper looper, int i2, C0344d c0344d, e.a aVar, e.b bVar) {
        AbstractC0349j abstractC0349jA = AbstractC0349j.a(context);
        c.d.a.b.b.d dVarB = c.d.a.b.b.d.b();
        t.a(aVar);
        t.a(bVar);
        this(context, looper, abstractC0349jA, dVarB, i2, c0344d, aVar, bVar);
    }

    protected AbstractC0348h(Context context, Looper looper, AbstractC0349j abstractC0349j, c.d.a.b.b.d dVar, int i2, C0344d c0344d, e.a aVar, e.b bVar) {
        super(context, looper, abstractC0349j, dVar, i2, a(aVar), a(bVar), c0344d.f());
        this.D = c0344d;
        this.F = c0344d.a();
        Set<Scope> setD = c0344d.d();
        b(setD);
        this.E = setD;
    }

    private final Set<Scope> b(Set<Scope> set) {
        a(set);
        Iterator<Scope> it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c
    public final Account n() {
        return this.F;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c
    protected final Set<Scope> v() {
        return this.E;
    }

    private static AbstractC0343c.a a(e.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new z(aVar);
    }

    private static AbstractC0343c.b a(e.b bVar) {
        if (bVar == null) {
            return null;
        }
        return new A(bVar);
    }
}
