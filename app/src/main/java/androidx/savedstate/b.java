package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final c f870a;

    /* renamed from: b, reason: collision with root package name */
    private final a f871b = new a();

    private b(c cVar) {
        this.f870a = cVar;
    }

    public a a() {
        return this.f871b;
    }

    public void a(Bundle bundle) {
        f fVarA = this.f870a.a();
        if (fVarA.a() != f.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        fVarA.a(new Recreator(this.f870a));
        this.f871b.a(fVarA, bundle);
    }

    public void b(Bundle bundle) {
        this.f871b.a(bundle);
    }

    public static b a(c cVar) {
        return new b(cVar);
    }
}
