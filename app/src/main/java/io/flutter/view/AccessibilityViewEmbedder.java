package io.flutter.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Keep
/* loaded from: classes.dex */
final class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final a reflectionAccessors = new a();
    private final SparseArray<b> flutterIdToOrigin = new SparseArray<>();
    private final Map<b, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    AccessibilityViewEmbedder(View view, int i2) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i2;
    }

    public AccessibilityNodeInfo getRootNode(View view, int i2, Rect rect) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long lA = this.reflectionAccessors.a(accessibilityNodeInfoCreateAccessibilityNodeInfo);
        if (lA == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, a.b(lA.longValue()), i2);
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i2, view);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo;
        b bVar = this.flutterIdToOrigin.get(i2);
        if (bVar == null || !this.embeddedViewToDisplayBounds.containsKey(bVar.f6251a) || bVar.f6251a.getAccessibilityNodeProvider() == null || (accessibilityNodeInfoCreateAccessibilityNodeInfo = bVar.f6251a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(bVar.f6252b)) == null) {
            return null;
        }
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i2, bVar.f6251a);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i2, View view) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i2);
        accessibilityNodeInfoObtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(this.rootAccessibilityView, i2);
        accessibilityNodeInfoObtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfoObtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfoObtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        return accessibilityNodeInfoObtain;
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long lB = this.reflectionAccessors.b(accessibilityNodeInfo);
        if (lB == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new b(view, a.b(lB.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int iIntValue;
        for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); i2++) {
            Long lA = this.reflectionAccessors.a(accessibilityNodeInfo, i2);
            if (lA != null) {
                int iB = a.b(lA.longValue());
                b bVar = new b(view, iB);
                if (this.originToFlutterId.containsKey(bVar)) {
                    iIntValue = this.originToFlutterId.get(bVar).intValue();
                } else {
                    int i3 = this.nextFlutterId;
                    this.nextFlutterId = i3 + 1;
                    cacheVirtualIdMappings(view, iB, i3);
                    iIntValue = i3;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, iIntValue);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i2, int i3) {
        b bVar = new b(view, i2);
        this.originToFlutterId.put(bVar, Integer.valueOf(i3));
        this.flutterIdToOrigin.put(i3, bVar);
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        if (Build.VERSION.SDK_INT >= 18) {
            accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        }
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
            accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
            accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
            accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
            accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
            accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
            accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
            accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
            accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
            accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        }
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long lA = this.reflectionAccessors.a(accessibilityEvent);
        if (lA == null) {
            return false;
        }
        int iB = a.b(lA.longValue());
        Integer numValueOf = this.originToFlutterId.get(new b(view, iB));
        if (numValueOf == null) {
            int i2 = this.nextFlutterId;
            this.nextFlutterId = i2 + 1;
            numValueOf = Integer.valueOf(i2);
            cacheVirtualIdMappings(view, iB, numValueOf.intValue());
        }
        accessibilityEventObtain.setSource(this.rootAccessibilityView, numValueOf.intValue());
        accessibilityEventObtain.setClassName(accessibilityEvent.getClassName());
        accessibilityEventObtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i3 = 0; i3 < accessibilityEventObtain.getRecordCount(); i3++) {
            AccessibilityRecord record = accessibilityEventObtain.getRecord(i3);
            Long lA2 = this.reflectionAccessors.a(record);
            if (lA2 == null) {
                return false;
            }
            b bVar = new b(view, a.b(lA2.longValue()));
            if (!this.originToFlutterId.containsKey(bVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(bVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEventObtain);
    }

    public boolean performAction(int i2, int i3, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        b bVar = this.flutterIdToOrigin.get(i2);
        if (bVar == null || (accessibilityNodeProvider = bVar.f6251a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(bVar.f6252b, i3, bundle);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long lA = this.reflectionAccessors.a(accessibilityRecord);
        if (lA == null) {
            return null;
        }
        return this.originToFlutterId.get(new b(view, a.b(lA.longValue())));
    }

    public boolean onAccessibilityHoverEvent(int i2, MotionEvent motionEvent) {
        b bVar = this.flutterIdToOrigin.get(i2);
        if (bVar == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(bVar.f6251a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
            motionEvent.getPointerProperties(i3, pointerPropertiesArr[i3]);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i3, pointerCoords);
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i3].x -= rect.left;
            pointerCoordsArr[i3].y -= rect.top;
        }
        return bVar.f6251a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final View f6251a;

        /* renamed from: b, reason: collision with root package name */
        final int f6252b;

        private b(View view, int i2) {
            this.f6251a = view;
            this.f6252b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f6252b == bVar.f6252b && this.f6251a.equals(bVar.f6251a);
        }

        public int hashCode() {
            return ((this.f6251a.hashCode() + 31) * 31) + this.f6252b;
        }
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f6245a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f6246b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f6247c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f6248d;

        /* renamed from: e, reason: collision with root package name */
        private final Field f6249e;

        /* renamed from: f, reason: collision with root package name */
        private final Method f6250f;

        private static boolean a(long j, int i2) {
            return (j & (1 << i2)) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int b(long j) {
            return (int) (j >> 32);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @SuppressLint({"PrivateApi"})
        private a() throws NoSuchFieldException, NoSuchMethodException, SecurityException {
            Method method;
            Method method2;
            Method method3;
            Field declaredField;
            Method method4;
            Method method5;
            Field field;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                Log.w(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                Log.w(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (Build.VERSION.SDK_INT <= 26) {
                try {
                    method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
                } catch (NoSuchMethodException unused3) {
                    Log.w(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                    method5 = null;
                }
                try {
                    method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                    field = null;
                } catch (NoSuchMethodException unused4) {
                    Log.w(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                    method3 = null;
                    field = null;
                }
                method6 = method5;
                declaredField = field;
                method4 = field;
            } else {
                try {
                    declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method4 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                    method3 = null;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused5) {
                    Log.w(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method3 = null;
                    declaredField = null;
                    method4 = 0;
                }
            }
            this.f6245a = method;
            this.f6246b = method6;
            this.f6247c = method2;
            this.f6248d = method3;
            this.f6249e = declaredField;
            this.f6250f = method4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long a(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (this.f6245a == null) {
                return null;
            }
            try {
                return (Long) this.f6245a.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.w(AccessibilityViewEmbedder.TAG, e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.w(AccessibilityViewEmbedder.TAG, e3);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long a(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
            if (this.f6248d == null && (this.f6249e == null || this.f6250f == null)) {
                return null;
            }
            if (this.f6248d != null) {
                try {
                    return (Long) this.f6248d.invoke(accessibilityNodeInfo, Integer.valueOf(i2));
                } catch (IllegalAccessException e2) {
                    Log.w(AccessibilityViewEmbedder.TAG, e2);
                } catch (InvocationTargetException e3) {
                    Log.w(AccessibilityViewEmbedder.TAG, e3);
                }
            } else {
                try {
                    return Long.valueOf(((Long) this.f6250f.invoke(this.f6249e.get(accessibilityNodeInfo), Integer.valueOf(i2))).longValue());
                } catch (ArrayIndexOutOfBoundsException | InvocationTargetException e4) {
                    Log.w(AccessibilityViewEmbedder.TAG, e4);
                } catch (IllegalAccessException e5) {
                    Log.w(AccessibilityViewEmbedder.TAG, e5);
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long b(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (this.f6246b != null) {
                try {
                    return Long.valueOf(((Long) this.f6246b.invoke(accessibilityNodeInfo, new Object[0])).longValue());
                } catch (IllegalAccessException e2) {
                    Log.w(AccessibilityViewEmbedder.TAG, e2);
                } catch (InvocationTargetException e3) {
                    Log.w(AccessibilityViewEmbedder.TAG, e3);
                }
            }
            return c(accessibilityNodeInfo);
        }

        private static Long c(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                Log.w(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.setDataPosition(0);
            accessibilityNodeInfoObtain.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            long j = parcelObtain.readLong();
            if (a(j, 0)) {
                parcelObtain.readInt();
            }
            if (a(j, 1)) {
                parcelObtain.readLong();
            }
            if (a(j, 2)) {
                parcelObtain.readInt();
            }
            Long lValueOf = a(j, 3) ? Long.valueOf(parcelObtain.readLong()) : null;
            parcelObtain.recycle();
            return lValueOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long a(AccessibilityRecord accessibilityRecord) {
            if (this.f6247c == null) {
                return null;
            }
            try {
                return (Long) this.f6247c.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.w(AccessibilityViewEmbedder.TAG, e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.w(AccessibilityViewEmbedder.TAG, e3);
                return null;
            }
        }
    }
}
