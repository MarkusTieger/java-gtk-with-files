/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoAttrClass` structure stores the type and operations for
 * <br>a particular type of attribute.
 * <br>
 * <br>The functions in this structure should not be called directly. Instead,
 * <br>one should use the wrapper functions provided for `PangoAttribute`.
 * <p><a href="https://docs.gtk.org/Pango/struct.AttrClass.html">https://docs.gtk.org/Pango/struct.AttrClass.html</a></p>
*/
public class AttrClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AttrClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCopy {
        /**
         * 
         * @param attr 
         * @return 
        */
        Attribute onCopy(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Attribute attr);
    }
    
    private static JnaAttrClass.OnCopy toOnCopy(ch.bailu.gtk.type.Pointer instance, String methodName, OnCopy in) {
        JnaAttrClass.OnCopy out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_attr) -> in.onCopy(__callback, new Attribute(new PointerContainer(_attr))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroy {
        /**
         * 
         * @param attr 
        */
        void onDestroy(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Attribute attr);
    }
    
    private static JnaAttrClass.OnDestroy toOnDestroy(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroy in) {
        JnaAttrClass.OnDestroy out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_attr) -> in.onDestroy(__callback, new Attribute(new PointerContainer(_attr)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEqual {
        /**
         * 
         * @param attr1 
         * @param attr2 
         * @return 
        */
        boolean onEqual(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Attribute attr1, @Nonnull Attribute attr2);
    }
    
    private static JnaAttrClass.OnEqual toOnEqual(ch.bailu.gtk.type.Pointer instance, String methodName, OnEqual in) {
        JnaAttrClass.OnEqual out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_attr1, _attr2) -> in.onEqual(__callback, new Attribute(new PointerContainer(_attr1)), new Attribute(new PointerContainer(_attr2)));
            __callback.register(out);
        }
        return out;
    }

    public AttrClass(PointerContainer pointer) {
        super(pointer);
    }

    public AttrClass() {
        super(cast(JnaAttrClass.allocateStructure()));
    }

    private JnaAttrClass.Fields _fields;
    
    JnaAttrClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAttrClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the type ID for this attribute
    */
    public static final String TYPE = "type";

    /**
     * the type ID for this attribute
    */
    public void setFieldType(int type) {
        toFields().type = type;
        toFields().writeField(TYPE);
    }

    /**
     * the type ID for this attribute
    */
    public int getFieldType() {
       toFields().readField(TYPE);
       return toFields().type;
    } 

    /**
     * 
     * <br>See {@link OnCopy#onCopy}
    */
    public static final String COPY = "copy";

    /**
     * 
     * <br>See {@link OnCopy#onCopy}
    */
    public void setFieldCopy(OnCopy copy) {
        toFields().copy = toOnCopy(this, COPY, copy);
        toFields().writeField(COPY);
    }

    /**
     * 
     * <br>See {@link OnCopy#onCopy}
    */
    public JnaAttrClass.OnCopy getFieldCopy() {
       toFields().readField(COPY);
       return toFields().copy;
    } 

    /**
     * 
     * <br>See {@link OnDestroy#onDestroy}
    */
    public static final String DESTROY = "destroy";

    /**
     * 
     * <br>See {@link OnDestroy#onDestroy}
    */
    public void setFieldDestroy(OnDestroy destroy) {
        toFields().destroy = toOnDestroy(this, DESTROY, destroy);
        toFields().writeField(DESTROY);
    }

    /**
     * 
     * <br>See {@link OnDestroy#onDestroy}
    */
    public JnaAttrClass.OnDestroy getFieldDestroy() {
       toFields().readField(DESTROY);
       return toFields().destroy;
    } 

    /**
     * 
     * <br>See {@link OnEqual#onEqual}
    */
    public static final String EQUAL = "equal";

    /**
     * 
     * <br>See {@link OnEqual#onEqual}
    */
    public void setFieldEqual(OnEqual equal) {
        toFields().equal = toOnEqual(this, EQUAL, equal);
        toFields().writeField(EQUAL);
    }

    /**
     * 
     * <br>See {@link OnEqual#onEqual}
    */
    public JnaAttrClass.OnEqual getFieldEqual() {
       toFields().readField(EQUAL);
       return toFields().equal;
    } 

}

/*
record-type
all-fields-supported
*/
