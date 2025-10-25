package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: androidx.appcompat.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0088o extends ImageView implements b.d.g.r, androidx.core.widget.j {

    /* renamed from: a, reason: collision with root package name */
    private final C0082i f424a;

    /* renamed from: b, reason: collision with root package name */
    private final C0087n f425b;

    public C0088o(Context context) {
        this(context, null);
    }

    public C0088o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0088o(Context context, AttributeSet attributeSet, int i2) {
        super(X.a(context), attributeSet, i2);
        this.f424a = new C0082i(this);
        this.f424a.a(attributeSet, i2);
        this.f425b = new C0087n(this);
        this.f425b.a(attributeSet, i2);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        if (this.f425b != null) {
            this.f425b.a(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f425b != null) {
            this.f425b.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f425b != null) {
            this.f425b.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f425b != null) {
            this.f425b.d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        if (this.f424a != null) {
            this.f424a.a(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f424a != null) {
            this.f424a.a(drawable);
        }
    }

    @Override // b.d.g.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f424a != null) {
            this.f424a.a(colorStateList);
        }
    }

    @Override // b.d.g.r
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f424a != null) {
            return this.f424a.a();
        }
        return null;
    }

    @Override // b.d.g.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f424a != null) {
            this.f424a.a(mode);
        }
    }

    @Override // b.d.g.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f424a != null) {
            return this.f424a.b();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f425b != null) {
            this.f425b.a(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public ColorStateList getSupportImageTintList() {
        if (this.f425b != null) {
            return this.f425b.b();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f425b != null) {
            this.f425b.a(mode);
        }
    }

    @Override // androidx.core.widget.j
    public PorterDuff.Mode getSupportImageTintMode() {
        if (this.f425b != null) {
            return this.f425b.c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f424a != null) {
            this.f424a.c();
        }
        if (this.f425b != null) {
            this.f425b.d();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f425b.a() && super.hasOverlappingRendering();
    }
}
