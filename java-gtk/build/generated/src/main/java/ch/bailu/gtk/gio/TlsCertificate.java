/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A certificate used for TLS authentication and encryption.
 * <br>This can represent either a certificate only (eg, the certificate
 * <br>received by a client from a server), or the combination of
 * <br>a certificate and a private key (which is needed when acting as a
 * <br>&#35;GTlsServerConnection).
 * <p><a href="https://docs.gtk.org/gio/class.TlsCertificate.html">https://docs.gtk.org/gio/class.TlsCertificate.html</a></p>
*/
public class TlsCertificate extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsCertificate.class.getCanonicalName());
    }

    public TlsCertificate(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a &#35;GTlsCertificate from the data in &#64;file.
     * <br>
     * <br>As of 2.72, if the filename ends in `.p12` or `.pfx` the data is loaded by
     * <br>g_tls_certificate_new_from_pkcs12() otherwise it is loaded by
     * <br>g_tls_certificate_new_from_pem(). See those functions for
     * <br>exact details.
     * <br>
     * <br>If &#64;file cannot be read or parsed, the function will return %NULL and
     * <br>set &#64;error.
     * @param file file containing a certificate to import
     * @return the new certificate, or %NULL on error
    */
    public static TlsCertificate newFromFileTlsCertificate(@Nonnull ch.bailu.gtk.type.Str file) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTlsCertificate.INST().g_tls_certificate_new_from_file(asCPointerNotNull(file), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("TlsCertificate:newFromFile");
        }
        return new TlsCertificate(__self);
    }        
    

    /**
     * Creates a &#35;GTlsCertificate from the data in &#64;file.
     * <br>
     * <br>As of 2.72, if the filename ends in `.p12` or `.pfx` the data is loaded by
     * <br>g_tls_certificate_new_from_pkcs12() otherwise it is loaded by
     * <br>g_tls_certificate_new_from_pem(). See those functions for
     * <br>exact details.
     * <br>
     * <br>If &#64;file cannot be read or parsed, the function will return %NULL and
     * <br>set &#64;error.
     * @param file file containing a certificate to import
     * @return the new certificate, or %NULL on error
    */
    public static TlsCertificate newFromFileTlsCertificate(String file) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTlsCertificate.INST().g_tls_certificate_new_from_file(file, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("TlsCertificate:newFromFile");
        }
        return new TlsCertificate(__self);
    }        
    

    /**
     * Creates a &#35;GTlsCertificate from the data in &#64;file.
     * <br>
     * <br>If &#64;file cannot be read or parsed, the function will return %NULL and
     * <br>set &#64;error.
     * <br>
     * <br>Any unknown file types will error with %G_IO_ERROR_NOT_SUPPORTED.
     * <br>Currently only `.p12` and `.pfx` files are supported.
     * <br>See g_tls_certificate_new_from_pkcs12() for more details.
     * @param file file containing a certificate to import
     * @param password password for PKCS &#35;12 files
     * @return the new certificate, or %NULL on error
    */
    public static TlsCertificate newFromFileWithPasswordTlsCertificate(@Nonnull ch.bailu.gtk.type.Str file, @Nonnull ch.bailu.gtk.type.Str password) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTlsCertificate.INST().g_tls_certificate_new_from_file_with_password(asCPointerNotNull(file), asCPointerNotNull(password), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("TlsCertificate:newFromFileWithPassword");
        }
        return new TlsCertificate(__self);
    }        
    

    /**
     * Creates a &#35;GTlsCertificate from the data in &#64;file.
     * <br>
     * <br>If &#64;file cannot be read or parsed, the function will return %NULL and
     * <br>set &#64;error.
     * <br>
     * <br>Any unknown file types will error with %G_IO_ERROR_NOT_SUPPORTED.
     * <br>Currently only `.p12` and `.pfx` files are supported.
     * <br>See g_tls_certificate_new_from_pkcs12() for more details.
     * @param file file containing a certificate to import
     * @param password password for PKCS &#35;12 files
     * @return the new certificate, or %NULL on error
    */
    public static TlsCertificate newFromFileWithPasswordTlsCertificate(String file, String password) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTlsCertificate.INST().g_tls_certificate_new_from_file_with_password(file, password, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("TlsCertificate:newFromFileWithPassword");
        }
        return new TlsCertificate(__self);
    }        
    

    /**
     * Creates a &#35;GTlsCertificate from the PEM-encoded data in &#64;cert_file
     * <br>and &#64;key_file. The returned certificate will be the first certificate
     * <br>found in &#64;cert_file. As of GLib 2.44, if &#64;cert_file contains more
     * <br>certificates it will try to load a certificate chain. All
     * <br>certificates will be verified in the order found (top-level
     * <br>certificate should be the last one in the file) and the
     * <br>&#35;GTlsCertificate:issuer property of each certificate will be set
     * <br>accordingly if the verification succeeds. If any certificate in the
     * <br>chain cannot be verified, the first certificate in the file will
     * <br>still be returned.
     * <br>
     * <br>If either file cannot be read or parsed, the function will return
     * <br>%NULL and set &#64;error. Otherwise, this behaves like
     * <br>g_tls_certificate_new_from_pem().
     * @param cert_file file containing one or more PEM-encoded     certificates to import
     * @param key_file file containing a PEM-encoded private key     to import
     * @return the new certificate, or %NULL on error
    */
    public static TlsCertificate newFromFilesTlsCertificate(@Nonnull ch.bailu.gtk.type.Str cert_file, @Nonnull ch.bailu.gtk.type.Str key_file) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTlsCertificate.INST().g_tls_certificate_new_from_files(asCPointerNotNull(cert_file), asCPointerNotNull(key_file), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("TlsCertificate:newFromFiles");
        }
        return new TlsCertificate(__self);
    }        
    

    /**
     * Creates a &#35;GTlsCertificate from the PEM-encoded data in &#64;cert_file
     * <br>and &#64;key_file. The returned certificate will be the first certificate
     * <br>found in &#64;cert_file. As of GLib 2.44, if &#64;cert_file contains more
     * <br>certificates it will try to load a certificate chain. All
     * <br>certificates will be verified in the order found (top-level
     * <br>certificate should be the last one in the file) and the
     * <br>&#35;GTlsCertificate:issuer property of each certificate will be set
     * <br>accordingly if the verification succeeds. If any certificate in the
     * <br>chain cannot be verified, the first certificate in the file will
     * <br>still be returned.
     * <br>
     * <br>If either file cannot be read or parsed, the function will return
     * <br>%NULL and set &#64;error. Otherwise, this behaves like
     * <br>g_tls_certificate_new_from_pem().
     * @param cert_file file containing one or more PEM-encoded     certificates to import
     * @param key_file file containing a PEM-encoded private key     to import
     * @return the new certificate, or %NULL on error
    */
    public static TlsCertificate newFromFilesTlsCertificate(String cert_file, String key_file) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTlsCertificate.INST().g_tls_certificate_new_from_files(cert_file, key_file, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("TlsCertificate:newFromFiles");
        }
        return new TlsCertificate(__self);
    }        
    

    /**
     * Creates a &#35;GTlsCertificate from the PEM-encoded data in &#64;data. If
     * <br>&#64;data includes both a certificate and a private key, then the
     * <br>returned certificate will include the private key data as well. (See
     * <br>the &#35;GTlsCertificate:private-key-pem property for information about
     * <br>supported formats.)
     * <br>
     * <br>The returned certificate will be the first certificate found in
     * <br>&#64;data. As of GLib 2.44, if &#64;data contains more certificates it will
     * <br>try to load a certificate chain. All certificates will be verified in
     * <br>the order found (top-level certificate should be the last one in the
     * <br>file) and the &#35;GTlsCertificate:issuer property of each certificate
     * <br>will be set accordingly if the verification succeeds. If any
     * <br>certificate in the chain cannot be verified, the first certificate in
     * <br>the file will still be returned.
     * @param data PEM-encoded certificate data
     * @param length the length of &#64;data, or -1 if it's 0-terminated.
     * @return the new certificate, or %NULL if &#64;data is invalid
    */
    public static TlsCertificate newFromPemTlsCertificate(@Nonnull ch.bailu.gtk.type.Str data, long length) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTlsCertificate.INST().g_tls_certificate_new_from_pem(asCPointerNotNull(data), length, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("TlsCertificate:newFromPem");
        }
        return new TlsCertificate(__self);
    }        
    

    /**
     * Creates a &#35;GTlsCertificate from the PEM-encoded data in &#64;data. If
     * <br>&#64;data includes both a certificate and a private key, then the
     * <br>returned certificate will include the private key data as well. (See
     * <br>the &#35;GTlsCertificate:private-key-pem property for information about
     * <br>supported formats.)
     * <br>
     * <br>The returned certificate will be the first certificate found in
     * <br>&#64;data. As of GLib 2.44, if &#64;data contains more certificates it will
     * <br>try to load a certificate chain. All certificates will be verified in
     * <br>the order found (top-level certificate should be the last one in the
     * <br>file) and the &#35;GTlsCertificate:issuer property of each certificate
     * <br>will be set accordingly if the verification succeeds. If any
     * <br>certificate in the chain cannot be verified, the first certificate in
     * <br>the file will still be returned.
     * @param data PEM-encoded certificate data
     * @param length the length of &#64;data, or -1 if it's 0-terminated.
     * @return the new certificate, or %NULL if &#64;data is invalid
    */
    public static TlsCertificate newFromPemTlsCertificate(String data, long length) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTlsCertificate.INST().g_tls_certificate_new_from_pem(data, length, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("TlsCertificate:newFromPem");
        }
        return new TlsCertificate(__self);
    }        
    

    /**
     * Creates a &#35;GTlsCertificate from a
     * <br>[PKCS &#92;&#35;11](https://docs.oasis-open.org/pkcs11/pkcs11-base/v3.0/os/pkcs11-base-v3.0-os.html) URI.
     * <br>
     * <br>An example &#64;pkcs11_uri would be `pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01`
     * <br>
     * <br>Where the token’s layout is:
     * <br>
     * <pre>
     * Object 0:
     *   URL: pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01;object=private%20key;type=private
     *   Type: Private key (RSA-2048)
     *   ID: 01
     * 
     * Object 1:
     *   URL: pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01;object=Certificate%20for%20Authentication;type=cert
     *   Type: X.509 Certificate (RSA-2048)
     *   ID: 01
     * </pre>
     * <br>
     * <br>In this case the certificate and private key would both be detected and used as expected.
     * <br>&#64;pkcs_uri may also just reference an X.509 certificate object and then optionally
     * <br>&#64;private_key_pkcs11_uri allows using a private key exposed under a different URI.
     * <br>
     * <br>Note that the private key is not accessed until usage and may fail or require a PIN later.
     * @param pkcs11_uri A PKCS &#92;&#35;11 URI
     * @param private_key_pkcs11_uri A PKCS &#92;&#35;11 URI
     * @return the new certificate, or %NULL on error
    */
    public static TlsCertificate newFromPkcs11UrisTlsCertificate(@Nonnull ch.bailu.gtk.type.Str pkcs11_uri, @Nullable ch.bailu.gtk.type.Str private_key_pkcs11_uri) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTlsCertificate.INST().g_tls_certificate_new_from_pkcs11_uris(asCPointerNotNull(pkcs11_uri), asCPointer(private_key_pkcs11_uri), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("TlsCertificate:newFromPkcs11Uris");
        }
        return new TlsCertificate(__self);
    }        
    

    /**
     * Creates a &#35;GTlsCertificate from a
     * <br>[PKCS &#92;&#35;11](https://docs.oasis-open.org/pkcs11/pkcs11-base/v3.0/os/pkcs11-base-v3.0-os.html) URI.
     * <br>
     * <br>An example &#64;pkcs11_uri would be `pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01`
     * <br>
     * <br>Where the token’s layout is:
     * <br>
     * <pre>
     * Object 0:
     *   URL: pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01;object=private%20key;type=private
     *   Type: Private key (RSA-2048)
     *   ID: 01
     * 
     * Object 1:
     *   URL: pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01;object=Certificate%20for%20Authentication;type=cert
     *   Type: X.509 Certificate (RSA-2048)
     *   ID: 01
     * </pre>
     * <br>
     * <br>In this case the certificate and private key would both be detected and used as expected.
     * <br>&#64;pkcs_uri may also just reference an X.509 certificate object and then optionally
     * <br>&#64;private_key_pkcs11_uri allows using a private key exposed under a different URI.
     * <br>
     * <br>Note that the private key is not accessed until usage and may fail or require a PIN later.
     * @param pkcs11_uri A PKCS &#92;&#35;11 URI
     * @param private_key_pkcs11_uri A PKCS &#92;&#35;11 URI
     * @return the new certificate, or %NULL on error
    */
    public static TlsCertificate newFromPkcs11UrisTlsCertificate(String pkcs11_uri, String private_key_pkcs11_uri) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTlsCertificate.INST().g_tls_certificate_new_from_pkcs11_uris(pkcs11_uri, private_key_pkcs11_uri, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("TlsCertificate:newFromPkcs11Uris");
        }
        return new TlsCertificate(__self);
    }        
    

    /**
     * Gets the value of &#35;GTlsCertificate:dns-names.
     * @return A &#35;GPtrArray of &#35;GBytes elements, or %NULL if it's not available.
    */
    public ch.bailu.gtk.glib.PtrArray getDnsNames()  {
        return new ch.bailu.gtk.glib.PtrArray(new PointerContainer(JnaTlsCertificate.INST().g_tls_certificate_get_dns_names(asCPointer())));
    }

    /**
     * Gets the value of &#35;GTlsCertificate:ip-addresses.
     * @return A &#35;GPtrArray of &#35;GInetAddress elements, or %NULL if it's not available.
    */
    public ch.bailu.gtk.glib.PtrArray getIpAddresses()  {
        return new ch.bailu.gtk.glib.PtrArray(new PointerContainer(JnaTlsCertificate.INST().g_tls_certificate_get_ip_addresses(asCPointer())));
    }

    /**
     * Gets the &#35;GTlsCertificate representing &#64;cert's issuer, if known
     * @return The certificate of &#64;cert's issuer, or %NULL if &#64;cert is self-signed or signed with an unknown certificate.
    */
    public TlsCertificate getIssuer()  {
        return new TlsCertificate(new PointerContainer(JnaTlsCertificate.INST().g_tls_certificate_get_issuer(asCPointer())));
    }

    /**
     * Returns the issuer name from the certificate.
     * @return The issuer name, or %NULL if it's not available.
    */
    public ch.bailu.gtk.type.Str getIssuerName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTlsCertificate.INST().g_tls_certificate_get_issuer_name(asCPointer())));
    }

    /**
     * Returns the time at which the certificate became or will become invalid.
     * @return The not-valid-after date, or %NULL if it's not available.
    */
    public ch.bailu.gtk.glib.DateTime getNotValidAfter()  {
        return new ch.bailu.gtk.glib.DateTime(new PointerContainer(JnaTlsCertificate.INST().g_tls_certificate_get_not_valid_after(asCPointer())));
    }

    /**
     * Returns the time at which the certificate became or will become valid.
     * @return The not-valid-before date, or %NULL if it's not available.
    */
    public ch.bailu.gtk.glib.DateTime getNotValidBefore()  {
        return new ch.bailu.gtk.glib.DateTime(new PointerContainer(JnaTlsCertificate.INST().g_tls_certificate_get_not_valid_before(asCPointer())));
    }

    /**
     * Returns the subject name from the certificate.
     * @return The subject name, or %NULL if it's not available.
    */
    public ch.bailu.gtk.type.Str getSubjectName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTlsCertificate.INST().g_tls_certificate_get_subject_name(asCPointer())));
    }

    /**
     * Check if two &#35;GTlsCertificate objects represent the same certificate.
     * <br>The raw DER byte data of the two certificates are checked for equality.
     * <br>This has the effect that two certificates may compare equal even if
     * <br>their &#35;GTlsCertificate:issuer, &#35;GTlsCertificate:private-key, or
     * <br>&#35;GTlsCertificate:private-key-pem properties differ.
     * @param cert_two second certificate to compare
     * @return whether the same or not
    */
    public boolean isSame(@Nonnull TlsCertificate cert_two)  {
        return JnaTlsCertificate.INST().g_tls_certificate_is_same(asCPointer(), asCPointerNotNull(cert_two));
    }

    /**
     * This verifies &#64;cert and returns a set of &#35;GTlsCertificateFlags
     * <br>indicating any problems found with it. This can be used to verify a
     * <br>certificate outside the context of making a connection, or to
     * <br>check a certificate against a CA that is not part of the system
     * <br>CA database.
     * <br>
     * <br>If &#64;cert is valid, %G_TLS_CERTIFICATE_NO_FLAGS is returned.
     * <br>
     * <br>If &#64;identity is not %NULL, &#64;cert's name(s) will be compared against
     * <br>it, and %G_TLS_CERTIFICATE_BAD_IDENTITY will be set in the return
     * <br>value if it does not match. If &#64;identity is %NULL, that bit will
     * <br>never be set in the return value.
     * <br>
     * <br>If &#64;trusted_ca is not %NULL, then &#64;cert (or one of the certificates
     * <br>in its chain) must be signed by it, or else
     * <br>%G_TLS_CERTIFICATE_UNKNOWN_CA will be set in the return value. If
     * <br>&#64;trusted_ca is %NULL, that bit will never be set in the return
     * <br>value.
     * <br>
     * <br>GLib guarantees that if certificate verification fails, at least one
     * <br>error will be set in the return value, but it does not guarantee
     * <br>that all possible errors will be set. Accordingly, you may not safely
     * <br>decide to ignore any particular type of error. For example, it would
     * <br>be incorrect to mask %G_TLS_CERTIFICATE_EXPIRED if you want to allow
     * <br>expired certificates, because this could potentially be the only
     * <br>error flag set even if other problems exist with the certificate.
     * <br>
     * <br>Because TLS session context is not used, &#35;GTlsCertificate may not
     * <br>perform as many checks on the certificates as &#35;GTlsConnection would.
     * <br>For example, certificate constraints may not be honored, and
     * <br>revocation checks may not be performed. The best way to verify TLS
     * <br>certificates used by a TLS connection is to let &#35;GTlsConnection
     * <br>handle the verification.
     * @param identity the expected peer identity
     * @param trusted_ca the certificate of a trusted authority
     * @return the appropriate &#35;GTlsCertificateFlags
    */
    public int verify(@Nullable SocketConnectable identity, @Nullable TlsCertificate trusted_ca)  {
        return JnaTlsCertificate.INST().g_tls_certificate_verify(asCPointer(), asCPointer(identity), asCPointer(trusted_ca));
    }

    /**
     * Creates one or more &#35;GTlsCertificates from the PEM-encoded
     * <br>data in &#64;file. If &#64;file cannot be read or parsed, the function will
     * <br>return %NULL and set &#64;error. If &#64;file does not contain any
     * <br>PEM-encoded certificates, this will return an empty list and not
     * <br>set &#64;error.
     * @param file file containing PEM-encoded certificates to import
     * @return a &#35;GList containing &#35;GTlsCertificate objects. You must free the list and its contents when you are done with it.
    */
    public static ch.bailu.gtk.glib.List listNewFromFile(@Nonnull ch.bailu.gtk.type.Str file) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaTlsCertificate.INST().g_tls_certificate_list_new_from_file(asCPointerNotNull(file), 0L)));
    }

    public static long getTypeID() { 
        return JnaTlsCertificate.INST().g_tls_certificate_get_type(); 
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

[MethodModel:java-type-not-supported:newFromPkcs12:[ParameterModel:Supported:{Gg:TlsCertificate:{c:GTlsCertificate*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guint8*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
*/
