package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f5136a = null;

    /* renamed from: b, reason: collision with root package name */
    private static i f5137b = null;

    /* renamed from: c, reason: collision with root package name */
    private static k f5138c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f5139d = null;

    /* renamed from: e, reason: collision with root package name */
    private static int f5140e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal<c> f5141f = new ThreadLocal<>();

    /* renamed from: g, reason: collision with root package name */
    private static final b.a f5142g = new com.google.android.gms.dynamite.a();

    /* renamed from: h, reason: collision with root package name */
    public static final b f5143h = new com.google.android.gms.dynamite.b();

    /* renamed from: i, reason: collision with root package name */
    public static final b f5144i = new com.google.android.gms.dynamite.c();
    public static final b j = new com.google.android.gms.dynamite.d();
    public static final b k = new e();
    public static final b l = new f();
    private static final b m = new g();
    private final Context n;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public interface b {

        public interface a {
            int a(Context context, String str);

            int a(Context context, String str, boolean z);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0065b {

            /* renamed from: a, reason: collision with root package name */
            public int f5145a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f5146b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f5147c = 0;
        }

        C0065b a(Context context, String str, a aVar);
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public Cursor f5148a;

        private c() {
        }

        /* synthetic */ c(com.google.android.gms.dynamite.a aVar) {
            this();
        }
    }

    public static DynamiteModule a(Context context, b bVar, String str) {
        c cVar = f5141f.get();
        com.google.android.gms.dynamite.a aVar = null;
        c cVar2 = new c(aVar);
        f5141f.set(cVar2);
        try {
            b.C0065b c0065bA = bVar.a(context, str, f5142g);
            int i2 = c0065bA.f5145a;
            int i3 = c0065bA.f5146b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            if (c0065bA.f5147c == 0 || ((c0065bA.f5147c == -1 && c0065bA.f5145a == 0) || (c0065bA.f5147c == 1 && c0065bA.f5146b == 0))) {
                int i4 = c0065bA.f5145a;
                int i5 = c0065bA.f5146b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i4);
                sb2.append(" and remote version is ");
                sb2.append(i5);
                sb2.append(".");
                throw new a(sb2.toString(), aVar);
            }
            if (c0065bA.f5147c == -1) {
                DynamiteModule dynamiteModuleC = c(context, str);
                if (cVar2.f5148a != null) {
                    cVar2.f5148a.close();
                }
                f5141f.set(cVar);
                return dynamiteModuleC;
            }
            if (c0065bA.f5147c != 1) {
                int i6 = c0065bA.f5147c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i6);
                throw new a(sb3.toString(), aVar);
            }
            try {
                DynamiteModule dynamiteModuleA = a(context, str, c0065bA.f5146b);
                if (cVar2.f5148a != null) {
                    cVar2.f5148a.close();
                }
                f5141f.set(cVar);
                return dynamiteModuleA;
            } catch (a e2) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to load remote module: ".concat(strValueOf) : new String("Failed to load remote module: "));
                if (c0065bA.f5145a == 0 || bVar.a(context, str, new d(c0065bA.f5145a, 0)).f5147c != -1) {
                    throw new a("Remote load failed. No local fallback found.", e2, aVar);
                }
                DynamiteModule dynamiteModuleC2 = c(context, str);
                if (cVar2.f5148a != null) {
                    cVar2.f5148a.close();
                }
                f5141f.set(cVar);
                return dynamiteModuleC2;
            }
        } catch (Throwable th) {
            if (cVar2.f5148a != null) {
                cVar2.f5148a.close();
            }
            f5141f.set(cVar);
            throw th;
        }
    }

    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ a(String str, com.google.android.gms.dynamite.a aVar) {
            this(str);
        }

        /* synthetic */ a(String str, Throwable th, com.google.android.gms.dynamite.a aVar) {
            this(str, th);
        }
    }

    private static class d implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final int f5149a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5150b = 0;

        public d(int i2, int i3) {
            this.f5149a = i2;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
        public final int a(Context context, String str, boolean z) {
            return 0;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
        public final int a(Context context, String str) {
            return this.f5149a;
        }
    }

    public static int a(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (!declaredField.get(null).equals(str)) {
                String strValueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 51 + String.valueOf(str).length());
                sb2.append("Module descriptor id '");
                sb2.append(strValueOf);
                sb2.append("' didn't match expected id '");
                sb2.append(str);
                sb2.append("'");
                Log.e("DynamiteModule", sb2.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String strValueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", strValueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(strValueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int a(Context context, String str, boolean z) {
        Class<?> clsLoadClass;
        Field declaredField;
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool2 = f5136a;
                if (bool2 == null) {
                    try {
                        clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                        declaredField = clsLoadClass.getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String strValueOf = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(strValueOf);
                        Log.w("DynamiteModule", sb.toString());
                        bool2 = Boolean.FALSE;
                    }
                    synchronized (clsLoadClass) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    a(classLoader);
                                } catch (a unused) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        } else {
                            try {
                                int iC = c(context, str, z);
                                if (f5139d != null && !f5139d.isEmpty()) {
                                    h hVar = new h(f5139d, ClassLoader.getSystemClassLoader());
                                    a(hVar);
                                    declaredField.set(null, hVar);
                                    f5136a = Boolean.TRUE;
                                    return iC;
                                }
                                return iC;
                            } catch (a unused2) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            }
                        }
                        bool2 = bool;
                        f5136a = bool2;
                    }
                }
                if (bool2.booleanValue()) {
                    try {
                        return c(context, str, z);
                    } catch (a e3) {
                        String strValueOf2 = String.valueOf(e3.getMessage());
                        Log.w("DynamiteModule", strValueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf2) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                return b(context, str, z);
            }
        } catch (Throwable th) {
            com.google.android.gms.common.util.e.a(context, th);
            throw th;
        }
    }

    private static int b(Context context, String str, boolean z) {
        i iVarA = a(context);
        if (iVarA == null) {
            return 0;
        }
        try {
            if (iVarA.f() >= 2) {
                return iVarA.a(c.d.a.b.c.b.a(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return iVarA.b(c.d.a.b.c.b.a(context), str, z);
        } catch (RemoteException e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int c(android.content.Context r8, java.lang.String r9, boolean r10) throws java.lang.Throwable {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            if (r10 == 0) goto La
            java.lang.String r8 = "api_force_staging"
            goto Lc
        La:
            java.lang.String r8 = "api"
        Lc:
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            int r10 = r10.length()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            r2.append(r8)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            r2.append(r9)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            if (r8 == 0) goto L90
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            if (r9 == 0) goto L90
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            if (r9 <= 0) goto L81
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Throwable -> L7e
            com.google.android.gms.dynamite.DynamiteModule.f5139d = r1     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L7e
            if (r1 < 0) goto L6b
            int r1 = r8.getInt(r1)     // Catch: java.lang.Throwable -> L7e
            com.google.android.gms.dynamite.DynamiteModule.f5140e = r1     // Catch: java.lang.Throwable -> L7e
        L6b:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7e
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = com.google.android.gms.dynamite.DynamiteModule.f5141f     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.c) r10     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            if (r10 == 0) goto L81
            android.database.Cursor r1 = r10.f5148a     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            if (r1 != 0) goto L81
            r10.f5148a = r8     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            r8 = r0
            goto L81
        L7e:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7e
            throw r9     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
        L81:
            if (r8 == 0) goto L86
            r8.close()
        L86:
            return r9
        L87:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto Lb2
        L8b:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto La3
        L90:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            throw r9     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
        L9f:
            r8 = move-exception
            goto Lb2
        La1:
            r8 = move-exception
            r9 = r0
        La3:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch: java.lang.Throwable -> Lb0
            if (r10 == 0) goto La8
            throw r8     // Catch: java.lang.Throwable -> Lb0
        La8:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch: java.lang.Throwable -> Lb0
            throw r10     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r8 = move-exception
            r0 = r9
        Lb2:
            if (r0 == 0) goto Lb7
            r0.close()
        Lb7:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, java.lang.String, boolean):int");
    }

    public static int b(Context context, String str) {
        return a(context, str, false);
    }

    private static DynamiteModule c(Context context, String str) {
        String strValueOf = String.valueOf(str);
        Log.i("DynamiteModule", strValueOf.length() != 0 ? "Selected local version of ".concat(strValueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule a(Context context, String str, int i2) throws a {
        Boolean bool;
        c.d.a.b.c.a aVarA;
        com.google.android.gms.dynamite.a aVar = null;
        try {
            synchronized (DynamiteModule.class) {
                bool = f5136a;
            }
            if (bool == null) {
                throw new a("Failed to determine which loading route to use.", aVar);
            }
            if (bool.booleanValue()) {
                return b(context, str, i2);
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
            sb.append("Selected remote version of ");
            sb.append(str);
            sb.append(", version >= ");
            sb.append(i2);
            Log.i("DynamiteModule", sb.toString());
            i iVarA = a(context);
            if (iVarA == null) {
                throw new a("Failed to create IDynamiteLoader.", aVar);
            }
            if (iVarA.f() >= 2) {
                aVarA = iVarA.b(c.d.a.b.c.b.a(context), str, i2);
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                aVarA = iVarA.a(c.d.a.b.c.b.a(context), str, i2);
            }
            if (c.d.a.b.c.b.a(aVarA) == null) {
                throw new a("Failed to load remote module.", aVar);
            }
            return new DynamiteModule((Context) c.d.a.b.c.b.a(aVarA));
        } catch (RemoteException e2) {
            throw new a("Failed to load remote module.", e2, aVar);
        } catch (a e3) {
            throw e3;
        } catch (Throwable th) {
            com.google.android.gms.common.util.e.a(context, th);
            throw new a("Failed to load remote module.", th, aVar);
        }
    }

    private static i a(Context context) {
        i jVar;
        synchronized (DynamiteModule.class) {
            if (f5137b != null) {
                return f5137b;
            }
            if (c.d.a.b.b.e.a().a(context) != 0) {
                return null;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (iInterfaceQueryLocalInterface instanceof i) {
                        jVar = (i) iInterfaceQueryLocalInterface;
                    } else {
                        jVar = new j(iBinder);
                    }
                }
                if (jVar != null) {
                    f5137b = jVar;
                    return jVar;
                }
            } catch (Exception e2) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", strValueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(strValueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    private static DynamiteModule b(Context context, String str, int i2) throws a {
        k kVar;
        c.d.a.b.c.a aVarA;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            kVar = f5138c;
        }
        com.google.android.gms.dynamite.a aVar = null;
        if (kVar == null) {
            throw new a("DynamiteLoaderV2 was not cached.", aVar);
        }
        c cVar = f5141f.get();
        if (cVar == null || cVar.f5148a == null) {
            throw new a("No result cursor", aVar);
        }
        Context applicationContext = context.getApplicationContext();
        Cursor cursor = cVar.f5148a;
        c.d.a.b.c.b.a((Object) null);
        if (a().booleanValue()) {
            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
            aVarA = kVar.b(c.d.a.b.c.b.a(applicationContext), str, i2, c.d.a.b.c.b.a(cursor));
        } else {
            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
            aVarA = kVar.a(c.d.a.b.c.b.a(applicationContext), str, i2, c.d.a.b.c.b.a(cursor));
        }
        Context context2 = (Context) c.d.a.b.c.b.a(aVarA);
        if (context2 == null) {
            throw new a("Failed to get module context", aVar);
        }
        return new DynamiteModule(context2);
    }

    private static Boolean a() {
        Boolean boolValueOf;
        synchronized (DynamiteModule.class) {
            boolValueOf = Boolean.valueOf(f5140e >= 2);
        }
        return boolValueOf;
    }

    private static void a(ClassLoader classLoader) throws a {
        k lVar;
        com.google.android.gms.dynamite.a aVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                lVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (iInterfaceQueryLocalInterface instanceof k) {
                    lVar = (k) iInterfaceQueryLocalInterface;
                } else {
                    lVar = new l(iBinder);
                }
            }
            f5138c = lVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, aVar);
        }
    }

    public final IBinder a(String str) throws a {
        try {
            return (IBinder) this.n.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String strValueOf = String.valueOf(str);
            throw new a(strValueOf.length() != 0 ? "Failed to instantiate module class: ".concat(strValueOf) : new String("Failed to instantiate module class: "), e2, null);
        }
    }

    private DynamiteModule(Context context) {
        t.a(context);
        this.n = context;
    }
}
