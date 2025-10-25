package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import b.a.a$c;
import b.a.a$e;
import b.a.a$f;
import b.a.a$h;

/* loaded from: classes.dex */
class la {

    /* renamed from: a, reason: collision with root package name */
    private final Context f408a;

    /* renamed from: b, reason: collision with root package name */
    private final View f409b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f410c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f411d = new WindowManager.LayoutParams();

    /* renamed from: e, reason: collision with root package name */
    private final Rect f412e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private final int[] f413f = new int[2];

    /* renamed from: g, reason: collision with root package name */
    private final int[] f414g = new int[2];

    la(Context context) {
        this.f408a = context;
        this.f409b = LayoutInflater.from(this.f408a).inflate(a$f.abc_tooltip, (ViewGroup) null);
        this.f410c = (TextView) this.f409b.findViewById(a$e.message);
        this.f411d.setTitle(getClass().getSimpleName());
        this.f411d.packageName = this.f408a.getPackageName();
        this.f411d.type = 1002;
        this.f411d.width = -2;
        this.f411d.height = -2;
        this.f411d.format = -3;
        this.f411d.windowAnimations = a$h.Animation_AppCompat_Tooltip;
        this.f411d.flags = 24;
    }

    void a(View view, int i2, int i3, boolean z, CharSequence charSequence) throws Resources.NotFoundException {
        if (b()) {
            a();
        }
        this.f410c.setText(charSequence);
        a(view, i2, i3, z, this.f411d);
        ((WindowManager) this.f408a.getSystemService("window")).addView(this.f409b, this.f411d);
    }

    void a() {
        if (b()) {
            ((WindowManager) this.f408a.getSystemService("window")).removeView(this.f409b);
        }
    }

    boolean b() {
        return this.f409b.getParent() != null;
    }

    private void a(View view, int i2, int i3, boolean z, WindowManager.LayoutParams layoutParams) throws Resources.NotFoundException {
        int height;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f408a.getResources().getDimensionPixelOffset(a$c.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f408a.getResources().getDimensionPixelOffset(a$c.tooltip_precise_anchor_extra_offset);
            height = i3 + dimensionPixelOffset2;
            i4 = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i4 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f408a.getResources().getDimensionPixelOffset(z ? a$c.tooltip_y_offset_touch : a$c.tooltip_y_offset_non_touch);
        View viewA = a(view);
        if (viewA == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewA.getWindowVisibleDisplayFrame(this.f412e);
        if (this.f412e.left < 0 && this.f412e.top < 0) {
            Resources resources = this.f408a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f412e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewA.getLocationOnScreen(this.f414g);
        view.getLocationOnScreen(this.f413f);
        int[] iArr = this.f413f;
        iArr[0] = iArr[0] - this.f414g[0];
        int[] iArr2 = this.f413f;
        iArr2[1] = iArr2[1] - this.f414g[1];
        layoutParams.x = (this.f413f[0] + i2) - (viewA.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f409b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f409b.getMeasuredHeight();
        int i5 = ((this.f413f[1] + i4) - dimensionPixelOffset3) - measuredHeight;
        int i6 = this.f413f[1] + height + dimensionPixelOffset3;
        if (z) {
            if (i5 >= 0) {
                layoutParams.y = i5;
                return;
            } else {
                layoutParams.y = i6;
                return;
            }
        }
        if (measuredHeight + i6 <= this.f412e.height()) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i5;
        }
    }

    private static View a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
