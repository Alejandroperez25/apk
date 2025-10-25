package f.a.b;

import c.b.c;
import f.a.a.a.q;
import f.a.b.a.n;
import f.a.b.d.t;
import f.a.b.e.p;
import i.a.a.b;
import io.flutter.plugins.firebaseauth.d;
import io.flutter.plugins.firebasemessaging.h;

/* loaded from: classes.dex */
public final class a {
    public static void a(q qVar) {
        if (b(qVar)) {
            return;
        }
        c.a.a.a.a(qVar.b("com.example.appsettings.AppSettingsPlugin"));
        b.a(qVar.b("xyz.luan.audioplayers.AudioplayersPlugin"));
        n.a(qVar.b("io.flutter.plugins.camera.CameraPlugin"));
        d.a(qVar.b("io.flutter.plugins.firebaseauth.FirebaseAuthPlugin"));
        io.flutter.plugins.firebase.core.a.a(qVar.b("io.flutter.plugins.firebase.core.FirebaseCorePlugin"));
        h.a(qVar.b("io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin"));
        c.g.a.h.a(qVar.b("com.pauldemarco.flutterblue.FlutterBluePlugin"));
        c.e.a.b.a(qVar.b("com.hemanthraj.fluttercompass.FlutterCompassPlugin"));
        c.a.b.a.a(qVar.b("com.example.flutternativeimage.FlutterNativeImagePlugin"));
        com.apptreesoftware.flutterwebview.a.a(qVar.b("com.apptreesoftware.flutterwebview.FlutterWebViewPlugin"));
        c.a(qVar.b("com.flutter_webview_plugin.FlutterWebviewPlugin"));
        f.a.b.b.a.a(qVar.b("io.flutter.plugins.pathprovider.PathProviderPlugin"));
        c.f.a.a.a(qVar.b("com.ly.permission.PermissionPlugin"));
        f.a.b.c.c.a(qVar.b("io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin"));
        io.flutter.plugins.urllauncher.c.a(qVar.b("io.flutter.plugins.urllauncher.UrlLauncherPlugin"));
        e.a.a.a.a(qVar.b("flutter.plugins.vibrate.VibratePlugin"));
        t.a(qVar.b("io.flutter.plugins.videoplayer.VideoPlayerPlugin"));
        d.a.c.a(qVar.b("creativecreatorormaybenot.wakelock.WakelockPlugin"));
        p.a(qVar.b("io.flutter.plugins.webviewflutter.WebViewFlutterPlugin"));
    }

    private static boolean b(q qVar) {
        String canonicalName = a.class.getCanonicalName();
        if (qVar.a(canonicalName)) {
            return true;
        }
        qVar.b(canonicalName);
        return false;
    }
}
