package f.a.b.e;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* loaded from: classes.dex */
final class k extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private final View f5831a;

    /* renamed from: b, reason: collision with root package name */
    private View f5832b;

    /* renamed from: c, reason: collision with root package name */
    private n f5833c;

    k(Context context, View view) {
        super(context);
        this.f5831a = view;
    }

    void a() {
        if (this.f5833c == null) {
            return;
        }
        this.f5833c.a(true);
    }

    void b() {
        if (this.f5833c == null) {
            return;
        }
        this.f5833c.a(false);
    }

    void c() {
        d();
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        View view2 = this.f5832b;
        this.f5832b = view;
        if (view2 == view) {
            return super.checkInputConnectionProxy(view);
        }
        this.f5833c = new n(this.f5831a, view, view.getHandler());
        a(this.f5833c);
        return super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        super.clearFocus();
        d();
    }

    private void d() {
        if (this.f5833c == null) {
            return;
        }
        a(this.f5831a);
    }

    private void a(View view) {
        view.requestFocus();
        this.f5831a.post(new j(this, view));
    }
}
