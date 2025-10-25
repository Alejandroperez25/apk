package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.A;
import b.a.a$e;
import b.a.a$i;

/* loaded from: classes.dex */
public class AlertDialogLayout extends A {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.A, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (e(i2, i3)) {
            return;
        }
        super.onMeasure(i2, i3);
    }

    private boolean e(int i2, int i3) {
        int iCombineMeasuredStates;
        int iC;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == a$e.topPanel) {
                    view = childAt;
                } else if (id == a$e.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != a$e.contentPanel && id != a$e.customPanel) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i2, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i2, 0);
            iC = c(view2);
            measuredHeight = view2.getMeasuredHeight() - iC;
            paddingTop += iC;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iC = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i2, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i5 = size - paddingTop;
        if (view2 != null) {
            int i6 = paddingTop - iC;
            int iMin = Math.min(i5, measuredHeight);
            if (iMin > 0) {
                i5 -= iMin;
                iC += iMin;
            }
            view2.measure(i2, View.MeasureSpec.makeMeasureSpec(iC, 1073741824));
            paddingTop = i6 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i5 > 0) {
            view3.measure(i2, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i5, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i2, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i3, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        f(childCount, i3);
        return true;
    }

    private void f(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                A.a aVar = (A.a) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i3, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i5;
                }
            }
        }
    }

    private static int c(View view) {
        int iD = b.d.g.v.d(view);
        if (iD > 0) {
            return iD;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return c(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.A, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int paddingTop;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i4 - i2;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i8 = gravity & a$i.AppCompatTheme_windowActionBarOverlay;
        int i9 = gravity & 8388615;
        if (i8 == 16) {
            paddingTop = (((i5 - i3) - measuredHeight) / 2) + getPaddingTop();
        } else if (i8 == 80) {
            paddingTop = ((getPaddingTop() + i5) - i3) - measuredHeight;
        } else {
            paddingTop = getPaddingTop();
        }
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                A.a aVar = (A.a) childAt.getLayoutParams();
                int i11 = aVar.f206b;
                if (i11 < 0) {
                    i11 = i9;
                }
                int iA = b.d.g.c.a(i11, b.d.g.v.b(this)) & 7;
                if (iA == 1) {
                    i6 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                } else if (iA == 5) {
                    i6 = (paddingRight - measuredWidth) - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                } else {
                    i6 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                }
                if (b(i10)) {
                    paddingTop += intrinsicHeight;
                }
                int i12 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                b(childAt, i6, i12, measuredWidth, measuredHeight2);
                paddingTop = i12 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            }
        }
    }

    private void b(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }
}
