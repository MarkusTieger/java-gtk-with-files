/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.MessageDialogClass.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.MessageDialogClass.html</a></p>
*/
public class MessageDialogClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MessageDialogClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnResponse {
        /**
         * 
         * @param self a message dialog
         * @param response response ID
        */
        void onResponse(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MessageDialog self, @Nonnull ch.bailu.gtk.type.Str response);
    }
    
    private static JnaMessageDialogClass.OnResponse toOnResponse(ch.bailu.gtk.type.Pointer instance, String methodName, OnResponse in) {
        JnaMessageDialogClass.OnResponse out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _response) -> in.onResponse(__callback, new MessageDialog(new PointerContainer(_self)), new ch.bailu.gtk.type.Str(new PointerContainer(_response)));
            __callback.register(out);
        }
        return out;
    }

    public MessageDialogClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaMessageDialogClass.Fields _fields;
    
    JnaMessageDialogClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaMessageDialogClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
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
    public JnaMessageDialogClass.OnResponse getFieldResponse() {
       toFields().readField(RESPONSE);
       return toFields().response;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MessageDialog.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MessageDialog.getParentTypeID());
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
