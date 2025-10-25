package io.flutter.embedding.android;

import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final io.flutter.embedding.engine.d.c f5967a;

    private int a(int i2) {
        if (i2 == 0) {
            return 4;
        }
        if (i2 == 1) {
            return 6;
        }
        if (i2 == 5) {
            return 4;
        }
        if (i2 == 6) {
            return 6;
        }
        if (i2 == 2) {
            return 5;
        }
        if (i2 == 7) {
            return 3;
        }
        if (i2 == 3) {
            return 0;
        }
        return i2 == 8 ? 3 : -1;
    }

    private int b(int i2) {
        switch (i2) {
            case 1:
                return 0;
            case 2:
                return 2;
            case 3:
                return 1;
            case 4:
                return 3;
            default:
                return 4;
        }
    }

    public b(io.flutter.embedding.engine.d.c cVar) {
        this.f5967a = cVar;
    }

    public boolean a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(pointerCount * 28 * 8);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int iA = a(motionEvent.getActionMasked());
        boolean z = actionMasked == 0 || actionMasked == 5;
        boolean z2 = !z && (actionMasked == 1 || actionMasked == 6);
        if (z) {
            a(motionEvent, motionEvent.getActionIndex(), iA, 0, byteBufferAllocateDirect);
        } else if (z2) {
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (i2 != motionEvent.getActionIndex() && motionEvent.getToolType(i2) == 1) {
                    a(motionEvent, i2, 5, 1, byteBufferAllocateDirect);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), iA, 0, byteBufferAllocateDirect);
        } else {
            for (int i3 = 0; i3 < pointerCount; i3++) {
                a(motionEvent, i3, iA, 0, byteBufferAllocateDirect);
            }
        }
        if (byteBufferAllocateDirect.position() % 224 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f5967a.a(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }

    public boolean b(MotionEvent motionEvent) {
        boolean z = Build.VERSION.SDK_INT >= 18 && motionEvent.isFromSource(2);
        boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z || !z2) {
            return false;
        }
        int iA = a(motionEvent.getActionMasked());
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 28 * 8);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        a(motionEvent, motionEvent.getActionIndex(), iA, 0, byteBufferAllocateDirect);
        if (byteBufferAllocateDirect.position() % 224 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.f5967a.a(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }

    private void a(MotionEvent motionEvent, int i2, int i3, int i4, ByteBuffer byteBuffer) {
        long buttonState;
        double min;
        double d2;
        InputDevice.MotionRange motionRange;
        if (i3 == -1) {
            return;
        }
        int iB = b(motionEvent.getToolType(i2));
        int i5 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        byteBuffer.putLong(motionEvent.getEventTime() * 1000);
        byteBuffer.putLong(i3);
        byteBuffer.putLong(iB);
        byteBuffer.putLong(i5);
        byteBuffer.putLong(motionEvent.getPointerId(i2));
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getX(i2));
        byteBuffer.putDouble(motionEvent.getY(i2));
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        if (iB == 1) {
            buttonState = motionEvent.getButtonState() & 31;
            if (buttonState == 0 && motionEvent.getSource() == 8194 && (i3 == 4 || i3 == 5)) {
                buttonState = 1;
            }
        } else {
            buttonState = iB == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        byteBuffer.putLong(buttonState);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i2));
        double max = 1.0d;
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            min = 0.0d;
        } else {
            min = motionRange.getMin();
            max = motionRange.getMax();
        }
        byteBuffer.putDouble(min);
        byteBuffer.putDouble(max);
        if (iB == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i2));
            d2 = 0.0d;
            byteBuffer.putDouble(0.0d);
        } else {
            d2 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i2));
        byteBuffer.putDouble(motionEvent.getToolMajor(i2));
        byteBuffer.putDouble(motionEvent.getToolMinor(i2));
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i2));
        if (iB == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i2));
        } else {
            byteBuffer.putDouble(d2);
        }
        byteBuffer.putLong(i4);
        if (i5 == 1) {
            byteBuffer.putDouble(-motionEvent.getAxisValue(10));
            byteBuffer.putDouble(-motionEvent.getAxisValue(9));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
    }
}
