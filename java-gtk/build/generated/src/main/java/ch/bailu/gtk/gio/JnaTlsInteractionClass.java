/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTlsInteractionClass {

    @FunctionalInterface
    public interface OnAskPassword extends com.sun.jna.Callback {
        int invoke(long interaction, long password, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnAskPasswordAsync extends com.sun.jna.Callback {
        void invoke(long interaction, long password, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnAskPasswordFinish extends com.sun.jna.Callback {
        int invoke(long interaction, long result, long _error);
    }

    @FunctionalInterface
    public interface OnRequestCertificate extends com.sun.jna.Callback {
        int invoke(long interaction, long connection, int flags, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnRequestCertificateAsync extends com.sun.jna.Callback {
        void invoke(long interaction, long connection, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnRequestCertificateFinish extends com.sun.jna.Callback {
        int invoke(long interaction, long result, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TlsInteractionClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TlsInteractionClass.PARENT_CLASS, TlsInteractionClass.ASK_PASSWORD, TlsInteractionClass.ASK_PASSWORD_ASYNC, TlsInteractionClass.ASK_PASSWORD_FINISH, TlsInteractionClass.REQUEST_CERTIFICATE, TlsInteractionClass.REQUEST_CERTIFICATE_ASYNC, TlsInteractionClass.REQUEST_CERTIFICATE_FINISH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnAskPassword ask_password;
        public OnAskPasswordAsync ask_password_async;
        public OnAskPasswordFinish ask_password_finish;
        public OnRequestCertificate request_certificate;
        public OnRequestCertificateAsync request_certificate_async;
        public OnRequestCertificateFinish request_certificate_finish;
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
