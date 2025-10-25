package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.ActionMode;
import android.widget.EditText;

/* renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0084k extends EditText implements b.d.g.r {
    @Override // b.d.g.r
    public abstract ColorStateList getSupportBackgroundTintList();

    @Override // b.d.g.r
    public abstract PorterDuff.Mode getSupportBackgroundTintMode();

    @Override // android.widget.EditText, android.widget.TextView
    public abstract Editable getText();

    @Override // android.widget.EditText, android.widget.TextView
    public abstract /* bridge */ /* synthetic */ CharSequence getText();

    @Override // android.view.View
    public abstract void setBackgroundDrawable(Drawable drawable);

    @Override // android.view.View
    public abstract void setBackgroundResource(int i2);

    @Override // android.widget.TextView
    public abstract void setCustomSelectionActionModeCallback(ActionMode.Callback callback);

    @Override // b.d.g.r
    public abstract void setSupportBackgroundTintList(ColorStateList colorStateList);

    @Override // b.d.g.r
    public abstract void setSupportBackgroundTintMode(PorterDuff.Mode mode);
}
