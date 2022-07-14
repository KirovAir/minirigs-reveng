package com.minirig.android.p049b;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.minirig.android.GlobalApplication;
import com.minirig.android.MainActivity;
import com.minirig.android.R;

/* renamed from: com.minirig.android.b.d */
public class C1246d {

    /* renamed from: a */
    GlobalApplication f4569a;

    /* renamed from: b */
    MainActivity f4570b;

    public C1246d(GlobalApplication globalApplication, MainActivity mainActivity) {
        this.f4569a = globalApplication;
        this.f4570b = mainActivity;
    }

    /* renamed from: a */
    public void mo5543a(String str, String str2) {
        if (mo5544a()) {
            final String str3 = "help-" + str;
            if (!this.f4569a.f3957c.getBoolean(str3, true)) {
                String string = this.f4569a.f3957c.getString("helpKeys", "");
                if (string.equals("")) {
                    this.f4569a.f3957c.edit().putString("helpKeys", str3).apply();
                } else if (!string.contains(str3)) {
                    this.f4569a.f3957c.edit().putString("helpKeys", string + "," + str3).apply();
                }
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f4570b);
                View inflate = LayoutInflater.from(this.f4570b).inflate(R.layout.checkbox, (ViewGroup) null);
                final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.off);
                final CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.skip);
                builder.setView(inflate);
                builder.setTitle(str);
                builder.setMessage(Html.fromHtml(str2));
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (checkBox2.isChecked()) {
                            C1246d.this.f4569a.f3957c.edit().putBoolean(str3, false).apply();
                        }
                        if (checkBox.isChecked()) {
                            C1246d.this.mo5545b();
                        }
                    }
                });
                builder.show();
            }
        }
    }

    /* renamed from: a */
    public boolean mo5544a() {
        return this.f4569a.f3957c.getBoolean("helpModeOn", true);
    }

    /* renamed from: b */
    public void mo5545b() {
        if (mo5544a()) {
            this.f4569a.f3957c.edit().putBoolean("helpModeOn", false).apply();
        } else {
            this.f4569a.f3957c.edit().putBoolean("helpModeOn", true).apply();
        }
    }

    /* renamed from: c */
    public void mo5546c() {
        if (!this.f4569a.f3957c.getBoolean("helpInitialWarning", false) && mo5544a()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f4570b);
            View inflate = LayoutInflater.from(this.f4570b).inflate(R.layout.checkbox, (ViewGroup) null);
            final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.skip);
            checkBox.setText("Turn help mode off.");
            builder.setView(inflate);
            builder.setTitle(this.f4570b.getResources().getString(R.string.helpInitialTitle));
            builder.setMessage(Html.fromHtml(this.f4570b.getResources().getString(R.string.helpInitialBody)));
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (checkBox.isChecked()) {
                        C1246d.this.f4569a.f3957c.edit().putBoolean("helpModeOn", false).apply();
                    }
                }
            });
            builder.show();
            this.f4569a.f3957c.edit().putBoolean("helpInitialWarning", true).apply();
        }
    }

    /* renamed from: d */
    public void mo5547d() {
        if (!mo5544a()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f4570b);
            View inflate = LayoutInflater.from(this.f4570b).inflate(R.layout.checkbox, (ViewGroup) null);
            final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.skip);
            checkBox.setText("Refresh all help messages.");
            builder.setView(inflate);
            builder.setTitle("Help mode");
            builder.setMessage(Html.fromHtml("Helpful information will be displayed when you click on buttons."));
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (checkBox.isChecked()) {
                        C1246d.this.f4569a.mo5229a("HELP", "helpKeys: " + C1246d.this.f4569a.f3957c.getString("helpKeys", ""));
                        for (String str : C1246d.this.f4569a.f3957c.getString("helpKeys", "").split(",")) {
                            C1246d.this.f4569a.mo5229a("HELP", "helpKey: " + str);
                            C1246d.this.f4569a.f3957c.edit().putBoolean(str, true).apply();
                        }
                    }
                }
            });
            builder.show();
        }
        mo5545b();
    }
}
