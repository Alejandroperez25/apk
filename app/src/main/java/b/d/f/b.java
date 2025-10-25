package b.d.f;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public class b extends Writer {

    /* renamed from: a, reason: collision with root package name */
    private final String f1114a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f1115b = new StringBuilder(128);

    public b(String str) {
        this.f1114a = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                a();
            } else {
                this.f1115b.append(c2);
            }
        }
    }

    private void a() {
        if (this.f1115b.length() > 0) {
            Log.d(this.f1114a, this.f1115b.toString());
            this.f1115b.delete(0, this.f1115b.length());
        }
    }
}
