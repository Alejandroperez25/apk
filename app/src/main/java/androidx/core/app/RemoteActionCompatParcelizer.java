package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f475a = (IconCompat) bVar.b((androidx.versionedparcelable.b) remoteActionCompat.f475a, 1);
        remoteActionCompat.f476b = bVar.b(remoteActionCompat.f476b, 2);
        remoteActionCompat.f477c = bVar.b(remoteActionCompat.f477c, 3);
        remoteActionCompat.f478d = (PendingIntent) bVar.b((androidx.versionedparcelable.b) remoteActionCompat.f478d, 4);
        remoteActionCompat.f479e = bVar.b(remoteActionCompat.f479e, 5);
        remoteActionCompat.f480f = bVar.b(remoteActionCompat.f480f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        bVar.a(false, false);
        bVar.a(remoteActionCompat.f475a, 1);
        bVar.a(remoteActionCompat.f476b, 2);
        bVar.a(remoteActionCompat.f477c, 3);
        bVar.a(remoteActionCompat.f478d, 4);
        bVar.a(remoteActionCompat.f479e, 5);
        bVar.a(remoteActionCompat.f480f, 6);
    }
}
