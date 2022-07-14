package com.minirig.android.p049b;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.minirig.android.C1241b;
import java.util.List;

/* renamed from: com.minirig.android.b.b */
public class C1244b {
    /* renamed from: a */
    public static BluetoothGattCharacteristic m6090a(BluetoothGatt bluetoothGatt) {
        return m6091a(bluetoothGatt, C1241b.f4559e);
    }

    /* renamed from: a */
    private static BluetoothGattCharacteristic m6091a(BluetoothGatt bluetoothGatt, String str) {
        BluetoothGattService a = m6092a(bluetoothGatt.getServices());
        if (a == null) {
            return null;
        }
        for (BluetoothGattCharacteristic next : a.getCharacteristics()) {
            if (m6093a(next, str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m6093a(BluetoothGattCharacteristic bluetoothGattCharacteristic, String str) {
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        return m6095a(bluetoothGattCharacteristic.getUuid().toString(), str);
    }

    /* renamed from: a */
    private static boolean m6094a(String str) {
        return m6095a(str, C1241b.f4555a);
    }

    /* renamed from: a */
    private static BluetoothGattService m6092a(List<BluetoothGattService> list) {
        for (BluetoothGattService next : list) {
            if (m6094a(next.getUuid().toString())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m6095a(String str, String... strArr) {
        for (String equalsIgnoreCase : strArr) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }
}
