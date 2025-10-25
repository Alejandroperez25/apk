package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC0114o;
import androidx.fragment.app.ComponentCallbacksC0108i;
import androidx.fragment.app.D;
import androidx.fragment.app.w;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0100a extends D implements AbstractC0114o.a, w.e {
    final w s;
    boolean t;
    int u = -1;

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.u >= 0) {
            sb.append(" #");
            sb.append(this.u);
        }
        if (this.j != null) {
            sb.append(" ");
            sb.append(this.j);
        }
        sb.append("}");
        return sb.toString();
    }

    public void a(String str, PrintWriter printWriter) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.j);
            printWriter.print(" mIndex=");
            printWriter.print(this.u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.t);
            if (this.f638f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f638f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f639g));
            }
            if (this.f634b != 0 || this.f635c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f634b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f635c));
            }
            if (this.f636d != 0 || this.f637e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f636d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f637e));
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.l);
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.n);
            }
        }
        if (this.f633a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f633a.size();
        for (int i2 = 0; i2 < size; i2++) {
            D.a aVar = this.f633a.get(i2);
            switch (aVar.f642a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f642a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f643b);
            if (z) {
                if (aVar.f644c != 0 || aVar.f645d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f644c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f645d));
                }
                if (aVar.f646e != 0 || aVar.f647f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f646e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f647f));
                }
            }
        }
    }

    public C0100a(w wVar) {
        this.s = wVar;
    }

    @Override // androidx.fragment.app.D
    void a(int i2, ComponentCallbacksC0108i componentCallbacksC0108i, String str, int i3) {
        super.a(i2, componentCallbacksC0108i, str, i3);
        componentCallbacksC0108i.s = this.s;
    }

    @Override // androidx.fragment.app.D
    public D a(ComponentCallbacksC0108i componentCallbacksC0108i) {
        if (componentCallbacksC0108i.s != null && componentCallbacksC0108i.s != this.s) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC0108i.toString() + " is already attached to a FragmentManager.");
        }
        return super.a(componentCallbacksC0108i);
    }

    void a(int i2) {
        if (this.f640h) {
            if (w.f770c) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f633a.size();
            for (int i3 = 0; i3 < size; i3++) {
                D.a aVar = this.f633a.get(i3);
                if (aVar.f643b != null) {
                    aVar.f643b.r += i2;
                    if (w.f770c) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f643b + " to " + aVar.f643b.r);
                    }
                }
            }
        }
    }

    public void c() {
        if (this.r != null) {
            for (int i2 = 0; i2 < this.r.size(); i2++) {
                this.r.get(i2).run();
            }
            this.r = null;
        }
    }

    @Override // androidx.fragment.app.D
    public int a() {
        return a(false);
    }

    @Override // androidx.fragment.app.D
    public int b() {
        return a(true);
    }

    int a(boolean z) {
        if (this.t) {
            throw new IllegalStateException("commit already called");
        }
        if (w.f770c) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new b.d.f.b("FragmentManager"));
            a("  ", printWriter);
            printWriter.close();
        }
        this.t = true;
        if (this.f640h) {
            this.u = this.s.a(this);
        } else {
            this.u = -1;
        }
        this.s.a(this, z);
        return this.u;
    }

    @Override // androidx.fragment.app.w.e
    public boolean a(ArrayList<C0100a> arrayList, ArrayList<Boolean> arrayList2) {
        if (w.f770c) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f640h) {
            return true;
        }
        this.s.b(this);
        return true;
    }

    boolean b(int i2) {
        int size = this.f633a.size();
        for (int i3 = 0; i3 < size; i3++) {
            D.a aVar = this.f633a.get(i3);
            int i4 = aVar.f643b != null ? aVar.f643b.x : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    boolean a(ArrayList<C0100a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f633a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            D.a aVar = this.f633a.get(i5);
            int i6 = aVar.f643b != null ? aVar.f643b.x : 0;
            if (i6 != 0 && i6 != i4) {
                for (int i7 = i2; i7 < i3; i7++) {
                    C0100a c0100a = arrayList.get(i7);
                    int size2 = c0100a.f633a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        D.a aVar2 = c0100a.f633a.get(i8);
                        if ((aVar2.f643b != null ? aVar2.f643b.x : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    void d() {
        int size = this.f633a.size();
        for (int i2 = 0; i2 < size; i2++) {
            D.a aVar = this.f633a.get(i2);
            ComponentCallbacksC0108i componentCallbacksC0108i = aVar.f643b;
            if (componentCallbacksC0108i != null) {
                componentCallbacksC0108i.a(this.f638f, this.f639g);
            }
            int i3 = aVar.f642a;
            if (i3 == 1) {
                componentCallbacksC0108i.a(aVar.f644c);
                this.s.a(componentCallbacksC0108i, false);
            } else {
                switch (i3) {
                    case 3:
                        componentCallbacksC0108i.a(aVar.f645d);
                        this.s.m(componentCallbacksC0108i);
                        break;
                    case 4:
                        componentCallbacksC0108i.a(aVar.f645d);
                        this.s.n(componentCallbacksC0108i);
                        break;
                    case 5:
                        componentCallbacksC0108i.a(aVar.f644c);
                        this.s.o(componentCallbacksC0108i);
                        break;
                    case 6:
                        componentCallbacksC0108i.a(aVar.f645d);
                        this.s.p(componentCallbacksC0108i);
                        break;
                    case 7:
                        componentCallbacksC0108i.a(aVar.f644c);
                        this.s.q(componentCallbacksC0108i);
                        break;
                    case 8:
                        this.s.t(componentCallbacksC0108i);
                        break;
                    case 9:
                        this.s.t(null);
                        break;
                    case 10:
                        this.s.a(componentCallbacksC0108i, aVar.f649h);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + aVar.f642a);
                }
            }
            if (!this.q && aVar.f642a != 1 && componentCallbacksC0108i != null) {
                this.s.j(componentCallbacksC0108i);
            }
        }
        if (this.q) {
            return;
        }
        this.s.b(this.s.s, true);
    }

    void b(boolean z) {
        for (int size = this.f633a.size() - 1; size >= 0; size--) {
            D.a aVar = this.f633a.get(size);
            ComponentCallbacksC0108i componentCallbacksC0108i = aVar.f643b;
            if (componentCallbacksC0108i != null) {
                componentCallbacksC0108i.a(w.a(this.f638f), this.f639g);
            }
            int i2 = aVar.f642a;
            if (i2 == 1) {
                componentCallbacksC0108i.a(aVar.f647f);
                this.s.m(componentCallbacksC0108i);
            } else {
                switch (i2) {
                    case 3:
                        componentCallbacksC0108i.a(aVar.f646e);
                        this.s.a(componentCallbacksC0108i, false);
                        break;
                    case 4:
                        componentCallbacksC0108i.a(aVar.f646e);
                        this.s.o(componentCallbacksC0108i);
                        break;
                    case 5:
                        componentCallbacksC0108i.a(aVar.f647f);
                        this.s.n(componentCallbacksC0108i);
                        break;
                    case 6:
                        componentCallbacksC0108i.a(aVar.f646e);
                        this.s.q(componentCallbacksC0108i);
                        break;
                    case 7:
                        componentCallbacksC0108i.a(aVar.f647f);
                        this.s.p(componentCallbacksC0108i);
                        break;
                    case 8:
                        this.s.t(null);
                        break;
                    case 9:
                        this.s.t(componentCallbacksC0108i);
                        break;
                    case 10:
                        this.s.a(componentCallbacksC0108i, aVar.f648g);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + aVar.f642a);
                }
            }
            if (!this.q && aVar.f642a != 3 && componentCallbacksC0108i != null) {
                this.s.j(componentCallbacksC0108i);
            }
        }
        if (this.q || !z) {
            return;
        }
        this.s.b(this.s.s, true);
    }

    ComponentCallbacksC0108i a(ArrayList<ComponentCallbacksC0108i> arrayList, ComponentCallbacksC0108i componentCallbacksC0108i) {
        ComponentCallbacksC0108i componentCallbacksC0108i2 = componentCallbacksC0108i;
        int i2 = 0;
        while (i2 < this.f633a.size()) {
            D.a aVar = this.f633a.get(i2);
            switch (aVar.f642a) {
                case 1:
                case 7:
                    arrayList.add(aVar.f643b);
                    break;
                case 2:
                    ComponentCallbacksC0108i componentCallbacksC0108i3 = aVar.f643b;
                    int i3 = componentCallbacksC0108i3.x;
                    ComponentCallbacksC0108i componentCallbacksC0108i4 = componentCallbacksC0108i2;
                    int i4 = i2;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ComponentCallbacksC0108i componentCallbacksC0108i5 = arrayList.get(size);
                        if (componentCallbacksC0108i5.x == i3) {
                            if (componentCallbacksC0108i5 == componentCallbacksC0108i3) {
                                z = true;
                            } else {
                                if (componentCallbacksC0108i5 == componentCallbacksC0108i4) {
                                    this.f633a.add(i4, new D.a(9, componentCallbacksC0108i5));
                                    i4++;
                                    componentCallbacksC0108i4 = null;
                                }
                                D.a aVar2 = new D.a(3, componentCallbacksC0108i5);
                                aVar2.f644c = aVar.f644c;
                                aVar2.f646e = aVar.f646e;
                                aVar2.f645d = aVar.f645d;
                                aVar2.f647f = aVar.f647f;
                                this.f633a.add(i4, aVar2);
                                arrayList.remove(componentCallbacksC0108i5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f633a.remove(i4);
                        i4--;
                    } else {
                        aVar.f642a = 1;
                        arrayList.add(componentCallbacksC0108i3);
                    }
                    i2 = i4;
                    componentCallbacksC0108i2 = componentCallbacksC0108i4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(aVar.f643b);
                    if (aVar.f643b == componentCallbacksC0108i2) {
                        this.f633a.add(i2, new D.a(9, aVar.f643b));
                        i2++;
                        componentCallbacksC0108i2 = null;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    this.f633a.add(i2, new D.a(9, componentCallbacksC0108i2));
                    i2++;
                    componentCallbacksC0108i2 = aVar.f643b;
                    break;
            }
            i2++;
        }
        return componentCallbacksC0108i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.ComponentCallbacksC0108i b(java.util.ArrayList<androidx.fragment.app.ComponentCallbacksC0108i> r6, androidx.fragment.app.ComponentCallbacksC0108i r7) {
        /*
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.D$a> r0 = r5.f633a
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.D$a> r2 = r5.f633a
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.D$a r2 = (androidx.fragment.app.D.a) r2
            int r3 = r2.f642a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.f$b r3 = r2.f648g
            r2.f649h = r3
            goto L32
        L22:
            androidx.fragment.app.i r7 = r2.f643b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.i r2 = r2.f643b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.i r2 = r2.f643b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0100a.b(java.util.ArrayList, androidx.fragment.app.i):androidx.fragment.app.i");
    }

    boolean e() {
        for (int i2 = 0; i2 < this.f633a.size(); i2++) {
            if (b(this.f633a.get(i2))) {
                return true;
            }
        }
        return false;
    }

    void a(ComponentCallbacksC0108i.c cVar) {
        for (int i2 = 0; i2 < this.f633a.size(); i2++) {
            D.a aVar = this.f633a.get(i2);
            if (b(aVar)) {
                aVar.f643b.a(cVar);
            }
        }
    }

    private static boolean b(D.a aVar) {
        ComponentCallbacksC0108i componentCallbacksC0108i = aVar.f643b;
        return (componentCallbacksC0108i == null || !componentCallbacksC0108i.l || componentCallbacksC0108i.H == null || componentCallbacksC0108i.A || componentCallbacksC0108i.z || !componentCallbacksC0108i.ca()) ? false : true;
    }

    public String f() {
        return this.j;
    }
}
