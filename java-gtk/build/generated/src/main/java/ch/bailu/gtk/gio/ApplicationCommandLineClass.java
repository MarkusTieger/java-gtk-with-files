/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GApplicationCommandLineClass-struct
 * <br>contains private data only.
 * <p><a href="https://docs.gtk.org/gio/struct.ApplicationCommandLineClass.html">https://docs.gtk.org/gio/struct.ApplicationCommandLineClass.html</a></p>
*/
public class ApplicationCommandLineClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ApplicationCommandLineClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnPrintLiteral {
        /**
         * 
         * @param cmdline 
         * @param message 
        */
        void onPrintLiteral(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ApplicationCommandLine cmdline, @Nonnull ch.bailu.gtk.type.Str message);
    }
    
    private static JnaApplicationCommandLineClass.OnPrintLiteral toOnPrintLiteral(ch.bailu.gtk.type.Pointer instance, String methodName, OnPrintLiteral in) {
        JnaApplicationCommandLineClass.OnPrintLiteral out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cmdline, _message) -> in.onPrintLiteral(__callback, new ApplicationCommandLine(new PointerContainer(_cmdline)), new ch.bailu.gtk.type.Str(new PointerContainer(_message)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPrinterrLiteral {
        /**
         * 
         * @param cmdline 
         * @param message 
        */
        void onPrinterrLiteral(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ApplicationCommandLine cmdline, @Nonnull ch.bailu.gtk.type.Str message);
    }
    
    private static JnaApplicationCommandLineClass.OnPrinterrLiteral toOnPrinterrLiteral(ch.bailu.gtk.type.Pointer instance, String methodName, OnPrinterrLiteral in) {
        JnaApplicationCommandLineClass.OnPrinterrLiteral out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cmdline, _message) -> in.onPrinterrLiteral(__callback, new ApplicationCommandLine(new PointerContainer(_cmdline)), new ch.bailu.gtk.type.Str(new PointerContainer(_message)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetStdin {
        /**
         * 
         * @param cmdline a &#35;GApplicationCommandLine
         * @return a &#35;GInputStream for stdin
        */
        InputStream onGetStdin(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ApplicationCommandLine cmdline);
    }
    
    private static JnaApplicationCommandLineClass.OnGetStdin toOnGetStdin(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetStdin in) {
        JnaApplicationCommandLineClass.OnGetStdin out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cmdline) -> in.onGetStdin(__callback, new ApplicationCommandLine(new PointerContainer(_cmdline))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public ApplicationCommandLineClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaApplicationCommandLineClass.Fields _fields;
    
    JnaApplicationCommandLineClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaApplicationCommandLineClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnPrintLiteral#onPrintLiteral}
    */
    public static final String PRINT_LITERAL = "print_literal";

    /**
     * 
     * <br>See {@link OnPrintLiteral#onPrintLiteral}
    */
    public void setFieldPrintLiteral(OnPrintLiteral print_literal) {
        toFields().print_literal = toOnPrintLiteral(this, PRINT_LITERAL, print_literal);
        toFields().writeField(PRINT_LITERAL);
    }

    /**
     * 
     * <br>See {@link OnPrintLiteral#onPrintLiteral}
    */
    public JnaApplicationCommandLineClass.OnPrintLiteral getFieldPrintLiteral() {
       toFields().readField(PRINT_LITERAL);
       return toFields().print_literal;
    } 

    /**
     * 
     * <br>See {@link OnPrinterrLiteral#onPrinterrLiteral}
    */
    public static final String PRINTERR_LITERAL = "printerr_literal";

    /**
     * 
     * <br>See {@link OnPrinterrLiteral#onPrinterrLiteral}
    */
    public void setFieldPrinterrLiteral(OnPrinterrLiteral printerr_literal) {
        toFields().printerr_literal = toOnPrinterrLiteral(this, PRINTERR_LITERAL, printerr_literal);
        toFields().writeField(PRINTERR_LITERAL);
    }

    /**
     * 
     * <br>See {@link OnPrinterrLiteral#onPrinterrLiteral}
    */
    public JnaApplicationCommandLineClass.OnPrinterrLiteral getFieldPrinterrLiteral() {
       toFields().readField(PRINTERR_LITERAL);
       return toFields().printerr_literal;
    } 

    /**
     * 
     * <br>See {@link OnGetStdin#onGetStdin}
    */
    public static final String GET_STDIN = "get_stdin";

    /**
     * 
     * <br>See {@link OnGetStdin#onGetStdin}
    */
    public void setFieldGetStdin(OnGetStdin get_stdin) {
        toFields().get_stdin = toOnGetStdin(this, GET_STDIN, get_stdin);
        toFields().writeField(GET_STDIN);
    }

    /**
     * 
     * <br>See {@link OnGetStdin#onGetStdin}
    */
    public JnaApplicationCommandLineClass.OnGetStdin getFieldGetStdin() {
       toFields().readField(GET_STDIN);
       return toFields().get_stdin;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ApplicationCommandLine.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ApplicationCommandLine.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
