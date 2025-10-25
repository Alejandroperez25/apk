package c.b;

import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class f extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private a f1300a;

    public interface a {
        void a(int i2, int i3, int i4, int i5);
    }

    public f(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        if (this.f1300a != null) {
            this.f1300a.a(i2, i3, i4, i5);
        }
    }

    public a getOnScrollChangedCallback() {
        return this.f1300a;
    }

    public void setOnScrollChangedCallback(a aVar) {
        this.f1300a = aVar;
    }
}
