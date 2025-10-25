package f.a.b.a;

import android.app.Activity;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.util.Size;
import f.a.b.a.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class p {
    static Size a(String str, l.a aVar) throws NumberFormatException {
        if (aVar.ordinal() > l.a.high.ordinal()) {
            aVar = l.a.high;
        }
        CamcorderProfile camcorderProfileB = b(str, aVar);
        return new Size(camcorderProfileB.videoFrameWidth, camcorderProfileB.videoFrameHeight);
    }

    public static List<Map<String, Object>> a(Activity activity) throws CameraAccessException {
        CameraManager cameraManager = (CameraManager) activity.getSystemService("camera");
        String[] cameraIdList = cameraManager.getCameraIdList();
        ArrayList arrayList = new ArrayList();
        for (String str : cameraIdList) {
            HashMap map = new HashMap();
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            map.put("name", str);
            map.put("sensorOrientation", Integer.valueOf(((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue()));
            switch (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue()) {
                case 0:
                    map.put("lensFacing", "front");
                    break;
                case 1:
                    map.put("lensFacing", "back");
                    break;
                case 2:
                    map.put("lensFacing", "external");
                    break;
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    static CamcorderProfile b(String str, l.a aVar) throws NumberFormatException {
        int i2 = Integer.parseInt(str);
        switch (o.f5745a[aVar.ordinal()]) {
            case 1:
                if (CamcorderProfile.hasProfile(i2, 1)) {
                    return CamcorderProfile.get(i2, 1);
                }
            case 2:
                if (CamcorderProfile.hasProfile(i2, 8)) {
                    return CamcorderProfile.get(i2, 8);
                }
            case 3:
                if (CamcorderProfile.hasProfile(i2, 6)) {
                    return CamcorderProfile.get(i2, 6);
                }
            case 4:
                if (CamcorderProfile.hasProfile(i2, 5)) {
                    return CamcorderProfile.get(i2, 5);
                }
            case 5:
                if (CamcorderProfile.hasProfile(i2, 4)) {
                    return CamcorderProfile.get(i2, 4);
                }
            case 6:
                if (CamcorderProfile.hasProfile(i2, 7)) {
                    return CamcorderProfile.get(i2, 7);
                }
            default:
                if (CamcorderProfile.hasProfile(i2, 0)) {
                    return CamcorderProfile.get(i2, 0);
                }
                throw new IllegalArgumentException("No capture session available for current capture session.");
        }
    }
}
