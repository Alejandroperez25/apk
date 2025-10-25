package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class g implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Notification.Builder f515a;

    /* renamed from: b, reason: collision with root package name */
    private final f.d f516b;

    /* renamed from: c, reason: collision with root package name */
    private RemoteViews f517c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f518d;

    /* renamed from: e, reason: collision with root package name */
    private final List<Bundle> f519e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f520f = new Bundle();

    /* renamed from: g, reason: collision with root package name */
    private int f521g;

    /* renamed from: h, reason: collision with root package name */
    private RemoteViews f522h;

    g(f.d dVar) {
        this.f516b = dVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f515a = new Notification.Builder(dVar.f502a, dVar.I);
        } else {
            this.f515a = new Notification.Builder(dVar.f502a);
        }
        Notification notification = dVar.N;
        this.f515a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f509h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f505d).setContentText(dVar.f506e).setContentInfo(dVar.j).setContentIntent(dVar.f507f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f508g, (notification.flags & 128) != 0).setLargeIcon(dVar.f510i).setNumber(dVar.k).setProgress(dVar.r, dVar.s, dVar.t);
        if (Build.VERSION.SDK_INT < 21) {
            this.f515a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f515a.setSubText(dVar.p).setUsesChronometer(dVar.n).setPriority(dVar.l);
            Iterator<f.a> it = dVar.f503b.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            if (dVar.B != null) {
                this.f520f.putAll(dVar.B);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.x) {
                    this.f520f.putBoolean("android.support.localOnly", true);
                }
                if (dVar.u != null) {
                    this.f520f.putString("android.support.groupKey", dVar.u);
                    if (dVar.v) {
                        this.f520f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f520f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (dVar.w != null) {
                    this.f520f.putString("android.support.sortKey", dVar.w);
                }
            }
            this.f517c = dVar.F;
            this.f518d = dVar.G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f515a.setShowWhen(dVar.m);
            if (Build.VERSION.SDK_INT < 21 && dVar.O != null && !dVar.O.isEmpty()) {
                this.f520f.putStringArray("android.people", (String[]) dVar.O.toArray(new String[dVar.O.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f515a.setLocalOnly(dVar.x).setGroup(dVar.u).setGroupSummary(dVar.v).setSortKey(dVar.w);
            this.f521g = dVar.M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f515a.setCategory(dVar.A).setColor(dVar.C).setVisibility(dVar.D).setPublicVersion(dVar.E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = dVar.O.iterator();
            while (it2.hasNext()) {
                this.f515a.addPerson(it2.next());
            }
            this.f522h = dVar.H;
            if (dVar.f504c.size() > 0) {
                Bundle bundle = dVar.a().getBundle("android.car.EXTENSIONS");
                bundle = bundle == null ? new Bundle() : bundle;
                Bundle bundle2 = new Bundle();
                for (int i2 = 0; i2 < dVar.f504c.size(); i2++) {
                    bundle2.putBundle(Integer.toString(i2), h.a(dVar.f504c.get(i2)));
                }
                bundle.putBundle("invisible_actions", bundle2);
                dVar.a().putBundle("android.car.EXTENSIONS", bundle);
                this.f520f.putBundle("android.car.EXTENSIONS", bundle);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f515a.setExtras(dVar.B).setRemoteInputHistory(dVar.q);
            if (dVar.F != null) {
                this.f515a.setCustomContentView(dVar.F);
            }
            if (dVar.G != null) {
                this.f515a.setCustomBigContentView(dVar.G);
            }
            if (dVar.H != null) {
                this.f515a.setCustomHeadsUpContentView(dVar.H);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f515a.setBadgeIconType(dVar.J).setShortcutId(dVar.K).setTimeoutAfter(dVar.L).setGroupAlertBehavior(dVar.M);
            if (dVar.z) {
                this.f515a.setColorized(dVar.y);
            }
            if (TextUtils.isEmpty(dVar.I)) {
                return;
            }
            this.f515a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
    }

    @Override // androidx.core.app.e
    public Notification.Builder a() {
        return this.f515a;
    }

    public Notification b() {
        Bundle bundleA;
        RemoteViews remoteViewsD;
        RemoteViews remoteViewsC;
        f.e eVar = this.f516b.o;
        if (eVar != null) {
            eVar.a(this);
        }
        RemoteViews remoteViewsB = eVar != null ? eVar.b(this) : null;
        Notification notificationC = c();
        if (remoteViewsB != null) {
            notificationC.contentView = remoteViewsB;
        } else if (this.f516b.F != null) {
            notificationC.contentView = this.f516b.F;
        }
        if (Build.VERSION.SDK_INT >= 16 && eVar != null && (remoteViewsC = eVar.c(this)) != null) {
            notificationC.bigContentView = remoteViewsC;
        }
        if (Build.VERSION.SDK_INT >= 21 && eVar != null && (remoteViewsD = this.f516b.o.d(this)) != null) {
            notificationC.headsUpContentView = remoteViewsD;
        }
        if (Build.VERSION.SDK_INT >= 16 && eVar != null && (bundleA = f.a(notificationC)) != null) {
            eVar.a(bundleA);
        }
        return notificationC;
    }

    private void a(f.a aVar) {
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.a(), aVar.b(), aVar.c());
            if (aVar.f() != null) {
                for (RemoteInput remoteInput : i.a(aVar.f())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            if (aVar.d() != null) {
                bundle = new Bundle(aVar.d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.e());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.e());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.g());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.g());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.i());
            builder.addExtras(bundle);
            this.f515a.addAction(builder.build());
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f519e.add(h.a(this.f515a, aVar));
        }
    }

    protected Notification c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f515a.build();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Notification notificationBuild = this.f515a.build();
            if (this.f521g != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && this.f521g == 2) {
                    a(notificationBuild);
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && this.f521g == 1) {
                    a(notificationBuild);
                }
            }
            return notificationBuild;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f515a.setExtras(this.f520f);
            Notification notificationBuild2 = this.f515a.build();
            if (this.f517c != null) {
                notificationBuild2.contentView = this.f517c;
            }
            if (this.f518d != null) {
                notificationBuild2.bigContentView = this.f518d;
            }
            if (this.f522h != null) {
                notificationBuild2.headsUpContentView = this.f522h;
            }
            if (this.f521g != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && this.f521g == 2) {
                    a(notificationBuild2);
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && this.f521g == 1) {
                    a(notificationBuild2);
                }
            }
            return notificationBuild2;
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f515a.setExtras(this.f520f);
            Notification notificationBuild3 = this.f515a.build();
            if (this.f517c != null) {
                notificationBuild3.contentView = this.f517c;
            }
            if (this.f518d != null) {
                notificationBuild3.bigContentView = this.f518d;
            }
            if (this.f521g != 0) {
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) != 0 && this.f521g == 2) {
                    a(notificationBuild3);
                }
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) == 0 && this.f521g == 1) {
                    a(notificationBuild3);
                }
            }
            return notificationBuild3;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            SparseArray<Bundle> sparseArrayA = h.a(this.f519e);
            if (sparseArrayA != null) {
                this.f520f.putSparseParcelableArray("android.support.actionExtras", sparseArrayA);
            }
            this.f515a.setExtras(this.f520f);
            Notification notificationBuild4 = this.f515a.build();
            if (this.f517c != null) {
                notificationBuild4.contentView = this.f517c;
            }
            if (this.f518d != null) {
                notificationBuild4.bigContentView = this.f518d;
            }
            return notificationBuild4;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            Notification notificationBuild5 = this.f515a.build();
            Bundle bundleA = f.a(notificationBuild5);
            Bundle bundle = new Bundle(this.f520f);
            for (String str : this.f520f.keySet()) {
                if (bundleA.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            bundleA.putAll(bundle);
            SparseArray<Bundle> sparseArrayA2 = h.a(this.f519e);
            if (sparseArrayA2 != null) {
                f.a(notificationBuild5).putSparseParcelableArray("android.support.actionExtras", sparseArrayA2);
            }
            if (this.f517c != null) {
                notificationBuild5.contentView = this.f517c;
            }
            if (this.f518d != null) {
                notificationBuild5.bigContentView = this.f518d;
            }
            return notificationBuild5;
        }
        return this.f515a.getNotification();
    }

    private void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
