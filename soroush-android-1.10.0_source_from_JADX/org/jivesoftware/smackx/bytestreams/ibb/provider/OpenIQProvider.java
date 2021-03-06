package org.jivesoftware.smackx.bytestreams.ibb.provider;

import java.util.Locale;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager.StanzaType;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Open;
import org.xmlpull.v1.XmlPullParser;

public class OpenIQProvider extends IQProvider<Open> {
    public Open parse(XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue("", "sid");
        int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue("", "block-size"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "stanza");
        StanzaType valueOf = attributeValue2 == null ? StanzaType.IQ : StanzaType.valueOf(attributeValue2.toUpperCase(Locale.US));
        xmlPullParser.next();
        return new Open(attributeValue, parseInt, valueOf);
    }
}
