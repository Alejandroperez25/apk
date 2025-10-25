package b.d.g;

import android.os.Build;
import android.view.ViewGroup;
import b.d.a$c;

/* loaded from: classes.dex */
public abstract class x {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(a$c.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && v.e(viewGroup) == null) ? false : true;
    }
}
