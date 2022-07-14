package android.support.p026v4.p035g;

import android.util.Log;
import java.io.Writer;

/* renamed from: android.support.v4.g.e */
public class C0517e extends Writer {

    /* renamed from: a */
    private final String f1707a;

    /* renamed from: b */
    private StringBuilder f1708b = new StringBuilder(128);

    public C0517e(String str) {
        this.f1707a = str;
    }

    public void close() {
        m2264a();
    }

    public void flush() {
        m2264a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m2264a();
            } else {
                this.f1708b.append(c);
            }
        }
    }

    /* renamed from: a */
    private void m2264a() {
        if (this.f1708b.length() > 0) {
            Log.d(this.f1707a, this.f1708b.toString());
            StringBuilder sb = this.f1708b;
            sb.delete(0, sb.length());
        }
    }
}
