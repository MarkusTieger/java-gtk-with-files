/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GSequenceIter struct is an opaque data type representing an
 * <br>iterator pointing into a &#35;GSequence.
 * <p><a href="https://docs.gtk.org/glib/struct.SequenceIter.html">https://docs.gtk.org/glib/struct.SequenceIter.html</a></p>
*/
class SequenceIter extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SequenceIter.class.getCanonicalName());
    }

    public SequenceIter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a negative number if &#64;a comes before &#64;b, 0 if they are equal,
     * <br>and a positive number if &#64;a comes after &#64;b.
     * <br>
     * <br>The &#64;a and &#64;b iterators must point into the same sequence.
     * @param b a &#35;GSequenceIter
     * @return a negative number if &#64;a comes before &#64;b, 0 if they are     equal, and a positive number if &#64;a comes after &#64;b
    */
    public int compare(@Nonnull SequenceIter b)  {
        return JnaSequenceIter.INST().g_sequence_iter_compare(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Returns the position of &#64;iter
     * @return the position of &#64;iter
    */
    public int getPosition()  {
        return JnaSequenceIter.INST().g_sequence_iter_get_position(asCPointer());
    }

    /**
     * Returns the &#35;GSequence that &#64;iter points into.
     * @return the &#35;GSequence that &#64;iter points into
    */
    public Sequence getSequence()  {
        return new Sequence(new PointerContainer(JnaSequenceIter.INST().g_sequence_iter_get_sequence(asCPointer())));
    }

    /**
     * Returns whether &#64;iter is the begin iterator
     * @return whether &#64;iter is the begin iterator
    */
    public boolean isBegin()  {
        return JnaSequenceIter.INST().g_sequence_iter_is_begin(asCPointer());
    }

    /**
     * Returns whether &#64;iter is the end iterator
     * @return Whether &#64;iter is the end iterator
    */
    public boolean isEnd()  {
        return JnaSequenceIter.INST().g_sequence_iter_is_end(asCPointer());
    }

    /**
     * Returns the &#35;GSequenceIter which is &#64;delta positions away from &#64;iter.
     * <br>If &#64;iter is closer than -&#64;delta positions to the beginning of the sequence,
     * <br>the begin iterator is returned. If &#64;iter is closer than &#64;delta positions
     * <br>to the end of the sequence, the end iterator is returned.
     * @param delta A positive or negative number indicating how many positions away    from &#64;iter the returned &#35;GSequenceIter will be
     * @return a &#35;GSequenceIter which is &#64;delta positions away from &#64;iter
    */
    public SequenceIter move(int delta)  {
        return new SequenceIter(new PointerContainer(JnaSequenceIter.INST().g_sequence_iter_move(asCPointer(), delta)));
    }

    /**
     * Returns an iterator pointing to the next position after &#64;iter.
     * <br>If &#64;iter is the end iterator, the end iterator is returned.
     * @return a &#35;GSequenceIter pointing to the next position after &#64;iter
    */
    public SequenceIter next()  {
        return new SequenceIter(new PointerContainer(JnaSequenceIter.INST().g_sequence_iter_next(asCPointer())));
    }

    /**
     * Returns an iterator pointing to the previous position before &#64;iter.
     * <br>If &#64;iter is the begin iterator, the begin iterator is returned.
     * @return a &#35;GSequenceIter pointing to the previous position     before &#64;iter
    */
    public SequenceIter prev()  {
        return new SequenceIter(new PointerContainer(JnaSequenceIter.INST().g_sequence_iter_prev(asCPointer())));
    }

}

/*
record-type
flag-disguised
all-fields-supported
*/
