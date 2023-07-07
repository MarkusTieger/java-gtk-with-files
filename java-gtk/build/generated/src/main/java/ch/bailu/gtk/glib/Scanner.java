/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The data structure representing a lexical scanner.
 * <br>
 * <br>You should set &#64;input_name after creating the scanner, since
 * <br>it is used by the default message handler when displaying
 * <br>warnings and errors. If you are scanning a file, the filename
 * <br>would be a good choice.
 * <br>
 * <br>The &#64;user_data and &#64;max_parse_errors fields are not used.
 * <br>If you need to associate extra data with the scanner you
 * <br>can place them here.
 * <br>
 * <br>If you want to use your own message handler you can set the
 * <br>&#64;msg_handler field. The type of the message handler function
 * <br>is declared by &#35;GScannerMsgFunc.
 * <p><a href="https://docs.gtk.org/glib/struct.Scanner.html">https://docs.gtk.org/glib/struct.Scanner.html</a></p>
*/
public class Scanner extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Scanner.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnHFunc {
        /**
         * Specifies the type of the function passed to g_hash_table_foreach().
         * <br>It is called with each key/value pair, together with the &#64;user_data
         * <br>parameter which is passed to g_hash_table_foreach().
         * @param key a key
         * @param value the value corresponding to the key
         * @param user_data user data passed to g_hash_table_foreach()
        */
        void onHFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer key, @Nullable ch.bailu.gtk.type.Pointer value, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaScanner.OnHFunc toOnHFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnHFunc in) {
        JnaScanner.OnHFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_key, _value, _user_data) -> in.onHFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_key)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_value)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public Scanner(PointerContainer pointer) {
        super(pointer);
    }

    private JnaScanner.Fields _fields;
    
    JnaScanner.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaScanner.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * unused
    */
    public static final String USER_DATA = "user_data";

    /**
     * unused
    */
    public void setFieldUserData(ch.bailu.gtk.type.Pointer user_data) {
        toFields().user_data = user_data.asCPointer();
        toFields().writeField(USER_DATA);
    }

    /**
     * unused
    */
    public ch.bailu.gtk.type.Pointer getFieldUserData() {
       toFields().readField(USER_DATA);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().user_data));
    } 

    /**
     * unused
    */
    public static final String MAX_PARSE_ERRORS = "max_parse_errors";

    /**
     * unused
    */
    public void setFieldMaxParseErrors(int max_parse_errors) {
        toFields().max_parse_errors = max_parse_errors;
        toFields().writeField(MAX_PARSE_ERRORS);
    }

    /**
     * unused
    */
    public int getFieldMaxParseErrors() {
       toFields().readField(MAX_PARSE_ERRORS);
       return toFields().max_parse_errors;
    } 

    /**
     * g_scanner_error() increments this field
    */
    public static final String PARSE_ERRORS = "parse_errors";

    /**
     * g_scanner_error() increments this field
    */
    public void setFieldParseErrors(int parse_errors) {
        toFields().parse_errors = parse_errors;
        toFields().writeField(PARSE_ERRORS);
    }

    /**
     * g_scanner_error() increments this field
    */
    public int getFieldParseErrors() {
       toFields().readField(PARSE_ERRORS);
       return toFields().parse_errors;
    } 

    /**
     * name of input stream, featured by the default message handler
    */
    public static final String INPUT_NAME = "input_name";

    /**
     * name of input stream, featured by the default message handler
    */
    public void setFieldInputName(ch.bailu.gtk.type.Str input_name) {
        toFields().input_name = input_name.asCPointer();
        toFields().writeField(INPUT_NAME);
    }

    /**
     * name of input stream, featured by the default message handler
    */
    public ch.bailu.gtk.type.Str getFieldInputName() {
       toFields().readField(INPUT_NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().input_name));
    } 

    /**
     * quarked data
    */
    public static final String QDATA = "qdata";

    /**
     * quarked data
    */
    public void setFieldQdata(Data qdata) {
        toFields().qdata = qdata.asCPointer();
        toFields().writeField(QDATA);
    }

    /**
     * quarked data
    */
    public Data getFieldQdata() {
       toFields().readField(QDATA);
       return new Data(new PointerContainer(toFields().qdata));
    } 

    /**
     * link into the scanner configuration
    */
    public static final String CONFIG = "config";

    /**
     * link into the scanner configuration
    */
    public void setFieldConfig(ScannerConfig config) {
        toFields().config = config.asCPointer();
        toFields().writeField(CONFIG);
    }

    /**
     * link into the scanner configuration
    */
    public ScannerConfig getFieldConfig() {
       toFields().readField(CONFIG);
       return new ScannerConfig(new PointerContainer(toFields().config));
    } 

    /**
     * token parsed by the last g_scanner_get_next_token()
    */
    public static final String TOKEN = "token";

    /**
     * token parsed by the last g_scanner_get_next_token()
    */
    public void setFieldToken(int token) {
        toFields().token = token;
        toFields().writeField(TOKEN);
    }

    /**
     * token parsed by the last g_scanner_get_next_token()
    */
    public int getFieldToken() {
       toFields().readField(TOKEN);
       return toFields().token;
    } 

    /**
     * Returns the current line in the input stream (counting
     * <br>from 1). This is the line of the last token parsed via
     * <br>g_scanner_get_next_token().
     * @return the current line
    */
    public int curLine()  {
        return JnaScanner.INST().g_scanner_cur_line(asCPointer());
    }

    /**
     * Returns the current position in the current line (counting
     * <br>from 0). This is the position of the last token parsed via
     * <br>g_scanner_get_next_token().
     * @return the current position on the line
    */
    public int curPosition()  {
        return JnaScanner.INST().g_scanner_cur_position(asCPointer());
    }

    /**
     * Gets the current token type. This is simply the &#64;token
     * <br>field in the &#35;GScanner structure.
     * @return the current token type
    */
    public int curToken()  {
        return JnaScanner.INST().g_scanner_cur_token(asCPointer());
    }

    /**
     * Frees all memory used by the &#35;GScanner.
    */
    public void destroy()  {
        JnaScanner.INST().g_scanner_destroy(asCPointer());
    }

    /**
     * Returns %TRUE if the scanner has reached the end of
     * <br>the file or text buffer.
     * @return %TRUE if the scanner has reached the end of     the file or text buffer
    */
    public boolean eof()  {
        return JnaScanner.INST().g_scanner_eof(asCPointer());
    }

    /**
     * Outputs an error message, via the &#35;GScanner message handler.
     * @param format the message format. See the printf() documentation
     * @param _elipse the parameters to insert into the format string
    */
    public void error(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaScanner.INST().g_scanner_error(asCPointer(), asCPointerNotNull(format), _elipse);
    }

    /**
     * Outputs an error message, via the &#35;GScanner message handler.
     * @param format the message format. See the printf() documentation
     * @param _elipse the parameters to insert into the format string
    */
    public void error(String format, java.lang.Object... _elipse)  {
        JnaScanner.INST().g_scanner_error(asCPointer(), format, _elipse);
    }

    /**
     * Parses the next token just like g_scanner_peek_next_token()
     * <br>and also removes it from the input stream. The token data is
     * <br>placed in the &#64;token, &#64;value, &#64;line, and &#64;position fields of
     * <br>the &#35;GScanner structure.
     * @return the type of the token
    */
    public int getNextToken()  {
        return JnaScanner.INST().g_scanner_get_next_token(asCPointer());
    }

    /**
     * Prepares to scan a file.
     * @param input_fd a file descriptor
    */
    public void inputFile(int input_fd)  {
        JnaScanner.INST().g_scanner_input_file(asCPointer(), input_fd);
    }

    /**
     * Prepares to scan a text buffer.
     * @param text the text buffer to scan
     * @param text_len the length of the text buffer
    */
    public void inputText(@Nonnull ch.bailu.gtk.type.Str text, int text_len)  {
        JnaScanner.INST().g_scanner_input_text(asCPointer(), asCPointerNotNull(text), text_len);
    }

    /**
     * Prepares to scan a text buffer.
     * @param text the text buffer to scan
     * @param text_len the length of the text buffer
    */
    public void inputText(String text, int text_len)  {
        JnaScanner.INST().g_scanner_input_text(asCPointer(), text, text_len);
    }

    /**
     * Looks up a symbol in the current scope and return its value.
     * <br>If the symbol is not bound in the current scope, %NULL is
     * <br>returned.
     * @param symbol the symbol to look up
     * @return the value of &#64;symbol in the current scope, or %NULL     if &#64;symbol is not bound in the current scope
    */
    public ch.bailu.gtk.type.Pointer lookupSymbol(@Nonnull ch.bailu.gtk.type.Str symbol)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaScanner.INST().g_scanner_lookup_symbol(asCPointer(), asCPointerNotNull(symbol))));
    }

    /**
     * Looks up a symbol in the current scope and return its value.
     * <br>If the symbol is not bound in the current scope, %NULL is
     * <br>returned.
     * @param symbol the symbol to look up
     * @return the value of &#64;symbol in the current scope, or %NULL     if &#64;symbol is not bound in the current scope
    */
    public ch.bailu.gtk.type.Pointer lookupSymbol(String symbol)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaScanner.INST().g_scanner_lookup_symbol(asCPointer(), symbol)));
    }

    /**
     * Parses the next token, without removing it from the input stream.
     * <br>The token data is placed in the &#64;next_token, &#64;next_value, &#64;next_line,
     * <br>and &#64;next_position fields of the &#35;GScanner structure.
     * <br>
     * <br>Note that, while the token is not removed from the input stream
     * <br>(i.e. the next call to g_scanner_get_next_token() will return the
     * <br>same token), it will not be reevaluated. This can lead to surprising
     * <br>results when changing scope or the scanner configuration after peeking
     * <br>the next token. Getting the next token after switching the scope or
     * <br>configuration will return whatever was peeked before, regardless of
     * <br>any symbols that may have been added or removed in the new scope.
     * @return the type of the token
    */
    public int peekNextToken()  {
        return JnaScanner.INST().g_scanner_peek_next_token(asCPointer());
    }

    /**
     * Adds a symbol to the given scope.
     * @param scope_id the scope id
     * @param symbol the symbol to add
     * @param value the value of the symbol
    */
    public void scopeAddSymbol(int scope_id, @Nonnull ch.bailu.gtk.type.Str symbol, @Nullable ch.bailu.gtk.type.Pointer value)  {
        JnaScanner.INST().g_scanner_scope_add_symbol(asCPointer(), scope_id, asCPointerNotNull(symbol), asCPointer(value));
    }

    /**
     * Adds a symbol to the given scope.
     * @param scope_id the scope id
     * @param symbol the symbol to add
     * @param value the value of the symbol
    */
    public void scopeAddSymbol(int scope_id, String symbol, @Nullable ch.bailu.gtk.type.Pointer value)  {
        JnaScanner.INST().g_scanner_scope_add_symbol(asCPointer(), scope_id, symbol, asCPointer(value));
    }

    /**
     * Calls the given function for each of the symbol/value pairs
     * <br>in the given scope of the &#35;GScanner. The function is passed
     * <br>the symbol and value of each pair, and the given &#64;user_data
     * <br>parameter.
     * @param scope_id the scope id
     * @param func the function to call for each symbol/value pair
     * @param user_data user data to pass to the function
    */
    public void scopeForeachSymbol(int scope_id, OnHFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaScanner.INST().g_scanner_scope_foreach_symbol(asCPointer(), scope_id, toOnHFunc(this, "scopeForeachSymbol", func), asCPointer(user_data));
    }

    /**
     * Looks up a symbol in a scope and return its value. If the
     * <br>symbol is not bound in the scope, %NULL is returned.
     * @param scope_id the scope id
     * @param symbol the symbol to look up
     * @return the value of &#64;symbol in the given scope, or %NULL     if &#64;symbol is not bound in the given scope.
    */
    public ch.bailu.gtk.type.Pointer scopeLookupSymbol(int scope_id, @Nonnull ch.bailu.gtk.type.Str symbol)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaScanner.INST().g_scanner_scope_lookup_symbol(asCPointer(), scope_id, asCPointerNotNull(symbol))));
    }

    /**
     * Looks up a symbol in a scope and return its value. If the
     * <br>symbol is not bound in the scope, %NULL is returned.
     * @param scope_id the scope id
     * @param symbol the symbol to look up
     * @return the value of &#64;symbol in the given scope, or %NULL     if &#64;symbol is not bound in the given scope.
    */
    public ch.bailu.gtk.type.Pointer scopeLookupSymbol(int scope_id, String symbol)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaScanner.INST().g_scanner_scope_lookup_symbol(asCPointer(), scope_id, symbol)));
    }

    /**
     * Removes a symbol from a scope.
     * @param scope_id the scope id
     * @param symbol the symbol to remove
    */
    public void scopeRemoveSymbol(int scope_id, @Nonnull ch.bailu.gtk.type.Str symbol)  {
        JnaScanner.INST().g_scanner_scope_remove_symbol(asCPointer(), scope_id, asCPointerNotNull(symbol));
    }

    /**
     * Removes a symbol from a scope.
     * @param scope_id the scope id
     * @param symbol the symbol to remove
    */
    public void scopeRemoveSymbol(int scope_id, String symbol)  {
        JnaScanner.INST().g_scanner_scope_remove_symbol(asCPointer(), scope_id, symbol);
    }

    /**
     * Sets the current scope.
     * @param scope_id the new scope id
     * @return the old scope id
    */
    public int setScope(int scope_id)  {
        return JnaScanner.INST().g_scanner_set_scope(asCPointer(), scope_id);
    }

    /**
     * Rewinds the filedescriptor to the current buffer position
     * <br>and blows the file read ahead buffer. This is useful for
     * <br>third party uses of the scanners filedescriptor, which hooks
     * <br>onto the current scanning position.
    */
    public void syncFileOffset()  {
        JnaScanner.INST().g_scanner_sync_file_offset(asCPointer());
    }

    /**
     * Outputs a message through the scanner's msg_handler,
     * <br>resulting from an unexpected token in the input stream.
     * <br>Note that you should not call g_scanner_peek_next_token()
     * <br>followed by g_scanner_unexp_token() without an intermediate
     * <br>call to g_scanner_get_next_token(), as g_scanner_unexp_token()
     * <br>evaluates the scanner's current token (not the peeked token)
     * <br>to construct part of the message.
     * @param expected_token the expected token
     * @param identifier_spec a string describing how the scanner's user     refers to identifiers (%NULL defaults to &quot;identifier&quot;).     This is used if &#64;expected_token is %G_TOKEN_IDENTIFIER or     %G_TOKEN_IDENTIFIER_NULL.
     * @param symbol_spec a string describing how the scanner's user refers     to symbols (%NULL defaults to &quot;symbol&quot;). This is used if     &#64;expected_token is %G_TOKEN_SYMBOL or any token value greater     than %G_TOKEN_LAST.
     * @param symbol_name the name of the symbol, if the scanner's current     token is a symbol.
     * @param message a message string to output at the end of the     warning/error, or %NULL.
     * @param is_error if %TRUE it is output as an error. If %FALSE it is     output as a warning.
    */
    public void unexpToken(int expected_token, @Nonnull ch.bailu.gtk.type.Str identifier_spec, @Nonnull ch.bailu.gtk.type.Str symbol_spec, @Nonnull ch.bailu.gtk.type.Str symbol_name, @Nonnull ch.bailu.gtk.type.Str message, int is_error)  {
        JnaScanner.INST().g_scanner_unexp_token(asCPointer(), expected_token, asCPointerNotNull(identifier_spec), asCPointerNotNull(symbol_spec), asCPointerNotNull(symbol_name), asCPointerNotNull(message), is_error);
    }

    /**
     * Outputs a message through the scanner's msg_handler,
     * <br>resulting from an unexpected token in the input stream.
     * <br>Note that you should not call g_scanner_peek_next_token()
     * <br>followed by g_scanner_unexp_token() without an intermediate
     * <br>call to g_scanner_get_next_token(), as g_scanner_unexp_token()
     * <br>evaluates the scanner's current token (not the peeked token)
     * <br>to construct part of the message.
     * @param expected_token the expected token
     * @param identifier_spec a string describing how the scanner's user     refers to identifiers (%NULL defaults to &quot;identifier&quot;).     This is used if &#64;expected_token is %G_TOKEN_IDENTIFIER or     %G_TOKEN_IDENTIFIER_NULL.
     * @param symbol_spec a string describing how the scanner's user refers     to symbols (%NULL defaults to &quot;symbol&quot;). This is used if     &#64;expected_token is %G_TOKEN_SYMBOL or any token value greater     than %G_TOKEN_LAST.
     * @param symbol_name the name of the symbol, if the scanner's current     token is a symbol.
     * @param message a message string to output at the end of the     warning/error, or %NULL.
     * @param is_error if %TRUE it is output as an error. If %FALSE it is     output as a warning.
    */
    public void unexpToken(int expected_token, String identifier_spec, String symbol_spec, String symbol_name, String message, int is_error)  {
        JnaScanner.INST().g_scanner_unexp_token(asCPointer(), expected_token, identifier_spec, symbol_spec, symbol_name, message, is_error);
    }

    /**
     * Outputs a warning message, via the &#35;GScanner message handler.
     * @param format the message format. See the printf() documentation
     * @param _elipse the parameters to insert into the format string
    */
    public void warn(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaScanner.INST().g_scanner_warn(asCPointer(), asCPointerNotNull(format), _elipse);
    }

    /**
     * Outputs a warning message, via the &#35;GScanner message handler.
     * @param format the message format. See the printf() documentation
     * @param _elipse the parameters to insert into the format string
    */
    public void warn(String format, java.lang.Object... _elipse)  {
        JnaScanner.INST().g_scanner_warn(asCPointer(), format, _elipse);
    }

    /**
     * Creates a new &#35;GScanner.
     * <br>
     * <br>The &#64;config_templ structure specifies the initial settings
     * <br>of the scanner, which are copied into the &#35;GScanner
     * <br>&#64;config field. If you pass %NULL then the default settings
     * <br>are used.
     * @param config_templ the initial scanner settings
     * @return the new &#35;GScanner
    */
    public static Scanner _new(@Nonnull ScannerConfig config_templ)  {
        return new Scanner(new PointerContainer(JnaScanner.INST().g_scanner_new(asCPointerNotNull(config_templ))));
    }

}

