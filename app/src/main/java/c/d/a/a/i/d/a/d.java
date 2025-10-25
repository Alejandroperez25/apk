package c.d.a.a.i.d.a;

import c.d.a.a.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final d f2767d = new d("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap());

    /* renamed from: e, reason: collision with root package name */
    public final List<a> f2768e;

    /* renamed from: f, reason: collision with root package name */
    public final List<a> f2769f;

    /* renamed from: g, reason: collision with root package name */
    public final List<a> f2770g;

    /* renamed from: h, reason: collision with root package name */
    public final q f2771h;

    /* renamed from: i, reason: collision with root package name */
    public final List<q> f2772i;
    public final Map<String, String> j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f2773a;

        /* renamed from: b, reason: collision with root package name */
        public final q f2774b;

        public static a a(String str) {
            return new a(str, q.b("0", null, "application/x-mpegURL", null, null, -1, 0, null));
        }

        public a(String str, q qVar) {
            this.f2773a = str;
            this.f2774b = qVar;
        }
    }

    public d(String str, List<String> list, List<a> list2, List<a> list3, List<a> list4, q qVar, List<q> list5, boolean z, Map<String, String> map) {
        super(str, list, z);
        this.f2768e = Collections.unmodifiableList(list2);
        this.f2769f = Collections.unmodifiableList(list3);
        this.f2770g = Collections.unmodifiableList(list4);
        this.f2771h = qVar;
        this.f2772i = list5 != null ? Collections.unmodifiableList(list5) : null;
        this.j = Collections.unmodifiableMap(map);
    }

    @Override // c.d.a.a.h.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(List<c.d.a.a.h.c> list) {
        return new d(this.f2790a, this.f2791b, a(this.f2768e, 0, list), a(this.f2769f, 1, list), a(this.f2770g, 2, list), this.f2771h, this.f2772i, this.f2792c, this.j);
    }

    public static d a(String str) {
        List listSingletonList = Collections.singletonList(a.a(str));
        List listEmptyList = Collections.emptyList();
        return new d(null, Collections.emptyList(), listSingletonList, listEmptyList, listEmptyList, null, null, false, Collections.emptyMap());
    }

    private static List<a> a(List<a> list, int i2, List<c.d.a.a.h.c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            a aVar = list.get(i3);
            int i4 = 0;
            while (true) {
                if (i4 < list2.size()) {
                    c.d.a.a.h.c cVar = list2.get(i4);
                    if (cVar.f2491b == i2 && cVar.f2492c == i3) {
                        arrayList.add(aVar);
                        break;
                    }
                    i4++;
                }
            }
        }
        return arrayList;
    }
}
