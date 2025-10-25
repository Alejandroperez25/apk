package androidx.core.content.a;

import android.graphics.Typeface;
import androidx.core.content.a.h;

/* loaded from: classes.dex */
class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Typeface f550a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.a f551b;

    f(h.a aVar, Typeface typeface) {
        this.f551b = aVar;
        this.f550a = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f551b.a(this.f550a);
    }
}
