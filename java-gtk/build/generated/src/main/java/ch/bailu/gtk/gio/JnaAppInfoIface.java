/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaAppInfoIface {

    @FunctionalInterface
    public interface OnDup extends com.sun.jna.Callback {
        long invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnEqual extends com.sun.jna.Callback {
        boolean invoke(long appinfo1, long appinfo2);
    }

    @FunctionalInterface
    public interface OnGetId extends com.sun.jna.Callback {
        long invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnGetName extends com.sun.jna.Callback {
        long invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnGetDescription extends com.sun.jna.Callback {
        long invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnGetExecutable extends com.sun.jna.Callback {
        long invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnGetIcon extends com.sun.jna.Callback {
        long invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnLaunch extends com.sun.jna.Callback {
        boolean invoke(long appinfo, long files, long context, long _error);
    }

    @FunctionalInterface
    public interface OnSupportsUris extends com.sun.jna.Callback {
        boolean invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnSupportsFiles extends com.sun.jna.Callback {
        boolean invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnLaunchUris extends com.sun.jna.Callback {
        boolean invoke(long appinfo, long uris, long context, long _error);
    }

    @FunctionalInterface
    public interface OnShouldShow extends com.sun.jna.Callback {
        boolean invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnSetAsDefaultForType extends com.sun.jna.Callback {
        boolean invoke(long appinfo, long content_type, long _error);
    }

    @FunctionalInterface
    public interface OnSetAsDefaultForExtension extends com.sun.jna.Callback {
        boolean invoke(long appinfo, long extension, long _error);
    }

    @FunctionalInterface
    public interface OnAddSupportsType extends com.sun.jna.Callback {
        boolean invoke(long appinfo, long content_type, long _error);
    }

    @FunctionalInterface
    public interface OnCanRemoveSupportsType extends com.sun.jna.Callback {
        boolean invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnRemoveSupportsType extends com.sun.jna.Callback {
        boolean invoke(long appinfo, long content_type, long _error);
    }

    @FunctionalInterface
    public interface OnCanDelete extends com.sun.jna.Callback {
        boolean invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnDoDelete extends com.sun.jna.Callback {
        boolean invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnGetCommandline extends com.sun.jna.Callback {
        long invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnGetDisplayName extends com.sun.jna.Callback {
        long invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnSetAsLastUsedForType extends com.sun.jna.Callback {
        boolean invoke(long appinfo, long content_type, long _error);
    }

    @FunctionalInterface
    public interface OnGetSupportedTypes extends com.sun.jna.Callback {
        long invoke(long appinfo);
    }

    @FunctionalInterface
    public interface OnLaunchUrisAsync extends com.sun.jna.Callback {
        void invoke(long appinfo, long uris, long context, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnLaunchUrisFinish extends com.sun.jna.Callback {
        boolean invoke(long appinfo, long result, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("AppInfoIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({AppInfoIface.G_IFACE, AppInfoIface.DUP, AppInfoIface.EQUAL, AppInfoIface.GET_ID, AppInfoIface.GET_NAME, AppInfoIface.GET_DESCRIPTION, AppInfoIface.GET_EXECUTABLE, AppInfoIface.GET_ICON, AppInfoIface.LAUNCH, AppInfoIface.SUPPORTS_URIS, AppInfoIface.SUPPORTS_FILES, AppInfoIface.LAUNCH_URIS, AppInfoIface.SHOULD_SHOW, AppInfoIface.SET_AS_DEFAULT_FOR_TYPE, AppInfoIface.SET_AS_DEFAULT_FOR_EXTENSION, AppInfoIface.ADD_SUPPORTS_TYPE, AppInfoIface.CAN_REMOVE_SUPPORTS_TYPE, AppInfoIface.REMOVE_SUPPORTS_TYPE, AppInfoIface.CAN_DELETE, AppInfoIface.DO_DELETE, AppInfoIface.GET_COMMANDLINE, AppInfoIface.GET_DISPLAY_NAME, AppInfoIface.SET_AS_LAST_USED_FOR_TYPE, AppInfoIface.GET_SUPPORTED_TYPES, AppInfoIface.LAUNCH_URIS_ASYNC, AppInfoIface.LAUNCH_URIS_FINISH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnDup dup;
        public OnEqual equal;
        public OnGetId get_id;
        public OnGetName get_name;
        public OnGetDescription get_description;
        public OnGetExecutable get_executable;
        public OnGetIcon get_icon;
        public OnLaunch launch;
        public OnSupportsUris supports_uris;
        public OnSupportsFiles supports_files;
        public OnLaunchUris launch_uris;
        public OnShouldShow should_show;
        public OnSetAsDefaultForType set_as_default_for_type;
        public OnSetAsDefaultForExtension set_as_default_for_extension;
        public OnAddSupportsType add_supports_type;
        public OnCanRemoveSupportsType can_remove_supports_type;
        public OnRemoveSupportsType remove_supports_type;
        public OnCanDelete can_delete;
        public OnDoDelete do_delete;
        public OnGetCommandline get_commandline;
        public OnGetDisplayName get_display_name;
        public OnSetAsLastUsedForType set_as_last_used_for_type;
        public OnGetSupportedTypes get_supported_types;
        public OnLaunchUrisAsync launch_uris_async;
        public OnLaunchUrisFinish launch_uris_finish;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
