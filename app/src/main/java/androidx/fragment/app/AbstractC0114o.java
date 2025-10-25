package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0114o {

    /* renamed from: a, reason: collision with root package name */
    static final C0112m f753a = new C0112m();

    /* renamed from: b, reason: collision with root package name */
    private C0112m f754b = null;

    /* renamed from: androidx.fragment.app.o$a */
    public interface a {
    }

    /* renamed from: androidx.fragment.app.o$b */
    public static abstract class b {
        public abstract void a(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i);

        public abstract void a(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i, Context context);

        public abstract void a(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i, Bundle bundle);

        public abstract void a(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i, View view, Bundle bundle);

        public abstract void b(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i);

        public abstract void b(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i, Context context);

        public abstract void b(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i, Bundle bundle);

        public abstract void c(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i);

        public abstract void c(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i, Bundle bundle);

        public abstract void d(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i);

        public abstract void d(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i, Bundle bundle);

        public abstract void e(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i);

        public abstract void f(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i);

        public abstract void g(AbstractC0114o abstractC0114o, ComponentCallbacksC0108i componentCallbacksC0108i);
    }

    /* renamed from: androidx.fragment.app.o$c */
    public interface c {
        void onBackStackChanged();
    }

    public abstract D a();

    public abstract ComponentCallbacksC0108i a(String str);

    public abstract void a(int i2, int i3);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract boolean b();

    public abstract List<ComponentCallbacksC0108i> c();

    public void a(C0112m c0112m) {
        this.f754b = c0112m;
    }

    public C0112m d() {
        if (this.f754b == null) {
            this.f754b = f753a;
        }
        return this.f754b;
    }
}
