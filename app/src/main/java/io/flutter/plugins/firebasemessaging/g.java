package io.flutter.plugins.firebasemessaging;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import f.a.a.a.o;
import java.io.IOException;

/* loaded from: classes.dex */
class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o.d f6218a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f6219b;

    g(h hVar, o.d dVar) {
        this.f6219b = hVar;
        this.f6218a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            FirebaseInstanceId.a().e();
            if (this.f6219b.f6220a.d() != null) {
                this.f6219b.f6220a.d().runOnUiThread(new e(this));
            }
        } catch (IOException e2) {
            Log.e("FirebaseMessagingPlugin", "deleteInstanceID, error:", e2);
            if (this.f6219b.f6220a.d() != null) {
                this.f6219b.f6220a.d().runOnUiThread(new f(this));
            }
        }
    }
}
