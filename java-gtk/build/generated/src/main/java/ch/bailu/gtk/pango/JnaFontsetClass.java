/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaFontsetClass {

    @FunctionalInterface
    public interface OnGetFont extends com.sun.jna.Callback {
        long invoke(long fontset, int wc);
    }

    @FunctionalInterface
    public interface OnGetMetrics extends com.sun.jna.Callback {
        long invoke(long fontset);
    }

    @FunctionalInterface
    public interface OnGetLanguage extends com.sun.jna.Callback {
        long invoke(long fontset);
    }

    @FunctionalInterface
    public interface OnForeach extends com.sun.jna.Callback {
        void invoke(long fontset, com.sun.jna.Callback func, long data);
    }

    @FunctionalInterface
    public interface OnPangoReserved1 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnPangoReserved2 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnPangoReserved3 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnPangoReserved4 extends com.sun.jna.Callback {
        void invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("FontsetClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({FontsetClass.PARENT_CLASS, FontsetClass.GET_FONT, FontsetClass.GET_METRICS, FontsetClass.GET_LANGUAGE, FontsetClass.FOREACH, FontsetClass._PANGO_RESERVED1, FontsetClass._PANGO_RESERVED2, FontsetClass._PANGO_RESERVED3, FontsetClass._PANGO_RESERVED4})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnGetFont get_font;
        public OnGetMetrics get_metrics;
        public OnGetLanguage get_language;
        public OnForeach foreach;
        public OnPangoReserved1 _pango_reserved1;
        public OnPangoReserved2 _pango_reserved2;
        public OnPangoReserved3 _pango_reserved3;
        public OnPangoReserved4 _pango_reserved4;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
