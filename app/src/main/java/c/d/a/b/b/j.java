package c.d.a.b.b;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0114o;
import androidx.fragment.app.AbstractDialogInterfaceOnCancelListenerC0104e;
import com.google.android.gms.common.internal.t;

/* loaded from: classes.dex */
public class j extends AbstractDialogInterfaceOnCancelListenerC0104e {
    private Dialog ja = null;
    private DialogInterface.OnCancelListener ka = null;

    @Override // androidx.fragment.app.AbstractDialogInterfaceOnCancelListenerC0104e
    public Dialog m(Bundle bundle) {
        if (this.ja == null) {
            h(false);
        }
        return this.ja;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        if (this.ka != null) {
            this.ka.onCancel(dialogInterface);
        }
    }

    public static j a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        j jVar = new j();
        t.a(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        jVar.ja = dialog2;
        if (onCancelListener != null) {
            jVar.ka = onCancelListener;
        }
        return jVar;
    }

    @Override // androidx.fragment.app.AbstractDialogInterfaceOnCancelListenerC0104e
    public void a(AbstractC0114o abstractC0114o, String str) {
        super.a(abstractC0114o, str);
    }
}
