package android.support.p015d;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: android.support.d.s */
public class C0232s {

    /* renamed from: a */
    public final Map<String, Object> f745a = new HashMap();

    /* renamed from: b */
    public View f746b;

    /* renamed from: c */
    final ArrayList<C0216m> f747c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof C0232s)) {
            return false;
        }
        C0232s sVar = (C0232s) obj;
        return this.f746b == sVar.f746b && this.f745a.equals(sVar.f745a);
    }

    public int hashCode() {
        return (this.f746b.hashCode() * 31) + this.f745a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f746b + "\n") + "    values:";
        for (String next : this.f745a.keySet()) {
            str = str + "    " + next + ": " + this.f745a.get(next) + "\n";
        }
        return str;
    }
}
