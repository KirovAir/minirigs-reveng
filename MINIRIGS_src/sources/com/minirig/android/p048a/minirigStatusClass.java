package com.minirig.android.p048a;

import android.util.Log;
import java.io.PrintStream;

/* renamed from: com.minirig.android.a.g */
public class minirigStatusClass {

    /* renamed from: a */
    protected static final String f4455a = "g";

    /* renamed from: A */
    private boolean isBluetoothStreaming = false;

    /* renamed from: B */
    private boolean isSingleButtonPressMediaControl = false;

    /* renamed from: C */
    private boolean isDoubleButtonPressMediaControlCode = false;

    /* renamed from: D */
    private boolean hasBLE_StandByEnabledCode = false;

    /* renamed from: E */
    private boolean auxPowerSavingEnabled = false;

    /* renamed from: F */
    private int channelCode = 1;

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
    private boolean isInLockedMode = false;

    /* renamed from: r */
    private boolean inactivitySwitchOff = false;

    /* renamed from: s */
    private boolean isTonesEnabled = false;

    /* renamed from: t */
    private boolean hasNightmode = false;

    /* renamed from: u */
    private boolean hasSubEq = false;

    /* renamed from: v */
    private boolean hasRightChannelActive = false;

    /* renamed from: w */
    private boolean hasLeftChannelActive = false;

    /* renamed from: x */
    private boolean hasAmplifierActive = false;

    /* renamed from: y */
    private boolean hasJackInsertedTop = false;

