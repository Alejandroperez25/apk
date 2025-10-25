package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.AbstractC0114o;
import androidx.fragment.app.ComponentCallbacksC0108i;
import androidx.lifecycle.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
final class w extends AbstractC0114o implements LayoutInflater.Factory2 {

    /* renamed from: c, reason: collision with root package name */
    static boolean f770c = false;

    /* renamed from: d, reason: collision with root package name */
    static final Interpolator f771d = new DecelerateInterpolator(2.5f);

    /* renamed from: e, reason: collision with root package name */
    static final Interpolator f772e = new DecelerateInterpolator(1.5f);
    boolean A;
    boolean B;
    ArrayList<C0100a> C;
    ArrayList<Boolean> D;
    ArrayList<ComponentCallbacksC0108i> E;
    ArrayList<g> H;
    private A I;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<e> f773f;

    /* renamed from: g, reason: collision with root package name */
    boolean f774g;
    ArrayList<C0100a> k;
    ArrayList<ComponentCallbacksC0108i> l;
    private OnBackPressedDispatcher m;
    ArrayList<C0100a> o;
    ArrayList<Integer> p;
    ArrayList<AbstractC0114o.c> q;
    AbstractC0113n t;
    AbstractC0110k u;
    ComponentCallbacksC0108i v;
    ComponentCallbacksC0108i w;
    boolean x;
    boolean y;
    boolean z;

    /* renamed from: h, reason: collision with root package name */
    int f775h = 0;

    /* renamed from: i, reason: collision with root package name */
    final ArrayList<ComponentCallbacksC0108i> f776i = new ArrayList<>();
    final HashMap<String, ComponentCallbacksC0108i> j = new HashMap<>();
    private final androidx.activity.d n = new C0115p(this, false);
    private final CopyOnWriteArrayList<c> r = new CopyOnWriteArrayList<>();
    int s = 0;
    Bundle F = null;
    SparseArray<Parcelable> G = null;
    Runnable J = new RunnableC0116q(this);

    private static final class c {
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f784a = {android.R.attr.name, android.R.attr.id, android.R.attr.tag};
    }

    interface e {
        boolean a(ArrayList<C0100a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public static int a(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    public static int a(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? 1 : 2;
        }
        if (i2 == 4099) {
            return z ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    LayoutInflater.Factory2 B() {
        return this;
    }

    w() {
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new b.d.f.b("FragmentManager"));
        if (this.t != null) {
            try {
                this.t.a("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            a("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    @Override // androidx.fragment.app.AbstractC0114o
    public D a() {
        return new C0100a(this);
    }

    private void C() {
        if (this.f773f != null && !this.f773f.isEmpty()) {
            this.n.a(true);
        } else {
            this.n.a(f() > 0 && a(this.v));
        }
    }

    boolean a(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (componentCallbacksC0108i == null) {
            return true;
        }
        w wVar = componentCallbacksC0108i.s;
        return componentCallbacksC0108i == wVar.z() && a(wVar.v);
    }

    void e() {
        k();
        if (this.n.a()) {
            b();
        } else {
            this.m.a();
        }
    }

    @Override // androidx.fragment.app.AbstractC0114o
    public boolean b() {
        D();
        return a((String) null, -1, 0);
    }

    @Override // androidx.fragment.app.AbstractC0114o
    public void a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Bad id: " + i2);
        }
        a((e) new f(null, i2, i3), false);
    }

    private boolean a(String str, int i2, int i3) throws Resources.NotFoundException {
        k();
        c(true);
        if (this.w != null && i2 < 0 && str == null && this.w.p().b()) {
            return true;
        }
        boolean zA = a(this.C, this.D, str, i2, i3);
        if (zA) {
            this.f774g = true;
            try {
                b(this.C, this.D);
            } finally {
                E();
            }
        }
        C();
        l();
        H();
        return zA;
    }

    public int f() {
        if (this.k != null) {
            return this.k.size();
        }
        return 0;
    }

    public void a(Bundle bundle, String str, ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (componentCallbacksC0108i.s != this) {
            a(new IllegalStateException("Fragment " + componentCallbacksC0108i + " is not currently in the FragmentManager"));
            throw null;
        }
        bundle.putString(str, componentCallbacksC0108i.f730f);
    }

    public ComponentCallbacksC0108i a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        ComponentCallbacksC0108i componentCallbacksC0108i = this.j.get(string);
        if (componentCallbacksC0108i != null) {
            return componentCallbacksC0108i;
        }
        a(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractC0114o
    public List<ComponentCallbacksC0108i> c() {
        List<ComponentCallbacksC0108i> list;
        if (this.f776i.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f776i) {
            list = (List) this.f776i.clone();
        }
        return list;
    }

    androidx.lifecycle.v b(ComponentCallbacksC0108i componentCallbacksC0108i) {
        return this.I.e(componentCallbacksC0108i);
    }

    A c(ComponentCallbacksC0108i componentCallbacksC0108i) {
        return this.I.d(componentCallbacksC0108i);
    }

    void d(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (i()) {
            if (f770c) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.I.a(componentCallbacksC0108i) && f770c) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + componentCallbacksC0108i);
        }
    }

    void e(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (i()) {
            if (f770c) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.I.c(componentCallbacksC0108i) && f770c) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + componentCallbacksC0108i);
        }
    }

    public boolean g() {
        return this.A;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.v != null) {
            b.d.f.a.a(this.v, sb);
        } else {
            b.d.f.a.a(this.t, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.AbstractC0114o
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.j.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (ComponentCallbacksC0108i componentCallbacksC0108i : this.j.values()) {
                printWriter.print(str);
                printWriter.println(componentCallbacksC0108i);
                if (componentCallbacksC0108i != null) {
                    componentCallbacksC0108i.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f776i.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                ComponentCallbacksC0108i componentCallbacksC0108i2 = this.f776i.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0108i2.toString());
            }
        }
        if (this.l != null && (size4 = this.l.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                ComponentCallbacksC0108i componentCallbacksC0108i3 = this.l.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0108i3.toString());
            }
        }
        if (this.k != null && (size3 = this.k.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                C0100a c0100a = this.k.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0100a.toString());
                c0100a.a(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.o != null && (size2 = this.o.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj = (C0100a) this.o.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.p != null && this.p.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.p.toArray()));
            }
        }
        if (this.f773f != null && (size = this.f773f.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                Object obj2 = (e) this.f773f.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.y);
        printWriter.print(" mStopped=");
        printWriter.print(this.z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.A);
        if (this.x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.x);
        }
    }

