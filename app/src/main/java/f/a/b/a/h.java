package f.a.b.a;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import f.a.a.a.o;
import f.a.b.a.r;
import java.util.HashMap;

/* loaded from: classes.dex */
class h extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o.d f5718a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f5719b;

    h(l lVar, o.d dVar) {
        this.f5719b = lVar;
        this.f5718a = dVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(CameraDevice cameraDevice) {
        this.f5719b.j = cameraDevice;
        try {
            this.f5719b.a();
            HashMap map = new HashMap();
            map.put("textureId", Long.valueOf(this.f5719b.f5725a.c()));
            map.put("previewWidth", Integer.valueOf(this.f5719b.f5732h.getWidth()));
            map.put("previewHeight", Integer.valueOf(this.f5719b.f5732h.getHeight()));
            this.f5718a.a(map);
        } catch (CameraAccessException e2) {
            this.f5718a.a("CameraAccess", e2.getMessage(), null);
            this.f5719b.b();
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onClosed(CameraDevice cameraDevice) {
        this.f5719b.n.a();
        super.onClosed(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(CameraDevice cameraDevice) {
        this.f5719b.b();
        this.f5719b.n.a(r.a.ERROR, "The camera was disconnected.");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(CameraDevice cameraDevice, int i2) {
        String str;
        this.f5719b.b();
        switch (i2) {
            case 1:
                str = "The camera device is in use already.";
                break;
            case 2:
                str = "Max cameras in use";
                break;
            case 3:
                str = "The camera device could not be opened due to a device policy.";
                break;
            case 4:
                str = "The camera device has encountered a fatal error";
                break;
            case 5:
                str = "The camera service has encountered a fatal error.";
                break;
            default:
                str = "Unknown camera error";
                break;
        }
        this.f5719b.n.a(r.a.ERROR, str);
    }
}
