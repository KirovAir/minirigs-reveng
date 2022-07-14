package android.support.p039v7.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: android.support.v7.widget.ba */
class C0949ba extends Resources {

    /* renamed from: a */
    private final Resources f3456a;

    public C0949ba(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f3456a = resources;
    }

    public CharSequence getText(int i) {
        return this.f3456a.getText(i);
    }

    public CharSequence getQuantityText(int i, int i2) {
        return this.f3456a.getQuantityText(i, i2);
    }

    public String getString(int i) {
        return this.f3456a.getString(i);
    }

    public String getString(int i, Object... objArr) {
        return this.f3456a.getString(i, objArr);
    }

    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.f3456a.getQuantityString(i, i2, objArr);
    }

    public String getQuantityString(int i, int i2) {
        return this.f3456a.getQuantityString(i, i2);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f3456a.getText(i, charSequence);
    }

    public CharSequence[] getTextArray(int i) {
        return this.f3456a.getTextArray(i);
    }

    public String[] getStringArray(int i) {
        return this.f3456a.getStringArray(i);
    }

    public int[] getIntArray(int i) {
        return this.f3456a.getIntArray(i);
    }

    public TypedArray obtainTypedArray(int i) {
        return this.f3456a.obtainTypedArray(i);
    }

    public float getDimension(int i) {
        return this.f3456a.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) {
        return this.f3456a.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) {
        return this.f3456a.getDimensionPixelSize(i);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.f3456a.getFraction(i, i2, i3);
    }

    public Drawable getDrawable(int i) {
        return this.f3456a.getDrawable(i);
    }

    public Drawable getDrawable(int i, Resources.Theme theme) {
        return this.f3456a.getDrawable(i, theme);
    }

    public Drawable getDrawableForDensity(int i, int i2) {
        return this.f3456a.getDrawableForDensity(i, i2);
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.f3456a.getDrawableForDensity(i, i2, theme);
    }

    public Movie getMovie(int i) {
        return this.f3456a.getMovie(i);
    }

    public int getColor(int i) {
        return this.f3456a.getColor(i);
    }

    public ColorStateList getColorStateList(int i) {
        return this.f3456a.getColorStateList(i);
    }

    public boolean getBoolean(int i) {
        return this.f3456a.getBoolean(i);
    }

    public int getInteger(int i) {
        return this.f3456a.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) {
        return this.f3456a.getLayout(i);
    }

    public XmlResourceParser getAnimation(int i) {
        return this.f3456a.getAnimation(i);
    }

    public XmlResourceParser getXml(int i) {
        return this.f3456a.getXml(i);
    }

    public InputStream openRawResource(int i) {
        return this.f3456a.openRawResource(i);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.f3456a.openRawResource(i, typedValue);
    }

    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.f3456a.openRawResourceFd(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.f3456a.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.f3456a.getValueForDensity(i, i2, typedValue, z);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.f3456a.getValue(str, typedValue, z);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f3456a.obtainAttributes(attributeSet, iArr);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f3456a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f3456a.getDisplayMetrics();
    }

    public Configuration getConfiguration() {
        return this.f3456a.getConfiguration();
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f3456a.getIdentifier(str, str2, str3);
    }

    public String getResourceName(int i) {
        return this.f3456a.getResourceName(i);
    }

    public String getResourcePackageName(int i) {
        return this.f3456a.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) {
        return this.f3456a.getResourceTypeName(i);
    }

    public String getResourceEntryName(int i) {
        return this.f3456a.getResourceEntryName(i);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f3456a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f3456a.parseBundleExtra(str, attributeSet, bundle);
    }
}
