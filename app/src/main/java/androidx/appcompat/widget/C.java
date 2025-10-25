package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
class C implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D f238a;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    C(D d2) {
        this.f238a = d2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
        AbstractC0097x abstractC0097x;
        if (i2 == -1 || (abstractC0097x = this.f238a.f252f) == null) {
            return;
        }
        abstractC0097x.setListSelectionHidden(false);
    }
}
