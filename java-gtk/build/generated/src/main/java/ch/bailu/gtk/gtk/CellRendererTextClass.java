/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.CellRendererTextClass.html">https://docs.gtk.org/gtk4/struct.CellRendererTextClass.html</a></p>
*/
public class CellRendererTextClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellRendererTextClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnEdited {
        /**
         * 
         * @param cell_renderer_text 
         * @param path 
         * @param new_text 
        */
        void onEdited(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRendererText cell_renderer_text, @Nonnull ch.bailu.gtk.type.Str path, @Nonnull ch.bailu.gtk.type.Str new_text);
    }
    
    private static JnaCellRendererTextClass.OnEdited toOnEdited(ch.bailu.gtk.type.Pointer instance, String methodName, OnEdited in) {
        JnaCellRendererTextClass.OnEdited out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell_renderer_text, _path, _new_text) -> in.onEdited(__callback, new CellRendererText(new PointerContainer(_cell_renderer_text)), new ch.bailu.gtk.type.Str(new PointerContainer(_path)), new ch.bailu.gtk.type.Str(new PointerContainer(_new_text)));
            __callback.register(out);
        }
        return out;
    }

    public CellRendererTextClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaCellRendererTextClass.Fields _fields;
    
    JnaCellRendererTextClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaCellRendererTextClass.Fields(asCPointer());
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
     * <br>See {@link OnEdited#onEdited}
    */
    public static final String EDITED = "edited";

    /**
     * 
     * <br>See {@link OnEdited#onEdited}
    */
    public void setFieldEdited(OnEdited edited) {
        toFields().edited = toOnEdited(this, EDITED, edited);
        toFields().writeField(EDITED);
    }

    /**
     * 
     * <br>See {@link OnEdited#onEdited}
    */
    public JnaCellRendererTextClass.OnEdited getFieldEdited() {
       toFields().readField(EDITED);
       return toFields().edited;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CellRendererText.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CellRendererText.getParentTypeID());
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
