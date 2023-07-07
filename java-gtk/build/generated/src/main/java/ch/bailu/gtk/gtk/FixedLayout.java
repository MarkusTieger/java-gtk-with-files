/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkFixedLayout` is a layout manager which can place child widgets
 * <br>at fixed positions.
 * <br>
 * <br>Most applications should never use this layout manager; fixed positioning
 * <br>and sizing requires constant recalculations on where children need to be
 * <br>positioned and sized. Other layout managers perform this kind of work
 * <br>internally so that application developers don't need to do it. Specifically,
 * <br>widgets positioned in a fixed layout manager will need to take into account:
 * <br>
 * <br>- Themes, which may change widget sizes.
 * <br>
 * <br>- Fonts other than the one you used to write the app will of course
 * <br>  change the size of widgets containing text; keep in mind that
 * <br>  users may use a larger font because of difficulty reading the
 * <br>  default, or they may be using a different OS that provides different
 * <br>  fonts.
 * <br>
 * <br>- Translation of text into other languages changes its size. Also,
 * <br>  display of non-English text will use a different font in many
 * <br>  cases.
 * <br>
 * <br>In addition, `GtkFixedLayout` does not pay attention to text direction and
 * <br>thus may produce unwanted results if your app is run under right-to-left
 * <br>languages such as Hebrew or Arabic. That is: normally GTK will order
 * <br>containers appropriately depending on the text direction, e.g. to put labels
 * <br>to the right of the thing they label when using an RTL language;
 * <br>`GtkFixedLayout` won't be able to do that for you.
 * <br>
 * <br>Finally, fixed positioning makes it kind of annoying to add/remove UI
 * <br>elements, since you have to reposition all the other  elements. This is a
 * <br>long-term maintenance problem for your application.
 * <p><a href="https://docs.gtk.org/gtk4/class.FixedLayout.html">https://docs.gtk.org/gtk4/class.FixedLayout.html</a></p>
*/
public class FixedLayout extends LayoutManager {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FixedLayout.class.getCanonicalName());
    }

    public FixedLayout(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkFixedLayout`.
    */
    public FixedLayout() {
        super(cast(JnaFixedLayout.INST().gtk_fixed_layout_new()));
    }

    public static long getTypeID() { 
        return JnaFixedLayout.INST().gtk_fixed_layout_get_type(); 
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
