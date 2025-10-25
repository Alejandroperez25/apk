package f.a.b.a;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import f.a.b.a.r;

/* loaded from: classes.dex */
class j extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f5722a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f5723b;

    j(l lVar, Runnable runnable) {
        this.f5723b = lVar;
        this.f5722a = runnable;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) throws CameraAccessException {
        try {
            if (this.f5723b.j == null) {
                this.f5723b.n.a(r.a.ERROR, "The camera was closed during configuration.");
                return;
            }
            this.f5723b.k = cameraCaptureSession;
            this.f5723b.o.set(CaptureRequest.CONTROL_MODE, 1);
            this.f5723b.k.setRepeatingRequest(this.f5723b.o.build(), null, null);
            if (this.f5722a != null) {
                this.f5722a.run();
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e2) {
            this.f5723b.n.a(r.a.ERROR, e2.getMessage());
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f5723b.n.a(r.a.ERROR, "Failed to configure camera session.");
    }
}
