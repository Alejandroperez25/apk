package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class k implements b.d.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f156a = {1, 4, 5, 3, 2, 0};
    private boolean A;

    /* renamed from: b, reason: collision with root package name */
    private final Context f157b;

    /* renamed from: c, reason: collision with root package name */
    private final Resources f158c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f159d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f160e;

    /* renamed from: f, reason: collision with root package name */
    private a f161f;
    private ContextMenu.ContextMenuInfo n;
    CharSequence o;
    Drawable p;
    View q;
    private n y;
    private int m = 0;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private ArrayList<n> w = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<s>> x = new CopyOnWriteArrayList<>();
    private boolean z = false;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<n> f162g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<n> f163h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private boolean f164i = true;
    private ArrayList<n> j = new ArrayList<>();
    private ArrayList<n> k = new ArrayList<>();
    private boolean l = true;

    public interface a {
        void a(k kVar);

        boolean a(k kVar, MenuItem menuItem);
    }

    public interface b {
        boolean a(n nVar);
    }

    public k n() {
        return this;
    }

    public k(Context context) {
        this.f157b = context;
        this.f158c = context.getResources();
        d(true);
    }

    public void a(s sVar, Context context) {
        this.x.add(new WeakReference<>(sVar));
        sVar.a(context, this);
        this.l = true;
    }

    public void a(s sVar) {
        Iterator<WeakReference<s>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<s> next = it.next();
            s sVar2 = next.get();
            if (sVar2 == null || sVar2 == sVar) {
                this.x.remove(next);
            }
        }
    }

    private void c(boolean z) {
        if (this.x.isEmpty()) {
            return;
        }
        g();
        Iterator<WeakReference<s>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<s> next = it.next();
            s sVar = next.get();
            if (sVar == null) {
                this.x.remove(next);
            } else {
                sVar.a(z);
            }
        }
        h();
    }

    private boolean a(y yVar, s sVar) {
        if (this.x.isEmpty()) {
            return false;
        }
        boolean zA = sVar != null ? sVar.a(yVar) : false;
        Iterator<WeakReference<s>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<s> next = it.next();
            s sVar2 = next.get();
            if (sVar2 == null) {
                this.x.remove(next);
            } else if (!zA) {
                zA = sVar2.a(yVar);
            }
        }
        return zA;
    }

    public void a(a aVar) {
        this.f161f = aVar;
    }

    protected MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int iE = e(i4);
        n nVarA = a(i2, i3, i4, iE, charSequence, this.m);
        if (this.n != null) {
            nVarA.a(this.n);
        }
        this.f162g.add(a(this.f162g, iE), nVarA);
        b(true);
        return nVarA;
    }

    private n a(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new n(this, i2, i3, i4, i5, charSequence, i6);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f158c.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f158c.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f158c.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        n nVar = (n) a(i2, i3, i4, charSequence);
        y yVar = new y(this.f157b, this, nVar);
        nVar.a(yVar);
        return yVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f158c.getString(i5));
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.z = z;
    }

    public boolean a() {
        return this.z;
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f157b.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        a(a(i2), true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int iB = b(i2);
        if (iB >= 0) {
            int size = this.f162g.size() - iB;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f162g.get(iB).getGroupId() != i2) {
                    break;
                }
                a(iB, false);
                i3 = i4;
            }
            b(true);
        }
    }

    private void a(int i2, boolean z) {
        if (i2 < 0 || i2 >= this.f162g.size()) {
            return;
        }
        this.f162g.remove(i2);
        if (z) {
            b(true);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        if (this.y != null) {
            d(this.y);
        }
        this.f162g.clear();
        b(true);
    }

    void a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f162g.size();
        g();
        for (int i2 = 0; i2 < size; i2++) {
            n nVar = this.f162g.get(i2);
            if (nVar.getGroupId() == groupId && nVar.f() && nVar.isCheckable()) {
                nVar.b(nVar == menuItem);
            }
        }
        h();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.f162g.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = this.f162g.get(i3);
            if (nVar.getGroupId() == i2) {
                nVar.a(z2);
                nVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
        int size = this.f162g.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = this.f162g.get(i3);
            if (nVar.getGroupId() == i2 && nVar.c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            b(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
        int size = this.f162g.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = this.f162g.get(i3);
            if (nVar.getGroupId() == i2) {
                nVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.A) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f162g.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = this.f162g.get(i3);
            if (nVar.getItemId() == i2) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (menuItemFindItem = nVar.getSubMenu().findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int a(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f162g.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    public int b(int i2) {
        return a(i2, 0);
    }

    public int a(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f162g.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public int size() {
        return this.f162g.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f162g.get(i2);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return a(i2, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f159d = z;
        b(false);
    }

    private static int e(int i2) {
        int i3 = ((-65536) & i2) >> 16;
        if (i3 < 0 || i3 >= f156a.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        return (i2 & 65535) | (f156a[i3] << 16);
    }

    boolean b() {
        return this.f159d;
    }

    private void d(boolean z) {
        this.f160e = z && this.f158c.getConfiguration().keyboard != 1 && b.d.g.w.a(ViewConfiguration.get(this.f157b), this.f157b);
    }

    public boolean c() {
        return this.f160e;
    }

    Resources d() {
        return this.f158c;
    }

    public Context e() {
        return this.f157b;
    }

    boolean a(k kVar, MenuItem menuItem) {
        return this.f161f != null && this.f161f.a(kVar, menuItem);
    }

    public void f() {
        if (this.f161f != null) {
            this.f161f.a(this);
        }
    }

    private static int a(ArrayList<n> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).b() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        n nVarA = a(i2, keyEvent);
        boolean zA = nVarA != null ? a(nVarA, i3) : false;
        if ((i3 & 2) != 0) {
            a(true);
        }
        return zA;
    }

    void a(List<n> list, int i2, KeyEvent keyEvent) {
        boolean zB = b();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f162g.size();
            for (int i3 = 0; i3 < size; i3++) {
                n nVar = this.f162g.get(i3);
                if (nVar.hasSubMenu()) {
                    ((k) nVar.getSubMenu()).a(list, i2, keyEvent);
                }
                char alphabeticShortcut = zB ? nVar.getAlphabeticShortcut() : nVar.getNumericShortcut();
                if (((modifiers & 69647) == ((zB ? nVar.getAlphabeticModifiers() : nVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (zB && alphabeticShortcut == '\b' && i2 == 67)) && nVar.isEnabled())) {
                    list.add(nVar);
                }
            }
        }
    }

    n a(int i2, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<n> arrayList = this.w;
        arrayList.clear();
        a(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zB = b();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = arrayList.get(i3);
            if (zB) {
                numericShortcut = nVar.getAlphabeticShortcut();
            } else {
                numericShortcut = nVar.getNumericShortcut();
            }
            if ((numericShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((numericShortcut == keyData.meta[2] && (metaState & 2) != 0) || (zB && numericShortcut == '\b' && i2 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return a(findItem(i2), i3);
    }

    public boolean a(MenuItem menuItem, int i2) {
        return a(menuItem, (s) null, i2);
    }

    public boolean a(MenuItem menuItem, s sVar, int i2) {
        n nVar = (n) menuItem;
        if (nVar == null || !nVar.isEnabled()) {
            return false;
        }
        boolean zA = nVar.a();
        b.d.g.b bVarM = nVar.m();
        boolean z = bVarM != null && bVarM.d();
        if (nVar.n()) {
            zA |= nVar.expandActionView();
            if (zA) {
                a(true);
            }
        } else if (nVar.hasSubMenu() || z) {
            if ((i2 & 4) == 0) {
                a(false);
            }
            if (!nVar.hasSubMenu()) {
                nVar.a(new y(e(), this, nVar));
            }
            y yVar = (y) nVar.getSubMenu();
            if (z) {
                bVarM.a(yVar);
            }
            zA |= a(yVar, sVar);
            if (!zA) {
                a(true);
            }
        } else if ((i2 & 1) == 0) {
            a(true);
        }
        return zA;
    }

    public final void a(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        Iterator<WeakReference<s>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<s> next = it.next();
            s sVar = next.get();
            if (sVar == null) {
                this.x.remove(next);
            } else {
                sVar.a(this, z);
            }
        }
        this.v = false;
    }

    @Override // android.view.Menu
    public void close() {
        a(true);
    }

    public void b(boolean z) {
        if (!this.r) {
            if (z) {
                this.f164i = true;
                this.l = true;
            }
            c(z);
            return;
        }
        this.s = true;
        if (z) {
            this.t = true;
        }
    }

    public void g() {
        if (this.r) {
            return;
        }
        this.r = true;
        this.s = false;
        this.t = false;
    }

    public void h() {
        this.r = false;
        if (this.s) {
            this.s = false;
            b(this.t);
        }
    }

    void a(n nVar) {
        this.f164i = true;
        b(true);
    }

    void b(n nVar) {
        this.l = true;
        b(true);
    }

    public ArrayList<n> i() {
        if (!this.f164i) {
            return this.f163h;
        }
        this.f163h.clear();
        int size = this.f162g.size();
        for (int i2 = 0; i2 < size; i2++) {
            n nVar = this.f162g.get(i2);
            if (nVar.isVisible()) {
                this.f163h.add(nVar);
            }
        }
        this.f164i = false;
        this.l = true;
        return this.f163h;
    }

    public void j() {
        ArrayList<n> arrayListI = i();
        if (this.l) {
            Iterator<WeakReference<s>> it = this.x.iterator();
            boolean zB = false;
            while (it.hasNext()) {
                WeakReference<s> next = it.next();
                s sVar = next.get();
                if (sVar == null) {
                    this.x.remove(next);
                } else {
                    zB |= sVar.b();
                }
            }
            if (zB) {
                this.j.clear();
                this.k.clear();
                int size = arrayListI.size();
                for (int i2 = 0; i2 < size; i2++) {
                    n nVar = arrayListI.get(i2);
                    if (nVar.i()) {
                        this.j.add(nVar);
                    } else {
                        this.k.add(nVar);
                    }
                }
            } else {
                this.j.clear();
                this.k.clear();
                this.k.addAll(i());
            }
            this.l = false;
        }
    }

    public ArrayList<n> k() {
        j();
        return this.j;
    }

    public ArrayList<n> l() {
        j();
        return this.k;
    }

    public void clearHeader() {
        this.p = null;
        this.o = null;
        this.q = null;
        b(false);
    }

    private void a(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resourcesD = d();
        if (view != null) {
            this.q = view;
            this.o = null;
            this.p = null;
        } else {
            if (i2 > 0) {
                this.o = resourcesD.getText(i2);
            } else if (charSequence != null) {
                this.o = charSequence;
            }
            if (i3 > 0) {
                this.p = androidx.core.content.a.a(e(), i3);
            } else if (drawable != null) {
                this.p = drawable;
            }
            this.q = null;
        }
        b(false);
    }

    protected k a(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }

    protected k c(int i2) {
        a(i2, null, 0, null, null);
        return this;
    }

    protected k a(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    protected k d(int i2) {
        a(0, null, i2, null, null);
        return this;
    }

    protected k a(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    public CharSequence m() {
        return this.o;
    }

    boolean o() {
        return this.u;
    }

    public boolean c(n nVar) {
        boolean zB = false;
        if (this.x.isEmpty()) {
            return false;
        }
        g();
        Iterator<WeakReference<s>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<s> next = it.next();
            s sVar = next.get();
            if (sVar == null) {
                this.x.remove(next);
            } else {
                zB = sVar.b(this, nVar);
                if (zB) {
                    break;
                }
            }
        }
        h();
        if (zB) {
            this.y = nVar;
        }
        return zB;
    }

    public boolean d(n nVar) {
        boolean zA = false;
        if (this.x.isEmpty() || this.y != nVar) {
            return false;
        }
        g();
        Iterator<WeakReference<s>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<s> next = it.next();
            s sVar = next.get();
            if (sVar == null) {
                this.x.remove(next);
            } else {
                zA = sVar.a(this, nVar);
                if (zA) {
                    break;
                }
            }
        }
        h();
        if (zA) {
            this.y = null;
        }
        return zA;
    }

    public n p() {
        return this.y;
    }
}
