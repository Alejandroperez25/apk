package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
class c implements a {

    /* renamed from: a, reason: collision with root package name */
    int f860a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f861b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f862c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f863d = -1;

    c() {
    }

    public int a() {
        if (this.f863d != -1) {
            return this.f863d;
        }
        return AudioAttributesCompat.a(false, this.f862c, this.f860a);
    }

    public int b() {
        return this.f861b;
    }

    public int c() {
        return this.f860a;
    }

    public int d() {
        int i2 = this.f862c;
        int iA = a();
        if (iA == 6) {
            i2 |= 4;
        } else if (iA == 7) {
            i2 |= 1;
        }
        return i2 & 273;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f861b), Integer.valueOf(this.f862c), Integer.valueOf(this.f860a), Integer.valueOf(this.f863d)});
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f861b == cVar.b() && this.f862c == cVar.d() && this.f860a == cVar.c() && this.f863d == cVar.f863d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f863d != -1) {
            sb.append(" stream=");
            sb.append(this.f863d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.a(this.f860a));
        sb.append(" content=");
        sb.append(this.f861b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f862c).toUpperCase());
        return sb.toString();
    }
}
