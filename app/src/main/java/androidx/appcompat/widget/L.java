package androidx.appcompat.widget;

import android.database.Cursor;

/* loaded from: classes.dex */
class L implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f275a;

    L(SearchView searchView) {
        this.f275a = searchView;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f275a.S == null || !(this.f275a.S instanceof V)) {
            return;
        }
        this.f275a.S.a((Cursor) null);
    }
}
