package ir.pec.mpl.pecpayment.p209a;

import com.p067a.p070b.C0994p.C0992a;
import com.p067a.p070b.C0997u;
import com.p067a.p070b.C5060i;
import com.p067a.p070b.C5064s;
import com.p067a.p070b.C5065t;
import com.p067a.p070b.C6440k;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

class C5739t implements C0992a {
    final /* synthetic */ C2355o f15710a;

    C5739t(C2355o c2355o) {
        this.f15710a = c2355o;
    }

    public void onErrorResponse(C0997u c0997u) {
        int i = c0997u instanceof C5065t ? 2 : c0997u instanceof C6440k ? IjkMediaCodecInfo.RANK_MAX : c0997u instanceof C5064s ? 1001 : c0997u instanceof C5060i ? 1002 : 0;
        this.f15710a.m6421a(null, null, -1, true, i, this.f15710a.f7731c);
    }
}
