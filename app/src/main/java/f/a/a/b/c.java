package f.a.a.b;

import android.annotation.SuppressLint;
import android.os.Build;
import android.provider.Settings;
import android.text.Editable;
import android.text.Selection;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.e.p;
import io.flutter.plugin.platform.n;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final View f5691a;

    /* renamed from: b, reason: collision with root package name */
    private final InputMethodManager f5692b;

    /* renamed from: c, reason: collision with root package name */
    private final p f5693c;

    /* renamed from: d, reason: collision with root package name */
    private a f5694d = new a(a.EnumC0068a.NO_TARGET, 0);

    /* renamed from: e, reason: collision with root package name */
    private p.a f5695e;

    /* renamed from: f, reason: collision with root package name */
    private Editable f5696f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5697g;

    /* renamed from: h, reason: collision with root package name */
    private InputConnection f5698h;

    /* renamed from: i, reason: collision with root package name */
    private n f5699i;
    private final boolean j;
    private boolean k;

    public c(View view, io.flutter.embedding.engine.a.b bVar, n nVar) {
        this.f5691a = view;
        this.f5692b = (InputMethodManager) view.getContext().getSystemService("input_method");
        this.f5693c = new p(bVar);
        this.f5693c.a(new b(this));
        this.f5693c.a();
        this.f5699i = nVar;
        this.f5699i.a(this);
        this.j = e();
    }

    public InputMethodManager a() {
        return this.f5692b;
    }

    public void b() {
        if (this.f5694d.f5700a == a.EnumC0068a.PLATFORM_VIEW) {
            this.k = true;
        }
    }

    public void c() {
        this.k = false;
    }

    private static int a(p.b bVar, boolean z, boolean z2, boolean z3, p.c cVar) {
        int i2;
        if (bVar.f6113a == p.f.DATETIME) {
            return 4;
        }
        if (bVar.f6113a == p.f.NUMBER) {
            int i3 = bVar.f6114b ? 4098 : 2;
            return bVar.f6115c ? i3 | 8192 : i3;
        }
        if (bVar.f6113a == p.f.PHONE) {
            return 3;
        }
        int i4 = 1;
        if (bVar.f6113a == p.f.MULTILINE) {
            i4 = 131073;
        } else if (bVar.f6113a == p.f.EMAIL_ADDRESS) {
            i4 = 33;
        } else if (bVar.f6113a == p.f.URL) {
            i4 = 17;
        } else if (bVar.f6113a == p.f.VISIBLE_PASSWORD) {
            i4 = 145;
        }
        if (z) {
            i2 = 524288 | i4 | 128;
        } else {
            if (z2) {
                i4 |= 32768;
            }
            i2 = !z3 ? 524288 | i4 : i4;
        }
        return cVar == p.c.CHARACTERS ? i2 | 4096 : cVar == p.c.WORDS ? i2 | 8192 : cVar == p.c.SENTENCES ? i2 | 16384 : i2;
    }

    public InputConnection a(View view, EditorInfo editorInfo) {
        int iIntValue;
        if (this.f5694d.f5700a == a.EnumC0068a.NO_TARGET) {
            this.f5698h = null;
            return null;
        }
        if (this.f5694d.f5700a == a.EnumC0068a.PLATFORM_VIEW) {
            if (this.k) {
                return this.f5698h;
            }
            this.f5698h = this.f5699i.a(Integer.valueOf(this.f5694d.f5701b)).onCreateInputConnection(editorInfo);
            return this.f5698h;
        }
        editorInfo.inputType = a(this.f5695e.f6110e, this.f5695e.f6106a, this.f5695e.f6107b, this.f5695e.f6108c, this.f5695e.f6109d);
        editorInfo.imeOptions = 33554432;
        if (this.f5695e.f6111f == null) {
            iIntValue = (131072 & editorInfo.inputType) != 0 ? 1 : 6;
        } else {
            iIntValue = this.f5695e.f6111f.intValue();
        }
        if (this.f5695e.f6112g != null) {
            editorInfo.actionLabel = this.f5695e.f6112g;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        f.a.a.b.a aVar = new f.a.a.b.a(view, this.f5694d.f5701b, this.f5693c, this.f5696f, editorInfo);
        editorInfo.initialSelStart = Selection.getSelectionStart(this.f5696f);
        editorInfo.initialSelEnd = Selection.getSelectionEnd(this.f5696f);
        this.f5698h = aVar;
        return this.f5698h;
    }

    public InputConnection d() {
        return this.f5698h;
    }

    public void a(int i2) {
        if (this.f5694d.f5700a == a.EnumC0068a.PLATFORM_VIEW && this.f5694d.f5701b == i2) {
            this.f5694d = new a(a.EnumC0068a.NO_TARGET, 0);
            b(this.f5691a);
            this.f5692b.restartInput(this.f5691a);
            this.f5697g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        view.requestFocus();
        this.f5692b.showSoftInput(view, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view) {
        this.f5692b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    void a(int i2, p.a aVar) {
        this.f5694d = new a(a.EnumC0068a.FRAMEWORK_CLIENT, i2);
        this.f5695e = aVar;
        this.f5696f = Editable.Factory.getInstance().newEditable("");
        this.f5697g = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2) {
        this.f5691a.requestFocus();
        this.f5694d = new a(a.EnumC0068a.PLATFORM_VIEW, i2);
        this.f5692b.restartInput(this.f5691a);
        this.f5697g = false;
    }

    private void a(p.d dVar) {
        int i2 = dVar.f6123b;
        int i3 = dVar.f6124c;
        if (i2 >= 0 && i2 <= this.f5696f.length() && i3 >= 0 && i3 <= this.f5696f.length()) {
            Selection.setSelection(this.f5696f, i2, i3);
        } else {
            Selection.removeSelection(this.f5696f);
        }
    }

    void a(View view, p.d dVar) {
        if (!dVar.f6122a.equals(this.f5696f.toString())) {
            this.f5696f.replace(0, this.f5696f.length(), dVar.f6122a);
        }
        a(dVar);
        if (!this.j && !this.f5697g) {
            this.f5692b.updateSelection(this.f5691a, Math.max(Selection.getSelectionStart(this.f5696f), 0), Math.max(Selection.getSelectionEnd(this.f5696f), 0), BaseInputConnection.getComposingSpanStart(this.f5696f), BaseInputConnection.getComposingSpanEnd(this.f5696f));
        } else {
            this.f5692b.restartInput(view);
            this.f5697g = false;
        }
    }

    @SuppressLint({"NewApi"})
    private boolean e() {
        if (this.f5692b.getCurrentInputMethodSubtype() == null || Build.VERSION.SDK_INT < 21 || !Build.MANUFACTURER.equals("samsung")) {
            return false;
        }
        return Settings.Secure.getString(this.f5691a.getContext().getContentResolver(), "default_input_method").contains("Samsung");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f5694d.f5700a == a.EnumC0068a.PLATFORM_VIEW) {
            return;
        }
        this.f5694d = new a(a.EnumC0068a.NO_TARGET, 0);
        c();
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        EnumC0068a f5700a;

        /* renamed from: b, reason: collision with root package name */
        int f5701b;

        /* renamed from: f.a.a.b.c$a$a, reason: collision with other inner class name */
        enum EnumC0068a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            PLATFORM_VIEW
        }

        public a(EnumC0068a enumC0068a, int i2) {
            this.f5700a = enumC0068a;
            this.f5701b = i2;
        }
    }
}
