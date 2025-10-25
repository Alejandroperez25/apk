package androidx.webkit.a;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class e {

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final h f898a = new h(e.a().b());
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final f f899a = e.c();
    }

    public static f a() {
        return b.f899a;
    }

    public static h b() {
        return a.f898a;
    }

    private static InvocationHandler e() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, d()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    static f c() {
        if (Build.VERSION.SDK_INT < 21) {
            return new androidx.webkit.a.a();
        }
        try {
            return new g((WebViewProviderFactoryBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(WebViewProviderFactoryBoundaryInterface.class, e()));
        } catch (ClassNotFoundException unused) {
            return new androidx.webkit.a.a();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static ClassLoader d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.getWebViewClassLoader();
        }
        return f().getClass().getClassLoader();
    }

    private static Object f() throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
