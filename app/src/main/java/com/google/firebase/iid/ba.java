package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class ba implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    int f5524a;

    /* renamed from: b, reason: collision with root package name */
    final Messenger f5525b;

    /* renamed from: c, reason: collision with root package name */
    C0452h f5526c;

    /* renamed from: d, reason: collision with root package name */
    final Queue<AbstractC0454j<?>> f5527d;

    /* renamed from: e, reason: collision with root package name */
    final SparseArray<AbstractC0454j<?>> f5528e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ aa f5529f;

    private ba(aa aaVar) {
        this.f5529f = aaVar;
        this.f5524a = 0;
        this.f5525b = new Messenger(new c.d.a.b.e.d.e(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.firebase.iid.ea

            /* renamed from: a, reason: collision with root package name */
            private final ba f5536a;

            {
                this.f5536a = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f5536a.a(message);
            }
        }));
        this.f5527d = new ArrayDeque();
        this.f5528e = new SparseArray<>();
    }

    final synchronized boolean a(AbstractC0454j<?> abstractC0454j) {
        switch (this.f5524a) {
            case 0:
                this.f5527d.add(abstractC0454j);
                com.google.android.gms.common.internal.t.a(this.f5524a == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f5524a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                if (!com.google.android.gms.common.stats.a.a().a(this.f5529f.f5519b, intent, this, 1)) {
                    a(0, "Unable to bind to service");
                } else {
                    this.f5529f.f5520c.schedule(new Runnable(this) { // from class: com.google.firebase.iid.da

                        /* renamed from: a, reason: collision with root package name */
                        private final ba f5533a;

                        {
                            this.f5533a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f5533a.c();
                        }
                    }, 30L, TimeUnit.SECONDS);
                }
                return true;
            case 1:
                this.f5527d.add(abstractC0454j);
                return true;
            case 2:
                this.f5527d.add(abstractC0454j);
                a();
                return true;
            case 3:
            case 4:
                return false;
            default:
                int i2 = this.f5524a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    final boolean a(Message message) {
        int i2 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (this) {
            AbstractC0454j<?> abstractC0454j = this.f5528e.get(i2);
            if (abstractC0454j == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i2);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            this.f5528e.remove(i2);
            b();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                abstractC0454j.a(new C0453i(4, "Not supported by GmsCore"));
            } else {
                abstractC0454j.a(data);
            }
            return true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f5529f.f5520c.execute(new Runnable(this, iBinder) { // from class: com.google.firebase.iid.d

            /* renamed from: a, reason: collision with root package name */
            private final ba f5531a;

            /* renamed from: b, reason: collision with root package name */
            private final IBinder f5532b;

            {
                this.f5531a = this;
                this.f5532b = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ba baVar = this.f5531a;
                IBinder iBinder2 = this.f5532b;
                synchronized (baVar) {
                    if (iBinder2 == null) {
                        baVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        baVar.f5526c = new C0452h(iBinder2);
                        baVar.f5524a = 2;
                        baVar.a();
                    } catch (RemoteException e2) {
                        baVar.a(0, e2.getMessage());
                    }
                }
            }
        });
    }

    final void a() {
        this.f5529f.f5520c.execute(new Runnable(this) { // from class: com.google.firebase.iid.c

            /* renamed from: a, reason: collision with root package name */
            private final ba f5530a;

            {
                this.f5530a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC0454j<?> abstractC0454jPoll;
                final ba baVar = this.f5530a;
                while (true) {
                    synchronized (baVar) {
                        if (baVar.f5524a != 2) {
                            return;
                        }
                        if (baVar.f5527d.isEmpty()) {
                            baVar.b();
                            return;
                        } else {
                            abstractC0454jPoll = baVar.f5527d.poll();
                            baVar.f5528e.put(abstractC0454jPoll.f5541a, abstractC0454jPoll);
                            baVar.f5529f.f5520c.schedule(new Runnable(baVar, abstractC0454jPoll) { // from class: com.google.firebase.iid.e

                                /* renamed from: a, reason: collision with root package name */
                                private final ba f5534a;

                                /* renamed from: b, reason: collision with root package name */
                                private final AbstractC0454j f5535b;

                                {
                                    this.f5534a = baVar;
                                    this.f5535b = abstractC0454jPoll;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f5534a.a(this.f5535b.f5541a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(abstractC0454jPoll);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
                        sb.append("Sending ");
                        sb.append(strValueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context context = baVar.f5529f.f5519b;
                    Messenger messenger = baVar.f5525b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = abstractC0454jPoll.f5543c;
                    messageObtain.arg1 = abstractC0454jPoll.f5541a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC0454jPoll.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", abstractC0454jPoll.f5544d);
                    messageObtain.setData(bundle);
                    try {
                        baVar.f5526c.a(messageObtain);
                    } catch (RemoteException e2) {
                        baVar.a(2, e2.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f5529f.f5520c.execute(new Runnable(this) { // from class: com.google.firebase.iid.f

            /* renamed from: a, reason: collision with root package name */
            private final ba f5537a;

            {
                this.f5537a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5537a.a(2, "Service disconnected");
            }
        });
    }

    final synchronized void a(int i2, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
        }
        switch (this.f5524a) {
            case 0:
                throw new IllegalStateException();
            case 1:
            case 2:
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f5524a = 4;
                com.google.android.gms.common.stats.a.a().a(this.f5529f.f5519b, this);
                C0453i c0453i = new C0453i(i2, str);
                Iterator<AbstractC0454j<?>> it = this.f5527d.iterator();
                while (it.hasNext()) {
                    it.next().a(c0453i);
                }
                this.f5527d.clear();
                for (int i3 = 0; i3 < this.f5528e.size(); i3++) {
                    this.f5528e.valueAt(i3).a(c0453i);
                }
                this.f5528e.clear();
                return;
            case 3:
                this.f5524a = 4;
                return;
            case 4:
                return;
            default:
                int i4 = this.f5524a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i4);
                throw new IllegalStateException(sb.toString());
        }
    }

    final synchronized void b() {
        if (this.f5524a == 2 && this.f5527d.isEmpty() && this.f5528e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f5524a = 3;
            com.google.android.gms.common.stats.a.a().a(this.f5529f.f5519b, this);
        }
    }

    final synchronized void c() {
        if (this.f5524a == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void a(int i2) {
        AbstractC0454j<?> abstractC0454j = this.f5528e.get(i2);
        if (abstractC0454j != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i2);
            Log.w("MessengerIpcClient", sb.toString());
            this.f5528e.remove(i2);
            abstractC0454j.a(new C0453i(3, "Timed out waiting for response"));
            b();
        }
    }
}
