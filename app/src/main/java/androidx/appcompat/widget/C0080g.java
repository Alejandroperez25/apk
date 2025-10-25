package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.widget.C0079f;

/* renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0080g extends AbstractViewOnTouchListenerC0099z {
    final /* synthetic */ C0079f j;
    final /* synthetic */ C0079f.d k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0080g(C0079f.d dVar, View view, C0079f c0079f) {
        super(view);
        this.k = dVar;
        this.j = c0079f;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0099z
    public androidx.appcompat.view.menu.u a() {
        if (C0079f.this.y == null) {
            return null;
        }
        return C0079f.this.y.b();
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0099z
    public boolean b() {
        C0079f.this.d();
        return true;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0099z
    public boolean c() {
        if (C0079f.this.A != null) {
            return false;
        }
        C0079f.this.e();
        return true;
    }
}
