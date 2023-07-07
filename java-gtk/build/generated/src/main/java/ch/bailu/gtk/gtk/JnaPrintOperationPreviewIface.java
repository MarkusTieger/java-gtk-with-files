/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPrintOperationPreviewIface {

    @FunctionalInterface
    public interface OnReady extends com.sun.jna.Callback {
        void invoke(long preview, long context);
    }

    @FunctionalInterface
    public interface OnGotPageSize extends com.sun.jna.Callback {
        void invoke(long preview, long context, long page_setup);
    }

    @FunctionalInterface
    public interface OnRenderPage extends com.sun.jna.Callback {
        void invoke(long preview, int page_nr);
    }

    @FunctionalInterface
    public interface OnIsSelected extends com.sun.jna.Callback {
        boolean invoke(long preview, int page_nr);
    }

    @FunctionalInterface
    public interface OnEndPreview extends com.sun.jna.Callback {
        void invoke(long preview);
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
            System.out.println("PrintOperationPreviewIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({PrintOperationPreviewIface.G_IFACE, PrintOperationPreviewIface.READY, PrintOperationPreviewIface.GOT_PAGE_SIZE, PrintOperationPreviewIface.RENDER_PAGE, PrintOperationPreviewIface.IS_SELECTED, PrintOperationPreviewIface.END_PREVIEW, PrintOperationPreviewIface._GTK_RESERVED1, PrintOperationPreviewIface._GTK_RESERVED2, PrintOperationPreviewIface._GTK_RESERVED3, PrintOperationPreviewIface._GTK_RESERVED4, PrintOperationPreviewIface._GTK_RESERVED5, PrintOperationPreviewIface._GTK_RESERVED6, PrintOperationPreviewIface._GTK_RESERVED7, PrintOperationPreviewIface._GTK_RESERVED8})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnReady ready;
        public OnGotPageSize got_page_size;
        public OnRenderPage render_page;
        public OnIsSelected is_selected;
        public OnEndPreview end_preview;
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
