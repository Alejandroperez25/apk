package b.a.c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.AbstractC0096w;
import b.a.a$i;
import b.d.g.g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c extends MenuInflater {

    /* renamed from: a, reason: collision with root package name */
    static final Class<?>[] f936a = {Context.class};

    /* renamed from: b, reason: collision with root package name */
    static final Class<?>[] f937b = f936a;

    /* renamed from: c, reason: collision with root package name */
    final Object[] f938c;

    /* renamed from: d, reason: collision with root package name */
    final Object[] f939d;

    /* renamed from: e, reason: collision with root package name */
    Context f940e;

    /* renamed from: f, reason: collision with root package name */
    private Object f941f;

    public c(Context context) {
        super(context);
        this.f940e = context;
        this.f938c = new Object[]{context};
        this.f939d = this.f938c;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) throws Throwable {
        if (!(menu instanceof b.d.b.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                XmlResourceParser layout = this.f940e.getResources().getLayout(i2);
                try {
                    a(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (IOException e2) {
                    e = e2;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (XmlPullParserException e3) {
                    e = e3;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (Throwable th) {
                    th = th;
                    xmlResourceParser = layout;
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (XmlPullParserException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        int next = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            switch (next) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (!z2) {
                        String name2 = xmlPullParser.getName();
                        if (name2.equals("group")) {
                            bVar.a(attributeSet);
                            break;
                        } else if (name2.equals("item")) {
                            bVar.b(attributeSet);
                            break;
                        } else if (!name2.equals("menu")) {
                            str = name2;
                            z2 = true;
                            break;
                        } else {
                            a(xmlPullParser, attributeSet, bVar.c());
                            break;
                        }
                    } else {
                        break;
                    }
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (!z2 || !name3.equals(str)) {
                        if (name3.equals("group")) {
                            bVar.a();
                            break;
                        } else if (name3.equals("item")) {
                            if (!bVar.d()) {
                                if (bVar.A != null && bVar.A.d()) {
                                    bVar.c();
                                    break;
                                } else {
                                    bVar.b();
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else if (!name3.equals("menu")) {
                            break;
                        } else {
                            z = true;
                            break;
                        }
                    } else {
                        str = null;
                        z2 = false;
                        break;
                    }
                    break;
            }
            next = xmlPullParser.next();
        }
    }

    Object a() {
        if (this.f941f == null) {
            this.f941f = a(this.f940e);
        }
        return this.f941f;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private static final Class<?>[] f942a = {MenuItem.class};

        /* renamed from: b, reason: collision with root package name */
        private Object f943b;

        /* renamed from: c, reason: collision with root package name */
        private Method f944c;

        public a(Object obj, String str) {
            this.f943b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f944c = cls.getMethod(str, f942a);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f944c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f944c.invoke(this.f943b, menuItem)).booleanValue();
                }
                this.f944c.invoke(this.f943b, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    private class b {
        b.d.g.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f945a;

        /* renamed from: b, reason: collision with root package name */
        private int f946b;

        /* renamed from: c, reason: collision with root package name */
        private int f947c;

        /* renamed from: d, reason: collision with root package name */
        private int f948d;

        /* renamed from: e, reason: collision with root package name */
        private int f949e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f950f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f951g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f952h;

        /* renamed from: i, reason: collision with root package name */
        private int f953i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.f945a = menu;
            a();
        }

        public void a() {
            this.f946b = 0;
            this.f947c = 0;
            this.f948d = 0;
            this.f949e = 0;
            this.f950f = true;
            this.f951g = true;
        }

        public void a(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = c.this.f940e.obtainStyledAttributes(attributeSet, a$i.MenuGroup);
            this.f946b = typedArrayObtainStyledAttributes.getResourceId(a$i.MenuGroup_android_id, 0);
            this.f947c = typedArrayObtainStyledAttributes.getInt(a$i.MenuGroup_android_menuCategory, 0);
            this.f948d = typedArrayObtainStyledAttributes.getInt(a$i.MenuGroup_android_orderInCategory, 0);
            this.f949e = typedArrayObtainStyledAttributes.getInt(a$i.MenuGroup_android_checkableBehavior, 0);
            this.f950f = typedArrayObtainStyledAttributes.getBoolean(a$i.MenuGroup_android_visible, true);
            this.f951g = typedArrayObtainStyledAttributes.getBoolean(a$i.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void b(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = c.this.f940e.obtainStyledAttributes(attributeSet, a$i.MenuItem);
            this.f953i = typedArrayObtainStyledAttributes.getResourceId(a$i.MenuItem_android_id, 0);
            this.j = (typedArrayObtainStyledAttributes.getInt(a$i.MenuItem_android_menuCategory, this.f947c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(a$i.MenuItem_android_orderInCategory, this.f948d) & 65535);
            this.k = typedArrayObtainStyledAttributes.getText(a$i.MenuItem_android_title);
            this.l = typedArrayObtainStyledAttributes.getText(a$i.MenuItem_android_titleCondensed);
            this.m = typedArrayObtainStyledAttributes.getResourceId(a$i.MenuItem_android_icon, 0);
            this.n = a(typedArrayObtainStyledAttributes.getString(a$i.MenuItem_android_alphabeticShortcut));
            this.o = typedArrayObtainStyledAttributes.getInt(a$i.MenuItem_alphabeticModifiers, 4096);
            this.p = a(typedArrayObtainStyledAttributes.getString(a$i.MenuItem_android_numericShortcut));
            this.q = typedArrayObtainStyledAttributes.getInt(a$i.MenuItem_numericModifiers, 4096);
            if (typedArrayObtainStyledAttributes.hasValue(a$i.MenuItem_android_checkable)) {
                this.r = typedArrayObtainStyledAttributes.getBoolean(a$i.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.r = this.f949e;
            }
            this.s = typedArrayObtainStyledAttributes.getBoolean(a$i.MenuItem_android_checked, false);
            this.t = typedArrayObtainStyledAttributes.getBoolean(a$i.MenuItem_android_visible, this.f950f);
            this.u = typedArrayObtainStyledAttributes.getBoolean(a$i.MenuItem_android_enabled, this.f951g);
            this.v = typedArrayObtainStyledAttributes.getInt(a$i.MenuItem_showAsAction, -1);
            this.z = typedArrayObtainStyledAttributes.getString(a$i.MenuItem_android_onClick);
            this.w = typedArrayObtainStyledAttributes.getResourceId(a$i.MenuItem_actionLayout, 0);
            this.x = typedArrayObtainStyledAttributes.getString(a$i.MenuItem_actionViewClass);
            this.y = typedArrayObtainStyledAttributes.getString(a$i.MenuItem_actionProviderClass);
            boolean z = this.y != null;
            if (z && this.w == 0 && this.x == null) {
                this.A = (b.d.g.b) a(this.y, c.f937b, c.this.f939d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = typedArrayObtainStyledAttributes.getText(a$i.MenuItem_contentDescription);
            this.C = typedArrayObtainStyledAttributes.getText(a$i.MenuItem_tooltipText);
            if (typedArrayObtainStyledAttributes.hasValue(a$i.MenuItem_iconTintMode)) {
                this.E = AbstractC0096w.a(typedArrayObtainStyledAttributes.getInt(a$i.MenuItem_iconTintMode, -1), this.E);
            } else {
                this.E = null;
            }
            if (typedArrayObtainStyledAttributes.hasValue(a$i.MenuItem_iconTint)) {
                this.D = typedArrayObtainStyledAttributes.getColorStateList(a$i.MenuItem_iconTint);
            } else {
                this.D = null;
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f952h = false;
        }

        private char a(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private void a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            if (this.v >= 0) {
                menuItem.setShowAsAction(this.v);
            }
            if (this.z != null) {
                if (c.this.f940e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(c.this.a(), this.z));
            }
            boolean z2 = menuItem instanceof n;
            if (z2) {
            }
            if (this.r >= 2) {
                if (z2) {
                    ((n) menuItem).a(true);
                } else if (menuItem instanceof o) {
                    ((o) menuItem).a(true);
                }
            }
            if (this.x != null) {
                menuItem.setActionView((View) a(this.x, c.f936a, c.this.f938c));
                z = true;
            }
            if (this.w > 0) {
                if (!z) {
                    menuItem.setActionView(this.w);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.A != null) {
                g.a(menuItem, this.A);
            }
            g.a(menuItem, this.B);
            g.b(menuItem, this.C);
            g.b(menuItem, this.n, this.o);
            g.a(menuItem, this.p, this.q);
            if (this.E != null) {
                g.a(menuItem, this.E);
            }
            if (this.D != null) {
                g.a(menuItem, this.D);
            }
        }

        public void b() {
            this.f952h = true;
            a(this.f945a.add(this.f946b, this.f953i, this.j, this.k));
        }

        public SubMenu c() {
            this.f952h = true;
            SubMenu subMenuAddSubMenu = this.f945a.addSubMenu(this.f946b, this.f953i, this.j, this.k);
            a(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f952h;
        }

        private <T> T a(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = c.this.f940e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }
    }
}
