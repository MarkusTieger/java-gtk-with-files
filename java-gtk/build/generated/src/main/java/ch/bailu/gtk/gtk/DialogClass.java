/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.DialogClass.html">https://docs.gtk.org/gtk4/struct.DialogClass.html</a></p>
*/
public class DialogClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DialogClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnResponse {
        /**
         * 
         * @param dialog a `GtkDialog`
         * @param response_id response ID
        */
        void onResponse(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Dialog dialog, int response_id);
    }
    
    private static JnaDialogClass.OnResponse toOnResponse(ch.bailu.gtk.type.Pointer instance, String methodName, OnResponse in) {
        JnaDialogClass.OnResponse out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_dialog, _response_id) -> in.onResponse(__callback, new Dialog(new PointerContainer(_dialog)), _response_id);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnClose {
        /**
         * 
         * @param dialog 
        */
        void onClose(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Dialog dialog);
    }
    
    private static JnaDialogClass.OnClose toOnClose(ch.bailu.gtk.type.Pointer instance, String methodName, OnClose in) {
        JnaDialogClass.OnClose out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_dialog) -> in.onClose(__callback, new Dialog(new PointerContainer(_dialog)));
            __callback.register(out);
        }
        return out;
    }

    public DialogClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDialogClass.Fields _fields;
    
    JnaDialogClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDialogClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent class.
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnResponse#onResponse}
    */
    public static final String RESPONSE = "response";

    /**
     * 
     * <br>See {@link OnResponse#onResponse}
    */
    public void setFieldResponse(OnResponse response) {
        toFields().response = toOnResponse(this, RESPONSE, response);
        toFields().writeField(RESPONSE);
    }

    /**
     * 
     * <br>See {@link OnResponse#onResponse}
    */
    public JnaDialogClass.OnResponse getFieldResponse() {
       toFields().readField(RESPONSE);
       return toFields().response;
    } 

    /**
     * 
     * <br>See {@link OnClose#onClose}
    */
    public static final String CLOSE = "close";

    /**
     * 
     * <br>See {@link OnClose#onClose}
    */
    public void setFieldClose(OnClose close) {
        toFields().close = toOnClose(this, CLOSE, close);
        toFields().writeField(CLOSE);
    }

    /**
     * 
     * <br>See {@link OnClose#onClose}
    */
    public JnaDialogClass.OnClose getFieldClose() {
       toFields().readField(CLOSE);
       return toFields().close;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Dialog.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Dialog.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
