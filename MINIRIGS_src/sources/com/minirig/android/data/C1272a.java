package com.minirig.android.data;

import android.os.Build;
import com.minirig.android.GlobalApplication;
import com.minirig.android.p049b.C1250e;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.minirig.android.data.a */
public class C1272a {

    /* renamed from: a */
    protected static final String f4675a = "a";

    /* renamed from: b */
    GlobalApplication f4676b;

    /* renamed from: c */
    C1273b f4677c;

    /* renamed from: d */
    public boolean f4678d = false;

    /* renamed from: e */
    private int f4679e = 1;

    public C1272a(GlobalApplication globalApplication, C1273b bVar) {
        this.f4676b = globalApplication;
        this.f4677c = bVar;
        globalApplication.mo5229a(f4675a, "- - - - - - - - - - - - - - - - - ");
        globalApplication.mo5229a(f4675a, "     Data sync");
        globalApplication.mo5229a(f4675a, "- - - - - - - - - - - - - - - - - ");
    }

    /* renamed from: a */
    public boolean mo5589a() {
        this.f4676b.mo5229a(f4675a, "     syncUser()");
        HashMap hashMap = new HashMap();
        hashMap.put("class", "Users");
        hashMap.put("function", "saveUser");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform_id", this.f4679e);
            jSONObject.put("manufacturer", Build.MANUFACTURER);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException e) {
            e.printStackTrace();
            GlobalApplication globalApplication = this.f4676b;
            String str = f4675a;
            globalApplication.mo5229a(str, "Error parsing JSON: " + e.getMessage());
        }
        hashMap.put("user", jSONObject.toString());
        this.f4676b.f3963i.mo5553a("https://dreambaked.com/minirig_data_collection/controller/API.php", hashMap, C1250e.C1256a.SYNC_USER);
        return true;
    }

    /* renamed from: b */
    public boolean mo5590b() {
        this.f4676b.mo5229a(f4675a, "     syncDevice()");
        if (this.f4678d) {
            this.f4676b.mo5229a(f4675a, "     data already synced");
            return false;
        } else if (!this.f4676b.f3960f.f4430b) {
            this.f4676b.mo5229a(f4675a, "     need to retrieve runtime data first");
            return false;
        } else if (this.f4676b.f3966l == null) {
            this.f4676b.mo5229a(f4675a, "     no connected device for data sync");
            return false;
        } else if (this.f4677c.f4685f == null) {
            this.f4676b.mo5229a(f4675a, "     no data tracking user, use syncUser() to setup");
            return false;
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("class", "Devices");
            hashMap.put("function", "saveDevice");
            hashMap.put("passClass", "Users");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("btAddress", this.f4676b.f3966l.f4405g);
                jSONObject.put("name", this.f4676b.f3966l.f4403e);
                jSONObject.put("model", this.f4676b.f3966l.minirigType);
                jSONObject.put("colour", this.f4676b.f3966l.f4411m);
                jSONObject.put("softwareVersion", this.f4676b.f3966l.f4407i);
                jSONObject.put("hardwareVersion", this.f4676b.f3966l.f4414p);
                jSONObject.put("bluetoothVersion", this.f4676b.f3966l.f4416r);
                jSONObject.put("bootloaderVersion", this.f4676b.f3966l.f4417s);
                jSONObject.put("manufactureDate", this.f4676b.f3966l.f4418t);
                jSONObject.put("minsSinceLastCharge", this.f4676b.f3960f.f4431c);
                jSONObject.put("minsInStandbySinceLastCharge", this.f4676b.f3960f.f4432d);
                jSONObject.put("minsInStandalone", this.f4676b.f3960f.f4434f);
                jSONObject.put("minsInStandaloneWithSub", this.f4676b.f3960f.f4436h);
                jSONObject.put("minsInTws", this.f4676b.f3960f.f4438j);
                jSONObject.put("minsInAux", this.f4676b.f3960f.f4440l);
                jSONObject.put("minsOnStandBy", this.f4676b.f3960f.f4442n);
                jSONObject.put("minsOnCharge", this.f4676b.f3960f.f4443o);
                jSONObject.put("dischargeCycles", this.f4676b.f3960f.f4445q);
                jSONObject.put("dischargeMins", this.f4676b.f3960f.f4446r);
                jSONObject.put("longButtonPresses", this.f4676b.f3960f.f4447s);
                jSONObject.put("gainChanges", this.f4676b.f3960f.f4448t);
                jSONObject.put("twsStarts", this.f4676b.f3960f.f4449u);
                jSONObject.put("mediaControlsUsed", this.f4676b.f3960f.f4450v);
                jSONObject.put("powerOutUsed", this.f4676b.f3960f.f4451w);
                jSONObject.put("jacksInserted", this.f4676b.f3960f.f4452x);
                jSONObject.put("chargeCablesInserted", this.f4676b.f3960f.f4453y);
                jSONObject.put("resets", this.f4676b.f3960f.f4454z);
                jSONObject.put("powerOutsNew", this.f4676b.f3960f.f4420A);
                jSONObject.put("luReceiver", this.f4676b.f3960f.f4421B);
                jSONObject.put("luTransmitter", this.f4676b.f3960f.f4422C);
                jSONObject.put("powerOutMins", this.f4676b.f3960f.f4423D);
                jSONObject.put("luReceiverMins", this.f4676b.f3960f.f4425F);
                jSONObject.put("luTransmitterMins", this.f4676b.f3960f.f4427H);
            } catch (JSONException e) {
                e.printStackTrace();
                GlobalApplication globalApplication = this.f4676b;
                String str = f4675a;
                globalApplication.mo5229a(str, "Error parsing JSON: " + e.getMessage());
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("user_id", this.f4677c.f4685f.f4713a);
                jSONObject2.put("platform_id", this.f4679e);
                jSONObject2.put("manufacturer", Build.MANUFACTURER);
                jSONObject2.put("model", Build.MODEL);
                jSONObject2.put("mainControlsSecs", this.f4677c.f4685f.f4730e);
                jSONObject2.put("eq5bandSecs", this.f4677c.f4685f.f4731f);
                jSONObject2.put("eqMRBT1secs", this.f4677c.f4685f.f4732g);
                jSONObject2.put("audioConfigSecs", this.f4677c.f4685f.f4733h);
                jSONObject2.put("settingsSecs", this.f4677c.f4685f.f4734i);
                jSONObject2.put("infoSecs", this.f4677c.f4685f.f4735j);
                jSONObject2.put("mixtapeSecs", this.f4677c.f4685f.f4736k);
                jSONObject2.put("aboutSecs", this.f4677c.f4685f.f4737l);
                jSONObject2.put("broadcastSecs", this.f4677c.f4685f.f4738m);
                jSONObject2.put("gainControlSecs", this.f4677c.f4685f.f4739n);
                jSONObject2.put("turnOffButton", this.f4677c.f4685f.f4740o);
                jSONObject2.put("switchDeviceButton", this.f4677c.f4685f.f4741p);
                jSONObject2.put("powerSavingButton", this.f4677c.f4685f.f4742q);
                jSONObject2.put("rememberGainButton", this.f4677c.f4685f.f4743r);
                jSONObject2.put("stereoLockButton", this.f4677c.f4685f.f4744s);
                jSONObject2.put("pausePlayButton", this.f4677c.f4685f.f4745t);
                jSONObject2.put("skipTrackButton", this.f4677c.f4685f.f4746u);
                jSONObject2.put("autoOffButton", this.f4677c.f4685f.f4747v);
                jSONObject2.put("standByButton", this.f4677c.f4685f.f4748w);
                jSONObject2.put("auxModePowerSavingButton", this.f4677c.f4685f.f4749x);
                jSONObject2.put("dimLedButton", this.f4677c.f4685f.f4750y);
                jSONObject2.put("vuLedButton", this.f4677c.f4685f.f4751z);
                jSONObject2.put("tonesButton", this.f4677c.f4685f.f4687A);
                jSONObject2.put("enablePowerOutButton", this.f4677c.f4685f.f4688B);
                jSONObject2.put("clearPairedDevicesButton", this.f4677c.f4685f.f4689C);
                jSONObject2.put("factoryResetButton", this.f4677c.f4685f.f4690D);
                jSONObject2.put("previousTrackButton", this.f4677c.f4685f.f4691E);
                jSONObject2.put("nextTrackButton", this.f4677c.f4685f.f4692F);
                jSONObject2.put("playPauseMediaButton", this.f4677c.f4685f.f4693G);
                jSONObject2.put("openMediaButton", this.f4677c.f4685f.f4694H);
                jSONObject2.put("muteButton", this.f4677c.f4685f.f4696J);
                jSONObject2.put("gainButton", this.f4677c.f4685f.f4698L);
                jSONObject2.put("playlistButton", this.f4677c.f4685f.f4695I);
                jSONObject2.put("eqHomeVolumeButton", this.f4677c.f4685f.f4706T);
                jSONObject2.put("eqHome5BandButton", this.f4677c.f4685f.f4707U);
                jSONObject2.put("eqConfigMonoButton", this.f4677c.f4685f.f4708V);
                jSONObject2.put("eqConfigMonoMicButton", this.f4677c.f4685f.f4709W);
                jSONObject2.put("eqConfigMonoSubButton", this.f4677c.f4685f.f4710X);
                jSONObject2.put("eqConfigStereoAuxButton", this.f4677c.f4685f.f4711Y);
                jSONObject2.put("eqConfigMonoLinkButton", this.f4677c.f4685f.f4712Z);
                jSONObject2.put("eqConfigStereoOneSubButton", this.f4677c.f4685f.f4714aa);
                jSONObject2.put("eqConfigStereoTwoSubsButton", this.f4677c.f4685f.f4715ab);
                jSONObject2.put("homeButton", this.f4677c.f4685f.f4716ac);
                if (this.f4677c.f4685f.f4718ae > 0) {
                    jSONObject2.put("eqCustomCloses", this.f4677c.f4685f.f4718ae);
                    jSONObject2.put("eqBand1", this.f4677c.f4685f.f4719af / this.f4677c.f4685f.f4718ae);
                    jSONObject2.put("eqBand2", this.f4677c.f4685f.f4720ag / this.f4677c.f4685f.f4718ae);
                    jSONObject2.put("eqBand3", this.f4677c.f4685f.f4721ah / this.f4677c.f4685f.f4718ae);
                    jSONObject2.put("eqBand4", this.f4677c.f4685f.f4722ai / this.f4677c.f4685f.f4718ae);
                    jSONObject2.put("eqBand5", this.f4677c.f4685f.f4723aj / this.f4677c.f4685f.f4718ae);
                }
                jSONObject2.put("eqFlatCloses", this.f4677c.f4685f.f4717ad);
                jSONObject2.put("eqLoudCloses", this.f4677c.f4685f.f4724ak);
                jSONObject2.put("eqStudioCloses", this.f4677c.f4685f.f4725al);
                jSONObject2.put("eqVocalCloses", this.f4677c.f4685f.f4726am);
                jSONObject2.put("monoMicMode", this.f4677c.f4685f.f4699M);
                jSONObject2.put("monoSubMode", this.f4677c.f4685f.f4700N);
                jSONObject2.put("stereoAuxMode", this.f4677c.f4685f.f4701O);
                jSONObject2.put("stereoOneSubMode", this.f4677c.f4685f.f4702P);
                jSONObject2.put("stereoTwoSubsMode", this.f4677c.f4685f.f4703Q);
                jSONObject2.put("monoLinkMode", this.f4677c.f4685f.f4704R);
                jSONObject2.put("monoMode", this.f4677c.f4685f.f4705S);
            } catch (JSONException e2) {
                e2.printStackTrace();
                GlobalApplication globalApplication2 = this.f4676b;
                String str2 = f4675a;
                globalApplication2.mo5229a(str2, "Error parsing JSON: " + e2.getMessage());
            }
            hashMap.put("device", jSONObject.toString());
            hashMap.put("user", jSONObject2.toString());
            this.f4676b.f3963i.mo5553a("https://dreambaked.com/minirig_data_collection/controller/API.php", hashMap, C1250e.C1256a.SYNC_DEVICE);
            return true;
        }
    }
}
