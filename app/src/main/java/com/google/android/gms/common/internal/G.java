package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0349j;
import java.util.HashMap;

/* loaded from: classes.dex */
final class G extends AbstractC0349j implements Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    private final Context f4974d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f4975e;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<AbstractC0349j.a, H> f4973c = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.stats.a f4976f = com.google.android.gms.common.stats.a.a();

    /* renamed from: g, reason: collision with root package name */
    private final long f4977g = 5000;

    /* renamed from: h, reason: collision with root package name */
    private final long f4978h = 300000;

    G(Context context) {
        this.f4974d = context.getApplicationContext();
        this.f4975e = new c.d.a.b.e.b.d(context.getMainLooper(), this);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0349j
    protected final boolean a(AbstractC0349j.a aVar, ServiceConnection serviceConnection, String str) {
        boolean zA;
        t.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f4973c) {
            H h2 = this.f4973c.get(aVar);
            if (h2 == null) {
                h2 = new H(this, aVar);
                h2.a(serviceConnection, str);
                h2.a(str);
                this.f4973c.put(aVar, h2);
            } else {
                this.f4975e.removeMessages(0, aVar);
                if (h2.a(serviceConnection)) {
                    String strValueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(strValueOf);
                    throw new IllegalStateException(sb.toString());
                }
                h2.a(serviceConnection, str);
                switch (h2.b()) {
                    case 1:
                        serviceConnection.onServiceConnected(h2.e(), h2.d());
                        break;
                    case 2:
                        h2.a(str);
                        break;
                }
            }
            zA = h2.a();
        }
        return zA;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0349j
    protected final void b(AbstractC0349j.a aVar, ServiceConnection serviceConnection, String str) {
        t.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f4973c) {
            H h2 = this.f4973c.get(aVar);
            if (h2 == null) {
                String strValueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            }
            if (!h2.a(serviceConnection)) {
                String strValueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(strValueOf2);
                throw new IllegalStateException(sb2.toString());
            }
            h2.b(serviceConnection, str);
            if (h2.c()) {
                this.f4975e.sendMessageDelayed(this.f4975e.obtainMessage(0, aVar), this.f4977g);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                synchronized (this.f4973c) {
                    AbstractC0349j.a aVar = (AbstractC0349j.a) message.obj;
                    H h2 = this.f4973c.get(aVar);
                    if (h2 != null && h2.c()) {
                        if (h2.a()) {
                            h2.b("GmsClientSupervisor");
                        }
                        this.f4973c.remove(aVar);
                    }
                }
                return true;
            case 1:
                synchronized (this.f4973c) {
                    AbstractC0349j.a aVar2 = (AbstractC0349j.a) message.obj;
                    H h3 = this.f4973c.get(aVar2);
                    if (h3 != null && h3.b() == 3) {
                        String strValueOf = String.valueOf(aVar2);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(strValueOf);
                        Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                        ComponentName componentNameE = h3.e();
                        if (componentNameE == null) {
                            componentNameE = aVar2.b();
                        }
                        if (componentNameE == null) {
                            componentNameE = new ComponentName(aVar2.a(), "unknown");
                        }
                        h3.onServiceDisconnected(componentNameE);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
