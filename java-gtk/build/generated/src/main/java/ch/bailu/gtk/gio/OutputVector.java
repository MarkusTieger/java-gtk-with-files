/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Structure used for scatter/gather data output.
 * <br>You generally pass in an array of &#35;GOutputVectors
 * <br>and the operation will use all the buffers as if they were
 * <br>one buffer.
 * <p><a href="https://docs.gtk.org/gio/struct.OutputVector.html">https://docs.gtk.org/gio/struct.OutputVector.html</a></p>
*/
public class OutputVector extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(OutputVector.class.getCanonicalName());
    }

    public OutputVector(PointerContainer pointer) {
        super(pointer);
    }

    public OutputVector() {
        super(cast(JnaOutputVector.allocateStructure()));
    }

    private JnaOutputVector.Fields _fields;
    
    JnaOutputVector.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaOutputVector.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * Pointer to a buffer of data to read.
    */
    public static final String BUFFER = "buffer";

    /**
     * Pointer to a buffer of data to read.
    */
    public void setFieldBuffer(ch.bailu.gtk.type.Pointer buffer) {
        toFields().buffer = buffer.asCPointer();
        toFields().writeField(BUFFER);
    }

    /**
     * Pointer to a buffer of data to read.
    */
    public ch.bailu.gtk.type.Pointer getFieldBuffer() {
       toFields().readField(BUFFER);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().buffer));
    } 

    /**
     * the size of &#64;buffer.
    */
    public static final String SIZE = "size";

    /**
     * the size of &#64;buffer.
    */
    public void setFieldSize(long size) {
        toFields().size = size;
        toFields().writeField(SIZE);
    }

    /**
     * the size of &#64;buffer.
    */
    public long getFieldSize() {
       toFields().readField(SIZE);
       return toFields().size;
    } 

}

/*
record-type
all-fields-supported
*/
