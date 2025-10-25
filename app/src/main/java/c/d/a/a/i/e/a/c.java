package c.d.a.a.i.e.a;

import android.net.Uri;
import c.d.a.a.m.H;

/* loaded from: classes.dex */
public abstract class c {
    public static Uri a(Uri uri) {
        return H.d(uri.getLastPathSegment()).matches("manifest(\\(.+\\))?") ? uri : Uri.withAppendedPath(uri, "Manifest");
    }
}
