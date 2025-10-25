package com.google.android.gms.common.internal;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final C0350k f5059a = new C0350k("LibraryVersion", "");

    /* renamed from: b, reason: collision with root package name */
    private static r f5060b = new r();

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f5061c = new ConcurrentHashMap<>();

    public static r a() {
        return f5060b;
    }

    protected r() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.t.a(r9, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r8.f5061c
            boolean r0 = r0.containsKey(r9)
            if (r0 == 0) goto L16
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r8.f5061c
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L16:
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.lang.String r2 = "/%s.properties"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.io.IOException -> L8d
            r4 = 0
            r3[r4] = r9     // Catch: java.io.IOException -> L8d
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch: java.io.IOException -> L8d
            java.lang.Class<com.google.android.gms.common.internal.r> r3 = com.google.android.gms.common.internal.r.class
            java.io.InputStream r2 = r3.getResourceAsStream(r2)     // Catch: java.io.IOException -> L8d
            if (r2 == 0) goto L6e
            r0.load(r2)     // Catch: java.io.IOException -> L8d
            java.lang.String r2 = "version"
            java.lang.String r0 = r0.getProperty(r2, r1)     // Catch: java.io.IOException -> L8d
            com.google.android.gms.common.internal.k r1 = com.google.android.gms.common.internal.r.f5059a     // Catch: java.io.IOException -> L69
            java.lang.String r2 = "LibraryVersion"
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch: java.io.IOException -> L69
            int r3 = r3.length()     // Catch: java.io.IOException -> L69
            int r3 = r3 + 12
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> L69
            int r4 = r4.length()     // Catch: java.io.IOException -> L69
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L69
            r4.<init>(r3)     // Catch: java.io.IOException -> L69
            r4.append(r9)     // Catch: java.io.IOException -> L69
            java.lang.String r3 = " version is "
            r4.append(r3)     // Catch: java.io.IOException -> L69
            r4.append(r0)     // Catch: java.io.IOException -> L69
            java.lang.String r3 = r4.toString()     // Catch: java.io.IOException -> L69
            r1.b(r2, r3)     // Catch: java.io.IOException -> L69
            r1 = r0
            goto Lac
        L69:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L8e
        L6e:
            com.google.android.gms.common.internal.k r0 = com.google.android.gms.common.internal.r.f5059a     // Catch: java.io.IOException -> L8d
            java.lang.String r2 = "LibraryVersion"
            java.lang.String r3 = "Failed to get app version for libraryName: "
            java.lang.String r4 = java.lang.String.valueOf(r9)     // Catch: java.io.IOException -> L8d
            int r5 = r4.length()     // Catch: java.io.IOException -> L8d
            if (r5 == 0) goto L83
            java.lang.String r3 = r3.concat(r4)     // Catch: java.io.IOException -> L8d
            goto L89
        L83:
            java.lang.String r4 = new java.lang.String     // Catch: java.io.IOException -> L8d
            r4.<init>(r3)     // Catch: java.io.IOException -> L8d
            r3 = r4
        L89:
            r0.c(r2, r3)     // Catch: java.io.IOException -> L8d
            goto Lac
        L8d:
            r0 = move-exception
        L8e:
            com.google.android.gms.common.internal.k r2 = com.google.android.gms.common.internal.r.f5059a
            java.lang.String r3 = "LibraryVersion"
            java.lang.String r4 = "Failed to get app version for libraryName: "
            java.lang.String r5 = java.lang.String.valueOf(r9)
            int r6 = r5.length()
            if (r6 == 0) goto La3
            java.lang.String r4 = r4.concat(r5)
            goto La9
        La3:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        La9:
            r2.a(r3, r4, r0)
        Lac:
            if (r1 != 0) goto Lb9
            java.lang.String r1 = "UNKNOWN"
            com.google.android.gms.common.internal.k r0 = com.google.android.gms.common.internal.r.f5059a
            java.lang.String r2 = "LibraryVersion"
            java.lang.String r3 = ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used"
            r0.a(r2, r3)
        Lb9:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r8.f5061c
            r0.put(r9, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.r.a(java.lang.String):java.lang.String");
    }
}
