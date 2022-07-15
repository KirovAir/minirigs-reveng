package com.minirig.android.custom;

import android.content.Context;
import android.support.p026v4.p027a.C0391a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.minirig.android.MainActivity;
import com.minirig.android.R;
import com.minirig.android.p048a.minirigStatusClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.minirig.android.custom.b */
public class C1266b extends BaseAdapter {

    /* renamed from: g */
    private static LayoutInflater f4639g;

    /* renamed from: a */
    final MainActivity f4640a;

    /* renamed from: b */
    ArrayList<String> f4641b;

    /* renamed from: c */
    ArrayList<String> f4642c;

    /* renamed from: d */
    ArrayList<Boolean> f4643d;

    /* renamed from: e */
    HashMap<Integer, C1270b> f4644e;

    /* renamed from: f */
    Context f4645f;

    /* renamed from: com.minirig.android.custom.b$b */
    public enum C1270b {
        HELP_MODE,
        POWER_SAVING,
        GAIN_REMEMBERING,
        WIRELESS_STEREO,
        PAUSE_PLAY,
        SKIP_TRACK,
        AUTO_OFF,
        STAND_BY,
        AUX_POWER_SAVING,
        DIM_LED,
        VU_LED,
        TONES,
        ENABLE_POWER_OUT,
        CLEAR_PAIRED,
        RESET,
        DEBUG,
        NONE
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public C1270b mo5581a(int i) {
        if (this.f4644e.containsKey(Integer.valueOf(i))) {
            return this.f4644e.get(Integer.valueOf(i));
        }
        return C1270b.NONE;
    }

    /* renamed from: a */
    public int mo5580a(C1270b bVar) {
        if (!this.f4644e.containsValue(bVar)) {
            return -1;
        }
        for (Map.Entry next : this.f4644e.entrySet()) {
            if (next.getValue() == bVar) {
                return ((Integer) next.getKey()).intValue();
            }
        }
        return -1;
    }

    public C1266b(MainActivity mainActivity, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Boolean> arrayList3, HashMap<Integer, C1270b> hashMap) {
        this.f4640a = mainActivity;
        this.f4645f = mainActivity;
        this.f4641b = arrayList;
        this.f4642c = arrayList2;
        this.f4643d = arrayList3;
        this.f4644e = hashMap;
        f4639g = (LayoutInflater) this.f4645f.getSystemService("layout_inflater");
    }

