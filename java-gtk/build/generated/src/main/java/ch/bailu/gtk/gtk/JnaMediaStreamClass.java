/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaMediaStreamClass {

    @FunctionalInterface
    public interface OnPlay extends com.sun.jna.Callback {
        boolean invoke(long self);
    }

    @FunctionalInterface
    public interface OnPause extends com.sun.jna.Callback {
        void invoke(long self);
    }

    @FunctionalInterface
    public interface OnSeek extends com.sun.jna.Callback {
        void invoke(long self, long timestamp);
    }

    @FunctionalInterface
    public interface OnUpdateAudio extends com.sun.jna.Callback {
        void invoke(long self, boolean muted, double volume);
    }

    @FunctionalInterface
    public interface OnRealize extends com.sun.jna.Callback {
        void invoke(long self, long surface);
    }

    @FunctionalInterface
    public interface OnUnrealize extends com.sun.jna.Callback {
        void invoke(long self, long surface);
    }

    @FunctionalInterface
    public interface OnGtkReserved1 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved2 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved3 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved4 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved5 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved6 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved7 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved8 extends com.sun.jna.Callback {
        void invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("MediaStreamClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({MediaStreamClass.PARENT_CLASS, MediaStreamClass.PLAY, MediaStreamClass.PAUSE, MediaStreamClass.SEEK, MediaStreamClass.UPDATE_AUDIO, MediaStreamClass.REALIZE, MediaStreamClass.UNREALIZE, MediaStreamClass._GTK_RESERVED1, MediaStreamClass._GTK_RESERVED2, MediaStreamClass._GTK_RESERVED3, MediaStreamClass._GTK_RESERVED4, MediaStreamClass._GTK_RESERVED5, MediaStreamClass._GTK_RESERVED6, MediaStreamClass._GTK_RESERVED7, MediaStreamClass._GTK_RESERVED8})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnPlay play;
        public OnPause pause;
        public OnSeek seek;
        public OnUpdateAudio update_audio;
        public OnRealize realize;
        public OnUnrealize unrealize;
        public OnGtkReserved1 _gtk_reserved1;
        public OnGtkReserved2 _gtk_reserved2;
        public OnGtkReserved3 _gtk_reserved3;
        public OnGtkReserved4 _gtk_reserved4;
        public OnGtkReserved5 _gtk_reserved5;
        public OnGtkReserved6 _gtk_reserved6;
        public OnGtkReserved7 _gtk_reserved7;
        public OnGtkReserved8 _gtk_reserved8;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
