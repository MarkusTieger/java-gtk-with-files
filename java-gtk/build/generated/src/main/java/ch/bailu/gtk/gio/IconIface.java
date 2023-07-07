/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * GIconIface is used to implement GIcon types for various
 * <br>different systems. See &#35;GThemedIcon and &#35;GLoadableIcon for
 * <br>examples of how to implement this interface.
 * <p><a href="https://docs.gtk.org/gio/struct.IconIface.html">https://docs.gtk.org/gio/struct.IconIface.html</a></p>
*/
public class IconIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IconIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnHash {
        /**
         * 
         * @param icon &#35;gconstpointer to an icon object.
         * @return a &#35;guint containing a hash for the &#64;icon, suitable for use in a &#35;GHashTable or similar data structure.
        */
        int onHash(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Icon icon);
    }
    
    private static JnaIconIface.OnHash toOnHash(ch.bailu.gtk.type.Pointer instance, String methodName, OnHash in) {
        JnaIconIface.OnHash out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_icon) -> in.onHash(__callback, new Icon(new PointerContainer(_icon)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEqual {
        /**
         * 
         * @param icon1 pointer to the first &#35;GIcon.
         * @param icon2 pointer to the second &#35;GIcon.
         * @return %TRUE if &#64;icon1 is equal to &#64;icon2. %FALSE otherwise.
        */
        boolean onEqual(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable Icon icon1, @Nullable Icon icon2);
    }
    
    private static JnaIconIface.OnEqual toOnEqual(ch.bailu.gtk.type.Pointer instance, String methodName, OnEqual in) {
        JnaIconIface.OnEqual out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_icon1, _icon2) -> in.onEqual(__callback, new Icon(new PointerContainer(_icon1)), new Icon(new PointerContainer(_icon2)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnToTokens {
        /**
         * 
         * @param icon a &#35;GIcon.
         * @param tokens 
         * @param out_version 
         * @return An allocated NUL-terminated UTF8 string or %NULL if &#64;icon can't be serialized. Use g_free() to free.
        */
        boolean onToTokens(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Icon icon, @Nonnull ch.bailu.gtk.glib.PtrArray tokens, @Nonnull ch.bailu.gtk.type.Int out_version);
    }
    
    private static JnaIconIface.OnToTokens toOnToTokens(ch.bailu.gtk.type.Pointer instance, String methodName, OnToTokens in) {
        JnaIconIface.OnToTokens out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_icon, _tokens, _out_version) -> in.onToTokens(__callback, new Icon(new PointerContainer(_icon)), new ch.bailu.gtk.glib.PtrArray(new PointerContainer(_tokens)), new ch.bailu.gtk.type.Int(new PointerContainer(_out_version)));
            __callback.register(out);
        }
        return out;
    }

    public IconIface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaIconIface.Fields _fields;
    
    JnaIconIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaIconIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnHash#onHash}
    */
    public static final String HASH = "hash";

    /**
     * 
     * <br>See {@link OnHash#onHash}
    */
    public void setFieldHash(OnHash hash) {
        toFields().hash = toOnHash(this, HASH, hash);
        toFields().writeField(HASH);
    }

    /**
     * 
     * <br>See {@link OnHash#onHash}
    */
    public JnaIconIface.OnHash getFieldHash() {
       toFields().readField(HASH);
       return toFields().hash;
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
    public JnaIconIface.OnEqual getFieldEqual() {
       toFields().readField(EQUAL);
       return toFields().equal;
    } 

    /**
     * 
     * <br>See {@link OnToTokens#onToTokens}
    */
    public static final String TO_TOKENS = "to_tokens";

    /**
     * 
     * <br>See {@link OnToTokens#onToTokens}
    */
    public void setFieldToTokens(OnToTokens to_tokens) {
        toFields().to_tokens = toOnToTokens(this, TO_TOKENS, to_tokens);
        toFields().writeField(TO_TOKENS);
    }

    /**
     * 
     * <br>See {@link OnToTokens#onToTokens}
    */
    public JnaIconIface.OnToTokens getFieldToTokens() {
       toFields().readField(TO_TOKENS);
       return toFields().to_tokens;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Icon.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Icon.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:from_tokens:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:serialize:previous-field-unsupported:[MethodModel:Supported:serialize:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Icon:{c:GIcon*}}:{j:long}]]

[MethodModel:Supported:serialize:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Icon:{c:GIcon*}}:{j:long}]
*/
