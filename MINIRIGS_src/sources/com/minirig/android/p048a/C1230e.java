package com.minirig.android.p048a;

import android.bluetooth.BluetoothDevice;
import com.minirig.android.GlobalApplication;
import com.minirig.android.p048a.minirigStatusClass;

/* renamed from: com.minirig.android.a.e */
public class C1230e {

    /* renamed from: u */
    private static final String f4398u = "e";

    /* renamed from: a */
    GlobalApplication f4399a;

    /* renamed from: b */
    public String f4400b = "Unknown";

    /* renamed from: c */
    public boolean f4401c = false;

    /* renamed from: d */
    public boolean f4402d = false;

    /* renamed from: e */
    public String f4403e = "Unknown";

    /* renamed from: f */
    public minirigStatusClass.modelTypeEnum minirigType = minirigStatusClass.modelTypeEnum.NO_MODEL;

    /* renamed from: g */
    public String f4405g = "Unknown";

    /* renamed from: h */
    public String f4406h = "Unknown";

    /* renamed from: i */
    public String f4407i = "0";

    /* renamed from: j */
    public String audioConnectionState = "Unknown";

    /* renamed from: k */
    public minirigStatusClass.audioConnectionStateEnum audioConnectionState2 = minirigStatusClass.audioConnectionStateEnum.NO_CONNECTION_STATE;

    /* renamed from: l */
    public String twsConnectionState = "Unknown";

    /* renamed from: m */
    public String ledColorStr = "NO_DEVICE_COLOUR";

    /* renamed from: n */
    public minirigStatusClass.ledColorEnum ledColor = minirigStatusClass.ledColorEnum.NO_DEVICE_COLOUR;

    /* renamed from: o */
    public String f4413o = "Unknown";

    /* renamed from: p */
    public String f4414p = "Unknown";

    /* renamed from: q */
    public String f4415q = "Unknown";

    /* renamed from: r */
    public String f4416r = "Unknown";

    /* renamed from: s */
    public String f4417s = "Unknown";

    /* renamed from: t */
    public String f4418t = "Unknown";

    public C1230e(GlobalApplication globalApplication, String str, String str2) {
        this.f4399a = globalApplication;
        this.f4403e = str;
        if (str2 != null) {
            mo5475b(str2);
            return;
        }
        globalApplication.addLog(f4398u, "advertisment data was NULL");
        this.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG1;
        this.f4406h = "1";
        this.f4406h = globalApplication.f3965k.get(this.f4406h);
    }

    public C1230e(GlobalApplication globalApplication, BluetoothDevice bluetoothDevice, String str) {
        this.f4399a = globalApplication;
        this.f4403e = bluetoothDevice.getName();
        this.f4405g = bluetoothDevice.getAddress();
        if (str == null || !str.toLowerCase().contains("minirig")) {
            mo5476c(str);
        } else {
            mo5477d(str);
        }
    }

    /* renamed from: a */
    public void setModel() {
        GlobalApplication globalApplication = this.f4399a;
        String str = f4398u;
        globalApplication.addLog(str, "setModel() productType: " + this.f4406h);
        this.minirigType = this.f4399a.minirigf3.parseModelType(this.f4406h);
    }

