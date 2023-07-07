/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A GOptionEntry struct defines a single option. To have an effect, they
 * <br>must be added to a &#35;GOptionGroup with g_option_context_add_main_entries()
 * <br>or g_option_group_add_entries().
 * <p><a href="https://docs.gtk.org/glib/struct.OptionEntry.html">https://docs.gtk.org/glib/struct.OptionEntry.html</a></p>
*/
public class OptionEntry extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(OptionEntry.class.getCanonicalName());
    }

    public OptionEntry(PointerContainer pointer) {
        super(pointer);
    }

    public OptionEntry() {
        super(cast(JnaOptionEntry.allocateStructure()));
    }

    private JnaOptionEntry.Fields _fields;
    
    JnaOptionEntry.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaOptionEntry.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The long name of an option can be used to specify it
     * <br>    in a commandline as `--long_name`. Every option must have a
     * <br>    long name. To resolve conflicts if multiple option groups contain
     * <br>    the same long name, it is also possible to specify the option as
     * <br>    `--groupname-long_name`.
    */
    public static final String LONG_NAME = "long_name";

    /**
     * The long name of an option can be used to specify it
     * <br>    in a commandline as `--long_name`. Every option must have a
     * <br>    long name. To resolve conflicts if multiple option groups contain
     * <br>    the same long name, it is also possible to specify the option as
     * <br>    `--groupname-long_name`.
    */
    public void setFieldLongName(ch.bailu.gtk.type.Str long_name) {
        toFields().long_name = long_name.asCPointer();
        toFields().writeField(LONG_NAME);
    }

    /**
     * The long name of an option can be used to specify it
     * <br>    in a commandline as `--long_name`. Every option must have a
     * <br>    long name. To resolve conflicts if multiple option groups contain
     * <br>    the same long name, it is also possible to specify the option as
     * <br>    `--groupname-long_name`.
    */
    public ch.bailu.gtk.type.Str getFieldLongName() {
       toFields().readField(LONG_NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().long_name));
    } 

    /**
     * If an option has a short name, it can be specified
     * <br>    `-short_name` in a commandline. &#64;short_name must be  a printable
     * <br>    ASCII character different from '-', or zero if the option has no
     * <br>    short name.
    */
    public static final String SHORT_NAME = "short_name";

    /**
     * If an option has a short name, it can be specified
     * <br>    `-short_name` in a commandline. &#64;short_name must be  a printable
     * <br>    ASCII character different from '-', or zero if the option has no
     * <br>    short name.
    */
    public void setFieldShortName(byte short_name) {
        toFields().short_name = short_name;
        toFields().writeField(SHORT_NAME);
    }

    /**
     * If an option has a short name, it can be specified
     * <br>    `-short_name` in a commandline. &#64;short_name must be  a printable
     * <br>    ASCII character different from '-', or zero if the option has no
     * <br>    short name.
    */
    public byte getFieldShortName() {
       toFields().readField(SHORT_NAME);
       return toFields().short_name;
    } 

    /**
     * Flags from &#35;GOptionFlags
    */
    public static final String FLAGS = "flags";

    /**
     * Flags from &#35;GOptionFlags
    */
    public void setFieldFlags(int flags) {
        toFields().flags = flags;
        toFields().writeField(FLAGS);
    }

    /**
     * Flags from &#35;GOptionFlags
    */
    public int getFieldFlags() {
       toFields().readField(FLAGS);
       return toFields().flags;
    } 

    /**
     * The type of the option, as a &#35;GOptionArg
    */
    public static final String ARG = "arg";

    /**
     * The type of the option, as a &#35;GOptionArg
    */
    public void setFieldArg(int arg) {
        toFields().arg = arg;
        toFields().writeField(ARG);
    }

    /**
     * The type of the option, as a &#35;GOptionArg
    */
    public int getFieldArg() {
       toFields().readField(ARG);
       return toFields().arg;
    } 

    /**
     * If the &#64;arg type is %G_OPTION_ARG_CALLBACK, then &#64;arg_data
     * <br>    must point to a &#35;GOptionArgFunc callback function, which will be
     * <br>    called to handle the extra argument. Otherwise, &#64;arg_data is a
     * <br>    pointer to a location to store the value, the required type of
     * <br>    the location depends on the &#64;arg type:
     * <br>    - %G_OPTION_ARG_NONE: %gboolean
     * <br>    - %G_OPTION_ARG_STRING: %gchar*
     * <br>    - %G_OPTION_ARG_INT: %gint
     * <br>    - %G_OPTION_ARG_FILENAME: %gchar*
     * <br>    - %G_OPTION_ARG_STRING_ARRAY: %gchar**
     * <br>    - %G_OPTION_ARG_FILENAME_ARRAY: %gchar**
     * <br>    - %G_OPTION_ARG_DOUBLE: %gdouble
     * <br>    If &#64;arg type is %G_OPTION_ARG_STRING or %G_OPTION_ARG_FILENAME,
     * <br>    the location will contain a newly allocated string if the option
     * <br>    was given. That string needs to be freed by the callee using g_free().
     * <br>    Likewise if &#64;arg type is %G_OPTION_ARG_STRING_ARRAY or
     * <br>    %G_OPTION_ARG_FILENAME_ARRAY, the data should be freed using g_strfreev().
    */
    public static final String ARG_DATA = "arg_data";

    /**
     * If the &#64;arg type is %G_OPTION_ARG_CALLBACK, then &#64;arg_data
     * <br>    must point to a &#35;GOptionArgFunc callback function, which will be
     * <br>    called to handle the extra argument. Otherwise, &#64;arg_data is a
     * <br>    pointer to a location to store the value, the required type of
     * <br>    the location depends on the &#64;arg type:
     * <br>    - %G_OPTION_ARG_NONE: %gboolean
     * <br>    - %G_OPTION_ARG_STRING: %gchar*
     * <br>    - %G_OPTION_ARG_INT: %gint
     * <br>    - %G_OPTION_ARG_FILENAME: %gchar*
     * <br>    - %G_OPTION_ARG_STRING_ARRAY: %gchar**
     * <br>    - %G_OPTION_ARG_FILENAME_ARRAY: %gchar**
     * <br>    - %G_OPTION_ARG_DOUBLE: %gdouble
     * <br>    If &#64;arg type is %G_OPTION_ARG_STRING or %G_OPTION_ARG_FILENAME,
     * <br>    the location will contain a newly allocated string if the option
     * <br>    was given. That string needs to be freed by the callee using g_free().
     * <br>    Likewise if &#64;arg type is %G_OPTION_ARG_STRING_ARRAY or
     * <br>    %G_OPTION_ARG_FILENAME_ARRAY, the data should be freed using g_strfreev().
    */
    public void setFieldArgData(ch.bailu.gtk.type.Pointer arg_data) {
        toFields().arg_data = arg_data.asCPointer();
        toFields().writeField(ARG_DATA);
    }

    /**
     * If the &#64;arg type is %G_OPTION_ARG_CALLBACK, then &#64;arg_data
     * <br>    must point to a &#35;GOptionArgFunc callback function, which will be
     * <br>    called to handle the extra argument. Otherwise, &#64;arg_data is a
     * <br>    pointer to a location to store the value, the required type of
     * <br>    the location depends on the &#64;arg type:
     * <br>    - %G_OPTION_ARG_NONE: %gboolean
     * <br>    - %G_OPTION_ARG_STRING: %gchar*
     * <br>    - %G_OPTION_ARG_INT: %gint
     * <br>    - %G_OPTION_ARG_FILENAME: %gchar*
     * <br>    - %G_OPTION_ARG_STRING_ARRAY: %gchar**
     * <br>    - %G_OPTION_ARG_FILENAME_ARRAY: %gchar**
     * <br>    - %G_OPTION_ARG_DOUBLE: %gdouble
     * <br>    If &#64;arg type is %G_OPTION_ARG_STRING or %G_OPTION_ARG_FILENAME,
     * <br>    the location will contain a newly allocated string if the option
     * <br>    was given. That string needs to be freed by the callee using g_free().
     * <br>    Likewise if &#64;arg type is %G_OPTION_ARG_STRING_ARRAY or
     * <br>    %G_OPTION_ARG_FILENAME_ARRAY, the data should be freed using g_strfreev().
    */
    public ch.bailu.gtk.type.Pointer getFieldArgData() {
       toFields().readField(ARG_DATA);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().arg_data));
    } 

    /**
     * the description for the option in `--help`
     * <br>    output. The &#64;description is translated using the &#64;translate_func
     * <br>    of the group, see g_option_group_set_translation_domain().
    */
    public static final String DESCRIPTION = "description";

    /**
     * the description for the option in `--help`
     * <br>    output. The &#64;description is translated using the &#64;translate_func
     * <br>    of the group, see g_option_group_set_translation_domain().
    */
    public void setFieldDescription(ch.bailu.gtk.type.Str description) {
        toFields().description = description.asCPointer();
        toFields().writeField(DESCRIPTION);
    }

    /**
     * the description for the option in `--help`
     * <br>    output. The &#64;description is translated using the &#64;translate_func
     * <br>    of the group, see g_option_group_set_translation_domain().
    */
    public ch.bailu.gtk.type.Str getFieldDescription() {
       toFields().readField(DESCRIPTION);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().description));
    } 

    /**
     * The placeholder to use for the extra argument parsed
     * <br>    by the option in `--help` output. The &#64;arg_description is translated
     * <br>    using the &#64;translate_func of the group, see
     * <br>    g_option_group_set_translation_domain().
    */
    public static final String ARG_DESCRIPTION = "arg_description";

    /**
     * The placeholder to use for the extra argument parsed
     * <br>    by the option in `--help` output. The &#64;arg_description is translated
     * <br>    using the &#64;translate_func of the group, see
     * <br>    g_option_group_set_translation_domain().
    */
    public void setFieldArgDescription(ch.bailu.gtk.type.Str arg_description) {
        toFields().arg_description = arg_description.asCPointer();
        toFields().writeField(ARG_DESCRIPTION);
    }

    /**
     * The placeholder to use for the extra argument parsed
     * <br>    by the option in `--help` output. The &#64;arg_description is translated
     * <br>    using the &#64;translate_func of the group, see
     * <br>    g_option_group_set_translation_domain().
    */
    public ch.bailu.gtk.type.Str getFieldArgDescription() {
       toFields().readField(ARG_DESCRIPTION);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().arg_description));
    } 

}

/*
record-type
all-fields-supported
*/
