package com.minirig.android.p048a;

import android.util.Log;
import java.io.PrintStream;

/* renamed from: com.minirig.android.a.g */
public class minirigMainClass {

    /* renamed from: a */
    protected static final String f4455a = "g";

    /* renamed from: A */
    private boolean f4456A = false;

    /* renamed from: B */
    private boolean f4457B = false;

    /* renamed from: C */
    private boolean f4458C = false;

    /* renamed from: D */
    private boolean f4459D = false;

    /* renamed from: E */
    private boolean f4460E = false;

    /* renamed from: F */
    private int f4461F = 1;

    /* renamed from: b */
    public modelTypeEnum minirigType = modelTypeEnum.NO_MODEL;

    /* renamed from: c */
    public minirigModeEnum minirigAudioModef4463c = minirigModeEnum.MONO;

    /* renamed from: d */
    public ledColorEnum ledColorf4464d = ledColorEnum.NO_DEVICE_COLOUR;

    /* renamed from: e */
    public audioConnectionStateEnum audioConnectionStatef4465e = audioConnectionStateEnum.NO_CONNECTION_STATE;

    /* renamed from: f */
    public twsConnectionStateEnum twsConnectionStatef4466f = twsConnectionStateEnum.NO_TWS;

    /* renamed from: g */
    public broadcastStateEnum broadcastStatef4467g = broadcastStateEnum.NO_BROADCAST;

    /* renamed from: h */
    public powerStateEnum powerStatef4468h = powerStateEnum.NO_POWER_STATE;

    /* renamed from: i */
    public anotherledColorEnum ledColorf4469i = anotherledColorEnum.NO_LED_COLOUR;

    /* renamed from: j */
    public boolean f4470j = false;

    /* renamed from: k */
    public boolean f4471k = false;

    /* renamed from: l */
    private boolean isInErrorMode = false;

    /* renamed from: m */
    private int bassBoost = 0;

    /* renamed from: n */
    private boolean f4474n = false;

    /* renamed from: o */
    private int gainMode = 0;

    /* renamed from: p */
    private boolean f4476p = false;

    /* renamed from: q */
    private boolean f4477q = false;

    /* renamed from: r */
    private boolean f4478r = false;

    /* renamed from: s */
    private boolean f4479s = false;

    /* renamed from: t */
    private boolean f4480t = false;

    /* renamed from: u */
    private boolean f4481u = false;

    /* renamed from: v */
    private boolean f4482v = false;

    /* renamed from: w */
    private boolean f4483w = false;

    /* renamed from: x */
    private boolean f4484x = false;

    /* renamed from: y */
    private boolean f4485y = false;

    /* renamed from: z */
    private boolean f4486z = false;

    /* renamed from: com.minirig.android.a.g$a */
    public enum minirigModeEnum {
        MONO,
        MONO_MIC,
        MONO_SUB,
        STEREO_AUX,
        STEREO_ONE_SUB,
        STEREO_TWO_SUBS,
        MONO_LINK
    }

    /* renamed from: com.minirig.android.a.g$b */
    public enum broadcastStateEnum {
        NO_BROADCAST,
        RX_READY,
        RX_SEARCHING,
        RX_PAIRED_MUSIC_OFF,
        RX_PAIRED_MUSIC_ON,
        TX_NOT_PAIRING_MUSIC_OFF,
        TX_NOT_PAIRING_MUSIC_ON,
        TX_PAIRING_MUSIC_ON,
        TX_PAIRING_MUSIC_OFF
    }

    /* renamed from: com.minirig.android.a.g$c */
    public enum audioConnectionStateEnum {
        CONNECTED_A2DP,
        SEARCHING_TWS,
        NOT_CONNECTED,
        AUX,
        POWER_OFF,
        NO_CONNECTION_STATE
    }

