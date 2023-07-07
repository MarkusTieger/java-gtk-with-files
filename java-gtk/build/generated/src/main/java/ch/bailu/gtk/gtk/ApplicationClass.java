/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.ApplicationClass.html">https://docs.gtk.org/gtk4/struct.ApplicationClass.html</a></p>
*/
public class ApplicationClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ApplicationClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnWindowAdded {
        /**
         * 
         * @param application 
         * @param window 
        */
        void onWindowAdded(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Application application, @Nonnull Window window);
    }
    
    private static JnaApplicationClass.OnWindowAdded toOnWindowAdded(ch.bailu.gtk.type.Pointer instance, String methodName, OnWindowAdded in) {
        JnaApplicationClass.OnWindowAdded out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_application, _window) -> in.onWindowAdded(__callback, new Application(new PointerContainer(_application)), new Window(new PointerContainer(_window)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnWindowRemoved {
        /**
         * 
         * @param application 
         * @param window 
        */
        void onWindowRemoved(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Application application, @Nonnull Window window);
    }
    
    private static JnaApplicationClass.OnWindowRemoved toOnWindowRemoved(ch.bailu.gtk.type.Pointer instance, String methodName, OnWindowRemoved in) {
        JnaApplicationClass.OnWindowRemoved out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_application, _window) -> in.onWindowRemoved(__callback, new Application(new PointerContainer(_application)), new Window(new PointerContainer(_window)));
            __callback.register(out);
        }
        return out;
    }

    public ApplicationClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaApplicationClass.Fields _fields;
    
    JnaApplicationClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaApplicationClass.Fields(asCPointer());
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
     * <br>See {@link OnWindowAdded#onWindowAdded}
    */
    public static final String WINDOW_ADDED = "window_added";

    /**
     * 
     * <br>See {@link OnWindowAdded#onWindowAdded}
    */
    public void setFieldWindowAdded(OnWindowAdded window_added) {
        toFields().window_added = toOnWindowAdded(this, WINDOW_ADDED, window_added);
        toFields().writeField(WINDOW_ADDED);
    }

    /**
     * 
     * <br>See {@link OnWindowAdded#onWindowAdded}
    */
    public JnaApplicationClass.OnWindowAdded getFieldWindowAdded() {
       toFields().readField(WINDOW_ADDED);
       return toFields().window_added;
    } 

    /**
     * 
     * <br>See {@link OnWindowRemoved#onWindowRemoved}
    */
    public static final String WINDOW_REMOVED = "window_removed";

    /**
     * 
     * <br>See {@link OnWindowRemoved#onWindowRemoved}
    */
    public void setFieldWindowRemoved(OnWindowRemoved window_removed) {
        toFields().window_removed = toOnWindowRemoved(this, WINDOW_REMOVED, window_removed);
        toFields().writeField(WINDOW_REMOVED);
    }

    /**
     * 
     * <br>See {@link OnWindowRemoved#onWindowRemoved}
    */
    public JnaApplicationClass.OnWindowRemoved getFieldWindowRemoved() {
       toFields().readField(WINDOW_REMOVED);
       return toFields().window_removed;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Application.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Application.getParentTypeID());
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
