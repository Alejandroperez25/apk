package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class F extends D implements E {
    private static Method K;
    private E L;

    static {
        try {
            K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public F(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.appcompat.widget.D
    AbstractC0097x a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    public void a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.J.setEnterTransition((Transition) obj);
        }
    }

    public void b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.J.setExitTransition((Transition) obj);
        }
    }

    public void a(E e2) {
        this.L = e2;
    }

    public void c(boolean z) {
        if (K != null) {
            try {
                K.invoke(this.J, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.E
    public void a(androidx.appcompat.view.menu.k kVar, MenuItem menuItem) {
        if (this.L != null) {
            this.L.a(kVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.E
    public void b(androidx.appcompat.view.menu.k kVar, MenuItem menuItem) {
        if (this.L != null) {
            this.L.b(kVar, menuItem);
        }
    }

    public static class a extends AbstractC0097x {
        final int o;
        final int p;
        private E q;
        private MenuItem r;

        @Override // androidx.appcompat.widget.AbstractC0097x
        public /* bridge */ /* synthetic */ int a(int i2, int i3, int i4, int i5, int i6) {
            return super.a(i2, i3, i4, i5, i6);
        }

        @Override // androidx.appcompat.widget.AbstractC0097x
        public /* bridge */ /* synthetic */ boolean a(MotionEvent motionEvent, int i2) {
            return super.a(motionEvent, i2);
        }

        @Override // androidx.appcompat.widget.AbstractC0097x, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.AbstractC0097x, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.AbstractC0097x, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.AbstractC0097x, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.AbstractC0097x, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override // androidx.appcompat.widget.AbstractC0097x, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
                this.o = 21;
                this.p = 22;
            } else {
                this.o = 22;
                this.p = 21;
            }
        }

        public void setHoverListener(E e2) {
            this.q = e2;
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && i2 == this.p) {
                setSelection(-1);
                ((androidx.appcompat.view.menu.j) getAdapter()).a().a(false);
                return true;
            }
            return super.onKeyDown(i2, keyEvent);
        }

        @Override // androidx.appcompat.widget.AbstractC0097x, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            androidx.appcompat.view.menu.j jVar;
            int iPointToPosition;
            int i2;
            if (this.q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    jVar = (androidx.appcompat.view.menu.j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    jVar = (androidx.appcompat.view.menu.j) adapter;
                }
                androidx.appcompat.view.menu.n item = null;
                if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = iPointToPosition - headersCount) >= 0 && i2 < jVar.getCount()) {
                    item = jVar.getItem(i2);
                }
                MenuItem menuItem = this.r;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.k kVarA = jVar.a();
                    if (menuItem != null) {
                        this.q.b(kVarA, menuItem);
                    }
                    this.r = item;
                    if (item != null) {
                        this.q.a(kVarA, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
    }
}
