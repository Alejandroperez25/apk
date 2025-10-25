package c.d.a.a.l;

import android.net.Uri;
import android.text.TextUtils;
import c.d.a.a.l.y;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class t extends AbstractC0164g implements y {

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f3461e = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicReference<byte[]> f3462f = new AtomicReference<>();

    /* renamed from: g, reason: collision with root package name */
    private final boolean f3463g;

    /* renamed from: h, reason: collision with root package name */
    private final int f3464h;

    /* renamed from: i, reason: collision with root package name */
    private final int f3465i;
    private final String j;
    private final c.d.a.a.m.w<String> k;
    private final y.f l;
    private final y.f m;
    private n n;
    private HttpURLConnection o;
    private InputStream p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;

    public t(String str, c.d.a.a.m.w<String> wVar, int i2, int i3, boolean z, y.f fVar) {
        super(true);
        AbstractC0170e.a(str);
        this.j = str;
        this.k = wVar;
        this.m = new y.f();
        this.f3464h = i2;
        this.f3465i = i3;
        this.f3463g = z;
        this.l = fVar;
    }

    @Override // c.d.a.a.l.k
    public Uri b() {
        if (this.o == null) {
            return null;
        }
        return Uri.parse(this.o.getURL().toString());
    }

    @Override // c.d.a.a.l.AbstractC0164g, c.d.a.a.l.k
    public Map<String, List<String>> a() {
        return this.o == null ? Collections.emptyMap() : this.o.getHeaderFields();
    }

    @Override // c.d.a.a.l.k
    public long a(n nVar) throws IOException, NumberFormatException {
        this.n = nVar;
        long j = 0;
        this.u = 0L;
        this.t = 0L;
        b(nVar);
        try {
            this.o = d(nVar);
            try {
                int responseCode = this.o.getResponseCode();
                String responseMessage = this.o.getResponseMessage();
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = this.o.getHeaderFields();
                    f();
                    y.e eVar = new y.e(responseCode, responseMessage, headerFields, nVar);
                    if (responseCode == 416) {
                        eVar.initCause(new l(0));
                        throw eVar;
                    }
                    throw eVar;
                }
                String contentType = this.o.getContentType();
                if (this.k != null && !this.k.a(contentType)) {
                    f();
                    throw new y.d(contentType, nVar);
                }
                if (responseCode == 200 && nVar.f3422f != 0) {
                    j = nVar.f3422f;
                }
                this.r = j;
                if (nVar.b(1)) {
                    this.s = nVar.f3423g;
                } else {
                    if (nVar.f3423g != -1) {
                        this.s = nVar.f3423g;
                    } else {
                        long jA = a(this.o);
                        this.s = jA != -1 ? jA - this.r : -1L;
                    }
                }
                try {
                    this.p = this.o.getInputStream();
                    this.q = true;
                    c(nVar);
                    return this.s;
                } catch (IOException e2) {
                    f();
                    throw new y.c(e2, nVar, 1);
                }
            } catch (IOException e3) {
                f();
                throw new y.c("Unable to connect to " + nVar.f3417a.toString(), e3, nVar, 1);
            }
        } catch (IOException e4) {
            throw new y.c("Unable to connect to " + nVar.f3417a.toString(), e4, nVar, 1);
        }
    }

    @Override // c.d.a.a.l.k
    public int read(byte[] bArr, int i2, int i3) throws y.c {
        try {
            e();
            return a(bArr, i2, i3);
        } catch (IOException e2) {
            throw new y.c(e2, this.n, 2);
        }
    }

    @Override // c.d.a.a.l.k
    public void close() {
        try {
            if (this.p != null) {
                a(this.o, d());
                try {
                    this.p.close();
                } catch (IOException e2) {
                    throw new y.c(e2, this.n, 3);
                }
            }
        } finally {
            this.p = null;
            f();
            if (this.q) {
                this.q = false;
                c();
            }
        }
    }

    protected final long d() {
        return this.s == -1 ? this.s : this.s - this.u;
    }

    private HttpURLConnection d(n nVar) throws IOException {
        HttpURLConnection httpURLConnectionA;
        URL url = new URL(nVar.f3417a.toString());
        int i2 = nVar.f3418b;
        byte[] bArr = nVar.f3419c;
        long j = nVar.f3422f;
        long j2 = nVar.f3423g;
        boolean zB = nVar.b(1);
        if (!this.f3463g) {
            return a(url, i2, bArr, j, j2, zB, true);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                long j3 = j2;
                httpURLConnectionA = a(url, i2, bArr, j, j2, zB, false);
                int responseCode = httpURLConnectionA.getResponseCode();
                String headerField = httpURLConnectionA.getHeaderField("Location");
                if ((i2 == 1 || i2 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    httpURLConnectionA.disconnect();
                    url = a(url, headerField);
                } else {
                    if (i2 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    httpURLConnectionA.disconnect();
                    url = a(url, headerField);
                    bArr = null;
                    i2 = 1;
                }
                i3 = i4;
                j2 = j3;
            } else {
                throw new NoRouteToHostException("Too many redirects: " + i4);
            }
        }
        return httpURLConnectionA;
    }

    private HttpURLConnection a(URL url, int i2, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f3464h);
        httpURLConnection.setReadTimeout(this.f3465i);
        if (this.l != null) {
            for (Map.Entry<String, String> entry : this.l.a().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.m.a().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.j);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(n.a(i2));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    private static URL a(URL url, String str) throws ProtocolException {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        String protocol = url2.getProtocol();
        if ("https".equals(protocol) || "http".equals(protocol)) {
            return url2;
        }
        throw new ProtocolException("Unsupported protocol redirect: " + protocol);
    }

    private static long a(HttpURLConnection httpURLConnection) throws NumberFormatException {
        long j;
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                c.d.a.a.m.o.d("DefaultHttpDataSource", "Unexpected Content-Length [" + headerField + "]");
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j;
        }
        Matcher matcher = f3461e.matcher(headerField2);
        if (!matcher.find()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            c.d.a.a.m.o.c("DefaultHttpDataSource", "Inconsistent headers [" + headerField + "] [" + headerField2 + "]");
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            c.d.a.a.m.o.d("DefaultHttpDataSource", "Unexpected Content-Range [" + headerField2 + "]");
            return j;
        }
    }

    private void e() throws IOException {
        if (this.t == this.r) {
            return;
        }
        byte[] andSet = f3462f.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (this.t != this.r) {
            int i2 = this.p.read(andSet, 0, (int) Math.min(this.r - this.t, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i2 == -1) {
                throw new EOFException();
            }
            this.t += i2;
            a(i2);
        }
        f3462f.set(andSet);
    }

    private int a(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.s != -1) {
            long j = this.s - this.u;
            if (j == 0) {
                return -1;
            }
            i3 = (int) Math.min(i3, j);
        }
        int i4 = this.p.read(bArr, i2, i3);
        if (i4 == -1) {
            if (this.s == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.u += i4;
        a(i4);
        return i4;
    }

    private static void a(HttpURLConnection httpURLConnection, long j) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (H.f3499a == 19 || H.f3499a == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    private void f() {
        if (this.o != null) {
            try {
                this.o.disconnect();
            } catch (Exception e2) {
                c.d.a.a.m.o.b("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.o = null;
        }
    }
}
