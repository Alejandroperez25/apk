package c.d.b;

import com.google.android.gms.common.internal.t;

/* loaded from: classes.dex */
public class f extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(str);
        t.a(str, (Object) "Detail message must not be empty");
    }
}
