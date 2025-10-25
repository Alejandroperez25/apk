package i.a.a;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class g extends c {

    /* renamed from: a, reason: collision with root package name */
    private static SoundPool f5932a = j();

    /* renamed from: b, reason: collision with root package name */
    private static Map<Integer, g> f5933b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, List<g>> f5934c;

    /* renamed from: d, reason: collision with root package name */
    private final b f5935d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5936e;

    /* renamed from: f, reason: collision with root package name */
    private String f5937f;

    /* renamed from: i, reason: collision with root package name */
    private Integer f5940i;
    private Integer j;

    /* renamed from: g, reason: collision with root package name */
    private float f5938g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f5939h = 1.0f;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private String o = "speakers";

    @Override // i.a.a.c
    void a(boolean z, boolean z2, Context context) {
    }

    @Override // i.a.a.c
    boolean g() {
        return false;
    }

    static {
        f5932a.setOnLoadCompleteListener(new f());
        f5933b = Collections.synchronizedMap(new HashMap());
        f5934c = Collections.synchronizedMap(new HashMap());
    }

    g(b bVar, String str) {
        this.f5935d = bVar;
        this.f5936e = str;
    }

    @Override // i.a.a.c
    String a() {
        return this.f5936e;
    }

    @Override // i.a.a.c
    void a(Context context) {
        if (!this.n) {
            l();
        }
        this.k = true;
    }

    @Override // i.a.a.c
    void b() {
        if (this.k) {
            f5932a.stop(this.j.intValue());
            this.k = false;
        }
        this.l = false;
    }

    @Override // i.a.a.c
    void c() {
        b();
        if (this.f5940i == null || this.f5937f == null) {
            return;
        }
        synchronized (f5934c) {
            List<g> list = f5934c.get(this.f5937f);
            if (list != null) {
                if (list.size() == 1 && list.get(0) == this) {
                    f5934c.remove(this.f5937f);
                    f5932a.unload(this.f5940i.intValue());
                    f5933b.remove(this.f5940i);
                    this.f5940i = null;
                    Log.d("WSP", "Unloaded soundId " + this.f5940i);
                } else {
                    list.remove(this);
                }
            }
        }
    }

    @Override // i.a.a.c
    void d() {
        if (this.k) {
            f5932a.pause(this.j.intValue());
            this.k = false;
            this.l = true;
        }
    }

    @Override // i.a.a.c
    void a(String str, boolean z, Context context) {
        if (this.f5937f == null || !this.f5937f.equals(str)) {
            if (this.f5940i != null) {
                c();
            }
            synchronized (f5934c) {
                this.f5937f = str;
                List<g> list = f5934c.get(str);
                if (list != null) {
                    g gVar = list.get(0);
                    this.f5940i = gVar.f5940i;
                    this.n = gVar.n;
                    list.add(this);
                    Log.d("WSP", "Reusing soundId" + this.f5940i + " for " + str + " is loading=" + this.n + " " + this);
                    return;
                }
                this.n = true;
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f5940i = Integer.valueOf(f5932a.load(a(str, z), 1));
                Log.d("WSP", "time to call load() for " + str + ": " + (System.currentTimeMillis() - jCurrentTimeMillis) + " player=" + this);
                f5933b.put(this.f5940i, this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(this);
                f5934c.put(str, arrayList);
            }
        }
    }

    @Override // i.a.a.c
    void a(double d2) {
        this.f5938g = (float) d2;
        if (this.k) {
            f5932a.setVolume(this.j.intValue(), this.f5938g, this.f5938g);
        }
    }

    @Override // i.a.a.c
    int b(double d2) {
        this.f5939h = (float) d2;
        if (this.j == null) {
            return 0;
        }
        f5932a.setRate(this.j.intValue(), this.f5939h);
        return 1;
    }

    @Override // i.a.a.c
    void a(d dVar) {
        this.m = dVar == d.LOOP;
        if (this.k) {
            f5932a.setLoop(this.j.intValue(), this.m ? -1 : 0);
        }
    }

    @Override // i.a.a.c
    int e() {
        throw b("getDuration");
    }

    @Override // i.a.a.c
    int f() {
        throw b("getCurrentPosition");
    }

    @Override // i.a.a.c
    void a(String str, Context context) {
        throw b("setPlayingRoute");
    }

    @Override // i.a.a.c
    void a(int i2) {
        throw b("seek");
    }

    private static SoundPool j() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(Integer.MIN_VALUE).setUsage(14).build()).setMaxStreams(100).build();
        }
        return k();
    }

    private static SoundPool k() {
        return new SoundPool(1, 3, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        b(this.f5939h);
        if (this.l) {
            f5932a.resume(this.j.intValue());
            this.l = false;
        } else {
            this.j = Integer.valueOf(f5932a.play(this.f5940i.intValue(), this.f5938g, this.f5938g, 0, this.m ? -1 : 0, 1.0f));
        }
    }

    private String a(String str, boolean z) {
        return z ? str : a(str).getAbsolutePath();
    }

    private File a(String str) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                byte[] bArrA = a(URI.create(str).toURL());
                File fileCreateTempFile = File.createTempFile("sound", "");
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileCreateTempFile);
                try {
                    fileOutputStream2.write(bArrA);
                    fileCreateTempFile.deleteOnExit();
                    try {
                        fileOutputStream2.close();
                        return fileCreateTempFile;
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            throw new RuntimeException(e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private byte[] a(URL url) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = null;
        try {
            try {
                byte[] bArr = new byte[4096];
                InputStream inputStreamOpenStream = url.openStream();
                while (true) {
                    try {
                        int i2 = inputStreamOpenStream.read(bArr);
                        if (i2 > 0) {
                            byteArrayOutputStream.write(bArr, 0, i2);
                        } else {
                            try {
                                inputStreamOpenStream.close();
                                return byteArrayOutputStream.toByteArray();
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        inputStream = inputStreamOpenStream;
                        throw new RuntimeException(e);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStreamOpenStream;
                        try {
                            inputStream.close();
                            throw th;
                        } catch (IOException e4) {
                            throw new RuntimeException(e4);
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    private UnsupportedOperationException b(String str) {
        return new UnsupportedOperationException("LOW_LATENCY mode does not support: " + str);
    }
}
