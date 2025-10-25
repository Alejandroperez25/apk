package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import androidx.lifecycle.w;

/* loaded from: classes.dex */
public abstract class c extends androidx.core.app.d implements i, w, androidx.savedstate.c, e {

    /* renamed from: e, reason: collision with root package name */
    private v f86e;

    /* renamed from: g, reason: collision with root package name */
    private int f88g;

    /* renamed from: c, reason: collision with root package name */
    private final k f84c = new k(this);

    /* renamed from: d, reason: collision with root package name */
    private final androidx.savedstate.b f85d = androidx.savedstate.b.a(this);

    /* renamed from: f, reason: collision with root package name */
    private final OnBackPressedDispatcher f87f = new OnBackPressedDispatcher(new b(this));

    @Deprecated
    public Object e() {
        return null;
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        Object f89a;

        /* renamed from: b, reason: collision with root package name */
        v f90b;

        a() {
        }
    }

    public c() {
        if (a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        if (Build.VERSION.SDK_INT >= 19) {
            a().a(new g() { // from class: androidx.activity.ComponentActivity$2
                @Override // androidx.lifecycle.g
                public void a(i iVar, f.a aVar) {
                    if (aVar == f.a.ON_STOP) {
                        Window window = this.f68a.getWindow();
                        View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                        if (viewPeekDecorView != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        a().a(new g() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.g
            public void a(i iVar, f.a aVar) {
                if (aVar != f.a.ON_DESTROY || this.f69a.isChangingConfigurations()) {
                    return;
                }
                this.f69a.d().a();
            }
        });
        if (19 > Build.VERSION.SDK_INT || Build.VERSION.SDK_INT > 23) {
            return;
        }
        a().a(new ImmLeaksCleaner(this));
    }

    @Override // androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f85d.a(bundle);
        s.a(this);
        if (this.f88g != 0) {
            setContentView(this.f88g);
        }
    }

    @Override // androidx.core.app.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        f fVarA = a();
        if (fVarA instanceof k) {
            ((k) fVarA).b(f.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f85d.b(bundle);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        a aVar;
        Object objE = e();
        v vVar = this.f86e;
        if (vVar == null && (aVar = (a) getLastNonConfigurationInstance()) != null) {
            vVar = aVar.f90b;
        }
        if (vVar == null && objE == null) {
            return null;
        }
        a aVar2 = new a();
        aVar2.f89a = objE;
        aVar2.f90b = vVar;
        return aVar2;
    }

    @Override // androidx.lifecycle.i
    public f a() {
        return this.f84c;
    }

    @Override // androidx.lifecycle.w
    public v d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f86e == null) {
            a aVar = (a) getLastNonConfigurationInstance();
            if (aVar != null) {
                this.f86e = aVar.f90b;
            }
            if (this.f86e == null) {
                this.f86e = new v();
            }
        }
        return this.f86e;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f87f.a();
    }

    @Override // androidx.activity.e
    public final OnBackPressedDispatcher b() {
        return this.f87f;
    }

    @Override // androidx.savedstate.c
    public final androidx.savedstate.a c() {
        return this.f85d.a();
    }
}
