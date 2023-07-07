/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSettingsClass {

    @FunctionalInterface
    public interface OnWritableChanged extends com.sun.jna.Callback {
        void invoke(long settings, long key);
    }

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long settings, long key);
    }

    @FunctionalInterface
    public interface OnWritableChangeEvent extends com.sun.jna.Callback {
        boolean invoke(long settings, int key);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("SettingsClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({SettingsClass.PARENT_CLASS, SettingsClass.WRITABLE_CHANGED, SettingsClass.CHANGED, SettingsClass.WRITABLE_CHANGE_EVENT})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnWritableChanged writable_changed;
        public OnChanged changed;
        public OnWritableChangeEvent writable_change_event;
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
