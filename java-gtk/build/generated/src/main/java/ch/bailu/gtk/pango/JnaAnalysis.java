/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaAnalysis {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Analysis size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Analysis.SHAPE_ENGINE, Analysis.LANG_ENGINE, Analysis.FONT, Analysis.LEVEL, Analysis.GRAVITY, Analysis.FLAGS, Analysis.SCRIPT, Analysis.LANGUAGE, Analysis.EXTRA_ATTRS})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long shape_engine;
        public long lang_engine;
        public long font;
        public int level;
        public int gravity;
        public int flags;
        public int script;
        public long language;
        public long extra_attrs;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
