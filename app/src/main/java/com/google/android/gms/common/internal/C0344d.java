package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344d {

    /* renamed from: a, reason: collision with root package name */
    private final Account f5020a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Scope> f5021b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Scope> f5022c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<com.google.android.gms.common.api.a<?>, b> f5023d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5024e;

    /* renamed from: f, reason: collision with root package name */
    private final View f5025f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5026g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5027h;

    /* renamed from: i, reason: collision with root package name */
    private final c.d.a.b.f.a f5028i;
    private final boolean j;
    private Integer k;

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public static final class b {
    }

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f5029a;

        /* renamed from: b, reason: collision with root package name */
        private b.c.d<Scope> f5030b;

        /* renamed from: c, reason: collision with root package name */
        private Map<com.google.android.gms.common.api.a<?>, b> f5031c;

        /* renamed from: e, reason: collision with root package name */
        private View f5033e;

        /* renamed from: f, reason: collision with root package name */
        private String f5034f;

        /* renamed from: g, reason: collision with root package name */
        private String f5035g;

        /* renamed from: i, reason: collision with root package name */
        private boolean f5037i;

        /* renamed from: d, reason: collision with root package name */
        private int f5032d = 0;

        /* renamed from: h, reason: collision with root package name */
        private c.d.a.b.f.a f5036h = c.d.a.b.f.a.f3977a;

        public final a a(Account account) {
            this.f5029a = account;
            return this;
        }

        public final a a(Collection<Scope> collection) {
            if (this.f5030b == null) {
                this.f5030b = new b.c.d<>();
            }
            this.f5030b.addAll(collection);
            return this;
        }

        public final a a(String str) {
            this.f5034f = str;
            return this;
        }

        public final a b(String str) {
            this.f5035g = str;
            return this;
        }

        public final C0344d a() {
            return new C0344d(this.f5029a, this.f5030b, this.f5031c, this.f5032d, this.f5033e, this.f5034f, this.f5035g, this.f5036h, this.f5037i);
        }
    }

    public C0344d(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i2, View view, String str, String str2, c.d.a.b.f.a aVar, boolean z) {
        this.f5020a = account;
        this.f5021b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f5023d = map == null ? Collections.EMPTY_MAP : map;
        this.f5025f = view;
        this.f5024e = i2;
        this.f5026g = str;
        this.f5027h = str2;
        this.f5028i = aVar;
        this.j = z;
        HashSet hashSet = new HashSet(this.f5021b);
        Iterator<b> it = this.f5023d.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().mScopes);
        }
        this.f5022c = Collections.unmodifiableSet(hashSet);
    }

    public final Account a() {
        return this.f5020a;
    }

    public final Account b() {
        if (this.f5020a != null) {
            return this.f5020a;
        }
        return new Account("<<default account>>", "com.google");
    }

    public final Set<Scope> c() {
        return this.f5021b;
    }

    public final Set<Scope> d() {
        return this.f5022c;
    }

    public final String e() {
        return this.f5026g;
    }

    public final String f() {
        return this.f5027h;
    }

    public final c.d.a.b.f.a g() {
        return this.f5028i;
    }

    public final Integer h() {
        return this.k;
    }

    public final void a(Integer num) {
        this.k = num;
    }
}
