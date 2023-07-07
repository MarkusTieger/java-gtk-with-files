/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;




class JnaPixbufFormat {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("PixbufFormat size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({PixbufFormat.NAME, PixbufFormat.SIGNATURE, PixbufFormat.DOMAIN, PixbufFormat.DESCRIPTION})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long name;
        public long signature;
        public long domain;
        public long description;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gdk_pixbuf-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_pixbuf_format_copy(long _self);
        void gdk_pixbuf_format_free(long _self);
        long gdk_pixbuf_format_get_description(long _self);
        long gdk_pixbuf_format_get_license(long _self);
        long gdk_pixbuf_format_get_name(long _self);
        boolean gdk_pixbuf_format_is_disabled(long _self);
        boolean gdk_pixbuf_format_is_save_option_supported(long _self, long option_key);
        boolean gdk_pixbuf_format_is_save_option_supported(long _self, String option_key);
        boolean gdk_pixbuf_format_is_scalable(long _self);
        boolean gdk_pixbuf_format_is_writable(long _self);
        void gdk_pixbuf_format_set_disabled(long _self, boolean disabled);
        long gdk_pixbuf_format_get_type();
    }

}