    public int getCount() {
        return this.f4641b.size();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    /* renamed from: com.minirig.android.custom.b$a */
    public class C1269a {

        /* renamed from: a */
        TextView f4650a;

        /* renamed from: b */
        TextView f4651b;

        /* renamed from: c */
        ImageView f4652c;

        public C1269a() {
        }
    }

    public View getView(final int i, View view, ViewGroup viewGroup) {
        final C1269a aVar = new C1269a();
        View inflate = f4639g.inflate(R.layout.settings_item, (ViewGroup) null);
        aVar.f4650a = (TextView) inflate.findViewById(R.id.settingName);
        aVar.f4651b = (TextView) inflate.findViewById(R.id.settingDescription);
        if (aVar.f4650a != null) {
            aVar.f4650a.setText(this.f4641b.get(i));
        }
        if (aVar.f4651b != null) {
            aVar.f4651b.setText(this.f4642c.get(i));
        }
        aVar.f4652c = (ImageView) inflate.findViewById(R.id.imageView1);
        if (this.f4643d.get(i).booleanValue()) {
            aVar.f4652c.setImageResource(R.drawable.switch_on);
            aVar.f4652c.setContentDescription("Currently on");
        } else {
            aVar.f4652c.setImageResource(R.drawable.switch_off);
            aVar.f4652c.setContentDescription("Currently off");
        }
        if (i == mo5580a(C1270b.WIRELESS_STEREO)) {
            if (this.f4640a.globalApplication.minirigf3.getIsInLockedMode() || this.f4640a.globalApplication.minirigf3.twsConnectionStatef4466f != minirigStatusClass.twsConnectionStateEnum.NO_TWS) {
                inflate.setEnabled(true);
                aVar.f4650a.setTextColor(C0391a.m1623c(this.f4645f, R.color.minirig_grey));
                aVar.f4651b.setTextColor(C0391a.m1623c(this.f4645f, R.color.minirig_grey));
                aVar.f4652c.setVisibility(0);
            } else {
                inflate.setEnabled(false);
                aVar.f4650a.setTextColor(-3355444);
                aVar.f4651b.setTextColor(-3355444);
                aVar.f4652c.setVisibility(8);
            }
        }
        if (!(this.f4640a.globalApplication.f3966l == null || this.f4640a.globalApplication.f3966l.minirigType == null || this.f4640a.globalApplication.f3966l.minirigType != minirigStatusClass.modelTypeEnum.MINIRIG1)) {
            if (i == mo5580a(C1270b.PAUSE_PLAY)) {
                aVar.f4650a.setTextColor(-3355444);
                aVar.f4651b.setTextColor(-3355444);
            } else if (i == mo5580a(C1270b.SKIP_TRACK)) {
                aVar.f4650a.setTextColor(-3355444);
                aVar.f4651b.setTextColor(-3355444);
            } else if (i == mo5580a(C1270b.POWER_SAVING)) {
                aVar.f4650a.setTextColor(-3355444);
                aVar.f4651b.setTextColor(-3355444);
            } else if (i == mo5580a(C1270b.AUX_POWER_SAVING)) {
                aVar.f4650a.setTextColor(-3355444);
                aVar.f4651b.setTextColor(-3355444);
            } else if (i == mo5580a(C1270b.STAND_BY)) {
                aVar.f4650a.setTextColor(-3355444);
                aVar.f4651b.setTextColor(-3355444);
            }
        }
        if (i == mo5580a(C1270b.RESET) || i == mo5580a(C1270b.DEBUG) || i == mo5580a(C1270b.ENABLE_POWER_OUT) || i == mo5580a(C1270b.CLEAR_PAIRED)) {
            this.f4640a.runOnUiThread(new Runnable() {
                public void run() {
                    aVar.f4652c.setVisibility(8);
                }
            });
        }
        inflate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C1270b a = C1266b.this.mo5581a(i);
                if (a == C1270b.HELP_MODE) {
                    C1266b.this.f4640a.f4215l.mo5547d();
                } else if (a == C1270b.POWER_SAVING) {
                    if (C1266b.this.f4640a.globalApplication.f3966l.minirigType == null || C1266b.this.f4640a.globalApplication.f3966l.minirigType != minirigStatusClass.modelTypeEnum.MINIRIG1) {
                        if (!C1266b.this.f4640a.globalApplication.minirigf3.mo5504h()) {
                            C1266b.this.f4640a.sendCommand("q b 06 99", "POWERSAVING_ENABLE");
                        } else {
                            C1266b.this.f4640a.sendCommand("q b 00 00", "POWERSAVING_DISABLE");
                        }
                        if (C1266b.this.f4640a.globalApplication.f3964j.f4685f != null) {
                            C1266b.this.f4640a.globalApplication.f3964j.f4685f.f4742q++;
                        }
                    } else {
                        C1266b.this.f4640a.mo5246b("Feature unavailable", C1266b.this.f4640a.getResources().getString(R.string.feature_unavailable));
                        return;
                    }
                } else if (a == C1270b.GAIN_REMEMBERING) {
                    if (C1266b.this.f4640a.globalApplication.f3966l.minirigType == null || C1266b.this.f4640a.globalApplication.f3966l.minirigType != minirigStatusClass.modelTypeEnum.MINIRIG1) {
                        if (C1266b.this.f4640a.globalApplication.minirigf3.mo5510k()) {
                            C1266b.this.f4640a.sendCommand("K", "SET_GAIN_FORGET");
                        } else {
                            C1266b.this.f4640a.sendCommand("G", "SET_GAIN_REMEMBERED");
                        }
                        if (C1266b.this.f4640a.globalApplication.f3964j.f4685f != null) {
                            C1266b.this.f4640a.globalApplication.f3964j.f4685f.f4743r++;
                        }
                    } else {
                        C1266b.this.f4640a.mo5246b("Feature unavailable", C1266b.this.f4640a.getResources().getString(R.string.feature_unavailable));
                        return;
                    }
                } else if (a == C1270b.WIRELESS_STEREO) {
                    C1266b.this.f4640a.sendCommand("l", "TWS_LOCK_TOGGLE");
                    if (C1266b.this.f4640a.globalApplication.f3964j.f4685f != null) {
                        C1266b.this.f4640a.globalApplication.f3964j.f4685f.f4744s++;
                    }
                } else if (a == C1270b.PAUSE_PLAY) {
                    if (C1266b.this.f4640a.globalApplication.f3966l.minirigType == null || C1266b.this.f4640a.globalApplication.f3966l.minirigType != minirigStatusClass.modelTypeEnum.MINIRIG1) {
                        if (!C1266b.this.f4640a.globalApplication.minirigf3.getIsSingleButtonPressMediaControl()) {
                            C1266b.this.f4640a.sendCommand("}", "PAUSEPLAY_ENABLE");
                        } else {
                            C1266b.this.f4640a.sendCommand("{", "PAUSEPLAY_DISABLE");
                        }
                        if (C1266b.this.f4640a.globalApplication.f3964j.f4685f != null) {
                            C1266b.this.f4640a.globalApplication.f3964j.f4685f.f4745t++;
                        }
                    } else {
                        C1266b.this.f4640a.mo5246b("Feature unavailable", C1266b.this.f4640a.getResources().getString(R.string.feature_unavailable));
                        return;
                    }
                } else if (a == C1270b.SKIP_TRACK) {
                    if (C1266b.this.f4640a.globalApplication.f3966l.minirigType == null || C1266b.this.f4640a.globalApplication.f3966l.minirigType != minirigStatusClass.modelTypeEnum.MINIRIG1) {
                        if (!C1266b.this.f4640a.globalApplication.minirigf3.getIsDoubleButtonPressMediaControlCode()) {
                            C1266b.this.f4640a.sendCommand(")", "SKIPTRACK_ENABLE");
                        } else {
                            C1266b.this.f4640a.sendCommand("(", "SKIPTRACK_DISABLE");
                        }
                        if (C1266b.this.f4640a.globalApplication.f3964j.f4685f != null) {
                            C1266b.this.f4640a.globalApplication.f3964j.f4685f.f4746u++;
                        }
                    } else {
                        C1266b.this.f4640a.mo5246b("Feature unavailable", C1266b.this.f4640a.getResources().getString(R.string.feature_unavailable));
                        return;
                    }
                } else if (a == C1270b.AUTO_OFF) {
                    if (C1266b.this.f4640a.globalApplication.minirigf3.getInactivitySwitchOff()) {
                        C1266b.this.f4640a.sendCommand("h", "AUTO_OFF_ENABLE");
                    } else {
                        C1266b.this.f4640a.sendCommand("j", "AUTO_OFF_DISABLE");
                    }
                    if (C1266b.this.f4640a.globalApplication.f3964j.f4685f != null) {
                        C1266b.this.f4640a.globalApplication.f3964j.f4685f.f4747v++;
                    }
                } else if (a == C1270b.STAND_BY) {
                    if (C1266b.this.f4640a.globalApplication.f3966l.minirigType == null || C1266b.this.f4640a.globalApplication.f3966l.minirigType != minirigStatusClass.modelTypeEnum.MINIRIG1) {
                        if (C1266b.this.f4640a.globalApplication.minirigf3.getHasBLE_StandByEnabledCode()) {
                            C1266b.this.f4640a.sendCommand("[", "BLE_STANDBY_DISABLE");
                        } else {
                            C1266b.this.f4640a.sendCommand("]", "BLE_STANDBY_ENABLE");
                        }
                        if (C1266b.this.f4640a.globalApplication.f3964j.f4685f != null) {
                            C1266b.this.f4640a.globalApplication.f3964j.f4685f.f4748w++;
                        }
                    } else {
                        C1266b.this.f4640a.mo5246b("Feature unavailable", C1266b.this.f4640a.getResources().getString(R.string.feature_unavailable));
                        return;
                    }
                } else if (a == C1270b.AUX_POWER_SAVING) {
                    if (C1266b.this.f4640a.globalApplication.f3966l.minirigType == null || C1266b.this.f4640a.globalApplication.f3966l.minirigType != minirigStatusClass.modelTypeEnum.MINIRIG1) {
                        if (!C1266b.this.f4640a.globalApplication.minirigf3.getAuxPowerSavingEnabled()) {
                            C1266b.this.f4640a.sendCommand("Y", "POWERSAVING_ENABLE");
                        } else {
                            C1266b.this.f4640a.sendCommand("Z", "POWERSAVING_DISABLE");
                        }
                        if (C1266b.this.f4640a.globalApplication.f3964j.f4685f != null) {
                            C1266b.this.f4640a.globalApplication.f3964j.f4685f.f4749x++;
                        }
                    } else {
                        C1266b.this.f4640a.mo5246b("Feature unavailable", C1266b.this.f4640a.getResources().getString(R.string.feature_unavailable));
                        return;
                    }
                } else if (a == C1270b.DIM_LED) {
                    if (!C1266b.this.f4640a.globalApplication.minirigf3.getHasNightmode()) {
                        C1266b.this.f4640a.sendCommand("z", "NIGHT_MODE_ENABLE");
                    } else {
                        C1266b.this.f4640a.sendCommand("E", "NIGHT_MODE_DISABLE");
                    }
                    if (C1266b.this.f4640a.globalApplication.f3964j.f4685f != null) {
                        C1266b.this.f4640a.globalApplication.f3964j.f4685f.f4750y++;
                    }
                } else if (a == C1270b.VU_LED) {
                    if (!C1266b.this.f4640a.globalApplication.minirigf3.f4470j) {
                        C1266b.this.f4640a.sendCommand("D", "DISCO_LED_ENABLE");
                    } else {
                        C1266b.this.f4640a.sendCommand("E", "DISCO_LED_DISABLE");
                    }
                    if (C1266b.this.f4640a.globalApplication.f3964j.f4685f != null) {
                        C1266b.this.f4640a.globalApplication.f3964j.f4685f.f4751z++;
                    }
                } else if (a == C1270b.TONES) {
                    if (!C1266b.this.f4640a.globalApplication.minirigf3.getIsTonesEnabled()) {
                        C1266b.this.f4640a.sendCommand("y", "TONE_ENABLE");
                    } else {
                        C1266b.this.f4640a.sendCommand("n", "TONE_DISABLE");
                    }
                    if (C1266b.this.f4640a.globalApplication.f3964j.f4685f != null) {
                        C1266b.this.f4640a.globalApplication.f3964j.f4685f.f4687A++;
                    }
                } else if (a == C1270b.ENABLE_POWER_OUT) {
                    C1266b.this.f4640a.mo5295w();
                } else if (a == C1270b.CLEAR_PAIRED) {
                    C1266b.this.f4640a.mo5296x();
                } else if (a == C1270b.RESET) {
                    C1266b.this.f4640a.mo5294v();
                } else if (a == C1270b.DEBUG) {
                    C1266b.this.f4640a.setView(C1266b.this.f4640a.f4062bJ);
                }
                C1266b.this.f4640a.sendCommand("x", "GET_STATUS");
            }
        });
        return inflate;
    }
}
