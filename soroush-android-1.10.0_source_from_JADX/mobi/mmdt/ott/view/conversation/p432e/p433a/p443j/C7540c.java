package mobi.mmdt.ott.view.conversation.p432e.p433a.p443j;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7675c;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7540c extends C7354b {
    private TextView f22935d = ((TextView) this.itemView.findViewById(R.id.caption_textView));
    private TextView f22936e = ((TextView) this.itemView.findViewById(R.id.file_name_textView));
    private TextView f22937f = ((TextView) this.itemView.findViewById(R.id.file_size_textView));
    private ImageView f22938g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22939h = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22940i = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22941j;
    private C3283d f22942k;
    private LinearLayout f22943l = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private ImageView f22944m = ((ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile));
    private TextView f22945n = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C39321 implements OnClickListener {
        final /* synthetic */ C7540c f11387a;

        C39321(C7540c c7540c) {
            this.f11387a = c7540c;
        }

        public final void onClick(View view) {
            this.f11387a.f22941j.mo2317b(((C7675c) this.f11387a.f16244a).f21300A);
        }
    }

    class C39332 implements OnClickListener {
        final /* synthetic */ C7540c f11388a;

        C39332(C7540c c7540c) {
            this.f11388a = c7540c;
        }

        public final void onClick(View view) {
            C7675c c7675c = (C7675c) this.f11388a.f16244a;
            switch (c7675c.f23783U) {
                case DELETED:
                case NOT_STARTED:
                    if (c7675c.f23785Y == null || c7675c.f23785Y.isEmpty()) {
                        this.f11388a.f22941j.mo2307a(c7675c.mo3604b(), false);
                        return;
                    } else {
                        this.f11388a.f22941j.mo2307a(c7675c.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11388a.f22941j.mo2305a(c7675c.mo3604b());
                    return;
                case CANCEL:
                    if (c7675c.f23785Y == null || c7675c.f23785Y.isEmpty()) {
                        this.f11388a.f22941j.mo2307a(c7675c.mo3604b(), false);
                        return;
                    } else {
                        this.f11388a.f22941j.mo2307a(c7675c.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7675c.f23785Y == null || c7675c.f23785Y.isEmpty()) {
                        this.f11388a.f22941j.mo2307a(c7675c.mo3604b(), false);
                        return;
                    } else {
                        this.f11388a.f22941j.mo2307a(c7675c.mo3604b(), true);
                        return;
                    }
                case FINISHED:
                    this.f11388a.f22942k.mo2329d(c7675c.f23781S, c7675c.f23779Q);
                    return;
                default:
                    return;
            }
        }
    }

    public C7540c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_file_output_list_item, c3286g, c3284e);
        this.f22941j = c3284e;
        this.f22942k = c3283d;
        this.f22944m.setOnClickListener(new C39321(this));
        this.f22939h.setOnClickListener(new C39332(this));
        C2491i.m6802a(this.f22945n, UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
    }

    private void m20561a(C7675c c7675c, C2971k c2971k) {
        boolean z = ((c7675c.f23785Y == null || c7675c.f23785Y.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22939h, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7675c c7675c = (C7675c) c6829g;
        this.f22936e.setText(c7675c.f23779Q);
        this.f22937f.setText(c7675c.f23780R);
        if (c7675c.f23778P == null || c7675c.f23778P.isEmpty()) {
            this.f22935d.setVisibility(8);
        } else {
            this.f22935d.setText(c7675c.f23778P);
            this.f22935d.setVisibility(0);
            C4520n.m8234a(this.f22935d);
        }
        switch (c7675c.f21337w) {
            case ERROR:
                imageView = this.f22938g;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22938g;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22938g;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22938g;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7675c.f23783U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22940i.setVisibility(8);
                this.f22944m.setVisibility(8);
                this.f22945n.setVisibility(8);
                m20561a(c7675c, c7675c.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22940i.setVisibility(0);
                this.f22939h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22945n.setVisibility(0);
                this.f22945n.setText(c7675c.f23784V);
                if (c7675c.f23782T > 0) {
                    progressWheel = this.f22940i;
                    f = ((float) c7675c.f23782T) * 0.01f;
                } else {
                    progressWheel = this.f22940i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22944m.setVisibility(8);
                break;
            case FINISHED:
                this.f22940i.setVisibility(8);
                this.f22939h.setImageResource(R.drawable.ic_file_attach);
                this.f22944m.setVisibility(0);
                this.f22945n.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7675c, this.f22943l, true);
    }
}
