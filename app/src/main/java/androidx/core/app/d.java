package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.f;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import b.d.g.d;

/* loaded from: classes.dex */
public abstract class d extends Activity implements androidx.lifecycle.i, d.a {

    /* renamed from: a, reason: collision with root package name */
    private b.c.i<Class<? extends ComponentActivity.ExtraData>, ComponentActivity.ExtraData> f487a = new b.c.i<>();

    /* renamed from: b, reason: collision with root package name */
    private k f488b = new k(this);

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s.a(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f488b.a(f.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // b.d.g.d.a
    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !b.d.g.d.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !b.d.g.d.a(decorView, keyEvent)) {
            return b.d.g.d.a(this, decorView, this, keyEvent);
        }
        return true;
    }
}
