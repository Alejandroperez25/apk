package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0470z {

    /* renamed from: a, reason: collision with root package name */
    private int f5586a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, c.d.a.b.h.i<Void>> f5587b = new b.c.b();

    /* renamed from: c, reason: collision with root package name */
    private final C0466v f5588c;

    C0470z(C0466v c0466v) {
        this.f5588c = c0466v;
    }

    final synchronized c.d.a.b.h.h<Void> a(String str) {
        String strA;
        c.d.a.b.h.i<Void> iVar;
        synchronized (this.f5588c) {
            strA = this.f5588c.a();
            C0466v c0466v = this.f5588c;
            StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 1 + String.valueOf(str).length());
            sb.append(strA);
            sb.append(",");
            sb.append(str);
            c0466v.a(sb.toString());
        }
        iVar = new c.d.a.b.h.i<>();
        this.f5587b.put(Integer.valueOf(this.f5586a + (TextUtils.isEmpty(strA) ? 0 : strA.split(",").length - 1)), iVar);
        return iVar.a();
    }

    final synchronized boolean a() {
        return b() != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (com.google.firebase.iid.FirebaseInstanceId.b() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        android.util.Log.d("FirebaseInstanceId", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean a(com.google.firebase.iid.FirebaseInstanceId r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            java.lang.String r0 = r4.b()     // Catch: java.lang.Throwable -> L42
            r1 = 1
            if (r0 != 0) goto L17
            boolean r5 = com.google.firebase.iid.FirebaseInstanceId.b()     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L15
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r5, r0)     // Catch: java.lang.Throwable -> L42
        L15:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            return r1
        L17:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            boolean r2 = a(r5, r0)
            if (r2 != 0) goto L20
            r5 = 0
            return r5
        L20:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, c.d.a.b.h.i<java.lang.Void>> r2 = r4.f5587b     // Catch: java.lang.Throwable -> L3f
            int r3 = r4.f5586a     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r2.remove(r3)     // Catch: java.lang.Throwable -> L3f
            c.d.a.b.h.i r2 = (c.d.a.b.h.i) r2     // Catch: java.lang.Throwable -> L3f
            r4.b(r0)     // Catch: java.lang.Throwable -> L3f
            int r0 = r4.f5586a     // Catch: java.lang.Throwable -> L3f
            int r0 = r0 + r1
            r4.f5586a = r0     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L0
            r0 = 0
            r2.a(r0)
            goto L0
        L3f:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            throw r5
        L42:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C0470z.a(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    private final String b() {
        String strA;
        synchronized (this.f5588c) {
            strA = this.f5588c.a();
        }
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        String[] strArrSplit = strA.split(",");
        if (strArrSplit.length <= 1 || TextUtils.isEmpty(strArrSplit[1])) {
            return null;
        }
        return strArrSplit[1];
    }

    private final synchronized boolean b(String str) {
        synchronized (this.f5588c) {
            String strA = this.f5588c.a();
            String strValueOf = String.valueOf(",");
            String strValueOf2 = String.valueOf(str);
            if (!strA.startsWith(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf))) {
                return false;
            }
            String strValueOf3 = String.valueOf(",");
            String strValueOf4 = String.valueOf(str);
            this.f5588c.a(strA.substring((strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3)).length()));
            return true;
        }
    }

    private static boolean a(FirebaseInstanceId firebaseInstanceId, String str) throws IOException {
        String[] strArrSplit = str.split("!");
        if (strArrSplit.length == 2) {
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[1];
            char c2 = 65535;
            try {
                int iHashCode = str2.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str2.equals("U")) {
                        c2 = 1;
                    }
                } else if (str2.equals("S")) {
                    c2 = 0;
                }
                switch (c2) {
                    case 0:
                        firebaseInstanceId.b(str3);
                        if (FirebaseInstanceId.b()) {
                            Log.d("FirebaseInstanceId", "subscribe operation succeeded");
                            break;
                        }
                        break;
                    case 1:
                        firebaseInstanceId.c(str3);
                        if (FirebaseInstanceId.b()) {
                            Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
                            break;
                        }
                        break;
                }
            } catch (IOException e2) {
                if ("SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 53);
                    sb.append("Topic operation failed: ");
                    sb.append(message);
                    sb.append(". Will retry Topic operation.");
                    Log.e("FirebaseInstanceId", sb.toString());
                    return false;
                }
                if (e2.getMessage() == null) {
                    Log.e("FirebaseInstanceId", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                throw e2;
            }
        }
        return true;
    }
}