    /* renamed from: com.minirig.android.a.g$d */
    public enum ledColorEnum {
        RED,
        GOLD,
        GREEN,
        ORANGE,
        BLUE,
        PURPLE,
        SILVER,
        BLACK,
        BRUSHED_SILVER,
        NO_DEVICE_COLOUR
    }

    /* renamed from: com.minirig.android.a.g$e */
    public enum modelTypeEnum {
        MINIRIG1,
        MINIRIG2,
        MINIRIG3,
        MINIMINI,
        MINIMINI2,
        NO_MODEL
    }

    /* renamed from: com.minirig.android.a.g$f */
    public enum anotherledColorEnum {
        BLACK,
        RED,
        YELLOW,
        GREEN,
        CYAN,
        BLUE,
        PURPLE,
        WHITE,
        NO_LED_COLOUR
    }

    /* renamed from: com.minirig.android.a.g$g */
    public enum powerStateEnum {
        NORMAL,
        CHARGING,
        POWER_OUT,
        NO_POWER_STATE
    }

    /* renamed from: com.minirig.android.a.g$h */
    public enum twsConnectionStateEnum {
        NO_TWS,
        CONNECTED_AS_SLAVE,
        CONNECTED_AS_MASTER,
        CONNECTED_UNKNOWN,
        START_SCANNING,
        SCANNING,
        FOUND_DEVICE,
        CONNECTING,
        NO_TWS_STATE
    }

    /* renamed from: a */
    public void handleStatusStr(String str) {
        if (str != null) {
            if (this.isInErrorMode) {
                String str2 = f4455a;
                Log.d(str2, "- - - - - - - - Status string reply: " + str);
            }
            if (str.length() >= 4) {
                setAudioConnectionState(str.substring(2, 4));
            }
            if (str.length() >= 7) {
                setTwsConnectionState(str.substring(5, 7));
            }
            if (str.length() >= 9) {
                setPowerState(str.substring(8, 9));
            }
            if (str.length() >= 11) {
                String substring = str.substring(10, 11);
                mo5516n(substring);
                mo5518o(substring);
            }
            if (str.length() >= 13) {
                setAnotherLedColor(str.substring(12, 13));
            }
            if (str.length() >= 16) {
                parseBassBoost(str.substring(14, 16));
            }
            if (str.length() >= 18) {
                parseGainCode(str.substring(17, 18));
            }
            if (str.length() >= 19) {
                mo5528t(str.substring(18, 19));
            }
            if (str.length() >= 20) {
                mo5530u(str.substring(19, 20));
            }
            if (str.length() >= 21) {
                mo5532v(str.substring(20, 21));
            }
            if (str.length() >= 22) {
                mo5534w(str.substring(21, 22));
            }
            if (str.length() >= 23) {
                mo5536x(str.substring(22, 23));
            }
            if (str.length() >= 24) {
                mo5538y(str.substring(23, 24));
            }
            if (str.length() >= 25) {
                mo5539z(str.substring(24, 25));
            }
            if (str.length() >= 26) {
                mo5480A(str.substring(25, 26));
            }
            if (str.length() >= 27) {
                mo5481B(str.substring(26, 27));
            }
            if (str.length() >= 28) {
                mo5482C(str.substring(27, 28));
            }
            if (str.length() >= 29) {
                mo5483D(str.substring(28, 29));
            }
            if (str.length() >= 30) {
                mo5484E(str.substring(29, 30));
            }
            if (str.length() >= 31) {
                mo5485F(str.substring(30, 31));
            }
            if (str.length() >= 32) {
                mo5486G(str.substring(31, 32));
            }
            if (str.length() >= 33) {
                mo5487H(str.substring(32, 33));
            }
            if (str.length() >= 34) {
                mo5488I(str.substring(33, 34));
            }
            if (str.length() >= 35) {
                mo5526s(str.substring(34, 35));
            }
            if (str.length() >= 36) {
                setBroadcastState(str.substring(35, 36));
            }
        }
    }

