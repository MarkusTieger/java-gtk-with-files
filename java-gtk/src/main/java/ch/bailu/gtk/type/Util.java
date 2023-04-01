package ch.bailu.gtk.type;

public class Util {

    public static long[] toPointerArray(Pointer[] pointers) {
        long[] result = new long[pointers.length];

        for (int i=0; i<pointers.length; i++) {
            result[i] = pointers[i].asCPointer();
        }
        return result;
    }
}
