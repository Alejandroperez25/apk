package c.d.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new p();
    public final int A;
    private int B;

    /* renamed from: a, reason: collision with root package name */
    public final String f3676a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3677b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3678c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3679d;

    /* renamed from: e, reason: collision with root package name */
    public final c.d.a.a.g.b f3680e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3681f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3682g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3683h;

    /* renamed from: i, reason: collision with root package name */
    public final List<byte[]> f3684i;
    public final c.d.a.a.d.f j;
    public final long k;
    public final int l;
    public final int m;
    public final float n;
    public final int o;
    public final float p;
    public final int q;
    public final byte[] r;
    public final c.d.a.a.n.j s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final String z;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static q a(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, float f2, List<byte[]> list, int i5) {
        return new q(str, str2, str3, str4, str5, i2, -1, i3, i4, f2, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, null, -1, Long.MAX_VALUE, list, null, null);
    }

    public static q a(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, c.d.a.a.d.f fVar) {
        return a(str, str2, str3, i2, i3, i4, i5, f2, list, i6, f3, (byte[]) null, -1, (c.d.a.a.n.j) null, fVar);
    }

    public static q a(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, c.d.a.a.n.j jVar, c.d.a.a.d.f fVar) {
        return new q(str, null, null, str2, str3, i2, i3, i4, i5, f2, i6, f3, bArr, i7, jVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, fVar, null);
    }

    public static q a(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, List<byte[]> list, int i5, String str6) {
        return new q(str, str2, str3, str4, str5, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, -1, -1, -1, i5, str6, -1, Long.MAX_VALUE, list, null, null);
    }

    public static q a(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, c.d.a.a.d.f fVar, int i6, String str4) {
        return a(str, str2, str3, i2, i3, i4, i5, -1, list, fVar, i6, str4);
    }

    public static q a(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, List<byte[]> list, c.d.a.a.d.f fVar, int i7, String str4) {
        return a(str, str2, str3, i2, i3, i4, i5, i6, -1, -1, list, fVar, i7, str4, (c.d.a.a.g.b) null);
    }

    public static q a(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List<byte[]> list, c.d.a.a.d.f fVar, int i9, String str4, c.d.a.a.g.b bVar) {
        return new q(str, null, null, str2, str3, i2, i3, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i5, i6, i7, i8, i9, str4, -1, Long.MAX_VALUE, list, fVar, bVar);
    }

    public static q a(String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6) {
        return a(str, str2, str3, str4, str5, i2, i3, str6, -1);
    }

    public static q a(String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, int i4) {
        return new q(str, str2, str3, str4, str5, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str6, i4, Long.MAX_VALUE, null, null, null);
    }

    public static q a(String str, String str2, int i2, String str3) {
        return a(str, str2, i2, str3, (c.d.a.a.d.f) null);
    }

    public static q a(String str, String str2, int i2, String str3, c.d.a.a.d.f fVar) {
        return a(str, str2, null, -1, i2, str3, -1, fVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public static q a(String str, String str2, String str3, int i2, int i3, String str4, c.d.a.a.d.f fVar, long j) {
        return a(str, str2, str3, i2, i3, str4, -1, fVar, j, Collections.emptyList());
    }

    public static q a(String str, String str2, String str3, int i2, int i3, String str4, int i4, c.d.a.a.d.f fVar, long j, List<byte[]> list) {
        return new q(str, null, null, str2, str3, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, i4, j, list, fVar, null);
    }

    public static q a(String str, String str2, String str3, int i2, int i3, List<byte[]> list, String str4, c.d.a.a.d.f fVar) {
        return new q(str, null, null, str2, str3, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, -1, Long.MAX_VALUE, list, fVar, null);
    }

    public static q b(String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6) {
        return new q(str, str2, str3, str4, str5, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str6, -1, Long.MAX_VALUE, null, null, null);
    }

    public static q a(String str, String str2, long j) {
        return new q(str, null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    public static q a(String str, String str2, String str3, int i2, c.d.a.a.d.f fVar) {
        return new q(str, null, null, str2, str3, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, fVar, null);
    }

    q(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, int i5, float f2, int i6, float f3, byte[] bArr, int i7, c.d.a.a.n.j jVar, int i8, int i9, int i10, int i11, int i12, int i13, String str6, int i14, long j, List<byte[]> list, c.d.a.a.d.f fVar, c.d.a.a.g.b bVar) {
        this.f3676a = str;
        this.f3677b = str2;
        this.f3681f = str3;
        this.f3682g = str4;
        this.f3679d = str5;
        this.f3678c = i2;
        this.f3683h = i3;
        this.l = i4;
        this.m = i5;
        this.n = f2;
        int i15 = i6;
        this.o = i15 == -1 ? 0 : i15;
        this.p = f3 == -1.0f ? 1.0f : f3;
        this.r = bArr;
        this.q = i7;
        this.s = jVar;
        this.t = i8;
        this.u = i9;
        this.v = i10;
        int i16 = i11;
        this.w = i16 == -1 ? 0 : i16;
        int i17 = i12;
        this.x = i17 == -1 ? 0 : i17;
        this.y = i13;
        this.z = str6;
        this.A = i14;
        this.k = j;
        this.f3684i = list == null ? Collections.emptyList() : list;
        this.j = fVar;
        this.f3680e = bVar;
    }

    q(Parcel parcel) {
        this.f3676a = parcel.readString();
        this.f3677b = parcel.readString();
        this.f3681f = parcel.readString();
        this.f3682g = parcel.readString();
        this.f3679d = parcel.readString();
        this.f3678c = parcel.readInt();
        this.f3683h = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readFloat();
        this.o = parcel.readInt();
        this.p = parcel.readFloat();
        this.r = c.d.a.a.m.H.a(parcel) ? parcel.createByteArray() : null;
        this.q = parcel.readInt();
        this.s = (c.d.a.a.n.j) parcel.readParcelable(c.d.a.a.n.j.class.getClassLoader());
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readString();
        this.A = parcel.readInt();
        this.k = parcel.readLong();
        int i2 = parcel.readInt();
        this.f3684i = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3684i.add(parcel.createByteArray());
        }
        this.j = (c.d.a.a.d.f) parcel.readParcelable(c.d.a.a.d.f.class.getClassLoader());
        this.f3680e = (c.d.a.a.g.b) parcel.readParcelable(c.d.a.a.g.b.class.getClassLoader());
    }

    public q a(int i2) {
        return new q(this.f3676a, this.f3677b, this.f3681f, this.f3682g, this.f3679d, this.f3678c, i2, this.l, this.m, this.n, this.o, this.p, this.r, this.q, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.k, this.f3684i, this.j, this.f3680e);
    }

    public q a(long j) {
        return new q(this.f3676a, this.f3677b, this.f3681f, this.f3682g, this.f3679d, this.f3678c, this.f3683h, this.l, this.m, this.n, this.o, this.p, this.r, this.q, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, j, this.f3684i, this.j, this.f3680e);
    }

    public q a(String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, String str5) {
        return new q(str, str2, this.f3681f, str3, str4, i2, this.f3683h, i3, i4, this.n, this.o, this.p, this.r, this.q, this.s, this.t, this.u, this.v, this.w, this.x, i5, str5, this.A, this.k, this.f3684i, this.j, this.f3680e);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c.d.a.a.q a(c.d.a.a.q r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            if (r0 != r1) goto L7
            return r0
        L7:
            java.lang.String r2 = r0.f3682g
            int r2 = c.d.a.a.m.r.g(r2)
            java.lang.String r4 = r1.f3676a
            java.lang.String r3 = r1.f3677b
            if (r3 == 0) goto L17
            java.lang.String r3 = r1.f3677b
        L15:
            r5 = r3
            goto L1a
        L17:
            java.lang.String r3 = r0.f3677b
            goto L15
        L1a:
            java.lang.String r3 = r0.z
            r6 = 3
            r7 = 1
            if (r2 == r6) goto L22
            if (r2 != r7) goto L28
        L22:
            java.lang.String r6 = r1.z
            if (r6 == 0) goto L28
            java.lang.String r3 = r1.z
        L28:
            r25 = r3
            int r3 = r0.f3678c
            r6 = -1
            if (r3 != r6) goto L33
            int r3 = r1.f3678c
        L31:
            r9 = r3
            goto L36
        L33:
            int r3 = r0.f3678c
            goto L31
        L36:
            java.lang.String r3 = r0.f3679d
            if (r3 != 0) goto L49
            java.lang.String r6 = r1.f3679d
            java.lang.String r6 = c.d.a.a.m.H.a(r6, r2)
            java.lang.String[] r8 = c.d.a.a.m.H.j(r6)
            int r8 = r8.length
            if (r8 != r7) goto L49
            r8 = r6
            goto L4a
        L49:
            r8 = r3
        L4a:
            float r3 = r0.n
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L59
            r6 = 2
            if (r2 != r6) goto L59
            float r2 = r1.n
            r13 = r2
            goto L5a
        L59:
            r13 = r3
        L5a:
            int r2 = r0.y
            int r3 = r1.y
            r24 = r2 | r3
            c.d.a.a.d.f r1 = r1.j
            c.d.a.a.d.f r2 = r0.j
            c.d.a.a.d.f r30 = c.d.a.a.d.f.a(r1, r2)
            c.d.a.a.q r1 = new c.d.a.a.q
            r3 = r1
            java.lang.String r6 = r0.f3681f
            java.lang.String r7 = r0.f3682g
            int r10 = r0.f3683h
            int r11 = r0.l
            int r12 = r0.m
            int r14 = r0.o
            float r15 = r0.p
            byte[] r2 = r0.r
            r16 = r2
            int r2 = r0.q
            r17 = r2
            c.d.a.a.n.j r2 = r0.s
            r18 = r2
            int r2 = r0.t
            r19 = r2
            int r2 = r0.u
            r20 = r2
            int r2 = r0.v
            r21 = r2
            int r2 = r0.w
            r22 = r2
            int r2 = r0.x
            r23 = r2
            int r2 = r0.A
            r26 = r2
            r32 = r1
            long r1 = r0.k
            r27 = r1
            java.util.List<byte[]> r1 = r0.f3684i
            r29 = r1
            c.d.a.a.g.b r1 = r0.f3680e
            r31 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31)
            return r32
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.q.a(c.d.a.a.q):c.d.a.a.q");
    }

    public q a(int i2, int i3) {
        return new q(this.f3676a, this.f3677b, this.f3681f, this.f3682g, this.f3679d, this.f3678c, this.f3683h, this.l, this.m, this.n, this.o, this.p, this.r, this.q, this.s, this.t, this.u, this.v, i2, i3, this.y, this.z, this.A, this.k, this.f3684i, this.j, this.f3680e);
    }

    public q a(float f2) {
        return new q(this.f3676a, this.f3677b, this.f3681f, this.f3682g, this.f3679d, this.f3678c, this.f3683h, this.l, this.m, f2, this.o, this.p, this.r, this.q, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.k, this.f3684i, this.j, this.f3680e);
    }

    public q a(c.d.a.a.d.f fVar) {
        return new q(this.f3676a, this.f3677b, this.f3681f, this.f3682g, this.f3679d, this.f3678c, this.f3683h, this.l, this.m, this.n, this.o, this.p, this.r, this.q, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.k, this.f3684i, fVar, this.f3680e);
    }

    public q a(c.d.a.a.g.b bVar) {
        return new q(this.f3676a, this.f3677b, this.f3681f, this.f3682g, this.f3679d, this.f3678c, this.f3683h, this.l, this.m, this.n, this.o, this.p, this.r, this.q, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.k, this.f3684i, this.j, bVar);
    }

    public int f() {
        if (this.l == -1 || this.m == -1) {
            return -1;
        }
        return this.m * this.l;
    }

    public String toString() {
        return "Format(" + this.f3676a + ", " + this.f3677b + ", " + this.f3681f + ", " + this.f3682g + ", " + this.f3679d + ", " + this.f3678c + ", " + this.z + ", [" + this.l + ", " + this.m + ", " + this.n + "], [" + this.t + ", " + this.u + "])";
    }

    public int hashCode() {
        if (this.B == 0) {
            this.B = ((((((((((((((((((((((((((((((((((((((((((((((527 + (this.f3676a == null ? 0 : this.f3676a.hashCode())) * 31) + (this.f3681f == null ? 0 : this.f3681f.hashCode())) * 31) + (this.f3682g == null ? 0 : this.f3682g.hashCode())) * 31) + (this.f3679d == null ? 0 : this.f3679d.hashCode())) * 31) + this.f3678c) * 31) + this.l) * 31) + this.m) * 31) + this.t) * 31) + this.u) * 31) + (this.z == null ? 0 : this.z.hashCode())) * 31) + this.A) * 31) + (this.j == null ? 0 : this.j.hashCode())) * 31) + (this.f3680e == null ? 0 : this.f3680e.hashCode())) * 31) + (this.f3677b != null ? this.f3677b.hashCode() : 0)) * 31) + this.f3683h) * 31) + ((int) this.k)) * 31) + Float.floatToIntBits(this.n)) * 31) + Float.floatToIntBits(this.p)) * 31) + this.o) * 31) + this.q) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y;
        }
        return this.B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return (this.B == 0 || qVar.B == 0 || this.B == qVar.B) && this.f3678c == qVar.f3678c && this.f3683h == qVar.f3683h && this.l == qVar.l && this.m == qVar.m && Float.compare(this.n, qVar.n) == 0 && this.o == qVar.o && Float.compare(this.p, qVar.p) == 0 && this.q == qVar.q && this.t == qVar.t && this.u == qVar.u && this.v == qVar.v && this.w == qVar.w && this.x == qVar.x && this.k == qVar.k && this.y == qVar.y && c.d.a.a.m.H.a((Object) this.f3676a, (Object) qVar.f3676a) && c.d.a.a.m.H.a((Object) this.f3677b, (Object) qVar.f3677b) && c.d.a.a.m.H.a((Object) this.z, (Object) qVar.z) && this.A == qVar.A && c.d.a.a.m.H.a((Object) this.f3681f, (Object) qVar.f3681f) && c.d.a.a.m.H.a((Object) this.f3682g, (Object) qVar.f3682g) && c.d.a.a.m.H.a((Object) this.f3679d, (Object) qVar.f3679d) && c.d.a.a.m.H.a(this.j, qVar.j) && c.d.a.a.m.H.a(this.f3680e, qVar.f3680e) && c.d.a.a.m.H.a(this.s, qVar.s) && Arrays.equals(this.r, qVar.r) && b(qVar);
    }

    public boolean b(q qVar) {
        if (this.f3684i.size() != qVar.f3684i.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f3684i.size(); i2++) {
            if (!Arrays.equals(this.f3684i.get(i2), qVar.f3684i.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f3676a);
        parcel.writeString(this.f3677b);
        parcel.writeString(this.f3681f);
        parcel.writeString(this.f3682g);
        parcel.writeString(this.f3679d);
        parcel.writeInt(this.f3678c);
        parcel.writeInt(this.f3683h);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeFloat(this.n);
        parcel.writeInt(this.o);
        parcel.writeFloat(this.p);
        c.d.a.a.m.H.a(parcel, this.r != null);
        if (this.r != null) {
            parcel.writeByteArray(this.r);
        }
        parcel.writeInt(this.q);
        parcel.writeParcelable(this.s, i2);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeString(this.z);
        parcel.writeInt(this.A);
        parcel.writeLong(this.k);
        int size = this.f3684i.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.f3684i.get(i3));
        }
        parcel.writeParcelable(this.j, 0);
        parcel.writeParcelable(this.f3680e, 0);
    }
}
