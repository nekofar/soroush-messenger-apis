package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p129g.C5345c;
import java.io.File;
import java.lang.reflect.Type;

public class C7111o extends ak<File> {
    public C7111o() {
        super(File.class);
    }

    public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        visitStringFormat(c5345c, c5354j);
    }

    public C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode("string", true);
    }

    public /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        c5301g.writeString(((File) obj).getAbsolutePath());
    }
}
