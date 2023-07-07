/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The GObjectConstructParam struct is an auxiliary structure used to hand
 * <br>&#35;GParamSpec/&#35;GValue pairs to the &#64;constructor of a &#35;GObjectClass.
 * <p><a href="https://docs.gtk.org/gobject/struct.ObjectConstructParam.html">https://docs.gtk.org/gobject/struct.ObjectConstructParam.html</a></p>
*/
public class ObjectConstructParam extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ObjectConstructParam.class.getCanonicalName());
    }

    public ObjectConstructParam(PointerContainer pointer) {
        super(pointer);
    }

    public ObjectConstructParam() {
        super(cast(JnaObjectConstructParam.allocateStructure()));
    }

    private JnaObjectConstructParam.Fields _fields;
    
    JnaObjectConstructParam.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaObjectConstructParam.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the &#35;GParamSpec of the construct parameter
    */
    public static final String PSPEC = "pspec";

    /**
     * the &#35;GParamSpec of the construct parameter
    */
    public void setFieldPspec(ParamSpec pspec) {
        toFields().pspec = pspec.asCPointer();
        toFields().writeField(PSPEC);
    }

    /**
     * the &#35;GParamSpec of the construct parameter
    */
    public ParamSpec getFieldPspec() {
       toFields().readField(PSPEC);
       return new ParamSpec(new PointerContainer(toFields().pspec));
    } 

    /**
     * the value to set the parameter to
    */
    public static final String VALUE = "value";

    /**
     * the value to set the parameter to
    */
    public void setFieldValue(Value value) {
        toFields().value = value.asCPointer();
        toFields().writeField(VALUE);
    }

    /**
     * the value to set the parameter to
    */
    public Value getFieldValue() {
       toFields().readField(VALUE);
       return new Value(new PointerContainer(toFields().value));
    } 

}

/*
record-type
all-fields-supported
*/
