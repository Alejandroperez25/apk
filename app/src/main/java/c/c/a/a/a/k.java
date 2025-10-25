package c.c.a.a.a;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum k {
    NUMBER(0),
    BOOLEAN(1),
    STRING(2),
    OBJECT(3),
    NULL(5),
    UNDEFINED(6),
    ECMA_MAP(8),
    STRICT_ARRAY(10);


    /* renamed from: i, reason: collision with root package name */
    private static final Map<Byte, k> f1339i = new HashMap();
    private byte k;

    static {
        for (k kVar : values()) {
            f1339i.put(Byte.valueOf(kVar.a()), kVar);
        }
    }

    k(int i2) {
        this.k = (byte) i2;
    }

    public byte a() {
        return this.k;
    }

    public static k a(byte b2) {
        return f1339i.get(Byte.valueOf(b2));
    }
}
