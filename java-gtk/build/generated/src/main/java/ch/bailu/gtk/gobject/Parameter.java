/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The GParameter struct is an auxiliary structure used
 * <br>to hand parameter name/value pairs to g_object_newv().
 * <p><a href="https://docs.gtk.org/gobject/struct.Parameter.html">https://docs.gtk.org/gobject/struct.Parameter.html</a></p>
*/
public class Parameter extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Parameter.class.getCanonicalName());
    }

    public Parameter(PointerContainer pointer) {
        super(pointer);
    }

    public Parameter() {
        super(cast(JnaParameter.allocateStructure()));
    }

    private JnaParameter.Fields _fields;
    
    JnaParameter.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaParameter.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the parameter name
    */
    public static final String NAME = "name";

    /**
     * the parameter name
    */
    public void setFieldName(ch.bailu.gtk.type.Str name) {
        toFields().name = name.asCPointer();
        toFields().writeField(NAME);
    }

    /**
     * the parameter name
    */
    public ch.bailu.gtk.type.Str getFieldName() {
       toFields().readField(NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().name));
    } 

    /**
     * the parameter value
     * <br>Private field: direct-type
    */
    public static final String VALUE = "value";

}

/*
record-type
all-fields-supported
*/
