package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.b;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(bVar);
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, bVar);
    }
}
