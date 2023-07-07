/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaApplicationClass {

    @FunctionalInterface
    public interface OnWindowAdded extends com.sun.jna.Callback {
        void invoke(long application, long window);
    }

    @FunctionalInterface
    public interface OnWindowRemoved extends com.sun.jna.Callback {
        void invoke(long application, long window);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ApplicationClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ApplicationClass.PARENT_CLASS, ApplicationClass.WINDOW_ADDED, ApplicationClass.WINDOW_REMOVED})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gio.ApplicationClass.getInstanceSize()];
        public OnWindowAdded window_added;
        public OnWindowRemoved window_removed;
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
