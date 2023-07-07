/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaContentProviderClass {

    @FunctionalInterface
    public interface OnContentChanged extends com.sun.jna.Callback {
        void invoke(long provider);
    }

    @FunctionalInterface
    public interface OnAttachClipboard extends com.sun.jna.Callback {
        void invoke(long provider, long clipboard);
    }

    @FunctionalInterface
    public interface OnDetachClipboard extends com.sun.jna.Callback {
        void invoke(long provider, long clipboard);
    }

    @FunctionalInterface
    public interface OnRefFormats extends com.sun.jna.Callback {
        long invoke(long provider);
    }

    @FunctionalInterface
    public interface OnRefStorableFormats extends com.sun.jna.Callback {
        long invoke(long provider);
    }

    @FunctionalInterface
    public interface OnWriteMimeTypeAsync extends com.sun.jna.Callback {
        void invoke(long provider, long mime_type, long stream, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnWriteMimeTypeFinish extends com.sun.jna.Callback {
        boolean invoke(long provider, long result, long _error);
    }

    @FunctionalInterface
    public interface OnGetValue extends com.sun.jna.Callback {
        boolean invoke(long provider, long value, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ContentProviderClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ContentProviderClass.PARENT_CLASS, ContentProviderClass.CONTENT_CHANGED, ContentProviderClass.ATTACH_CLIPBOARD, ContentProviderClass.DETACH_CLIPBOARD, ContentProviderClass.REF_FORMATS, ContentProviderClass.REF_STORABLE_FORMATS, ContentProviderClass.WRITE_MIME_TYPE_ASYNC, ContentProviderClass.WRITE_MIME_TYPE_FINISH, ContentProviderClass.GET_VALUE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnContentChanged content_changed;
        public OnAttachClipboard attach_clipboard;
        public OnDetachClipboard detach_clipboard;
        public OnRefFormats ref_formats;
        public OnRefStorableFormats ref_storable_formats;
        public OnWriteMimeTypeAsync write_mime_type_async;
        public OnWriteMimeTypeFinish write_mime_type_finish;
        public OnGetValue get_value;
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
