package io.flutter.embedding.engine.e;

import f.a.a.a.d;
import java.util.HashMap;

/* loaded from: classes.dex */
class a implements d.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f6012a;

    a(b bVar) {
        this.f6012a = bVar;
    }

    @Override // f.a.a.a.d.c
    public void a(Object obj, d.InterfaceC0067d<Object> interfaceC0067d) {
        if (this.f6012a.f6015c == null) {
        }
        HashMap map = (HashMap) obj;
        String str = (String) map.get("type");
        HashMap map2 = (HashMap) map.get("data");
        f.a.a.a("AccessibilityChannel", "Received " + str + " message.");
        char c2 = 65535;
        int iHashCode = str.hashCode();
        if (iHashCode != -1140076541) {
            if (iHashCode != -649620375) {
                if (iHashCode != 114595) {
                    if (iHashCode == 114203431 && str.equals("longPress")) {
                        c2 = 2;
                    }
                } else if (str.equals("tap")) {
                    c2 = 1;
                }
            } else if (str.equals("announce")) {
                c2 = 0;
            }
        } else if (str.equals("tooltip")) {
            c2 = 3;
        }
        switch (c2) {
            case 0:
                String str2 = (String) map2.get("message");
                if (str2 != null) {
                    this.f6012a.f6015c.a(str2);
                    break;
                }
                break;
            case 1:
                Integer num = (Integer) map.get("nodeId");
                if (num != null) {
                    this.f6012a.f6015c.a(num.intValue());
                    break;
                }
                break;
            case 2:
                Integer num2 = (Integer) map.get("nodeId");
                if (num2 != null) {
                    this.f6012a.f6015c.b(num2.intValue());
                    break;
                }
                break;
            case 3:
                String str3 = (String) map2.get("message");
                if (str3 != null) {
                    this.f6012a.f6015c.b(str3);
                    break;
                }
                break;
        }
    }
}
