/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaLogAttr {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("LogAttr size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({LogAttr.IS_LINE_BREAK, LogAttr.IS_MANDATORY_BREAK, LogAttr.IS_CHAR_BREAK, LogAttr.IS_WHITE, LogAttr.IS_CURSOR_POSITION, LogAttr.IS_WORD_START, LogAttr.IS_WORD_END, LogAttr.IS_SENTENCE_BOUNDARY, LogAttr.IS_SENTENCE_START, LogAttr.IS_SENTENCE_END, LogAttr.BACKSPACE_DELETES_CHARACTER, LogAttr.IS_EXPANDABLE_SPACE, LogAttr.IS_WORD_BOUNDARY, LogAttr.BREAK_INSERTS_HYPHEN, LogAttr.BREAK_REMOVES_PRECEDING, LogAttr.RESERVED})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int is_line_break;
        public int is_mandatory_break;
        public int is_char_break;
        public int is_white;
        public int is_cursor_position;
        public int is_word_start;
        public int is_word_end;
        public int is_sentence_boundary;
        public int is_sentence_start;
        public int is_sentence_end;
        public int backspace_deletes_character;
        public int is_expandable_space;
        public int is_word_boundary;
        public int break_inserts_hyphen;
        public int break_removes_preceding;
        public int reserved;
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
