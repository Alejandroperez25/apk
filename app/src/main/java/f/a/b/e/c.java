package f.a.b.e;

import android.webkit.ValueCallback;
import f.a.a.a.o;

/* loaded from: classes.dex */
class c implements ValueCallback<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o.d f5814a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f5815b;

    c(o.d dVar, boolean z) {
        this.f5814a = dVar;
        this.f5815b = z;
    }

    @Override // android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onReceiveValue(Boolean bool) {
        this.f5814a.a(Boolean.valueOf(this.f5815b));
    }
}
