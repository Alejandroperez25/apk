package g.a;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class h extends g {
    public static <K, V> Map<K, V> a() {
        c cVar = c.f5851a;
        if (cVar != null) {
            return cVar;
        }
        throw new g.d("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    public static <K, V> Map<K, V> a(g.b<? extends K, ? extends V>... bVarArr) {
        g.b.a.c.b(bVarArr, "pairs");
        if (bVarArr.length <= 0) {
            return a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(bVarArr.length));
        e.a(bVarArr, linkedHashMap);
        return linkedHashMap;
    }

    public static int a(int i2) {
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return i2 + (i2 / 3);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> void a(Map<? super K, ? super V> map, g.b<? extends K, ? extends V>[] bVarArr) {
        g.b.a.c.b(map, "$this$putAll");
        g.b.a.c.b(bVarArr, "pairs");
        for (g.b<? extends K, ? extends V> bVar : bVarArr) {
            map.put(bVar.a(), bVar.b());
        }
    }

    public static <K, V, M extends Map<? super K, ? super V>> M a(g.b<? extends K, ? extends V>[] bVarArr, M m) {
        g.b.a.c.b(bVarArr, "$this$toMap");
        g.b.a.c.b(m, "destination");
        a(m, bVarArr);
        return m;
    }
}
