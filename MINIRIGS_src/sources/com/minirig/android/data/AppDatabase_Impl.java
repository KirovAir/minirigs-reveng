package com.minirig.android.data;

import android.arch.p003b.p004a.C0023b;
import android.arch.p003b.p004a.C0024c;
import android.arch.p003b.p006b.C0032a;
import android.arch.p003b.p006b.C0041d;
import android.arch.p003b.p006b.C0047f;
import android.arch.p003b.p006b.C0053h;
import android.arch.p003b.p006b.p008b.C0035a;
import java.util.HashMap;
import java.util.HashSet;

public class AppDatabase_Impl extends AppDatabase {

    /* renamed from: d */
    private volatile C1275d f4673d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0024c mo115b(C0032a aVar) {
        return aVar.f44a.mo60a(C0024c.C0026b.m85a(aVar.f45b).mo76a(aVar.f46c).mo75a((C0024c.C0025a) new C0053h(aVar, new C0053h.C0054a(11) {
            /* renamed from: b */
            public void mo131b(C0023b bVar) {
                bVar.mo42c("CREATE TABLE IF NOT EXISTS `users` (`user_id` TEXT NOT NULL, `synced` INTEGER NOT NULL, `manufacturer` TEXT, `model` TEXT, `mainControlsSecs` INTEGER NOT NULL, `eq5bandSecs` INTEGER NOT NULL, `eqMRBT1secs` INTEGER NOT NULL, `audioConfigSecs` INTEGER NOT NULL, `settingsSecs` INTEGER NOT NULL, `infoSecs` INTEGER NOT NULL, `mixtapeSecs` INTEGER NOT NULL, `aboutSecs` INTEGER NOT NULL, `broadcastSecs` INTEGER NOT NULL, `gainControlSecs` INTEGER NOT NULL, `turnOffButton` INTEGER NOT NULL, `switchDeviceButton` INTEGER NOT NULL, `powerSavingButton` INTEGER NOT NULL, `rememberGainButton` INTEGER NOT NULL, `stereoLockButton` INTEGER NOT NULL, `pausePlayButton` INTEGER NOT NULL, `skipTrackButton` INTEGER NOT NULL, `autoOffButton` INTEGER NOT NULL, `standByButton` INTEGER NOT NULL, `auxModePowerSavingButton` INTEGER NOT NULL, `dimLedButton` INTEGER NOT NULL, `vuLedButton` INTEGER NOT NULL, `tonesButton` INTEGER NOT NULL, `enablePowerOutButton` INTEGER NOT NULL, `clearPairedDevicesButton` INTEGER NOT NULL, `factoryResetButton` INTEGER NOT NULL, `previousTrackButton` INTEGER NOT NULL, `nextTrackButton` INTEGER NOT NULL, `playPauseMediaButton` INTEGER NOT NULL, `openMediaButton` INTEGER NOT NULL, `playlistButton` INTEGER NOT NULL, `muteButton` INTEGER NOT NULL, `headphoneButton` INTEGER NOT NULL, `gainButton` INTEGER NOT NULL, `monoMicMode` INTEGER NOT NULL, `monoSubMode` INTEGER NOT NULL, `stereoAuxMode` INTEGER NOT NULL, `stereoOneSubMode` INTEGER NOT NULL, `stereoTwoSubsMode` INTEGER NOT NULL, `monoLinkMode` INTEGER NOT NULL, `monoMode` INTEGER NOT NULL, `eqHomeVolumeButton` INTEGER NOT NULL, `eqHome5BandButton` INTEGER NOT NULL, `eqConfigMonoButton` INTEGER NOT NULL, `eqConfigMonoMicButton` INTEGER NOT NULL, `eqConfigMonoSubButton` INTEGER NOT NULL, `eqConfigStereoAuxButton` INTEGER NOT NULL, `eqConfigMonoLinkButton` INTEGER NOT NULL, `eqConfigStereoOneSubButton` INTEGER NOT NULL, `eqConfigStereoTwoSubsButton` INTEGER NOT NULL, `homeButton` INTEGER NOT NULL, `eqFlatCloses` INTEGER NOT NULL, `eqCustomCloses` INTEGER NOT NULL, `eqBand1Accumulation` INTEGER NOT NULL, `eqBand2Accumulation` INTEGER NOT NULL, `eqBand3Accumulation` INTEGER NOT NULL, `eqBand4Accumulation` INTEGER NOT NULL, `eqBand5Accumulation` INTEGER NOT NULL, `eqLoudCloses` INTEGER NOT NULL, `eqStudioCloses` INTEGER NOT NULL, `eqVocalCloses` INTEGER NOT NULL, PRIMARY KEY(`user_id`))");
                bVar.mo42c("CREATE TABLE IF NOT EXISTS `app_open_sessions` (`app_open_session_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` TEXT, `synced` INTEGER NOT NULL, `opened` TEXT, `closed` TEXT)");
                bVar.mo42c("CREATE TABLE IF NOT EXISTS `session_focus` (`session_focus_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `app_open_session_id` INTEGER NOT NULL, `synced` INTEGER NOT NULL, `focused` INTEGER NOT NULL, `when` TEXT)");
                bVar.mo42c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo42c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"8bdae25f33e195bb2f245df96acb4fa3\")");
            }

            /* renamed from: a */
            public void mo130a(C0023b bVar) {
                bVar.mo42c("DROP TABLE IF EXISTS `users`");
                bVar.mo42c("DROP TABLE IF EXISTS `app_open_sessions`");
                bVar.mo42c("DROP TABLE IF EXISTS `session_focus`");
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public void mo133d(C0023b bVar) {
                if (AppDatabase_Impl.this.f100c != null) {
                    int size = AppDatabase_Impl.this.f100c.size();
                    for (int i = 0; i < size; i++) {
                        ((C0047f.C0049b) AppDatabase_Impl.this.f100c.get(i)).mo126a(bVar);
                    }
                }
            }

            /* renamed from: c */
            public void mo132c(C0023b bVar) {
                C0023b unused = AppDatabase_Impl.this.f98a = bVar;
                AppDatabase_Impl.this.mo112a(bVar);
                if (AppDatabase_Impl.this.f100c != null) {
                    int size = AppDatabase_Impl.this.f100c.size();
                    for (int i = 0; i < size; i++) {
                        ((C0047f.C0049b) AppDatabase_Impl.this.f100c.get(i)).mo127b(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: e */
            public void mo134e(C0023b bVar) {
                HashMap hashMap = new HashMap(65);
                hashMap.put("user_id", new C0035a.C0036a("user_id", "TEXT", true, 1));
                hashMap.put("synced", new C0035a.C0036a("synced", "INTEGER", true, 0));
                hashMap.put("manufacturer", new C0035a.C0036a("manufacturer", "TEXT", false, 0));
                hashMap.put("model", new C0035a.C0036a("model", "TEXT", false, 0));
                hashMap.put("mainControlsSecs", new C0035a.C0036a("mainControlsSecs", "INTEGER", true, 0));
                hashMap.put("eq5bandSecs", new C0035a.C0036a("eq5bandSecs", "INTEGER", true, 0));
                hashMap.put("eqMRBT1secs", new C0035a.C0036a("eqMRBT1secs", "INTEGER", true, 0));
                hashMap.put("audioConfigSecs", new C0035a.C0036a("audioConfigSecs", "INTEGER", true, 0));
                hashMap.put("settingsSecs", new C0035a.C0036a("settingsSecs", "INTEGER", true, 0));
                hashMap.put("infoSecs", new C0035a.C0036a("infoSecs", "INTEGER", true, 0));
                hashMap.put("mixtapeSecs", new C0035a.C0036a("mixtapeSecs", "INTEGER", true, 0));
                hashMap.put("aboutSecs", new C0035a.C0036a("aboutSecs", "INTEGER", true, 0));
                hashMap.put("broadcastSecs", new C0035a.C0036a("broadcastSecs", "INTEGER", true, 0));
                hashMap.put("gainControlSecs", new C0035a.C0036a("gainControlSecs", "INTEGER", true, 0));
                hashMap.put("turnOffButton", new C0035a.C0036a("turnOffButton", "INTEGER", true, 0));
                hashMap.put("switchDeviceButton", new C0035a.C0036a("switchDeviceButton", "INTEGER", true, 0));
                hashMap.put("powerSavingButton", new C0035a.C0036a("powerSavingButton", "INTEGER", true, 0));
                hashMap.put("rememberGainButton", new C0035a.C0036a("rememberGainButton", "INTEGER", true, 0));
                hashMap.put("stereoLockButton", new C0035a.C0036a("stereoLockButton", "INTEGER", true, 0));
                hashMap.put("pausePlayButton", new C0035a.C0036a("pausePlayButton", "INTEGER", true, 0));
                hashMap.put("skipTrackButton", new C0035a.C0036a("skipTrackButton", "INTEGER", true, 0));
                hashMap.put("autoOffButton", new C0035a.C0036a("autoOffButton", "INTEGER", true, 0));
                hashMap.put("standByButton", new C0035a.C0036a("standByButton", "INTEGER", true, 0));
                hashMap.put("auxModePowerSavingButton", new C0035a.C0036a("auxModePowerSavingButton", "INTEGER", true, 0));
                hashMap.put("dimLedButton", new C0035a.C0036a("dimLedButton", "INTEGER", true, 0));
                hashMap.put("vuLedButton", new C0035a.C0036a("vuLedButton", "INTEGER", true, 0));
                hashMap.put("tonesButton", new C0035a.C0036a("tonesButton", "INTEGER", true, 0));
                hashMap.put("enablePowerOutButton", new C0035a.C0036a("enablePowerOutButton", "INTEGER", true, 0));
                hashMap.put("clearPairedDevicesButton", new C0035a.C0036a("clearPairedDevicesButton", "INTEGER", true, 0));
                hashMap.put("factoryResetButton", new C0035a.C0036a("factoryResetButton", "INTEGER", true, 0));
                hashMap.put("previousTrackButton", new C0035a.C0036a("previousTrackButton", "INTEGER", true, 0));
                hashMap.put("nextTrackButton", new C0035a.C0036a("nextTrackButton", "INTEGER", true, 0));
                hashMap.put("playPauseMediaButton", new C0035a.C0036a("playPauseMediaButton", "INTEGER", true, 0));
                hashMap.put("openMediaButton", new C0035a.C0036a("openMediaButton", "INTEGER", true, 0));
                hashMap.put("playlistButton", new C0035a.C0036a("playlistButton", "INTEGER", true, 0));
                hashMap.put("muteButton", new C0035a.C0036a("muteButton", "INTEGER", true, 0));
                hashMap.put("headphoneButton", new C0035a.C0036a("headphoneButton", "INTEGER", true, 0));
                hashMap.put("gainButton", new C0035a.C0036a("gainButton", "INTEGER", true, 0));
                hashMap.put("monoMicMode", new C0035a.C0036a("monoMicMode", "INTEGER", true, 0));
                hashMap.put("monoSubMode", new C0035a.C0036a("monoSubMode", "INTEGER", true, 0));
                hashMap.put("stereoAuxMode", new C0035a.C0036a("stereoAuxMode", "INTEGER", true, 0));
                hashMap.put("stereoOneSubMode", new C0035a.C0036a("stereoOneSubMode", "INTEGER", true, 0));
                hashMap.put("stereoTwoSubsMode", new C0035a.C0036a("stereoTwoSubsMode", "INTEGER", true, 0));
                hashMap.put("monoLinkMode", new C0035a.C0036a("monoLinkMode", "INTEGER", true, 0));
                hashMap.put("monoMode", new C0035a.C0036a("monoMode", "INTEGER", true, 0));
                hashMap.put("eqHomeVolumeButton", new C0035a.C0036a("eqHomeVolumeButton", "INTEGER", true, 0));
                hashMap.put("eqHome5BandButton", new C0035a.C0036a("eqHome5BandButton", "INTEGER", true, 0));
                hashMap.put("eqConfigMonoButton", new C0035a.C0036a("eqConfigMonoButton", "INTEGER", true, 0));
                hashMap.put("eqConfigMonoMicButton", new C0035a.C0036a("eqConfigMonoMicButton", "INTEGER", true, 0));
                hashMap.put("eqConfigMonoSubButton", new C0035a.C0036a("eqConfigMonoSubButton", "INTEGER", true, 0));
                hashMap.put("eqConfigStereoAuxButton", new C0035a.C0036a("eqConfigStereoAuxButton", "INTEGER", true, 0));
                hashMap.put("eqConfigMonoLinkButton", new C0035a.C0036a("eqConfigMonoLinkButton", "INTEGER", true, 0));
                hashMap.put("eqConfigStereoOneSubButton", new C0035a.C0036a("eqConfigStereoOneSubButton", "INTEGER", true, 0));
                hashMap.put("eqConfigStereoTwoSubsButton", new C0035a.C0036a("eqConfigStereoTwoSubsButton", "INTEGER", true, 0));
                hashMap.put("homeButton", new C0035a.C0036a("homeButton", "INTEGER", true, 0));
                hashMap.put("eqFlatCloses", new C0035a.C0036a("eqFlatCloses", "INTEGER", true, 0));
                hashMap.put("eqCustomCloses", new C0035a.C0036a("eqCustomCloses", "INTEGER", true, 0));
                hashMap.put("eqBand1Accumulation", new C0035a.C0036a("eqBand1Accumulation", "INTEGER", true, 0));
                hashMap.put("eqBand2Accumulation", new C0035a.C0036a("eqBand2Accumulation", "INTEGER", true, 0));
                hashMap.put("eqBand3Accumulation", new C0035a.C0036a("eqBand3Accumulation", "INTEGER", true, 0));
                hashMap.put("eqBand4Accumulation", new C0035a.C0036a("eqBand4Accumulation", "INTEGER", true, 0));
                hashMap.put("eqBand5Accumulation", new C0035a.C0036a("eqBand5Accumulation", "INTEGER", true, 0));
                hashMap.put("eqLoudCloses", new C0035a.C0036a("eqLoudCloses", "INTEGER", true, 0));
                hashMap.put("eqStudioCloses", new C0035a.C0036a("eqStudioCloses", "INTEGER", true, 0));
                hashMap.put("eqVocalCloses", new C0035a.C0036a("eqVocalCloses", "INTEGER", true, 0));
                C0035a aVar = new C0035a("users", hashMap, new HashSet(0), new HashSet(0));
                C0035a a = C0035a.m105a(bVar, "users");
                if (aVar.equals(a)) {
                    HashMap hashMap2 = new HashMap(5);
                    hashMap2.put("app_open_session_id", new C0035a.C0036a("app_open_session_id", "INTEGER", true, 1));
                    hashMap2.put("user_id", new C0035a.C0036a("user_id", "TEXT", false, 0));
                    hashMap2.put("synced", new C0035a.C0036a("synced", "INTEGER", true, 0));
                    hashMap2.put("opened", new C0035a.C0036a("opened", "TEXT", false, 0));
                    hashMap2.put("closed", new C0035a.C0036a("closed", "TEXT", false, 0));
                    C0035a aVar2 = new C0035a("app_open_sessions", hashMap2, new HashSet(0), new HashSet(0));
                    C0035a a2 = C0035a.m105a(bVar, "app_open_sessions");
                    if (aVar2.equals(a2)) {
                        HashMap hashMap3 = new HashMap(5);
                        hashMap3.put("session_focus_id", new C0035a.C0036a("session_focus_id", "INTEGER", true, 1));
                        hashMap3.put("app_open_session_id", new C0035a.C0036a("app_open_session_id", "INTEGER", true, 0));
                        hashMap3.put("synced", new C0035a.C0036a("synced", "INTEGER", true, 0));
                        hashMap3.put("focused", new C0035a.C0036a("focused", "INTEGER", true, 0));
                        hashMap3.put("when", new C0035a.C0036a("when", "TEXT", false, 0));
                        C0035a aVar3 = new C0035a("session_focus", hashMap3, new HashSet(0), new HashSet(0));
                        C0035a a3 = C0035a.m105a(bVar, "session_focus");
                        if (!aVar3.equals(a3)) {
                            throw new IllegalStateException("Migration didn't properly handle session_focus(com.minirig.android.data.SessionFocus).\n Expected:\n" + aVar3 + "\n Found:\n" + a3);
                        }
                        return;
                    }
                    throw new IllegalStateException("Migration didn't properly handle app_open_sessions(com.minirig.android.data.AppOpenSession).\n Expected:\n" + aVar2 + "\n Found:\n" + a2);
                }
                throw new IllegalStateException("Migration didn't properly handle users(com.minirig.android.data.User).\n Expected:\n" + aVar + "\n Found:\n" + a);
            }
        }, "8bdae25f33e195bb2f245df96acb4fa3", "5c642405c98e98524dc7be670017920e")).mo77a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0041d mo116c() {
        return new C0041d(this, "users", "app_open_sessions", "session_focus");
    }

    /* renamed from: j */
    public C1275d mo5588j() {
        C1275d dVar;
        if (this.f4673d != null) {
            return this.f4673d;
        }
        synchronized (this) {
            if (this.f4673d == null) {
                this.f4673d = new C1276e(this);
            }
            dVar = this.f4673d;
        }
        return dVar;
    }
}
