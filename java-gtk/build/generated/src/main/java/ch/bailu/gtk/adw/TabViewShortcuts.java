/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/</a></p>
*/
public interface TabViewShortcuts {

    /**
     * No shortcuts
    */
    int NONE = 0;

    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Tab&lt;/kbd&gt; - switch to the next page, with looping
    */
    int CONTROL_TAB = 1;

    /**
     * &lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Tab&lt;/kbd&gt; - switch to the previous
     * <br>  page, with looping
    */
    int CONTROL_SHIFT_TAB = 2;

    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Page Up&lt;/kbd&gt; - switch to the previous page
    */
    int CONTROL_PAGE_UP = 4;

    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Page Down&lt;/kbd&gt; - switch to the next page
    */
    int CONTROL_PAGE_DOWN = 8;

    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Home&lt;/kbd&gt; - switch to the first page
    */
    int CONTROL_HOME = 16;

    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;End&lt;/kbd&gt; - switch to the last page
    */
    int CONTROL_END = 32;

    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Page Up&lt;/kbd&gt; - move the selected
     * <br>  page backward
    */
    int CONTROL_SHIFT_PAGE_UP = 64;

    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Page Down&lt;/kbd&gt; - move the selected
     * <br>  page forward
    */
    int CONTROL_SHIFT_PAGE_DOWN = 128;

    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Home&lt;/kbd&gt; - move the selected page
     * <br>  at the start
    */
    int CONTROL_SHIFT_HOME = 256;

    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;End&lt;/kbd&gt; - move the current page at
     * <br>  the end
    */
    int CONTROL_SHIFT_END = 512;

    /**
     * &lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;1&lt;/kbd&gt;⋯&lt;kbd&gt;9&lt;/kbd&gt; - switch to pages 1-9
    */
    int ALT_DIGITS = 1024;

    /**
     * &lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;0&lt;/kbd&gt; - switch to page 10
    */
    int ALT_ZERO = 2048;

    /**
     * All of the shortcuts
    */
    int ALL_SHORTCUTS = 4095;

}

/*
enumeration-type
*/
