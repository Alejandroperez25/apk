package b.d.d;

import android.content.Context;
import b.d.d.f;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
class b implements Callable<f.c> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f1061a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f1062b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1063c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f1064d;

    b(Context context, a aVar, int i2, String str) {
        this.f1061a = context;
        this.f1062b = aVar;
        this.f1063c = i2;
        this.f1064d = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public f.c call() {
        f.c cVarA = f.a(this.f1061a, this.f1062b, this.f1063c);
        if (cVarA.f1080a != null) {
            f.f1068a.a(this.f1064d, cVarA.f1080a);
        }
        return cVarA;
    }
}
