package com.minirig.android;

import android.app.AlertDialog;
import android.app.Dialog;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothSocket;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.p026v4.app.C0414a;
import android.support.p026v4.p027a.C0391a;
import android.support.p039v7.app.C0670c;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.p046a.p047a.C1066m;
import com.minirig.android.C1258c;
import com.minirig.android.custom.C1263a;
import com.minirig.android.custom.C1266b;
import com.minirig.android.custom.CustomListView;
import com.minirig.android.custom.VerticalSeekBar;
import com.minirig.android.p048a.C1226a;
import com.minirig.android.p048a.C1229d;
import com.minirig.android.p048a.C1230e;
import com.minirig.android.p048a.minirigStatusClass;
import com.minirig.android.p049b.C1244b;
import com.minirig.android.p049b.C1246d;
import com.minirig.android.p049b.C1250e;
import com.minirig.android.p049b.C1257f;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;

public class MainActivity extends C0670c {

    /* renamed from: m */
    protected static final String f3974m = "MainActivity";

    /* renamed from: A */
    Handler f3975A;

    /* renamed from: B */
    Handler f3976B;

    /* renamed from: C */
    Runnable f3977C;

    /* renamed from: D */
    Runnable f3978D;

    /* renamed from: E */
    Runnable f3979E;

    /* renamed from: F */
    C1219c f3980F;

    /* renamed from: G */
    C1219c f3981G;

    /* renamed from: H */
    C1219c f3982H;

    /* renamed from: I */
    C1219c f3983I;

    /* renamed from: J */
    Handler f3984J;

    /* renamed from: K */
    public int f3985K = 4000;

    /* renamed from: L */
    Runnable f3986L;

    /* renamed from: M */
    String[] f3987M;

    /* renamed from: N */
    int f3988N = 0;

    /* renamed from: O */
    Date f3989O;

