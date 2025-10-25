package com.innovaticx.strikepros;

import android.os.Bundle;
import c.d.b.e;
import f.a.a.a.g;
import f.a.a.a.m;
import f.a.a.a.o;
import h.a.a.b;
import io.flutter.view.p;
import java.io.IOException;

/* loaded from: classes.dex */
public class MainActivity extends io.flutter.app.a implements b {

    /* renamed from: e, reason: collision with root package name */
    c.h.b.b.a f5630e;

    @Override // h.a.a.b
    public void a(long j) {
    }

    @Override // h.a.a.b
    public void b() {
    }

    @Override // h.a.a.b
    public void c() {
    }

    @Override // h.a.a.b
    public void c(String str) {
    }

    @Override // h.a.a.b
    public void d() {
    }

    @Override // h.a.a.b
    public void f() {
    }

    @Override // io.flutter.app.a, android.app.Activity
    protected void onCreate(Bundle bundle) {
        e.b(this);
        super.onCreate(bundle);
        f.a.b.a.a(this);
        new g(a(), "com.innovaticx.strikepros/pedometer").a(new com.innovaticx.strikepros.a.b(this));
        if (androidx.core.content.a.b(this, "android.permission.BLUETOOTH_ADMIN") != 0) {
            androidx.core.app.b.a(this, new String[]{"android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 0);
        }
        if (androidx.core.content.a.b(this, "android.permission.RECORD_AUDIO") != 0) {
            androidx.core.app.b.a(this, new String[]{"android.permission.READ_PHONE_STATE", "android.permission.INTERNET", "android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.ACCESS_NETWORK_STATE"}, 1);
        }
        if (androidx.core.content.a.b(this, "android.permission.CAMERA") != 0) {
            androidx.core.app.b.a(this, new String[]{"android.permission.CAMERA"}, 2);
        }
        a(a());
    }

    private void h() {
        this.f5630e = new c.h.b.b.a(this, this);
        this.f5630e.a(10);
    }

    private void a(p pVar) {
        new o(pVar, "com.innovaticx.strikepros/Stream").a(new o.c() { // from class: com.innovaticx.strikepros.a
            @Override // f.a.a.a.o.c
            public final void a(m mVar, o.d dVar) throws IOException {
                MainActivity.a(this.f5631a, mVar, dVar);
            }
        });
    }

    public static /* synthetic */ void a(MainActivity mainActivity, m mVar, o.d dVar) throws IOException {
        if (mVar.f5663a.equals("startStreaming")) {
            if (mainActivity.f5630e.f()) {
                dVar.a("Already Streaming", null, null);
                return;
            }
            if (mainActivity.f5630e.g() || (mainActivity.f5630e.b() && mainActivity.f5630e.a())) {
                mainActivity.f5630e.b((String) mVar.f5664b);
                dVar.a(null);
                return;
            } else {
                mainActivity.f5630e.e();
                dVar.a("Unknown Error", null, null);
                return;
            }
        }
        if (mVar.f5663a.equals("stopStreaming")) {
            if (mainActivity.f5630e.f()) {
                mainActivity.f5630e.e();
                dVar.a(null);
                return;
            } else {
                dVar.a("Not Streaming", null, null);
                return;
            }
        }
        if (mVar.f5663a.equals("initStream")) {
            mainActivity.h();
            dVar.a(null);
        }
    }
}
