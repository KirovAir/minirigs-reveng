package android.support.p039v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p026v4.p027a.C0391a;
import android.support.p026v4.widget.C0629l;
import android.support.p039v7.p040a.C0639a;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.bh */
class C0961bh extends C0629l implements View.OnClickListener {

    /* renamed from: j */
    private final SearchManager f3515j = ((SearchManager) this.f1926d.getSystemService("search"));

    /* renamed from: k */
    private final SearchView f3516k;

    /* renamed from: l */
    private final SearchableInfo f3517l;

    /* renamed from: m */
    private final Context f3518m;

    /* renamed from: n */
    private final WeakHashMap<String, Drawable.ConstantState> f3519n;

    /* renamed from: o */
    private final int f3520o;

    /* renamed from: p */
    private boolean f3521p = false;

    /* renamed from: q */
    private int f3522q = 1;

    /* renamed from: r */
    private ColorStateList f3523r;

    /* renamed from: s */
    private int f3524s = -1;

    /* renamed from: t */
    private int f3525t = -1;

    /* renamed from: u */
    private int f3526u = -1;

    /* renamed from: v */
    private int f3527v = -1;

    /* renamed from: w */
    private int f3528w = -1;

    /* renamed from: x */
    private int f3529x = -1;

    public boolean hasStableIds() {
        return false;
    }

    public C0961bh(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f3516k = searchView;
        this.f3517l = searchableInfo;
        this.f3520o = searchView.getSuggestionCommitIconResId();
        this.f3518m = context;
        this.f3519n = weakHashMap;
    }

    /* renamed from: a */
    public void mo4766a(int i) {
        this.f3522q = i;
    }

    /* renamed from: a */
    public Cursor mo2418a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f3516k.getVisibility() != 0 || this.f3516k.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor a = mo4764a(this.f3517l, charSequence2, 50);
            if (a != null) {
                a.getCount();
                return a;
            }
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m5069d(mo2417a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m5069d(mo2417a());
    }

