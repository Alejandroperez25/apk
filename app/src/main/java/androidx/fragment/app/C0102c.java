package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.D;
import androidx.lifecycle.f;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0102c implements Parcelable {
    public static final Parcelable.Creator<C0102c> CREATOR = new C0101b();

    /* renamed from: a, reason: collision with root package name */
    final int[] f712a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<String> f713b;

    /* renamed from: c, reason: collision with root package name */
    final int[] f714c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f715d;

    /* renamed from: e, reason: collision with root package name */
    final int f716e;

    /* renamed from: f, reason: collision with root package name */
    final int f717f;

    /* renamed from: g, reason: collision with root package name */
    final String f718g;

    /* renamed from: h, reason: collision with root package name */
    final int f719h;

    /* renamed from: i, reason: collision with root package name */
    final int f720i;
    final CharSequence j;
    final int k;
    final CharSequence l;
    final ArrayList<String> m;
    final ArrayList<String> n;
    final boolean o;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0102c(C0100a c0100a) {
        int size = c0100a.f633a.size();
        this.f712a = new int[size * 5];
        if (!c0100a.f640h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f713b = new ArrayList<>(size);
        this.f714c = new int[size];
        this.f715d = new int[size];
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            D.a aVar = c0100a.f633a.get(i2);
            int i4 = i3 + 1;
            this.f712a[i3] = aVar.f642a;
            this.f713b.add(aVar.f643b != null ? aVar.f643b.f730f : null);
            int i5 = i4 + 1;
            this.f712a[i4] = aVar.f644c;
            int i6 = i5 + 1;
            this.f712a[i5] = aVar.f645d;
            int i7 = i6 + 1;
            this.f712a[i6] = aVar.f646e;
            this.f712a[i7] = aVar.f647f;
            this.f714c[i2] = aVar.f648g.ordinal();
            this.f715d[i2] = aVar.f649h.ordinal();
            i2++;
            i3 = i7 + 1;
        }
        this.f716e = c0100a.f638f;
        this.f717f = c0100a.f639g;
        this.f718g = c0100a.j;
        this.f719h = c0100a.u;
        this.f720i = c0100a.k;
        this.j = c0100a.l;
        this.k = c0100a.m;
        this.l = c0100a.n;
        this.m = c0100a.o;
        this.n = c0100a.p;
        this.o = c0100a.q;
    }

    public C0102c(Parcel parcel) {
        this.f712a = parcel.createIntArray();
        this.f713b = parcel.createStringArrayList();
        this.f714c = parcel.createIntArray();
        this.f715d = parcel.createIntArray();
        this.f716e = parcel.readInt();
        this.f717f = parcel.readInt();
        this.f718g = parcel.readString();
        this.f719h = parcel.readInt();
        this.f720i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }

    public C0100a a(w wVar) {
        C0100a c0100a = new C0100a(wVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f712a.length) {
            D.a aVar = new D.a();
            int i4 = i2 + 1;
            aVar.f642a = this.f712a[i2];
            if (w.f770c) {
                Log.v("FragmentManager", "Instantiate " + c0100a + " op #" + i3 + " base fragment #" + this.f712a[i4]);
            }
            String str = this.f713b.get(i3);
            if (str != null) {
                aVar.f643b = wVar.j.get(str);
            } else {
                aVar.f643b = null;
            }
            aVar.f648g = f.b.values()[this.f714c[i3]];
            aVar.f649h = f.b.values()[this.f715d[i3]];
            int i5 = i4 + 1;
            aVar.f644c = this.f712a[i4];
            int i6 = i5 + 1;
            aVar.f645d = this.f712a[i5];
            int i7 = i6 + 1;
            aVar.f646e = this.f712a[i6];
            aVar.f647f = this.f712a[i7];
            c0100a.f634b = aVar.f644c;
            c0100a.f635c = aVar.f645d;
            c0100a.f636d = aVar.f646e;
            c0100a.f637e = aVar.f647f;
            c0100a.a(aVar);
            i3++;
            i2 = i7 + 1;
        }
        c0100a.f638f = this.f716e;
        c0100a.f639g = this.f717f;
        c0100a.j = this.f718g;
        c0100a.u = this.f719h;
        c0100a.f640h = true;
        c0100a.k = this.f720i;
        c0100a.l = this.j;
        c0100a.m = this.k;
        c0100a.n = this.l;
        c0100a.o = this.m;
        c0100a.p = this.n;
        c0100a.q = this.o;
        c0100a.a(1);
        return c0100a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f712a);
        parcel.writeStringList(this.f713b);
        parcel.writeIntArray(this.f714c);
        parcel.writeIntArray(this.f715d);
        parcel.writeInt(this.f716e);
        parcel.writeInt(this.f717f);
        parcel.writeString(this.f718g);
        parcel.writeInt(this.f719h);
        parcel.writeInt(this.f720i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
