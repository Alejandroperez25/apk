package io.flutter.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import f.a.a.a.q;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.n;
import io.flutter.view.k;
import io.flutter.view.p;
import io.flutter.view.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class f implements q, q.e, q.a, q.b, q.f, q.g {

    /* renamed from: a, reason: collision with root package name */
    private Activity f5953a;

    /* renamed from: b, reason: collision with root package name */
    private Context f5954b;

    /* renamed from: c, reason: collision with root package name */
    private k f5955c;

    /* renamed from: d, reason: collision with root package name */
    private p f5956d;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, Object> f5958f = new LinkedHashMap(0);

    /* renamed from: g, reason: collision with root package name */
    private final List<q.e> f5959g = new ArrayList(0);

    /* renamed from: h, reason: collision with root package name */
    private final List<q.a> f5960h = new ArrayList(0);

    /* renamed from: i, reason: collision with root package name */
    private final List<q.b> f5961i = new ArrayList(0);
    private final List<q.f> j = new ArrayList(0);
    private final List<q.g> k = new ArrayList(0);

    /* renamed from: e, reason: collision with root package name */
    private final n f5957e = new n();

    public f(k kVar, Context context) {
        this.f5955c = kVar;
        this.f5954b = context;
    }

    @Override // f.a.a.a.q
    public boolean a(String str) {
        return this.f5958f.containsKey(str);
    }

    @Override // f.a.a.a.q
    public q.d b(String str) {
        if (this.f5958f.containsKey(str)) {
            throw new IllegalStateException("Plugin key " + str + " is already in use");
        }
        this.f5958f.put(str, null);
        return new a(str);
    }

    public void a(p pVar, Activity activity) {
        this.f5956d = pVar;
        this.f5953a = activity;
        this.f5957e.a(activity, pVar, pVar.getDartExecutor());
    }

    public void a() {
        this.f5957e.b();
        this.f5957e.d();
        this.f5956d = null;
        this.f5953a = null;
    }

    public void b() {
        this.f5957e.e();
    }

    public n c() {
        return this.f5957e;
    }

    private class a implements q.d {

        /* renamed from: a, reason: collision with root package name */
        private final String f5962a;

        a(String str) {
            this.f5962a = str;
        }

        @Override // f.a.a.a.q.d
        public Activity d() {
            return f.this.f5953a;
        }

        @Override // f.a.a.a.q.d
        public Context b() {
            return f.this.f5954b;
        }

        @Override // f.a.a.a.q.d
        public Context e() {
            return f.this.f5953a != null ? f.this.f5953a : f.this.f5954b;
        }

        @Override // f.a.a.a.q.d
        public f.a.a.a.e f() {
            return f.this.f5955c;
        }

        @Override // f.a.a.a.q.d
        public r c() {
            return f.this.f5956d;
        }

        @Override // f.a.a.a.q.d
        public i g() {
            return f.this.f5957e.c();
        }

        @Override // f.a.a.a.q.d
        public p a() {
            return f.this.f5956d;
        }

        @Override // f.a.a.a.q.d
        public String a(String str) {
            return io.flutter.view.i.a(str);
        }

        @Override // f.a.a.a.q.d
        public String a(String str, String str2) {
            return io.flutter.view.i.a(str, str2);
        }

        @Override // f.a.a.a.q.d
        public q.d a(q.e eVar) {
            f.this.f5959g.add(eVar);
            return this;
        }

        @Override // f.a.a.a.q.d
        public q.d a(q.a aVar) {
            f.this.f5960h.add(aVar);
            return this;
        }

        @Override // f.a.a.a.q.d
        public q.d a(q.b bVar) {
            f.this.f5961i.add(bVar);
            return this;
        }

        @Override // f.a.a.a.q.d
        public q.d a(q.g gVar) {
            f.this.k.add(gVar);
            return this;
        }
    }

    @Override // f.a.a.a.q.e
    public boolean a(int i2, String[] strArr, int[] iArr) {
        Iterator<q.e> it = this.f5959g.iterator();
        while (it.hasNext()) {
            if (it.next().a(i2, strArr, iArr)) {
                return true;
            }
        }
        return false;
    }

    @Override // f.a.a.a.q.a
    public boolean onActivityResult(int i2, int i3, Intent intent) {
        Iterator<q.a> it = this.f5960h.iterator();
        while (it.hasNext()) {
            if (it.next().onActivityResult(i2, i3, intent)) {
                return true;
            }
        }
        return false;
    }

    @Override // f.a.a.a.q.b
    public boolean onNewIntent(Intent intent) {
        Iterator<q.b> it = this.f5961i.iterator();
        while (it.hasNext()) {
            if (it.next().onNewIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    @Override // f.a.a.a.q.f
    public void onUserLeaveHint() {
        Iterator<q.f> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().onUserLeaveHint();
        }
    }

    @Override // f.a.a.a.q.g
    public boolean a(k kVar) {
        Iterator<q.g> it = this.k.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().a(kVar)) {
                z = true;
            }
        }
        return z;
    }

    public void d() {
        this.f5957e.d();
    }
}
