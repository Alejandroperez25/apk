package c.d.a.a.j;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class b extends c.d.a.a.c.i<i, j, f> implements e {
    private final String n;

    protected abstract d a(byte[] bArr, int i2, boolean z);

    @Override // c.d.a.a.j.e
    public void a(long j) {
    }

    protected b(String str) {
        super(new i[2], new j[2]);
        this.n = str;
        a(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.a.a.c.i
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final i f() {
        return new i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.a.a.c.i
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final j g() {
        return new c(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.a.a.c.i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f a(Throwable th) {
        return new f("Unexpected decode error", th);
    }

    protected final void a(j jVar) {
        super.a((b) jVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.a.a.c.i
    public final f a(i iVar, j jVar, boolean z) {
        try {
            ByteBuffer byteBuffer = iVar.f1684c;
            jVar.a(iVar.f1685d, a(byteBuffer.array(), byteBuffer.limit(), z), iVar.f3272f);
            jVar.d(Integer.MIN_VALUE);
            return null;
        } catch (f e2) {
            return e2;
        }
    }
}
