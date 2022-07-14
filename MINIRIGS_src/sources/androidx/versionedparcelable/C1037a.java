package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.versionedparcelable.a */
public abstract class C1037a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5067a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5069a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5072a(String str);

    /* renamed from: a */
    public void mo5074a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5075a(byte[] bArr);

    /* renamed from: a */
    public boolean mo5077a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo5081b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo5082b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C1037a mo5084c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo5085c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo5086d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo5087e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract byte[] mo5088f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract <T extends Parcelable> T mo5089g();

    /* renamed from: a */
    public void mo5076a(byte[] bArr, int i) {
        mo5085c(i);
        mo5075a(bArr);
    }

    /* renamed from: a */
    public void mo5068a(int i, int i2) {
        mo5085c(i2);
        mo5067a(i);
    }

    /* renamed from: a */
    public void mo5073a(String str, int i) {
        mo5085c(i);
        mo5072a(str);
    }

    /* renamed from: a */
    public void mo5070a(Parcelable parcelable, int i) {
        mo5085c(i);
        mo5069a(parcelable);
    }

    /* renamed from: b */
    public int mo5078b(int i, int i2) {
        if (!mo5082b(i2)) {
            return i;
        }
        return mo5086d();
    }

    /* renamed from: b */
    public String mo5080b(String str, int i) {
        if (!mo5082b(i)) {
            return str;
        }
        return mo5087e();
    }

    /* renamed from: b */
    public byte[] mo5083b(byte[] bArr, int i) {
        if (!mo5082b(i)) {
            return bArr;
        }
        return mo5088f();
    }

    /* renamed from: b */
    public <T extends Parcelable> T mo5079b(T t, int i) {
        if (!mo5082b(i)) {
            return t;
        }
        return mo5089g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5071a(C1039c cVar) {
        if (cVar == null) {
            mo5072a((String) null);
            return;
        }
        m5424b(cVar);
        C1037a c = mo5084c();
        m5423a(cVar, c);
        c.mo5081b();
    }

    /* renamed from: b */
    private void m5424b(C1039c cVar) {
        try {
            mo5072a(m5422a((Class<? extends C1039c>) cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public <T extends C1039c> T mo5090h() {
        String e = mo5087e();
        if (e == null) {
            return null;
        }
        return m5421a(e, mo5084c());
    }

    /* renamed from: a */
    protected static <T extends C1039c> T m5421a(String str, C1037a aVar) {
        try {
            return (C1039c) Class.forName(str, true, C1037a.class.getClassLoader()).getDeclaredMethod("read", new Class[]{C1037a.class}).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    protected static <T extends C1039c> void m5423a(T t, C1037a aVar) {
        try {
            m5425c(t).getDeclaredMethod("write", new Class[]{t.getClass(), C1037a.class}).invoke((Object) null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: c */
    private static <T extends C1039c> Class m5425c(T t) {
        return m5422a((Class<? extends C1039c>) t.getClass());
    }

    /* renamed from: a */
    private static Class m5422a(Class<? extends C1039c> cls) {
        return Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
    }
}
