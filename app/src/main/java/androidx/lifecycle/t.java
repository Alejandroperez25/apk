package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f850a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f851b = false;

    protected void a() {
    }

    final void b() {
        this.f851b = true;
        if (this.f850a != null) {
            synchronized (this.f850a) {
                Iterator<Object> it = this.f850a.values().iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
        }
        a();
    }

    private static void a(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
