package org.msgpack.core;

import java.util.List;
import org.msgpack.core.MessagePack.PackerConfig;
import org.msgpack.core.buffer.ArrayBufferOutput;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;

public class MessageBufferPacker extends MessagePacker {
    protected MessageBufferPacker(PackerConfig packerConfig) {
        this(new ArrayBufferOutput(), packerConfig);
    }

    protected MessageBufferPacker(ArrayBufferOutput arrayBufferOutput, PackerConfig packerConfig) {
        super(arrayBufferOutput, packerConfig);
    }

    private ArrayBufferOutput getArrayBufferOut() {
        return (ArrayBufferOutput) this.out;
    }

    public void clear() {
        getArrayBufferOut().clear();
    }

    public MessageBufferOutput reset(MessageBufferOutput messageBufferOutput) {
        if (messageBufferOutput instanceof ArrayBufferOutput) {
            return super.reset(messageBufferOutput);
        }
        throw new IllegalArgumentException("MessageBufferPacker accepts only ArrayBufferOutput");
    }

    public List<MessageBuffer> toBufferList() {
        try {
            flush();
            return getArrayBufferOut().toBufferList();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public byte[] toByteArray() {
        try {
            flush();
            return getArrayBufferOut().toByteArray();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public MessageBuffer toMessageBuffer() {
        try {
            flush();
            return getArrayBufferOut().toMessageBuffer();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
