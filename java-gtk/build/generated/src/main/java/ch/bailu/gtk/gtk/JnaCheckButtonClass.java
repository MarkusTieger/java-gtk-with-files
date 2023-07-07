/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCheckButtonClass {

    @FunctionalInterface
    public interface OnToggled extends com.sun.jna.Callback {
        void invoke(long check_button);
    }

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long check_button);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("CheckButtonClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({CheckButtonClass.PARENT_CLASS, CheckButtonClass.TOGGLED, CheckButtonClass.ACTIVATE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[WidgetClass.getInstanceSize()];
        public OnToggled toggled;
        public OnActivate activate;
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
