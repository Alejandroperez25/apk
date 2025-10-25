package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.aa;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k.b, t, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f102a = {R.attr.background, R.attr.divider};

    /* renamed from: b, reason: collision with root package name */
    private k f103b;

    /* renamed from: c, reason: collision with root package name */
    private int f104c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        aa aaVarA = aa.a(context, attributeSet, f102a, i2, 0);
        if (aaVarA.e(0)) {
            setBackgroundDrawable(aaVarA.a(0));
        }
        if (aaVarA.e(1)) {
            setDivider(aaVarA.a(1));
        }
        aaVarA.a();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // androidx.appcompat.view.menu.k.b
    public boolean a(n nVar) {
        return this.f103b.a(nVar, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j) {
        a((n) getAdapter().getItem(i2));
    }

    public int getWindowAnimations() {
        return this.f104c;
    }
}
