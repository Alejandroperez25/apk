package androidx.core.app;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class i {
    public abstract String a();

    public abstract CharSequence b();

    public abstract CharSequence[] c();

    public abstract Set<String> d();

    public abstract boolean e();

    public abstract Bundle f();

    static RemoteInput[] a(i[] iVarArr) {
        if (iVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[iVarArr.length];
        for (int i2 = 0; i2 < iVarArr.length; i2++) {
            remoteInputArr[i2] = a(iVarArr[i2]);
        }
        return remoteInputArr;
    }

    static RemoteInput a(i iVar) {
        return new RemoteInput.Builder(iVar.a()).setLabel(iVar.b()).setChoices(iVar.c()).setAllowFreeFormInput(iVar.e()).addExtras(iVar.f()).build();
    }
}
