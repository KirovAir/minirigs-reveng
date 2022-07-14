package android.databinding;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends C0104c {

    /* renamed from: a */
    private Set<Class<? extends C0104c>> f206a = new HashSet();

    /* renamed from: b */
    private List<C0104c> f207b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private List<String> f208c = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo222a(C0104c cVar) {
        if (this.f206a.add(cVar.getClass())) {
            this.f207b.add(cVar);
            for (C0104c a : cVar.mo235a()) {
                mo222a(a);
            }
        }
    }
}
