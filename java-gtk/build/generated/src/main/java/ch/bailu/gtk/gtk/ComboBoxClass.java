/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.ComboBoxClass.html">https://docs.gtk.org/gtk4/struct.ComboBoxClass.html</a></p>
*/
public class ComboBoxClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ComboBoxClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * 
         * @param combo_box 
        */
        void onChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ComboBox combo_box);
    }
    
    private static JnaComboBoxClass.OnChanged toOnChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnChanged in) {
        JnaComboBoxClass.OnChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_combo_box) -> in.onChanged(__callback, new ComboBox(new PointerContainer(_combo_box)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFormatEntryText {
        /**
         * 
         * @param combo_box 
         * @param path 
         * @return 
        */
        ch.bailu.gtk.type.Str onFormatEntryText(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ComboBox combo_box, @Nonnull ch.bailu.gtk.type.Str path);
    }
    
    private static JnaComboBoxClass.OnFormatEntryText toOnFormatEntryText(ch.bailu.gtk.type.Pointer instance, String methodName, OnFormatEntryText in) {
        JnaComboBoxClass.OnFormatEntryText out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_combo_box, _path) -> in.onFormatEntryText(__callback, new ComboBox(new PointerContainer(_combo_box)), new ch.bailu.gtk.type.Str(new PointerContainer(_path))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * 
         * @param combo_box 
        */
        void onActivate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ComboBox combo_box);
    }
    
    private static JnaComboBoxClass.OnActivate toOnActivate(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivate in) {
        JnaComboBoxClass.OnActivate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_combo_box) -> in.onActivate(__callback, new ComboBox(new PointerContainer(_combo_box)));
            __callback.register(out);
        }
        return out;
    }

    public ComboBoxClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaComboBoxClass.Fields _fields;
    
    JnaComboBoxClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaComboBoxClass.Fields(asCPointer());
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
     * <br>See {@link OnChanged#onChanged}
    */
    public static final String CHANGED = "changed";

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public void setFieldChanged(OnChanged changed) {
        toFields().changed = toOnChanged(this, CHANGED, changed);
        toFields().writeField(CHANGED);
    }

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public JnaComboBoxClass.OnChanged getFieldChanged() {
       toFields().readField(CHANGED);
       return toFields().changed;
    } 

    /**
     * 
     * <br>See {@link OnFormatEntryText#onFormatEntryText}
    */
    public static final String FORMAT_ENTRY_TEXT = "format_entry_text";

    /**
     * 
     * <br>See {@link OnFormatEntryText#onFormatEntryText}
    */
    public void setFieldFormatEntryText(OnFormatEntryText format_entry_text) {
        toFields().format_entry_text = toOnFormatEntryText(this, FORMAT_ENTRY_TEXT, format_entry_text);
        toFields().writeField(FORMAT_ENTRY_TEXT);
    }

    /**
     * 
     * <br>See {@link OnFormatEntryText#onFormatEntryText}
    */
    public JnaComboBoxClass.OnFormatEntryText getFieldFormatEntryText() {
       toFields().readField(FORMAT_ENTRY_TEXT);
       return toFields().format_entry_text;
    } 

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public static final String ACTIVATE = "activate";

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public void setFieldActivate(OnActivate activate) {
        toFields().activate = toOnActivate(this, ACTIVATE, activate);
        toFields().writeField(ACTIVATE);
    }

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public JnaComboBoxClass.OnActivate getFieldActivate() {
       toFields().readField(ACTIVATE);
       return toFields().activate;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ComboBox.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ComboBox.getParentTypeID());
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
