/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaApplicationCommandLineClass {

    @FunctionalInterface
    public interface OnPrintLiteral extends com.sun.jna.Callback {
        void invoke(long cmdline, long message);
    }

    @FunctionalInterface
    public interface OnPrinterrLiteral extends com.sun.jna.Callback {
        void invoke(long cmdline, long message);
    }

    @FunctionalInterface
    public interface OnGetStdin extends com.sun.jna.Callback {
        long invoke(long cmdline);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ApplicationCommandLineClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ApplicationCommandLineClass.PARENT_CLASS, ApplicationCommandLineClass.PRINT_LITERAL, ApplicationCommandLineClass.PRINTERR_LITERAL, ApplicationCommandLineClass.GET_STDIN})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnPrintLiteral print_literal;
        public OnPrinterrLiteral printerr_literal;
        public OnGetStdin get_stdin;
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
