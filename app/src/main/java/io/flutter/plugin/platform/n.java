package io.flutter.plugin.platform;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import io.flutter.embedding.engine.e.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class n implements k {

    /* renamed from: b, reason: collision with root package name */
    private Context f6165b;

    /* renamed from: c, reason: collision with root package name */
    private View f6166c;

    /* renamed from: d, reason: collision with root package name */
    private io.flutter.view.r f6167d;

    /* renamed from: e, reason: collision with root package name */
    private f.a.a.b.c f6168e;

    /* renamed from: f, reason: collision with root package name */
    private io.flutter.embedding.engine.e.l f6169f;
    private final l.d j = new m(this);

    /* renamed from: a, reason: collision with root package name */
    private final j f6164a = new j();

    /* renamed from: h, reason: collision with root package name */
    final HashMap<Integer, r> f6171h = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final b f6170g = new b();

    /* renamed from: i, reason: collision with root package name */
    private final HashMap<Context, View> f6172i = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(int i2) {
        return i2 == 0 || i2 == 1;
    }

    public void a(Context context, io.flutter.view.r rVar, io.flutter.embedding.engine.a.b bVar) {
        if (this.f6165b != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f6165b = context;
        this.f6167d = rVar;
        this.f6169f = new io.flutter.embedding.engine.e.l(bVar);
        this.f6169f.a(this.j);
    }

    public void b() {
        this.f6169f.a((l.d) null);
        this.f6169f = null;
        this.f6165b = null;
        this.f6167d = null;
    }

    @Override // io.flutter.plugin.platform.k
    public void a(io.flutter.view.g gVar) {
        this.f6170g.a(gVar);
    }

    @Override // io.flutter.plugin.platform.k
    public void a() {
        this.f6170g.a(null);
    }

    public void a(f.a.a.b.c cVar) {
        this.f6168e = cVar;
    }

    public boolean a(View view) {
        if (!this.f6172i.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.f6172i.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    public i c() {
        return this.f6164a;
    }

    public void d() {
        f();
    }

    public void e() {
        f();
    }

    @Override // io.flutter.plugin.platform.k
    public View a(Integer num) {
        r rVar = this.f6171h.get(num);
        if (rVar == null) {
            return null;
        }
        return rVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(r rVar) {
        if (this.f6168e == null) {
            return;
        }
        this.f6168e.b();
        rVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(r rVar) {
        if (this.f6168e == null) {
            return;
        }
        this.f6168e.c();
        rVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<MotionEvent.PointerProperties> b(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c(it.next()));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties c(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<MotionEvent.PointerCoords> b(Object obj, float f2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c(it.next(), f2));
        }
        return arrayList;
    }

    private static MotionEvent.PointerCoords c(Object obj, float f2) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f2;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f2;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f2;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f2;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f2;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f2;
        return pointerCoords;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, int i3) {
        DisplayMetrics displayMetrics = this.f6165b.getResources().getDisplayMetrics();
        if (i3 > displayMetrics.heightPixels || i2 > displayMetrics.widthPixels) {
            Log.w("PlatformViewsController", "Creating a virtual display of size: [" + i2 + ", " + i3 + "] may result in problems(https://github.com/flutter/flutter/issues/2897).It is larger than the device screen size: [" + displayMetrics.widthPixels + ", " + displayMetrics.heightPixels + "].");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(double d2) {
        return (int) Math.round(d2 * this.f6165b.getResources().getDisplayMetrics().density);
    }

    private void f() {
        Iterator<r> it = this.f6171h.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f6171h.clear();
    }
}
