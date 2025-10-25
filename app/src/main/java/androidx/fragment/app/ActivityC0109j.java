package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.b;
import androidx.lifecycle.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC0109j extends androidx.activity.c implements b.a, b.c {
    boolean j;
    boolean k;
    boolean m;
    boolean n;
    boolean o;
    int p;
    b.c.j<String> q;

    /* renamed from: h, reason: collision with root package name */
    final C0111l f743h = C0111l.a(new a());

    /* renamed from: i, reason: collision with root package name */
    final androidx.lifecycle.k f744i = new androidx.lifecycle.k(this);
    boolean l = true;

    public void a(ComponentCallbacksC0108i componentCallbacksC0108i) {
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        this.f743h.b();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String strA = this.q.a(i5);
            this.q.b(i5);
            if (strA == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksC0108i componentCallbacksC0108iA = this.f743h.a(strA);
            if (componentCallbacksC0108iA == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strA);
                return;
            }
            componentCallbacksC0108iA.a(i2 & 65535, i3, intent);
            return;
        }
        b.InterfaceC0006b interfaceC0006bA = androidx.core.app.b.a();
        if (interfaceC0006bA == null || !interfaceC0006bA.a(this, i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f743h.a(z);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f743h.b(z);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f743h.b();
        this.f743h.a(configuration);
    }

    @Override // androidx.activity.c, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f743h.a((ComponentCallbacksC0108i) null);
        if (bundle != null) {
            this.f743h.a(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.p = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.q = new b.c.j<>(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.q.b(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.q == null) {
            this.q = new b.c.j<>();
            this.p = 0;
        }
        super.onCreate(bundle);
        this.f744i.b(f.a.ON_CREATE);
        this.f743h.d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 == 0) {
            return super.onCreatePanelMenu(i2, menu) | this.f743h.a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewA = a(view, str, context, attributeSet);
        return viewA == null ? super.onCreateView(view, str, context, attributeSet) : viewA;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewA = a(null, str, context, attributeSet);
        return viewA == null ? super.onCreateView(str, context, attributeSet) : viewA;
    }

    final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f743h.a(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f743h.j();
        this.f744i.b(f.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f743h.k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f743h.a(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f743h.b(menuItem);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f743h.b(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.k = false;
        this.f743h.h();
        this.f744i.b(f.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f743h.b();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f743h.b();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.k = true;
        this.f743h.b();
        this.f743h.l();
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        f();
    }

    protected void f() {
        this.f744i.b(f.a.ON_RESUME);
        this.f743h.g();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            return a(view, menu) | this.f743h.a(menu);
        }
        return super.onPreparePanel(i2, view, menu);
    }

    @Deprecated
    protected boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // androidx.activity.c, androidx.core.app.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        i();
        this.f744i.b(f.a.ON_STOP);
        Parcelable parcelableC = this.f743h.c();
        if (parcelableC != null) {
            bundle.putParcelable("android:support:fragments", parcelableC);
        }
        if (this.q.a() > 0) {
            bundle.putInt("android:support:next_request_index", this.p);
            int[] iArr = new int[this.q.a()];
            String[] strArr = new String[this.q.a()];
            for (int i2 = 0; i2 < this.q.a(); i2++) {
                iArr[i2] = this.q.c(i2);
                strArr[i2] = this.q.d(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.l = false;
        if (!this.j) {
            this.j = true;
            this.f743h.e();
        }
        this.f743h.b();
        this.f743h.l();
        this.f744i.b(f.a.ON_START);
        this.f743h.f();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.l = true;
        i();
        this.f743h.i();
        this.f744i.b(f.a.ON_STOP);
    }

    @Deprecated
    public void g() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.j);
        printWriter.print(" mResumed=");
        printWriter.print(this.k);
        printWriter.print(" mStopped=");
        printWriter.print(this.l);
        if (getApplication() != null) {
            b.i.a.a.a(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f743h.a().a(str, fileDescriptor, printWriter, strArr);
    }

    public AbstractC0114o h() {
        return this.f743h.a();
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        if (!this.o && i2 != -1) {
            b(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (!this.o && i2 != -1) {
            b(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        if (!this.n && i2 != -1) {
            b(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.n && i2 != -1) {
            b(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    static void b(int i2) {
        if ((i2 & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // androidx.core.app.b.c
    public final void a(int i2) {
        if (this.m || i2 == -1) {
            return;
        }
        b(i2);
    }

    @Override // android.app.Activity, androidx.core.app.b.a
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f743h.b();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String strA = this.q.a(i4);
            this.q.b(i4);
            if (strA == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksC0108i componentCallbacksC0108iA = this.f743h.a(strA);
            if (componentCallbacksC0108iA == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strA);
                return;
            }
            componentCallbacksC0108iA.a(i2 & 65535, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.j$a */
    class a extends AbstractC0113n<ActivityC0109j> implements androidx.lifecycle.w, androidx.activity.e {
        public a() {
            super(ActivityC0109j.this);
        }

        @Override // androidx.lifecycle.i
        public androidx.lifecycle.f a() {
            return ActivityC0109j.this.f744i;
        }

        @Override // androidx.lifecycle.w
        public androidx.lifecycle.v d() {
            return ActivityC0109j.this.d();
        }

        @Override // androidx.activity.e
        public OnBackPressedDispatcher b() {
            return ActivityC0109j.this.b();
        }

        @Override // androidx.fragment.app.AbstractC0113n
        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC0109j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC0113n
        public boolean a(ComponentCallbacksC0108i componentCallbacksC0108i) {
            return !ActivityC0109j.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC0113n
        public LayoutInflater e() {
            return ActivityC0109j.this.getLayoutInflater().cloneInContext(ActivityC0109j.this);
        }

        @Override // androidx.fragment.app.AbstractC0113n
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public ActivityC0109j f() {
            return ActivityC0109j.this;
        }

        @Override // androidx.fragment.app.AbstractC0113n
        public void g() {
            ActivityC0109j.this.g();
        }

        @Override // androidx.fragment.app.AbstractC0113n
        public boolean h() {
            return ActivityC0109j.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.AbstractC0113n
        public int i() {
            Window window = ActivityC0109j.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.AbstractC0113n
        public void b(ComponentCallbacksC0108i componentCallbacksC0108i) {
            ActivityC0109j.this.a(componentCallbacksC0108i);
        }

        @Override // androidx.fragment.app.AbstractC0110k
        public View a(int i2) {
            return ActivityC0109j.this.findViewById(i2);
        }

        @Override // androidx.fragment.app.AbstractC0110k
        public boolean c() {
            Window window = ActivityC0109j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    private void i() {
        while (a(h(), f.b.CREATED)) {
        }
    }

    private static boolean a(AbstractC0114o abstractC0114o, f.b bVar) {
        boolean zA = false;
        for (ComponentCallbacksC0108i componentCallbacksC0108i : abstractC0114o.c()) {
            if (componentCallbacksC0108i != null) {
                if (componentCallbacksC0108i.a().a().a(f.b.STARTED)) {
                    componentCallbacksC0108i.T.b(bVar);
                    zA = true;
                }
                if (componentCallbacksC0108i.l() != null) {
                    zA |= a(componentCallbacksC0108i.p(), bVar);
                }
            }
        }
        return zA;
    }
}
