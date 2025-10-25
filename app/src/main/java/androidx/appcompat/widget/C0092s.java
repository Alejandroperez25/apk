package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import b.d.e.a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: androidx.appcompat.widget.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0092s extends TextView implements b.d.g.r, androidx.core.widget.b {

    /* renamed from: a, reason: collision with root package name */
    private final C0082i f439a;

    /* renamed from: b, reason: collision with root package name */
    private final C0091r f440b;

    /* renamed from: c, reason: collision with root package name */
    private Future<b.d.e.a> f441c;

    public C0092s(Context context) {
        this(context, null);
    }

    public C0092s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public C0092s(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        super(X.a(context), attributeSet, i2);
        this.f439a = new C0082i(this);
        this.f439a.a(attributeSet, i2);
        this.f440b = new C0091r(this);
        this.f440b.a(attributeSet, i2);
        this.f440b.a();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        if (this.f439a != null) {
            this.f439a.a(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f439a != null) {
            this.f439a.a(drawable);
        }
    }

    @Override // b.d.g.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f439a != null) {
            this.f439a.a(colorStateList);
        }
    }

    @Override // b.d.g.r
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f439a != null) {
            return this.f439a.a();
        }
        return null;
    }

    @Override // b.d.g.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f439a != null) {
            this.f439a.a(mode);
        }
    }

    @Override // b.d.g.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f439a != null) {
            return this.f439a.b();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (this.f440b != null) {
            this.f440b.a(context, i2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f439a != null) {
            this.f439a.c();
        }
        if (this.f440b != null) {
            this.f440b.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (this.f440b != null) {
            this.f440b.a(z, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (androidx.core.widget.b.f606a) {
            super.setTextSize(i2, f2);
        } else if (this.f440b != null) {
            this.f440b.a(i2, f2);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        if (this.f440b == null || androidx.core.widget.b.f606a || !this.f440b.c()) {
            return;
        }
        this.f440b.b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (androidx.core.widget.b.f606a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
        } else if (this.f440b != null) {
            this.f440b.a(i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (androidx.core.widget.b.f606a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        } else if (this.f440b != null) {
            this.f440b.a(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (androidx.core.widget.b.f606a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        } else if (this.f440b != null) {
            this.f440b.a(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f606a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        if (this.f440b != null) {
            return this.f440b.d();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f606a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f440b != null) {
            return this.f440b.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f606a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f440b != null) {
            return this.f440b.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f606a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f440b != null) {
            return this.f440b.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f606a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f440b != null) {
            return this.f440b.h();
        }
        return new int[0];
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0085l.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            androidx.core.widget.i.a(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            androidx.core.widget.i.b(this, i2);
        }
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.i.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.i.b(this);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        androidx.core.widget.i.c(this, i2);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.a(this, callback));
    }

    public a.C0015a getTextMetricsParamsCompat() {
        return androidx.core.widget.i.c(this);
    }

    public void setTextMetricsParamsCompat(a.C0015a c0015a) {
        androidx.core.widget.i.a(this, c0015a);
    }

    public void setPrecomputedText(b.d.e.a aVar) {
        androidx.core.widget.i.a(this, aVar);
    }

    private void d() {
        if (this.f441c != null) {
            try {
                Future<b.d.e.a> future = this.f441c;
                this.f441c = null;
                androidx.core.widget.i.a(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        d();
        return super.getText();
    }

    public void setTextFuture(Future<b.d.e.a> future) {
        this.f441c = future;
        requestLayout();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        d();
        super.onMeasure(i2, i3);
    }
}