    static a a(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f771d);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(f772e);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new a(animationSet);
    }

    static a a(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(f772e);
        alphaAnimation.setDuration(220L);
        return new a(alphaAnimation);
    }

    a a(ComponentCallbacksC0108i componentCallbacksC0108i, int i2, boolean z, int i3) throws Resources.NotFoundException {
        int iA;
        int iU = componentCallbacksC0108i.U();
        boolean z2 = false;
        componentCallbacksC0108i.a(0);
        if (componentCallbacksC0108i.G != null && componentCallbacksC0108i.G.getLayoutTransition() != null) {
            return null;
        }
        Animation animationA = componentCallbacksC0108i.a(i2, z, iU);
        if (animationA != null) {
            return new a(animationA);
        }
        Animator animatorB = componentCallbacksC0108i.b(i2, z, iU);
        if (animatorB != null) {
            return new a(animatorB);
        }
        if (iU != 0) {
            boolean zEquals = "anim".equals(this.t.k().getResources().getResourceTypeName(iU));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.t.k(), iU);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.t.k(), iU);
                    if (animatorLoadAnimator != null) {
                        return new a(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this.t.k(), iU);
                    if (animationLoadAnimation2 != null) {
                        return new a(animationLoadAnimation2);
                    }
                }
            }
        }
        if (i2 == 0 || (iA = a(i2, z)) < 0) {
            return null;
        }
        switch (iA) {
            case 1:
                return a(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return a(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return a(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return a(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return a(0.0f, 1.0f);
            case 6:
                return a(1.0f, 0.0f);
            default:
                if (i3 == 0 && this.t.h()) {
                    i3 = this.t.i();
                }
                return i3 == 0 ? null : null;
        }
    }

    public void f(ComponentCallbacksC0108i componentCallbacksC0108i) throws Resources.NotFoundException {
        if (componentCallbacksC0108i.J) {
            if (this.f774g) {
                this.B = true;
            } else {
                componentCallbacksC0108i.J = false;
                a(componentCallbacksC0108i, this.s, 0, 0, false);
            }
        }
    }

    boolean b(int i2) {
        return this.s >= i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:167:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(androidx.fragment.app.ComponentCallbacksC0108i r15, int r16, int r17, int r18, boolean r19) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.a(androidx.fragment.app.i, int, int, int, boolean):void");
    }

    private void a(ComponentCallbacksC0108i componentCallbacksC0108i, a aVar, int i2) {
        View view = componentCallbacksC0108i.H;
        ViewGroup viewGroup = componentCallbacksC0108i.G;
        viewGroup.startViewTransition(view);
        componentCallbacksC0108i.b(i2);
        if (aVar.f777a != null) {
            b bVar = new b(aVar.f777a, viewGroup, view);
            componentCallbacksC0108i.a(componentCallbacksC0108i.H);
            bVar.setAnimationListener(new AnimationAnimationListenerC0118s(this, viewGroup, componentCallbacksC0108i));
            componentCallbacksC0108i.H.startAnimation(bVar);
            return;
        }
        Animator animator = aVar.f778b;
        componentCallbacksC0108i.a(aVar.f778b);
        animator.addListener(new C0119t(this, viewGroup, view, componentCallbacksC0108i));
        animator.setTarget(componentCallbacksC0108i.H);
        animator.start();
    }

    void g(ComponentCallbacksC0108i componentCallbacksC0108i) throws Resources.NotFoundException {
        a(componentCallbacksC0108i, this.s, 0, 0, false);
    }

    void h(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (!componentCallbacksC0108i.n || componentCallbacksC0108i.q) {
            return;
        }
        componentCallbacksC0108i.b(componentCallbacksC0108i.d(componentCallbacksC0108i.f727c), (ViewGroup) null, componentCallbacksC0108i.f727c);
        if (componentCallbacksC0108i.H != null) {
            componentCallbacksC0108i.I = componentCallbacksC0108i.H;
            componentCallbacksC0108i.H.setSaveFromParentEnabled(false);
            if (componentCallbacksC0108i.z) {
                componentCallbacksC0108i.H.setVisibility(8);
            }
            componentCallbacksC0108i.a(componentCallbacksC0108i.H, componentCallbacksC0108i.f727c);
            a(componentCallbacksC0108i, componentCallbacksC0108i.H, componentCallbacksC0108i.f727c, false);
            return;
        }
        componentCallbacksC0108i.I = null;
    }

    void i(ComponentCallbacksC0108i componentCallbacksC0108i) throws Resources.NotFoundException {
        if (componentCallbacksC0108i.H != null) {
            a aVarA = a(componentCallbacksC0108i, componentCallbacksC0108i.V(), !componentCallbacksC0108i.z, componentCallbacksC0108i.W());
            if (aVarA != null && aVarA.f778b != null) {
                aVarA.f778b.setTarget(componentCallbacksC0108i.H);
                if (componentCallbacksC0108i.z) {
                    if (componentCallbacksC0108i.da()) {
                        componentCallbacksC0108i.g(false);
                    } else {
                        ViewGroup viewGroup = componentCallbacksC0108i.G;
                        View view = componentCallbacksC0108i.H;
                        viewGroup.startViewTransition(view);
                        aVarA.f778b.addListener(new u(this, viewGroup, view, componentCallbacksC0108i));
                    }
                } else {
                    componentCallbacksC0108i.H.setVisibility(0);
                }
                aVarA.f778b.start();
            } else {
                if (aVarA != null) {
                    componentCallbacksC0108i.H.startAnimation(aVarA.f777a);
                    aVarA.f777a.start();
                }
                componentCallbacksC0108i.H.setVisibility((!componentCallbacksC0108i.z || componentCallbacksC0108i.da()) ? 0 : 8);
                if (componentCallbacksC0108i.da()) {
                    componentCallbacksC0108i.g(false);
                }
            }
        }
        if (componentCallbacksC0108i.l && w(componentCallbacksC0108i)) {
            this.x = true;
        }
        componentCallbacksC0108i.O = false;
        componentCallbacksC0108i.a(componentCallbacksC0108i.z);
    }

    void j(ComponentCallbacksC0108i componentCallbacksC0108i) throws Resources.NotFoundException {
        if (componentCallbacksC0108i == null) {
            return;
        }
        if (!this.j.containsKey(componentCallbacksC0108i.f730f)) {
            if (f770c) {
                Log.v("FragmentManager", "Ignoring moving " + componentCallbacksC0108i + " to state " + this.s + "since it is not added to " + this);
                return;
            }
            return;
        }
        int iMin = this.s;
        if (componentCallbacksC0108i.m) {
            if (componentCallbacksC0108i.e()) {
                iMin = Math.min(iMin, 1);
            } else {
                iMin = Math.min(iMin, 0);
            }
        }
        a(componentCallbacksC0108i, iMin, componentCallbacksC0108i.V(), componentCallbacksC0108i.W(), false);
        if (componentCallbacksC0108i.H != null) {
            ComponentCallbacksC0108i componentCallbacksC0108iU = u(componentCallbacksC0108i);
            if (componentCallbacksC0108iU != null) {
                View view = componentCallbacksC0108iU.H;
                ViewGroup viewGroup = componentCallbacksC0108i.G;
                int iIndexOfChild = viewGroup.indexOfChild(view);
                int iIndexOfChild2 = viewGroup.indexOfChild(componentCallbacksC0108i.H);
                if (iIndexOfChild2 < iIndexOfChild) {
                    viewGroup.removeViewAt(iIndexOfChild2);
                    viewGroup.addView(componentCallbacksC0108i.H, iIndexOfChild);
                }
            }
            if (componentCallbacksC0108i.N && componentCallbacksC0108i.G != null) {
                if (componentCallbacksC0108i.P > 0.0f) {
                    componentCallbacksC0108i.H.setAlpha(componentCallbacksC0108i.P);
                }
                componentCallbacksC0108i.P = 0.0f;
                componentCallbacksC0108i.N = false;
                a aVarA = a(componentCallbacksC0108i, componentCallbacksC0108i.V(), true, componentCallbacksC0108i.W());
                if (aVarA != null) {
                    if (aVarA.f777a != null) {
                        componentCallbacksC0108i.H.startAnimation(aVarA.f777a);
                    } else {
                        aVarA.f778b.setTarget(componentCallbacksC0108i.H);
                        aVarA.f778b.start();
                    }
                }
            }
        }
        if (componentCallbacksC0108i.O) {
            i(componentCallbacksC0108i);
        }
    }

    void b(int i2, boolean z) throws Resources.NotFoundException {
        if (this.t == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.s) {
            this.s = i2;
            int size = this.f776i.size();
            for (int i3 = 0; i3 < size; i3++) {
                j(this.f776i.get(i3));
            }
            for (ComponentCallbacksC0108i componentCallbacksC0108i : this.j.values()) {
                if (componentCallbacksC0108i != null && (componentCallbacksC0108i.m || componentCallbacksC0108i.A)) {
                    if (!componentCallbacksC0108i.N) {
                        j(componentCallbacksC0108i);
                    }
                }
            }
            h();
            if (this.x && this.t != null && this.s == 4) {
                this.t.g();
                this.x = false;
            }
        }
    }

    void h() throws Resources.NotFoundException {
        for (ComponentCallbacksC0108i componentCallbacksC0108i : this.j.values()) {
            if (componentCallbacksC0108i != null) {
                f(componentCallbacksC0108i);
            }
        }
    }

    void k(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (this.j.get(componentCallbacksC0108i.f730f) != null) {
            return;
        }
        this.j.put(componentCallbacksC0108i.f730f, componentCallbacksC0108i);
        if (componentCallbacksC0108i.C) {
            if (componentCallbacksC0108i.B) {
                d(componentCallbacksC0108i);
            } else {
                e(componentCallbacksC0108i);
            }
            componentCallbacksC0108i.C = false;
        }
        if (f770c) {
            Log.v("FragmentManager", "Added fragment to active set " + componentCallbacksC0108i);
        }
    }

    void l(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (this.j.get(componentCallbacksC0108i.f730f) == null) {
            return;
        }
        if (f770c) {
            Log.v("FragmentManager", "Removed fragment from active set " + componentCallbacksC0108i);
        }
        for (ComponentCallbacksC0108i componentCallbacksC0108i2 : this.j.values()) {
            if (componentCallbacksC0108i2 != null && componentCallbacksC0108i.f730f.equals(componentCallbacksC0108i2.f733i)) {
                componentCallbacksC0108i2.f732h = componentCallbacksC0108i;
                componentCallbacksC0108i2.f733i = null;
            }
        }
        this.j.put(componentCallbacksC0108i.f730f, null);
        e(componentCallbacksC0108i);
        if (componentCallbacksC0108i.f733i != null) {
            componentCallbacksC0108i.f732h = this.j.get(componentCallbacksC0108i.f733i);
        }
        componentCallbacksC0108i.w();
    }

    public void a(ComponentCallbacksC0108i componentCallbacksC0108i, boolean z) throws Resources.NotFoundException {
        if (f770c) {
            Log.v("FragmentManager", "add: " + componentCallbacksC0108i);
        }
        k(componentCallbacksC0108i);
        if (componentCallbacksC0108i.A) {
            return;
        }
        if (this.f776i.contains(componentCallbacksC0108i)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC0108i);
        }
        synchronized (this.f776i) {
            this.f776i.add(componentCallbacksC0108i);
        }
        componentCallbacksC0108i.l = true;
        componentCallbacksC0108i.m = false;
        if (componentCallbacksC0108i.H == null) {
            componentCallbacksC0108i.O = false;
        }
        if (w(componentCallbacksC0108i)) {
            this.x = true;
        }
        if (z) {
            g(componentCallbacksC0108i);
        }
    }

    public void m(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (f770c) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC0108i + " nesting=" + componentCallbacksC0108i.r);
        }
        boolean z = !componentCallbacksC0108i.e();
        if (!componentCallbacksC0108i.A || z) {
            synchronized (this.f776i) {
                this.f776i.remove(componentCallbacksC0108i);
            }
            if (w(componentCallbacksC0108i)) {
                this.x = true;
            }
            componentCallbacksC0108i.l = false;
            componentCallbacksC0108i.m = true;
        }
    }

    public void n(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (f770c) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC0108i);
        }
        if (componentCallbacksC0108i.z) {
            return;
        }
        componentCallbacksC0108i.z = true;
        componentCallbacksC0108i.O = true ^ componentCallbacksC0108i.O;
    }

    public void o(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (f770c) {
            Log.v("FragmentManager", "show: " + componentCallbacksC0108i);
        }
        if (componentCallbacksC0108i.z) {
            componentCallbacksC0108i.z = false;
            componentCallbacksC0108i.O = !componentCallbacksC0108i.O;
        }
    }

    public void p(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (f770c) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC0108i);
        }
        if (componentCallbacksC0108i.A) {
            return;
        }
        componentCallbacksC0108i.A = true;
        if (componentCallbacksC0108i.l) {
            if (f770c) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC0108i);
            }
            synchronized (this.f776i) {
                this.f776i.remove(componentCallbacksC0108i);
            }
            if (w(componentCallbacksC0108i)) {
                this.x = true;
            }
            componentCallbacksC0108i.l = false;
        }
    }

    public void q(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (f770c) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC0108i);
        }
        if (componentCallbacksC0108i.A) {
            componentCallbacksC0108i.A = false;
            if (componentCallbacksC0108i.l) {
                return;
            }
            if (this.f776i.contains(componentCallbacksC0108i)) {
                throw new IllegalStateException("Fragment already added: " + componentCallbacksC0108i);
            }
            if (f770c) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC0108i);
            }
            synchronized (this.f776i) {
                this.f776i.add(componentCallbacksC0108i);
            }
            componentCallbacksC0108i.l = true;
            if (w(componentCallbacksC0108i)) {
                this.x = true;
            }
        }
    }

    public ComponentCallbacksC0108i c(int i2) {
        for (int size = this.f776i.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0108i componentCallbacksC0108i = this.f776i.get(size);
            if (componentCallbacksC0108i != null && componentCallbacksC0108i.w == i2) {
                return componentCallbacksC0108i;
            }
        }
        for (ComponentCallbacksC0108i componentCallbacksC0108i2 : this.j.values()) {
            if (componentCallbacksC0108i2 != null && componentCallbacksC0108i2.w == i2) {
                return componentCallbacksC0108i2;
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0114o
    public ComponentCallbacksC0108i a(String str) {
        if (str != null) {
            for (int size = this.f776i.size() - 1; size >= 0; size--) {
                ComponentCallbacksC0108i componentCallbacksC0108i = this.f776i.get(size);
                if (componentCallbacksC0108i != null && str.equals(componentCallbacksC0108i.y)) {
                    return componentCallbacksC0108i;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (ComponentCallbacksC0108i componentCallbacksC0108i2 : this.j.values()) {
            if (componentCallbacksC0108i2 != null && str.equals(componentCallbacksC0108i2.y)) {
                return componentCallbacksC0108i2;
            }
        }
        return null;
    }

    public ComponentCallbacksC0108i b(String str) {
        ComponentCallbacksC0108i componentCallbacksC0108iA;
        for (ComponentCallbacksC0108i componentCallbacksC0108i : this.j.values()) {
            if (componentCallbacksC0108i != null && (componentCallbacksC0108iA = componentCallbacksC0108i.a(str)) != null) {
                return componentCallbacksC0108iA;
            }
        }
        return null;
    }

    private void D() {
        if (i()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public boolean i() {
        return this.y || this.z;
    }

    public void a(e eVar, boolean z) {
        if (!z) {
            D();
        }
        synchronized (this) {
            if (!this.A && this.t != null) {
                if (this.f773f == null) {
                    this.f773f = new ArrayList<>();
                }
                this.f773f.add(eVar);
                j();
                return;
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    void j() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = (this.H == null || this.H.isEmpty()) ? false : true;
            if (this.f773f != null && this.f773f.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.t.l().removeCallbacks(this.J);
                this.t.l().post(this.J);
                C();
            }
        }
    }

    public int a(C0100a c0100a) {
        synchronized (this) {
            if (this.p != null && this.p.size() > 0) {
                int iIntValue = this.p.remove(this.p.size() - 1).intValue();
                if (f770c) {
                    Log.v("FragmentManager", "Adding back stack index " + iIntValue + " with " + c0100a);
                }
                this.o.set(iIntValue, c0100a);
                return iIntValue;
            }
            if (this.o == null) {
                this.o = new ArrayList<>();
            }
            int size = this.o.size();
            if (f770c) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + c0100a);
            }
            this.o.add(c0100a);
            return size;
        }
    }

    public void a(int i2, C0100a c0100a) {
        synchronized (this) {
            if (this.o == null) {
                this.o = new ArrayList<>();
            }
            int size = this.o.size();
            if (i2 < size) {
                if (f770c) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + c0100a);
                }
                this.o.set(i2, c0100a);
            } else {
                while (size < i2) {
                    this.o.add(null);
                    if (this.p == null) {
                        this.p = new ArrayList<>();
                    }
                    if (f770c) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.p.add(Integer.valueOf(size));
                    size++;
                }
                if (f770c) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + c0100a);
                }
                this.o.add(c0100a);
            }
        }
    }

    public void d(int i2) {
        synchronized (this) {
            this.o.set(i2, null);
            if (this.p == null) {
                this.p = new ArrayList<>();
            }
            if (f770c) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.p.add(Integer.valueOf(i2));
        }
    }

    private void c(boolean z) {
        if (this.f774g) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.t == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.t.l().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            D();
        }
        if (this.C == null) {
            this.C = new ArrayList<>();
            this.D = new ArrayList<>();
        }
        this.f774g = true;
        try {
            a((ArrayList<C0100a>) null, (ArrayList<Boolean>) null);
        } finally {
            this.f774g = false;
        }
    }

    private void E() {
        this.f774g = false;
        this.D.clear();
        this.C.clear();
    }

    public boolean k() {
        c(true);
        boolean z = false;
        while (c(this.C, this.D)) {
            this.f774g = true;
            try {
                b(this.C, this.D);
                E();
                z = true;
            } catch (Throwable th) {
                E();
                throw th;
            }
        }
        C();
        l();
        H();
        return z;
    }

    private void a(ArrayList<C0100a> arrayList, ArrayList<Boolean> arrayList2) throws Resources.NotFoundException {
        int iIndexOf;
        int iIndexOf2;
        int size = this.H == null ? 0 : this.H.size();
        int i2 = 0;
        while (i2 < size) {
            g gVar = this.H.get(i2);
            if (arrayList != null && !gVar.f789a && (iIndexOf2 = arrayList.indexOf(gVar.f790b)) != -1 && arrayList2.get(iIndexOf2).booleanValue()) {
                this.H.remove(i2);
                i2--;
                size--;
                gVar.e();
            } else if (gVar.c() || (arrayList != null && gVar.f790b.a(arrayList, 0, arrayList.size()))) {
                this.H.remove(i2);
                i2--;
                size--;
                if (arrayList != null && !gVar.f789a && (iIndexOf = arrayList.indexOf(gVar.f790b)) != -1 && arrayList2.get(iIndexOf).booleanValue()) {
                    gVar.e();
                } else {
                    gVar.d();
                }
            }
            i2++;
        }
    }

    private void b(ArrayList<C0100a> arrayList, ArrayList<Boolean> arrayList2) throws Resources.NotFoundException {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        a(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).q) {
                if (i3 != i2) {
                    a(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).q) {
                        i3++;
                    }
                }
                a(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            a(arrayList, arrayList2, i3, size);
        }
    }

    private void a(ArrayList<C0100a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) throws Resources.NotFoundException {
        int i4;
        int i5 = i2;
        boolean z = arrayList.get(i5).q;
        if (this.E == null) {
            this.E = new ArrayList<>();
        } else {
            this.E.clear();
        }
        this.E.addAll(this.f776i);
        ComponentCallbacksC0108i componentCallbacksC0108iZ = z();
        boolean z2 = false;
        for (int i6 = i5; i6 < i3; i6++) {
            C0100a c0100a = arrayList.get(i6);
            if (!arrayList2.get(i6).booleanValue()) {
                componentCallbacksC0108iZ = c0100a.a(this.E, componentCallbacksC0108iZ);
            } else {
                componentCallbacksC0108iZ = c0100a.b(this.E, componentCallbacksC0108iZ);
            }
            z2 = z2 || c0100a.f640h;
        }
        this.E.clear();
        if (!z) {
            I.a(this, arrayList, arrayList2, i2, i3, false);
        }
        b(arrayList, arrayList2, i2, i3);
        if (z) {
            b.c.d<ComponentCallbacksC0108i> dVar = new b.c.d<>();
            b(dVar);
            int iA = a(arrayList, arrayList2, i2, i3, dVar);
            a(dVar);
            i4 = iA;
        } else {
            i4 = i3;
        }
        if (i4 != i5 && z) {
            I.a(this, arrayList, arrayList2, i2, i4, true);
            b(this.s, true);
        }
        while (i5 < i3) {
            C0100a c0100a2 = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue() && c0100a2.u >= 0) {
                d(c0100a2.u);
                c0100a2.u = -1;
            }
            c0100a2.c();
            i5++;
        }
        if (z2) {
            m();
        }
    }

    private void a(b.c.d<ComponentCallbacksC0108i> dVar) {
        int size = dVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0108i componentCallbacksC0108iC = dVar.c(i2);
            if (!componentCallbacksC0108iC.l) {
                View viewU = componentCallbacksC0108iC.u();
                componentCallbacksC0108iC.P = viewU.getAlpha();
                viewU.setAlpha(0.0f);
            }
        }
    }

    private int a(ArrayList<C0100a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, b.c.d<ComponentCallbacksC0108i> dVar) throws Resources.NotFoundException {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            C0100a c0100a = arrayList.get(i5);
            boolean zBooleanValue = arrayList2.get(i5).booleanValue();
            if (c0100a.e() && !c0100a.a(arrayList, i5 + 1, i3)) {
                if (this.H == null) {
                    this.H = new ArrayList<>();
                }
                g gVar = new g(c0100a, zBooleanValue);
                this.H.add(gVar);
                c0100a.a(gVar);
                if (zBooleanValue) {
                    c0100a.d();
                } else {
                    c0100a.b(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, c0100a);
                }
                b(dVar);
            }
        }
        return i4;
    }

    void a(C0100a c0100a, boolean z, boolean z2, boolean z3) throws Resources.NotFoundException {
        if (z) {
            c0100a.b(z3);
        } else {
            c0100a.d();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0100a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            I.a(this, (ArrayList<C0100a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            b(this.s, true);
        }
        for (ComponentCallbacksC0108i componentCallbacksC0108i : this.j.values()) {
            if (componentCallbacksC0108i != null && componentCallbacksC0108i.H != null && componentCallbacksC0108i.N && c0100a.b(componentCallbacksC0108i.x)) {
                if (componentCallbacksC0108i.P > 0.0f) {
                    componentCallbacksC0108i.H.setAlpha(componentCallbacksC0108i.P);
                }
                if (z3) {
                    componentCallbacksC0108i.P = 0.0f;
                } else {
                    componentCallbacksC0108i.P = -1.0f;
                    componentCallbacksC0108i.N = false;
                }
            }
        }
    }

    private ComponentCallbacksC0108i u(ComponentCallbacksC0108i componentCallbacksC0108i) {
        ViewGroup viewGroup = componentCallbacksC0108i.G;
        View view = componentCallbacksC0108i.H;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int iIndexOf = this.f776i.indexOf(componentCallbacksC0108i) - 1; iIndexOf >= 0; iIndexOf--) {
            ComponentCallbacksC0108i componentCallbacksC0108i2 = this.f776i.get(iIndexOf);
            if (componentCallbacksC0108i2.G == viewGroup && componentCallbacksC0108i2.H != null) {
                return componentCallbacksC0108i2;
            }
        }
        return null;
    }

    private static void b(ArrayList<C0100a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            C0100a c0100a = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                c0100a.a(-1);
                c0100a.b(i2 == i3 + (-1));
            } else {
                c0100a.a(1);
                c0100a.d();
            }
            i2++;
        }
    }

    private void b(b.c.d<ComponentCallbacksC0108i> dVar) throws Resources.NotFoundException {
        if (this.s < 1) {
            return;
        }
        int iMin = Math.min(this.s, 3);
        int size = this.f776i.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0108i componentCallbacksC0108i = this.f776i.get(i2);
            if (componentCallbacksC0108i.f726b < iMin) {
                a(componentCallbacksC0108i, iMin, componentCallbacksC0108i.U(), componentCallbacksC0108i.V(), false);
                if (componentCallbacksC0108i.H != null && !componentCallbacksC0108i.z && componentCallbacksC0108i.N) {
                    dVar.add(componentCallbacksC0108i);
                }
            }
        }
    }

    private void F() throws Resources.NotFoundException {
        if (this.H != null) {
            while (!this.H.isEmpty()) {
                this.H.remove(0).d();
            }
        }
    }

    private void G() throws Resources.NotFoundException {
        for (ComponentCallbacksC0108i componentCallbacksC0108i : this.j.values()) {
            if (componentCallbacksC0108i != null) {
                if (componentCallbacksC0108i.Z() != null) {
                    int iBa = componentCallbacksC0108i.ba();
                    View viewZ = componentCallbacksC0108i.Z();
                    Animation animation = viewZ.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        viewZ.clearAnimation();
                    }
                    componentCallbacksC0108i.a((View) null);
                    a(componentCallbacksC0108i, iBa, 0, 0, false);
                } else if (componentCallbacksC0108i.aa() != null) {
                    componentCallbacksC0108i.aa().end();
                }
            }
        }
    }

    private boolean c(ArrayList<C0100a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.f773f != null && this.f773f.size() != 0) {
                int size = this.f773f.size();
                boolean zA = false;
                for (int i2 = 0; i2 < size; i2++) {
                    zA |= this.f773f.get(i2).a(arrayList, arrayList2);
                }
                this.f773f.clear();
                this.t.l().removeCallbacks(this.J);
                return zA;
            }
            return false;
        }
    }

    void l() throws Resources.NotFoundException {
        if (this.B) {
            this.B = false;
            h();
        }
    }

    void m() {
        if (this.q != null) {
            for (int i2 = 0; i2 < this.q.size(); i2++) {
                this.q.get(i2).onBackStackChanged();
            }
        }
    }

    void b(C0100a c0100a) {
        if (this.k == null) {
            this.k = new ArrayList<>();
        }
        this.k.add(c0100a);
    }

    boolean a(ArrayList<C0100a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int size;
        if (this.k == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size2 = this.k.size() - 1;
            if (size2 < 0) {
                return false;
            }
            arrayList.add(this.k.remove(size2));
            arrayList2.add(true);
        } else {
            if (str != null || i2 >= 0) {
                size = this.k.size() - 1;
                while (size >= 0) {
                    C0100a c0100a = this.k.get(size);
                    if ((str != null && str.equals(c0100a.f())) || (i2 >= 0 && i2 == c0100a.u)) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    size--;
                    while (size >= 0) {
                        C0100a c0100a2 = this.k.get(size);
                        if ((str == null || !str.equals(c0100a2.f())) && (i2 < 0 || i2 != c0100a2.u)) {
                            break;
                        }
                        size--;
                    }
                }
            } else {
                size = -1;
            }
            if (size == this.k.size() - 1) {
                return false;
            }
            for (int size3 = this.k.size() - 1; size3 > size; size3--) {
                arrayList.add(this.k.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    void r(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (componentCallbacksC0108i.I == null) {
            return;
        }
        if (this.G == null) {
            this.G = new SparseArray<>();
        } else {
            this.G.clear();
        }
        componentCallbacksC0108i.I.saveHierarchyState(this.G);
        if (this.G.size() > 0) {
            componentCallbacksC0108i.f728d = this.G;
            this.G = null;
        }
    }

    Bundle s(ComponentCallbacksC0108i componentCallbacksC0108i) {
        Bundle bundle;
        if (this.F == null) {
            this.F = new Bundle();
        }
        componentCallbacksC0108i.l(this.F);
        d(componentCallbacksC0108i, this.F, false);
        if (this.F.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.F;
            this.F = null;
        }
        if (componentCallbacksC0108i.H != null) {
            r(componentCallbacksC0108i);
        }
        if (componentCallbacksC0108i.f728d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", componentCallbacksC0108i.f728d);
        }
        if (!componentCallbacksC0108i.K) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", componentCallbacksC0108i.K);
        }
        return bundle;
    }

    Parcelable n() {
        ArrayList<String> arrayList;
        int size;
        F();
        G();
        k();
        this.y = true;
        C0102c[] c0102cArr = null;
        if (this.j.isEmpty()) {
            return null;
        }
        ArrayList<C> arrayList2 = new ArrayList<>(this.j.size());
        boolean z = false;
        for (ComponentCallbacksC0108i componentCallbacksC0108i : this.j.values()) {
            if (componentCallbacksC0108i != null) {
                if (componentCallbacksC0108i.s != this) {
                    a(new IllegalStateException("Failure saving state: active " + componentCallbacksC0108i + " was removed from the FragmentManager"));
                    throw null;
                }
                C c2 = new C(componentCallbacksC0108i);
                arrayList2.add(c2);
                if (componentCallbacksC0108i.f726b > 0 && c2.m == null) {
                    c2.m = s(componentCallbacksC0108i);
                    if (componentCallbacksC0108i.f733i != null) {
                        ComponentCallbacksC0108i componentCallbacksC0108i2 = this.j.get(componentCallbacksC0108i.f733i);
                        if (componentCallbacksC0108i2 == null) {
                            a(new IllegalStateException("Failure saving state: " + componentCallbacksC0108i + " has target not in fragment manager: " + componentCallbacksC0108i.f733i));
                            throw null;
                        }
                        if (c2.m == null) {
                            c2.m = new Bundle();
                        }
                        a(c2.m, "android:target_state", componentCallbacksC0108i2);
                        if (componentCallbacksC0108i.j != 0) {
                            c2.m.putInt("android:target_req_state", componentCallbacksC0108i.j);
                        }
                    }
                } else {
                    c2.m = componentCallbacksC0108i.f727c;
                }
                if (f770c) {
                    Log.v("FragmentManager", "Saved state of " + componentCallbacksC0108i + ": " + c2.m);
                }
                z = true;
            }
        }
        if (!z) {
            if (f770c) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f776i.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<ComponentCallbacksC0108i> it = this.f776i.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC0108i next = it.next();
                arrayList.add(next.f730f);
                if (next.s != this) {
                    a(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                    throw null;
                }
                if (f770c) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f730f + "): " + next);
                }
            }
        } else {
            arrayList = null;
        }
        if (this.k != null && (size = this.k.size()) > 0) {
            c0102cArr = new C0102c[size];
            for (int i2 = 0; i2 < size; i2++) {
                c0102cArr[i2] = new C0102c(this.k.get(i2));
                if (f770c) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.k.get(i2));
                }
            }
        }
        y yVar = new y();
        yVar.f792a = arrayList2;
        yVar.f793b = arrayList;
        yVar.f794c = c0102cArr;
        if (this.w != null) {
            yVar.f795d = this.w.f730f;
        }
        yVar.f796e = this.f775h;
        return yVar;
    }

    void a(Parcelable parcelable) {
        C next;
        if (parcelable == null) {
            return;
        }
        y yVar = (y) parcelable;
        if (yVar.f792a == null) {
            return;
        }
        for (ComponentCallbacksC0108i componentCallbacksC0108i : this.I.d()) {
            if (f770c) {
                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + componentCallbacksC0108i);
            }
            Iterator<C> it = yVar.f792a.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.f625b.equals(componentCallbacksC0108i.f730f)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next == null) {
                if (f770c) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + componentCallbacksC0108i + " that was not found in the set of active Fragments " + yVar.f792a);
                }
                a(componentCallbacksC0108i, 1, 0, 0, false);
                componentCallbacksC0108i.m = true;
                a(componentCallbacksC0108i, 0, 0, 0, false);
            } else {
                next.n = componentCallbacksC0108i;
                componentCallbacksC0108i.f728d = null;
                componentCallbacksC0108i.r = 0;
                componentCallbacksC0108i.o = false;
                componentCallbacksC0108i.l = false;
                componentCallbacksC0108i.f733i = componentCallbacksC0108i.f732h != null ? componentCallbacksC0108i.f732h.f730f : null;
                componentCallbacksC0108i.f732h = null;
                if (next.m != null) {
                    next.m.setClassLoader(this.t.k().getClassLoader());
                    componentCallbacksC0108i.f728d = next.m.getSparseParcelableArray("android:view_state");
                    componentCallbacksC0108i.f727c = next.m;
                }
            }
        }
        this.j.clear();
        Iterator<C> it2 = yVar.f792a.iterator();
        while (it2.hasNext()) {
            C next2 = it2.next();
            if (next2 != null) {
                ComponentCallbacksC0108i componentCallbacksC0108iA = next2.a(this.t.k().getClassLoader(), d());
                componentCallbacksC0108iA.s = this;
                if (f770c) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + componentCallbacksC0108iA.f730f + "): " + componentCallbacksC0108iA);
                }
                this.j.put(componentCallbacksC0108iA.f730f, componentCallbacksC0108iA);
                next2.n = null;
            }
        }
        this.f776i.clear();
        if (yVar.f793b != null) {
            Iterator<String> it3 = yVar.f793b.iterator();
            while (it3.hasNext()) {
                String next3 = it3.next();
                ComponentCallbacksC0108i componentCallbacksC0108i2 = this.j.get(next3);
                if (componentCallbacksC0108i2 == null) {
                    a(new IllegalStateException("No instantiated fragment for (" + next3 + ")"));
                    throw null;
                }
                componentCallbacksC0108i2.l = true;
                if (f770c) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + next3 + "): " + componentCallbacksC0108i2);
                }
                if (this.f776i.contains(componentCallbacksC0108i2)) {
                    throw new IllegalStateException("Already added " + componentCallbacksC0108i2);
                }
                synchronized (this.f776i) {
                    this.f776i.add(componentCallbacksC0108i2);
                }
            }
        }
        if (yVar.f794c != null) {
            this.k = new ArrayList<>(yVar.f794c.length);
            for (int i2 = 0; i2 < yVar.f794c.length; i2++) {
                C0100a c0100aA = yVar.f794c[i2].a(this);
                if (f770c) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + c0100aA.u + "): " + c0100aA);
                    PrintWriter printWriter = new PrintWriter(new b.d.f.b("FragmentManager"));
                    c0100aA.a("  ", printWriter, false);
                    printWriter.close();
                }
                this.k.add(c0100aA);
                if (c0100aA.u >= 0) {
                    a(c0100aA.u, c0100aA);
                }
            }
        } else {
            this.k = null;
        }
        if (yVar.f795d != null) {
            this.w = this.j.get(yVar.f795d);
            v(this.w);
        }
        this.f775h = yVar.f796e;
    }

    private void H() {
        this.j.values().removeAll(Collections.singleton(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(AbstractC0113n abstractC0113n, AbstractC0110k abstractC0110k, ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (this.t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.t = abstractC0113n;
        this.u = abstractC0110k;
        this.v = componentCallbacksC0108i;
        if (this.v != null) {
            C();
        }
        if (abstractC0113n instanceof androidx.activity.e) {
            androidx.activity.e eVar = (androidx.activity.e) abstractC0113n;
            this.m = eVar.b();
            ComponentCallbacksC0108i componentCallbacksC0108i2 = eVar;
            if (componentCallbacksC0108i != null) {
                componentCallbacksC0108i2 = componentCallbacksC0108i;
            }
            this.m.a(componentCallbacksC0108i2, this.n);
        }
        if (componentCallbacksC0108i != null) {
            this.I = componentCallbacksC0108i.s.c(componentCallbacksC0108i);
        } else if (abstractC0113n instanceof androidx.lifecycle.w) {
            this.I = A.a(((androidx.lifecycle.w) abstractC0113n).d());
        } else {
            this.I = new A(false);
        }
    }

    public void o() {
        this.y = false;
        this.z = false;
        int size = this.f776i.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0108i componentCallbacksC0108i = this.f776i.get(i2);
            if (componentCallbacksC0108i != null) {
                componentCallbacksC0108i.M();
            }
        }
    }

    public void p() {
        this.y = false;
        this.z = false;
        e(1);
    }

    public void q() {
        this.y = false;
        this.z = false;
        e(2);
    }

    public void r() {
        this.y = false;
        this.z = false;
        e(3);
    }

    public void s() {
        this.y = false;
        this.z = false;
        e(4);
    }

    public void t() {
        e(3);
    }

    public void u() {
        this.z = true;
        e(2);
    }

    public void v() {
        e(1);
    }

    public void w() {
        this.A = true;
        k();
        e(0);
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.m != null) {
            this.n.b();
            this.m = null;
        }
    }

    private void e(int i2) {
        try {
            this.f774g = true;
            b(i2, false);
            this.f774g = false;
            k();
        } catch (Throwable th) {
            this.f774g = false;
            throw th;
        }
    }

    public void a(boolean z) {
        for (int size = this.f776i.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0108i componentCallbacksC0108i = this.f776i.get(size);
            if (componentCallbacksC0108i != null) {
                componentCallbacksC0108i.e(z);
            }
        }
    }

    public void b(boolean z) {
        for (int size = this.f776i.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0108i componentCallbacksC0108i = this.f776i.get(size);
            if (componentCallbacksC0108i != null) {
                componentCallbacksC0108i.f(z);
            }
        }
    }

    public void a(Configuration configuration) {
        for (int i2 = 0; i2 < this.f776i.size(); i2++) {
            ComponentCallbacksC0108i componentCallbacksC0108i = this.f776i.get(i2);
            if (componentCallbacksC0108i != null) {
                componentCallbacksC0108i.a(configuration);
            }
        }
    }

    public void x() {
        for (int i2 = 0; i2 < this.f776i.size(); i2++) {
            ComponentCallbacksC0108i componentCallbacksC0108i = this.f776i.get(i2);
            if (componentCallbacksC0108i != null) {
                componentCallbacksC0108i.O();
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.s < 1) {
            return false;
        }
        ArrayList<ComponentCallbacksC0108i> arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.f776i.size(); i2++) {
            ComponentCallbacksC0108i componentCallbacksC0108i = this.f776i.get(i2);
            if (componentCallbacksC0108i != null && componentCallbacksC0108i.b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(componentCallbacksC0108i);
                z = true;
            }
        }
        if (this.l != null) {
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                ComponentCallbacksC0108i componentCallbacksC0108i2 = this.l.get(i3);
                if (arrayList == null || !arrayList.contains(componentCallbacksC0108i2)) {
                    componentCallbacksC0108i2.y();
                }
            }
        }
        this.l = arrayList;
        return z;
    }

    public boolean a(Menu menu) {
        if (this.s < 1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.f776i.size(); i2++) {
            ComponentCallbacksC0108i componentCallbacksC0108i = this.f776i.get(i2);
            if (componentCallbacksC0108i != null && componentCallbacksC0108i.c(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean a(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f776i.size(); i2++) {
            ComponentCallbacksC0108i componentCallbacksC0108i = this.f776i.get(i2);
            if (componentCallbacksC0108i != null && componentCallbacksC0108i.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean b(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f776i.size(); i2++) {
            ComponentCallbacksC0108i componentCallbacksC0108i = this.f776i.get(i2);
            if (componentCallbacksC0108i != null && componentCallbacksC0108i.d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void b(Menu menu) {
        if (this.s < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.f776i.size(); i2++) {
            ComponentCallbacksC0108i componentCallbacksC0108i = this.f776i.get(i2);
            if (componentCallbacksC0108i != null) {
                componentCallbacksC0108i.d(menu);
            }
        }
    }

    public void t(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (componentCallbacksC0108i != null && (this.j.get(componentCallbacksC0108i.f730f) != componentCallbacksC0108i || (componentCallbacksC0108i.t != null && componentCallbacksC0108i.n() != this))) {
            throw new IllegalArgumentException("Fragment " + componentCallbacksC0108i + " is not an active fragment of FragmentManager " + this);
        }
        ComponentCallbacksC0108i componentCallbacksC0108i2 = this.w;
        this.w = componentCallbacksC0108i;
        v(componentCallbacksC0108i2);
        v(this.w);
    }

    private void v(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (componentCallbacksC0108i == null || this.j.get(componentCallbacksC0108i.f730f) != componentCallbacksC0108i) {
            return;
        }
        componentCallbacksC0108i.N();
    }

    void y() {
        C();
        v(this.w);
    }

    public ComponentCallbacksC0108i z() {
        return this.w;
    }

    public void a(ComponentCallbacksC0108i componentCallbacksC0108i, f.b bVar) {
        if (this.j.get(componentCallbacksC0108i.f730f) != componentCallbacksC0108i || (componentCallbacksC0108i.t != null && componentCallbacksC0108i.n() != this)) {
            throw new IllegalArgumentException("Fragment " + componentCallbacksC0108i + " is not an active fragment of FragmentManager " + this);
        }
        componentCallbacksC0108i.S = bVar;
    }

    @Override // androidx.fragment.app.AbstractC0114o
    public C0112m d() {
        if (super.d() == AbstractC0114o.f753a) {
            if (this.v != null) {
                return this.v.s.d();
            }
            a(new v(this));
        }
        return super.d();
    }

    void a(ComponentCallbacksC0108i componentCallbacksC0108i, Context context, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).a(componentCallbacksC0108i, context, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.a(this, componentCallbacksC0108i, context);
            }
        }
    }

    void b(ComponentCallbacksC0108i componentCallbacksC0108i, Context context, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).b(componentCallbacksC0108i, context, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.b(this, componentCallbacksC0108i, context);
            }
        }
    }

    void a(ComponentCallbacksC0108i componentCallbacksC0108i, Bundle bundle, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).a(componentCallbacksC0108i, bundle, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.a(this, componentCallbacksC0108i, bundle);
            }
        }
    }

    void b(ComponentCallbacksC0108i componentCallbacksC0108i, Bundle bundle, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).b(componentCallbacksC0108i, bundle, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.b(this, componentCallbacksC0108i, bundle);
            }
        }
    }

    void c(ComponentCallbacksC0108i componentCallbacksC0108i, Bundle bundle, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).c(componentCallbacksC0108i, bundle, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.c(this, componentCallbacksC0108i, bundle);
            }
        }
    }

    void a(ComponentCallbacksC0108i componentCallbacksC0108i, View view, Bundle bundle, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).a(componentCallbacksC0108i, view, bundle, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.a(this, componentCallbacksC0108i, view, bundle);
            }
        }
    }

    void b(ComponentCallbacksC0108i componentCallbacksC0108i, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).b(componentCallbacksC0108i, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.a(this, componentCallbacksC0108i);
            }
        }
    }

    void c(ComponentCallbacksC0108i componentCallbacksC0108i, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).c(componentCallbacksC0108i, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.b(this, componentCallbacksC0108i);
            }
        }
    }

    void d(ComponentCallbacksC0108i componentCallbacksC0108i, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).d(componentCallbacksC0108i, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.c(this, componentCallbacksC0108i);
            }
        }
    }

    void e(ComponentCallbacksC0108i componentCallbacksC0108i, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).e(componentCallbacksC0108i, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.d(this, componentCallbacksC0108i);
            }
        }
    }

    void d(ComponentCallbacksC0108i componentCallbacksC0108i, Bundle bundle, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).d(componentCallbacksC0108i, bundle, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.d(this, componentCallbacksC0108i, bundle);
            }
        }
    }

    void f(ComponentCallbacksC0108i componentCallbacksC0108i, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).f(componentCallbacksC0108i, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.e(this, componentCallbacksC0108i);
            }
        }
    }

    void g(ComponentCallbacksC0108i componentCallbacksC0108i, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).g(componentCallbacksC0108i, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.f(this, componentCallbacksC0108i);
            }
        }
    }

    void h(ComponentCallbacksC0108i componentCallbacksC0108i, boolean z) {
        if (this.v != null) {
            AbstractC0114o abstractC0114oN = this.v.n();
            if (abstractC0114oN instanceof w) {
                ((w) abstractC0114oN).h(componentCallbacksC0108i, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.g(this, componentCallbacksC0108i);
            }
        }
    }

    boolean A() {
        boolean zW = false;
        for (ComponentCallbacksC0108i componentCallbacksC0108i : this.j.values()) {
            if (componentCallbacksC0108i != null) {
                zW = w(componentCallbacksC0108i);
            }
            if (zW) {
                return true;
            }
        }
        return false;
    }

    private boolean w(ComponentCallbacksC0108i componentCallbacksC0108i) {
        return (componentCallbacksC0108i.D && componentCallbacksC0108i.E) || componentCallbacksC0108i.u.A();
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        ComponentCallbacksC0108i componentCallbacksC0108i;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f784a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (str2 == null || !C0112m.a(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        ComponentCallbacksC0108i componentCallbacksC0108iC = resourceId != -1 ? c(resourceId) : null;
        if (componentCallbacksC0108iC == null && string != null) {
            componentCallbacksC0108iC = a(string);
        }
        if (componentCallbacksC0108iC == null && id != -1) {
            componentCallbacksC0108iC = c(id);
        }
        if (f770c) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + componentCallbacksC0108iC);
        }
        if (componentCallbacksC0108iC == null) {
            ComponentCallbacksC0108i componentCallbacksC0108iC2 = d().c(context.getClassLoader(), str2);
            componentCallbacksC0108iC2.n = true;
            componentCallbacksC0108iC2.w = resourceId != 0 ? resourceId : id;
            componentCallbacksC0108iC2.x = id;
            componentCallbacksC0108iC2.y = string;
            componentCallbacksC0108iC2.o = true;
            componentCallbacksC0108iC2.s = this;
            componentCallbacksC0108iC2.t = this.t;
            componentCallbacksC0108iC2.a(this.t.k(), attributeSet, componentCallbacksC0108iC2.f727c);
            a(componentCallbacksC0108iC2, true);
            componentCallbacksC0108i = componentCallbacksC0108iC2;
        } else {
            if (componentCallbacksC0108iC.o) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            componentCallbacksC0108iC.o = true;
            componentCallbacksC0108iC.t = this.t;
            componentCallbacksC0108iC.a(this.t.k(), attributeSet, componentCallbacksC0108iC.f727c);
            componentCallbacksC0108i = componentCallbacksC0108iC;
        }
        if (this.s < 1 && componentCallbacksC0108i.n) {
            a(componentCallbacksC0108i, 1, 0, 0, false);
        } else {
            g(componentCallbacksC0108i);
        }
        if (componentCallbacksC0108i.H == null) {
            throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
        }
        if (resourceId != 0) {
            componentCallbacksC0108i.H.setId(resourceId);
        }
        if (componentCallbacksC0108i.H.getTag() == null) {
            componentCallbacksC0108i.H.setTag(string);
        }
        return componentCallbacksC0108i.H;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private class f implements e {

        /* renamed from: a, reason: collision with root package name */
        final String f785a;

        /* renamed from: b, reason: collision with root package name */
        final int f786b;

        /* renamed from: c, reason: collision with root package name */
        final int f787c;

        f(String str, int i2, int i3) {
            this.f785a = str;
            this.f786b = i2;
            this.f787c = i3;
        }

        @Override // androidx.fragment.app.w.e
        public boolean a(ArrayList<C0100a> arrayList, ArrayList<Boolean> arrayList2) {
            if (w.this.w == null || this.f786b >= 0 || this.f785a != null || !w.this.w.p().b()) {
                return w.this.a(arrayList, arrayList2, this.f785a, this.f786b, this.f787c);
            }
            return false;
        }
    }

    static class g implements ComponentCallbacksC0108i.c {

        /* renamed from: a, reason: collision with root package name */
        final boolean f789a;

        /* renamed from: b, reason: collision with root package name */
        final C0100a f790b;

        /* renamed from: c, reason: collision with root package name */
        private int f791c;

        g(C0100a c0100a, boolean z) {
            this.f789a = z;
            this.f790b = c0100a;
        }

        @Override // androidx.fragment.app.ComponentCallbacksC0108i.c
        public void b() {
            this.f791c--;
            if (this.f791c != 0) {
                return;
            }
            this.f790b.s.j();
        }

        @Override // androidx.fragment.app.ComponentCallbacksC0108i.c
        public void a() {
            this.f791c++;
        }

        public boolean c() {
            return this.f791c == 0;
        }

        public void d() throws Resources.NotFoundException {
            boolean z = this.f791c > 0;
            w wVar = this.f790b.s;
            int size = wVar.f776i.size();
            for (int i2 = 0; i2 < size; i2++) {
                ComponentCallbacksC0108i componentCallbacksC0108i = wVar.f776i.get(i2);
                componentCallbacksC0108i.a((ComponentCallbacksC0108i.c) null);
                if (z && componentCallbacksC0108i.ca()) {
                    componentCallbacksC0108i.H();
                }
            }
            this.f790b.s.a(this.f790b, this.f789a, !z, true);
        }

        public void e() throws Resources.NotFoundException {
            this.f790b.s.a(this.f790b, this.f789a, false, false);
        }
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f777a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f778b;

        a(Animation animation) {
            this.f777a = animation;
            this.f778b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f777a = null;
            this.f778b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    private static class b extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f779a;

        /* renamed from: b, reason: collision with root package name */
        private final View f780b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f781c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f782d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f783e;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f783e = true;
            this.f779a = viewGroup;
            this.f780b = view;
            addAnimation(animation);
            this.f779a.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f783e = true;
            if (this.f781c) {
                return !this.f782d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f781c = true;
                b.d.g.p.a(this.f779a, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f2) {
            this.f783e = true;
            if (this.f781c) {
                return !this.f782d;
            }
            if (!super.getTransformation(j, transformation, f2)) {
                this.f781c = true;
                b.d.g.p.a(this.f779a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f781c && this.f783e) {
                this.f783e = false;
                this.f779a.post(this);
            } else {
                this.f779a.endViewTransition(this.f780b);
                this.f782d = true;
            }
        }
    }
}
