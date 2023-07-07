/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaRecentManagerClass {

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long manager);
    }

    @FunctionalInterface
    public interface OnGtkRecent1 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkRecent2 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkRecent3 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkRecent4 extends com.sun.jna.Callback {
        void invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("RecentManagerClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({RecentManagerClass.PARENT_CLASS, RecentManagerClass.CHANGED, RecentManagerClass._GTK_RECENT1, RecentManagerClass._GTK_RECENT2, RecentManagerClass._GTK_RECENT3, RecentManagerClass._GTK_RECENT4})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnChanged changed;
        public OnGtkRecent1 _gtk_recent1;
        public OnGtkRecent2 _gtk_recent2;
        public OnGtkRecent3 _gtk_recent3;
        public OnGtkRecent4 _gtk_recent4;
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
