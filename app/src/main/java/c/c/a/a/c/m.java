package c.c.a.a.c;

import c.c.a.a.c.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class m extends j {

    /* renamed from: b, reason: collision with root package name */
    private a f1411b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f1412c;

    @Override // c.c.a.a.c.j
    protected byte[] b() {
        return null;
    }

    @Override // c.c.a.a.c.j
    protected int c() {
        return 0;
    }

    public enum a {
        STREAM_BEGIN(0),
        STREAM_EOF(1),
        STREAM_DRY(2),
        SET_BUFFER_LENGTH(3),
        STREAM_IS_RECORDED(4),
        PING_REQUEST(6),
        PONG_REPLY(7),
        BUFFER_EMPTY(31),
        BUFFER_READY(32);

        private static final Map<Integer, a> j = new HashMap();
        private int l;

        static {
            for (a aVar : values()) {
                j.put(Integer.valueOf(aVar.a()), aVar);
            }
        }

        a(int i2) {
            this.l = i2;
        }

        public int a() {
            return this.l;
        }

        public static a a(int i2) {
            return j.get(Integer.valueOf(i2));
        }
    }

    public m(i iVar) {
        super(iVar);
    }

    public m(c.c.a.a.b.a aVar) {
        super(new i(aVar.a(i.b.USER_CONTROL_MESSAGE) ? i.a.TYPE_2_RELATIVE_TIMESTAMP_ONLY : i.a.TYPE_0_FULL, 2, i.b.USER_CONTROL_MESSAGE));
    }

    public m(m mVar, c.c.a.a.b.a aVar) {
        this(a.PONG_REPLY, aVar);
        this.f1412c = mVar.f1412c;
    }

    public m(a aVar, c.c.a.a.b.a aVar2) {
        this(aVar2);
        this.f1411b = aVar;
    }

    public a d() {
        return this.f1411b;
    }

    public void a(int i2) {
        if (this.f1411b == a.SET_BUFFER_LENGTH) {
            throw new IllegalStateException("SET_BUFFER_LENGTH requires two event data values; use setEventData(int, int) instead");
        }
        this.f1412c = new int[]{i2};
    }

    public void a(int i2, int i3) {
        if (this.f1411b != a.SET_BUFFER_LENGTH) {
            throw new IllegalStateException("User control type " + this.f1411b + " requires only one event data value; use setEventData(int) instead");
        }
        this.f1412c = new int[]{i2, i3};
    }

    @Override // c.c.a.a.c.j
    public void a(InputStream inputStream) {
        this.f1411b = a.a(c.c.a.a.d.c(inputStream));
        if (this.f1411b == a.SET_BUFFER_LENGTH) {
            a(c.c.a.a.d.a(inputStream), c.c.a.a.d.a(inputStream));
        } else {
            a(c.c.a.a.d.a(inputStream));
        }
    }

    @Override // c.c.a.a.c.j
    protected void a(OutputStream outputStream) throws IOException {
        c.c.a.a.d.c(outputStream, this.f1411b.a());
        c.c.a.a.d.a(outputStream, this.f1412c[0]);
        if (this.f1411b == a.SET_BUFFER_LENGTH) {
            c.c.a.a.d.a(outputStream, this.f1412c[1]);
        }
    }

    public String toString() {
        return "RTMP User Control (type: " + this.f1411b + ", event data: " + this.f1412c + ")";
    }
}
