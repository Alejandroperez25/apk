package androidx.appcompat.widget;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;

/* loaded from: classes.dex */
public abstract class I extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    private static final Interpolator f272a = new DecelerateInterpolator();

    public abstract void setAllowCollapse(boolean z);

    public abstract void setContentHeight(int i2);

    public abstract void setTabSelected(int i2);
}
