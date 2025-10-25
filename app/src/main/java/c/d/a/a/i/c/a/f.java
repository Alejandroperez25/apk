package c.d.a.a.i.c.a;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f2611a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2612b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a> f2613c;

    /* renamed from: d, reason: collision with root package name */
    public final List<e> f2614d;

    public f(String str, long j, List<a> list, List<e> list2) {
        this.f2611a = str;
        this.f2612b = j;
        this.f2613c = Collections.unmodifiableList(list);
        this.f2614d = Collections.unmodifiableList(list2);
    }

    public int a(int i2) {
        int size = this.f2613c.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f2613c.get(i3).f2578b == i2) {
                return i3;
            }
        }
        return -1;
    }
}
