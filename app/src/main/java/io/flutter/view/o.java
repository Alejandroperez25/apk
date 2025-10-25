package io.flutter.view;

/* loaded from: classes.dex */
class o implements f.a.a.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ io.flutter.plugin.platform.e f6325a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f6326b;

    o(p pVar, io.flutter.plugin.platform.e eVar) {
        this.f6326b = pVar;
        this.f6325a = eVar;
    }

    @Override // f.a.a.a.a
    public void onPostResume() {
        this.f6325a.a();
    }
}
