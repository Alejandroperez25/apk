package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.widget.aa;
import b.a.a$a;
import b.a.a$e;
import b.a.a$f;
import b.a.a$i;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements t.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    private n f105a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f106b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f107c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f108d;

    /* renamed from: e, reason: collision with root package name */
    private CheckBox f109e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f110f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f111g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f112h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f113i;
    private Drawable j;
    private int k;
    private Context l;
    private boolean m;
    private Drawable n;
    private boolean o;
    private int p;
    private LayoutInflater q;
    private boolean r;

    @Override // androidx.appcompat.view.menu.t.a
    public boolean c() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a$a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        aa aaVarA = aa.a(getContext(), attributeSet, a$i.MenuView, i2, 0);
        this.j = aaVarA.a(a$i.MenuView_android_itemBackground);
        this.k = aaVarA.g(a$i.MenuView_android_itemTextAppearance, -1);
        this.m = aaVarA.a(a$i.MenuView_preserveIconSpacing, false);
        this.l = context;
        this.n = aaVarA.a(a$i.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, a$a.dropDownListViewStyle, 0);
        this.o = typedArrayObtainStyledAttributes.hasValue(0);
        aaVarA.a();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        b.d.g.v.a(this, this.j);
        this.f108d = (TextView) findViewById(a$e.title);
        if (this.k != -1) {
            this.f108d.setTextAppearance(this.l, this.k);
        }
        this.f110f = (TextView) findViewById(a$e.shortcut);
        this.f111g = (ImageView) findViewById(a$e.submenuarrow);
        if (this.f111g != null) {
            this.f111g.setImageDrawable(this.n);
        }
        this.f112h = (ImageView) findViewById(a$e.group_divider);
        this.f113i = (LinearLayout) findViewById(a$e.content);
    }

    @Override // androidx.appcompat.view.menu.t.a
    public void a(n nVar, int i2) {
        this.f105a = nVar;
        this.p = i2;
        setVisibility(nVar.isVisible() ? 0 : 8);
        setTitle(nVar.a(this));
        setCheckable(nVar.isCheckable());
        a(nVar.e(), nVar.c());
        setIcon(nVar.getIcon());
        setEnabled(nVar.isEnabled());
        setSubMenuArrowVisible(nVar.hasSubMenu());
        setContentDescription(nVar.getContentDescription());
    }

    private void a(View view) {
        a(view, -1);
    }

    private void a(View view, int i2) {
        if (this.f113i != null) {
            this.f113i.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.m = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f108d.setText(charSequence);
            if (this.f108d.getVisibility() != 0) {
                this.f108d.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f108d.getVisibility() != 8) {
            this.f108d.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.t.a
    public n getItemData() {
        return this.f105a;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f107c == null && this.f109e == null) {
            return;
        }
        if (this.f105a.f()) {
            if (this.f107c == null) {
                b();
            }
            compoundButton = this.f107c;
            compoundButton2 = this.f109e;
        } else {
            if (this.f109e == null) {
                d();
            }
            compoundButton = this.f109e;
            compoundButton2 = this.f107c;
        }
        if (z) {
            compoundButton.setChecked(this.f105a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        if (this.f109e != null) {
            this.f109e.setVisibility(8);
        }
        if (this.f107c != null) {
            this.f107c.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f105a.f()) {
            if (this.f107c == null) {
                b();
            }
            compoundButton = this.f107c;
        } else {
            if (this.f109e == null) {
                d();
            }
            compoundButton = this.f109e;
        }
        compoundButton.setChecked(z);
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.f111g != null) {
            this.f111g.setVisibility(z ? 0 : 8);
        }
    }

    public void a(boolean z, char c2) {
        int i2 = (z && this.f105a.e()) ? 0 : 8;
        if (i2 == 0) {
            this.f110f.setText(this.f105a.d());
        }
        if (this.f110f.getVisibility() != i2) {
            this.f110f.setVisibility(i2);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f105a.h() || this.r;
        if (z || this.m) {
            if (this.f106b == null && drawable == null && !this.m) {
                return;
            }
            if (this.f106b == null) {
                a();
            }
            if (drawable != null || this.m) {
                ImageView imageView = this.f106b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f106b.getVisibility() != 0) {
                    this.f106b.setVisibility(0);
                    return;
                }
                return;
            }
            this.f106b.setVisibility(8);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f106b != null && this.m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f106b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i2, i3);
    }

    private void a() {
        this.f106b = (ImageView) getInflater().inflate(a$f.abc_list_menu_item_icon, (ViewGroup) this, false);
        a(this.f106b, 0);
    }

    private void b() {
        this.f107c = (RadioButton) getInflater().inflate(a$f.abc_list_menu_item_radio, (ViewGroup) this, false);
        a(this.f107c);
    }

    private void d() {
        this.f109e = (CheckBox) getInflater().inflate(a$f.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        a(this.f109e);
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    public void setGroupDividerEnabled(boolean z) {
        if (this.f112h != null) {
            this.f112h.setVisibility((this.o || !z) ? 8 : 0);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        if (this.f112h == null || this.f112h.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f112h.getLayoutParams();
        rect.top += this.f112h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }
}
