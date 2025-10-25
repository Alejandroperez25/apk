package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC0349j;
import com.google.android.gms.common.internal.o;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0343c<T extends IInterface> {

    /* renamed from: a, reason: collision with root package name */
    private static final c.d.a.b.b.c[] f4996a = new c.d.a.b.b.c[0];

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f4997b = {"service_esmobile", "service_googleme"};

    /* renamed from: c, reason: collision with root package name */
    private int f4998c;

    /* renamed from: d, reason: collision with root package name */
    private long f4999d;

    /* renamed from: e, reason: collision with root package name */
    private long f5000e;

    /* renamed from: f, reason: collision with root package name */
    private int f5001f;

    /* renamed from: g, reason: collision with root package name */
    private long f5002g;

    /* renamed from: h, reason: collision with root package name */
    private J f5003h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f5004i;
    private final Looper j;
    private final AbstractC0349j k;
    private final c.d.a.b.b.e l;
    final Handler m;
    private q p;
    protected InterfaceC0063c q;
    private T r;
    private j t;
    private final a v;
    private final b w;
    private final int x;
    private final String y;
    private final Object n = new Object();
    private final Object o = new Object();
    private final ArrayList<h<?>> s = new ArrayList<>();
    private int u = 1;
    private c.d.a.b.b.a z = null;
    private boolean A = false;
    private volatile D B = null;
    protected AtomicInteger C = new AtomicInteger(0);

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface a {
        void a(int i2);

        void a(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface b {
        void a(c.d.a.b.b.a aVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c, reason: collision with other inner class name */
    public interface InterfaceC0063c {
        void a(c.d.a.b.b.a aVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    protected class d implements InterfaceC0063c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC0343c.InterfaceC0063c
        public void a(c.d.a.b.b.a aVar) {
            if (aVar.p()) {
                AbstractC0343c.this.a((InterfaceC0352m) null, AbstractC0343c.this.v());
            } else if (AbstractC0343c.this.w != null) {
                AbstractC0343c.this.w.a(aVar);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface e {
        void a();
    }

    protected abstract T a(IBinder iBinder);

    void a(int i2, T t) {
    }

    public boolean d() {
        return true;
    }

    public boolean g() {
        return false;
    }

    protected abstract String i();

    protected String j() {
        return "com.google.android.gms";
    }

    protected abstract String k();

    protected String l() {
        return null;
    }

    public abstract Account n();

    public Bundle r() {
        return null;
    }

    protected boolean t() {
        return false;
    }

    public boolean u() {
        return false;
    }

    protected abstract Set<Scope> v();

    /* renamed from: com.google.android.gms.common.internal.c$g */
    final class g extends c.d.a.b.e.b.d {
        public g(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            c.d.a.b.b.a aVar;
            c.d.a.b.b.a aVar2;
            if (AbstractC0343c.this.C.get() != message.arg1) {
                if (b(message)) {
                    a(message);
                    return;
                }
                return;
            }
            if ((message.what == 1 || message.what == 7 || ((message.what == 4 && !AbstractC0343c.this.t()) || message.what == 5)) && !AbstractC0343c.this.a()) {
                a(message);
                return;
            }
            if (message.what != 4) {
                if (message.what != 5) {
                    if (message.what == 3) {
                        c.d.a.b.b.a aVar3 = new c.d.a.b.b.a(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null);
                        AbstractC0343c.this.q.a(aVar3);
                        AbstractC0343c.this.a(aVar3);
                        return;
                    }
                    if (message.what != 6) {
                        if (message.what == 2 && !AbstractC0343c.this.isConnected()) {
                            a(message);
                            return;
                        }
                        if (b(message)) {
                            ((h) message.obj).b();
                            return;
                        }
                        int i2 = message.what;
                        StringBuilder sb = new StringBuilder(45);
                        sb.append("Don't know how to handle message: ");
                        sb.append(i2);
                        Log.wtf("GmsClient", sb.toString(), new Exception());
                        return;
                    }
                    AbstractC0343c.this.b(5, null);
                    if (AbstractC0343c.this.v != null) {
                        AbstractC0343c.this.v.a(message.arg2);
                    }
                    AbstractC0343c.this.a(message.arg2);
                    AbstractC0343c.this.a(5, 1, (int) null);
                    return;
                }
                if (AbstractC0343c.this.z == null) {
                    aVar = new c.d.a.b.b.a(8);
                } else {
                    aVar = AbstractC0343c.this.z;
                }
                AbstractC0343c.this.q.a(aVar);
                AbstractC0343c.this.a(aVar);
                return;
            }
            AbstractC0343c.this.z = new c.d.a.b.b.a(message.arg2);
            if (AbstractC0343c.this.y() && !AbstractC0343c.this.A) {
                AbstractC0343c.this.b(3, null);
                return;
            }
            if (AbstractC0343c.this.z == null) {
                aVar2 = new c.d.a.b.b.a(8);
            } else {
                aVar2 = AbstractC0343c.this.z;
            }
            AbstractC0343c.this.q.a(aVar2);
            AbstractC0343c.this.a(aVar2);
        }

        private static void a(Message message) {
            h hVar = (h) message.obj;
            hVar.a();
            hVar.c();
        }

        private static boolean b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 7;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$l */
    protected final class l extends f {
        public l(int i2, Bundle bundle) {
            super(i2, null);
        }

        @Override // com.google.android.gms.common.internal.AbstractC0343c.f
        protected final void a(c.d.a.b.b.a aVar) {
            if (!AbstractC0343c.this.t() || !AbstractC0343c.this.y()) {
                AbstractC0343c.this.q.a(aVar);
                AbstractC0343c.this.a(aVar);
            } else {
                AbstractC0343c.this.c(16);
            }
        }

        @Override // com.google.android.gms.common.internal.AbstractC0343c.f
        protected final boolean e() {
            AbstractC0343c.this.q.a(c.d.a.b.b.a.f3727a);
            return true;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$h */
    protected abstract class h<TListener> {

        /* renamed from: a, reason: collision with root package name */
        private TListener f5010a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f5011b = false;

        public h(TListener tlistener) {
            this.f5010a = tlistener;
        }

        protected abstract void a();

        protected abstract void a(TListener tlistener);

        public final void b() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f5010a;
                if (this.f5011b) {
                    String strValueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(strValueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    a(tlistener);
                } catch (RuntimeException e2) {
                    a();
                    throw e2;
                }
            } else {
                a();
            }
            synchronized (this) {
                this.f5011b = true;
            }
            c();
        }

        public final void c() {
            d();
            synchronized (AbstractC0343c.this.s) {
                AbstractC0343c.this.s.remove(this);
            }
        }

        public final void d() {
            synchronized (this) {
                this.f5010a = null;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$i */
    public static final class i extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC0343c f5013a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5014b;

        public i(AbstractC0343c abstractC0343c, int i2) {
            this.f5013a = abstractC0343c;
            this.f5014b = i2;
        }

        @Override // com.google.android.gms.common.internal.o
        public final void b(int i2, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.o
        public final void a(int i2, IBinder iBinder, Bundle bundle) {
            t.a(this.f5013a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f5013a.a(i2, iBinder, bundle, this.f5014b);
            this.f5013a = null;
        }

        @Override // com.google.android.gms.common.internal.o
        public final void a(int i2, IBinder iBinder, D d2) {
            t.a(this.f5013a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            t.a(d2);
            this.f5013a.a(d2);
            a(i2, iBinder, d2.f4971a);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$j */
    public final class j implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final int f5015a;

        public j(int i2) {
            this.f5015a = i2;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            q qVar;
            if (iBinder == null) {
                AbstractC0343c.this.c(16);
                return;
            }
            synchronized (AbstractC0343c.this.o) {
                AbstractC0343c abstractC0343c = AbstractC0343c.this;
                if (iBinder == null) {
                    qVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof q)) {
                        qVar = (q) iInterfaceQueryLocalInterface;
                    } else {
                        qVar = new q(iBinder) { // from class: com.google.android.gms.common.internal.p$a

                            /* renamed from: a, reason: collision with root package name */
                            private final IBinder f5058a;

                            {
                                this.f5058a = iBinder;
                            }

                            @Override // android.os.IInterface
                            public final IBinder asBinder() {
                                return this.f5058a;
                            }

                            @Override // com.google.android.gms.common.internal.q
                            public final void a(o oVar, C0347g c0347g) {
                                Parcel parcelObtain = Parcel.obtain();
                                Parcel parcelObtain2 = Parcel.obtain();
                                try {
                                    parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                                    parcelObtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                                    if (c0347g != null) {
                                        parcelObtain.writeInt(1);
                                        c0347g.writeToParcel(parcelObtain, 0);
                                    } else {
                                        parcelObtain.writeInt(0);
                                    }
                                    this.f5058a.transact(46, parcelObtain, parcelObtain2, 0);
                                    parcelObtain2.readException();
                                } finally {
                                    parcelObtain2.recycle();
                                    parcelObtain.recycle();
                                }
                            }
                        };
                    }
                }
                abstractC0343c.p = qVar;
            }
            AbstractC0343c.this.a(0, (Bundle) null, this.f5015a);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (AbstractC0343c.this.o) {
                AbstractC0343c.this.p = null;
            }
            AbstractC0343c.this.m.sendMessage(AbstractC0343c.this.m.obtainMessage(6, this.f5015a, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$k */
    protected final class k extends f {

        /* renamed from: g, reason: collision with root package name */
        private final IBinder f5017g;

        public k(int i2, IBinder iBinder, Bundle bundle) {
            super(i2, bundle);
            this.f5017g = iBinder;
        }

        @Override // com.google.android.gms.common.internal.AbstractC0343c.f
        protected final void a(c.d.a.b.b.a aVar) {
            if (AbstractC0343c.this.w != null) {
                AbstractC0343c.this.w.a(aVar);
            }
            AbstractC0343c.this.a(aVar);
        }

        @Override // com.google.android.gms.common.internal.AbstractC0343c.f
        protected final boolean e() throws RemoteException {
            try {
                String interfaceDescriptor = this.f5017g.getInterfaceDescriptor();
                if (!AbstractC0343c.this.k().equals(interfaceDescriptor)) {
                    String strK = AbstractC0343c.this.k();
                    StringBuilder sb = new StringBuilder(String.valueOf(strK).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(strK);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface iInterfaceA = AbstractC0343c.this.a(this.f5017g);
                if (iInterfaceA == null || !(AbstractC0343c.this.a(2, 4, (int) iInterfaceA) || AbstractC0343c.this.a(3, 4, (int) iInterfaceA))) {
                    return false;
                }
                AbstractC0343c.this.z = null;
                Bundle bundleR = AbstractC0343c.this.r();
                if (AbstractC0343c.this.v == null) {
                    return true;
                }
                AbstractC0343c.this.v.a(bundleR);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$f */
    private abstract class f extends h<Boolean> {

        /* renamed from: d, reason: collision with root package name */
        private final int f5006d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f5007e;

        protected f(int i2, Bundle bundle) {
            super(true);
            this.f5006d = i2;
            this.f5007e = bundle;
        }

        @Override // com.google.android.gms.common.internal.AbstractC0343c.h
        protected final void a() {
        }

        protected abstract void a(c.d.a.b.b.a aVar);

        protected abstract boolean e();

        @Override // com.google.android.gms.common.internal.AbstractC0343c.h
        protected final /* synthetic */ void a(Boolean bool) {
            if (bool != null) {
                int i2 = this.f5006d;
                if (i2 == 0) {
                    if (e()) {
                        return;
                    }
                    AbstractC0343c.this.b(1, null);
                    a(new c.d.a.b.b.a(8, null));
                    return;
                }
                if (i2 != 10) {
                    AbstractC0343c.this.b(1, null);
                    a(new c.d.a.b.b.a(this.f5006d, this.f5007e != null ? (PendingIntent) this.f5007e.getParcelable("pendingIntent") : null));
                    return;
                } else {
                    AbstractC0343c.this.b(1, null);
                    throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), AbstractC0343c.this.i(), AbstractC0343c.this.k()));
                }
            }
            AbstractC0343c.this.b(1, null);
        }
    }

    protected AbstractC0343c(Context context, Looper looper, AbstractC0349j abstractC0349j, c.d.a.b.b.e eVar, int i2, a aVar, b bVar, String str) {
        t.a(context, "Context must not be null");
        this.f5004i = context;
        t.a(looper, "Looper must not be null");
        this.j = looper;
        t.a(abstractC0349j, "Supervisor must not be null");
        this.k = abstractC0349j;
        t.a(eVar, "API availability must not be null");
        this.l = eVar;
        this.m = new g(looper);
        this.x = i2;
        this.v = aVar;
        this.w = bVar;
        this.y = str;
    }

    private final String w() {
        return this.y == null ? this.f5004i.getClass().getName() : this.y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(D d2) {
        this.B = d2;
    }

    public final c.d.a.b.b.c[] f() {
        D d2 = this.B;
        if (d2 == null) {
            return null;
        }
        return d2.f4972b;
    }

    protected void a(T t) {
        this.f5000e = System.currentTimeMillis();
    }

    protected void a(int i2) {
        this.f4998c = i2;
        this.f4999d = System.currentTimeMillis();
    }

    protected void a(c.d.a.b.b.a aVar) {
        this.f5001f = aVar.q();
        this.f5002g = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i2, T t) {
        J j2;
        t.b((i2 == 4) == (t != null));
        synchronized (this.n) {
            this.u = i2;
            this.r = t;
            a(i2, (int) t);
            switch (i2) {
                case 1:
                    if (this.t != null) {
                        this.k.a(this.f5003h.a(), this.f5003h.b(), this.f5003h.c(), this.t, w());
                        this.t = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    if (this.t != null && this.f5003h != null) {
                        String strA = this.f5003h.a();
                        String strB = this.f5003h.b();
                        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 70 + String.valueOf(strB).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(strA);
                        sb.append(" on ");
                        sb.append(strB);
                        Log.e("GmsClient", sb.toString());
                        this.k.a(this.f5003h.a(), this.f5003h.b(), this.f5003h.c(), this.t, w());
                        this.C.incrementAndGet();
                    }
                    this.t = new j(this.C.get());
                    if (this.u == 3 && l() != null) {
                        j2 = new J(m().getPackageName(), l(), true, 129);
                    } else {
                        j2 = new J(j(), i(), false, 129);
                    }
                    this.f5003h = j2;
                    if (!this.k.a(new AbstractC0349j.a(this.f5003h.a(), this.f5003h.b(), this.f5003h.c()), this.t, w())) {
                        String strA2 = this.f5003h.a();
                        String strB2 = this.f5003h.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strA2).length() + 34 + String.valueOf(strB2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(strA2);
                        sb2.append(" on ");
                        sb2.append(strB2);
                        Log.e("GmsClient", sb2.toString());
                        a(16, (Bundle) null, this.C.get());
                        break;
                    }
                    break;
                case 4:
                    a((AbstractC0343c<T>) t);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(int i2, int i3, T t) {
        synchronized (this.n) {
            if (this.u != i2) {
                return false;
            }
            b(i3, t);
            return true;
        }
    }

    public void a(InterfaceC0063c interfaceC0063c) {
        t.a(interfaceC0063c, "Connection progress callbacks cannot be null.");
        this.q = interfaceC0063c;
        b(2, null);
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.n) {
            z = this.u == 4;
        }
        return z;
    }

    public boolean a() {
        boolean z;
        synchronized (this.n) {
            z = this.u == 2 || this.u == 3;
        }
        return z;
    }

    private final boolean x() {
        boolean z;
        synchronized (this.n) {
            z = this.u == 3;
        }
        return z;
    }

    public void c() {
        this.C.incrementAndGet();
        synchronized (this.s) {
            int size = this.s.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.s.get(i2).d();
            }
            this.s.clear();
        }
        synchronized (this.o) {
            this.p = null;
        }
        b(1, null);
    }

    public void b(int i2) {
        this.m.sendMessage(this.m.obtainMessage(6, this.C.get(), i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i2) {
        int i3;
        if (x()) {
            i3 = 5;
            this.A = true;
        } else {
            i3 = 4;
        }
        this.m.sendMessage(this.m.obtainMessage(i3, this.C.get(), 16));
    }

    public final Context m() {
        return this.f5004i;
    }

    public c.d.a.b.b.c[] o() {
        return f4996a;
    }

    protected Bundle p() {
        return new Bundle();
    }

    protected void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        this.m.sendMessage(this.m.obtainMessage(1, i3, -1, new k(i2, iBinder, bundle)));
    }

    protected final void a(int i2, Bundle bundle, int i3) {
        this.m.sendMessage(this.m.obtainMessage(7, i3, -1, new l(i2, null)));
    }

    protected final void q() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T s() {
        T t;
        synchronized (this.n) {
            if (this.u == 5) {
                throw new DeadObjectException();
            }
            q();
            t.a(this.r != null, "Client is connected but service is null");
            t = this.r;
        }
        return t;
    }

    public void a(InterfaceC0352m interfaceC0352m, Set<Scope> set) {
        Bundle bundleP = p();
        C0347g c0347g = new C0347g(this.x);
        c0347g.f5042d = this.f5004i.getPackageName();
        c0347g.f5045g = bundleP;
        if (set != null) {
            c0347g.f5044f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (g()) {
            c0347g.f5046h = n() != null ? n() : new Account("<<default account>>", "com.google");
            if (interfaceC0352m != null) {
                c0347g.f5043e = interfaceC0352m.asBinder();
            }
        } else if (u()) {
            c0347g.f5046h = n();
        }
        c0347g.f5047i = f4996a;
        c0347g.j = o();
        try {
            try {
                synchronized (this.o) {
                    if (this.p != null) {
                        this.p.a(new i(this, this.C.get()), c0347g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                }
            } catch (DeadObjectException e2) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
                b(1);
            } catch (SecurityException e3) {
                throw e3;
            }
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            a(8, (IBinder) null, (Bundle) null, this.C.get());
        }
    }

    public void a(e eVar) {
        eVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y() throws ClassNotFoundException {
        if (this.A || TextUtils.isEmpty(k()) || TextUtils.isEmpty(l())) {
            return false;
        }
        try {
            Class.forName(k());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public String b() {
        if (isConnected() && this.f5003h != null) {
            return this.f5003h.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }
}
