/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.ActionRowClass.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.ActionRowClass.html</a></p>
*/
public class ActionRowClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ActionRowClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * 
         * @param self an action row
        */
        void onActivate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ActionRow self);
    }
    
    private static JnaActionRowClass.OnActivate toOnActivate(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivate in) {
        JnaActionRowClass.OnActivate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self) -> in.onActivate(__callback, new ActionRow(new PointerContainer(_self)));
            __callback.register(out);
        }
        return out;
    }

    public ActionRowClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaActionRowClass.Fields _fields;
    
    JnaActionRowClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaActionRowClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent class
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public static final String ACTIVATE = "activate";

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public void setFieldActivate(OnActivate activate) {
        toFields().activate = toOnActivate(this, ACTIVATE, activate);
        toFields().writeField(ACTIVATE);
    }

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public JnaActionRowClass.OnActivate getFieldActivate() {
       toFields().readField(ACTIVATE);
       return toFields().activate;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ActionRow.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ActionRow.getParentTypeID());
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
