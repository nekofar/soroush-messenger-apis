package org.jivesoftware.smackx.pubsub;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smackx.pubsub.packet.PubSubNamespace;

public class RetractItem implements ExtensionElement {
    private String id;

    public RetractItem(String str) {
        if (str == null) {
            throw new IllegalArgumentException("itemId must not be 'null'");
        }
        this.id = str;
    }

    public String getElementName() {
        return "retract";
    }

    public String getId() {
        return this.id;
    }

    public String getNamespace() {
        return PubSubNamespace.EVENT.getXmlns();
    }

    public String toXML() {
        StringBuilder stringBuilder = new StringBuilder("<retract id='");
        stringBuilder.append(this.id);
        stringBuilder.append("'/>");
        return stringBuilder.toString();
    }
}
