/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPrintOperationClass {

    @FunctionalInterface
    public interface OnDone extends com.sun.jna.Callback {
        void invoke(long operation, int result);
    }

    @FunctionalInterface
    public interface OnBeginPrint extends com.sun.jna.Callback {
        void invoke(long operation, long context);
    }

    @FunctionalInterface
    public interface OnPaginate extends com.sun.jna.Callback {
        boolean invoke(long operation, long context);
    }

    @FunctionalInterface
    public interface OnRequestPageSetup extends com.sun.jna.Callback {
        void invoke(long operation, long context, int page_nr, long setup);
    }

    @FunctionalInterface
    public interface OnDrawPage extends com.sun.jna.Callback {
        void invoke(long operation, long context, int page_nr);
    }

    @FunctionalInterface
    public interface OnEndPrint extends com.sun.jna.Callback {
        void invoke(long operation, long context);
    }

    @FunctionalInterface
    public interface OnStatusChanged extends com.sun.jna.Callback {
        void invoke(long operation);
    }

    @FunctionalInterface
    public interface OnCreateCustomWidget extends com.sun.jna.Callback {
        long invoke(long operation);
    }

    @FunctionalInterface
    public interface OnCustomWidgetApply extends com.sun.jna.Callback {
        void invoke(long operation, long widget);
    }

    @FunctionalInterface
    public interface OnPreview extends com.sun.jna.Callback {
        boolean invoke(long operation, long preview, long context, long parent);
    }

    @FunctionalInterface
    public interface OnUpdateCustomWidget extends com.sun.jna.Callback {
        void invoke(long operation, long widget, long setup, long settings);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("PrintOperationClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({PrintOperationClass.PARENT_CLASS, PrintOperationClass.DONE, PrintOperationClass.BEGIN_PRINT, PrintOperationClass.PAGINATE, PrintOperationClass.REQUEST_PAGE_SETUP, PrintOperationClass.DRAW_PAGE, PrintOperationClass.END_PRINT, PrintOperationClass.STATUS_CHANGED, PrintOperationClass.CREATE_CUSTOM_WIDGET, PrintOperationClass.CUSTOM_WIDGET_APPLY, PrintOperationClass.PREVIEW, PrintOperationClass.UPDATE_CUSTOM_WIDGET})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnDone done;
        public OnBeginPrint begin_print;
        public OnPaginate paginate;
        public OnRequestPageSetup request_page_setup;
        public OnDrawPage draw_page;
        public OnEndPrint end_print;
        public OnStatusChanged status_changed;
        public OnCreateCustomWidget create_custom_widget;
        public OnCustomWidgetApply custom_widget_apply;
        public OnPreview preview;
        public OnUpdateCustomWidget update_custom_widget;
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
