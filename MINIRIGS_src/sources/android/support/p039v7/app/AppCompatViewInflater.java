package android.support.p039v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p026v4.p035g.C0511a;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.C0729d;
import android.support.p039v7.widget.AppCompatTextView;
import android.support.p039v7.widget.C0965bk;
import android.support.p039v7.widget.C1003f;
import android.support.p039v7.widget.C1005h;
import android.support.p039v7.widget.C1006i;
import android.support.p039v7.widget.C1007j;
import android.support.p039v7.widget.C1015m;
import android.support.p039v7.widget.C1017o;
import android.support.p039v7.widget.C1019q;
import android.support.p039v7.widget.C1020r;
import android.support.p039v7.widget.C1023u;
import android.support.p039v7.widget.C1024v;
import android.support.p039v7.widget.C1025w;
import android.support.p039v7.widget.C1027y;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: android.support.v7.app.AppCompatViewInflater */
public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new C0511a();
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private final Object[] mConstructorArgs = new Object[2];

    /* access modifiers changed from: protected */
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0965bk.m5088a(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = createTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 1:
                view2 = createImageView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 2:
                view2 = createButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 3:
                view2 = createEditText(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 4:
                view2 = createSpinner(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 5:
                view2 = createImageButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 6:
                view2 = createCheckBox(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 7:
                view2 = createRadioButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 8:
                view2 = createCheckedTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 9:
                view2 = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 10:
                view2 = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 11:
                view2 = createRatingBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 12:
                view2 = createSeekBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            default:
                view2 = createView(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = createViewFromTag(context2, str, attributeSet);
        }
        if (view2 != null) {
            checkOnClickListener(view2, attributeSet);
        }
        return view2;
    }

    /* access modifiers changed from: protected */
    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1019q createImageView(Context context, AttributeSet attributeSet) {
        return new C1019q(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1005h createButton(Context context, AttributeSet attributeSet) {
        return new C1005h(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1015m createEditText(Context context, AttributeSet attributeSet) {
        return new C1015m(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1027y createSpinner(Context context, AttributeSet attributeSet) {
        return new C1027y(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1017o createImageButton(Context context, AttributeSet attributeSet) {
        return new C1017o(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1006i createCheckBox(Context context, AttributeSet attributeSet) {
        return new C1006i(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1023u createRadioButton(Context context, AttributeSet attributeSet) {
        return new C1023u(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1007j createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C1007j(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1003f createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C1003f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1020r createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C1020r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1024v createRatingBar(Context context, AttributeSet attributeSet) {
        return new C1024v(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C1025w createSeekBar(Context context, AttributeSet attributeSet) {
        return new C1025w(context, attributeSet);
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String createViewByPrefix : sClassPrefixList) {
                    View createViewByPrefix2 = createViewByPrefix(context, str, createViewByPrefix);
                    if (createViewByPrefix2 != null) {
                        return createViewByPrefix2;
                    }
                }
                Object[] objArr = this.mConstructorArgs;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View createViewByPrefix3 = createViewByPrefix(context, str, (String) null);
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
            return createViewByPrefix3;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.mConstructorArgs;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C0594r.m2571A(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0663a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        Constructor<? extends U> constructor = sConstructorMap.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(sConstructorSignature);
                sConstructorMap.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639a.C0649j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0639a.C0649j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0639a.C0649j.View_theme, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof C0729d) || ((C0729d) context).mo2846a() != resourceId) ? new C0729d(context, resourceId) : context;
        }
        return context;
    }

    /* renamed from: android.support.v7.app.AppCompatViewInflater$a */
    private static class C0663a implements View.OnClickListener {

        /* renamed from: a */
        private final View f2095a;

        /* renamed from: b */
        private final String f2096b;

        /* renamed from: c */
        private Method f2097c;

        /* renamed from: d */
        private Context f2098d;

        public C0663a(View view, String str) {
            this.f2095a = view;
            this.f2096b = str;
        }

        public void onClick(View view) {
            if (this.f2097c == null) {
                m2897a(this.f2095a.getContext(), this.f2096b);
            }
            try {
                this.f2097c.invoke(this.f2098d, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        /* renamed from: a */
        private void m2897a(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f2096b, new Class[]{View.class})) != null) {
                        this.f2097c = method;
                        this.f2098d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f2095a.getId();
            if (id == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f2095a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f2096b + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.f2095a.getClass() + str2);
        }
    }
}
