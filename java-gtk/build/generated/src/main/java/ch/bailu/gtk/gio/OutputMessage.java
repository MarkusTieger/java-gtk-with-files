/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Structure used for scatter/gather data output when sending multiple
 * <br>messages or packets in one go. You generally pass in an array of
 * <br>&#35;GOutputVectors and the operation will use all the buffers as if they
 * <br>were one buffer.
 * <br>
 * <br>If &#64;address is %NULL then the message is sent to the default receiver
 * <br>(as previously set by g_socket_connect()).
 * <p><a href="https://docs.gtk.org/gio/struct.OutputMessage.html">https://docs.gtk.org/gio/struct.OutputMessage.html</a></p>
*/
public class OutputMessage extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(OutputMessage.class.getCanonicalName());
    }

    public OutputMessage(PointerContainer pointer) {
        super(pointer);
    }

    private JnaOutputMessage.Fields _fields;
    
    JnaOutputMessage.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaOutputMessage.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * a &#35;GSocketAddress, or %NULL
    */
    public static final String ADDRESS = "address";

    /**
     * a &#35;GSocketAddress, or %NULL
    */
    public void setFieldAddress(SocketAddress address) {
        toFields().address = address.asCPointer();
        toFields().writeField(ADDRESS);
    }

    /**
     * a &#35;GSocketAddress, or %NULL
    */
    public SocketAddress getFieldAddress() {
       toFields().readField(ADDRESS);
       return new SocketAddress(new PointerContainer(toFields().address));
    } 

    /**
     * pointer to an array of output vectors
    */
    public static final String VECTORS = "vectors";

    /**
     * pointer to an array of output vectors
    */
    public void setFieldVectors(OutputVector vectors) {
        toFields().vectors = vectors.asCPointer();
        toFields().writeField(VECTORS);
    }

    /**
     * pointer to an array of output vectors
    */
    public OutputVector getFieldVectors() {
       toFields().readField(VECTORS);
       return new OutputVector(new PointerContainer(toFields().vectors));
    } 

    /**
     * the number of output vectors pointed to by &#64;vectors.
    */
    public static final String NUM_VECTORS = "num_vectors";

    /**
     * the number of output vectors pointed to by &#64;vectors.
    */
    public void setFieldNumVectors(int num_vectors) {
        toFields().num_vectors = num_vectors;
        toFields().writeField(NUM_VECTORS);
    }

    /**
     * the number of output vectors pointed to by &#64;vectors.
    */
    public int getFieldNumVectors() {
       toFields().readField(NUM_VECTORS);
       return toFields().num_vectors;
    } 

    /**
     * initialize to 0. Will be set to the number of bytes
     * <br>    that have been sent
    */
    public static final String BYTES_SENT = "bytes_sent";

    /**
     * initialize to 0. Will be set to the number of bytes
     * <br>    that have been sent
    */
    public void setFieldBytesSent(int bytes_sent) {
        toFields().bytes_sent = bytes_sent;
        toFields().writeField(BYTES_SENT);
    }

    /**
     * initialize to 0. Will be set to the number of bytes
     * <br>    that have been sent
    */
    public int getFieldBytesSent() {
       toFields().readField(BYTES_SENT);
       return toFields().bytes_sent;
    } 

}

/*
record-type
some-fields-unsupported

[FieldModel:control_messages:java-type-not-supported:{G_::{c:GSocketControlMessage**}}:{j:}]

[FieldModel:num_control_messages:previous-field-unsupported:{G_::{c:guint}}:{j:int}]
*/
