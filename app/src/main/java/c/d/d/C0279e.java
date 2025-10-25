package c.d.d;

import c.d.d.AbstractC0280f;
import java.util.NoSuchElementException;

/* renamed from: c.d.d.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0279e implements AbstractC0280f.d {

    /* renamed from: a, reason: collision with root package name */
    private int f4387a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f4388b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC0280f f4389c;

    C0279e(AbstractC0280f abstractC0280f) {
        this.f4389c = abstractC0280f;
        this.f4388b = this.f4389c.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4387a < this.f4388b;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Byte next() {
        return Byte.valueOf(a());
    }

    public byte a() {
        try {
            AbstractC0280f abstractC0280f = this.f4389c;
            int i2 = this.f4387a;
            this.f4387a = i2 + 1;
            return abstractC0280f.b(i2);
        } catch (IndexOutOfBoundsException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
