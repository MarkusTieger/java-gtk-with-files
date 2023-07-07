/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The class for &#35;GTlsInteraction. Derived classes implement the various
 * <br>virtual interaction methods to handle TLS interactions.
 * <br>
 * <br>Derived classes can choose to implement whichever interactions methods they'd
 * <br>like to support by overriding those virtual methods in their class
 * <br>initialization function. If a derived class implements an async method,
 * <br>it must also implement the corresponding finish method.
 * <br>
 * <br>The synchronous interaction methods should implement to display modal dialogs,
 * <br>and the asynchronous methods to display modeless dialogs.
 * <br>
 * <br>If the user cancels an interaction, then the result should be
 * <br>%G_TLS_INTERACTION_FAILED and the error should be set with a domain of
 * <br>%G_IO_ERROR and code of %G_IO_ERROR_CANCELLED.
 * <p><a href="https://docs.gtk.org/gio/struct.TlsInteractionClass.html">https://docs.gtk.org/gio/struct.TlsInteractionClass.html</a></p>
*/
public class TlsInteractionClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsInteractionClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAskPassword {
        /**
         * 
         * @param interaction a &#35;GTlsInteraction object
         * @param password a &#35;GTlsPassword object
         * @param cancellable an optional &#35;GCancellable cancellation object
         * @return The status of the ask password interaction.
        */
        int onAskPassword(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsInteraction interaction, @Nonnull TlsPassword password, @Nullable Cancellable cancellable);
    }
    
    private static JnaTlsInteractionClass.OnAskPassword toOnAskPassword(ch.bailu.gtk.type.Pointer instance, String methodName, OnAskPassword in) {
        JnaTlsInteractionClass.OnAskPassword out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_interaction, _password, _cancellable, _error) -> in.onAskPassword(__callback, new TlsInteraction(new PointerContainer(_interaction)), new TlsPassword(new PointerContainer(_password)), new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAskPasswordFinish {
        /**
         * 
         * @param interaction a &#35;GTlsInteraction object
         * @param result the result passed to the callback
         * @return The status of the ask password interaction.
        */
        int onAskPasswordFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsInteraction interaction, @Nonnull AsyncResult result);
    }
    
    private static JnaTlsInteractionClass.OnAskPasswordFinish toOnAskPasswordFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnAskPasswordFinish in) {
        JnaTlsInteractionClass.OnAskPasswordFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_interaction, _result, _error) -> in.onAskPasswordFinish(__callback, new TlsInteraction(new PointerContainer(_interaction)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRequestCertificate {
        /**
         * 
         * @param interaction a &#35;GTlsInteraction object
         * @param connection a &#35;GTlsConnection object
         * @param flags flags providing more information about the request
         * @param cancellable an optional &#35;GCancellable cancellation object
         * @return The status of the request certificate interaction.
        */
        int onRequestCertificate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsInteraction interaction, @Nonnull TlsConnection connection, int flags, @Nullable Cancellable cancellable);
    }
    
    private static JnaTlsInteractionClass.OnRequestCertificate toOnRequestCertificate(ch.bailu.gtk.type.Pointer instance, String methodName, OnRequestCertificate in) {
        JnaTlsInteractionClass.OnRequestCertificate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_interaction, _connection, _flags, _cancellable, _error) -> in.onRequestCertificate(__callback, new TlsInteraction(new PointerContainer(_interaction)), new TlsConnection(new PointerContainer(_connection)), _flags, new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRequestCertificateFinish {
        /**
         * 
         * @param interaction a &#35;GTlsInteraction object
         * @param result the result passed to the callback
         * @return The status of the request certificate interaction.
        */
        int onRequestCertificateFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsInteraction interaction, @Nonnull AsyncResult result);
    }
    
    private static JnaTlsInteractionClass.OnRequestCertificateFinish toOnRequestCertificateFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnRequestCertificateFinish in) {
        JnaTlsInteractionClass.OnRequestCertificateFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_interaction, _result, _error) -> in.onRequestCertificateFinish(__callback, new TlsInteraction(new PointerContainer(_interaction)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    public TlsInteractionClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaTlsInteractionClass.Fields _fields;
    
    JnaTlsInteractionClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTlsInteractionClass.Fields(asCPointer());
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
     * <br>See {@link OnAskPassword#onAskPassword}
    */
    public static final String ASK_PASSWORD = "ask_password";

    /**
     * 
     * <br>See {@link OnAskPassword#onAskPassword}
    */
    public void setFieldAskPassword(OnAskPassword ask_password) {
        toFields().ask_password = toOnAskPassword(this, ASK_PASSWORD, ask_password);
        toFields().writeField(ASK_PASSWORD);
    }

    /**
     * 
     * <br>See {@link OnAskPassword#onAskPassword}
    */
    public JnaTlsInteractionClass.OnAskPassword getFieldAskPassword() {
       toFields().readField(ASK_PASSWORD);
       return toFields().ask_password;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String ASK_PASSWORD_ASYNC = "ask_password_async";

    /**
     * 
     * <br>See {@link OnAskPasswordFinish#onAskPasswordFinish}
    */
    public static final String ASK_PASSWORD_FINISH = "ask_password_finish";

    /**
     * 
     * <br>See {@link OnAskPasswordFinish#onAskPasswordFinish}
    */
    public void setFieldAskPasswordFinish(OnAskPasswordFinish ask_password_finish) {
        toFields().ask_password_finish = toOnAskPasswordFinish(this, ASK_PASSWORD_FINISH, ask_password_finish);
        toFields().writeField(ASK_PASSWORD_FINISH);
    }

    /**
     * 
     * <br>See {@link OnAskPasswordFinish#onAskPasswordFinish}
    */
    public JnaTlsInteractionClass.OnAskPasswordFinish getFieldAskPasswordFinish() {
       toFields().readField(ASK_PASSWORD_FINISH);
       return toFields().ask_password_finish;
    } 

    /**
     * 
     * <br>See {@link OnRequestCertificate#onRequestCertificate}
    */
    public static final String REQUEST_CERTIFICATE = "request_certificate";

    /**
     * 
     * <br>See {@link OnRequestCertificate#onRequestCertificate}
    */
    public void setFieldRequestCertificate(OnRequestCertificate request_certificate) {
        toFields().request_certificate = toOnRequestCertificate(this, REQUEST_CERTIFICATE, request_certificate);
        toFields().writeField(REQUEST_CERTIFICATE);
    }

    /**
     * 
     * <br>See {@link OnRequestCertificate#onRequestCertificate}
    */
    public JnaTlsInteractionClass.OnRequestCertificate getFieldRequestCertificate() {
       toFields().readField(REQUEST_CERTIFICATE);
       return toFields().request_certificate;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String REQUEST_CERTIFICATE_ASYNC = "request_certificate_async";

    /**
     * 
     * <br>See {@link OnRequestCertificateFinish#onRequestCertificateFinish}
    */
    public static final String REQUEST_CERTIFICATE_FINISH = "request_certificate_finish";

    /**
     * 
     * <br>See {@link OnRequestCertificateFinish#onRequestCertificateFinish}
    */
    public void setFieldRequestCertificateFinish(OnRequestCertificateFinish request_certificate_finish) {
        toFields().request_certificate_finish = toOnRequestCertificateFinish(this, REQUEST_CERTIFICATE_FINISH, request_certificate_finish);
        toFields().writeField(REQUEST_CERTIFICATE_FINISH);
    }

    /**
     * 
     * <br>See {@link OnRequestCertificateFinish#onRequestCertificateFinish}
    */
    public JnaTlsInteractionClass.OnRequestCertificateFinish getFieldRequestCertificateFinish() {
       toFields().readField(REQUEST_CERTIFICATE_FINISH);
       return toFields().request_certificate_finish;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsInteraction.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsInteraction.getParentTypeID());
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
