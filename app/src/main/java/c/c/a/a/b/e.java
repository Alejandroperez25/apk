package c.c.a.a.b;

import android.util.Log;
import c.c.a.a.a.i;
import c.c.a.a.c.j;
import c.c.a.a.c.l;
import c.c.a.a.c.m;
import c.c.a.a.c.o;
import c.c.a.a.c.p;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class e implements c.c.a.a.c {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f1350a = Pattern.compile("^rtmps?://([^/:]+)(?::(\\d+))*/([^/]+)/?([^*]*)$");
    private String G;
    private h.a.a.a H;

    /* renamed from: b, reason: collision with root package name */
    private int f1351b;

    /* renamed from: c, reason: collision with root package name */
    private String f1352c;

    /* renamed from: d, reason: collision with root package name */
    private String f1353d;

    /* renamed from: e, reason: collision with root package name */
    private String f1354e;

    /* renamed from: f, reason: collision with root package name */
    private String f1355f;

    /* renamed from: g, reason: collision with root package name */
    private String f1356g;

    /* renamed from: h, reason: collision with root package name */
    private String f1357h;

    /* renamed from: i, reason: collision with root package name */
    private String f1358i;
    private Socket j;
    private h l;
    private g m;
    private BufferedInputStream n;
    private BufferedOutputStream o;
    private Thread p;
    private int w;
    private int x;
    private h.a.a.b y;
    private boolean z;
    private String k = "";
    private volatile boolean q = false;
    private volatile boolean r = false;
    private final Object s = new Object();
    private final Object t = new Object();
    private int u = 0;
    private int v = 0;
    private String A = null;
    private String B = null;
    private String C = null;
    private String D = null;
    private String E = null;
    private boolean F = false;

    public e(h.a.a.b bVar) {
        this.y = bVar;
        this.H = new h.a.a.a(bVar);
    }

    private void a(InputStream inputStream, OutputStream outputStream) throws IOException, InvalidKeyException {
        c.c.a.a.c.g gVar = new c.c.a.a.c.g();
        gVar.a(outputStream);
        gVar.b(outputStream);
        outputStream.flush();
        gVar.a(inputStream);
        gVar.b(inputStream);
        gVar.c(outputStream);
        outputStream.flush();
        gVar.c(inputStream);
    }

    public boolean a(String str) throws IOException, InvalidKeyException {
        Matcher matcher = f1350a.matcher(str);
        if (matcher.matches()) {
            this.z = matcher.group(0).startsWith("rtmps");
            this.f1356g = "";
            this.f1358i = "";
            this.f1352c = matcher.group(1);
            String strGroup = matcher.group(2);
            this.f1351b = strGroup != null ? Integer.parseInt(strGroup) : 1935;
            this.f1353d = matcher.group(3);
            this.f1354e = matcher.group(4);
            this.f1357h = matcher.group(0).substring(0, matcher.group(0).length() - this.f1354e.length());
            Log.d("RtmpConnection", "connect() called. Host: " + this.f1352c + ", port: " + this.f1351b + ", appName: " + this.f1353d + ", publishPath: " + this.f1354e);
            this.l = new h();
            this.m = new g(this.l);
            try {
                if (!this.z) {
                    this.j = new Socket();
                    this.j.connect(new InetSocketAddress(this.f1352c, this.f1351b), 5000);
                } else {
                    this.j = h.a.a.c.a(this.f1352c, this.f1351b);
                    if (this.j == null) {
                        throw new IOException("Socket creation failed");
                    }
                }
                this.n = new BufferedInputStream(this.j.getInputStream());
                this.o = new BufferedOutputStream(this.j.getOutputStream());
                Log.d("RtmpConnection", "connect(): socket connection established, doing handhake...");
                a(this.n, this.o);
                Log.d("RtmpConnection", "connect(): handshake done");
                this.p = new Thread(new b(this));
                this.p.start();
                return b();
            } catch (IOException e2) {
                Log.e("RtmpConnection", "Error", e2);
                this.y.c("Connect error, " + e2.getMessage());
                return false;
            }
        }
        this.y.c("Endpoint malformed, should be: rtmp://ip:port/appname/streamname");
        return false;
    }

    private boolean b() throws IOException {
        if (this.q) {
            this.y.c("Already connected");
            return false;
        }
        if (this.A != null && this.B != null) {
            c(this.A);
        } else {
            a.a();
            Log.d("RtmpConnection", "rtmpConnect(): Building 'connect' invoke packet");
            a aVarA = this.l.a(3);
            int i2 = this.v + 1;
            this.v = i2;
            c.c.a.a.c.d dVar = new c.c.a.a.c.d("connect", i2, aVarA);
            dVar.a().c(0);
            i iVar = new i();
            iVar.a("app", this.f1353d);
            iVar.a("flashVer", "FMLE/3.0 (compatible; Lavf57.56.101)");
            iVar.a("swfUrl", this.f1356g);
            iVar.a("tcUrl", this.f1357h);
            iVar.a("fpad", false);
            iVar.a("capabilities", 239);
            iVar.a("audioCodecs", 3575);
            iVar.a("videoCodecs", 252);
            iVar.a("videoFunction", 1);
            iVar.a("pageUrl", this.f1358i);
            iVar.a("objectEncoding", 0);
            dVar.a(iVar);
            a((j) dVar);
        }
        synchronized (this.s) {
            try {
                this.s.wait(5000L);
            } catch (InterruptedException unused) {
            }
        }
        if (!this.q) {
            a(true);
            this.y.c("Fail to connect, time out");
        }
        return this.q;
    }

    private void c(String str) throws IOException {
        a.a();
        Log.d("RtmpConnection", "rtmpConnect(): Building 'connect' invoke packet");
        a aVarA = this.l.a(5);
        int i2 = this.v + 1;
        this.v = i2;
        c.c.a.a.c.d dVar = new c.c.a.a.c.d("connect", i2, aVarA);
        dVar.a().c(0);
        i iVar = new i();
        iVar.a("app", this.f1353d + "?authmod=adobe&user=" + str);
        iVar.a("flashVer", "FMLE/3.0 (compatible; Lavf57.56.101)");
        iVar.a("swfUrl", this.f1356g);
        iVar.a("tcUrl", this.f1357h + "?authmod=adobe&user=" + str);
        iVar.a("fpad", false);
        iVar.a("capabilities", 239);
        iVar.a("audioCodecs", 3575);
        iVar.a("videoCodecs", 252);
        iVar.a("videoFunction", 1);
        iVar.a("pageUrl", this.f1358i);
        iVar.a("objectEncoding", 0);
        dVar.a(iVar);
        a((j) dVar);
    }

    private void a(String str, String str2, String str3, String str4, String str5) throws NoSuchAlgorithmException, IOException {
        String str6 = String.format("%08x", Integer.valueOf(new Random().nextInt()));
        String strD = c.c.a.a.d.d(str + str3 + str2);
        if (!str5.isEmpty()) {
            strD = strD + str5;
        } else if (!str4.isEmpty()) {
            strD = strD + str4;
        }
        String str7 = "?authmod=adobe&user=" + str + "&challenge=" + str6 + "&response=" + c.c.a.a.d.d(strD + str6);
        if (!str5.isEmpty()) {
            str7 = str7 + "&opaque=" + str5;
        }
        a.a();
        Log.d("RtmpConnection", "rtmpConnect(): Building 'connect' invoke packet");
        a aVarA = this.l.a(5);
        int i2 = this.v + 1;
        this.v = i2;
        c.c.a.a.c.d dVar = new c.c.a.a.c.d("connect", i2, aVarA);
        dVar.a().c(0);
        i iVar = new i();
        iVar.a("app", this.f1353d + str7);
        iVar.a("flashVer", "FMLE/3.0 (compatible; Lavf57.56.101)");
        iVar.a("swfUrl", this.f1356g);
        iVar.a("tcUrl", this.f1357h + str7);
        iVar.a("fpad", false);
        iVar.a("capabilities", 239);
        iVar.a("audioCodecs", 3575);
        iVar.a("videoCodecs", 252);
        iVar.a("videoFunction", 1);
        iVar.a("pageUrl", this.f1358i);
        iVar.a("objectEncoding", 0);
        dVar.a(iVar);
        a((j) dVar);
    }

    public boolean b(String str) {
        if (str == null) {
            this.y.c("Null publish type");
            return false;
        }
        this.f1355f = str;
        return c();
    }

    private boolean c() throws IOException {
        if (!this.q || this.u != 0) {
            this.y.c("Create stream failed, connected= " + this.q + ", StreamId= " + this.u);
            return false;
        }
        this.G = null;
        Log.d("RtmpConnection", "createStream(): Sending releaseStream command...");
        int i2 = this.v + 1;
        this.v = i2;
        c.c.a.a.c.d dVar = new c.c.a.a.c.d("releaseStream", i2);
        dVar.a().b(5);
        dVar.a(new c.c.a.a.a.g());
        dVar.a(this.f1354e);
        a((j) dVar);
        Log.d("RtmpConnection", "createStream(): Sending FCPublish command...");
        int i3 = this.v + 1;
        this.v = i3;
        c.c.a.a.c.d dVar2 = new c.c.a.a.c.d("FCPublish", i3);
        dVar2.a().b(5);
        dVar2.a(new c.c.a.a.a.g());
        dVar2.a(this.f1354e);
        a((j) dVar2);
        Log.d("RtmpConnection", "createStream(): Sending createStream command...");
        a aVarA = this.l.a(3);
        int i4 = this.v + 1;
        this.v = i4;
        c.c.a.a.c.d dVar3 = new c.c.a.a.c.d("createStream", i4, aVarA);
        dVar3.a(new c.c.a.a.a.g());
        a((j) dVar3);
        synchronized (this.t) {
            try {
                this.t.wait(5000L);
            } catch (InterruptedException unused) {
            }
        }
        if (!this.r) {
            a(true);
            if (this.G != null && !this.G.isEmpty()) {
                this.y.c(this.G);
            } else {
                this.y.c("Error configure stream, publish permitted failed");
            }
        }
        return this.r;
    }

    private void d() throws IOException {
        if (!this.q || this.u == 0) {
            Log.e("RtmpConnection", "fmlePublish failed");
            return;
        }
        Log.d("RtmpConnection", "fmlePublish(): Sending publish command...");
        c.c.a.a.c.d dVar = new c.c.a.a.c.d("publish", 0);
        dVar.a().b(5);
        dVar.a().c(this.u);
        dVar.a(new c.c.a.a.a.g());
        dVar.a(this.f1354e);
        dVar.a(this.f1355f);
        a((j) dVar);
    }

    private void e() throws IOException {
        if (!this.q || this.u == 0) {
            Log.e("RtmpConnection", "onMetaData failed");
            return;
        }
        Log.d("RtmpConnection", "onMetaData(): Sending empty onMetaData...");
        c.c.a.a.c.f fVar = new c.c.a.a.c.f("@setDataFrame");
        fVar.a().c(this.u);
        fVar.a("onMetaData");
        c.c.a.a.a.f fVar2 = new c.c.a.a.a.f();
        fVar2.a("duration", 0);
        fVar2.a("width", this.w);
        fVar2.a("height", this.x);
        fVar2.a("videodatarate", 0);
        fVar2.a("framerate", 0);
        fVar2.a("audiodatarate", 0);
        fVar2.a("audiosamplerate", 44100);
        fVar2.a("audiosamplesize", 16);
        fVar2.a("stereo", true);
        fVar2.a("filesize", 0);
        fVar.a(fVar2);
        a(fVar);
    }

    public void a() {
        if (this.j != null) {
            f();
        }
        a(true);
    }

    private void f() throws IOException {
        if (!this.q || this.u == 0 || !this.r) {
            Log.e("RtmpConnection", "closeStream failed");
            return;
        }
        Log.d("RtmpConnection", "closeStream(): setting current stream ID to 0");
        c.c.a.a.c.d dVar = new c.c.a.a.c.d("closeStream", 0);
        dVar.a().b(5);
        dVar.a().c(this.u);
        dVar.a(new c.c.a.a.a.g());
        a((j) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0018, B:11:0x001c, B:12:0x0021, B:15:0x002e, B:14:0x0029, B:16:0x0031, B:19:0x003f, B:21:0x0048, B:8:0x0011), top: B:33:0x0001, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void a(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.net.Socket r0 = r3.j     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L46
            java.net.Socket r0 = r3.j     // Catch: java.lang.Throwable -> L10 java.lang.Throwable -> L4d
            r0.shutdownInput()     // Catch: java.lang.Throwable -> L10 java.lang.Throwable -> L4d
            java.net.Socket r0 = r3.j     // Catch: java.lang.Throwable -> L10 java.lang.Throwable -> L4d
            r0.shutdownOutput()     // Catch: java.lang.Throwable -> L10 java.lang.Throwable -> L4d
            goto L18
        L10:
            r0 = move-exception
            java.lang.String r1 = "RtmpConnection"
            java.lang.String r2 = "Shutdown socket"
            android.util.Log.e(r1, r2, r0)     // Catch: java.lang.Throwable -> L4d
        L18:
            java.lang.Thread r0 = r3.p     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L31
            java.lang.Thread r0 = r3.p     // Catch: java.lang.Throwable -> L4d
            r0.interrupt()     // Catch: java.lang.Throwable -> L4d
            java.lang.Thread r0 = r3.p     // Catch: java.lang.InterruptedException -> L29 java.lang.Throwable -> L4d
            r1 = 100
            r0.join(r1)     // Catch: java.lang.InterruptedException -> L29 java.lang.Throwable -> L4d
            goto L2e
        L29:
            java.lang.Thread r0 = r3.p     // Catch: java.lang.Throwable -> L4d
            r0.interrupt()     // Catch: java.lang.Throwable -> L4d
        L2e:
            r0 = 0
            r3.p = r0     // Catch: java.lang.Throwable -> L4d
        L31:
            java.net.Socket r0 = r3.j     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L4d
            r0.close()     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L4d
            java.lang.String r0 = "RtmpConnection"
            java.lang.String r1 = "socket closed"
            android.util.Log.d(r0, r1)     // Catch: java.io.IOException -> L3e java.lang.Throwable -> L4d
            goto L46
        L3e:
            r0 = move-exception
            java.lang.String r1 = "RtmpConnection"
            java.lang.String r2 = "shutdown(): failed to close socket"
            android.util.Log.e(r1, r2, r0)     // Catch: java.lang.Throwable -> L4d
        L46:
            if (r4 == 0) goto L4b
            r3.g()     // Catch: java.lang.Throwable -> L4d
        L4b:
            monitor-exit(r3)
            return
        L4d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.b.e.a(boolean):void");
    }

    private void g() {
        this.q = false;
        this.r = false;
        this.G = null;
        this.f1357h = null;
        this.f1356g = null;
        this.f1358i = null;
        this.f1353d = null;
        this.f1354e = null;
        this.f1355f = null;
        this.u = 0;
        this.v = 0;
        this.k = "";
        this.j = null;
        this.l = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
    }

    public void a(byte[] bArr, int i2, int i3) {
        if (bArr == null || bArr.length == 0 || i3 < 0 || !this.q || this.u == 0 || !this.r) {
            return;
        }
        c.c.a.a.c.c cVar = new c.c.a.a.c.c();
        cVar.a(bArr, i2);
        cVar.a().a(i3);
        cVar.a().c(this.u);
        a(cVar);
        this.H.a(i2 * 8);
    }

    public void b(byte[] bArr, int i2, int i3) {
        if (bArr == null || bArr.length == 0 || i3 < 0 || !this.q || this.u == 0 || !this.r) {
            return;
        }
        o oVar = new o();
        oVar.a(bArr, i2);
        oVar.a().a(i3);
        oVar.a().c(this.u);
        a(oVar);
        this.H.a(i2 * 8);
    }

    private void a(j jVar) throws IOException {
        try {
            a aVarA = this.l.a(jVar.a().a());
            aVarA.b(jVar.a());
            if (!(jVar instanceof o) && !(jVar instanceof c.c.a.a.c.c)) {
                jVar.a().a((int) aVarA.d());
            }
            jVar.a(this.o, this.l.b(), aVarA);
            Log.d("RtmpConnection", "wrote packet: " + jVar + ", size: " + jVar.a().b());
            if (jVar instanceof c.c.a.a.c.d) {
                this.l.a(((c.c.a.a.c.d) jVar).f(), ((c.c.a.a.c.d) jVar).e());
            }
            this.o.flush();
        } catch (SocketException e2) {
            if (this.k.contentEquals(e2.getMessage())) {
                return;
            }
            this.k = e2.getMessage();
            this.y.c("Error send packet: " + e2.getMessage());
            Log.e("RtmpConnection", "Caught SocketException during write loop, shutting down: " + e2.getMessage());
        } catch (IOException e3) {
            Log.e("RtmpConnection", "Caught IOException during write loop, shutting down: " + e3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() throws SocketException {
        while (!Thread.interrupted()) {
            try {
                j jVarA = this.m.a(this.n);
                if (jVarA != null) {
                    switch (d.f1349b[jVarA.a().c().ordinal()]) {
                        case 1:
                            this.l.a(((c.c.a.a.c.a) jVarA).d()).g();
                            break;
                        case 2:
                            m mVar = (m) jVarA;
                            switch (d.f1348a[mVar.d().ordinal()]) {
                                case 2:
                                    a aVarA = this.l.a(2);
                                    Log.d("RtmpConnection", "handleRxPacketLoop(): Sending PONG reply..");
                                    a(new m(mVar, aVarA));
                                    break;
                                case 3:
                                    Log.i("RtmpConnection", "handleRxPacketLoop(): Stream EOF reached, closing RTMP writer...");
                                    break;
                            }
                        case 3:
                            int iD = ((p) jVarA).d();
                            Log.d("RtmpConnection", "handleRxPacketLoop(): Setting acknowledgement window size: " + iD);
                            this.l.d(iD);
                            break;
                        case 4:
                            this.l.d(((l) jVarA).d());
                            int iC = this.l.c();
                            a aVarA2 = this.l.a(2);
                            Log.d("RtmpConnection", "handleRxPacketLoop(): Send acknowledgement window size: " + iC);
                            a(new p(iC, aVarA2));
                            this.j.setSendBufferSize(iC);
                            break;
                        case 5:
                            a((c.c.a.a.c.d) jVarA);
                            break;
                        default:
                            Log.w("RtmpConnection", "handleRxPacketLoop(): Not handling unimplemented/unknown packet of type: " + jVarA.a().c());
                            break;
                    }
                }
            } catch (EOFException unused) {
                Thread.currentThread().interrupt();
            } catch (IOException e2) {
                this.y.c("Error reading packet: " + e2.getMessage());
                Log.e("RtmpConnection", "Caught SocketException while reading/decoding packet, shutting down: " + e2.getMessage());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(c.c.a.a.c.d r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.b.e.a(c.c.a.a.c.d):void");
    }

    public void a(int i2, int i3) {
        this.w = i2;
        this.x = i3;
    }
}
