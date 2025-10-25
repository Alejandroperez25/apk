package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0081h extends AutoCompleteTextView implements b.d.g.r {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f379a = {android.R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    private final C0082i f380b;

    /* renamed from: c, reason: collision with root package name */
    private final C0091r f381c;

    public AbstractC0081h(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        super(X.a(context), attributeSet, i2);
        aa aaVarA = aa.a(getContext(), attributeSet, f379a, i2, 0);
        if (aaVarA.e(0)) {
            setDropDownBackgroundDrawable(aaVarA.a(0));
        }
        aaVarA.a();
        this.f380b = new C0082i(this);
        this.f380b.a(attributeSet, i2);
        this.f381c = new C0091r(this);
        this.f381c.a(attributeSet, i2);
        this.f381c.a();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(b.a.a.a.a.b(getContext(), i2));
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        if (this.f380b != null) {
            this.f380b.a(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f380b != null) {
            this.f380b.a(drawable);
        }
    }

    @Override // b.d.g.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f380b != null) {
            this.f380b.a(colorStateList);
        }
    }

    @Override // b.d.g.r
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f380b != null) {
            return this.f380b.a();
        }
        return null;
    }

    @Override // b.d.g.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f380b != null) {
            this.f380b.a(mode);
        }
    }

    @Override // b.d.g.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f380b != null) {
            return this.f380b.b();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f380b != null) {
            this.f380b.c();
        }
        if (this.f381c != null) {
            this.f381c.a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (this.f381c != null) {
            this.f381c.a(context, i2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0085l.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.a(this, callback));
    }
}
