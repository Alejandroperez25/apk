package io.flutter.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import f.a.a.a.r;
import io.flutter.embedding.engine.d.d;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.g;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static b asyncWaitForVsyncDelegate;
    private static String observatoryUri;
    private static float refreshRateFPS;
    private a accessibilityDelegate;
    private final Set<a$a> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<d> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();
    private Long nativePlatformViewId;
    private io.flutter.embedding.engine.a.d platformMessageHandler;

    public interface a {
        void a(ByteBuffer byteBuffer, String[] strArr);

        void b(ByteBuffer byteBuffer, String[] strArr);
    }

    public interface b {
        void a(long j);
    }

    private native long nativeAttach(FlutterJNI flutterJNI, boolean z);

    private native void nativeDestroy(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, String str, int i2);

    private native void nativeDispatchPlatformMessage(long j, String str, ByteBuffer byteBuffer, int i2, int i3);

    private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i2);

    private native void nativeDispatchSemanticsAction(long j, int i2, int i3, ByteBuffer byteBuffer, int i4);

    private native Bitmap nativeGetBitmap(long j);

    public static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i2);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i2, ByteBuffer byteBuffer, int i3);

    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j2);

    public static native void nativeOnVsync(long j, long j2, long j3);

    public static native void nativeRecordStartTimestamp(long j);

    private native void nativeRegisterTexture(long j, long j2, SurfaceTexture surfaceTexture);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j, String str, String str2, String str3, AssetManager assetManager);

    private native void nativeSetAccessibilityFeatures(long j, int i2);

    private native void nativeSetSemanticsEnabled(long j, boolean z);

    private native void nativeSetViewportMetrics(long j, float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15);

    private native void nativeSurfaceChanged(long j, int i2, int i3);

    private native void nativeSurfaceCreated(long j, Surface surface);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeUnregisterTexture(long j, long j2);

    public native boolean nativeGetIsSoftwareRenderingEnabled();

    public static String getObservatoryUri() {
        return observatoryUri;
    }

    public static void setRefreshRateFPS(float f2) {
        refreshRateFPS = f2;
    }

    public static void setAsyncWaitForVsyncDelegate(b bVar) {
        asyncWaitForVsyncDelegate = bVar;
    }

    private static void asyncWaitForVsync(long j) {
        if (asyncWaitForVsyncDelegate != null) {
            asyncWaitForVsyncDelegate.a(j);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    public boolean isAttached() {
        return this.nativePlatformViewId != null;
    }

    public void attachToNative(boolean z) {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.nativePlatformViewId = Long.valueOf(nativeAttach(this, z));
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDestroy(this.nativePlatformViewId.longValue());
        this.nativePlatformViewId = null;
    }

    private void ensureNotAttachedToNative() {
        if (this.nativePlatformViewId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureAttachedToNative() {
        if (this.nativePlatformViewId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    public void addIsDisplayingFlutterUiListener(d dVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(dVar);
    }

    public void removeIsDisplayingFlutterUiListener(d dVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(dVar);
    }

    void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<d> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<d> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativePlatformViewId.longValue(), surface);
    }

    public void onSurfaceChanged(int i2, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativePlatformViewId.longValue(), i2, i3);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativePlatformViewId.longValue());
    }

    public void setViewportMetrics(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativePlatformViewId.longValue(), f2, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativePlatformViewId.longValue(), byteBuffer, i2);
    }

    public void setAccessibilityDelegate(a aVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = aVar;
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        if (this.accessibilityDelegate != null) {
            this.accessibilityDelegate.b(byteBuffer, strArr);
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        if (this.accessibilityDelegate != null) {
            this.accessibilityDelegate.a(byteBuffer, strArr);
        }
    }

    public void dispatchSemanticsAction(int i2, g.b bVar) {
        dispatchSemanticsAction(i2, bVar, null);
    }

    public void dispatchSemanticsAction(int i2, g.b bVar, Object obj) {
        ByteBuffer byteBufferA;
        int iPosition;
        ensureAttachedToNative();
        if (obj != null) {
            byteBufferA = r.f5674a.a(obj);
            iPosition = byteBufferA.position();
        } else {
            byteBufferA = null;
            iPosition = 0;
        }
        dispatchSemanticsAction(i2, bVar.w, byteBufferA, iPosition);
    }

    public void dispatchSemanticsAction(int i2, int i3, ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativePlatformViewId.longValue(), i2, i3, byteBuffer, i4);
    }

    public void setSemanticsEnabled(boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetSemanticsEnabled(this.nativePlatformViewId.longValue(), z);
    }

    public void setAccessibilityFeatures(int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetAccessibilityFeatures(this.nativePlatformViewId.longValue(), i2);
    }

    public void registerTexture(long j, SurfaceTexture surfaceTexture) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativePlatformViewId.longValue(), j, surfaceTexture);
    }

    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativePlatformViewId.longValue(), j);
    }

    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativePlatformViewId.longValue(), j);
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativePlatformViewId.longValue(), str, str2, str3, assetManager);
    }

    public void setPlatformMessageHandler(io.flutter.embedding.engine.a.d dVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = dVar;
    }

    private void handlePlatformMessage(String str, byte[] bArr, int i2) {
        if (this.platformMessageHandler != null) {
            this.platformMessageHandler.a(str, bArr, i2);
        }
    }

    private void handlePlatformMessageResponse(int i2, byte[] bArr) {
        if (this.platformMessageHandler != null) {
            this.platformMessageHandler.a(i2, bArr);
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativePlatformViewId.longValue(), str, i2);
            return;
        }
        f.a.a.c(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i2, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativePlatformViewId.longValue(), str, byteBuffer, i2, i3);
            return;
        }
        f.a.a.c(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i3);
    }

    public void invokePlatformMessageEmptyResponseCallback(int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeInvokePlatformMessageEmptyResponseCallback(this.nativePlatformViewId.longValue(), i2);
            return;
        }
        f.a.a.c(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
    }

    public void invokePlatformMessageResponseCallback(int i2, ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeInvokePlatformMessageResponseCallback(this.nativePlatformViewId.longValue(), i2, byteBuffer, i3);
            return;
        }
        f.a.a.c(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i2);
    }

    public void addEngineLifecycleListener(a$a a_a) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(a_a);
    }

    public void removeEngineLifecycleListener(a$a a_a) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(a_a);
    }

    private void onPreEngineRestart() {
        Iterator<a$a> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativePlatformViewId.longValue());
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }
}
