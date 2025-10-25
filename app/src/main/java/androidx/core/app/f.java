package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import b.d.a$b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f {

    public static class d {
        String A;
        Bundle B;
        int C;
        int D;
        Notification E;
        RemoteViews F;
        RemoteViews G;
        RemoteViews H;
        String I;
        int J;
        String K;
        long L;
        int M;
        Notification N;

        @Deprecated
        public ArrayList<String> O;

        /* renamed from: a, reason: collision with root package name */
        public Context f502a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f503b;

        /* renamed from: c, reason: collision with root package name */
        ArrayList<a> f504c;

        /* renamed from: d, reason: collision with root package name */
        CharSequence f505d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f506e;

        /* renamed from: f, reason: collision with root package name */
        PendingIntent f507f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f508g;

        /* renamed from: h, reason: collision with root package name */
        RemoteViews f509h;

        /* renamed from: i, reason: collision with root package name */
        Bitmap f510i;
        CharSequence j;
        int k;
        int l;
        boolean m;
        boolean n;
        e o;
        CharSequence p;
        CharSequence[] q;
        int r;
        int s;
        boolean t;
        String u;
        boolean v;
        String w;
        boolean x;
        boolean y;
        boolean z;

        public d(Context context, String str) {
            this.f503b = new ArrayList<>();
            this.f504c = new ArrayList<>();
            this.m = true;
            this.x = false;
            this.C = 0;
            this.D = 0;
            this.J = 0;
            this.M = 0;
            this.N = new Notification();
            this.f502a = context;
            this.I = str;
            this.N.when = System.currentTimeMillis();
            this.N.audioStreamType = -1;
            this.l = 0;
            this.O = new ArrayList<>();
        }

        @Deprecated
        public d(Context context) {
            this(context, null);
        }

        public d a(long j) {
            this.N.when = j;
            return this;
        }

        public d a(int i2) {
            this.N.icon = i2;
            return this;
        }

        public d b(CharSequence charSequence) {
            this.f505d = a(charSequence);
            return this;
        }

        public d c(CharSequence charSequence) {
            this.f506e = a(charSequence);
            return this;
        }

        public d b(int i2) {
            this.k = i2;
            return this;
        }

        public d a(PendingIntent pendingIntent) {
            this.f507f = pendingIntent;
            return this;
        }

        public d b(PendingIntent pendingIntent) {
            this.N.deleteIntent = pendingIntent;
            return this;
        }

        public d d(CharSequence charSequence) {
            this.N.tickerText = a(charSequence);
            return this;
        }

        public d a(Bitmap bitmap) {
            this.f510i = b(bitmap);
            return this;
        }

        private Bitmap b(Bitmap bitmap) throws Resources.NotFoundException {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f502a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a$b.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a$b.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
        }

        public d a(Uri uri) {
            this.N.sound = uri;
            this.N.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                this.N.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public d a(long[] jArr) {
            this.N.vibrate = jArr;
            return this;
        }

        public d a(int i2, int i3, int i4) {
            this.N.ledARGB = i2;
            this.N.ledOnMS = i3;
            this.N.ledOffMS = i4;
            this.N.flags = ((this.N.ledOnMS == 0 || this.N.ledOffMS == 0) ? 0 : 1) | (this.N.flags & (-2));
            return this;
        }

        public d a(boolean z) {
            a(16, z);
            return this;
        }

        public d b(boolean z) {
            this.x = z;
            return this;
        }

        public d c(int i2) {
            this.N.defaults = i2;
            if ((i2 & 4) != 0) {
                this.N.flags |= 1;
            }
            return this;
        }

        private void a(int i2, boolean z) {
            if (z) {
                Notification notification = this.N;
                notification.flags = i2 | notification.flags;
            } else {
                Notification notification2 = this.N;
                notification2.flags = (~i2) & notification2.flags;
            }
        }

        public d d(int i2) {
            this.l = i2;
            return this;
        }

        public Bundle a() {
            if (this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        public d a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f503b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public d a(e eVar) {
            if (this.o != eVar) {
                this.o = eVar;
                if (this.o != null) {
                    this.o.a(this);
                }
            }
            return this;
        }

        public d e(int i2) {
            this.C = i2;
            return this;
        }

        public d f(int i2) {
            this.D = i2;
            return this;
        }

        public d a(String str) {
            this.I = str;
            return this;
        }

        public Notification b() {
            return new g(this).b();
        }

        protected static CharSequence a(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        protected d f511a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f512b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f513c;

        /* renamed from: d, reason: collision with root package name */
        boolean f514d = false;

        public void a(Bundle bundle) {
        }

        public abstract void a(androidx.core.app.e eVar);

        public RemoteViews b(androidx.core.app.e eVar) {
            return null;
        }

        public RemoteViews c(androidx.core.app.e eVar) {
            return null;
        }

        public RemoteViews d(androidx.core.app.e eVar) {
            return null;
        }

        public void a(d dVar) {
            if (this.f511a != dVar) {
                this.f511a = dVar;
                if (this.f511a != null) {
                    this.f511a.a(this);
                }
            }
        }
    }

    public static class b extends e {

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f498e;

        /* renamed from: f, reason: collision with root package name */
        private Bitmap f499f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f500g;

        public b a(Bitmap bitmap) {
            this.f498e = bitmap;
            return this;
        }

        public b b(Bitmap bitmap) {
            this.f499f = bitmap;
            this.f500g = true;
            return this;
        }

        @Override // androidx.core.app.f.e
        public void a(androidx.core.app.e eVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPictureStyleBigPicture = new Notification.BigPictureStyle(eVar.a()).setBigContentTitle(this.f512b).bigPicture(this.f498e);
                if (this.f500g) {
                    bigPictureStyleBigPicture.bigLargeIcon(this.f499f);
                }
                if (this.f514d) {
                    bigPictureStyleBigPicture.setSummaryText(this.f513c);
                }
            }
        }
    }

    public static class c extends e {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f501e;

        public c a(CharSequence charSequence) {
            this.f501e = d.a(charSequence);
            return this;
        }

        @Override // androidx.core.app.f.e
        public void a(androidx.core.app.e eVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(eVar.a()).setBigContentTitle(this.f512b).bigText(this.f501e);
                if (this.f514d) {
                    bigTextStyleBigText.setSummaryText(this.f513c);
                }
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f489a;

        /* renamed from: b, reason: collision with root package name */
        private final i[] f490b;

        /* renamed from: c, reason: collision with root package name */
        private final i[] f491c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f492d;

        /* renamed from: e, reason: collision with root package name */
        boolean f493e;

        /* renamed from: f, reason: collision with root package name */
        private final int f494f;

        /* renamed from: g, reason: collision with root package name */
        public int f495g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f496h;

        /* renamed from: i, reason: collision with root package name */
        public PendingIntent f497i;

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        a(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, i[] iVarArr, i[] iVarArr2, boolean z, int i3, boolean z2) {
            this.f493e = true;
            this.f495g = i2;
            this.f496h = d.a(charSequence);
            this.f497i = pendingIntent;
            this.f489a = bundle == null ? new Bundle() : bundle;
            this.f490b = iVarArr;
            this.f491c = iVarArr2;
            this.f492d = z;
            this.f494f = i3;
            this.f493e = z2;
        }

        public int a() {
            return this.f495g;
        }

        public CharSequence b() {
            return this.f496h;
        }

        public PendingIntent c() {
            return this.f497i;
        }

        public Bundle d() {
            return this.f489a;
        }

        public boolean e() {
            return this.f492d;
        }

        public i[] f() {
            return this.f490b;
        }

        public int g() {
            return this.f494f;
        }

        public i[] h() {
            return this.f491c;
        }

        public boolean i() {
            return this.f493e;
        }
    }

    public static Bundle a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return h.a(notification);
        }
        return null;
    }
}
