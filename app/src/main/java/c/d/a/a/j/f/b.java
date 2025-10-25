package c.d.a.a.j.f;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import c.d.a.a.m.AbstractC0170e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3200a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3201b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3202c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3203d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3204e;

    /* renamed from: f, reason: collision with root package name */
    public final e f3205f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f3206g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3207h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3208i;
    private final HashMap<String, Integer> j;
    private final HashMap<String, Integer> k;
    private List<b> l;

    public static b a(String str) {
        return new b(null, d.a(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null);
    }

    public static b a(String str, long j, long j2, e eVar, String[] strArr, String str2, String str3) {
        return new b(str, null, j, j2, eVar, strArr, str2, str3);
    }

    private b(String str, String str2, long j, long j2, e eVar, String[] strArr, String str3, String str4) {
        this.f3200a = str;
        this.f3201b = str2;
        this.f3208i = str4;
        this.f3205f = eVar;
        this.f3206g = strArr;
        this.f3202c = str2 != null;
        this.f3203d = j;
        this.f3204e = j2;
        AbstractC0170e.a(str3);
        this.f3207h = str3;
        this.j = new HashMap<>();
        this.k = new HashMap<>();
    }

    public boolean a(long j) {
        return (this.f3203d == -9223372036854775807L && this.f3204e == -9223372036854775807L) || (this.f3203d <= j && this.f3204e == -9223372036854775807L) || ((this.f3203d == -9223372036854775807L && j < this.f3204e) || (this.f3203d <= j && j < this.f3204e));
    }

    public void a(b bVar) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(bVar);
    }

    public b a(int i2) {
        if (this.l == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.l.get(i2);
    }

    public int a() {
        if (this.l == null) {
            return 0;
        }
        return this.l.size();
    }

    public long[] b() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i2 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        return jArr;
    }

    private void a(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = "p".equals(this.f3200a);
        boolean zEquals2 = "div".equals(this.f3200a);
        if (z || zEquals || (zEquals2 && this.f3208i != null)) {
            if (this.f3203d != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.f3203d));
            }
            if (this.f3204e != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.f3204e));
            }
        }
        if (this.l == null) {
            return;
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            this.l.get(i2).a(treeSet, z || zEquals);
        }
    }

    public List<c.d.a.a.j.a> a(long j, Map<String, e> map, Map<String, c> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        a(j, this.f3207h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j, false, this.f3207h, (Map<String, SpannableStringBuilder>) treeMap);
        a(j, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                c cVar = map2.get(pair.first);
                arrayList2.add(new c.d.a.a.j.a(bitmapDecodeByteArray, cVar.f3210b, 1, cVar.f3211c, cVar.f3213e, cVar.f3214f, Float.MIN_VALUE));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            c cVar2 = map2.get(entry.getKey());
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
            a(spannableStringBuilder);
            arrayList2.add(new c.d.a.a.j.a(spannableStringBuilder, (Layout.Alignment) null, cVar2.f3211c, cVar2.f3212d, cVar2.f3213e, cVar2.f3210b, Integer.MIN_VALUE, cVar2.f3214f, cVar2.f3215g, cVar2.f3216h));
        }
        return arrayList2;
    }

    private void a(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f3207h)) {
            str = this.f3207h;
        }
        if (a(j) && "div".equals(this.f3200a) && this.f3208i != null) {
            list.add(new Pair<>(str, this.f3208i));
            return;
        }
        for (int i2 = 0; i2 < a(); i2++) {
            a(i2).a(j, str, list);
        }
    }

    private void a(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.j.clear();
        this.k.clear();
        if ("metadata".equals(this.f3200a)) {
            return;
        }
        if (!"".equals(this.f3207h)) {
            str = this.f3207h;
        }
        if (this.f3202c && z) {
            a(str, map).append((CharSequence) this.f3201b);
            return;
        }
        if ("br".equals(this.f3200a) && z) {
            a(str, map).append('\n');
            return;
        }
        if (a(j)) {
            for (Map.Entry<String, SpannableStringBuilder> entry : map.entrySet()) {
                this.j.put(entry.getKey(), Integer.valueOf(entry.getValue().length()));
            }
            boolean zEquals = "p".equals(this.f3200a);
            for (int i2 = 0; i2 < a(); i2++) {
                a(i2).a(j, z || zEquals, str, map);
            }
            if (zEquals) {
                d.a(a(str, map));
            }
            for (Map.Entry<String, SpannableStringBuilder> entry2 : map.entrySet()) {
                this.k.put(entry2.getKey(), Integer.valueOf(entry2.getValue().length()));
            }
        }
    }

    private static SpannableStringBuilder a(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    private void a(long j, Map<String, e> map, Map<String, SpannableStringBuilder> map2) {
        int iIntValue;
        if (a(j)) {
            Iterator<Map.Entry<String, Integer>> it = this.k.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                iIntValue = this.j.containsKey(key) ? this.j.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    a(map, map2.get(key), iIntValue, iIntValue2);
                }
            }
            while (iIntValue < a()) {
                a(iIntValue).a(j, map, map2);
                iIntValue++;
            }
        }
    }

    private void a(Map<String, e> map, SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
        e eVarA = d.a(this.f3205f, this.f3206g, map);
        if (eVarA != null) {
            d.a(spannableStringBuilder, i2, i3, eVarA);
        }
    }

    private SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder) {
        int i2;
        int i3;
        int i4 = 0;
        int length = spannableStringBuilder.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (spannableStringBuilder.charAt(i5) == ' ') {
                int i6 = i5 + 1;
                int i7 = i6;
                while (i7 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i7) == ' ') {
                    i7++;
                }
                int i8 = i7 - i6;
                if (i8 > 0) {
                    spannableStringBuilder.delete(i5, i5 + i8);
                    length -= i8;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i9 = 0;
        while (true) {
            i2 = length - 1;
            if (i9 >= i2) {
                break;
            }
            if (spannableStringBuilder.charAt(i9) == '\n') {
                int i10 = i9 + 1;
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    spannableStringBuilder.delete(i10, i9 + 2);
                    length--;
                }
            }
            i9++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i2) == ' ') {
            spannableStringBuilder.delete(i2, length);
            length--;
        }
        while (true) {
            i3 = length - 1;
            if (i4 >= i3) {
                break;
            }
            if (spannableStringBuilder.charAt(i4) == ' ') {
                int i11 = i4 + 1;
                if (spannableStringBuilder.charAt(i11) == '\n') {
                    spannableStringBuilder.delete(i4, i11);
                    length--;
                }
            }
            i4++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i3) == '\n') {
            spannableStringBuilder.delete(i3, length);
        }
        return spannableStringBuilder;
    }
}
