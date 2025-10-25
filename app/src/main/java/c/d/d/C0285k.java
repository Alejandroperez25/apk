package c.d.d;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.d.d.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0285k {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f4413a = a();

    /* renamed from: b, reason: collision with root package name */
    static final C0285k f4414b = new C0285k(true);

    /* renamed from: c, reason: collision with root package name */
    private final Map<ExtensionRegistryLite.ObjectIntPair, GeneratedMessageLite.GeneratedExtension<?, ?>> f4415c;

    static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static C0285k b() {
        return AbstractC0284j.b();
    }

    C0285k() {
        this.f4415c = new HashMap();
    }

    C0285k(boolean z) {
        this.f4415c = Collections.emptyMap();
    }
}
