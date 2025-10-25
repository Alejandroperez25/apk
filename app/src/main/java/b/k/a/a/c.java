package b.k.a.a;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class c implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f1223a;

    c(d dVar) {
        this.f1223a = dVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        this.f1223a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f1223a.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f1223a.unscheduleSelf(runnable);
    }
}
