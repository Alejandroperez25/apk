package c.g.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.Build;
import android.os.ParcelUuid;
import android.util.SparseArray;
import c.d.d.AbstractC0280f;
import c.g.a.C0297k$a;
import c.g.a.C0299k$c;
import c.g.a.C0301k$e;
import c.g.a.C0303k$g;
import c.g.a.C0305k$i;
import c.g.a.C0309k$m;
import c.g.a.C0315k$s;
import c.g.a.C0319k$w;
import c.g.a.k$I;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final UUID f4502a = UUID.fromString("000002902-0000-1000-8000-00805f9b34fb");

    static k$I a(BluetoothDevice bluetoothDevice, byte[] bArr, int i2) {
        k$I.a aVarL = k$I.l();
        aVarL.a(a(bluetoothDevice));
        if (bArr != null && bArr.length > 0) {
            aVarL.a(a.a(bArr));
        }
        aVarL.a(i2);
        return aVarL.f();
    }

    @TargetApi(21)
    static k$I a(BluetoothDevice bluetoothDevice, ScanResult scanResult) {
        k$I.a aVarL = k$I.l();
        aVarL.a(a(bluetoothDevice));
        C0297k$a.a aVarL2 = C0297k$a.l();
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (Build.VERSION.SDK_INT >= 26) {
            aVarL2.a(scanResult.isConnectable());
        } else if (scanRecord != null) {
            aVarL2.a((scanRecord.getAdvertiseFlags() & 2) > 0);
        }
        if (scanRecord != null) {
            String deviceName = scanRecord.getDeviceName();
            if (deviceName != null) {
                aVarL2.a(deviceName);
            }
            int txPowerLevel = scanRecord.getTxPowerLevel();
            if (txPowerLevel != Integer.MIN_VALUE) {
                C0319k$w.a aVarL3 = C0319k$w.l();
                aVarL3.a(txPowerLevel);
                aVarL2.a(aVarL3);
            }
            SparseArray<byte[]> manufacturerSpecificData = scanRecord.getManufacturerSpecificData();
            for (int i2 = 0; i2 < manufacturerSpecificData.size(); i2++) {
                aVarL2.a(manufacturerSpecificData.keyAt(i2), AbstractC0280f.a(manufacturerSpecificData.valueAt(i2)));
            }
            for (Map.Entry<ParcelUuid, byte[]> entry : scanRecord.getServiceData().entrySet()) {
                aVarL2.a(entry.getKey().getUuid().toString(), AbstractC0280f.a(entry.getValue()));
            }
            List<ParcelUuid> serviceUuids = scanRecord.getServiceUuids();
            if (serviceUuids != null) {
                Iterator<ParcelUuid> it = serviceUuids.iterator();
                while (it.hasNext()) {
                    aVarL2.b(it.next().getUuid().toString());
                }
            }
        }
        aVarL.a(scanResult.getRssi());
        aVarL.a(aVarL2.f());
        return aVarL.f();
    }

    static C0303k$g a(BluetoothDevice bluetoothDevice) {
        C0303k$g.a aVarL = C0303k$g.l();
        aVarL.a(bluetoothDevice.getAddress());
        String name = bluetoothDevice.getName();
        if (name != null) {
            aVarL.b(name);
        }
        switch (bluetoothDevice.getType()) {
            case 1:
                aVarL.a(C0303k$g.b.CLASSIC);
                break;
            case 2:
                aVarL.a(C0303k$g.b.LE);
                break;
            case 3:
                aVarL.a(C0303k$g.b.DUAL);
                break;
            default:
                aVarL.a(C0303k$g.b.UNKNOWN);
                break;
        }
        return aVarL.f();
    }

    static C0305k$i a(BluetoothDevice bluetoothDevice, BluetoothGattService bluetoothGattService, BluetoothGatt bluetoothGatt) {
        C0305k$i.a aVarL = C0305k$i.l();
        aVarL.b(bluetoothDevice.getAddress());
        aVarL.a(bluetoothGattService.getUuid().toString());
        aVarL.a(bluetoothGattService.getType() == 0);
        Iterator<BluetoothGattCharacteristic> it = bluetoothGattService.getCharacteristics().iterator();
        while (it.hasNext()) {
            aVarL.a(a(bluetoothDevice, it.next(), bluetoothGatt));
        }
        Iterator<BluetoothGattService> it2 = bluetoothGattService.getIncludedServices().iterator();
        while (it2.hasNext()) {
            aVarL.a(a(bluetoothDevice, it2.next(), bluetoothGatt));
        }
        return aVarL.f();
    }

    static C0299k$c a(BluetoothDevice bluetoothDevice, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGatt bluetoothGatt) {
        C0299k$c.a aVarL = C0299k$c.l();
        aVarL.b(bluetoothDevice.getAddress());
        aVarL.a(bluetoothGattCharacteristic.getUuid().toString());
        aVarL.a(a(bluetoothGattCharacteristic.getProperties()));
        if (bluetoothGattCharacteristic.getValue() != null) {
            aVarL.a(AbstractC0280f.a(bluetoothGattCharacteristic.getValue()));
        }
        Iterator<BluetoothGattDescriptor> it = bluetoothGattCharacteristic.getDescriptors().iterator();
        while (it.hasNext()) {
            aVarL.a(a(bluetoothDevice, it.next()));
        }
        if (bluetoothGattCharacteristic.getService().getType() == 0) {
            aVarL.c(bluetoothGattCharacteristic.getService().getUuid().toString());
        } else {
            for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
                Iterator<BluetoothGattService> it2 = bluetoothGattService.getIncludedServices().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        BluetoothGattService next = it2.next();
                        if (next.getUuid().equals(bluetoothGattCharacteristic.getService().getUuid())) {
                            aVarL.c(bluetoothGattService.getUuid().toString());
                            aVarL.d(next.getUuid().toString());
                            break;
                        }
                    }
                }
            }
        }
        return aVarL.f();
    }

    static C0301k$e a(BluetoothDevice bluetoothDevice, BluetoothGattDescriptor bluetoothGattDescriptor) {
        C0301k$e.a aVarL = C0301k$e.l();
        aVarL.b(bluetoothDevice.getAddress());
        aVarL.a(bluetoothGattDescriptor.getUuid().toString());
        aVarL.d(bluetoothGattDescriptor.getCharacteristic().getUuid().toString());
        aVarL.c(bluetoothGattDescriptor.getCharacteristic().getService().getUuid().toString());
        if (bluetoothGattDescriptor.getValue() != null) {
            aVarL.a(AbstractC0280f.a(bluetoothGattDescriptor.getValue()));
        }
        return aVarL.f();
    }

    static C0309k$m a(int i2) {
        C0309k$m.a aVarL = C0309k$m.l();
        aVarL.a((i2 & 1) != 0);
        aVarL.b((i2 & 2) != 0);
        aVarL.c((i2 & 4) != 0);
        aVarL.d((i2 & 8) != 0);
        aVarL.e((i2 & 16) != 0);
        aVarL.f((i2 & 32) != 0);
        aVarL.g((i2 & 64) != 0);
        aVarL.h((i2 & 128) != 0);
        aVarL.i((i2 & 256) != 0);
        aVarL.j((i2 & 512) != 0);
        return aVarL.f();
    }

    static C0315k$s a(BluetoothDevice bluetoothDevice, int i2) {
        C0315k$s.b bVarL = C0315k$s.l();
        switch (i2) {
            case 0:
                bVarL.a(C0315k$s.a.DISCONNECTED);
                break;
            case 1:
                bVarL.a(C0315k$s.a.CONNECTING);
                break;
            case 2:
                bVarL.a(C0315k$s.a.CONNECTED);
                break;
            case 3:
                bVarL.a(C0315k$s.a.DISCONNECTING);
                break;
        }
        bVarL.a(bluetoothDevice.getAddress());
        return bVarL.f();
    }
}
