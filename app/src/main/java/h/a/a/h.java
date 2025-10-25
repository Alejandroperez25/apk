package h.a.a;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b.a.a$i;
import h.a.a.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private c.c.a.a.b f5870b;

    /* renamed from: c, reason: collision with root package name */
    private Thread f5871c;

    /* renamed from: f, reason: collision with root package name */
    private c f5874f;

    /* renamed from: g, reason: collision with root package name */
    private c f5875g;
    private h.a.a.b k;
    private String o;
    private int p;
    private int q;
    private Runnable s;

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f5869a = false;

    /* renamed from: d, reason: collision with root package name */
    private b f5872d = new b();

    /* renamed from: e, reason: collision with root package name */
    private boolean f5873e = true;

    /* renamed from: h, reason: collision with root package name */
    private h.a.a.d f5876h = new h.a.a.d(131072);

    /* renamed from: i, reason: collision with root package name */
    private h.a.a.d f5877i = new h.a.a.d(4096);
    private volatile BlockingQueue<c> j = new LinkedBlockingQueue(30);
    private int l = 0;
    private boolean m = false;
    private byte n = 0;
    private long t = 0;
    private long u = 0;
    private long v = 0;
    private long w = 0;
    private Handler r = new Handler(Looper.getMainLooper());

    static /* synthetic */ long m(h hVar) {
        long j = hVar.w;
        hVar.w = 1 + j;
        return j;
    }

    static /* synthetic */ long n(h hVar) {
        long j = hVar.v;
        hVar.v = 1 + j;
        return j;
    }

    public h(h.a.a.b bVar) {
        this.k = bVar;
        this.f5870b = new c.c.a.a.b(bVar);
    }

    public void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.f5872d.a(byteBuffer, byteBuffer2);
    }

    public void a(int i2) {
        this.l = i2;
    }

    public void a(boolean z) {
        this.f5872d.a(z ? 2 : 1);
    }

    public void a() {
        this.t = 0L;
    }

    public void b() {
        this.u = 0L;
    }

    public void c() {
        this.v = 0L;
    }

    public void d() {
        this.w = 0L;
    }

    public void a(int i2, int i3) {
        this.f5870b.a(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h.a.a.b bVar) {
        try {
            this.f5870b.a();
        } catch (IllegalStateException unused) {
        }
        this.f5869a = false;
        this.f5874f = null;
        this.f5875g = null;
        a();
        b();
        c();
        d();
        if (bVar != null) {
            this.q = 0;
            bVar.f();
        }
        Log.i("SrsFlvMuxer", "worker: disconnect ok.");
    }

    public void b(int i2) {
        this.p = i2;
        this.q = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        this.o = str;
        if (!this.f5869a) {
            Log.i("SrsFlvMuxer", String.format("worker: connecting to RTMP server by url=%s\n", str));
            if (this.f5870b.a(str)) {
                this.f5869a = this.f5870b.b("live");
            }
            this.f5874f = null;
            this.f5875g = null;
        }
        return this.f5869a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar) {
        if (!this.f5869a || cVar == null) {
            return;
        }
        if (cVar.c()) {
            if (cVar.a()) {
                Log.i("SrsFlvMuxer", String.format("worker: send frame type=%d, dts=%d, size=%dB", Integer.valueOf(cVar.f5893d), Integer.valueOf(cVar.f5894e), Integer.valueOf(cVar.f5890a.a().length)));
            }
            this.f5870b.a(cVar.f5890a.a(), cVar.f5890a.b(), cVar.f5894e);
            this.f5876h.a(cVar.f5890a);
            this.u++;
            return;
        }
        if (cVar.d()) {
            this.f5870b.b(cVar.f5890a.a(), cVar.f5890a.b(), cVar.f5894e);
            this.f5877i.a(cVar.f5890a);
            this.t++;
        }
    }

    public void a(String str) {
        this.f5871c = new Thread(new f(this, str));
        this.f5871c.start();
    }

    public void e() throws InterruptedException {
        b(this.k);
    }

    private void b(h.a.a.b bVar) throws InterruptedException {
        this.r.removeCallbacks(this.s);
        if (this.f5871c != null) {
            this.f5871c.interrupt();
            try {
                this.f5871c.join(100L);
            } catch (InterruptedException unused) {
                this.f5871c.interrupt();
            }
            this.f5871c = null;
        }
        this.j.clear();
        this.f5872d.a();
        this.f5873e = true;
        Log.i("SrsFlvMuxer", "SrsFlvMuxer closed");
        new Thread(new g(this, bVar)).start();
    }

    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f5872d.b(byteBuffer, bufferInfo);
    }

    public void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f5872d.a(byteBuffer, bufferInfo);
    }

    private class a {

        /* renamed from: a, reason: collision with root package name */
        public int f5878a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5879b;

        private a() {
            this.f5878a = 0;
            this.f5879b = false;
        }

        /* synthetic */ a(h hVar, h.a.a.e eVar) {
            this();
        }
    }

    private class d {

        /* renamed from: a, reason: collision with root package name */
        public ByteBuffer f5896a;

        /* renamed from: b, reason: collision with root package name */
        public int f5897b;

        private d() {
        }

        /* synthetic */ d(h hVar, h.a.a.e eVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c {

        /* renamed from: a, reason: collision with root package name */
        public d.a f5890a;

        /* renamed from: b, reason: collision with root package name */
        public int f5891b;

        /* renamed from: c, reason: collision with root package name */
        public int f5892c;

        /* renamed from: d, reason: collision with root package name */
        public int f5893d;

        /* renamed from: e, reason: collision with root package name */
        public int f5894e;

        private c() {
        }

        /* synthetic */ c(h hVar, h.a.a.e eVar) {
            this();
        }

        public boolean a() {
            return c() && this.f5892c == 1;
        }

        public boolean b() {
            return this.f5891b == 0;
        }

        public boolean c() {
            return this.f5893d == 9;
        }

        public boolean d() {
            return this.f5893d == 8;
        }
    }

    private class e {

        /* renamed from: a, reason: collision with root package name */
        private a f5899a;

        /* renamed from: b, reason: collision with root package name */
        private d f5900b;

        /* renamed from: c, reason: collision with root package name */
        private d f5901c;

        /* renamed from: d, reason: collision with root package name */
        private d f5902d;

        /* renamed from: e, reason: collision with root package name */
        private d f5903e;

        /* renamed from: f, reason: collision with root package name */
        private d f5904f;

        /* renamed from: g, reason: collision with root package name */
        private d f5905g;

        private e() {
            h.a.a.e eVar = null;
            this.f5899a = new a(h.this, eVar);
            this.f5900b = new d(h.this, eVar);
            this.f5901c = new d(h.this, eVar);
            this.f5902d = new d(h.this, eVar);
            this.f5903e = new d(h.this, eVar);
            this.f5904f = new d(h.this, eVar);
            this.f5905g = new d(h.this, eVar);
        }

        /* synthetic */ e(h hVar, h.a.a.e eVar) {
            this();
        }

        public d a(d dVar) {
            if (this.f5900b.f5896a == null) {
                this.f5900b.f5896a = ByteBuffer.allocate(4);
                this.f5900b.f5897b = 4;
            }
            this.f5900b.f5896a.rewind();
            this.f5900b.f5896a.putInt(dVar.f5897b);
            this.f5900b.f5896a.rewind();
            return this.f5900b;
        }

        public void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ArrayList<d> arrayList) {
            if (this.f5901c.f5896a == null) {
                this.f5901c.f5896a = ByteBuffer.allocate(5);
                this.f5901c.f5897b = 5;
            }
            this.f5901c.f5896a.rewind();
            byte b2 = byteBuffer.get(1);
            byte b3 = byteBuffer.get(3);
            this.f5901c.f5896a.put((byte) 1);
            this.f5901c.f5896a.put(b2);
            this.f5901c.f5896a.put(h.this.n);
            this.f5901c.f5896a.put(b3);
            this.f5901c.f5896a.put((byte) 3);
            this.f5901c.f5896a.rewind();
            arrayList.add(this.f5901c);
            if (this.f5902d.f5896a == null) {
                this.f5902d.f5896a = ByteBuffer.allocate(3);
                this.f5902d.f5897b = 3;
            }
            this.f5902d.f5896a.rewind();
            this.f5902d.f5896a.put((byte) 1);
            this.f5902d.f5896a.putShort((short) byteBuffer.array().length);
            this.f5902d.f5896a.rewind();
            arrayList.add(this.f5902d);
            this.f5903e.f5897b = byteBuffer.array().length;
            this.f5903e.f5896a = byteBuffer.duplicate();
            arrayList.add(this.f5903e);
            if (this.f5904f.f5896a == null) {
                this.f5904f.f5896a = ByteBuffer.allocate(3);
                this.f5904f.f5897b = 3;
            }
            this.f5904f.f5896a.rewind();
            this.f5904f.f5896a.put((byte) 1);
            this.f5904f.f5896a.putShort((short) byteBuffer2.array().length);
            this.f5904f.f5896a.rewind();
            arrayList.add(this.f5904f);
            this.f5905g.f5897b = byteBuffer2.array().length;
            this.f5905g.f5896a = byteBuffer2.duplicate();
            arrayList.add(this.f5905g);
        }

        public d.a a(ArrayList<d> arrayList, int i2, int i3) {
            int i4 = 5;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                i4 += arrayList.get(i5).f5897b;
            }
            d.a aVarA = h.this.f5876h.a(i4);
            aVarA.a((byte) ((i2 << 4) | 7));
            aVarA.a((byte) i3);
            aVarA.a((byte) 0);
            aVarA.a((byte) 0);
            aVarA.a((byte) 0);
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                d dVar = arrayList.get(i6);
                dVar.f5896a.rewind();
                dVar.f5896a.get(aVarA.a(), aVarA.b(), dVar.f5897b);
                aVarA.a(dVar.f5897b);
            }
            return aVarA;
        }

        private a a(ByteBuffer byteBuffer, int i2) {
            this.f5899a.f5879b = false;
            this.f5899a.f5878a = 0;
            if (i2 - 4 > 0) {
                if (byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 0 && byteBuffer.get(3) == 1) {
                    this.f5899a.f5879b = true;
                    this.f5899a.f5878a = 4;
                } else if (byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 1) {
                    this.f5899a.f5879b = true;
                    this.f5899a.f5878a = 3;
                }
            }
            return this.f5899a;
        }

        private a b(ByteBuffer byteBuffer, int i2) {
            this.f5899a.f5879b = false;
            this.f5899a.f5878a = 0;
            int iPosition = byteBuffer.position();
            while (true) {
                if (iPosition >= i2 - 4) {
                    break;
                }
                if (byteBuffer.get(iPosition) == 0 && byteBuffer.get(iPosition + 1) == 0) {
                    int i3 = iPosition + 2;
                    if (byteBuffer.get(i3) == 1) {
                        this.f5899a.f5879b = true;
                        this.f5899a.f5878a = (iPosition + 3) - byteBuffer.position();
                        break;
                    }
                    if (byteBuffer.get(i3) == 0 && byteBuffer.get(iPosition + 3) == 1) {
                        this.f5899a.f5879b = true;
                        this.f5899a.f5878a = (iPosition + 4) - byteBuffer.position();
                        break;
                    }
                }
                iPosition++;
            }
            return this.f5899a;
        }

        public d a(ByteBuffer byteBuffer, int i2, boolean z) {
            d dVar = new d(h.this, null);
            if (byteBuffer.position() < i2 - 4) {
                a aVarA = z ? a(byteBuffer, i2) : b(byteBuffer, i2);
                if (!aVarA.f5879b || aVarA.f5878a < 3) {
                    Log.e("SrsFlvMuxer", "annexb not match.");
                } else {
                    for (int i3 = 0; i3 < aVarA.f5878a; i3++) {
                        byteBuffer.get();
                    }
                    dVar.f5896a = byteBuffer.slice();
                    dVar.f5897b = i2 - byteBuffer.position();
                }
            }
            return dVar;
        }
    }

    private class b {

        /* renamed from: a, reason: collision with root package name */
        private e f5881a;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<d> f5882b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        private d.a f5883c;

        /* renamed from: d, reason: collision with root package name */
        private d.a f5884d;

        /* renamed from: e, reason: collision with root package name */
        private ByteBuffer f5885e;

        /* renamed from: f, reason: collision with root package name */
        private ByteBuffer f5886f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f5887g;

        /* renamed from: h, reason: collision with root package name */
        private int f5888h;

        public b() {
            this.f5881a = new e(h.this, null);
            a();
        }

        public void a(int i2) {
            this.f5888h = i2;
        }

        public void a() {
            this.f5885e = null;
            this.f5886f = null;
            h.this.m = false;
            this.f5887g = false;
        }

        public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            byte b2;
            int i2;
            int i3 = (int) (bufferInfo.presentationTimeUs / 1000);
            this.f5883c = h.this.f5877i.a(bufferInfo.size + 2);
            int i4 = 3;
            if (!this.f5887g) {
                byte b3 = (byte) (bufferInfo.flags == 2 ? byteBuffer.get(0) & 248 : (byteBuffer.get(0) & 248) / 2);
                if (h.this.l == 22050) {
                    i2 = 7;
                } else if (h.this.l == 11025) {
                    i2 = 10;
                } else if (h.this.l == 32000) {
                    i2 = 5;
                } else {
                    i2 = h.this.l == 16000 ? 8 : 4;
                }
                this.f5883c.a((byte) (b3 | ((i2 >> 1) & 7)), 2);
                this.f5883c.a((byte) (((byte) ((i2 << 7) & 128)) | (((this.f5888h == 2 ? 2 : 1) << 3) & a$i.AppCompatTheme_windowNoTitle)), 3);
                this.f5887g = true;
                a(this.f5883c.a(), 4);
                this.f5883c.a(7);
                b2 = 0;
            } else {
                byteBuffer.get(this.f5883c.a(), 2, bufferInfo.size);
                this.f5883c.a(bufferInfo.size + 2);
                b2 = 1;
            }
            int i5 = this.f5888h == 2 ? 1 : 0;
            if (h.this.l == 22050) {
                i4 = 2;
            } else if (h.this.l == 11025) {
                i4 = 1;
            }
            this.f5883c.a((byte) (((byte) (((byte) (((byte) (i5 & 1)) | 2)) | ((i4 << 2) & 12))) | 160), 0);
            this.f5883c.a(b2, 1);
            a(8, i3, 0, b2, this.f5883c);
        }

        private void a(byte[] bArr, int i2) {
            bArr[i2] = -1;
            int i3 = i2 + 1;
            bArr[i3] = -16;
            bArr[i3] = (byte) (bArr[i3] | 0);
            bArr[i3] = (byte) (bArr[i3] | 0);
            bArr[i3] = (byte) (bArr[i3] | 1);
            int i4 = i2 + 2;
            bArr[i4] = 64;
            bArr[i4] = (byte) (bArr[i4] | 16);
            bArr[i4] = (byte) (bArr[i4] | 0);
            int i5 = i2 + 3;
            bArr[i5] = -128;
            bArr[i5] = (byte) (bArr[i5] | 0);
            bArr[i5] = (byte) (bArr[i5] | 0);
            bArr[i5] = (byte) (bArr[i5] | 0);
            bArr[i5] = (byte) (bArr[i5] | 0);
            bArr[i5] = (byte) (bArr[i5] | (((bArr.length - 2) & 6144) >> 11));
            bArr[i2 + 4] = (byte) (((bArr.length - 2) & 2040) >> 3);
            int i6 = i2 + 5;
            bArr[i6] = (byte) (((bArr.length - 2) & 7) << 5);
            bArr[i6] = (byte) (bArr[i6] | 31);
            int i7 = i2 + 6;
            bArr[i7] = -4;
            bArr[i7] = (byte) (bArr[i7] | 0);
        }

        public void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            if (bufferInfo.size < 4) {
                return;
            }
            byteBuffer.rewind();
            int i2 = (int) (bufferInfo.presentationTimeUs / 1000);
            int i3 = 2;
            d dVarA = this.f5881a.a(byteBuffer, bufferInfo.size, true);
            int i4 = dVarA.f5896a.get(0) & 31;
            if (i4 == 5) {
                i3 = 1;
            } else {
                if (i4 == 7 || i4 == 8) {
                    d dVarA2 = this.f5881a.a(byteBuffer, bufferInfo.size, false);
                    dVarA.f5897b = (dVarA.f5897b - dVarA2.f5897b) - 4;
                    if (!dVarA.f5896a.equals(this.f5885e)) {
                        byte[] bArr = new byte[dVarA.f5897b];
                        dVarA.f5896a.get(bArr);
                        h.this.m = false;
                        this.f5885e = ByteBuffer.wrap(bArr);
                    }
                    d dVarA3 = this.f5881a.a(byteBuffer, bufferInfo.size, false);
                    if (dVarA3.f5897b > 0 && 6 == (dVarA3.f5896a.get(0) & 31)) {
                        dVarA2.f5897b = (dVarA2.f5897b - dVarA3.f5897b) - 3;
                    }
                    if (dVarA2.f5897b <= 0 || dVarA2.f5896a.equals(this.f5886f)) {
                        return;
                    }
                    byte[] bArr2 = new byte[dVarA2.f5897b];
                    dVarA2.f5896a.get(bArr2);
                    h.this.m = false;
                    this.f5886f = ByteBuffer.wrap(bArr2);
                    b(i2);
                    return;
                }
                if (i4 != 1) {
                    return;
                }
            }
            this.f5882b.add(this.f5881a.a(dVarA));
            this.f5882b.add(dVarA);
            a(this.f5882b, i3, i2);
            this.f5882b.clear();
        }

        public void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            this.f5885e = byteBuffer;
            this.f5886f = byteBuffer2;
        }

        private void b(int i2) {
            if (this.f5886f == null || this.f5885e == null || h.this.m) {
                return;
            }
            ArrayList<d> arrayList = new ArrayList<>();
            this.f5881a.a(this.f5885e, this.f5886f, arrayList);
            this.f5884d = this.f5881a.a(arrayList, 1, 0);
            h.this.m = true;
            a(9, i2, 1, 0, this.f5884d);
            Log.i("SrsFlvMuxer", String.format("flv: h264 sps/pps sent, sps=%dB, pps=%dB", Integer.valueOf(this.f5885e.array().length), Integer.valueOf(this.f5886f.array().length)));
        }

        private void a(ArrayList<d> arrayList, int i2, int i3) {
            if (this.f5886f == null || this.f5885e == null) {
                return;
            }
            this.f5884d = this.f5881a.a(arrayList, i2, 1);
            a(9, i3, i2, 1, this.f5884d);
        }

        private void a(int i2, int i3, int i4, int i5, d.a aVar) {
            c cVar = new c(h.this, null);
            cVar.f5890a = aVar;
            cVar.f5893d = i2;
            cVar.f5894e = i3;
            cVar.f5892c = i4;
            cVar.f5891b = i5;
            if (cVar.c()) {
                if (h.this.f5873e) {
                    if (cVar.a()) {
                        h.this.f5873e = false;
                        a(cVar);
                        return;
                    }
                    return;
                }
                a(cVar);
                return;
            }
            if (cVar.d()) {
                a(cVar);
            }
        }

        private void a(c cVar) {
            try {
                h.this.j.add(cVar);
            } catch (IllegalStateException unused) {
                Log.i("SrsFlvMuxer", "frame discarded");
                if (cVar.c()) {
                    h.m(h.this);
                } else {
                    h.n(h.this);
                }
            }
        }
    }
}