    /* renamed from: P */
    public final BroadcastReceiver f3990P = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            GlobalApplication globalApplication = MainActivity.this.f4214k;
            String str = MainActivity.f3974m;
            globalApplication.mo5229a(str, "bluetoothTurnedOnOff receiver: " + intent.toString());
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str2 : extras.keySet()) {
                    extras.get(str2);
                }
            }
            if (intent.hasExtra("android.bluetooth.adapter.extra.CONNECTION_STATE")) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", -1);
                if (MainActivity.this.f4214k.f3966l != null) {
                    if (bluetoothDevice.getAddress().equals(MainActivity.this.f4214k.f3966l.f4405g) && intExtra == 0) {
                        MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Bluetooth device disconnected");
                        if (MainActivity.this.f4065bM == MainActivity.this.f4050ax || MainActivity.this.f4065bM == MainActivity.this.f4002aB || MainActivity.this.f4065bM == MainActivity.this.f4001aA) {
                            MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, " Dont close when disconnected ");
                            MainActivity.this.f4043aq = true;
                        }
                        MainActivity mainActivity = MainActivity.this;
                        mainActivity.f4227y = null;
                        GlobalApplication globalApplication2 = mainActivity.f4214k;
                        String str3 = MainActivity.f3974m;
                        globalApplication2.mo5229a(str3, " ---- **** ---- Disconnected while view was: " + MainActivity.this.f4065bM.toString());
                        MainActivity.this.m5903bz();
                    }
                } else if (intExtra == 2 && MainActivity.this.f3982H != null && MainActivity.this.m5715S() != null) {
                    MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Bluetooth device connection detected");
                    MainActivity.this.f3982H.cancel(true);
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.m5905c(mainActivity2.m5715S());
                } else if (intExtra == 2 && MainActivity.this.f4043aq) {
                    MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Bluetooth device reconnected after broadcast disconnection");
                    MainActivity mainActivity3 = MainActivity.this;
                    mainActivity3.m5905c(mainActivity3.m5715S());
                }
            }
        }
    };

    /* renamed from: Q */
    View f3991Q;

    /* renamed from: R */
    View f3992R;

    /* renamed from: S */
    Button f3993S;

    /* renamed from: T */
    TextView f3994T;

    /* renamed from: U */
    Dialog f3995U;

    /* renamed from: V */
    View f3996V;

    /* renamed from: W */
    ImageView f3997W;

    /* renamed from: X */
    AnimationDrawable f3998X;

    /* renamed from: Y */
    TextView f3999Y;

    /* renamed from: Z */
    Button f4000Z;

    /* renamed from: aA */
    View f4001aA;

    /* renamed from: aB */
    View f4002aB;

    /* renamed from: aC */
    View f4003aC;

    /* renamed from: aD */
    View f4004aD;

    /* renamed from: aE */
    AnimationDrawable f4005aE;

    /* renamed from: aF */
    AlertDialog f4006aF;

    /* renamed from: aG */
    int f4007aG = 0;

    /* renamed from: aH */
    String f4008aH = "";

    /* renamed from: aI */
    View f4009aI;

    /* renamed from: aJ */
    View f4010aJ;

    /* renamed from: aK */
    View f4011aK;

    /* renamed from: aL */
    ImageButton f4012aL;

    /* renamed from: aM */
    ImageButton f4013aM;

    /* renamed from: aN */
    ImageButton f4014aN;

    /* renamed from: aO */
    ImageButton f4015aO;

    /* renamed from: aP */
    boolean f4016aP = false;

    /* renamed from: aQ */
    boolean f4017aQ = true;

    /* renamed from: aR */
    View f4018aR;

    /* renamed from: aS */
    View f4019aS;

    /* renamed from: aT */
    View f4020aT;

    /* renamed from: aU */
    View f4021aU;

    /* renamed from: aV */
    View f4022aV;

    /* renamed from: aW */
    View f4023aW;

    /* renamed from: aX */
    TextView f4024aX;

    /* renamed from: aY */
    TextView f4025aY;

    /* renamed from: aZ */
    TextView f4026aZ;

    /* renamed from: aa */
    Button f4027aa;

    /* renamed from: ab */
    View f4028ab;

    /* renamed from: ac */
    View f4029ac;

    /* renamed from: ad */
    boolean f4030ad = false;

    /* renamed from: ae */
    boolean f4031ae = false;

    /* renamed from: af */
    long f4032af = 0;

    /* renamed from: ag */
    boolean f4033ag = false;

    /* renamed from: ah */
    BroadcastReceiver f4034ah = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            intent.getStringExtra("command");
            MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "- - - - - - - - - - - - - - - ");
            MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, " Track info mReceiver ");
            MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, action);
            Bundle extras = intent.getExtras();
            if (intent != null) {
                for (String str : extras.keySet()) {
                    Object obj = extras.get(str);
                    if (obj != null) {
                        Log.d(MainActivity.f3974m, String.format("%s %s (%s)", new Object[]{str, obj.toString(), obj.getClass().getName()}));
                    }
                }
            }
            String stringExtra = intent.getStringExtra("artist");
            String stringExtra2 = intent.getStringExtra("track");
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            if (intent.hasExtra("TRACK_NAME")) {
                stringExtra2 = intent.getStringExtra("TRACK_NAME");
            }
            final String str2 = "";
            if (!stringExtra.equals("")) {
                str2 = stringExtra;
            }
            if (!stringExtra2.equals("")) {
                str2 = stringExtra2;
            }
            if (!stringExtra2.equals("") && !stringExtra.equals("")) {
                str2 = "<b>" + stringExtra + ":</b>  " + stringExtra2;
            }
            if (!str2.equalsIgnoreCase("")) {
                MainActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        MainActivity.this.f4214k.f3970p = -1;
                        MainActivity.this.f4151cu.setText(Html.fromHtml(str2));
                    }
                });
            }
        }
    };

    /* renamed from: ai */
    boolean f4035ai = false;

    /* renamed from: aj */
    boolean f4036aj = false;

    /* renamed from: ak */
    View f4037ak;

    /* renamed from: al */
    View f4038al;

    /* renamed from: am */
    ImageButton f4039am;

    /* renamed from: an */
    ImageButton f4040an;

    /* renamed from: ao */
    ImageButton f4041ao;

    /* renamed from: ap */
    boolean f4042ap = false;

    /* renamed from: aq */
    boolean f4043aq = false;

    /* renamed from: ar */
    boolean f4044ar = false;

    /* renamed from: as */
    boolean f4045as = false;

    /* renamed from: at */
    View f4046at;

    /* renamed from: au */
    View f4047au;

    /* renamed from: av */
    View f4048av;

    /* renamed from: aw */
    View f4049aw;

    /* renamed from: ax */
    View f4050ax;

    /* renamed from: ay */
    View f4051ay;

    /* renamed from: az */
    View f4052az;

    /* renamed from: bA */
    View f4053bA;

    /* renamed from: bB */
    TextView f4054bB;

    /* renamed from: bC */
    TextView f4055bC;

    /* renamed from: bD */
    ListView f4056bD;

    /* renamed from: bE */
    C1263a f4057bE;

    /* renamed from: bF */
    ArrayList<String> f4058bF = new ArrayList<>();

    /* renamed from: bG */
    ArrayList<String> f4059bG = new ArrayList<>();

    /* renamed from: bH */
    ArrayList<Integer> f4060bH = new ArrayList<>();

    /* renamed from: bI */
    boolean f4061bI = false;

    /* renamed from: bJ */
    public View f4062bJ;

    /* renamed from: bK */
    TextView f4063bK;

    /* renamed from: bL */
    TextView f4064bL;

    /* renamed from: bM */
    View f4065bM;

    /* renamed from: bN */
    View f4066bN;

    /* renamed from: bO */
    View f4067bO;

    /* renamed from: bP */
    LinearLayout f4068bP;

    /* renamed from: bQ */
    boolean f4069bQ = false;

    /* renamed from: bR */
    List<String> f4070bR = new ArrayList();

    /* renamed from: bS */
    List<String> f4071bS = new ArrayList();

    /* renamed from: bT */
    boolean f4072bT = false;

    /* renamed from: bU */
    boolean f4073bU = false;

    /* renamed from: bV */
    BluetoothSocket f4074bV;

    /* renamed from: bW */
    InputStream f4075bW;

    /* renamed from: bX */
    OutputStream f4076bX;

    /* renamed from: bY */
    Thread f4077bY;

    /* renamed from: bZ */
    byte[] f4078bZ;

    /* renamed from: ba */
    View f4079ba;

    /* renamed from: bb */
    View f4080bb;

    /* renamed from: bc */
    View f4081bc;

    /* renamed from: bd */
    int f4082bd = 0;

    /* renamed from: be */
    HashMap<String, Integer> f4083be = new HashMap<>();

    /* renamed from: bf */
    HashMap<String, Integer> f4084bf = new HashMap<>();

    /* renamed from: bg */
    HashMap<String, Integer> f4085bg = new HashMap<>();

    /* renamed from: bh */
    HashMap<String, Integer> f4086bh = new HashMap<>();

    /* renamed from: bi */
    HashMap<String, Integer> f4087bi = new HashMap<>();

    /* renamed from: bj */
    HashMap<String, Integer> f4088bj = new HashMap<>();

    /* renamed from: bk */
    HashMap<String, Integer> f4089bk = new HashMap<>();

    /* renamed from: bl */
    View f4090bl;

    /* renamed from: bm */
    View f4091bm;

    /* renamed from: bn */
    ListView f4092bn;

    /* renamed from: bo */
    C1266b f4093bo;

    /* renamed from: bp */
    ArrayList<String> f4094bp = new ArrayList<>();

    /* renamed from: bq */
    ArrayList<String> f4095bq = new ArrayList<>();

    /* renamed from: br */
    ArrayList<Boolean> f4096br = new ArrayList<>();

    /* renamed from: bs */
    boolean f4097bs = false;

    /* renamed from: bt */
    boolean f4098bt = false;

    /* renamed from: bu */
    public HashMap<Integer, C1266b.C1270b> f4099bu = new HashMap<>();

    /* renamed from: bv */
    View f4100bv;

    /* renamed from: bw */
    WebView f4101bw;

    /* renamed from: bx */
    public String f4102bx = "<!DOCTYPE html><html> <head> <meta charset=\\\"UTF-8\\\"><meta name=\\\"viewport\\\" content=\\\"target-densitydpi=high-dpi\\\" /> <meta name=\\\"viewport\\\" content=\\\"width=device-width, initial-scale=1\\\"></head> <body style=\\\"background:black;margin:0 0 0 0; padding:0 0 0 0;\\\"> Webpage load failed, check your internet connection.</body> </html>";

    /* renamed from: by */
    public View f4103by;

    /* renamed from: bz */
    public View f4104bz;
    /* access modifiers changed from: private */

    /* renamed from: cA */
    public ImageButton f4105cA;

    /* renamed from: cB */
    private ImageButton f4106cB;

    /* renamed from: cC */
    private ImageButton f4107cC;

    /* renamed from: cD */
    private ImageButton f4108cD;

    /* renamed from: cE */
    private ImageButton f4109cE;

    /* renamed from: cF */
    private ImageButton f4110cF;
    /* access modifiers changed from: private */

    /* renamed from: cG */
    public ImageButton f4111cG;

    /* renamed from: cH */
    private ImageButton f4112cH;

    /* renamed from: cI */
    private boolean f4113cI = false;

    /* renamed from: cJ */
    private int f4114cJ = 0;
    /* access modifiers changed from: private */

    /* renamed from: cK */
    public boolean f4115cK = false;

    /* renamed from: cL */
    private boolean f4116cL = false;
    /* access modifiers changed from: private */

    /* renamed from: cM */
    public boolean f4117cM = false;

    /* renamed from: cN */
    private String f4118cN = "5";
    /* access modifiers changed from: private */

    /* renamed from: cO */
    public String f4119cO = "5";

    /* renamed from: cP */
    private ImageButton f4120cP;

    /* renamed from: cQ */
    private ImageButton f4121cQ;

    /* renamed from: cR */
    private ImageButton f4122cR;
    /* access modifiers changed from: private */

    /* renamed from: cS */
    public int f4123cS = 0;
    /* access modifiers changed from: private */

    /* renamed from: cT */
    public VerticalSeekBar f4124cT;
    /* access modifiers changed from: private */

    /* renamed from: cU */
    public VerticalSeekBar f4125cU;
    /* access modifiers changed from: private */

    /* renamed from: cV */
    public VerticalSeekBar f4126cV;
    /* access modifiers changed from: private */

    /* renamed from: cW */
    public ImageView f4127cW;
    /* access modifiers changed from: private */

    /* renamed from: cX */
    public ImageView f4128cX;
    /* access modifiers changed from: private */

    /* renamed from: cY */
    public ImageView f4129cY;
    /* access modifiers changed from: private */

    /* renamed from: cZ */
    public ImageView f4130cZ;

    /* renamed from: ca */
    int f4131ca;

    /* renamed from: cb */
    volatile boolean f4132cb;

    /* renamed from: cc */
    C1230e f4133cc;

    /* renamed from: cd */
    boolean f4134cd = false;

    /* renamed from: ce */
    int f4135ce = 0;

    /* renamed from: cf */
    View f4136cf;

    /* renamed from: cg */
    CustomListView f4137cg;
    /* access modifiers changed from: private */

    /* renamed from: ch */
    public C1258c f4138ch;

    /* renamed from: ci */
    private String f4139ci = "30";
    /* access modifiers changed from: private */

    /* renamed from: cj */
    public boolean f4140cj = false;
    /* access modifiers changed from: private */

    /* renamed from: ck */
    public Date f4141ck;
    /* access modifiers changed from: private */

    /* renamed from: cl */
    public View f4142cl = null;

    /* renamed from: cm */
    private boolean f4143cm = false;
    /* access modifiers changed from: private */

    /* renamed from: cn */
    public AlertDialog f4144cn;

    /* renamed from: co */
    private BluetoothProfile.ServiceListener f4145co = new BluetoothProfile.ServiceListener() {
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            if (i == 2) {
                MainActivity.this.f4219q = (BluetoothA2dp) bluetoothProfile;
            }
        }

        public void onServiceDisconnected(int i) {
            if (i == 2) {
                MainActivity.this.f4219q = null;
            }
        }
    };

    /* renamed from: cp */
    private int f4146cp = 0;
    /* access modifiers changed from: private */

    /* renamed from: cq */
    public AlphaAnimation f4147cq;
    /* access modifiers changed from: private */

    /* renamed from: cr */
    public AlphaAnimation f4148cr;

    /* renamed from: cs */
    private View f4149cs;
    /* access modifiers changed from: private */

    /* renamed from: ct */
    public EditText f4150ct;
    /* access modifiers changed from: private */

    /* renamed from: cu */
    public TextView f4151cu;
    /* access modifiers changed from: private */

    /* renamed from: cv */
    public ImageButton f4152cv;

    /* renamed from: cw */
    private ImageButton f4153cw;

    /* renamed from: cx */
    private ImageButton f4154cx;
    /* access modifiers changed from: private */

    /* renamed from: cy */
    public ImageButton f4155cy;

    /* renamed from: cz */
    private ImageButton f4156cz;
    /* access modifiers changed from: private */

    /* renamed from: dA */
    public int[] f4157dA = {30, 34, 38, 42, 46, 50, 54, 58, 62, 66, 70};
    /* access modifiers changed from: private */

    /* renamed from: dB */
    public int[] f4158dB = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    /* access modifiers changed from: private */

    /* renamed from: dC */
    public C1226a[] f4159dC = {new C1226a(-1, 5), new C1226a(5, 15), new C1226a(15, 25), new C1226a(25, 35), new C1226a(35, 45), new C1226a(45, 55), new C1226a(55, 65), new C1226a(65, 75), new C1226a(75, 85), new C1226a(85, 95), new C1226a(95, 100)};
    /* access modifiers changed from: private */

    /* renamed from: dD */
    public String f4160dD = "selectedSlot";

    /* renamed from: dE */
    private String f4161dE = "eqpreset-";

    /* renamed from: dF */
    private String f4162dF = "";
    /* access modifiers changed from: private */

    /* renamed from: dG */
    public boolean f4163dG = true;

    /* renamed from: dH */
    private boolean f4164dH = false;
    /* access modifiers changed from: private */

    /* renamed from: dI */
    public TextView f4165dI;
    /* access modifiers changed from: private */

    /* renamed from: dJ */
    public ImageButton f4166dJ;
    /* access modifiers changed from: private */

    /* renamed from: dK */
    public ImageButton f4167dK;
    /* access modifiers changed from: private */

    /* renamed from: dL */
    public ImageButton f4168dL;
    /* access modifiers changed from: private */

    /* renamed from: dM */
    public ImageButton f4169dM;
    /* access modifiers changed from: private */

    /* renamed from: dN */
    public ImageButton f4170dN;
    /* access modifiers changed from: private */

    /* renamed from: dO */
    public String f4171dO = "definedSelectedSlot";

    /* renamed from: dP */
    private String f4172dP = "definedeqpreset";

    /* renamed from: dQ */
    private boolean f4173dQ = false;

    /* renamed from: dR */
    private boolean f4174dR = false;

    /* renamed from: dS */
    private int f4175dS = 0;

    /* renamed from: dT */
    private boolean f4176dT = false;
    /* access modifiers changed from: private */

    /* renamed from: dU */
    public boolean f4177dU;

    /* renamed from: dV */
    private String f4178dV;

    /* renamed from: dW */
    private boolean f4179dW;
    /* access modifiers changed from: private */

    /* renamed from: dX */
    public BluetoothAdapter f4180dX;
    /* access modifiers changed from: private */

    /* renamed from: dY */
    public BluetoothLeScanner f4181dY;
    /* access modifiers changed from: private */

    /* renamed from: dZ */
    public ScanCallback f4182dZ;
    /* access modifiers changed from: private */

    /* renamed from: da */
    public ImageView f4183da;
    /* access modifiers changed from: private */

    /* renamed from: db */
    public ImageView f4184db;
    /* access modifiers changed from: private */

    /* renamed from: dc */
    public Button f4185dc;
    /* access modifiers changed from: private */

    /* renamed from: dd */
    public int f4186dd = 1;
    /* access modifiers changed from: private */

    /* renamed from: de */
    public boolean f4187de = false;
    /* access modifiers changed from: private */

    /* renamed from: df */
    public int f4188df = 0;

    /* renamed from: dg */
    private int f4189dg = 0;
    /* access modifiers changed from: private */

    /* renamed from: dh */
    public int f4190dh = 19;
    /* access modifiers changed from: private */

    /* renamed from: di */
    public int f4191di = 0;
    /* access modifiers changed from: private */

    /* renamed from: dj */
    public int f4192dj = 6;
    /* access modifiers changed from: private */

    /* renamed from: dk */
    public int f4193dk = 28;
    /* access modifiers changed from: private */

    /* renamed from: dl */
    public VerticalSeekBar f4194dl;
    /* access modifiers changed from: private */

    /* renamed from: dm */
    public VerticalSeekBar f4195dm;
    /* access modifiers changed from: private */

    /* renamed from: dn */
    public VerticalSeekBar f4196dn;
    /* access modifiers changed from: private */

    /* renamed from: do */
    public VerticalSeekBar f4197do;
    /* access modifiers changed from: private */

    /* renamed from: dp */
    public VerticalSeekBar f4198dp;

    /* renamed from: dq */
    private TextView f4199dq;

    /* renamed from: dr */
    private TextView f4200dr;

    /* renamed from: ds */
    private TextView f4201ds;

    /* renamed from: dt */
    private TextView f4202dt;

    /* renamed from: du */
    private TextView f4203du;
    /* access modifiers changed from: private */

    /* renamed from: dv */
    public ImageButton f4204dv;
    /* access modifiers changed from: private */

    /* renamed from: dw */
    public ImageButton f4205dw;
    /* access modifiers changed from: private */

    /* renamed from: dx */
    public ImageButton f4206dx;
    /* access modifiers changed from: private */

    /* renamed from: dy */
    public ImageButton f4207dy;
    /* access modifiers changed from: private */

    /* renamed from: dz */
    public ImageButton f4208dz;
    /* access modifiers changed from: private */

    /* renamed from: ea */
    public BluetoothGatt f4209ea;
    /* access modifiers changed from: private */

    /* renamed from: eb */
    public int f4210eb = 0;
    /* access modifiers changed from: private */

    /* renamed from: ec */
    public Map<String, BluetoothDevice> f4211ec;
    /* access modifiers changed from: private */

    /* renamed from: ed */
    public final BluetoothGattCallback f4212ed = new BluetoothGattCallback() {
        public void onaudioConnectionStateEnumChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onaudioConnectionStateEnumChange(bluetoothGatt, i, i2);
            GlobalApplication globalApplication = MainActivity.this.f4214k;
            String str = MainActivity.f3974m;
            globalApplication.mo5229a(str, "onaudioConnectionStateEnumChange newState: " + i2);
            if (i == 257) {
                GlobalApplication globalApplication2 = MainActivity.this.f4214k;
                String str2 = MainActivity.f3974m;
                globalApplication2.mo5229a(str2, "Connection Gatt failure status " + i);
                MainActivity.this.mo5240I();
            } else if (i != 0) {
                GlobalApplication globalApplication3 = MainActivity.this.f4214k;
                String str3 = MainActivity.f3974m;
                globalApplication3.mo5229a(str3, "Connection not GATT sucess status " + i);
                MainActivity.this.mo5240I();
            } else if (i2 == 2) {
                GlobalApplication globalApplication4 = MainActivity.this.f4214k;
                String str4 = MainActivity.f3974m;
                globalApplication4.mo5229a(str4, "Connected to device " + bluetoothGatt.getDevice().getAddress());
                int unused = MainActivity.this.f4210eb = 2;
                bluetoothGatt.discoverServices();
            } else if (i2 == 0) {
                MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Disconnected from device");
                MainActivity.this.mo5240I();
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            if (i != 0) {
                GlobalApplication globalApplication = MainActivity.this.f4214k;
                String str = MainActivity.f3974m;
                globalApplication.mo5229a(str, "Device service discovery unsuccessful, status " + i);
                MainActivity.this.f4043aq = false;
                return;
            }
            BluetoothGattCharacteristic characteristic = bluetoothGatt.getService(C1241b.f4556b).getCharacteristic(C1241b.f4560f);
            characteristic.setWriteType(2);
            m5992a(bluetoothGatt, characteristic);
            MainActivity.this.runOnUiThread(new Runnable() {
                public void run() {
                    if (MainActivity.this.f4067bO == null || MainActivity.this.f4067bO == MainActivity.this.f4136cf) {
                        MainActivity.this.setView(MainActivity.this.f4028ab);
                        return;
                    }
                    MainActivity.this.setView(MainActivity.this.f4067bO);
                    MainActivity.this.f4067bO = null;
                }
            });
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            MainActivity mainActivity = MainActivity.this;
            mainActivity.f4072bT = false;
            if (i != 0) {
                GlobalApplication globalApplication = mainActivity.f4214k;
                String str = MainActivity.f3974m;
                globalApplication.mo5229a(str, "Characteristic write unsuccessful, status: " + i);
                MainActivity.this.mo5240I();
            } else if (mainActivity.f4070bR.size() > 0) {
                MainActivity mainActivity2 = MainActivity.this;
                mainActivity2.sendCommand(mainActivity2.f4070bR.get(0), MainActivity.this.f4071bS.get(0));
                MainActivity.this.f4070bR.remove(0);
                MainActivity.this.f4071bS.remove(0);
            }
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            if (i == 0) {
                m5993a(bluetoothGattCharacteristic);
                return;
            }
            GlobalApplication globalApplication = MainActivity.this.f4214k;
            String str = MainActivity.f3974m;
            globalApplication.mo5229a(str, "Characteristic read unsuccessful, status: " + i);
            MainActivity.this.mo5240I();
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            m5993a(bluetoothGattCharacteristic);
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (i == 0) {
                bluetoothGatt.requestMtu(512);
            } else {
                MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Descriptor write failed");
            }
        }

        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onMtuChanged(bluetoothGatt, i, i2);
            if (i2 == 0) {
                GlobalApplication globalApplication = MainActivity.this.f4214k;
                String str = MainActivity.f3974m;
                globalApplication.mo5229a(str, "MTU changed: " + i);
                MainActivity.this.mo5238G();
                return;
            }
            MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "MTU change failed");
        }

        /* renamed from: a */
        private void m5992a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            if (bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true)) {
                BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"));
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                bluetoothGatt.writeDescriptor(descriptor);
                bluetoothGatt.requestMtu(512);
                return;
            }
            GlobalApplication globalApplication = MainActivity.this.f4214k;
            String str = MainActivity.f3974m;
            globalApplication.mo5229a(str, "Characteristic notification set failure for " + bluetoothGattCharacteristic.getUuid().toString());
        }

        /* renamed from: a */
        private void m5993a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            String a = C1257f.m6120a(bluetoothGattCharacteristic.getValue());
            if (a == null) {
                MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Unable to convert bytes to string");
            } else {
                MainActivity.this.m5943o(a);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: ee */
    public boolean f4213ee = false;

    /* renamed from: k */
    public GlobalApplication f4214k;

    /* renamed from: l */
    public C1246d f4215l;

    /* renamed from: n */
    public C1218b f4216n = C1218b.SPP;

    /* renamed from: o */
    ArrayList<BluetoothDevice> f4217o = new ArrayList<>();

    /* renamed from: p */
    BluetoothManager f4218p;

    /* renamed from: q */
    BluetoothA2dp f4219q;

    /* renamed from: r */
    AudioManager f4220r;

    /* renamed from: s */
    boolean f4221s = false;

    /* renamed from: t */
    boolean f4222t = false;

    /* renamed from: u */
    boolean f4223u = false;

    /* renamed from: v */
    boolean f4224v = false;

    /* renamed from: w */
    boolean f4225w = false;

    /* renamed from: x */
    boolean f4226x = false;

    /* renamed from: y */
    BluetoothDevice f4227y = null;

    /* renamed from: z */
    boolean f4228z = false;

    /* renamed from: com.minirig.android.MainActivity$b */
    public enum C1218b {
        BLE,
        SPP
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4221s = true;
        this.f4214k = (GlobalApplication) getApplicationContext();
        this.f4214k.mo5229a(f3974m, "onCreate() ");
        this.f4215l = new C1246d(this.f4214k, this);
        this.f4218p = (BluetoothManager) getSystemService("bluetooth");
        this.f4220r = (AudioManager) getSystemService("audio");
        this.f3975A = new Handler(getApplicationContext().getMainLooper());
        this.f3976B = new Handler(getApplicationContext().getMainLooper());
        this.f3979E = new Runnable() {
            public void run() {
                MainActivity.this.f4073bU = false;
            }
        };
        if (!getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            this.f4214k.mo5229a(f3974m, "Device does not support bluetooth low energy");
            mo5246b("BLE not supported", "Your device does not support bluetooth low energy");
        }
        m5720U();
        setContentView((int) R.layout.activity_main);
        m5724W();
        if (!this.f4061bI) {
            m5892bo();
        }
        this.f4180dX = BluetoothAdapter.getDefaultAdapter();
        if (!this.f4180dX.isEnabled()) {
            m5901bx();
        }
        this.f4138ch = new C1258c(this);
        m5824ai();
        m5895br();
        m5870bB();
        m5814ad();
        m5812ac();
        m5847at();
        m5857ay();
        m5891bn();
        setView(this.f3996V);
        if (!mo5235D()) {
            mo5236E();
        }
        if (mo5235D() && this.f4180dX.isEnabled()) {
            m5871bC();
        }
    }

    public void onPause() {
        super.onPause();
        this.f4221s = false;
        m5710P();
        this.f3989O = null;
        this.f4214k.mo5229a(f3974m, "onPause()");
        m5701L();
        if (this.f4045as) {
            this.f4214k.mo5229a(f3974m, "Don't do anything on pause if broadcast scanning because probably pairing");
        } else {
            m5700K();
        }
    }

    /* renamed from: K */
    private void m5700K() {
        this.f4067bO = this.f4065bM;
        m5903bz();
        setView(this.f4067bO);
        this.f4138ch.mo5559a();
        this.f4180dX.closeProfileProxy(2, this.f4219q);
        try {
            unregisterReceiver(this.f3990P);
        } catch (IllegalArgumentException e) {
            GlobalApplication globalApplication = this.f4214k;
            String str = f3974m;
            globalApplication.mo5229a(str, "Failed to unregister receiver 'bluetoothTurnedOnOff' excpetion: " + e.getMessage());
        }
        this.f3984J.removeCallbacks(this.f3986L);
    }

    public void onResume() {
        super.onResume();
        this.f4221s = true;
        this.f4214k.mo5229a(f3974m, "- - - - - onResume() - - - - ");
        if (this.f4144cn != null) {
            runOnUiThread(new Runnable() {
                public void run() {
                    MainActivity.this.f4144cn.dismiss();
                }
            });
        }
        if (this.f4138ch == null) {
            this.f4138ch = new C1258c(this);
        }
        this.f4141ck = new Date();
        m5712Q();
        m5718T();
        if (this.f4222t) {
            if (!(this.f4227y == null || this.f4216n != C1218b.SPP || this.f4065bM == this.f4136cf)) {
                m5905c(this.f4227y);
            }
            if (this.f4065bM == this.f4136cf) {
                this.f4225w = false;
                this.f4226x = false;
                this.f4138ch.mo5559a();
                m5876bH();
                if (mo5235D() && this.f4180dX.isEnabled()) {
                    m5871bC();
                }
            }
        }
        m5704M();
        this.f4222t = true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        Runnable runnable;
        super.onDestroy();
        this.f4221s = false;
        this.f4214k.mo5229a(f3974m, "onDestroy()");
        m5903bz();
        this.f4138ch.mo5559a();
        m5876bH();
        this.f3975A = null;
        this.f4180dX.closeProfileProxy(2, this.f4219q);
        try {
            unregisterReceiver(this.f4034ah);
        } catch (IllegalArgumentException e) {
            GlobalApplication globalApplication = this.f4214k;
            String str = f3974m;
            globalApplication.mo5229a(str, "Failed to unregister Audio listener: " + e.getMessage());
        }
        try {
            unregisterReceiver(this.f3990P);
        } catch (IllegalArgumentException e2) {
            GlobalApplication globalApplication2 = this.f4214k;
            String str2 = f3974m;
            globalApplication2.mo5229a(str2, "Failed to unregister receiver 'bluetoothTurnedOnOff' excpetion: " + e2.getMessage());
        }
        Handler handler = this.f3984J;
        if (handler != null && (runnable = this.f3986L) != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public void onUserInteraction() {
        super.onUserInteraction();
        this.f4141ck = new Date();
        if (this.f4143cm) {
            m5708O();
        }
    }

    /* renamed from: L */
    private void m5701L() {
        if (mo5284r() && !this.f4162dF.equals("")) {
            if (m5868b(this.f4085bg)) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4724ak++;
                }
            } else if (m5868b(this.f4087bi)) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4725al++;
                }
            } else if (!m5868b(this.f4089bk)) {
                String[] split = this.f4162dF.substring(2).split(" ");
                if (split.length < 5) {
                    return;
                }
                if (!split[0].equals("50") || !split[1].equals("50") || !split[2].equals("50") || !split[3].equals("50") || !split[4].equals("50")) {
                    if (this.f4214k.f3964j.f4685f != null) {
                        this.f4214k.f3964j.f4685f.f4719af += Integer.parseInt(split[0]);
                    }
                    if (this.f4214k.f3964j.f4685f != null) {
                        this.f4214k.f3964j.f4685f.f4720ag += Integer.parseInt(split[1]);
                    }
                    if (this.f4214k.f3964j.f4685f != null) {
                        this.f4214k.f3964j.f4685f.f4721ah += Integer.parseInt(split[2]);
                    }
                    if (this.f4214k.f3964j.f4685f != null) {
                        this.f4214k.f3964j.f4685f.f4722ai += Integer.parseInt(split[3]);
                    }
                    if (this.f4214k.f3964j.f4685f != null) {
                        this.f4214k.f3964j.f4685f.f4723aj += Integer.parseInt(split[4]);
                    }
                    if (this.f4214k.f3964j.f4685f != null) {
                        this.f4214k.f3964j.f4685f.f4718ae++;
                    }
                } else if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4717ad++;
                }
            } else if (this.f4214k.f3964j.f4685f != null) {
                this.f4214k.f3964j.f4685f.f4726am++;
            }
        }
    }

    /* renamed from: M */
    private void m5704M() {
        this.f3984J = new Handler();
        this.f3987M = new String[]{"x", "q p 00 50", "B"};
        this.f3984J.postDelayed(new Runnable() {
            public void run() {
                if (MainActivity.this.f4214k.f3966l != null && MainActivity.this.f4177dU) {
                    MainActivity.this.m5876bH();
                }
                if (((int) ((new Date().getTime() - MainActivity.this.f4141ck.getTime()) / 1000)) <= 45) {
                    MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "RoutinelyRunnable get decvice status check...");
                    MainActivity mainActivity = MainActivity.this;
                    String str = mainActivity.f3987M[MainActivity.this.f3988N];
                    mainActivity.sendCommand(str, "ROUTINELY_" + MainActivity.this.f3987M[MainActivity.this.f3988N]);
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.f3988N = mainActivity2.f3988N + 1;
                    if (MainActivity.this.f3988N == MainActivity.this.f3987M.length) {
                        MainActivity.this.f3988N = 0;
                    }
                } else if (MainActivity.this.f4142cl == null && MainActivity.this.f4214k.f3966l != null) {
                    MainActivity.this.m5706N();
                }
                MainActivity mainActivity3 = MainActivity.this;
                mainActivity3.f3986L = this;
                mainActivity3.f3984J.postDelayed(MainActivity.this.f3986L, (long) MainActivity.this.f3985K);
            }
        }, (long) this.f3985K);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m5706N() {
        this.f4143cm = true;
        this.f4142cl = this.f4065bM;
        if (!isFinishing() && !isDestroyed()) {
            runOnUiThread(new Runnable() {
                public void run() {
                    MainActivity mainActivity = MainActivity.this;
                    AlertDialog unused = mainActivity.f4144cn = new AlertDialog.Builder(mainActivity).setOnDismissListener(new DialogInterface.OnDismissListener() {
                        public void onDismiss(DialogInterface dialogInterface) {
                            MainActivity.this.m5708O();
                        }
                    }).setCancelable(true).show();
                }
            });
        }
        m5903bz();
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m5708O() {
        this.f4143cm = false;
        this.f4144cn = null;
        if (m5715S() == null || m5714R().equals("")) {
            setView(this.f4136cf);
            return;
        }
        this.f4214k.mo5229a(f3974m, "Found connected device for SPP reconnect for inactivity wake");
        this.f4141ck = new Date();
        m5905c(m5715S());
    }

    /* renamed from: P */
    private void m5710P() {
        if (this.f3989O == null) {
            this.f3989O = new Date();
            return;
        }
        int time = (int) ((new Date().getTime() - this.f3989O.getTime()) / 1000);
        this.f3989O = new Date();
        if (this.f4214k.f3964j.f4685f != null) {
            if (this.f4214k.minirigf3.minirigAudioModef4463c.equals(minirigStatusClass.minirigModeEnum.MONO)) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4705S += time;
                }
            } else if (this.f4214k.minirigf3.minirigAudioModef4463c.equals(minirigStatusClass.minirigModeEnum.MONO_MIC)) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4699M += time;
                }
            } else if (this.f4214k.minirigf3.minirigAudioModef4463c.equals(minirigStatusClass.minirigModeEnum.MONO_SUB)) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4700N += time;
                }
            } else if (this.f4214k.minirigf3.minirigAudioModef4463c.equals(minirigStatusClass.minirigModeEnum.STEREO_AUX)) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4701O += time;
                }
            } else if (this.f4214k.minirigf3.minirigAudioModef4463c.equals(minirigStatusClass.minirigModeEnum.STEREO_ONE_SUB)) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4702P += time;
                }
            } else if (this.f4214k.minirigf3.minirigAudioModef4463c.equals(minirigStatusClass.minirigModeEnum.STEREO_TWO_SUBS)) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4703Q += time;
                }
            } else if (this.f4214k.minirigf3.minirigAudioModef4463c.equals(minirigStatusClass.minirigModeEnum.MONO_LINK) && this.f4214k.f3964j.f4685f != null) {
                this.f4214k.f3964j.f4685f.f4704R += time;
            }
        }
        if (this.f4065bM != null && this.f4214k.f3964j.f4685f != null) {
            View view = this.f4065bM;
            if (view == this.f4028ab) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4730e += time;
                }
            } else if (view == this.f4079ba) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4731f += time;
                }
            } else if (view == this.f4090bl) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4732g += time;
                }
            } else if (view == this.f4037ak) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4733h += time;
                }
            } else if (view == this.f4091bm) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4734i += time;
                }
            } else if (view == this.f4103by) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4735j += time;
                }
            } else if (view == this.f4104bz) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4737l += time;
                }
            } else if (view == this.f4046at || view == this.f4050ax || view == this.f4001aA || view == this.f4002aB) {
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4738m += time;
                }
            } else if ((view == this.f4010aJ || view == this.f4018aR) && this.f4214k.f3964j.f4685f != null) {
                this.f4214k.f3964j.f4685f.f4739n += time;
            }
            this.f4214k.f3964j.f4684e.mo5588j().mo5595b(this.f4214k.f3964j.f4685f);
        }
    }

    /* renamed from: Q */
    private void m5712Q() {
        this.f4180dX.closeProfileProxy(2, this.f4219q);
        this.f4180dX.getProfileProxy(getApplicationContext(), this.f4145co, 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m5913d(String str) {
        BluetoothA2dp bluetoothA2dp = this.f4219q;
        if (bluetoothA2dp == null) {
            return false;
        }
        List<BluetoothDevice> connectedDevices = bluetoothA2dp.getConnectedDevices();
        if (connectedDevices.size() <= 0) {
            return false;
        }
        for (BluetoothDevice address : connectedDevices) {
            if (str.equals(address.getAddress().trim())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public String m5714R() {
        BluetoothA2dp bluetoothA2dp = this.f4219q;
        if (bluetoothA2dp == null) {
            return "";
        }
        List<BluetoothDevice> connectedDevices = bluetoothA2dp.getConnectedDevices();
        if (connectedDevices.size() == 1) {
            Iterator<BluetoothDevice> it = connectedDevices.iterator();
            if (it.hasNext()) {
                return it.next().getAddress().trim();
            }
            return "";
        } else if (connectedDevices.size() <= 1) {
            return "";
        } else {
            int i = 0;
            String str = "";
            for (BluetoothDevice next : connectedDevices) {
                if (C1230e.m6014a(next.getAddress().trim())) {
                    str = next.getAddress().trim();
                    i++;
                }
            }
            return i == 1 ? str : "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public BluetoothDevice m5715S() {
        BluetoothA2dp bluetoothA2dp = this.f4219q;
        if (bluetoothA2dp != null) {
            List<BluetoothDevice> connectedDevices = bluetoothA2dp.getConnectedDevices();
            if (connectedDevices.size() == 1) {
                for (BluetoothDevice next : connectedDevices) {
                    if (C1230e.m6014a(next.getAddress().trim())) {
                        return next;
                    }
                }
            } else if (connectedDevices.size() > 1) {
                int i = 0;
                BluetoothDevice bluetoothDevice = null;
                for (BluetoothDevice next2 : connectedDevices) {
                    if (C1230e.m6014a(next2.getAddress().trim())) {
                        i++;
                        bluetoothDevice = next2;
                    }
                }
                if (i == 1) {
                    return bluetoothDevice;
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: T */
    private void m5718T() {
        this.f4214k.mo5229a(f3974m, "setupBluetoothConnectionReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
        registerReceiver(this.f3990P, intentFilter);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public BluetoothDevice m5914e(String str) {
        Set<BluetoothDevice> bondedDevices = this.f4180dX.getBondedDevices();
        if (bondedDevices.size() <= 0) {
            return null;
        }
        for (BluetoothDevice next : bondedDevices) {
            Log.d("Found paired device: ", next.getName() + " " + next.getAddress());
            if (next.getAddress().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: U */
    private void m5720U() {
        this.f4214k.f3963i.mo5552a("https://settings.minirigs.co.uk/GET_LATEST_UPDATES", C1250e.C1256a.GET_LATEST_VERSIONS);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m5722V() {
        if (!this.f4223u) {
            this.f4223u = true;
            runOnUiThread(new Runnable() {
                public void run() {
                    new AlertDialog.Builder(MainActivity.this).setTitle("Device update available").setMessage("There is an update available for your speaker. Update now to avoid any issues and enable the latest features.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.minirig.minirigupdater&hl=en_GB")));
                        }
                    }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).setIcon(17301543).show();
                }
            });
        }
    }

    /* renamed from: W */
    private void m5724W() {
        m5728Y();
        this.f4068bP = (LinearLayout) findViewById(R.id.media_frame);
        this.f3991Q = findViewById(R.id.battery_bar);
        this.f3994T = (TextView) findViewById(R.id.batteryText);
        this.f3993S = (Button) findViewById(R.id.batteryChargeOut);
        this.f3991Q.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Tapped battery");
                MainActivity.this.m5726X();
            }
        });
        this.f4147cq = new AlphaAnimation(1.0f, 0.0f);
        this.f4147cq.setDuration(2000);
        this.f4147cq.setInterpolator(new LinearInterpolator());
        this.f4147cq.setRepeatCount(-1);
        this.f4147cq.setRepeatMode(1);
        this.f4148cr = new AlphaAnimation(0.0f, 1.0f);
        this.f4148cr.setDuration(2000);
        this.f4148cr.setInterpolator(new LinearInterpolator());
        this.f4148cr.setRepeatCount(-1);
        this.f4148cr.setRepeatMode(1);
        this.f3992R = findViewById(R.id.media_info);
        this.f3992R.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (MainActivity.this.f4151cu.getText().toString().equals("Tap for the latest Minirig Mixtapes")) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.setView(mainActivity.f4100bv);
                } else if (MainActivity.this.f4214k.f3970p > -1) {
                    try {
                        if (MainActivity.this.f4214k.f3968n.getJSONObject(MainActivity.this.f4214k.f3970p).getString("image").equalsIgnoreCase("null") || MainActivity.this.f4214k.f3968n.getJSONObject(MainActivity.this.f4214k.f3970p).getString("image").equalsIgnoreCase("") || !MainActivity.this.f4214k.f3969o.containsKey(Integer.toString(MainActivity.this.f4214k.f3970p))) {
                            if (!MainActivity.this.f4214k.f3968n.getJSONObject(MainActivity.this.f4214k.f3970p).getString("description").equals("")) {
                                if (!MainActivity.this.f4214k.f3968n.getJSONObject(MainActivity.this.f4214k.f3970p).getString("description").equals("null")) {
                                    C1250e eVar = MainActivity.this.f4214k.f3963i;
                                    eVar.mo5552a("https://dreambaked.com/minirig_data_collection/controller/API.php?class=Broadcasts&function=saveClick&broadcastID=" + MainActivity.this.f4214k.f3968n.getJSONObject(MainActivity.this.f4214k.f3970p).getInt("broadcastID"), C1250e.C1256a.SAVE_BROADCAST_CLICK);
                                    MainActivity.this.mo5271d(MainActivity.this.f4214k.f3970p);
                                    return;
                                }
                            }
                            C1250e eVar2 = MainActivity.this.f4214k.f3963i;
                            eVar2.mo5552a("https://dreambaked.com/minirig_data_collection/controller/API.php?class=Broadcasts&function=saveClick&broadcastID=" + MainActivity.this.f4214k.f3968n.getJSONObject(MainActivity.this.f4214k.f3970p).getInt("broadcastID"), C1250e.C1256a.SAVE_BROADCAST_CLICK);
                            MainActivity.this.mo5249c(MainActivity.this.f4214k.f3970p);
                            return;
                        }
                        C1250e eVar3 = MainActivity.this.f4214k.f3963i;
                        eVar3.mo5552a("https://dreambaked.com/minirig_data_collection/controller/API.php?class=Broadcasts&function=saveClick&broadcastID=" + MainActivity.this.f4214k.f3968n.getJSONObject(MainActivity.this.f4214k.f3970p).getInt("broadcastID"), C1250e.C1256a.SAVE_BROADCAST_CLICK);
                        MainActivity.this.m5916e(MainActivity.this.f4214k.f3970p);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m5726X() {
        this.f4146cp++;
        if (this.f4146cp == 16) {
            this.f4214k.f3956b = true;
            runOnUiThread(new Runnable() {
                public void run() {
                    MainActivity.this.f4150ct.setText("Debug mode");
                    Toast.makeText(MainActivity.this, "Debug mode activated", 1).show();
                    MainActivity.this.m5757a("Debug screen", "Open debugging screen.", true);
                    MainActivity.this.m5890bm();
                }
            });
        }
    }

    /* renamed from: Y */
    private void m5728Y() {
        this.f4214k.f3963i.mo5552a("https://dreambaked.com/minirig_data_collection/controller/API.php?class=Broadcasts&function=getBroadcastsAPI", C1250e.C1256a.GET_BROADCASTS);
    }

    /* renamed from: k */
    public void mo5272k() {
        try {
            if (this.f4214k.f3968n != null) {
                this.f4151cu.setText(Html.fromHtml(this.f4214k.f3968n.getJSONObject(0).getString("title")));
                this.f4214k.f3970p = 0;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: l */
    public void mo5273l() {
        if (this.f4214k.f3970p > -1) {
            try {
                String str = "broadcast_auto_opens_" + this.f4214k.f3968n.getJSONObject(this.f4214k.f3970p).getString("broadcastID");
                int i = this.f4214k.f3957c.getInt(str, 0);
                if (i < 1 && this.f4214k.f3968n.getJSONObject(this.f4214k.f3970p).getString("auto_open").equalsIgnoreCase("1")) {
                    this.f4214k.f3957c.edit().putInt(str, i + 1).apply();
                    if (!this.f4214k.f3968n.getJSONObject(this.f4214k.f3970p).getString("image").equalsIgnoreCase("null") && !this.f4214k.f3968n.getJSONObject(this.f4214k.f3970p).getString("image").equalsIgnoreCase("") && this.f4214k.f3969o.containsKey(Integer.toString(this.f4214k.f3970p))) {
                        m5916e(this.f4214k.f3970p);
                    } else if (this.f4214k.f3968n.getJSONObject(this.f4214k.f3970p).getString("description").equals("")) {
                    } else {
                        if (!this.f4214k.f3968n.getJSONObject(this.f4214k.f3970p).getString("description").equals("null")) {
                            mo5271d(this.f4214k.f3970p);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void mo5249c(int i) {
        try {
            if (!this.f4214k.f3968n.getJSONObject(i).getString("hyperlink").equals("")) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f4214k.f3968n.getJSONObject(i).getString("hyperlink")));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    mo5246b("Unable to open", "No application found on your device to open this link.");
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m5916e(final int i) {
        if (this.f3995U == null) {
            this.f3995U = new Dialog(this);
            this.f3995U.setContentView(R.layout.broadcast_dialog);
            final LinearLayout linearLayout = (LinearLayout) this.f3995U.findViewById(R.id.broadcastImage);
            final C1066m mVar = this.f4214k.f3969o.get(Integer.toString(i));
            linearLayout.addView(mVar);
            linearLayout.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    MainActivity.this.f3995U.dismiss();
                    try {
                        if (!MainActivity.this.f4214k.f3968n.getJSONObject(i).getString("hyperlink").equals("")) {
                            MainActivity.this.mo5249c(i);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
            ((ImageButton) this.f3995U.findViewById(R.id.btnClose)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    MainActivity.this.f3995U.dismiss();
                }
            });
            this.f3995U.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.f3995U.show();
            this.f3995U.setOnDismissListener(new DialogInterface.OnDismissListener() {
                public void onDismiss(DialogInterface dialogInterface) {
                    linearLayout.removeView(mVar);
                    MainActivity.this.f3995U = null;
                }
            });
        }
    }

    /* renamed from: d */
    public void mo5271d(final int i) {
        try {
            if (this.f4214k.f3968n.getJSONObject(i).getString("hyperlink").equals("")) {
                mo5246b("Notice", this.f4214k.f3968n.getJSONObject(i).getString("description"));
                return;
            }
            AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setPositiveButton("Go", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    MainActivity.this.mo5249c(i);
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            negativeButton.setTitle("Feed");
            negativeButton.setIcon(17301659);
            negativeButton.setMessage(this.f4214k.f3968n.getJSONObject(i).getString("description"));
            negativeButton.show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: Z */
    private void m5730Z() {
        if (this.f3992R.getMeasuredHeight() > 140) {
            runOnUiThread(new Runnable() {
                public void run() {
                    MainActivity.this.f4151cu.setTextSize(22.0f);
                }
            });
        }
    }

    /* renamed from: f */
    private void m5921f(final int i) {
        runOnUiThread(new Runnable() {
            public void run() {
                String str;
                String str2 = "";
                if (MainActivity.this.f4214k.minirigf3.powerStatef4468h == minirigStatusClass.powerStateEnum.CHARGING) {
                    str2 = "ON CHARGE - ";
                }
                if (i < 20) {
                    str = str2 + "LOW!";
                } else {
                    str = str2 + Integer.toString(i) + "%";
                }
                MainActivity.this.f3994T.setText(str);
                if (MainActivity.this.f3994T.getVisibility() != 0) {
                    MainActivity.this.f3994T.setVisibility(0);
                }
            }
        });
    }

    /* renamed from: aa */
    private void m5809aa() {
        runOnUiThread(new Runnable() {
            public void run() {
                if (MainActivity.this.f4214k.minirigf3.ledColorf4469i == minirigStatusClass.anotherledColorEnum.GREEN) {
                    MainActivity.this.f3994T.setBackgroundResource(R.drawable.battery_very_high);
                    MainActivity.this.f3993S.setBackgroundResource(R.drawable.battery_very_high);
                    MainActivity.this.f3994T.setTextColor(-7829368);
                    MainActivity.this.f3993S.setTextColor(-7829368);
                } else if (MainActivity.this.f4214k.minirigf3.ledColorf4469i == minirigStatusClass.anotherledColorEnum.CYAN) {
                    MainActivity.this.f3994T.setBackgroundResource(R.drawable.battery_high);
                    MainActivity.this.f3993S.setBackgroundResource(R.drawable.battery_high);
                    MainActivity.this.f3994T.setTextColor(-7829368);
                    MainActivity.this.f3993S.setTextColor(-7829368);
                } else if (MainActivity.this.f4214k.minirigf3.ledColorf4469i == minirigStatusClass.anotherledColorEnum.BLUE) {
                    MainActivity.this.f3994T.setBackgroundResource(R.drawable.battery_medium);
                    MainActivity.this.f3993S.setBackgroundResource(R.drawable.battery_medium);
                    MainActivity.this.f3994T.setTextColor(-1);
                    MainActivity.this.f3993S.setTextColor(-1);
                } else if (MainActivity.this.f4214k.minirigf3.ledColorf4469i == minirigStatusClass.anotherledColorEnum.PURPLE) {
                    MainActivity.this.f3994T.setBackgroundResource(R.drawable.battery_low);
                    MainActivity.this.f3993S.setBackgroundResource(R.drawable.battery_low);
                    MainActivity.this.f3994T.setTextColor(-1);
                    MainActivity.this.f3993S.setTextColor(-1);
                } else if (MainActivity.this.f4214k.minirigf3.ledColorf4469i == minirigStatusClass.anotherledColorEnum.RED) {
                    MainActivity.this.f3994T.setBackgroundResource(R.drawable.battery_very_low);
                    MainActivity.this.f3993S.setBackgroundResource(R.drawable.battery_very_low);
                    MainActivity.this.f3994T.setTextColor(-1);
                    MainActivity.this.f3993S.setTextColor(-1);
                }
            }
        });
    }

    /* renamed from: ab */
    private void m5811ab() {
        runOnUiThread(new Runnable() {
            public void run() {
                if (MainActivity.this.f4214k.minirigf3.powerStatef4468h == minirigStatusClass.powerStateEnum.CHARGING) {
                    MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "      CHARGING");
                    MainActivity.this.f3994T.startAnimation(MainActivity.this.f4148cr);
                    MainActivity.this.f3993S.clearAnimation();
                    MainActivity.this.f3993S.setText("Power out");
                } else if (MainActivity.this.f4214k.minirigf3.powerStatef4468h == minirigStatusClass.powerStateEnum.POWER_OUT) {
                    MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "      POWER_OUT");
                    MainActivity.this.f3994T.clearAnimation();
                    MainActivity.this.f3993S.startAnimation(MainActivity.this.f4147cq);
                    MainActivity.this.f3993S.setText("Charging device");
                } else {
                    MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "      NO CHARGE STATE");
                    MainActivity.this.f3994T.clearAnimation();
                    MainActivity.this.f3993S.clearAnimation();
                    MainActivity.this.f3993S.setText("Power out");
                }
            }
        });
    }

    public void clickedChargeOut(View view) {
        mo5295w();
    }

    /* renamed from: ac */
    private void m5812ac() {
        this.f3996V = findViewById(R.id.booting_layout);
        this.f3997W = (ImageView) findViewById(R.id.booting);
        this.f3997W.setImageResource(R.drawable.booting_animation);
        this.f3998X = (AnimationDrawable) this.f3997W.getDrawable();
        this.f3999Y = (TextView) findViewById(R.id.loadingText);
        this.f4000Z = (Button) findViewById(R.id.connectBluetoothButton);
        this.f4027aa = (Button) findViewById(R.id.demoMode2);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m5923f(final String str) {
        runOnUiThread(new Runnable() {
            public void run() {
                MainActivity.this.f3999Y.setText(str);
            }
        });
    }

    /* renamed from: ad */
    private void m5814ad() {
        this.f4028ab = findViewById(R.id.grid_controls);
        this.f4029ac = findViewById(R.id.persistent_frame);
        m5816ae();
        this.f4151cu = (TextView) findViewById(R.id.trackInfo);
        this.f4149cs = findViewById(R.id.dummyFocus);
        this.f4152cv = (ImageButton) findViewById(R.id.playPauseButton);
        this.f4153cw = (ImageButton) findViewById(R.id.nextTrackButton);
        this.f4154cx = (ImageButton) findViewById(R.id.previousTrackButton);
        this.f4155cy = (ImageButton) findViewById(R.id.openPlayersButton);
        this.f4156cz = (ImageButton) findViewById(R.id.gainButton);
        this.f4105cA = (ImageButton) findViewById(R.id.muteButton);
        this.f4111cG = (ImageButton) findViewById(R.id.audioConfigButton);
        this.f4107cC = (ImageButton) findViewById(R.id.switchDeviceButton);
        this.f4108cD = (ImageButton) findViewById(R.id.eqButton);
        this.f4106cB = (ImageButton) findViewById(R.id.twsButton);
        this.f4109cE = (ImageButton) findViewById(R.id.powerButton);
        this.f4110cF = (ImageButton) findViewById(R.id.settingsButton);
        this.f4112cH = (ImageButton) findViewById(R.id.twsButton);
        this.f4105cA.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    MainActivity.this.f4032af = Long.valueOf(System.currentTimeMillis()).longValue();
                } else if (motionEvent.getAction() == 1) {
                    if (Long.valueOf(System.currentTimeMillis()).longValue() - MainActivity.this.f4032af > 1600) {
                        MainActivity.this.f4105cA.setImageResource(R.drawable.headphones);
                        MainActivity mainActivity = MainActivity.this;
                        mainActivity.f4033ag = true;
                        if (mainActivity.mo5284r()) {
                            MainActivity mainActivity2 = MainActivity.this;
                            mainActivity2.sendCommand(mainActivity2.f4214k.f3958d.mo5467a("08", 99), MainActivity.this.f4214k.f3958d.f4394a);
                            MainActivity mainActivity3 = MainActivity.this;
                            mainActivity3.sendCommand(mainActivity3.f4214k.f3958d.mo5467a("09", Integer.parseInt(MainActivity.this.f4119cO)), MainActivity.this.f4214k.f3958d.f4394a);
                        }
                        if (MainActivity.this.f4214k.f3966l != null && MainActivity.this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG2) {
                            MainActivity.this.sendCommand("Z", "MUTE_1");
                        }
                        MainActivity.this.sendCommand("F", "MUTE_2");
                        boolean unused = MainActivity.this.f4117cM = true;
                        if (MainActivity.this.f4214k.f3964j.f4685f != null) {
                            MainActivity.this.f4214k.f3964j.f4685f.f4697K++;
                        }
                    } else {
                        if (MainActivity.this.f4033ag) {
                            if (MainActivity.this.mo5284r()) {
                                if (MainActivity.this.f4214k.f3966l != null && MainActivity.this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG2) {
                                    MainActivity.this.sendCommand("Y", "UNMUTE_1");
                                }
                                MainActivity.this.sendCommand("A", "UNMUTE_2");
                            }
                            MainActivity.this.m5833am();
                            if (!MainActivity.this.f4117cM) {
                                MainActivity.this.f4105cA.setImageResource(R.drawable.unmute_button);
                            } else {
                                MainActivity.this.f4105cA.setImageResource(R.drawable.mute_button);
                            }
                        } else {
                            MainActivity.this.mo5274m();
                        }
                        MainActivity.this.f4033ag = false;
                    }
                }
                return false;
            }
        });
    }

    /* renamed from: ae */
    private void m5816ae() {
        this.f4150ct = (EditText) findViewById(R.id.etDeviceName);
        this.f4150ct.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6 && i != 4) {
                    return true;
                }
                ((InputMethodManager) textView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                MainActivity.this.m5927g(textView.getText().toString());
                return true;
            }
        });
        findViewById(R.id.rootView).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (MainActivity.this.f4115cK) {
                    MainActivity.this.f4150ct.clearFocus();
                    boolean unused = MainActivity.this.f4115cK = false;
                }
                if (MainActivity.this.f4150ct.isFocused() && !MainActivity.this.f4115cK) {
                    boolean unused2 = MainActivity.this.f4115cK = true;
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m5927g(String str) {
        GlobalApplication globalApplication = this.f4214k;
        String str2 = f3974m;
        globalApplication.mo5229a(str2, "Set new name(" + str + ")");
        GlobalApplication globalApplication2 = this.f4214k;
        globalApplication2.f3972r = str;
        globalApplication2.f3971q = globalApplication2.f3966l.f4405g;
        GlobalApplication globalApplication3 = this.f4214k;
        String str3 = f3974m;
        globalApplication3.mo5229a(str3, "Set new name(" + this.f4214k.f3966l.f4405g + ")");
        sendCommand(this.f4214k.f3958d.mo5466a(str), this.f4214k.f3958d.f4394a);
        sendCommand(this.f4214k.f3958d.mo5469b(str), this.f4214k.f3958d.f4394a);
        sendCommand("N WRITE", "N WRITE".toString());
        mo5246b("Name changed", "The change will take effect after you restart your MINIRIG.");
        this.f4214k.f3966l.f4403e = str;
        runOnUiThread(new Runnable() {
            public void run() {
                MainActivity.this.f4150ct.setText(MainActivity.this.f4214k.f3966l.f4403e);
            }
        });
    }

    /* renamed from: af */
    private void m5818af() {
        if (this.f4065bM == this.f4028ab && !this.f4115cK) {
            runOnUiThread(new Runnable() {
                public void run() {
                    MainActivity.this.f4150ct.setText(MainActivity.this.f4214k.f3966l.f4403e);
                }
            });
        }
    }

    /* renamed from: ag */
    private void m5820ag() {
        runOnUiThread(new Runnable() {
            public void run() {
                MainActivity.this.f4155cy.setImageResource(R.drawable.open_players_button);
                MainActivity.this.f4111cG.setImageResource(R.drawable.audio_config_button);
            }
        });
    }

    /* renamed from: ah */
    private void m5823ah() {
        runOnUiThread(new Runnable() {
            public void run() {
                if (MainActivity.this.f4155cy != null) {
                    MainActivity.this.f4155cy.setImageResource(R.drawable.home_button);
                }
                if (MainActivity.this.f4111cG != null) {
                    MainActivity.this.f4111cG.setImageResource(R.drawable.playlists_button);
                }
            }
        });
    }

    /* renamed from: ai */
    private void m5824ai() {
        this.f4214k.mo5229a(f3974m, "setupTrackInfoListener()");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.android.music.metachanged");
        intentFilter.addAction("com.android.music.playstatechanged");
        intentFilter.addAction("com.android.music.playbackcomplete");
        intentFilter.addAction("com.android.music.queuechanged");
        intentFilter.addAction("com.htc.music.playstatechanged");
        intentFilter.addAction("com.htc.music.playbackcomplete");
        intentFilter.addAction("com.htc.music.metachanged");
        intentFilter.addAction("com.miui.player.playstatechanged");
        intentFilter.addAction("com.miui.player.playbackcomplete");
        intentFilter.addAction("com.miui.player.metachanged");
        intentFilter.addAction("com.real.IMP.playstatechanged");
        intentFilter.addAction("com.real.IMP.playbackcomplete");
        intentFilter.addAction("com.real.IMP.metachanged");
        intentFilter.addAction("com.sonyericsson.music.playbackcontrol.ACTION_TRACK_STARTED");
        intentFilter.addAction("com.sonyericsson.music.playbackcontrol.ACTION_PAUSED");
        intentFilter.addAction("com.sonyericsson.music.TRACK_COMPLETED");
        intentFilter.addAction("com.sonyericsson.music.metachanged");
        intentFilter.addAction("com.sonyericsson.music.playbackcomplete");
        intentFilter.addAction("com.sonyericsson.music.playstatechanged");
        intentFilter.addAction("com.rdio.android.metachanged");
        intentFilter.addAction("com.rdio.android.playstatechanged");
        intentFilter.addAction("com.samsung.sec.android.MusicPlayer.playstatechanged");
        intentFilter.addAction("com.samsung.sec.android.MusicPlayer.playbackcomplete");
        intentFilter.addAction("com.samsung.sec.android.MusicPlayer.metachanged");
        intentFilter.addAction("com.sec.android.app.music.playstatechanged");
        intentFilter.addAction("com.sec.android.app.music.playbackcomplete");
        intentFilter.addAction("com.sec.android.app.music.metachanged");
        intentFilter.addAction("com.nullsoft.winamp.playstatechanged");
        intentFilter.addAction("com.nullsoft.winamp.metachanged");
        intentFilter.addAction("com.amazon.mp3.playstatechanged");
        intentFilter.addAction("com.amazon.mp3.metachanged");
        intentFilter.addAction("com.rhapsody.playstatechanged");
        intentFilter.addAction("com.maxmpz.audioplayer.playstatechanged");
        intentFilter.addAction("fm.last.android.metachanged");
        intentFilter.addAction("fm.last.android.playbackpaused");
        intentFilter.addAction("fm.last.android.playbackcomplete");
        intentFilter.addAction("com.adam.aslfms.notify.playstatechanged");
        intentFilter.addAction("net.jjc1138.android.scrobbler.action.MUSIC_STATUS");
        intentFilter.addAction("com.andrew.apollo.metachanged");
        intentFilter.addAction("com.real.IMP.metachanged");
        intentFilter.addAction("com.spotify.mobile.android.metadatachanged");
        intentFilter.addAction("com.Pdio.andPoid.metachanged");
        intentFilter.addAction("com.andPew.apollo.metachanged");
        registerReceiver(this.f4034ah, intentFilter);
    }

    public void togglePlaying(View view) {
        KeyEvent keyEvent;
        KeyEvent keyEvent2;
        this.f4036aj = true;
        if (this.f4214k.f3964j.f4685f != null) {
            this.f4214k.f3964j.f4685f.f4693G++;
        }
        runOnUiThread(new Runnable() {
            public void run() {
                if (MainActivity.this.f4035ai) {
                    MainActivity.this.f4152cv.setImageResource(R.drawable.play_button);
                    MainActivity.this.f4035ai = false;
                    return;
                }
                MainActivity.this.f4152cv.setImageResource(R.drawable.pause_button);
                MainActivity.this.f4035ai = true;
            }
        });
        if (this.f4220r.isMusicActive()) {
            keyEvent2 = new KeyEvent(0, 127);
            keyEvent = new KeyEvent(1, 127);
        } else {
            this.f4030ad = true;
            keyEvent2 = new KeyEvent(0, 126);
            keyEvent = new KeyEvent(1, 126);
        }
        mo5247b(keyEvent2);
        mo5247b(keyEvent);
    }

    public void nextTrack(View view) {
        KeyEvent keyEvent = new KeyEvent(0, 87);
        KeyEvent keyEvent2 = new KeyEvent(1, 87);
        mo5247b(keyEvent);
        mo5247b(keyEvent2);
        if (this.f4214k.f3964j.f4685f != null) {
            this.f4214k.f3964j.f4685f.f4692F++;
        }
    }

    public void previousTrack(View view) {
        KeyEvent keyEvent = new KeyEvent(0, 88);
        KeyEvent keyEvent2 = new KeyEvent(1, 88);
        mo5247b(keyEvent);
        mo5247b(keyEvent2);
        if (this.f4214k.f3964j.f4685f != null) {
            this.f4214k.f3964j.f4685f.f4691E++;
        }
    }

    public void openPlayersClicked(View view) {
        if (mo5284r()) {
            if (this.f4214k.f3964j.f4685f != null) {
                this.f4214k.f3964j.f4685f.f4716ac++;
            }
            setView(this.f4028ab);
            return;
        }
        setView(this.f4100bv);
        m5827aj();
        if (this.f4214k.f3964j.f4685f != null) {
            this.f4214k.f3964j.f4685f.f4694H++;
        }
    }

    /* renamed from: aj */
    private void m5827aj() {
        this.f4152cv.setEnabled(false);
        this.f4153cw.setEnabled(false);
        this.f4154cx.setEnabled(false);
        this.f4155cy.setEnabled(false);
        this.f4152cv.setAlpha(0.5f);
        this.f4153cw.setAlpha(0.5f);
        this.f4154cx.setAlpha(0.5f);
        this.f4155cy.setAlpha(0.5f);
    }

    /* renamed from: ak */
    private void m5829ak() {
        this.f4152cv.setEnabled(true);
        this.f4153cw.setEnabled(true);
        this.f4154cx.setEnabled(true);
        this.f4155cy.setEnabled(true);
        this.f4152cv.setAlpha(1.0f);
        this.f4153cw.setAlpha(1.0f);
        this.f4154cx.setAlpha(1.0f);
        this.f4155cy.setAlpha(1.0f);
    }

    public void backClicked(View view) {
        onBackPressed();
    }

    public void toggleGain(View view) {
        if (mo5284r()) {
            if (this.f4189dg > 9) {
                sendCommand("7", "HIGH_GAIN");
            } else {
                sendCommand("3", "LOW_GAIN");
            }
            sendCommand("q p 00 50", "GET_EQ");
        } else {
            if (this.f4214k.minirigf3.mo5507j() == 3) {
                sendCommand("7", "HIGH_GAIN");
            } else if (this.f4214k.minirigf3.mo5507j() == 7) {
                sendCommand("3", "LOW_GAIN");
            } else {
                Log.d(f3974m, "!-!  Could not change gain  !-! UNKNOWN GAIN: " + this.f4214k.minirigf3.mo5507j());
            }
            sendCommand("x", "GET_STATUS");
        }
        if (this.f4214k.f3964j.f4685f != null) {
            this.f4214k.f3964j.f4685f.f4698L++;
        }
        this.f4215l.mo5543a(getResources().getString(R.string.helpGainTitle), getResources().getString(R.string.helpGainBody));
    }

    /* renamed from: b */
    public boolean mo5247b(KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4220r.dispatchMediaKeyEvent(keyEvent);
            return true;
        }
        try {
            Object invoke = Class.forName("android.media.IAudioService$Stub").getDeclaredMethod("asInterface", new Class[]{IBinder.class}).invoke((Object) null, new Object[]{(IBinder) Class.forName("android.os.ServiceManager").getDeclaredMethod("checkService", new Class[]{String.class}).invoke((Object) null, new Object[]{"audio"})});
            Class.forName("android.media.IAudioService").getDeclaredMethod("dispatchMediaKeyEvent", new Class[]{KeyEvent.class}).invoke(invoke, new Object[]{keyEvent});
            return true;
        } catch (Exception e) {
            this.f4214k.mo5229a(f3974m, e.getLocalizedMessage());
            return false;
        }
    }

    /* renamed from: al */
    private void m5831al() {
        if (!mo5284r()) {
            if (this.f4214k.f3966l != null && this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG2) {
                sendCommand("Z", "MUTE_1");
            }
            sendCommand("F", "MUTE_2");
            this.f4117cM = true;
            sendCommand("x", "GET_STATUS");
            return;
        }
        sendCommand(this.f4214k.f3958d.mo5467a("08", 99), this.f4214k.f3958d.f4394a);
        sendCommand(this.f4214k.f3958d.mo5467a("09", 99), this.f4214k.f3958d.f4394a);
        this.f4117cM = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: am */
    public void m5833am() {
        if (!mo5284r()) {
            if (this.f4214k.f3966l != null && this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG2) {
                sendCommand("Y", "UNMUTE_1");
            }
            sendCommand("A", "UNMUTE_2");
            this.f4117cM = false;
            sendCommand("x", "GET_STATUS");
            return;
        }
        sendCommand(this.f4214k.f3958d.mo5467a("08", Integer.parseInt(this.f4118cN)), this.f4214k.f3958d.f4394a);
        sendCommand(this.f4214k.f3958d.mo5467a("09", Integer.parseInt(this.f4119cO)), this.f4214k.f3958d.f4394a);
        this.f4117cM = false;
    }

    /* renamed from: m */
    public void mo5274m() {
        if (!this.f4117cM) {
            m5831al();
        } else {
            m5833am();
        }
        runOnUiThread(new Runnable() {
            public void run() {
                if (!MainActivity.this.f4117cM) {
                    MainActivity.this.f4105cA.setImageResource(R.drawable.unmute_button);
                } else {
                    MainActivity.this.f4105cA.setImageResource(R.drawable.mute_button);
                }
            }
        });
        if (this.f4214k.f3964j.f4685f != null) {
            this.f4214k.f3964j.f4685f.f4696J++;
        }
        this.f4215l.mo5543a(getResources().getString(R.string.helpMuteTitle), getResources().getString(R.string.helpMuteBody));
    }

    public void clickedSwitchDevice(View view) {
        if (this.f4224v) {
            mo5246b("Demo mode", "This feature allows you to switch the audio stream if two phones are connected to one speaker.");
            return;
        }
        if (this.f4214k.f3964j.f4685f != null) {
            this.f4214k.f3964j.f4685f.f4741p++;
        }
        sendCommand("X", "SWITCH_DEVICE");
        this.f4215l.mo5543a(getResources().getString(R.string.helpABTitle), getResources().getString(R.string.helpABBody));
    }

    public void clickedTWS(View view) {
        if (this.f4224v) {
            setView(this.f4046at);
            return;
        }
        if (this.f4214k.f3966l != null && this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG3) {
            setView(this.f4046at);
        } else if (this.f4214k.minirigf3.twsConnectionStatef4466f == minirigStatusClass.twsConnectionStateEnum.CONNECTED_AS_SLAVE || this.f4214k.minirigf3.twsConnectionStatef4466f == minirigStatusClass.twsConnectionStateEnum.CONNECTED_AS_MASTER || this.f4214k.minirigf3.twsConnectionStatef4466f == minirigStatusClass.twsConnectionStateEnum.CONNECTED_UNKNOWN) {
            mo5281p();
        } else {
            this.f4031ae = true;
            this.f3984J.removeCallbacks(this.f3986L);
            m5704M();
            sendCommand("P", "TWS_PAIR");
            m5923f("Scanning TWS...");
            findViewById(R.id.cancelTWSButton).setVisibility(0);
            setView(this.f3996V);
        }
        this.f4215l.mo5543a(getResources().getString(R.string.helpLinkTitle), getResources().getString(R.string.helpLinkBody));
    }

    public void clickedAudioConfig(View view) {
        if (mo5284r() || this.f4224v) {
            if (this.f4214k.f3964j.f4685f != null) {
                this.f4214k.f3964j.f4685f.f4695I++;
            }
            setView(this.f4100bv);
            m5827aj();
            this.f4215l.mo5543a(getResources().getString(R.string.helpMixTitle), getResources().getString(R.string.helpMixBody));
            return;
        }
        setView(this.f4037ak);
    }

    public void clickedEq(View view) {
        if (this.f4224v) {
            setView(this.f4009aI);
        } else if (this.f4214k.f3966l == null) {
            setView(this.f4136cf);
        } else if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI2) {
            setView(this.f4079ba);
        } else if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG3) {
            if (mo5284r()) {
                this.f4215l.mo5543a(getResources().getString(R.string.helpEQTitle), getResources().getString(R.string.helpEQBody));
                setView(this.f4009aI);
                return;
            }
            setView(this.f4079ba);
        } else if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG2) {
            setView(this.f4090bl);
        } else if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG1) {
            mo5246b("Feature unavailable", getResources().getString(R.string.feature_unavailable));
        }
    }

    public void clickedPower(View view) {
        m5834an();
    }

    /* renamed from: an */
    private void m5834an() {
        new AlertDialog.Builder(this).setTitle("Turn device off").setMessage("Are you sure?").setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (MainActivity.this.f4214k.f3964j.f4685f != null) {
                    MainActivity.this.f4214k.f3964j.f4685f.f4740o++;
                }
                MainActivity.this.sendCommand("O", "POWER_TOGGLE");
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setIcon(17301543).show();
    }

    public void clickedSettings(View view) {
        setView(this.f4091bm);
        this.f4215l.mo5543a(getResources().getString(R.string.helpSettingsTitle), getResources().getString(R.string.helpSettingsBody));
    }

    public void clickedInfo(View view) {
        setView(this.f4103by);
        this.f4215l.mo5543a(getResources().getString(R.string.helpInfoTitle), getResources().getString(R.string.helpInfoBody));
    }

    /* renamed from: ao */
    private void m5837ao() {
        runOnUiThread(new Runnable() {
            public void run() {
                MainActivity.this.mo5275n();
                MainActivity.this.m5839ap();
                MainActivity.this.m5843ar();
                MainActivity.this.m5845as();
            }
        });
    }

    /* renamed from: n */
    public void mo5275n() {
        this.f4035ai = this.f4220r.isMusicActive();
        if (!this.f4036aj) {
            if (this.f4220r.isMusicActive()) {
                this.f4152cv.setImageResource(R.drawable.pause_button);
            } else {
                this.f4152cv.setImageResource(R.drawable.play_button);
            }
        }
        this.f4036aj = false;
        this.f4152cv.setBackgroundResource(R.drawable.button_media_selector);
    }

    /* access modifiers changed from: private */
    /* renamed from: ap */
    public void m5839ap() {
        if (mo5284r()) {
            if (this.f4189dg > 9) {
                this.f4156cz.setImageResource(R.drawable.low_gain_button);
            } else {
                this.f4156cz.setImageResource(R.drawable.high_gain_button);
            }
        } else if (this.f4214k.minirigf3.mo5507j() == 7) {
            this.f4156cz.setImageResource(R.drawable.high_gain_button);
        } else if (this.f4214k.minirigf3.mo5507j() == 3) {
            this.f4156cz.setImageResource(R.drawable.low_gain_button);
        } else {
            GlobalApplication globalApplication = this.f4214k;
            String str = f3974m;
            globalApplication.mo5229a(str, "!-!  Uncaught  !-! GAIN SET TO: " + this.f4214k.minirigf3.mo5507j());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aq */
    public void m5841aq() {
        if (mo5284r()) {
            if (!this.f4117cM) {
                this.f4105cA.setImageResource(R.drawable.unmute_button);
            } else {
                this.f4105cA.setImageResource(R.drawable.mute_button);
            }
        } else if (!this.f4214k.minirigf3.getHasAmplifierActive()) {
            this.f4105cA.setImageResource(R.drawable.mute_button);
        } else {
            this.f4105cA.setImageResource(R.drawable.unmute_button);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ar */
    public void m5843ar() {
        if (this.f4214k.minirigf3.twsConnectionStatef4466f == minirigStatusClass.twsConnectionStateEnum.CONNECTED_AS_SLAVE || this.f4214k.minirigf3.twsConnectionStatef4466f == minirigStatusClass.twsConnectionStateEnum.CONNECTED_AS_MASTER || this.f4214k.minirigf3.twsConnectionStatef4466f == minirigStatusClass.twsConnectionStateEnum.CONNECTED_UNKNOWN || this.f4214k.minirigf3.broadcastStatef4467g != minirigStatusClass.broadcastStateEnum.NO_BROADCAST) {
            this.f4106cB.setImageResource(R.drawable.tws_paired_button);
            this.f4106cB.setImageResource(R.drawable.tws_paired_button);
            return;
        }
        this.f4106cB.setImageResource(R.drawable.tws_button);
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m5845as() {
        if (this.f4214k.minirigf3.getChannelCode() == 1) {
            this.f4107cC.setImageResource(R.drawable.a_phone_button);
        } else {
            this.f4107cC.setImageResource(R.drawable.b_phone_button);
        }
    }

    /* renamed from: at */
    private void m5847at() {
        this.f4037ak = findViewById(R.id.audio_config_layout);
        this.f4038al = findViewById(R.id.audio_row_2);
        this.f4039am = (ImageButton) findViewById(R.id.routing1_0Button);
        this.f4040an = (ImageButton) findViewById(R.id.routing2_0Button);
        this.f4041ao = (ImageButton) findViewById(R.id.routing2_1Button);
        this.f4042ap = true;
    }

    /* renamed from: au */
    private void m5849au() {
        if (this.f4042ap) {
            runOnUiThread(new Runnable() {
                public void run() {
                    if (MainActivity.this.f4214k.minirigf3.isTwsConnected()) {
                        MainActivity.this.f4039am.setImageResource(R.drawable.stereo_with_one_sub);
                        MainActivity.this.f4041ao.setImageResource(R.drawable.mono_link_mode);
                        MainActivity.this.f4038al.setVisibility(0);
                    } else {
                        MainActivity.this.f4039am.setImageResource(R.drawable.config_stereo_aux);
                        MainActivity.this.f4041ao.setImageResource(R.drawable.config_mono_sub);
                        MainActivity.this.f4038al.setVisibility(8);
                    }
                    MainActivity.this.f4039am.setBackgroundResource(R.drawable.device_list_selector);
                    MainActivity.this.f4040an.setBackgroundResource(R.drawable.device_list_selector);
                    MainActivity.this.f4041ao.setBackgroundResource(R.drawable.device_list_selector);
                    if (!MainActivity.this.f4214k.minirigf3.isTwsConnected()) {
                        if (!MainActivity.this.f4214k.minirigf3.getHasJackInsertedTop() && !MainActivity.this.f4214k.minirigf3.getHasJackInsertedBottom()) {
                            return;
                        }
                        if (!MainActivity.this.f4214k.minirigf3.getHasLeftChannelActive() || !MainActivity.this.f4214k.minirigf3.getHasRightChannelActive()) {
                            MainActivity.this.f4039am.setBackgroundResource(R.drawable.bg_device_list_selected);
                        } else {
                            MainActivity.this.f4041ao.setBackgroundResource(R.drawable.bg_device_list_selected);
                        }
                    }
                }
            });
        }
    }

    public void clickedRouting(View view) {
        if (view.getTag().equals("stereoWithOneSub")) {
            m5850av();
        } else if (view.getTag().equals("stereoWithTwoSubs")) {
            m5852aw();
        } else if (view.getTag().equals("monoLinkMode")) {
            m5855ax();
        }
    }

    /* renamed from: av */
    private void m5850av() {
        if (!m5792aO()) {
            String str = "The Minirigs will play in stereo but with reduced volume to match the output of the single subwoofer.";
            if (!this.f4214k.minirigf3.isTwsConnected()) {
                str = "This will allow you to Bluetooth to one of your Minirigs and use a cable to the other whilst keeping them in stereo.";
            }
            new AlertDialog.Builder(this).setTitle("Change audio configuration?").setMessage(str).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    MainActivity.this.sendCommand("L", "STEREO_WITH_ONE_SUB");
                    MainActivity.this.sendCommand("x", "GET_STATUS");
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).setIcon(17301543).show();
        }
    }

    /* renamed from: aw */
    private void m5852aw() {
        if (!m5792aO()) {
            new AlertDialog.Builder(this).setTitle("Change audio configuration?").setMessage("The Minirigs will play in stereo at full volume. Works with two subwoofers or no subwoofer at all.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    MainActivity.this.sendCommand("R", "STEREO_WITH_TWO_SUBS");
                    MainActivity.this.sendCommand("x", "GET_STATUS");
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).setIcon(17301543).show();
        }
    }

    /* renamed from: ax */
    private void m5855ax() {
        String str = "The Minirigs will play in mono at full volume. Useful for playing music in different rooms and for large link ups.";
        if (!this.f4214k.minirigf3.isTwsConnected()) {
            str = "This will put your Minirig & subwoofer into mono.";
        }
        new AlertDialog.Builder(this).setTitle("Change audio configuration?").setMessage(str).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.sendCommand("M", "MONO_WITH_SUB");
                MainActivity.this.sendCommand("x", "GET_STATUS");
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setIcon(17301543).show();
    }

    /* renamed from: ay */
    private void m5857ay() {
        this.f4046at = findViewById(R.id.broadcast_config_layout);
        this.f4047au = findViewById(R.id.broadcast_sa);
        this.f4048av = findViewById(R.id.broadcast_ws);
        this.f4049aw = findViewById(R.id.broadcast_lu);
        this.f4050ax = findViewById(R.id.broadcast_linkup_layout);
        this.f4051ay = findViewById(R.id.broadcast_start);
        this.f4052az = findViewById(R.id.broadcast_join);
        this.f4001aA = findViewById(R.id.broadcast_linkup_start);
        this.f4002aB = findViewById(R.id.broadcast_linkup_join);
        this.f4003aC = findViewById(R.id.broadcast_lus_state);
        this.f4004aD = findViewById(R.id.broadcast_luj_state);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5746a(View view) {
        view.setBackgroundResource(R.drawable.bg_device_list_loading);
        this.f4005aE = (AnimationDrawable) view.getBackground();
        this.f4005aE.setOneShot(false);
        this.f4005aE.start();
    }

    public void clickedBroadcastOption(View view) {
        if (view.getTag() != null) {
            if (view.getTag().equals("broadcastStandAlone")) {
                if (this.f4214k.minirigf3.broadcastStatef4467g != minirigStatusClass.broadcastStateEnum.NO_BROADCAST) {
                    m5858az();
                } else if (this.f4214k.minirigf3.isTwsConnected() || this.f4214k.minirigf3.isTwsScanning()) {
                    sendCommand("J", "J");
                }
            } else if (view.getTag().equals("broadcastWirelessStereo")) {
                m5763aA();
            } else if (!view.getTag().equals("broadcastLinkUp")) {
            } else {
                if (this.f4214k.minirigf3.mo5502g()) {
                    setView(this.f4002aB);
                } else if (this.f4214k.minirigf3.mo5496d() || this.f4214k.minirigf3.mo5494c()) {
                    setView(this.f4001aA);
                } else {
                    m5765aB();
                }
            }
        }
    }

    /* renamed from: az */
    private void m5858az() {
        new AlertDialog.Builder(this).setTitle("STANDALONE").setMessage("If you only want to connect to one Minirig this is the button you need.").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.m5777aH();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setIcon(17301543).show();
    }

    /* renamed from: aA */
    private void m5763aA() {
        new AlertDialog.Builder(this).setTitle("STEREO").setMessage("This setting is for connecting two Minirigs into STEREO.").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.mo5277o();
                MainActivity mainActivity = MainActivity.this;
                mainActivity.m5746a(mainActivity.f4048av);
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setIcon(17301543).show();
    }

    /* renamed from: aB */
    private void m5765aB() {
        new AlertDialog.Builder(this).setTitle("LINKUP").setMessage("If you would like to start or join a LINKUP with other Minirigs hit this button.").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.setView(mainActivity.f4050ax);
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setIcon(17301543).show();
    }

    /* renamed from: aC */
    private void m5767aC() {
        new AlertDialog.Builder(this).setTitle("START LINKUP").setMessage("This will start a linkup with your Minirig as the master. Your Minirig may disconnect, it should auto re-connect within 10 seconds. Use your bluetooth settings to manually reconnect if it dosen't.").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.setView(mainActivity.f4001aA);
                MainActivity mainActivity2 = MainActivity.this;
                mainActivity2.setView(mainActivity2.f3996V);
                MainActivity.this.m5776aG();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setIcon(17301543).show();
    }

    /* renamed from: aD */
    private void m5769aD() {
        new AlertDialog.Builder(this).setTitle("JOIN LINKUP").setMessage("Your Minirig will attempt to join a linkup, ensure the master of the linkup is starting a linkup. Your Minirig may disconnect, it should auto re-connect within 10 seconds. Use your bluetooth settings to manually reconnect if it dosen't.").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.setView(mainActivity.f4002aB);
                MainActivity mainActivity2 = MainActivity.this;
                mainActivity2.setView(mainActivity2.f3996V);
                MainActivity.this.joinLinkup();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setIcon(17301543).show();
    }

    /* renamed from: aE */
    private void m5771aE() {
        new AlertDialog.Builder(this).setTitle("LEAVE THE LINKUP").setMessage("Your Minirig may disconnect, it should auto re-connect within 10 seconds. Use your bluetooth settings to manually reconnect if it dosen't. Have you had enough of this linkup?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.m5777aH();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setIcon(17301543).show();
    }

    /* renamed from: aF */
    private void m5773aF() {
        new AlertDialog.Builder(this).setTitle("ADD MINIRIGS").setMessage("Press the LED button on the Minirig 3 times to join the LINKUP!").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.m5776aG();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setIcon(17301543).show();
    }

    public void clickedLinkupOption(View view) {
        if (view.getTag() != null) {
            if (view.getTag().equals("linkupJoin")) {
                m5769aD();
            } else if (view.getTag().equals("linkupStart")) {
                m5767aC();
            }
        }
        sendCommand("x", "GET_STATUS");
    }

    public void clickedBroadcastStartOption(View view) {
        if (view.getTag() != null) {
            if (view.getTag().equals("start")) {
                if (!this.f4214k.minirigf3.mo5496d()) {
                    if (!this.f4214k.minirigf3.mo5494c()) {
                        setView(this.f3996V);
                    }
                    m5776aG();
                }
            } else if (view.getTag().equals("add")) {
                m5773aF();
            } else if (view.getTag().equals("stop")) {
                m5782aJ();
            }
        }
    }

    public void clickedBroadcastJoinOption(View view) {
        if (view.getTag() != null) {
            if (view.getTag().equals("join")) {
                if (!this.f4214k.minirigf3.mo5502g()) {
                    setView(this.f3996V);
                }
                joinLinkup();
            } else if (view.getTag().equals("leave")) {
                m5782aJ();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aG */
    public void m5776aG() {
        sendCommand("H", "BROADCAST_START");
        if (!this.f4214k.minirigf3.mo5494c() && !this.f4214k.minirigf3.mo5496d()) {
            this.f4043aq = true;
        }
        this.f4214k.minirigf3.broadcastStatef4467g = minirigStatusClass.broadcastStateEnum.TX_PAIRING_MUSIC_OFF;
        mo5283q();
    }

    /* access modifiers changed from: private */
    /* renamed from: aH */
    public void m5777aH() {
        setView(this.f3996V);
        sendCommand("J", "BROADCAST_LEAVE");
        this.f4043aq = true;
        this.f4044ar = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: aI */
    public void joinLinkup() {
        sendCommand("I", "BROADCAST_JOIN");
        if (!this.f4214k.minirigf3.mo5502g()) {
            this.f4043aq = true;
        }
        this.f4214k.minirigf3.broadcastStatef4467g = minirigStatusClass.broadcastStateEnum.RX_SEARCHING;
        mo5283q();
    }

    /* renamed from: aJ */
    private void m5782aJ() {
        m5771aE();
    }

    public void cancelTWSClicked(View view) {
        mo5281p();
        findViewById(R.id.cancelTWSButton).setVisibility(8);
        View view2 = this.f4066bN;
        View view3 = this.f4028ab;
        if (view2 == view3) {
            setView(view3);
        } else {
            setView(this.f4046at);
            this.f4066bN = this.f4028ab;
        }
        C1219c cVar = this.f3983I;
        if (cVar != null) {
            cVar.cancel(true);
        }
    }

    /* renamed from: aK */
    private void m5784aK() {
        if (this.f4214k.minirigf3.twsConnectionStatef4466f != minirigStatusClass.twsConnectionStateEnum.NO_TWS && this.f4214k.minirigf3.twsConnectionStatef4466f != minirigStatusClass.twsConnectionStateEnum.CONNECTED_AS_MASTER && this.f4214k.minirigf3.twsConnectionStatef4466f != minirigStatusClass.twsConnectionStateEnum.CONNECTED_AS_SLAVE && this.f4214k.minirigf3.twsConnectionStatef4466f != minirigStatusClass.twsConnectionStateEnum.CONNECTED_UNKNOWN) {
            return;
        }
        if (this.f4214k.f3966l == null || this.f4214k.f3966l.f4406h != "MRBT3") {
            m5786aL();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aL */
    public void m5786aL() {
        this.f4214k.mo5229a(f3974m, "- - - - - returnedFromTWSScan()");
        sendCommand("x", "GET_STATUS");
        this.f4031ae = false;
        runOnUiThread(new Runnable() {
            public void run() {
                MainActivity.this.findViewById(R.id.cancelTWSButton).setVisibility(8);
                MainActivity.this.m5843ar();
                MainActivity mainActivity = MainActivity.this;
                mainActivity.setView(mainActivity.f4028ab);
            }
        });
    }

    /* renamed from: o */
    public void mo5277o() {
        this.f4031ae = true;
        this.f3984J.removeCallbacks(this.f3986L);
        m5704M();
        sendCommand("P", "TWS_PAIR");
    }

    /* renamed from: p */
    public void mo5281p() {
        sendCommand("P", "TWS_PAIR");
        sendCommand("x", "GET_STATUS");
    }

    /* renamed from: q */
    public void mo5283q() {
        runOnUiThread(new Runnable() {
            public void run() {
                boolean z;
                MainActivity.this.f4047au.setBackgroundResource(R.drawable.device_list_selector);
                MainActivity.this.f4048av.setBackgroundResource(R.drawable.device_list_selector);
                MainActivity.this.f4049aw.setBackgroundResource(R.drawable.device_list_selector);
                MainActivity.this.f4003aC.setBackgroundResource(R.drawable.device_list_selector);
                MainActivity.this.f4004aD.setBackgroundResource(R.drawable.device_list_selector);
                GlobalApplication globalApplication = MainActivity.this.f4214k;
                String str = MainActivity.f3974m;
                globalApplication.mo5229a(str, "Broadcast state: " + MainActivity.this.f4214k.minirigf3.broadcastStatef4467g.toString());
                if (MainActivity.this.f4214k.minirigf3.broadcastStatef4467g != minirigStatusClass.broadcastStateEnum.NO_BROADCAST) {
                    MainActivity.this.f4049aw.setBackgroundResource(R.drawable.bg_device_list_selected);
                    z = false;
                } else {
                    z = true;
                }
                if (MainActivity.this.f4214k.minirigf3.isTwsScanning()) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.m5746a(mainActivity.f4048av);
                } else if (MainActivity.this.f4214k.minirigf3.isTwsConnected()) {
                    MainActivity.this.f4048av.setBackgroundResource(R.drawable.bg_device_list_selected);
                    z = false;
                }
                if (MainActivity.this.f4214k.minirigf3.mo5496d()) {
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.m5746a(mainActivity2.f4003aC);
                }
                if (MainActivity.this.f4214k.minirigf3.mo5498e()) {
                    MainActivity mainActivity3 = MainActivity.this;
                    mainActivity3.m5746a(mainActivity3.f4004aD);
                } else if (MainActivity.this.f4214k.minirigf3.mo5500f()) {
                    MainActivity.this.f4004aD.setBackgroundResource(R.drawable.bg_device_list_selected);
                }
                if (z) {
                    MainActivity.this.f4047au.setBackgroundResource(R.drawable.bg_device_list_selected);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo5243a(String str, String str2) {
        new AlertDialog.Builder(this).setTitle(str).setMessage(str2).setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.f4043aq = false;
                mainActivity.f4044ar = false;
                mainActivity.mo5239H();
            }
        }).setNegativeButton("Connect", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.m5902by();
            }
        }).setIcon(17301543).show();
    }

    /* renamed from: h */
    private void m5929h(String str) {
        if (!str.contains("#") || !this.f4008aH.contains("#")) {
            this.f4007aG = 0;
            return;
        }
        this.f4007aG++;
        if (this.f4007aG > 2) {
            this.f4214k.mo5229a(f3974m, "SLAVE DETECTION CLOSE");
            runOnUiThread(new Runnable() {
                public void run() {
                    if (MainActivity.this.f4006aF == null) {
                        MainActivity mainActivity = MainActivity.this;
                        mainActivity.setView(mainActivity.f4136cf);
                        MainActivity mainActivity2 = MainActivity.this;
                        mainActivity2.f4006aF = new AlertDialog.Builder(mainActivity2).setTitle("Connected to slave").setMessage("You are connected to a Minirig that is paired to another Minirig in wireless stereo as a slave (receiver). Please connect to the master instead.").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).setIcon(17301543).show();
                    }
                    MainActivity.this.mo5239H();
                }
            });
            this.f4007aG = 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aM */
    public void m5788aM() {
        this.f4009aI = findViewById(R.id.eq_home_layout);
        this.f4120cP = (ImageButton) findViewById(R.id.eq_home1);
        this.f4121cQ = (ImageButton) findViewById(R.id.eq_home2);
        this.f4122cR = (ImageButton) findViewById(R.id.eq_home3);
    }

    /* renamed from: r */
    public boolean mo5284r() {
        if (this.f4214k.f3966l != null && this.f4214k.minirigf3.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG3 && Integer.parseInt(this.f4214k.f3966l.f4407i) >= 15) {
            return true;
        }
        String str = this.f4162dF;
        if (str == null || str.length() <= 40) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public void mo5285s() {
        runOnUiThread(new Runnable() {
            public void run() {
                if (MainActivity.this.f4204dv != null) {
                    if (MainActivity.this.f4214k.f3957c.getString(MainActivity.this.f4160dD, "00").equals("00")) {
                        MainActivity.this.f4204dv.setActivated(true);
                        MainActivity.this.f4204dv.setImageResource(R.drawable.eq_preset1_on);
                    } else {
                        MainActivity.this.f4204dv.setActivated(false);
                        MainActivity.this.f4204dv.setImageResource(R.drawable.eq_preset1_off);
                    }
                }
                if (MainActivity.this.f4205dw != null) {
                    if (MainActivity.this.f4214k.f3957c.getString(MainActivity.this.f4160dD, "00").equals("01")) {
                        MainActivity.this.f4205dw.setActivated(true);
                        MainActivity.this.f4205dw.setImageResource(R.drawable.eq_preset2_on);
                    } else {
                        MainActivity.this.f4205dw.setActivated(false);
                        MainActivity.this.f4205dw.setImageResource(R.drawable.eq_preset2_off);
                    }
                }
                if (MainActivity.this.f4206dx != null) {
                    if (MainActivity.this.f4214k.f3957c.getString(MainActivity.this.f4160dD, "00").equals("02")) {
                        MainActivity.this.f4206dx.setActivated(true);
                        MainActivity.this.f4206dx.setImageResource(R.drawable.eq_preset3_on);
                    } else {
                        MainActivity.this.f4206dx.setActivated(false);
                        MainActivity.this.f4206dx.setImageResource(R.drawable.eq_preset3_off);
                    }
                }
                if (MainActivity.this.f4207dy == null) {
                    return;
                }
                if (MainActivity.this.f4214k.f3957c.getString(MainActivity.this.f4160dD, "00").equals("03")) {
                    MainActivity.this.f4207dy.setActivated(true);
                    MainActivity.this.f4207dy.setImageResource(R.drawable.eq_preset4_on);
                    return;
                }
                MainActivity.this.f4207dy.setActivated(false);
                MainActivity.this.f4207dy.setImageResource(R.drawable.eq_preset4_off);
            }
        });
    }

    public void clickedEQHome(View view) {
        if (view.getTag().equals("eqHome1")) {
            if (this.f4214k.f3964j.f4685f != null) {
                this.f4214k.f3964j.f4685f.f4707U++;
            }
            setView(this.f4079ba);
        } else if (view.getTag().equals("eqHome2")) {
            if (this.f4214k.f3964j.f4685f != null) {
                this.f4214k.f3964j.f4685f.f4706T++;
            }
            setView(this.f4010aJ);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aN */
    public void m5789aN() {
        this.f4010aJ = findViewById(R.id.eq_config_layout);
        this.f4011aK = findViewById(R.id.eq_config_row_4);
        this.f4012aL = (ImageButton) findViewById(R.id.eq_config_button1);
        this.f4013aM = (ImageButton) findViewById(R.id.eq_config_button2);
        this.f4014aN = (ImageButton) findViewById(R.id.eq_config_button3);
        this.f4015aO = (ImageButton) findViewById(R.id.eq_config_button4);
        this.f4016aP = true;
    }

    /* renamed from: t */
    public void mo5289t() {
        if (this.f4016aP) {
            runOnUiThread(new Runnable() {
                public void run() {
                    if (!MainActivity.this.f4214k.minirigf3.isTwsConnected()) {
                        MainActivity.this.f4012aL.setImageResource(R.drawable.config_mono);
                        MainActivity.this.f4013aM.setImageResource(R.drawable.config_mono_sub);
                        MainActivity.this.f4014aN.setImageResource(R.drawable.config_stereo_aux);
                        MainActivity.this.f4015aO.setImageResource(R.drawable.config_mono_mic);
                        MainActivity.this.f4011aK.setVisibility(0);
                    } else {
                        MainActivity.this.f4012aL.setImageResource(R.drawable.stereo_with_one_sub);
                        MainActivity.this.f4013aM.setImageResource(R.drawable.stereo_with_two_subs);
                        MainActivity.this.f4014aN.setImageResource(R.drawable.mono_link_mode);
                        MainActivity.this.f4011aK.setVisibility(8);
                    }
                    MainActivity.this.f4012aL.setBackgroundResource(R.drawable.device_list_selector);
                    MainActivity.this.f4013aM.setBackgroundResource(R.drawable.device_list_selector);
                    MainActivity.this.f4014aN.setBackgroundResource(R.drawable.device_list_selector);
                    MainActivity.this.f4015aO.setBackgroundResource(R.drawable.device_list_selector);
                    if (MainActivity.this.f4214k.minirigf3.isTwsConnected()) {
                        if (!MainActivity.this.f4017aQ) {
                            MainActivity.this.f4214k.minirigf3.minirigAudioModef4463c = minirigStatusClass.minirigModeEnum.MONO_LINK;
                            MainActivity.this.f4014aN.setBackgroundResource(R.drawable.bg_device_list_selected);
                        } else if (MainActivity.this.f4123cS == 0) {
                            if (MainActivity.this.f4188df <= 7) {
                                MainActivity.this.f4214k.minirigf3.minirigAudioModef4463c = minirigStatusClass.minirigModeEnum.STEREO_TWO_SUBS;
                                MainActivity.this.f4012aL.setBackgroundResource(R.drawable.bg_device_list_selected);
                                return;
                            }
                            MainActivity.this.f4214k.minirigf3.minirigAudioModef4463c = minirigStatusClass.minirigModeEnum.STEREO_ONE_SUB;
                            MainActivity.this.f4013aM.setBackgroundResource(R.drawable.bg_device_list_selected);
                        } else if (MainActivity.this.f4123cS == 1) {
                            MainActivity.this.f4214k.minirigf3.minirigAudioModef4463c = minirigStatusClass.minirigModeEnum.STEREO_ONE_SUB;
                            MainActivity.this.f4012aL.setBackgroundResource(R.drawable.bg_device_list_selected);
                        } else {
                            MainActivity.this.f4214k.minirigf3.minirigAudioModef4463c = minirigStatusClass.minirigModeEnum.STEREO_TWO_SUBS;
                            MainActivity.this.f4013aM.setBackgroundResource(R.drawable.bg_device_list_selected);
                        }
                    } else if (MainActivity.this.f4187de) {
                        MainActivity.this.f4214k.minirigf3.minirigAudioModef4463c = minirigStatusClass.minirigModeEnum.MONO_MIC;
                        MainActivity.this.f4015aO.setBackgroundResource(R.drawable.bg_device_list_selected);
                    } else if (!MainActivity.this.f4214k.minirigf3.getHasLeftChannelActive() || !MainActivity.this.f4214k.minirigf3.getHasRightChannelActive()) {
                        MainActivity.this.f4214k.minirigf3.minirigAudioModef4463c = minirigStatusClass.minirigModeEnum.STEREO_AUX;
                        MainActivity.this.f4014aN.setBackgroundResource(R.drawable.bg_device_list_selected);
                    } else {
                        MainActivity mainActivity = MainActivity.this;
                        if (mainActivity.m5868b(mainActivity.f4083be)) {
                            MainActivity.this.f4214k.minirigf3.minirigAudioModef4463c = minirigStatusClass.minirigModeEnum.MONO_SUB;
                            MainActivity.this.f4013aM.setBackgroundResource(R.drawable.bg_device_list_selected);
                            return;
                        }
                        MainActivity mainActivity2 = MainActivity.this;
                        if (mainActivity2.m5868b(mainActivity2.f4086bh)) {
                            MainActivity.this.f4214k.minirigf3.minirigAudioModef4463c = minirigStatusClass.minirigModeEnum.MONO_SUB;
                            MainActivity.this.f4013aM.setBackgroundResource(R.drawable.bg_device_list_selected);
                            return;
                        }
                        MainActivity mainActivity3 = MainActivity.this;
                        if (mainActivity3.m5868b(mainActivity3.f4088bj)) {
                            MainActivity.this.f4214k.minirigf3.minirigAudioModef4463c = minirigStatusClass.minirigModeEnum.MONO_SUB;
                            MainActivity.this.f4013aM.setBackgroundResource(R.drawable.bg_device_list_selected);
                            return;
                        }
                        MainActivity.this.f4214k.minirigf3.minirigAudioModef4463c = minirigStatusClass.minirigModeEnum.MONO;
                        MainActivity.this.f4012aL.setBackgroundResource(R.drawable.bg_device_list_selected);
                    }
                }
            });
        }
    }

    public void clickedEqConfig(View view) {
        if (view.getTag().equals("eqConfig1")) {
            if (this.f4214k.f3966l == null || !this.f4214k.minirigf3.isTwsConnected()) {
                this.f4186dd = 8;
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4708V++;
                }
                sendCommand("M", "MONO_WITH_SUB");
                sendCommand(this.f4214k.f3958d.mo5467a("18", 0), this.f4214k.f3958d.f4394a);
                m5759a(false);
                this.f4215l.mo5543a(getResources().getString(R.string.helpAcStandaloneTitle), getResources().getString(R.string.helpAcStandaloneBody));
            } else {
                this.f4186dd = 4;
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4714aa++;
                }
                sendCommand("L", "STEREO_WITH_ONE_SUB");
                sendCommand(this.f4214k.f3958d.mo5467a("18", 0), this.f4214k.f3958d.f4394a);
                m5759a(true);
                this.f4123cS = 1;
                this.f4215l.mo5543a(getResources().getString(R.string.helpAcStereo1SubTitle), getResources().getString(R.string.helpAcStereo1SubBody));
            }
        } else if (view.getTag().equals("eqConfig2")) {
            if (this.f4214k.f3966l != null && this.f4214k.minirigf3.isTwsConnected()) {
                this.f4186dd = 5;
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4715ab++;
                }
                sendCommand("R", "STEREO_WITH_TWO_SUBS");
                sendCommand(this.f4214k.f3958d.mo5467a("18", 0), this.f4214k.f3958d.f4394a);
                m5759a(true);
                this.f4123cS = 2;
                this.f4215l.mo5543a(getResources().getString(R.string.helpAcStereo2SubsTitle), getResources().getString(R.string.helpAcStereo2SubsBody));
            } else if (!m5792aO()) {
                this.f4186dd = 1;
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4710X++;
                }
                sendCommand("M", "MONO_WITH_SUB");
                sendCommand(this.f4214k.f3958d.mo5467a("18", 0), this.f4214k.f3958d.f4394a);
                m5759a(true);
                this.f4215l.mo5543a(getResources().getString(R.string.helpAcMono1SubTitle), getResources().getString(R.string.helpAcMono1SubBody));
            } else {
                return;
            }
        } else if (view.getTag().equals("eqConfig3")) {
            if (this.f4214k.f3966l != null && this.f4214k.minirigf3.isTwsConnected()) {
                this.f4186dd = 6;
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4712Z++;
                }
                sendCommand("M", "MONO_WITH_SUB");
                sendCommand(this.f4214k.f3958d.mo5467a("18", 0), this.f4214k.f3958d.f4394a);
                m5759a(false);
                this.f4215l.mo5543a(getResources().getString(R.string.helpAcLinkTitle), getResources().getString(R.string.helpAcLinkBody));
            } else if (!m5792aO()) {
                this.f4186dd = 2;
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4711Y++;
                }
                sendCommand("L", "STEREO_WITH_ONE_SUB");
                sendCommand(this.f4214k.f3958d.mo5467a("18", 0), this.f4214k.f3958d.f4394a);
                m5759a(false);
                this.f4215l.mo5543a(getResources().getString(R.string.helpAcStereoTitle), getResources().getString(R.string.helpAcStereoBody));
            } else {
                return;
            }
        } else if (view.getTag().equals("eqConfig4")) {
            if (this.f4214k.f3966l != null && this.f4214k.minirigf3.isTwsConnected()) {
                this.f4186dd = 6;
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4712Z++;
                }
                sendCommand("M", "MONO_WITH_SUB");
                sendCommand(this.f4214k.f3958d.mo5467a("18", 0), this.f4214k.f3958d.f4394a);
                this.f4215l.mo5543a(getResources().getString(R.string.helpAcLinkTitle), getResources().getString(R.string.helpAcLinkBody));
            } else if (!m5792aO()) {
                this.f4186dd = 3;
                if (this.f4214k.f3964j.f4685f != null) {
                    this.f4214k.f3964j.f4685f.f4709W++;
                }
                sendCommand("M", "MONO_WITH_SUB");
                sendCommand(this.f4214k.f3958d.mo5467a("18", 1), this.f4214k.f3958d.f4394a);
                this.f4215l.mo5543a(getResources().getString(R.string.helpAcLiveTitle), getResources().getString(R.string.helpAcLiveBody));
            } else {
                return;
            }
            m5759a(false);
        }
        sendCommand("q p 00 50", "GET_EQ");
        sendCommand("x", "GET_STATUS");
        if (this.f4214k.f3966l != null && this.f4214k.minirigf3.isTwsConnected()) {
            m5794aP();
        }
        mo5293u();
        setView(this.f4018aR);
    }

    /* renamed from: aO */
    private boolean m5792aO() {
        if (this.f4214k.minirigf3.getHasJackInsertedTop() || this.f4214k.minirigf3.getHasJackInsertedBottom()) {
            return false;
        }
        mo5246b("No AUX detected", "Please connect a second device with an AUX cable first.");
        return true;
    }

    /* renamed from: aP */
    private void m5794aP() {
        sendCommand("r", "GET_TWS_CONFIG_1");
        sendCommand("N GET TWS_CONFIG", "GET_TWS_CONFIG_2");
        sendCommand("s", "GET_TWS_CONFIG_3");
    }

    /* renamed from: i */
    private void m5931i(String str) {
        if (str.contains("1 2")) {
            this.f4017aQ = true;
        } else if (str.contains("3 3")) {
            this.f4017aQ = false;
        }
        mo5289t();
    }

    /* access modifiers changed from: private */
    /* renamed from: aQ */
    public void m5795aQ() {
        this.f4018aR = findViewById(R.id.eq_twin_layout);
        this.f4019aS = findViewById(R.id.twin_row_2);
        this.f4022aV = findViewById(R.id.twinMidParent);
        this.f4023aW = findViewById(R.id.twinMidInfoParent);
        this.f4127cW = (ImageView) findViewById(R.id.eq_twin_image);
        this.f4024aX = (TextView) findViewById(R.id.leftTwinInfo);
        this.f4025aY = (TextView) findViewById(R.id.midTwinInfo);
        this.f4020aT = findViewById(R.id.rightTwinInfoParent);
        this.f4026aZ = (TextView) findViewById(R.id.rightTwinInfo);
        this.f4185dc = (Button) findViewById(R.id.twinDefault);
        this.f4021aU = findViewById(R.id.rightSliderParent);
        this.f4128cX = (ImageView) findViewById(R.id.leftSliderDefaultMark);
        this.f4129cY = (ImageView) findViewById(R.id.leftSliderDefaultMark2);
        this.f4130cZ = (ImageView) findViewById(R.id.midSliderDefaultMark);
        this.f4183da = (ImageView) findViewById(R.id.midSliderDefaultMark2);
        this.f4184db = (ImageView) findViewById(R.id.rightSliderDefaultMark);
        m5799aS();
    }

    public void twinDefault(View view) {
        int i = this.f4186dd;
        if (i == 3 || i == 7) {
            sendCommand(this.f4214k.f3958d.mo5467a("08", this.f4190dh), this.f4214k.f3958d.f4394a);
            sendCommand(this.f4214k.f3958d.mo5467a("10", this.f4193dk), this.f4214k.f3958d.f4394a);
            sendCommand(this.f4214k.f3958d.mo5467a("11", this.f4193dk), this.f4214k.f3958d.f4394a);
        } else if (i == 8) {
            float f = (float) this.f4191di;
            if (this.f4189dg > 9) {
                f = (float) this.f4190dh;
            }
            sendCommand(this.f4214k.f3958d.mo5467a("08", (int) f), this.f4214k.f3958d.f4394a);
        } else {
            float f2 = (float) this.f4191di;
            if (this.f4189dg > 9) {
                f2 = (float) this.f4190dh;
            }
            sendCommand(this.f4214k.f3958d.mo5467a("08", (int) f2), this.f4214k.f3958d.f4394a);
            sendCommand(this.f4214k.f3958d.mo5467a("09", this.f4192dj), this.f4214k.f3958d.f4394a);
        }
    }

    /* renamed from: u */
    public void mo5293u() {
        if (this.f4185dc == null) {
            m5795aQ();
        }
        runOnUiThread(new Runnable() {
            public void run() {
                MainActivity.this.f4185dc.setVisibility(0);
                MainActivity.this.f4129cY.setVisibility(0);
                MainActivity.this.f4130cZ.setVisibility(8);
                MainActivity.this.f4183da.setVisibility(8);
                if (MainActivity.this.f4186dd == 8) {
                    MainActivity.this.f4127cW.setImageResource(R.drawable.twin_mono);
                    MainActivity.this.f4024aX.setText("MINIRIG");
                    MainActivity.this.f4025aY.setText("");
                    MainActivity.this.f4026aZ.setText("");
                    MainActivity.this.f4127cW.setVisibility(0);
                    MainActivity.this.f4019aS.setVisibility(0);
                    MainActivity.this.f4125cU.setVisibility(8);
                    MainActivity.this.f4020aT.setVisibility(8);
                    MainActivity.this.f4021aU.setVisibility(8);
                } else if (MainActivity.this.f4186dd == 3 || MainActivity.this.f4186dd == 7) {
                    MainActivity.this.f4127cW.setVisibility(8);
                    MainActivity.this.f4019aS.setVisibility(0);
                    MainActivity.this.f4024aX.setText("L");
                    MainActivity.this.f4025aY.setText("MINIRIG");
                    MainActivity.this.f4026aZ.setText("R");
                    MainActivity.this.f4125cU.setVisibility(0);
                    MainActivity.this.f4020aT.setVisibility(0);
                    MainActivity.this.f4021aU.setVisibility(0);
                    MainActivity.this.f4185dc.setVisibility(8);
                    MainActivity.this.f4129cY.setVisibility(8);
                    MainActivity.this.f4130cZ.setVisibility(0);
                    MainActivity.this.f4183da.setVisibility(0);
                    if (MainActivity.this.f4186dd != 3) {
                        int Q = MainActivity.this.f4186dd;
                    }
                } else {
                    MainActivity.this.f4024aX.setText("MINIRIG");
                    MainActivity.this.f4025aY.setText("");
                    MainActivity.this.f4026aZ.setText("SUB");
                    if (MainActivity.this.f4186dd == 6) {
                        MainActivity.this.f4127cW.setImageResource(R.drawable.twin_tws_mono);
                        MainActivity.this.f4024aX.setText("MINIRIGS");
                        MainActivity.this.f4026aZ.setText("MINIRIGS");
                    } else if (MainActivity.this.f4186dd == 5) {
                        MainActivity.this.f4127cW.setImageResource(R.drawable.twin_tws_two_subs);
                        MainActivity.this.f4026aZ.setText("SUBS");
                    } else if (MainActivity.this.f4186dd == 4) {
                        MainActivity.this.f4127cW.setImageResource(R.drawable.twin_tws_one_sub);
                        MainActivity.this.f4026aZ.setText("SUB");
                    } else if (MainActivity.this.f4186dd == 2) {
                        MainActivity.this.f4127cW.setImageResource(R.drawable.twin_stereo_aux);
                        MainActivity.this.f4024aX.setText("L");
                        MainActivity.this.f4026aZ.setText("R");
                    } else if (MainActivity.this.f4186dd == 1) {
                        MainActivity.this.f4127cW.setImageResource(R.drawable.twin_mono_sub);
                    }
                    MainActivity.this.f4127cW.setVisibility(0);
                    MainActivity.this.f4019aS.setVisibility(0);
                    MainActivity.this.f4125cU.setVisibility(8);
                    MainActivity.this.f4020aT.setVisibility(0);
                    MainActivity.this.f4021aU.setVisibility(0);
                }
                if (MainActivity.this.f4186dd == 8) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
                    MainActivity.this.f4022aV.setLayoutParams(layoutParams);
                    MainActivity.this.f4023aW.setLayoutParams(layoutParams);
                    return;
                }
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1, 3.0f);
                MainActivity.this.f4022aV.setLayoutParams(layoutParams2);
                MainActivity.this.f4023aW.setLayoutParams(layoutParams2);
            }
        });
        m5797aR();
        mo5289t();
    }

    /* renamed from: aR */
    private void m5797aR() {
        if (!this.f4162dF.equals("")) {
            final String[] split = this.f4162dF.substring(2).split(" ");
            if (split.length <= 9 || split[7].equals("99") || split[8].equals("99")) {
                this.f4117cM = true;
            } else {
                this.f4118cN = split[7];
                this.f4119cO = split[8];
                this.f4117cM = false;
            }
            runOnUiThread(new Runnable() {
                public void run() {
                    if (MainActivity.this.f4186dd == 3 || MainActivity.this.f4186dd == 7) {
                        int parseInt = Integer.parseInt("10") - 1;
                        String[] strArr = split;
                        if (!(strArr.length < parseInt + 1 || MainActivity.m5743a(strArr[parseInt]) == null || MainActivity.this.f4124cT == null)) {
                            MainActivity.this.f4124cT.setProgressAndThumb(MainActivity.this.m5860b(Integer.parseInt(split[parseInt]), new int[]{0, 99}));
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(35, 36);
                            layoutParams.addRule(14);
                            layoutParams.setMargins(0, ((int) (((float) (MainActivity.this.f4124cT.getHeight() / 100)) * ((float) (100 - MainActivity.this.f4193dk)))) - 18, 0, 0);
                            MainActivity.this.f4128cX.setLayoutParams(layoutParams);
                        }
                        int parseInt2 = Integer.parseInt("08") - 1;
                        String[] strArr2 = split;
                        if (!(strArr2.length < parseInt2 + 1 || MainActivity.m5743a(strArr2[parseInt2]) == null || MainActivity.this.f4125cU == null)) {
                            MainActivity.this.f4125cU.setProgressAndThumb(100 - MainActivity.this.m5860b(Integer.parseInt(split[parseInt2]), new int[]{0, 30}));
                            float height = (float) (MainActivity.this.f4125cU.getHeight() / 30);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(35, 36);
                            layoutParams2.addRule(14);
                            layoutParams2.setMargins(0, ((int) (((float) MainActivity.this.f4190dh) * height)) - 18, 0, 0);
                            MainActivity.this.f4130cZ.setLayoutParams(layoutParams2);
                            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(35, 36);
                            layoutParams3.addRule(14);
                            layoutParams3.setMargins(0, ((int) (height * ((float) MainActivity.this.f4191di))) + 60, 0, 0);
                            MainActivity.this.f4183da.setLayoutParams(layoutParams3);
                        }
                        int parseInt3 = Integer.parseInt("11") - 1;
                        String[] strArr3 = split;
                        if (strArr3.length >= parseInt3 + 1 && MainActivity.m5743a(strArr3[parseInt3]) != null && MainActivity.this.f4126cV != null) {
                            MainActivity.this.f4126cV.setProgressAndThumb(MainActivity.this.m5860b(Integer.parseInt(split[parseInt3]), new int[]{0, 99}));
                            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(35, 36);
                            layoutParams4.addRule(14);
                            layoutParams4.setMargins(0, ((int) (((float) (MainActivity.this.f4126cV.getHeight() / 100)) * ((float) (100 - MainActivity.this.f4193dk)))) - 18, 0, 0);
                            MainActivity.this.f4184db.setLayoutParams(layoutParams4);
                            return;
                        }
                        return;
                    }
                    int parseInt4 = Integer.parseInt("08") - 1;
                    String[] strArr4 = split;
                    if (!(strArr4.length < parseInt4 + 1 || MainActivity.m5743a(strArr4[parseInt4]) == null || MainActivity.this.f4124cT == null)) {
                        MainActivity.this.f4124cT.setProgressAndThumb(100 - MainActivity.this.m5860b(Integer.parseInt(split[parseInt4]), new int[]{0, 30}));
                        float height2 = (float) (MainActivity.this.f4124cT.getHeight() / 30);
                        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(35, 36);
                        layoutParams5.addRule(14);
                        layoutParams5.setMargins(0, ((int) (((float) MainActivity.this.f4190dh) * height2)) - 18, 0, 0);
                        MainActivity.this.f4128cX.setLayoutParams(layoutParams5);
                        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(35, 36);
                        layoutParams6.addRule(14);
                        layoutParams6.setMargins(0, ((int) (height2 * ((float) MainActivity.this.f4191di))) + 60, 0, 0);
                        MainActivity.this.f4129cY.setLayoutParams(layoutParams6);
                    }
                    int parseInt5 = Integer.parseInt("09") - 1;
                    String[] strArr5 = split;
                    if (strArr5.length >= parseInt5 + 1 && MainActivity.m5743a(strArr5[parseInt5]) != null && MainActivity.this.f4126cV != null) {
                        MainActivity.this.f4126cV.setProgressAndThumb(MainActivity.this.m5860b(Integer.parseInt(split[parseInt5]), new int[]{0, 10}));
                        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(35, 36);
                        layoutParams7.addRule(14);
                        layoutParams7.setMargins(0, ((int) (((float) (MainActivity.this.f4126cV.getHeight() / 10)) * ((float) (10 - MainActivity.this.f4192dj)))) + 18, 0, 0);
                        MainActivity.this.f4184db.setLayoutParams(layoutParams7);
                    }
                }
            });
            int parseInt = Integer.parseInt("18") - 1;
            if (split.length >= parseInt + 1 && m5743a(split[parseInt]) != null) {
                if (Integer.parseInt(split[parseInt]) == 1) {
                    this.f4187de = true;
                } else {
                    this.f4187de = false;
                }
            }
            int parseInt2 = Integer.parseInt("08") - 1;
            if (split.length >= parseInt2 + 1 && m5743a(split[parseInt2]) != null) {
                this.f4189dg = Integer.parseInt(split[parseInt2]);
            }
            int parseInt3 = Integer.parseInt("09") - 1;
            if (split.length >= parseInt3 + 1 && m5743a(split[parseInt3]) != null) {
                this.f4188df = Integer.parseInt(split[parseInt3]);
            }
        }
    }

    /* renamed from: aS */
    private void m5799aS() {
        this.f4124cT = (VerticalSeekBar) findViewById(R.id.leftSlider);
        this.f4124cT.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                String str;
                if (MainActivity.this.f4186dd == 3 || MainActivity.this.f4186dd == 7) {
                    str = MainActivity.this.f4214k.f3958d.mo5467a("10", MainActivity.this.m5731a(seekBar.getProgress(), new int[]{0, 99}));
                } else {
                    str = MainActivity.this.f4214k.f3958d.mo5467a("08", MainActivity.this.m5731a(100 - seekBar.getProgress(), new int[]{0, 30}));
                }
                MainActivity mainActivity = MainActivity.this;
                mainActivity.sendCommand(str, mainActivity.f4214k.f3958d.f4394a);
            }
        });
        this.f4125cU = (VerticalSeekBar) findViewById(R.id.midSlider);
        this.f4125cU.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                String a = MainActivity.this.f4214k.f3958d.mo5467a("08", MainActivity.this.m5731a(100 - seekBar.getProgress(), new int[]{0, 30}));
                MainActivity mainActivity = MainActivity.this;
                mainActivity.sendCommand(a, mainActivity.f4214k.f3958d.f4394a);
            }
        });
        this.f4126cV = (VerticalSeekBar) findViewById(R.id.rightSlider);
        this.f4126cV.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                String str;
                if (MainActivity.this.f4186dd == 3 || MainActivity.this.f4186dd == 7) {
                    str = MainActivity.this.f4214k.f3958d.mo5467a("11", MainActivity.this.m5731a(seekBar.getProgress(), new int[]{0, 99}));
                } else {
                    str = MainActivity.this.f4214k.f3958d.mo5467a("09", MainActivity.this.m5731a(seekBar.getProgress(), new int[]{0, 10}));
                }
                MainActivity mainActivity = MainActivity.this;
                mainActivity.sendCommand(str, mainActivity.f4214k.f3958d.f4394a);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: aT */
    public void m5801aT() {
        if (this.f4214k.f3966l != null) {
            if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI2 || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG3) {
                m5804aW();
                m5880bc();
                return;
            }
            m5883bf();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aU */
    public void m5802aU() {
        runOnUiThread(new Runnable() {
            public void run() {
                if (MainActivity.this.f4208dz == null) {
                    return;
                }
                if (MainActivity.this.f4214k.minirigf3.mo5506i()) {
                    MainActivity.this.f4208dz.setActivated(true);
                    MainActivity.this.f4208dz.setImageResource(R.drawable.eq_lock_on);
                    MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Refresh eq lock: ON");
                    return;
                }
                MainActivity.this.f4208dz.setActivated(false);
                MainActivity.this.f4208dz.setImageResource(R.drawable.eq_lock_off);
                MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Refresh eq lock: OFF");
            }
        });
    }

    /* renamed from: aV */
    private void m5803aV() {
        if (this.f4214k.f3966l != null) {
            m5878ba();
            m5802aU();
        }
    }

    /* renamed from: aW */
    private void m5804aW() {
        this.f4079ba = findViewById(R.id.eq_controls_layout);
        this.f4081bc = findViewById(R.id.eq_controls_sliders);
        m5806aY();
        m5807aZ();
        m5805aX();
        sendCommand("q p 00 50", "GET_EQ");
    }

    /* renamed from: aX */
    private void m5805aX() {
        this.f4194dl = (VerticalSeekBar) findViewById(R.id.vband1);
        this.f4194dl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                if (MainActivity.this.f4163dG) {
                    String a = MainActivity.this.f4214k.f3958d.mo5467a("01", MainActivity.this.m5733a(seekBar.getProgress(), MainActivity.this.f4157dA, MainActivity.this.f4159dC));
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.sendCommand(a, mainActivity.f4214k.f3958d.f4394a);
                }
            }
        });
        this.f4195dm = (VerticalSeekBar) findViewById(R.id.vband2);
        this.f4195dm.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                if (MainActivity.this.f4163dG) {
                    String a = MainActivity.this.f4214k.f3958d.mo5467a("02", MainActivity.this.m5733a(seekBar.getProgress(), MainActivity.this.f4157dA, MainActivity.this.f4159dC));
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.sendCommand(a, mainActivity.f4214k.f3958d.f4394a);
                }
            }
        });
        this.f4196dn = (VerticalSeekBar) findViewById(R.id.vband3);
        this.f4196dn.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                if (MainActivity.this.f4163dG) {
                    String a = MainActivity.this.f4214k.f3958d.mo5467a("03", MainActivity.this.m5733a(seekBar.getProgress(), MainActivity.this.f4157dA, MainActivity.this.f4159dC));
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.sendCommand(a, mainActivity.f4214k.f3958d.f4394a);
                }
            }
        });
        this.f4197do = (VerticalSeekBar) findViewById(R.id.vband4);
        this.f4197do.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                if (MainActivity.this.f4163dG) {
                    String a = MainActivity.this.f4214k.f3958d.mo5467a("04", MainActivity.this.m5733a(seekBar.getProgress(), MainActivity.this.f4157dA, MainActivity.this.f4159dC));
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.sendCommand(a, mainActivity.f4214k.f3958d.f4394a);
                }
            }
        });
        this.f4198dp = (VerticalSeekBar) findViewById(R.id.vband5);
        this.f4198dp.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                if (MainActivity.this.f4163dG) {
                    String a = MainActivity.this.f4214k.f3958d.mo5467a("05", MainActivity.this.m5733a(seekBar.getProgress(), MainActivity.this.f4157dA, MainActivity.this.f4159dC));
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.sendCommand(a, mainActivity.f4214k.f3958d.f4394a);
                }
            }
        });
    }

    /* renamed from: aY */
    private void m5806aY() {
        this.f4204dv = (ImageButton) findViewById(R.id.setPreset0);
        this.f4205dw = (ImageButton) findViewById(R.id.setPreset1);
        this.f4206dx = (ImageButton) findViewById(R.id.setPreset2);
        this.f4207dy = (ImageButton) findViewById(R.id.setPreset3);
        this.f4208dz = (ImageButton) findViewById(R.id.eqLock);
        runOnUiThread(new Runnable() {
            public void run() {
                MainActivity.this.m5878ba();
            }
        });
    }

    /* renamed from: aZ */
    private void m5807aZ() {
        this.f4199dq = (TextView) findViewById(R.id.bandText1);
        this.f4200dr = (TextView) findViewById(R.id.bandText2);
        this.f4201ds = (TextView) findViewById(R.id.bandText3);
        this.f4202dt = (TextView) findViewById(R.id.bandText4);
        this.f4203du = (TextView) findViewById(R.id.bandText5);
    }

    /* access modifiers changed from: private */
    /* renamed from: ba */
    public void m5878ba() {
        runOnUiThread(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:13:0x0066  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x00be  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x0116  */
            /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r5 = this;
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    boolean r0 = r0.mo5284r()
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L_0x015a
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    int r0 = r0.f4082bd
                    if (r0 > 0) goto L_0x028e
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4205dw
                    if (r0 == 0) goto L_0x005d
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r0.f4085bg
                    boolean r0 = r0.m5868b((java.util.HashMap<java.lang.String, java.lang.Integer>) r3)
                    if (r0 == 0) goto L_0x0048
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    r0.m5865b((boolean) r2)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4205dw
                    r0.setActivated(r1)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4205dw
                    r3 = 2131165346(0x7f0700a2, float:1.7944907E38)
                    r0.setImageResource(r3)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.view.View r0 = r0.f4081bc
                    r3 = 2131165420(0x7f0700ec, float:1.7945057E38)
                    r0.setBackgroundResource(r3)
                    r0 = 0
                    goto L_0x005e
                L_0x0048:
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4205dw
                    r0.setActivated(r2)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4205dw
                    r3 = 2131165345(0x7f0700a1, float:1.7944904E38)
                    r0.setImageResource(r3)
                L_0x005d:
                    r0 = 1
                L_0x005e:
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r3 = r3.f4206dx
                    if (r3 == 0) goto L_0x00b6
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r3.f4087bi
                    boolean r3 = r3.m5868b((java.util.HashMap<java.lang.String, java.lang.Integer>) r4)
                    if (r3 != 0) goto L_0x0091
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r3.f4086bh
                    boolean r3 = r3.m5868b((java.util.HashMap<java.lang.String, java.lang.Integer>) r4)
                    if (r3 == 0) goto L_0x007b
                    goto L_0x0091
                L_0x007b:
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r3 = r3.f4206dx
                    r3.setActivated(r2)
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r3 = r3.f4206dx
                    r4 = 2131165355(0x7f0700ab, float:1.7944925E38)
                    r3.setImageResource(r4)
                    goto L_0x00b6
                L_0x0091:
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    r0.m5865b((boolean) r2)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4206dx
                    r0.setActivated(r1)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4206dx
                    r3 = 2131165356(0x7f0700ac, float:1.7944927E38)
                    r0.setImageResource(r3)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.view.View r0 = r0.f4081bc
                    r3 = 2131165421(0x7f0700ed, float:1.7945059E38)
                    r0.setBackgroundResource(r3)
                    r0 = 0
                L_0x00b6:
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r3 = r3.f4207dy
                    if (r3 == 0) goto L_0x010e
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r3.f4089bk
                    boolean r3 = r3.m5868b((java.util.HashMap<java.lang.String, java.lang.Integer>) r4)
                    if (r3 != 0) goto L_0x00e9
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r3.f4088bj
                    boolean r3 = r3.m5868b((java.util.HashMap<java.lang.String, java.lang.Integer>) r4)
                    if (r3 == 0) goto L_0x00d3
                    goto L_0x00e9
                L_0x00d3:
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r3 = r3.f4207dy
                    r3.setActivated(r2)
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r3 = r3.f4207dy
                    r4 = 2131165357(0x7f0700ad, float:1.7944929E38)
                    r3.setImageResource(r4)
                    goto L_0x010e
                L_0x00e9:
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    r0.m5865b((boolean) r2)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4207dy
                    r0.setActivated(r1)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4207dy
                    r3 = 2131165358(0x7f0700ae, float:1.794493E38)
                    r0.setImageResource(r3)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.view.View r0 = r0.f4081bc
                    r3 = 2131165422(0x7f0700ee, float:1.794506E38)
                    r0.setBackgroundResource(r3)
                    r0 = 0
                L_0x010e:
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r3 = r3.f4204dv
                    if (r3 == 0) goto L_0x028e
                    if (r0 == 0) goto L_0x0143
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    java.lang.String r3 = "00"
                    java.lang.String unused = r0.f4160dD = r3
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4204dv
                    r0.setActivated(r1)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4204dv
                    r1 = 2131165336(0x7f070098, float:1.7944886E38)
                    r0.setImageResource(r1)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.view.View r0 = r0.f4081bc
                    r1 = 0
                    r0.setBackground(r1)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    r0.m5924g((int) r2)
                    goto L_0x028e
                L_0x0143:
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4204dv
                    r0.setActivated(r2)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4204dv
                    r1 = 2131165335(0x7f070097, float:1.7944884E38)
                    r0.setImageResource(r1)
                    goto L_0x028e
                L_0x015a:
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4204dv
                    if (r0 == 0) goto L_0x01a7
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    com.minirig.android.GlobalApplication r0 = r0.f4214k
                    android.content.SharedPreferences r0 = r0.f3957c
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    java.lang.String r3 = r3.f4160dD
                    java.lang.String r4 = "00"
                    java.lang.String r0 = r0.getString(r3, r4)
                    java.lang.String r3 = "00"
                    boolean r0 = r0.equals(r3)
                    if (r0 == 0) goto L_0x0192
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4204dv
                    r0.setActivated(r1)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4204dv
                    r3 = 2131165348(0x7f0700a4, float:1.794491E38)
                    r0.setImageResource(r3)
                    goto L_0x01a7
                L_0x0192:
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4204dv
                    r0.setActivated(r2)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4204dv
                    r3 = 2131165347(0x7f0700a3, float:1.7944909E38)
                    r0.setImageResource(r3)
                L_0x01a7:
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4205dw
                    if (r0 == 0) goto L_0x01f4
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    com.minirig.android.GlobalApplication r0 = r0.f4214k
                    android.content.SharedPreferences r0 = r0.f3957c
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    java.lang.String r3 = r3.f4160dD
                    java.lang.String r4 = "00"
                    java.lang.String r0 = r0.getString(r3, r4)
                    java.lang.String r3 = "01"
                    boolean r0 = r0.equals(r3)
                    if (r0 == 0) goto L_0x01df
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4205dw
                    r0.setActivated(r1)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4205dw
                    r3 = 2131165350(0x7f0700a6, float:1.7944915E38)
                    r0.setImageResource(r3)
                    goto L_0x01f4
                L_0x01df:
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4205dw
                    r0.setActivated(r2)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4205dw
                    r3 = 2131165349(0x7f0700a5, float:1.7944913E38)
                    r0.setImageResource(r3)
                L_0x01f4:
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4206dx
                    if (r0 == 0) goto L_0x0241
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    com.minirig.android.GlobalApplication r0 = r0.f4214k
                    android.content.SharedPreferences r0 = r0.f3957c
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    java.lang.String r3 = r3.f4160dD
                    java.lang.String r4 = "00"
                    java.lang.String r0 = r0.getString(r3, r4)
                    java.lang.String r3 = "02"
                    boolean r0 = r0.equals(r3)
                    if (r0 == 0) goto L_0x022c
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4206dx
                    r0.setActivated(r1)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4206dx
                    r3 = 2131165352(0x7f0700a8, float:1.7944919E38)
                    r0.setImageResource(r3)
                    goto L_0x0241
                L_0x022c:
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4206dx
                    r0.setActivated(r2)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4206dx
                    r3 = 2131165351(0x7f0700a7, float:1.7944917E38)
                    r0.setImageResource(r3)
                L_0x0241:
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4207dy
                    if (r0 == 0) goto L_0x028e
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    com.minirig.android.GlobalApplication r0 = r0.f4214k
                    android.content.SharedPreferences r0 = r0.f3957c
                    com.minirig.android.MainActivity r3 = com.minirig.android.MainActivity.this
                    java.lang.String r3 = r3.f4160dD
                    java.lang.String r4 = "00"
                    java.lang.String r0 = r0.getString(r3, r4)
                    java.lang.String r3 = "03"
                    boolean r0 = r0.equals(r3)
                    if (r0 == 0) goto L_0x0279
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4207dy
                    r0.setActivated(r1)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4207dy
                    r1 = 2131165354(0x7f0700aa, float:1.7944923E38)
                    r0.setImageResource(r1)
                    goto L_0x028e
                L_0x0279:
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4207dy
                    r0.setActivated(r2)
                    com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                    android.widget.ImageButton r0 = r0.f4207dy
                    r1 = 2131165353(0x7f0700a9, float:1.794492E38)
                    r0.setImageResource(r1)
                L_0x028e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.minirig.android.MainActivity.C120690.run():void");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m5924g(int i) {
        VerticalSeekBar verticalSeekBar = this.f4194dl;
        if (verticalSeekBar != null) {
            verticalSeekBar.setVisibility(i);
        }
        VerticalSeekBar verticalSeekBar2 = this.f4195dm;
        if (verticalSeekBar2 != null) {
            verticalSeekBar2.setVisibility(i);
        }
        VerticalSeekBar verticalSeekBar3 = this.f4196dn;
        if (verticalSeekBar3 != null) {
            verticalSeekBar3.setVisibility(i);
        }
        VerticalSeekBar verticalSeekBar4 = this.f4197do;
        if (verticalSeekBar4 != null) {
            verticalSeekBar4.setVisibility(i);
        }
        VerticalSeekBar verticalSeekBar5 = this.f4198dp;
        if (verticalSeekBar5 != null) {
            verticalSeekBar5.setVisibility(i);
        }
        TextView textView = this.f4199dq;
        if (textView != null) {
            textView.setVisibility(i);
        }
        TextView textView2 = this.f4200dr;
        if (textView2 != null) {
            textView2.setVisibility(i);
        }
        TextView textView3 = this.f4201ds;
        if (textView3 != null) {
            textView3.setVisibility(i);
        }
        TextView textView4 = this.f4202dt;
        if (textView4 != null) {
            textView4.setVisibility(i);
        }
        TextView textView5 = this.f4203du;
        if (textView5 != null) {
            textView5.setVisibility(i);
        }
    }

    /* renamed from: j */
    private void m5933j(String str) {
        GlobalApplication globalApplication = this.f4214k;
        String str2 = f3974m;
        globalApplication.mo5229a(str2, "setBars(data: " + str);
        if (str != null && str.length() >= 3) {
            final String[] split = str.substring(2).split(" ");
            runOnUiThread(new Runnable() {
                public void run() {
                    String[] strArr = split;
                    if (strArr.length >= 6 && MainActivity.m5743a(strArr[5]) != null) {
                        MainActivity.this.m5935k(split[5]);
                        MainActivity.this.m5802aU();
                    }
                }
            });
            if (this.f4082bd == 0) {
                this.f4162dF = str;
            }
            if (!this.f4163dG) {
                this.f4214k.mo5229a(f3974m, "DID NOT SET BARS - !vBandBarsActive");
            } else if (this.f4164dH) {
                this.f4214k.mo5229a(f3974m, "DID NOT SET BARS - settingToCustomEQ");
            } else {
                runOnUiThread(new Runnable() {
                    public void run() {
                        String[] strArr = split;
                        if (!(strArr.length < 1 || MainActivity.m5743a(strArr[0]) == null || MainActivity.this.f4194dl == null)) {
                            MainActivity.this.f4194dl.setProgressAndThumb(MainActivity.this.m5732a(Integer.parseInt(split[0]), MainActivity.this.f4157dA, MainActivity.this.f4158dB));
                        }
                        String[] strArr2 = split;
                        if (!(strArr2.length < 2 || MainActivity.m5743a(strArr2[1]) == null || MainActivity.this.f4195dm == null)) {
                            MainActivity.this.f4195dm.setProgressAndThumb(MainActivity.this.m5732a(Integer.parseInt(split[1]), MainActivity.this.f4157dA, MainActivity.this.f4158dB));
                        }
                        String[] strArr3 = split;
                        if (!(strArr3.length < 3 || MainActivity.m5743a(strArr3[2]) == null || MainActivity.this.f4196dn == null)) {
                            MainActivity.this.f4196dn.setProgressAndThumb(MainActivity.this.m5732a(Integer.parseInt(split[2]), MainActivity.this.f4157dA, MainActivity.this.f4158dB));
                        }
                        String[] strArr4 = split;
                        if (!(strArr4.length < 4 || MainActivity.m5743a(strArr4[3]) == null || MainActivity.this.f4197do == null)) {
                            MainActivity.this.f4197do.setProgressAndThumb(MainActivity.this.m5732a(Integer.parseInt(split[3]), MainActivity.this.f4157dA, MainActivity.this.f4158dB));
                        }
                        String[] strArr5 = split;
                        if (strArr5.length >= 5 && MainActivity.m5743a(strArr5[4]) != null && MainActivity.this.f4198dp != null) {
                            MainActivity.this.f4198dp.setProgressAndThumb(MainActivity.this.m5732a(Integer.parseInt(split[4]), MainActivity.this.f4157dA, MainActivity.this.f4158dB));
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static Integer m5743a(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: bb */
    private boolean m5879bb() {
        if (!this.f4214k.minirigf3.minirigAudioModef4463c.equals(minirigStatusClass.minirigModeEnum.MONO_SUB) && !this.f4214k.minirigf3.minirigAudioModef4463c.equals(minirigStatusClass.minirigModeEnum.STEREO_TWO_SUBS) && !this.f4214k.minirigf3.minirigAudioModef4463c.equals(minirigStatusClass.minirigModeEnum.STEREO_ONE_SUB)) {
            return false;
        }
        return true;
    }

    /* renamed from: bc */
    private void m5880bc() {
        this.f4084bf.put("13", 0);
        this.f4084bf.put("12", 0);
        this.f4084bf.put("07", 7);
        this.f4083be.put("13", 0);
        this.f4083be.put("12", 0);
        this.f4083be.put("07", 4);
        this.f4085bg.put("01", 38);
        this.f4085bg.put("02", 46);
        this.f4085bg.put("03", 50);
        this.f4085bg.put("04", 54);
        this.f4085bg.put("05", 62);
        this.f4085bg.put("13", 5);
        this.f4085bg.put("12", 1);
        this.f4086bh.put("01", 50);
        this.f4086bh.put("02", 50);
        this.f4086bh.put("03", 50);
        this.f4086bh.put("04", 42);
        this.f4086bh.put("05", 30);
        this.f4086bh.put("13", 4);
        this.f4086bh.put("12", 0);
        this.f4087bi.put("01", 50);
        this.f4087bi.put("02", 50);
        this.f4087bi.put("03", 50);
        this.f4087bi.put("04", 42);
        this.f4087bi.put("05", 30);
        this.f4087bi.put("13", 3);
        this.f4087bi.put("12", 0);
        this.f4088bj.put("01", 50);
        this.f4088bj.put("02", 54);
        this.f4088bj.put("03", 58);
        this.f4088bj.put("04", 50);
        this.f4088bj.put("05", 46);
        this.f4088bj.put("07", 0);
        this.f4088bj.put("13", 0);
        this.f4088bj.put("12", 0);
        this.f4089bk.put("01", 50);
        this.f4089bk.put("02", 54);
        this.f4089bk.put("03", 58);
        this.f4089bk.put("04", 50);
        this.f4089bk.put("05", 46);
        this.f4089bk.put("07", 2);
        this.f4089bk.put("13", 0);
        this.f4089bk.put("12", 0);
    }

    /* renamed from: a */
    private void m5759a(boolean z) {
        if (m5868b(this.f4083be) || m5868b(this.f4084bf)) {
            if (z) {
                sendCommand(this.f4214k.f3958d.mo5467a("07", 4), this.f4214k.f3958d.f4394a);
            } else {
                sendCommand(this.f4214k.f3958d.mo5467a("07", 7), this.f4214k.f3958d.f4394a);
            }
        } else if (m5868b(this.f4086bh) || m5868b(this.f4087bi)) {
            if (z) {
                sendCommand(this.f4214k.f3958d.mo5467a("13", 4), this.f4214k.f3958d.f4394a);
            } else {
                sendCommand(this.f4214k.f3958d.mo5467a("13", 3), this.f4214k.f3958d.f4394a);
            }
        } else if (m5868b(this.f4088bj) || m5868b(this.f4089bk)) {
            if (z) {
                sendCommand(this.f4214k.f3958d.mo5467a("07", 0), this.f4214k.f3958d.f4394a);
            } else {
                sendCommand(this.f4214k.f3958d.mo5467a("07", 2), this.f4214k.f3958d.f4394a);
            }
        }
        if (z) {
            sendCommand(this.f4214k.f3958d.mo5467a("06", 0), this.f4214k.f3958d.f4394a);
        }
    }

    /* renamed from: a */
    private void m5758a(HashMap<String, Integer> hashMap) {
        int i;
        if (this.f4082bd > 0) {
            this.f4214k.mo5229a(f3974m, "in the middle of setting a preset");
            return;
        }
        String str = this.f4162dF;
        if (str != null && str.length() >= 10) {
            String[] split = this.f4162dF.substring(2).split(" ");
            this.f4160dD = "selectedSlot";
            if (hashMap == this.f4084bf || hashMap == this.f4083be) {
                this.f4164dH = true;
                i = 5;
                m5882be();
                int i2 = 0;
                for (String str2 : this.f4214k.f3957c.getString(this.f4161dE + "00", "50 50 50 50 50").split(" ")) {
                    split[i2] = str2;
                    i2++;
                }
            } else {
                sendCommand(this.f4214k.f3958d.mo5470b("00", 0), this.f4214k.f3958d.f4394a);
                i = 1;
            }
            for (Map.Entry next : hashMap.entrySet()) {
                i++;
                sendCommand(this.f4214k.f3958d.mo5467a((String) next.getKey(), ((Integer) next.getValue()).intValue()), this.f4214k.f3958d.f4394a);
                split[Integer.parseInt((String) next.getKey()) - 1] = ((Integer) next.getValue()).toString();
            }
            this.f4162dF = "q";
            for (String str3 : split) {
                if (str3.length() == 1) {
                    this.f4162dF += " 0" + str3;
                } else {
                    this.f4162dF += " " + str3;
                }
            }
            this.f4163dG = true;
            m5933j(this.f4162dF);
            if (!(hashMap == this.f4084bf || hashMap == this.f4083be)) {
                m5865b(false);
            }
            m5878ba();
            this.f4082bd = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5865b(final boolean z) {
        runOnUiThread(new Runnable() {
            public void run() {
                MainActivity.this.f4194dl.setEnabled(z);
                MainActivity.this.f4195dm.setEnabled(z);
                MainActivity.this.f4196dn.setEnabled(z);
                MainActivity.this.f4197do.setEnabled(z);
                MainActivity.this.f4198dp.setEnabled(z);
                if (z) {
                    boolean unused = MainActivity.this.f4163dG = true;
                    MainActivity.this.f4081bc.setBackgroundColor(0);
                    MainActivity.this.f4081bc.setAlpha(1.0f);
                    MainActivity.this.m5924g(0);
                    return;
                }
                boolean unused2 = MainActivity.this.f4163dG = false;
                MainActivity.this.f4081bc.setBackgroundResource(R.color.light_grey);
                MainActivity.this.m5924g(4);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m5868b(HashMap<String, Integer> hashMap) {
        if (this.f4162dF.equals("")) {
            return false;
        }
        String[] split = this.f4162dF.substring(2).split(" ");
        for (Map.Entry next : hashMap.entrySet()) {
            int parseInt = Integer.parseInt((String) next.getKey()) - 1;
            String num = Integer.toString(((Integer) next.getValue()).intValue());
            if (num.length() == 1) {
                num = "0" + num;
            }
            if (split.length <= parseInt) {
                return false;
            }
            if (parseInt > 4 && !split[parseInt].equals(num)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m5732a(int i, int[] iArr, int[] iArr2) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return iArr2[i2];
            }
        }
        return 50;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m5733a(int i, int[] iArr, C1226a[] aVarArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i > aVarArr[i2].f4390a && i <= aVarArr[i2].f4391b) {
                return iArr[i2];
            }
        }
        return iArr[Math.round((float) (iArr.length / 2))];
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m5731a(int i, int[] iArr) {
        return Math.round(((((float) (iArr[1] - iArr[0])) / 100.0f) * ((float) i)) + ((float) iArr[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public int m5860b(int i, int[] iArr) {
        return Math.round((((float) (i - iArr[0])) / ((float) (iArr[1] - iArr[0]))) * 100.0f);
    }

    public void setPreset(View view) {
        if (mo5284r()) {
            if (view.getTag().equals("00")) {
                this.f4215l.mo5543a(getResources().getString(R.string.helpPresetCustomTitle), getResources().getString(R.string.helpPresetCustomBody));
                if (m5879bb()) {
                    m5758a(this.f4083be);
                } else {
                    m5758a(this.f4084bf);
                }
                this.f4081bc.setAlpha(0.5f);
            } else if (view.getTag().equals("01")) {
                this.f4215l.mo5543a(getResources().getString(R.string.helpPresetLoudTitle), getResources().getString(R.string.helpPresetLoudBody));
                m5758a(this.f4085bg);
            }
            if (view.getTag().equals("02")) {
                this.f4215l.mo5543a(getResources().getString(R.string.helpPresetStudioTitle), getResources().getString(R.string.helpPresetStudioBody));
                if (m5879bb()) {
                    m5758a(this.f4086bh);
                } else {
                    m5758a(this.f4087bi);
                }
            }
            if (view.getTag().equals("03")) {
                this.f4215l.mo5543a(getResources().getString(R.string.helpPresetVoiceTitle), getResources().getString(R.string.helpPresetVoiceBody));
                if (m5879bb()) {
                    m5758a(this.f4088bj);
                } else {
                    m5758a(this.f4089bk);
                }
            }
        } else {
            SharedPreferences.Editor edit = this.f4214k.f3957c.edit();
            String str = this.f4160dD;
            edit.putString(str, view.getTag() + "").apply();
            m5881bd();
            runOnUiThread(new Runnable() {
                public void run() {
                    MainActivity.this.m5878ba();
                }
            });
        }
    }

    public void clickedEqLock(View view) {
        if (this.f4214k.minirigf3.mo5506i()) {
            if (mo5284r()) {
                sendCommand(this.f4214k.f3958d.mo5467a("06", 0), this.f4214k.f3958d.f4394a);
            } else {
                sendCommand("q p 06 00", "EQ_LOCK_ON");
            }
        } else if (!mo5284r()) {
            sendCommand("q p 06 01", "EQ_LOCK_OFF");
        } else if (m5879bb()) {
            mo5246b("Notice", "You can't lock the EQ while in a subwoofer configuration.");
        } else {
            sendCommand(this.f4214k.f3958d.mo5467a("06", 1), this.f4214k.f3958d.f4394a);
        }
        this.f4215l.mo5543a(getResources().getString(R.string.helpEQLockTitle), getResources().getString(R.string.helpEQLockBody));
        sendCommand("q p 00 50", "GET_EQ");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m5935k(String str) {
        this.f4214k.minirigf3.mo5522q(str);
    }

    /* renamed from: l */
    private void m5937l(String str) {
        String[] split = str.split(" ");
        if (split.length >= 7) {
            String str2 = this.f4161dE + this.f4214k.f3957c.getString(this.f4160dD, "00");
            String str3 = split[1] + " " + split[2] + " " + split[3] + " " + split[4] + " " + split[5];
            this.f4214k.mo5229a(f3974m, "- - - - SAVE KEY: " + str2);
            this.f4214k.mo5229a(f3974m, "- - - -SAVE Text: " + str3);
            this.f4214k.f3957c.edit().putString(str2, str3).apply();
            m5935k(split[6]);
        }
    }

    /* renamed from: bd */
    private void m5881bd() {
        SharedPreferences sharedPreferences = this.f4214k.f3957c;
        String[] split = sharedPreferences.getString(this.f4161dE + this.f4214k.f3957c.getString(this.f4160dD, "00"), "50 50 50 50 50").split(" ");
        sendCommand(this.f4214k.f3958d.mo5467a("01", Integer.parseInt(split[0])), this.f4214k.f3958d.f4394a);
        sendCommand(this.f4214k.f3958d.mo5467a("02", Integer.parseInt(split[1])), this.f4214k.f3958d.f4394a);
        sendCommand(this.f4214k.f3958d.mo5467a("03", Integer.parseInt(split[2])), this.f4214k.f3958d.f4394a);
        sendCommand(this.f4214k.f3958d.mo5467a("04", Integer.parseInt(split[3])), this.f4214k.f3958d.f4394a);
        sendCommand(this.f4214k.f3958d.mo5467a("05", Integer.parseInt(split[4])), this.f4214k.f3958d.f4394a);
    }

    /* renamed from: be */
    private void m5882be() {
        SharedPreferences sharedPreferences = this.f4214k.f3957c;
        String[] split = sharedPreferences.getString(this.f4161dE + "00", "50 50 50 50 50").split(" ");
        sendCommand(this.f4214k.f3958d.mo5467a("01", Integer.parseInt(split[0])), this.f4214k.f3958d.f4394a);
        sendCommand(this.f4214k.f3958d.mo5467a("02", Integer.parseInt(split[1])), this.f4214k.f3958d.f4394a);
        sendCommand(this.f4214k.f3958d.mo5467a("03", Integer.parseInt(split[2])), this.f4214k.f3958d.f4394a);
        sendCommand(this.f4214k.f3958d.mo5467a("04", Integer.parseInt(split[3])), this.f4214k.f3958d.f4394a);
        sendCommand(this.f4214k.f3958d.mo5467a("05", Integer.parseInt(split[4])), this.f4214k.f3958d.f4394a);
    }

    /* renamed from: bf */
    private void m5883bf() {
        this.f4090bl = findViewById(R.id.eq_presets_layout);
        this.f4165dI = (TextView) findViewById(R.id.presetDescription);
        sendCommand("q", "GET_EQ_MRBT2");
        m5884bg();
    }

    /* renamed from: bg */
    private void m5884bg() {
        this.f4166dJ = (ImageButton) findViewById(R.id.setDefinedPreset0);
        this.f4167dK = (ImageButton) findViewById(R.id.setDefinedPreset1);
        this.f4168dL = (ImageButton) findViewById(R.id.setDefinedPreset2);
        this.f4169dM = (ImageButton) findViewById(R.id.setDefinedPreset3);
        this.f4170dN = (ImageButton) findViewById(R.id.definedEqLock);
        runOnUiThread(new Runnable() {
            public void run() {
                MainActivity.this.m5887bj();
            }
        });
    }

    /* renamed from: bh */
    private void m5885bh() {
        if (this.f4214k.f3966l != null) {
            m5887bj();
            m5886bi();
        }
    }

    /* renamed from: bi */
    private void m5886bi() {
        runOnUiThread(new Runnable() {
            public void run() {
                if (MainActivity.this.f4214k.minirigf3.mo5506i()) {
                    MainActivity.this.f4170dN.setActivated(true);
                    MainActivity.this.f4170dN.setImageResource(R.drawable.eq_lock_on);
                    ImageButton ao = MainActivity.this.f4170dN;
                    ao.setContentDescription(MainActivity.this.getResources().getString(R.string.eqButton5Description) + " Currently on");
                    return;
                }
                MainActivity.this.f4170dN.setActivated(false);
                MainActivity.this.f4170dN.setImageResource(R.drawable.eq_lock_off);
                ImageButton ao2 = MainActivity.this.f4170dN;
                ao2.setContentDescription(MainActivity.this.getResources().getString(R.string.eqButton5Description) + " Currently off");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: bj */
    public void m5887bj() {
        runOnUiThread(new Runnable() {
            public void run() {
                MainActivity.this.f4165dI.setText("STANDARD");
                MainActivity.this.f4166dJ.setActivated(false);
                MainActivity.this.f4166dJ.setImageResource(R.drawable.eq_preset1_off);
                MainActivity.this.f4167dK.setActivated(false);
                MainActivity.this.f4167dK.setImageResource(R.drawable.eq_preset2_off);
                MainActivity.this.f4168dL.setActivated(false);
                MainActivity.this.f4168dL.setImageResource(R.drawable.eq_preset3_off);
                MainActivity.this.f4169dM.setActivated(false);
                MainActivity.this.f4169dM.setImageResource(R.drawable.eq_preset4_off);
                String string = MainActivity.this.f4214k.f3957c.getString(MainActivity.this.f4171dO, "1");
                GlobalApplication globalApplication = MainActivity.this.f4214k;
                String str = MainActivity.f3974m;
                globalApplication.mo5229a(str, "Refresh defin3ed EQ buttons: " + string);
                if (string.equals("0")) {
                    MainActivity.this.f4166dJ.setActivated(true);
                    MainActivity.this.f4166dJ.setImageResource(R.drawable.eq_preset1_on);
                    MainActivity.this.f4165dI.setText("STUDIO");
                }
                if (string.equals("2")) {
                    MainActivity.this.f4167dK.setActivated(true);
                    MainActivity.this.f4167dK.setImageResource(R.drawable.eq_preset2_on);
                    MainActivity.this.f4165dI.setText("VOICE");
                }
                if (string.equals("3")) {
                    MainActivity.this.f4168dL.setActivated(true);
                    MainActivity.this.f4168dL.setImageResource(R.drawable.eq_preset3_on);
                    MainActivity.this.f4165dI.setText("STANDARD + SUB");
                }
                if (string.equals("4")) {
                    MainActivity.this.f4169dM.setActivated(true);
                    MainActivity.this.f4169dM.setImageResource(R.drawable.eq_preset4_on);
                    MainActivity.this.f4165dI.setText("STUDIO + SUB");
                }
            }
        });
    }

    public void setDefinedPreset(View view) {
        String str = view.getTag() + "";
        if (this.f4214k.f3957c.getString(this.f4171dO, "1").equalsIgnoreCase(str)) {
            str = "1";
        }
        sendCommand(this.f4214k.f3958d.mo5471c(str), this.f4214k.f3958d.f4394a);
        this.f4214k.f3957c.edit().putString(this.f4171dO, str).apply();
        m5887bj();
    }

    public void clickedDefinedEqLock(View view) {
        if (this.f4214k.minirigf3.mo5506i()) {
            sendCommand("q5", "DEFINED_EQ_LOCK_ON");
        } else {
            sendCommand("q6", "DEFINED_EQ_LOCK_OFF");
        }
        sendCommand("q", "GET_EQ_MRBT2");
    }

    /* renamed from: m */
    private void m5939m(String str) {
        this.f4214k.minirigf3.mo5522q(str);
    }

    /* renamed from: n */
    private void m5941n(String str) {
        if (str != null && str.length() == 3) {
            String substring = str.substring(1, 2);
            String substring2 = str.substring(2, 3);
            this.f4214k.f3957c.edit().putString(this.f4171dO, substring).apply();
            this.f4214k.f3957c.edit().putString(this.f4172dP, substring2).apply();
            m5939m(substring2);
            m5887bj();
        }
    }

    /* renamed from: bk */
    private void m5888bk() {
        this.f4098bt = false;
        if (this.f4214k.f3966l != null) {
            if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG3) {
                this.f4098bt = true;
            }
            if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI2) {
                try {
                    if (Integer.parseInt(this.f4214k.f3966l.f4407i.trim()) >= 9) {
                        this.f4098bt = true;
                    }
                } catch (NumberFormatException e) {
                    PrintStream printStream = System.out;
                    printStream.println("NumberFormatException: " + e.getMessage());
                }
            }
        }
        this.f4099bu.clear();
        int i = 3;
        if (this.f4214k.f3966l == null || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI2) {
            this.f4099bu.put(0, C1266b.C1270b.HELP_MODE);
            this.f4099bu.put(1, C1266b.C1270b.POWER_SAVING);
            if (this.f4098bt) {
                this.f4099bu.put(2, C1266b.C1270b.GAIN_REMEMBERING);
            } else {
                i = 2;
            }
            this.f4099bu.put(Integer.valueOf(i), C1266b.C1270b.WIRELESS_STEREO);
            int i2 = i + 1;
            this.f4099bu.put(Integer.valueOf(i2), C1266b.C1270b.PAUSE_PLAY);
            int i3 = i2 + 1;
            this.f4099bu.put(Integer.valueOf(i3), C1266b.C1270b.SKIP_TRACK);
            int i4 = i3 + 1;
            this.f4099bu.put(Integer.valueOf(i4), C1266b.C1270b.AUTO_OFF);
            int i5 = i4 + 1;
            this.f4099bu.put(Integer.valueOf(i5), C1266b.C1270b.STAND_BY);
            int i6 = i5 + 1;
            this.f4099bu.put(Integer.valueOf(i6), C1266b.C1270b.AUX_POWER_SAVING);
            int i7 = i6 + 1;
            this.f4099bu.put(Integer.valueOf(i7), C1266b.C1270b.DIM_LED);
            int i8 = i7 + 1;
            this.f4099bu.put(Integer.valueOf(i8), C1266b.C1270b.VU_LED);
            int i9 = i8 + 1;
            this.f4099bu.put(Integer.valueOf(i9), C1266b.C1270b.TONES);
            int i10 = i9 + 1;
            this.f4099bu.put(Integer.valueOf(i10), C1266b.C1270b.CLEAR_PAIRED);
            int i11 = i10 + 1;
            this.f4099bu.put(Integer.valueOf(i11), C1266b.C1270b.RESET);
            this.f4099bu.put(Integer.valueOf(i11 + 1), C1266b.C1270b.DEBUG);
        } else if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG3) {
            this.f4099bu.put(0, C1266b.C1270b.HELP_MODE);
            this.f4099bu.put(1, C1266b.C1270b.POWER_SAVING);
            if (this.f4098bt) {
                this.f4099bu.put(2, C1266b.C1270b.GAIN_REMEMBERING);
            } else {
                i = 2;
            }
            this.f4099bu.put(Integer.valueOf(i), C1266b.C1270b.WIRELESS_STEREO);
            int i12 = i + 1;
            this.f4099bu.put(Integer.valueOf(i12), C1266b.C1270b.PAUSE_PLAY);
            int i13 = i12 + 1;
            this.f4099bu.put(Integer.valueOf(i13), C1266b.C1270b.SKIP_TRACK);
            int i14 = i13 + 1;
            this.f4099bu.put(Integer.valueOf(i14), C1266b.C1270b.AUTO_OFF);
            int i15 = i14 + 1;
            this.f4099bu.put(Integer.valueOf(i15), C1266b.C1270b.STAND_BY);
            int i16 = i15 + 1;
            this.f4099bu.put(Integer.valueOf(i16), C1266b.C1270b.AUX_POWER_SAVING);
            int i17 = i16 + 1;
            this.f4099bu.put(Integer.valueOf(i17), C1266b.C1270b.DIM_LED);
            int i18 = i17 + 1;
            this.f4099bu.put(Integer.valueOf(i18), C1266b.C1270b.VU_LED);
            int i19 = i18 + 1;
            this.f4099bu.put(Integer.valueOf(i19), C1266b.C1270b.TONES);
            int i20 = i19 + 1;
            this.f4099bu.put(Integer.valueOf(i20), C1266b.C1270b.ENABLE_POWER_OUT);
            int i21 = i20 + 1;
            this.f4099bu.put(Integer.valueOf(i21), C1266b.C1270b.CLEAR_PAIRED);
            int i22 = i21 + 1;
            this.f4099bu.put(Integer.valueOf(i22), C1266b.C1270b.RESET);
            this.f4099bu.put(Integer.valueOf(i22 + 1), C1266b.C1270b.DEBUG);
        } else {
            this.f4099bu.put(0, C1266b.C1270b.HELP_MODE);
            this.f4099bu.put(1, C1266b.C1270b.WIRELESS_STEREO);
            if (this.f4098bt) {
                this.f4099bu.put(2, C1266b.C1270b.GAIN_REMEMBERING);
            } else {
                i = 2;
            }
            this.f4099bu.put(Integer.valueOf(i), C1266b.C1270b.PAUSE_PLAY);
            int i23 = i + 1;
            this.f4099bu.put(Integer.valueOf(i23), C1266b.C1270b.SKIP_TRACK);
            int i24 = i23 + 1;
            this.f4099bu.put(Integer.valueOf(i24), C1266b.C1270b.AUTO_OFF);
            int i25 = i24 + 1;
            this.f4099bu.put(Integer.valueOf(i25), C1266b.C1270b.AUX_POWER_SAVING);
            int i26 = i25 + 1;
            this.f4099bu.put(Integer.valueOf(i26), C1266b.C1270b.DIM_LED);
            int i27 = i26 + 1;
            this.f4099bu.put(Integer.valueOf(i27), C1266b.C1270b.VU_LED);
            int i28 = i27 + 1;
            this.f4099bu.put(Integer.valueOf(i28), C1266b.C1270b.TONES);
            int i29 = i28 + 1;
            this.f4099bu.put(Integer.valueOf(i29), C1266b.C1270b.CLEAR_PAIRED);
            int i30 = i29 + 1;
            this.f4099bu.put(Integer.valueOf(i30), C1266b.C1270b.RESET);
            this.f4099bu.put(Integer.valueOf(i30 + 1), C1266b.C1270b.DEBUG);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5757a(String str, String str2, boolean z) {
        this.f4094bp.add(str);
        this.f4095bq.add(str2);
        this.f4096br.add(Boolean.valueOf(z));
    }

    /* renamed from: bl */
    private void m5889bl() {
        this.f4091bm = findViewById(R.id.settings_list_layout);
        m5888bk();
        this.f4094bp.clear();
        this.f4095bq.clear();
        this.f4096br.clear();
        m5757a("Help mode", "Helpful information will be displayed when you click on buttons.\n", this.f4215l.mo5544a());
        if (this.f4214k.f3966l == null) {
            m5757a("Power saving mode", "Reduces bass and maximum volume. Use this to extend battery life or to reduce bass at lower volumes.\n", this.f4214k.minirigf3.getHasBLE_StandByEnabledCode());
        } else if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI2 || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG3) {
            m5757a("Power saving mode", "Reduces bass and maximum volume. Use this to extend battery life or to reduce bass at lower volumes.\n", this.f4214k.minirigf3.getHasBLE_StandByEnabledCode());
        }
        if (this.f4098bt) {
            m5757a("REMEMBER GAIN", "The Minirig will not always start in high gain and instead, recall the gain setting from when it was last turned off.\n", this.f4214k.minirigf3.mo5510k());
        }
        m5757a("Wireless stereo lock", "Lock these two devices together so they automatically connect in wireless stereo when powered on.", this.f4214k.minirigf3.getIsInLockedMode());
        m5757a("Pause/Play", "If enabled, a single button press will play or pause the track. You must use the app to change gain.", this.f4214k.minirigf3.getIsSingleButtonPressMediaControl());
        m5757a("Skip track", "If enabled, a double button press will skip to the next track. You must use the app for TWS pairing.", this.f4214k.minirigf3.getIsDoubleButtonPressMediaControlCode());
        m5757a("Turn off automatically", "If enabled, the Minirig will turn off after half an hour when no music is playing.", this.f4214k.minirigf3.getInactivitySwitchOff());
        if (this.f4214k.f3966l != null && (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI2 || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG3)) {
            m5757a("Stand by mode", "If enabled, the Minirig will go into stand by when turned off. You can then remotely switch it on using this app.\n", this.f4214k.minirigf3.getHasBLE_StandByEnabledCode());
        }
        m5757a("AUX mode power saving", "If enabled, the Minirig will automatically turn off the amplifier and save power if no signal is detected.", this.f4214k.minirigf3.getAuxPowerSavingEnabled());
        m5757a("Dim LED", "Just dims the LED a bit as it can be a little distracting sometimes in the dark.", this.f4214k.minirigf3.getHasNightmode());
        m5757a("VU LED", "The LED will beat in time with the music, just for fun.", this.f4214k.minirigf3.f4470j);
        m5757a("Tones", "Disables or enables all tones.", this.f4214k.minirigf3.getIsTonesEnabled());
        if (this.f4214k.f3966l != null && this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG3) {
            m5757a("Enable power out", getApplicationContext().getString(R.string.enablePowerOutDescription) + "\n", true);
        }
        m5757a("Clear paired devices", getApplicationContext().getString(R.string.clearPairedDescription) + "\n", true);
        m5757a("Factory reset", "Reset your minirig to the default settings.", true);
        if (this.f4214k.f3956b) {
            m5757a("Debug screen", "Open debugging screen.", true);
        }
        this.f4092bn = (ListView) findViewById(R.id.listView);
        this.f4093bo = new C1266b(this, this.f4094bp, this.f4095bq, this.f4096br, this.f4099bu);
        runOnUiThread(new Runnable() {
            public void run() {
                MainActivity.this.f4092bn.setAdapter(MainActivity.this.f4093bo);
            }
        });
        this.f4097bs = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: bm */
    public void m5890bm() {
        if (!this.f4097bs) {
            m5889bl();
        }
        if (this.f4214k.f3966l != null) {
            this.f4096br.set(this.f4093bo.mo5580a(C1266b.C1270b.HELP_MODE), Boolean.valueOf(this.f4215l.mo5544a()));
            if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI2 || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG3) {
                this.f4096br.set(this.f4093bo.mo5580a(C1266b.C1270b.POWER_SAVING), Boolean.valueOf(this.f4214k.minirigf3.mo5504h()));
            }
            if (this.f4098bt) {
                this.f4096br.set(this.f4093bo.mo5580a(C1266b.C1270b.GAIN_REMEMBERING), Boolean.valueOf(this.f4214k.minirigf3.mo5510k()));
            }
            this.f4096br.set(this.f4093bo.mo5580a(C1266b.C1270b.WIRELESS_STEREO), Boolean.valueOf(this.f4214k.minirigf3.getIsInLockedMode()));
            this.f4096br.set(this.f4093bo.mo5580a(C1266b.C1270b.PAUSE_PLAY), Boolean.valueOf(this.f4214k.minirigf3.getIsSingleButtonPressMediaControl()));
            this.f4096br.set(this.f4093bo.mo5580a(C1266b.C1270b.SKIP_TRACK), Boolean.valueOf(this.f4214k.minirigf3.getIsDoubleButtonPressMediaControlCode()));
            this.f4096br.set(this.f4093bo.mo5580a(C1266b.C1270b.AUTO_OFF), Boolean.valueOf(this.f4214k.minirigf3.getInactivitySwitchOff()));
            if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI2 || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG3) {
                this.f4096br.set(this.f4093bo.mo5580a(C1266b.C1270b.STAND_BY), Boolean.valueOf(this.f4214k.minirigf3.getHasBLE_StandByEnabledCode()));
            }
            this.f4096br.set(this.f4093bo.mo5580a(C1266b.C1270b.AUX_POWER_SAVING), Boolean.valueOf(this.f4214k.minirigf3.getAuxPowerSavingEnabled()));
            this.f4096br.set(this.f4093bo.mo5580a(C1266b.C1270b.DIM_LED), Boolean.valueOf(this.f4214k.minirigf3.getHasNightmode()));
            this.f4096br.set(this.f4093bo.mo5580a(C1266b.C1270b.VU_LED), Boolean.valueOf(this.f4214k.minirigf3.f4470j));
            this.f4096br.set(this.f4093bo.mo5580a(C1266b.C1270b.TONES), Boolean.valueOf(this.f4214k.minirigf3.getIsTonesEnabled()));
            runOnUiThread(new Runnable() {
                public void run() {
                    MainActivity.this.f4093bo.notifyDataSetChanged();
                }
            });
        }
    }

    /* renamed from: v */
    public void mo5294v() {
        new AlertDialog.Builder(this).setTitle("Reset device?").setMessage("Would you like to peform a factory reset on your speaker? This will restore everything to default.").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (MainActivity.this.f4214k.f3964j.f4685f != null) {
                    MainActivity.this.f4214k.f3964j.f4685f.f4690D++;
                }
                MainActivity.this.sendCommand("*", "RESET");
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setIcon(17301543).show();
    }

    /* renamed from: w */
    public void mo5295w() {
        if (this.f4214k.minirigf3.powerStatef4468h == minirigStatusClass.powerStateEnum.POWER_OUT) {
            mo5246b("Notice", "Already charging out. ");
        } else {
            new AlertDialog.Builder(this).setTitle("Enable power out?").setMessage(R.string.enablePowerOutDescription).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (MainActivity.this.f4214k.f3964j.f4685f != null) {
                        MainActivity.this.f4214k.f3964j.f4685f.f4688B++;
                    }
                    MainActivity.this.sendCommand("^", "ENABLE_POWER_OUT");
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).setIcon(17301543).show();
        }
    }

    /* renamed from: x */
    public void mo5296x() {
        new AlertDialog.Builder(this).setTitle("Clear paired devices?").setMessage(R.string.enablePowerOutDescription).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (MainActivity.this.f4214k.f3964j.f4685f != null) {
                    MainActivity.this.f4214k.f3964j.f4685f.f4689C++;
                }
                MainActivity.this.sendCommand("N UNPAIR", "CLEAR_PAIRED");
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setIcon(17301543).show();
    }

    /* renamed from: bn */
    private void m5891bn() {
        this.f4100bv = findViewById(R.id.soundcloud_view);
        this.f4101bw = (WebView) findViewById(R.id.soundcloud_webview);
        String str = this.f4102bx;
        this.f4101bw.setVisibility(0);
        this.f4101bw.getSettings().setJavaScriptEnabled(true);
        this.f4101bw.getSettings().setLoadWithOverviewMode(true);
        this.f4101bw.getSettings().setUseWideViewPort(true);
    }

    /* renamed from: a */
    private void m5756a(String str, String str2, Integer num) {
        this.f4058bF.add(str);
        this.f4059bG.add(str2);
        this.f4060bH.add(num);
    }

    /* renamed from: bo */
    private void m5892bo() {
        this.f4091bm = findViewById(R.id.settings_list_layout);
        this.f4104bz = findViewById(R.id.about_layout);
        this.f4055bC = (TextView) findViewById(R.id.about_text);
        m5756a("New music", "Discover new music with exclusive\nMinirig mixes from some of the best artists\naround the world, great to play\nthrough your Minirig Speaker", Integer.valueOf(R.drawable.soundcloud_icon));
        m5756a("Like us on Facebook", "Share your Minirig stories and be part\nof the Minirig community HERE", Integer.valueOf(R.drawable.facebook_icon));
        m5756a("Share your pics", "Is there a Minirig moment you just need\nto share? send it on over to our Instagram\npage.", Integer.valueOf(R.drawable.instagram_icon));
        m5756a("Speaker guide", "Discover what your Minirig is capable\nof by having a read through the instruction\nManual.", Integer.valueOf(R.drawable.minirig_guide_icon));
        m5756a("Support", "If you are having any issues with your\nMinirig products head on over to the\nMinirig support page so we can resolve\nthe issue as quick as possible", Integer.valueOf(R.drawable.support_icon));
        m5756a("About", "View information about the app\nand your connected minirig\n", Integer.valueOf(R.drawable.about_icon));
        this.f4056bD = (ListView) findViewById(R.id.infoListView);
        this.f4057bE = new C1263a(this, this.f4058bF, this.f4059bG, this.f4060bH);
        this.f4056bD.setAdapter(this.f4057bE);
        this.f4053bA = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.info_footer, (ViewGroup) null, false);
        this.f4054bB = (TextView) findViewById(R.id.deviceInfo);
        this.f4056bD.addFooterView(this.f4053bA);
        this.f4061bI = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: bp */
    public void m5893bp() {
        this.f4103by = findViewById(R.id.info_layout);
        this.f4054bB = (TextView) findViewById(R.id.deviceInfo);
    }

    /* renamed from: y */
    public void mo5297y() {
        if (m5762a("com.soundcloud.android", getApplicationContext().getPackageManager())) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://soundcloud.com/minirigs")));
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://minirigs.co.uk/minirigmixtape"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            mo5246b("Unable to open", "No application found on your device to open this link.");
        }
    }

    /* renamed from: a */
    private boolean m5762a(String str, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: z */
    public void mo5298z() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://en-gb.facebook.com/Minirigs.co.uk/"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            mo5246b("Unable to open", "No application found on your device to open this link.");
        }
    }

    /* renamed from: A */
    public void mo5232A() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/minirigs/"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            mo5246b("Unable to open", "No application found on your device to open this link.");
        }
    }

    /* renamed from: B */
    public void mo5233B() {
        if (this.f4214k.f3966l == null) {
            mo5245b("https://files.minirigs.co.uk/bluetooth-portable-speaker/Minirig-Users-Guide-MRBT2.pdf");
        } else if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG2 || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG1) {
            mo5245b("https://files.minirigs.co.uk/bluetooth-portable-speaker/Minirig-Users-Guide-MRBT2.pdf");
        } else if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI || this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIMINI2) {
            mo5245b("https://files.minirigs.co.uk/minirig-mini/MRM-user-guide.pdf");
        } else if (this.f4214k.f3966l.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG3) {
            mo5245b("https://files.minirigs.co.uk/bluetooth-portable-speaker/Minirig-User-Guide-MRBT3.pdf");
        }
    }

    /* renamed from: b */
    public void mo5245b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(str), "application/pdf");
        PackageManager packageManager = getPackageManager();
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent2.resolveActivity(packageManager) != null) {
            startActivity(intent2);
            return;
        }
        this.f4214k.mo5229a(f3974m, "No Intent available to handle action");
        mo5246b("Unable to open", "No application found on your device to open this link.");
    }

    /* renamed from: C */
    public void mo5234C() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://minirigs.co.uk/support"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            mo5246b("Unable to open", "No application found on your device to open this link.");
        }
    }

    /* renamed from: bq */
    private void m5894bq() {
        String str;
        if (this.f4214k.f3966l != null) {
            String str2 = ("" + "<b>App version:</b> 0.9.7<br /><br />") + "<b>Name:</b> " + this.f4214k.f3966l.f4403e + "<br />";
            if (this.f4214k.f3965k.containsKey(this.f4214k.f3966l.f4406h)) {
                str = str2 + "<b>Model:</b> " + this.f4214k.f3965k.get(this.f4214k.f3966l.f4406h) + "<br />";
            } else {
                str = str2 + "<b>Model:</b> " + this.f4214k.f3966l.minirigType + "<br />";
            }
            final String str3 = (str + "<b>Software version:</b> " + this.f4214k.f3966l.f4407i + "<br />") + "<b>Total playtime:</b> " + C1229d.m6011c(this.f4214k.f3960f.f4434f + this.f4214k.f3960f.f4436h + this.f4214k.f3960f.f4440l + this.f4214k.f3960f.f4438j) + "<br />";
            if (this.f4214k.f3956b) {
                str3 = (((((((((((((((((((((((((((((((str3 + "<br />") + "<b>Colour:</b> " + this.f4214k.f3966l.ledColorStr + "<br />") + "<b>Product type:</b> " + this.f4214k.f3966l.f4406h + "<br />") + "<b>Hardware version:</b> " + this.f4214k.f3966l.f4414p + "<br />") + "<b>Bluetooth version:</b> " + this.f4214k.f3966l.f4416r + "<br />") + "<b>Bootloader version:</b> " + this.f4214k.f3966l.f4417s + "<br />") + "<b>Manufacture date:</b> " + this.f4214k.f3966l.f4418t) + "<br /><br />") + "<b>Time since last charge:</b> " + this.f4214k.f3961g.mo5472a(this.f4214k.f3960f.f4431c) + "<br />") + "<b>Time in standby since last charge:</b> " + this.f4214k.f3961g.mo5472a(this.f4214k.f3960f.f4432d) + "<br />") + "<b>Time in standalone:</b> " + this.f4214k.f3960f.f4433e + "<br />") + "<b>Time in standalone with sub:</b> " + this.f4214k.f3960f.f4435g + "<br />") + "<b>Time in TWS:</b> " + this.f4214k.f3960f.f4437i + "<br />") + "<b>Time in AUX:</b> " + this.f4214k.f3960f.f4439k + "<br />") + "<b>Time on standby:</b> " + this.f4214k.f3960f.f4441m + "<br />") + "<b>Time on charge:</b> " + this.f4214k.f3960f.f4443o + "<br />") + "<b>Discharge cycles:</b> " + this.f4214k.f3960f.f4445q + "<br />") + "<b>Discharge minutes:</b> " + this.f4214k.f3960f.f4446r + "<br />") + "<b>Long button presses:</b> " + this.f4214k.f3960f.f4447s + "<br />") + "<b>Gain changes:</b> " + this.f4214k.f3960f.f4448t + "<br />") + "<b>TWS starts:</b> " + this.f4214k.f3960f.f4449u + "<br />") + "<b>Power out used:</b> " + this.f4214k.f3960f.f4451w + "<br />") + "<b>Media controls used:</b> " + this.f4214k.f3960f.f4450v + "<br />") + "<b>Jacks inserted:</b> " + this.f4214k.f3960f.f4452x + "<br />") + "<b>Charge cables inserted:</b> " + this.f4214k.f3960f.f4453y + "<br />") + "<b>Resets:</b> " + this.f4214k.f3960f.f4454z + "<br />") + "<b>Power outs used (new):</b> " + this.f4214k.f3960f.f4420A + "<br />") + "<b>Linkup receiver starts:</b> " + this.f4214k.f3960f.f4421B + "<br />") + "<b>Linkup transmitter starts:</b> " + this.f4214k.f3960f.f4422C + "<br />") + "<b>Time in power out:</b> " + this.f4214k.f3960f.f4424E + "<br />") + "<b>Time as receiver:</b> " + this.f4214k.f3960f.f4426G + "<br />") + "<b>Time as transmitter:</b> " + this.f4214k.f3960f.f4428I + "<br />";
            }
            runOnUiThread(new Runnable() {
                public void run() {
                    if (MainActivity.this.f4054bB != null) {
                        MainActivity.this.f4054bB.setText("");
                    }
                    if (MainActivity.this.f4055bC != null) {
                        MainActivity.this.f4055bC.setText(Html.fromHtml(str3));
                    }
                }
            });
        }
    }

    /* renamed from: br */
    private void m5895br() {
        this.f4062bJ = findViewById(R.id.debug_layout);
        this.f4063bK = (TextView) findViewById(R.id.receivedData);
        this.f4064bL = (TextView) findViewById(R.id.debugLog);
        this.f4064bL.setMovementMethod(new ScrollingMovementMethod());
        ((EditText) findViewById(R.id.etSendData)).setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                MainActivity.this.sendCommand(textView.getText().toString(), "DEBUG_CUSTOM_SEND");
                return true;
            }
        });
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.minirig.android.MainActivity] */
    public void setView(View view) {
        if (!this.f4143cm) {
            m5710P();
            View view2 = this.f4065bM;
            if (view2 != null) {
                this.f4066bN = view2;
                view2.setVisibility(8);
            }
            if (view == this.f4050ax) {
                View view3 = this.f4066bN;
                if (view3 == this.f4001aA || view3 == this.f4002aB) {
                    if (this.f4214k.minirigf3.mo5494c() || this.f4214k.minirigf3.mo5500f() || this.f4214k.minirigf3.mo5498e()) {
                        view = this.f4046at;
                    }
                } else if (this.f4214k.minirigf3.mo5494c()) {
                    view = this.f4001aA;
                } else if (this.f4214k.minirigf3.mo5500f() || this.f4214k.minirigf3.mo5498e()) {
                    view = this.f4002aB;
                }
            }
            if (view == this.f4136cf) {
                if (this.f4221s) {
                    m5873bE();
                }
                this.f4224v = false;
                this.f4213ee = false;
                this.f4223u = false;
                this.f4162dF = "";
                this.f4008aH = "";
                this.f4214k.f3962h.f4393b = 0;
                this.f4097bs = false;
                if (this.f4214k.f3956b) {
                    m5898bu();
                }
                if (this.f4227y == null) {
                    m5820ag();
                }
            } else if (view == this.f4028ab) {
                m5876bH();
                m5841aq();
                this.f4151cu.setSelected(true);
                mo5272k();
                mo5273l();
                sendCommand("B", "GET_BATTERY");
                this.f4115cK = false;
                if (this.f4224v) {
                    m5823ah();
                } else if (this.f4214k.f3966l != null && mo5284r()) {
                    m5823ah();
                }
                if (this.f4214k.f3964j.f4685f != null && this.f4214k.f3964j.f4685f.f4727b == 0) {
                    this.f4214k.f3964j.f4683c.mo5589a();
                } else if (this.f4214k.f3964j.f4685f != null && this.f4214k.f3964j.f4685f.f4727b == 1) {
                    if (!this.f4214k.f3960f.f4430b) {
                        sendCommand("o", "GET_RUNTIME_DATA");
                        sendCommand("/", "GET_RUNTIME_DATA2");
                    } else if (!(this.f4214k.f3966l == null || this.f4214k.f3960f.f4433e == null || this.f4214k.f3966l.f4414p.equals("Unknown"))) {
                        this.f4214k.f3964j.f4683c.mo5590b();
                    }
                }
                this.f4215l.mo5546c();
            } else if (view == this.f4009aI) {
                mo5285s();
            } else if (view == this.f4079ba) {
                m5803aV();
            } else if (view == this.f4090bl) {
                sendCommand("q", "GET_EQ_MRBT2");
            } else if (view == this.f4103by) {
                m5894bq();
                sendCommand("o", "GET_RUNTIME_DATA");
                sendCommand("/", "GET_RUNTIME_DATA2");
            }
            if (view == this.f3996V) {
                this.f3998X.start();
            } else {
                this.f3998X.stop();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0, 0.0f);
            if (view == this.f4028ab) {
                m5877bI();
                if (this.f4214k.f3966l == null && this.f4224v) {
                    this.f4150ct.setEnabled(false);
                    this.f4150ct.setText("Demo mode");
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4028ab, layoutParams);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                m5896bs();
            } else if (view == this.f4091bm) {
                this.f4150ct.setText("Settings");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4091bm, layoutParams);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                m5897bt();
            } else if (view == this.f4079ba) {
                this.f4150ct.setText("5 BAND EQ");
                sendCommand("q p 00 50", "GET_EQ");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4079ba, layoutParams);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                m5896bs();
            } else if (view == this.f4010aJ) {
                this.f4150ct.setText("AUDIO CONFIGURATION");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4010aJ, layoutParams);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                mo5289t();
                m5897bt();
                if (this.f4214k.f3966l != null && this.f4214k.minirigf3.isTwsConnected()) {
                    m5794aP();
                }
            } else if (view == this.f4018aR) {
                this.f4150ct.setText("AUDIO CONFIGURATION");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4018aR, layoutParams);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                m5896bs();
            } else if (view == this.f4090bl) {
                this.f4150ct.setText("EQ");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4090bl, layoutParams);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                m5896bs();
            } else if (view == this.f4009aI) {
                this.f4150ct.setText("LEVELS");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4009aI, layoutParams);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                m5896bs();
                if (this.f4214k.f3966l != null && this.f4214k.minirigf3.isTwsConnected()) {
                    m5794aP();
                }
            } else if (view == this.f4103by) {
                this.f4150ct.setText("Links");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4103by, layoutParams);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                m5897bt();
            } else if (view == this.f4104bz) {
                this.f4150ct.setText("About");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4104bz, layoutParams);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                m5897bt();
            } else if (view == this.f4037ak) {
                this.f4150ct.setText("AUDIO CONFIGURATION");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                m5849au();
                this.f4029ac.setVisibility(0);
                m5747a(this.f4037ak, layoutParams);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                m5897bt();
            } else if (view == this.f4046at) {
                this.f4150ct.setText("LINKUP MODE");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4046at, layoutParams);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                m5897bt();
            } else if (view == this.f4050ax) {
                this.f4150ct.setText("LINK UP");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4050ax, layoutParams);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                m5897bt();
            } else if (view == this.f4001aA) {
                this.f4150ct.setText("LINK UP");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4001aA, layoutParams);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5897bt();
            } else if (view == this.f4002aB) {
                this.f4150ct.setText("LINK UP");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4002aB, layoutParams);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5897bt();
            } else if (view == this.f4100bv) {
                this.f4150ct.setText("MIXTAPES");
                if (this.f4214k.f3966l != null) {
                    this.f4150ct.setEnabled(false);
                }
                if (!this.f4173dQ) {
                    this.f4101bw.loadUrl("https://minirigs.co.uk/soundcloud.html");
                    this.f4173dQ = true;
                }
                this.f4029ac.setVisibility(0);
                m5747a(this.f4100bv, layoutParams);
                m5747a(this.f4037ak, layoutParams2);
                m5747a(this.f4103by, layoutParams2);
                m5747a(this.f4079ba, layoutParams2);
                m5747a(this.f4090bl, layoutParams2);
                m5747a(this.f4009aI, layoutParams2);
                m5747a(this.f4010aJ, layoutParams2);
                m5747a(this.f4018aR, layoutParams2);
                m5747a(this.f4091bm, layoutParams2);
                m5747a(this.f4028ab, layoutParams2);
                m5747a(this.f4104bz, layoutParams2);
                m5747a(this.f4046at, layoutParams2);
                m5747a(this.f4050ax, layoutParams2);
                m5747a(this.f4001aA, layoutParams2);
                m5747a(this.f4002aB, layoutParams2);
                m5897bt();
                m5827aj();
            } else {
                this.f4029ac.setVisibility(8);
            }
            this.f4065bM = view;
            if (view == this.f4028ab && this.f4214k.f3966l != null) {
                m5818af();
                this.f4150ct.setEnabled(true);
                this.f4150ct.clearFocus();
            }
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    private void m5747a(View view, LinearLayout.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        } else {
            this.f4214k.mo5229a(f3974m, "THE V|IEW WAS NULL");
        }
    }

    /* renamed from: bs */
    private void m5896bs() {
        ((RelativeLayout) findViewById(R.id.media_info)).setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 2.0f));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.main_frame);
        ConstraintLayout.C0136a aVar = (ConstraintLayout.C0136a) linearLayout.getLayoutParams();
        aVar.f386y = "1:1";
        linearLayout.setLayoutParams(aVar);
    }

    /* renamed from: bt */
    private void m5897bt() {
        DisplayMetrics displayMetrics = getApplicationContext().getResources().getDisplayMetrics();
        String valueOf = String.valueOf((((float) displayMetrics.heightPixels) / ((float) displayMetrics.widthPixels)) * 0.699f);
        if (valueOf.length() > 5) {
            valueOf = valueOf.substring(0, 4);
        }
        ((RelativeLayout) findViewById(R.id.media_info)).setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 0.0f));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.main_frame);
        ConstraintLayout.C0136a aVar = (ConstraintLayout.C0136a) linearLayout.getLayoutParams();
        aVar.f386y = "1:" + valueOf;
        linearLayout.setLayoutParams(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: bu */
    public void m5898bu() {
        Button button = (Button) findViewById(R.id.refresh);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) button.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.addRule(9);
        button.setLayoutParams(layoutParams);
        ((Button) findViewById(R.id.demoMode)).setVisibility(0);
    }

    public void openInDemoMode(View view) {
        this.f4224v = true;
        m5899bv();
        setView(this.f4028ab);
        this.f3996V.setVisibility(8);
    }

    /* renamed from: bv */
    private void m5899bv() {
        m5804aW();
        if (!this.f4097bs) {
            m5889bl();
        }
        m5893bp();
        m5847at();
        m5895br();
        m5789aN();
        m5788aM();
        m5795aQ();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo5235D() {
        return C0391a.m1619a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo5236E() {
        C0414a.m1722a(this, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, 0);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 0) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                if (C0414a.m1723a(this, "android.permission.ACCESS_COARSE_LOCATION")) {
                    new C1225a(this).setTitle("Permission required").setMessage("Bluetooth scanning in Android 6.0+ requires access to your coarse location, please approve the request.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            MainActivity.this.mo5236E();
                        }
                    }).show();
                    return;
                }
                Toast.makeText(this, "This application cannot run without the coarse  location permission enabled. Please turn it on in the Settings screen before using the app.", 1).show();
                finish();
            } else if (this.f4180dX.isEnabled()) {
                setView(this.f3996V);
                m5871bC();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: bw */
    public void m5900bw() {
        this.f4214k.mo5229a(f3974m, "Use bluetooth to connect");
        m5923f("Use your Bluetooth settings to\nconnect to your device.");
        this.f4000Z.setVisibility(0);
        this.f4027aa.setVisibility(0);
    }

    /* renamed from: b */
    public void mo5246b(String str, String str2) {
        new AlertDialog.Builder(this).setTitle(str).setMessage(str2).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setIcon(17301543).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public void m5901bx() {
        new AlertDialog.Builder(this).setTitle("Connect with Bluetooth").setMessage("You need to connect to your Minirig.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.m5902by();
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.m5900bw();
            }
        }).setIcon(17301543).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: by */
    public void m5902by() {
        startActivityForResult(new Intent("android.settings.BLUETOOTH_SETTINGS"), 3);
    }

    public void connectBluetoothClicked(View view) {
        m5902by();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 2:
                this.f4214k.mo5229a(f3974m, "- - - - - - Returned from request enable BT - - - - - - ");
                if (this.f4180dX.isEnabled()) {
                    setView(this.f3996V);
                    m5871bC();
                    return;
                }
                return;
            case 3:
                this.f4214k.mo5229a(f3974m, "- - - - - - Returned from bluetooth settings - - - - - - ");
                if (this.f4180dX.isEnabled()) {
                    if (!this.f4043aq) {
                        setView(this.f3996V);
                    }
                    m5871bC();
                    return;
                }
                m5900bw();
                return;
            case 4:
                this.f4035ai = this.f4220r.isMusicActive();
                if (this.f4220r.isMusicActive()) {
                    this.f4152cv.setImageResource(R.drawable.pause_button);
                } else {
                    this.f4152cv.setImageResource(R.drawable.play_button);
                }
                ((AnimationDrawable) this.f4152cv.getBackground()).stop();
                this.f4152cv.setBackgroundResource(R.drawable.button_media_selector);
                this.f4114cJ = 0;
                return;
            default:
                return;
        }
    }

    public void onBackPressed() {
        View view;
        View view2;
        View view3;
        this.f4150ct.clearFocus();
        if (this.f4043aq) {
            mo5243a("Attempting to reconnect", "You can reconnect using your bluetooth settings if your device fails to reconnect automatically.");
        } else if (this.f4065bM == this.f3996V && this.f4066bN == this.f4136cf) {
            m5903bz();
            m5876bH();
        } else {
            View view4 = this.f4065bM;
            if (view4 == this.f4002aB || view4 == (view = this.f4001aA)) {
                setView(this.f4050ax);
            } else if (view4 == this.f4050ax) {
                setView(this.f4046at);
            } else if (view4 == this.f4136cf && (view3 = this.f4066bN) == view) {
                setView(view3);
            } else {
                View view5 = this.f4065bM;
                if (view5 == this.f4136cf || view5 == this.f3996V) {
                    super.onBackPressed();
                    return;
                }
                View view6 = this.f4009aI;
                if (view5 == view6 || view5 == this.f4090bl || view5 == this.f4080bb || view5 == this.f4091bm || view5 == (view2 = this.f4103by) || view5 == this.f4037ak || view5 == this.f4046at || view5 == this.f4062bJ) {
                    setView(this.f4028ab);
                } else if (view5 != this.f4079ba) {
                    View view7 = this.f4010aJ;
                    if (view5 == view7) {
                        setView(view6);
                    } else if (view5 == this.f4018aR) {
                        setView(view7);
                    } else if (view5 == this.f4104bz) {
                        setView(view2);
                    } else if (view5 == this.f4100bv) {
                        setView(this.f4028ab);
                        m5829ak();
                    } else {
                        if (!this.f4224v) {
                            this.f4227y = null;
                            m5903bz();
                        }
                        runOnUiThread(new Runnable() {
                            public void run() {
                                MainActivity mainActivity = MainActivity.this;
                                mainActivity.setView(mainActivity.f4136cf);
                            }
                        });
                    }
                } else if (mo5284r()) {
                    setView(this.f4009aI);
                } else {
                    setView(this.f4028ab);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: bz */
    public void m5903bz() {
        GlobalApplication globalApplication = this.f4214k;
        String str = f3974m;
        globalApplication.mo5229a(str, "closeAllDeviceConnections() currentView: " + this.f4065bM.toString());
        try {
            mo5237F();
        } catch (IOException e) {
            GlobalApplication globalApplication2 = this.f4214k;
            String str2 = f3974m;
            globalApplication2.mo5229a(str2, "closeSPP() excpetion: " + e.getMessage());
        }
        mo5240I();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m5905c(BluetoothDevice bluetoothDevice) {
        try {
            mo5242a(bluetoothDevice);
            this.f4174dR = true;
            sendCommand("N", "IDENTIFY_AS_PHONE");
            sendCommand("i", "GET_INFO");
            sendCommand("x", "GET_STATUS");
        } catch (IOException e) {
            this.f4214k.mo5229a(f3974m, "openSPP() excpetion: " + e.getMessage());
            try {
                mo5237F();
            } catch (IOException e2) {
                this.f4214k.mo5229a(f3974m, "closeSPP() excpetion: " + e2.getMessage());
            }
            runOnUiThread(new Runnable() {
                public void run() {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.setView(mainActivity.f4136cf);
                }
            });
            this.f4175dS++;
            if (this.f4175dS >= 3 && !this.f4176dT) {
                this.f4176dT = true;
                mo5246b("Connection issues?", "Please try restarting your phone / tablet then try again.");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5745a(BluetoothDevice bluetoothDevice, C1230e eVar) {
        this.f4214k.mo5229a(f3974m, "----connect----");
        if (this.f4180dX == null || bluetoothDevice == null || eVar == null) {
            this.f4214k.mo5229a(f3974m, "BluetoothAdapter not initialized or unspecified address.");
        } else if (this.f4210eb == 1) {
            this.f4214k.mo5229a(f3974m, "Already connecting.");
        } else {
            m5876bH();
            this.f4214k.mo5229a(f3974m, "- - - - - Connecting to device - - - - - ");
            this.f4133cc = eVar;
            m5923f("Connecting to device");
            setView(this.f3996V);
            mo5251c(bluetoothDevice.getAddress());
            if (this.f4226x) {
                this.f4214k.mo5229a(f3974m, "Wait for power on...");
            } else if (!this.f4225w) {
                this.f3981G = new C1219c(this);
                C1219c cVar = this.f3981G;
                cVar.execute(new String[]{"waitForConnection-" + this.f4139ci});
            }
        }
    }

    /* renamed from: c */
    public boolean mo5251c(String str) {
        this.f4214k.mo5229a(f3974m, "----connectToAddress----");
        String str2 = this.f4178dV;
        if (str2 == null || !str.equals(str2) || this.f4209ea == null) {
            this.f4180dX = BluetoothAdapter.getDefaultAdapter();
            final BluetoothDevice remoteDevice = this.f4180dX.getRemoteDevice(str);
            if (remoteDevice == null) {
                this.f4214k.mo5229a(f3974m, "Device not found.  Unable to connect.");
                return false;
            }
            runOnUiThread(new Runnable() {
                public void run() {
                    MainActivity mainActivity = MainActivity.this;
                    BluetoothGatt unused = mainActivity.f4209ea = remoteDevice.connectGatt(mainActivity.getApplicationContext(), false, MainActivity.this.f4212ed);
                }
            });
            this.f4214k.mo5229a(f3974m, "Trying to create a new connection.");
            this.f4178dV = str;
            this.f4210eb = 1;
            return true;
        }
        this.f4214k.mo5229a(f3974m, "Trying to use an existing mBluetoothGatt for connection.");
        if (this.f4209ea.connect()) {
            this.f4210eb = 1;
            this.f4214k.mo5229a(f3974m, "Reconnecting to device.");
            return true;
        }
        this.f4214k.mo5229a(f3974m, "Reconnection  failed.");
        return false;
    }

    /* renamed from: c */
    public void sendCommand(String str, String str2) {
        if (!this.f4224v) {
            if (this.f4043aq) {
                this.f4214k.mo5229a(f3974m, "Cant send commands while broadcast_disconnection == true");
            } else if (this.f4216n == C1218b.BLE) {
                m5917e(str, str2);
            } else if (this.f4216n == C1218b.SPP) {
                try {
                    m5911d(str, str2);
                } catch (IOException e) {
                    GlobalApplication globalApplication = this.f4214k;
                    String str3 = f3974m;
                    globalApplication.mo5229a(str3, "sendViaSPP() excpetion: " + e.getMessage());
                    try {
                        mo5237F();
                    } catch (IOException e2) {
                        GlobalApplication globalApplication2 = this.f4214k;
                        String str4 = f3974m;
                        globalApplication2.mo5229a(str4, "closeSPP() excpetion: " + e2.getMessage());
                    }
                    runOnUiThread(new Runnable() {
                        public void run() {
                            MainActivity mainActivity = MainActivity.this;
                            mainActivity.setView(mainActivity.f4136cf);
                        }
                    });
                }
            } else {
                this.f4214k.mo5229a(f3974m, "Connection mode not recognised when trying to send data");
            }
        }
    }

    /* renamed from: d */
    private void m5911d(String str, String str2) {
        if (this.f4074bV != null) {
            if (this.f4073bU) {
                GlobalApplication globalApplication = this.f4214k;
                String str3 = f3974m;
                globalApplication.mo5229a(str3, "Added to SPP send queue: [" + str2 + "] " + str);
                this.f4070bR.add(str);
                this.f4071bS.add(str2);
                return;
            }
            byte[] a = this.f4214k.f3958d.mo5468a(str, str2);
            GlobalApplication globalApplication2 = this.f4214k;
            String str4 = f3974m;
            globalApplication2.mo5229a(str4, "Send via SPP: [" + str2 + "] " + str);
            this.f4076bX.write(a);
            this.f4073bU = true;
            this.f3976B.postDelayed(this.f3979E, 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m5917e(String str, String str2) {
        if (this.f4210eb == 2 && this.f4179dW) {
            final BluetoothGattCharacteristic a = C1244b.m6090a(this.f4209ea);
            if (a == null) {
                this.f4214k.mo5229a(f3974m, "Unable to find echo characteristic.");
                mo5240I();
            } else if (this.f4072bT) {
                this.f4070bR.add(str);
                this.f4071bS.add(str2);
            } else {
                GlobalApplication globalApplication = this.f4214k;
                String str3 = f3974m;
                globalApplication.mo5229a(str3, "Sending message: " + str);
                final byte[] a2 = this.f4214k.f3958d.mo5468a(str, str2);
                runOnUiThread(new Runnable() {
                    public void run() {
                        a.setValue(a2);
                        if (MainActivity.this.f4209ea.writeCharacteristic(a)) {
                            MainActivity.this.f4072bT = true;
                        } else {
                            MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Failed to write data");
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5242a(BluetoothDevice bluetoothDevice) {
        this.f4216n = C1218b.SPP;
        if (this.f4074bV != null) {
            this.f4214k.mo5229a(f3974m, "Tried to openSPP but mmSocket != null");
        } else if (bluetoothDevice != null) {
            if (C1230e.m6014a(bluetoothDevice.getAddress())) {
                this.f4214k.mo5229a(f3974m, "openSPP");
                this.f4074bV = bluetoothDevice.createRfcommSocketToServiceRecord(C1241b.f4558d);
                this.f4074bV.connect();
                this.f4075bW = this.f4074bV.getInputStream();
                this.f4076bX = this.f4074bV.getOutputStream();
                mo5244b(bluetoothDevice);
                return;
            }
            this.f4214k.mo5229a(f3974m, "Connected audio device was not a Minirig address");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5244b(final BluetoothDevice bluetoothDevice) {
        this.f4132cb = false;
        this.f4131ca = 0;
        this.f4078bZ = new byte[1024];
        if (this.f4077bY == null) {
            this.f4077bY = new Thread(new Runnable() {
                public void run() {
                    while (!Thread.currentThread().isInterrupted() && !MainActivity.this.f4132cb) {
                        try {
                            int available = MainActivity.this.f4075bW.available();
                            if (available > 0) {
                                if (MainActivity.this.f4073bU) {
                                    MainActivity.this.f3976B.removeCallbacks(MainActivity.this.f3979E);
                                    MainActivity.this.f4073bU = false;
                                }
                                byte[] bArr = new byte[available];
                                MainActivity.this.f4075bW.read(bArr);
                                String a = C1257f.m6120a(bArr);
                                GlobalApplication globalApplication = MainActivity.this.f4214k;
                                String str = MainActivity.f3974m;
                                globalApplication.mo5229a(str, "SPP Received: " + a);
                                if (MainActivity.this.f4214k.f3966l != null) {
                                    MainActivity.this.m5943o(a);
                                } else {
                                    MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Setup connected device");
                                    C1230e eVar = new C1230e(MainActivity.this.f4214k, MainActivity.this.f4074bV.getRemoteDevice(), a);
                                    if (!MainActivity.this.f4214k.f3956b) {
                                        if (eVar.minirigType == minirigStatusClass.modelTypeEnum.NO_MODEL) {
                                            MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Failed beginListenForData() so closing SPP connection");
                                            MainActivity.this.mo5237F();
                                            MainActivity.this.runOnUiThread(new Runnable() {
                                                public void run() {
                                                    MainActivity.this.setView(MainActivity.this.f4136cf);
                                                }
                                            });
                                        }
                                    }
                                    MainActivity.this.f4214k.mo5228a(eVar);
                                    MainActivity.this.f4225w = false;
                                    MainActivity.this.f4133cc = null;
                                    MainActivity.this.f4227y = bluetoothDevice;
                                    MainActivity.this.m5893bp();
                                    MainActivity.this.m5788aM();
                                    MainActivity.this.m5789aN();
                                    MainActivity.this.m5795aQ();
                                    MainActivity.this.m5801aT();
                                    MainActivity.this.runOnUiThread(new Runnable() {
                                        public void run() {
                                            if (MainActivity.this.f4043aq) {
                                                if (MainActivity.this.f4044ar) {
                                                    MainActivity.this.setView(MainActivity.this.f4028ab);
                                                } else {
                                                    MainActivity.this.setView(MainActivity.this.f4066bN);
                                                }
                                                MainActivity.this.f4043aq = false;
                                                MainActivity.this.f4044ar = false;
                                            } else if (MainActivity.this.f4142cl != null) {
                                                MainActivity.this.setView(MainActivity.this.f4142cl);
                                                View unused = MainActivity.this.f4142cl = null;
                                            } else if (MainActivity.this.f4067bO == null || MainActivity.this.f4067bO == MainActivity.this.f4136cf) {
                                                MainActivity.this.setView(MainActivity.this.f4028ab);
                                            } else {
                                                MainActivity.this.setView(MainActivity.this.f4067bO);
                                                MainActivity.this.f4067bO = null;
                                            }
                                        }
                                    });
                                    if (!MainActivity.this.f4213ee) {
                                        MainActivity.this.sendCommand("i", "GET_INFO");
                                    }
                                }
                            }
                        } catch (IOException e) {
                            GlobalApplication globalApplication2 = MainActivity.this.f4214k;
                            String str2 = MainActivity.f3974m;
                            globalApplication2.mo5229a(str2, "Failed reading data: " + e.getMessage());
                            MainActivity.this.f4132cb = true;
                        }
                        if (!MainActivity.this.f4073bU && MainActivity.this.f4071bS.size() > 0) {
                            MainActivity mainActivity = MainActivity.this;
                            mainActivity.sendCommand(mainActivity.f4070bR.get(0), MainActivity.this.f4071bS.get(0));
                            MainActivity.this.f4070bR.remove(0);
                            MainActivity.this.f4071bS.remove(0);
                        }
                    }
                }
            });
            this.f4077bY.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo5237F() {
        this.f4132cb = true;
        Thread thread = this.f4077bY;
        if (thread != null) {
            thread.interrupt();
            this.f4077bY = null;
        }
        BluetoothSocket bluetoothSocket = this.f4074bV;
        if (bluetoothSocket != null) {
            bluetoothSocket.close();
            this.f4074bV = null;
        }
        OutputStream outputStream = this.f4076bX;
        if (outputStream != null) {
            outputStream.close();
            this.f4076bX = null;
        }
        InputStream inputStream = this.f4075bW;
        if (inputStream != null) {
            inputStream.close();
            this.f4075bW = null;
        }
        this.f4214k.mo5229a(f3974m, "SPP Bluetooth Closed");
    }

    /* renamed from: bA */
    private void m5869bA() {
        List<BluetoothDevice> connectedDevices = this.f4218p.getConnectedDevices(7);
        for (BluetoothDevice name : connectedDevices) {
            GlobalApplication globalApplication = this.f4214k;
            String str = f3974m;
            globalApplication.mo5229a(str, "Found a connected GATT device: " + name.getName());
        }
        if (connectedDevices.size() == 0) {
            Log.d(f3974m, "No connected GATT devices found");
        }
    }

    /* renamed from: G */
    public void mo5238G() {
        this.f4179dW = true;
        this.f4225w = false;
        this.f4214k.mo5228a(this.f4133cc);
        this.f4133cc = null;
        this.f4134cd = false;
        C1219c cVar = this.f3981G;
        if (cVar != null) {
            cVar.cancel(true);
        }
        if (this.f3980F != null) {
            this.f4214k.mo5229a(f3974m, "- - - - - waitForAutoConnectScan.onFinish(); - - - - - ");
            this.f3980F.cancel(true);
        }
        C1219c cVar2 = this.f3982H;
        if (cVar2 != null) {
            cVar2.cancel(true);
        }
        if (this.f4226x) {
            sendCommand("O", "POWER_TOGGLE");
            this.f3978D = new Runnable() {
                public void run() {
                    if (!MainActivity.this.f4134cd && MainActivity.this.f4135ce < 5) {
                        MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Power toggle 'O' did not turn on the device, attempts: " + MainActivity.this.f4135ce);
                        MainActivity.this.m5917e("O", "POWER_TOGGLE");
                        MainActivity.this.f3975A.postDelayed(MainActivity.this.f3978D, 500);
                        MainActivity.this.f4135ce++;
                    } else if (MainActivity.this.f4135ce >= 5) {
                        MainActivity.this.mo5240I();
                    }
                }
            };
            this.f3975A.postDelayed(this.f3978D, 500);
        } else {
            m5923f("Getting device status...");
            sendCommand("x", "GET_STATUS");
            new C1219c(this).execute(new String[]{"setupEq-1"});
        }
        m5869bA();
    }

    /* renamed from: H */
    public void mo5239H() {
        this.f4214k.mo5229a(f3974m, "Disconnecting Gatt device");
        if (this.f4209ea != null) {
            sendCommand("!", "CLOSE_CONNECTION");
        }
        this.f4210eb = 0;
        C1219c cVar = this.f3981G;
        if (cVar != null) {
            cVar.cancel(true);
        }
        C1219c cVar2 = this.f3980F;
        if (cVar2 != null) {
            cVar2.cancel(true);
        }
        if (!this.f4226x || !this.f4179dW) {
            this.f4179dW = false;
            this.f4135ce = 0;
            GlobalApplication globalApplication = this.f4214k;
            globalApplication.f3966l = null;
            if (this.f4209ea != null) {
                globalApplication.mo5229a(f3974m, "mGatt was AVAILABLE disconmecting!");
                this.f4209ea.disconnect();
            } else {
                globalApplication.mo5229a(f3974m, "mGatt was NULL when trying to disconmect device!");
            }
            this.f4072bT = false;
            if (this.f4043aq) {
                this.f4214k.mo5229a(f3974m, " Dont go to scan page when disconnected in broadcast screens ");
                this.f4000Z.setVisibility(0);
                new C1219c(this).execute(new String[]{"waitForBroadcastReconnect-30"});
                m5923f("Wait for reconnection.");
                this.f3999Y.setVisibility(0);
                return;
            }
            GlobalApplication globalApplication2 = this.f4214k;
            String str = f3974m;
            globalApplication2.mo5229a(str, " Going to scan screen because of disconnect from:  " + this.f4065bM.toString());
            setView(this.f4136cf);
            return;
        }
        this.f4214k.mo5229a(f3974m, "Reconnect after power on");
        this.f4226x = false;
        this.f4134cd = true;
        this.f3975A.removeCallbacks(this.f3978D);
        this.f4214k.f3966l = null;
        this.f4072bT = false;
        this.f3982H = new C1219c(this);
        this.f3982H.execute(new String[]{"waitForPowerOn-7"});
    }

    /* renamed from: I */
    public void mo5240I() {
        this.f4214k.mo5229a(f3974m, "Closing Gatt connection");
        runOnUiThread(new Runnable() {
            public void run() {
                MainActivity.this.mo5239H();
                if (MainActivity.this.f4209ea != null) {
                    MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "mGatt was AVAILABLE closing!");
                    MainActivity.this.f4209ea.close();
                    BluetoothGatt unused = MainActivity.this.f4209ea = null;
                    return;
                }
                MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "mGatt was NULL when trying to close!");
            }
        });
    }

    /* renamed from: bB */
    private void m5870bB() {
        this.f4136cf = findViewById(R.id.content_scan);
        ((Button) findViewById(R.id.refresh)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Snackbar.m1446a(view, "Refreshing results...", 0).mo1093d();
                MainActivity mainActivity = MainActivity.this;
                mainActivity.f4225w = false;
                mainActivity.m5873bE();
            }
        });
        this.f4137cg = (CustomListView) findViewById(R.id.list);
        this.f4137cg.setAdapter(this.f4138ch);
        this.f4137cg.setOnNoItemClickListener(new CustomListView.C1262a() {
            /* renamed from: a */
            public void mo5437a() {
                MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Tapped device list");
                MainActivity.this.m5726X();
            }
        });
        this.f4137cg.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                MainActivity.this.m5876bH();
                BluetoothDevice a = MainActivity.this.f4138ch.mo5558a(i);
                C1230e b = MainActivity.this.f4138ch.mo5561b(i);
                if (b == null) {
                    MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Manufaturer data is NULL");
                } else {
                    GlobalApplication globalApplication = MainActivity.this.f4214k;
                    String str = MainActivity.f3974m;
                    globalApplication.mo5229a(str, "manufacturerData.isCompatible: " + b.f4401c);
                }
                if (b != null && b.f4401c) {
                    if (MainActivity.this.f4214k.f3963i.f4584e.containsKey(b.f4406h) && Integer.parseInt(b.f4407i) < MainActivity.this.f4214k.f3963i.f4584e.get(b.f4406h).intValue()) {
                        MainActivity.this.m5722V();
                    }
                    boolean e = MainActivity.this.m5913d(b.f4405g);
                    boolean unused = MainActivity.this.m5913d(b.f4405g);
                    if (b.audioConnectionState.equals("POWER_OFF")) {
                        MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Was OFF turn it on");
                        MainActivity.this.f4226x = true;
                    }
                    if (MainActivity.this.f4226x) {
                        MainActivity.this.m5745a(a, b);
                    } else if (b.audioConnectionState.equals("AUX")) {
                        MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Selected connect in AUX mode");
                        MainActivity.this.f4216n = C1218b.BLE;
                        MainActivity.this.m5745a(a, b);
                    } else if (e || MainActivity.this.f4226x) {
                        if (MainActivity.this.f4216n == C1218b.BLE) {
                            MainActivity.this.m5745a(a, b);
                            return;
                        }
                        BluetoothDevice f = MainActivity.this.m5914e(b.f4405g);
                        if (f == null) {
                            MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Could not match BLE device to a paired device");
                            MainActivity.this.m5901bx();
                            return;
                        }
                        MainActivity.this.m5905c(f);
                    } else if (!MainActivity.this.f4045as) {
                        MainActivity.this.m5901bx();
                    } else if (MainActivity.this.f4214k.f3966l == null || MainActivity.this.f4214k.f3966l.f4405g != b.f4405g) {
                        MainActivity.this.m5745a(a, b);
                    } else {
                        MainActivity.this.mo5246b("Already connected", "Already connected to this device");
                    }
                } else if (!C1230e.m6014a(a.getAddress())) {
                    MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Clicked a device with nothing to do");
                } else if (MainActivity.this.m5913d(a.getAddress())) {
                    MainActivity.this.m5905c(MainActivity.this.m5914e(a.getAddress()));
                } else {
                    MainActivity.this.m5901bx();
                }
            }
        });
    }

    /* renamed from: bC */
    private void m5871bC() {
        Log.d(f3974m, "           beginConnection()()()))()()()((()()()");
        this.f4225w = true;
        m5712Q();
        m5923f("Confirming audio stream connection...");
        new C1219c(this).execute(new String[]{"waitForAudioListener-1"});
    }

    /* access modifiers changed from: private */
    /* renamed from: bD */
    public void m5872bD() {
        this.f4214k.mo5229a(f3974m, "Commence auto connect scan");
        m5873bE();
        this.f4225w = true;
        this.f4140cj = false;
        this.f3980F = new C1219c(this);
        C1219c cVar = this.f3980F;
        cVar.execute(new String[]{"waitForAutoConnectScan-" + this.f4139ci});
    }

    /* access modifiers changed from: private */
    /* renamed from: bE */
    public void m5873bE() {
        this.f4214k.mo5229a(f3974m, "Refresh device list");
        if (this.f4214k.f3966l != null) {
            this.f4214k.mo5229a(f3974m, "Did NOT refresh device list because already have a decive connected");
            return;
        }
        this.f4225w = false;
        this.f4226x = false;
        this.f4138ch.mo5559a();
        m5876bH();
        m5875bG();
    }

    /* renamed from: bF */
    private void m5874bF() {
        boolean z;
        LocationManager locationManager = (LocationManager) getSystemService("location");
        boolean z2 = false;
        try {
            z = locationManager.isProviderEnabled("gps");
        } catch (Exception unused) {
            z = false;
        }
        try {
            z2 = locationManager.isProviderEnabled("network");
        } catch (Exception unused2) {
        }
        if (!z && !z2) {
            new AlertDialog.Builder(this).setMessage("Bluetooth scanning in Android 6.0+ requires access to your coarse location, please turn location settings on").setPositiveButton("Open settings", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    MainActivity.this.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                }
            }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: bG */
    public void m5875bG() {
        if (!this.f4180dX.isEnabled()) {
            setView(this.f3996V);
            m5901bx();
            return;
        }
        m5874bF();
        if (this.f4177dU) {
            Log.d(f3974m, "Was already scanning");
            m5876bH();
            return;
        }
        this.f4214k.f3966l = null;
        this.f4067bO = null;
        if (this.f4210eb == 2) {
            mo5240I();
        }
        C1219c cVar = this.f3981G;
        if (cVar != null) {
            cVar.cancel(true);
        }
        C1219c cVar2 = this.f3980F;
        if (cVar2 != null) {
            cVar2.cancel(true);
        }
        C1219c cVar3 = this.f3982H;
        if (cVar3 != null) {
            cVar3.cancel(true);
        }
        this.f4214k.f3967m = m5714R().trim();
        final ArrayList arrayList = new ArrayList();
        final ScanSettings build = new ScanSettings.Builder().setScanMode(1).build();
        runOnUiThread(new Runnable() {
            public void run() {
                MainActivity mainActivity = MainActivity.this;
                ScanCallback unused = mainActivity.f4182dZ = new C1216a(mainActivity.f4211ec);
                BluetoothAdapter unused2 = MainActivity.this.f4180dX = BluetoothAdapter.getDefaultAdapter();
                MainActivity mainActivity2 = MainActivity.this;
                BluetoothLeScanner unused3 = mainActivity2.f4181dY = mainActivity2.f4180dX.getBluetoothLeScanner();
                MainActivity.this.f4181dY.startScan(arrayList, build, MainActivity.this.f4182dZ);
            }
        });
        this.f3977C = new Runnable() {
            public void run() {
                if (MainActivity.this.f4214k.f3966l == null) {
                    MainActivity.this.m5876bH();
                    if (MainActivity.this.f4138ch.getCount() == 0) {
                        MainActivity.this.m5898bu();
                    }
                }
            }
        };
        if (this.f3975A == null) {
            this.f3975A = new Handler(getApplicationContext().getMainLooper());
        }
        this.f3975A.postDelayed(this.f3977C, 10000);
        this.f4177dU = true;
        this.f4214k.mo5229a(f3974m, "Started scanning.");
    }

    /* access modifiers changed from: private */
    /* renamed from: bH */
    public void m5876bH() {
        BluetoothAdapter bluetoothAdapter;
        if (this.f4177dU && (bluetoothAdapter = this.f4180dX) != null && bluetoothAdapter.isEnabled() && this.f4181dY != null) {
            runOnUiThread(new Runnable() {
                public void run() {
                    MainActivity.this.f4181dY.flushPendingScanResults(MainActivity.this.f4182dZ);
                    MainActivity.this.f4181dY.stopScan(MainActivity.this.f4182dZ);
                    BluetoothLeScanner unused = MainActivity.this.f4181dY = null;
                    ScanCallback unused2 = MainActivity.this.f4182dZ = null;
                }
            });
        }
        if (this.f4177dU) {
            this.f4182dZ = null;
            this.f4177dU = false;
            this.f3975A.removeCallbacks(this.f3977C);
            this.f3977C = null;
            this.f4214k.mo5229a(f3974m, "Stopped scanning.");
            return;
        }
        this.f4214k.mo5229a(f3974m, "Wasent scanning but stopScan was called.");
    }

    /* renamed from: com.minirig.android.MainActivity$a */
    private class C1216a extends ScanCallback {
        C1216a(Map<String, BluetoothDevice> map) {
            Map unused = MainActivity.this.f4211ec = map;
        }

        public void onScanResult(int i, ScanResult scanResult) {
            final BluetoothDevice device = scanResult.getDevice();
            final int rssi = scanResult.getRssi();
            final byte[] bytes = scanResult.getScanRecord().getBytes();
            MainActivity.this.runOnUiThread(new Runnable() {
                public void run() {
                    boolean z;
                    boolean z2;
                    GlobalApplication globalApplication = MainActivity.this.f4214k;
                    String str = MainActivity.f3974m;
                    globalApplication.mo5229a(str, "                 Device found: " + device.getName());
                    GlobalApplication globalApplication2 = MainActivity.this.f4214k;
                    String str2 = MainActivity.f3974m;
                    globalApplication2.mo5229a(str2, "         Device found address: " + device.getAddress());
                    String a = C1216a.this.m5996a(bytes);
                    C1230e eVar = new C1230e(MainActivity.this.f4214k, device.getName(), a);
                    GlobalApplication globalApplication3 = MainActivity.this.f4214k;
                    String str3 = MainActivity.f3974m;
                    globalApplication3.mo5229a(str3, "                     found device: " + device.getName());
                    GlobalApplication globalApplication4 = MainActivity.this.f4214k;
                    String str4 = MainActivity.f3974m;
                    globalApplication4.mo5229a(str4, "          md.realBTaddress.trim(): " + eVar.f4405g);
                    GlobalApplication globalApplication5 = MainActivity.this.f4214k;
                    String str5 = MainActivity.f3974m;
                    globalApplication5.mo5229a(str5, "                      advert data: " + a);
                    MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    boolean z3 = false;
                    if (eVar.f4401c && eVar.audioConnectionState2 != minirigStatusClass.audioConnectionStateEnum.POWER_OFF) {
                        if (MainActivity.this.f4225w && eVar.f4405g.equals(MainActivity.this.f4214k.f3967m)) {
                            MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                            MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "           FOUND DEVICE FOR AUTO CONNECT ");
                            GlobalApplication globalApplication6 = MainActivity.this.f4214k;
                            String str6 = MainActivity.f3974m;
                            globalApplication6.mo5229a(str6, "advert data: " + a);
                            MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                            boolean unused = MainActivity.this.f4140cj = true;
                            MainActivity.this.m5745a(device, eVar);
                        }
                        z2 = true;
                        z = true;
                    } else if (eVar.f4401c && eVar.audioConnectionState2 == minirigStatusClass.audioConnectionStateEnum.POWER_OFF) {
                        z2 = true;
                        z = true;
                    } else if (C1230e.m6014a(device.getAddress())) {
                        MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Minirig with no advertisment data, probably an MRBT1 or MRBT2");
                        eVar.f4405g = device.getAddress();
                        eVar.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG2;
                        eVar.f4406h = "10";
                        eVar.f4406h = MainActivity.this.f4214k.f3965k.get(eVar.f4406h);
                        if (eVar.f4405g != null && eVar.f4405g.length() >= 8 && (eVar.f4405g.substring(0, 8).equals("00:12:6F") || eVar.f4405g.substring(0, 8).equals("54:B7:E5"))) {
                            MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "MRBT1 MRBT1 MRBT1 MRBT1 MRBT1");
                            eVar.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG1;
                            eVar.f4406h = "1";
                            eVar.f4406h = MainActivity.this.f4214k.f3965k.get(eVar.f4406h);
                        }
                        z2 = true;
                        z = true;
                    } else if (MainActivity.this.f4228z) {
                        z2 = true;
                        z = false;
                    } else {
                        z2 = false;
                        z = false;
                    }
                    if (eVar.minirigType != minirigStatusClass.modelTypeEnum.NO_MODEL) {
                        z2 = true;
                    }
                    GlobalApplication globalApplication7 = MainActivity.this.f4214k;
                    String str7 = MainActivity.f3974m;
                    globalApplication7.mo5229a(str7, "broadcastScan: " + MainActivity.this.f4045as);
                    if (!MainActivity.this.f4045as || eVar.minirigType == minirigStatusClass.modelTypeEnum.MINIRIG3) {
                        z3 = z2;
                    } else if (MainActivity.this.f4214k.f3966l != null && eVar.f4405g == MainActivity.this.f4214k.f3966l.f4405g) {
                        MainActivity.this.f4214k.mo5229a(MainActivity.f3974m, "Already connected to this device");
                    }
                    if (!z3) {
                        return;
                    }
                    if (!z) {
                        MainActivity.this.f4138ch.mo5560a(new C1258c.C1260a(device, bytes, (C1230e) null, rssi));
                    } else {
                        MainActivity.this.f4138ch.mo5560a(new C1258c.C1260a(device, bytes, eVar, rssi));
                    }
                }
            });
        }

        public void onBatchScanResults(List<ScanResult> list) {
            for (ScanResult a : list) {
                m5997a(a);
            }
        }

        public void onScanFailed(int i) {
            GlobalApplication globalApplication = MainActivity.this.f4214k;
            String str = MainActivity.f3974m;
            globalApplication.mo5229a(str, "BLE Scan Failed with code " + i);
        }

        /* renamed from: a */
        private void m5997a(ScanResult scanResult) {
            BluetoothDevice device = scanResult.getDevice();
            MainActivity.this.f4211ec.put(device.getAddress(), device);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String m5996a(byte[] bArr) {
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

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m5943o(final String str) {
        if (str != null && str.length() >= 1) {
            this.f4008aH = str;
            this.f4006aF = null;
            m5929h(str);
            int i = this.f4082bd;
            if (i > 0) {
                this.f4082bd = i - 1;
            }
            runOnUiThread(new Runnable() {
                public void run() {
                    TextView textView = MainActivity.this.f4064bL;
                    textView.setText(str + "\n" + MainActivity.this.f4064bL.getText());
                }
            });
            String substring = str.substring(0, 1);
            GlobalApplication globalApplication = this.f4214k;
            String str2 = f3974m;
            globalApplication.mo5229a(str2, "DEVICE CONTROLS ACTIVITY Handle data received: " + str);
            if (substring.equals("x")) {
                boolean z = this.f4214k.minirigf3.getHasJackInsertedTop() || this.f4214k.minirigf3.getHasJackInsertedBottom();
                this.f4214k.minirigf3.handleStatusStr(str);
                if (!z && (this.f4214k.minirigf3.getHasJackInsertedTop() || this.f4214k.minirigf3.getHasJackInsertedBottom())) {
                    mo5241J();
                }
                if (!this.f4097bs) {
                    m5889bl();
                }
                m5837ao();
                m5890bm();
                m5809aa();
                m5811ab();
                m5730Z();
                m5849au();
                if (this.f4031ae) {
                    m5784aK();
                }
                mo5283q();
                if (this.f4174dR) {
                    runOnUiThread(new Runnable() {
                        public void run() {
                            MainActivity.this.m5841aq();
                        }
                    });
                    this.f4174dR = false;
                    if (this.f4065bM == this.f3996V) {
                        runOnUiThread(new Runnable() {
                            public void run() {
                                MainActivity mainActivity = MainActivity.this;
                                mainActivity.setView(mainActivity.f4028ab);
                            }
                        });
                    }
                }
            } else if (substring.equals("o")) {
                this.f4214k.f3960f.mo5478a(str);
                m5894bq();
            } else if (substring.equals("/")) {
                this.f4214k.f3960f.mo5479b(str);
                m5894bq();
            } else if (substring.equals("i")) {
                m5945p(str);
            } else if (substring.equals("B")) {
                m5921f(this.f4214k.f3962h.mo5465a(str));
            } else if (str.length() >= 5 && str.substring(0, 5).equals("NAME=")) {
                GlobalApplication globalApplication2 = this.f4214k;
                String str3 = f3974m;
                globalApplication2.mo5229a(str3, "Received name, full reply: " + str);
            } else if (!substring.equals("q") || str.length() < 16) {
                if (substring.equals("q") && str.length() == 3) {
                    m5941n(str);
                    m5885bh();
                } else if (str.length() >= 28 && str.substring(0, 3).equals("MM=")) {
                    GlobalApplication globalApplication3 = this.f4214k;
                    String str4 = f3974m;
                    globalApplication3.mo5229a(str4, "- - - - - - - - Minirig Eq string reply: |" + str + "|");
                } else if (str.length() >= 16 && str.contains("TWS_CONFIG")) {
                    m5931i(str);
                }
            } else if (str.substring(1, 2).equals(" ")) {
                m5933j(str);
                if (this.f4065bM == this.f4079ba) {
                    if (mo5284r() && this.f4160dD.equals("00")) {
                        m5937l(str);
                    } else if (!mo5284r()) {
                        m5937l(str);
                    }
                }
                m5803aV();
                if (mo5284r()) {
                    m5797aR();
                    mo5289t();
                    runOnUiThread(new Runnable() {
                        public void run() {
                            MainActivity.this.m5839ap();
                        }
                    });
                }
            }
            if (this.f4164dH && this.f4082bd == 0) {
                this.f4164dH = false;
                this.f4160dD = "00";
                m5865b(true);
                m5933j(this.f4162dF);
            }
        }
    }

    /* renamed from: p */
    private void m5945p(String str) {
        if (str.contains("MRBT2") && this.f4214k.f3966l != null && this.f4214k.f3966l.minirigType.equals(minirigStatusClass.modelTypeEnum.MINIRIG1)) {
            this.f4214k.f3966l.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG2;
            this.f4214k.minirigf3.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG2;
            this.f4214k.f3966l.f4406h = "10";
            this.f4097bs = false;
            m5890bm();
            m5722V();
        } else if (this.f4214k.f3966l != null) {
            if (str.contains("MRBT2") && !this.f4214k.f3966l.minirigType.equals(minirigStatusClass.modelTypeEnum.MINIRIG2)) {
                m5755a(minirigStatusClass.modelTypeEnum.MINIRIG2);
            } else if (str.contains("MRBT3") && !this.f4214k.f3966l.minirigType.equals(minirigStatusClass.modelTypeEnum.MINIRIG3)) {
                m5755a(minirigStatusClass.modelTypeEnum.MINIRIG3);
            } else if (str.contains("MRM2") && !this.f4214k.f3966l.minirigType.equals(minirigStatusClass.modelTypeEnum.MINIMINI2)) {
                m5755a(minirigStatusClass.modelTypeEnum.MINIMINI2);
            } else if (str.contains("MRM") && !this.f4214k.f3966l.minirigType.equals(minirigStatusClass.modelTypeEnum.MINIMINI) && !this.f4214k.f3966l.minirigType.equals(minirigStatusClass.modelTypeEnum.MINIMINI2)) {
                m5755a(minirigStatusClass.modelTypeEnum.MINIMINI);
            }
        }
        m5877bI();
        this.f4213ee = true;
    }

    /* renamed from: a */
    private void m5755a(minirigStatusClass.modelTypeEnum eVar) {
        if (eVar.equals(minirigStatusClass.modelTypeEnum.MINIRIG2)) {
            this.f4214k.f3966l.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG2;
            this.f4214k.minirigf3.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG2;
            this.f4214k.f3966l.f4406h = "10";
        } else if (eVar.equals(minirigStatusClass.modelTypeEnum.MINIMINI)) {
            this.f4214k.f3966l.minirigType = minirigStatusClass.modelTypeEnum.MINIMINI;
            this.f4214k.minirigf3.minirigType = minirigStatusClass.modelTypeEnum.MINIMINI;
            this.f4214k.f3966l.f4406h = "20";
        } else if (eVar.equals(minirigStatusClass.modelTypeEnum.MINIMINI2)) {
            this.f4214k.f3966l.minirigType = minirigStatusClass.modelTypeEnum.MINIMINI2;
            this.f4214k.minirigf3.minirigType = minirigStatusClass.modelTypeEnum.MINIMINI2;
            this.f4214k.f3966l.f4406h = "21";
        } else if (eVar.equals(minirigStatusClass.modelTypeEnum.MINIRIG3)) {
            this.f4214k.f3966l.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG3;
            this.f4214k.minirigf3.minirigType = minirigStatusClass.modelTypeEnum.MINIRIG3;
            this.f4214k.f3966l.f4406h = "30";
        }
        this.f4097bs = false;
        m5890bm();
        if (this.f4214k.f3966l == null || !mo5284r()) {
            m5820ag();
        } else {
            m5823ah();
        }
    }

    /* renamed from: bI */
    private void m5877bI() {
        int i;
        if (this.f4214k.f3966l != null && this.f4214k.f3963i.f4584e.containsKey(this.f4214k.f3966l.f4406h)) {
            int i2 = 0;
            try {
                i = Integer.parseInt(this.f4214k.f3966l.f4407i);
                try {
                    i2 = this.f4214k.f3963i.f4584e.get(this.f4214k.f3966l.f4406h).intValue();
                } catch (NumberFormatException unused) {
                }
            } catch (NumberFormatException unused2) {
                i = 0;
            }
            if (i != 0 && i2 != 0 && i < i2) {
                m5722V();
            }
        }
    }

    /* renamed from: J */
    public void mo5241J() {
        sendCommand("x", "GET_STATUS");
        runOnUiThread(new Runnable() {
            public void run() {
                new AlertDialog.Builder(MainActivity.this).setTitle("Jack inserted").setMessage("Use the audio configuration page to specify the AUX device you have attached.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (MainActivity.this.mo5284r()) {
                            MainActivity.this.setView(MainActivity.this.f4010aJ);
                        } else {
                            MainActivity.this.setView(MainActivity.this.f4037ak);
                        }
                    }
                }).setIcon(17301543).show();
            }
        });
    }

    /* renamed from: com.minirig.android.MainActivity$c */
    private class C1219c extends AsyncTask<String, int[], String> {

        /* renamed from: b */
        private final WeakReference<MainActivity> f4383b;

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }

        public C1219c(MainActivity mainActivity) {
            this.f4383b = new WeakReference<>(mainActivity);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            String[] split = strArr[0].split("-");
            String str = split[0];
            int parseInt = Integer.parseInt(split[1]) * 10;
            for (int i = 0; i < parseInt; i++) {
                GlobalApplication globalApplication = MainActivity.this.f4214k;
                String str2 = MainActivity.f3974m;
                globalApplication.mo5229a(str2, "Loop " + i);
                SystemClock.sleep(100);
                if (isCancelled()) {
                    break;
                }
            }
            return str;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r4) {
            /*
                r3 = this;
                int r0 = r4.hashCode()
                r1 = 0
                r2 = 1
                switch(r0) {
                    case -1587803120: goto L_0x0073;
                    case -908110611: goto L_0x0068;
                    case -472520032: goto L_0x005e;
                    case -459944502: goto L_0x0054;
                    case -338198620: goto L_0x004a;
                    case 202329078: goto L_0x0040;
                    case 757665542: goto L_0x0035;
                    case 1018078306: goto L_0x002a;
                    case 1325507858: goto L_0x0020;
                    case 1773024527: goto L_0x0016;
                    case 1985976329: goto L_0x000b;
                    default: goto L_0x0009;
                }
            L_0x0009:
                goto L_0x007d
            L_0x000b:
                java.lang.String r0 = "setupEq"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x007d
                r4 = 6
                goto L_0x007e
            L_0x0016:
                java.lang.String r0 = "waitToStartScan"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x007d
                r4 = 3
                goto L_0x007e
            L_0x0020:
                java.lang.String r0 = "waitForConnection"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x007d
                r4 = 4
                goto L_0x007e
            L_0x002a:
                java.lang.String r0 = "commitName"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x007d
                r4 = 8
                goto L_0x007e
            L_0x0035:
                java.lang.String r0 = "playPauseCheck"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x007d
                r4 = 9
                goto L_0x007e
            L_0x0040:
                java.lang.String r0 = "waitForAudioListener"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x007d
                r4 = 0
                goto L_0x007e
            L_0x004a:
                java.lang.String r0 = "waitForAutoConnectScan"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x007d
                r4 = 2
                goto L_0x007e
            L_0x0054:
                java.lang.String r0 = "waitForBroadcastReconnect"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x007d
                r4 = 1
                goto L_0x007e
            L_0x005e:
                java.lang.String r0 = "initialisationComplete"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x007d
                r4 = 7
                goto L_0x007e
            L_0x0068:
                java.lang.String r0 = "twsScan"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x007d
                r4 = 10
                goto L_0x007e
            L_0x0073:
                java.lang.String r0 = "waitForPowerOn"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x007d
                r4 = 5
                goto L_0x007e
            L_0x007d:
                r4 = -1
            L_0x007e:
                switch(r4) {
                    case 0: goto L_0x024c;
                    case 1: goto L_0x01c9;
                    case 2: goto L_0x01b3;
                    case 3: goto L_0x01a4;
                    case 4: goto L_0x0180;
                    case 5: goto L_0x011a;
                    case 6: goto L_0x00a8;
                    case 7: goto L_0x0099;
                    case 8: goto L_0x008a;
                    case 9: goto L_0x02d7;
                    case 10: goto L_0x0083;
                    default: goto L_0x0081;
                }
            L_0x0081:
                goto L_0x02d7
            L_0x0083:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                r4.m5786aL()
                goto L_0x02d7
            L_0x008a:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                java.lang.String r0 = "N WRITE"
                java.lang.String r1 = "N WRITE"
                java.lang.String r1 = r1.toString()
                r4.sendCommand((java.lang.String) r0, (java.lang.String) r1)
                goto L_0x02d7
            L_0x0099:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                boolean r4 = r4.f4226x
                if (r4 == 0) goto L_0x02d7
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                java.lang.String r0 = "Reconnecting after power on"
                r4.m5923f((java.lang.String) r0)
                goto L_0x02d7
            L_0x00a8:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                com.minirig.android.a.e r4 = r4.f3966l
                java.lang.String r4 = r4.audioConnectionState
                java.lang.String r0 = "POWER_OFF"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x00dc
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                java.lang.String r0 = com.minirig.android.MainActivity.f3974m
                java.lang.String r1 = "POWER WAS OUT"
                r4.mo5229a(r0, r1)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                r4.f4226x = r2
                java.lang.String r0 = "O"
                java.lang.String r1 = "POWER_TOGGLE"
                r4.sendCommand((java.lang.String) r0, (java.lang.String) r1)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                java.lang.String r0 = "Turning on Minirig"
                r4.m5923f((java.lang.String) r0)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                r4.mo5240I()
                goto L_0x02d7
            L_0x00dc:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                android.content.SharedPreferences r4 = r4.f3957c
                com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r0 = r0.f4214k
                com.minirig.android.a.e r0 = r0.f3966l
                java.lang.String r0 = r0.f4405g
                boolean r4 = r4.contains(r0)
                if (r4 == 0) goto L_0x00fc
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                android.view.View r0 = r4.f4028ab
                r4.setView(r0)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                r4.m5893bp()
            L_0x00fc:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                android.widget.TextView r4 = r4.f3994T
                r4.setVisibility(r1)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                r4.m5801aT()
                com.minirig.android.MainActivity$c r4 = new com.minirig.android.MainActivity$c
                com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                r4.<init>(r0)
                java.lang.String r0 = "initialisationComplete-1"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                r4.execute(r0)
                goto L_0x02d7
            L_0x011a:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                com.minirig.android.a.e r4 = r4.f3966l
                if (r4 != 0) goto L_0x02d7
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                java.lang.String r0 = com.minirig.android.MainActivity.f3974m
                java.lang.String r1 = "Finished waiting for device to switch on "
                r4.mo5229a(r0, r1)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.MainActivity$b r4 = r4.f4216n
                com.minirig.android.MainActivity$b r0 = com.minirig.android.MainActivity.C1218b.SPP
                if (r4 != r0) goto L_0x016f
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                android.bluetooth.BluetoothDevice r4 = r4.m5715S()
                if (r4 != 0) goto L_0x0159
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                java.lang.String r0 = com.minirig.android.MainActivity.f3974m
                java.lang.String r1 = "No connected audio device found after power up... "
                r4.mo5229a(r0, r1)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.MainActivity$c$4 r0 = new com.minirig.android.MainActivity$c$4
                r0.<init>()
                r4.runOnUiThread(r0)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                r4.m5873bE()
                goto L_0x02d7
            L_0x0159:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                java.lang.String r0 = com.minirig.android.MainActivity.f3974m
                java.lang.String r1 = "Found a connected audio device after power up, trying to connect... "
                r4.mo5229a(r0, r1)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                android.bluetooth.BluetoothDevice r0 = r4.m5715S()
                r4.m5905c((android.bluetooth.BluetoothDevice) r0)
                goto L_0x02d7
            L_0x016f:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                r4.m5872bD()
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.MainActivity$c$5 r0 = new com.minirig.android.MainActivity$c$5
                r0.<init>()
                r4.runOnUiThread(r0)
                goto L_0x02d7
            L_0x0180:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                com.minirig.android.a.e r4 = r4.f3966l
                if (r4 != 0) goto L_0x02d7
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                r4.mo5240I()
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                java.lang.String r0 = com.minirig.android.MainActivity.f3974m
                java.lang.String r1 = "Manual connection timed out "
                r4.mo5229a(r0, r1)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.MainActivity$c$3 r0 = new com.minirig.android.MainActivity$c$3
                r0.<init>()
                r4.runOnUiThread(r0)
                goto L_0x02d7
            L_0x01a4:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                com.minirig.android.a.e r4 = r4.f3966l
                if (r4 != 0) goto L_0x02d7
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                r4.m5875bG()
                goto L_0x02d7
            L_0x01b3:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                com.minirig.android.a.e r4 = r4.f3966l
                if (r4 != 0) goto L_0x02d7
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                r4.mo5240I()
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                android.view.View r0 = r4.f4136cf
                r4.setView(r0)
                goto L_0x02d7
            L_0x01c9:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                android.bluetooth.BluetoothDevice r4 = r4.m5715S()
                if (r4 == 0) goto L_0x01f6
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                java.lang.String r4 = r4.m5714R()
                java.lang.String r0 = ""
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x01e0
                goto L_0x01f6
            L_0x01e0:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                java.lang.String r0 = com.minirig.android.MainActivity.f3974m
                java.lang.String r1 = "Found connected device for SPP connection"
                r4.mo5229a(r0, r1)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                android.bluetooth.BluetoothDevice r0 = r4.m5715S()
                r4.m5905c((android.bluetooth.BluetoothDevice) r0)
                goto L_0x02d7
            L_0x01f6:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                java.lang.String r0 = com.minirig.android.MainActivity.f3974m
                java.lang.String r1 = "No connected device"
                r4.mo5229a(r0, r1)
                java.lang.ref.WeakReference<com.minirig.android.MainActivity> r4 = r3.f4383b
                java.lang.Object r4 = r4.get()
                if (r4 == 0) goto L_0x02d7
                java.lang.ref.WeakReference<com.minirig.android.MainActivity> r4 = r3.f4383b
                java.lang.Object r4 = r4.get()
                com.minirig.android.MainActivity r4 = (com.minirig.android.MainActivity) r4
                boolean r4 = r4.isFinishing()
                if (r4 != 0) goto L_0x02d7
                android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
                com.minirig.android.MainActivity r0 = com.minirig.android.MainActivity.this
                r4.<init>(r0)
                java.lang.String r0 = "Failed reconnecting"
                android.app.AlertDialog$Builder r4 = r4.setTitle(r0)
                java.lang.String r0 = "Failed to reconnect to your Minirig. You may need to switch your bluetooth off and on."
                android.app.AlertDialog$Builder r4 = r4.setMessage(r0)
                java.lang.String r0 = "Connect"
                com.minirig.android.MainActivity$c$2 r1 = new com.minirig.android.MainActivity$c$2
                r1.<init>()
                android.app.AlertDialog$Builder r4 = r4.setPositiveButton(r0, r1)
                java.lang.String r0 = "Cancel"
                com.minirig.android.MainActivity$c$1 r1 = new com.minirig.android.MainActivity$c$1
                r1.<init>()
                android.app.AlertDialog$Builder r4 = r4.setNegativeButton(r0, r1)
                r0 = 17301543(0x1080027, float:2.4979364E-38)
                android.app.AlertDialog$Builder r4 = r4.setIcon(r0)
                r4.show()
                goto L_0x02d7
            L_0x024c:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                java.lang.String r4 = r4.m5714R()
                java.lang.String r0 = ""
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x026d
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                java.lang.String r0 = com.minirig.android.MainActivity.f3974m
                java.lang.String r1 = "No connected device"
                r4.mo5229a(r0, r1)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                android.view.View r0 = r4.f4136cf
                r4.setView(r0)
                goto L_0x02d7
            L_0x026d:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.MainActivity$b r4 = r4.f4216n
                com.minirig.android.MainActivity$b r0 = com.minirig.android.MainActivity.C1218b.BLE
                if (r4 != r0) goto L_0x0282
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                java.lang.String r0 = "Searching for devices"
                r4.m5923f((java.lang.String) r0)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                r4.m5872bD()
                goto L_0x02d7
            L_0x0282:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.MainActivity$b r4 = r4.f4216n
                com.minirig.android.MainActivity$b r0 = com.minirig.android.MainActivity.C1218b.SPP
                if (r4 != r0) goto L_0x02cc
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                android.bluetooth.BluetoothDevice r4 = r4.m5715S()
                if (r4 == 0) goto L_0x02ad
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                boolean r4 = r4.f4225w
                if (r4 == 0) goto L_0x02ad
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                java.lang.String r0 = com.minirig.android.MainActivity.f3974m
                java.lang.String r1 = "Found connected device for SPP connection"
                r4.mo5229a(r0, r1)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                android.bluetooth.BluetoothDevice r0 = r4.m5715S()
                r4.m5905c((android.bluetooth.BluetoothDevice) r0)
                goto L_0x02d7
            L_0x02ad:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                java.lang.String r0 = com.minirig.android.MainActivity.f3974m
                java.lang.String r1 = "No SPP devices found, begin auto connect scan"
                r4.mo5229a(r0, r1)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                java.lang.String r0 = "Searching for devices"
                r4.m5923f((java.lang.String) r0)
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                r4.m5872bD()
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                android.view.View r0 = r4.f4136cf
                r4.setView(r0)
                goto L_0x02d7
            L_0x02cc:
                com.minirig.android.MainActivity r4 = com.minirig.android.MainActivity.this
                com.minirig.android.GlobalApplication r4 = r4.f4214k
                java.lang.String r0 = com.minirig.android.MainActivity.f3974m
                java.lang.String r1 = "Connection mode not specified for connection after audio listener determined connection device"
                r4.mo5229a(r0, r1)
            L_0x02d7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.minirig.android.MainActivity.C1219c.onPostExecute(java.lang.String):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onProgressUpdate(int[]... iArr) {
            super.onProgressUpdate(iArr);
        }
    }
}
