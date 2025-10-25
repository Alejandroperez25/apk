package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0086m extends ImageButton implements b.d.g.r, androidx.core.widget.j {

    /* renamed from: a, reason: collision with root package name */
    private final C0082i f415a;

    /* renamed from: b, reason: collision with root package name */
    private final C0087n f416b;

    public C0086m(Context context, AttributeSet attributeSet, int i2) {
        super(X.a(context), attributeSet, i2);
        this.f415a = new C0082i(this);
        this.f415a.a(attributeSet, i2);
        this.f416b = new C0087n(this);
        this.f416b.a(attributeSet, i2);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        this.f416b.a(i2);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f416b != null) {
            this.f416b.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f416b != null) {
            this.f416b.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f416b != null) {
            this.f416b.d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        if (this.f415a != null) {
            this.f415a.a(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f415a != null) {
            this.f415a.a(drawable);
        }
    }

    @Override // b.d.g.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f415a != null) {
            this.f415a.a(colorStateList);
        }
    }

    @Override // b.d.g.r
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f415a != null) {
            return this.f415a.a();
        }
        return null;
    }

    @Override // b.d.g.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f415a != null) {
            this.f415a.a(mode);
        }
    }

    @Override // b.d.g.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f415a != null) {
            return this.f415a.b();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f416b != null) {
            this.f416b.a(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public ColorStateList getSupportImageTintList() {
        if (this.f416b != null) {
            return this.f416b.b();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f416b != null) {
            this.f416b.a(mode);
        }
    }

    @Override // androidx.core.widget.j
    public PorterDuff.Mode getSupportImageTintMode() {
        if (this.f416b != null) {
            return this.f416b.c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f415a != null) {
            this.f415a.c();
        }
        if (this.f416b != null) {
            this.f416b.d();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f416b.a() && super.hasOverlappingRendering();
    }
}
