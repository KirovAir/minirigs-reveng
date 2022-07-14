package com.minirig.android.data;

import android.arch.p003b.p004a.C0030e;
import android.arch.p003b.p004a.C0031f;
import android.arch.p003b.p006b.C0034b;
import android.arch.p003b.p006b.C0040c;
import android.arch.p003b.p006b.C0047f;
import android.arch.p003b.p006b.C0055i;
import android.arch.p003b.p006b.C0056j;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.minirig.android.data.e */
public class C1276e implements C1275d {

    /* renamed from: a */
    private final C0047f f4752a;

    /* renamed from: b */
    private final C0040c f4753b;

    /* renamed from: c */
    private final C0034b f4754c;

    /* renamed from: d */
    private final C0056j f4755d;

    public C1276e(C0047f fVar) {
        this.f4752a = fVar;
        this.f4753b = new C0040c<C1274c>(fVar) {
            /* renamed from: a */
            public String mo81a() {
                return "INSERT OR REPLACE INTO `users`(`user_id`,`synced`,`manufacturer`,`model`,`mainControlsSecs`,`eq5bandSecs`,`eqMRBT1secs`,`audioConfigSecs`,`settingsSecs`,`infoSecs`,`mixtapeSecs`,`aboutSecs`,`broadcastSecs`,`gainControlSecs`,`turnOffButton`,`switchDeviceButton`,`powerSavingButton`,`rememberGainButton`,`stereoLockButton`,`pausePlayButton`,`skipTrackButton`,`autoOffButton`,`standByButton`,`auxModePowerSavingButton`,`dimLedButton`,`vuLedButton`,`tonesButton`,`enablePowerOutButton`,`clearPairedDevicesButton`,`factoryResetButton`,`previousTrackButton`,`nextTrackButton`,`playPauseMediaButton`,`openMediaButton`,`playlistButton`,`muteButton`,`headphoneButton`,`gainButton`,`monoMicMode`,`monoSubMode`,`stereoAuxMode`,`stereoOneSubMode`,`stereoTwoSubsMode`,`monoLinkMode`,`monoMode`,`eqHomeVolumeButton`,`eqHome5BandButton`,`eqConfigMonoButton`,`eqConfigMonoMicButton`,`eqConfigMonoSubButton`,`eqConfigStereoAuxButton`,`eqConfigMonoLinkButton`,`eqConfigStereoOneSubButton`,`eqConfigStereoTwoSubsButton`,`homeButton`,`eqFlatCloses`,`eqCustomCloses`,`eqBand1Accumulation`,`eqBand2Accumulation`,`eqBand3Accumulation`,`eqBand4Accumulation`,`eqBand5Accumulation`,`eqLoudCloses`,`eqStudioCloses`,`eqVocalCloses`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public void mo98a(C0031f fVar, C1274c cVar) {
                if (cVar.f4713a == null) {
                    fVar.mo61a(1);
                } else {
                    fVar.mo64a(1, cVar.f4713a);
                }
                fVar.mo63a(2, (long) cVar.f4727b);
                if (cVar.f4728c == null) {
                    fVar.mo61a(3);
                } else {
                    fVar.mo64a(3, cVar.f4728c);
                }
                if (cVar.f4729d == null) {
                    fVar.mo61a(4);
                } else {
                    fVar.mo64a(4, cVar.f4729d);
                }
                fVar.mo63a(5, (long) cVar.f4730e);
                fVar.mo63a(6, (long) cVar.f4731f);
                fVar.mo63a(7, (long) cVar.f4732g);
                fVar.mo63a(8, (long) cVar.f4733h);
                fVar.mo63a(9, (long) cVar.f4734i);
                fVar.mo63a(10, (long) cVar.f4735j);
                fVar.mo63a(11, (long) cVar.f4736k);
                fVar.mo63a(12, (long) cVar.f4737l);
                fVar.mo63a(13, (long) cVar.f4738m);
                fVar.mo63a(14, (long) cVar.f4739n);
                fVar.mo63a(15, (long) cVar.f4740o);
                fVar.mo63a(16, (long) cVar.f4741p);
                fVar.mo63a(17, (long) cVar.f4742q);
                fVar.mo63a(18, (long) cVar.f4743r);
                fVar.mo63a(19, (long) cVar.f4744s);
                fVar.mo63a(20, (long) cVar.f4745t);
                fVar.mo63a(21, (long) cVar.f4746u);
                fVar.mo63a(22, (long) cVar.f4747v);
                fVar.mo63a(23, (long) cVar.f4748w);
                fVar.mo63a(24, (long) cVar.f4749x);
                fVar.mo63a(25, (long) cVar.f4750y);
                fVar.mo63a(26, (long) cVar.f4751z);
                fVar.mo63a(27, (long) cVar.f4687A);
                fVar.mo63a(28, (long) cVar.f4688B);
                fVar.mo63a(29, (long) cVar.f4689C);
                fVar.mo63a(30, (long) cVar.f4690D);
                fVar.mo63a(31, (long) cVar.f4691E);
                fVar.mo63a(32, (long) cVar.f4692F);
                fVar.mo63a(33, (long) cVar.f4693G);
                fVar.mo63a(34, (long) cVar.f4694H);
                fVar.mo63a(35, (long) cVar.f4695I);
                fVar.mo63a(36, (long) cVar.f4696J);
                fVar.mo63a(37, (long) cVar.f4697K);
                fVar.mo63a(38, (long) cVar.f4698L);
                fVar.mo63a(39, (long) cVar.f4699M);
                fVar.mo63a(40, (long) cVar.f4700N);
                fVar.mo63a(41, (long) cVar.f4701O);
                fVar.mo63a(42, (long) cVar.f4702P);
                fVar.mo63a(43, (long) cVar.f4703Q);
                fVar.mo63a(44, (long) cVar.f4704R);
                fVar.mo63a(45, (long) cVar.f4705S);
                fVar.mo63a(46, (long) cVar.f4706T);
                fVar.mo63a(47, (long) cVar.f4707U);
                fVar.mo63a(48, (long) cVar.f4708V);
                fVar.mo63a(49, (long) cVar.f4709W);
                fVar.mo63a(50, (long) cVar.f4710X);
                fVar.mo63a(51, (long) cVar.f4711Y);
                fVar.mo63a(52, (long) cVar.f4712Z);
                fVar.mo63a(53, (long) cVar.f4714aa);
                fVar.mo63a(54, (long) cVar.f4715ab);
                fVar.mo63a(55, (long) cVar.f4716ac);
                fVar.mo63a(56, (long) cVar.f4717ad);
                fVar.mo63a(57, (long) cVar.f4718ae);
                fVar.mo63a(58, (long) cVar.f4719af);
                fVar.mo63a(59, (long) cVar.f4720ag);
                fVar.mo63a(60, (long) cVar.f4721ah);
                fVar.mo63a(61, (long) cVar.f4722ai);
                fVar.mo63a(62, (long) cVar.f4723aj);
                fVar.mo63a(63, (long) cVar.f4724ak);
                fVar.mo63a(64, (long) cVar.f4725al);
                fVar.mo63a(65, (long) cVar.f4726am);
            }
        };
        this.f4754c = new C0034b<C1274c>(fVar) {
            /* renamed from: a */
            public String mo81a() {
                return "UPDATE OR REPLACE `users` SET `user_id` = ?,`synced` = ?,`manufacturer` = ?,`model` = ?,`mainControlsSecs` = ?,`eq5bandSecs` = ?,`eqMRBT1secs` = ?,`audioConfigSecs` = ?,`settingsSecs` = ?,`infoSecs` = ?,`mixtapeSecs` = ?,`aboutSecs` = ?,`broadcastSecs` = ?,`gainControlSecs` = ?,`turnOffButton` = ?,`switchDeviceButton` = ?,`powerSavingButton` = ?,`rememberGainButton` = ?,`stereoLockButton` = ?,`pausePlayButton` = ?,`skipTrackButton` = ?,`autoOffButton` = ?,`standByButton` = ?,`auxModePowerSavingButton` = ?,`dimLedButton` = ?,`vuLedButton` = ?,`tonesButton` = ?,`enablePowerOutButton` = ?,`clearPairedDevicesButton` = ?,`factoryResetButton` = ?,`previousTrackButton` = ?,`nextTrackButton` = ?,`playPauseMediaButton` = ?,`openMediaButton` = ?,`playlistButton` = ?,`muteButton` = ?,`headphoneButton` = ?,`gainButton` = ?,`monoMicMode` = ?,`monoSubMode` = ?,`stereoAuxMode` = ?,`stereoOneSubMode` = ?,`stereoTwoSubsMode` = ?,`monoLinkMode` = ?,`monoMode` = ?,`eqHomeVolumeButton` = ?,`eqHome5BandButton` = ?,`eqConfigMonoButton` = ?,`eqConfigMonoMicButton` = ?,`eqConfigMonoSubButton` = ?,`eqConfigStereoAuxButton` = ?,`eqConfigMonoLinkButton` = ?,`eqConfigStereoOneSubButton` = ?,`eqConfigStereoTwoSubsButton` = ?,`homeButton` = ?,`eqFlatCloses` = ?,`eqCustomCloses` = ?,`eqBand1Accumulation` = ?,`eqBand2Accumulation` = ?,`eqBand3Accumulation` = ?,`eqBand4Accumulation` = ?,`eqBand5Accumulation` = ?,`eqLoudCloses` = ?,`eqStudioCloses` = ?,`eqVocalCloses` = ? WHERE `user_id` = ?";
            }

            /* renamed from: a */
            public void mo82a(C0031f fVar, C1274c cVar) {
                if (cVar.f4713a == null) {
                    fVar.mo61a(1);
                } else {
                    fVar.mo64a(1, cVar.f4713a);
                }
                fVar.mo63a(2, (long) cVar.f4727b);
                if (cVar.f4728c == null) {
                    fVar.mo61a(3);
                } else {
                    fVar.mo64a(3, cVar.f4728c);
                }
                if (cVar.f4729d == null) {
                    fVar.mo61a(4);
                } else {
                    fVar.mo64a(4, cVar.f4729d);
                }
                fVar.mo63a(5, (long) cVar.f4730e);
                fVar.mo63a(6, (long) cVar.f4731f);
                fVar.mo63a(7, (long) cVar.f4732g);
                fVar.mo63a(8, (long) cVar.f4733h);
                fVar.mo63a(9, (long) cVar.f4734i);
                fVar.mo63a(10, (long) cVar.f4735j);
                fVar.mo63a(11, (long) cVar.f4736k);
                fVar.mo63a(12, (long) cVar.f4737l);
                fVar.mo63a(13, (long) cVar.f4738m);
                fVar.mo63a(14, (long) cVar.f4739n);
                fVar.mo63a(15, (long) cVar.f4740o);
                fVar.mo63a(16, (long) cVar.f4741p);
                fVar.mo63a(17, (long) cVar.f4742q);
                fVar.mo63a(18, (long) cVar.f4743r);
                fVar.mo63a(19, (long) cVar.f4744s);
                fVar.mo63a(20, (long) cVar.f4745t);
                fVar.mo63a(21, (long) cVar.f4746u);
                fVar.mo63a(22, (long) cVar.f4747v);
                fVar.mo63a(23, (long) cVar.f4748w);
                fVar.mo63a(24, (long) cVar.f4749x);
                fVar.mo63a(25, (long) cVar.f4750y);
                fVar.mo63a(26, (long) cVar.f4751z);
                fVar.mo63a(27, (long) cVar.f4687A);
                fVar.mo63a(28, (long) cVar.f4688B);
                fVar.mo63a(29, (long) cVar.f4689C);
                fVar.mo63a(30, (long) cVar.f4690D);
                fVar.mo63a(31, (long) cVar.f4691E);
                fVar.mo63a(32, (long) cVar.f4692F);
                fVar.mo63a(33, (long) cVar.f4693G);
                fVar.mo63a(34, (long) cVar.f4694H);
                fVar.mo63a(35, (long) cVar.f4695I);
                fVar.mo63a(36, (long) cVar.f4696J);
                fVar.mo63a(37, (long) cVar.f4697K);
                fVar.mo63a(38, (long) cVar.f4698L);
                fVar.mo63a(39, (long) cVar.f4699M);
                fVar.mo63a(40, (long) cVar.f4700N);
                fVar.mo63a(41, (long) cVar.f4701O);
                fVar.mo63a(42, (long) cVar.f4702P);
                fVar.mo63a(43, (long) cVar.f4703Q);
                fVar.mo63a(44, (long) cVar.f4704R);
                fVar.mo63a(45, (long) cVar.f4705S);
                fVar.mo63a(46, (long) cVar.f4706T);
                fVar.mo63a(47, (long) cVar.f4707U);
                fVar.mo63a(48, (long) cVar.f4708V);
                fVar.mo63a(49, (long) cVar.f4709W);
                fVar.mo63a(50, (long) cVar.f4710X);
                fVar.mo63a(51, (long) cVar.f4711Y);
                fVar.mo63a(52, (long) cVar.f4712Z);
                fVar.mo63a(53, (long) cVar.f4714aa);
                fVar.mo63a(54, (long) cVar.f4715ab);
                fVar.mo63a(55, (long) cVar.f4716ac);
                fVar.mo63a(56, (long) cVar.f4717ad);
                fVar.mo63a(57, (long) cVar.f4718ae);
                fVar.mo63a(58, (long) cVar.f4719af);
                fVar.mo63a(59, (long) cVar.f4720ag);
                fVar.mo63a(60, (long) cVar.f4721ah);
                fVar.mo63a(61, (long) cVar.f4722ai);
                fVar.mo63a(62, (long) cVar.f4723aj);
                fVar.mo63a(63, (long) cVar.f4724ak);
                fVar.mo63a(64, (long) cVar.f4725al);
                fVar.mo63a(65, (long) cVar.f4726am);
                if (cVar.f4713a == null) {
                    fVar.mo61a(66);
                } else {
                    fVar.mo64a(66, cVar.f4713a);
                }
            }
        };
        this.f4755d = new C0056j(fVar) {
            /* renamed from: a */
            public String mo81a() {
                return "delete from users";
            }
        };
    }

