package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.t;
import b.a.a$g;

/* loaded from: classes.dex */
public final class n implements b.d.b.a.b {
    private View A;
    private b.d.g.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a, reason: collision with root package name */
    private final int f166a;

    /* renamed from: b, reason: collision with root package name */
    private final int f167b;

    /* renamed from: c, reason: collision with root package name */
    private final int f168c;

    /* renamed from: d, reason: collision with root package name */
    private final int f169d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f170e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f171f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f172g;

    /* renamed from: h, reason: collision with root package name */
    private char f173h;
    private char j;
    private Drawable l;
    k n;
    private y o;
    private Runnable p;
    private MenuItem.OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private int z;

    /* renamed from: i, reason: collision with root package name */
    private int f174i = 4096;
    private int k = 4096;
    private int m = 0;
    private ColorStateList t = null;
    private PorterDuff.Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private boolean D = false;

    n(k kVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.z = 0;
        this.n = kVar;
        this.f166a = i3;
        this.f167b = i2;
        this.f168c = i4;
        this.f169d = i5;
        this.f170e = charSequence;
        this.z = i6;
    }

    public boolean a() {
        if ((this.q != null && this.q.onMenuItemClick(this)) || this.n.a(this.n, this)) {
            return true;
        }
        if (this.p != null) {
            this.p.run();
            return true;
        }
        if (this.f172g != null) {
            try {
                this.n.e().startActivity(this.f172g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        return this.B != null && this.B.c();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.y |= 16;
        } else {
            this.y &= -17;
        }
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f167b;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f166a;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f168c;
    }

    public int b() {
        return this.f169d;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f172g;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f172g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.j == c2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.n.b(false);
        return this;
    }

    @Override // b.d.b.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.j == c2 && this.k == i2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f173h;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f174i;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f173h == c2) {
            return this;
        }
        this.f173h = c2;
        this.n.b(false);
        return this;
    }

