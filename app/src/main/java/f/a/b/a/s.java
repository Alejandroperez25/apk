package f.a.b.a;

import android.app.Activity;
import android.hardware.camera2.CameraAccessException;
import f.a.a.a.o;
import f.a.b.a.m;
import io.flutter.view.r;

/* loaded from: classes.dex */
final class s implements o.c {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f5751a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a.a.a.e f5752b;

    /* renamed from: c, reason: collision with root package name */
    private final m f5753c;

    /* renamed from: d, reason: collision with root package name */
    private final m.b f5754d;

    /* renamed from: e, reason: collision with root package name */
    private final io.flutter.view.r f5755e;

    /* renamed from: f, reason: collision with root package name */
    private final f.a.a.a.o f5756f;

    /* renamed from: g, reason: collision with root package name */
    private final f.a.a.a.g f5757g;

    /* renamed from: h, reason: collision with root package name */
    private l f5758h;

    s(Activity activity, f.a.a.a.e eVar, m mVar, m.b bVar, io.flutter.view.r rVar) {
        this.f5751a = activity;
        this.f5752b = eVar;
        this.f5753c = mVar;
        this.f5754d = bVar;
        this.f5755e = rVar;
        this.f5756f = new f.a.a.a.o(eVar, "plugins.flutter.io/camera");
        this.f5757g = new f.a.a.a.g(eVar, "plugins.flutter.io/camera/imageStream");
        this.f5756f.a(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    @Override // f.a.a.a.o.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(final f.a.a.a.m r6, final f.a.a.a.o.d r7) throws java.lang.IllegalStateException, android.hardware.camera2.CameraAccessException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.b.a.s.a(f.a.a.a.m, f.a.a.a.o$d):void");
    }

    public static /* synthetic */ void a(s sVar, f.a.a.a.m mVar, o.d dVar, String str, String str2) {
        if (str == null) {
            try {
                sVar.b(mVar, dVar);
                return;
            } catch (Exception e2) {
                sVar.a(e2, dVar);
                throw null;
            }
        }
        dVar.a(str, str2, null);
    }

    private void b(f.a.a.a.m mVar, o.d dVar) throws CameraAccessException {
        String str = (String) mVar.a("cameraName");
        String str2 = (String) mVar.a("resolutionPreset");
        boolean zBooleanValue = ((Boolean) mVar.a("enableAudio")).booleanValue();
        r.a aVarA = this.f5755e.a();
        this.f5758h = new l(this.f5751a, aVarA, new r(this.f5752b, aVarA.c()), str, str2, zBooleanValue);
        this.f5758h.a(dVar);
    }

    private void a(Exception exc, o.d dVar) {
        if (exc instanceof CameraAccessException) {
            dVar.a("CameraAccess", exc.getMessage(), null);
        }
        throw ((RuntimeException) exc);
    }
}
