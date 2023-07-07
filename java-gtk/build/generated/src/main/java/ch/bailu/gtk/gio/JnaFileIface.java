/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaFileIface {

    @FunctionalInterface
    public interface OnDup extends com.sun.jna.Callback {
        long invoke(long file);
    }

    @FunctionalInterface
    public interface OnHash extends com.sun.jna.Callback {
        int invoke(long file);
    }

    @FunctionalInterface
    public interface OnEqual extends com.sun.jna.Callback {
        boolean invoke(long file1, long file2);
    }

    @FunctionalInterface
    public interface OnIsNative extends com.sun.jna.Callback {
        boolean invoke(long file);
    }

    @FunctionalInterface
    public interface OnHasUriScheme extends com.sun.jna.Callback {
        boolean invoke(long file, long uri_scheme);
    }

    @FunctionalInterface
    public interface OnGetUriScheme extends com.sun.jna.Callback {
        long invoke(long file);
    }

    @FunctionalInterface
    public interface OnGetBasename extends com.sun.jna.Callback {
        long invoke(long file);
    }

    @FunctionalInterface
    public interface OnGetPath extends com.sun.jna.Callback {
        long invoke(long file);
    }

    @FunctionalInterface
    public interface OnGetUri extends com.sun.jna.Callback {
        long invoke(long file);
    }

    @FunctionalInterface
    public interface OnGetParseName extends com.sun.jna.Callback {
        long invoke(long file);
    }

    @FunctionalInterface
    public interface OnGetParent extends com.sun.jna.Callback {
        long invoke(long file);
    }

    @FunctionalInterface
    public interface OnPrefixMatches extends com.sun.jna.Callback {
        boolean invoke(long prefix, long file);
    }

    @FunctionalInterface
    public interface OnGetRelativePath extends com.sun.jna.Callback {
        long invoke(long parent, long descendant);
    }

    @FunctionalInterface
    public interface OnResolveRelativePath extends com.sun.jna.Callback {
        long invoke(long file, long relative_path);
    }

    @FunctionalInterface
    public interface OnGetChildForDisplayName extends com.sun.jna.Callback {
        long invoke(long file, long display_name, long _error);
    }

    @FunctionalInterface
    public interface OnEnumerateChildren extends com.sun.jna.Callback {
        long invoke(long file, long attributes, int flags, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnEnumerateChildrenAsync extends com.sun.jna.Callback {
        void invoke(long file, long attributes, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnEnumerateChildrenFinish extends com.sun.jna.Callback {
        long invoke(long file, long res, long _error);
    }

    @FunctionalInterface
    public interface OnQueryInfo extends com.sun.jna.Callback {
        long invoke(long file, long attributes, int flags, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnQueryInfoAsync extends com.sun.jna.Callback {
        void invoke(long file, long attributes, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnQueryInfoFinish extends com.sun.jna.Callback {
        long invoke(long file, long res, long _error);
    }

    @FunctionalInterface
    public interface OnQueryFilesystemInfo extends com.sun.jna.Callback {
        long invoke(long file, long attributes, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnQueryFilesystemInfoAsync extends com.sun.jna.Callback {
        void invoke(long file, long attributes, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnQueryFilesystemInfoFinish extends com.sun.jna.Callback {
        long invoke(long file, long res, long _error);
    }

    @FunctionalInterface
    public interface OnFindEnclosingMount extends com.sun.jna.Callback {
        long invoke(long file, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnFindEnclosingMountAsync extends com.sun.jna.Callback {
        void invoke(long file, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnFindEnclosingMountFinish extends com.sun.jna.Callback {
        long invoke(long file, long res, long _error);
    }

    @FunctionalInterface
    public interface OnSetDisplayName extends com.sun.jna.Callback {
        long invoke(long file, long display_name, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnSetDisplayNameAsync extends com.sun.jna.Callback {
        void invoke(long file, long display_name, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnSetDisplayNameFinish extends com.sun.jna.Callback {
        long invoke(long file, long res, long _error);
    }

    @FunctionalInterface
    public interface OnQuerySettableAttributes extends com.sun.jna.Callback {
        long invoke(long file, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnQuerySettableAttributesAsync extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnQuerySettableAttributesFinish extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnQueryWritableNamespaces extends com.sun.jna.Callback {
        long invoke(long file, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnQueryWritableNamespacesAsync extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnQueryWritableNamespacesFinish extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnSetAttribute extends com.sun.jna.Callback {
        boolean invoke(long file, long attribute, int type, long value_p, int flags, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnSetAttributesFromInfo extends com.sun.jna.Callback {
        boolean invoke(long file, long info, int flags, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnSetAttributesAsync extends com.sun.jna.Callback {
        void invoke(long file, long info, int flags, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("FileIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({FileIface.G_IFACE, FileIface.DUP, FileIface.HASH, FileIface.EQUAL, FileIface.IS_NATIVE, FileIface.HAS_URI_SCHEME, FileIface.GET_URI_SCHEME, FileIface.GET_BASENAME, FileIface.GET_PATH, FileIface.GET_URI, FileIface.GET_PARSE_NAME, FileIface.GET_PARENT, FileIface.PREFIX_MATCHES, FileIface.GET_RELATIVE_PATH, FileIface.RESOLVE_RELATIVE_PATH, FileIface.GET_CHILD_FOR_DISPLAY_NAME, FileIface.ENUMERATE_CHILDREN, FileIface.ENUMERATE_CHILDREN_ASYNC, FileIface.ENUMERATE_CHILDREN_FINISH, FileIface.QUERY_INFO, FileIface.QUERY_INFO_ASYNC, FileIface.QUERY_INFO_FINISH, FileIface.QUERY_FILESYSTEM_INFO, FileIface.QUERY_FILESYSTEM_INFO_ASYNC, FileIface.QUERY_FILESYSTEM_INFO_FINISH, FileIface.FIND_ENCLOSING_MOUNT, FileIface.FIND_ENCLOSING_MOUNT_ASYNC, FileIface.FIND_ENCLOSING_MOUNT_FINISH, FileIface.SET_DISPLAY_NAME, FileIface.SET_DISPLAY_NAME_ASYNC, FileIface.SET_DISPLAY_NAME_FINISH, FileIface.QUERY_SETTABLE_ATTRIBUTES, FileIface._QUERY_SETTABLE_ATTRIBUTES_ASYNC, FileIface._QUERY_SETTABLE_ATTRIBUTES_FINISH, FileIface.QUERY_WRITABLE_NAMESPACES, FileIface._QUERY_WRITABLE_NAMESPACES_ASYNC, FileIface._QUERY_WRITABLE_NAMESPACES_FINISH, FileIface.SET_ATTRIBUTE, FileIface.SET_ATTRIBUTES_FROM_INFO, FileIface.SET_ATTRIBUTES_ASYNC})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnDup dup;
        public OnHash hash;
        public OnEqual equal;
        public OnIsNative is_native;
        public OnHasUriScheme has_uri_scheme;
        public OnGetUriScheme get_uri_scheme;
        public OnGetBasename get_basename;
        public OnGetPath get_path;
        public OnGetUri get_uri;
        public OnGetParseName get_parse_name;
        public OnGetParent get_parent;
        public OnPrefixMatches prefix_matches;
        public OnGetRelativePath get_relative_path;
        public OnResolveRelativePath resolve_relative_path;
        public OnGetChildForDisplayName get_child_for_display_name;
        public OnEnumerateChildren enumerate_children;
        public OnEnumerateChildrenAsync enumerate_children_async;
        public OnEnumerateChildrenFinish enumerate_children_finish;
        public OnQueryInfo query_info;
        public OnQueryInfoAsync query_info_async;
        public OnQueryInfoFinish query_info_finish;
        public OnQueryFilesystemInfo query_filesystem_info;
        public OnQueryFilesystemInfoAsync query_filesystem_info_async;
        public OnQueryFilesystemInfoFinish query_filesystem_info_finish;
        public OnFindEnclosingMount find_enclosing_mount;
        public OnFindEnclosingMountAsync find_enclosing_mount_async;
        public OnFindEnclosingMountFinish find_enclosing_mount_finish;
        public OnSetDisplayName set_display_name;
        public OnSetDisplayNameAsync set_display_name_async;
        public OnSetDisplayNameFinish set_display_name_finish;
        public OnQuerySettableAttributes query_settable_attributes;
        public OnQuerySettableAttributesAsync _query_settable_attributes_async;
        public OnQuerySettableAttributesFinish _query_settable_attributes_finish;
        public OnQueryWritableNamespaces query_writable_namespaces;
        public OnQueryWritableNamespacesAsync _query_writable_namespaces_async;
        public OnQueryWritableNamespacesFinish _query_writable_namespaces_finish;
        public OnSetAttribute set_attribute;
        public OnSetAttributesFromInfo set_attributes_from_info;
        public OnSetAttributesAsync set_attributes_async;
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
