package c.a.b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.os.Build;
import android.util.Log;
import f.a.a.a.m;
import f.a.a.a.o;
import f.a.a.a.q;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements o.c {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f1288a;

    public static void a(q.d dVar) {
        new o(dVar.f(), "flutter_native_image").a(new a(dVar.d()));
    }

    private a(Activity activity) {
        this.f1288a = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r13v0, types: [f.a.a.a.o$d] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.graphics.Bitmap$CompressFormat] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    @Override // f.a.a.a.o.c
    public void a(m mVar, o.d dVar) throws Throwable {
        ?? CreateBitmap;
        String path;
        int attributeInt;
        OutputStream outputStream = null;
        if (mVar.f5663a.equals("compressImage")) {
            String str = (String) mVar.a("file");
            int iIntValue = ((Integer) mVar.a("percentage")).intValue();
            int iIntValue2 = mVar.a("targetWidth") == null ? 0 : ((Integer) mVar.a("targetWidth")).intValue();
            int iIntValue3 = mVar.a("targetHeight") == null ? 0 : ((Integer) mVar.a("targetHeight")).intValue();
            int iIntValue4 = ((Integer) mVar.a("quality")).intValue();
            File file = new File(str);
            if (!file.exists()) {
                dVar.a("file does not exist", str, null);
                return;
            }
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (iIntValue2 == 0) {
                iIntValue2 = (bitmapDecodeFile.getWidth() / 100) * iIntValue;
            }
            if (iIntValue3 == 0) {
                iIntValue3 = (bitmapDecodeFile.getHeight() / 100) * iIntValue;
            }
            Bitmap.createScaledBitmap(bitmapDecodeFile, iIntValue2, iIntValue3, true).copy(Bitmap.Config.RGB_565, false).compress(Bitmap.CompressFormat.JPEG, iIntValue4, byteArrayOutputStream);
            try {
                String path2 = File.createTempFile(a(file).concat("_compressed"), ".jpg", this.f1288a.getExternalCacheDir()).getPath();
                byteArrayOutputStream.writeTo(new FileOutputStream(path2));
                a(str, path2);
                dVar.a(path2);
                return;
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
                dVar.a("file does not exist", str, null);
                return;
            } catch (IOException e3) {
                e3.printStackTrace();
                dVar.a("something went wrong", str, null);
                return;
            }
        }
        if (mVar.f5663a.equals("getImageProperties")) {
            String str2 = (String) mVar.a("file");
            if (!new File(str2).exists()) {
                dVar.a("file does not exist", str2, null);
                return;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str2, options);
            HashMap map = new HashMap();
            map.put("width", Integer.valueOf(options.outWidth));
            map.put("height", Integer.valueOf(options.outHeight));
            try {
                attributeInt = new ExifInterface(str2).getAttributeInt("Orientation", 0);
            } catch (IOException unused) {
                attributeInt = 0;
            }
            map.put("orientation", Integer.valueOf(attributeInt));
            dVar.a(map);
            return;
        }
        if (!mVar.f5663a.equals("cropImage")) {
            if (!mVar.f5663a.equals("getPlatformVersion")) {
                dVar.a();
                return;
            }
            dVar.a("Android " + Build.VERSION.RELEASE);
            return;
        }
        String str3 = (String) mVar.a("file");
        int iIntValue5 = ((Integer) mVar.a("originX")).intValue();
        int iIntValue6 = ((Integer) mVar.a("originY")).intValue();
        int iIntValue7 = ((Integer) mVar.a("width")).intValue();
        int iIntValue8 = ((Integer) mVar.a("height")).intValue();
        File file2 = new File(str3);
        if (!file2.exists()) {
            dVar.a("file does not exist", str3, null);
            return;
        }
        Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(str3);
        ?? byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            CreateBitmap = Bitmap.createBitmap(bitmapDecodeFile2, iIntValue5, iIntValue6, iIntValue7, iIntValue8);
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
            dVar.a("bounds are outside of the dimensions of the source image", str3, null);
            CreateBitmap = bitmapDecodeFile2;
        }
        ?? fileOutputStream = Bitmap.CompressFormat.JPEG;
        CreateBitmap.compress(fileOutputStream, 100, byteArrayOutputStream2);
        CreateBitmap.recycle();
        try {
            try {
                try {
                    path = File.createTempFile(a(file2).concat("_cropped"), ".jpg", this.f1288a.getExternalCacheDir()).getPath();
                    fileOutputStream = new FileOutputStream(path);
                } catch (FileNotFoundException e5) {
                    e = e5;
                    fileOutputStream = 0;
                } catch (IOException e6) {
                    e = e6;
                    fileOutputStream = 0;
                } catch (Throwable th) {
                    th = th;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    throw th;
                }
                try {
                    byteArrayOutputStream2.writeTo(fileOutputStream);
                    a(str3, path);
                    dVar.a(path);
                    fileOutputStream.close();
                    fileOutputStream = fileOutputStream;
                } catch (FileNotFoundException e8) {
                    e = e8;
                    e.printStackTrace();
                    dVar.a("file does not exist", str3, null);
                    if (fileOutputStream != 0) {
                        fileOutputStream.close();
                        fileOutputStream = fileOutputStream;
                    }
                } catch (IOException e9) {
                    e = e9;
                    e.printStackTrace();
                    dVar.a("something went wrong", str3, null);
                    if (fileOutputStream != 0) {
                        fileOutputStream.close();
                        fileOutputStream = fileOutputStream;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = fileOutputStream;
        }
    }

    private void a(String str, String str2) throws IOException {
        try {
            ExifInterface exifInterface = new ExifInterface(str);
            ExifInterface exifInterface2 = new ExifInterface(str2);
            Iterator it = Arrays.asList("FNumber", "ExposureTime", "ISOSpeedRatings", "GPSAltitude", "GPSAltitudeRef", "FocalLength", "GPSDateStamp", "WhiteBalance", "GPSProcessingMethod", "GPSTimeStamp", "DateTime", "Flash", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "Make", "Model", "Orientation").iterator();
            while (it.hasNext()) {
                try {
                    a(exifInterface, exifInterface2, (String) it.next());
                } catch (Exception e2) {
                    e = e2;
                    Log.e("FlutterNativeImagePlugin", "Error preserving Exif data on selected image: " + e);
                    return;
                }
            }
            exifInterface2.saveAttributes();
        } catch (Exception e3) {
            e = e3;
        }
    }

    private void a(ExifInterface exifInterface, ExifInterface exifInterface2, String str) {
        if (exifInterface.getAttribute(str) != null) {
            exifInterface2.setAttribute(str, exifInterface.getAttribute(str));
        }
    }

    private static String a(File file) {
        String name = file.getName();
        return name.indexOf(".") > 0 ? name.substring(0, name.lastIndexOf(".")) : name;
    }
}
