package mobi.mmdt.ott.view.conversation.p432e.p433a.p441h;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7658l;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7523l extends C7352b {
    private TextView f22725d = ((TextView) this.itemView.findViewById(R.id.content_textView));
    private ImageView f22726e = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private boolean f22727f;
    private LinearLayout f22728g = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C38611 implements OnLongClickListener {
        final /* synthetic */ C7523l f11271a;

        C38611(C7523l c7523l) {
            this.f11271a = c7523l;
        }

        public final boolean onLongClick(View view) {
            this.f11271a.f22727f = true;
            return false;
        }
    }

    class C38622 implements OnTouchListener {
        final /* synthetic */ C7523l f11272a;

        C38622(C7523l c7523l) {
            this.f11272a = c7523l;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && this.f11272a.f22727f) {
                this.f11272a.f22727f = false;
                return true;
            }
            if (motionEvent.getAction() == 0) {
                this.f11272a.f22727f = false;
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    static /* synthetic */ class C38633 {
        static final /* synthetic */ int[] f11273a = new int[C2971k.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.provider.p384f.C2971k.values();
            r0 = r0.length;
            r0 = new int[r0];
            f11273a = r0;
            r0 = f11273a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.ERROR;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f11273a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.SENDING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f11273a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.PENDING;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f11273a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.PENDING_RETRANSMIT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f11273a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.NOT_SEEN;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = f11273a;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.DELIVERED;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = f11273a;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.SEEN;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r0 = f11273a;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.NOT_READ;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r2 = 8;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            r0 = f11273a;	 Catch:{ NoSuchFieldError -> 0x006e }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.READ;	 Catch:{ NoSuchFieldError -> 0x006e }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
            r2 = 9;	 Catch:{ NoSuchFieldError -> 0x006e }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            r0 = f11273a;	 Catch:{ NoSuchFieldError -> 0x007a }
            r1 = mobi.mmdt.ott.provider.p384f.C2971k.DRAFT;	 Catch:{ NoSuchFieldError -> 0x007a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r2 = 10;	 Catch:{ NoSuchFieldError -> 0x007a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.e.a.h.l.3.<clinit>():void");
        }
    }

    public C7523l(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_text_output_list_item, c3286g, c3284e);
        this.f22725d.setOnLongClickListener(new C38611(this));
        this.f22725d.setOnTouchListener(new C38622(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        super.mo3180a(c6829g);
        C7658l c7658l = (C7658l) c6829g;
        this.f22725d.setTextSize((float) c7658l.f23664Q);
        this.f22725d.setText(c7658l.f23663P);
        C4520n.m8234a(this.f22725d);
        int i = C38633.f11273a[c7658l.f21337w.ordinal()];
        int i2 = R.drawable.ic_message_tick_white;
        switch (i) {
            case 1:
                imageView = this.f22726e;
                i2 = R.drawable.ic_message_error;
                break;
            case 2:
                imageView = this.f22726e;
                i2 = R.drawable.ic_message_schedule_white;
                break;
            case 7:
                imageView = this.f22726e;
                i2 = R.drawable.ic_message_tick_double_seen;
                break;
            case 8:
            case 9:
            case 10:
                m19051a((C7358a) c7658l, this.f22728g, true);
            default:
                imageView = this.f22726e;
                break;
        }
        imageView.setImageResource(i2);
        m19051a((C7358a) c7658l, this.f22728g, true);
    }
}
