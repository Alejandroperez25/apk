package androidx.webkit.a;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    WebViewProviderFactoryBoundaryInterface f900a;

    public g(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f900a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // androidx.webkit.a.f
    public WebkitToCompatConverterBoundaryInterface b() {
        return (WebkitToCompatConverterBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f900a.getWebkitToCompatConverter());
    }

    @Override // androidx.webkit.a.f
    public String[] a() {
        return this.f900a.getSupportedFeatures();
    }
}
