package io.flutter.embedding.engine.e;

import android.os.Build;
import android.view.InputDevice;
import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final f.a.a.a.d<Object> f6017a;

    public c(io.flutter.embedding.engine.a.b bVar) {
        this.f6017a = new f.a.a.a.d<>(bVar, "flutter/keyevent", f.a.a.a.i.f5661a);
    }

    public void a(a aVar) {
        HashMap map = new HashMap();
        map.put("type", "keyup");
        map.put("keymap", "android");
        a(aVar, map);
        this.f6017a.a((f.a.a.a.d<Object>) map);
    }

    public void b(a aVar) {
        HashMap map = new HashMap();
        map.put("type", "keydown");
        map.put("keymap", "android");
        a(aVar, map);
        this.f6017a.a((f.a.a.a.d<Object>) map);
    }

    private void a(a aVar, Map<String, Object> map) {
        map.put("flags", Integer.valueOf(aVar.f6019b));
        map.put("plainCodePoint", Integer.valueOf(aVar.f6020c));
        map.put("codePoint", Integer.valueOf(aVar.f6021d));
        map.put("keyCode", Integer.valueOf(aVar.f6022e));
        map.put("scanCode", Integer.valueOf(aVar.f6024g));
        map.put("metaState", Integer.valueOf(aVar.f6025h));
        if (aVar.f6023f != null) {
            map.put("character", aVar.f6023f.toString());
        }
        map.put("source", Integer.valueOf(aVar.f6026i));
        map.put("vendorId", Integer.valueOf(aVar.j));
        map.put("productId", Integer.valueOf(aVar.k));
        map.put("deviceId", Integer.valueOf(aVar.f6018a));
        map.put("repeatCount", Integer.valueOf(aVar.l));
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f6018a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6019b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6020c;

        /* renamed from: d, reason: collision with root package name */
        public final int f6021d;

        /* renamed from: e, reason: collision with root package name */
        public final int f6022e;

        /* renamed from: f, reason: collision with root package name */
        public final Character f6023f;

        /* renamed from: g, reason: collision with root package name */
        public final int f6024g;

        /* renamed from: h, reason: collision with root package name */
        public final int f6025h;

        /* renamed from: i, reason: collision with root package name */
        public final int f6026i;
        public final int j;
        public final int k;
        public final int l;

        public a(KeyEvent keyEvent, Character ch) {
            this(keyEvent.getDeviceId(), keyEvent.getFlags(), keyEvent.getUnicodeChar(0), keyEvent.getUnicodeChar(), keyEvent.getKeyCode(), ch, keyEvent.getScanCode(), keyEvent.getMetaState(), keyEvent.getSource(), keyEvent.getRepeatCount());
        }

        public a(int i2, int i3, int i4, int i5, int i6, Character ch, int i7, int i8, int i9, int i10) {
            this.f6018a = i2;
            this.f6019b = i3;
            this.f6020c = i4;
            this.f6021d = i5;
            this.f6022e = i6;
            this.f6023f = ch;
            this.f6024g = i7;
            this.f6025h = i8;
            this.f6026i = i9;
            this.l = i10;
            InputDevice device = InputDevice.getDevice(i2);
            if (device != null) {
                if (Build.VERSION.SDK_INT >= 19) {
                    this.j = device.getVendorId();
                    this.k = device.getProductId();
                    return;
                } else {
                    this.j = 0;
                    this.k = 0;
                    return;
                }
            }
            this.j = 0;
            this.k = 0;
        }
    }
}
