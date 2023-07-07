/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Meta-data to be passed to gtk_recent_manager_add_full() when
 * <br>registering a recently used resource.
 * <p><a href="https://docs.gtk.org/gtk4/struct.RecentData.html">https://docs.gtk.org/gtk4/struct.RecentData.html</a></p>
*/
public class RecentData extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RecentData.class.getCanonicalName());
    }

    public RecentData(PointerContainer pointer) {
        super(pointer);
    }

    public RecentData() {
        super(cast(JnaRecentData.allocateStructure()));
    }

    private JnaRecentData.Fields _fields;
    
    JnaRecentData.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRecentData.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * a UTF-8 encoded string, containing the name of the recently
     * <br>  used resource to be displayed, or %NULL;
    */
    public static final String DISPLAY_NAME = "display_name";

    /**
     * a UTF-8 encoded string, containing the name of the recently
     * <br>  used resource to be displayed, or %NULL;
    */
    public void setFieldDisplayName(ch.bailu.gtk.type.Str display_name) {
        toFields().display_name = display_name.asCPointer();
        toFields().writeField(DISPLAY_NAME);
    }

    /**
     * a UTF-8 encoded string, containing the name of the recently
     * <br>  used resource to be displayed, or %NULL;
    */
    public ch.bailu.gtk.type.Str getFieldDisplayName() {
       toFields().readField(DISPLAY_NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().display_name));
    } 

    /**
     * a UTF-8 encoded string, containing a short description of
     * <br>  the resource, or %NULL;
    */
    public static final String DESCRIPTION = "description";

    /**
     * a UTF-8 encoded string, containing a short description of
     * <br>  the resource, or %NULL;
    */
    public void setFieldDescription(ch.bailu.gtk.type.Str description) {
        toFields().description = description.asCPointer();
        toFields().writeField(DESCRIPTION);
    }

    /**
     * a UTF-8 encoded string, containing a short description of
     * <br>  the resource, or %NULL;
    */
    public ch.bailu.gtk.type.Str getFieldDescription() {
       toFields().readField(DESCRIPTION);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().description));
    } 

    /**
     * the MIME type of the resource;
    */
    public static final String MIME_TYPE = "mime_type";

    /**
     * the MIME type of the resource;
    */
    public void setFieldMimeType(ch.bailu.gtk.type.Str mime_type) {
        toFields().mime_type = mime_type.asCPointer();
        toFields().writeField(MIME_TYPE);
    }

    /**
     * the MIME type of the resource;
    */
    public ch.bailu.gtk.type.Str getFieldMimeType() {
       toFields().readField(MIME_TYPE);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().mime_type));
    } 

    /**
     * the name of the application that is registering this recently
     * <br>  used resource;
    */
    public static final String APP_NAME = "app_name";

    /**
     * the name of the application that is registering this recently
     * <br>  used resource;
    */
    public void setFieldAppName(ch.bailu.gtk.type.Str app_name) {
        toFields().app_name = app_name.asCPointer();
        toFields().writeField(APP_NAME);
    }

    /**
     * the name of the application that is registering this recently
     * <br>  used resource;
    */
    public ch.bailu.gtk.type.Str getFieldAppName() {
       toFields().readField(APP_NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().app_name));
    } 

    /**
     * command line used to launch this resource; may contain the
     * <br>  “&#92;%f” and “&#92;%u” escape characters which will be expanded
     * <br>  to the resource file path and URI respectively when the command line
     * <br>  is retrieved;
    */
    public static final String APP_EXEC = "app_exec";

    /**
     * command line used to launch this resource; may contain the
     * <br>  “&#92;%f” and “&#92;%u” escape characters which will be expanded
     * <br>  to the resource file path and URI respectively when the command line
     * <br>  is retrieved;
    */
    public void setFieldAppExec(ch.bailu.gtk.type.Str app_exec) {
        toFields().app_exec = app_exec.asCPointer();
        toFields().writeField(APP_EXEC);
    }

    /**
     * command line used to launch this resource; may contain the
     * <br>  “&#92;%f” and “&#92;%u” escape characters which will be expanded
     * <br>  to the resource file path and URI respectively when the command line
     * <br>  is retrieved;
    */
    public ch.bailu.gtk.type.Str getFieldAppExec() {
       toFields().readField(APP_EXEC);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().app_exec));
    } 

    /**
     * a vector of strings containing
     * <br>  groups names;
    */
    public static final String GROUPS = "groups";

    /**
     * a vector of strings containing
     * <br>  groups names;
    */
    public void setFieldGroups(ch.bailu.gtk.type.Strs groups) {
        toFields().groups = groups.asCPointer();
        toFields().writeField(GROUPS);
    }

    /**
     * a vector of strings containing
     * <br>  groups names;
    */
    public ch.bailu.gtk.type.Strs getFieldGroups() {
       toFields().readField(GROUPS);
       return new ch.bailu.gtk.type.Strs(new PointerContainer(toFields().groups));
    } 

    /**
     * whether this resource should be displayed only by the
     * <br>  applications that have registered it or not.
    */
    public static final String IS_PRIVATE = "is_private";

    /**
     * whether this resource should be displayed only by the
     * <br>  applications that have registered it or not.
    */
    public void setFieldIsPrivate(boolean is_private) {
        toFields().is_private = is_private;
        toFields().writeField(IS_PRIVATE);
    }

    /**
     * whether this resource should be displayed only by the
     * <br>  applications that have registered it or not.
    */
    public boolean getFieldIsPrivate() {
       toFields().readField(IS_PRIVATE);
       return toFields().is_private;
    } 

}

/*
record-type
all-fields-supported
*/
