package c.d.a.a.e.e;

import c.d.a.a.g.b;
import c.d.a.a.g.b.w;
import c.d.a.a.m.H;
import c.d.a.a.m.u;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final int f1948a = H.h("nam");

    /* renamed from: b, reason: collision with root package name */
    private static final int f1949b = H.h("trk");

    /* renamed from: c, reason: collision with root package name */
    private static final int f1950c = H.h("cmt");

    /* renamed from: d, reason: collision with root package name */
    private static final int f1951d = H.h("day");

    /* renamed from: e, reason: collision with root package name */
    private static final int f1952e = H.h("ART");

    /* renamed from: f, reason: collision with root package name */
    private static final int f1953f = H.h("too");

    /* renamed from: g, reason: collision with root package name */
    private static final int f1954g = H.h("alb");

    /* renamed from: h, reason: collision with root package name */
    private static final int f1955h = H.h("com");

    /* renamed from: i, reason: collision with root package name */
    private static final int f1956i = H.h("wrt");
    private static final int j = H.h("lyr");
    private static final int k = H.h("gen");
    private static final int l = H.h("covr");
    private static final int m = H.h("gnre");
    private static final int n = H.h("grp");
    private static final int o = H.h("disk");
    private static final int p = H.h("trkn");
    private static final int q = H.h("tmpo");
    private static final int r = H.h("cpil");
    private static final int s = H.h("aART");
    private static final int t = H.h("sonm");
    private static final int u = H.h("soal");
    private static final int v = H.h("soar");
    private static final int w = H.h("soaa");
    private static final int x = H.h("soco");
    private static final int y = H.h("rtng");
    private static final int z = H.h("pgap");
    private static final int A = H.h("sosn");
    private static final int B = H.h("tvsh");
    private static final int C = H.h("----");
    private static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static c.d.a.a.q a(int i2, c.d.a.a.q qVar, c.d.a.a.g.b bVar, c.d.a.a.g.b bVar2, c.d.a.a.e.k kVar) {
        if (i2 == 1) {
            if (kVar.a()) {
                qVar = qVar.a(kVar.f2337b, kVar.f2338c);
            }
            return bVar != null ? qVar.a(bVar) : qVar;
        }
        if (i2 != 2 || bVar2 == null) {
            return qVar;
        }
        c.d.a.a.q qVarA = qVar;
        for (int i3 = 0; i3 < bVar2.f(); i3++) {
            b.a aVarA = bVar2.a(i3);
            if (aVarA instanceof j) {
                j jVar = (j) aVarA;
                if ("com.android.capture.fps".equals(jVar.f1944a) && jVar.f1947d == 23) {
                    try {
                        c.d.a.a.q qVarA2 = qVarA.a(ByteBuffer.wrap(jVar.f1945b).asFloatBuffer().get());
                        try {
                            qVarA = qVarA2.a(new c.d.a.a.g.b(jVar));
                        } catch (NumberFormatException unused) {
                            qVarA = qVarA2;
                            c.d.a.a.m.o.c("MetadataUtil", "Ignoring invalid framerate");
                        }
                    } catch (NumberFormatException unused2) {
                    }
                }
            }
        }
        return qVarA;
    }

    public static b.a a(u uVar) {
        int iD = uVar.d() + uVar.p();
        int iP = uVar.p();
        int i2 = (iP >> 24) & 255;
        try {
            if (i2 == 169 || i2 == 253) {
                int i3 = 16777215 & iP;
                if (i3 == f1950c) {
                    return a(iP, uVar);
                }
                if (i3 != f1948a && i3 != f1949b) {
                    if (i3 != f1955h && i3 != f1956i) {
                        if (i3 == f1951d) {
                            return a(iP, "TDRC", uVar);
                        }
                        if (i3 == f1952e) {
                            return a(iP, "TPE1", uVar);
                        }
                        if (i3 == f1953f) {
                            return a(iP, "TSSE", uVar);
                        }
                        if (i3 == f1954g) {
                            return a(iP, "TALB", uVar);
                        }
                        if (i3 == j) {
                            return a(iP, "USLT", uVar);
                        }
                        if (i3 == k) {
                            return a(iP, "TCON", uVar);
                        }
                        if (i3 == n) {
                            return a(iP, "TIT1", uVar);
                        }
                    }
                    return a(iP, "TCOM", uVar);
                }
                return a(iP, "TIT2", uVar);
            }
            if (iP == m) {
                return b(uVar);
            }
            if (iP == o) {
                return b(iP, "TPOS", uVar);
            }
            if (iP == p) {
                return b(iP, "TRCK", uVar);
            }
            if (iP == q) {
                return a(iP, "TBPM", uVar, true, false);
            }
            if (iP == r) {
                return a(iP, "TCMP", uVar, true, true);
            }
            if (iP == l) {
                return c(uVar);
            }
            if (iP == s) {
                return a(iP, "TPE2", uVar);
            }
            if (iP == t) {
                return a(iP, "TSOT", uVar);
            }
            if (iP == u) {
                return a(iP, "TSO2", uVar);
            }
            if (iP == v) {
                return a(iP, "TSOA", uVar);
            }
            if (iP == w) {
                return a(iP, "TSOP", uVar);
            }
            if (iP == x) {
                return a(iP, "TSOC", uVar);
            }
            if (iP == y) {
                return a(iP, "ITUNESADVISORY", uVar, false, false);
            }
            if (iP == z) {
                return a(iP, "ITUNESGAPLESS", uVar, false, true);
            }
            if (iP == A) {
                return a(iP, "TVSHOWSORT", uVar);
            }
            if (iP == B) {
                return a(iP, "TVSHOW", uVar);
            }
            if (iP == C) {
                return a(uVar, iD);
            }
            c.d.a.a.m.o.a("MetadataUtil", "Skipped unknown metadata entry: " + c.c(iP));
            return null;
        } finally {
            uVar.c(iD);
        }
    }

    public static j a(u uVar, int i2, String str) {
        while (true) {
            int iD = uVar.d();
            if (iD >= i2) {
                return null;
            }
            int iP = uVar.p();
            if (uVar.p() == c.Ga) {
                int iP2 = uVar.p();
                int iP3 = uVar.p();
                int i3 = iP - 16;
                byte[] bArr = new byte[i3];
                uVar.a(bArr, 0, i3);
                return new j(str, bArr, iP3, iP2);
            }
            uVar.c(iD + iP);
        }
    }

    private static w a(int i2, String str, u uVar) {
        int iP = uVar.p();
        if (uVar.p() == c.Ga) {
            uVar.d(8);
            return new w(str, null, uVar.f(iP - 16));
        }
        c.d.a.a.m.o.c("MetadataUtil", "Failed to parse text attribute: " + c.c(i2));
        return null;
    }

    private static c.d.a.a.g.b.k a(int i2, u uVar) {
        int iP = uVar.p();
        if (uVar.p() == c.Ga) {
            uVar.d(8);
            String strF = uVar.f(iP - 16);
            return new c.d.a.a.g.b.k("und", strF, strF);
        }
        c.d.a.a.m.o.c("MetadataUtil", "Failed to parse comment attribute: " + c.c(i2));
        return null;
    }

    private static c.d.a.a.g.b.o a(int i2, String str, u uVar, boolean z2, boolean z3) {
        int iD = d(uVar);
        if (z3) {
            iD = Math.min(1, iD);
        }
        if (iD >= 0) {
            if (z2) {
                return new w(str, null, Integer.toString(iD));
            }
            return new c.d.a.a.g.b.k("und", str, Integer.toString(iD));
        }
        c.d.a.a.m.o.c("MetadataUtil", "Failed to parse uint8 attribute: " + c.c(i2));
        return null;
    }

    private static w b(int i2, String str, u uVar) {
        int iP = uVar.p();
        if (uVar.p() == c.Ga && iP >= 22) {
            uVar.d(10);
            int i3 = uVar.i();
            if (i3 > 0) {
                String str2 = "" + i3;
                int i4 = uVar.i();
                if (i4 > 0) {
                    str2 = str2 + "/" + i4;
                }
                return new w(str, null, str2);
            }
        }
        c.d.a.a.m.o.c("MetadataUtil", "Failed to parse index/count attribute: " + c.c(i2));
        return null;
    }

    private static w b(u uVar) {
        int iD = d(uVar);
        String str = (iD <= 0 || iD > D.length) ? null : D[iD - 1];
        if (str != null) {
            return new w("TCON", null, str);
        }
        c.d.a.a.m.o.c("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static c.d.a.a.g.b.c c(u uVar) {
        int iP = uVar.p();
        if (uVar.p() == c.Ga) {
            int iB = c.b(uVar.p());
            String str = iB == 13 ? "image/jpeg" : iB == 14 ? "image/png" : null;
            if (str == null) {
                c.d.a.a.m.o.c("MetadataUtil", "Unrecognized cover art flags: " + iB);
                return null;
            }
            uVar.d(4);
            byte[] bArr = new byte[iP - 16];
            uVar.a(bArr, 0, bArr.length);
            return new c.d.a.a.g.b.c(str, null, 3, bArr);
        }
        c.d.a.a.m.o.c("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    private static c.d.a.a.g.b.o a(u uVar, int i2) {
        String strF = null;
        String strF2 = null;
        int i3 = -1;
        int i4 = -1;
        while (uVar.d() < i2) {
            int iD = uVar.d();
            int iP = uVar.p();
            int iP2 = uVar.p();
            uVar.d(4);
            if (iP2 == c.Ea) {
                strF = uVar.f(iP - 12);
            } else if (iP2 == c.Fa) {
                strF2 = uVar.f(iP - 12);
            } else {
                if (iP2 == c.Ga) {
                    i3 = iD;
                    i4 = iP;
                }
                uVar.d(iP - 12);
            }
        }
        if (strF == null || strF2 == null || i3 == -1) {
            return null;
        }
        uVar.c(i3);
        uVar.d(16);
        return new c.d.a.a.g.b.q(strF, strF2, uVar.f(i4 - 16));
    }

    private static int d(u uVar) {
        uVar.d(4);
        if (uVar.p() == c.Ga) {
            uVar.d(8);
            return uVar.h();
        }
        c.d.a.a.m.o.c("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
