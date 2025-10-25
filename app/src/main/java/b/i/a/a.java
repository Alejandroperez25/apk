package b.i.a;

import androidx.lifecycle.i;
import androidx.lifecycle.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {
    public abstract void a();

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public static <T extends i & w> a a(T t) {
        return new b(t, t.d());
    }
}
