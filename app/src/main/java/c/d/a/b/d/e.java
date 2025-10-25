package c.d.a.b.d;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3776a = false;

    /* renamed from: b, reason: collision with root package name */
    private f f3777b = null;

    public final void a(Context context) {
        synchronized (this) {
            if (this.f3776a) {
                return;
            }
            try {
                this.f3777b = g.a(DynamiteModule.a(context, DynamiteModule.k, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.flags.impl.FlagProviderImpl"));
                this.f3777b.init(c.d.a.b.c.b.a(context));
                this.f3776a = true;
            } catch (RemoteException | DynamiteModule.a e2) {
                Log.w("FlagValueProvider", "Failed to initialize flags module.", e2);
            }
        }
    }

    public final <T> T a(a<T> aVar) {
        synchronized (this) {
            if (!this.f3776a) {
                return aVar.b();
            }
            return aVar.a(this.f3777b);
        }
    }
}
