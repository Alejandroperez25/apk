package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC0104e extends ComponentCallbacksC0108i implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler Y;
    private Runnable Z = new RunnableC0103d(this);
    int aa = 0;
    int ba = 0;
    boolean ca = true;
    boolean da = true;
    int ea = -1;
    Dialog fa;
    boolean ga;
    boolean ha;
    boolean ia;

    public abstract Dialog m(Bundle bundle);

    public void a(AbstractC0114o abstractC0114o, String str) {
        this.ha = false;
        this.ia = true;
        D dA = abstractC0114o.a();
        dA.a(this, str);
        dA.a();
    }

    void a(boolean z, boolean z2) {
        if (this.ha) {
            return;
        }
        this.ha = true;
        this.ia = false;
        if (this.fa != null) {
            this.fa.setOnDismissListener(null);
            this.fa.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.Y.getLooper()) {
                    onDismiss(this.fa);
                } else {
                    this.Y.post(this.Z);
                }
            }
        }
        this.ga = true;
        if (this.ea >= 0) {
            o().a(this.ea, 1);
            this.ea = -1;
            return;
        }
        D dA = o().a();
        dA.a(this);
        if (z) {
            dA.b();
        } else {
            dA.a();
        }
    }

    public void h(boolean z) {
        this.da = z;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public void a(Context context) {
        super.a(context);
        if (this.ia) {
            return;
        }
        this.ha = false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public void x() {
        super.x();
        if (this.ia || this.ha) {
            return;
        }
        this.ha = true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.Y = new Handler();
        this.da = this.x == 0;
        if (bundle != null) {
            this.aa = bundle.getInt("android:style", 0);
            this.ba = bundle.getInt("android:theme", 0);
            this.ca = bundle.getBoolean("android:cancelable", true);
            this.da = bundle.getBoolean("android:showsDialog", this.da);
            this.ea = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public LayoutInflater c(Bundle bundle) {
        if (!this.da) {
            return super.c(bundle);
        }
        this.fa = m(bundle);
        if (this.fa != null) {
            a(this.fa, this.aa);
            return (LayoutInflater) this.fa.getContext().getSystemService("layout_inflater");
        }
        return (LayoutInflater) this.t.k().getSystemService("layout_inflater");
    }

    public void a(Dialog dialog, int i2) {
        switch (i2) {
            case 1:
            case 2:
                break;
            case 3:
                dialog.getWindow().addFlags(24);
                break;
            default:
                return;
        }
        dialog.requestWindowFeature(1);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.ga) {
            return;
        }
        a(true, true);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public void g(Bundle bundle) {
        Bundle bundle2;
        super.g(bundle);
        if (this.da) {
            View viewT = t();
            if (viewT != null) {
                if (viewT.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.fa.setContentView(viewT);
            }
            ActivityC0109j activityC0109jJ = j();
            if (activityC0109jJ != null) {
                this.fa.setOwnerActivity(activityC0109jJ);
            }
            this.fa.setCancelable(this.ca);
            this.fa.setOnCancelListener(this);
            this.fa.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.fa.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public void onStart() {
        super.onStart();
        if (this.fa != null) {
            this.ga = false;
            this.fa.show();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public void i(Bundle bundle) {
        Bundle bundleOnSaveInstanceState;
        super.i(bundle);
        if (this.fa != null && (bundleOnSaveInstanceState = this.fa.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        if (this.aa != 0) {
            bundle.putInt("android:style", this.aa);
        }
        if (this.ba != 0) {
            bundle.putInt("android:theme", this.ba);
        }
        if (!this.ca) {
            bundle.putBoolean("android:cancelable", this.ca);
        }
        if (!this.da) {
            bundle.putBoolean("android:showsDialog", this.da);
        }
        if (this.ea != -1) {
            bundle.putInt("android:backStackId", this.ea);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public void onStop() {
        super.onStop();
        if (this.fa != null) {
            this.fa.hide();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0108i
    public void v() {
        super.v();
        if (this.fa != null) {
            this.ga = true;
            this.fa.setOnDismissListener(null);
            this.fa.dismiss();
            if (!this.ha) {
                onDismiss(this.fa);
            }
            this.fa = null;
        }
    }
}
