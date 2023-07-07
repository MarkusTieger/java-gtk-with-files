/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface StackTransitionType {

    /**
     * No transition
    */
    int NONE = 0;

    /**
     * A cross-fade
    */
    int CROSSFADE = 1;

    /**
     * Slide from left to right
    */
    int SLIDE_RIGHT = 2;

    /**
     * Slide from right to left
    */
    int SLIDE_LEFT = 3;

    /**
     * Slide from bottom up
    */
    int SLIDE_UP = 4;

    /**
     * Slide from top down
    */
    int SLIDE_DOWN = 5;

    /**
     * Slide from left or right according to the children order
    */
    int SLIDE_LEFT_RIGHT = 6;

    /**
     * Slide from top down or bottom up according to the order
    */
    int SLIDE_UP_DOWN = 7;

    /**
     * Cover the old page by sliding up
    */
    int OVER_UP = 8;

    /**
     * Cover the old page by sliding down
    */
    int OVER_DOWN = 9;

    /**
     * Cover the old page by sliding to the left
    */
    int OVER_LEFT = 10;

    /**
     * Cover the old page by sliding to the right
    */
    int OVER_RIGHT = 11;

    /**
     * Uncover the new page by sliding up
    */
    int UNDER_UP = 12;

    /**
     * Uncover the new page by sliding down
    */
    int UNDER_DOWN = 13;

    /**
     * Uncover the new page by sliding to the left
    */
    int UNDER_LEFT = 14;

    /**
     * Uncover the new page by sliding to the right
    */
    int UNDER_RIGHT = 15;

    /**
     * Cover the old page sliding up or uncover the new page sliding down, according to order
    */
    int OVER_UP_DOWN = 16;

    /**
     * Cover the old page sliding down or uncover the new page sliding up, according to order
    */
    int OVER_DOWN_UP = 17;

    /**
     * Cover the old page sliding left or uncover the new page sliding right, according to order
    */
    int OVER_LEFT_RIGHT = 18;

    /**
     * Cover the old page sliding right or uncover the new page sliding left, according to order
    */
    int OVER_RIGHT_LEFT = 19;

    /**
     * Pretend the pages are sides of a cube and rotate that cube to the left
    */
    int ROTATE_LEFT = 20;

    /**
     * Pretend the pages are sides of a cube and rotate that cube to the right
    */
    int ROTATE_RIGHT = 21;

    /**
     * Pretend the pages are sides of a cube and rotate that cube to the left or right according to the children order
    */
    int ROTATE_LEFT_RIGHT = 22;

}

/*
enumeration-type
*/
