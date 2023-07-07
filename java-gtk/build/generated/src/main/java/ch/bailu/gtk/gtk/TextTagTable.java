/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The collection of tags in a `GtkTextBuffer`
 * <br>
 * <br>You may wish to begin by reading the
 * <br>[text widget conceptual overview](section-text-widget.html),
 * <br>which gives an overview of all the objects and data types
 * <br>related to the text widget and how they work together.
 * <br>
 * <br>&#35; GtkTextTagTables as GtkBuildable
 * <br>
 * <br>The `GtkTextTagTable` implementation of the `GtkBuildable` interface
 * <br>supports adding tags by specifying “tag” as the “type” attribute
 * <br>of a &lt;child&gt; element.
 * <br>
 * <br>An example of a UI definition fragment specifying tags:
 * <br>```xml
 * <br>&lt;object class=&quot;GtkTextTagTable&quot;&gt;
 * <br> &lt;child type=&quot;tag&quot;&gt;
 * <br>   &lt;object class=&quot;GtkTextTag&quot;/&gt;
 * <br> &lt;/child&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.TextTagTable.html">https://docs.gtk.org/gtk4/class.TextTagTable.html</a></p>
*/
public class TextTagTable extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TextTagTable.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTextTagTableForeach {
        /**
         * A function used with gtk_text_tag_table_foreach(),
         * <br>to iterate over every `GtkTextTag` inside a `GtkTextTagTable`.
         * @param tag the `GtkTextTag`
         * @param data data passed to gtk_text_tag_table_foreach()
        */
        void onTextTagTableForeach(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextTag tag, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTextTagTable.OnTextTagTableForeach toOnTextTagTableForeach(ch.bailu.gtk.type.Pointer instance, String methodName, OnTextTagTableForeach in) {
        JnaTextTagTable.OnTextTagTableForeach out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tag, _data) -> in.onTextTagTableForeach(__callback, new TextTag(new PointerContainer(_tag)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTagAdded {
        /**
         * Emitted every time a new tag is added in the `GtkTextTagTable`.
         * @param tag the added tag.
        */
        void onTagAdded(@Nonnull TextTag tag);
    }
    
    private static com.sun.jna.Callback toOnTagAdded(OnTagAdded in) {
        return (in == null) ? null: (JnaTextTagTable.OnTagAdded) (__self, _tag, __data) -> in.onTagAdded(new TextTag(new PointerContainer(_tag)));
    }

    @FunctionalInterface
    public interface OnTagChanged {
        /**
         * Emitted every time a tag in the `GtkTextTagTable` changes.
         * @param tag the changed tag.
         * @param size_changed whether the change affects the `GtkTextView` layout.
        */
        void onTagChanged(@Nonnull TextTag tag, boolean size_changed);
    }
    
    private static com.sun.jna.Callback toOnTagChanged(OnTagChanged in) {
        return (in == null) ? null: (JnaTextTagTable.OnTagChanged) (__self, _tag, _size_changed, __data) -> in.onTagChanged(new TextTag(new PointerContainer(_tag)), _size_changed);
    }

    @FunctionalInterface
    public interface OnTagRemoved {
        /**
         * Emitted every time a tag is removed from the `GtkTextTagTable`.
         * <br>
         * <br>The &#64;tag is still valid by the time the signal is emitted, but
         * <br>it is not associated with a tag table any more.
         * @param tag the removed tag.
        */
        void onTagRemoved(@Nonnull TextTag tag);
    }
    
    private static com.sun.jna.Callback toOnTagRemoved(OnTagRemoved in) {
        return (in == null) ? null: (JnaTextTagTable.OnTagRemoved) (__self, _tag, __data) -> in.onTagRemoved(new TextTag(new PointerContainer(_tag)));
    }

    public TextTagTable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkTextTagTable`.
     * <br>
     * <br>The table contains no tags by default.
    */
    public TextTagTable() {
        super(cast(JnaTextTagTable.INST().gtk_text_tag_table_new()));
    }

    /**
     * Add a tag to the table.
     * <br>
     * <br>The tag is assigned the highest priority in the table.
     * <br>
     * <br>&#64;tag must not be in a tag table already, and may not have
     * <br>the same name as an already-added tag.
     * @param tag a `GtkTextTag`
     * @return %TRUE on success.
    */
    public boolean add(@Nonnull TextTag tag)  {
        return JnaTextTagTable.INST().gtk_text_tag_table_add(asCPointer(), asCPointerNotNull(tag));
    }

    /**
     * Calls &#64;func on each tag in &#64;table, with user data &#64;data.
     * <br>
     * <br>Note that the table may not be modified while iterating
     * <br>over it (you can’t add/remove tags).
     * @param func a function to call on each tag
     * @param data user data
    */
    public void foreach(OnTextTagTableForeach func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaTextTagTable.INST().gtk_text_tag_table_foreach(asCPointer(), toOnTextTagTableForeach(this, "foreach", func), asCPointer(data));
    }

    /**
     * Returns the size of the table (number of tags)
     * @return number of tags in &#64;table
    */
    public int getSize()  {
        return JnaTextTagTable.INST().gtk_text_tag_table_get_size(asCPointer());
    }

    /**
     * Look up a named tag.
     * @param name name of a tag
     * @return The tag
    */
    public TextTag lookup(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new TextTag(new PointerContainer(JnaTextTagTable.INST().gtk_text_tag_table_lookup(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Look up a named tag.
     * @param name name of a tag
     * @return The tag
    */
    public TextTag lookup(String name)  {
        return new TextTag(new PointerContainer(JnaTextTagTable.INST().gtk_text_tag_table_lookup(asCPointer(), name)));
    }

    /**
     * Remove a tag from the table.
     * <br>
     * <br>If a `GtkTextBuffer` has &#64;table as its tag table, the tag is
     * <br>removed from the buffer. The table’s reference to the tag is
     * <br>removed, so the tag will end up destroyed if you don’t have
     * <br>a reference to it.
     * @param tag a `GtkTextTag`
    */
    public void remove(@Nonnull TextTag tag)  {
        JnaTextTagTable.INST().gtk_text_tag_table_remove(asCPointer(), asCPointerNotNull(tag));
    }

    public final static String SIGNAL_ON_TAG_ADDED = "tag-added";
    
    /**
     * Connect to signal "tag-added".
     * <br>See {@link OnTagAdded#onTagAdded} for signal description.
     * <br>Field {@link #SIGNAL_ON_TAG_ADDED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onTagAdded(OnTagAdded signal) {
        return connectSignal(SIGNAL_ON_TAG_ADDED, toOnTagAdded(signal));
    }

    public final static String SIGNAL_ON_TAG_CHANGED = "tag-changed";
    
    /**
     * Connect to signal "tag-changed".
     * <br>See {@link OnTagChanged#onTagChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_TAG_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onTagChanged(OnTagChanged signal) {
        return connectSignal(SIGNAL_ON_TAG_CHANGED, toOnTagChanged(signal));
    }

    public final static String SIGNAL_ON_TAG_REMOVED = "tag-removed";
    
    /**
     * Connect to signal "tag-removed".
     * <br>See {@link OnTagRemoved#onTagRemoved} for signal description.
     * <br>Field {@link #SIGNAL_ON_TAG_REMOVED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onTagRemoved(OnTagRemoved signal) {
        return connectSignal(SIGNAL_ON_TAG_REMOVED, toOnTagRemoved(signal));
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    public static long getTypeID() { 
        return JnaTextTagTable.INST().gtk_text_tag_table_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
class-type
*/
