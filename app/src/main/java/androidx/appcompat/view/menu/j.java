package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.t;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    k f150a;

    /* renamed from: b, reason: collision with root package name */
    private int f151b = -1;

    /* renamed from: c, reason: collision with root package name */
    private boolean f152c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f153d;

    /* renamed from: e, reason: collision with root package name */
    private final LayoutInflater f154e;

    /* renamed from: f, reason: collision with root package name */
    private final int f155f;

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    public j(k kVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f153d = z;
        this.f154e = layoutInflater;
        this.f150a = kVar;
        this.f155f = i2;
        b();
    }

    public void a(boolean z) {
        this.f152c = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<n> arrayListL = this.f153d ? this.f150a.l() : this.f150a.i();
        if (this.f151b < 0) {
            return arrayListL.size();
        }
        return arrayListL.size() - 1;
    }

    public k a() {
        return this.f150a;
    }

    @Override // android.widget.Adapter
    public n getItem(int i2) {
        ArrayList<n> arrayListL = this.f153d ? this.f150a.l() : this.f150a.i();
        if (this.f151b >= 0 && i2 >= this.f151b) {
            i2++;
        }
        return arrayListL.get(i2);
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f154e.inflate(this.f155f, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f150a.a() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        t.a aVar = (t.a) view;
        if (this.f152c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i2), 0);
        return view;
    }

    void b() {
        n nVarP = this.f150a.p();
        if (nVarP != null) {
            ArrayList<n> arrayListL = this.f150a.l();
            int size = arrayListL.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayListL.get(i2) == nVarP) {
                    this.f151b = i2;
                    return;
                }
            }
        }
        this.f151b = -1;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
