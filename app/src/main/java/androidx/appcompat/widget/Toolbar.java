package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.widget.ActionMenuView;
import b.a.a$i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private boolean B;
    private boolean C;
    private final ArrayList<View> D;
    private final ArrayList<View> E;
    private final int[] F;
    c G;
    private final ActionMenuView.e H;
    private ga I;
    private C0079f J;
    private a K;
    private s.a L;
    private k.a M;
    private boolean N;
    private final Runnable O;

    /* renamed from: a, reason: collision with root package name */
    private ActionMenuView f297a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f298b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f299c;

    /* renamed from: d, reason: collision with root package name */
    private ImageButton f300d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f301e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f302f;

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f303g;

    /* renamed from: h, reason: collision with root package name */
    ImageButton f304h;

    /* renamed from: i, reason: collision with root package name */
    View f305i;
    private Context j;
    private int k;
    private int l;
    private int m;
    int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private H t;
    private int u;
    private int v;
    private int w;
    private CharSequence x;
    private CharSequence y;
    private int z;

    public interface c {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a$a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.H = new ba(this);
        this.O = new ca(this);
        aa aaVarA = aa.a(getContext(), attributeSet, a$i.Toolbar, i2, 0);
        this.l = aaVarA.g(a$i.Toolbar_titleTextAppearance, 0);
        this.m = aaVarA.g(a$i.Toolbar_subtitleTextAppearance, 0);
        this.w = aaVarA.c(a$i.Toolbar_android_gravity, this.w);
        this.n = aaVarA.c(a$i.Toolbar_buttonGravity, 48);
        int iD = aaVarA.d(a$i.Toolbar_titleMargin, 0);
        iD = aaVarA.e(a$i.Toolbar_titleMargins) ? aaVarA.d(a$i.Toolbar_titleMargins, iD) : iD;
        this.s = iD;
        this.r = iD;
        this.q = iD;
        this.p = iD;
        int iD2 = aaVarA.d(a$i.Toolbar_titleMarginStart, -1);
        if (iD2 >= 0) {
            this.p = iD2;
        }
        int iD3 = aaVarA.d(a$i.Toolbar_titleMarginEnd, -1);
        if (iD3 >= 0) {
            this.q = iD3;
        }
        int iD4 = aaVarA.d(a$i.Toolbar_titleMarginTop, -1);
        if (iD4 >= 0) {
            this.r = iD4;
        }
        int iD5 = aaVarA.d(a$i.Toolbar_titleMarginBottom, -1);
        if (iD5 >= 0) {
            this.s = iD5;
        }
        this.o = aaVarA.e(a$i.Toolbar_maxButtonHeight, -1);
        int iD6 = aaVarA.d(a$i.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int iD7 = aaVarA.d(a$i.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int iE = aaVarA.e(a$i.Toolbar_contentInsetLeft, 0);
        int iE2 = aaVarA.e(a$i.Toolbar_contentInsetRight, 0);
        m();
        this.t.b(iE, iE2);
        if (iD6 != Integer.MIN_VALUE || iD7 != Integer.MIN_VALUE) {
            this.t.a(iD6, iD7);
        }
        this.u = aaVarA.d(a$i.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.v = aaVarA.d(a$i.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f302f = aaVarA.a(a$i.Toolbar_collapseIcon);
        this.f303g = aaVarA.b(a$i.Toolbar_collapseContentDescription);
        CharSequence charSequenceB = aaVarA.b(a$i.Toolbar_title);
        if (!TextUtils.isEmpty(charSequenceB)) {
            setTitle(charSequenceB);
        }
        CharSequence charSequenceB2 = aaVarA.b(a$i.Toolbar_subtitle);
        if (!TextUtils.isEmpty(charSequenceB2)) {
            setSubtitle(charSequenceB2);
        }
        this.j = getContext();
        setPopupTheme(aaVarA.g(a$i.Toolbar_popupTheme, 0));
        Drawable drawableA = aaVarA.a(a$i.Toolbar_navigationIcon);
        if (drawableA != null) {
            setNavigationIcon(drawableA);
        }
        CharSequence charSequenceB3 = aaVarA.b(a$i.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(charSequenceB3)) {
            setNavigationContentDescription(charSequenceB3);
        }
        Drawable drawableA2 = aaVarA.a(a$i.Toolbar_logo);
        if (drawableA2 != null) {
            setLogo(drawableA2);
        }
        CharSequence charSequenceB4 = aaVarA.b(a$i.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(charSequenceB4)) {
            setLogoDescription(charSequenceB4);
        }
        if (aaVarA.e(a$i.Toolbar_titleTextColor)) {
            setTitleTextColor(aaVarA.b(a$i.Toolbar_titleTextColor, -1));
        }
        if (aaVarA.e(a$i.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(aaVarA.b(a$i.Toolbar_subtitleTextColor, -1));
        }
        aaVarA.a();
    }

    public void setPopupTheme(int i2) {
        if (this.k != i2) {
            this.k = i2;
            if (i2 == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public int getPopupTheme() {
        return this.k;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public void setTitleMarginStart(int i2) {
        this.p = i2;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public void setTitleMarginTop(int i2) {
        this.r = i2;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public void setTitleMarginEnd(int i2) {
        this.q = i2;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public void setTitleMarginBottom(int i2) {
        this.s = i2;
        requestLayout();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        m();
        this.t.a(i2 == 1);
    }

    public void setLogo(int i2) {
        setLogo(b.a.a.a.a.b(getContext(), i2));
    }

    public boolean a() {
        return this.f297a != null && this.f297a.d();
    }

    public boolean b() {
        return this.f297a != null && this.f297a.c();
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!d(this.f301e)) {
                a((View) this.f301e, true);
            }
        } else if (this.f301e != null && d(this.f301e)) {
            removeView(this.f301e);
            this.E.remove(this.f301e);
        }
        if (this.f301e != null) {
            this.f301e.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        if (this.f301e != null) {
            return this.f301e.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        if (this.f301e != null) {
            this.f301e.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        if (this.f301e != null) {
            return this.f301e.getContentDescription();
        }
        return null;
    }

    private void g() {
        if (this.f301e == null) {
            this.f301e = new C0088o(getContext());
        }
    }

    public void c() {
        androidx.appcompat.view.menu.n nVar = this.K == null ? null : this.K.f307b;
        if (nVar != null) {
            nVar.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f298b == null) {
                Context context = getContext();
                this.f298b = new C0092s(context);
                this.f298b.setSingleLine();
                this.f298b.setEllipsize(TextUtils.TruncateAt.END);
                if (this.l != 0) {
                    this.f298b.setTextAppearance(context, this.l);
                }
                if (this.z != 0) {
                    this.f298b.setTextColor(this.z);
                }
            }
            if (!d(this.f298b)) {
                a((View) this.f298b, true);
            }
        } else if (this.f298b != null && d(this.f298b)) {
            removeView(this.f298b);
            this.E.remove(this.f298b);
        }
        if (this.f298b != null) {
            this.f298b.setText(charSequence);
        }
        this.x = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f299c == null) {
                Context context = getContext();
                this.f299c = new C0092s(context);
                this.f299c.setSingleLine();
                this.f299c.setEllipsize(TextUtils.TruncateAt.END);
                if (this.m != 0) {
                    this.f299c.setTextAppearance(context, this.m);
                }
                if (this.A != 0) {
                    this.f299c.setTextColor(this.A);
                }
            }
            if (!d(this.f299c)) {
                a((View) this.f299c, true);
            }
        } else if (this.f299c != null && d(this.f299c)) {
            removeView(this.f299c);
            this.E.remove(this.f299c);
        }
        if (this.f299c != null) {
            this.f299c.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void a(Context context, int i2) {
        this.l = i2;
        if (this.f298b != null) {
            this.f298b.setTextAppearance(context, i2);
        }
    }

    public void b(Context context, int i2) {
        this.m = i2;
        if (this.f299c != null) {
            this.f299c.setTextAppearance(context, i2);
        }
    }

    public void setTitleTextColor(int i2) {
        this.z = i2;
        if (this.f298b != null) {
            this.f298b.setTextColor(i2);
        }
    }

    public void setSubtitleTextColor(int i2) {
        this.A = i2;
        if (this.f299c != null) {
            this.f299c.setTextColor(i2);
        }
    }

    public CharSequence getNavigationContentDescription() {
        if (this.f300d != null) {
            return this.f300d.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            j();
        }
        if (this.f300d != null) {
            this.f300d.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(b.a.a.a.a.b(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            j();
            if (!d(this.f300d)) {
                a((View) this.f300d, true);
            }
        } else if (this.f300d != null && d(this.f300d)) {
            removeView(this.f300d);
            this.E.remove(this.f300d);
        }
        if (this.f300d != null) {
            this.f300d.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        if (this.f300d != null) {
            return this.f300d.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        j();
        this.f300d.setOnClickListener(onClickListener);
    }

    public Menu getMenu() {
        h();
        return this.f297a.getMenu();
    }

    public void setOverflowIcon(Drawable drawable) {
        h();
        this.f297a.setOverflowIcon(drawable);
    }

    public Drawable getOverflowIcon() {
        h();
        return this.f297a.getOverflowIcon();
    }

    private void h() {
        i();
        if (this.f297a.b() == null) {
            androidx.appcompat.view.menu.k kVar = (androidx.appcompat.view.menu.k) this.f297a.getMenu();
            if (this.K == null) {
                this.K = new a();
            }
            this.f297a.setExpandedActionViewsExclusive(true);
            kVar.a(this.K, this.j);
        }
    }

    private void i() {
        if (this.f297a == null) {
            this.f297a = new ActionMenuView(getContext());
            this.f297a.setPopupTheme(this.k);
            this.f297a.setOnMenuItemClickListener(this.H);
            this.f297a.a(this.L, this.M);
            b bVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            bVarGenerateDefaultLayoutParams.f95a = 8388613 | (this.n & a$i.AppCompatTheme_windowActionBarOverlay);
            this.f297a.setLayoutParams(bVarGenerateDefaultLayoutParams);
            a((View) this.f297a, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new b.a.c.c(getContext());
    }

    public void setOnMenuItemClickListener(c cVar) {
        this.G = cVar;
    }

    public void a(int i2, int i3) {
        m();
        this.t.a(i2, i3);
    }

    public int getContentInsetStart() {
        if (this.t != null) {
            return this.t.c();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        if (this.t != null) {
            return this.t.d();
        }
        return 0;
    }

    public int getContentInsetLeft() {
        if (this.t != null) {
            return this.t.a();
        }
        return 0;
    }

    public int getContentInsetRight() {
        if (this.t != null) {
            return this.t.b();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        return this.u != Integer.MIN_VALUE ? this.u : getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.u) {
            this.u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        return this.v != Integer.MIN_VALUE ? this.v : getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.v) {
            this.v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.u, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.k kVarB;
        if ((this.f297a == null || (kVarB = this.f297a.b()) == null || !kVarB.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.v, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (b.d.g.v.b(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (b.d.g.v.b(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    private void j() {
        if (this.f300d == null) {
            this.f300d = new C0086m(getContext(), null, b.a.a$a.toolbarNavigationButtonStyle);
            b bVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            bVarGenerateDefaultLayoutParams.f95a = 8388611 | (this.n & a$i.AppCompatTheme_windowActionBarOverlay);
            this.f300d.setLayoutParams(bVarGenerateDefaultLayoutParams);
        }
    }

    void d() {
        if (this.f304h == null) {
            this.f304h = new C0086m(getContext(), null, b.a.a$a.toolbarNavigationButtonStyle);
            this.f304h.setImageDrawable(this.f302f);
            this.f304h.setContentDescription(this.f303g);
            b bVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            bVarGenerateDefaultLayoutParams.f95a = 8388611 | (this.n & a$i.AppCompatTheme_windowActionBarOverlay);
            bVarGenerateDefaultLayoutParams.f309b = 2;
            this.f304h.setLayoutParams(bVarGenerateDefaultLayoutParams);
            this.f304h.setOnClickListener(new da(this));
        }
    }

    private void a(View view, boolean z) {
        b bVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            bVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            bVarGenerateLayoutParams = generateLayoutParams(layoutParams);
        } else {
            bVarGenerateLayoutParams = (b) layoutParams;
        }
        bVarGenerateLayoutParams.f309b = 1;
        if (z && this.f305i != null) {
            view.setLayoutParams(bVarGenerateLayoutParams);
            this.E.add(view);
        } else {
            addView(view, bVarGenerateLayoutParams);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        if (this.K != null && this.K.f307b != null) {
            dVar.f310a = this.K.f307b.getItemId();
        }
        dVar.f311b = a();
        return dVar;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.f());
        androidx.appcompat.view.menu.k kVarB = this.f297a != null ? this.f297a.b() : null;
        if (dVar.f310a != 0 && this.K != null && kVarB != null && (menuItemFindItem = kVarB.findItem(dVar.f310a)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (dVar.f311b) {
            k();
        }
    }

    private void k() {
        removeCallbacks(this.O);
        post(this.O);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    private void a(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private boolean l() {
        if (!this.N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int iMax2;
        int measuredHeight;
        int[] iArr = this.F;
        if (na.a(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (a(this.f300d)) {
            a(this.f300d, i2, 0, i3, 0, this.o);
            measuredWidth = this.f300d.getMeasuredWidth() + b(this.f300d);
            iMax = Math.max(0, this.f300d.getMeasuredHeight() + c(this.f300d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f300d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (a(this.f304h)) {
            a(this.f304h, i2, 0, i3, 0, this.o);
            measuredWidth = this.f304h.getMeasuredWidth() + b(this.f304h);
            iMax = Math.max(iMax, this.f304h.getMeasuredHeight() + c(this.f304h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f304h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth) + 0;
        iArr[c2] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (a(this.f297a)) {
            a(this.f297a, i2, iMax3, i3, 0, this.o);
            measuredWidth2 = this.f297a.getMeasuredWidth() + b(this.f297a);
            iMax = Math.max(iMax, this.f297a.getMeasuredHeight() + c(this.f297a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f297a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[c3] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (a(this.f305i)) {
            iMax4 += a(this.f305i, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f305i.getMeasuredHeight() + c(this.f305i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f305i.getMeasuredState());
        }
        if (a(this.f301e)) {
            iMax4 += a(this.f301e, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f301e.getMeasuredHeight() + c(this.f301e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f301e.getMeasuredState());
        }
        int childCount = getChildCount();
        int iMax5 = iMax;
        int iA = iMax4;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((b) childAt.getLayoutParams()).f309b == 0 && a(childAt)) {
                iA += a(childAt, i2, iA, i3, 0, iArr);
                iMax5 = Math.max(iMax5, childAt.getMeasuredHeight() + c(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.r + this.s;
        int i6 = this.p + this.q;
        if (a(this.f298b)) {
            a(this.f298b, i2, iA + i6, i3, i5, iArr);
            int measuredWidth3 = this.f298b.getMeasuredWidth() + b(this.f298b);
            measuredHeight = this.f298b.getMeasuredHeight() + c(this.f298b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f298b.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (a(this.f299c)) {
            iMax2 = Math.max(iMax2, a(this.f299c, i2, iA + i6, i3, measuredHeight + i5, iArr));
            measuredHeight += this.f299c.getMeasuredHeight() + c(this.f299c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f299c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax5, measuredHeight);
        int paddingLeft = iA + iMax2 + getPaddingLeft() + getPaddingRight();
        int paddingTop = iMax6 + getPaddingTop() + getPaddingBottom();
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16);
        if (l()) {
            iResolveSizeAndState2 = 0;
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02aa A[LOOP:0: B:104:0x02a8->B:105:0x02aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02cc A[LOOP:1: B:107:0x02ca->B:108:0x02cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0306 A[LOOP:2: B:116:0x0304->B:117:0x0306, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    private int a(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = i3;
        int i5 = 0;
        int measuredWidth = 0;
        while (i5 < size) {
            View view = list.get(i5);
            b bVar = (b) view.getLayoutParams();
            int i6 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin - i2;
            int i7 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin - i4;
            int iMax = Math.max(0, i6);
            int iMax2 = Math.max(0, i7);
            int iMax3 = Math.max(0, -i6);
            int iMax4 = Math.max(0, -i7);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i5++;
            i4 = iMax4;
            i2 = iMax3;
        }
        return measuredWidth;
    }

    private int a(View view, int i2, int[] iArr, int i3) {
        b bVar = (b) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin - iArr[0];
        int iMax = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int iA = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iA, iMax + measuredWidth, view.getMeasuredHeight() + iA);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
    }

    private int b(View view, int i2, int[] iArr, int i3) {
        b bVar = (b) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iA = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iA, iMax, view.getMeasuredHeight() + iA);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) bVar).leftMargin);
    }

    private int a(View view, int i2) {
        b bVar = (b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int iA = a(bVar.f95a);
        if (iA == 48) {
            return getPaddingTop() - i3;
        }
        if (iA == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (iMax < ((ViewGroup.MarginLayoutParams) bVar).topMargin) {
            iMax = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            if (i4 < ((ViewGroup.MarginLayoutParams) bVar).bottomMargin) {
                iMax = Math.max(0, iMax - (((ViewGroup.MarginLayoutParams) bVar).bottomMargin - i4));
            }
        }
        return paddingTop + iMax;
    }

    private int a(int i2) {
        int i3 = i2 & a$i.AppCompatTheme_windowActionBarOverlay;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.w & a$i.AppCompatTheme_windowActionBarOverlay;
    }

    private void a(List<View> list, int i2) {
        boolean z = b.d.g.v.b(this) == 1;
        int childCount = getChildCount();
        int iA = b.d.g.c.a(i2, b.d.g.v.b(this));
        list.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                b bVar = (b) childAt.getLayoutParams();
                if (bVar.f309b == 0 && a(childAt) && b(bVar.f95a) == iA) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            b bVar2 = (b) childAt2.getLayoutParams();
            if (bVar2.f309b == 0 && a(childAt2) && b(bVar2.f95a) == iA) {
                list.add(childAt2);
            }
        }
    }

    private int b(int i2) {
        int iB = b.d.g.v.b(this);
        int iA = b.d.g.c.a(i2, iB) & 7;
        return (iA == 1 || iA == 3 || iA == 5) ? iA : iB == 1 ? 5 : 3;
    }

    private boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return b.d.g.f.a(marginLayoutParams) + b.d.g.f.b(marginLayoutParams);
    }

    private int c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((b) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.a$a) {
            return new b((androidx.appcompat.app.a$a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    public InterfaceC0095v getWrapper() {
        if (this.I == null) {
            this.I = new ga(this, true);
        }
        return this.I;
    }

    void e() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((b) childAt.getLayoutParams()).f309b != 2 && childAt != this.f297a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    void f() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView(this.E.get(size));
        }
        this.E.clear();
    }

    private boolean d(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.N = z;
        requestLayout();
    }

    private void m() {
        if (this.t == null) {
            this.t = new H();
        }
    }

    C0079f getOuterActionMenuPresenter() {
        return this.J;
    }

    Context getPopupContext() {
        return this.j;
    }

    public static class b extends androidx.appcompat.app.a$a {

        /* renamed from: b, reason: collision with root package name */
        int f309b;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f309b = 0;
        }

        public b(int i2, int i3) {
            super(i2, i3);
            this.f309b = 0;
            this.f95a = 8388627;
        }

        public b(b bVar) {
            super((androidx.appcompat.app.a$a) bVar);
            this.f309b = 0;
            this.f309b = bVar.f309b;
        }

        public b(androidx.appcompat.app.a$a a_a) {
            super(a_a);
            this.f309b = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f309b = 0;
            a(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f309b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public static class d extends b.f.a.c {
        public static final Parcelable.Creator<d> CREATOR = new ea();

        /* renamed from: a, reason: collision with root package name */
        int f310a;

        /* renamed from: b, reason: collision with root package name */
        boolean f311b;

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f310a = parcel.readInt();
            this.f311b = parcel.readInt() != 0;
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.f.a.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f310a);
            parcel.writeInt(this.f311b ? 1 : 0);
        }
    }

    private class a implements androidx.appcompat.view.menu.s {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.k f306a;

        /* renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.n f307b;

        @Override // androidx.appcompat.view.menu.s
        public void a(androidx.appcompat.view.menu.k kVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.s
        public boolean a(androidx.appcompat.view.menu.y yVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.s
        public boolean b() {
            return false;
        }

        a() {
        }

        @Override // androidx.appcompat.view.menu.s
        public void a(Context context, androidx.appcompat.view.menu.k kVar) {
            if (this.f306a != null && this.f307b != null) {
                this.f306a.d(this.f307b);
            }
            this.f306a = kVar;
        }

        @Override // androidx.appcompat.view.menu.s
        public void a(boolean z) {
            if (this.f307b != null) {
                boolean z2 = false;
                if (this.f306a != null) {
                    int size = this.f306a.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (this.f306a.getItem(i2) == this.f307b) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (z2) {
                    return;
                }
                a(this.f306a, this.f307b);
            }
        }

        @Override // androidx.appcompat.view.menu.s
        public boolean b(androidx.appcompat.view.menu.k kVar, androidx.appcompat.view.menu.n nVar) {
            Toolbar.this.d();
            ViewParent parent = Toolbar.this.f304h.getParent();
            if (parent != Toolbar.this) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(Toolbar.this.f304h);
                }
                Toolbar.this.addView(Toolbar.this.f304h);
            }
            Toolbar.this.f305i = nVar.getActionView();
            this.f307b = nVar;
            ViewParent parent2 = Toolbar.this.f305i.getParent();
            if (parent2 != Toolbar.this) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(Toolbar.this.f305i);
                }
                b bVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                bVarGenerateDefaultLayoutParams.f95a = 8388611 | (Toolbar.this.n & a$i.AppCompatTheme_windowActionBarOverlay);
                bVarGenerateDefaultLayoutParams.f309b = 2;
                Toolbar.this.f305i.setLayoutParams(bVarGenerateDefaultLayoutParams);
                Toolbar.this.addView(Toolbar.this.f305i);
            }
            Toolbar.this.e();
            Toolbar.this.requestLayout();
            nVar.e(true);
            if (Toolbar.this.f305i instanceof b.a.c.b) {
                ((b.a.c.b) Toolbar.this.f305i).onActionViewExpanded();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.s
        public boolean a(androidx.appcompat.view.menu.k kVar, androidx.appcompat.view.menu.n nVar) {
            if (Toolbar.this.f305i instanceof b.a.c.b) {
                ((b.a.c.b) Toolbar.this.f305i).onActionViewCollapsed();
            }
            Toolbar.this.removeView(Toolbar.this.f305i);
            Toolbar.this.removeView(Toolbar.this.f304h);
            Toolbar.this.f305i = null;
            Toolbar.this.f();
            this.f307b = null;
            Toolbar.this.requestLayout();
            nVar.e(false);
            return true;
        }
    }
}
