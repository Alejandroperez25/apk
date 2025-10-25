package c.d.a.b.d;

import android.content.Context;
import com.google.android.gms.flags.Flag;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Collection<a> f3770a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Collection<Flag.StringFlag> f3771b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Collection<Flag.StringFlag> f3772c = new ArrayList();

    public final void a(a aVar) {
        this.f3770a.add(aVar);
    }

    public static void a(Context context) {
        c.b().a(context);
    }
}