    /* renamed from: d */
    private void m5069d(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null && !extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: a */
    public void mo2421a(Cursor cursor) {
        if (this.f3521p) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo2421a(cursor);
            if (cursor != null) {
                this.f3524s = cursor.getColumnIndex("suggest_text_1");
                this.f3525t = cursor.getColumnIndex("suggest_text_2");
                this.f3526u = cursor.getColumnIndex("suggest_text_2_url");
                this.f3527v = cursor.getColumnIndex("suggest_icon_1");
                this.f3528w = cursor.getColumnIndex("suggest_icon_2");
                this.f3529x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: a */
    public View mo2419a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo2419a(context, cursor, viewGroup);
        a.setTag(new C0962a(a));
        ((ImageView) a.findViewById(C0639a.C0645f.edit_query)).setImageResource(this.f3520o);
        return a;
    }

    /* renamed from: android.support.v7.widget.bh$a */
    private static final class C0962a {

        /* renamed from: a */
        public final TextView f3530a;

        /* renamed from: b */
        public final TextView f3531b;

        /* renamed from: c */
        public final ImageView f3532c;

        /* renamed from: d */
        public final ImageView f3533d;

        /* renamed from: e */
        public final ImageView f3534e;

        public C0962a(View view) {
            this.f3530a = (TextView) view.findViewById(16908308);
            this.f3531b = (TextView) view.findViewById(16908309);
            this.f3532c = (ImageView) view.findViewById(16908295);
            this.f3533d = (ImageView) view.findViewById(16908296);
            this.f3534e = (ImageView) view.findViewById(C0639a.C0645f.edit_query);
        }
    }

    /* renamed from: a */
    public void mo2422a(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        C0962a aVar = (C0962a) view.getTag();
        int i = this.f3529x;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f3530a != null) {
            m5063a(aVar.f3530a, (CharSequence) m5060a(cursor, this.f3524s));
        }
        if (aVar.f3531b != null) {
            String a = m5060a(cursor, this.f3526u);
            if (a != null) {
                charSequence = m5068b((CharSequence) a);
            } else {
                charSequence = m5060a(cursor, this.f3525t);
            }
            if (TextUtils.isEmpty(charSequence)) {
                if (aVar.f3530a != null) {
                    aVar.f3530a.setSingleLine(false);
                    aVar.f3530a.setMaxLines(2);
                }
            } else if (aVar.f3530a != null) {
                aVar.f3530a.setSingleLine(true);
                aVar.f3530a.setMaxLines(1);
            }
            m5063a(aVar.f3531b, charSequence);
        }
        if (aVar.f3532c != null) {
            m5062a(aVar.f3532c, m5070e(cursor), 4);
        }
        if (aVar.f3533d != null) {
            m5062a(aVar.f3533d, m5071f(cursor), 8);
        }
        int i3 = this.f3522q;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f3534e.setVisibility(0);
            aVar.f3534e.setTag(aVar.f3530a.getText());
            aVar.f3534e.setOnClickListener(this);
            return;
        }
        aVar.f3534e.setVisibility(8);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3516k.mo3601a((CharSequence) tag);
        }
    }

    /* renamed from: b */
    private CharSequence m5068b(CharSequence charSequence) {
        if (this.f3523r == null) {
            TypedValue typedValue = new TypedValue();
            this.f1926d.getTheme().resolveAttribute(C0639a.C0640a.textColorSearchUrl, typedValue, true);
            this.f3523r = this.f1926d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f3523r, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: a */
    private void m5063a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: e */
    private Drawable m5070e(Cursor cursor) {
        int i = this.f3527v;
        if (i == -1) {
            return null;
        }
        Drawable a = m5059a(cursor.getString(i));
        if (a != null) {
            return a;
        }
        return m5072g(cursor);
    }

    /* renamed from: f */
    private Drawable m5071f(Cursor cursor) {
        int i = this.f3528w;
        if (i == -1) {
            return null;
        }
        return m5059a(cursor.getString(i));
    }

    /* renamed from: a */
    private void m5062a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: c */
    public CharSequence mo2426c(Cursor cursor) {
        String a;
        String a2;
        if (cursor == null) {
            return null;
        }
        String a3 = m5061a(cursor, "suggest_intent_query");
        if (a3 != null) {
            return a3;
        }
        if (this.f3517l.shouldRewriteQueryFromData() && (a2 = m5061a(cursor, "suggest_intent_data")) != null) {
            return a2;
        }
        if (!this.f3517l.shouldRewriteQueryFromText() || (a = m5061a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo2419a(this.f1926d, this.f1925c, viewGroup);
            if (a != null) {
                ((C0962a) a.getTag()).f3530a.setText(e.toString());
            }
            return a;
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo2424b(this.f1926d, this.f1925c, viewGroup);
            if (b != null) {
                ((C0962a) b.getTag()).f3530a.setText(e.toString());
            }
            return b;
        }
    }

    /* renamed from: a */
    private Drawable m5059a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f3518m.getPackageName() + "/" + parseInt;
            Drawable b = m5067b(str2);
            if (b != null) {
                return b;
            }
            Drawable a = C0391a.m1620a(this.f3518m, parseInt);
            m5064a(str2, a);
            return a;
        } catch (NumberFormatException unused) {
            Drawable b2 = m5067b(str);
            if (b2 != null) {
                return b2;
            }
            Drawable b3 = m5066b(Uri.parse(str));
            m5064a(str, b3);
            return b3;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m5066b(android.net.Uri r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r2 = "android.resource"
            boolean r1 = r2.equals(r1)     // Catch:{ FileNotFoundException -> 0x0089 }
            if (r1 == 0) goto L_0x0029
            android.graphics.drawable.Drawable r7 = r6.mo4765a((android.net.Uri) r7)     // Catch:{ NotFoundException -> 0x0012 }
            return r7
        L_0x0012:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r3 = "Resource does not exist: "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0089 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0029:
            android.content.Context r1 = r6.f3518m     // Catch:{ FileNotFoundException -> 0x0089 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.io.InputStream r1 = r1.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            if (r1 == 0) goto L_0x0072
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r1, r0)     // Catch:{ all -> 0x0055 }
            r1.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x0054
        L_0x003d:
            r1 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r5 = "Error closing icon stream for "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            android.util.Log.e(r3, r4, r1)     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0054:
            return r2
        L_0x0055:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x0071
        L_0x005a:
            r1 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r5 = "Error closing icon stream for "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            android.util.Log.e(r3, r4, r1)     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0071:
            throw r2     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0072:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r3 = "Failed to open "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0089 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            java.lang.String r2 = "SuggestionsAdapter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r1.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r2, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C0961bh.m5066b(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    private Drawable m5067b(String str) {
        Drawable.ConstantState constantState = this.f3519n.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    private void m5064a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f3519n.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: g */
    private Drawable m5072g(Cursor cursor) {
        Drawable a = m5058a(this.f3517l.getSearchActivity());
        if (a != null) {
            return a;
        }
        return this.f1926d.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: a */
    private Drawable m5058a(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f3519n.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f3519n.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f3518m.getResources());
        }
        Drawable b = m5065b(componentName);
        if (b != null) {
            constantState = b.getConstantState();
        }
        this.f3519n.put(flattenToShortString, constantState);
        return b;
    }

    /* renamed from: b */
    private Drawable m5065b(ComponentName componentName) {
        PackageManager packageManager = this.f1926d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static String m5061a(Cursor cursor, String str) {
        return m5060a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static String m5060a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo4765a(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1926d.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Cursor mo4764a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
            strArr = null;
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1926d.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr, (String) null);
    }
}