    /* renamed from: b */
    public modelTypeEnum parseModelType(String str) {
        if (str == null) {
            return modelTypeEnum.NO_MODEL;
        }
        if (str.equalsIgnoreCase("Minirig1")) {
            return modelTypeEnum.MINIRIG1;
        }
        if (str.equalsIgnoreCase("Minirig")) {
            return modelTypeEnum.MINIRIG1;
        }
        if (str.equalsIgnoreCase("MRBT1")) {
            return modelTypeEnum.MINIRIG1;
        }
        if (str.equalsIgnoreCase("minirig2")) {
            return modelTypeEnum.MINIRIG2;
        }
        if (str.equalsIgnoreCase("MRBT")) {
            return modelTypeEnum.MINIRIG2;
        }
        if (str.equalsIgnoreCase("MRBT2")) {
            return modelTypeEnum.MINIRIG2;
        }
        if (str.equalsIgnoreCase("minirig3")) {
            return modelTypeEnum.MINIRIG3;
        }
        if (str.equalsIgnoreCase("MRBT3")) {
            return modelTypeEnum.MINIRIG3;
        }
        if (str.equalsIgnoreCase("Minirig Mini")) {
            return modelTypeEnum.MINIMINI;
        }
        if (str.equalsIgnoreCase("MRM")) {
            return modelTypeEnum.MINIMINI;
        }
        if (str.equalsIgnoreCase("minirigM")) {
            return modelTypeEnum.MINIMINI;
        }
        if (str.equalsIgnoreCase("MRM2")) {
            return modelTypeEnum.MINIMINI2;
        }
        if (str.equalsIgnoreCase("minirigM2")) {
            return modelTypeEnum.MINIMINI2;
        }
        if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Device model code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return modelTypeEnum.NO_MODEL;
    }

    /* renamed from: c */
    public ledColorEnum parseLedColor(String str) {
        if (str.equals("0")) {
            return ledColorEnum.NO_DEVICE_COLOUR;
        }
        if (str.equals("1")) {
            return ledColorEnum.RED;
        }
        if (str.equals("2")) {
            return ledColorEnum.GOLD;
        }
        if (str.equals("3")) {
            return ledColorEnum.GREEN;
        }
        if (str.equals("4")) {
            return ledColorEnum.NO_DEVICE_COLOUR;
        }
        if (str.equals("5")) {
            return ledColorEnum.BLUE;
        }
        if (str.equals("6")) {
            return ledColorEnum.PURPLE;
        }
        if (str.equals("7")) {
            return ledColorEnum.SILVER;
        }
        if (str.equals("8")) {
            return ledColorEnum.BLACK;
        }
        if (str.equals("9")) {
            return ledColorEnum.BRUSHED_SILVER;
        }
        if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Device colour code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return ledColorEnum.NO_DEVICE_COLOUR;
    }

    /* renamed from: d */
    public audioConnectionStateEnum parseAudioConnectionState(String str) {
        if (str.equals("20")) {
            return audioConnectionStateEnum.NOT_CONNECTED;
        }
        if (str.equals("30")) {
            return audioConnectionStateEnum.CONNECTED_A2DP;
        }
        if (str.equals("25")) {
            return audioConnectionStateEnum.SEARCHING_TWS;
        }
        if (str.equals("10")) {
            return audioConnectionStateEnum.AUX;
        }
        if (str.equals("0") || str.equals("00")) {
            return audioConnectionStateEnum.POWER_OFF;
        }
        if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Connection state code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return audioConnectionStateEnum.NO_CONNECTION_STATE;
    }

    /* renamed from: e */
    public audioConnectionStateEnum setAudioConnectionState(String str) {
        this.audioConnectionStatef4465e = parseAudioConnectionState(str);
        return this.audioConnectionStatef4465e;
    }

