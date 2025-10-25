package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ComponentCallbacksC0108i implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.i, androidx.lifecycle.w, androidx.savedstate.c {

    /* renamed from: a, reason: collision with root package name */
    static final Object f725a = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    private boolean F;
    ViewGroup G;
    View H;
    View I;
    boolean J;
    a L;
    boolean N;
    boolean O;
    float P;
    LayoutInflater Q;
    boolean R;
    androidx.lifecycle.k T;
    S U;
    androidx.savedstate.b W;
    private int X;

    /* renamed from: c, reason: collision with root package name */
    Bundle f727c;

    /* renamed from: d, reason: collision with root package name */
    SparseArray<Parcelable> f728d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f729e;

    /* renamed from: g, reason: collision with root package name */
    Bundle f731g;

    /* renamed from: h, reason: collision with root package name */
    ComponentCallbacksC0108i f732h;
    int j;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    w s;
    AbstractC0113n t;
    ComponentCallbacksC0108i v;
    int w;
    int x;
    String y;
    boolean z;

    /* renamed from: b, reason: collision with root package name */
    int f726b = 0;

    /* renamed from: f, reason: collision with root package name */
    String f730f = UUID.randomUUID().toString();

    /* renamed from: i, reason: collision with root package name */
    String f733i = null;
    private Boolean k = null;
    w u = new w();
    boolean E = true;
    boolean K = true;
    Runnable M = new RunnableC0105f(this);
    f.b S = f.b.RESUMED;
    androidx.lifecycle.p<androidx.lifecycle.i> V = new androidx.lifecycle.p<>();

    /* renamed from: androidx.fragment.app.i$c */
    interface c {
        void a();

        void b();
    }

    public Animation a(int i2, boolean z, int i3) {
        return null;
    }

    public void a(int i2, int i3, Intent intent) {
    }

    public void a(int i2, String[] strArr, int[] iArr) {
    }

    public void a(Menu menu) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    public void a(View view, Bundle bundle) {
    }

    public void a(ComponentCallbacksC0108i componentCallbacksC0108i) {
    }

    public void a(boolean z) {
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    public Animator b(int i2, boolean z, int i3) {
        return null;
    }

    public void b(Menu menu) {
    }

    public void b(boolean z) {
    }

    public boolean b(MenuItem menuItem) {
        return false;
    }

    public void c(boolean z) {
    }

    public void d(boolean z) {
    }

    public void i(Bundle bundle) {
    }

    public void y() {
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.f a() {
        return this.T;
    }

    @Override // androidx.lifecycle.w
    public androidx.lifecycle.v d() {
        if (this.s == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        return this.s.b(this);
    }

    @Override // androidx.savedstate.c
    public final androidx.savedstate.a c() {
        return this.W.a();
    }

    /* renamed from: androidx.fragment.app.i$b */
    public static class b extends RuntimeException {
        public b(String str, Exception exc) {
            super(str, exc);
        }
    }

    public ComponentCallbacksC0108i() {
        ea();
    }

    private void ea() {
        this.T = new androidx.lifecycle.k(this);
        this.W = androidx.savedstate.b.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.T.a(new androidx.lifecycle.g() { // from class: androidx.fragment.app.Fragment$2
                @Override // androidx.lifecycle.g
                public void a(androidx.lifecycle.i iVar, f.a aVar) {
                    if (aVar != f.a.ON_STOP || this.f659a.H == null) {
                        return;
                    }
                    this.f659a.H.cancelPendingInputEvents();
                }
            });
        }
    }

    @Deprecated
    public static ComponentCallbacksC0108i a(Context context, String str, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            ComponentCallbacksC0108i componentCallbacksC0108iNewInstance = C0112m.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(componentCallbacksC0108iNewInstance.getClass().getClassLoader());
                componentCallbacksC0108iNewInstance.b(bundle);
            }
            return componentCallbacksC0108iNewInstance;
        } catch (IllegalAccessException e2) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    final void a(Bundle bundle) {
        if (this.f728d != null) {
            this.I.restoreHierarchyState(this.f728d);
            this.f728d = null;
        }
        this.F = false;
        h(bundle);
        if (!this.F) {
            throw new T("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
        if (this.H != null) {
            this.U.a(f.a.ON_CREATE);
        }
    }

    final boolean e() {
        return this.r > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        b.d.f.a.a(this, sb);
        sb.append(" (");
        sb.append(this.f730f);
        sb.append(")");
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" ");
            sb.append(this.y);
        }
        sb.append('}');
        return sb.toString();
    }

    public void b(Bundle bundle) {
        if (this.s != null && f()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f731g = bundle;
    }

    public final boolean f() {
        if (this.s == null) {
            return false;
        }
        return this.s.i();
    }

    public final ComponentCallbacksC0108i g() {
        if (this.f732h != null) {
            return this.f732h;
        }
        if (this.s == null || this.f733i == null) {
            return null;
        }
        return this.s.j.get(this.f733i);
    }

    public Context h() {
        if (this.t == null) {
            return null;
        }
        return this.t.k();
    }

    public final Context i() {
        Context contextH = h();
        if (contextH != null) {
            return contextH;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final ActivityC0109j j() {
        if (this.t == null) {
            return null;
        }
        return (ActivityC0109j) this.t.j();
    }

    public final ActivityC0109j k() {
        ActivityC0109j activityC0109jJ = j();
        if (activityC0109jJ != null) {
            return activityC0109jJ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Object l() {
        if (this.t == null) {
            return null;
        }
        return this.t.f();
    }

    public final Resources m() {
        return i().getResources();
    }

    public final AbstractC0114o n() {
        return this.s;
    }

    public final AbstractC0114o o() {
        AbstractC0114o abstractC0114oN = n();
        if (abstractC0114oN != null) {
            return abstractC0114oN;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final AbstractC0114o p() {
        if (this.t == null) {
            throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
        }
        return this.u;
    }

    public final ComponentCallbacksC0108i q() {
        return this.v;
    }

    public final boolean r() {
        return this.m;
    }

    public final boolean s() {
        return this.B;
    }

    public LayoutInflater c(Bundle bundle) {
        return e(bundle);
    }

    LayoutInflater d(Bundle bundle) {
        this.Q = c(bundle);
        return this.Q;
    }

    @Deprecated
    public LayoutInflater e(Bundle bundle) throws IllegalAccessException, IllegalArgumentException {
        if (this.t == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterE = this.t.e();
        b.d.g.e.a(layoutInflaterE, this.u.B());
        return layoutInflaterE;
    }

    public void a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
        Activity activityJ = this.t == null ? null : this.t.j();
        if (activityJ != null) {
            this.F = false;
            a(activityJ, attributeSet, bundle);
        }
    }

    @Deprecated
    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
    }

    public void a(Context context) {
        this.F = true;
        Activity activityJ = this.t == null ? null : this.t.j();
        if (activityJ != null) {
            this.F = false;
            a(activityJ);
        }
    }

    @Deprecated
    public void a(Activity activity) {
        this.F = true;
    }

    public void onCreate(Bundle bundle) {
        this.F = true;
        f(bundle);
        if (this.u.b(1)) {
            return;
        }
        this.u.p();
    }

    void f(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.u.a(parcelable);
        this.u.p();
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.X != 0) {
            return layoutInflater.inflate(this.X, viewGroup, false);
        }
        return null;
    }

    public View t() {
        return this.H;
    }

    public final View u() {
        View viewT = t();
        if (viewT != null) {
            return viewT;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void g(Bundle bundle) {
        this.F = true;
    }

    public void h(Bundle bundle) {
        this.F = true;
    }

    public void onStart() {
        this.F = true;
    }

    public void onResume() {
        this.F = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    public void onPause() {
        this.F = true;
    }

    public void onStop() {
        this.F = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.F = true;
    }

    public void v() {
        this.F = true;
    }

    public void onDestroy() {
        this.F = true;
    }

    void w() {
        ea();
        this.f730f = UUID.randomUUID().toString();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = 0;
        this.s = null;
        this.u = new w();
        this.t = null;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.z = false;
        this.A = false;
    }

    public void x() {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        k().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public Object z() {
        if (this.L == null) {
            return null;
        }
        return this.L.f740g;
    }

    public Object A() {
        if (this.L == null) {
            return null;
        }
        return this.L.f741h == f725a ? z() : this.L.f741h;
    }

    public Object B() {
        if (this.L == null) {
            return null;
        }
        return this.L.f742i;
    }

    public Object C() {
        if (this.L == null) {
            return null;
        }
        return this.L.j == f725a ? B() : this.L.j;
    }

    public Object D() {
        if (this.L == null) {
            return null;
        }
        return this.L.k;
    }

    public Object E() {
        if (this.L == null) {
            return null;
        }
        return this.L.l == f725a ? D() : this.L.l;
    }

    public boolean F() {
        if (this.L == null || this.L.n == null) {
            return true;
        }
        return this.L.n.booleanValue();
    }

    public boolean G() {
        if (this.L == null || this.L.m == null) {
            return true;
        }
        return this.L.m.booleanValue();
    }

    public void H() {
        if (this.s == null || this.s.t == null) {
            fa().q = false;
        } else if (Looper.myLooper() != this.s.t.l().getLooper()) {
            this.s.t.l().postAtFrontOfQueue(new RunnableC0106g(this));
        } else {
            I();
        }
    }

    void I() {
        c cVar;
        if (this.L == null) {
            cVar = null;
        } else {
            this.L.q = false;
            cVar = this.L.r;
            this.L.r = null;
        }
        if (cVar != null) {
            cVar.b();
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mTag=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f726b);
        printWriter.print(" mWho=");
        printWriter.print(this.f730f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.s);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.t);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.v);
        }
        if (this.f731g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f731g);
        }
        if (this.f727c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f727c);
        }
        if (this.f728d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f728d);
        }
        ComponentCallbacksC0108i componentCallbacksC0108iG = g();
        if (componentCallbacksC0108iG != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(componentCallbacksC0108iG);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        if (U() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(U());
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.H);
        }
        if (Z() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(Z());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(ba());
        }
        if (h() != null) {
            b.i.a.a.a(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.u + ":");
        this.u.a(str + "  ", fileDescriptor, printWriter, strArr);
    }

    ComponentCallbacksC0108i a(String str) {
        return str.equals(this.f730f) ? this : this.u.b(str);
    }

    void J() {
        this.u.a(this.t, new C0107h(this), this);
        this.F = false;
        a(this.t.k());
        if (this.F) {
            return;
        }
        throw new T("Fragment " + this + " did not call through to super.onAttach()");
    }

    void j(Bundle bundle) {
        this.u.o();
        this.f726b = 1;
        this.F = false;
        this.W.a(bundle);
        onCreate(bundle);
        this.R = true;
        if (!this.F) {
            throw new T("Fragment " + this + " did not call through to super.onCreate()");
        }
        this.T.b(f.a.ON_CREATE);
    }

    void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.o();
        this.q = true;
        this.U = new S();
        this.H = a(layoutInflater, viewGroup, bundle);
        if (this.H != null) {
            this.U.d();
            this.V.a((androidx.lifecycle.p<androidx.lifecycle.i>) this.U);
        } else {
            if (this.U.e()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.U = null;
        }
    }

    void k(Bundle bundle) {
        this.u.o();
        this.f726b = 2;
        this.F = false;
        g(bundle);
        if (!this.F) {
            throw new T("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        this.u.q();
    }

    void K() {
        this.u.o();
        this.u.k();
        this.f726b = 3;
        this.F = false;
        onStart();
        if (!this.F) {
            throw new T("Fragment " + this + " did not call through to super.onStart()");
        }
        this.T.b(f.a.ON_START);
        if (this.H != null) {
            this.U.a(f.a.ON_START);
        }
        this.u.r();
    }

    void L() {
        this.u.o();
        this.u.k();
        this.f726b = 4;
        this.F = false;
        onResume();
        if (!this.F) {
            throw new T("Fragment " + this + " did not call through to super.onResume()");
        }
        this.T.b(f.a.ON_RESUME);
        if (this.H != null) {
            this.U.a(f.a.ON_RESUME);
        }
        this.u.s();
        this.u.k();
    }

    void M() {
        this.u.o();
    }

    void N() {
        boolean zA = this.s.a(this);
        if (this.k == null || this.k.booleanValue() != zA) {
            this.k = Boolean.valueOf(zA);
            d(zA);
            this.u.y();
        }
    }

    void e(boolean z) {
        b(z);
        this.u.a(z);
    }

    void f(boolean z) {
        c(z);
        this.u.b(z);
    }

    void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.u.a(configuration);
    }

    void O() {
        onLowMemory();
        this.u.x();
    }

    boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z = true;
            a(menu, menuInflater);
        }
        return z | this.u.a(menu, menuInflater);
    }

    boolean c(Menu menu) {
        boolean z = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z = true;
            a(menu);
        }
        return z | this.u.a(menu);
    }

    boolean c(MenuItem menuItem) {
        if (this.z) {
            return false;
        }
        return (this.D && this.E && a(menuItem)) || this.u.a(menuItem);
    }

    boolean d(MenuItem menuItem) {
        if (this.z) {
            return false;
        }
        return b(menuItem) || this.u.b(menuItem);
    }

    void d(Menu menu) {
        if (this.z) {
            return;
        }
        if (this.D && this.E) {
            b(menu);
        }
        this.u.b(menu);
    }

    void l(Bundle bundle) {
        i(bundle);
        this.W.b(bundle);
        Parcelable parcelableN = this.u.n();
        if (parcelableN != null) {
            bundle.putParcelable("android:support:fragments", parcelableN);
        }
    }

    void P() {
        this.u.t();
        if (this.H != null) {
            this.U.a(f.a.ON_PAUSE);
        }
        this.T.b(f.a.ON_PAUSE);
        this.f726b = 3;
        this.F = false;
        onPause();
        if (this.F) {
            return;
        }
        throw new T("Fragment " + this + " did not call through to super.onPause()");
    }

    void Q() {
        this.u.u();
        if (this.H != null) {
            this.U.a(f.a.ON_STOP);
        }
        this.T.b(f.a.ON_STOP);
        this.f726b = 2;
        this.F = false;
        onStop();
        if (this.F) {
            return;
        }
        throw new T("Fragment " + this + " did not call through to super.onStop()");
    }

    void R() {
        this.u.v();
        if (this.H != null) {
            this.U.a(f.a.ON_DESTROY);
        }
        this.f726b = 1;
        this.F = false;
        v();
        if (!this.F) {
            throw new T("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        b.i.a.a.a(this).a();
        this.q = false;
    }

    void S() {
        this.u.w();
        this.T.b(f.a.ON_DESTROY);
        this.f726b = 0;
        this.F = false;
        this.R = false;
        onDestroy();
        if (this.F) {
            return;
        }
        throw new T("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void T() {
        this.F = false;
        x();
        this.Q = null;
        if (!this.F) {
            throw new T("Fragment " + this + " did not call through to super.onDetach()");
        }
        if (this.u.g()) {
            return;
        }
        this.u.w();
        this.u = new w();
    }

    void a(c cVar) {
        fa();
        if (cVar == this.L.r) {
            return;
        }
        if (cVar != null && this.L.r != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (this.L.q) {
            this.L.r = cVar;
        }
        if (cVar != null) {
            cVar.a();
        }
    }

    private a fa() {
        if (this.L == null) {
            this.L = new a();
        }
        return this.L;
    }

    int U() {
        if (this.L == null) {
            return 0;
        }
        return this.L.f737d;
    }

    void a(int i2) {
        if (this.L == null && i2 == 0) {
            return;
        }
        fa().f737d = i2;
    }

    int V() {
        if (this.L == null) {
            return 0;
        }
        return this.L.f738e;
    }

    void a(int i2, int i3) {
        if (this.L == null && i2 == 0 && i3 == 0) {
            return;
        }
        fa();
        this.L.f738e = i2;
        this.L.f739f = i3;
    }

    int W() {
        if (this.L == null) {
            return 0;
        }
        return this.L.f739f;
    }

    androidx.core.app.j X() {
        if (this.L == null) {
            return null;
        }
        return this.L.o;
    }

    androidx.core.app.j Y() {
        if (this.L == null) {
            return null;
        }
        return this.L.p;
    }

    View Z() {
        if (this.L == null) {
            return null;
        }
        return this.L.f734a;
    }

    void a(View view) {
        fa().f734a = view;
    }

    void a(Animator animator) {
        fa().f735b = animator;
    }

    Animator aa() {
        if (this.L == null) {
            return null;
        }
        return this.L.f735b;
    }

    int ba() {
        if (this.L == null) {
            return 0;
        }
        return this.L.f736c;
    }

    void b(int i2) {
        fa().f736c = i2;
    }

    boolean ca() {
        if (this.L == null) {
            return false;
        }
        return this.L.q;
    }

    boolean da() {
        if (this.L == null) {
            return false;
        }
        return this.L.s;
    }

    void g(boolean z) {
        fa().s = z;
    }

    /* renamed from: androidx.fragment.app.i$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        View f734a;

        /* renamed from: b, reason: collision with root package name */
        Animator f735b;

        /* renamed from: c, reason: collision with root package name */
        int f736c;

        /* renamed from: d, reason: collision with root package name */
        int f737d;

        /* renamed from: e, reason: collision with root package name */
        int f738e;

        /* renamed from: f, reason: collision with root package name */
        int f739f;
        Boolean m;
        Boolean n;
        boolean q;
        c r;
        boolean s;

        /* renamed from: g, reason: collision with root package name */
        Object f740g = null;

        /* renamed from: h, reason: collision with root package name */
        Object f741h = ComponentCallbacksC0108i.f725a;

        /* renamed from: i, reason: collision with root package name */
        Object f742i = null;
        Object j = ComponentCallbacksC0108i.f725a;
        Object k = null;
        Object l = ComponentCallbacksC0108i.f725a;
        androidx.core.app.j o = null;
        androidx.core.app.j p = null;

        a() {
        }
    }
}