/*
record-type
some-fields-unsupported

[MethodModel:cb-return-value-not-supported:curValue:[ParameterModel:direct-type:{Gg:TokenValue:{c:GTokenValue}}:{j:long}]]

[FieldModel:value:direct-type:{Gg:TokenValue:{c:GTokenValue}}:{j:long}]

[FieldModel:line:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:position:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:next_token:previous-field-unsupported:{G_::{c:GTokenType}}:{j:int}]

[FieldModel:next_value:direct-type:previous-field-unsupported:{Gg:TokenValue:{c:GTokenValue}}:{j:long}]

[FieldModel:next_line:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:next_position:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:symbol_table:previous-field-unsupported:{Gg:HashTable:{c:GHashTable*}}:{j:long}]

[FieldModel:input_fd:previous-field-unsupported:{G_::{c:gint}}:{j:int}]

[FieldModel:text:previous-field-unsupported:{Gw:Str:{c:const gchar*}}:{j:long}]

[FieldModel:text_end:previous-field-unsupported:{Gw:Str:{c:const gchar*}}:{j:long}]

[FieldModel:buffer:previous-field-unsupported:{Gw:Str:{c:gchar*}}:{j:long}]

[FieldModel:scope_id:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:msg_handler:previous-field-unsupported:[MethodModel:Supported:ScannerMsgFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Scanner:{c:GScanner*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]

[MethodModel:Supported:ScannerMsgFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Scanner:{c:GScanner*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
*/
