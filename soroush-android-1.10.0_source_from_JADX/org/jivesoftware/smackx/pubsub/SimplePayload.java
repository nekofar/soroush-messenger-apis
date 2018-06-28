package org.jivesoftware.smackx.pubsub;

import org.jivesoftware.smack.packet.ExtensionElement;

public class SimplePayload implements ExtensionElement {
    private final String elemName;
    private final String ns;
    private final CharSequence payload;

    public SimplePayload(String str, String str2, CharSequence charSequence) {
        this.elemName = str;
        this.payload = charSequence;
        this.ns = str2;
    }

    public String getElementName() {
        return this.elemName;
    }

    public String getNamespace() {
        return this.ns;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append("payload [");
        stringBuilder.append(toXML());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public CharSequence toXML() {
        return this.payload;
    }
}