    /* renamed from: a */
    public void mo5594a(C1274c cVar) {
        this.f4752a.mo119f();
        try {
            this.f4753b.mo99a(cVar);
            this.f4752a.mo121h();
        } finally {
            this.f4752a.mo120g();
        }
    }

    /* renamed from: b */
    public void mo5595b(C1274c cVar) {
        this.f4752a.mo119f();
        try {
            this.f4754c.mo80a(cVar);
            this.f4752a.mo121h();
        } finally {
            this.f4752a.mo120g();
        }
    }

    /* renamed from: a */
    public List<C1274c> mo5593a() {
        C0055i iVar;
        C0055i a = C0055i.m173a("select * from users", 0);
        Cursor a2 = this.f4752a.mo109a((C0030e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("user_id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("synced");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("manufacturer");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("model");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("mainControlsSecs");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("eq5bandSecs");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("eqMRBT1secs");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("audioConfigSecs");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("settingsSecs");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("infoSecs");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("mixtapeSecs");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("aboutSecs");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("broadcastSecs");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("gainControlSecs");
            iVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("turnOffButton");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("switchDeviceButton");
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("powerSavingButton");
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("rememberGainButton");
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("stereoLockButton");
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("pausePlayButton");
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("skipTrackButton");
                int columnIndexOrThrow22 = a2.getColumnIndexOrThrow("autoOffButton");
                int columnIndexOrThrow23 = a2.getColumnIndexOrThrow("standByButton");
                int columnIndexOrThrow24 = a2.getColumnIndexOrThrow("auxModePowerSavingButton");
                int columnIndexOrThrow25 = a2.getColumnIndexOrThrow("dimLedButton");
                int columnIndexOrThrow26 = a2.getColumnIndexOrThrow("vuLedButton");
                int columnIndexOrThrow27 = a2.getColumnIndexOrThrow("tonesButton");
                int columnIndexOrThrow28 = a2.getColumnIndexOrThrow("enablePowerOutButton");
                int columnIndexOrThrow29 = a2.getColumnIndexOrThrow("clearPairedDevicesButton");
                int columnIndexOrThrow30 = a2.getColumnIndexOrThrow("factoryResetButton");
                int columnIndexOrThrow31 = a2.getColumnIndexOrThrow("previousTrackButton");
                int columnIndexOrThrow32 = a2.getColumnIndexOrThrow("nextTrackButton");
                int columnIndexOrThrow33 = a2.getColumnIndexOrThrow("playPauseMediaButton");
                int columnIndexOrThrow34 = a2.getColumnIndexOrThrow("openMediaButton");
                int columnIndexOrThrow35 = a2.getColumnIndexOrThrow("playlistButton");
                int columnIndexOrThrow36 = a2.getColumnIndexOrThrow("muteButton");
                int columnIndexOrThrow37 = a2.getColumnIndexOrThrow("headphoneButton");
                int columnIndexOrThrow38 = a2.getColumnIndexOrThrow("gainButton");
                int columnIndexOrThrow39 = a2.getColumnIndexOrThrow("monoMicMode");
                int columnIndexOrThrow40 = a2.getColumnIndexOrThrow("monoSubMode");
                int columnIndexOrThrow41 = a2.getColumnIndexOrThrow("stereoAuxMode");
                int columnIndexOrThrow42 = a2.getColumnIndexOrThrow("stereoOneSubMode");
                int columnIndexOrThrow43 = a2.getColumnIndexOrThrow("stereoTwoSubsMode");
                int columnIndexOrThrow44 = a2.getColumnIndexOrThrow("monoLinkMode");
                int columnIndexOrThrow45 = a2.getColumnIndexOrThrow("monoMode");
                int columnIndexOrThrow46 = a2.getColumnIndexOrThrow("eqHomeVolumeButton");
                int columnIndexOrThrow47 = a2.getColumnIndexOrThrow("eqHome5BandButton");
                int columnIndexOrThrow48 = a2.getColumnIndexOrThrow("eqConfigMonoButton");
                int columnIndexOrThrow49 = a2.getColumnIndexOrThrow("eqConfigMonoMicButton");
                int columnIndexOrThrow50 = a2.getColumnIndexOrThrow("eqConfigMonoSubButton");
                int columnIndexOrThrow51 = a2.getColumnIndexOrThrow("eqConfigStereoAuxButton");
                int columnIndexOrThrow52 = a2.getColumnIndexOrThrow("eqConfigMonoLinkButton");
                int columnIndexOrThrow53 = a2.getColumnIndexOrThrow("eqConfigStereoOneSubButton");
                int columnIndexOrThrow54 = a2.getColumnIndexOrThrow("eqConfigStereoTwoSubsButton");
                int columnIndexOrThrow55 = a2.getColumnIndexOrThrow("homeButton");
                int columnIndexOrThrow56 = a2.getColumnIndexOrThrow("eqFlatCloses");
                int columnIndexOrThrow57 = a2.getColumnIndexOrThrow("eqCustomCloses");
                int columnIndexOrThrow58 = a2.getColumnIndexOrThrow("eqBand1Accumulation");
                int columnIndexOrThrow59 = a2.getColumnIndexOrThrow("eqBand2Accumulation");
                int columnIndexOrThrow60 = a2.getColumnIndexOrThrow("eqBand3Accumulation");
                int columnIndexOrThrow61 = a2.getColumnIndexOrThrow("eqBand4Accumulation");
                int columnIndexOrThrow62 = a2.getColumnIndexOrThrow("eqBand5Accumulation");
                int columnIndexOrThrow63 = a2.getColumnIndexOrThrow("eqLoudCloses");
                int columnIndexOrThrow64 = a2.getColumnIndexOrThrow("eqStudioCloses");
                int columnIndexOrThrow65 = a2.getColumnIndexOrThrow("eqVocalCloses");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    int i2 = columnIndexOrThrow;
                    int i3 = columnIndexOrThrow3;
                    int i4 = columnIndexOrThrow4;
                    C1274c cVar = new C1274c(a2.getString(columnIndexOrThrow), a2.getString(columnIndexOrThrow3), a2.getString(columnIndexOrThrow4));
                    cVar.f4727b = a2.getInt(columnIndexOrThrow2);
                    cVar.f4730e = a2.getInt(columnIndexOrThrow5);
                    cVar.f4731f = a2.getInt(columnIndexOrThrow6);
                    cVar.f4732g = a2.getInt(columnIndexOrThrow7);
                    cVar.f4733h = a2.getInt(columnIndexOrThrow8);
                    cVar.f4734i = a2.getInt(columnIndexOrThrow9);
                    cVar.f4735j = a2.getInt(columnIndexOrThrow10);
                    cVar.f4736k = a2.getInt(columnIndexOrThrow11);
                    cVar.f4737l = a2.getInt(columnIndexOrThrow12);
                    cVar.f4738m = a2.getInt(columnIndexOrThrow13);
                    int i5 = i;
                    cVar.f4739n = a2.getInt(i5);
                    int i6 = columnIndexOrThrow15;
                    cVar.f4740o = a2.getInt(i6);
                    i = i5;
                    int i7 = columnIndexOrThrow16;
                    cVar.f4741p = a2.getInt(i7);
                    columnIndexOrThrow15 = i6;
                    int i8 = columnIndexOrThrow17;
                    cVar.f4742q = a2.getInt(i8);
                    columnIndexOrThrow17 = i8;
                    int i9 = columnIndexOrThrow18;
                    cVar.f4743r = a2.getInt(i9);
                    columnIndexOrThrow18 = i9;
                    int i10 = columnIndexOrThrow19;
                    cVar.f4744s = a2.getInt(i10);
                    columnIndexOrThrow19 = i10;
                    int i11 = columnIndexOrThrow20;
                    cVar.f4745t = a2.getInt(i11);
                    columnIndexOrThrow20 = i11;
                    int i12 = columnIndexOrThrow21;
                    cVar.f4746u = a2.getInt(i12);
                    columnIndexOrThrow21 = i12;
                    int i13 = columnIndexOrThrow22;
                    cVar.f4747v = a2.getInt(i13);
                    columnIndexOrThrow22 = i13;
                    int i14 = columnIndexOrThrow23;
                    cVar.f4748w = a2.getInt(i14);
                    columnIndexOrThrow23 = i14;
                    int i15 = columnIndexOrThrow24;
                    cVar.f4749x = a2.getInt(i15);
                    columnIndexOrThrow24 = i15;
                    int i16 = columnIndexOrThrow25;
                    cVar.f4750y = a2.getInt(i16);
                    columnIndexOrThrow25 = i16;
                    int i17 = columnIndexOrThrow26;
                    cVar.f4751z = a2.getInt(i17);
                    columnIndexOrThrow26 = i17;
                    int i18 = columnIndexOrThrow27;
                    cVar.f4687A = a2.getInt(i18);
                    columnIndexOrThrow27 = i18;
                    int i19 = columnIndexOrThrow28;
                    cVar.f4688B = a2.getInt(i19);
                    columnIndexOrThrow28 = i19;
                    int i20 = columnIndexOrThrow29;
                    cVar.f4689C = a2.getInt(i20);
                    columnIndexOrThrow29 = i20;
                    int i21 = columnIndexOrThrow30;
                    cVar.f4690D = a2.getInt(i21);
                    columnIndexOrThrow30 = i21;
                    int i22 = columnIndexOrThrow31;
                    cVar.f4691E = a2.getInt(i22);
                    columnIndexOrThrow31 = i22;
                    int i23 = columnIndexOrThrow32;
                    cVar.f4692F = a2.getInt(i23);
                    columnIndexOrThrow32 = i23;
                    int i24 = columnIndexOrThrow33;
                    cVar.f4693G = a2.getInt(i24);
                    columnIndexOrThrow33 = i24;
                    int i25 = columnIndexOrThrow34;
                    cVar.f4694H = a2.getInt(i25);
                    columnIndexOrThrow34 = i25;
                    int i26 = columnIndexOrThrow35;
                    cVar.f4695I = a2.getInt(i26);
                    columnIndexOrThrow35 = i26;
                    int i27 = columnIndexOrThrow36;
                    cVar.f4696J = a2.getInt(i27);
                    columnIndexOrThrow36 = i27;
                    int i28 = columnIndexOrThrow37;
                    cVar.f4697K = a2.getInt(i28);
                    columnIndexOrThrow37 = i28;
                    int i29 = columnIndexOrThrow38;
                    cVar.f4698L = a2.getInt(i29);
                    columnIndexOrThrow38 = i29;
                    int i30 = columnIndexOrThrow39;
                    cVar.f4699M = a2.getInt(i30);
                    columnIndexOrThrow39 = i30;
                    int i31 = columnIndexOrThrow40;
                    cVar.f4700N = a2.getInt(i31);
                    columnIndexOrThrow40 = i31;
                    int i32 = columnIndexOrThrow41;
                    cVar.f4701O = a2.getInt(i32);
                    columnIndexOrThrow41 = i32;
                    int i33 = columnIndexOrThrow42;
                    cVar.f4702P = a2.getInt(i33);
                    columnIndexOrThrow42 = i33;
                    int i34 = columnIndexOrThrow43;
                    cVar.f4703Q = a2.getInt(i34);
                    columnIndexOrThrow43 = i34;
                    int i35 = columnIndexOrThrow44;
                    cVar.f4704R = a2.getInt(i35);
                    columnIndexOrThrow44 = i35;
                    int i36 = columnIndexOrThrow45;
                    cVar.f4705S = a2.getInt(i36);
                    columnIndexOrThrow45 = i36;
                    int i37 = columnIndexOrThrow46;
                    cVar.f4706T = a2.getInt(i37);
                    columnIndexOrThrow46 = i37;
                    int i38 = columnIndexOrThrow47;
                    cVar.f4707U = a2.getInt(i38);
                    columnIndexOrThrow47 = i38;
                    int i39 = columnIndexOrThrow48;
                    cVar.f4708V = a2.getInt(i39);
                    columnIndexOrThrow48 = i39;
                    int i40 = columnIndexOrThrow49;
                    cVar.f4709W = a2.getInt(i40);
                    columnIndexOrThrow49 = i40;
                    int i41 = columnIndexOrThrow50;
                    cVar.f4710X = a2.getInt(i41);
                    columnIndexOrThrow50 = i41;
                    int i42 = columnIndexOrThrow51;
                    cVar.f4711Y = a2.getInt(i42);
                    columnIndexOrThrow51 = i42;
                    int i43 = columnIndexOrThrow52;
                    cVar.f4712Z = a2.getInt(i43);
                    columnIndexOrThrow52 = i43;
                    int i44 = columnIndexOrThrow53;
                    cVar.f4714aa = a2.getInt(i44);
                    columnIndexOrThrow53 = i44;
                    int i45 = columnIndexOrThrow54;
                    cVar.f4715ab = a2.getInt(i45);
                    columnIndexOrThrow54 = i45;
                    int i46 = columnIndexOrThrow55;
                    cVar.f4716ac = a2.getInt(i46);
                    columnIndexOrThrow55 = i46;
                    int i47 = columnIndexOrThrow56;
                    cVar.f4717ad = a2.getInt(i47);
                    columnIndexOrThrow56 = i47;
                    int i48 = columnIndexOrThrow57;
                    cVar.f4718ae = a2.getInt(i48);
                    columnIndexOrThrow57 = i48;
                    int i49 = columnIndexOrThrow58;
                    cVar.f4719af = a2.getInt(i49);
                    columnIndexOrThrow58 = i49;
                    int i50 = columnIndexOrThrow59;
                    cVar.f4720ag = a2.getInt(i50);
                    columnIndexOrThrow59 = i50;
                    int i51 = columnIndexOrThrow60;
                    cVar.f4721ah = a2.getInt(i51);
                    columnIndexOrThrow60 = i51;
                    int i52 = columnIndexOrThrow61;
                    cVar.f4722ai = a2.getInt(i52);
                    columnIndexOrThrow61 = i52;
                    int i53 = columnIndexOrThrow62;
                    cVar.f4723aj = a2.getInt(i53);
                    columnIndexOrThrow62 = i53;
                    int i54 = columnIndexOrThrow63;
                    cVar.f4724ak = a2.getInt(i54);
                    columnIndexOrThrow63 = i54;
                    int i55 = columnIndexOrThrow64;
                    cVar.f4725al = a2.getInt(i55);
                    columnIndexOrThrow64 = i55;
                    int i56 = columnIndexOrThrow65;
                    cVar.f4726am = a2.getInt(i56);
                    arrayList.add(cVar);
                    columnIndexOrThrow65 = i56;
                    columnIndexOrThrow16 = i7;
                    columnIndexOrThrow = i2;
                    columnIndexOrThrow3 = i3;
                    columnIndexOrThrow4 = i4;
                }
                a2.close();
                iVar.mo135b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                iVar.mo135b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iVar = a;
            a2.close();
            iVar.mo135b();
            throw th;
        }
    }
}
