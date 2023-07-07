/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkAboutDialog` offers a simple way to display information about
 * <br>a program.
 * <br>
 * <br>The shown information includes the programs' logo, name, copyright,
 * <br>website and license. It is also possible to give credits to the authors,
 * <br>documenters, translators and artists who have worked on the program.
 * <br>
 * <br>An about dialog is typically opened when the user selects the `About`
 * <br>option from the `Help` menu. All parts of the dialog are optional.
 * <br>
 * <br>![An example GtkAboutDialog](aboutdialog.png)
 * <br>
 * <br>About dialogs often contain links and email addresses. `GtkAboutDialog`
 * <br>displays these as clickable links. By default, it calls [func&#64;Gtk.show_uri]
 * <br>when a user clicks one. The behaviour can be overridden with the
 * <br>[signal&#64;Gtk.AboutDialog::activate-link] signal.
 * <br>
 * <br>To specify a person with an email address, use a string like
 * <br>`Edgar Allan Poe &lt;edgar&#64;poe.com&gt;`. To specify a website with a title,
 * <br>use a string like `GTK team https://www.gtk.org`.
 * <br>
 * <br>To make constructing a `GtkAboutDialog` as convenient as possible, you can
 * <br>use the function [func&#64;Gtk.show_about_dialog] which constructs and shows
 * <br>a dialog and keeps it around so that it can be shown again.
 * <br>
 * <br>Note that GTK sets a default title of `_(&quot;About %s&quot;)` on the dialog
 * <br>window (where `%s` is replaced by the name of the application, but in
 * <br>order to ensure proper translation of the title, applications should
 * <br>set the title property explicitly when constructing a `GtkAboutDialog`,
 * <br>as shown in the following example:
 * <br>
 * <br>```c
 * <br>GFile *logo_file = g_file_new_for_path (&quot;./logo.png&quot;);
 * <br>GdkTexture *example_logo = gdk_texture_new_from_file (logo_file, NULL);
 * <br>g_object_unref (logo_file);
 * <br>
 * <br>gtk_show_about_dialog (NULL,
 * <br>                       &quot;program-name&quot;, &quot;ExampleCode&quot;,
 * <br>                       &quot;logo&quot;, example_logo,
 * <br>                       &quot;title&quot;, _(&quot;About ExampleCode&quot;),
 * <br>                       NULL);
 * <br>```
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`GtkAboutDialog` has a single CSS node with the name `window` and style
 * <br>class `.aboutdialog`.
 * <p><a href="https://docs.gtk.org/gtk4/class.AboutDialog.html">https://docs.gtk.org/gtk4/class.AboutDialog.html</a></p>
*/
public class AboutDialog extends Window {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AboutDialog.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivateLink {
        /**
         * Emitted every time a URL is activated.
         * <br>
         * <br>Applications may connect to it to override the default behaviour,
         * <br>which is to call [func&#64;Gtk.show_uri].
         * @param uri the URI that is activated
         * @return `TRUE` if the link has been activated
        */
        boolean onActivateLink(@Nonnull ch.bailu.gtk.type.Str uri);
    }
    
    private static com.sun.jna.Callback toOnActivateLink(OnActivateLink in) {
        return (in == null) ? null: (JnaAboutDialog.OnActivateLink) (__self, _uri, __data) -> in.onActivateLink(new ch.bailu.gtk.type.Str(new PointerContainer(_uri)));
    }

    public AboutDialog(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkAboutDialog`.
    */
    public AboutDialog() {
        super(cast(JnaAboutDialog.INST().gtk_about_dialog_new()));
    }

    /**
     * Creates a new section in the &quot;Credits&quot; page.
     * @param section_name The name of the section
     * @param people The people who belong to that section
    */
    public void addCreditSection(@Nonnull ch.bailu.gtk.type.Str section_name, @Nonnull ch.bailu.gtk.type.Strs people)  {
        JnaAboutDialog.INST().gtk_about_dialog_add_credit_section(asCPointer(), asCPointerNotNull(section_name), asCPointerNotNull(people));
    }

    /**
     * Creates a new section in the &quot;Credits&quot; page.
     * @param section_name The name of the section
     * @param people The people who belong to that section
    */
    public void addCreditSection(String section_name, @Nonnull ch.bailu.gtk.type.Strs people)  {
        JnaAboutDialog.INST().gtk_about_dialog_add_credit_section(asCPointer(), section_name, asCPointerNotNull(people));
    }

    /**
     * Returns the names of the artists which are displayed
     * <br>in the credits page.
     * @return A   `NULL`-terminated string array containing the artists
    */
    public ch.bailu.gtk.type.Strs getArtists()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_artists(asCPointer())));
    }

    /**
     * Returns the names of the authors which are displayed
     * <br>in the credits page.
     * @return A   `NULL`-terminated string array containing the authors
    */
    public ch.bailu.gtk.type.Strs getAuthors()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_authors(asCPointer())));
    }

    /**
     * Returns the comments string.
     * @return The comments
    */
    public ch.bailu.gtk.type.Str getComments()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_comments(asCPointer())));
    }

    /**
     * Returns the copyright string.
     * @return The copyright string
    */
    public ch.bailu.gtk.type.Str getCopyright()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_copyright(asCPointer())));
    }

    /**
     * Returns the name of the documenters which are displayed
     * <br>in the credits page.
     * @return A   `NULL`-terminated string array containing the documenters
    */
    public ch.bailu.gtk.type.Strs getDocumenters()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_documenters(asCPointer())));
    }

    /**
     * Returns the license information.
     * @return The license information
    */
    public ch.bailu.gtk.type.Str getLicense()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_license(asCPointer())));
    }

    /**
     * Retrieves the license type.
     * @return a [enum&#64;Gtk.License] value
    */
    public int getLicenseType()  {
        return JnaAboutDialog.INST().gtk_about_dialog_get_license_type(asCPointer());
    }

    /**
     * Returns the paintable displayed as logo in the about dialog.
     * @return the paintable displayed as   logo or `NULL` if the logo is unset or has been set via   [method&#64;Gtk.AboutDialog.set_logo_icon_name]
    */
    public ch.bailu.gtk.gdk.Paintable getLogo()  {
        return new ch.bailu.gtk.gdk.Paintable(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_logo(asCPointer())));
    }

    /**
     * Returns the icon name displayed as logo in the about dialog.
     * @return the icon name displayed as logo,   or `NULL` if the logo has been set via [method&#64;Gtk.AboutDialog.set_logo]
    */
    public ch.bailu.gtk.type.Str getLogoIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_logo_icon_name(asCPointer())));
    }

    /**
     * Returns the program name displayed in the about dialog.
     * @return The program name
    */
    public ch.bailu.gtk.type.Str getProgramName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_program_name(asCPointer())));
    }

    /**
     * Returns the system information that is shown in the about dialog.
     * @return the system information
    */
    public ch.bailu.gtk.type.Str getSystemInformation()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_system_information(asCPointer())));
    }

    /**
     * Returns the translator credits string which is displayed
     * <br>in the credits page.
     * @return The translator credits string
    */
    public ch.bailu.gtk.type.Str getTranslatorCredits()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_translator_credits(asCPointer())));
    }

    /**
     * Returns the version string.
     * @return The version string
    */
    public ch.bailu.gtk.type.Str getVersion()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_version(asCPointer())));
    }

    /**
     * Returns the website URL.
     * @return The website URL
    */
    public ch.bailu.gtk.type.Str getWebsite()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_website(asCPointer())));
    }

    /**
     * Returns the label used for the website link.
     * @return The label used for the website link
    */
    public ch.bailu.gtk.type.Str getWebsiteLabel()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutDialog.INST().gtk_about_dialog_get_website_label(asCPointer())));
    }

    /**
     * Returns whether the license text in the about dialog is
     * <br>automatically wrapped.
     * @return `TRUE` if the license text is wrapped
    */
    public boolean getWrapLicense()  {
        return JnaAboutDialog.INST().gtk_about_dialog_get_wrap_license(asCPointer());
    }

    /**
     * Sets the names of the artists to be displayed
     * <br>in the &quot;Credits&quot; page.
     * @param artists the authors of the artwork   of the application
    */
    public void setArtists(@Nonnull ch.bailu.gtk.type.Strs artists)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_artists(asCPointer(), asCPointerNotNull(artists));
    }

    /**
     * Sets the names of the authors which are displayed
     * <br>in the &quot;Credits&quot; page of the about dialog.
     * @param authors the authors of the application
    */
    public void setAuthors(@Nonnull ch.bailu.gtk.type.Strs authors)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_authors(asCPointer(), asCPointerNotNull(authors));
    }

    /**
     * Sets the comments string to display in the about dialog.
     * <br>
     * <br>This should be a short string of one or two lines.
     * @param comments a comments string
    */
    public void setComments(@Nullable ch.bailu.gtk.type.Str comments)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_comments(asCPointer(), asCPointer(comments));
    }

    /**
     * Sets the comments string to display in the about dialog.
     * <br>
     * <br>This should be a short string of one or two lines.
     * @param comments a comments string
    */
    public void setComments(String comments)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_comments(asCPointer(), comments);
    }

    /**
     * Sets the copyright string to display in the about dialog.
     * <br>
     * <br>This should be a short string of one or two lines.
     * @param copyright the copyright string
    */
    public void setCopyright(@Nullable ch.bailu.gtk.type.Str copyright)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_copyright(asCPointer(), asCPointer(copyright));
    }

    /**
     * Sets the copyright string to display in the about dialog.
     * <br>
     * <br>This should be a short string of one or two lines.
     * @param copyright the copyright string
    */
    public void setCopyright(String copyright)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_copyright(asCPointer(), copyright);
    }

    /**
     * Sets the names of the documenters which are displayed
     * <br>in the &quot;Credits&quot; page.
     * @param documenters the authors of the documentation   of the application
    */
    public void setDocumenters(@Nonnull ch.bailu.gtk.type.Strs documenters)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_documenters(asCPointer(), asCPointerNotNull(documenters));
    }

    /**
     * Sets the license information to be displayed in the
     * <br>about dialog.
     * <br>
     * <br>If `license` is `NULL`, the license page is hidden.
     * @param license the license information
    */
    public void setLicense(@Nullable ch.bailu.gtk.type.Str license)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_license(asCPointer(), asCPointer(license));
    }

    /**
     * Sets the license information to be displayed in the
     * <br>about dialog.
     * <br>
     * <br>If `license` is `NULL`, the license page is hidden.
     * @param license the license information
    */
    public void setLicense(String license)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_license(asCPointer(), license);
    }

    /**
     * Sets the license of the application showing the about dialog from a
     * <br>list of known licenses.
     * <br>
     * <br>This function overrides the license set using
     * <br>[method&#64;Gtk.AboutDialog.set_license].
     * @param license_type the type of license
    */
    public void setLicenseType(int license_type)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_license_type(asCPointer(), license_type);
    }

    /**
     * Sets the logo in the about dialog.
     * @param logo a `GdkPaintable`
    */
    public void setLogo(@Nullable ch.bailu.gtk.gdk.Paintable logo)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_logo(asCPointer(), asCPointer(logo));
    }

    /**
     * Sets the icon name to be displayed as logo in the about dialog.
     * @param icon_name an icon name
    */
    public void setLogoIconName(@Nullable ch.bailu.gtk.type.Str icon_name)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_logo_icon_name(asCPointer(), asCPointer(icon_name));
    }

    /**
     * Sets the icon name to be displayed as logo in the about dialog.
     * @param icon_name an icon name
    */
    public void setLogoIconName(String icon_name)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_logo_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets the name to display in the about dialog.
     * <br>
     * <br>If `name` is not set, the string returned
     * <br>by `g_get_application_name()` is used.
     * @param name the program name
    */
    public void setProgramName(@Nullable ch.bailu.gtk.type.Str name)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_program_name(asCPointer(), asCPointer(name));
    }

    /**
     * Sets the name to display in the about dialog.
     * <br>
     * <br>If `name` is not set, the string returned
     * <br>by `g_get_application_name()` is used.
     * @param name the program name
    */
    public void setProgramName(String name)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_program_name(asCPointer(), name);
    }

    /**
     * Sets the system information to be displayed in the about
     * <br>dialog.
     * <br>
     * <br>If `system_information` is `NULL`, the system information
     * <br>page is hidden.
     * <br>
     * <br>See [property&#64;Gtk.AboutDialog:system-information].
     * @param system_information system information
    */
    public void setSystemInformation(@Nullable ch.bailu.gtk.type.Str system_information)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_system_information(asCPointer(), asCPointer(system_information));
    }

    /**
     * Sets the system information to be displayed in the about
     * <br>dialog.
     * <br>
     * <br>If `system_information` is `NULL`, the system information
     * <br>page is hidden.
     * <br>
     * <br>See [property&#64;Gtk.AboutDialog:system-information].
     * @param system_information system information
    */
    public void setSystemInformation(String system_information)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_system_information(asCPointer(), system_information);
    }

    /**
     * Sets the translator credits string which is displayed in
     * <br>the credits page.
     * <br>
     * <br>The intended use for this string is to display the translator
     * <br>of the language which is currently used in the user interface.
     * <br>Using `gettext()`, a simple way to achieve that is to mark the
     * <br>string for translation:
     * <br>
     * <br>```c
     * <br>GtkWidget *about = gtk_about_dialog_new ();
     * <br> gtk_about_dialog_set_translator_credits (GTK_ABOUT_DIALOG (about),
     * <br>                                          _(&quot;translator-credits&quot;));
     * <br>```
     * <br>
     * <br>It is a good idea to use the customary `msgid` “translator-credits”
     * <br>for this purpose, since translators will already know the purpose of
     * <br>that `msgid`, and since `GtkAboutDialog` will detect if “translator-credits”
     * <br>is untranslated and omit translator credits.
     * @param translator_credits the translator credits
    */
    public void setTranslatorCredits(@Nullable ch.bailu.gtk.type.Str translator_credits)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_translator_credits(asCPointer(), asCPointer(translator_credits));
    }

    /**
     * Sets the translator credits string which is displayed in
     * <br>the credits page.
     * <br>
     * <br>The intended use for this string is to display the translator
     * <br>of the language which is currently used in the user interface.
     * <br>Using `gettext()`, a simple way to achieve that is to mark the
     * <br>string for translation:
     * <br>
     * <br>```c
     * <br>GtkWidget *about = gtk_about_dialog_new ();
     * <br> gtk_about_dialog_set_translator_credits (GTK_ABOUT_DIALOG (about),
     * <br>                                          _(&quot;translator-credits&quot;));
     * <br>```
     * <br>
     * <br>It is a good idea to use the customary `msgid` “translator-credits”
     * <br>for this purpose, since translators will already know the purpose of
     * <br>that `msgid`, and since `GtkAboutDialog` will detect if “translator-credits”
     * <br>is untranslated and omit translator credits.
     * @param translator_credits the translator credits
    */
    public void setTranslatorCredits(String translator_credits)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_translator_credits(asCPointer(), translator_credits);
    }

    /**
     * Sets the version string to display in the about dialog.
     * @param version the version string
    */
    public void setVersion(@Nullable ch.bailu.gtk.type.Str version)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_version(asCPointer(), asCPointer(version));
    }

    /**
     * Sets the version string to display in the about dialog.
     * @param version the version string
    */
    public void setVersion(String version)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_version(asCPointer(), version);
    }

    /**
     * Sets the URL to use for the website link.
     * @param website a URL string starting with `http://`
    */
    public void setWebsite(@Nullable ch.bailu.gtk.type.Str website)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_website(asCPointer(), asCPointer(website));
    }

    /**
     * Sets the URL to use for the website link.
     * @param website a URL string starting with `http://`
    */
    public void setWebsite(String website)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_website(asCPointer(), website);
    }

    /**
     * Sets the label to be used for the website link.
     * @param website_label the label used for the website link
    */
    public void setWebsiteLabel(@Nonnull ch.bailu.gtk.type.Str website_label)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_website_label(asCPointer(), asCPointerNotNull(website_label));
    }

    /**
     * Sets the label to be used for the website link.
     * @param website_label the label used for the website link
    */
    public void setWebsiteLabel(String website_label)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_website_label(asCPointer(), website_label);
    }

    /**
     * Sets whether the license text in the about dialog should be
     * <br>automatically wrapped.
     * @param wrap_license whether to wrap the license
    */
    public void setWrapLicense(boolean wrap_license)  {
        JnaAboutDialog.INST().gtk_about_dialog_set_wrap_license(asCPointer(), wrap_license);
    }

    public final static String SIGNAL_ON_ACTIVATE_LINK = "activate-link";
    
    /**
     * Connect to signal "activate-link".
     * <br>See {@link OnActivateLink#onActivateLink} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE_LINK} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivateLink(OnActivateLink signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE_LINK, toOnActivateLink(signal));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link Native}. Call this to get access to interface functions.
     * @return {@link Native}
    */
    public Native asNative() {
        return new Native(cast());
    }

    /**
     * Implements interface {@link Root}. Call this to get access to interface functions.
     * @return {@link Root}
    */
    public Root asRoot() {
        return new Root(cast());
    }

    /**
     * Implements interface {@link ShortcutManager}. Call this to get access to interface functions.
     * @return {@link ShortcutManager}
    */
    public ShortcutManager asShortcutManager() {
        return new ShortcutManager(cast());
    }

    public static long getTypeID() { 
        return JnaAboutDialog.INST().gtk_about_dialog_get_type(); 
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
