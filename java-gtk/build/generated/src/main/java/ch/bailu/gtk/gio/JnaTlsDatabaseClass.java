/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTlsDatabaseClass {

    @FunctionalInterface
    public interface OnVerifyChain extends com.sun.jna.Callback {
        int invoke(long self, long chain, long purpose, long identity, long interaction, int flags, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnVerifyChainAsync extends com.sun.jna.Callback {
        void invoke(long self, long chain, long purpose, long identity, long interaction, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnVerifyChainFinish extends com.sun.jna.Callback {
        int invoke(long self, long result, long _error);
    }

    @FunctionalInterface
    public interface OnCreateCertificateHandle extends com.sun.jna.Callback {
        long invoke(long self, long certificate);
    }

    @FunctionalInterface
    public interface OnLookupCertificateForHandle extends com.sun.jna.Callback {
        long invoke(long self, long handle, long interaction, int flags, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnLookupCertificateForHandleAsync extends com.sun.jna.Callback {
        void invoke(long self, long handle, long interaction, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnLookupCertificateForHandleFinish extends com.sun.jna.Callback {
        long invoke(long self, long result, long _error);
    }

    @FunctionalInterface
    public interface OnLookupCertificateIssuer extends com.sun.jna.Callback {
        long invoke(long self, long certificate, long interaction, int flags, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnLookupCertificateIssuerAsync extends com.sun.jna.Callback {
        void invoke(long self, long certificate, long interaction, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnLookupCertificateIssuerFinish extends com.sun.jna.Callback {
        long invoke(long self, long result, long _error);
    }

    @FunctionalInterface
    public interface OnLookupCertificatesIssuedBy extends com.sun.jna.Callback {
        long invoke(long self, long issuer_raw_dn, long interaction, int flags, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnLookupCertificatesIssuedByAsync extends com.sun.jna.Callback {
        void invoke(long self, long issuer_raw_dn, long interaction, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnLookupCertificatesIssuedByFinish extends com.sun.jna.Callback {
        long invoke(long self, long result, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TlsDatabaseClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TlsDatabaseClass.PARENT_CLASS, TlsDatabaseClass.VERIFY_CHAIN, TlsDatabaseClass.VERIFY_CHAIN_ASYNC, TlsDatabaseClass.VERIFY_CHAIN_FINISH, TlsDatabaseClass.CREATE_CERTIFICATE_HANDLE, TlsDatabaseClass.LOOKUP_CERTIFICATE_FOR_HANDLE, TlsDatabaseClass.LOOKUP_CERTIFICATE_FOR_HANDLE_ASYNC, TlsDatabaseClass.LOOKUP_CERTIFICATE_FOR_HANDLE_FINISH, TlsDatabaseClass.LOOKUP_CERTIFICATE_ISSUER, TlsDatabaseClass.LOOKUP_CERTIFICATE_ISSUER_ASYNC, TlsDatabaseClass.LOOKUP_CERTIFICATE_ISSUER_FINISH, TlsDatabaseClass.LOOKUP_CERTIFICATES_ISSUED_BY, TlsDatabaseClass.LOOKUP_CERTIFICATES_ISSUED_BY_ASYNC, TlsDatabaseClass.LOOKUP_CERTIFICATES_ISSUED_BY_FINISH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnVerifyChain verify_chain;
        public OnVerifyChainAsync verify_chain_async;
        public OnVerifyChainFinish verify_chain_finish;
        public OnCreateCertificateHandle create_certificate_handle;
        public OnLookupCertificateForHandle lookup_certificate_for_handle;
        public OnLookupCertificateForHandleAsync lookup_certificate_for_handle_async;
        public OnLookupCertificateForHandleFinish lookup_certificate_for_handle_finish;
        public OnLookupCertificateIssuer lookup_certificate_issuer;
        public OnLookupCertificateIssuerAsync lookup_certificate_issuer_async;
        public OnLookupCertificateIssuerFinish lookup_certificate_issuer_finish;
        public OnLookupCertificatesIssuedBy lookup_certificates_issued_by;
        public OnLookupCertificatesIssuedByAsync lookup_certificates_issued_by_async;
        public OnLookupCertificatesIssuedByFinish lookup_certificates_issued_by_finish;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
