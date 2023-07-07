/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for `GtkEntry`. All virtual functions have a default
 * <br>implementation. Derived classes may set the virtual function pointers for the
 * <br>signal handlers to %NULL, but must keep &#64;get_text_area_size and
 * <br>&#64;get_frame_size non-%NULL; either use the default implementation, or provide
 * <br>a custom one.
 * <p><a href="https://docs.gtk.org/gtk4/struct.EntryClass.html">https://docs.gtk.org/gtk4/struct.EntryClass.html</a></p>
*/
public class EntryClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EntryClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * 
         * @param entry 
        */
        void onActivate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Entry entry);
    }
    
    private static JnaEntryClass.OnActivate toOnActivate(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivate in) {
        JnaEntryClass.OnActivate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_entry) -> in.onActivate(__callback, new Entry(new PointerContainer(_entry)));
            __callback.register(out);
        }
        return out;
    }

    public EntryClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaEntryClass.Fields _fields;
    
    JnaEntryClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaEntryClass.Fields(asCPointer());
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
    public JnaEntryClass.OnActivate getFieldActivate() {
       toFields().readField(ACTIVATE);
       return toFields().activate;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Entry.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Entry.getParentTypeID());
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
