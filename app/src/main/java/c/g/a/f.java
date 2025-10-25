package c.g.a;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import c.d.d.AbstractC0280f;
import c.g.a.C0317k$u;
import c.g.a.h;
import c.g.a.k$C;
import c.g.a.k$E;
import c.g.a.k$G;
import c.g.a.k$O;
import c.g.a.k$Q;
import c.g.a.k$S;
import c.g.a.k$U;
import c.g.a.k$W;
import c.g.a.k$y;
import java.util.Iterator;

/* loaded from: classes.dex */
class f extends BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f4480a;

    f(h hVar) {
        this.f4480a = hVar;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i2, int i3) {
        this.f4480a.a(h.a.DEBUG, "[onConnectionStateChange] status: " + i2 + " newState: " + i3);
        if (i3 == 0 && !this.f4480a.f4491h.containsKey(bluetoothGatt.getDevice().getAddress())) {
            bluetoothGatt.close();
        }
        this.f4480a.a("DeviceState", i.a(bluetoothGatt.getDevice(), i3).d());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i2) {
        this.f4480a.a(h.a.DEBUG, "[onServicesDiscovered] count: " + bluetoothGatt.getServices().size() + " status: " + i2);
        C0317k$u.a aVarL = C0317k$u.l();
        aVarL.a(bluetoothGatt.getDevice().getAddress());
        Iterator<BluetoothGattService> it = bluetoothGatt.getServices().iterator();
        while (it.hasNext()) {
            aVarL.a(i.a(bluetoothGatt.getDevice(), it.next(), bluetoothGatt));
        }
        this.f4480a.a("DiscoverServicesResult", aVarL.f().d());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        this.f4480a.a(h.a.DEBUG, "[onCharacteristicRead] uuid: " + bluetoothGattCharacteristic.getUuid().toString() + " status: " + i2);
        k$C.a aVarL = k$C.l();
        aVarL.a(bluetoothGatt.getDevice().getAddress());
        aVarL.a(i.a(bluetoothGatt.getDevice(), bluetoothGattCharacteristic, bluetoothGatt));
        this.f4480a.a("ReadCharacteristicResponse", aVarL.f().d());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        this.f4480a.a(h.a.DEBUG, "[onCharacteristicWrite] uuid: " + bluetoothGattCharacteristic.getUuid().toString() + " status: " + i2);
        k$Q.a aVarL = k$Q.l();
        aVarL.a(bluetoothGatt.getDevice().getAddress());
        aVarL.b(bluetoothGattCharacteristic.getUuid().toString());
        aVarL.c(bluetoothGattCharacteristic.getService().getUuid().toString());
        k$S.a aVarL2 = k$S.l();
        aVarL2.a(aVarL);
        aVarL2.a(i2 == 0);
        this.f4480a.a("WriteCharacteristicResponse", aVarL2.f().d());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f4480a.a(h.a.DEBUG, "[onCharacteristicChanged] uuid: " + bluetoothGattCharacteristic.getUuid().toString());
        k$y.a aVarL = k$y.l();
        aVarL.a(bluetoothGatt.getDevice().getAddress());
        aVarL.a(i.a(bluetoothGatt.getDevice(), bluetoothGattCharacteristic, bluetoothGatt));
        this.f4480a.a("OnCharacteristicChanged", aVarL.f().d());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
        this.f4480a.a(h.a.DEBUG, "[onDescriptorRead] uuid: " + bluetoothGattDescriptor.getUuid().toString() + " status: " + i2);
        k$E.a aVarL = k$E.l();
        aVarL.a(bluetoothGatt.getDevice().getAddress());
        aVarL.e(bluetoothGattDescriptor.getCharacteristic().getUuid().toString());
        aVarL.b(bluetoothGattDescriptor.getUuid().toString());
        if (bluetoothGattDescriptor.getCharacteristic().getService().getType() == 0) {
            aVarL.c(bluetoothGattDescriptor.getCharacteristic().getService().getUuid().toString());
        } else {
            for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
                Iterator<BluetoothGattService> it = bluetoothGattService.getIncludedServices().iterator();
                while (true) {
                    if (it.hasNext()) {
                        BluetoothGattService next = it.next();
                        if (next.getUuid().equals(bluetoothGattDescriptor.getCharacteristic().getService().getUuid())) {
                            aVarL.c(bluetoothGattService.getUuid().toString());
                            aVarL.d(next.getUuid().toString());
                            break;
                        }
                    }
                }
            }
        }
        k$G.a aVarL2 = k$G.l();
        aVarL2.a(aVarL);
        aVarL2.a(AbstractC0280f.a(bluetoothGattDescriptor.getValue()));
        this.f4480a.a("ReadDescriptorResponse", aVarL2.f().d());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
        this.f4480a.a(h.a.DEBUG, "[onDescriptorWrite] uuid: " + bluetoothGattDescriptor.getUuid().toString() + " status: " + i2);
        k$U.a aVarL = k$U.l();
        aVarL.a(bluetoothGatt.getDevice().getAddress());
        aVarL.b(bluetoothGattDescriptor.getUuid().toString());
        aVarL.d(bluetoothGattDescriptor.getCharacteristic().getUuid().toString());
        aVarL.c(bluetoothGattDescriptor.getCharacteristic().getService().getUuid().toString());
        k$W.a aVarL2 = k$W.l();
        aVarL2.a(aVarL);
        aVarL2.a(i2 == 0);
        this.f4480a.a("WriteDescriptorResponse", aVarL2.f().d());
        if (bluetoothGattDescriptor.getUuid().compareTo(h.f4484a) == 0) {
            k$O.a aVarL3 = k$O.l();
            aVarL3.a(bluetoothGatt.getDevice().getAddress());
            aVarL3.a(i.a(bluetoothGatt.getDevice(), bluetoothGattDescriptor.getCharacteristic(), bluetoothGatt));
            this.f4480a.a("SetNotificationResponse", aVarL3.f().d());
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i2) {
        this.f4480a.a(h.a.DEBUG, "[onReliableWriteCompleted] status: " + i2);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i2, int i3) {
        this.f4480a.a(h.a.DEBUG, "[onReadRemoteRssi] rssi: " + i2 + " status: " + i3);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i2, int i3) {
        this.f4480a.a(h.a.DEBUG, "[onMtuChanged] mtu: " + i2 + " status: " + i3);
    }
}
