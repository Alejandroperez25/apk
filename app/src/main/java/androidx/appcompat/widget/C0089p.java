package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import b.a.a$i;

/* renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0089p extends PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f426a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f427b;

    static {
        f426a = Build.VERSION.SDK_INT < 21;
    }

    public C0089p(Context context, AttributeSet attributeSet, int i2, int i3) throws IllegalAccessException, IllegalArgumentException {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet, i2, i3);
    }

    private void a(Context context, AttributeSet attributeSet, int i2, int i3) throws IllegalAccessException, IllegalArgumentException {
        aa aaVarA = aa.a(context, attributeSet, a$i.PopupWindow, i2, i3);
        if (aaVarA.e(a$i.PopupWindow_overlapAnchor)) {
            a(aaVarA.a(a$i.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(aaVarA.a(a$i.PopupWindow_android_popupBackground));
        aaVarA.a();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
        if (f426a && this.f427b) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (f426a && this.f427b) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i2, int i3, int i4, int i5) {
        if (f426a && this.f427b) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }

    private void a(boolean z) throws IllegalAccessException, IllegalArgumentException {
        if (f426a) {
            this.f427b = z;
        } else {
            androidx.core.widget.h.a(this, z);
        }
    }
}
