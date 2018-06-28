package mobi.mmdt.ott.view.components.p400b.p529d;

import android.view.View;
import android.view.ViewGroup;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import mobi.mmdt.ott.view.components.p400b.C3111b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6066d extends C3111b {
    public final void mo2236a(View view) {
        int width = ((ViewGroup) view.getParent()).getWidth() - view.getLeft();
        AnimatorSet animatorSet = this.f9686a;
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ObjectAnimator.ofFloat((Object) view, "alpha", BallPulseIndicator.SCALE, 0.0f);
        animatorArr[1] = ObjectAnimator.ofFloat((Object) view, "translationX", 0.0f, (float) width);
        animatorSet.playTogether(animatorArr);
    }
}
