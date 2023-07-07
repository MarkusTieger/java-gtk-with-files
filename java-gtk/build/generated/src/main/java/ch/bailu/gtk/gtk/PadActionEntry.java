/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Struct defining a pad action entry.
 * <p><a href="https://docs.gtk.org/gtk4/struct.PadActionEntry.html">https://docs.gtk.org/gtk4/struct.PadActionEntry.html</a></p>
*/
public class PadActionEntry extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PadActionEntry.class.getCanonicalName());
    }

    public PadActionEntry(PointerContainer pointer) {
        super(pointer);
    }

    public PadActionEntry() {
        super(cast(JnaPadActionEntry.allocateStructure()));
    }

    private JnaPadActionEntry.Fields _fields;
    
    JnaPadActionEntry.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPadActionEntry.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the type of pad feature that will trigger this action entry.
    */
    public static final String TYPE = "type";

    /**
     * the type of pad feature that will trigger this action entry.
    */
    public void setFieldType(int type) {
        toFields().type = type;
        toFields().writeField(TYPE);
    }

    /**
     * the type of pad feature that will trigger this action entry.
    */
    public int getFieldType() {
       toFields().readField(TYPE);
       return toFields().type;
    } 

    /**
     * the 0-indexed button/ring/strip number that will trigger this action
     * <br>  entry.
    */
    public static final String INDEX = "index";

    /**
     * the 0-indexed button/ring/strip number that will trigger this action
     * <br>  entry.
    */
    public void setFieldIndex(int index) {
        toFields().index = index;
        toFields().writeField(INDEX);
    }

    /**
     * the 0-indexed button/ring/strip number that will trigger this action
     * <br>  entry.
    */
    public int getFieldIndex() {
       toFields().readField(INDEX);
       return toFields().index;
    } 

    /**
     * the mode that will trigger this action entry, or -1 for all modes.
    */
    public static final String MODE = "mode";

    /**
     * the mode that will trigger this action entry, or -1 for all modes.
    */
    public void setFieldMode(int mode) {
        toFields().mode = mode;
        toFields().writeField(MODE);
    }

    /**
     * the mode that will trigger this action entry, or -1 for all modes.
    */
    public int getFieldMode() {
       toFields().readField(MODE);
       return toFields().mode;
    } 

    /**
     * Human readable description of this action entry, this string should
     * <br>  be deemed user-visible.
    */
    public static final String LABEL = "label";

    /**
     * Human readable description of this action entry, this string should
     * <br>  be deemed user-visible.
    */
    public void setFieldLabel(ch.bailu.gtk.type.Str label) {
        toFields().label = label.asCPointer();
        toFields().writeField(LABEL);
    }

    /**
     * Human readable description of this action entry, this string should
     * <br>  be deemed user-visible.
    */
    public ch.bailu.gtk.type.Str getFieldLabel() {
       toFields().readField(LABEL);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().label));
    } 

    /**
     * action name that will be activated in the `GActionGroup`.
    */
    public static final String ACTION_NAME = "action_name";

    /**
     * action name that will be activated in the `GActionGroup`.
    */
    public void setFieldActionName(ch.bailu.gtk.type.Str action_name) {
        toFields().action_name = action_name.asCPointer();
        toFields().writeField(ACTION_NAME);
    }

    /**
     * action name that will be activated in the `GActionGroup`.
    */
    public ch.bailu.gtk.type.Str getFieldActionName() {
       toFields().readField(ACTION_NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().action_name));
    } 

}

/*
record-type
all-fields-supported
*/
