package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.k;

/* loaded from: classes.dex */
public class y extends k implements SubMenu {
    private k B;
    private n C;

    public y(Context context, k kVar, n nVar) {
        super(context);
        this.B = kVar;
        this.C = nVar;
    }

    @Override // androidx.appcompat.view.menu.k, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.B.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean b() {
        return this.B.b();
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean c() {
        return this.B.c();
    }

    public Menu q() {
        return this.B;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.C;
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(k.a aVar) {
        this.B.a(aVar);
    }

    @Override // androidx.appcompat.view.menu.k
    public k n() {
        return this.B.n();
    }

    @Override // androidx.appcompat.view.menu.k
    boolean a(k kVar, MenuItem menuItem) {
        return super.a(kVar, menuItem) || this.B.a(kVar, menuItem);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i2) {
        this.C.setIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i2) {
        return (SubMenu) super.d(i2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.a(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i2) {
        return (SubMenu) super.c(i2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.a(view);
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean c(n nVar) {
        return this.B.c(nVar);
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean d(n nVar) {
        return this.B.d(nVar);
    }

    @Override // androidx.appcompat.view.menu.k, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.B.setGroupDividerEnabled(z);
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean a() {
        return this.B.a();
    }
}
