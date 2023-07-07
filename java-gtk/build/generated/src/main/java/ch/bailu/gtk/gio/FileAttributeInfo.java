/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Information about a specific attribute.
 * <p><a href="https://docs.gtk.org/gio/struct.FileAttributeInfo.html">https://docs.gtk.org/gio/struct.FileAttributeInfo.html</a></p>
*/
public class FileAttributeInfo extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileAttributeInfo.class.getCanonicalName());
    }

    public FileAttributeInfo(PointerContainer pointer) {
        super(pointer);
    }

    public FileAttributeInfo() {
        super(cast(JnaFileAttributeInfo.allocateStructure()));
    }

    private JnaFileAttributeInfo.Fields _fields;
    
    JnaFileAttributeInfo.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFileAttributeInfo.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the name of the attribute.
    */
    public static final String NAME = "name";

    /**
     * the name of the attribute.
    */
    public void setFieldName(ch.bailu.gtk.type.Str name) {
        toFields().name = name.asCPointer();
        toFields().writeField(NAME);
    }

    /**
     * the name of the attribute.
    */
    public ch.bailu.gtk.type.Str getFieldName() {
       toFields().readField(NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().name));
    } 

    /**
     * the &#35;GFileAttributeType type of the attribute.
    */
    public static final String TYPE = "type";

    /**
     * the &#35;GFileAttributeType type of the attribute.
    */
    public void setFieldType(int type) {
        toFields().type = type;
        toFields().writeField(TYPE);
    }

    /**
     * the &#35;GFileAttributeType type of the attribute.
    */
    public int getFieldType() {
       toFields().readField(TYPE);
       return toFields().type;
    } 

    /**
     * a set of &#35;GFileAttributeInfoFlags.
    */
    public static final String FLAGS = "flags";

    /**
     * a set of &#35;GFileAttributeInfoFlags.
    */
    public void setFieldFlags(int flags) {
        toFields().flags = flags;
        toFields().writeField(FLAGS);
    }

    /**
     * a set of &#35;GFileAttributeInfoFlags.
    */
    public int getFieldFlags() {
       toFields().readField(FLAGS);
       return toFields().flags;
    } 

}

/*
record-type
all-fields-supported
*/
