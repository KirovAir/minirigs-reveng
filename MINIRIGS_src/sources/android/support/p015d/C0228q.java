package android.support.p015d;

import android.animation.TimeInterpolator;
import android.support.p015d.C0216m;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.d.q */
public class C0228q extends C0216m {

    /* renamed from: h */
    int f734h;

    /* renamed from: i */
    boolean f735i = false;

    /* renamed from: j */
    private ArrayList<C0216m> f736j = new ArrayList<>();

    /* renamed from: k */
    private boolean f737k = true;

    /* renamed from: l */
    private int f738l = 0;

    /* renamed from: a */
    public C0228q mo724a(int i) {
        switch (i) {
            case 0:
                this.f737k = true;
                break;
            case 1:
                this.f737k = false;
                break;
            default:
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: a */
    public C0228q mo725a(C0216m mVar) {
        this.f736j.add(mVar);
        mVar.f698d = this;
        if (this.f695a >= 0) {
            mVar.mo676a(this.f695a);
        }
        if ((this.f738l & 1) != 0) {
            mVar.mo677a(mo699d());
        }
        if ((this.f738l & 2) != 0) {
            mVar.mo684a(mo711n());
        }
        if ((this.f738l & 4) != 0) {
            mVar.mo682a(mo709l());
        }
        if ((this.f738l & 8) != 0) {
            mVar.mo683a(mo710m());
        }
        return this;
    }

    /* renamed from: q */
    public int mo734q() {
        return this.f736j.size();
    }

    /* renamed from: b */
    public C0216m mo726b(int i) {
        if (i < 0 || i >= this.f736j.size()) {
            return null;
        }
        return this.f736j.get(i);
    }

    /* renamed from: c */
    public C0228q mo676a(long j) {
        super.mo676a(j);
        if (this.f695a >= 0) {
            int size = this.f736j.size();
            for (int i = 0; i < size; i++) {
                this.f736j.get(i).mo676a(j);
            }
        }
        return this;
    }

    /* renamed from: d */
    public C0228q mo691b(long j) {
        return (C0228q) super.mo691b(j);
    }

    /* renamed from: b */
    public C0228q mo677a(TimeInterpolator timeInterpolator) {
        this.f738l |= 1;
        ArrayList<C0216m> arrayList = this.f736j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f736j.get(i).mo677a(timeInterpolator);
            }
        }
        return (C0228q) super.mo677a(timeInterpolator);
    }

    /* renamed from: f */
    public C0228q mo693b(View view) {
        for (int i = 0; i < this.f736j.size(); i++) {
            this.f736j.get(i).mo693b(view);
        }
        return (C0228q) super.mo693b(view);
    }

    /* renamed from: c */
    public C0228q mo678a(C0216m.C0222c cVar) {
        return (C0228q) super.mo678a(cVar);
    }

    /* renamed from: g */
    public C0228q mo696c(View view) {
        for (int i = 0; i < this.f736j.size(); i++) {
            this.f736j.get(i).mo696c(view);
        }
        return (C0228q) super.mo696c(view);
    }

    /* renamed from: d */
    public C0228q mo692b(C0216m.C0222c cVar) {
        return (C0228q) super.mo692b(cVar);
    }

    /* renamed from: a */
    public void mo682a(C0209g gVar) {
        super.mo682a(gVar);
        this.f738l |= 4;
        for (int i = 0; i < this.f736j.size(); i++) {
            this.f736j.get(i).mo682a(gVar);
        }
    }

    /* renamed from: r */
    private void m828r() {
        C0230a aVar = new C0230a(this);
        Iterator<C0216m> it = this.f736j.iterator();
        while (it.hasNext()) {
            it.next().mo678a((C0216m.C0222c) aVar);
        }
        this.f734h = this.f736j.size();
    }

    /* renamed from: android.support.d.q$a */
    static class C0230a extends C0223n {

        /* renamed from: a */
        C0228q f741a;

        C0230a(C0228q qVar) {
            this.f741a = qVar;
        }

        /* renamed from: d */
        public void mo612d(C0216m mVar) {
            if (!this.f741a.f735i) {
                this.f741a.mo707j();
                this.f741a.f735i = true;
            }
        }

