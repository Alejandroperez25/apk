package androidx.fragment.app;

import androidx.lifecycle.f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: b, reason: collision with root package name */
    int f634b;

    /* renamed from: c, reason: collision with root package name */
    int f635c;

    /* renamed from: d, reason: collision with root package name */
    int f636d;

    /* renamed from: e, reason: collision with root package name */
    int f637e;

    /* renamed from: f, reason: collision with root package name */
    int f638f;

    /* renamed from: g, reason: collision with root package name */
    int f639g;

    /* renamed from: h, reason: collision with root package name */
    boolean f640h;
    String j;
    int k;
    CharSequence l;
    int m;
    CharSequence n;
    ArrayList<String> o;
    ArrayList<String> p;
    ArrayList<Runnable> r;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<a> f633a = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    boolean f641i = true;
    boolean q = false;

    public abstract int a();

    public abstract int b();

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f642a;

        /* renamed from: b, reason: collision with root package name */
        ComponentCallbacksC0108i f643b;

        /* renamed from: c, reason: collision with root package name */
        int f644c;

        /* renamed from: d, reason: collision with root package name */
        int f645d;

        /* renamed from: e, reason: collision with root package name */
        int f646e;

        /* renamed from: f, reason: collision with root package name */
        int f647f;

        /* renamed from: g, reason: collision with root package name */
        f.b f648g;

        /* renamed from: h, reason: collision with root package name */
        f.b f649h;

        a() {
        }

        a(int i2, ComponentCallbacksC0108i componentCallbacksC0108i) {
            this.f642a = i2;
            this.f643b = componentCallbacksC0108i;
            this.f648g = f.b.RESUMED;
            this.f649h = f.b.RESUMED;
        }
    }

    void a(a aVar) {
        this.f633a.add(aVar);
        aVar.f644c = this.f634b;
        aVar.f645d = this.f635c;
        aVar.f646e = this.f636d;
        aVar.f647f = this.f637e;
    }

    public D a(ComponentCallbacksC0108i componentCallbacksC0108i, String str) {
        a(0, componentCallbacksC0108i, str, 1);
        return this;
    }

    void a(int i2, ComponentCallbacksC0108i componentCallbacksC0108i, String str, int i3) {
        Class<?> cls = componentCallbacksC0108i.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            if (componentCallbacksC0108i.y != null && !str.equals(componentCallbacksC0108i.y)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC0108i + ": was " + componentCallbacksC0108i.y + " now " + str);
            }
            componentCallbacksC0108i.y = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC0108i + " with tag " + str + " to container view with no id");
            }
            if (componentCallbacksC0108i.w != 0 && componentCallbacksC0108i.w != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC0108i + ": was " + componentCallbacksC0108i.w + " now " + i2);
            }
            componentCallbacksC0108i.w = i2;
            componentCallbacksC0108i.x = i2;
        }
        a(new a(i3, componentCallbacksC0108i));
    }

    public D a(ComponentCallbacksC0108i componentCallbacksC0108i) {
        a(new a(3, componentCallbacksC0108i));
        return this;
    }
}
