/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A sub-parser for `GtkBuildable` implementations.
 * <p><a href="https://docs.gtk.org/gtk4/struct.BuildableParser.html">https://docs.gtk.org/gtk4/struct.BuildableParser.html</a></p>
*/
public class BuildableParser extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BuildableParser.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnStartElement {
        /**
         * 
         * @param context 
         * @param element_name 
         * @param attribute_names 
         * @param attribute_values 
         * @param user_data 
        */
        void onStartElement(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull BuildableParseContext context, @Nonnull ch.bailu.gtk.type.Str element_name, @Nonnull ch.bailu.gtk.type.Strs attribute_names, @Nonnull ch.bailu.gtk.type.Strs attribute_values, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaBuildableParser.OnStartElement toOnStartElement(ch.bailu.gtk.type.Pointer instance, String methodName, OnStartElement in) {
        JnaBuildableParser.OnStartElement out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _element_name, _attribute_names, _attribute_values, _user_data, _error) -> in.onStartElement(__callback, new BuildableParseContext(new PointerContainer(_context)), new ch.bailu.gtk.type.Str(new PointerContainer(_element_name)), new ch.bailu.gtk.type.Strs(new PointerContainer(_attribute_names)), new ch.bailu.gtk.type.Strs(new PointerContainer(_attribute_values)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEndElement {
        /**
         * 
         * @param context 
         * @param element_name 
         * @param user_data 
        */
        void onEndElement(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull BuildableParseContext context, @Nonnull ch.bailu.gtk.type.Str element_name, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaBuildableParser.OnEndElement toOnEndElement(ch.bailu.gtk.type.Pointer instance, String methodName, OnEndElement in) {
        JnaBuildableParser.OnEndElement out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _element_name, _user_data, _error) -> in.onEndElement(__callback, new BuildableParseContext(new PointerContainer(_context)), new ch.bailu.gtk.type.Str(new PointerContainer(_element_name)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnText {
        /**
         * 
         * @param context 
         * @param text 
         * @param text_len 
         * @param user_data 
        */
        void onText(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull BuildableParseContext context, @Nonnull ch.bailu.gtk.type.Str text, long text_len, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaBuildableParser.OnText toOnText(ch.bailu.gtk.type.Pointer instance, String methodName, OnText in) {
        JnaBuildableParser.OnText out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _text, _text_len, _user_data, _error) -> in.onText(__callback, new BuildableParseContext(new PointerContainer(_context)), new ch.bailu.gtk.type.Str(new PointerContainer(_text)), _text_len, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnError {
        /**
         * 
         * @param context 
         * @param error 
         * @param user_data 
        */
        void onError(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull BuildableParseContext context, @Nonnull ch.bailu.gtk.glib.Error error, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaBuildableParser.OnError toOnError(ch.bailu.gtk.type.Pointer instance, String methodName, OnError in) {
        JnaBuildableParser.OnError out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _error, _user_data) -> in.onError(__callback, new BuildableParseContext(new PointerContainer(_context)), new ch.bailu.gtk.glib.Error(new PointerContainer(_error)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public BuildableParser(PointerContainer pointer) {
        super(pointer);
    }

    private JnaBuildableParser.Fields _fields;
    
    JnaBuildableParser.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaBuildableParser.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>See {@link OnStartElement#onStartElement}
    */
    public static final String START_ELEMENT = "start_element";

    /**
     * 
     * <br>See {@link OnStartElement#onStartElement}
    */
    public void setFieldStartElement(OnStartElement start_element) {
        toFields().start_element = toOnStartElement(this, START_ELEMENT, start_element);
        toFields().writeField(START_ELEMENT);
    }

    /**
     * 
     * <br>See {@link OnStartElement#onStartElement}
    */
    public JnaBuildableParser.OnStartElement getFieldStartElement() {
       toFields().readField(START_ELEMENT);
       return toFields().start_element;
    } 

    /**
     * 
     * <br>See {@link OnEndElement#onEndElement}
    */
    public static final String END_ELEMENT = "end_element";

    /**
     * 
     * <br>See {@link OnEndElement#onEndElement}
    */
    public void setFieldEndElement(OnEndElement end_element) {
        toFields().end_element = toOnEndElement(this, END_ELEMENT, end_element);
        toFields().writeField(END_ELEMENT);
    }

    /**
     * 
     * <br>See {@link OnEndElement#onEndElement}
    */
    public JnaBuildableParser.OnEndElement getFieldEndElement() {
       toFields().readField(END_ELEMENT);
       return toFields().end_element;
    } 

    /**
     * 
     * <br>See {@link OnText#onText}
    */
    public static final String TEXT = "text";

    /**
     * 
     * <br>See {@link OnText#onText}
    */
    public void setFieldText(OnText text) {
        toFields().text = toOnText(this, TEXT, text);
        toFields().writeField(TEXT);
    }

    /**
     * 
     * <br>See {@link OnText#onText}
    */
    public JnaBuildableParser.OnText getFieldText() {
       toFields().readField(TEXT);
       return toFields().text;
    } 

    /**
     * 
     * <br>See {@link OnError#onError}
    */
    public static final String ERROR = "error";

    /**
     * 
     * <br>See {@link OnError#onError}
    */
    public void setFieldError(OnError error) {
        toFields().error = toOnError(this, ERROR, error);
        toFields().writeField(ERROR);
    }

    /**
     * 
     * <br>See {@link OnError#onError}
    */
    public JnaBuildableParser.OnError getFieldError() {
       toFields().readField(ERROR);
       return toFields().error;
    } 

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
