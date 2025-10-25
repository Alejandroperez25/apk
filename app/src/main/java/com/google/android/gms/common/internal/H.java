package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC0349j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class H implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Set<ServiceConnection> f4979a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private int f4980b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4981c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f4982d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC0349j.a f4983e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f4984f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ G f4985g;

    public H(G g2, AbstractC0349j.a aVar) {
        this.f4985g = g2;
        this.f4983e = aVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f4985g.f4973c) {
            this.f4985g.f4975e.removeMessages(1, this.f4983e);
            this.f4982d = iBinder;
            this.f4984f = componentName;
            Iterator<ServiceConnection> it = this.f4979a.iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f4980b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f4985g.f4973c) {
            this.f4985g.f4975e.removeMessages(1, this.f4983e);
            this.f4982d = null;
            this.f4984f = componentName;
            Iterator<ServiceConnection> it = this.f4979a.iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f4980b = 2;
        }
    }

    public final void a(String str) {
        this.f4980b = 3;
        this.f4981c = this.f4985g.f4976f.a(this.f4985g.f4974d, str, this.f4983e.a(this.f4985g.f4974d), this, this.f4983e.c());
        if (!this.f4981c) {
            this.f4980b = 2;
            try {
                this.f4985g.f4976f.a(this.f4985g.f4974d, this);
            } catch (IllegalArgumentException unused) {
            }
        } else {
            this.f4985g.f4975e.sendMessageDelayed(this.f4985g.f4975e.obtainMessage(1, this.f4983e), this.f4985g.f4978h);
        }
    }

    public final void b(String str) {
        this.f4985g.f4975e.removeMessages(1, this.f4983e);
        this.f4985g.f4976f.a(this.f4985g.f4974d, this);
        this.f4981c = false;
        this.f4980b = 2;
    }

    public final void a(ServiceConnection serviceConnection, String str) {
        com.google.android.gms.common.stats.a unused = this.f4985g.f4976f;
        Context unused2 = this.f4985g.f4974d;
        this.f4983e.a(this.f4985g.f4974d);
        this.f4979a.add(serviceConnection);
    }

    public final void b(ServiceConnection serviceConnection, String str) {
        com.google.android.gms.common.stats.a unused = this.f4985g.f4976f;
        Context unused2 = this.f4985g.f4974d;
        this.f4979a.remove(serviceConnection);
    }

    public final boolean a() {
        return this.f4981c;
    }

    public final int b() {
        return this.f4980b;
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.f4979a.contains(serviceConnection);
    }

    public final boolean c() {
        return this.f4979a.isEmpty();
    }

    public final IBinder d() {
        return this.f4982d;
    }

    public final ComponentName e() {
        return this.f4984f;
    }
}
