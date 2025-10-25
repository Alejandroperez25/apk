package c.d.a.b.b;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.t;

/* loaded from: classes.dex */
public class b extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f3736a = null;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f3737b = null;

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f3736a == null) {
            setShowsDialog(false);
        }
        return this.f3736a;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        if (this.f3737b != null) {
            this.f3737b.onCancel(dialogInterface);
        }
    }

    public static b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        b bVar = new b();
        t.a(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f3736a = dialog2;
        if (onCancelListener != null) {
            bVar.f3737b = onCancelListener;
        }
        return bVar;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
