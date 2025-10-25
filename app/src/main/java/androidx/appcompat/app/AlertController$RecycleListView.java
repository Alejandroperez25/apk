package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import b.a.a$i;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    private final int f93a;

    /* renamed from: b, reason: collision with root package name */
    private final int f94b;

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a$i.RecycleListView);
        this.f94b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a$i.RecycleListView_paddingBottomNoButtons, -1);
        this.f93a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a$i.RecycleListView_paddingTopNoTitle, -1);
    }
}
