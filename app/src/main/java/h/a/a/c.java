package h.a.a;

import android.util.Log;
import java.io.IOException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class c {
    public static Socket a(String str, int i2) {
        try {
            return new i().createSocket(str, i2);
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e2) {
            Log.e("CreateSSLSocket", "Error", e2);
            return null;
        }
    }
}
