package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* loaded from: classes.dex */
final class V {
    V() {
    }

    final X a(Context context, String str) throws Throwable {
        X xC = c(context, str);
        return xC != null ? xC : b(context, str);
    }

    final X b(Context context, String str) throws Throwable {
        X x = new X(C0455k.a(C.a().getPublic()), System.currentTimeMillis());
        X xA = a(context, str, x, true);
        if (xA != null && !xA.equals(x)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
            }
            return xA;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Generated new key");
        }
        a(context, str, x);
        return x;
    }

    static void a(Context context) {
        for (File file : b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private final X c(Context context, String str) throws Throwable {
        X xD;
        try {
            xD = d(context, str);
        } catch (Y e2) {
            e = e2;
        }
        if (xD != null) {
            a(context, str, xD);
            return xD;
        }
        e = null;
        try {
            X xA = a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (xA != null) {
                a(context, str, xA, false);
                return xA;
            }
        } catch (Y e3) {
            e = e3;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    private static PublicKey a(String str) throws Y {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new Y(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw new Y(e3);
        }
    }

    private final X d(Context context, String str) throws Y {
        File fileE = e(context, str);
        if (!fileE.exists()) {
            return null;
        }
        try {
            return a(fileE);
        } catch (Y | IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 39);
                sb.append("Failed to read ID from file, retrying: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            try {
                return a(fileE);
            } catch (IOException e3) {
                String strValueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(strValueOf2);
                Log.w("FirebaseInstanceId", sb2.toString());
                throw new Y(e3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[Catch: all -> 0x00ac, Throwable -> 0x00af, TRY_ENTER, TryCatch #8 {all -> 0x00ac, Throwable -> 0x00af, blocks: (B:7:0x003a, B:15:0x0056, B:24:0x0096, B:34:0x00a8, B:35:0x00ab), top: B:54:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[Catch: all -> 0x00ac, Throwable -> 0x00af, SYNTHETIC, TRY_LEAVE, TryCatch #8 {all -> 0x00ac, Throwable -> 0x00af, blocks: (B:7:0x003a, B:15:0x0056, B:24:0x0096, B:34:0x00a8, B:35:0x00ab), top: B:54:0x003a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.firebase.iid.X a(android.content.Context r9, java.lang.String r10, com.google.firebase.iid.X r11, boolean r12) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L10
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "Writing ID to properties file"
            android.util.Log.d(r0, r2)
        L10:
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r2 = "id"
            java.lang.String r3 = r11.a()
            r0.setProperty(r2, r3)
            java.lang.String r2 = "cre"
            long r3 = com.google.firebase.iid.X.a(r11)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.setProperty(r2, r3)
            java.io.File r9 = e(r9, r10)
            r10 = 0
            r9.createNewFile()     // Catch: java.io.IOException -> Lb9
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> Lb9
            java.lang.String r3 = "rw"
            r2.<init>(r9, r3)     // Catch: java.io.IOException -> Lb9
            java.nio.channels.FileChannel r9 = r2.getChannel()     // Catch: java.lang.Throwable -> Lac java.lang.Throwable -> Laf
            r9.lock()     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            r3 = 0
            if (r12 == 0) goto L8a
            long r5 = r9.size()     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 <= 0) goto L8a
            r9.position(r3)     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L9d java.lang.Throwable -> La0
            com.google.firebase.iid.X r12 = a(r9)     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L9d java.lang.Throwable -> La0
            if (r9 == 0) goto L59
            a(r10, r9)     // Catch: java.lang.Throwable -> Lac java.lang.Throwable -> Laf
        L59:
            a(r10, r2)     // Catch: java.io.IOException -> Lb9
            return r12
        L5d:
            r12 = move-exception
            java.lang.String r5 = "FirebaseInstanceId"
            boolean r1 = android.util.Log.isLoggable(r5, r1)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            if (r1 == 0) goto L8a
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            java.lang.String r5 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            int r5 = r5 + 58
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            java.lang.String r5 = "Tried reading ID before writing new one, but failed with: "
            r6.append(r5)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            r6.append(r12)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            java.lang.String r12 = r6.toString()     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            android.util.Log.d(r1, r12)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
        L8a:
            r9.truncate(r3)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            java.io.OutputStream r12 = java.nio.channels.Channels.newOutputStream(r9)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            r0.store(r12, r10)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            if (r9 == 0) goto L99
            a(r10, r9)     // Catch: java.lang.Throwable -> Lac java.lang.Throwable -> Laf
        L99:
            a(r10, r2)     // Catch: java.io.IOException -> Lb9
            return r11
        L9d:
            r11 = move-exception
            r12 = r10
            goto La6
        La0:
            r11 = move-exception
            throw r11     // Catch: java.lang.Throwable -> La2
        La2:
            r12 = move-exception
            r7 = r12
            r12 = r11
            r11 = r7
        La6:
            if (r9 == 0) goto Lab
            a(r12, r9)     // Catch: java.lang.Throwable -> Lac java.lang.Throwable -> Laf
        Lab:
            throw r11     // Catch: java.lang.Throwable -> Lac java.lang.Throwable -> Laf
        Lac:
            r9 = move-exception
            r11 = r10
            goto Lb5
        Laf:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r11 = move-exception
            r7 = r11
            r11 = r9
            r9 = r7
        Lb5:
            a(r11, r2)     // Catch: java.io.IOException -> Lb9
            throw r9     // Catch: java.io.IOException -> Lb9
        Lb9:
            r9 = move-exception
            java.lang.String r11 = "FirebaseInstanceId"
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r12 = java.lang.String.valueOf(r9)
            int r12 = r12.length()
            int r12 = r12 + 21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "Failed to write key: "
            r0.append(r12)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            android.util.Log.w(r11, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.V.a(android.content.Context, java.lang.String, com.google.firebase.iid.X, boolean):com.google.firebase.iid.X");
    }

    private static File b(Context context) {
        File fileB = androidx.core.content.a.b(context);
        if (fileB != null && fileB.isDirectory()) {
            return fileB;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    private static File e(Context context, String str) {
        String string;
        if (TextUtils.isEmpty(str)) {
            string = "com.google.InstanceId.properties";
        } else {
            try {
                String strEncodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(strEncodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(strEncodeToString);
                sb.append(".properties");
                string = sb.toString();
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
        return new File(b(context), string);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: all -> 0x0032, Throwable -> 0x0034, TRY_ENTER, TryCatch #3 {, blocks: (B:3:0x0006, B:7:0x001c, B:17:0x002e, B:18:0x0031), top: B:25:0x0006, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[Catch: all -> 0x0032, Throwable -> 0x0034, SYNTHETIC, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0006, B:7:0x001c, B:17:0x002e, B:18:0x0031), top: B:25:0x0006, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.firebase.iid.X a(java.io.File r10) throws java.io.IOException {
        /*
            r9 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            r10 = 0
            java.nio.channels.FileChannel r7 = r0.getChannel()     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L34
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1 = r7
            r1.lock(r2, r4, r6)     // Catch: java.lang.Throwable -> L23 java.lang.Throwable -> L26
            com.google.firebase.iid.X r1 = a(r7)     // Catch: java.lang.Throwable -> L23 java.lang.Throwable -> L26
            if (r7 == 0) goto L1f
            a(r10, r7)     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L34
        L1f:
            a(r10, r0)
            return r1
        L23:
            r1 = move-exception
            r2 = r10
            goto L2c
        L26:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L28
        L28:
            r2 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
        L2c:
            if (r7 == 0) goto L31
            a(r2, r7)     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L34
        L31:
            throw r1     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L34
        L32:
            r1 = move-exception
            goto L36
        L34:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> L32
        L36:
            a(r10, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.V.a(java.io.File):com.google.firebase.iid.X");
    }

    private static X a(FileChannel fileChannel) throws IOException, NumberFormatException, Y {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        try {
            long j = Long.parseLong(properties.getProperty("cre"));
            String property = properties.getProperty("id");
            if (property == null) {
                String property2 = properties.getProperty("pub");
                if (property2 == null) {
                    throw new Y("Invalid properties file");
                }
                property = C0455k.a(a(property2));
            }
            return new X(property, j);
        } catch (NumberFormatException e2) {
            throw new Y(e2);
        }
    }

    private static X a(SharedPreferences sharedPreferences, String str) {
        long jB = b(sharedPreferences, str);
        String string = sharedPreferences.getString(C0466v.a(str, "id"), null);
        if (string == null) {
            String string2 = sharedPreferences.getString(C0466v.a(str, "|P|"), null);
            if (string2 == null) {
                return null;
            }
            string = C0455k.a(a(string2));
        }
        return new X(string, jB);
    }

    private final void a(Context context, String str, X x) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (x.equals(a(sharedPreferences, str))) {
                return;
            }
        } catch (Y unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(C0466v.a(str, "id"), x.a());
        editorEdit.putString(C0466v.a(str, "cre"), String.valueOf(x.f5515b));
        editorEdit.commit();
    }

    private static long b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C0466v.a(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    private static /* synthetic */ void a(Throwable th, FileChannel fileChannel) {
        if (th == null) {
            fileChannel.close();
            return;
        }
        try {
            fileChannel.close();
        } catch (Throwable th2) {
            c.d.a.b.e.d.l.a(th, th2);
        }
    }

    private static /* synthetic */ void a(Throwable th, RandomAccessFile randomAccessFile) throws IOException {
        if (th == null) {
            randomAccessFile.close();
            return;
        }
        try {
            randomAccessFile.close();
        } catch (Throwable th2) {
            c.d.a.b.e.d.l.a(th, th2);
        }
    }

    private static /* synthetic */ void a(Throwable th, FileInputStream fileInputStream) throws IOException {
        if (th == null) {
            fileInputStream.close();
            return;
        }
        try {
            fileInputStream.close();
        } catch (Throwable th2) {
            c.d.a.b.e.d.l.a(th, th2);
        }
    }
}
