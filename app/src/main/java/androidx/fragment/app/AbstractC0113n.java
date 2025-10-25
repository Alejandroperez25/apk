package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0113n<E> extends AbstractC0110k {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f748a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f749b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f750c;

    /* renamed from: d, reason: collision with root package name */
    private final int f751d;

    /* renamed from: e, reason: collision with root package name */
    final w f752e;

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract boolean a(ComponentCallbacksC0108i componentCallbacksC0108i);

    abstract void b(ComponentCallbacksC0108i componentCallbacksC0108i);

    public abstract LayoutInflater e();

    public abstract E f();

    public abstract void g();

    public abstract boolean h();

    public abstract int i();

    AbstractC0113n(ActivityC0109j activityC0109j) {
        this(activityC0109j, activityC0109j, new Handler(), 0);
    }

    AbstractC0113n(Activity activity, Context context, Handler handler, int i2) {
        this.f752e = new w();
        this.f748a = activity;
        b.d.f.d.a(context, "context == null");
        this.f749b = context;
        b.d.f.d.a(handler, "handler == null");
        this.f750c = handler;
        this.f751d = i2;
    }

    Activity j() {
        return this.f748a;
    }

    Context k() {
        return this.f749b;
    }

    Handler l() {
        return this.f750c;
    }
}
