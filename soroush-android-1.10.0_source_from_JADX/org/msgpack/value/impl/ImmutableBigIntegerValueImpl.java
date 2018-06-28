package org.msgpack.value.impl;

import java.math.BigInteger;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ImmutableArrayValue;
import org.msgpack.value.ImmutableBinaryValue;
import org.msgpack.value.ImmutableBooleanValue;
import org.msgpack.value.ImmutableExtensionValue;
import org.msgpack.value.ImmutableFloatValue;
import org.msgpack.value.ImmutableIntegerValue;
import org.msgpack.value.ImmutableMapValue;
import org.msgpack.value.ImmutableNilValue;
import org.msgpack.value.ImmutableNumberValue;
import org.msgpack.value.ImmutableRawValue;
import org.msgpack.value.ImmutableStringValue;
import org.msgpack.value.IntegerValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;

public class ImmutableBigIntegerValueImpl extends AbstractImmutableValue implements ImmutableIntegerValue {
    private static final BigInteger BYTE_MAX = BigInteger.valueOf(127);
    private static final BigInteger BYTE_MIN = BigInteger.valueOf(-128);
    private static final BigInteger INT_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger INT_MIN = BigInteger.valueOf(-2147483648L);
    private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);
    private static final BigInteger LONG_MIN = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger SHORT_MAX = BigInteger.valueOf(32767);
    private static final BigInteger SHORT_MIN = BigInteger.valueOf(-32768);
    private final BigInteger value;

    public ImmutableBigIntegerValueImpl(BigInteger bigInteger) {
        this.value = bigInteger;
    }

    public static MessageFormat mostSuccinctMessageFormat(IntegerValue integerValue) {
        return integerValue.isInByteRange() ? MessageFormat.INT8 : integerValue.isInShortRange() ? MessageFormat.INT16 : integerValue.isInIntRange() ? MessageFormat.INT32 : integerValue.isInLongRange() ? MessageFormat.INT64 : MessageFormat.UINT64;
    }

    public /* bridge */ /* synthetic */ ImmutableArrayValue asArrayValue() {
        return super.asArrayValue();
    }

    public BigInteger asBigInteger() {
        return this.value;
    }

    public /* bridge */ /* synthetic */ ImmutableBinaryValue asBinaryValue() {
        return super.asBinaryValue();
    }

    public /* bridge */ /* synthetic */ ImmutableBooleanValue asBooleanValue() {
        return super.asBooleanValue();
    }

    public byte asByte() {
        if (isInByteRange()) {
            return this.value.byteValue();
        }
        throw new MessageIntegerOverflowException(this.value);
    }

    public /* bridge */ /* synthetic */ ImmutableExtensionValue asExtensionValue() {
        return super.asExtensionValue();
    }

    public /* bridge */ /* synthetic */ ImmutableFloatValue asFloatValue() {
        return super.asFloatValue();
    }

    public int asInt() {
        if (isInIntRange()) {
            return this.value.intValue();
        }
        throw new MessageIntegerOverflowException(this.value);
    }

    public ImmutableIntegerValue asIntegerValue() {
        return this;
    }

    public long asLong() {
        if (isInLongRange()) {
            return this.value.longValue();
        }
        throw new MessageIntegerOverflowException(this.value);
    }

    public /* bridge */ /* synthetic */ ImmutableMapValue asMapValue() {
        return super.asMapValue();
    }

    public /* bridge */ /* synthetic */ ImmutableNilValue asNilValue() {
        return super.asNilValue();
    }

    public ImmutableNumberValue asNumberValue() {
        return this;
    }

    public /* bridge */ /* synthetic */ ImmutableRawValue asRawValue() {
        return super.asRawValue();
    }

    public short asShort() {
        if (isInShortRange()) {
            return this.value.shortValue();
        }
        throw new MessageIntegerOverflowException(this.value);
    }

    public /* bridge */ /* synthetic */ ImmutableStringValue asStringValue() {
        return super.asStringValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        if (!value.isIntegerValue()) {
            return false;
        }
        return this.value.equals(value.asIntegerValue().toBigInteger());
    }

    public ValueType getValueType() {
        return ValueType.INTEGER;
    }

    public int hashCode() {
        if (INT_MIN.compareTo(this.value) <= 0 && this.value.compareTo(INT_MAX) <= 0) {
            return (int) this.value.longValue();
        }
        if (LONG_MIN.compareTo(this.value) > 0 || this.value.compareTo(LONG_MAX) > 0) {
            return this.value.hashCode();
        }
        long longValue = this.value.longValue();
        return (int) (longValue ^ (longValue >>> 32));
    }

    public ImmutableIntegerValue immutableValue() {
        return this;
    }

    public /* bridge */ /* synthetic */ boolean isArrayValue() {
        return super.isArrayValue();
    }

    public /* bridge */ /* synthetic */ boolean isBinaryValue() {
        return super.isBinaryValue();
    }

    public /* bridge */ /* synthetic */ boolean isBooleanValue() {
        return super.isBooleanValue();
    }

    public /* bridge */ /* synthetic */ boolean isExtensionValue() {
        return super.isExtensionValue();
    }

    public /* bridge */ /* synthetic */ boolean isFloatValue() {
        return super.isFloatValue();
    }

    public boolean isInByteRange() {
        return this.value.compareTo(BYTE_MIN) >= 0 && this.value.compareTo(BYTE_MAX) <= 0;
    }

    public boolean isInIntRange() {
        return this.value.compareTo(INT_MIN) >= 0 && this.value.compareTo(INT_MAX) <= 0;
    }

    public boolean isInLongRange() {
        return this.value.compareTo(LONG_MIN) >= 0 && this.value.compareTo(LONG_MAX) <= 0;
    }

    public boolean isInShortRange() {
        return this.value.compareTo(SHORT_MIN) >= 0 && this.value.compareTo(SHORT_MAX) <= 0;
    }

    public /* bridge */ /* synthetic */ boolean isIntegerValue() {
        return super.isIntegerValue();
    }

    public /* bridge */ /* synthetic */ boolean isMapValue() {
        return super.isMapValue();
    }

    public /* bridge */ /* synthetic */ boolean isNilValue() {
        return super.isNilValue();
    }

    public /* bridge */ /* synthetic */ boolean isNumberValue() {
        return super.isNumberValue();
    }

    public /* bridge */ /* synthetic */ boolean isRawValue() {
        return super.isRawValue();
    }

    public /* bridge */ /* synthetic */ boolean isStringValue() {
        return super.isStringValue();
    }

    public MessageFormat mostSuccinctMessageFormat() {
        return mostSuccinctMessageFormat(this);
    }

    public BigInteger toBigInteger() {
        return this.value;
    }

    public byte toByte() {
        return this.value.byteValue();
    }

    public double toDouble() {
        return this.value.doubleValue();
    }

    public float toFloat() {
        return this.value.floatValue();
    }

    public int toInt() {
        return this.value.intValue();
    }

    public String toJson() {
        return this.value.toString();
    }

    public long toLong() {
        return this.value.longValue();
    }

    public short toShort() {
        return this.value.shortValue();
    }

    public String toString() {
        return toJson();
    }

    public void writeTo(MessagePacker messagePacker) {
        messagePacker.packBigInteger(this.value);
    }
}
