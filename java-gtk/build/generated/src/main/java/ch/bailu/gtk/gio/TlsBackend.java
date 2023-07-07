/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * TLS (Transport Layer Security, aka SSL) and DTLS backend.
 * <p><a href="https://docs.gtk.org/gio/iface.TlsBackend.html">https://docs.gtk.org/gio/iface.TlsBackend.html</a></p>
*/
public class TlsBackend extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsBackend.class.getCanonicalName());
    }

    public TlsBackend(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the &#35;GType of &#64;backend's &#35;GTlsCertificate implementation.
     * @return the &#35;GType of &#64;backend's &#35;GTlsCertificate   implementation.
    */
    public long getCertificateType()  {
        return JnaTlsBackend.INST().g_tls_backend_get_certificate_type(asCPointer());
    }

    /**
     * Gets the &#35;GType of &#64;backend's &#35;GTlsClientConnection implementation.
     * @return the &#35;GType of &#64;backend's &#35;GTlsClientConnection   implementation.
    */
    public long getClientConnectionType()  {
        return JnaTlsBackend.INST().g_tls_backend_get_client_connection_type(asCPointer());
    }

    /**
     * Gets the default &#35;GTlsDatabase used to verify TLS connections.
     * @return the default database, which should be               unreffed when done.
    */
    public TlsDatabase getDefaultDatabase()  {
        return new TlsDatabase(new PointerContainer(JnaTlsBackend.INST().g_tls_backend_get_default_database(asCPointer())));
    }

    /**
     * Gets the &#35;GType of &#64;backend’s &#35;GDtlsClientConnection implementation.
     * @return the &#35;GType of &#64;backend’s &#35;GDtlsClientConnection   implementation, or %G_TYPE_INVALID if this backend doesn’t support DTLS.
    */
    public long getDtlsClientConnectionType()  {
        return JnaTlsBackend.INST().g_tls_backend_get_dtls_client_connection_type(asCPointer());
    }

    /**
     * Gets the &#35;GType of &#64;backend’s &#35;GDtlsServerConnection implementation.
     * @return the &#35;GType of &#64;backend’s &#35;GDtlsServerConnection   implementation, or %G_TYPE_INVALID if this backend doesn’t support DTLS.
    */
    public long getDtlsServerConnectionType()  {
        return JnaTlsBackend.INST().g_tls_backend_get_dtls_server_connection_type(asCPointer());
    }

    /**
     * Gets the &#35;GType of &#64;backend's &#35;GTlsFileDatabase implementation.
     * @return the &#35;GType of backend's &#35;GTlsFileDatabase implementation.
    */
    public long getFileDatabaseType()  {
        return JnaTlsBackend.INST().g_tls_backend_get_file_database_type(asCPointer());
    }

    /**
     * Gets the &#35;GType of &#64;backend's &#35;GTlsServerConnection implementation.
     * @return the &#35;GType of &#64;backend's &#35;GTlsServerConnection   implementation.
    */
    public long getServerConnectionType()  {
        return JnaTlsBackend.INST().g_tls_backend_get_server_connection_type(asCPointer());
    }

    /**
     * Set the default &#35;GTlsDatabase used to verify TLS connections
     * <br>
     * <br>Any subsequent call to g_tls_backend_get_default_database() will return
     * <br>the database set in this call.  Existing databases and connections are not
     * <br>modified.
     * <br>
     * <br>Setting a %NULL default database will reset to using the system default
     * <br>database as if g_tls_backend_set_default_database() had never been called.
     * @param database the &#35;GTlsDatabase
    */
    public void setDefaultDatabase(@Nullable TlsDatabase database)  {
        JnaTlsBackend.INST().g_tls_backend_set_default_database(asCPointer(), asCPointer(database));
    }

    /**
     * Checks if DTLS is supported. DTLS support may not be available even if TLS
     * <br>support is available, and vice-versa.
     * @return whether DTLS is supported
    */
    public boolean supportsDtls()  {
        return JnaTlsBackend.INST().g_tls_backend_supports_dtls(asCPointer());
    }

    /**
     * Checks if TLS is supported; if this returns %FALSE for the default
     * <br>&#35;GTlsBackend, it means no &quot;real&quot; TLS backend is available.
     * @return whether or not TLS is supported
    */
    public boolean supportsTls()  {
        return JnaTlsBackend.INST().g_tls_backend_supports_tls(asCPointer());
    }

    /**
     * Gets the default &#35;GTlsBackend for the system.
     * @return a &#35;GTlsBackend, which will be a     dummy object if no TLS backend is available
    */
    public static TlsBackend getDefault()  {
        return new TlsBackend(new PointerContainer(JnaTlsBackend.INST().g_tls_backend_get_default()));
    }

    public static long getTypeID() { 
        return JnaTlsBackend.INST().g_tls_backend_get_type(); 
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
interface-type
*/
