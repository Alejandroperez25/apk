package c.d.b.e;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    private final String f4078a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4079b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f4078a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f4079b = str2;
    }

    @Override // c.d.b.e.e
    public String a() {
        return this.f4078a;
    }

    @Override // c.d.b.e.e
    public String b() {
        return this.f4079b;
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f4078a + ", version=" + this.f4079b + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4078a.equals(eVar.a()) && this.f4079b.equals(eVar.b());
    }

    public int hashCode() {
        return ((this.f4078a.hashCode() ^ 1000003) * 1000003) ^ this.f4079b.hashCode();
    }
}
