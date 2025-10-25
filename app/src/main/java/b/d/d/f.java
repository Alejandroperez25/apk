package b.d.d;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.a.h;
import b.d.d.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    static final b.c.g<String, Typeface> f1068a = new b.c.g<>(16);

    /* renamed from: b, reason: collision with root package name */
    private static final k f1069b = new k("fonts", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f1070c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final b.c.i<String, ArrayList<k.a<c>>> f1071d = new b.c.i<>();

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator<byte[]> f1072e = new e();

    static c a(Context context, b.d.d.a aVar, int i2) {
        try {
            a aVarA = a(context, (CancellationSignal) null, aVar);
            if (aVarA.a() == 0) {
                Typeface typefaceA = b.d.a.c.a(context, null, aVarA.b(), i2);
                return new c(typefaceA, typefaceA != null ? 0 : -3);
            }
            return new c(null, aVarA.a() == 1 ? -2 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new c(null, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f1080a;

        /* renamed from: b, reason: collision with root package name */
        final int f1081b;

        c(Typeface typeface, int i2) {
            this.f1080a = typeface;
            this.f1081b = i2;
        }
    }

    public static Typeface a(Context context, b.d.d.a aVar, h.a aVar2, Handler handler, boolean z, int i2, int i3) {
        String str = aVar.f() + "-" + i3;
        Typeface typefaceA = f1068a.a((b.c.g<String, Typeface>) str);
        if (typefaceA != null) {
            if (aVar2 != null) {
                aVar2.a(typefaceA);
            }
            return typefaceA;
        }
        if (z && i2 == -1) {
            c cVarA = a(context, aVar, i3);
            if (aVar2 != null) {
                if (cVarA.f1081b == 0) {
                    aVar2.a(cVarA.f1080a, handler);
                } else {
                    aVar2.a(cVarA.f1081b, handler);
                }
            }
            return cVarA.f1080a;
        }
        b.d.d.b bVar = new b.d.d.b(context, aVar, i3, str);
        if (z) {
            try {
                return ((c) f1069b.a(bVar, i2)).f1080a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        b.d.d.c cVar = aVar2 == null ? null : new b.d.d.c(aVar2, handler);
        synchronized (f1070c) {
            ArrayList<k.a<c>> arrayList = f1071d.get(str);
            if (arrayList != null) {
                if (cVar != null) {
                    arrayList.add(cVar);
                }
                return null;
            }
            if (cVar != null) {
                ArrayList<k.a<c>> arrayList2 = new ArrayList<>();
                arrayList2.add(cVar);
                f1071d.put(str, arrayList2);
            }
            f1069b.a(bVar, new d(str));
            return null;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f1075a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1076b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1077c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1078d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1079e;

        public b(Uri uri, int i2, int i3, boolean z, int i4) {
            b.d.f.d.a(uri);
            this.f1075a = uri;
            this.f1076b = i2;
            this.f1077c = i3;
            this.f1078d = z;
            this.f1079e = i4;
        }

        public Uri a() {
            return this.f1075a;
        }

        public int b() {
            return this.f1076b;
        }

        public int c() {
            return this.f1077c;
        }

        public boolean d() {
            return this.f1078d;
        }

        public int e() {
            return this.f1079e;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f1073a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f1074b;

        public a(int i2, b[] bVarArr) {
            this.f1073a = i2;
            this.f1074b = bVarArr;
        }

        public int a() {
            return this.f1073a;
        }

        public b[] b() {
            return this.f1074b;
        }
    }

    public static Map<Uri, ByteBuffer> a(Context context, b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (b bVar : bVarArr) {
            if (bVar.e() == 0) {
                Uri uriA = bVar.a();
                if (!map.containsKey(uriA)) {
                    map.put(uriA, b.d.a.k.a(context, cancellationSignal, uriA));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public static a a(Context context, CancellationSignal cancellationSignal, b.d.d.a aVar) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoA = a(context.getPackageManager(), aVar, context.getResources());
        if (providerInfoA == null) {
            return new a(1, null);
        }
        return new a(0, a(context, aVar, providerInfoA.authority, cancellationSignal));
    }

    public static ProviderInfo a(PackageManager packageManager, b.d.d.a aVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strA = aVar.a();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strA, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strA);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(aVar.b())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strA + ", but package was not " + aVar.b());
        }
        List<byte[]> listA = a(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listA, f1072e);
        List<List<byte[]>> listA2 = a(aVar, resources);
        for (int i2 = 0; i2 < listA2.size(); i2++) {
            ArrayList arrayList = new ArrayList(listA2.get(i2));
            Collections.sort(arrayList, f1072e);
            if (a(listA, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    private static List<List<byte[]>> a(b.d.d.a aVar, Resources resources) {
        if (aVar.d() != null) {
            return aVar.d();
        }
        return androidx.core.content.a.c.a(resources, aVar.e());
    }

    private static boolean a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    static b[] a(Context context, b.d.d.a aVar, String str, CancellationSignal cancellationSignal) {
        Cursor cursorQuery;
        Uri uriWithAppendedId;
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            if (Build.VERSION.SDK_INT > 16) {
                cursorQuery = context.getContentResolver().query(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.c()}, null, cancellationSignal);
            } else {
                cursorQuery = context.getContentResolver().query(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.c()}, null);
            }
            cursor = cursorQuery;
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i3 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursor.getLong(columnIndex2));
                    } else {
                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursor.getLong(columnIndex3));
                    }
                    arrayList2.add(new b(uriWithAppendedId, i3, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i2));
                }
                arrayList = arrayList2;
            }
            return (b[]) arrayList.toArray(new b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
