package c.d.a.a.l;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class w extends AbstractC0164g {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f3472e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f3473f;

    /* renamed from: g, reason: collision with root package name */
    private long f3474g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3475h;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public w() {
        super(false);
    }

    @Override // c.d.a.a.l.k
    public long a(n nVar) throws IOException {
        try {
            this.f3473f = nVar.f3417a;
            b(nVar);
            this.f3472e = new RandomAccessFile(nVar.f3417a.getPath(), "r");
            this.f3472e.seek(nVar.f3422f);
            this.f3474g = nVar.f3423g == -1 ? this.f3472e.length() - nVar.f3422f : nVar.f3423g;
            if (this.f3474g < 0) {
                throw new EOFException();
            }
            this.f3475h = true;
            c(nVar);
            return this.f3474g;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // c.d.a.a.l.k
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.f3474g == 0) {
            return -1;
        }
        try {
            int i4 = this.f3472e.read(bArr, i2, (int) Math.min(this.f3474g, i3));
            if (i4 > 0) {
                this.f3474g -= i4;
                a(i4);
            }
            return i4;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // c.d.a.a.l.k
    public Uri b() {
        return this.f3473f;
    }

    @Override // c.d.a.a.l.k
    public void close() {
        this.f3473f = null;
        try {
            try {
                if (this.f3472e != null) {
                    this.f3472e.close();
                }
            } catch (IOException e2) {
                throw new a(e2);
            }
        } finally {
            this.f3472e = null;
            if (this.f3475h) {
                this.f3475h = false;
                c();
            }
        }
    }
}
