/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.PrintOperationPreviewIface.html">https://docs.gtk.org/gtk4/struct.PrintOperationPreviewIface.html</a></p>
*/
public class PrintOperationPreviewIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PrintOperationPreviewIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnReady {
        /**
         * 
         * @param preview 
         * @param context 
        */
        void onReady(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperationPreview preview, @Nonnull PrintContext context);
    }
    
    private static JnaPrintOperationPreviewIface.OnReady toOnReady(ch.bailu.gtk.type.Pointer instance, String methodName, OnReady in) {
        JnaPrintOperationPreviewIface.OnReady out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_preview, _context) -> in.onReady(__callback, new PrintOperationPreview(new PointerContainer(_preview)), new PrintContext(new PointerContainer(_context)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGotPageSize {
        /**
         * 
         * @param preview 
         * @param context 
         * @param page_setup 
        */
        void onGotPageSize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperationPreview preview, @Nonnull PrintContext context, @Nonnull PageSetup page_setup);
    }
    
    private static JnaPrintOperationPreviewIface.OnGotPageSize toOnGotPageSize(ch.bailu.gtk.type.Pointer instance, String methodName, OnGotPageSize in) {
        JnaPrintOperationPreviewIface.OnGotPageSize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_preview, _context, _page_setup) -> in.onGotPageSize(__callback, new PrintOperationPreview(new PointerContainer(_preview)), new PrintContext(new PointerContainer(_context)), new PageSetup(new PointerContainer(_page_setup)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRenderPage {
        /**
         * 
         * @param preview a `GtkPrintOperationPreview`
         * @param page_nr the page to render
        */
        void onRenderPage(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperationPreview preview, int page_nr);
    }
    
    private static JnaPrintOperationPreviewIface.OnRenderPage toOnRenderPage(ch.bailu.gtk.type.Pointer instance, String methodName, OnRenderPage in) {
        JnaPrintOperationPreviewIface.OnRenderPage out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_preview, _page_nr) -> in.onRenderPage(__callback, new PrintOperationPreview(new PointerContainer(_preview)), _page_nr);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIsSelected {
        /**
         * 
         * @param preview a `GtkPrintOperationPreview`
         * @param page_nr a page number
         * @return %TRUE if the page has been selected for printing
        */
        boolean onIsSelected(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperationPreview preview, int page_nr);
    }
    
    private static JnaPrintOperationPreviewIface.OnIsSelected toOnIsSelected(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsSelected in) {
        JnaPrintOperationPreviewIface.OnIsSelected out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_preview, _page_nr) -> in.onIsSelected(__callback, new PrintOperationPreview(new PointerContainer(_preview)), _page_nr);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEndPreview {
        /**
         * 
         * @param preview a `GtkPrintOperationPreview`
        */
        void onEndPreview(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperationPreview preview);
    }
    
    private static JnaPrintOperationPreviewIface.OnEndPreview toOnEndPreview(ch.bailu.gtk.type.Pointer instance, String methodName, OnEndPreview in) {
        JnaPrintOperationPreviewIface.OnEndPreview out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_preview) -> in.onEndPreview(__callback, new PrintOperationPreview(new PointerContainer(_preview)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved1 {
        void onGtkReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaPrintOperationPreviewIface.OnGtkReserved1 toOnGtkReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved1 in) {
        JnaPrintOperationPreviewIface.OnGtkReserved1 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved1(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved2 {
        void onGtkReserved2(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaPrintOperationPreviewIface.OnGtkReserved2 toOnGtkReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved2 in) {
        JnaPrintOperationPreviewIface.OnGtkReserved2 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved2(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved3 {
        void onGtkReserved3(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaPrintOperationPreviewIface.OnGtkReserved3 toOnGtkReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved3 in) {
        JnaPrintOperationPreviewIface.OnGtkReserved3 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved3(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved4 {
        void onGtkReserved4(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaPrintOperationPreviewIface.OnGtkReserved4 toOnGtkReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved4 in) {
        JnaPrintOperationPreviewIface.OnGtkReserved4 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved4(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved5 {
        void onGtkReserved5(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaPrintOperationPreviewIface.OnGtkReserved5 toOnGtkReserved5(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved5 in) {
        JnaPrintOperationPreviewIface.OnGtkReserved5 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved5(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved6 {
        void onGtkReserved6(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaPrintOperationPreviewIface.OnGtkReserved6 toOnGtkReserved6(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved6 in) {
        JnaPrintOperationPreviewIface.OnGtkReserved6 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved6(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved7 {
        void onGtkReserved7(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaPrintOperationPreviewIface.OnGtkReserved7 toOnGtkReserved7(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved7 in) {
        JnaPrintOperationPreviewIface.OnGtkReserved7 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved7(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved8 {
        void onGtkReserved8(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaPrintOperationPreviewIface.OnGtkReserved8 toOnGtkReserved8(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved8 in) {
        JnaPrintOperationPreviewIface.OnGtkReserved8 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved8(__callback);
            __callback.register(out);
        }
        return out;
    }

    public PrintOperationPreviewIface(PointerContainer pointer) {
        super(pointer);
    }

    public PrintOperationPreviewIface() {
        super(cast(JnaPrintOperationPreviewIface.allocateStructure()));
    }

    private JnaPrintOperationPreviewIface.Fields _fields;
    
    JnaPrintOperationPreviewIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPrintOperationPreviewIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnReady#onReady}
    */
    public static final String READY = "ready";

    /**
     * 
     * <br>See {@link OnReady#onReady}
    */
    public void setFieldReady(OnReady ready) {
        toFields().ready = toOnReady(this, READY, ready);
        toFields().writeField(READY);
    }

    /**
     * 
     * <br>See {@link OnReady#onReady}
    */
    public JnaPrintOperationPreviewIface.OnReady getFieldReady() {
       toFields().readField(READY);
       return toFields().ready;
    } 

    /**
     * 
     * <br>See {@link OnGotPageSize#onGotPageSize}
    */
    public static final String GOT_PAGE_SIZE = "got_page_size";

    /**
     * 
     * <br>See {@link OnGotPageSize#onGotPageSize}
    */
    public void setFieldGotPageSize(OnGotPageSize got_page_size) {
        toFields().got_page_size = toOnGotPageSize(this, GOT_PAGE_SIZE, got_page_size);
        toFields().writeField(GOT_PAGE_SIZE);
    }

    /**
     * 
     * <br>See {@link OnGotPageSize#onGotPageSize}
    */
    public JnaPrintOperationPreviewIface.OnGotPageSize getFieldGotPageSize() {
       toFields().readField(GOT_PAGE_SIZE);
       return toFields().got_page_size;
    } 

    /**
     * 
     * <br>See {@link OnRenderPage#onRenderPage}
    */
    public static final String RENDER_PAGE = "render_page";

    /**
     * 
     * <br>See {@link OnRenderPage#onRenderPage}
    */
    public void setFieldRenderPage(OnRenderPage render_page) {
        toFields().render_page = toOnRenderPage(this, RENDER_PAGE, render_page);
        toFields().writeField(RENDER_PAGE);
    }

    /**
     * 
     * <br>See {@link OnRenderPage#onRenderPage}
    */
    public JnaPrintOperationPreviewIface.OnRenderPage getFieldRenderPage() {
       toFields().readField(RENDER_PAGE);
       return toFields().render_page;
    } 

    /**
     * 
     * <br>See {@link OnIsSelected#onIsSelected}
    */
    public static final String IS_SELECTED = "is_selected";

    /**
     * 
     * <br>See {@link OnIsSelected#onIsSelected}
    */
    public void setFieldIsSelected(OnIsSelected is_selected) {
        toFields().is_selected = toOnIsSelected(this, IS_SELECTED, is_selected);
        toFields().writeField(IS_SELECTED);
    }

    /**
     * 
     * <br>See {@link OnIsSelected#onIsSelected}
    */
    public JnaPrintOperationPreviewIface.OnIsSelected getFieldIsSelected() {
       toFields().readField(IS_SELECTED);
       return toFields().is_selected;
    } 

    /**
     * 
     * <br>See {@link OnEndPreview#onEndPreview}
    */
    public static final String END_PREVIEW = "end_preview";

    /**
     * 
     * <br>See {@link OnEndPreview#onEndPreview}
    */
    public void setFieldEndPreview(OnEndPreview end_preview) {
        toFields().end_preview = toOnEndPreview(this, END_PREVIEW, end_preview);
        toFields().writeField(END_PREVIEW);
    }

    /**
     * 
     * <br>See {@link OnEndPreview#onEndPreview}
    */
    public JnaPrintOperationPreviewIface.OnEndPreview getFieldEndPreview() {
       toFields().readField(END_PREVIEW);
       return toFields().end_preview;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved1#onGtkReserved1}
    */
    public static final String _GTK_RESERVED1 = "_gtk_reserved1";

    /**
     * 
     * <br>See {@link OnGtkReserved1#onGtkReserved1}
    */
    public void setFieldGtkReserved1(OnGtkReserved1 _gtk_reserved1) {
        toFields()._gtk_reserved1 = toOnGtkReserved1(this, _GTK_RESERVED1, _gtk_reserved1);
        toFields().writeField(_GTK_RESERVED1);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved1#onGtkReserved1}
    */
    public JnaPrintOperationPreviewIface.OnGtkReserved1 getFieldGtkReserved1() {
       toFields().readField(_GTK_RESERVED1);
       return toFields()._gtk_reserved1;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved2#onGtkReserved2}
    */
    public static final String _GTK_RESERVED2 = "_gtk_reserved2";

    /**
     * 
     * <br>See {@link OnGtkReserved2#onGtkReserved2}
    */
    public void setFieldGtkReserved2(OnGtkReserved2 _gtk_reserved2) {
        toFields()._gtk_reserved2 = toOnGtkReserved2(this, _GTK_RESERVED2, _gtk_reserved2);
        toFields().writeField(_GTK_RESERVED2);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved2#onGtkReserved2}
    */
    public JnaPrintOperationPreviewIface.OnGtkReserved2 getFieldGtkReserved2() {
       toFields().readField(_GTK_RESERVED2);
       return toFields()._gtk_reserved2;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved3#onGtkReserved3}
    */
    public static final String _GTK_RESERVED3 = "_gtk_reserved3";

    /**
     * 
     * <br>See {@link OnGtkReserved3#onGtkReserved3}
    */
    public void setFieldGtkReserved3(OnGtkReserved3 _gtk_reserved3) {
        toFields()._gtk_reserved3 = toOnGtkReserved3(this, _GTK_RESERVED3, _gtk_reserved3);
        toFields().writeField(_GTK_RESERVED3);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved3#onGtkReserved3}
    */
    public JnaPrintOperationPreviewIface.OnGtkReserved3 getFieldGtkReserved3() {
       toFields().readField(_GTK_RESERVED3);
       return toFields()._gtk_reserved3;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved4#onGtkReserved4}
    */
    public static final String _GTK_RESERVED4 = "_gtk_reserved4";

    /**
     * 
     * <br>See {@link OnGtkReserved4#onGtkReserved4}
    */
    public void setFieldGtkReserved4(OnGtkReserved4 _gtk_reserved4) {
        toFields()._gtk_reserved4 = toOnGtkReserved4(this, _GTK_RESERVED4, _gtk_reserved4);
        toFields().writeField(_GTK_RESERVED4);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved4#onGtkReserved4}
    */
    public JnaPrintOperationPreviewIface.OnGtkReserved4 getFieldGtkReserved4() {
       toFields().readField(_GTK_RESERVED4);
       return toFields()._gtk_reserved4;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved5#onGtkReserved5}
    */
    public static final String _GTK_RESERVED5 = "_gtk_reserved5";

    /**
     * 
     * <br>See {@link OnGtkReserved5#onGtkReserved5}
    */
    public void setFieldGtkReserved5(OnGtkReserved5 _gtk_reserved5) {
        toFields()._gtk_reserved5 = toOnGtkReserved5(this, _GTK_RESERVED5, _gtk_reserved5);
        toFields().writeField(_GTK_RESERVED5);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved5#onGtkReserved5}
    */
    public JnaPrintOperationPreviewIface.OnGtkReserved5 getFieldGtkReserved5() {
       toFields().readField(_GTK_RESERVED5);
       return toFields()._gtk_reserved5;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved6#onGtkReserved6}
    */
    public static final String _GTK_RESERVED6 = "_gtk_reserved6";

    /**
     * 
     * <br>See {@link OnGtkReserved6#onGtkReserved6}
    */
    public void setFieldGtkReserved6(OnGtkReserved6 _gtk_reserved6) {
        toFields()._gtk_reserved6 = toOnGtkReserved6(this, _GTK_RESERVED6, _gtk_reserved6);
        toFields().writeField(_GTK_RESERVED6);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved6#onGtkReserved6}
    */
    public JnaPrintOperationPreviewIface.OnGtkReserved6 getFieldGtkReserved6() {
       toFields().readField(_GTK_RESERVED6);
       return toFields()._gtk_reserved6;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved7#onGtkReserved7}
    */
    public static final String _GTK_RESERVED7 = "_gtk_reserved7";

    /**
     * 
     * <br>See {@link OnGtkReserved7#onGtkReserved7}
    */
    public void setFieldGtkReserved7(OnGtkReserved7 _gtk_reserved7) {
        toFields()._gtk_reserved7 = toOnGtkReserved7(this, _GTK_RESERVED7, _gtk_reserved7);
        toFields().writeField(_GTK_RESERVED7);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved7#onGtkReserved7}
    */
    public JnaPrintOperationPreviewIface.OnGtkReserved7 getFieldGtkReserved7() {
       toFields().readField(_GTK_RESERVED7);
       return toFields()._gtk_reserved7;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved8#onGtkReserved8}
    */
    public static final String _GTK_RESERVED8 = "_gtk_reserved8";

    /**
     * 
     * <br>See {@link OnGtkReserved8#onGtkReserved8}
    */
    public void setFieldGtkReserved8(OnGtkReserved8 _gtk_reserved8) {
        toFields()._gtk_reserved8 = toOnGtkReserved8(this, _GTK_RESERVED8, _gtk_reserved8);
        toFields().writeField(_GTK_RESERVED8);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved8#onGtkReserved8}
    */
    public JnaPrintOperationPreviewIface.OnGtkReserved8 getFieldGtkReserved8() {
       toFields().readField(_GTK_RESERVED8);
       return toFields()._gtk_reserved8;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PrintOperationPreview.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PrintOperationPreview.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
