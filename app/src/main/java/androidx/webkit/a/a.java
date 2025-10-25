package androidx.webkit.a;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class a implements f {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f883a = new String[0];

    @Override // androidx.webkit.a.f
    public WebkitToCompatConverterBoundaryInterface b() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // androidx.webkit.a.f
    public String[] a() {
        return f883a;
    }
}
