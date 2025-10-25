package c.h.a.c.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class a {
    public static int a(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        a("glCreateShader type=" + i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Log.e("GlUtil", "Could not compile shader " + i2 + ":");
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        Log.e("GlUtil", sb.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static int a(String str, String str2) {
        int iA;
        int iA2 = a(35633, str);
        if (iA2 == 0 || (iA = a(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            Log.e("GlUtil", "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iA2);
        a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iA);
        a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        Log.e("GlUtil", "Could not link program: ");
        Log.e("GlUtil", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public static void a(int i2, int[] iArr, int i3) {
        GLES20.glGenTextures(i2, iArr, i3);
        for (int i4 = 0; i4 < i2; i4++) {
            GLES20.glActiveTexture(33984 + i3 + i4);
            GLES20.glBindTexture(36197, iArr[i3 + i4]);
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
        }
    }

    public static String a(Context context, int i2) throws Resources.NotFoundException, IOException {
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i3 = inputStreamOpenRawResource.read(); i3 != -1; i3 = inputStreamOpenRawResource.read()) {
                byteArrayOutputStream.write(i3);
            }
            String string = byteArrayOutputStream.toString();
            inputStreamOpenRawResource.close();
            return string;
        } catch (IOException unused) {
            return "";
        }
    }

    public static void a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        Log.e("GlUtil", str + ": glError " + iGlGetError);
        throw new RuntimeException(str + ": glError " + iGlGetError);
    }

    public static void b(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public static Bitmap a(int i2, int i3, int i4, int i5) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2 * i3 * 4);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, byteBufferAllocateDirect);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
        return a(Bitmap.createScaledBitmap(bitmapCreateBitmap, i4, i5, false), i4, i5);
    }

    private static Bitmap a(Bitmap bitmap, int i2, int i3) {
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f, i2 / 2.0f, i3 / 2.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
    }
}
