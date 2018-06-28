package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;
import com.google.android.gms.p158a.C1644a;
import com.google.android.gms.p158a.C1644a.C5425a;

public final class C5486n extends mn implements C1807m {
    C5486n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final C1644a mo1583a(C1644a c1644a, String str, int i, C1644a c1644a2) {
        Parcel f_ = f_();
        mp.m5005a(f_, (IInterface) c1644a);
        f_.writeString(str);
        f_.writeInt(i);
        mp.m5005a(f_, (IInterface) c1644a2);
        Parcel a = m5000a(2, f_);
        C1644a a2 = C5425a.m11702a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
