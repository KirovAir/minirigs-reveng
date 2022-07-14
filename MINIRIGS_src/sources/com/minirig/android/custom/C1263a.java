package com.minirig.android.custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.minirig.android.MainActivity;
import com.minirig.android.R;
import java.util.ArrayList;

/* renamed from: com.minirig.android.custom.a */
public class C1263a extends BaseAdapter {

    /* renamed from: f */
    private static LayoutInflater f4627f;

    /* renamed from: a */
    final MainActivity f4628a;

    /* renamed from: b */
    ArrayList<String> f4629b;

    /* renamed from: c */
    ArrayList<String> f4630c;

    /* renamed from: d */
    ArrayList<Integer> f4631d;

    /* renamed from: e */
    Context f4632e;

    public long getItemId(int i) {
        return (long) i;
    }

    public C1263a(MainActivity mainActivity, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Integer> arrayList3) {
        this.f4628a = mainActivity;
        this.f4632e = mainActivity;
        this.f4629b = arrayList;
        this.f4630c = arrayList2;
        this.f4631d = arrayList3;
        f4627f = (LayoutInflater) this.f4632e.getSystemService("layout_inflater");
    }

    public int getCount() {
        return this.f4629b.size();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    /* renamed from: com.minirig.android.custom.a$a */
    public class C1265a {

        /* renamed from: a */
        TextView f4635a;

        /* renamed from: b */
        TextView f4636b;

        /* renamed from: c */
        ImageView f4637c;

        public C1265a() {
        }
    }

    public View getView(final int i, View view, ViewGroup viewGroup) {
        C1265a aVar = new C1265a();
        View inflate = f4627f.inflate(R.layout.info_item, (ViewGroup) null);
        aVar.f4635a = (TextView) inflate.findViewById(R.id.infoName);
        aVar.f4636b = (TextView) inflate.findViewById(R.id.infoDescription);
        aVar.f4637c = (ImageView) inflate.findViewById(R.id.infoImage);
        aVar.f4635a.setText(this.f4629b.get(i));
        aVar.f4636b.setText(this.f4630c.get(i));
        aVar.f4637c.setImageResource(this.f4631d.get(i).intValue());
        aVar.f4637c.getLayoutParams().height = 200;
        aVar.f4637c.getLayoutParams().width = 200;
        aVar.f4637c.requestLayout();
        inflate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int i = i;
                if (i == 0) {
                    C1263a.this.f4628a.mo5297y();
                } else if (i == 1) {
                    C1263a.this.f4628a.mo5298z();
                } else if (i == 2) {
                    C1263a.this.f4628a.mo5232A();
                } else if (i == 3) {
                    C1263a.this.f4628a.mo5233B();
                } else if (i == 4) {
                    C1263a.this.f4628a.mo5234C();
                } else if (i == 5) {
                    C1263a.this.f4628a.setView(C1263a.this.f4628a.f4104bz);
                }
            }
        });
        return inflate;
    }
}
