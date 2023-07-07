/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Holds a password used in TLS.
 * <p><a href="https://docs.gtk.org/gio/class.TlsPassword.html">https://docs.gtk.org/gio/class.TlsPassword.html</a></p>
*/
public class TlsPassword extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsPassword.class.getCanonicalName());
    }

    public TlsPassword(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a new &#35;GTlsPassword object.
     * @param flags the password flags
     * @param description description of what the password is for
    */
    public TlsPassword(int flags, @Nonnull ch.bailu.gtk.type.Str description) {
        super(cast(JnaTlsPassword.INST().g_tls_password_new(flags, asCPointerNotNull(description))));
    }

    /**
     * Create a new &#35;GTlsPassword object.
     * @param flags the password flags
     * @param description description of what the password is for
    */
    public TlsPassword(int flags, String description) {
        super(cast(JnaTlsPassword.INST().g_tls_password_new(flags, description)));
    }

    /**
     * Get a description string about what the password will be used for.
     * @return The description of the password.
    */
    public ch.bailu.gtk.type.Str getDescription()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTlsPassword.INST().g_tls_password_get_description(asCPointer())));
    }

    /**
     * Get flags about the password.
     * @return The flags about the password.
    */
    public int getFlags()  {
        return JnaTlsPassword.INST().g_tls_password_get_flags(asCPointer());
    }

    /**
     * Get a user readable translated warning. Usually this warning is a
     * <br>representation of the password flags returned from
     * <br>g_tls_password_get_flags().
     * @return The warning.
    */
    public ch.bailu.gtk.type.Str getWarning()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTlsPassword.INST().g_tls_password_get_warning(asCPointer())));
    }

    /**
     * Set a description string about what the password will be used for.
     * @param description The description of the password
    */
    public void setDescription(@Nonnull ch.bailu.gtk.type.Str description)  {
        JnaTlsPassword.INST().g_tls_password_set_description(asCPointer(), asCPointerNotNull(description));
    }

    /**
     * Set a description string about what the password will be used for.
     * @param description The description of the password
    */
    public void setDescription(String description)  {
        JnaTlsPassword.INST().g_tls_password_set_description(asCPointer(), description);
    }

    /**
     * Set flags about the password.
     * @param flags The flags about the password
    */
    public void setFlags(int flags)  {
        JnaTlsPassword.INST().g_tls_password_set_flags(asCPointer(), flags);
    }

    /**
     * Set a user readable translated warning. Usually this warning is a
     * <br>representation of the password flags returned from
     * <br>g_tls_password_get_flags().
     * @param warning The user readable warning
    */
    public void setWarning(@Nonnull ch.bailu.gtk.type.Str warning)  {
        JnaTlsPassword.INST().g_tls_password_set_warning(asCPointer(), asCPointerNotNull(warning));
    }

    /**
     * Set a user readable translated warning. Usually this warning is a
     * <br>representation of the password flags returned from
     * <br>g_tls_password_get_flags().
     * @param warning The user readable warning
    */
    public void setWarning(String warning)  {
        JnaTlsPassword.INST().g_tls_password_set_warning(asCPointer(), warning);
    }

    public static long getTypeID() { 
        return JnaTlsPassword.INST().g_tls_password_get_type(); 
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
class-type

[MethodModel:cb-return-value-not-supported:getValue:[ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:setValue:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]

[MethodModel:java-type-not-supported:setValueFull:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
*/
