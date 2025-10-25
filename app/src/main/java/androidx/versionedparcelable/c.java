package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class c extends b {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f876d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f877e;

    /* renamed from: f, reason: collision with root package name */
    private final int f878f;

    /* renamed from: g, reason: collision with root package name */
    private final int f879g;

    /* renamed from: h, reason: collision with root package name */
    private final String f880h;

    /* renamed from: i, reason: collision with root package name */
    private int f881i;
    private int j;
    private int k;

    c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new b.c.b(), new b.c.b(), new b.c.b());
    }

    private c(Parcel parcel, int i2, int i3, String str, b.c.b<String, Method> bVar, b.c.b<String, Method> bVar2, b.c.b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f876d = new SparseIntArray();
        this.f881i = -1;
        this.j = 0;
        this.k = -1;
        this.f877e = parcel;
        this.f878f = i2;
        this.f879g = i3;
        this.j = this.f878f;
        this.f880h = str;
    }

    @Override // androidx.versionedparcelable.b
    public boolean b(int i2) {
        while (this.j < this.f879g) {
            if (this.k == i2) {
                return true;
            }
            if (String.valueOf(this.k).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f877e.setDataPosition(this.j);
            int i3 = this.f877e.readInt();
            this.k = this.f877e.readInt();
            this.j += i3;
        }
        return this.k == i2;
    }

    @Override // androidx.versionedparcelable.b
    public void c(int i2) {
        b();
        this.f881i = i2;
        this.f876d.put(i2, this.f877e.dataPosition());
        a(0);
        a(i2);
    }

    @Override // androidx.versionedparcelable.b
    public void b() {
        if (this.f881i >= 0) {
            int i2 = this.f876d.get(this.f881i);
            int iDataPosition = this.f877e.dataPosition();
            this.f877e.setDataPosition(i2);
            this.f877e.writeInt(iDataPosition - i2);
            this.f877e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.b
    protected b c() {
        return new c(this.f877e, this.f877e.dataPosition(), this.j == this.f878f ? this.f879g : this.j, this.f880h + "  ", this.f873a, this.f874b, this.f875c);
    }

    @Override // androidx.versionedparcelable.b
    public void a(byte[] bArr) {
        if (bArr != null) {
            this.f877e.writeInt(bArr.length);
            this.f877e.writeByteArray(bArr);
        } else {
            this.f877e.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.b
    public void a(int i2) {
        this.f877e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.b
    public void a(String str) {
        this.f877e.writeString(str);
    }

    @Override // androidx.versionedparcelable.b
    public void a(Parcelable parcelable) {
        this.f877e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.b
    public void a(boolean z) {
        this.f877e.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.b
    protected void a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f877e, 0);
    }

    @Override // androidx.versionedparcelable.b
    protected CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f877e);
    }

    @Override // androidx.versionedparcelable.b
    public int d() {
        return this.f877e.readInt();
    }

    @Override // androidx.versionedparcelable.b
    public String e() {
        return this.f877e.readString();
    }

    @Override // androidx.versionedparcelable.b
    public byte[] f() {
        int i2 = this.f877e.readInt();
        if (i2 < 0) {
            return null;
        }
        byte[] bArr = new byte[i2];
        this.f877e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.b
    public <T extends Parcelable> T h() {
        return (T) this.f877e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.b
    public boolean i() {
        return this.f877e.readInt() != 0;
    }
}
