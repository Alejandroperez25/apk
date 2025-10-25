package c.c.a.a.c;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private a f1377a;

    /* renamed from: b, reason: collision with root package name */
    private int f1378b;

    /* renamed from: c, reason: collision with root package name */
    private int f1379c;

    /* renamed from: d, reason: collision with root package name */
    private int f1380d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f1381e;

    /* renamed from: f, reason: collision with root package name */
    private b f1382f;

    /* renamed from: g, reason: collision with root package name */
    private int f1383g;

    /* renamed from: h, reason: collision with root package name */
    private int f1384h;

    public enum b {
        SET_CHUNK_SIZE(1),
        ABORT(2),
        ACKNOWLEDGEMENT(3),
        USER_CONTROL_MESSAGE(4),
        WINDOW_ACKNOWLEDGEMENT_SIZE(5),
        SET_PEER_BANDWIDTH(6),
        AUDIO(8),
        VIDEO(9),
        DATA_AMF3(15),
        SHARED_OBJECT_AMF3(16),
        COMMAND_AMF3(17),
        DATA_AMF0(18),
        COMMAND_AMF0(20),
        SHARED_OBJECT_AMF0(19),
        AGGREGATE_MESSAGE(22);

        private static final Map<Byte, b> p = new HashMap();
        private byte r;

        static {
            for (b bVar : values()) {
                p.put(Byte.valueOf(bVar.a()), bVar);
            }
        }

        b(int i2) {
            this.r = (byte) i2;
        }

        public byte a() {
            return this.r;
        }

        public static b a(byte b2) {
            if (p.containsKey(Byte.valueOf(b2))) {
                return p.get(Byte.valueOf(b2));
            }
            throw new IllegalArgumentException("Unknown message type byte: " + c.c.a.a.d.a(b2));
        }
    }

    public enum a {
        TYPE_0_FULL(0),
        TYPE_1_RELATIVE_LARGE(1),
        TYPE_2_RELATIVE_TIMESTAMP_ONLY(2),
        TYPE_3_RELATIVE_SINGLE_BYTE(3);


        /* renamed from: e, reason: collision with root package name */
        private static final Map<Byte, a> f1389e = new HashMap();

        /* renamed from: g, reason: collision with root package name */
        private byte f1391g;

        static {
            for (a aVar : values()) {
                f1389e.put(Byte.valueOf(aVar.a()), aVar);
            }
        }

        a(int i2) {
            this.f1391g = (byte) i2;
        }

        public byte a() {
            return this.f1391g;
        }

        public static a a(byte b2) {
            if (f1389e.containsKey(Byte.valueOf(b2))) {
                return f1389e.get(Byte.valueOf(b2));
            }
            throw new IllegalArgumentException("Unknown chunk header type byte: " + c.c.a.a.d.a(b2));
        }
    }

    public i() {
    }

    public i(a aVar, int i2, b bVar) {
        this.f1377a = aVar;
        this.f1378b = i2;
        this.f1382f = bVar;
    }

    public static i a(InputStream inputStream, c.c.a.a.b.h hVar) throws IOException {
        i iVar = new i();
        iVar.b(inputStream, hVar);
        return iVar;
    }

    private void b(InputStream inputStream, c.c.a.a.b.h hVar) throws IOException {
        int i2 = inputStream.read();
        if (i2 == -1) {
            throw new EOFException("Unexpected EOF while reading RTMP packet basic header");
        }
        byte b2 = (byte) i2;
        a(b2);
        switch (h.f1376a[this.f1377a.ordinal()]) {
            case 1:
                this.f1379c = c.c.a.a.d.b(inputStream);
                this.f1380d = 0;
                this.f1381e = c.c.a.a.d.b(inputStream);
                this.f1382f = b.a((byte) inputStream.read());
                byte[] bArr = new byte[4];
                c.c.a.a.d.a(inputStream, bArr);
                this.f1383g = c.c.a.a.d.a(bArr);
                this.f1384h = this.f1379c >= 16777215 ? c.c.a.a.d.a(inputStream) : 0;
                if (this.f1384h != 0) {
                    this.f1379c = this.f1384h;
                    return;
                }
                return;
            case 2:
                this.f1380d = c.c.a.a.d.b(inputStream);
                this.f1381e = c.c.a.a.d.b(inputStream);
                this.f1382f = b.a((byte) inputStream.read());
                this.f1384h = this.f1380d >= 16777215 ? c.c.a.a.d.a(inputStream) : 0;
                i iVarB = hVar.a(this.f1378b).b();
                if (iVarB != null) {
                    this.f1383g = iVarB.f1383g;
                    this.f1379c = this.f1384h != 0 ? this.f1384h : iVarB.f1379c + this.f1380d;
                    return;
                } else {
                    this.f1383g = 0;
                    this.f1379c = this.f1384h != 0 ? this.f1384h : this.f1380d;
                    return;
                }
            case 3:
                this.f1380d = c.c.a.a.d.b(inputStream);
                this.f1384h = this.f1380d >= 16777215 ? c.c.a.a.d.a(inputStream) : 0;
                i iVarB2 = hVar.a(this.f1378b).b();
                this.f1381e = iVarB2.f1381e;
                this.f1382f = iVarB2.f1382f;
                this.f1383g = iVarB2.f1383g;
                this.f1379c = this.f1384h != 0 ? this.f1384h : iVarB2.f1379c + this.f1380d;
                return;
            case 4:
                i iVarB3 = hVar.a(this.f1378b).b();
                this.f1384h = iVarB3.f1380d >= 16777215 ? c.c.a.a.d.a(inputStream) : 0;
                this.f1380d = this.f1384h == 0 ? iVarB3.f1380d : 16777215;
                this.f1381e = iVarB3.f1381e;
                this.f1382f = iVarB3.f1382f;
                this.f1383g = iVarB3.f1383g;
                this.f1379c = this.f1384h != 0 ? this.f1384h : iVarB3.f1379c + this.f1380d;
                return;
            default:
                throw new IOException("Invalid chunk type; basic header byte was: " + c.c.a.a.d.a(b2));
        }
    }

    public void a(OutputStream outputStream, a aVar, c.c.a.a.b.a aVar2) throws IOException {
        outputStream.write(((byte) (aVar.a() << 6)) | this.f1378b);
        switch (h.f1376a[aVar.ordinal()]) {
            case 1:
                aVar2.e();
                c.c.a.a.d.b(outputStream, this.f1379c >= 16777215 ? 16777215 : this.f1379c);
                c.c.a.a.d.b(outputStream, this.f1381e);
                outputStream.write(this.f1382f.a());
                c.c.a.a.d.d(outputStream, this.f1383g);
                if (this.f1379c >= 16777215) {
                    this.f1384h = this.f1379c;
                    c.c.a.a.d.a(outputStream, this.f1384h);
                    return;
                }
                return;
            case 2:
                this.f1380d = (int) aVar2.e();
                this.f1379c = aVar2.c().d() + this.f1380d;
                c.c.a.a.d.b(outputStream, this.f1379c >= 16777215 ? 16777215 : this.f1380d);
                c.c.a.a.d.b(outputStream, this.f1381e);
                outputStream.write(this.f1382f.a());
                if (this.f1379c >= 16777215) {
                    this.f1384h = this.f1379c;
                    c.c.a.a.d.a(outputStream, this.f1379c);
                    return;
                }
                return;
            case 3:
                this.f1380d = (int) aVar2.e();
                this.f1379c = aVar2.c().d() + this.f1380d;
                c.c.a.a.d.b(outputStream, this.f1379c >= 16777215 ? 16777215 : this.f1380d);
                if (this.f1379c >= 16777215) {
                    this.f1384h = this.f1379c;
                    c.c.a.a.d.a(outputStream, this.f1384h);
                    return;
                }
                return;
            case 4:
                if (this.f1384h > 0) {
                    c.c.a.a.d.a(outputStream, this.f1384h);
                    return;
                }
                return;
            default:
                throw new IOException("Invalid chunk type: " + aVar);
        }
    }

    private void a(byte b2) {
        this.f1377a = a.a((byte) ((b2 & 255) >>> 6));
        this.f1378b = b2 & 63;
    }

    public int a() {
        return this.f1378b;
    }

    public int b() {
        return this.f1381e;
    }

    public b c() {
        return this.f1382f;
    }

    public int d() {
        return this.f1379c;
    }

    public void a(int i2) {
        this.f1379c = i2;
    }

    public void b(int i2) {
        this.f1378b = i2;
    }

    public void c(int i2) {
        this.f1383g = i2;
    }

    public void d(int i2) {
        this.f1381e = i2;
    }
}
