package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: a, reason: collision with root package name */
    static final PorterDuff.Mode f565a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private int f566b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f567c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f568d;

    /* renamed from: e, reason: collision with root package name */
    f f569e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f570f;

    /* renamed from: g, reason: collision with root package name */
    Drawable f571g;

    protected boolean b() {
        return true;
    }

    d(f fVar, Resources resources) {
        this.f569e = fVar;
        a(resources);
    }

    d(Drawable drawable) {
        this.f569e = c();
        a(drawable);
    }

    private void a(Resources resources) {
        if (this.f569e == null || this.f569e.f574b == null) {
            return;
        }
        a(this.f569e.f574b.newDrawable(resources));
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f571g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f571g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f571g != null) {
            this.f571g.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f571g.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | (this.f569e != null ? this.f569e.getChangingConfigurations() : 0) | this.f571g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f571g.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f571g.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f571g.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f571g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = (!b() || this.f569e == null) ? null : this.f569e.f575c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f571g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return a(iArr) || this.f571g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f571g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f571g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f571g.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f571g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f571g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f571g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f571g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f571g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f571g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f571g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f571g.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f571g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f569e == null || !this.f569e.a()) {
            return null;
        }
        this.f569e.f573a = getChangingConfigurations();
        return this.f569e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f570f && super.mutate() == this) {
            this.f569e = c();
            if (this.f571g != null) {
                this.f571g.mutate();
            }
            if (this.f569e != null) {
                this.f569e.f574b = this.f571g != null ? this.f571g.getConstantState() : null;
            }
            this.f570f = true;
        }
        return this;
    }

    private f c() {
        return new f(this.f569e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        return this.f571g.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f569e.f575c = colorStateList;
        a(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f569e.f576d = mode;
        a(getState());
    }

    private boolean a(int[] iArr) {
        if (!b()) {
            return false;
        }
        ColorStateList colorStateList = this.f569e.f575c;
        PorterDuff.Mode mode = this.f569e.f576d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f568d || colorForState != this.f566b || mode != this.f567c) {
                setColorFilter(colorForState, mode);
                this.f566b = colorForState;
                this.f567c = mode;
                this.f568d = true;
                return true;
            }
        } else {
            this.f568d = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.c
    public final Drawable a() {
        return this.f571g;
    }

    public final void a(Drawable drawable) {
        if (this.f571g != null) {
            this.f571g.setCallback(null);
        }
        this.f571g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f569e != null) {
                this.f569e.f574b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
