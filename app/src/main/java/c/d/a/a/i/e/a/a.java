package c.d.a.a.i.e.a;

import android.net.Uri;
import c.d.a.a.e.e.p;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.G;
import c.d.a.a.m.H;
import c.d.a.a.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class a implements c.d.a.a.h.a<a> {

    /* renamed from: a, reason: collision with root package name */
    public final int f2880a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2881b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2882c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2883d;

    /* renamed from: e, reason: collision with root package name */
    public final C0032a f2884e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f2885f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2886g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2887h;

    /* renamed from: c.d.a.a.i.e.a.a$a, reason: collision with other inner class name */
    public static class C0032a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f2888a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f2889b;

        /* renamed from: c, reason: collision with root package name */
        public final p[] f2890c;

        public C0032a(UUID uuid, byte[] bArr, p[] pVarArr) {
            this.f2888a = uuid;
            this.f2889b = bArr;
            this.f2890c = pVarArr;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2891a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2892b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2893c;

        /* renamed from: d, reason: collision with root package name */
        public final String f2894d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2895e;

        /* renamed from: f, reason: collision with root package name */
        public final int f2896f;

        /* renamed from: g, reason: collision with root package name */
        public final int f2897g;

        /* renamed from: h, reason: collision with root package name */
        public final int f2898h;

        /* renamed from: i, reason: collision with root package name */
        public final String f2899i;
        public final q[] j;
        public final int k;
        private final String l;
        private final String m;
        private final List<Long> n;
        private final long[] o;
        private final long p;

        public b(String str, String str2, int i2, String str3, long j, String str4, int i3, int i4, int i5, int i6, String str5, q[] qVarArr, List<Long> list, long j2) {
            this(str, str2, i2, str3, j, str4, i3, i4, i5, i6, str5, qVarArr, list, H.a(list, 1000000L, j), H.d(j2, 1000000L, j));
        }

        private b(String str, String str2, int i2, String str3, long j, String str4, int i3, int i4, int i5, int i6, String str5, q[] qVarArr, List<Long> list, long[] jArr, long j2) {
            this.l = str;
            this.m = str2;
            this.f2891a = i2;
            this.f2892b = str3;
            this.f2893c = j;
            this.f2894d = str4;
            this.f2895e = i3;
            this.f2896f = i4;
            this.f2897g = i5;
            this.f2898h = i6;
            this.f2899i = str5;
            this.j = qVarArr;
            this.n = list;
            this.o = jArr;
            this.p = j2;
            this.k = list.size();
        }

        public b a(q[] qVarArr) {
            return new b(this.l, this.m, this.f2891a, this.f2892b, this.f2893c, this.f2894d, this.f2895e, this.f2896f, this.f2897g, this.f2898h, this.f2899i, qVarArr, this.n, this.o, this.p);
        }

        public int a(long j) {
            return H.a(this.o, j, true, true);
        }

        public long a(int i2) {
            return this.o[i2];
        }

        public long b(int i2) {
            return i2 == this.k + (-1) ? this.p : this.o[i2 + 1] - this.o[i2];
        }

        public Uri a(int i2, int i3) {
            AbstractC0170e.b(this.j != null);
            AbstractC0170e.b(this.n != null);
            AbstractC0170e.b(i3 < this.n.size());
            String string = Integer.toString(this.j[i2].f3678c);
            String string2 = this.n.get(i3).toString();
            return G.a(this.l, this.m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }
    }

    public a(int i2, int i3, long j, long j2, long j3, int i4, boolean z, C0032a c0032a, b[] bVarArr) {
        this(i2, i3, j2 == 0 ? -9223372036854775807L : H.d(j2, 1000000L, j), j3 != 0 ? H.d(j3, 1000000L, j) : -9223372036854775807L, i4, z, c0032a, bVarArr);
    }

    private a(int i2, int i3, long j, long j2, int i4, boolean z, C0032a c0032a, b[] bVarArr) {
        this.f2880a = i2;
        this.f2881b = i3;
        this.f2886g = j;
        this.f2887h = j2;
        this.f2882c = i4;
        this.f2883d = z;
        this.f2884e = c0032a;
        this.f2885f = bVarArr;
    }

    @Override // c.d.a.a.h.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a a(List<c.d.a.a.h.c> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            c.d.a.a.h.c cVar = (c.d.a.a.h.c) arrayList.get(i2);
            b bVar2 = this.f2885f[cVar.f2491b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((q[]) arrayList3.toArray(new q[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.j[cVar.f2492c]);
            i2++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((q[]) arrayList3.toArray(new q[0])));
        }
        return new a(this.f2880a, this.f2881b, this.f2886g, this.f2887h, this.f2882c, this.f2883d, this.f2884e, (b[]) arrayList2.toArray(new b[0]));
    }
}
