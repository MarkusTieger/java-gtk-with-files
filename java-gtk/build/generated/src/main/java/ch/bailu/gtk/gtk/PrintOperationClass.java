/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.PrintOperationClass.html">https://docs.gtk.org/gtk4/struct.PrintOperationClass.html</a></p>
*/
public class PrintOperationClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PrintOperationClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDone {
        /**
         * 
         * @param operation 
         * @param result 
        */
        void onDone(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperation operation, int result);
    }
    
    private static JnaPrintOperationClass.OnDone toOnDone(ch.bailu.gtk.type.Pointer instance, String methodName, OnDone in) {
        JnaPrintOperationClass.OnDone out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_operation, _result) -> in.onDone(__callback, new PrintOperation(new PointerContainer(_operation)), _result);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnBeginPrint {
        /**
         * 
         * @param operation 
         * @param context 
        */
        void onBeginPrint(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperation operation, @Nonnull PrintContext context);
    }
    
    private static JnaPrintOperationClass.OnBeginPrint toOnBeginPrint(ch.bailu.gtk.type.Pointer instance, String methodName, OnBeginPrint in) {
        JnaPrintOperationClass.OnBeginPrint out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_operation, _context) -> in.onBeginPrint(__callback, new PrintOperation(new PointerContainer(_operation)), new PrintContext(new PointerContainer(_context)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPaginate {
        /**
         * 
         * @param operation 
         * @param context 
         * @return 
        */
        boolean onPaginate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperation operation, @Nonnull PrintContext context);
    }
    
    private static JnaPrintOperationClass.OnPaginate toOnPaginate(ch.bailu.gtk.type.Pointer instance, String methodName, OnPaginate in) {
        JnaPrintOperationClass.OnPaginate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_operation, _context) -> in.onPaginate(__callback, new PrintOperation(new PointerContainer(_operation)), new PrintContext(new PointerContainer(_context)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRequestPageSetup {
        /**
         * 
         * @param operation 
         * @param context 
         * @param page_nr 
         * @param setup 
        */
        void onRequestPageSetup(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperation operation, @Nonnull PrintContext context, int page_nr, @Nonnull PageSetup setup);
    }
    
    private static JnaPrintOperationClass.OnRequestPageSetup toOnRequestPageSetup(ch.bailu.gtk.type.Pointer instance, String methodName, OnRequestPageSetup in) {
        JnaPrintOperationClass.OnRequestPageSetup out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_operation, _context, _page_nr, _setup) -> in.onRequestPageSetup(__callback, new PrintOperation(new PointerContainer(_operation)), new PrintContext(new PointerContainer(_context)), _page_nr, new PageSetup(new PointerContainer(_setup)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDrawPage {
        /**
         * 
         * @param operation 
         * @param context 
         * @param page_nr 
        */
        void onDrawPage(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperation operation, @Nonnull PrintContext context, int page_nr);
    }
    
    private static JnaPrintOperationClass.OnDrawPage toOnDrawPage(ch.bailu.gtk.type.Pointer instance, String methodName, OnDrawPage in) {
        JnaPrintOperationClass.OnDrawPage out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_operation, _context, _page_nr) -> in.onDrawPage(__callback, new PrintOperation(new PointerContainer(_operation)), new PrintContext(new PointerContainer(_context)), _page_nr);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEndPrint {
        /**
         * 
         * @param operation 
         * @param context 
        */
        void onEndPrint(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperation operation, @Nonnull PrintContext context);
    }
    
    private static JnaPrintOperationClass.OnEndPrint toOnEndPrint(ch.bailu.gtk.type.Pointer instance, String methodName, OnEndPrint in) {
        JnaPrintOperationClass.OnEndPrint out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_operation, _context) -> in.onEndPrint(__callback, new PrintOperation(new PointerContainer(_operation)), new PrintContext(new PointerContainer(_context)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnStatusChanged {
        /**
         * 
         * @param operation 
        */
        void onStatusChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperation operation);
    }
    
    private static JnaPrintOperationClass.OnStatusChanged toOnStatusChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnStatusChanged in) {
        JnaPrintOperationClass.OnStatusChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_operation) -> in.onStatusChanged(__callback, new PrintOperation(new PointerContainer(_operation)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCreateCustomWidget {
        /**
         * 
         * @param operation 
         * @return 
        */
        Widget onCreateCustomWidget(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperation operation);
    }
    
    private static JnaPrintOperationClass.OnCreateCustomWidget toOnCreateCustomWidget(ch.bailu.gtk.type.Pointer instance, String methodName, OnCreateCustomWidget in) {
        JnaPrintOperationClass.OnCreateCustomWidget out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_operation) -> in.onCreateCustomWidget(__callback, new PrintOperation(new PointerContainer(_operation))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCustomWidgetApply {
        /**
         * 
         * @param operation 
         * @param widget 
        */
        void onCustomWidgetApply(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperation operation, @Nonnull Widget widget);
    }
    
    private static JnaPrintOperationClass.OnCustomWidgetApply toOnCustomWidgetApply(ch.bailu.gtk.type.Pointer instance, String methodName, OnCustomWidgetApply in) {
        JnaPrintOperationClass.OnCustomWidgetApply out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_operation, _widget) -> in.onCustomWidgetApply(__callback, new PrintOperation(new PointerContainer(_operation)), new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPreview {
        /**
         * 
         * @param operation 
         * @param preview 
         * @param context 
         * @param parent 
         * @return 
        */
        boolean onPreview(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperation operation, @Nonnull PrintOperationPreview preview, @Nonnull PrintContext context, @Nonnull Window parent);
    }
    
    private static JnaPrintOperationClass.OnPreview toOnPreview(ch.bailu.gtk.type.Pointer instance, String methodName, OnPreview in) {
        JnaPrintOperationClass.OnPreview out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_operation, _preview, _context, _parent) -> in.onPreview(__callback, new PrintOperation(new PointerContainer(_operation)), new PrintOperationPreview(new PointerContainer(_preview)), new PrintContext(new PointerContainer(_context)), new Window(new PointerContainer(_parent)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUpdateCustomWidget {
        /**
         * 
         * @param operation 
         * @param widget 
         * @param setup 
         * @param settings 
        */
        void onUpdateCustomWidget(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintOperation operation, @Nonnull Widget widget, @Nonnull PageSetup setup, @Nonnull PrintSettings settings);
    }
    
    private static JnaPrintOperationClass.OnUpdateCustomWidget toOnUpdateCustomWidget(ch.bailu.gtk.type.Pointer instance, String methodName, OnUpdateCustomWidget in) {
        JnaPrintOperationClass.OnUpdateCustomWidget out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_operation, _widget, _setup, _settings) -> in.onUpdateCustomWidget(__callback, new PrintOperation(new PointerContainer(_operation)), new Widget(new PointerContainer(_widget)), new PageSetup(new PointerContainer(_setup)), new PrintSettings(new PointerContainer(_settings)));
            __callback.register(out);
        }
        return out;
    }

    public PrintOperationClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaPrintOperationClass.Fields _fields;
    
    JnaPrintOperationClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPrintOperationClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent class.
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnDone#onDone}
    */
    public static final String DONE = "done";

    /**
     * 
     * <br>See {@link OnDone#onDone}
    */
    public void setFieldDone(OnDone done) {
        toFields().done = toOnDone(this, DONE, done);
        toFields().writeField(DONE);
    }

    /**
     * 
     * <br>See {@link OnDone#onDone}
    */
    public JnaPrintOperationClass.OnDone getFieldDone() {
       toFields().readField(DONE);
       return toFields().done;
    } 

    /**
     * 
     * <br>See {@link OnBeginPrint#onBeginPrint}
    */
    public static final String BEGIN_PRINT = "begin_print";

    /**
     * 
     * <br>See {@link OnBeginPrint#onBeginPrint}
    */
    public void setFieldBeginPrint(OnBeginPrint begin_print) {
        toFields().begin_print = toOnBeginPrint(this, BEGIN_PRINT, begin_print);
        toFields().writeField(BEGIN_PRINT);
    }

    /**
     * 
     * <br>See {@link OnBeginPrint#onBeginPrint}
    */
    public JnaPrintOperationClass.OnBeginPrint getFieldBeginPrint() {
       toFields().readField(BEGIN_PRINT);
       return toFields().begin_print;
    } 

    /**
     * 
     * <br>See {@link OnPaginate#onPaginate}
    */
    public static final String PAGINATE = "paginate";

    /**
     * 
     * <br>See {@link OnPaginate#onPaginate}
    */
    public void setFieldPaginate(OnPaginate paginate) {
        toFields().paginate = toOnPaginate(this, PAGINATE, paginate);
        toFields().writeField(PAGINATE);
    }

    /**
     * 
     * <br>See {@link OnPaginate#onPaginate}
    */
    public JnaPrintOperationClass.OnPaginate getFieldPaginate() {
       toFields().readField(PAGINATE);
       return toFields().paginate;
    } 

    /**
     * 
     * <br>See {@link OnRequestPageSetup#onRequestPageSetup}
    */
    public static final String REQUEST_PAGE_SETUP = "request_page_setup";

    /**
     * 
     * <br>See {@link OnRequestPageSetup#onRequestPageSetup}
    */
    public void setFieldRequestPageSetup(OnRequestPageSetup request_page_setup) {
        toFields().request_page_setup = toOnRequestPageSetup(this, REQUEST_PAGE_SETUP, request_page_setup);
        toFields().writeField(REQUEST_PAGE_SETUP);
    }

    /**
     * 
     * <br>See {@link OnRequestPageSetup#onRequestPageSetup}
    */
    public JnaPrintOperationClass.OnRequestPageSetup getFieldRequestPageSetup() {
       toFields().readField(REQUEST_PAGE_SETUP);
       return toFields().request_page_setup;
    } 

    /**
     * 
     * <br>See {@link OnDrawPage#onDrawPage}
    */
    public static final String DRAW_PAGE = "draw_page";

    /**
     * 
     * <br>See {@link OnDrawPage#onDrawPage}
    */
    public void setFieldDrawPage(OnDrawPage draw_page) {
        toFields().draw_page = toOnDrawPage(this, DRAW_PAGE, draw_page);
        toFields().writeField(DRAW_PAGE);
    }

    /**
     * 
     * <br>See {@link OnDrawPage#onDrawPage}
    */
    public JnaPrintOperationClass.OnDrawPage getFieldDrawPage() {
       toFields().readField(DRAW_PAGE);
       return toFields().draw_page;
    } 

    /**
     * 
     * <br>See {@link OnEndPrint#onEndPrint}
    */
    public static final String END_PRINT = "end_print";

    /**
     * 
     * <br>See {@link OnEndPrint#onEndPrint}
    */
    public void setFieldEndPrint(OnEndPrint end_print) {
        toFields().end_print = toOnEndPrint(this, END_PRINT, end_print);
        toFields().writeField(END_PRINT);
    }

    /**
     * 
     * <br>See {@link OnEndPrint#onEndPrint}
    */
    public JnaPrintOperationClass.OnEndPrint getFieldEndPrint() {
       toFields().readField(END_PRINT);
       return toFields().end_print;
    } 

    /**
     * 
     * <br>See {@link OnStatusChanged#onStatusChanged}
    */
    public static final String STATUS_CHANGED = "status_changed";

    /**
     * 
     * <br>See {@link OnStatusChanged#onStatusChanged}
    */
    public void setFieldStatusChanged(OnStatusChanged status_changed) {
        toFields().status_changed = toOnStatusChanged(this, STATUS_CHANGED, status_changed);
        toFields().writeField(STATUS_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnStatusChanged#onStatusChanged}
    */
    public JnaPrintOperationClass.OnStatusChanged getFieldStatusChanged() {
       toFields().readField(STATUS_CHANGED);
       return toFields().status_changed;
    } 

    /**
     * 
     * <br>See {@link OnCreateCustomWidget#onCreateCustomWidget}
    */
    public static final String CREATE_CUSTOM_WIDGET = "create_custom_widget";

    /**
     * 
     * <br>See {@link OnCreateCustomWidget#onCreateCustomWidget}
    */
    public void setFieldCreateCustomWidget(OnCreateCustomWidget create_custom_widget) {
        toFields().create_custom_widget = toOnCreateCustomWidget(this, CREATE_CUSTOM_WIDGET, create_custom_widget);
        toFields().writeField(CREATE_CUSTOM_WIDGET);
    }

    /**
     * 
     * <br>See {@link OnCreateCustomWidget#onCreateCustomWidget}
    */
    public JnaPrintOperationClass.OnCreateCustomWidget getFieldCreateCustomWidget() {
       toFields().readField(CREATE_CUSTOM_WIDGET);
       return toFields().create_custom_widget;
    } 

    /**
     * 
     * <br>See {@link OnCustomWidgetApply#onCustomWidgetApply}
    */
    public static final String CUSTOM_WIDGET_APPLY = "custom_widget_apply";

    /**
     * 
     * <br>See {@link OnCustomWidgetApply#onCustomWidgetApply}
    */
    public void setFieldCustomWidgetApply(OnCustomWidgetApply custom_widget_apply) {
        toFields().custom_widget_apply = toOnCustomWidgetApply(this, CUSTOM_WIDGET_APPLY, custom_widget_apply);
        toFields().writeField(CUSTOM_WIDGET_APPLY);
    }

    /**
     * 
     * <br>See {@link OnCustomWidgetApply#onCustomWidgetApply}
    */
    public JnaPrintOperationClass.OnCustomWidgetApply getFieldCustomWidgetApply() {
       toFields().readField(CUSTOM_WIDGET_APPLY);
       return toFields().custom_widget_apply;
    } 

    /**
     * 
     * <br>See {@link OnPreview#onPreview}
    */
    public static final String PREVIEW = "preview";

    /**
     * 
     * <br>See {@link OnPreview#onPreview}
    */
    public void setFieldPreview(OnPreview preview) {
        toFields().preview = toOnPreview(this, PREVIEW, preview);
        toFields().writeField(PREVIEW);
    }

    /**
     * 
     * <br>See {@link OnPreview#onPreview}
    */
    public JnaPrintOperationClass.OnPreview getFieldPreview() {
       toFields().readField(PREVIEW);
       return toFields().preview;
    } 

    /**
     * 
     * <br>See {@link OnUpdateCustomWidget#onUpdateCustomWidget}
    */
    public static final String UPDATE_CUSTOM_WIDGET = "update_custom_widget";

    /**
     * 
     * <br>See {@link OnUpdateCustomWidget#onUpdateCustomWidget}
    */
    public void setFieldUpdateCustomWidget(OnUpdateCustomWidget update_custom_widget) {
        toFields().update_custom_widget = toOnUpdateCustomWidget(this, UPDATE_CUSTOM_WIDGET, update_custom_widget);
        toFields().writeField(UPDATE_CUSTOM_WIDGET);
    }

    /**
     * 
     * <br>See {@link OnUpdateCustomWidget#onUpdateCustomWidget}
    */
    public JnaPrintOperationClass.OnUpdateCustomWidget getFieldUpdateCustomWidget() {
       toFields().readField(UPDATE_CUSTOM_WIDGET);
       return toFields().update_custom_widget;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PrintOperation.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PrintOperation.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
