package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: a, reason: collision with root package name */
    static final PorterDuff.Mode f554a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    Object f556c;

    /* renamed from: b, reason: collision with root package name */
    public int f555b = -1;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f557d = null;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f558e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f559f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f560g = 0;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f561h = null;

    /* renamed from: i, reason: collision with root package name */
    PorterDuff.Mode f562i = f554a;
    public String j = null;

    private static String a(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public String a() {
        if (this.f555b == -1 && Build.VERSION.SDK_INT >= 23) {
            return a((Icon) this.f556c);
        }
        if (this.f555b != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return ((String) this.f556c).split(":", -1)[0];
    }

    public int b() {
        if (this.f555b == -1 && Build.VERSION.SDK_INT >= 23) {
            return b((Icon) this.f556c);
        }
        if (this.f555b != 2) {
            throw new IllegalStateException("called getResId() on " + this);
        }
        return this.f559f;
    }

    public String toString() {
        if (this.f555b == -1) {
            return String.valueOf(this.f556c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(a(this.f555b));
        switch (this.f555b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f556c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f556c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(a());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f559f);
                if (this.f560g != 0) {
                    sb.append(" off=");
                    sb.append(this.f560g);
                    break;
                }
                break;
            case 4:
                sb.append(" uri=");
                sb.append(this.f556c);
                break;
        }
        if (this.f561h != null) {
            sb.append(" tint=");
            sb.append(this.f561h);
        }
        if (this.f562i != f554a) {
            sb.append(" mode=");
            sb.append(this.f562i);
        }
        sb.append(")");
        return sb.toString();
    }

    public void a(boolean z) {
        this.j = this.f562i.name();
        int i2 = this.f555b;
        if (i2 == -1) {
            if (z) {
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            }
            this.f558e = (Parcelable) this.f556c;
            return;
        }
        switch (i2) {
            case 1:
            case 5:
                if (z) {
                    Bitmap bitmap = (Bitmap) this.f556c;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f557d = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f558e = (Parcelable) this.f556c;
                return;
            case 2:
                this.f557d = ((String) this.f556c).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f557d = (byte[]) this.f556c;
                return;
            case 4:
                this.f557d = this.f556c.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    public void c() {
        this.f562i = PorterDuff.Mode.valueOf(this.j);
        int i2 = this.f555b;
        if (i2 == -1) {
            if (this.f558e != null) {
                this.f556c = this.f558e;
                return;
            }
            throw new IllegalArgumentException("Invalid icon");
        }
        switch (i2) {
            case 1:
            case 5:
                if (this.f558e != null) {
                    this.f556c = this.f558e;
                    return;
                }
                this.f556c = this.f557d;
                this.f555b = 3;
                this.f559f = 0;
                this.f560g = this.f557d.length;
                return;
            case 2:
            case 4:
                this.f556c = new String(this.f557d, Charset.forName("UTF-16"));
                return;
            case 3:
                this.f556c = this.f557d;
                return;
            default:
                return;
        }
    }

    private static String a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    private static int b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }
}
