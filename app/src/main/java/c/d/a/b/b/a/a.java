package c.d.a.b.b.a;

import android.util.Log;
import com.google.android.gms.common.internal.C0350k;
import java.util.Locale;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f3732a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3733b;

    /* renamed from: c, reason: collision with root package name */
    private final C0350k f3734c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3735d;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append(']');
            sb.append(' ');
            string = sb.toString();
        }
        this(str, string);
    }

    private a(String str, String str2) {
        this.f3733b = str2;
        this.f3732a = str;
        this.f3734c = new C0350k(str);
        int i2 = 2;
        while (7 >= i2 && !Log.isLoggable(this.f3732a, i2)) {
            i2++;
        }
        this.f3735d = i2;
    }

    public boolean a(int i2) {
        return this.f3735d <= i2;
    }

    public void a(String str, Object... objArr) {
        if (a(2)) {
            Log.v(this.f3732a, e(str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        Log.i(this.f3732a, e(str, objArr));
    }

    public void c(String str, Object... objArr) {
        Log.w(this.f3732a, e(str, objArr));
    }

    public void d(String str, Object... objArr) {
        Log.e(this.f3732a, e(str, objArr));
    }

    public void a(String str, Throwable th, Object... objArr) {
        Log.e(this.f3732a, e(str, objArr), th);
    }

    public void b(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f3732a, e(str, objArr), th);
    }

    public void a(Throwable th) {
        Log.wtf(this.f3732a, th);
    }

    private final String e(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f3733b.concat(str);
    }
}
