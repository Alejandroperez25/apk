package c.d.b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.x;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f4089a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4090b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4091c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4092d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4093e;

    /* renamed from: f, reason: collision with root package name */
    private final String f4094f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4095g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f4096a;

        /* renamed from: b, reason: collision with root package name */
        private String f4097b;

        /* renamed from: c, reason: collision with root package name */
        private String f4098c;

        /* renamed from: d, reason: collision with root package name */
        private String f4099d;

        /* renamed from: e, reason: collision with root package name */
        private String f4100e;

        /* renamed from: f, reason: collision with root package name */
        private String f4101f;

        /* renamed from: g, reason: collision with root package name */
        private String f4102g;

        public a a(String str) {
            t.a(str, (Object) "ApiKey must be set.");
            this.f4096a = str;
            return this;
        }

        public a b(String str) {
            t.a(str, (Object) "ApplicationId must be set.");
            this.f4097b = str;
            return this;
        }

        public a c(String str) {
            this.f4098c = str;
            return this;
        }

        public a d(String str) {
            this.f4100e = str;
            return this;
        }

        public a e(String str) {
            this.f4101f = str;
            return this;
        }

        public a f(String str) {
            this.f4102g = str;
            return this;
        }

        public j a() {
            return new j(this.f4097b, this.f4096a, this.f4098c, this.f4099d, this.f4100e, this.f4101f, this.f4102g);
        }
    }

    private j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        t.a(!com.google.android.gms.common.util.k.b(str), "ApplicationId must be set.");
        this.f4090b = str;
        this.f4089a = str2;
        this.f4091c = str3;
        this.f4092d = str4;
        this.f4093e = str5;
        this.f4094f = str6;
        this.f4095g = str7;
    }

    public static j a(Context context) {
        x xVar = new x(context);
        String strA = xVar.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new j(strA, xVar.a("google_api_key"), xVar.a("firebase_database_url"), xVar.a("ga_trackingId"), xVar.a("gcm_defaultSenderId"), xVar.a("google_storage_bucket"), xVar.a("project_id"));
    }

    public String a() {
        return this.f4089a;
    }

    public String b() {
        return this.f4090b;
    }

    public String c() {
        return this.f4091c;
    }

    public String d() {
        return this.f4093e;
    }

    public String e() {
        return this.f4094f;
    }

    public String f() {
        return this.f4095g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.a(this.f4090b, jVar.f4090b) && s.a(this.f4089a, jVar.f4089a) && s.a(this.f4091c, jVar.f4091c) && s.a(this.f4092d, jVar.f4092d) && s.a(this.f4093e, jVar.f4093e) && s.a(this.f4094f, jVar.f4094f) && s.a(this.f4095g, jVar.f4095g);
    }

    public int hashCode() {
        return s.a(this.f4090b, this.f4089a, this.f4091c, this.f4092d, this.f4093e, this.f4094f, this.f4095g);
    }

    public String toString() {
        s.a aVarA = s.a(this);
        aVarA.a("applicationId", this.f4090b);
        aVarA.a("apiKey", this.f4089a);
        aVarA.a("databaseUrl", this.f4091c);
        aVarA.a("gcmSenderId", this.f4093e);
        aVarA.a("storageBucket", this.f4094f);
        aVarA.a("projectId", this.f4095g);
        return aVarA.toString();
    }
}
