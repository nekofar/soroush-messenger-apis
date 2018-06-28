package org.msgpack.core.buffer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import org.msgpack.core.Preconditions;

public class InputStreamBufferInput implements MessageBufferInput {
    private final byte[] buffer;
    private InputStream in;

    public InputStreamBufferInput(InputStream inputStream) {
        this(inputStream, 8192);
    }

    public InputStreamBufferInput(InputStream inputStream, int i) {
        this.in = (InputStream) Preconditions.checkNotNull(inputStream, "input is null");
        this.buffer = new byte[i];
    }

    public static MessageBufferInput newBufferInput(InputStream inputStream) {
        Preconditions.checkNotNull(inputStream, "InputStream is null");
        if (inputStream instanceof FileInputStream) {
            ReadableByteChannel channel = ((FileInputStream) inputStream).getChannel();
            if (channel != null) {
                return new ChannelBufferInput(channel);
            }
        }
        return new InputStreamBufferInput(inputStream);
    }

    public void close() {
        this.in.close();
    }

    public MessageBuffer next() {
        int read = this.in.read(this.buffer);
        return read == -1 ? null : MessageBuffer.wrap(this.buffer, 0, read);
    }

    public InputStream reset(InputStream inputStream) {
        InputStream inputStream2 = this.in;
        this.in = inputStream;
        return inputStream2;
    }
}