package mobi.mmdt.ott.view.vas.payservices.charge.p486b;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.vas.payservices.charge.p593c.C7398a;

public final class C6993a extends C6073e {
    private FrameLayout f19983b = ((FrameLayout) this.itemView.findViewById(R.id.root_frameLayout));
    private String f19984c = C2535a.m6888a().m6919b();
    private Activity f19985d;
    private RoundAvatarImageView f19986e = ((RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1));
    private TextView f19987f = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19988g = ((TextView) this.itemView.findViewById(R.id.textView2));
    private View f19989h = this.itemView.findViewById(R.id.divider_line);

    class C45651 implements OnTouchListener {
        final /* synthetic */ C6993a f12579a;

        C45651(C6993a c6993a) {
            this.f12579a = c6993a;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    public C6993a(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.list_item_contacts_charge, c3126i);
        this.f19985d = activity;
        this.f19983b.setOnTouchListener(new C45651(this));
        C2491i.m6796a(this.f19989h, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19987f, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19988g, UIThemeManager.getmInstance().getText_secondary_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        TextView textView;
        CharSequence b;
        C7398a c7398a = (C7398a) c6829g;
        C1274i a;
        View view;
        int i;
        if (this.f19984c.equals("fa")) {
            this.f19987f.setText(C2491i.m6814b(c7398a.f21513a));
            textView = this.f19988g;
            if (c7398a.f21515c == null || c7398a.f21515c.isEmpty()) {
                b = C2491i.m6814b(C4522p.m8236a(R.string.im_using_soroush));
                textView.setText(b);
                this.f19986e.setImageBitmap(null);
                if (c7398a.f21516d == null && !c7398a.f21516d.isEmpty()) {
                    a = C1212c.m2872a(this.f19985d).m10950a(C4515k.m8231a(C2556b.m6998a(c7398a.f21516d))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a));
                } else if (c7398a.f21517e != null) {
                    a = C1212c.m2872a(this.f19985d).m10950a(c7398a.f21517e).m3034a(C1248f.m2945b()).m3033a();
                } else {
                    C1212c.m2872a(this.f19985d).m10953a(this.f19986e);
                    this.f19986e.setName(c7398a.f21513a);
                    this.f19986e.setBackgroundColor(c7398a.f21518f);
                    if (c7398a.f19504k != 0) {
                        view = this.f19989h;
                        i = 4;
                    } else {
                        view = this.f19989h;
                        i = 0;
                    }
                    view.setVisibility(i);
                }
                a.m3031a(this.f19986e);
                this.f19986e.setName(c7398a.f21513a);
                this.f19986e.setBackgroundColor(c7398a.f21518f);
                if (c7398a.f19504k != 0) {
                    view = this.f19989h;
                    i = 0;
                } else {
                    view = this.f19989h;
                    i = 4;
                }
                view.setVisibility(i);
            }
        }
        this.f19987f.setText(c7398a.f21513a);
        textView = this.f19988g;
        if (c7398a.f21515c == null || c7398a.f21515c.isEmpty()) {
            b = C4522p.m8236a(R.string.im_using_soroush);
            textView.setText(b);
            this.f19986e.setImageBitmap(null);
            if (c7398a.f21516d == null) {
            }
            if (c7398a.f21517e != null) {
                C1212c.m2872a(this.f19985d).m10953a(this.f19986e);
                this.f19986e.setName(c7398a.f21513a);
                this.f19986e.setBackgroundColor(c7398a.f21518f);
                if (c7398a.f19504k != 0) {
                    view = this.f19989h;
                    i = 4;
                } else {
                    view = this.f19989h;
                    i = 0;
                }
                view.setVisibility(i);
            }
            a = C1212c.m2872a(this.f19985d).m10950a(c7398a.f21517e).m3034a(C1248f.m2945b()).m3033a();
            a.m3031a(this.f19986e);
            this.f19986e.setName(c7398a.f21513a);
            this.f19986e.setBackgroundColor(c7398a.f21518f);
            if (c7398a.f19504k != 0) {
                view = this.f19989h;
                i = 0;
            } else {
                view = this.f19989h;
                i = 4;
            }
            view.setVisibility(i);
        }
        b = c7398a.f21515c;
        textView.setText(b);
        this.f19986e.setImageBitmap(null);
        if (c7398a.f21516d == null) {
        }
        if (c7398a.f21517e != null) {
            a = C1212c.m2872a(this.f19985d).m10950a(c7398a.f21517e).m3034a(C1248f.m2945b()).m3033a();
            a.m3031a(this.f19986e);
            this.f19986e.setName(c7398a.f21513a);
            this.f19986e.setBackgroundColor(c7398a.f21518f);
            if (c7398a.f19504k != 0) {
                view = this.f19989h;
                i = 4;
            } else {
                view = this.f19989h;
                i = 0;
            }
            view.setVisibility(i);
        }
        C1212c.m2872a(this.f19985d).m10953a(this.f19986e);
        this.f19986e.setName(c7398a.f21513a);
        this.f19986e.setBackgroundColor(c7398a.f21518f);
        if (c7398a.f19504k != 0) {
            view = this.f19989h;
            i = 0;
        } else {
            view = this.f19989h;
            i = 4;
        }
        view.setVisibility(i);
    }
}
