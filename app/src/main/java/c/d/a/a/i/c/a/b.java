package c.d.a.a.i.c.a;

import android.net.Uri;
import c.d.a.a.AbstractC0132d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class b implements c.d.a.a.h.a<b> {

    /* renamed from: a, reason: collision with root package name */
    public final long f2582a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2583b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2584c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2585d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2586e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2587f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2588g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2589h;

    /* renamed from: i, reason: collision with root package name */
    public final n f2590i;
    public final Uri j;
    public final g k;
    private final List<f> l;

    @Override // c.d.a.a.h.a
    public /* bridge */ /* synthetic */ b a(List list) {
        return b((List<c.d.a.a.h.c>) list);
    }

    public b(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, g gVar, n nVar, Uri uri, List<f> list) {
        this.f2582a = j;
        this.f2583b = j2;
        this.f2584c = j3;
        this.f2585d = z;
        this.f2586e = j4;
        this.f2587f = j5;
        this.f2588g = j6;
        this.f2589h = j7;
        this.k = gVar;
        this.f2590i = nVar;
        this.j = uri;
        this.l = list == null ? Collections.emptyList() : list;
    }

    public final int a() {
        return this.l.size();
    }

    public final f a(int i2) {
        return this.l.get(i2);
    }

    public final long b(int i2) {
        if (i2 != this.l.size() - 1) {
            return this.l.get(i2 + 1).f2612b - this.l.get(i2).f2612b;
        }
        if (this.f2583b == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f2583b - this.l.get(i2).f2612b;
    }

    public final long c(int i2) {
        return AbstractC0132d.b(b(i2));
    }

    public final b b(List<c.d.a.a.h.c> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new c.d.a.a.h.c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= a()) {
                break;
            }
            if (((c.d.a.a.h.c) linkedList.peek()).f2490a != i2) {
                long jB = b(i2);
                if (jB != -9223372036854775807L) {
                    j += jB;
                }
            } else {
                f fVarA = a(i2);
                arrayList.add(new f(fVarA.f2611a, fVarA.f2612b - j, a(fVarA.f2613c, linkedList), fVarA.f2614d));
            }
            i2++;
        }
        return new b(this.f2582a, this.f2583b != -9223372036854775807L ? this.f2583b - j : -9223372036854775807L, this.f2584c, this.f2585d, this.f2586e, this.f2587f, this.f2588g, this.f2589h, this.k, this.f2590i, this.j, arrayList);
    }

    private static ArrayList<a> a(List<a> list, LinkedList<c.d.a.a.h.c> linkedList) {
        c.d.a.a.h.c cVarPoll = linkedList.poll();
        int i2 = cVarPoll.f2490a;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i3 = cVarPoll.f2491b;
            a aVar = list.get(i3);
            List<j> list2 = aVar.f2579c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(cVarPoll.f2492c));
                cVarPoll = linkedList.poll();
                if (cVarPoll.f2490a != i2) {
                    break;
                }
            } while (cVarPoll.f2491b == i3);
            arrayList.add(new a(aVar.f2577a, aVar.f2578b, arrayList2, aVar.f2580d, aVar.f2581e));
        } while (cVarPoll.f2490a == i2);
        linkedList.addFirst(cVarPoll);
        return arrayList;
    }
}
