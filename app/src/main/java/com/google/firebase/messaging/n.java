package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class n implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f5626a;

    /* renamed from: b, reason: collision with root package name */
    private c.d.a.b.h.h<Bitmap> f5627b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InputStream f5628c;

    public static n a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new n(new URL(str));
        } catch (MalformedURLException unused) {
            String strValueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", strValueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(strValueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    private n(URL url) {
        this.f5626a = url;
    }

    public final void a(Executor executor) {
        this.f5627b = c.d.a.b.h.k.a(executor, new Callable(this) { // from class: com.google.firebase.messaging.m

            /* renamed from: a, reason: collision with root package name */
            private final n f5625a;

            {
                this.f5625a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5625a.b();
            }
        });
    }

    public final c.d.a.b.h.h<Bitmap> a() {
        c.d.a.b.h.h<Bitmap> hVar = this.f5627b;
        t.a(hVar);
        return hVar;
    }

    public final Bitmap b() throws IOException {
        String strValueOf = String.valueOf(this.f5626a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(strValueOf);
        Log.i("FirebaseMessaging", sb.toString());
        byte[] bArrC = c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrC, 0, bArrC.length);
        if (bitmapDecodeByteArray == null) {
            String strValueOf2 = String.valueOf(this.f5626a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 24);
            sb2.append("Failed to decode image: ");
            sb2.append(strValueOf2);
            throw new IOException(sb2.toString());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf3 = String.valueOf(this.f5626a);
            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 31);
            sb3.append("Successfully downloaded image: ");
            sb3.append(strValueOf3);
            Log.d("FirebaseMessaging", sb3.toString());
        }
        return bitmapDecodeByteArray;
    }

    private final byte[] c() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f5626a.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        Throwable th = null;
        try {
            this.f5628c = inputStream;
            byte[] bArrA = c.d.a.b.e.d.i.a(c.d.a.b.e.d.i.a(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = bArrA.length;
                String strValueOf = String.valueOf(this.f5626a);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 34);
                sb.append("Downloaded ");
                sb.append(length);
                sb.append(" bytes from ");
                sb.append(strValueOf);
                Log.v("FirebaseMessaging", sb.toString());
            }
            if (bArrA.length <= 1048576) {
                return bArrA;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th2) {
            if (inputStream != null) {
                if (th != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        c.d.a.b.e.d.l.a(th, th3);
                    }
                } else {
                    inputStream.close();
                }
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        c.d.a.b.e.d.j.a(this.f5628c);
    }
}
