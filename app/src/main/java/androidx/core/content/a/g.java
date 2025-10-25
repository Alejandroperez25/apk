package androidx.core.content.a;

import androidx.core.content.a.h;

/* loaded from: classes.dex */
class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f552a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.a f553b;

    g(h.a aVar, int i2) {
        this.f553b = aVar;
        this.f552a = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f553b.a(this.f552a);
    }
}
