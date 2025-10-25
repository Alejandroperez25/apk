package b.d.g;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private int f1150a;

    /* renamed from: b, reason: collision with root package name */
    private int f1151b;

    public o(ViewGroup viewGroup) {
    }

    public void a(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    public void a(View view, View view2, int i2, int i3) {
        if (i3 == 1) {
            this.f1151b = i2;
        } else {
            this.f1150a = i2;
        }
    }

    public int a() {
        return this.f1150a | this.f1151b;
    }

    public void a(View view, int i2) {
        if (i2 == 1) {
            this.f1151b = 0;
        } else {
            this.f1150a = 0;
        }
    }
}
