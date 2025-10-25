package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* loaded from: classes.dex */
public interface j {
    ColorStateList getSupportImageTintList();

    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(PorterDuff.Mode mode);
}