    /* renamed from: f */
    public twsConnectionStateEnum parseTwsConnectionState(String str) {
        if (str.equals("00") || str.equals("0")) {
            return twsConnectionStateEnum.NO_TWS;
        }
        if (str.equals("30")) {
            return twsConnectionStateEnum.CONNECTED_AS_SLAVE;
        }
        if (str.equals("31")) {
            return twsConnectionStateEnum.CONNECTED_AS_MASTER;
        }
        if (str.equals("33")) {
            return twsConnectionStateEnum.CONNECTED_UNKNOWN;
        }
        if (str.equals("01")) {
            return twsConnectionStateEnum.START_SCANNING;
        }
        if (str.equals("02") || str.equals("03")) {
            return twsConnectionStateEnum.SCANNING;
        }
        if (str.equals("04")) {
            return twsConnectionStateEnum.FOUND_DEVICE;
        }
        if (str.equals("05") || str.equals("06") || str.equals("07") || str.equals("08")) {
            return twsConnectionStateEnum.CONNECTING;
        }
        if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught TWS state code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return twsConnectionStateEnum.NO_TWS_STATE;
    }

    /* renamed from: g */
    public twsConnectionStateEnum setTwsConnectionState(String str) {
        this.twsConnectionStatef4466f = parseTwsConnectionState(str);
        PrintStream printStream = System.err;
        printStream.println("TWSstate: " + this.twsConnectionStatef4466f.toString());
        return this.twsConnectionStatef4466f;
    }

