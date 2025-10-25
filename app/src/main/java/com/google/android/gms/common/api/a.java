package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC0343c;
import com.google.android.gms.common.internal.C0344d;
import com.google.android.gms.common.internal.InterfaceC0352m;
import com.google.android.gms.common.internal.t;
import java.util.Set;

/* loaded from: classes.dex */
public final class a<O extends d> {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0058a<?, O> f4850a;

    /* renamed from: b, reason: collision with root package name */
    private final i<?, O> f4851b;

    /* renamed from: c, reason: collision with root package name */
    private final g<?> f4852c;

    /* renamed from: d, reason: collision with root package name */
    private final j<?> f4853d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4854e;

    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0058a<T extends f, O> extends e<T, O> {
        public abstract T a(Context context, Looper looper, C0344d c0344d, O o, e.a aVar, e.b bVar);
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0059a extends c, InterfaceC0060d {
            Account a();
        }

        public interface b extends c {
            GoogleSignInAccount b();
        }

        public interface c extends d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d, reason: collision with other inner class name */
        public interface InterfaceC0060d extends d {
        }

        public interface e extends c, InterfaceC0060d {
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void a(AbstractC0343c.InterfaceC0063c interfaceC0063c);

        void a(AbstractC0343c.e eVar);

        void a(InterfaceC0352m interfaceC0352m, Set<Scope> set);

        boolean a();

        String b();

        void c();

        boolean d();

        int e();

        c.d.a.b.b.c[] f();

        boolean g();

        boolean isConnected();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public interface h<T extends IInterface> extends b {
    }

    public static abstract class i<T extends h, O> extends e<T, O> {
    }

    public static final class j<C extends h> extends c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0058a<C, O> abstractC0058a, g<C> gVar) {
        t.a(abstractC0058a, "Cannot construct an Api with a null ClientBuilder");
        t.a(gVar, "Cannot construct an Api with a null ClientKey");
        this.f4854e = str;
        this.f4850a = abstractC0058a;
        this.f4851b = null;
        this.f4852c = gVar;
        this.f4853d = null;
    }

    public final AbstractC0058a<?, O> a() {
        t.a(this.f4850a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f4850a;
    }

    public final String b() {
        return this.f4854e;
    }
}
