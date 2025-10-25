package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0075b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f355a;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C0075b(ActionBarContainer actionBarContainer) {
        this.f355a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f355a.f214h) {
            if (this.f355a.f213g != null) {
                this.f355a.f213g.draw(canvas);
            }
        } else {
            if (this.f355a.f211e != null) {
                this.f355a.f211e.draw(canvas);
            }
            if (this.f355a.f212f == null || !this.f355a.f215i) {
                return;
            }
            this.f355a.f212f.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f355a.f214h) {
            if (this.f355a.f213g != null) {
                this.f355a.f213g.getOutline(outline);
            }
        } else if (this.f355a.f211e != null) {
            this.f355a.f211e.getOutline(outline);
        }
    }
}
