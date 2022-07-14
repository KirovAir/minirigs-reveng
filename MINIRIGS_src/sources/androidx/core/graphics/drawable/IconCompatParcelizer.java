package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.support.p026v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C1037a;

public class IconCompatParcelizer {
    public static IconCompat read(C1037a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1760a = aVar.mo5078b(iconCompat.f1760a, 1);
        iconCompat.f1762c = aVar.mo5083b(iconCompat.f1762c, 2);
        iconCompat.f1763d = aVar.mo5079b(iconCompat.f1763d, 3);
        iconCompat.f1764e = aVar.mo5078b(iconCompat.f1764e, 4);
        iconCompat.f1765f = aVar.mo5078b(iconCompat.f1765f, 5);
        iconCompat.f1766g = (ColorStateList) aVar.mo5079b(iconCompat.f1766g, 6);
        iconCompat.f1768j = aVar.mo5080b(iconCompat.f1768j, 7);
        iconCompat.mo2127c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C1037a aVar) {
        aVar.mo5074a(true, true);
        iconCompat.mo2125a(aVar.mo5077a());
        aVar.mo5068a(iconCompat.f1760a, 1);
        aVar.mo5076a(iconCompat.f1762c, 2);
        aVar.mo5070a(iconCompat.f1763d, 3);
        aVar.mo5068a(iconCompat.f1764e, 4);
        aVar.mo5068a(iconCompat.f1765f, 5);
        aVar.mo5070a((Parcelable) iconCompat.f1766g, 6);
        aVar.mo5073a(iconCompat.f1768j, 7);
    }
}
