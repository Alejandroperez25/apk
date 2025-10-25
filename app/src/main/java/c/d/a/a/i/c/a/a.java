package c.d.a.a.i.c.a;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2577a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2578b;

    /* renamed from: c, reason: collision with root package name */
    public final List<j> f2579c;

    /* renamed from: d, reason: collision with root package name */
    public final List<d> f2580d;

    /* renamed from: e, reason: collision with root package name */
    public final List<d> f2581e;

    public a(int i2, int i3, List<j> list, List<d> list2, List<d> list3) {
        List<d> listUnmodifiableList;
        List<d> listUnmodifiableList2;
        this.f2577a = i2;
        this.f2578b = i3;
        this.f2579c = Collections.unmodifiableList(list);
        if (list2 == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list2);
        }
        this.f2580d = listUnmodifiableList;
        if (list3 == null) {
            listUnmodifiableList2 = Collections.emptyList();
        } else {
            listUnmodifiableList2 = Collections.unmodifiableList(list3);
        }
        this.f2581e = listUnmodifiableList2;
    }
}
