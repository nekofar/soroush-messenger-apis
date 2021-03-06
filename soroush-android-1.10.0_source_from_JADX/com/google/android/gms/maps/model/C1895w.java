package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1895w implements Creator<Tile> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 3:
                    i2 = dk.m4703e(parcel, readInt);
                    break;
                case 4:
                    bArr = dk.m4713o(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new Tile(i, i2, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Tile[i];
    }
}
