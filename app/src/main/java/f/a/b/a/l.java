package f.a.b.a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.CamcorderProfile;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.util.Size;
import android.view.OrientationEventListener;
import android.view.Surface;
import f.a.a.a.g;
import f.a.a.a.o;
import io.flutter.view.r;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final r.a f5725a;

    /* renamed from: b, reason: collision with root package name */
    private final CameraManager f5726b;

    /* renamed from: c, reason: collision with root package name */
    private final OrientationEventListener f5727c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5728d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5729e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5730f;

    /* renamed from: g, reason: collision with root package name */
    private final Size f5731g;

    /* renamed from: h, reason: collision with root package name */
    private final Size f5732h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f5733i;
    private CameraDevice j;
    private CameraCaptureSession k;
    private ImageReader l;
    private ImageReader m;
    private r n;
    private CaptureRequest.Builder o;
    private MediaRecorder p;
    private boolean q;
    private CamcorderProfile r;
    private int s = -1;

    public enum a {
        low,
        medium,
        high,
        veryHigh,
        ultraHigh,
        max
    }

    public l(Activity activity, r.a aVar, r rVar, String str, String str2, boolean z) throws CameraAccessException {
        if (activity == null) {
            throw new IllegalStateException("No activity available!");
        }
        this.f5730f = str;
        this.f5733i = z;
        this.f5725a = aVar;
        this.n = rVar;
        this.f5726b = (CameraManager) activity.getSystemService("camera");
        this.f5727c = new g(this, activity.getApplicationContext());
        this.f5727c.enable();
        CameraCharacteristics cameraCharacteristics = this.f5726b.getCameraCharacteristics(str);
        this.f5729e = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f5728d = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
        a aVarValueOf = a.valueOf(str2);
        this.r = p.b(str, aVarValueOf);
        this.f5731g = new Size(this.r.videoFrameWidth, this.r.videoFrameHeight);
        this.f5732h = p.a(str, aVarValueOf);
    }

    private void a(String str) throws IllegalStateException, IOException {
        if (this.p != null) {
            this.p.release();
        }
        this.p = new MediaRecorder();
        if (this.f5733i) {
            this.p.setAudioSource(1);
        }
        this.p.setVideoSource(2);
        this.p.setOutputFormat(this.r.fileFormat);
        if (this.f5733i) {
            this.p.setAudioEncoder(this.r.audioCodec);
        }
        this.p.setVideoEncoder(this.r.videoCodec);
        this.p.setVideoEncodingBitRate(this.r.videoBitRate);
        if (this.f5733i) {
            this.p.setAudioSamplingRate(this.r.audioSampleRate);
        }
        this.p.setVideoFrameRate(this.r.videoFrameRate);
        this.p.setVideoSize(this.r.videoFrameWidth, this.r.videoFrameHeight);
        this.p.setOutputFile(str);
        this.p.setOrientationHint(e());
        this.p.prepare();
    }

    @SuppressLint({"MissingPermission"})
    public void a(o.d dVar) throws CameraAccessException {
        this.l = ImageReader.newInstance(this.f5731g.getWidth(), this.f5731g.getHeight(), 256, 2);
        this.m = ImageReader.newInstance(this.f5732h.getWidth(), this.f5732h.getHeight(), 35, 2);
        this.f5726b.openCamera(this.f5730f, new h(this, dVar), (Handler) null);
    }

    private void a(ByteBuffer byteBuffer, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        while (true) {
            Throwable th = null;
            try {
                try {
                    if (byteBuffer.remaining() > 0) {
                        fileOutputStream.getChannel().write(byteBuffer);
                    } else {
                        fileOutputStream.close();
                        return;
                    }
                } catch (Throwable th2) {
                    if (th != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    } else {
                        fileOutputStream.close();
                    }
                    throw th2;
                }
            } finally {
            }
        }
    }

    public void a(String str, final o.d dVar) throws CameraAccessException {
        final File file = new File(str);
        if (file.exists()) {
            dVar.a("fileExists", "File at path '" + str + "' already exists. Cannot overwrite.", null);
            return;
        }
        this.l.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: f.a.b.a.a
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) throws Throwable {
                l.a(this.f5706a, file, dVar, imageReader);
            }
        }, null);
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.j.createCaptureRequest(2);
            builderCreateCaptureRequest.addTarget(this.l.getSurface());
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(e()));
            this.k.capture(builderCreateCaptureRequest.build(), new i(this, dVar), null);
        } catch (CameraAccessException e2) {
            dVar.a("cameraAccess", e2.getMessage(), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[Catch: IOException -> 0x0036, SYNTHETIC, TRY_LEAVE, TryCatch #3 {IOException -> 0x0036, blocks: (B:3:0x0001, B:6:0x0018, B:16:0x0029, B:20:0x0032, B:19:0x002e, B:21:0x0035), top: B:28:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(f.a.b.a.l r4, java.io.File r5, f.a.a.a.o.d r6, android.media.ImageReader r7) throws java.lang.Throwable {
        /*
            r0 = 0
            android.media.Image r7 = r7.acquireLatestImage()     // Catch: java.io.IOException -> L36
            android.media.Image$Plane[] r1 = r7.getPlanes()     // Catch: java.lang.Throwable -> L1c java.lang.Throwable -> L1f
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L1c java.lang.Throwable -> L1f
            java.nio.ByteBuffer r1 = r1.getBuffer()     // Catch: java.lang.Throwable -> L1c java.lang.Throwable -> L1f
            r4.a(r1, r5)     // Catch: java.lang.Throwable -> L1c java.lang.Throwable -> L1f
            r6.a(r0)     // Catch: java.lang.Throwable -> L1c java.lang.Throwable -> L1f
            if (r7 == 0) goto L3d
            r7.close()     // Catch: java.io.IOException -> L36
            goto L3d
        L1c:
            r5 = move-exception
            r1 = r0
            goto L25
        L1f:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L21
        L21:
            r1 = move-exception
            r3 = r1
            r1 = r5
            r5 = r3
        L25:
            if (r7 == 0) goto L35
            if (r1 == 0) goto L32
            r7.close()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L36
            goto L35
        L2d:
            r7 = move-exception
            r1.addSuppressed(r7)     // Catch: java.io.IOException -> L36
            goto L35
        L32:
            r7.close()     // Catch: java.io.IOException -> L36
        L35:
            throw r5     // Catch: java.io.IOException -> L36
        L36:
            java.lang.String r5 = "IOError"
            java.lang.String r7 = "Failed saving image"
            r6.a(r5, r7, r0)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.b.a.l.a(f.a.b.a.l, java.io.File, f.a.a.a.o$d, android.media.ImageReader):void");
    }

    private void a(int i2, Surface... surfaceArr) throws CameraAccessException {
        a(i2, null, surfaceArr);
    }

    private void a(int i2, Runnable runnable, Surface... surfaceArr) throws CameraAccessException {
        d();
        this.o = this.j.createCaptureRequest(i2);
        SurfaceTexture surfaceTextureB = this.f5725a.b();
        surfaceTextureB.setDefaultBufferSize(this.f5732h.getWidth(), this.f5732h.getHeight());
        Surface surface = new Surface(surfaceTextureB);
        this.o.addTarget(surface);
        List listAsList = Arrays.asList(surfaceArr);
        if (i2 != 1) {
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                this.o.addTarget((Surface) it.next());
            }
        }
        j jVar = new j(this, runnable);
        ArrayList arrayList = new ArrayList();
        arrayList.add(surface);
        arrayList.addAll(listAsList);
        this.j.createCaptureSession(arrayList, jVar, null);
    }

    public void b(String str, o.d dVar) {
        if (new File(str).exists()) {
            dVar.a("fileExists", "File at path '" + str + "' already exists.", null);
            return;
        }
        try {
            a(str);
            this.q = true;
            a(3, new Runnable() { // from class: f.a.b.a.b
                @Override // java.lang.Runnable
                public final void run() throws IllegalStateException {
                    this.f5709a.p.start();
                }
            }, this.p.getSurface());
            dVar.a(null);
        } catch (CameraAccessException | IOException e2) {
            dVar.a("videoRecordingFailed", e2.getMessage(), null);
        }
    }

    public void b(o.d dVar) throws IllegalStateException {
        if (!this.q) {
            dVar.a(null);
            return;
        }
        try {
            this.q = false;
            this.p.stop();
            this.p.reset();
            a();
            dVar.a(null);
        } catch (CameraAccessException | IllegalStateException e2) {
            dVar.a("videoRecordingFailed", e2.getMessage(), null);
        }
    }

    public void c(o.d dVar) throws IllegalStateException {
        if (!this.q) {
            dVar.a(null);
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                this.p.pause();
                dVar.a(null);
            } else {
                dVar.a("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
            }
        } catch (IllegalStateException e2) {
            dVar.a("videoRecordingFailed", e2.getMessage(), null);
        }
    }

    public void d(o.d dVar) throws IllegalStateException {
        if (!this.q) {
            dVar.a(null);
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                this.p.resume();
                dVar.a(null);
            } else {
                dVar.a("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
            }
        } catch (IllegalStateException e2) {
            dVar.a("videoRecordingFailed", e2.getMessage(), null);
        }
    }

    public void a() throws CameraAccessException {
        a(1, this.l.getSurface());
    }

    public void a(f.a.a.a.g gVar) throws CameraAccessException {
        a(3, this.m.getSurface());
        gVar.a(new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final g.a aVar) {
        this.m.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: f.a.b.a.c
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                l.a(aVar, imageReader);
            }
        }, null);
    }

    static /* synthetic */ void a(g.a aVar, ImageReader imageReader) {
        Image imageAcquireLatestImage = imageReader.acquireLatestImage();
        if (imageAcquireLatestImage == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Image.Plane plane : imageAcquireLatestImage.getPlanes()) {
            ByteBuffer buffer = plane.getBuffer();
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr, 0, bArr.length);
            HashMap map = new HashMap();
            map.put("bytesPerRow", Integer.valueOf(plane.getRowStride()));
            map.put("bytesPerPixel", Integer.valueOf(plane.getPixelStride()));
            map.put("bytes", bArr);
            arrayList.add(map);
        }
        HashMap map2 = new HashMap();
        map2.put("width", Integer.valueOf(imageAcquireLatestImage.getWidth()));
        map2.put("height", Integer.valueOf(imageAcquireLatestImage.getHeight()));
        map2.put("format", Integer.valueOf(imageAcquireLatestImage.getFormat()));
        map2.put("planes", arrayList);
        aVar.a(map2);
        imageAcquireLatestImage.close();
    }

    private void d() {
        if (this.k != null) {
            this.k.close();
            this.k = null;
        }
    }

    public void b() {
        d();
        if (this.j != null) {
            this.j.close();
            this.j = null;
        }
        if (this.l != null) {
            this.l.close();
            this.l = null;
        }
        if (this.m != null) {
            this.m.close();
            this.m = null;
        }
        if (this.p != null) {
            this.p.reset();
            this.p.release();
            this.p = null;
        }
    }

    public void c() {
        b();
        this.f5725a.a();
        this.f5727c.disable();
    }

    private int e() {
        return (((this.s == -1 ? 0 : this.f5728d ? -this.s : this.s) + this.f5729e) + 360) % 360;
    }
}