        /* renamed from: a */
        public void mo609a(C0216m mVar) {
            C0228q qVar = this.f741a;
            qVar.f734h--;
            if (this.f741a.f734h == 0) {
                C0228q qVar2 = this.f741a;
                qVar2.f735i = false;
                qVar2.mo708k();
            }
            mVar.mo692b((C0216m.C0222c) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo686a(ViewGroup viewGroup, C0233t tVar, C0233t tVar2, ArrayList<C0232s> arrayList, ArrayList<C0232s> arrayList2) {
        long c = mo695c();
        int size = this.f736j.size();
        for (int i = 0; i < size; i++) {
            C0216m mVar = this.f736j.get(i);
            if (c > 0 && (this.f737k || i == 0)) {
                long c2 = mVar.mo695c();
                if (c2 > 0) {
                    mVar.mo691b(c2 + c);
                } else {
                    mVar.mo691b(c);
                }
            }
            mVar.mo686a(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo701e() {
        if (this.f736j.isEmpty()) {
            mo707j();
            mo708k();
            return;
        }
        m828r();
        if (!this.f737k) {
            for (int i = 1; i < this.f736j.size(); i++) {
                final C0216m mVar = this.f736j.get(i);
                this.f736j.get(i - 1).mo678a((C0216m.C0222c) new C0223n() {
                    /* renamed from: a */
                    public void mo609a(C0216m mVar) {
                        mVar.mo701e();
                        mVar.mo692b((C0216m.C0222c) this);
                    }
                });
            }
            C0216m mVar2 = this.f736j.get(0);
            if (mVar2 != null) {
                mVar2.mo701e();
                return;
            }
            return;
        }
        Iterator<C0216m> it = this.f736j.iterator();
        while (it.hasNext()) {
            it.next().mo701e();
        }
    }

    /* renamed from: a */
    public void mo602a(C0232s sVar) {
        if (mo689a(sVar.f746b)) {
            Iterator<C0216m> it = this.f736j.iterator();
            while (it.hasNext()) {
                C0216m next = it.next();
                if (next.mo689a(sVar.f746b)) {
                    next.mo602a(sVar);
                    sVar.f747c.add(next);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo607b(C0232s sVar) {
        if (mo689a(sVar.f746b)) {
            Iterator<C0216m> it = this.f736j.iterator();
            while (it.hasNext()) {
                C0216m next = it.next();
                if (next.mo689a(sVar.f746b)) {
                    next.mo607b(sVar);
                    sVar.f747c.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo697c(C0232s sVar) {
        super.mo697c(sVar);
        int size = this.f736j.size();
        for (int i = 0; i < size; i++) {
            this.f736j.get(i).mo697c(sVar);
        }
    }

    /* renamed from: d */
    public void mo700d(View view) {
        super.mo700d(view);
        int size = this.f736j.size();
        for (int i = 0; i < size; i++) {
            this.f736j.get(i).mo700d(view);
        }
    }

    /* renamed from: e */
    public void mo702e(View view) {
        super.mo702e(view);
        int size = this.f736j.size();
        for (int i = 0; i < size; i++) {
            this.f736j.get(i).mo702e(view);
        }
    }

    /* renamed from: a */
    public void mo684a(C0227p pVar) {
        super.mo684a(pVar);
        this.f738l |= 2;
        int size = this.f736j.size();
        for (int i = 0; i < size; i++) {
            this.f736j.get(i).mo684a(pVar);
        }
    }

    /* renamed from: a */
    public void mo683a(C0216m.C0221b bVar) {
        super.mo683a(bVar);
        this.f738l |= 8;
        int size = this.f736j.size();
        for (int i = 0; i < size; i++) {
            this.f736j.get(i).mo683a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo680a(String str) {
        String a = super.mo680a(str);
        for (int i = 0; i < this.f736j.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n");
            sb.append(this.f736j.get(i).mo680a(str + "  "));
            a = sb.toString();
        }
        return a;
    }

    /* renamed from: o */
    public C0216m clone() {
        C0228q qVar = (C0228q) super.clone();
        qVar.f736j = new ArrayList<>();
        int size = this.f736j.size();
        for (int i = 0; i < size; i++) {
            qVar.mo725a(this.f736j.get(i).clone());
        }
        return qVar;
    }
}
