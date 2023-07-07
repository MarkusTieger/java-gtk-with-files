/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkRecentManagerClass` contains only private data.
 * <p><a href="https://docs.gtk.org/gtk4/struct.RecentManagerClass.html">https://docs.gtk.org/gtk4/struct.RecentManagerClass.html</a></p>
*/
public class RecentManagerClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RecentManagerClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * 
         * @param manager 
        */
        void onChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull RecentManager manager);
    }
    
    private static JnaRecentManagerClass.OnChanged toOnChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnChanged in) {
        JnaRecentManagerClass.OnChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager) -> in.onChanged(__callback, new RecentManager(new PointerContainer(_manager)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkRecent1 {
        void onGtkRecent1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaRecentManagerClass.OnGtkRecent1 toOnGtkRecent1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkRecent1 in) {
        JnaRecentManagerClass.OnGtkRecent1 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkRecent1(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkRecent2 {
        void onGtkRecent2(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaRecentManagerClass.OnGtkRecent2 toOnGtkRecent2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkRecent2 in) {
        JnaRecentManagerClass.OnGtkRecent2 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkRecent2(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkRecent3 {
        void onGtkRecent3(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaRecentManagerClass.OnGtkRecent3 toOnGtkRecent3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkRecent3 in) {
        JnaRecentManagerClass.OnGtkRecent3 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkRecent3(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkRecent4 {
        void onGtkRecent4(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaRecentManagerClass.OnGtkRecent4 toOnGtkRecent4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkRecent4 in) {
        JnaRecentManagerClass.OnGtkRecent4 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkRecent4(__callback);
            __callback.register(out);
        }
        return out;
    }

    public RecentManagerClass(PointerContainer pointer) {
        super(pointer);
    }

    public RecentManagerClass() {
        super(cast(JnaRecentManagerClass.allocateStructure()));
    }

    private JnaRecentManagerClass.Fields _fields;
    
    JnaRecentManagerClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRecentManagerClass.Fields(asCPointer());
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
     * <br>See {@link OnChanged#onChanged}
    */
    public static final String CHANGED = "changed";

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public void setFieldChanged(OnChanged changed) {
        toFields().changed = toOnChanged(this, CHANGED, changed);
        toFields().writeField(CHANGED);
    }

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public JnaRecentManagerClass.OnChanged getFieldChanged() {
       toFields().readField(CHANGED);
       return toFields().changed;
    } 

    /**
     * 
     * <br>See {@link OnGtkRecent1#onGtkRecent1}
    */
    public static final String _GTK_RECENT1 = "_gtk_recent1";

    /**
     * 
     * <br>See {@link OnGtkRecent1#onGtkRecent1}
    */
    public void setFieldGtkRecent1(OnGtkRecent1 _gtk_recent1) {
        toFields()._gtk_recent1 = toOnGtkRecent1(this, _GTK_RECENT1, _gtk_recent1);
        toFields().writeField(_GTK_RECENT1);
    }

    /**
     * 
     * <br>See {@link OnGtkRecent1#onGtkRecent1}
    */
    public JnaRecentManagerClass.OnGtkRecent1 getFieldGtkRecent1() {
       toFields().readField(_GTK_RECENT1);
       return toFields()._gtk_recent1;
    } 

    /**
     * 
     * <br>See {@link OnGtkRecent2#onGtkRecent2}
    */
    public static final String _GTK_RECENT2 = "_gtk_recent2";

    /**
     * 
     * <br>See {@link OnGtkRecent2#onGtkRecent2}
    */
    public void setFieldGtkRecent2(OnGtkRecent2 _gtk_recent2) {
        toFields()._gtk_recent2 = toOnGtkRecent2(this, _GTK_RECENT2, _gtk_recent2);
        toFields().writeField(_GTK_RECENT2);
    }

    /**
     * 
     * <br>See {@link OnGtkRecent2#onGtkRecent2}
    */
    public JnaRecentManagerClass.OnGtkRecent2 getFieldGtkRecent2() {
       toFields().readField(_GTK_RECENT2);
       return toFields()._gtk_recent2;
    } 

    /**
     * 
     * <br>See {@link OnGtkRecent3#onGtkRecent3}
    */
    public static final String _GTK_RECENT3 = "_gtk_recent3";

    /**
     * 
     * <br>See {@link OnGtkRecent3#onGtkRecent3}
    */
    public void setFieldGtkRecent3(OnGtkRecent3 _gtk_recent3) {
        toFields()._gtk_recent3 = toOnGtkRecent3(this, _GTK_RECENT3, _gtk_recent3);
        toFields().writeField(_GTK_RECENT3);
    }

    /**
     * 
     * <br>See {@link OnGtkRecent3#onGtkRecent3}
    */
    public JnaRecentManagerClass.OnGtkRecent3 getFieldGtkRecent3() {
       toFields().readField(_GTK_RECENT3);
       return toFields()._gtk_recent3;
    } 

    /**
     * 
     * <br>See {@link OnGtkRecent4#onGtkRecent4}
    */
    public static final String _GTK_RECENT4 = "_gtk_recent4";

    /**
     * 
     * <br>See {@link OnGtkRecent4#onGtkRecent4}
    */
    public void setFieldGtkRecent4(OnGtkRecent4 _gtk_recent4) {
        toFields()._gtk_recent4 = toOnGtkRecent4(this, _GTK_RECENT4, _gtk_recent4);
        toFields().writeField(_GTK_RECENT4);
    }

    /**
     * 
     * <br>See {@link OnGtkRecent4#onGtkRecent4}
    */
    public JnaRecentManagerClass.OnGtkRecent4 getFieldGtkRecent4() {
       toFields().readField(_GTK_RECENT4);
       return toFields()._gtk_recent4;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(RecentManager.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(RecentManager.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
