package c.d.d;

import c.d.d.AbstractC0275a;
import c.d.d.AbstractC0275a.AbstractC0051a;
import c.d.d.x;
import java.io.IOException;

/* renamed from: c.d.d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0275a<MessageType extends AbstractC0275a<MessageType, BuilderType>, BuilderType extends AbstractC0051a<MessageType, BuilderType>> implements x {

    /* renamed from: a, reason: collision with root package name */
    protected int f4384a = 0;

    public byte[] d() {
        try {
            byte[] bArr = new byte[c()];
            AbstractC0283i abstractC0283iA = AbstractC0283i.a(bArr);
            a(abstractC0283iA);
            abstractC0283iA.d();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(a("byte array"), e2);
        }
    }

    private String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: c.d.d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0051a<MessageType extends AbstractC0275a<MessageType, BuilderType>, BuilderType extends AbstractC0051a<MessageType, BuilderType>> implements x.a {
        protected abstract BuilderType a(MessageType messagetype);

        public abstract BuilderType b(C0281g c0281g, C0285k c0285k);

        @Override // c.d.d.x.a
        public /* bridge */ /* synthetic */ x.a a(x xVar) {
            c(xVar);
            return this;
        }

        public BuilderType a(C0281g c0281g) {
            b(c0281g, C0285k.b());
            return this;
        }

        public BuilderType a(byte[] bArr) throws C0291q {
            a(bArr, 0, bArr.length);
            return this;
        }

        public BuilderType a(byte[] bArr, int i2, int i3) throws C0291q {
            try {
                C0281g c0281gA = C0281g.a(bArr, i2, i3);
                a(c0281gA);
                c0281gA.b(0);
                return this;
            } catch (C0291q e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException(a("byte array"), e3);
            }
        }

        public BuilderType c(x xVar) {
            if (!a().getClass().isInstance(xVar)) {
                throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            a((AbstractC0051a<MessageType, BuilderType>) xVar);
            return this;
        }

        private String a(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        protected static I b(x xVar) {
            return new I(xVar);
        }
    }
}
