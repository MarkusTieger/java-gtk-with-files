/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GError` structure contains information about
 * <br>an error that has occurred.
 * <p><a href="https://docs.gtk.org/glib/struct.Error.html">https://docs.gtk.org/glib/struct.Error.html</a></p>
*/
public class Error extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Error.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnErrorInitFunc {
        /**
         * Specifies the type of function which is called just after an
         * <br>extended error instance is created and its fields filled. It should
         * <br>only initialize the fields in the private data, which can be
         * <br>received with the generated `*_get_private()` function.
         * <br>
         * <br>Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
         * <br>already takes care of getting the private data from &#64;error.
         * @param error extended error
        */
        void onErrorInitFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Error error);
    }
    
    private static JnaError.OnErrorInitFunc toOnErrorInitFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnErrorInitFunc in) {
        JnaError.OnErrorInitFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_error) -> in.onErrorInitFunc(__callback, new Error(new PointerContainer(_error)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnErrorCopyFunc {
        /**
         * Specifies the type of function which is called when an extended
         * <br>error instance is copied. It is passed the pointer to the
         * <br>destination error and source error, and should copy only the fields
         * <br>of the private data from &#64;src_error to &#64;dest_error.
         * <br>
         * <br>Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
         * <br>already takes care of getting the private data from &#64;src_error and
         * <br>&#64;dest_error.
         * @param src_error source extended error
         * @param dest_error destination extended error
        */
        void onErrorCopyFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Error src_error, @Nonnull Error dest_error);
    }
    
    private static JnaError.OnErrorCopyFunc toOnErrorCopyFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnErrorCopyFunc in) {
        JnaError.OnErrorCopyFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_src_error, _dest_error) -> in.onErrorCopyFunc(__callback, new Error(new PointerContainer(_src_error)), new Error(new PointerContainer(_dest_error)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnErrorClearFunc {
        /**
         * Specifies the type of function which is called when an extended
         * <br>error instance is freed. It is passed the error pointer about to be
         * <br>freed, and should free the error's private data fields.
         * <br>
         * <br>Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
         * <br>already takes care of getting the private data from &#64;error.
         * @param error extended error to clear
        */
        void onErrorClearFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Error error);
    }
    
    private static JnaError.OnErrorClearFunc toOnErrorClearFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnErrorClearFunc in) {
        JnaError.OnErrorClearFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_error) -> in.onErrorClearFunc(__callback, new Error(new PointerContainer(_error)));
            __callback.register(out);
        }
        return out;
    }

    public Error(PointerContainer pointer) {
        super(pointer);
    }

    public Error() {
        super(cast(JnaError.allocateStructure()));
    }

    private JnaError.Fields _fields;
    
    JnaError.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaError.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * error domain, e.g. %G_FILE_ERROR
    */
    public static final String DOMAIN = "domain";

    /**
     * error domain, e.g. %G_FILE_ERROR
    */
    public void setFieldDomain(int domain) {
        toFields().domain = domain;
        toFields().writeField(DOMAIN);
    }

    /**
     * error domain, e.g. %G_FILE_ERROR
    */
    public int getFieldDomain() {
       toFields().readField(DOMAIN);
       return toFields().domain;
    } 

    /**
     * error code, e.g. %G_FILE_ERROR_NOENT
    */
    public static final String CODE = "code";

    /**
     * error code, e.g. %G_FILE_ERROR_NOENT
    */
    public void setFieldCode(int code) {
        toFields().code = code;
        toFields().writeField(CODE);
    }

    /**
     * error code, e.g. %G_FILE_ERROR_NOENT
    */
    public int getFieldCode() {
       toFields().readField(CODE);
       return toFields().code;
    } 

    /**
     * human-readable informative error message
    */
    public static final String MESSAGE = "message";

    /**
     * human-readable informative error message
    */
    public void setFieldMessage(ch.bailu.gtk.type.Str message) {
        toFields().message = message.asCPointer();
        toFields().writeField(MESSAGE);
    }

    /**
     * human-readable informative error message
    */
    public ch.bailu.gtk.type.Str getFieldMessage() {
       toFields().readField(MESSAGE);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().message));
    } 

    /**
     * Creates a new &#35;GError; unlike g_error_new(), &#64;message is
     * <br>not a printf()-style format string. Use this function if
     * <br>&#64;message contains text you don't have control over,
     * <br>that could include printf() escape sequences.
     * @param domain error domain
     * @param code error code
     * @param message error message
     * @return a new &#35;GError
    */
    public static Error newLiteralError(int domain, int code, @Nonnull ch.bailu.gtk.type.Str message)  {
        PointerContainer __self = cast(JnaError.INST().g_error_new_literal(domain, code, asCPointerNotNull(message)));
        if (__self.isNull()) {
            throw new NullPointerException("Error:newLiteral");
        }
        return new Error(__self);
    }        
    

    /**
     * Creates a new &#35;GError; unlike g_error_new(), &#64;message is
     * <br>not a printf()-style format string. Use this function if
     * <br>&#64;message contains text you don't have control over,
     * <br>that could include printf() escape sequences.
     * @param domain error domain
     * @param code error code
     * @param message error message
     * @return a new &#35;GError
    */
    public static Error newLiteralError(int domain, int code, String message)  {
        PointerContainer __self = cast(JnaError.INST().g_error_new_literal(domain, code, message));
        if (__self.isNull()) {
            throw new NullPointerException("Error:newLiteral");
        }
        return new Error(__self);
    }        
    

    /**
     * Creates a new &#35;GError with the given &#64;domain and &#64;code,
     * <br>and a message formatted with &#64;format.
     * @param domain error domain
     * @param code error code
     * @param format printf()-style format for error message
     * @param _elipse parameters for message format
    */
    public Error(int domain, int code, @Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse) {
        super(cast(JnaError.INST().g_error_new(domain, code, asCPointerNotNull(format), _elipse)));
    }

    /**
     * Creates a new &#35;GError with the given &#64;domain and &#64;code,
     * <br>and a message formatted with &#64;format.
     * @param domain error domain
     * @param code error code
     * @param format printf()-style format for error message
     * @param _elipse parameters for message format
    */
    public Error(int domain, int code, String format, java.lang.Object... _elipse) {
        super(cast(JnaError.INST().g_error_new(domain, code, format, _elipse)));
    }

    /**
     * Makes a copy of &#64;error.
     * @return a new &#35;GError
    */
    public Error copy()  {
        return new Error(new PointerContainer(JnaError.INST().g_error_copy(asCPointer())));
    }

    /**
     * Frees a &#35;GError and associated resources.
    */
    public void free()  {
        JnaError.INST().g_error_free(asCPointer());
    }

    /**
     * Returns %TRUE if &#64;error matches &#64;domain and &#64;code, %FALSE
     * <br>otherwise. In particular, when &#64;error is %NULL, %FALSE will
     * <br>be returned.
     * <br>
     * <br>If &#64;domain contains a `FAILED` (or otherwise generic) error code,
     * <br>you should generally not check for it explicitly, but should
     * <br>instead treat any not-explicitly-recognized error code as being
     * <br>equivalent to the `FAILED` code. This way, if the domain is
     * <br>extended in the future to provide a more specific error code for
     * <br>a certain case, your code will still work.
     * @param domain an error domain
     * @param code an error code
     * @return whether &#64;error has &#64;domain and &#64;code
    */
    public boolean matches(int domain, int code)  {
        return JnaError.INST().g_error_matches(asCPointer(), domain, code);
    }

    /**
     * This function registers an extended &#35;GError domain.
     * <br>&#64;error_type_name will be duplicated. Otherwise does the same as
     * <br>g_error_domain_register_static().
     * @param error_type_name string to create a &#35;GQuark from
     * @param error_type_private_size size of the private error data in bytes
     * @param error_type_init function initializing fields of the private error data
     * @param error_type_copy function copying fields of the private error data
     * @param error_type_clear function freeing fields of the private error data
     * @return &#35;GQuark representing the error domain
    */
    public static int domainRegister(@Nonnull ch.bailu.gtk.type.Str error_type_name, long error_type_private_size, OnErrorInitFunc error_type_init, OnErrorCopyFunc error_type_copy, OnErrorClearFunc error_type_clear)  {
        return JnaError.INST().g_error_domain_register(asCPointerNotNull(error_type_name), error_type_private_size, toOnErrorInitFunc(getClassHandler().getInstance(), "domainRegister", error_type_init), toOnErrorCopyFunc(getClassHandler().getInstance(), "domainRegister", error_type_copy), toOnErrorClearFunc(getClassHandler().getInstance(), "domainRegister", error_type_clear));
    }

    /**
     * This function registers an extended &#35;GError domain.
     * <br>
     * <br>&#64;error_type_name should not be freed. &#64;error_type_private_size must
     * <br>be greater than 0.
     * <br>
     * <br>&#64;error_type_init receives an initialized &#35;GError and should then initialize
     * <br>the private data.
     * <br>
     * <br>&#64;error_type_copy is a function that receives both original and a copy
     * <br>&#35;GError and should copy the fields of the private error data. The standard
     * <br>&#35;GError fields are already handled.
     * <br>
     * <br>&#64;error_type_clear receives the pointer to the error, and it should free the
     * <br>fields of the private error data. It should not free the struct itself though.
     * <br>
     * <br>Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
     * <br>already takes care of passing valid information to this function.
     * @param error_type_name static string to create a &#35;GQuark from
     * @param error_type_private_size size of the private error data in bytes
     * @param error_type_init function initializing fields of the private error data
     * @param error_type_copy function copying fields of the private error data
     * @param error_type_clear function freeing fields of the private error data
     * @return &#35;GQuark representing the error domain
    */
    public static int domainRegisterStatic(@Nonnull ch.bailu.gtk.type.Str error_type_name, long error_type_private_size, OnErrorInitFunc error_type_init, OnErrorCopyFunc error_type_copy, OnErrorClearFunc error_type_clear)  {
        return JnaError.INST().g_error_domain_register_static(asCPointerNotNull(error_type_name), error_type_private_size, toOnErrorInitFunc(getClassHandler().getInstance(), "domainRegisterStatic", error_type_init), toOnErrorCopyFunc(getClassHandler().getInstance(), "domainRegisterStatic", error_type_copy), toOnErrorClearFunc(getClassHandler().getInstance(), "domainRegisterStatic", error_type_clear));
    }

    public static long getTypeID() { 
        return JnaError.INST().g_error_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
record-type
all-fields-supported

[MethodModel:java-type-not-supported:newValist:[ParameterModel:Supported:{Gg:Error:{c:GError*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
*/
