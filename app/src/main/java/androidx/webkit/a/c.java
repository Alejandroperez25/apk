package androidx.webkit.a;

import android.annotation.SuppressLint;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* loaded from: classes.dex */
public class c extends androidx.webkit.b {

    /* renamed from: a, reason: collision with root package name */
    private WebResourceError f886a;

    /* renamed from: b, reason: collision with root package name */
    private WebResourceErrorBoundaryInterface f887b;

    public c(InvocationHandler invocationHandler) {
        this.f887b = (WebResourceErrorBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    public c(WebResourceError webResourceError) {
        this.f886a = webResourceError;
    }

    private WebResourceError c() {
        if (this.f886a == null) {
            this.f886a = e.b().a(Proxy.getInvocationHandler(this.f887b));
        }
        return this.f886a;
    }

    private WebResourceErrorBoundaryInterface d() {
        if (this.f887b == null) {
            this.f887b = (WebResourceErrorBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(WebResourceErrorBoundaryInterface.class, e.b().a(this.f886a));
        }
        return this.f887b;
    }

    @Override // androidx.webkit.b
    @SuppressLint({"NewApi"})
    public int a() {
        d dVarA = d.a("WEB_RESOURCE_ERROR_GET_CODE");
        if (dVarA.b()) {
            return c().getErrorCode();
        }
        if (dVarA.c()) {
            return d().getErrorCode();
        }
        throw d.a();
    }

    @Override // androidx.webkit.b
    @SuppressLint({"NewApi"})
    public CharSequence b() {
        d dVarA = d.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        if (dVarA.b()) {
            return c().getDescription();
        }
        if (dVarA.c()) {
            return d().getDescription();
        }
        throw d.a();
    }
}
