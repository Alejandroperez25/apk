package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private Bundle f867b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f868c;

    /* renamed from: a, reason: collision with root package name */
    private b.b.a.b.b<String, b> f866a = new b.b.a.b.b<>();

    /* renamed from: d, reason: collision with root package name */
    boolean f869d = true;

    /* renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    public interface InterfaceC0010a {
        void a(c cVar);
    }

    public interface b {
        Bundle a();
    }

    a() {
    }

    public Bundle a(String str) {
        if (!this.f868c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        if (this.f867b == null) {
            return null;
        }
        Bundle bundle = this.f867b.getBundle(str);
        this.f867b.remove(str);
        if (this.f867b.isEmpty()) {
            this.f867b = null;
        }
        return bundle;
    }

    void a(f fVar, Bundle bundle) {
        if (this.f868c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f867b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        fVar.a(new e() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // androidx.lifecycle.g
            public void a(i iVar, f.a aVar) {
                if (aVar == f.a.ON_START) {
                    this.f865a.f869d = true;
                } else if (aVar == f.a.ON_STOP) {
                    this.f865a.f869d = false;
                }
            }
        });
        this.f868c = true;
    }

    void a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (this.f867b != null) {
            bundle2.putAll(this.f867b);
        }
        b.b.a.b.b<String, b>.d dVarC = this.f866a.c();
        while (dVarC.hasNext()) {
            Map.Entry next = dVarC.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
