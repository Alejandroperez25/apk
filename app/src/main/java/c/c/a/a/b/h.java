package c.c.a.a.b;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private int f1361a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    private int f1362b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f1363c = 128;

    /* renamed from: d, reason: collision with root package name */
    private int f1364d = 128;

    /* renamed from: e, reason: collision with root package name */
    private Map<Integer, a> f1365e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map<Integer, String> f1366f = new ConcurrentHashMap();

    public a a(int i2) {
        a aVar = this.f1365e.get(Integer.valueOf(i2));
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f1365e.put(Integer.valueOf(i2), aVar2);
        return aVar2;
    }

    public String b(int i2) {
        return this.f1366f.remove(Integer.valueOf(i2));
    }

    public String a(int i2, String str) {
        return this.f1366f.put(Integer.valueOf(i2), str);
    }

    public int a() {
        return this.f1363c;
    }

    public void c(int i2) {
        this.f1363c = i2;
    }

    public int b() {
        return this.f1364d;
    }

    public int c() {
        return this.f1361a;
    }

    public void d(int i2) {
        this.f1361a = i2;
    }
}
