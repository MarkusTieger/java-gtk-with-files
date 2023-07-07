/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.IMContextClass.html">https://docs.gtk.org/gtk4/struct.IMContextClass.html</a></p>
*/
public class IMContextClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IMContextClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnPreeditStart {
        /**
         * 
         * @param context 
        */
        void onPreeditStart(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IMContext context);
    }
    
    private static JnaIMContextClass.OnPreeditStart toOnPreeditStart(ch.bailu.gtk.type.Pointer instance, String methodName, OnPreeditStart in) {
        JnaIMContextClass.OnPreeditStart out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context) -> in.onPreeditStart(__callback, new IMContext(new PointerContainer(_context)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPreeditEnd {
        /**
         * 
         * @param context 
        */
        void onPreeditEnd(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IMContext context);
    }
    
    private static JnaIMContextClass.OnPreeditEnd toOnPreeditEnd(ch.bailu.gtk.type.Pointer instance, String methodName, OnPreeditEnd in) {
        JnaIMContextClass.OnPreeditEnd out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context) -> in.onPreeditEnd(__callback, new IMContext(new PointerContainer(_context)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPreeditChanged {
        /**
         * 
         * @param context 
        */
        void onPreeditChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IMContext context);
    }
    
    private static JnaIMContextClass.OnPreeditChanged toOnPreeditChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnPreeditChanged in) {
        JnaIMContextClass.OnPreeditChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context) -> in.onPreeditChanged(__callback, new IMContext(new PointerContainer(_context)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCommit {
        /**
         * 
         * @param context 
         * @param str 
        */
        void onCommit(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IMContext context, @Nonnull ch.bailu.gtk.type.Str str);
    }
    
    private static JnaIMContextClass.OnCommit toOnCommit(ch.bailu.gtk.type.Pointer instance, String methodName, OnCommit in) {
        JnaIMContextClass.OnCommit out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _str) -> in.onCommit(__callback, new IMContext(new PointerContainer(_context)), new ch.bailu.gtk.type.Str(new PointerContainer(_str)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRetrieveSurrounding {
        /**
         * 
         * @param context 
         * @return 
        */
        boolean onRetrieveSurrounding(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IMContext context);
    }
    
    private static JnaIMContextClass.OnRetrieveSurrounding toOnRetrieveSurrounding(ch.bailu.gtk.type.Pointer instance, String methodName, OnRetrieveSurrounding in) {
        JnaIMContextClass.OnRetrieveSurrounding out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context) -> in.onRetrieveSurrounding(__callback, new IMContext(new PointerContainer(_context)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDeleteSurrounding {
        /**
         * 
         * @param context a `GtkIMContext`
         * @param offset offset from cursor position in chars;    a negative value means start before the cursor.
         * @param n_chars number of characters to delete.
         * @return %TRUE if the signal was handled.
        */
        boolean onDeleteSurrounding(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IMContext context, int offset, int n_chars);
    }
    
    private static JnaIMContextClass.OnDeleteSurrounding toOnDeleteSurrounding(ch.bailu.gtk.type.Pointer instance, String methodName, OnDeleteSurrounding in) {
        JnaIMContextClass.OnDeleteSurrounding out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _offset, _n_chars) -> in.onDeleteSurrounding(__callback, new IMContext(new PointerContainer(_context)), _offset, _n_chars);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetClientWidget {
        /**
         * 
         * @param context a `GtkIMContext`
         * @param widget the client widget. This may be %NULL to indicate   that the previous client widget no longer exists.
        */
        void onSetClientWidget(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IMContext context, @Nullable Widget widget);
    }
    
    private static JnaIMContextClass.OnSetClientWidget toOnSetClientWidget(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetClientWidget in) {
        JnaIMContextClass.OnSetClientWidget out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _widget) -> in.onSetClientWidget(__callback, new IMContext(new PointerContainer(_context)), new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    public IMContextClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaIMContextClass.Fields _fields;
    
    JnaIMContextClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaIMContextClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnPreeditStart#onPreeditStart}
    */
    public static final String PREEDIT_START = "preedit_start";

    /**
     * 
     * <br>See {@link OnPreeditStart#onPreeditStart}
    */
    public void setFieldPreeditStart(OnPreeditStart preedit_start) {
        toFields().preedit_start = toOnPreeditStart(this, PREEDIT_START, preedit_start);
        toFields().writeField(PREEDIT_START);
    }

    /**
     * 
     * <br>See {@link OnPreeditStart#onPreeditStart}
    */
    public JnaIMContextClass.OnPreeditStart getFieldPreeditStart() {
       toFields().readField(PREEDIT_START);
       return toFields().preedit_start;
    } 

    /**
     * 
     * <br>See {@link OnPreeditEnd#onPreeditEnd}
    */
    public static final String PREEDIT_END = "preedit_end";

    /**
     * 
     * <br>See {@link OnPreeditEnd#onPreeditEnd}
    */
    public void setFieldPreeditEnd(OnPreeditEnd preedit_end) {
        toFields().preedit_end = toOnPreeditEnd(this, PREEDIT_END, preedit_end);
        toFields().writeField(PREEDIT_END);
    }

    /**
     * 
     * <br>See {@link OnPreeditEnd#onPreeditEnd}
    */
    public JnaIMContextClass.OnPreeditEnd getFieldPreeditEnd() {
       toFields().readField(PREEDIT_END);
       return toFields().preedit_end;
    } 

    /**
     * 
     * <br>See {@link OnPreeditChanged#onPreeditChanged}
    */
    public static final String PREEDIT_CHANGED = "preedit_changed";

    /**
     * 
     * <br>See {@link OnPreeditChanged#onPreeditChanged}
    */
    public void setFieldPreeditChanged(OnPreeditChanged preedit_changed) {
        toFields().preedit_changed = toOnPreeditChanged(this, PREEDIT_CHANGED, preedit_changed);
        toFields().writeField(PREEDIT_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnPreeditChanged#onPreeditChanged}
    */
    public JnaIMContextClass.OnPreeditChanged getFieldPreeditChanged() {
       toFields().readField(PREEDIT_CHANGED);
       return toFields().preedit_changed;
    } 

    /**
     * 
     * <br>See {@link OnCommit#onCommit}
    */
    public static final String COMMIT = "commit";

    /**
     * 
     * <br>See {@link OnCommit#onCommit}
    */
    public void setFieldCommit(OnCommit commit) {
        toFields().commit = toOnCommit(this, COMMIT, commit);
        toFields().writeField(COMMIT);
    }

    /**
     * 
     * <br>See {@link OnCommit#onCommit}
    */
    public JnaIMContextClass.OnCommit getFieldCommit() {
       toFields().readField(COMMIT);
       return toFields().commit;
    } 

    /**
     * 
     * <br>See {@link OnRetrieveSurrounding#onRetrieveSurrounding}
    */
    public static final String RETRIEVE_SURROUNDING = "retrieve_surrounding";

    /**
     * 
     * <br>See {@link OnRetrieveSurrounding#onRetrieveSurrounding}
    */
    public void setFieldRetrieveSurrounding(OnRetrieveSurrounding retrieve_surrounding) {
        toFields().retrieve_surrounding = toOnRetrieveSurrounding(this, RETRIEVE_SURROUNDING, retrieve_surrounding);
        toFields().writeField(RETRIEVE_SURROUNDING);
    }

    /**
     * 
     * <br>See {@link OnRetrieveSurrounding#onRetrieveSurrounding}
    */
    public JnaIMContextClass.OnRetrieveSurrounding getFieldRetrieveSurrounding() {
       toFields().readField(RETRIEVE_SURROUNDING);
       return toFields().retrieve_surrounding;
    } 

    /**
     * 
     * <br>See {@link OnDeleteSurrounding#onDeleteSurrounding}
    */
    public static final String DELETE_SURROUNDING = "delete_surrounding";

    /**
     * 
     * <br>See {@link OnDeleteSurrounding#onDeleteSurrounding}
    */
    public void setFieldDeleteSurrounding(OnDeleteSurrounding delete_surrounding) {
        toFields().delete_surrounding = toOnDeleteSurrounding(this, DELETE_SURROUNDING, delete_surrounding);
        toFields().writeField(DELETE_SURROUNDING);
    }

    /**
     * 
     * <br>See {@link OnDeleteSurrounding#onDeleteSurrounding}
    */
    public JnaIMContextClass.OnDeleteSurrounding getFieldDeleteSurrounding() {
       toFields().readField(DELETE_SURROUNDING);
       return toFields().delete_surrounding;
    } 

    /**
     * 
     * <br>See {@link OnSetClientWidget#onSetClientWidget}
    */
    public static final String SET_CLIENT_WIDGET = "set_client_widget";

    /**
     * 
     * <br>See {@link OnSetClientWidget#onSetClientWidget}
    */
    public void setFieldSetClientWidget(OnSetClientWidget set_client_widget) {
        toFields().set_client_widget = toOnSetClientWidget(this, SET_CLIENT_WIDGET, set_client_widget);
        toFields().writeField(SET_CLIENT_WIDGET);
    }

    /**
     * 
     * <br>See {@link OnSetClientWidget#onSetClientWidget}
    */
    public JnaIMContextClass.OnSetClientWidget getFieldSetClientWidget() {
       toFields().readField(SET_CLIENT_WIDGET);
       return toFields().set_client_widget;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(IMContext.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(IMContext.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:get_preedit_string:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:filter_keypress:previous-field-unsupported:[MethodModel:Supported:filterKeypress:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Event:{c:GdkEvent*}}:{j:long}]]

[MethodModel:Supported:filterKeypress:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Event:{c:GdkEvent*}}:{j:long}]

[FieldModel:focus_in:previous-field-unsupported:[MethodModel:Supported:focusIn:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]]

[MethodModel:Supported:focusIn:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]

[FieldModel:focus_out:previous-field-unsupported:[MethodModel:Supported:focusOut:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]]

[MethodModel:Supported:focusOut:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]

[FieldModel:reset:previous-field-unsupported:[MethodModel:Supported:reset:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]]

[MethodModel:Supported:reset:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]

[FieldModel:set_cursor_location:previous-field-unsupported:[MethodModel:Supported:setCursorLocation:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Rectangle:{c:GdkRectangle*}}:{j:long}]]

[MethodModel:Supported:setCursorLocation:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Rectangle:{c:GdkRectangle*}}:{j:long}]

[FieldModel:set_use_preedit:previous-field-unsupported:[MethodModel:Supported:setUsePreedit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]

[MethodModel:Supported:setUsePreedit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]

[FieldModel:set_surrounding:previous-field-unsupported:[MethodModel:Supported:setSurrounding:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]]

[MethodModel:Supported:setSurrounding:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]

[FieldModel:get_surrounding:previous-field-unsupported:[MethodModel:Supported:getSurrounding:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]]

[MethodModel:Supported:getSurrounding:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]

[FieldModel:set_surrounding_with_selection:previous-field-unsupported:[MethodModel:Supported:setSurroundingWithSelection:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]]

[MethodModel:Supported:setSurroundingWithSelection:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]

[FieldModel:get_surrounding_with_selection:previous-field-unsupported:[MethodModel:Supported:getSurroundingWithSelection:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]]

[MethodModel:Supported:getSurroundingWithSelection:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:IMContext:{c:GtkIMContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]

[FieldModel:_gtk_reserved1:previous-field-unsupported:[MethodModel:Supported:gtkReserved1:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gtkReserved1:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_gtk_reserved2:previous-field-unsupported:[MethodModel:Supported:gtkReserved2:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gtkReserved2:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_gtk_reserved3:previous-field-unsupported:[MethodModel:Supported:gtkReserved3:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gtkReserved3:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_gtk_reserved4:previous-field-unsupported:[MethodModel:Supported:gtkReserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gtkReserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_gtk_reserved5:previous-field-unsupported:[MethodModel:Supported:gtkReserved5:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gtkReserved5:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
