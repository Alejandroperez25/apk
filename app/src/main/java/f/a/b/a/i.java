package f.a.b.a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import f.a.a.a.o;

/* loaded from: classes.dex */
class i extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o.d f5720a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f5721b;

    i(l lVar, o.d dVar) {
        this.f5721b = lVar;
        this.f5720a = dVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        String str;
        switch (captureFailure.getReason()) {
            case 0:
                str = "An error happened in the framework";
                break;
            case 1:
                str = "The capture has failed due to an abortCaptures() call";
                break;
            default:
                str = "Unknown reason";
                break;
        }
        this.f5720a.a("captureFailure", str, null);
    }
}
