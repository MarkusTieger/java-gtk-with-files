/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.EntryBufferClass.html">https://docs.gtk.org/gtk4/struct.EntryBufferClass.html</a></p>
*/
public class EntryBufferClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EntryBufferClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnInsertedText {
        /**
         * 
         * @param buffer 
         * @param position 
         * @param chars 
         * @param n_chars 
        */
        void onInsertedText(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull EntryBuffer buffer, int position, @Nonnull ch.bailu.gtk.type.Str chars, int n_chars);
    }
    
    private static JnaEntryBufferClass.OnInsertedText toOnInsertedText(ch.bailu.gtk.type.Pointer instance, String methodName, OnInsertedText in) {
        JnaEntryBufferClass.OnInsertedText out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _position, _chars, _n_chars) -> in.onInsertedText(__callback, new EntryBuffer(new PointerContainer(_buffer)), _position, new ch.bailu.gtk.type.Str(new PointerContainer(_chars)), _n_chars);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDeletedText {
        /**
         * 
         * @param buffer 
         * @param position 
         * @param n_chars 
        */
        void onDeletedText(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull EntryBuffer buffer, int position, int n_chars);
    }
    
    private static JnaEntryBufferClass.OnDeletedText toOnDeletedText(ch.bailu.gtk.type.Pointer instance, String methodName, OnDeletedText in) {
        JnaEntryBufferClass.OnDeletedText out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _position, _n_chars) -> in.onDeletedText(__callback, new EntryBuffer(new PointerContainer(_buffer)), _position, _n_chars);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetText {
        /**
         * 
         * @param buffer 
         * @param n_bytes 
         * @return 
        */
        ch.bailu.gtk.type.Str onGetText(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull EntryBuffer buffer, @Nonnull ch.bailu.gtk.type.Int64 n_bytes);
    }
    
    private static JnaEntryBufferClass.OnGetText toOnGetText(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetText in) {
        JnaEntryBufferClass.OnGetText out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _n_bytes) -> in.onGetText(__callback, new EntryBuffer(new PointerContainer(_buffer)), new ch.bailu.gtk.type.Int64(new PointerContainer(_n_bytes))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetLength {
        /**
         * 
         * @param buffer a `GtkEntryBuffer`
         * @return The number of characters in the buffer.
        */
        int onGetLength(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull EntryBuffer buffer);
    }
    
    private static JnaEntryBufferClass.OnGetLength toOnGetLength(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetLength in) {
        JnaEntryBufferClass.OnGetLength out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer) -> in.onGetLength(__callback, new EntryBuffer(new PointerContainer(_buffer)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnInsertText {
        /**
         * 
         * @param buffer a `GtkEntryBuffer`
         * @param position the position at which to insert text.
         * @param chars the text to insert into the buffer.
         * @param n_chars the length of the text in characters, or -1
         * @return The number of characters actually inserted.
        */
        int onInsertText(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull EntryBuffer buffer, int position, @Nonnull ch.bailu.gtk.type.Str chars, int n_chars);
    }
    
    private static JnaEntryBufferClass.OnInsertText toOnInsertText(ch.bailu.gtk.type.Pointer instance, String methodName, OnInsertText in) {
        JnaEntryBufferClass.OnInsertText out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _position, _chars, _n_chars) -> in.onInsertText(__callback, new EntryBuffer(new PointerContainer(_buffer)), _position, new ch.bailu.gtk.type.Str(new PointerContainer(_chars)), _n_chars);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDeleteText {
        /**
         * 
         * @param buffer a `GtkEntryBuffer`
         * @param position position at which to delete text
         * @param n_chars number of characters to delete
         * @return The number of characters deleted.
        */
        int onDeleteText(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull EntryBuffer buffer, int position, int n_chars);
    }
    
    private static JnaEntryBufferClass.OnDeleteText toOnDeleteText(ch.bailu.gtk.type.Pointer instance, String methodName, OnDeleteText in) {
        JnaEntryBufferClass.OnDeleteText out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _position, _n_chars) -> in.onDeleteText(__callback, new EntryBuffer(new PointerContainer(_buffer)), _position, _n_chars);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved1 {
        void onGtkReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaEntryBufferClass.OnGtkReserved1 toOnGtkReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved1 in) {
        JnaEntryBufferClass.OnGtkReserved1 out = null;
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
    
    private static JnaEntryBufferClass.OnGtkReserved2 toOnGtkReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved2 in) {
        JnaEntryBufferClass.OnGtkReserved2 out = null;
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
    
    private static JnaEntryBufferClass.OnGtkReserved3 toOnGtkReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved3 in) {
        JnaEntryBufferClass.OnGtkReserved3 out = null;
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
    
    private static JnaEntryBufferClass.OnGtkReserved4 toOnGtkReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved4 in) {
        JnaEntryBufferClass.OnGtkReserved4 out = null;
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
    
    private static JnaEntryBufferClass.OnGtkReserved5 toOnGtkReserved5(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved5 in) {
        JnaEntryBufferClass.OnGtkReserved5 out = null;
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
    
    private static JnaEntryBufferClass.OnGtkReserved6 toOnGtkReserved6(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved6 in) {
        JnaEntryBufferClass.OnGtkReserved6 out = null;
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
    
    private static JnaEntryBufferClass.OnGtkReserved7 toOnGtkReserved7(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved7 in) {
        JnaEntryBufferClass.OnGtkReserved7 out = null;
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
    
    private static JnaEntryBufferClass.OnGtkReserved8 toOnGtkReserved8(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved8 in) {
        JnaEntryBufferClass.OnGtkReserved8 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved8(__callback);
            __callback.register(out);
        }
        return out;
    }

    public EntryBufferClass(PointerContainer pointer) {
        super(pointer);
    }

    public EntryBufferClass() {
        super(cast(JnaEntryBufferClass.allocateStructure()));
    }

    private JnaEntryBufferClass.Fields _fields;
    
    JnaEntryBufferClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaEntryBufferClass.Fields(asCPointer());
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
     * <br>See {@link OnInsertedText#onInsertedText}
    */
    public static final String INSERTED_TEXT = "inserted_text";

    /**
     * 
     * <br>See {@link OnInsertedText#onInsertedText}
    */
    public void setFieldInsertedText(OnInsertedText inserted_text) {
        toFields().inserted_text = toOnInsertedText(this, INSERTED_TEXT, inserted_text);
        toFields().writeField(INSERTED_TEXT);
    }

    /**
     * 
     * <br>See {@link OnInsertedText#onInsertedText}
    */
    public JnaEntryBufferClass.OnInsertedText getFieldInsertedText() {
       toFields().readField(INSERTED_TEXT);
       return toFields().inserted_text;
    } 

    /**
     * 
     * <br>See {@link OnDeletedText#onDeletedText}
    */
    public static final String DELETED_TEXT = "deleted_text";

    /**
     * 
     * <br>See {@link OnDeletedText#onDeletedText}
    */
    public void setFieldDeletedText(OnDeletedText deleted_text) {
        toFields().deleted_text = toOnDeletedText(this, DELETED_TEXT, deleted_text);
        toFields().writeField(DELETED_TEXT);
    }

    /**
     * 
     * <br>See {@link OnDeletedText#onDeletedText}
    */
    public JnaEntryBufferClass.OnDeletedText getFieldDeletedText() {
       toFields().readField(DELETED_TEXT);
       return toFields().deleted_text;
    } 

    /**
     * 
     * <br>See {@link OnGetText#onGetText}
    */
    public static final String GET_TEXT = "get_text";

    /**
     * 
     * <br>See {@link OnGetText#onGetText}
    */
    public void setFieldGetText(OnGetText get_text) {
        toFields().get_text = toOnGetText(this, GET_TEXT, get_text);
        toFields().writeField(GET_TEXT);
    }

    /**
     * 
     * <br>See {@link OnGetText#onGetText}
    */
    public JnaEntryBufferClass.OnGetText getFieldGetText() {
       toFields().readField(GET_TEXT);
       return toFields().get_text;
    } 

    /**
     * 
     * <br>See {@link OnGetLength#onGetLength}
    */
    public static final String GET_LENGTH = "get_length";

    /**
     * 
     * <br>See {@link OnGetLength#onGetLength}
    */
    public void setFieldGetLength(OnGetLength get_length) {
        toFields().get_length = toOnGetLength(this, GET_LENGTH, get_length);
        toFields().writeField(GET_LENGTH);
    }

    /**
     * 
     * <br>See {@link OnGetLength#onGetLength}
    */
    public JnaEntryBufferClass.OnGetLength getFieldGetLength() {
       toFields().readField(GET_LENGTH);
       return toFields().get_length;
    } 

    /**
     * 
     * <br>See {@link OnInsertText#onInsertText}
    */
    public static final String INSERT_TEXT = "insert_text";

    /**
     * 
     * <br>See {@link OnInsertText#onInsertText}
    */
    public void setFieldInsertText(OnInsertText insert_text) {
        toFields().insert_text = toOnInsertText(this, INSERT_TEXT, insert_text);
        toFields().writeField(INSERT_TEXT);
    }

    /**
     * 
     * <br>See {@link OnInsertText#onInsertText}
    */
    public JnaEntryBufferClass.OnInsertText getFieldInsertText() {
       toFields().readField(INSERT_TEXT);
       return toFields().insert_text;
    } 

    /**
     * 
     * <br>See {@link OnDeleteText#onDeleteText}
    */
    public static final String DELETE_TEXT = "delete_text";

    /**
     * 
     * <br>See {@link OnDeleteText#onDeleteText}
    */
    public void setFieldDeleteText(OnDeleteText delete_text) {
        toFields().delete_text = toOnDeleteText(this, DELETE_TEXT, delete_text);
        toFields().writeField(DELETE_TEXT);
    }

    /**
     * 
     * <br>See {@link OnDeleteText#onDeleteText}
    */
    public JnaEntryBufferClass.OnDeleteText getFieldDeleteText() {
       toFields().readField(DELETE_TEXT);
       return toFields().delete_text;
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
    public JnaEntryBufferClass.OnGtkReserved1 getFieldGtkReserved1() {
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
    public JnaEntryBufferClass.OnGtkReserved2 getFieldGtkReserved2() {
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
    public JnaEntryBufferClass.OnGtkReserved3 getFieldGtkReserved3() {
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
    public JnaEntryBufferClass.OnGtkReserved4 getFieldGtkReserved4() {
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
    public JnaEntryBufferClass.OnGtkReserved5 getFieldGtkReserved5() {
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
    public JnaEntryBufferClass.OnGtkReserved6 getFieldGtkReserved6() {
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
    public JnaEntryBufferClass.OnGtkReserved7 getFieldGtkReserved7() {
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
    public JnaEntryBufferClass.OnGtkReserved8 getFieldGtkReserved8() {
       toFields().readField(_GTK_RESERVED8);
       return toFields()._gtk_reserved8;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(EntryBuffer.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(EntryBuffer.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
