package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import c.d.a.b.h.InterfaceC0229c;
import com.google.firebase.iid.AbstractC0469y;
import com.google.firebase.iid.B;
import com.google.firebase.iid.E;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes.dex */
public abstract class g extends Service {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f5610a;

    /* renamed from: b, reason: collision with root package name */
    private Binder f5611b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f5612c;

    /* renamed from: d, reason: collision with root package name */
    private int f5613d;

    /* renamed from: e, reason: collision with root package name */
    private int f5614e;

    public g() {
        c.d.a.b.e.d.b bVarA = c.d.a.b.e.d.a.a();
        String strValueOf = String.valueOf(getClass().getSimpleName());
        this.f5610a = bVarA.a(new com.google.android.gms.common.util.a.a(strValueOf.length() != 0 ? "Firebase-".concat(strValueOf) : new String("Firebase-")), c.d.a.b.e.d.f.f3956a);
        this.f5612c = new Object();
        this.f5614e = 0;
    }

    protected abstract Intent a(Intent intent);

    public abstract boolean b(Intent intent);

    public abstract void c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f5611b == null) {
            this.f5611b = new B(new E(this) { // from class: com.google.firebase.messaging.j

                /* renamed from: a, reason: collision with root package name */
                private final g f5621a;

                {
                    this.f5621a = this;
                }

                @Override // com.google.firebase.iid.E
                public final c.d.a.b.h.h a(Intent intent2) {
                    return this.f5621a.d(intent2);
                }
            });
        }
        return this.f5611b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final c.d.a.b.h.h<Void> d(final Intent intent) {
        if (b(intent)) {
            return c.d.a.b.h.k.a((Object) null);
        }
        final c.d.a.b.h.i iVar = new c.d.a.b.h.i();
        this.f5610a.execute(new Runnable(this, intent, iVar) { // from class: com.google.firebase.messaging.i

            /* renamed from: a, reason: collision with root package name */
            private final g f5618a;

            /* renamed from: b, reason: collision with root package name */
            private final Intent f5619b;

            /* renamed from: c, reason: collision with root package name */
            private final c.d.a.b.h.i f5620c;

            {
                this.f5618a = this;
                this.f5619b = intent;
                this.f5620c = iVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g gVar = this.f5618a;
                Intent intent2 = this.f5619b;
                c.d.a.b.h.i iVar2 = this.f5620c;
                try {
                    gVar.c(intent2);
                } finally {
                    iVar2.a((c.d.a.b.h.i) null);
                }
            }
        });
        return iVar.a();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i2, int i3) {
        synchronized (this.f5612c) {
            this.f5613d = i3;
            this.f5614e++;
        }
        Intent intentA = a(intent);
        if (intentA == null) {
            f(intent);
            return 2;
        }
        c.d.a.b.h.h<Void> hVarD = d(intentA);
        if (hVarD.a()) {
            f(intent);
            return 2;
        }
        hVarD.a(l.f5624a, new InterfaceC0229c(this, intent) { // from class: com.google.firebase.messaging.k

            /* renamed from: a, reason: collision with root package name */
            private final g f5622a;

            /* renamed from: b, reason: collision with root package name */
            private final Intent f5623b;

            {
                this.f5622a = this;
                this.f5623b = intent;
            }

            @Override // c.d.a.b.h.InterfaceC0229c
            public final void a(c.d.a.b.h.h hVar) {
                this.f5622a.a(this.f5623b, hVar);
            }
        });
        return 3;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f5610a.shutdown();
        super.onDestroy();
    }

    private final void f(Intent intent) {
        if (intent != null) {
            AbstractC0469y.a(intent);
        }
        synchronized (this.f5612c) {
            this.f5614e--;
            if (this.f5614e == 0) {
                stopSelfResult(this.f5613d);
            }
        }
    }

    final /* synthetic */ void a(Intent intent, c.d.a.b.h.h hVar) {
        f(intent);
    }
}
