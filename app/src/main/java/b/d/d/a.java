package b.d.d;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f1055a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1056b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1057c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f1058d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1059e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1060f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        b.d.f.d.a(str);
        this.f1055a = str;
        b.d.f.d.a(str2);
        this.f1056b = str2;
        b.d.f.d.a(str3);
        this.f1057c = str3;
        b.d.f.d.a(list);
        this.f1058d = list;
        this.f1059e = 0;
        this.f1060f = this.f1055a + "-" + this.f1056b + "-" + this.f1057c;
    }

    public String a() {
        return this.f1055a;
    }

    public String b() {
        return this.f1056b;
    }

    public String c() {
        return this.f1057c;
    }

    public List<List<byte[]>> d() {
        return this.f1058d;
    }

    public int e() {
        return this.f1059e;
    }

    public String f() {
        return this.f1060f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1055a + ", mProviderPackage: " + this.f1056b + ", mQuery: " + this.f1057c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f1058d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f1058d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f1059e);
        return sb.toString();
    }
}
