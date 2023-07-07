/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaFontChooserIface {

    @FunctionalInterface
    public interface OnGetFontFamily extends com.sun.jna.Callback {
        long invoke(long fontchooser);
    }

    @FunctionalInterface
    public interface OnGetFontFace extends com.sun.jna.Callback {
        long invoke(long fontchooser);
    }

    @FunctionalInterface
    public interface OnGetFontSize extends com.sun.jna.Callback {
        int invoke(long fontchooser);
    }

    @FunctionalInterface
    public interface OnSetFilterFunc extends com.sun.jna.Callback {
        void invoke(long fontchooser, com.sun.jna.Callback filter, long user_data, com.sun.jna.Callback destroy);
    }

    @FunctionalInterface
    public interface OnFontActivated extends com.sun.jna.Callback {
        void invoke(long chooser, long fontname);
    }

    @FunctionalInterface
    public interface OnSetFontMap extends com.sun.jna.Callback {
        void invoke(long fontchooser, long fontmap);
    }

    @FunctionalInterface
    public interface OnGetFontMap extends com.sun.jna.Callback {
        long invoke(long fontchooser);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("FontChooserIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({FontChooserIface.BASE_IFACE, FontChooserIface.GET_FONT_FAMILY, FontChooserIface.GET_FONT_FACE, FontChooserIface.GET_FONT_SIZE, FontChooserIface.SET_FILTER_FUNC, FontChooserIface.FONT_ACTIVATED, FontChooserIface.SET_FONT_MAP, FontChooserIface.GET_FONT_MAP})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] base_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnGetFontFamily get_font_family;
        public OnGetFontFace get_font_face;
        public OnGetFontSize get_font_size;
        public OnSetFilterFunc set_filter_func;
        public OnFontActivated font_activated;
        public OnSetFontMap set_font_map;
        public OnGetFontMap get_font_map;
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
