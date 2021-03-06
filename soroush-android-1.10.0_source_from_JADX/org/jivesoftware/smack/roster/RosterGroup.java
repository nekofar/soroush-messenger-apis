package org.jivesoftware.smack.roster;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.b.a.i;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.roster.packet.RosterPacket;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;

public class RosterGroup extends Manager {
    private final Set<RosterEntry> entries = new LinkedHashSet();
    private final String name;

    RosterGroup(String str, XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.name = str;
    }

    public void addEntry(RosterEntry rosterEntry) {
        synchronized (this.entries) {
            if (!this.entries.contains(rosterEntry)) {
                IQ rosterPacket = new RosterPacket();
                rosterPacket.setType(Type.set);
                Item toRosterItem = RosterEntry.toRosterItem(rosterEntry);
                toRosterItem.addGroupName(getName());
                rosterPacket.addRosterItem(toRosterItem);
                connection().createStanzaCollectorAndSend(rosterPacket).nextResultOrThrow();
            }
        }
    }

    void addEntryLocal(RosterEntry rosterEntry) {
        synchronized (this.entries) {
            this.entries.remove(rosterEntry);
            this.entries.add(rosterEntry);
        }
    }

    public boolean contains(i iVar) {
        return getEntry(iVar) != null;
    }

    public boolean contains(RosterEntry rosterEntry) {
        boolean contains;
        synchronized (this.entries) {
            contains = this.entries.contains(rosterEntry);
        }
        return contains;
    }

    public List<RosterEntry> getEntries() {
        List arrayList;
        synchronized (this.entries) {
            arrayList = new ArrayList(this.entries);
        }
        return arrayList;
    }

    public RosterEntry getEntry(i iVar) {
        if (iVar == null) {
            return null;
        }
        CharSequence m = iVar.m();
        synchronized (this.entries) {
            for (RosterEntry rosterEntry : this.entries) {
                if (rosterEntry.getJid().a(m)) {
                    return rosterEntry;
                }
            }
            return null;
        }
    }

    public int getEntryCount() {
        int size;
        synchronized (this.entries) {
            size = this.entries.size();
        }
        return size;
    }

    public String getName() {
        return this.name;
    }

    public void removeEntry(RosterEntry rosterEntry) {
        synchronized (this.entries) {
            if (this.entries.contains(rosterEntry)) {
                IQ rosterPacket = new RosterPacket();
                rosterPacket.setType(Type.set);
                Item toRosterItem = RosterEntry.toRosterItem(rosterEntry);
                toRosterItem.removeGroupName(getName());
                rosterPacket.addRosterItem(toRosterItem);
                connection().createStanzaCollectorAndSend(rosterPacket).nextResultOrThrow();
            }
        }
    }

    void removeEntryLocal(RosterEntry rosterEntry) {
        synchronized (this.entries) {
            if (this.entries.contains(rosterEntry)) {
                this.entries.remove(rosterEntry);
            }
        }
    }

    public void setName(String str) {
        synchronized (this.entries) {
            for (RosterEntry rosterEntry : this.entries) {
                IQ rosterPacket = new RosterPacket();
                rosterPacket.setType(Type.set);
                Item toRosterItem = RosterEntry.toRosterItem(rosterEntry);
                toRosterItem.removeGroupName(this.name);
                toRosterItem.addGroupName(str);
                rosterPacket.addRosterItem(toRosterItem);
                connection().createStanzaCollectorAndSend(rosterPacket).nextResultOrThrow();
            }
        }
    }
}
