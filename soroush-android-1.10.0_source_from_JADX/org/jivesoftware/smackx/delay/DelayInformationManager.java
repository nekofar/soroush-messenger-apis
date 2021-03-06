package org.jivesoftware.smackx.delay;

import java.util.Date;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.delay.packet.DelayInformation;

public class DelayInformationManager {
    public static final String LEGACY_DELAYED_DELIVERY_ELEMENT = "x";
    public static final String LEGACY_DELAYED_DELIVERY_NAMESPACE = "jabber:x:delay";

    public static DelayInformation getDelayInformation(Stanza stanza) {
        DelayInformation xep203DelayInformation = getXep203DelayInformation(stanza);
        return xep203DelayInformation != null ? xep203DelayInformation : getLegacyDelayInformation(stanza);
    }

    public static Date getDelayTimestamp(Stanza stanza) {
        DelayInformation delayInformation = getDelayInformation(stanza);
        return delayInformation == null ? null : delayInformation.getStamp();
    }

    public static DelayInformation getLegacyDelayInformation(Stanza stanza) {
        return (DelayInformation) stanza.getExtension("x", LEGACY_DELAYED_DELIVERY_NAMESPACE);
    }

    public static DelayInformation getXep203DelayInformation(Stanza stanza) {
        return DelayInformation.from(stanza);
    }

    public static boolean isDelayedStanza(Stanza stanza) {
        return getDelayInformation(stanza) != null;
    }
}