    /* renamed from: a */
    public static boolean m6014a(String str) {
        if (str == null || str.length() < 8 || (!str.substring(0, 8).equals("00:12:6F") && !str.substring(0, 8).equals("54:B7:E5"))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public String mo5475b(String str) {
        if (str == null) {
            return "null";
        }
        String[] strArr = new String[0];
        String[] split = str.split(" ");
        if (split.length >= 11) {
            this.f4400b = str;
            this.f4405g = split[0] + ":" + split[1] + ":" + split[2] + ":" + split[3] + ":" + split[4] + ":" + split[5];
            this.f4405g = this.f4405g.toUpperCase().trim();
            if (!m6014a(this.f4405g)) {
                return "null";
            }
            this.f4402d = true;
            if (this.f4399a.f3965k.containsKey(this.f4399a.f3961g.mo5473a(split[6]))) {
                this.f4401c = true;
            }
            this.f4406h = this.f4399a.f3961g.mo5473a(split[6]);
            if (this.f4399a.f3965k.containsKey(this.f4406h)) {
                this.f4406h = this.f4399a.f3965k.get(this.f4406h);
                m6015b();
            }
            this.f4407i = this.f4399a.f3961g.mo5473a(split[7]);
            this.audioConnectionState = this.f4399a.minirigf3.parseAudioConnectionState(this.f4399a.f3961g.mo5473a(split[8])).toString();
            this.audioConnectionState2 = this.f4399a.minirigf3.parseAudioConnectionState(this.f4399a.f3961g.mo5473a(split[8]));
            this.twsConnectionState = this.f4399a.minirigf3.parseTwsConnectionState(this.f4399a.f3961g.mo5473a(split[9])).toString();
            this.ledColor = this.f4399a.minirigf3.parseLedColor(this.f4399a.f3961g.mo5473a(split[10]));
            this.ledColorStr = this.ledColor.toString();
            return "null";
        }
        this.f4401c = false;
        return "null";
    }

    /* renamed from: c */
    public String mo5476c(String str) {
        if (str == null) {
            return "null";
        }
        String[] strArr = new String[0];
        String[] split = str.split(" ");
        GlobalApplication globalApplication = this.f4399a;
        String str2 = f4398u;
        globalApplication.addLog(str2, "parseStatusReply: " + str);
        if (split.length < 4) {
            return "";
        }
        this.f4400b = str;
        this.f4402d = true;
        this.f4401c = true;
        this.f4406h = "0";
        if (this.f4399a.f3965k.containsKey(this.f4406h)) {
            this.f4406h = this.f4399a.f3965k.get(this.f4406h);
            m6015b();
        }
        String[] split2 = split[3].split("_");
        if (split2 == null || split2.length < 1) {
            return "";
        }
        this.f4407i = split2[0];
        this.ledColor = this.f4399a.minirigf3.parseLedColor("0");
        this.ledColorStr = this.ledColor.toString();
        return "";
    }

    /* renamed from: d */
    public boolean mo5477d(String str) {
        String[] split;
        if (str == null || str.length() < 3) {
            return false;
        }
        this.f4399a.addLog(f4398u, "parseProductInfo: " + str);
        if (str.length() <= 7 || !str.substring(0, 8).equalsIgnoreCase("minirig ")) {
            if (str.substring(0, 2).equalsIgnoreCase("i ")) {
                str = str.substring(2);
            }
            String[] split2 = str.split(" ");
            if (split2 == null) {
                return false;
            }
            if (split2.length < 1) {
                this.minirigType = minirigStatusClass.modelTypeEnum.NO_MODEL;
            } else if (split2[0].equalsIgnoreCase("minirigM2")) {
                this.minirigType = minirigStatusClass.modelTypeEnum.MINIMINI2;
            } else if (split2[0].equalsIgnoreCase("minirigM")) {
                this.minirigType = minirigStatusClass.modelTypeEnum.MINIMINI;
            } else if (split2[0].equalsIgnoreCase("minirig") || split2[0].equalsIgnoreCase("minirig1")) {
                this.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG1;
            } else if (split2[0].equalsIgnoreCase("minirig2")) {
                this.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG2;
            } else if (split2[0].equalsIgnoreCase("minirig3")) {
                this.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG3;
            }
            if (split2.length >= 4) {
                String[] split3 = split2[3].split("_");
                if (split3 == null || split3.length < 2) {
                    this.f4413o = "Unknown";
                } else {
                    this.f4413o = split3[1];
                }
            } else {
                this.f4413o = "Unknown";
            }
            if (split2.length >= 2) {
                this.f4414p = split2[1];
            } else {
                this.f4414p = "Unknown";
            }
            if (split2.length >= 3) {
                this.f4416r = split2[2];
            } else {
                this.f4416r = "Unknown";
            }
            if (split2.length >= 4 && (split = split2[3].split("_")) != null && split.length >= 3) {
                this.f4415q = split[0] + "." + split[2];
            }
            int i = (split2[3].indexOf("_") < 0 ? 1 : 0) + 4;
            if (split2.length >= i) {
                String[] split4 = split2[i].split("_");
                if (split4.length < 5) {
                    this.f4417s = "Unknown";
                } else if (split4[4].length() >= 2) {
                    this.f4417s = split4[4].substring(0, 2);
                }
                if (split4.length < 2) {
                    this.f4418t = "Unknown";
                } else if (split4[1].length() >= 4) {
                    String str2 = "00";
                    String str3 = "00";
                    if (split4[1].length() >= 2) {
                        str2 = split4[1].substring(0, 2);
                    }
                    if (split4[1].length() >= 4) {
                        str3 = split4[1].substring(2, 4);
                    }
                    this.f4418t = str2 + "/" + str3;
                } else {
                    this.f4418t = "Unknown";
                }
            } else {
                this.f4417s = "Unknown";
                this.f4418t = "Unknown";
            }
            if (split2.length > 0) {
                for (String str4 : split2) {
                    if (str4.contains("_MR")) {
                        String[] split5 = str4.split("_");
                        if (split5.length >= 2) {
                            if (split5[1].equalsIgnoreCase("MRBT2") || split5[1].equalsIgnoreCase("MRBT")) {
                                this.f4406h = "11";
                                if (this.f4399a.f3965k.containsKey(this.f4406h)) {
                                    this.f4406h = this.f4399a.f3965k.get(this.f4406h);
                                }
                            } else if (split5[1].equalsIgnoreCase("MRBT3")) {
                                this.f4406h = "30";
                                if (this.f4399a.f3965k.containsKey(this.f4406h)) {
                                    this.f4406h = this.f4399a.f3965k.get(this.f4406h);
                                }
                            } else if (split5[1].equalsIgnoreCase("MRM2")) {
                                this.f4406h = "21";
                                if (this.f4399a.f3965k.containsKey(this.f4406h)) {
                                    this.f4406h = this.f4399a.f3965k.get(this.f4406h);
                                }
                            } else if (split5[1].equalsIgnoreCase("MRM")) {
                                this.f4406h = "20";
                                if (this.f4399a.f3965k.containsKey(this.f4406h)) {
                                    this.f4406h = this.f4399a.f3965k.get(this.f4406h);
                                }
                            }
                        }
                        this.f4407i = split5[0];
                    }
                }
            }
            if (this.f4406h == null) {
                this.f4406h = this.f4399a.f3965k.get(0);
            }
            return true;
        }
        this.f4399a.addLog(f4398u, "Was a minirig 1");
        this.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG1;
        this.f4413o = "Unknown";
        this.f4414p = "Unknown";
        this.f4416r = "Unknown";
        this.f4415q = "Unknown";
        this.f4417s = "Unknown";
        this.f4418t = "Unknown";
        this.f4406h = "1";
        this.f4406h = this.f4399a.f3965k.get(this.f4406h);
        return true;
    }

    /* renamed from: b */
    private void m6015b() {
        String str = this.f4406h;
        if (str == "Unknown") {
            return;
        }
        if (str.equalsIgnoreCase("MRBT3")) {
            this.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG3;
        } else if (this.f4406h.equalsIgnoreCase("MRM")) {
            this.minirigType = minirigStatusClass.modelTypeEnum.MINIMINI;
        } else if (this.f4406h.equalsIgnoreCase("MRM2")) {
            this.minirigType = minirigStatusClass.modelTypeEnum.MINIMINI2;
        } else if (this.f4406h.equalsIgnoreCase("MRBT2")) {
            this.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG2;
        } else {
            this.minirigType = minirigStatusClass.modelTypeEnum.NO_MODEL;
        }
    }
}
