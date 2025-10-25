package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class p implements u, s, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private Rect f175a;

    public abstract void a(int i2);

    @Override // androidx.appcompat.view.menu.s
    public void a(Context context, k kVar) {
    }

    public abstract void a(View view);

    public abstract void a(PopupWindow.OnDismissListener onDismissListener);

    @Override // androidx.appcompat.view.menu.s
    public boolean a(k kVar, n nVar) {
        return false;
    }

    public abstract void b(int i2);

    public abstract void b(k kVar);

    public abstract void b(boolean z);

    @Override // androidx.appcompat.view.menu.s
    public boolean b(k kVar, n nVar) {
        return false;
    }

    public abstract void c(int i2);

    public abstract void c(boolean z);

    protected boolean f() {
        return true;
    }

    p() {
    }

    public void a(Rect rect) {
        this.f175a = rect;
    }

    public Rect e() {
        return this.f175a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        a(listAdapter).f150a.a((MenuItem) listAdapter.getItem(i2), this, f() ? 0 : 4);
    }

    protected static int a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup frameLayout = viewGroup;
        View view = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        return i4;
    }

    protected static j a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (j) listAdapter;
    }

    protected static boolean a(k kVar) {
        int size = kVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = kVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
