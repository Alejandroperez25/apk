package f.a.a.a;

import f.a.a.a.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class s implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final s f5677a = new s(r.f5674a);

    /* renamed from: b, reason: collision with root package name */
    private final r f5678b;

    public s(r rVar) {
        this.f5678b = rVar;
    }

    @Override // f.a.a.a.p
    public ByteBuffer a(m mVar) {
        r.a aVar = new r.a();
        this.f5678b.a(aVar, mVar.f5663a);
        this.f5678b.a(aVar, mVar.f5664b);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // f.a.a.a.p
    public m a(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object objD = this.f5678b.d(byteBuffer);
        Object objD2 = this.f5678b.d(byteBuffer);
        if ((objD instanceof String) && !byteBuffer.hasRemaining()) {
            return new m((String) objD, objD2);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    @Override // f.a.a.a.p
    public ByteBuffer a(Object obj) {
        r.a aVar = new r.a();
        aVar.write(0);
        this.f5678b.a(aVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // f.a.a.a.p
    public ByteBuffer a(String str, String str2, Object obj) {
        r.a aVar = new r.a();
        aVar.write(1);
        this.f5678b.a(aVar, str);
        this.f5678b.a(aVar, str2);
        this.f5678b.a(aVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // f.a.a.a.p
    public Object b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        switch (byteBuffer.get()) {
            case 0:
                Object objD = this.f5678b.d(byteBuffer);
                if (!byteBuffer.hasRemaining()) {
                    return objD;
                }
            case 1:
                Object objD2 = this.f5678b.d(byteBuffer);
                Object objD3 = this.f5678b.d(byteBuffer);
                Object objD4 = this.f5678b.d(byteBuffer);
                if ((objD2 instanceof String) && ((objD3 == null || (objD3 instanceof String)) && !byteBuffer.hasRemaining())) {
                    throw new h((String) objD2, (String) objD3, objD4);
                }
            default:
                throw new IllegalArgumentException("Envelope corrupted");
        }
    }
}
