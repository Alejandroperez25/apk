package c.g.a;

import b.a.a$i;
import c.d.d.AbstractC0280f;
import c.g.a.C0297k$a;
import c.g.a.C0319k$w;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

/* loaded from: classes.dex */
abstract class a {
    static C0297k$a a(byte[] bArr) {
        long j;
        int i2;
        UUID uuidFromString;
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).asReadOnlyBuffer().order(ByteOrder.LITTLE_ENDIAN);
        C0297k$a.a aVarL = C0297k$a.l();
        boolean z = false;
        while (true) {
            int i3 = byteBufferOrder.get() & 255;
            if (i3 != 0) {
                if (i3 > byteBufferOrder.remaining()) {
                    throw new ArrayIndexOutOfBoundsException("Not enough data.");
                }
                int i4 = byteBufferOrder.get() & 255;
                int i5 = i3 - 1;
                if (i4 != 22) {
                    if (i4 != 255) {
                        switch (i4) {
                            case 8:
                            case 9:
                                if (z) {
                                    byteBufferOrder.position(byteBufferOrder.position() + i5);
                                    break;
                                } else {
                                    byte[] bArr2 = new byte[i5];
                                    byteBufferOrder.get(bArr2);
                                    try {
                                        aVarL.a(new String(bArr2, "UTF-8"));
                                        if (i4 == 9) {
                                            z = true;
                                            break;
                                        } else {
                                            continue;
                                        }
                                    } catch (UnsupportedEncodingException e2) {
                                        throw new RuntimeException(e2);
                                    }
                                }
                            case 10:
                                C0319k$w.a aVarL2 = C0319k$w.l();
                                aVarL2.a(byteBufferOrder.get());
                                aVarL.a(aVarL2);
                                continue;
                            default:
                                switch (i4) {
                                    case a$i.AppCompatTheme_activityChooserViewStyle /* 32 */:
                                    case a$i.AppCompatTheme_alertDialogButtonGroupStyle /* 33 */:
                                        break;
                                    default:
                                        byteBufferOrder.position(byteBufferOrder.position() + i5);
                                        continue;
                                }
                        }
                    } else {
                        if (i5 < 2) {
                            throw new ArrayIndexOutOfBoundsException("Not enough data for Manufacturer specific data.");
                        }
                        short s = byteBufferOrder.getShort();
                        int i6 = i5 - 2;
                        if (i6 > 0) {
                            byte[] bArr3 = new byte[i6];
                            byteBufferOrder.get(bArr3);
                            aVarL.a(s, AbstractC0280f.a(bArr3));
                        }
                    }
                }
                if (i4 == 22 || i4 == 32) {
                    if (i4 == 22) {
                        j = byteBufferOrder.getShort() & 65535;
                        i2 = i5 - 2;
                    } else {
                        j = byteBufferOrder.getInt() & (-1);
                        i2 = i5 - 4;
                    }
                    uuidFromString = UUID.fromString(String.format("%08x-0000-1000-8000-00805f9b34fb", Long.valueOf(j)));
                } else {
                    uuidFromString = new UUID(byteBufferOrder.getLong(), byteBufferOrder.getLong());
                    i2 = i5 - 16;
                }
                byte[] bArr4 = new byte[i2];
                byteBufferOrder.get(bArr4);
                aVarL.a(uuidFromString.toString(), AbstractC0280f.a(bArr4));
            } else {
                return aVarL.f();
            }
        }
    }
}
