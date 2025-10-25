package androidx.core.app;

import android.app.Activity;
import android.content.pm.PackageManager;
import androidx.core.app.b;

/* loaded from: classes.dex */
class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String[] f481a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f482b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f483c;

    a(String[] strArr, Activity activity, int i2) {
        this.f481a = strArr;
        this.f482b = activity;
        this.f483c = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[this.f481a.length];
        PackageManager packageManager = this.f482b.getPackageManager();
        String packageName = this.f482b.getPackageName();
        int length = this.f481a.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = packageManager.checkPermission(this.f481a[i2], packageName);
        }
        ((b.a) this.f482b).onRequestPermissionsResult(this.f483c, this.f481a, iArr);
    }
}
