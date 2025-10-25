package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
class da implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Toolbar f360a;

    da(Toolbar toolbar) {
        this.f360a = toolbar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f360a.c();
    }
}
