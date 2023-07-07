/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.MediaStreamClass.html">https://docs.gtk.org/gtk4/struct.MediaStreamClass.html</a></p>
*/
public class MediaStreamClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MediaStreamClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnPlay {
        /**
         * 
         * @param self 
         * @return 
        */
        boolean onPlay(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MediaStream self);
    }
    
    private static JnaMediaStreamClass.OnPlay toOnPlay(ch.bailu.gtk.type.Pointer instance, String methodName, OnPlay in) {
        JnaMediaStreamClass.OnPlay out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self) -> in.onPlay(__callback, new MediaStream(new PointerContainer(_self)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPause {
        /**
         * 
         * @param self a `GtkMediaStream`
        */
        void onPause(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MediaStream self);
    }
    
    private static JnaMediaStreamClass.OnPause toOnPause(ch.bailu.gtk.type.Pointer instance, String methodName, OnPause in) {
        JnaMediaStreamClass.OnPause out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self) -> in.onPause(__callback, new MediaStream(new PointerContainer(_self)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSeek {
        /**
         * 
         * @param self a `GtkMediaStream`
         * @param timestamp timestamp to seek to.
        */
        void onSeek(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MediaStream self, long timestamp);
    }
    
    private static JnaMediaStreamClass.OnSeek toOnSeek(ch.bailu.gtk.type.Pointer instance, String methodName, OnSeek in) {
        JnaMediaStreamClass.OnSeek out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _timestamp) -> in.onSeek(__callback, new MediaStream(new PointerContainer(_self)), _timestamp);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUpdateAudio {
        /**
         * 
         * @param self 
         * @param muted 
         * @param volume 
        */
        void onUpdateAudio(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MediaStream self, boolean muted, double volume);
    }
    
    private static JnaMediaStreamClass.OnUpdateAudio toOnUpdateAudio(ch.bailu.gtk.type.Pointer instance, String methodName, OnUpdateAudio in) {
        JnaMediaStreamClass.OnUpdateAudio out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _muted, _volume) -> in.onUpdateAudio(__callback, new MediaStream(new PointerContainer(_self)), _muted, _volume);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRealize {
        /**
         * 
         * @param self a `GtkMediaStream`
         * @param surface a `GdkSurface`
        */
        void onRealize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MediaStream self, @Nonnull ch.bailu.gtk.gdk.Surface surface);
    }
    
    private static JnaMediaStreamClass.OnRealize toOnRealize(ch.bailu.gtk.type.Pointer instance, String methodName, OnRealize in) {
        JnaMediaStreamClass.OnRealize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _surface) -> in.onRealize(__callback, new MediaStream(new PointerContainer(_self)), new ch.bailu.gtk.gdk.Surface(new PointerContainer(_surface)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnrealize {
        /**
         * 
         * @param self a `GtkMediaStream` previously realized
         * @param surface the `GdkSurface` the stream was realized with
        */
        void onUnrealize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MediaStream self, @Nonnull ch.bailu.gtk.gdk.Surface surface);
    }
    
    private static JnaMediaStreamClass.OnUnrealize toOnUnrealize(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnrealize in) {
        JnaMediaStreamClass.OnUnrealize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _surface) -> in.onUnrealize(__callback, new MediaStream(new PointerContainer(_self)), new ch.bailu.gtk.gdk.Surface(new PointerContainer(_surface)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved1 {
        void onGtkReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaMediaStreamClass.OnGtkReserved1 toOnGtkReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved1 in) {
        JnaMediaStreamClass.OnGtkReserved1 out = null;
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
    
    private static JnaMediaStreamClass.OnGtkReserved2 toOnGtkReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved2 in) {
        JnaMediaStreamClass.OnGtkReserved2 out = null;
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
    
    private static JnaMediaStreamClass.OnGtkReserved3 toOnGtkReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved3 in) {
        JnaMediaStreamClass.OnGtkReserved3 out = null;
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
    
    private static JnaMediaStreamClass.OnGtkReserved4 toOnGtkReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved4 in) {
        JnaMediaStreamClass.OnGtkReserved4 out = null;
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
    
    private static JnaMediaStreamClass.OnGtkReserved5 toOnGtkReserved5(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved5 in) {
        JnaMediaStreamClass.OnGtkReserved5 out = null;
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
    
    private static JnaMediaStreamClass.OnGtkReserved6 toOnGtkReserved6(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved6 in) {
        JnaMediaStreamClass.OnGtkReserved6 out = null;
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
    
    private static JnaMediaStreamClass.OnGtkReserved7 toOnGtkReserved7(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved7 in) {
        JnaMediaStreamClass.OnGtkReserved7 out = null;
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
    
    private static JnaMediaStreamClass.OnGtkReserved8 toOnGtkReserved8(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved8 in) {
        JnaMediaStreamClass.OnGtkReserved8 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved8(__callback);
            __callback.register(out);
        }
        return out;
    }

    public MediaStreamClass(PointerContainer pointer) {
        super(pointer);
    }

    public MediaStreamClass() {
        super(cast(JnaMediaStreamClass.allocateStructure()));
    }

    private JnaMediaStreamClass.Fields _fields;
    
    JnaMediaStreamClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaMediaStreamClass.Fields(asCPointer());
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
     * <br>See {@link OnPlay#onPlay}
    */
    public static final String PLAY = "play";

    /**
     * 
     * <br>See {@link OnPlay#onPlay}
    */
    public void setFieldPlay(OnPlay play) {
        toFields().play = toOnPlay(this, PLAY, play);
        toFields().writeField(PLAY);
    }

    /**
     * 
     * <br>See {@link OnPlay#onPlay}
    */
    public JnaMediaStreamClass.OnPlay getFieldPlay() {
       toFields().readField(PLAY);
       return toFields().play;
    } 

    /**
     * 
     * <br>See {@link OnPause#onPause}
    */
    public static final String PAUSE = "pause";

    /**
     * 
     * <br>See {@link OnPause#onPause}
    */
    public void setFieldPause(OnPause pause) {
        toFields().pause = toOnPause(this, PAUSE, pause);
        toFields().writeField(PAUSE);
    }

    /**
     * 
     * <br>See {@link OnPause#onPause}
    */
    public JnaMediaStreamClass.OnPause getFieldPause() {
       toFields().readField(PAUSE);
       return toFields().pause;
    } 

    /**
     * 
     * <br>See {@link OnSeek#onSeek}
    */
    public static final String SEEK = "seek";

    /**
     * 
     * <br>See {@link OnSeek#onSeek}
    */
    public void setFieldSeek(OnSeek seek) {
        toFields().seek = toOnSeek(this, SEEK, seek);
        toFields().writeField(SEEK);
    }

    /**
     * 
     * <br>See {@link OnSeek#onSeek}
    */
    public JnaMediaStreamClass.OnSeek getFieldSeek() {
       toFields().readField(SEEK);
       return toFields().seek;
    } 

    /**
     * 
     * <br>See {@link OnUpdateAudio#onUpdateAudio}
    */
    public static final String UPDATE_AUDIO = "update_audio";

    /**
     * 
     * <br>See {@link OnUpdateAudio#onUpdateAudio}
    */
    public void setFieldUpdateAudio(OnUpdateAudio update_audio) {
        toFields().update_audio = toOnUpdateAudio(this, UPDATE_AUDIO, update_audio);
        toFields().writeField(UPDATE_AUDIO);
    }

    /**
     * 
     * <br>See {@link OnUpdateAudio#onUpdateAudio}
    */
    public JnaMediaStreamClass.OnUpdateAudio getFieldUpdateAudio() {
       toFields().readField(UPDATE_AUDIO);
       return toFields().update_audio;
    } 

    /**
     * 
     * <br>See {@link OnRealize#onRealize}
    */
    public static final String REALIZE = "realize";

    /**
     * 
     * <br>See {@link OnRealize#onRealize}
    */
    public void setFieldRealize(OnRealize realize) {
        toFields().realize = toOnRealize(this, REALIZE, realize);
        toFields().writeField(REALIZE);
    }

    /**
     * 
     * <br>See {@link OnRealize#onRealize}
    */
    public JnaMediaStreamClass.OnRealize getFieldRealize() {
       toFields().readField(REALIZE);
       return toFields().realize;
    } 

    /**
     * 
     * <br>See {@link OnUnrealize#onUnrealize}
    */
    public static final String UNREALIZE = "unrealize";

    /**
     * 
     * <br>See {@link OnUnrealize#onUnrealize}
    */
    public void setFieldUnrealize(OnUnrealize unrealize) {
        toFields().unrealize = toOnUnrealize(this, UNREALIZE, unrealize);
        toFields().writeField(UNREALIZE);
    }

    /**
     * 
     * <br>See {@link OnUnrealize#onUnrealize}
    */
    public JnaMediaStreamClass.OnUnrealize getFieldUnrealize() {
       toFields().readField(UNREALIZE);
       return toFields().unrealize;
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
    public JnaMediaStreamClass.OnGtkReserved1 getFieldGtkReserved1() {
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
    public JnaMediaStreamClass.OnGtkReserved2 getFieldGtkReserved2() {
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
    public JnaMediaStreamClass.OnGtkReserved3 getFieldGtkReserved3() {
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
    public JnaMediaStreamClass.OnGtkReserved4 getFieldGtkReserved4() {
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
    public JnaMediaStreamClass.OnGtkReserved5 getFieldGtkReserved5() {
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
    public JnaMediaStreamClass.OnGtkReserved6 getFieldGtkReserved6() {
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
    public JnaMediaStreamClass.OnGtkReserved7 getFieldGtkReserved7() {
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
    public JnaMediaStreamClass.OnGtkReserved8 getFieldGtkReserved8() {
       toFields().readField(_GTK_RESERVED8);
       return toFields()._gtk_reserved8;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MediaStream.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MediaStream.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
