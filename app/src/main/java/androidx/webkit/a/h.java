package androidx.webkit.a;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f901a;

    public h(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f901a = webkitToCompatConverterBoundaryInterface;
    }

    InvocationHandler a(WebResourceError webResourceError) {
        return this.f901a.convertWebResourceError(webResourceError);
    }

    WebResourceError a(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f901a.convertWebResourceError(invocationHandler);
    }

    InvocationHandler a(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f901a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    SafeBrowsingResponse b(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.f901a.convertSafeBrowsingResponse(invocationHandler);
    }
}
