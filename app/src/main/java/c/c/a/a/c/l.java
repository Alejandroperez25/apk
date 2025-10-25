package c.c.a.a.c;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class l extends j {

    /* renamed from: b, reason: collision with root package name */
    private int f1403b;

    /* renamed from: c, reason: collision with root package name */
    private a f1404c;

    @Override // c.c.a.a.c.j
    protected byte[] b() {
        return null;
    }

    @Override // c.c.a.a.c.j
    protected int c() {
        return 0;
    }

    public String toString() {
        return "RTMP Set Peer Bandwidth";
    }

    public enum a {
        HARD(0),
        SOFT(1),
        DYNAMIC(2);


        /* renamed from: d, reason: collision with root package name */
        private static final Map<Integer, a> f1408d = new HashMap();

        /* renamed from: f, reason: collision with root package name */
        private int f1410f;

        static {
            for (a aVar : values()) {
                f1408d.put(Integer.valueOf(aVar.a()), aVar);
            }
        }

        a(int i2) {
            this.f1410f = i2;
        }

        public int a() {
            return this.f1410f;
        }

        public static a a(int i2) {
            return f1408d.get(Integer.valueOf(i2));
        }
    }

    public l(i iVar) {
        super(iVar);
    }

    public int d() {
        return this.f1403b;
    }

    @Override // c.c.a.a.c.j
    public void a(InputStream inputStream) {
        this.f1403b = c.c.a.a.d.a(inputStream);
        this.f1404c = a.a(inputStream.read());
    }

    @Override // c.c.a.a.c.j
    protected void a(OutputStream outputStream) throws IOException {
        c.c.a.a.d.a(outputStream, this.f1403b);
        outputStream.write(this.f1404c.a());
    }
}
