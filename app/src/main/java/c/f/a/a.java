package c.f.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.b;
import f.a.a.a.o;
import f.a.a.a.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a implements o.c, q.e {

    /* renamed from: a, reason: collision with root package name */
    private q.d f4472a;

    /* renamed from: b, reason: collision with root package name */
    private o.d f4473b;

    public static void a(q.d dVar) {
        o oVar = new o(dVar.f(), "plugins.ly.com/permission");
        a aVar = new a(dVar);
        oVar.a(aVar);
        dVar.a(aVar);
    }

    private a(q.d dVar) {
        this.f4472a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    @Override // f.a.a.a.o.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(f.a.a.a.m r5, f.a.a.a.o.d r6) {
        /*
            r4 = this;
            java.lang.String r0 = r5.f5663a
            int r1 = r0.hashCode()
            r2 = -372024179(0xffffffffe9d35c8d, float:-3.194005E25)
            r3 = 1
            if (r1 == r2) goto L2b
            r2 = 1669188213(0x637dca75, float:4.6816148E21)
            if (r1 == r2) goto L21
            r2 = 1823065312(0x6ca9c4e0, float:1.6419054E27)
            if (r1 == r2) goto L17
            goto L35
        L17:
            java.lang.String r1 = "getPermissionsStatus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 0
            goto L36
        L21:
            java.lang.String r1 = "requestPermissions"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 1
            goto L36
        L2b:
            java.lang.String r1 = "openSettings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 2
            goto L36
        L35:
            r0 = -1
        L36:
            switch(r0) {
                case 0: goto L56;
                case 1: goto L48;
                case 2: goto L3d;
                default: goto L39;
            }
        L39:
            r6.a()
            goto L65
        L3d:
            r4.a()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r6.a(r5)
            goto L65
        L48:
            java.lang.String r0 = "permissions"
            java.lang.Object r5 = r5.a(r0)
            java.util.List r5 = (java.util.List) r5
            r4.f4473b = r6
            r4.b(r5)
            goto L65
        L56:
            java.lang.String r0 = "permissions"
            java.lang.Object r5 = r5.a(r0)
            java.util.List r5 = (java.util.List) r5
            java.util.List r5 = r4.a(r5)
            r6.a(r5)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.a.a(f.a.a.a.m, f.a.a.a.o$d):void");
    }

    private List<Integer> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Activity activityD = this.f4472a.d();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strA = a(it.next());
            if (androidx.core.content.a.b(this.f4472a.d(), strA) == -1) {
                if (!b.a(activityD, strA)) {
                    arrayList.add(3);
                } else {
                    arrayList.add(1);
                }
            } else {
                arrayList.add(0);
            }
        }
        return arrayList;
    }

    private void b(List<String> list) {
        Activity activityD = this.f4472a.d();
        String[] strArr = new String[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            strArr[i2] = a(list.get(i2));
        }
        b.a(activityD, strArr, 0);
    }

    private void a() {
        Activity activityD = this.f4472a.d();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + activityD.getPackageName()));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(268435456);
        activityD.startActivity(intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -930581174: goto L59;
                case -649937959: goto L4f;
                case -502807437: goto L45;
                case -219620773: goto L3a;
                case -113680546: goto L30;
                case 82233: goto L26;
                case 77090126: goto L1c;
                case 1965687765: goto L12;
                case 2011082565: goto L8;
                default: goto L7;
            }
        L7:
            goto L63
        L8:
            java.lang.String r0 = "Camera"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L63
            r2 = 1
            goto L64
        L12:
            java.lang.String r0 = "Location"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L63
            r2 = 3
            goto L64
        L1c:
            java.lang.String r0 = "Phone"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L63
            r2 = 5
            goto L64
        L26:
            java.lang.String r0 = "SMS"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L63
            r2 = 7
            goto L64
        L30:
            java.lang.String r0 = "Calendar"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L63
            r2 = 0
            goto L64
        L3a:
            java.lang.String r0 = "Storage"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L63
            r2 = 8
            goto L64
        L45:
            java.lang.String r0 = "Contacts"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L63
            r2 = 2
            goto L64
        L4f:
            java.lang.String r0 = "Sensors"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L63
            r2 = 6
            goto L64
        L59:
            java.lang.String r0 = "Microphone"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L63
            r2 = 4
            goto L64
        L63:
            r2 = -1
        L64:
            switch(r2) {
                case 0: goto L82;
                case 1: goto L7f;
                case 2: goto L7c;
                case 3: goto L79;
                case 4: goto L76;
                case 5: goto L73;
                case 6: goto L70;
                case 7: goto L6d;
                case 8: goto L6a;
                default: goto L67;
            }
        L67:
            java.lang.String r2 = "ERROR"
            goto L84
        L6a:
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            goto L84
        L6d:
            java.lang.String r2 = "android.permission.READ_SMS"
            goto L84
        L70:
            java.lang.String r2 = "android.permission.BODY_SENSORS"
            goto L84
        L73:
            java.lang.String r2 = "android.permission.CALL_PHONE"
            goto L84
        L76:
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            goto L84
        L79:
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            goto L84
        L7c:
            java.lang.String r2 = "android.permission.READ_CONTACTS"
            goto L84
        L7f:
            java.lang.String r2 = "android.permission.CAMERA"
            goto L84
        L82:
            java.lang.String r2 = "android.permission.READ_CALENDAR"
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.a.a(java.lang.String):java.lang.String");
    }

    @Override // f.a.a.a.q.e
    public boolean a(int i2, String[] strArr, int[] iArr) {
        if (i2 == 0 && iArr.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if (iArr[i3] == -1) {
                    if (!b.a(this.f4472a.d(), strArr[i3])) {
                        arrayList.add(3);
                    } else {
                        arrayList.add(1);
                    }
                } else {
                    arrayList.add(0);
                }
            }
            this.f4473b.a(arrayList);
        }
        return true;
    }
}
