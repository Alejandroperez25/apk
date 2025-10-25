package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static String f5122a;

    /* renamed from: b, reason: collision with root package name */
    private static int f5123b;

    public static String a() {
        if (f5122a == null) {
            if (f5123b == 0) {
                f5123b = Process.myPid();
            }
            f5122a = a(f5123b);
        }
        return f5122a;
    }

    private static String a(int i2) throws Throwable {
        BufferedReader bufferedReaderA;
        BufferedReader bufferedReader = null;
        if (i2 <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i2);
            sb.append("/cmdline");
            bufferedReaderA = a(sb.toString());
            try {
                String strTrim = bufferedReaderA.readLine().trim();
                h.a(bufferedReaderA);
                return strTrim;
            } catch (IOException unused) {
                h.a(bufferedReaderA);
                return null;
            } catch (Throwable th) {
                bufferedReader = bufferedReaderA;
                th = th;
                h.a(bufferedReader);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReaderA = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static BufferedReader a(String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
