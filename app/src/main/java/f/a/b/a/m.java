package f.a.b.a;

import android.app.Activity;
import f.a.a.a.q;

/* loaded from: classes.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5741a = false;

    interface b {
        void a(q.e eVar);
    }

    interface c {
        void a(String str, String str2);
    }

    m() {
    }

    void a(Activity activity, b bVar, boolean z, final c cVar) {
        if (this.f5741a) {
            cVar.a("cameraPermission", "Camera permission request ongoing");
        }
        if (!a(activity) || (z && !b(activity))) {
            bVar.a(new a(new c() { // from class: f.a.b.a.d
                @Override // f.a.b.a.m.c
                public final void a(String str, String str2) {
                    m.a(this.f5711a, cVar, str, str2);
                }
            }));
            this.f5741a = true;
            androidx.core.app.b.a(activity, z ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
            return;
        }
        cVar.a(null, null);
    }

    public static /* synthetic */ void a(m mVar, c cVar, String str, String str2) {
        mVar.f5741a = false;
        cVar.a(str, str2);
    }

    private boolean a(Activity activity) {
        return androidx.core.content.a.b(activity, "android.permission.CAMERA") == 0;
    }

    private boolean b(Activity activity) {
        return androidx.core.content.a.b(activity, "android.permission.RECORD_AUDIO") == 0;
    }

    static final class a implements q.e {

        /* renamed from: a, reason: collision with root package name */
        boolean f5742a = false;

        /* renamed from: b, reason: collision with root package name */
        final c f5743b;

        a(c cVar) {
            this.f5743b = cVar;
        }

        @Override // f.a.a.a.q.e
        public boolean a(int i2, String[] strArr, int[] iArr) {
            if (this.f5742a || i2 != 9796) {
                return false;
            }
            this.f5742a = true;
            if (iArr[0] != 0) {
                this.f5743b.a("cameraPermission", "MediaRecorderCamera permission not granted");
            } else if (iArr.length > 1 && iArr[1] != 0) {
                this.f5743b.a("cameraPermission", "MediaRecorderAudio permission not granted");
            } else {
                this.f5743b.a(null, null);
            }
            return true;
        }
    }
}
