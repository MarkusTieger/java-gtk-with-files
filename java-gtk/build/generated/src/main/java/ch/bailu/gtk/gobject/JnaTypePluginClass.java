/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaTypePluginClass {

    @FunctionalInterface
    public interface OnTypePluginUse extends com.sun.jna.Callback {
        void invoke(long plugin);
    }

    @FunctionalInterface
    public interface OnTypePluginUnuse extends com.sun.jna.Callback {
        void invoke(long plugin);
    }

    @FunctionalInterface
    public interface OnTypePluginCompleteTypeInfo extends com.sun.jna.Callback {
        void invoke(long plugin, long g_type, long info, long value_table);
    }

    @FunctionalInterface
    public interface OnTypePluginCompleteInterfaceInfo extends com.sun.jna.Callback {
        void invoke(long plugin, long instance_type, long interface_type, long info);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TypePluginClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TypePluginClass.BASE_IFACE, TypePluginClass.USE_PLUGIN, TypePluginClass.UNUSE_PLUGIN, TypePluginClass.COMPLETE_TYPE_INFO, TypePluginClass.COMPLETE_INTERFACE_INFO})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] base_iface = new byte[TypeInterface.getInstanceSize()];
        public OnTypePluginUse use_plugin;
        public OnTypePluginUnuse unuse_plugin;
        public OnTypePluginCompleteTypeInfo complete_type_info;
        public OnTypePluginCompleteInterfaceInfo complete_interface_info;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
