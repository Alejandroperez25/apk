package androidx.webkit.a;

import android.annotation.SuppressLint;
import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* loaded from: classes.dex */
public class b extends androidx.webkit.a {

    /* renamed from: a, reason: collision with root package name */
    private SafeBrowsingResponse f884a;

    /* renamed from: b, reason: collision with root package name */
    private SafeBrowsingResponseBoundaryInterface f885b;

    public b(InvocationHandler invocationHandler) {
        this.f885b = (SafeBrowsingResponseBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    public b(SafeBrowsingResponse safeBrowsingResponse) {
        this.f884a = safeBrowsingResponse;
    }

    private SafeBrowsingResponse a() {
        if (this.f884a == null) {
            this.f884a = e.b().b(Proxy.getInvocationHandler(this.f885b));
        }
        return this.f884a;
    }

    private SafeBrowsingResponseBoundaryInterface b() {
        if (this.f885b == null) {
            this.f885b = (SafeBrowsingResponseBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(SafeBrowsingResponseBoundaryInterface.class, e.b().a(this.f884a));
        }
        return this.f885b;
    }

    @Override // androidx.webkit.a
    @SuppressLint({"NewApi"})
    public void a(boolean z) {
        d dVarA = d.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        if (dVarA.b()) {
            a().showInterstitial(z);
        } else {
            if (dVarA.c()) {
                b().showInterstitial(z);
                return;
            }
            throw d.a();
        }
    }
}
