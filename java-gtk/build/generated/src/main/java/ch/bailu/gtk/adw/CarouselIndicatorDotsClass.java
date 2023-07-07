/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.CarouselIndicatorDotsClass.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.CarouselIndicatorDotsClass.html</a></p>
*/
public class CarouselIndicatorDotsClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CarouselIndicatorDotsClass.class.getCanonicalName());
    }

    public CarouselIndicatorDotsClass(PointerContainer pointer) {
        super(pointer);
    }

    public CarouselIndicatorDotsClass() {
        super(cast(JnaCarouselIndicatorDotsClass.allocateStructure()));
    }

    private JnaCarouselIndicatorDotsClass.Fields _fields;
    
    JnaCarouselIndicatorDotsClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaCarouselIndicatorDotsClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CarouselIndicatorDots.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CarouselIndicatorDots.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