    @Override // b.d.b.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f173h == c2 && this.f174i == i2) {
            return this;
        }
        this.f173h = c2;
        this.f174i = KeyEvent.normalizeMetaState(i2);
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f173h = c2;
        this.j = Character.toLowerCase(c3);
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f173h = c2;
        this.f174i = KeyEvent.normalizeMetaState(i2);
        this.j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i3);
        this.n.b(false);
        return this;
    }

    char c() {
        return this.n.b() ? this.j : this.f173h;
    }

    String d() {
        char c2 = c();
        if (c2 == 0) {
            return "";
        }
        Resources resources = this.n.e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.e()).hasPermanentMenuKey()) {
            sb.append(resources.getString(a$g.abc_prepend_shortcut_label));
        }
        int i2 = this.n.b() ? this.k : this.f174i;
        a(sb, i2, 65536, resources.getString(a$g.abc_menu_meta_shortcut_label));
        a(sb, i2, 4096, resources.getString(a$g.abc_menu_ctrl_shortcut_label));
        a(sb, i2, 2, resources.getString(a$g.abc_menu_alt_shortcut_label));
        a(sb, i2, 1, resources.getString(a$g.abc_menu_shift_shortcut_label));
        a(sb, i2, 4, resources.getString(a$g.abc_menu_sym_shortcut_label));
        a(sb, i2, 8, resources.getString(a$g.abc_menu_function_shortcut_label));
        if (c2 == '\b') {
            sb.append(resources.getString(a$g.abc_menu_delete_shortcut_label));
        } else if (c2 == '\n') {
            sb.append(resources.getString(a$g.abc_menu_enter_shortcut_label));
        } else if (c2 == ' ') {
            sb.append(resources.getString(a$g.abc_menu_space_shortcut_label));
        } else {
            sb.append(c2);
        }
        return sb.toString();
    }

    private static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    boolean e() {
        return this.n.c() && c() != 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    public void a(y yVar) {
        this.o = yVar;
        yVar.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f170e;
    }

    CharSequence a(t.a aVar) {
        if (aVar != null && aVar.c()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f170e = charSequence;
        this.n.b(false);
        if (this.o != null) {
            this.o.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        return setTitle(this.n.e().getString(i2));
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f171f != null ? this.f171f : this.f170e;
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f171f = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f170e;
        }
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        if (this.l != null) {
            return a(this.l);
        }
        if (this.m == 0) {
            return null;
        }
        Drawable drawableB = b.a.a.a.a.b(this.n.e(), this.m);
        this.m = 0;
        this.l = drawableB;
        return a(drawableB);
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.l = null;
        this.m = i2;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // b.d.b.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // b.d.b.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    private Drawable a(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = androidx.core.graphics.drawable.a.f(drawable).mutate();
            if (this.v) {
                androidx.core.graphics.drawable.a.a(drawable, this.t);
            }
            if (this.w) {
                androidx.core.graphics.drawable.a.a(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i2 = this.y;
        this.y = (z ? 1 : 0) | (this.y & (-2));
        if (i2 != this.y) {
            this.n.b(false);
        }
        return this;
    }

    public void a(boolean z) {
        this.y = (z ? 4 : 0) | (this.y & (-5));
    }

    public boolean f() {
        return (this.y & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.y & 4) != 0) {
            this.n.a((MenuItem) this);
        } else {
            b(z);
        }
        return this;
    }

    void b(boolean z) {
        int i2 = this.y;
        this.y = (z ? 2 : 0) | (this.y & (-3));
        if (i2 != this.y) {
            this.n.b(false);
        }
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.B == null || !this.B.a()) ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.B.b();
    }

    boolean c(boolean z) {
        int i2 = this.y;
        this.y = (z ? 0 : 8) | (this.y & (-9));
        return i2 != this.y;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (c(z)) {
            this.n.a(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    public String toString() {
        if (this.f170e != null) {
            return this.f170e.toString();
        }
        return null;
    }

    void a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    public void g() {
        this.n.b(this);
    }

    public boolean h() {
        return this.n.o();
    }

    public boolean i() {
        return (this.y & 32) == 32;
    }

    public boolean j() {
        return (this.z & 1) == 1;
    }

    public boolean k() {
        return (this.z & 2) == 2;
    }

    public void d(boolean z) {
        if (z) {
            this.y |= 32;
        } else {
            this.y &= -33;
        }
    }

    public boolean l() {
        return (this.z & 4) == 4;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
        switch (i2 & 3) {
            case 0:
            case 1:
            case 2:
                this.z = i2;
                this.n.b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    @Override // android.view.MenuItem
    public b.d.b.a.b setActionView(View view) {
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && this.f166a > 0) {
            view.setId(this.f166a);
        }
        this.n.b(this);
        return this;
    }

    @Override // android.view.MenuItem
    public b.d.b.a.b setActionView(int i2) {
        Context contextE = this.n.e();
        setActionView(LayoutInflater.from(contextE).inflate(i2, (ViewGroup) new LinearLayout(contextE), false));
        return this;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        if (this.A != null) {
            return this.A;
        }
        if (this.B == null) {
            return null;
        }
        this.A = this.B.a(this);
        return this.A;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public b.d.g.b m() {
        return this.B;
    }

    @Override // b.d.b.a.b
    public b.d.b.a.b a(b.d.g.b bVar) {
        if (this.B != null) {
            this.B.e();
        }
        this.A = null;
        this.B = bVar;
        this.n.b(true);
        if (this.B != null) {
            this.B.a(new m(this));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public b.d.b.a.b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        if (!n()) {
            return false;
        }
        if (this.C == null || this.C.onMenuItemActionExpand(this)) {
            return this.n.c(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        if (this.C == null || this.C.onMenuItemActionCollapse(this)) {
            return this.n.d(this);
        }
        return false;
    }

    public boolean n() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null && this.B != null) {
            this.A = this.B.a(this);
        }
        return this.A != null;
    }

    public void e(boolean z) {
        this.D = z;
        this.n.b(false);
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public b.d.b.a.b setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public b.d.b.a.b setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.s;
    }
}
