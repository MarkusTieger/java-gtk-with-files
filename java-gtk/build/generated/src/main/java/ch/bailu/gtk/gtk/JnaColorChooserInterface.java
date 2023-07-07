/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaColorChooserInterface {

    @FunctionalInterface
    public interface OnGetRgba extends com.sun.jna.Callback {
        void invoke(long chooser, long color);
    }

    @FunctionalInterface
    public interface OnSetRgba extends com.sun.jna.Callback {
        void invoke(long chooser, long color);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ColorChooserInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ColorChooserInterface.BASE_INTERFACE, ColorChooserInterface.GET_RGBA, ColorChooserInterface.SET_RGBA})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] base_interface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnGetRgba get_rgba;
        public OnSetRgba set_rgba;
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
