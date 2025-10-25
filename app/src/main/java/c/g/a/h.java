package c.g.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import android.os.ParcelUuid;
import android.util.Log;
import c.d.d.C0291q;
import c.g.a.C0307k$k;
import c.g.a.C0311k$o;
import c.g.a.C0313k$q;
import c.g.a.C0317k$u;
import c.g.a.k$A;
import c.g.a.k$E;
import c.g.a.k$K;
import c.g.a.k$M;
import c.g.a.k$Q;
import c.g.a.k$U;
import f.a.a.a.g;
import f.a.a.a.o;
import f.a.a.a.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class h implements o.c, q.e {

    /* renamed from: a, reason: collision with root package name */
    private static final UUID f4484a = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: b, reason: collision with root package name */
    private final q.d f4485b;

    /* renamed from: c, reason: collision with root package name */
    private final Activity f4486c;

    /* renamed from: d, reason: collision with root package name */
    private final f.a.a.a.o f4487d;

    /* renamed from: e, reason: collision with root package name */
    private final f.a.a.a.g f4488e;

    /* renamed from: f, reason: collision with root package name */
    private final BluetoothManager f4489f;

    /* renamed from: g, reason: collision with root package name */
    private BluetoothAdapter f4490g;
    private f.a.a.a.m j;
    private o.d k;
    private ScanCallback m;
    private BluetoothAdapter.LeScanCallback n;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, BluetoothGatt> f4491h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private a f4492i = a.EMERGENCY;
    private final g.c l = new c(this);
    private final BluetoothGattCallback o = new f(this);

    enum a {
        EMERGENCY,
        ALERT,
        CRITICAL,
        ERROR,
        WARNING,
        NOTICE,
        INFO,
        DEBUG
    }

    public static void a(q.d dVar) {
        dVar.a(new h(dVar));
    }

    h(q.d dVar) {
        this.f4485b = dVar;
        this.f4486c = dVar.d();
        this.f4487d = new f.a.a.a.o(this.f4485b.f(), "plugins.pauldemarco.com/flutter_blue/methods");
        this.f4488e = new f.a.a.a.g(this.f4485b.f(), "plugins.pauldemarco.com/flutter_blue/state");
        this.f4489f = (BluetoothManager) dVar.d().getSystemService("bluetooth");
        this.f4490g = this.f4489f.getAdapter();
        this.f4487d.a(this);
        this.f4488e.a(this.l);
    }

    @Override // f.a.a.a.o.c
    public void a(f.a.a.a.m mVar, o.d dVar) throws Exception {
        BluetoothGatt bluetoothGattConnectGatt;
        byte[] bArr;
        if (this.f4490g == null && !"isAvailable".equals(mVar.f5663a)) {
            dVar.a("bluetooth_unavailable", "the device does not have bluetooth", null);
        }
        switch (mVar.f5663a) {
            case "setLogLevel":
                this.f4492i = a.values()[((Integer) mVar.f5664b).intValue()];
                dVar.a(null);
                break;
            case "state":
                C0307k$k.a aVarL = C0307k$k.l();
                try {
                    switch (this.f4490g.getState()) {
                        case 10:
                            aVarL.a(C0307k$k.b.OFF);
                            break;
                        case 11:
                            aVarL.a(C0307k$k.b.TURNING_ON);
                            break;
                        case 12:
                            aVarL.a(C0307k$k.b.ON);
                            break;
                        case 13:
                            aVarL.a(C0307k$k.b.TURNING_OFF);
                            break;
                        default:
                            aVarL.a(C0307k$k.b.UNKNOWN);
                            break;
                    }
                } catch (SecurityException unused) {
                    aVarL.a(C0307k$k.b.UNAUTHORIZED);
                }
                dVar.a(aVarL.f().d());
                break;
            case "isAvailable":
                dVar.a(Boolean.valueOf(this.f4490g != null));
                break;
            case "isOn":
                dVar.a(Boolean.valueOf(this.f4490g.isEnabled()));
                break;
            case "startScan":
                if (androidx.core.content.a.b(this.f4486c, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    androidx.core.app.b.a(this.f4486c, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, 1452);
                    this.j = mVar;
                    this.k = dVar;
                    break;
                } else {
                    b(mVar, dVar);
                    break;
                }
            case "stopScan":
                b();
                dVar.a(null);
                break;
            case "getConnectedDevices":
                List<BluetoothDevice> connectedDevices = this.f4489f.getConnectedDevices(7);
                C0313k$q.a aVarL2 = C0313k$q.l();
                Iterator<BluetoothDevice> it = connectedDevices.iterator();
                while (it.hasNext()) {
                    aVarL2.a(i.a(it.next()));
                }
                dVar.a(aVarL2.f().d());
                a(a.EMERGENCY, "mGattServers size: " + this.f4491h.size());
                break;
            case "connect":
                byte[] bArr2 = (byte[]) mVar.a();
                try {
                    C0311k$o.a aVarL3 = C0311k$o.l();
                    aVarL3.a(bArr2);
                    C0311k$o c0311k$oF = aVarL3.f();
                    String strN = c0311k$oF.n();
                    BluetoothDevice remoteDevice = this.f4490g.getRemoteDevice(strN);
                    boolean zContains = this.f4489f.getConnectedDevices(7).contains(remoteDevice);
                    if (this.f4491h.containsKey(strN) && zContains) {
                        dVar.a("already_connected", "connection with device already exists", null);
                        break;
                    } else if (this.f4491h.containsKey(strN) && !zContains) {
                        if (this.f4491h.get(strN).connect()) {
                            dVar.a(null);
                            break;
                        } else {
                            dVar.a("reconnect_error", "error when reconnecting to device", null);
                            break;
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 23) {
                            bluetoothGattConnectGatt = remoteDevice.connectGatt(this.f4486c, c0311k$oF.o(), this.o, 2);
                        } else {
                            bluetoothGattConnectGatt = remoteDevice.connectGatt(this.f4486c, c0311k$oF.o(), this.o);
                        }
                        this.f4491h.put(strN, bluetoothGattConnectGatt);
                        dVar.a(null);
                        break;
                    }
                } catch (C0291q e2) {
                    dVar.a("RuntimeException", e2.getMessage(), e2);
                    return;
                }
            case "disconnect":
                BluetoothGatt bluetoothGattRemove = this.f4491h.remove((String) mVar.f5664b);
                if (bluetoothGattRemove != null) {
                    bluetoothGattRemove.disconnect();
                }
                dVar.a(null);
                break;
            case "deviceState":
                BluetoothDevice remoteDevice2 = this.f4490g.getRemoteDevice((String) mVar.f5664b);
                try {
                    dVar.a(i.a(remoteDevice2, this.f4489f.getConnectionState(remoteDevice2, 7)).d());
                    break;
                } catch (Exception e3) {
                    dVar.a("device_state_error", e3.getMessage(), null);
                    return;
                }
            case "discoverServices":
                BluetoothGatt bluetoothGatt = this.f4491h.get((String) mVar.f5664b);
                if (bluetoothGatt == null) {
                    dVar.a("discover_services_error", "no instance of BluetoothGatt, have you connected first?", null);
                    break;
                } else if (bluetoothGatt.discoverServices()) {
                    dVar.a(null);
                    break;
                } else {
                    dVar.a("discover_services_error", "unknown reason", null);
                    break;
                }
            case "services":
                String str = (String) mVar.f5664b;
                BluetoothGatt bluetoothGatt2 = this.f4491h.get(str);
                if (bluetoothGatt2 == null) {
                    dVar.a("get_services_error", "no instance of BluetoothGatt, have you connected first?", null);
                    break;
                } else {
                    C0317k$u.a aVarL4 = C0317k$u.l();
                    aVarL4.a(str);
                    Iterator<BluetoothGattService> it2 = bluetoothGatt2.getServices().iterator();
                    while (it2.hasNext()) {
                        aVarL4.a(i.a(bluetoothGatt2.getDevice(), it2.next(), bluetoothGatt2));
                    }
                    dVar.a(aVarL4.f().d());
                    break;
                }
            case "readCharacteristic":
                byte[] bArr3 = (byte[]) mVar.a();
                try {
                    k$A.a aVarL5 = k$A.l();
                    aVarL5.a(bArr3);
                    k$A k_aF = aVarL5.f();
                    try {
                        BluetoothGatt bluetoothGattA = a(k_aF.n());
                        if (bluetoothGattA.readCharacteristic(a(bluetoothGattA, k_aF.p(), k_aF.q(), k_aF.o()))) {
                            dVar.a(null);
                            break;
                        } else {
                            dVar.a("read_characteristic_error", "unknown reason, may occur if readCharacteristic was called before last read finished.", null);
                            break;
                        }
                    } catch (Exception e4) {
                        dVar.a("read_characteristic_error", e4.getMessage(), null);
                        return;
                    }
                } catch (C0291q e5) {
                    dVar.a("RuntimeException", e5.getMessage(), e5);
                    return;
                }
            case "readDescriptor":
                byte[] bArr4 = (byte[]) mVar.a();
                try {
                    k$E.a aVarL6 = k$E.l();
                    aVarL6.a(bArr4);
                    k$E k_eF = aVarL6.f();
                    try {
                        BluetoothGatt bluetoothGattA2 = a(k_eF.p());
                        if (bluetoothGattA2.readDescriptor(a(a(bluetoothGattA2, k_eF.r(), k_eF.s(), k_eF.t()), k_eF.q()))) {
                            dVar.a(null);
                            break;
                        } else {
                            dVar.a("read_descriptor_error", "unknown reason, may occur if readDescriptor was called before last read finished.", null);
                            break;
                        }
                    } catch (Exception e6) {
                        dVar.a("read_descriptor_error", e6.getMessage(), null);
                        return;
                    }
                } catch (C0291q e7) {
                    dVar.a("RuntimeException", e7.getMessage(), e7);
                    return;
                }
            case "writeCharacteristic":
                byte[] bArr5 = (byte[]) mVar.a();
                try {
                    k$Q.a aVarL7 = k$Q.l();
                    aVarL7.a(bArr5);
                    k$Q k_qF = aVarL7.f();
                    try {
                        BluetoothGatt bluetoothGattA3 = a(k_qF.p());
                        BluetoothGattCharacteristic bluetoothGattCharacteristicA = a(bluetoothGattA3, k_qF.r(), k_qF.s(), k_qF.q());
                        if (!bluetoothGattCharacteristicA.setValue(k_qF.u().c())) {
                            dVar.a("write_characteristic_error", "could not set the local value of characteristic", null);
                        }
                        if (k_qF.t() == k$Q.b.WITHOUT_RESPONSE) {
                            bluetoothGattCharacteristicA.setWriteType(1);
                        } else {
                            bluetoothGattCharacteristicA.setWriteType(2);
                        }
                        if (!bluetoothGattA3.writeCharacteristic(bluetoothGattCharacteristicA)) {
                            dVar.a("write_characteristic_error", "writeCharacteristic failed", null);
                            break;
                        } else {
                            dVar.a(null);
                            break;
                        }
                    } catch (Exception e8) {
                        dVar.a("write_characteristic_error", e8.getMessage(), null);
                        return;
                    }
                } catch (C0291q e9) {
                    dVar.a("RuntimeException", e9.getMessage(), e9);
                    return;
                }
            case "writeDescriptor":
                byte[] bArr6 = (byte[]) mVar.a();
                try {
                    k$U.a aVarL8 = k$U.l();
                    aVarL8.a(bArr6);
                    k$U k_uF = aVarL8.f();
                    try {
                        BluetoothGatt bluetoothGattA4 = a(k_uF.p());
                        BluetoothGattDescriptor bluetoothGattDescriptorA = a(a(bluetoothGattA4, k_uF.r(), k_uF.s(), k_uF.t()), k_uF.q());
                        if (!bluetoothGattDescriptorA.setValue(k_uF.u().c())) {
                            dVar.a("write_descriptor_error", "could not set the local value for descriptor", null);
                        }
                        if (!bluetoothGattA4.writeDescriptor(bluetoothGattDescriptorA)) {
                            dVar.a("write_descriptor_error", "writeCharacteristic failed", null);
                            break;
                        } else {
                            dVar.a(null);
                            break;
                        }
                    } catch (Exception e10) {
                        dVar.a("write_descriptor_error", e10.getMessage(), null);
                        return;
                    }
                } catch (C0291q e11) {
                    dVar.a("RuntimeException", e11.getMessage(), e11);
                    return;
                }
            case "setNotification":
                byte[] bArr7 = (byte[]) mVar.a();
                try {
                    k$M.a aVarL9 = k$M.l();
                    aVarL9.a(bArr7);
                    k$M k_mF = aVarL9.f();
                    try {
                        BluetoothGatt bluetoothGattA5 = a(k_mF.n());
                        BluetoothGattCharacteristic bluetoothGattCharacteristicA2 = a(bluetoothGattA5, k_mF.o(), k_mF.p(), k_mF.q());
                        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristicA2.getDescriptor(f4484a);
                        if (descriptor == null) {
                            throw new Exception("could not locate CCCD descriptor for characteristic: " + bluetoothGattCharacteristicA2.getUuid().toString());
                        }
                        if (k_mF.r()) {
                            boolean z = (16 & bluetoothGattCharacteristicA2.getProperties()) > 0;
                            boolean z2 = (bluetoothGattCharacteristicA2.getProperties() & 32) > 0;
                            if (!z2 && !z) {
                                dVar.a("set_notification_error", "the characteristic cannot notify or indicate", null);
                                break;
                            } else {
                                bArr = z2 ? BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : null;
                                if (z) {
                                    bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
                                }
                            }
                        } else {
                            bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
                        }
                        if (!bluetoothGattA5.setCharacteristicNotification(bluetoothGattCharacteristicA2, k_mF.r())) {
                            dVar.a("set_notification_error", "could not set characteristic notifications to :" + k_mF.r(), null);
                            break;
                        } else if (!descriptor.setValue(bArr)) {
                            dVar.a("set_notification_error", "error when setting the descriptor value to: " + bArr, null);
                            break;
                        } else if (!bluetoothGattA5.writeDescriptor(descriptor)) {
                            dVar.a("set_notification_error", "error when writing the descriptor", null);
                            break;
                        } else {
                            dVar.a(null);
                            break;
                        }
                    } catch (Exception e12) {
                        dVar.a("set_notification_error", e12.getMessage(), null);
                        return;
                    }
                } catch (C0291q e13) {
                    dVar.a("RuntimeException", e13.getMessage(), e13);
                    return;
                }
            default:
                dVar.a();
                break;
        }
    }

    @Override // f.a.a.a.q.e
    public boolean a(int i2, String[] strArr, int[] iArr) {
        if (i2 != 1452) {
            return false;
        }
        if (iArr[0] == 0) {
            b(this.j, this.k);
            return true;
        }
        this.k.a("no_permissions", "flutter_blue plugin requires location permissions for scanning", null);
        this.k = null;
        this.j = null;
        return true;
    }

    private BluetoothGatt a(String str) throws Exception {
        BluetoothGatt bluetoothGatt = this.f4491h.get(str);
        if (bluetoothGatt != null) {
            return bluetoothGatt;
        }
        throw new Exception("no instance of BluetoothGatt, have you connected first?");
    }

    private BluetoothGattCharacteristic a(BluetoothGatt bluetoothGatt, String str, String str2, String str3) throws Exception {
        BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(str));
        if (service == null) {
            throw new Exception("service (" + str + ") could not be located on the device");
        }
        BluetoothGattService bluetoothGattService = null;
        if (str2.length() > 0) {
            for (BluetoothGattService bluetoothGattService2 : service.getIncludedServices()) {
                if (bluetoothGattService2.getUuid().equals(UUID.fromString(str2))) {
                    bluetoothGattService = bluetoothGattService2;
                }
            }
            if (bluetoothGattService == null) {
                throw new Exception("secondary service (" + str2 + ") could not be located on the device");
            }
        }
        if (bluetoothGattService != null) {
            service = bluetoothGattService;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(UUID.fromString(str3));
        if (characteristic != null) {
            return characteristic;
        }
        throw new Exception("characteristic (" + str3 + ") could not be located in the service (" + service.getUuid().toString() + ")");
    }

    private BluetoothGattDescriptor a(BluetoothGattCharacteristic bluetoothGattCharacteristic, String str) throws Exception {
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString(str));
        if (descriptor != null) {
            return descriptor;
        }
        throw new Exception("descriptor (" + str + ") could not be located in the characteristic (" + bluetoothGattCharacteristic.getUuid().toString() + ")");
    }

    private void b(f.a.a.a.m mVar, o.d dVar) {
        byte[] bArr = (byte[]) mVar.a();
        try {
            k$K.a aVarL = k$K.l();
            aVarL.a(bArr);
            k$K k_kF = aVarL.f();
            if (Build.VERSION.SDK_INT >= 21) {
                a(k_kF);
            } else {
                b(k_kF);
            }
            dVar.a(null);
        } catch (Exception e2) {
            dVar.a("startScan", e2.getMessage(), e2);
        }
    }

    private void b() {
        if (Build.VERSION.SDK_INT >= 21) {
            d();
        } else {
            f();
        }
    }

    @TargetApi(21)
    private ScanCallback c() {
        if (this.m == null) {
            this.m = new d(this);
        }
        return this.m;
    }

    @TargetApi(21)
    private void a(k$K k_k) {
        BluetoothLeScanner bluetoothLeScanner = this.f4490g.getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            throw new IllegalStateException("getBluetoothLeScanner() is null. Is the Adapter on?");
        }
        int iN = k_k.n();
        int iP = k_k.p();
        ArrayList arrayList = new ArrayList(iP);
        for (int i2 = 0; i2 < iP; i2++) {
            arrayList.add(new ScanFilter.Builder().setServiceUuid(ParcelUuid.fromString(k_k.a(i2))).build());
        }
        bluetoothLeScanner.startScan(arrayList, new ScanSettings.Builder().setScanMode(iN).build(), c());
    }

    @TargetApi(21)
    private void d() {
        BluetoothLeScanner bluetoothLeScanner = this.f4490g.getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.stopScan(c());
        }
    }

    private BluetoothAdapter.LeScanCallback e() {
        if (this.n == null) {
            this.n = new e(this);
        }
        return this.n;
    }

    private void b(k$K k_k) {
        List<String> listO = k_k.o();
        UUID[] uuidArr = new UUID[listO.size()];
        for (int i2 = 0; i2 < listO.size(); i2++) {
            uuidArr[i2] = UUID.fromString(listO.get(i2));
        }
        if (!this.f4490g.startLeScan(uuidArr, e())) {
            throw new IllegalStateException("getBluetoothLeScanner() is null. Is the Adapter on?");
        }
    }

    private void f() {
        this.f4490g.stopLeScan(e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar, String str) {
        if (aVar.ordinal() <= this.f4492i.ordinal()) {
            Log.d("FlutterBluePlugin", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, byte[] bArr) {
        this.f4486c.runOnUiThread(new g(this, str, bArr));
    }
}
