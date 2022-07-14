package android.support.p026v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* renamed from: android.support.v4.graphics.drawable.IconCompat */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: h */
    static final PorterDuff.Mode f1759h = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f1760a;

    /* renamed from: b */
    Object f1761b;

    /* renamed from: c */
    public byte[] f1762c;

    /* renamed from: d */
    public Parcelable f1763d;

    /* renamed from: e */
    public int f1764e;

    /* renamed from: f */
    public int f1765f;

    /* renamed from: g */
    public ColorStateList f1766g = null;

    /* renamed from: i */
    PorterDuff.Mode f1767i = f1759h;

    /* renamed from: j */
    public String f1768j;

    /* renamed from: a */
    private static String m2368a(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public String mo2124a() {
        if (this.f1760a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2369a((Icon) this.f1761b);
        }
        if (this.f1760a == 2) {
            return ((String) this.f1761b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: b */
    public int mo2126b() {
        if (this.f1760a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2370b((Icon) this.f1761b);
        }
        if (this.f1760a == 2) {
            return this.f1764e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String toString() {
        if (this.f1760a == -1) {
            return String.valueOf(this.f1761b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m2368a(this.f1760a));
        switch (this.f1760a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1761b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1761b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(mo2124a());
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo2126b())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1764e);
                if (this.f1765f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1765f);
                    break;
                }
                break;
            case 4:
                sb.append(" uri=");
                sb.append(this.f1761b);
                break;
        }
        if (this.f1766g != null) {
            sb.append(" tint=");
            sb.append(this.f1766g);
        }
        if (this.f1767i != f1759h) {
            sb.append(" mode=");
            sb.append(this.f1767i);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo2125a(boolean z) {
        this.f1768j = this.f1767i.name();
        int i = this.f1760a;
        if (i != -1) {
            switch (i) {
                case 1:
                case 5:
                    if (z) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        ((Bitmap) this.f1761b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                        this.f1762c = byteArrayOutputStream.toByteArray();
                        return;
                    }
                    this.f1763d = (Parcelable) this.f1761b;
                    return;
                case 2:
                    this.f1762c = ((String) this.f1761b).getBytes(Charset.forName("UTF-16"));
                    return;
                case 3:
                    this.f1762c = (byte[]) this.f1761b;
                    return;
                case 4:
                    this.f1762c = this.f1761b.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                default:
                    return;
            }
        } else if (!z) {
            this.f1763d = (Parcelable) this.f1761b;
        } else {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
    }

    /* renamed from: c */
    public void mo2127c() {
        this.f1767i = PorterDuff.Mode.valueOf(this.f1768j);
        int i = this.f1760a;
        if (i != -1) {
            switch (i) {
                case 1:
                case 5:
                    Parcelable parcelable = this.f1763d;
                    if (parcelable != null) {
                        this.f1761b = parcelable;
                        return;
                    }
                    byte[] bArr = this.f1762c;
                    this.f1761b = bArr;
                    this.f1760a = 3;
                    this.f1764e = 0;
                    this.f1765f = bArr.length;
                    return;
                case 2:
                case 4:
                    this.f1761b = new String(this.f1762c, Charset.forName("UTF-16"));
                    return;
                case 3:
                    this.f1761b = this.f1762c;
                    return;
                default:
                    return;
            }
        } else {
            Parcelable parcelable2 = this.f1763d;
            if (parcelable2 != null) {
                this.f1761b = parcelable2;
                return;
            }
            throw new IllegalArgumentException("Invalid icon");
        }
    }

    /* renamed from: a */
    private static String m2369a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: b */
    private static int m2370b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }
}
