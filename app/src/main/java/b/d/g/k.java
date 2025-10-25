package b.d.g;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f1145a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f1146b;

    /* renamed from: c, reason: collision with root package name */
    private final View f1147c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1148d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f1149e;

    public k(View view) {
        this.f1147c = view;
    }

    public void a(boolean z) {
        if (this.f1148d) {
            v.j(this.f1147c);
        }
        this.f1148d = z;
    }

    public boolean a() {
        return this.f1148d;
    }

    public boolean a(int i2) {
        return c(i2) != null;
    }

    public boolean a(int i2, int i3) {
        if (a(i3)) {
            return true;
        }
        if (!a()) {
            return false;
        }
        View view = this.f1147c;
        for (ViewParent parent = this.f1147c.getParent(); parent != null; parent = parent.getParent()) {
            if (y.a(parent, view, this.f1147c, i2, i3)) {
                a(i3, parent);
                y.b(parent, view, this.f1147c, i2, i3);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void b(int i2) {
        ViewParent viewParentC = c(i2);
        if (viewParentC != null) {
            y.a(viewParentC, this.f1147c, i2);
            a(i2, (ViewParent) null);
        }
    }

    public boolean a(int i2, int i3, int i4, int i5, int[] iArr) {
        return b(i2, i3, i4, i5, iArr, 0, null);
    }

    public void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        b(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    private boolean b(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent viewParentC;
        int i7;
        int i8;
        int[] iArr3;
        if (!a() || (viewParentC = c(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1147c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            int[] iArrB = b();
            iArrB[0] = 0;
            iArrB[1] = 0;
            iArr3 = iArrB;
        } else {
            iArr3 = iArr2;
        }
        y.a(viewParentC, this.f1147c, i2, i3, i4, i5, i6, iArr3);
        if (iArr != null) {
            this.f1147c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent viewParentC;
        int i5;
        int i6;
        if (!a() || (viewParentC = c(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f1147c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = b();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        y.a(viewParentC, this.f1147c, i2, i3, iArr, i4);
        if (iArr2 != null) {
            this.f1147c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent viewParentC;
        if (!a() || (viewParentC = c(0)) == null) {
            return false;
        }
        return y.a(viewParentC, this.f1147c, f2, f3, z);
    }

    public boolean a(float f2, float f3) {
        ViewParent viewParentC;
        if (!a() || (viewParentC = c(0)) == null) {
            return false;
        }
        return y.a(viewParentC, this.f1147c, f2, f3);
    }

    private ViewParent c(int i2) {
        switch (i2) {
            case 0:
                return this.f1145a;
            case 1:
                return this.f1146b;
            default:
                return null;
        }
    }

    private void a(int i2, ViewParent viewParent) {
        switch (i2) {
            case 0:
                this.f1145a = viewParent;
                break;
            case 1:
                this.f1146b = viewParent;
                break;
        }
    }

    private int[] b() {
        if (this.f1149e == null) {
            this.f1149e = new int[2];
        }
        return this.f1149e;
    }
}
