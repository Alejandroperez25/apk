package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import b.a.a$i;
import io.flutter.embedding.engine.e.l;
import io.flutter.view.r;

/* loaded from: classes.dex */
class m implements l.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f6163a;

    m(n nVar) {
        this.f6163a = nVar;
    }

    @Override // io.flutter.embedding.engine.e.l.d
    @TargetApi(a$i.AppCompatTheme_actionModeBackground)
    public long a(final l.a aVar) {
        a();
        if (!n.b(aVar.f6080e)) {
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + aVar.f6080e + "(view id: " + aVar.f6076a + ")");
        }
        if (!this.f6163a.f6171h.containsKey(Integer.valueOf(aVar.f6076a))) {
            h hVarA = this.f6163a.f6164a.a(aVar.f6077b);
            if (hVarA == null) {
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + aVar.f6077b);
            }
            Object objA = aVar.f6081f != null ? hVarA.a().a(aVar.f6081f) : null;
            int iA = this.f6163a.a(aVar.f6078c);
            int iA2 = this.f6163a.a(aVar.f6079d);
            this.f6163a.a(iA, iA2);
            r.a aVarA = this.f6163a.f6167d.a();
            r rVarA = r.a(this.f6163a.f6165b, this.f6163a.f6170g, hVarA, aVarA, iA, iA2, aVar.f6076a, objA, new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.a
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    m.a(this.f6146a, aVar, view, z);
                }
            });
            if (rVarA != null) {
                if (this.f6163a.f6166c != null) {
                    rVarA.a(this.f6163a.f6166c);
                }
                this.f6163a.f6171h.put(Integer.valueOf(aVar.f6076a), rVarA);
                View viewD = rVarA.d();
                viewD.setLayoutDirection(aVar.f6080e);
                this.f6163a.f6172i.put(viewD.getContext(), viewD);
                return aVarA.c();
            }
            throw new IllegalStateException("Failed creating virtual display for a " + aVar.f6077b + " with id: " + aVar.f6076a);
        }
        throw new IllegalStateException("Trying to create an already created platform view, view id: " + aVar.f6076a);
    }

    public static /* synthetic */ void a(m mVar, l.a aVar, View view, boolean z) {
        if (z) {
            mVar.f6163a.f6169f.a(aVar.f6076a);
        }
    }

    @Override // io.flutter.embedding.engine.e.l.d
    public void a(int i2) {
        a();
        r rVar = this.f6163a.f6171h.get(Integer.valueOf(i2));
        if (rVar != null) {
            if (this.f6163a.f6168e != null) {
                this.f6163a.f6168e.a(i2);
            }
            this.f6163a.f6172i.remove(rVar.d().getContext());
            rVar.a();
            this.f6163a.f6171h.remove(Integer.valueOf(i2));
            return;
        }
        throw new IllegalStateException("Trying to dispose a platform view with unknown id: " + i2);
    }

    @Override // io.flutter.embedding.engine.e.l.d
    public void a(l.b bVar, Runnable runnable) {
        a();
        r rVar = this.f6163a.f6171h.get(Integer.valueOf(bVar.f6082a));
        if (rVar != null) {
            int iA = this.f6163a.a(bVar.f6083b);
            int iA2 = this.f6163a.a(bVar.f6084c);
            this.f6163a.a(iA, iA2);
            this.f6163a.a(rVar);
            rVar.a(iA, iA2, new l(this, rVar, runnable));
            return;
        }
        throw new IllegalStateException("Trying to resize a platform view with unknown id: " + bVar.f6082a);
    }

    @Override // io.flutter.embedding.engine.e.l.d
    public void a(l.c cVar) {
        a();
        float f2 = this.f6163a.f6165b.getResources().getDisplayMetrics().density;
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) n.b(cVar.f6090f).toArray(new MotionEvent.PointerProperties[cVar.f6089e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) n.b(cVar.f6091g, f2).toArray(new MotionEvent.PointerCoords[cVar.f6089e]);
        if (!this.f6163a.f6171h.containsKey(Integer.valueOf(cVar.f6085a))) {
            throw new IllegalStateException("Sending touch to an unknown view with id: " + cVar.f6085a);
        }
        this.f6163a.f6171h.get(Integer.valueOf(cVar.f6085a)).d().dispatchTouchEvent(MotionEvent.obtain(cVar.f6086b.longValue(), cVar.f6087c.longValue(), cVar.f6088d, cVar.f6089e, pointerPropertiesArr, pointerCoordsArr, cVar.f6092h, cVar.f6093i, cVar.j, cVar.k, cVar.l, cVar.m, cVar.n, cVar.o));
    }

    @Override // io.flutter.embedding.engine.e.l.d
    @TargetApi(a$i.AppCompatTheme_actionModeBackground)
    public void a(int i2, int i3) {
        a();
        if (!n.b(i3)) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
        View viewD = this.f6163a.f6171h.get(Integer.valueOf(i2)).d();
        if (viewD == null) {
            throw new IllegalStateException("Sending touch to an unknown view with id: " + i3);
        }
        viewD.setLayoutDirection(i3);
    }

    @Override // io.flutter.embedding.engine.e.l.d
    public void b(int i2) {
        this.f6163a.f6171h.get(Integer.valueOf(i2)).d().clearFocus();
    }

    private void a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + Build.VERSION.SDK_INT + ", required API level is: 20");
    }
}
