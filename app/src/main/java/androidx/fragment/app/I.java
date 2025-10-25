package androidx.fragment.app;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
abstract class I {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f676a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    private static final R f677b;

    /* renamed from: c, reason: collision with root package name */
    private static final R f678c;

    static {
        f677b = Build.VERSION.SDK_INT >= 21 ? new N() : null;
        f678c = a();
    }

    private static R a() {
        try {
            return (R) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static void a(w wVar, ArrayList<C0100a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z) {
        if (wVar.s < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            C0100a c0100a = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                b(c0100a, (SparseArray<a>) sparseArray, z);
            } else {
                a(c0100a, (SparseArray<a>) sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(wVar.t.k());
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = sparseArray.keyAt(i5);
                b.c.b<String, String> bVarA = a(iKeyAt, arrayList, arrayList2, i2, i3);
                a aVar = (a) sparseArray.valueAt(i5);
                if (z) {
                    a(wVar, iKeyAt, aVar, view, bVarA);
                } else {
                    b(wVar, iKeyAt, aVar, view, bVarA);
                }
            }
        }
    }

    private static b.c.b<String, String> a(int i2, ArrayList<C0100a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        b.c.b<String, String> bVar = new b.c.b<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            C0100a c0100a = arrayList.get(i5);
            if (c0100a.b(i2)) {
                boolean zBooleanValue = arrayList2.get(i5).booleanValue();
                if (c0100a.o != null) {
                    int size = c0100a.o.size();
                    if (zBooleanValue) {
                        arrayList3 = c0100a.o;
                        arrayList4 = c0100a.p;
                    } else {
                        ArrayList<String> arrayList5 = c0100a.o;
                        arrayList3 = c0100a.p;
                        arrayList4 = arrayList5;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String strRemove = bVar.remove(str2);
                        if (strRemove != null) {
                            bVar.put(str, strRemove);
                        } else {
                            bVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return bVar;
    }

    private static void a(w wVar, int i2, a aVar, View view, b.c.b<String, String> bVar) {
        ComponentCallbacksC0108i componentCallbacksC0108i;
        ComponentCallbacksC0108i componentCallbacksC0108i2;
        R rA;
        Object obj;
        ViewGroup viewGroup = wVar.u.c() ? (ViewGroup) wVar.u.a(i2) : null;
        if (viewGroup == null || (rA = a((componentCallbacksC0108i2 = aVar.f682d), (componentCallbacksC0108i = aVar.f679a))) == null) {
            return;
        }
        boolean z = aVar.f680b;
        boolean z2 = aVar.f683e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objA = a(rA, componentCallbacksC0108i, z);
        Object objB = b(rA, componentCallbacksC0108i2, z2);
        Object objA2 = a(rA, viewGroup, view, bVar, aVar, arrayList2, arrayList, objA, objB);
        if (objA == null && objA2 == null) {
            obj = objB;
            if (obj == null) {
                return;
            }
        } else {
            obj = objB;
        }
        ArrayList<View> arrayListA = a(rA, obj, componentCallbacksC0108i2, arrayList2, view);
        ArrayList<View> arrayListA2 = a(rA, objA, componentCallbacksC0108i, arrayList, view);
        a(arrayListA2, 4);
        Object objA3 = a(rA, objA, obj, objA2, componentCallbacksC0108i, z);
        if (objA3 != null) {
            a(rA, obj, componentCallbacksC0108i2, arrayListA);
            ArrayList<String> arrayListA3 = rA.a(arrayList);
            rA.a(objA3, objA, arrayListA2, obj, arrayListA, objA2, arrayList);
            rA.a(viewGroup, objA3);
            rA.a(viewGroup, arrayList2, arrayList, arrayListA3, bVar);
            a(arrayListA2, 0);
            rA.a(objA2, arrayList2, arrayList);
        }
    }

    private static void a(R r, Object obj, ComponentCallbacksC0108i componentCallbacksC0108i, ArrayList<View> arrayList) {
        if (componentCallbacksC0108i != null && obj != null && componentCallbacksC0108i.l && componentCallbacksC0108i.z && componentCallbacksC0108i.O) {
            componentCallbacksC0108i.g(true);
            r.b(obj, componentCallbacksC0108i.t(), arrayList);
            b.d.g.p.a(componentCallbacksC0108i.G, new E(arrayList));
        }
    }

    private static void b(w wVar, int i2, a aVar, View view, b.c.b<String, String> bVar) {
        ComponentCallbacksC0108i componentCallbacksC0108i;
        ComponentCallbacksC0108i componentCallbacksC0108i2;
        R rA;
        Object obj;
        ViewGroup viewGroup = wVar.u.c() ? (ViewGroup) wVar.u.a(i2) : null;
        if (viewGroup == null || (rA = a((componentCallbacksC0108i2 = aVar.f682d), (componentCallbacksC0108i = aVar.f679a))) == null) {
            return;
        }
        boolean z = aVar.f680b;
        boolean z2 = aVar.f683e;
        Object objA = a(rA, componentCallbacksC0108i, z);
        Object objB = b(rA, componentCallbacksC0108i2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objB2 = b(rA, viewGroup, view, bVar, aVar, arrayList, arrayList2, objA, objB);
        if (objA == null && objB2 == null) {
            obj = objB;
            if (obj == null) {
                return;
            }
        } else {
            obj = objB;
        }
        ArrayList<View> arrayListA = a(rA, obj, componentCallbacksC0108i2, (ArrayList<View>) arrayList, view);
        Object obj2 = (arrayListA == null || arrayListA.isEmpty()) ? null : obj;
        rA.b(objA, view);
        Object objA2 = a(rA, objA, obj2, objB2, componentCallbacksC0108i, aVar.f680b);
        if (objA2 != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            rA.a(objA2, objA, arrayList3, obj2, arrayListA, objB2, arrayList2);
            a(rA, viewGroup, componentCallbacksC0108i, view, arrayList2, objA, arrayList3, obj2, arrayListA);
            rA.a((View) viewGroup, arrayList2, (Map<String, String>) bVar);
            rA.a(viewGroup, objA2);
            rA.a(viewGroup, arrayList2, (Map<String, String>) bVar);
        }
    }

    private static void a(R r, ViewGroup viewGroup, ComponentCallbacksC0108i componentCallbacksC0108i, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        b.d.g.p.a(viewGroup, new F(obj, r, view, componentCallbacksC0108i, arrayList, arrayList2, arrayList3, obj2));
    }

    private static R a(ComponentCallbacksC0108i componentCallbacksC0108i, ComponentCallbacksC0108i componentCallbacksC0108i2) {
        ArrayList arrayList = new ArrayList();
        if (componentCallbacksC0108i != null) {
            Object objB = componentCallbacksC0108i.B();
            if (objB != null) {
                arrayList.add(objB);
            }
            Object objA = componentCallbacksC0108i.A();
            if (objA != null) {
                arrayList.add(objA);
            }
            Object objE = componentCallbacksC0108i.E();
            if (objE != null) {
                arrayList.add(objE);
            }
        }
        if (componentCallbacksC0108i2 != null) {
            Object objZ = componentCallbacksC0108i2.z();
            if (objZ != null) {
                arrayList.add(objZ);
            }
            Object objC = componentCallbacksC0108i2.C();
            if (objC != null) {
                arrayList.add(objC);
            }
            Object objD = componentCallbacksC0108i2.D();
            if (objD != null) {
                arrayList.add(objD);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (f677b != null && a(f677b, arrayList)) {
            return f677b;
        }
        if (f678c != null && a(f678c, arrayList)) {
            return f678c;
        }
        if (f677b == null && f678c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static boolean a(R r, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!r.a(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static Object a(R r, ComponentCallbacksC0108i componentCallbacksC0108i, ComponentCallbacksC0108i componentCallbacksC0108i2, boolean z) {
        Object objD;
        if (componentCallbacksC0108i == null || componentCallbacksC0108i2 == null) {
            return null;
        }
        if (z) {
            objD = componentCallbacksC0108i2.E();
        } else {
            objD = componentCallbacksC0108i.D();
        }
        return r.c(r.b(objD));
    }

    private static Object a(R r, ComponentCallbacksC0108i componentCallbacksC0108i, boolean z) {
        Object objZ;
        if (componentCallbacksC0108i == null) {
            return null;
        }
        if (z) {
            objZ = componentCallbacksC0108i.C();
        } else {
            objZ = componentCallbacksC0108i.z();
        }
        return r.b(objZ);
    }

    private static Object b(R r, ComponentCallbacksC0108i componentCallbacksC0108i, boolean z) {
        Object objB;
        if (componentCallbacksC0108i == null) {
            return null;
        }
        if (z) {
            objB = componentCallbacksC0108i.A();
        } else {
            objB = componentCallbacksC0108i.B();
        }
        return r.b(objB);
    }

    private static Object a(R r, ViewGroup viewGroup, View view, b.c.b<String, String> bVar, a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        ComponentCallbacksC0108i componentCallbacksC0108i = aVar.f679a;
        ComponentCallbacksC0108i componentCallbacksC0108i2 = aVar.f682d;
        if (componentCallbacksC0108i != null) {
            componentCallbacksC0108i.u().setVisibility(0);
        }
        if (componentCallbacksC0108i == null || componentCallbacksC0108i2 == null) {
            return null;
        }
        boolean z = aVar.f680b;
        Object objA = bVar.isEmpty() ? null : a(r, componentCallbacksC0108i, componentCallbacksC0108i2, z);
        b.c.b<String, View> bVarB = b(r, bVar, objA, aVar);
        b.c.b<String, View> bVarA = a(r, bVar, objA, aVar);
        if (bVar.isEmpty()) {
            if (bVarB != null) {
                bVarB.clear();
            }
            if (bVarA != null) {
                bVarA.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, bVarB, bVar.keySet());
            a(arrayList2, bVarA, bVar.values());
            obj3 = objA;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        a(componentCallbacksC0108i, componentCallbacksC0108i2, z, bVarB, true);
        if (obj3 != null) {
            arrayList2.add(view);
            r.a(obj3, view, arrayList);
            a(r, obj3, obj2, bVarB, aVar.f683e, aVar.f684f);
            Rect rect2 = new Rect();
            View viewA = a(bVarA, aVar, obj, z);
            if (viewA != null) {
                r.a(obj, rect2);
            }
            rect = rect2;
            view2 = viewA;
        } else {
            view2 = null;
            rect = null;
        }
        b.d.g.p.a(viewGroup, new G(componentCallbacksC0108i, componentCallbacksC0108i2, z, bVarA, view2, r, rect));
        return obj3;
    }

    private static void a(ArrayList<View> arrayList, b.c.b<String, View> bVar, Collection<String> collection) {
        for (int size = bVar.size() - 1; size >= 0; size--) {
            View viewC = bVar.c(size);
            if (collection.contains(b.d.g.v.e(viewC))) {
                arrayList.add(viewC);
            }
        }
    }

    private static Object b(R r, ViewGroup viewGroup, View view, b.c.b<String, String> bVar, a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object objA;
        b.c.b<String, String> bVar2;
        Object obj3;
        Rect rect;
        ComponentCallbacksC0108i componentCallbacksC0108i = aVar.f679a;
        ComponentCallbacksC0108i componentCallbacksC0108i2 = aVar.f682d;
        if (componentCallbacksC0108i == null || componentCallbacksC0108i2 == null) {
            return null;
        }
        boolean z = aVar.f680b;
        if (bVar.isEmpty()) {
            bVar2 = bVar;
            objA = null;
        } else {
            objA = a(r, componentCallbacksC0108i, componentCallbacksC0108i2, z);
            bVar2 = bVar;
        }
        b.c.b<String, View> bVarB = b(r, bVar2, objA, aVar);
        if (bVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(bVarB.values());
            obj3 = objA;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        a(componentCallbacksC0108i, componentCallbacksC0108i2, z, bVarB, true);
        if (obj3 != null) {
            rect = new Rect();
            r.a(obj3, view, arrayList);
            a(r, obj3, obj2, bVarB, aVar.f683e, aVar.f684f);
            if (obj != null) {
                r.a(obj, rect);
            }
        } else {
            rect = null;
        }
        b.d.g.p.a(viewGroup, new H(r, bVar, obj3, aVar, arrayList2, view, componentCallbacksC0108i, componentCallbacksC0108i2, z, arrayList, obj, rect));
        return obj3;
    }

    private static b.c.b<String, View> b(R r, b.c.b<String, String> bVar, Object obj, a aVar) {
        androidx.core.app.j jVarY;
        ArrayList<String> arrayList;
        if (bVar.isEmpty() || obj == null) {
            bVar.clear();
            return null;
        }
        ComponentCallbacksC0108i componentCallbacksC0108i = aVar.f682d;
        b.c.b<String, View> bVar2 = new b.c.b<>();
        r.a((Map<String, View>) bVar2, componentCallbacksC0108i.u());
        C0100a c0100a = aVar.f684f;
        if (aVar.f683e) {
            jVarY = componentCallbacksC0108i.X();
            arrayList = c0100a.p;
        } else {
            jVarY = componentCallbacksC0108i.Y();
            arrayList = c0100a.o;
        }
        bVar2.a((Collection<?>) arrayList);
        if (jVarY != null) {
            jVarY.a(arrayList, bVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = bVar2.get(str);
                if (view == null) {
                    bVar.remove(str);
                } else if (!str.equals(b.d.g.v.e(view))) {
                    bVar.put(b.d.g.v.e(view), bVar.remove(str));
                }
            }
        } else {
            bVar.a((Collection<?>) bVar2.keySet());
        }
        return bVar2;
    }

    static b.c.b<String, View> a(R r, b.c.b<String, String> bVar, Object obj, a aVar) {
        androidx.core.app.j jVarX;
        ArrayList<String> arrayList;
        String strA;
        ComponentCallbacksC0108i componentCallbacksC0108i = aVar.f679a;
        View viewT = componentCallbacksC0108i.t();
        if (bVar.isEmpty() || obj == null || viewT == null) {
            bVar.clear();
            return null;
        }
        b.c.b<String, View> bVar2 = new b.c.b<>();
        r.a((Map<String, View>) bVar2, viewT);
        C0100a c0100a = aVar.f681c;
        if (aVar.f680b) {
            jVarX = componentCallbacksC0108i.Y();
            arrayList = c0100a.o;
        } else {
            jVarX = componentCallbacksC0108i.X();
            arrayList = c0100a.p;
        }
        if (arrayList != null) {
            bVar2.a((Collection<?>) arrayList);
            bVar2.a((Collection<?>) bVar.values());
        }
        if (jVarX != null) {
            jVarX.a(arrayList, bVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = bVar2.get(str);
                if (view == null) {
                    String strA2 = a(bVar, str);
                    if (strA2 != null) {
                        bVar.remove(strA2);
                    }
                } else if (!str.equals(b.d.g.v.e(view)) && (strA = a(bVar, str)) != null) {
                    bVar.put(strA, b.d.g.v.e(view));
                }
            }
        } else {
            a(bVar, bVar2);
        }
        return bVar2;
    }

    private static String a(b.c.b<String, String> bVar, String str) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equals(bVar.c(i2))) {
                return bVar.b(i2);
            }
        }
        return null;
    }

    static View a(b.c.b<String, View> bVar, a aVar, Object obj, boolean z) {
        String str;
        C0100a c0100a = aVar.f681c;
        if (obj == null || bVar == null || c0100a.o == null || c0100a.o.isEmpty()) {
            return null;
        }
        if (z) {
            str = c0100a.o.get(0);
        } else {
            str = c0100a.p.get(0);
        }
        return bVar.get(str);
    }

    private static void a(R r, Object obj, Object obj2, b.c.b<String, View> bVar, boolean z, C0100a c0100a) {
        String str;
        if (c0100a.o == null || c0100a.o.isEmpty()) {
            return;
        }
        if (z) {
            str = c0100a.p.get(0);
        } else {
            str = c0100a.o.get(0);
        }
        View view = bVar.get(str);
        r.a(obj, view);
        if (obj2 != null) {
            r.a(obj2, view);
        }
    }

    private static void a(b.c.b<String, String> bVar, b.c.b<String, View> bVar2) {
        for (int size = bVar.size() - 1; size >= 0; size--) {
            if (!bVar2.containsKey(bVar.c(size))) {
                bVar.d(size);
            }
        }
    }

    static void a(ComponentCallbacksC0108i componentCallbacksC0108i, ComponentCallbacksC0108i componentCallbacksC0108i2, boolean z, b.c.b<String, View> bVar, boolean z2) {
        androidx.core.app.j jVarX;
        if (z) {
            jVarX = componentCallbacksC0108i2.X();
        } else {
            jVarX = componentCallbacksC0108i.X();
        }
        if (jVarX != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = bVar == null ? 0 : bVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(bVar.b(i2));
                arrayList.add(bVar.c(i2));
            }
            if (z2) {
                jVarX.a(arrayList2, arrayList, null);
            } else {
                jVarX.b(arrayList2, arrayList, null);
            }
        }
    }

    static ArrayList<View> a(R r, Object obj, ComponentCallbacksC0108i componentCallbacksC0108i, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View viewT = componentCallbacksC0108i.t();
        if (viewT != null) {
            r.a(arrayList2, viewT);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        r.a(obj, arrayList2);
        return arrayList2;
    }

    static void a(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    private static Object a(R r, Object obj, Object obj2, Object obj3, ComponentCallbacksC0108i componentCallbacksC0108i, boolean z) {
        boolean zF;
        if (obj == null || obj2 == null || componentCallbacksC0108i == null) {
            zF = true;
        } else if (z) {
            zF = componentCallbacksC0108i.G();
        } else {
            zF = componentCallbacksC0108i.F();
        }
        if (zF) {
            return r.a(obj2, obj, obj3);
        }
        return r.b(obj2, obj, obj3);
    }

    public static void a(C0100a c0100a, SparseArray<a> sparseArray, boolean z) throws Resources.NotFoundException {
        int size = c0100a.f633a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(c0100a, c0100a.f633a.get(i2), sparseArray, false, z);
        }
    }

    public static void b(C0100a c0100a, SparseArray<a> sparseArray, boolean z) throws Resources.NotFoundException {
        if (c0100a.s.u.c()) {
            for (int size = c0100a.f633a.size() - 1; size >= 0; size--) {
                a(c0100a, c0100a.f633a.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0020. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(androidx.fragment.app.C0100a r15, androidx.fragment.app.D.a r16, android.util.SparseArray<androidx.fragment.app.I.a> r17, boolean r18, boolean r19) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.I.a(androidx.fragment.app.a, androidx.fragment.app.D$a, android.util.SparseArray, boolean, boolean):void");
    }

    private static a a(a aVar, SparseArray<a> sparseArray, int i2) {
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        sparseArray.put(i2, aVar2);
        return aVar2;
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        public ComponentCallbacksC0108i f679a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f680b;

        /* renamed from: c, reason: collision with root package name */
        public C0100a f681c;

        /* renamed from: d, reason: collision with root package name */
        public ComponentCallbacksC0108i f682d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f683e;

        /* renamed from: f, reason: collision with root package name */
        public C0100a f684f;

        a() {
        }
    }
}
