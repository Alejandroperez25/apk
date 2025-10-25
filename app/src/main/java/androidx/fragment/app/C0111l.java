package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0111l {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0113n<?> f746a;

    public static C0111l a(AbstractC0113n<?> abstractC0113n) {
        b.d.f.d.a(abstractC0113n, "callbacks == null");
        return new C0111l(abstractC0113n);
    }

    private C0111l(AbstractC0113n<?> abstractC0113n) {
        this.f746a = abstractC0113n;
    }

    public AbstractC0114o a() {
        return this.f746a.f752e;
    }

    public ComponentCallbacksC0108i a(String str) {
        return this.f746a.f752e.b(str);
    }

    public void a(ComponentCallbacksC0108i componentCallbacksC0108i) {
        this.f746a.f752e.a(this.f746a, this.f746a, componentCallbacksC0108i);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f746a.f752e.onCreateView(view, str, context, attributeSet);
    }

    public void b() {
        this.f746a.f752e.o();
    }

    public Parcelable c() {
        return this.f746a.f752e.n();
    }

    public void a(Parcelable parcelable) {
        if (!(this.f746a instanceof androidx.lifecycle.w)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        this.f746a.f752e.a(parcelable);
    }

    public void d() {
        this.f746a.f752e.p();
    }

    public void e() {
        this.f746a.f752e.q();
    }

    public void f() {
        this.f746a.f752e.r();
    }

    public void g() {
        this.f746a.f752e.s();
    }

    public void h() {
        this.f746a.f752e.t();
    }

    public void i() {
        this.f746a.f752e.u();
    }

    public void j() {
        this.f746a.f752e.w();
    }

    public void a(boolean z) {
        this.f746a.f752e.a(z);
    }

    public void b(boolean z) {
        this.f746a.f752e.b(z);
    }

    public void a(Configuration configuration) {
        this.f746a.f752e.a(configuration);
    }

    public void k() {
        this.f746a.f752e.x();
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        return this.f746a.f752e.a(menu, menuInflater);
    }

    public boolean a(Menu menu) {
        return this.f746a.f752e.a(menu);
    }

    public boolean a(MenuItem menuItem) {
        return this.f746a.f752e.a(menuItem);
    }

    public boolean b(MenuItem menuItem) {
        return this.f746a.f752e.b(menuItem);
    }

    public void b(Menu menu) {
        this.f746a.f752e.b(menu);
    }

    public boolean l() {
        return this.f746a.f752e.k();
    }
}
