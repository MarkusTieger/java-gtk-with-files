/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.TlsCertificateClass.html">https://docs.gtk.org/gio/struct.TlsCertificateClass.html</a></p>
*/
public class TlsCertificateClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsCertificateClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnVerify {
        /**
         * 
         * @param cert a &#35;GTlsCertificate
         * @param identity the expected peer identity
         * @param trusted_ca the certificate of a trusted authority
         * @return the appropriate &#35;GTlsCertificateFlags
        */
        int onVerify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TlsCertificate cert, @Nullable SocketConnectable identity, @Nullable TlsCertificate trusted_ca);
    }
    
    private static JnaTlsCertificateClass.OnVerify toOnVerify(ch.bailu.gtk.type.Pointer instance, String methodName, OnVerify in) {
        JnaTlsCertificateClass.OnVerify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cert, _identity, _trusted_ca) -> in.onVerify(__callback, new TlsCertificate(new PointerContainer(_cert)), new SocketConnectable(new PointerContainer(_identity)), new TlsCertificate(new PointerContainer(_trusted_ca)));
            __callback.register(out);
        }
        return out;
    }

    public TlsCertificateClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaTlsCertificateClass.Fields _fields;
    
    JnaTlsCertificateClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTlsCertificateClass.Fields(asCPointer());
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
     * <br>See {@link OnVerify#onVerify}
    */
    public static final String VERIFY = "verify";

    /**
     * 
     * <br>See {@link OnVerify#onVerify}
    */
    public void setFieldVerify(OnVerify verify) {
        toFields().verify = toOnVerify(this, VERIFY, verify);
        toFields().writeField(VERIFY);
    }

    /**
     * 
     * <br>See {@link OnVerify#onVerify}
    */
    public JnaTlsCertificateClass.OnVerify getFieldVerify() {
       toFields().readField(VERIFY);
       return toFields().verify;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsCertificate.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsCertificate.getParentTypeID());
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
