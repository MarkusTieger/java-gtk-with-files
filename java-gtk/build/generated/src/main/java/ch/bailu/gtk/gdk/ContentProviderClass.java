/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for `GdkContentProvider`.
 * <p><a href="https://docs.gtk.org/gdk4/struct.ContentProviderClass.html">https://docs.gtk.org/gdk4/struct.ContentProviderClass.html</a></p>
*/
public class ContentProviderClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ContentProviderClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnContentChanged {
        /**
         * 
         * @param provider a `GdkContentProvider`
        */
        void onContentChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ContentProvider provider);
    }
    
    private static JnaContentProviderClass.OnContentChanged toOnContentChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnContentChanged in) {
        JnaContentProviderClass.OnContentChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_provider) -> in.onContentChanged(__callback, new ContentProvider(new PointerContainer(_provider)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAttachClipboard {
        /**
         * 
         * @param provider 
         * @param clipboard 
        */
        void onAttachClipboard(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ContentProvider provider, @Nonnull Clipboard clipboard);
    }
    
    private static JnaContentProviderClass.OnAttachClipboard toOnAttachClipboard(ch.bailu.gtk.type.Pointer instance, String methodName, OnAttachClipboard in) {
        JnaContentProviderClass.OnAttachClipboard out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_provider, _clipboard) -> in.onAttachClipboard(__callback, new ContentProvider(new PointerContainer(_provider)), new Clipboard(new PointerContainer(_clipboard)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDetachClipboard {
        /**
         * 
         * @param provider 
         * @param clipboard 
        */
        void onDetachClipboard(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ContentProvider provider, @Nonnull Clipboard clipboard);
    }
    
    private static JnaContentProviderClass.OnDetachClipboard toOnDetachClipboard(ch.bailu.gtk.type.Pointer instance, String methodName, OnDetachClipboard in) {
        JnaContentProviderClass.OnDetachClipboard out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_provider, _clipboard) -> in.onDetachClipboard(__callback, new ContentProvider(new PointerContainer(_provider)), new Clipboard(new PointerContainer(_clipboard)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRefFormats {
        /**
         * 
         * @param provider a `GdkContentProvider`
         * @return The formats of the provider
        */
        ContentFormats onRefFormats(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ContentProvider provider);
    }
    
    private static JnaContentProviderClass.OnRefFormats toOnRefFormats(ch.bailu.gtk.type.Pointer instance, String methodName, OnRefFormats in) {
        JnaContentProviderClass.OnRefFormats out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_provider) -> in.onRefFormats(__callback, new ContentProvider(new PointerContainer(_provider))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRefStorableFormats {
        /**
         * 
         * @param provider a `GdkContentProvider`
         * @return The storable formats of the provider
        */
        ContentFormats onRefStorableFormats(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ContentProvider provider);
    }
    
    private static JnaContentProviderClass.OnRefStorableFormats toOnRefStorableFormats(ch.bailu.gtk.type.Pointer instance, String methodName, OnRefStorableFormats in) {
        JnaContentProviderClass.OnRefStorableFormats out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_provider) -> in.onRefStorableFormats(__callback, new ContentProvider(new PointerContainer(_provider))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnWriteMimeTypeFinish {
        /**
         * 
         * @param provider a `GdkContentProvider`
         * @param result a `GAsyncResult`
         * @return %TRUE if the operation was completed successfully. Otherwise   &#64;error will be set to describe the failure.
        */
        boolean onWriteMimeTypeFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ContentProvider provider, @Nonnull ch.bailu.gtk.gio.AsyncResult result);
    }
    
    private static JnaContentProviderClass.OnWriteMimeTypeFinish toOnWriteMimeTypeFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnWriteMimeTypeFinish in) {
        JnaContentProviderClass.OnWriteMimeTypeFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_provider, _result, _error) -> in.onWriteMimeTypeFinish(__callback, new ContentProvider(new PointerContainer(_provider)), new ch.bailu.gtk.gio.AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetValue {
        /**
         * 
         * @param provider a `GdkContentProvider`
         * @param value the `GValue` to fill
         * @return %TRUE if the value was set successfully. Otherwise   &#64;error will be set to describe the failure.
        */
        boolean onGetValue(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ContentProvider provider, @Nonnull ch.bailu.gtk.gobject.Value value);
    }
    
    private static JnaContentProviderClass.OnGetValue toOnGetValue(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetValue in) {
        JnaContentProviderClass.OnGetValue out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_provider, _value, _error) -> in.onGetValue(__callback, new ContentProvider(new PointerContainer(_provider)), new ch.bailu.gtk.gobject.Value(new PointerContainer(_value)));
            __callback.register(out);
        }
        return out;
    }

    public ContentProviderClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaContentProviderClass.Fields _fields;
    
    JnaContentProviderClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaContentProviderClass.Fields(asCPointer());
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
     * <br>See {@link OnContentChanged#onContentChanged}
    */
    public static final String CONTENT_CHANGED = "content_changed";

    /**
     * 
     * <br>See {@link OnContentChanged#onContentChanged}
    */
    public void setFieldContentChanged(OnContentChanged content_changed) {
        toFields().content_changed = toOnContentChanged(this, CONTENT_CHANGED, content_changed);
        toFields().writeField(CONTENT_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnContentChanged#onContentChanged}
    */
    public JnaContentProviderClass.OnContentChanged getFieldContentChanged() {
       toFields().readField(CONTENT_CHANGED);
       return toFields().content_changed;
    } 

    /**
     * 
     * <br>See {@link OnAttachClipboard#onAttachClipboard}
    */
    public static final String ATTACH_CLIPBOARD = "attach_clipboard";

    /**
     * 
     * <br>See {@link OnAttachClipboard#onAttachClipboard}
    */
    public void setFieldAttachClipboard(OnAttachClipboard attach_clipboard) {
        toFields().attach_clipboard = toOnAttachClipboard(this, ATTACH_CLIPBOARD, attach_clipboard);
        toFields().writeField(ATTACH_CLIPBOARD);
    }

    /**
     * 
     * <br>See {@link OnAttachClipboard#onAttachClipboard}
    */
    public JnaContentProviderClass.OnAttachClipboard getFieldAttachClipboard() {
       toFields().readField(ATTACH_CLIPBOARD);
       return toFields().attach_clipboard;
    } 

    /**
     * 
     * <br>See {@link OnDetachClipboard#onDetachClipboard}
    */
    public static final String DETACH_CLIPBOARD = "detach_clipboard";

    /**
     * 
     * <br>See {@link OnDetachClipboard#onDetachClipboard}
    */
    public void setFieldDetachClipboard(OnDetachClipboard detach_clipboard) {
        toFields().detach_clipboard = toOnDetachClipboard(this, DETACH_CLIPBOARD, detach_clipboard);
        toFields().writeField(DETACH_CLIPBOARD);
    }

    /**
     * 
     * <br>See {@link OnDetachClipboard#onDetachClipboard}
    */
    public JnaContentProviderClass.OnDetachClipboard getFieldDetachClipboard() {
       toFields().readField(DETACH_CLIPBOARD);
       return toFields().detach_clipboard;
    } 

    /**
     * 
     * <br>See {@link OnRefFormats#onRefFormats}
    */
    public static final String REF_FORMATS = "ref_formats";

    /**
     * 
     * <br>See {@link OnRefFormats#onRefFormats}
    */
    public void setFieldRefFormats(OnRefFormats ref_formats) {
        toFields().ref_formats = toOnRefFormats(this, REF_FORMATS, ref_formats);
        toFields().writeField(REF_FORMATS);
    }

    /**
     * 
     * <br>See {@link OnRefFormats#onRefFormats}
    */
    public JnaContentProviderClass.OnRefFormats getFieldRefFormats() {
       toFields().readField(REF_FORMATS);
       return toFields().ref_formats;
    } 

    /**
     * 
     * <br>See {@link OnRefStorableFormats#onRefStorableFormats}
    */
    public static final String REF_STORABLE_FORMATS = "ref_storable_formats";

    /**
     * 
     * <br>See {@link OnRefStorableFormats#onRefStorableFormats}
    */
    public void setFieldRefStorableFormats(OnRefStorableFormats ref_storable_formats) {
        toFields().ref_storable_formats = toOnRefStorableFormats(this, REF_STORABLE_FORMATS, ref_storable_formats);
        toFields().writeField(REF_STORABLE_FORMATS);
    }

    /**
     * 
     * <br>See {@link OnRefStorableFormats#onRefStorableFormats}
    */
    public JnaContentProviderClass.OnRefStorableFormats getFieldRefStorableFormats() {
       toFields().readField(REF_STORABLE_FORMATS);
       return toFields().ref_storable_formats;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String WRITE_MIME_TYPE_ASYNC = "write_mime_type_async";

    /**
     * 
     * <br>See {@link OnWriteMimeTypeFinish#onWriteMimeTypeFinish}
    */
    public static final String WRITE_MIME_TYPE_FINISH = "write_mime_type_finish";

    /**
     * 
     * <br>See {@link OnWriteMimeTypeFinish#onWriteMimeTypeFinish}
    */
    public void setFieldWriteMimeTypeFinish(OnWriteMimeTypeFinish write_mime_type_finish) {
        toFields().write_mime_type_finish = toOnWriteMimeTypeFinish(this, WRITE_MIME_TYPE_FINISH, write_mime_type_finish);
        toFields().writeField(WRITE_MIME_TYPE_FINISH);
    }

    /**
     * 
     * <br>See {@link OnWriteMimeTypeFinish#onWriteMimeTypeFinish}
    */
    public JnaContentProviderClass.OnWriteMimeTypeFinish getFieldWriteMimeTypeFinish() {
       toFields().readField(WRITE_MIME_TYPE_FINISH);
       return toFields().write_mime_type_finish;
    } 

    /**
     * 
     * <br>See {@link OnGetValue#onGetValue}
    */
    public static final String GET_VALUE = "get_value";

    /**
     * 
     * <br>See {@link OnGetValue#onGetValue}
    */
    public void setFieldGetValue(OnGetValue get_value) {
        toFields().get_value = toOnGetValue(this, GET_VALUE, get_value);
        toFields().writeField(GET_VALUE);
    }

    /**
     * 
     * <br>See {@link OnGetValue#onGetValue}
    */
    public JnaContentProviderClass.OnGetValue getFieldGetValue() {
       toFields().readField(GET_VALUE);
       return toFields().get_value;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ContentProvider.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ContentProvider.getParentTypeID());
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