    /* renamed from: z */
    private boolean hasJackInsertedBottom = false;

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
                parseTwsLockedCode(str.substring(18, 19));
            }
            if (str.length() >= 20) {
                inactivitySwitchOffCode(str.substring(19, 20));
            }
            if (str.length() >= 21) {
                parseTonesEnabledCode(str.substring(20, 21));
            }
            if (str.length() >= 22) {
                parseNightmodeCode(str.substring(21, 22));
            }
            if (str.length() >= 23) {
                parseSubEqMode(str.substring(22, 23));
            }
            if (str.length() >= 24) {
                parseRightChannelActiveCode(str.substring(23, 24));
            }
            if (str.length() >= 25) {
                parseLeftChannelActiveCode(str.substring(24, 25));
            }
            if (str.length() >= 26) {
                parseAmplifierActiveCode(str.substring(25, 26));
            }
            if (str.length() >= 27) {
                parseJackTopInsertedCode(str.substring(26, 27));
            }
            if (str.length() >= 28) {
                parseJackBottomInsertedCode(str.substring(27, 28));
            }
            if (str.length() >= 29) {
                parseIsBluetoothStreamingCode(str.substring(28, 29));
            }
            if (str.length() >= 30) {
                parseIsSingleButtonPressMediaControlCode(str.substring(29, 30));
            }
            if (str.length() >= 31) {
                parseIsDoubleButtonPressMediaControlCode(str.substring(30, 31));
            }
            if (str.length() >= 32) {
                parseBLE_StandByEnabledCode(str.substring(31, 32));
            }
            if (str.length() >= 33) {
                parseAuxPowerSavingMode(str.substring(32, 33));
            }
            if (str.length() >= 34) {
                parseChannelCode(str.substring(33, 34));
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
    public boolean parseTwsLockedCode(String str) {
        if (str.equals("l")) {
            this.isInLockedMode = true;
        } else if (str.equals(".")) {
            this.isInLockedMode = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught TWS locked code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.isInLockedMode;
    }

    /* renamed from: l */
    public boolean getIsInLockedMode() {
        return this.isInLockedMode;
    }

    /* renamed from: u */
    public boolean inactivitySwitchOffCode(String str) {
        if (str.equals("d")) {
            this.inactivitySwitchOff = false;
        } else if (str.equals(".")) {
            this.inactivitySwitchOff = true;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Inactivity switch off code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.inactivitySwitchOff;
    }

    /* renamed from: m */
    public boolean getInactivitySwitchOff() {
        return this.inactivitySwitchOff;
    }

    /* renamed from: v */
    public boolean parseTonesEnabledCode(String str) {
        if (str.equals("t")) {
            this.isTonesEnabled = true;
        } else if (str.equals(".")) {
            this.isTonesEnabled = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Tones enabled code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.isTonesEnabled;
    }

    /* renamed from: n */
    public boolean getIsTonesEnabled() {
        return this.isTonesEnabled;
    }

    /* renamed from: w */
    public boolean parseNightmodeCode(String str) {
        if (str.equals("n")) {
            this.hasNightmode = true;
        } else if (str.equals(".")) {
            this.hasNightmode = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Night mode code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.hasNightmode;
    }

    /* renamed from: o */
    public boolean getHasNightmode() {
        return this.hasNightmode;
    }

    /* renamed from: x */
    public boolean parseSubEqMode(String str) {
        if (str.equals("s")) {
            this.hasSubEq = true;
        } else if (str.equals(".")) {
            this.hasSubEq = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Sub EQ mode code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.hasSubEq;
    }

    /* renamed from: y */
    public boolean parseRightChannelActiveCode(String str) {
        if (str.equals("R")) {
            this.hasRightChannelActive = true;
        } else if (str.equals(".")) {
            this.hasRightChannelActive = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Right channel active code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.hasRightChannelActive;
    }

    /* renamed from: p */
    public boolean getHasRightChannelActive() {
        return this.hasRightChannelActive;
    }

    /* renamed from: z */
    public boolean parseLeftChannelActiveCode(String str) {
        if (str.equals("L")) {
            this.hasLeftChannelActive = true;
        } else if (str.equals(".")) {
            this.hasLeftChannelActive = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Left channel active code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.hasLeftChannelActive;
    }

    /* renamed from: q */
    public boolean getHasLeftChannelActive() {
        return this.hasLeftChannelActive;
    }

    /* renamed from: A */
    public boolean parseAmplifierActiveCode(String str) {
        if (str.equals("A")) {
            this.hasAmplifierActive = true;
        } else if (str.equals(".")) {
            this.hasAmplifierActive = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Amplifier active code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.hasAmplifierActive;
    }

    /* renamed from: r */
    public boolean getHasAmplifierActive() {
        return this.hasAmplifierActive;
    }

    /* renamed from: B */
    public boolean parseJackTopInsertedCode(String str) {
        if (str.equals("J")) {
            this.hasJackInsertedTop = true;
        } else if (str.equals(".")) {
            this.hasJackInsertedTop = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Jack top inserted code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.hasJackInsertedTop;
    }

    /* renamed from: s */
    public boolean getHasJackInsertedTop() {
        return this.hasJackInsertedTop;
    }

    /* renamed from: C */
    public boolean parseJackBottomInsertedCode(String str) {
        if (str.equals("j")) {
            this.hasJackInsertedBottom = true;
        } else if (str.equals(".")) {
            this.hasJackInsertedBottom = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Jack bottom inserted code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.hasJackInsertedBottom;
    }

    /* renamed from: t */
    public boolean getHasJackInsertedBottom() {
        return this.hasJackInsertedBottom;
    }

    /* renamed from: D */
    public boolean parseIsBluetoothStreamingCode(String str) {
        if (str.equals("p")) {
            this.isBluetoothStreaming = true;
        } else if (str.equals(".")) {
            this.isBluetoothStreaming = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught is bluetooth streaming audio code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.isBluetoothStreaming;
    }

    /* renamed from: E */
    public boolean parseIsSingleButtonPressMediaControlCode(String str) {
        if (str.equals("}")) {
            this.isSingleButtonPressMediaControl = true;
        } else if (str.equals(".")) {
            this.isSingleButtonPressMediaControl = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught is single button press media control code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.isSingleButtonPressMediaControl;
    }

    /* renamed from: u */
    public boolean getIsSingleButtonPressMediaControl() {
        return this.isSingleButtonPressMediaControl;
    }

    /* renamed from: F */
    public boolean parseIsDoubleButtonPressMediaControlCode(String str) {
        if (str.equals(")")) {
            this.isDoubleButtonPressMediaControlCode = true;
        } else if (str.equals(".")) {
            this.isDoubleButtonPressMediaControlCode = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught is double button press media control code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.isDoubleButtonPressMediaControlCode;
    }

    /* renamed from: v */
    public boolean getIsDoubleButtonPressMediaControlCode() {
        return this.isDoubleButtonPressMediaControlCode;
    }

    /* renamed from: G */
    public boolean parseBLE_StandByEnabledCode(String str) {
        if (str.equals("]")) {
            this.hasBLE_StandByEnabledCode = true;
        } else if (str.equals(".")) {
            this.hasBLE_StandByEnabledCode = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught BLE stand by enabled code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.hasBLE_StandByEnabledCode;
    }

    /* renamed from: w */
    public boolean getHasBLE_StandByEnabledCode() {
        return this.hasBLE_StandByEnabledCode;
    }

    /* renamed from: H */
    public boolean parseAuxPowerSavingMode(String str) {
        if (str.equals("S")) {
            this.auxPowerSavingEnabled = true;
        } else if (str.equals(".")) {
            this.auxPowerSavingEnabled = false;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught AUX power saving code '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.auxPowerSavingEnabled;
    }

    /* renamed from: x */
    public boolean getAuxPowerSavingEnabled() {
        return this.auxPowerSavingEnabled;
    }

    /* renamed from: I */
    public int parseChannelCode(String str) {
        if (str.equals("1")) {
            this.channelCode = 1;
        } else if (str.equals("2")) {
            this.channelCode = 2;
        } else if (str.equals("3")) {
            this.channelCode = 3;
        } else if (this.isInErrorMode) {
            PrintStream printStream = System.err;
            printStream.println("ERROR: Uncaught Channel '" + str + "' | IN " + f4455a + " LINE " + new Throwable().getStackTrace()[0].getLineNumber());
        }
        return this.channelCode;
    }

    /* renamed from: y */
    public int getChannelCode() {
        return this.channelCode;
    }
}
