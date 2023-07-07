/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * In order to implement dynamic loading of types based on &#35;GTypeModule,
 * <br>the &#64;load and &#64;unload functions in &#35;GTypeModuleClass must be implemented.
 * <p><a href="https://docs.gtk.org/gobject/struct.TypeModuleClass.html">https://docs.gtk.org/gobject/struct.TypeModuleClass.html</a></p>
*/
public class TypeModuleClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TypeModuleClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnLoad {
        /**
         * 
         * @param module 
         * @return 
        */
        boolean onLoad(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TypeModule module);
    }
    
    private static JnaTypeModuleClass.OnLoad toOnLoad(ch.bailu.gtk.type.Pointer instance, String methodName, OnLoad in) {
        JnaTypeModuleClass.OnLoad out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_module) -> in.onLoad(__callback, new TypeModule(new PointerContainer(_module)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnload {
        /**
         * 
         * @param module 
        */
        void onUnload(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TypeModule module);
    }
    
    private static JnaTypeModuleClass.OnUnload toOnUnload(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnload in) {
        JnaTypeModuleClass.OnUnload out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_module) -> in.onUnload(__callback, new TypeModule(new PointerContainer(_module)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReserved1 {
        void onReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTypeModuleClass.OnReserved1 toOnReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnReserved1 in) {
        JnaTypeModuleClass.OnReserved1 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onReserved1(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReserved2 {
        void onReserved2(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTypeModuleClass.OnReserved2 toOnReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnReserved2 in) {
        JnaTypeModuleClass.OnReserved2 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onReserved2(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReserved3 {
        void onReserved3(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTypeModuleClass.OnReserved3 toOnReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnReserved3 in) {
        JnaTypeModuleClass.OnReserved3 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onReserved3(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReserved4 {
        void onReserved4(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTypeModuleClass.OnReserved4 toOnReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnReserved4 in) {
        JnaTypeModuleClass.OnReserved4 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onReserved4(__callback);
            __callback.register(out);
        }
        return out;
    }

    public TypeModuleClass(PointerContainer pointer) {
        super(pointer);
    }

    public TypeModuleClass() {
        super(cast(JnaTypeModuleClass.allocateStructure()));
    }

    private JnaTypeModuleClass.Fields _fields;
    
    JnaTypeModuleClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTypeModuleClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the parent class
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnLoad#onLoad}
    */
    public static final String LOAD = "load";

    /**
     * 
     * <br>See {@link OnLoad#onLoad}
    */
    public void setFieldLoad(OnLoad load) {
        toFields().load = toOnLoad(this, LOAD, load);
        toFields().writeField(LOAD);
    }

    /**
     * 
     * <br>See {@link OnLoad#onLoad}
    */
    public JnaTypeModuleClass.OnLoad getFieldLoad() {
       toFields().readField(LOAD);
       return toFields().load;
    } 

    /**
     * 
     * <br>See {@link OnUnload#onUnload}
    */
    public static final String UNLOAD = "unload";

    /**
     * 
     * <br>See {@link OnUnload#onUnload}
    */
    public void setFieldUnload(OnUnload unload) {
        toFields().unload = toOnUnload(this, UNLOAD, unload);
        toFields().writeField(UNLOAD);
    }

    /**
     * 
     * <br>See {@link OnUnload#onUnload}
    */
    public JnaTypeModuleClass.OnUnload getFieldUnload() {
       toFields().readField(UNLOAD);
       return toFields().unload;
    } 

    /**
     * 
     * <br>See {@link OnReserved1#onReserved1}
    */
    public static final String RESERVED1 = "reserved1";

    /**
     * 
     * <br>See {@link OnReserved1#onReserved1}
    */
    public void setFieldReserved1(OnReserved1 reserved1) {
        toFields().reserved1 = toOnReserved1(this, RESERVED1, reserved1);
        toFields().writeField(RESERVED1);
    }

    /**
     * 
     * <br>See {@link OnReserved1#onReserved1}
    */
    public JnaTypeModuleClass.OnReserved1 getFieldReserved1() {
       toFields().readField(RESERVED1);
       return toFields().reserved1;
    } 

    /**
     * 
     * <br>See {@link OnReserved2#onReserved2}
    */
    public static final String RESERVED2 = "reserved2";

    /**
     * 
     * <br>See {@link OnReserved2#onReserved2}
    */
    public void setFieldReserved2(OnReserved2 reserved2) {
        toFields().reserved2 = toOnReserved2(this, RESERVED2, reserved2);
        toFields().writeField(RESERVED2);
    }

    /**
     * 
     * <br>See {@link OnReserved2#onReserved2}
    */
    public JnaTypeModuleClass.OnReserved2 getFieldReserved2() {
       toFields().readField(RESERVED2);
       return toFields().reserved2;
    } 

    /**
     * 
     * <br>See {@link OnReserved3#onReserved3}
    */
    public static final String RESERVED3 = "reserved3";

    /**
     * 
     * <br>See {@link OnReserved3#onReserved3}
    */
    public void setFieldReserved3(OnReserved3 reserved3) {
        toFields().reserved3 = toOnReserved3(this, RESERVED3, reserved3);
        toFields().writeField(RESERVED3);
    }

    /**
     * 
     * <br>See {@link OnReserved3#onReserved3}
    */
    public JnaTypeModuleClass.OnReserved3 getFieldReserved3() {
       toFields().readField(RESERVED3);
       return toFields().reserved3;
    } 

    /**
     * 
     * <br>See {@link OnReserved4#onReserved4}
    */
    public static final String RESERVED4 = "reserved4";

    /**
     * 
     * <br>See {@link OnReserved4#onReserved4}
    */
    public void setFieldReserved4(OnReserved4 reserved4) {
        toFields().reserved4 = toOnReserved4(this, RESERVED4, reserved4);
        toFields().writeField(RESERVED4);
    }

    /**
     * 
     * <br>See {@link OnReserved4#onReserved4}
    */
    public JnaTypeModuleClass.OnReserved4 getFieldReserved4() {
       toFields().readField(RESERVED4);
       return toFields().reserved4;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TypeModule.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TypeModule.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
