/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for &#35;GSocketControlMessage.
 * <p><a href="https://docs.gtk.org/gio/struct.SocketControlMessageClass.html">https://docs.gtk.org/gio/struct.SocketControlMessageClass.html</a></p>
*/
public class SocketControlMessageClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SocketControlMessageClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetSize {
        /**
         * 
         * @param message a &#35;GSocketControlMessage
         * @return The number of bytes required.
        */
        long onGetSize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SocketControlMessage message);
    }
    
    private static JnaSocketControlMessageClass.OnGetSize toOnGetSize(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetSize in) {
        JnaSocketControlMessageClass.OnGetSize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_message) -> in.onGetSize(__callback, new SocketControlMessage(new PointerContainer(_message)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetLevel {
        /**
         * 
         * @param message a &#35;GSocketControlMessage
         * @return an integer describing the level
        */
        int onGetLevel(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SocketControlMessage message);
    }
    
    private static JnaSocketControlMessageClass.OnGetLevel toOnGetLevel(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetLevel in) {
        JnaSocketControlMessageClass.OnGetLevel out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_message) -> in.onGetLevel(__callback, new SocketControlMessage(new PointerContainer(_message)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetType {
        /**
         * 
         * @param message 
         * @return 
        */
        int onGetType(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SocketControlMessage message);
    }
    
    private static JnaSocketControlMessageClass.OnGetType toOnGetType(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetType in) {
        JnaSocketControlMessageClass.OnGetType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_message) -> in.onGetType(__callback, new SocketControlMessage(new PointerContainer(_message)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSerialize {
        /**
         * 
         * @param message a &#35;GSocketControlMessage
         * @param data A buffer to write data to
        */
        void onSerialize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SocketControlMessage message, @Nonnull ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaSocketControlMessageClass.OnSerialize toOnSerialize(ch.bailu.gtk.type.Pointer instance, String methodName, OnSerialize in) {
        JnaSocketControlMessageClass.OnSerialize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_message, _data) -> in.onSerialize(__callback, new SocketControlMessage(new PointerContainer(_message)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDeserialize {
        /**
         * 
         * @param level 
         * @param type 
         * @param size 
         * @param data 
         * @return 
        */
        SocketControlMessage onDeserialize(ch.bailu.gtk.lib.handler.CallbackHandler __self, int level, int type, long size, @Nonnull ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaSocketControlMessageClass.OnDeserialize toOnDeserialize(ch.bailu.gtk.type.Pointer instance, String methodName, OnDeserialize in) {
        JnaSocketControlMessageClass.OnDeserialize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_level, _type, _size, _data) -> in.onDeserialize(__callback, _level, _type, _size, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved1 {
        void onGReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaSocketControlMessageClass.OnGReserved1 toOnGReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved1 in) {
        JnaSocketControlMessageClass.OnGReserved1 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved1(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved2 {
        void onGReserved2(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaSocketControlMessageClass.OnGReserved2 toOnGReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved2 in) {
        JnaSocketControlMessageClass.OnGReserved2 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved2(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved3 {
        void onGReserved3(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaSocketControlMessageClass.OnGReserved3 toOnGReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved3 in) {
        JnaSocketControlMessageClass.OnGReserved3 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved3(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved4 {
        void onGReserved4(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaSocketControlMessageClass.OnGReserved4 toOnGReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved4 in) {
        JnaSocketControlMessageClass.OnGReserved4 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved4(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved5 {
        void onGReserved5(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaSocketControlMessageClass.OnGReserved5 toOnGReserved5(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved5 in) {
        JnaSocketControlMessageClass.OnGReserved5 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved5(__callback);
            __callback.register(out);
        }
        return out;
    }

    public SocketControlMessageClass(PointerContainer pointer) {
        super(pointer);
    }

    public SocketControlMessageClass() {
        super(cast(JnaSocketControlMessageClass.allocateStructure()));
    }

    private JnaSocketControlMessageClass.Fields _fields;
    
    JnaSocketControlMessageClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSocketControlMessageClass.Fields(asCPointer());
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
     * <br>See {@link OnGetSize#onGetSize}
    */
    public static final String GET_SIZE = "get_size";

    /**
     * 
     * <br>See {@link OnGetSize#onGetSize}
    */
    public void setFieldGetSize(OnGetSize get_size) {
        toFields().get_size = toOnGetSize(this, GET_SIZE, get_size);
        toFields().writeField(GET_SIZE);
    }

    /**
     * 
     * <br>See {@link OnGetSize#onGetSize}
    */
    public JnaSocketControlMessageClass.OnGetSize getFieldGetSize() {
       toFields().readField(GET_SIZE);
       return toFields().get_size;
    } 

    /**
     * 
     * <br>See {@link OnGetLevel#onGetLevel}
    */
    public static final String GET_LEVEL = "get_level";

    /**
     * 
     * <br>See {@link OnGetLevel#onGetLevel}
    */
    public void setFieldGetLevel(OnGetLevel get_level) {
        toFields().get_level = toOnGetLevel(this, GET_LEVEL, get_level);
        toFields().writeField(GET_LEVEL);
    }

    /**
     * 
     * <br>See {@link OnGetLevel#onGetLevel}
    */
    public JnaSocketControlMessageClass.OnGetLevel getFieldGetLevel() {
       toFields().readField(GET_LEVEL);
       return toFields().get_level;
    } 

    /**
     * 
     * <br>See {@link OnGetType#onGetType}
    */
    public static final String GET_TYPE = "get_type";

    /**
     * 
     * <br>See {@link OnGetType#onGetType}
    */
    public void setFieldGetType(OnGetType get_type) {
        toFields().get_type = toOnGetType(this, GET_TYPE, get_type);
        toFields().writeField(GET_TYPE);
    }

    /**
     * 
     * <br>See {@link OnGetType#onGetType}
    */
    public JnaSocketControlMessageClass.OnGetType getFieldGetType() {
       toFields().readField(GET_TYPE);
       return toFields().get_type;
    } 

    /**
     * 
     * <br>See {@link OnSerialize#onSerialize}
    */
    public static final String SERIALIZE = "serialize";

    /**
     * 
     * <br>See {@link OnSerialize#onSerialize}
    */
    public void setFieldSerialize(OnSerialize serialize) {
        toFields().serialize = toOnSerialize(this, SERIALIZE, serialize);
        toFields().writeField(SERIALIZE);
    }

    /**
     * 
     * <br>See {@link OnSerialize#onSerialize}
    */
    public JnaSocketControlMessageClass.OnSerialize getFieldSerialize() {
       toFields().readField(SERIALIZE);
       return toFields().serialize;
    } 

    /**
     * 
     * <br>See {@link OnDeserialize#onDeserialize}
    */
    public static final String DESERIALIZE = "deserialize";

    /**
     * 
     * <br>See {@link OnDeserialize#onDeserialize}
    */
    public void setFieldDeserialize(OnDeserialize deserialize) {
        toFields().deserialize = toOnDeserialize(this, DESERIALIZE, deserialize);
        toFields().writeField(DESERIALIZE);
    }

    /**
     * 
     * <br>See {@link OnDeserialize#onDeserialize}
    */
    public JnaSocketControlMessageClass.OnDeserialize getFieldDeserialize() {
       toFields().readField(DESERIALIZE);
       return toFields().deserialize;
    } 

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public static final String _G_RESERVED1 = "_g_reserved1";

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public void setFieldGReserved1(OnGReserved1 _g_reserved1) {
        toFields()._g_reserved1 = toOnGReserved1(this, _G_RESERVED1, _g_reserved1);
        toFields().writeField(_G_RESERVED1);
    }

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public JnaSocketControlMessageClass.OnGReserved1 getFieldGReserved1() {
       toFields().readField(_G_RESERVED1);
       return toFields()._g_reserved1;
    } 

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public static final String _G_RESERVED2 = "_g_reserved2";

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public void setFieldGReserved2(OnGReserved2 _g_reserved2) {
        toFields()._g_reserved2 = toOnGReserved2(this, _G_RESERVED2, _g_reserved2);
        toFields().writeField(_G_RESERVED2);
    }

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public JnaSocketControlMessageClass.OnGReserved2 getFieldGReserved2() {
       toFields().readField(_G_RESERVED2);
       return toFields()._g_reserved2;
    } 

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public static final String _G_RESERVED3 = "_g_reserved3";

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public void setFieldGReserved3(OnGReserved3 _g_reserved3) {
        toFields()._g_reserved3 = toOnGReserved3(this, _G_RESERVED3, _g_reserved3);
        toFields().writeField(_G_RESERVED3);
    }

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public JnaSocketControlMessageClass.OnGReserved3 getFieldGReserved3() {
       toFields().readField(_G_RESERVED3);
       return toFields()._g_reserved3;
    } 

    /**
     * 
     * <br>See {@link OnGReserved4#onGReserved4}
    */
    public static final String _G_RESERVED4 = "_g_reserved4";

    /**
     * 
     * <br>See {@link OnGReserved4#onGReserved4}
    */
    public void setFieldGReserved4(OnGReserved4 _g_reserved4) {
        toFields()._g_reserved4 = toOnGReserved4(this, _G_RESERVED4, _g_reserved4);
        toFields().writeField(_G_RESERVED4);
    }

    /**
     * 
     * <br>See {@link OnGReserved4#onGReserved4}
    */
    public JnaSocketControlMessageClass.OnGReserved4 getFieldGReserved4() {
       toFields().readField(_G_RESERVED4);
       return toFields()._g_reserved4;
    } 

    /**
     * 
     * <br>See {@link OnGReserved5#onGReserved5}
    */
    public static final String _G_RESERVED5 = "_g_reserved5";

    /**
     * 
     * <br>See {@link OnGReserved5#onGReserved5}
    */
    public void setFieldGReserved5(OnGReserved5 _g_reserved5) {
        toFields()._g_reserved5 = toOnGReserved5(this, _G_RESERVED5, _g_reserved5);
        toFields().writeField(_G_RESERVED5);
    }

    /**
     * 
     * <br>See {@link OnGReserved5#onGReserved5}
    */
    public JnaSocketControlMessageClass.OnGReserved5 getFieldGReserved5() {
       toFields().readField(_G_RESERVED5);
       return toFields()._g_reserved5;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SocketControlMessage.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SocketControlMessage.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
