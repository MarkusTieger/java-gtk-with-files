/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Structure used for scatter/gather data input.
 * <br>You generally pass in an array of &#35;GInputVectors
 * <br>and the operation will store the read data starting in the
 * <br>first buffer, switching to the next as needed.
 * <p><a href="https://docs.gtk.org/gio/struct.InputVector.html">https://docs.gtk.org/gio/struct.InputVector.html</a></p>
*/
public class InputVector extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InputVector.class.getCanonicalName());
    }

    public InputVector(PointerContainer pointer) {
        super(pointer);
    }

    public InputVector() {
        super(cast(JnaInputVector.allocateStructure()));
    }

    private JnaInputVector.Fields _fields;
    
    JnaInputVector.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaInputVector.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * Pointer to a buffer where data will be written.
    */
    public static final String BUFFER = "buffer";

    /**
     * Pointer to a buffer where data will be written.
    */
    public void setFieldBuffer(ch.bailu.gtk.type.Pointer buffer) {
        toFields().buffer = buffer.asCPointer();
        toFields().writeField(BUFFER);
    }

    /**
     * Pointer to a buffer where data will be written.
    */
    public ch.bailu.gtk.type.Pointer getFieldBuffer() {
       toFields().readField(BUFFER);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().buffer));
    } 

    /**
     * the available size in &#64;buffer.
    */
    public static final String SIZE = "size";

    /**
     * the available size in &#64;buffer.
    */
    public void setFieldSize(long size) {
        toFields().size = size;
        toFields().writeField(SIZE);
    }

    /**
     * the available size in &#64;buffer.
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
