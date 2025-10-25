package f.a.b.e;

import android.webkit.ValueCallback;
import f.a.a.a.o;

/* loaded from: classes.dex */
class e implements ValueCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o.d f5816a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f5817b;

    e(f fVar, o.d dVar) {
        this.f5817b = fVar;
        this.f5816a = dVar;
    }

    @Override // android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onReceiveValue(String str) {
        this.f5816a.a(str);
    }
}
