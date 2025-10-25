package c.c.a.a.a;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    private String f1328a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1329b;

    /* renamed from: c, reason: collision with root package name */
    private int f1330c;

    public j() {
        this.f1330c = -1;
    }

    public j(String str, boolean z) {
        this.f1330c = -1;
        this.f1328a = str;
        this.f1329b = z;
    }

    public j(String str) {
        this(str, false);
    }

    public String b() {
        return this.f1328a;
    }

    public boolean c() {
        return this.f1329b;
    }

    @Override // c.c.a.a.a.c
    public void writeTo(OutputStream outputStream) throws IOException {
        byte[] bytes = this.f1328a.getBytes("ASCII");
        if (!this.f1329b) {
            outputStream.write(k.STRING.a());
        }
        c.c.a.a.d.c(outputStream, bytes.length);
        outputStream.write(bytes);
    }

    @Override // c.c.a.a.a.c
    public void a(InputStream inputStream) throws IOException {
        int iC = c.c.a.a.d.c(inputStream);
        this.f1330c = iC + 3;
        byte[] bArr = new byte[iC];
        c.c.a.a.d.a(inputStream, bArr);
        this.f1328a = new String(bArr, "ASCII");
    }

    public static String a(InputStream inputStream, boolean z) throws IOException {
        if (!z) {
            inputStream.read();
        }
        byte[] bArr = new byte[c.c.a.a.d.c(inputStream)];
        c.c.a.a.d.a(inputStream, bArr);
        return new String(bArr, "ASCII");
    }

    public static void a(OutputStream outputStream, String str, boolean z) throws IOException {
        byte[] bytes = str.getBytes("ASCII");
        if (!z) {
            outputStream.write(k.STRING.a());
        }
        c.c.a.a.d.c(outputStream, bytes.length);
        outputStream.write(bytes);
    }

    @Override // c.c.a.a.a.c
    public int a() {
        if (this.f1330c == -1) {
            try {
                this.f1330c = (!c() ? 1 : 0) + 2 + this.f1328a.getBytes("ASCII").length;
            } catch (UnsupportedEncodingException e2) {
                Log.e("AmfString", "AmfString.getSize(): caught exception", e2);
                throw new RuntimeException(e2);
            }
        }
        return this.f1330c;
    }

    public static int a(String str, boolean z) {
        try {
            return (!z ? 1 : 0) + 2 + str.getBytes("ASCII").length;
        } catch (UnsupportedEncodingException e2) {
            Log.e("AmfString", "AmfString.SizeOf(): caught exception", e2);
            throw new RuntimeException(e2);
        }
    }
}
