package androidx.appcompat.widget;

import android.graphics.Typeface;
import androidx.core.content.a.h;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0090q extends h.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WeakReference f428a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0091r f429b;

    @Override // androidx.core.content.a.h.a
    public void a(int i2) {
    }

    C0090q(C0091r c0091r, WeakReference weakReference) {
        this.f429b = c0091r;
        this.f428a = weakReference;
    }

    @Override // androidx.core.content.a.h.a
    public void a(Typeface typeface) {
        this.f429b.a(this.f428a, typeface);
    }
}
