package c.d.b;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0328i;

/* loaded from: classes.dex */
public class g implements InterfaceC0328i {
    @Override // com.google.android.gms.common.api.internal.InterfaceC0328i
    public Exception a(Status status) {
        return status.q() == 8 ? new f(status.r()) : new b(status.r());
    }
}
