package b.j.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f1201a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static b f1202b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1203c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<C0023b>> f1204d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, ArrayList<C0023b>> f1205e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<a> f1206f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final Handler f1207g;

    /* renamed from: b.j.a.b$b, reason: collision with other inner class name */
    private static final class C0023b {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f1210a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f1211b;

        /* renamed from: c, reason: collision with root package name */
        boolean f1212c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1213d;

        C0023b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f1210a = intentFilter;
            this.f1211b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f1211b);
            sb.append(" filter=");
            sb.append(this.f1210a);
            if (this.f1213d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f1208a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<C0023b> f1209b;

        a(Intent intent, ArrayList<C0023b> arrayList) {
            this.f1208a = intent;
            this.f1209b = arrayList;
        }
    }

    public static b a(Context context) {
        b bVar;
        synchronized (f1201a) {
            if (f1202b == null) {
                f1202b = new b(context.getApplicationContext());
            }
            bVar = f1202b;
        }
        return bVar;
    }

    private b(Context context) {
        this.f1203c = context;
        this.f1207g = new b.j.a.a(this, context.getMainLooper());
    }

    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f1204d) {
            C0023b c0023b = new C0023b(intentFilter, broadcastReceiver);
            ArrayList<C0023b> arrayList = this.f1204d.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f1204d.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c0023b);
            for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                String action = intentFilter.getAction(i2);
                ArrayList<C0023b> arrayList2 = this.f1205e.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f1205e.put(action, arrayList2);
                }
                arrayList2.add(c0023b);
            }
        }
    }

    public boolean a(Intent intent) {
        String str;
        ArrayList arrayList;
        int i2;
        ArrayList<C0023b> arrayList2;
        String str2;
        String str3;
        synchronized (this.f1204d) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f1203c.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<C0023b> arrayList3 = this.f1205e.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i3 = 0;
                while (i3 < arrayList3.size()) {
                    C0023b c0023b = arrayList3.get(i3);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + c0023b.f1210a);
                    }
                    if (c0023b.f1212c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i2 = i3;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        str = action;
                        arrayList = arrayList4;
                        i2 = i3;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        int iMatch = c0023b.f1210a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(c0023b);
                            c0023b.f1212c = true;
                            i3 = i2 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            strResolveTypeIfNeeded = str2;
                        } else if (z) {
                            switch (iMatch) {
                                case -4:
                                    str3 = "category";
                                    break;
                                case -3:
                                    str3 = "action";
                                    break;
                                case -2:
                                    str3 = "data";
                                    break;
                                case -1:
                                    str3 = "type";
                                    break;
                                default:
                                    str3 = "unknown reason";
                                    break;
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str3);
                        }
                    }
                    arrayList4 = arrayList;
                    i3 = i2 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i4 = 0; i4 < arrayList5.size(); i4++) {
                        ((C0023b) arrayList5.get(i4)).f1212c = false;
                    }
                    this.f1206f.add(new a(intent, arrayList5));
                    if (!this.f1207g.hasMessages(1)) {
                        this.f1207g.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    void a() {
        a[] aVarArr;
        while (true) {
            synchronized (this.f1204d) {
                int size = this.f1206f.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                this.f1206f.toArray(aVarArr);
                this.f1206f.clear();
            }
            for (a aVar : aVarArr) {
                int size2 = aVar.f1209b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C0023b c0023b = aVar.f1209b.get(i2);
                    if (!c0023b.f1213d) {
                        c0023b.f1211b.onReceive(this.f1203c, aVar.f1208a);
                    }
                }
            }
        }
    }
}
