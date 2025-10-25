package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<c> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    Bundle f5593a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f5594b;

    /* renamed from: c, reason: collision with root package name */
    private a f5595c;

    public c(Bundle bundle) {
        this.f5593a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f5593a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }

    public final Map<String, String> o() {
        if (this.f5594b == null) {
            Bundle bundle = this.f5593a;
            b.c.b bVar = new b.c.b();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        bVar.put(str, str2);
                    }
                }
            }
            this.f5594b = bVar;
        }
        return this.f5594b;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5596a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5597b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f5598c;

        /* renamed from: d, reason: collision with root package name */
        private final String f5599d;

        /* renamed from: e, reason: collision with root package name */
        private final String f5600e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f5601f;

        /* renamed from: g, reason: collision with root package name */
        private final String f5602g;

        /* renamed from: h, reason: collision with root package name */
        private final String f5603h;

        /* renamed from: i, reason: collision with root package name */
        private final String f5604i;
        private final String j;
        private final String k;
        private final String l;
        private final String m;
        private final Uri n;
        private final String o;
        private final Integer p;
        private final Integer q;
        private final Integer r;
        private final int[] s;
        private final Long t;
        private final boolean u;
        private final boolean v;
        private final boolean w;
        private final boolean x;
        private final boolean y;
        private final long[] z;

        private a(o oVar) {
            this.f5596a = oVar.a("gcm.n.title");
            this.f5597b = oVar.e("gcm.n.title");
            this.f5598c = a(oVar, "gcm.n.title");
            this.f5599d = oVar.a("gcm.n.body");
            this.f5600e = oVar.e("gcm.n.body");
            this.f5601f = a(oVar, "gcm.n.body");
            this.f5602g = oVar.a("gcm.n.icon");
            this.f5604i = oVar.b();
            this.j = oVar.a("gcm.n.tag");
            this.k = oVar.a("gcm.n.color");
            this.l = oVar.a("gcm.n.click_action");
            this.m = oVar.a("gcm.n.android_channel_id");
            this.n = oVar.a();
            this.f5603h = oVar.a("gcm.n.image");
            this.o = oVar.a("gcm.n.ticker");
            this.p = oVar.c("gcm.n.notification_priority");
            this.q = oVar.c("gcm.n.visibility");
            this.r = oVar.c("gcm.n.notification_count");
            this.u = oVar.b("gcm.n.sticky");
            this.v = oVar.b("gcm.n.local_only");
            this.w = oVar.b("gcm.n.default_sound");
            this.x = oVar.b("gcm.n.default_vibrate_timings");
            this.y = oVar.b("gcm.n.default_light_settings");
            this.t = oVar.d("gcm.n.event_time");
            this.s = oVar.d();
            this.z = oVar.c();
        }

        private static String[] a(o oVar, String str) {
            Object[] objArrF = oVar.f(str);
            if (objArrF == null) {
                return null;
            }
            String[] strArr = new String[objArrF.length];
            for (int i2 = 0; i2 < objArrF.length; i2++) {
                strArr[i2] = String.valueOf(objArrF[i2]);
            }
            return strArr;
        }

        public String a() {
            return this.f5596a;
        }

        public String b() {
            return this.f5599d;
        }
    }

    public final a p() {
        if (this.f5595c == null && o.a(this.f5593a)) {
            this.f5595c = new a(new o(this.f5593a));
        }
        return this.f5595c;
    }
}
