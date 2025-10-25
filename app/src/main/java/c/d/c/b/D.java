package c.d.c.b;

import c.d.c.b.a.ia;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes.dex */
public abstract class D {
    public static c.d.c.u a(c.d.c.d.b bVar) {
        boolean z;
        try {
            try {
                bVar.g();
                z = false;
                try {
                    return ia.X.a(bVar);
                } catch (EOFException e2) {
                    e = e2;
                    if (z) {
                        return c.d.c.w.f4322a;
                    }
                    throw new c.d.c.C(e);
                }
            } catch (c.d.c.d.e e3) {
                throw new c.d.c.C(e3);
            } catch (IOException e4) {
                throw new c.d.c.v(e4);
            } catch (NumberFormatException e5) {
                throw new c.d.c.C(e5);
            }
        } catch (EOFException e6) {
            e = e6;
            z = true;
        }
    }

    public static void a(c.d.c.u uVar, c.d.c.d.d dVar) {
        ia.X.a(dVar, uVar);
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    private static final class a extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f4110a;

        /* renamed from: b, reason: collision with root package name */
        private final C0049a f4111b = new C0049a();

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        a(Appendable appendable) {
            this.f4110a = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) throws IOException {
            this.f4111b.f4112a = cArr;
            this.f4110a.append(this.f4111b, i2, i3 + i2);
        }

        @Override // java.io.Writer
        public void write(int i2) throws IOException {
            this.f4110a.append((char) i2);
        }

        /* renamed from: c.d.c.b.D$a$a, reason: collision with other inner class name */
        static class C0049a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            char[] f4112a;

            C0049a() {
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f4112a.length;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i2) {
                return this.f4112a[i2];
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i2, int i3) {
                return new String(this.f4112a, i2, i3 - i2);
            }
        }
    }
}
