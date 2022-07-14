package com.minirig.android;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.minirig.android.p048a.C1230e;
import com.minirig.android.p048a.minirigMainClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.minirig.android.c */
class C1258c extends BaseAdapter {

    /* renamed from: b */
    private static final String f4610b = "c";

    /* renamed from: a */
    GlobalApplication f4611a;

    /* renamed from: c */
    private final ArrayList<C1260a> f4612c = new ArrayList<>();

    /* renamed from: d */
    private final LayoutInflater f4613d;

    /* renamed from: e */
    private HashMap<String, Integer> f4614e = new HashMap<>();

    /* renamed from: f */
    private HashMap<String, Integer> f4615f = new HashMap<>();

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: com.minirig.android.c$a */
    static class C1260a {

        /* renamed from: a */
        BluetoothDevice f4616a;

        /* renamed from: b */
        byte[] f4617b;

        /* renamed from: c */
        C1230e f4618c;

        /* renamed from: d */
        int f4619d;

        C1260a(BluetoothDevice bluetoothDevice, byte[] bArr, C1230e eVar, int i) {
            this.f4616a = bluetoothDevice;
            this.f4617b = bArr;
            this.f4618c = eVar;
            this.f4619d = i;
        }
    }

    C1258c(Context context) {
        this.f4611a = (GlobalApplication) ((MainActivity) context).getApplicationContext();
        this.f4613d = LayoutInflater.from(context);
        this.f4614e.put("BLACK", Integer.valueOf(R.drawable.mini_black));
        this.f4614e.put("BLUE", Integer.valueOf(R.drawable.mini_blue));
        this.f4614e.put("BRUSHED_SILVER", Integer.valueOf(R.drawable.mini_brushed_silver));
        this.f4614e.put("GOLD", Integer.valueOf(R.drawable.mini_gold));
        this.f4614e.put("GREEN", Integer.valueOf(R.drawable.mini_green));
        this.f4614e.put("NO_DEVICE_COLOUR", Integer.valueOf(R.drawable.mini_no_device_colour));
        this.f4614e.put("PURPLE", Integer.valueOf(R.drawable.mini_purple));
        this.f4614e.put("RED", Integer.valueOf(R.drawable.mini_red));
        this.f4614e.put("SILVER", Integer.valueOf(R.drawable.mini_silver));
        this.f4615f.put("BLACK", Integer.valueOf(R.drawable.minirig_black));
        this.f4615f.put("BLUE", Integer.valueOf(R.drawable.minirig_blue));
        this.f4615f.put("BRUSHED_SILVER", Integer.valueOf(R.drawable.minirig_brushed_silver));
        this.f4615f.put("GOLD", Integer.valueOf(R.drawable.minirig_gold));
        this.f4615f.put("GREEN", Integer.valueOf(R.drawable.minirig_green));
        this.f4615f.put("NO_DEVICE_COLOUR", Integer.valueOf(R.drawable.minirig_no_device_colour));
        this.f4615f.put("PURPLE", Integer.valueOf(R.drawable.minirig_purple));
        this.f4615f.put("RED", Integer.valueOf(R.drawable.minirig_red));
        this.f4615f.put("SILVER", Integer.valueOf(R.drawable.minirig_silver));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5560a(C1260a aVar) {
        if (aVar.f4619d >= -80) {
            C1230e eVar = new C1230e(this.f4611a, aVar.f4616a.getName(), m6122a(aVar.f4617b));
            Iterator<C1260a> it = this.f4612c.iterator();
            while (it.hasNext()) {
                C1260a next = it.next();
                C1230e eVar2 = new C1230e(this.f4611a, next.f4616a.getName(), m6122a(next.f4617b));
                if (eVar.f4401c && eVar2.f4401c && eVar.f4405g.equals(eVar2.f4405g)) {
                    next.f4616a = aVar.f4616a;
                    next.f4617b = aVar.f4617b;
                    next.f4618c = aVar.f4618c;
                    notifyDataSetChanged();
                    return;
                } else if (next.f4616a.equals(aVar.f4616a)) {
                    next.f4616a = aVar.f4616a;
                    next.f4617b = aVar.f4617b;
                    notifyDataSetChanged();
                    return;
                }
            }
            if (this.f4612c.isEmpty()) {
                this.f4612c.add(aVar);
            } else if (aVar.f4619d > this.f4612c.get(0).f4619d) {
                this.f4612c.add(0, aVar);
            } else {
                this.f4612c.add(aVar);
            }
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public BluetoothDevice mo5558a(int i) {
        return this.f4612c.get(i).f4616a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1230e mo5561b(int i) {
        return this.f4612c.get(i).f4618c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5559a() {
        this.f4612c.clear();
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f4612c.size();
    }

    public Object getItem(int i) {
        return this.f4612c.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C1261b bVar;
        int i2 = 0;
        if (view == null) {
            view = this.f4613d.inflate(R.layout.device_list_item, viewGroup, false);
            bVar = new C1261b();
            bVar.f4620a = (ImageView) view.findViewById(R.id.device_icon);
            bVar.f4621b = (TextView) view.findViewById(R.id.device_name);
            bVar.f4622c = (TextView) view.findViewById(R.id.device_model);
            bVar.f4623d = (TextView) view.findViewById(R.id.device_extra);
            view.setTag(bVar);
        } else {
            bVar = (C1261b) view.getTag();
        }
        BluetoothDevice bluetoothDevice = this.f4612c.get(i).f4616a;
        String a = m6122a(this.f4612c.get(i).f4617b);
        C1230e eVar = new C1230e(this.f4611a, bluetoothDevice.getName(), a);
        String str = " | Not connected for audio";
        if (eVar.f4401c) {
            a = eVar.f4406h + " v" + eVar.f4407i + " " + eVar.f4410l + " " + eVar.f4408j + " " + eVar.f4411m + " " + eVar.f4405g;
            if (this.f4611a.f3967m.equals(eVar.f4405g)) {
                str = " | Connected for audio";
            }
        } else {
            view.setBackgroundColor(-1);
        }
        if (eVar.f4411m == null) {
            bVar.f4620a.setImageResource(this.f4615f.get("NO_DEVICE_COLOUR").intValue());
        } else if (eVar.minirigType == minirigMainClass.modelTypeEnum.MINIMINI || eVar.minirigType == minirigMainClass.modelTypeEnum.MINIMINI2) {
            bVar.f4620a.setImageResource(this.f4614e.get(eVar.f4411m).intValue());
        } else {
            bVar.f4620a.setImageResource(this.f4615f.get(eVar.f4411m).intValue());
        }
        String name = bluetoothDevice.getName();
        if (eVar.f4405g.equals(this.f4611a.f3971q)) {
            name = this.f4611a.f3972r;
        }
        if (name == null || name.length() <= 0) {
            bVar.f4621b.setText("Unknown device");
        } else {
            bVar.f4621b.setText(name);
        }
        if (eVar.f4406h == "MRBT1") {
            bVar.f4622c.setText("");
        } else {
            bVar.f4622c.setText(eVar.f4406h);
        }
        this.f4611a.mo5229a(f4610b, "ga.connectedAudioBluetoothAddress: " + this.f4611a.f3967m);
        this.f4611a.mo5229a(f4610b, "              device.getAddress(): " + eVar.f4405g);
        view.setActivated(false);
        String str2 = "";
        if (eVar.f4409k == minirigMainClass.audioConnectionStateEnum.POWER_OFF) {
            str2 = "OFF";
        } else if (eVar.f4409k == minirigMainClass.audioConnectionStateEnum.CONNECTED_A2DP && this.f4611a.f3967m.equalsIgnoreCase(eVar.f4405g)) {
            str2 = "CONNECTED";
            view.setActivated(true);
        }
        if (this.f4611a.f3963i.f4584e.containsKey(eVar.f4406h)) {
            int intValue = this.f4611a.f3963i.f4584e.get(eVar.f4406h).intValue();
            try {
                i2 = Integer.parseInt(eVar.f4407i);
            } catch (NumberFormatException unused) {
            }
            if (!(i2 == 0 || intValue == 0 || Integer.parseInt(eVar.f4407i) >= intValue)) {
                str2 = str2 + " update available";
            }
        }
        bVar.f4623d.setText(str2);
        if (this.f4611a.f3956b) {
            String str3 = (bluetoothDevice.getAddress() + str) + "\ndata: " + a + "\n raw: " + m6122a(this.f4612c.get(i).f4617b) + "\nrssi: " + this.f4612c.get(i).f4619d;
            bVar.f4622c.setText(eVar.f4406h + "\n" + str3);
            bVar.f4622c.setTextSize(12.0f);
        }
        return view;
    }

    /* renamed from: com.minirig.android.c$b */
    private static class C1261b {

        /* renamed from: a */
        ImageView f4620a;

        /* renamed from: b */
        TextView f4621b;

        /* renamed from: c */
        TextView f4622c;

        /* renamed from: d */
        TextView f4623d;

        private C1261b() {
        }
    }

    /* renamed from: a */
    private static String m6122a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            byte b = bArr[i];
            byte b2 = bArr[i + 1];
            if (b == 0) {
                break;
            } else if (b2 == -1) {
                for (int i2 = i + 2; i2 < i + b + 1; i2++) {
                    sb.append(String.format("%02x ", new Object[]{Byte.valueOf(bArr[i2])}));
                }
                z = true;
            } else {
                i += b + 1;
            }
        }
        if (z) {
            return sb.toString();
        }
        return null;
    }
}
