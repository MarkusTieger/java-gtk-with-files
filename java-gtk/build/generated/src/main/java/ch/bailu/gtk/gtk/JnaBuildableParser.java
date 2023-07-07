/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaBuildableParser {

    @FunctionalInterface
    public interface OnStartElement extends com.sun.jna.Callback {
        void invoke(long context, long element_name, long attribute_names, long attribute_values, long user_data, long _error);
    }

    @FunctionalInterface
    public interface OnEndElement extends com.sun.jna.Callback {
        void invoke(long context, long element_name, long user_data, long _error);
    }

    @FunctionalInterface
    public interface OnText extends com.sun.jna.Callback {
        void invoke(long context, long text, long text_len, long user_data, long _error);
    }

    @FunctionalInterface
    public interface OnError extends com.sun.jna.Callback {
        void invoke(long context, long error, long user_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("BuildableParser size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({BuildableParser.START_ELEMENT, BuildableParser.END_ELEMENT, BuildableParser.TEXT, BuildableParser.ERROR})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public OnStartElement start_element;
        public OnEndElement end_element;
        public OnText text;
        public OnError error;
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
