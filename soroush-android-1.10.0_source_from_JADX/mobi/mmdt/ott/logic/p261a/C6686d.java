package mobi.mmdt.ott.logic.p261a;

import android.content.Intent;
import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.core.StartUpService;
import mobi.mmdt.ott.logic.notifications.C2873a;
import mobi.mmdt.ott.logic.notifications.notifsData.UpdateNotificationService;
import mobi.mmdt.ott.logic.p368p.C6004c;
import mobi.mmdt.ott.logic.sync.C2905d;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C6686d extends C5891a {
    public C6686d() {
        super(C2683h.f8620b);
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C6004c.m13279a().m13284c();
        C2535a.m6888a().m6923b(true);
        StartUpService.m7130e();
        C2873a.m7225a();
        MyApplication.m12952b().stopService(new Intent(MyApplication.m12952b(), UpdateNotificationService.class));
        C6004c.m13279a().m13284c();
        C2905d.m7283b();
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
