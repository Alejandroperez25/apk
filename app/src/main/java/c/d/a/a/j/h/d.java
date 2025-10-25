package c.d.a.a.j.h;

import android.text.Layout;
import c.d.a.a.m.H;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private String f3238a;

    /* renamed from: b, reason: collision with root package name */
    private String f3239b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f3240c;

    /* renamed from: d, reason: collision with root package name */
    private String f3241d;

    /* renamed from: e, reason: collision with root package name */
    private String f3242e;

    /* renamed from: f, reason: collision with root package name */
    private int f3243f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3244g;

    /* renamed from: h, reason: collision with root package name */
    private int f3245h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3246i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private float o;
    private Layout.Alignment p;

    public d() {
        a();
    }

    public void a() {
        this.f3238a = "";
        this.f3239b = "";
        this.f3240c = Collections.emptyList();
        this.f3241d = "";
        this.f3242e = null;
        this.f3244g = false;
        this.f3246i = false;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.p = null;
    }

    public void a(String str) {
        this.f3238a = str;
    }

    public void b(String str) {
        this.f3239b = str;
    }

    public void a(String[] strArr) {
        this.f3240c = Arrays.asList(strArr);
    }

    public void c(String str) {
        this.f3241d = str;
    }

    public int a(String str, String str2, String[] strArr, String str3) {
        if (this.f3238a.isEmpty() && this.f3239b.isEmpty() && this.f3240c.isEmpty() && this.f3241d.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int iA = a(a(a(0, this.f3238a, str, 1073741824), this.f3239b, str2, 2), this.f3241d, str3, 4);
        if (iA == -1 || !Arrays.asList(strArr).containsAll(this.f3240c)) {
            return 0;
        }
        return iA + (this.f3240c.size() * 4);
    }

    public int b() {
        if (this.l == -1 && this.m == -1) {
            return -1;
        }
        return (this.l == 1 ? 1 : 0) | (this.m == 1 ? 2 : 0);
    }

    public boolean c() {
        return this.j == 1;
    }

    public boolean d() {
        return this.k == 1;
    }

    public d a(boolean z) {
        this.k = z ? 1 : 0;
        return this;
    }

    public d b(boolean z) {
        this.l = z ? 1 : 0;
        return this;
    }

    public d c(boolean z) {
        this.m = z ? 1 : 0;
        return this;
    }

    public String e() {
        return this.f3242e;
    }

    public d d(String str) {
        this.f3242e = H.d(str);
        return this;
    }

    public int f() {
        if (!this.f3244g) {
            throw new IllegalStateException("Font color not defined");
        }
        return this.f3243f;
    }

    public d a(int i2) {
        this.f3243f = i2;
        this.f3244g = true;
        return this;
    }

    public boolean g() {
        return this.f3244g;
    }

    public int h() {
        if (!this.f3246i) {
            throw new IllegalStateException("Background color not defined.");
        }
        return this.f3245h;
    }

    public d b(int i2) {
        this.f3245h = i2;
        this.f3246i = true;
        return this;
    }

    public boolean i() {
        return this.f3246i;
    }

    public Layout.Alignment j() {
        return this.p;
    }

    public int k() {
        return this.n;
    }

    public float l() {
        return this.o;
    }

    private static int a(int i2, String str, String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }
}
