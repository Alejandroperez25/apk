package c.h.a.b.c;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import c.h.a.b.c.b;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a implements Camera.PreviewCallback, Camera.FaceDetectionListener {

    /* renamed from: c, reason: collision with root package name */
    private SurfaceView f4721c;

    /* renamed from: d, reason: collision with root package name */
    private TextureView f4722d;

    /* renamed from: e, reason: collision with root package name */
    private SurfaceTexture f4723e;

    /* renamed from: f, reason: collision with root package name */
    private e f4724f;

    /* renamed from: i, reason: collision with root package name */
    private int f4727i;
    private Context m;
    private byte[] s;
    private List<Camera.Size> t;
    private List<Camera.Size> u;
    private InterfaceC0053a v;

    /* renamed from: a, reason: collision with root package name */
    private String f4719a = "Camera1ApiManager";

    /* renamed from: b, reason: collision with root package name */
    private Camera f4720b = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4725g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4726h = false;
    private boolean j = false;
    private boolean k = false;
    private int l = 0;
    private int n = 640;
    private int o = 480;
    private int p = 30;
    private int q = 0;
    private int r = 17;

    /* renamed from: c.h.a.b.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0053a {
        void a(Camera.Face[] faceArr);
    }

    public a(SurfaceTexture surfaceTexture, Context context) {
        this.f4723e = surfaceTexture;
        this.m = context;
        c();
    }

    private void c() {
        this.f4727i = e();
        this.t = g();
        this.f4727i = f();
        this.u = g();
    }

    public void a(int i2) {
        this.q = i2;
    }

    public void a(SurfaceTexture surfaceTexture) {
        this.f4723e = surfaceTexture;
    }

    public void a(b.a aVar, int i2, int i3, int i4) throws IOException {
        int i5 = aVar == b.a.BACK ? 0 : 1;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.l = i5;
        this.f4727i = i5 == 0 ? e() : f();
        d();
    }

    public void a(int i2, int i3, int i4) throws IOException {
        a(this.l == 0 ? b.a.BACK : b.a.FRONT, i2, i3, i4);
    }

    private void d() throws IOException {
        if (!i()) {
            throw new c("This camera resolution cant be opened");
        }
        this.s = new byte[((this.n * this.o) * 3) / 2];
        try {
            this.f4720b = Camera.open(this.f4727i);
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(this.f4727i, cameraInfo);
            this.j = cameraInfo.facing == 1;
            this.k = this.m.getResources().getConfiguration().orientation == 1;
            Camera.Parameters parameters = this.f4720b.getParameters();
            parameters.setPreviewSize(this.n, this.o);
            parameters.setPreviewFormat(this.r);
            int[] iArrA = a(this.p, parameters.getSupportedPreviewFpsRange());
            parameters.setPreviewFpsRange(iArrA[0], iArrA[1]);
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (supportedFocusModes != null && !supportedFocusModes.isEmpty()) {
                if (supportedFocusModes.contains("continuous-picture")) {
                    parameters.setFocusMode("continuous-picture");
                } else if (supportedFocusModes.contains("auto")) {
                    parameters.setFocusMode("auto");
                } else {
                    parameters.setFocusMode(supportedFocusModes.get(0));
                }
            }
            this.f4720b.setParameters(parameters);
            this.f4720b.setDisplayOrientation(this.q);
            if (this.f4721c != null) {
                this.f4720b.setPreviewDisplay(this.f4721c.getHolder());
                this.f4720b.addCallbackBuffer(this.s);
                this.f4720b.setPreviewCallbackWithBuffer(this);
            } else if (this.f4722d != null) {
                this.f4720b.setPreviewTexture(this.f4722d.getSurfaceTexture());
                this.f4720b.addCallbackBuffer(this.s);
                this.f4720b.setPreviewCallbackWithBuffer(this);
            } else {
                this.f4720b.setPreviewTexture(this.f4723e);
            }
            this.f4720b.startPreview();
            this.f4725g = true;
            Log.i(this.f4719a, this.n + "X" + this.o);
        } catch (IOException e2) {
            Log.e(this.f4719a, "Error", e2);
        }
    }

    private int e() {
        return b(0);
    }

    private int f() {
        return b(1);
    }

    private int b(int i2) {
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i3 = 0; i3 < numberOfCameras; i3++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i3, cameraInfo);
            if (cameraInfo.facing == i2) {
                return i3;
            }
        }
        return 0;
    }

    public void a() {
        if (this.f4720b != null) {
            this.f4720b.stopPreview();
            this.f4720b.setPreviewCallback(null);
            this.f4720b.setPreviewCallbackWithBuffer(null);
            this.f4720b.release();
            this.f4720b = null;
        }
        this.f4725g = false;
    }

    public boolean b() {
        return this.f4725g;
    }

    private int[] a(int i2, List<int[]> list) {
        int iAbs;
        int i3 = i2 * 1000;
        int[] iArr = list.get(0);
        int iAbs2 = Math.abs(iArr[0] - i3) + Math.abs(iArr[1] - i3);
        for (int[] iArr2 : list) {
            if (iArr2[0] <= i3 && iArr2[1] >= i3 && (iAbs = Math.abs(iArr2[0] - i3) + Math.abs(iArr2[1] - i3)) < iAbs2) {
                iArr = iArr2;
                iAbs2 = iAbs;
            }
        }
        return iArr;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        this.f4724f.a(new c.h.a.c(bArr, this.q, this.j && this.k, this.r));
        camera.addCallbackBuffer(this.s);
    }

    private List<Camera.Size> g() {
        Camera.Size sizeH;
        List<Camera.Size> supportedPreviewSizes;
        if (this.f4720b != null) {
            sizeH = h();
            supportedPreviewSizes = this.f4720b.getParameters().getSupportedPreviewSizes();
        } else {
            this.f4720b = Camera.open(this.f4727i);
            sizeH = h();
            supportedPreviewSizes = this.f4720b.getParameters().getSupportedPreviewSizes();
            this.f4720b.release();
            this.f4720b = null;
        }
        Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
        while (it.hasNext()) {
            Camera.Size next = it.next();
            if (next.width > sizeH.width || next.height > sizeH.height) {
                Log.i(this.f4719a, next.width + "X" + next.height + ", not supported for encoder");
                it.remove();
            }
        }
        return supportedPreviewSizes;
    }

    private Camera.Size h() {
        if (CamcorderProfile.hasProfile(8)) {
            Camera camera = this.f4720b;
            camera.getClass();
            return new Camera.Size(camera, 3840, 2160);
        }
        if (CamcorderProfile.hasProfile(6)) {
            Camera camera2 = this.f4720b;
            camera2.getClass();
            return new Camera.Size(camera2, 1920, 1080);
        }
        if (CamcorderProfile.hasProfile(5)) {
            Camera camera3 = this.f4720b;
            camera3.getClass();
            return new Camera.Size(camera3, 1280, 720);
        }
        Camera camera4 = this.f4720b;
        camera4.getClass();
        return new Camera.Size(camera4, 640, 480);
    }

    private boolean i() {
        List<Camera.Size> list;
        if (this.f4727i == e()) {
            list = this.t;
        } else {
            list = this.u;
        }
        for (Camera.Size size : list) {
            if (size.width == this.n && size.height == this.o) {
                return true;
            }
        }
        return false;
    }

    @Override // android.hardware.Camera.FaceDetectionListener
    public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
        if (this.v != null) {
            this.v.a(faceArr);
        }
    }
}
