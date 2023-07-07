/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Represents a request of a screen object in a given orientation. These
 * <br>are primarily used in container implementations when allocating a natural
 * <br>size for children calling. See [func&#64;distribute_natural_allocation].
 * <p><a href="https://docs.gtk.org/gtk4/struct.RequestedSize.html">https://docs.gtk.org/gtk4/struct.RequestedSize.html</a></p>
*/
public class RequestedSize extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RequestedSize.class.getCanonicalName());
    }

    public RequestedSize(PointerContainer pointer) {
        super(pointer);
    }

    public RequestedSize() {
        super(cast(JnaRequestedSize.allocateStructure()));
    }

    private JnaRequestedSize.Fields _fields;
    
    JnaRequestedSize.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRequestedSize.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * A client pointer
    */
    public static final String DATA = "data";

    /**
     * A client pointer
    */
    public void setFieldData(ch.bailu.gtk.type.Pointer data) {
        toFields().data = data.asCPointer();
        toFields().writeField(DATA);
    }

    /**
     * A client pointer
    */
    public ch.bailu.gtk.type.Pointer getFieldData() {
       toFields().readField(DATA);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().data));
    } 

    /**
     * The minimum size needed for allocation in a given orientation
    */
    public static final String MINIMUM_SIZE = "minimum_size";

    /**
     * The minimum size needed for allocation in a given orientation
    */
    public void setFieldMinimumSize(int minimum_size) {
        toFields().minimum_size = minimum_size;
        toFields().writeField(MINIMUM_SIZE);
    }

    /**
     * The minimum size needed for allocation in a given orientation
    */
    public int getFieldMinimumSize() {
       toFields().readField(MINIMUM_SIZE);
       return toFields().minimum_size;
    } 

    /**
     * The natural size for allocation in a given orientation
    */
    public static final String NATURAL_SIZE = "natural_size";

    /**
     * The natural size for allocation in a given orientation
    */
    public void setFieldNaturalSize(int natural_size) {
        toFields().natural_size = natural_size;
        toFields().writeField(NATURAL_SIZE);
    }

    /**
     * The natural size for allocation in a given orientation
    */
    public int getFieldNaturalSize() {
       toFields().readField(NATURAL_SIZE);
       return toFields().natural_size;
    } 

}

/*
record-type
all-fields-supported
*/
