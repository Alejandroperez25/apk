package c.d.a.a.e.e;

import c.d.a.a.m.u;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class m {
    public static byte[] a(UUID uuid, byte[] bArr) {
        return a(uuid, null, bArr);
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(c.U);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static UUID a(byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        return aVarB.f1970a;
    }

    private static a b(byte[] bArr) {
        u uVar = new u(bArr);
        if (uVar.c() < 32) {
            return null;
        }
        uVar.c(0);
        if (uVar.p() != uVar.b() + 4 || uVar.p() != c.U) {
            return null;
        }
        int iA = c.a(uVar.p());
        if (iA > 1) {
            c.d.a.a.m.o.c("PsshAtomUtil", "Unsupported pssh version: " + iA);
            return null;
        }
        UUID uuid = new UUID(uVar.r(), uVar.r());
        if (iA == 1) {
            uVar.d(uVar.v() * 16);
        }
        int iV = uVar.v();
        if (iV != uVar.b()) {
            return null;
        }
        byte[] bArr2 = new byte[iV];
        uVar.a(bArr2, 0, iV);
        return new a(uuid, iA, bArr2);
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f1970a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1971b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f1972c;

        public a(UUID uuid, int i2, byte[] bArr) {
            this.f1970a = uuid;
            this.f1971b = i2;
            this.f1972c = bArr;
        }
    }
}
