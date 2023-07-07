/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaIMContextClass {

    @FunctionalInterface
    public interface OnPreeditStart extends com.sun.jna.Callback {
        void invoke(long context);
    }

    @FunctionalInterface
    public interface OnPreeditEnd extends com.sun.jna.Callback {
        void invoke(long context);
    }

    @FunctionalInterface
    public interface OnPreeditChanged extends com.sun.jna.Callback {
        void invoke(long context);
    }

    @FunctionalInterface
    public interface OnCommit extends com.sun.jna.Callback {
        void invoke(long context, long str);
    }

    @FunctionalInterface
    public interface OnRetrieveSurrounding extends com.sun.jna.Callback {
        boolean invoke(long context);
    }

    @FunctionalInterface
    public interface OnDeleteSurrounding extends com.sun.jna.Callback {
        boolean invoke(long context, int offset, int n_chars);
    }

    @FunctionalInterface
    public interface OnSetClientWidget extends com.sun.jna.Callback {
        void invoke(long context, long widget);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("IMContextClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({IMContextClass.PARENT_CLASS, IMContextClass.PREEDIT_START, IMContextClass.PREEDIT_END, IMContextClass.PREEDIT_CHANGED, IMContextClass.COMMIT, IMContextClass.RETRIEVE_SURROUNDING, IMContextClass.DELETE_SURROUNDING, IMContextClass.SET_CLIENT_WIDGET})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnPreeditStart preedit_start;
        public OnPreeditEnd preedit_end;
        public OnPreeditChanged preedit_changed;
        public OnCommit commit;
        public OnRetrieveSurrounding retrieve_surrounding;
        public OnDeleteSurrounding delete_surrounding;
        public OnSetClientWidget set_client_widget;
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
