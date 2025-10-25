package f.a.b.e;

import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* loaded from: classes.dex */
final class n extends View {

    /* renamed from: a, reason: collision with root package name */
    final Handler f5839a;

    /* renamed from: b, reason: collision with root package name */
    final IBinder f5840b;

    /* renamed from: c, reason: collision with root package name */
    final View f5841c;

    /* renamed from: d, reason: collision with root package name */
    final View f5842d;

    /* renamed from: e, reason: collision with root package name */
    final View f5843e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5844f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5845g;

    /* renamed from: h, reason: collision with root package name */
    private InputConnection f5846h;

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        return true;
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return true;
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return true;
    }

    n(View view, View view2, Handler handler) {
        super(view.getContext());
        this.f5844f = true;
        this.f5845g = false;
        this.f5839a = handler;
        this.f5841c = view;
        this.f5843e = view2;
        this.f5840b = view.getWindowToken();
        this.f5842d = view.getRootView();
        setFocusable(true);
        setFocusableInTouchMode(true);
        setVisibility(0);
    }

    void a(boolean z) {
        this.f5845g = z;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f5844f = false;
        InputConnection inputConnectionOnCreateInputConnection = this.f5845g ? this.f5846h : this.f5843e.onCreateInputConnection(editorInfo);
        this.f5844f = true;
        this.f5846h = inputConnectionOnCreateInputConnection;
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public View getRootView() {
        return this.f5842d;
    }

    @Override // android.view.View
    public IBinder getWindowToken() {
        return this.f5840b;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f5839a;
    }
}
