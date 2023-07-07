/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The virtual function table to implement for `GtkBuilderScope` implementations.
 * <br>Default implementations for each function do exist, but they usually just fail,
 * <br>so it is suggested that implementations implement all of them.
 * <p><a href="https://docs.gtk.org/gtk4/struct.BuilderScopeInterface.html">https://docs.gtk.org/gtk4/struct.BuilderScopeInterface.html</a></p>
*/
public class BuilderScopeInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BuilderScopeInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetTypeFromName {
        /**
         * 
         * @param self 
         * @param builder 
         * @param type_name 
         * @return 
        */
        long onGetTypeFromName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull BuilderScope self, @Nonnull Builder builder, @Nonnull ch.bailu.gtk.type.Str type_name);
    }
    
    private static JnaBuilderScopeInterface.OnGetTypeFromName toOnGetTypeFromName(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetTypeFromName in) {
        JnaBuilderScopeInterface.OnGetTypeFromName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _builder, _type_name) -> in.onGetTypeFromName(__callback, new BuilderScope(new PointerContainer(_self)), new Builder(new PointerContainer(_builder)), new ch.bailu.gtk.type.Str(new PointerContainer(_type_name)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetTypeFromFunction {
        /**
         * 
         * @param self 
         * @param builder 
         * @param function_name 
         * @return 
        */
        long onGetTypeFromFunction(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull BuilderScope self, @Nonnull Builder builder, @Nonnull ch.bailu.gtk.type.Str function_name);
    }
    
    private static JnaBuilderScopeInterface.OnGetTypeFromFunction toOnGetTypeFromFunction(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetTypeFromFunction in) {
        JnaBuilderScopeInterface.OnGetTypeFromFunction out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _builder, _function_name) -> in.onGetTypeFromFunction(__callback, new BuilderScope(new PointerContainer(_self)), new Builder(new PointerContainer(_builder)), new ch.bailu.gtk.type.Str(new PointerContainer(_function_name)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCreateClosure {
        /**
         * 
         * @param self 
         * @param builder 
         * @param function_name 
         * @param flags 
         * @param object 
         * @return 
        */
        ch.bailu.gtk.gobject.Closure onCreateClosure(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull BuilderScope self, @Nonnull Builder builder, @Nonnull ch.bailu.gtk.type.Str function_name, int flags, @Nonnull ch.bailu.gtk.gobject.Object object);
    }
    
    private static JnaBuilderScopeInterface.OnCreateClosure toOnCreateClosure(ch.bailu.gtk.type.Pointer instance, String methodName, OnCreateClosure in) {
        JnaBuilderScopeInterface.OnCreateClosure out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _builder, _function_name, _flags, _object, _error) -> in.onCreateClosure(__callback, new BuilderScope(new PointerContainer(_self)), new Builder(new PointerContainer(_builder)), new ch.bailu.gtk.type.Str(new PointerContainer(_function_name)), _flags, new ch.bailu.gtk.gobject.Object(new PointerContainer(_object))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public BuilderScopeInterface(PointerContainer pointer) {
        super(pointer);
    }

    public BuilderScopeInterface() {
        super(cast(JnaBuilderScopeInterface.allocateStructure()));
    }

    private JnaBuilderScopeInterface.Fields _fields;
    
    JnaBuilderScopeInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaBuilderScopeInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnGetTypeFromName#onGetTypeFromName}
    */
    public static final String GET_TYPE_FROM_NAME = "get_type_from_name";

    /**
     * 
     * <br>See {@link OnGetTypeFromName#onGetTypeFromName}
    */
    public void setFieldGetTypeFromName(OnGetTypeFromName get_type_from_name) {
        toFields().get_type_from_name = toOnGetTypeFromName(this, GET_TYPE_FROM_NAME, get_type_from_name);
        toFields().writeField(GET_TYPE_FROM_NAME);
    }

    /**
     * 
     * <br>See {@link OnGetTypeFromName#onGetTypeFromName}
    */
    public JnaBuilderScopeInterface.OnGetTypeFromName getFieldGetTypeFromName() {
       toFields().readField(GET_TYPE_FROM_NAME);
       return toFields().get_type_from_name;
    } 

    /**
     * 
     * <br>See {@link OnGetTypeFromFunction#onGetTypeFromFunction}
    */
    public static final String GET_TYPE_FROM_FUNCTION = "get_type_from_function";

    /**
     * 
     * <br>See {@link OnGetTypeFromFunction#onGetTypeFromFunction}
    */
    public void setFieldGetTypeFromFunction(OnGetTypeFromFunction get_type_from_function) {
        toFields().get_type_from_function = toOnGetTypeFromFunction(this, GET_TYPE_FROM_FUNCTION, get_type_from_function);
        toFields().writeField(GET_TYPE_FROM_FUNCTION);
    }

    /**
     * 
     * <br>See {@link OnGetTypeFromFunction#onGetTypeFromFunction}
    */
    public JnaBuilderScopeInterface.OnGetTypeFromFunction getFieldGetTypeFromFunction() {
       toFields().readField(GET_TYPE_FROM_FUNCTION);
       return toFields().get_type_from_function;
    } 

    /**
     * 
     * <br>See {@link OnCreateClosure#onCreateClosure}
    */
    public static final String CREATE_CLOSURE = "create_closure";

    /**
     * 
     * <br>See {@link OnCreateClosure#onCreateClosure}
    */
    public void setFieldCreateClosure(OnCreateClosure create_closure) {
        toFields().create_closure = toOnCreateClosure(this, CREATE_CLOSURE, create_closure);
        toFields().writeField(CREATE_CLOSURE);
    }

    /**
     * 
     * <br>See {@link OnCreateClosure#onCreateClosure}
    */
    public JnaBuilderScopeInterface.OnCreateClosure getFieldCreateClosure() {
       toFields().readField(CREATE_CLOSURE);
       return toFields().create_closure;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(BuilderScope.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(BuilderScope.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