    /* renamed from: a */
    public boolean isTwsScanning() {
        if (this.twsConnectionStatef4466f == twsConnectionStateEnum.NO_TWS || this.twsConnectionStatef4466f == twsConnectionStateEnum.CONNECTED_AS_SLAVE || this.twsConnectionStatef4466f == twsConnectionStateEnum.CONNECTED_AS_MASTER || this.twsConnectionStatef4466f == twsConnectionStateEnum.CONNECTED_UNKNOWN) {
            return false;
        }
        if (this.twsConnectionStatef4466f == twsConnectionStateEnum.START_SCANNING || this.twsConnectionStatef4466f == twsConnectionStateEnum.SCANNING || this.twsConnectionStatef4466f == twsConnectionStateEnum.FOUND_DEVICE || this.twsConnectionStatef4466f == twsConnectionStateEnum.CONNECTING) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean isTwsConnected() {
        if (this.twsConnectionStatef4466f == twsConnectionStateEnum.NO_TWS) {
            return false;
        }
        if (this.twsConnectionStatef4466f == twsConnectionStateEnum.CONNECTED_AS_SLAVE || this.twsConnectionStatef4466f == twsConnectionStateEnum.CONNECTED_AS_MASTER || this.twsConnectionStatef4466f == twsConnectionStateEnum.CONNECTED_UNKNOWN) {
            return true;
        }
        return (this.twsConnectionStatef4466f == twsConnectionStateEnum.START_SCANNING || this.twsConnectionStatef4466f == twsConnectionStateEnum.SCANNING || this.twsConnectionStatef4466f == twsConnectionStateEnum.FOUND_DEVICE || this.twsConnectionStatef4466f != twsConnectionStateEnum.CONNECTING) ? false : false;
    }

    /* renamed from: h */
    public broadcastStateEnum parseBroadcastState(String str) {
        if (str.equals("0")) {
            return broadcastStateEnum.NO_BROADCAST;
        }
        if (str.equals("1")) {
            return broadcastStateEnum.RX_READY;
        }
        if (str.equals("2")) {
            return broadcastStateEnum.RX_SEARCHING;
        }
        if (str.equals("3")) {
            return broadcastStateEnum.RX_PAIRED_MUSIC_OFF;
        }
        if (str.equals("4")) {
            return broadcastStateEnum.RX_PAIRED_MUSIC_ON;
        }
        if (str.equals("5")) {
            return broadcastStateEnum.TX_NOT_PAIRING_MUSIC_OFF;
        }
        if (str.equals("6")) {
            return broadcastStateEnum.TX_NOT_PAIRING_MUSIC_ON;
        }
        if (str.equals("7")) {
            return broadcastStateEnum.TX_PAIRING_MUSIC_ON;
        }
        if (str.equals("8")) {
            return broadcastStateEnum.TX_PAIRING_MUSIC_OFF;
        }
        if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Broadcast state code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return broadcastStateEnum.NO_BROADCAST;
    }

    /* renamed from: i */
    public broadcastStateEnum setBroadcastState(String str) {
        this.broadcastStatef4467g = parseBroadcastState(str);
        PrintStream printStream = System.err;
        printStream.println("BroadcastState: " + this.broadcastStatef4467g.toString());
        return this.broadcastStatef4467g;
    }

    /* renamed from: c */
    public boolean mo5494c() {
        if (this.broadcastStatef4467g == broadcastStateEnum.TX_NOT_PAIRING_MUSIC_OFF || this.broadcastStatef4467g == broadcastStateEnum.TX_NOT_PAIRING_MUSIC_ON || this.broadcastStatef4467g == broadcastStateEnum.TX_PAIRING_MUSIC_ON || this.broadcastStatef4467g == broadcastStateEnum.TX_PAIRING_MUSIC_OFF) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo5496d() {
        if (this.broadcastStatef4467g == broadcastStateEnum.TX_PAIRING_MUSIC_ON || this.broadcastStatef4467g == broadcastStateEnum.TX_PAIRING_MUSIC_OFF) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo5498e() {
        return this.broadcastStatef4467g == broadcastStateEnum.RX_SEARCHING;
    }

    /* renamed from: f */
    public boolean mo5500f() {
        if (this.broadcastStatef4467g == broadcastStateEnum.RX_PAIRED_MUSIC_OFF || this.broadcastStatef4467g == broadcastStateEnum.RX_PAIRED_MUSIC_ON) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo5502g() {
        if (this.broadcastStatef4467g == broadcastStateEnum.RX_SEARCHING || this.broadcastStatef4467g == broadcastStateEnum.RX_PAIRED_MUSIC_OFF || this.broadcastStatef4467g == broadcastStateEnum.RX_PAIRED_MUSIC_ON || this.broadcastStatef4467g == broadcastStateEnum.RX_READY) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public powerStateEnum parsePowerState(String str) {
        if (this.minirigType == modelTypeEnum.MINIMINI || this.minirigType == modelTypeEnum.MINIMINI2) {
            if (str.equals("0")) {
                return powerStateEnum.NORMAL;
            }
            if (str.equals("1")) {
                return powerStateEnum.CHARGING;
            }
            if (this.isInErrorMode) {
                PrintStream printStream = System.err;
                printStream.println("ERROR: Uncaught Power state code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
            }
        } else if (this.minirigType == modelTypeEnum.MINIRIG2 || this.minirigType == modelTypeEnum.MINIRIG3) {
            if (str.equals("1")) {
                return powerStateEnum.NORMAL;
            }
            if (str.equals("2")) {
                return powerStateEnum.CHARGING;
            }
            if (str.equals("3") || str.equals("4")) {
                return powerStateEnum.POWER_OUT;
            }
            if (this.isInErrorMode) {
                PrintStream printStream2 = System.err;
                printStream2.println("ERROR: Uncaught Power state code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
            }
        }
        return powerStateEnum.NO_POWER_STATE;
    }

    /* renamed from: k */
    public powerStateEnum setPowerState(String str) {
        this.powerStatef4468h = parsePowerState(str);
        return this.powerStatef4468h;
    }

    /* renamed from: l */
    public anotherledColorEnum parseAnotherLedColor(String str) {
        if (str.equals("0")) {
            return anotherledColorEnum.BLACK;
        }
        if (str.equals("1")) {
            return anotherledColorEnum.RED;
        }
        if (str.equals("2")) {
            return anotherledColorEnum.YELLOW;
        }
        if (str.equals("3")) {
            return anotherledColorEnum.GREEN;
        }
        if (str.equals("4")) {
            return anotherledColorEnum.CYAN;
        }
        if (str.equals("5")) {
            return anotherledColorEnum.BLUE;
        }
        if (str.equals("6")) {
            return anotherledColorEnum.PURPLE;
        }
        if (str.equals("7")) {
            return anotherledColorEnum.WHITE;
        }
        if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught LED colour code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return anotherledColorEnum.NO_LED_COLOUR;
    }

    /* renamed from: m */
    public anotherledColorEnum setAnotherLedColor(String str) {
        this.ledColorf4469i = parseAnotherLedColor(str);
        return this.ledColorf4469i;
    }

    /* renamed from: n */
    public boolean mo5516n(String str) {
        if (str.equals("7")) {
            this.f4470j = true;
        } else {
            this.f4470j = false;
        }
        return this.f4470j;
    }

    /* renamed from: o */
    public boolean mo5518o(String str) {
        if (str.equals("9")) {
            this.f4471k = true;
        } else {
            this.f4471k = false;
        }
        return this.f4471k;
    }

    /* renamed from: p */
    public int parseBassBoost(String str) {
        try {
            this.bassBoost = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            if (this.isInErrorMode) {
                PrintStream printStream = System.err;
                printStream.println("ERROR: EQ Bass Boost code was not a valid integer '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
            }
        }
        return this.bassBoost;
    }

    /* renamed from: h */
    public boolean mo5504h() {
        return this.bassBoost != 0;
    }

    /* renamed from: i */
    public boolean mo5506i() {
        return this.f4474n;
    }

    /* renamed from: q */
    public boolean mo5522q(String str) {
        if (this.minirigType == modelTypeEnum.MINIRIG2) {
            if (str.equals("-")) {
                this.f4474n = false;
            } else {
                this.f4474n = true;
            }
        } else if (str.equals("00") || str.equals("0")) {
            this.f4474n = false;
        } else {
            this.f4474n = true;
        }
        return this.f4474n;
    }

    /* renamed from: r */
    public int parseGainCode(String str) {
        try {
            this.gainMode = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            if (this.isInErrorMode) {
                PrintStream printStream = System.err;
                printStream.println("ERROR: Gain code was not a valid integer '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
            }
        }
        return this.gainMode;
    }

    /* renamed from: j */
    public int mo5507j() {
        return this.gainMode;
    }

    /* renamed from: s */
    public boolean mo5526s(String str) {
        if (str.equals("G")) {
            this.f4476p = true;
        } else if (str.equals(".")) {
            this.f4476p = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Gain Remembering code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4476p;
    }

    /* renamed from: k */
    public boolean mo5510k() {
        return this.f4476p;
    }

    /* renamed from: t */
    public boolean mo5528t(String str) {
        if (str.equals("l")) {
            this.f4477q = true;
        } else if (str.equals(".")) {
            this.f4477q = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught TWS locked code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4477q;
    }

    /* renamed from: l */
    public boolean mo5512l() {
        return this.f4477q;
    }

    /* renamed from: u */
    public boolean mo5530u(String str) {
        if (str.equals("d")) {
            this.f4478r = false;
        } else if (str.equals(".")) {
            this.f4478r = true;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Inactivity switch off code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4478r;
    }

    /* renamed from: m */
    public boolean mo5514m() {
        return this.f4478r;
    }

    /* renamed from: v */
    public boolean mo5532v(String str) {
        if (str.equals("t")) {
            this.f4479s = true;
        } else if (str.equals(".")) {
            this.f4479s = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Tones enabled code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4479s;
    }

    /* renamed from: n */
    public boolean mo5515n() {
        return this.f4479s;
    }

    /* renamed from: w */
    public boolean mo5534w(String str) {
        if (str.equals("n")) {
            this.f4480t = true;
        } else if (str.equals(".")) {
            this.f4480t = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Night mode code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4480t;
    }

    /* renamed from: o */
    public boolean mo5517o() {
        return this.f4480t;
    }

    /* renamed from: x */
    public boolean mo5536x(String str) {
        if (str.equals("s")) {
            this.f4481u = true;
        } else if (str.equals(".")) {
            this.f4481u = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Sub EQ mode code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4481u;
    }

    /* renamed from: y */
    public boolean mo5538y(String str) {
        if (str.equals("R")) {
            this.f4482v = true;
        } else if (str.equals(".")) {
            this.f4482v = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Right channel active code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4482v;
    }

    /* renamed from: p */
    public boolean mo5520p() {
        return this.f4482v;
    }

    /* renamed from: z */
    public boolean mo5539z(String str) {
        if (str.equals("L")) {
            this.f4483w = true;
        } else if (str.equals(".")) {
            this.f4483w = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Left channel active code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4483w;
    }

    /* renamed from: q */
    public boolean mo5521q() {
        return this.f4483w;
    }

    /* renamed from: A */
    public boolean mo5480A(String str) {
        if (str.equals("A")) {
            this.f4484x = true;
        } else if (str.equals(".")) {
            this.f4484x = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Amplifier active code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4484x;
    }

    /* renamed from: r */
    public boolean mo5524r() {
        return this.f4484x;
    }

    /* renamed from: B */
    public boolean mo5481B(String str) {
        if (str.equals("J")) {
            this.f4485y = true;
        } else if (str.equals(".")) {
            this.f4485y = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Jack top inserted code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4485y;
    }

    /* renamed from: s */
    public boolean mo5525s() {
        return this.f4485y;
    }

    /* renamed from: C */
    public boolean mo5482C(String str) {
        if (str.equals("j")) {
            this.f4486z = true;
        } else if (str.equals(".")) {
            this.f4486z = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Jack bottom inserted code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4486z;
    }

    /* renamed from: t */
    public boolean mo5527t() {
        return this.f4486z;
    }

    /* renamed from: D */
    public boolean mo5483D(String str) {
        if (str.equals("p")) {
            this.f4456A = true;
        } else if (str.equals(".")) {
            this.f4456A = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught is bluetooth streaming audio code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4456A;
    }

    /* renamed from: E */
    public boolean mo5484E(String str) {
        if (str.equals("}")) {
            this.f4457B = true;
        } else if (str.equals(".")) {
            this.f4457B = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught is single button press media control code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4457B;
    }

    /* renamed from: u */
    public boolean mo5529u() {
        return this.f4457B;
    }

    /* renamed from: F */
    public boolean mo5485F(String str) {
        if (str.equals(")")) {
            this.f4458C = true;
        } else if (str.equals(".")) {
            this.f4458C = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught is double button press media control code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4458C;
    }

    /* renamed from: v */
    public boolean mo5531v() {
        return this.f4458C;
    }

    /* renamed from: G */
    public boolean mo5486G(String str) {
        if (str.equals("]")) {
            this.f4459D = true;
        } else if (str.equals(".")) {
            this.f4459D = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught BLE stand by enabled code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4459D;
    }

    /* renamed from: w */
    public boolean mo5533w() {
        return this.f4459D;
    }

    /* renamed from: H */
    public boolean mo5487H(String str) {
        if (str.equals("S")) {
            this.f4460E = true;
        } else if (str.equals(".")) {
            this.f4460E = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught AUX power saving code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4460E;
    }

    /* renamed from: x */
    public boolean mo5535x() {
        return this.f4460E;
    }

    /* renamed from: I */
    public int mo5488I(String str) {
        if (str.equals("1")) {
            this.f4461F = 1;
        } else if (str.equals("2")) {
            this.f4461F = 2;
        } else if (str.equals("3")) {
            this.f4461F = 3;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Channel '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.f4461F;
    }

    /* renamed from: y */
    public int mo5537y() {
        return this.f4461F;
    }
}
