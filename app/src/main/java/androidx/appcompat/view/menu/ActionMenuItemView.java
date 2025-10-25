package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.widget.AbstractViewOnTouchListenerC0099z;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0092s;
import androidx.appcompat.widget.ha;
import b.a.a$i;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0092s implements t.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: d, reason: collision with root package name */
    n f96d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f97e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f98f;

    /* renamed from: g, reason: collision with root package name */
    k.b f99g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractViewOnTouchListenerC0099z f100h;

    /* renamed from: i, reason: collision with root package name */
    b f101i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;

    public static abstract class b {
        public abstract u a();
    }

    @Override // androidx.appcompat.view.menu.t.a
    public boolean c() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.j = e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a$i.ActionMenuItemView, i2, 0);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(a$i.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.n = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.m = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.j = e();
        f();
    }

    private boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.m = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    @Override // androidx.appcompat.view.menu.t.a
    public n getItemData() {
        return this.f96d;
    }

    @Override // androidx.appcompat.view.menu.t.a
    public void a(n nVar, int i2) {
        this.f96d = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.a(this));
        setId(nVar.getItemId());
        setVisibility(nVar.isVisible() ? 0 : 8);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.f100h == null) {
            this.f100h = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f96d.hasSubMenu() && this.f100h != null && this.f100h.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f99g != null) {
            this.f99g.a(this.f96d);
        }
    }

    public void setItemInvoker(k.b bVar) {
        this.f99g = bVar;
    }

    public void setPopupCallback(b bVar) {
        this.f101i = bVar;
    }

    public void setExpandedFormat(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (this.f96d != null) {
                this.f96d.g();
            }
        }
    }

    private void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f97e);
        if (this.f98f != null && (!this.f96d.l() || (!this.j && !this.k))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f97e : null);
        CharSequence contentDescription = this.f96d.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f96d.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f96d.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            ha.a(this, z3 ? null : this.f96d.getTitle());
        } else {
            ha.a(this, tooltipText);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f98f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.n) {
                float f2 = this.n / intrinsicWidth;
                intrinsicWidth = this.n;
                intrinsicHeight = (int) (intrinsicHeight * f2);
            }
            if (intrinsicHeight > this.n) {
                float f3 = this.n / intrinsicHeight;
                intrinsicHeight = this.n;
                intrinsicWidth = (int) (intrinsicWidth * f3);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.f97e = charSequence;
        f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return d() && this.f96d.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return d();
    }

    @Override // androidx.appcompat.widget.C0092s, android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        boolean zD = d();
        if (zD && this.m >= 0) {
            super.setPadding(this.m, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.l) : this.l;
        if (mode != 1073741824 && this.l > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (zD || this.f98f == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f98f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    private class a extends AbstractViewOnTouchListenerC0099z {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0099z
        public u a() {
            if (ActionMenuItemView.this.f101i != null) {
                return ActionMenuItemView.this.f101i.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0099z
        protected boolean b() {
            u uVarA;
            return ActionMenuItemView.this.f99g != null && ActionMenuItemView.this.f99g.a(ActionMenuItemView.this.f96d) && (uVarA = a()) != null && uVarA.c();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
