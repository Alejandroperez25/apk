package c.d.a.a.e.e;

import c.d.a.a.m.H;
import c.d.a.a.m.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
abstract class c {
    public final int Wa;

    /* renamed from: a, reason: collision with root package name */
    public static final int f1872a = H.h("ftyp");

    /* renamed from: b, reason: collision with root package name */
    public static final int f1873b = H.h("avc1");

    /* renamed from: c, reason: collision with root package name */
    public static final int f1874c = H.h("avc3");

    /* renamed from: d, reason: collision with root package name */
    public static final int f1875d = H.h("hvc1");

    /* renamed from: e, reason: collision with root package name */
    public static final int f1876e = H.h("hev1");

    /* renamed from: f, reason: collision with root package name */
    public static final int f1877f = H.h("s263");

    /* renamed from: g, reason: collision with root package name */
    public static final int f1878g = H.h("d263");

    /* renamed from: h, reason: collision with root package name */
    public static final int f1879h = H.h("mdat");

    /* renamed from: i, reason: collision with root package name */
    public static final int f1880i = H.h("mp4a");
    public static final int j = H.h(".mp3");
    public static final int k = H.h("wave");
    public static final int l = H.h("lpcm");
    public static final int m = H.h("sowt");
    public static final int n = H.h("ac-3");
    public static final int o = H.h("dac3");
    public static final int p = H.h("ec-3");
    public static final int q = H.h("dec3");
    public static final int r = H.h("dtsc");
    public static final int s = H.h("dtsh");
    public static final int t = H.h("dtsl");
    public static final int u = H.h("dtse");
    public static final int v = H.h("ddts");
    public static final int w = H.h("tfdt");
    public static final int x = H.h("tfhd");
    public static final int y = H.h("trex");
    public static final int z = H.h("trun");
    public static final int A = H.h("sidx");
    public static final int B = H.h("moov");
    public static final int C = H.h("mvhd");
    public static final int D = H.h("trak");
    public static final int E = H.h("mdia");
    public static final int F = H.h("minf");
    public static final int G = H.h("stbl");
    public static final int H = H.h("avcC");
    public static final int I = H.h("hvcC");
    public static final int J = H.h("esds");
    public static final int K = H.h("moof");
    public static final int L = H.h("traf");
    public static final int M = H.h("mvex");
    public static final int N = H.h("mehd");
    public static final int O = H.h("tkhd");
    public static final int P = H.h("edts");
    public static final int Q = H.h("elst");
    public static final int R = H.h("mdhd");
    public static final int S = H.h("hdlr");
    public static final int T = H.h("stsd");
    public static final int U = H.h("pssh");
    public static final int V = H.h("sinf");
    public static final int W = H.h("schm");
    public static final int X = H.h("schi");
    public static final int Y = H.h("tenc");
    public static final int Z = H.h("encv");
    public static final int aa = H.h("enca");
    public static final int ba = H.h("frma");
    public static final int ca = H.h("saiz");
    public static final int da = H.h("saio");
    public static final int ea = H.h("sbgp");
    public static final int fa = H.h("sgpd");
    public static final int ga = H.h("uuid");
    public static final int ha = H.h("senc");
    public static final int ia = H.h("pasp");
    public static final int ja = H.h("TTML");
    public static final int ka = H.h("vmhd");
    public static final int la = H.h("mp4v");
    public static final int ma = H.h("stts");
    public static final int na = H.h("stss");
    public static final int oa = H.h("ctts");
    public static final int pa = H.h("stsc");
    public static final int qa = H.h("stsz");
    public static final int ra = H.h("stz2");
    public static final int sa = H.h("stco");
    public static final int ta = H.h("co64");
    public static final int ua = H.h("tx3g");
    public static final int va = H.h("wvtt");
    public static final int wa = H.h("stpp");
    public static final int xa = H.h("c608");
    public static final int ya = H.h("samr");
    public static final int za = H.h("sawb");
    public static final int Aa = H.h("udta");
    public static final int Ba = H.h("meta");
    public static final int Ca = H.h("keys");
    public static final int Da = H.h("ilst");
    public static final int Ea = H.h("mean");
    public static final int Fa = H.h("name");
    public static final int Ga = H.h("data");
    public static final int Ha = H.h("emsg");
    public static final int Ia = H.h("st3d");
    public static final int Ja = H.h("sv3d");
    public static final int Ka = H.h("proj");
    public static final int La = H.h("vp08");
    public static final int Ma = H.h("vp09");
    public static final int Na = H.h("vpcC");
    public static final int Oa = H.h("camm");
    public static final int Pa = H.h("alac");
    public static final int Qa = H.h("alaw");
    public static final int Ra = H.h("ulaw");
    public static final int Sa = H.h("Opus");
    public static final int Ta = H.h("dOps");
    public static final int Ua = H.h("fLaC");
    public static final int Va = H.h("dfLa");

    public static int a(int i2) {
        return (i2 >> 24) & 255;
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    public c(int i2) {
        this.Wa = i2;
    }

    public String toString() {
        return c(this.Wa);
    }

    static final class b extends c {
        public final u Xa;

        public b(int i2, u uVar) {
            super(i2);
            this.Xa = uVar;
        }
    }

    static final class a extends c {
        public final long Xa;
        public final List<b> Ya;
        public final List<a> Za;

        public a(int i2, long j) {
            super(i2);
            this.Xa = j;
            this.Ya = new ArrayList();
            this.Za = new ArrayList();
        }

        public void a(b bVar) {
            this.Ya.add(bVar);
        }

        public void a(a aVar) {
            this.Za.add(aVar);
        }

        public b d(int i2) {
            int size = this.Ya.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = this.Ya.get(i3);
                if (bVar.Wa == i2) {
                    return bVar;
                }
            }
            return null;
        }

        public a e(int i2) {
            int size = this.Za.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.Za.get(i3);
                if (aVar.Wa == i2) {
                    return aVar;
                }
            }
            return null;
        }

        @Override // c.d.a.a.e.e.c
        public String toString() {
            return c.c(this.Wa) + " leaves: " + Arrays.toString(this.Ya.toArray()) + " containers: " + Arrays.toString(this.Za.toArray());
        }
    }

    public static String c(int i2) {
        return "" + ((char) ((i2 >> 24) & 255)) + ((char) ((i2 >> 16) & 255)) + ((char) ((i2 >> 8) & 255)) + ((char) (i2 & 255));
    }
}
