/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A window showing information about the application.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;about-window-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;about-window.png&quot; alt=&quot;about-window&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>An about window is typically opened when the user activates the `About …`
 * <br>item in the application's primary menu. All parts of the window are optional.
 * <br>
 * <br>&#35;&#35; Main page
 * <br>
 * <br>`AdwAboutWindow` prominently displays the application's icon, name, developer
 * <br>name and version. They can be set with the [property&#64;AboutWindow:application-icon],
 * <br>[property&#64;AboutWindow:application-name],
 * <br>[property&#64;AboutWindow:developer-name] and [property&#64;AboutWindow:version]
 * <br>respectively.
 * <br>
 * <br>&#35;&#35; What's New
 * <br>
 * <br>`AdwAboutWindow` provides a way for applications to display their release
 * <br>notes, set with the [property&#64;AboutWindow:release-notes] property.
 * <br>
 * <br>Release notes are formatted the same way as
 * <br>[AppStream descriptions](https://freedesktop.org/software/appstream/docs/chap-Metadata.html&#35;tag-description).
 * <br>
 * <br>The supported formatting options are:
 * <br>
 * <br>* Paragraph (`&lt;p&gt;`)
 * <br>* Ordered list (`&lt;ol&gt;`), with list items (`&lt;li&gt;`)
 * <br>* Unordered list (`&lt;ul&gt;`), with list items (`&lt;li&gt;`)
 * <br>
 * <br>Within paragraphs and list items, emphasis (`&lt;em&gt;`) and inline code
 * <br>(`&lt;code&gt;`) text styles are supported. The emphasis is rendered in italic,
 * <br>while inline code is shown in a monospaced font.
 * <br>
 * <br>Any text outside paragraphs or list items is ignored.
 * <br>
 * <br>Nested lists are not supported.
 * <br>
 * <br>Only one version can be shown at a time. By default, the displayed version
 * <br>number matches [property&#64;AboutWindow:version]. Use
 * <br>[property&#64;AboutWindow:release-notes-version] to override it.
 * <br>
 * <br>&#35;&#35; Details
 * <br>
 * <br>The Details page displays the application comments and links.
 * <br>
 * <br>The comments can be set with the [property&#64;AboutWindow:comments] property.
 * <br>Unlike [property&#64;Gtk.AboutDialog:comments], this string can be long and
 * <br>detailed. It can also contain links and Pango markup.
 * <br>
 * <br>To set the application website, use [property&#64;AboutWindow:website].
 * <br>To add extra links below the website, use [method&#64;AboutWindow.add_link].
 * <br>
 * <br>If the Details page doesn't have any other content besides website, the
 * <br>website will be displayed on the main page instead.
 * <br>
 * <br>&#35;&#35; Troubleshooting
 * <br>
 * <br>`AdwAboutWindow` displays the following two links on the main page:
 * <br>
 * <br>* Support Questions, set with the [property&#64;AboutWindow:support-url] property,
 * <br>* Report an Issue, set with the [property&#64;AboutWindow:issue-url] property.
 * <br>
 * <br>Additionally, applications can provide debugging information. It will be
 * <br>shown separately on the Troubleshooting page. Use the
 * <br>[property&#64;AboutWindow:debug-info] property to specify it.
 * <br>
 * <br>It's intended to be attached to issue reports when reporting issues against
 * <br>the application. As such, it cannot contain markup or links.
 * <br>
 * <br>`AdwAboutWindow` provides a quick way to save debug information to a file.
 * <br>When saving, [property&#64;AboutWindow:debug-info-filename] would be used as
 * <br>the suggested filename.
 * <br>
 * <br>&#35;&#35; Credits and Acknowledgements
 * <br>
 * <br>The Credits page has the following default sections:
 * <br>
 * <br>* Developers, set with the [property&#64;AboutWindow:developers] property,
 * <br>* Designers, set with the [property&#64;AboutWindow:designers] property,
 * <br>* Artists, set with the [property&#64;AboutWindow:artists] property,
 * <br>* Documenters, set with the [property&#64;AboutWindow:documenters] property,
 * <br>* Translators, set with the [property&#64;AboutWindow:translator-credits] property.
 * <br>
 * <br>When setting translator credits, use the strings `&quot;translator-credits&quot;` or
 * <br>`&quot;translator_credits&quot;` and mark them as translatable.
 * <br>
 * <br>The default sections that don't contain any names won't be displayed.
 * <br>
 * <br>The Credits page can also contain an arbitrary number of extra sections below
 * <br>the default ones. Use [method&#64;AboutWindow.add_credit_section] to add them.
 * <br>
 * <br>The Acknowledgements page can be used to acknowledge additional people and
 * <br>organizations for their non-development contributions. Use
 * <br>[method&#64;AboutWindow.add_acknowledgement_section] to add sections to it. For
 * <br>example, it can be used to list backers in a crowdfunded project or to give
 * <br>special thanks.
 * <br>
 * <br>Each of the people or organizations can have an email address or a website
 * <br>specified. To add a email address, use a string like
 * <br>`Edgar Allan Poe &lt;edgar&#64;poe.com&gt;`. To specify a website with a title, use a
 * <br>string like `The GNOME Project https://www.gnome.org`:
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;about-window-credits-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;about-window-credits.png&quot; alt=&quot;about-window-credits&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>&#35;&#35; Legal
 * <br>
 * <br>The Legal page displays the copyright and licensing information for the
 * <br>application and other modules.
 * <br>
 * <br>The copyright string is set with the [property&#64;AboutWindow:copyright]
 * <br>property and should be a short string of one or two lines, for example:
 * <br>`© 2022 Example`.
 * <br>
 * <br>Licensing information can be quickly set from a list of known licenses with
 * <br>the [property&#64;AboutWindow:license-type] property. If the application's
 * <br>license is not in the list, [property&#64;AboutWindow:license] can be used
 * <br>instead.
 * <br>
 * <br>To add information about other modules, such as application dependencies or
 * <br>data, use [method&#64;AboutWindow.add_legal_section].
 * <br>
 * <br>&#35;&#35; Constructing
 * <br>
 * <br>To make constructing an `AdwAboutWindow` as convenient as possible, you can
 * <br>use the function [func&#64;show_about_window] which constructs and shows a
 * <br>window.
 * <br>
 * <br>```c
 * <br>static void
 * <br>show_about (GtkApplication *app)
 * <br>{
 * <br>  const char *developers[] = {
 * <br>    &quot;Angela Avery&quot;,
 * <br>    NULL
 * <br>  };
 * <br>
 * <br>  const char *designers[] = {
 * <br>    &quot;GNOME Design Team&quot;,
 * <br>    NULL
 * <br>  };
 * <br>
 * <br>  adw_show_about_window (gtk_application_get_active_window (app),
 * <br>                         &quot;application-name&quot;, _(&quot;Example&quot;),
 * <br>                         &quot;application-icon&quot;, &quot;org.example.App&quot;,
 * <br>                         &quot;version&quot;, &quot;1.2.3&quot;,
 * <br>                         &quot;copyright&quot;, &quot;© 2022 Angela Avery&quot;,
 * <br>                         &quot;issue-url&quot;, &quot;https://gitlab.gnome.org/example/example/-/issues/new&quot;,
 * <br>                         &quot;license-type&quot;, GTK_LICENSE_GPL_3_0,
 * <br>                         &quot;developers&quot;, developers,
 * <br>                         &quot;designers&quot;, designers,
 * <br>                         &quot;translator-credits&quot;, _(&quot;translator-credits&quot;),
 * <br>                         NULL);
 * <br>}
 * <br>```
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwAboutWindow` has a main CSS node with the name `window` and the
 * <br>style class `.about`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.AboutWindow.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.AboutWindow.html</a></p>
*/
public class AboutWindow extends Window {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AboutWindow.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivateLink {
        /**
         * Emitted when a URL is activated.
         * <br>
         * <br>Applications may connect to it to override the default behavior, which is
         * <br>to call [func&#64;Gtk.show_uri].
         * @param uri the URI to activate
         * @return `TRUE` if the link has been activated
        */
        boolean onActivateLink(@Nonnull ch.bailu.gtk.type.Str uri);
    }
    
    private static com.sun.jna.Callback toOnActivateLink(OnActivateLink in) {
        return (in == null) ? null: (JnaAboutWindow.OnActivateLink) (__self, _uri, __data) -> in.onActivateLink(new ch.bailu.gtk.type.Str(new PointerContainer(_uri)));
    }

    public AboutWindow(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwAboutWindow`.
    */
    public AboutWindow() {
        super(cast(JnaAboutWindow.INST().adw_about_window_new()));
    }

    /**
     * Adds a section to the Acknowledgements page.
     * <br>
     * <br>This can be used to acknowledge additional people and organizations for their
     * <br>non-development contributions - for example, backers in a crowdfunded
     * <br>project.
     * <br>
     * <br>Each name may contain email addresses and URLs, see the introduction for more
     * <br>details.
     * <br>
     * <br>See also:
     * <br>
     * <br>* [property&#64;AboutWindow:developers]
     * <br>* [property&#64;AboutWindow:designers]
     * <br>* [property&#64;AboutWindow:artists]
     * <br>* [property&#64;AboutWindow:documenters]
     * <br>* [property&#64;AboutWindow:translator-credits]
     * <br>* [method&#64;AboutWindow.add_credit_section]
     * @param name the section name
     * @param people the list of names
    */
    public void addAcknowledgementSection(@Nullable ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Strs people)  {
        JnaAboutWindow.INST().adw_about_window_add_acknowledgement_section(asCPointer(), asCPointer(name), asCPointerNotNull(people));
    }

    /**
     * Adds a section to the Acknowledgements page.
     * <br>
     * <br>This can be used to acknowledge additional people and organizations for their
     * <br>non-development contributions - for example, backers in a crowdfunded
     * <br>project.
     * <br>
     * <br>Each name may contain email addresses and URLs, see the introduction for more
     * <br>details.
     * <br>
     * <br>See also:
     * <br>
     * <br>* [property&#64;AboutWindow:developers]
     * <br>* [property&#64;AboutWindow:designers]
     * <br>* [property&#64;AboutWindow:artists]
     * <br>* [property&#64;AboutWindow:documenters]
     * <br>* [property&#64;AboutWindow:translator-credits]
     * <br>* [method&#64;AboutWindow.add_credit_section]
     * @param name the section name
     * @param people the list of names
    */
    public void addAcknowledgementSection(String name, @Nonnull ch.bailu.gtk.type.Strs people)  {
        JnaAboutWindow.INST().adw_about_window_add_acknowledgement_section(asCPointer(), name, asCPointerNotNull(people));
    }

    /**
     * Adds an extra section to the Credits page.
     * <br>
     * <br>Extra sections are displayed below the standard categories.
     * <br>
     * <br>Each name may contain email addresses and URLs, see the introduction for more
     * <br>details.
     * <br>
     * <br>See also:
     * <br>
     * <br>* [property&#64;AboutWindow:developers]
     * <br>* [property&#64;AboutWindow:designers]
     * <br>* [property&#64;AboutWindow:artists]
     * <br>* [property&#64;AboutWindow:documenters]
     * <br>* [property&#64;AboutWindow:translator-credits]
     * <br>* [method&#64;AboutWindow.add_acknowledgement_section]
     * @param name the section name
     * @param people the list of names
    */
    public void addCreditSection(@Nullable ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Strs people)  {
        JnaAboutWindow.INST().adw_about_window_add_credit_section(asCPointer(), asCPointer(name), asCPointerNotNull(people));
    }

    /**
     * Adds an extra section to the Credits page.
     * <br>
     * <br>Extra sections are displayed below the standard categories.
     * <br>
     * <br>Each name may contain email addresses and URLs, see the introduction for more
     * <br>details.
     * <br>
     * <br>See also:
     * <br>
     * <br>* [property&#64;AboutWindow:developers]
     * <br>* [property&#64;AboutWindow:designers]
     * <br>* [property&#64;AboutWindow:artists]
     * <br>* [property&#64;AboutWindow:documenters]
     * <br>* [property&#64;AboutWindow:translator-credits]
     * <br>* [method&#64;AboutWindow.add_acknowledgement_section]
     * @param name the section name
     * @param people the list of names
    */
    public void addCreditSection(String name, @Nonnull ch.bailu.gtk.type.Strs people)  {
        JnaAboutWindow.INST().adw_about_window_add_credit_section(asCPointer(), name, asCPointerNotNull(people));
    }

    /**
     * Adds an extra section to the Legal page.
     * <br>
     * <br>Extra sections will be displayed below the application's own information.
     * <br>
     * <br>The parameters &#64;copyright, &#64;license_type and &#64;license will be used to present
     * <br>the it the same way as [property&#64;AboutWindow:copyright],
     * <br>[property&#64;AboutWindow:license-type] and [property&#64;AboutWindow:license] are
     * <br>for the application's own information.
     * <br>
     * <br>See those properties for more details.
     * <br>
     * <br>This can be useful to attribute the application dependencies or data.
     * <br>
     * <br>Examples:
     * <br>
     * <br>```c
     * <br>adw_about_window_add_legal_section (ADW_ABOUT_WINDOW (about),
     * <br>                                    _(&quot;Copyright and a known license&quot;),
     * <br>                                    &quot;© 2022 Example&quot;,
     * <br>                                    GTK_LICENSE_LGPL_2_1,
     * <br>                                    NULL);
     * <br>
     * <br>adw_about_window_add_legal_section (ADW_ABOUT_WINDOW (about),
     * <br>                                    _(&quot;Copyright and custom license&quot;),
     * <br>                                    &quot;© 2022 Example&quot;,
     * <br>                                    GTK_LICENSE_CUSTOM,
     * <br>                                    &quot;Custom license text&quot;);
     * <br>
     * <br>adw_about_window_add_legal_section (ADW_ABOUT_WINDOW (about),
     * <br>                                    _(&quot;Copyright only&quot;),
     * <br>                                    &quot;© 2022 Example&quot;,
     * <br>                                    GTK_LICENSE_UNKNOWN,
     * <br>                                    NULL);
     * <br>
     * <br>adw_about_window_add_legal_section (ADW_ABOUT_WINDOW (about),
     * <br>                                    _(&quot;Custom license only&quot;),
     * <br>                                    NULL,
     * <br>                                    GTK_LICENSE_CUSTOM,
     * <br>                                    &quot;Something completely custom here.&quot;);
     * <br>```
     * @param title the name of the section
     * @param copyright a copyright string
     * @param license_type the type of license
     * @param license custom license information
    */
    public void addLegalSection(@Nonnull ch.bailu.gtk.type.Str title, @Nullable ch.bailu.gtk.type.Str copyright, int license_type, @Nullable ch.bailu.gtk.type.Str license)  {
        JnaAboutWindow.INST().adw_about_window_add_legal_section(asCPointer(), asCPointerNotNull(title), asCPointer(copyright), license_type, asCPointer(license));
    }

    /**
     * Adds an extra section to the Legal page.
     * <br>
     * <br>Extra sections will be displayed below the application's own information.
     * <br>
     * <br>The parameters &#64;copyright, &#64;license_type and &#64;license will be used to present
     * <br>the it the same way as [property&#64;AboutWindow:copyright],
     * <br>[property&#64;AboutWindow:license-type] and [property&#64;AboutWindow:license] are
     * <br>for the application's own information.
     * <br>
     * <br>See those properties for more details.
     * <br>
     * <br>This can be useful to attribute the application dependencies or data.
     * <br>
     * <br>Examples:
     * <br>
     * <br>```c
     * <br>adw_about_window_add_legal_section (ADW_ABOUT_WINDOW (about),
     * <br>                                    _(&quot;Copyright and a known license&quot;),
     * <br>                                    &quot;© 2022 Example&quot;,
     * <br>                                    GTK_LICENSE_LGPL_2_1,
     * <br>                                    NULL);
     * <br>
     * <br>adw_about_window_add_legal_section (ADW_ABOUT_WINDOW (about),
     * <br>                                    _(&quot;Copyright and custom license&quot;),
     * <br>                                    &quot;© 2022 Example&quot;,
     * <br>                                    GTK_LICENSE_CUSTOM,
     * <br>                                    &quot;Custom license text&quot;);
     * <br>
     * <br>adw_about_window_add_legal_section (ADW_ABOUT_WINDOW (about),
     * <br>                                    _(&quot;Copyright only&quot;),
     * <br>                                    &quot;© 2022 Example&quot;,
     * <br>                                    GTK_LICENSE_UNKNOWN,
     * <br>                                    NULL);
     * <br>
     * <br>adw_about_window_add_legal_section (ADW_ABOUT_WINDOW (about),
     * <br>                                    _(&quot;Custom license only&quot;),
     * <br>                                    NULL,
     * <br>                                    GTK_LICENSE_CUSTOM,
     * <br>                                    &quot;Something completely custom here.&quot;);
     * <br>```
     * @param title the name of the section
     * @param copyright a copyright string
     * @param license_type the type of license
     * @param license custom license information
    */
    public void addLegalSection(String title, String copyright, int license_type, String license)  {
        JnaAboutWindow.INST().adw_about_window_add_legal_section(asCPointer(), title, copyright, license_type, license);
    }

    /**
     * Adds an extra link to the Details page.
     * <br>
     * <br>Extra links are displayed under the comment and website.
     * <br>
     * <br>Underlines in &#64;title will be interpreted as indicating a mnemonic.
     * <br>
     * <br>See [property&#64;AboutWindow:website].
     * @param title the link title
     * @param url the link URL
    */
    public void addLink(@Nonnull ch.bailu.gtk.type.Str title, @Nonnull ch.bailu.gtk.type.Str url)  {
        JnaAboutWindow.INST().adw_about_window_add_link(asCPointer(), asCPointerNotNull(title), asCPointerNotNull(url));
    }

    /**
     * Adds an extra link to the Details page.
     * <br>
     * <br>Extra links are displayed under the comment and website.
     * <br>
     * <br>Underlines in &#64;title will be interpreted as indicating a mnemonic.
     * <br>
     * <br>See [property&#64;AboutWindow:website].
     * @param title the link title
     * @param url the link URL
    */
    public void addLink(String title, String url)  {
        JnaAboutWindow.INST().adw_about_window_add_link(asCPointer(), title, url);
    }

    /**
     * Gets the name of the application icon for &#64;self.
     * @return the application icon name
    */
    public ch.bailu.gtk.type.Str getApplicationIcon()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_application_icon(asCPointer())));
    }

    /**
     * Gets the application name for &#64;self.
     * @return the application name
    */
    public ch.bailu.gtk.type.Str getApplicationName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_application_name(asCPointer())));
    }

    /**
     * Gets the list of artists of the application.
     * @return The list of artists
    */
    public ch.bailu.gtk.type.Strs getArtists()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_artists(asCPointer())));
    }

    /**
     * Gets the comments about the application.
     * @return the comments
    */
    public ch.bailu.gtk.type.Str getComments()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_comments(asCPointer())));
    }

    /**
     * Gets the copyright information for &#64;self.
     * @return the copyright information
    */
    public ch.bailu.gtk.type.Str getCopyright()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_copyright(asCPointer())));
    }

    /**
     * Gets the debug information for &#64;self.
     * @return the debug information
    */
    public ch.bailu.gtk.type.Str getDebugInfo()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_debug_info(asCPointer())));
    }

    /**
     * Gets the debug information filename for &#64;self.
     * @return the debug information filename
    */
    public ch.bailu.gtk.type.Str getDebugInfoFilename()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_debug_info_filename(asCPointer())));
    }

    /**
     * Gets the list of designers of the application.
     * @return The list of designers
    */
    public ch.bailu.gtk.type.Strs getDesigners()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_designers(asCPointer())));
    }

    /**
     * Gets the developer name for &#64;self.
     * @return the developer_name
    */
    public ch.bailu.gtk.type.Str getDeveloperName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_developer_name(asCPointer())));
    }

    /**
     * Gets the list of developers of the application.
     * @return The list of developers
    */
    public ch.bailu.gtk.type.Strs getDevelopers()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_developers(asCPointer())));
    }

    /**
     * Gets the list of documenters of the application.
     * @return The list of documenters
    */
    public ch.bailu.gtk.type.Strs getDocumenters()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_documenters(asCPointer())));
    }

    /**
     * Gets the issue tracker URL for &#64;self.
     * @return the issue tracker URL
    */
    public ch.bailu.gtk.type.Str getIssueUrl()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_issue_url(asCPointer())));
    }

    /**
     * Gets the license for &#64;self.
     * @return the license
    */
    public ch.bailu.gtk.type.Str getLicense()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_license(asCPointer())));
    }

    /**
     * Gets the license type for &#64;self.
     * @return the license type
    */
    public int getLicenseType()  {
        return JnaAboutWindow.INST().adw_about_window_get_license_type(asCPointer());
    }

    /**
     * Gets the release notes for &#64;self.
     * @return the release notes
    */
    public ch.bailu.gtk.type.Str getReleaseNotes()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_release_notes(asCPointer())));
    }

    /**
     * Gets the version described by the application's release notes.
     * @return the release notes version
    */
    public ch.bailu.gtk.type.Str getReleaseNotesVersion()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_release_notes_version(asCPointer())));
    }

    /**
     * Gets the URL of the support page for &#64;self.
     * @return the support page URL
    */
    public ch.bailu.gtk.type.Str getSupportUrl()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_support_url(asCPointer())));
    }

    /**
     * Gets the translator credits string.
     * @return The translator credits string
    */
    public ch.bailu.gtk.type.Str getTranslatorCredits()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_translator_credits(asCPointer())));
    }

    /**
     * Gets the version for &#64;self.
     * @return the version
    */
    public ch.bailu.gtk.type.Str getVersion()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_version(asCPointer())));
    }

    /**
     * Gets the application website URL for &#64;self.
     * @return the website URL
    */
    public ch.bailu.gtk.type.Str getWebsite()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAboutWindow.INST().adw_about_window_get_website(asCPointer())));
    }

    /**
     * Sets the name of the application icon for &#64;self.
     * <br>
     * <br>The icon is displayed at the top of the main page.
     * @param application_icon the application icon name
    */
    public void setApplicationIcon(@Nonnull ch.bailu.gtk.type.Str application_icon)  {
        JnaAboutWindow.INST().adw_about_window_set_application_icon(asCPointer(), asCPointerNotNull(application_icon));
    }

    /**
     * Sets the name of the application icon for &#64;self.
     * <br>
     * <br>The icon is displayed at the top of the main page.
     * @param application_icon the application icon name
    */
    public void setApplicationIcon(String application_icon)  {
        JnaAboutWindow.INST().adw_about_window_set_application_icon(asCPointer(), application_icon);
    }

    /**
     * Sets the application name for &#64;self.
     * <br>
     * <br>The name is displayed at the top of the main page.
     * @param application_name the application name
    */
    public void setApplicationName(@Nonnull ch.bailu.gtk.type.Str application_name)  {
        JnaAboutWindow.INST().adw_about_window_set_application_name(asCPointer(), asCPointerNotNull(application_name));
    }

    /**
     * Sets the application name for &#64;self.
     * <br>
     * <br>The name is displayed at the top of the main page.
     * @param application_name the application name
    */
    public void setApplicationName(String application_name)  {
        JnaAboutWindow.INST().adw_about_window_set_application_name(asCPointer(), application_name);
    }

    /**
     * Sets the list of artists of the application.
     * <br>
     * <br>It will be displayed on the Credits page.
     * <br>
     * <br>Each name may contain email addresses and URLs, see the introduction for more
     * <br>details.
     * <br>
     * <br>See also:
     * <br>
     * <br>* [property&#64;AboutWindow:developers]
     * <br>* [property&#64;AboutWindow:designers]
     * <br>* [property&#64;AboutWindow:documenters]
     * <br>* [property&#64;AboutWindow:translator-credits]
     * <br>* [method&#64;AboutWindow.add_credit_section]
     * <br>* [method&#64;AboutWindow.add_acknowledgement_section]
     * @param artists the list of artists
    */
    public void setArtists(@Nullable ch.bailu.gtk.type.Strs artists)  {
        JnaAboutWindow.INST().adw_about_window_set_artists(asCPointer(), asCPointer(artists));
    }

    /**
     * Sets the comments about the application.
     * <br>
     * <br>Comments will be shown on the Details page, above links.
     * <br>
     * <br>Unlike [property&#64;Gtk.AboutDialog:comments], this string can be long and
     * <br>detailed. It can also contain links and Pango markup.
     * @param comments the comments
    */
    public void setComments(@Nonnull ch.bailu.gtk.type.Str comments)  {
        JnaAboutWindow.INST().adw_about_window_set_comments(asCPointer(), asCPointerNotNull(comments));
    }

    /**
     * Sets the comments about the application.
     * <br>
     * <br>Comments will be shown on the Details page, above links.
     * <br>
     * <br>Unlike [property&#64;Gtk.AboutDialog:comments], this string can be long and
     * <br>detailed. It can also contain links and Pango markup.
     * @param comments the comments
    */
    public void setComments(String comments)  {
        JnaAboutWindow.INST().adw_about_window_set_comments(asCPointer(), comments);
    }

    /**
     * Sets the copyright information for &#64;self.
     * <br>
     * <br>This should be a short string of one or two lines, for example:
     * <br>`© 2022 Example`.
     * <br>
     * <br>The copyright information will be displayed on the Legal page, before the
     * <br>application license.
     * <br>
     * <br>[method&#64;AboutWindow.add_legal_section] can be used to add copyright
     * <br>information for the application dependencies or other components.
     * @param copyright the copyright information
    */
    public void setCopyright(@Nonnull ch.bailu.gtk.type.Str copyright)  {
        JnaAboutWindow.INST().adw_about_window_set_copyright(asCPointer(), asCPointerNotNull(copyright));
    }

    /**
     * Sets the copyright information for &#64;self.
     * <br>
     * <br>This should be a short string of one or two lines, for example:
     * <br>`© 2022 Example`.
     * <br>
     * <br>The copyright information will be displayed on the Legal page, before the
     * <br>application license.
     * <br>
     * <br>[method&#64;AboutWindow.add_legal_section] can be used to add copyright
     * <br>information for the application dependencies or other components.
     * @param copyright the copyright information
    */
    public void setCopyright(String copyright)  {
        JnaAboutWindow.INST().adw_about_window_set_copyright(asCPointer(), copyright);
    }

    /**
     * Sets the debug information for &#64;self.
     * <br>
     * <br>Debug information will be shown on the Troubleshooting page. It's intended
     * <br>to be attached to issue reports when reporting issues against the
     * <br>application.
     * <br>
     * <br>`AdwAboutWindow` provides a quick way to save debug information to a file.
     * <br>When saving, [property&#64;AboutWindow:debug-info-filename] would be used as
     * <br>the suggested filename.
     * <br>
     * <br>Debug information cannot contain markup or links.
     * @param debug_info the debug information
    */
    public void setDebugInfo(@Nonnull ch.bailu.gtk.type.Str debug_info)  {
        JnaAboutWindow.INST().adw_about_window_set_debug_info(asCPointer(), asCPointerNotNull(debug_info));
    }

    /**
     * Sets the debug information for &#64;self.
     * <br>
     * <br>Debug information will be shown on the Troubleshooting page. It's intended
     * <br>to be attached to issue reports when reporting issues against the
     * <br>application.
     * <br>
     * <br>`AdwAboutWindow` provides a quick way to save debug information to a file.
     * <br>When saving, [property&#64;AboutWindow:debug-info-filename] would be used as
     * <br>the suggested filename.
     * <br>
     * <br>Debug information cannot contain markup or links.
     * @param debug_info the debug information
    */
    public void setDebugInfo(String debug_info)  {
        JnaAboutWindow.INST().adw_about_window_set_debug_info(asCPointer(), debug_info);
    }

    /**
     * Sets the debug information filename for &#64;self.
     * <br>
     * <br>It will be used as the suggested filename when saving debug information to a
     * <br>file.
     * <br>
     * <br>See [property&#64;AboutWindow:debug-info].
     * @param filename the debug info filename
    */
    public void setDebugInfoFilename(@Nonnull ch.bailu.gtk.type.Str filename)  {
        JnaAboutWindow.INST().adw_about_window_set_debug_info_filename(asCPointer(), asCPointerNotNull(filename));
    }

    /**
     * Sets the debug information filename for &#64;self.
     * <br>
     * <br>It will be used as the suggested filename when saving debug information to a
     * <br>file.
     * <br>
     * <br>See [property&#64;AboutWindow:debug-info].
     * @param filename the debug info filename
    */
    public void setDebugInfoFilename(String filename)  {
        JnaAboutWindow.INST().adw_about_window_set_debug_info_filename(asCPointer(), filename);
    }

    /**
     * Sets the list of designers of the application.
     * <br>
     * <br>It will be displayed on the Credits page.
     * <br>
     * <br>Each name may contain email addresses and URLs, see the introduction for more
     * <br>details.
     * <br>
     * <br>See also:
     * <br>
     * <br>* [property&#64;AboutWindow:developers]
     * <br>* [property&#64;AboutWindow:artists]
     * <br>* [property&#64;AboutWindow:documenters]
     * <br>* [property&#64;AboutWindow:translator-credits]
     * <br>* [method&#64;AboutWindow.add_credit_section]
     * <br>* [method&#64;AboutWindow.add_acknowledgement_section]
     * @param designers the list of designers
    */
    public void setDesigners(@Nullable ch.bailu.gtk.type.Strs designers)  {
        JnaAboutWindow.INST().adw_about_window_set_designers(asCPointer(), asCPointer(designers));
    }

    /**
     * Sets the developer name for &#64;self.
     * <br>
     * <br>The developer name is displayed on the main page, under the application name.
     * <br>
     * <br>If the application is developed by multiple people, the developer name can be
     * <br>set to values like &quot;AppName team&quot;, &quot;AppName developers&quot; or
     * <br>&quot;The AppName project&quot;, and the individual contributors can be listed on the
     * <br>Credits page, with [property&#64;AboutWindow:developers] and related properties.
     * @param developer_name the developer name
    */
    public void setDeveloperName(@Nonnull ch.bailu.gtk.type.Str developer_name)  {
        JnaAboutWindow.INST().adw_about_window_set_developer_name(asCPointer(), asCPointerNotNull(developer_name));
    }

    /**
     * Sets the developer name for &#64;self.
     * <br>
     * <br>The developer name is displayed on the main page, under the application name.
     * <br>
     * <br>If the application is developed by multiple people, the developer name can be
     * <br>set to values like &quot;AppName team&quot;, &quot;AppName developers&quot; or
     * <br>&quot;The AppName project&quot;, and the individual contributors can be listed on the
     * <br>Credits page, with [property&#64;AboutWindow:developers] and related properties.
     * @param developer_name the developer name
    */
    public void setDeveloperName(String developer_name)  {
        JnaAboutWindow.INST().adw_about_window_set_developer_name(asCPointer(), developer_name);
    }

    /**
     * Sets the list of developers of the application.
     * <br>
     * <br>It will be displayed on the Credits page.
     * <br>
     * <br>Each name may contain email addresses and URLs, see the introduction for more
     * <br>details.
     * <br>
     * <br>See also:
     * <br>
     * <br>* [property&#64;AboutWindow:designers]
     * <br>* [property&#64;AboutWindow:artists]
     * <br>* [property&#64;AboutWindow:documenters]
     * <br>* [property&#64;AboutWindow:translator-credits]
     * <br>* [method&#64;AboutWindow.add_credit_section]
     * <br>* [method&#64;AboutWindow.add_acknowledgement_section]
     * @param developers the list of developers
    */
    public void setDevelopers(@Nullable ch.bailu.gtk.type.Strs developers)  {
        JnaAboutWindow.INST().adw_about_window_set_developers(asCPointer(), asCPointer(developers));
    }

    /**
     * Sets the list of documenters of the application.
     * <br>
     * <br>It will be displayed on the Credits page.
     * <br>
     * <br>Each name may contain email addresses and URLs, see the introduction for more
     * <br>details.
     * <br>
     * <br>See also:
     * <br>
     * <br>* [property&#64;AboutWindow:developers]
     * <br>* [property&#64;AboutWindow:designers]
     * <br>* [property&#64;AboutWindow:artists]
     * <br>* [property&#64;AboutWindow:translator-credits]
     * <br>* [method&#64;AboutWindow.add_credit_section]
     * <br>* [method&#64;AboutWindow.add_acknowledgement_section]
     * @param documenters the list of documenters
    */
    public void setDocumenters(@Nullable ch.bailu.gtk.type.Strs documenters)  {
        JnaAboutWindow.INST().adw_about_window_set_documenters(asCPointer(), asCPointer(documenters));
    }

    /**
     * Sets the issue tracker URL for &#64;self.
     * <br>
     * <br>The issue tracker link is displayed on the main page.
     * @param issue_url the issue tracker URL
    */
    public void setIssueUrl(@Nonnull ch.bailu.gtk.type.Str issue_url)  {
        JnaAboutWindow.INST().adw_about_window_set_issue_url(asCPointer(), asCPointerNotNull(issue_url));
    }

    /**
     * Sets the issue tracker URL for &#64;self.
     * <br>
     * <br>The issue tracker link is displayed on the main page.
     * @param issue_url the issue tracker URL
    */
    public void setIssueUrl(String issue_url)  {
        JnaAboutWindow.INST().adw_about_window_set_issue_url(asCPointer(), issue_url);
    }

    /**
     * Sets the license for &#64;self.
     * <br>
     * <br>This can be used to set a custom text for the license if it can't be set via
     * <br>[property&#64;AboutWindow:license-type].
     * <br>
     * <br>When set, [property&#64;AboutWindow:license-type] will be set to
     * <br>`GTK_LICENSE_CUSTOM`.
     * <br>
     * <br>The license text will be displayed on the Legal page, below the copyright
     * <br>information.
     * <br>
     * <br>License text can contain Pango markup and links.
     * <br>
     * <br>[method&#64;AboutWindow.add_legal_section] can be used to add license information
     * <br>for the application dependencies or other components.
     * @param license the license
    */
    public void setLicense(@Nonnull ch.bailu.gtk.type.Str license)  {
        JnaAboutWindow.INST().adw_about_window_set_license(asCPointer(), asCPointerNotNull(license));
    }

    /**
     * Sets the license for &#64;self.
     * <br>
     * <br>This can be used to set a custom text for the license if it can't be set via
     * <br>[property&#64;AboutWindow:license-type].
     * <br>
     * <br>When set, [property&#64;AboutWindow:license-type] will be set to
     * <br>`GTK_LICENSE_CUSTOM`.
     * <br>
     * <br>The license text will be displayed on the Legal page, below the copyright
     * <br>information.
     * <br>
     * <br>License text can contain Pango markup and links.
     * <br>
     * <br>[method&#64;AboutWindow.add_legal_section] can be used to add license information
     * <br>for the application dependencies or other components.
     * @param license the license
    */
    public void setLicense(String license)  {
        JnaAboutWindow.INST().adw_about_window_set_license(asCPointer(), license);
    }

    /**
     * Sets the license for &#64;self from a list of known licenses.
     * <br>
     * <br>If the application's license is not in the list,
     * <br>[property&#64;AboutWindow:license] can be used instead. The license type will be
     * <br>automatically set to `GTK_LICENSE_CUSTOM` in that case.
     * <br>
     * <br>If &#64;license_type is `GTK_LICENSE_UNKNOWN`, no information will be displayed.
     * <br>
     * <br>If &#64;license_type is different from `GTK_LICENSE_CUSTOM`.
     * <br>[property&#64;AboutWindow:license] will be cleared out.
     * <br>
     * <br>The license description will be displayed on the Legal page, below the
     * <br>copyright information.
     * <br>
     * <br>[method&#64;AboutWindow.add_legal_section] can be used to add license information
     * <br>for the application dependencies or other components.
     * @param license_type the license type
    */
    public void setLicenseType(int license_type)  {
        JnaAboutWindow.INST().adw_about_window_set_license_type(asCPointer(), license_type);
    }

    /**
     * Sets the release notes for &#64;self.
     * <br>
     * <br>Release notes are displayed on the the What's New page.
     * <br>
     * <br>Release notes are formatted the same way as
     * <br>[AppStream descriptions](https://freedesktop.org/software/appstream/docs/chap-Metadata.html&#35;tag-description).
     * <br>
     * <br>The supported formatting options are:
     * <br>
     * <br>* Paragraph (`&lt;p&gt;`)
     * <br>* Ordered list (`&lt;ol&gt;`), with list items (`&lt;li&gt;`)
     * <br>* Unordered list (`&lt;ul&gt;`), with list items (`&lt;li&gt;`)
     * <br>
     * <br>Within paragraphs and list items, emphasis (`&lt;em&gt;`) and inline code
     * <br>(`&lt;code&gt;`) text styles are supported. The emphasis is rendered in italic,
     * <br>while inline code is shown in a monospaced font.
     * <br>
     * <br>Any text outside paragraphs or list items is ignored.
     * <br>
     * <br>Nested lists are not supported.
     * <br>
     * <br>`AdwAboutWindow` displays the version above the release notes. If set, the
     * <br>[property&#64;AboutWindow:release-notes-version] of the property will be used
     * <br>as the version; otherwise, [property&#64;AboutWindow:version] is used.
     * @param release_notes the release notes
    */
    public void setReleaseNotes(@Nonnull ch.bailu.gtk.type.Str release_notes)  {
        JnaAboutWindow.INST().adw_about_window_set_release_notes(asCPointer(), asCPointerNotNull(release_notes));
    }

    /**
     * Sets the release notes for &#64;self.
     * <br>
     * <br>Release notes are displayed on the the What's New page.
     * <br>
     * <br>Release notes are formatted the same way as
     * <br>[AppStream descriptions](https://freedesktop.org/software/appstream/docs/chap-Metadata.html&#35;tag-description).
     * <br>
     * <br>The supported formatting options are:
     * <br>
     * <br>* Paragraph (`&lt;p&gt;`)
     * <br>* Ordered list (`&lt;ol&gt;`), with list items (`&lt;li&gt;`)
     * <br>* Unordered list (`&lt;ul&gt;`), with list items (`&lt;li&gt;`)
     * <br>
     * <br>Within paragraphs and list items, emphasis (`&lt;em&gt;`) and inline code
     * <br>(`&lt;code&gt;`) text styles are supported. The emphasis is rendered in italic,
     * <br>while inline code is shown in a monospaced font.
     * <br>
     * <br>Any text outside paragraphs or list items is ignored.
     * <br>
     * <br>Nested lists are not supported.
     * <br>
     * <br>`AdwAboutWindow` displays the version above the release notes. If set, the
     * <br>[property&#64;AboutWindow:release-notes-version] of the property will be used
     * <br>as the version; otherwise, [property&#64;AboutWindow:version] is used.
     * @param release_notes the release notes
    */
    public void setReleaseNotes(String release_notes)  {
        JnaAboutWindow.INST().adw_about_window_set_release_notes(asCPointer(), release_notes);
    }

    /**
     * Sets the version described by the application's release notes.
     * <br>
     * <br>The release notes version is displayed on the What's New page, above the
     * <br>release notes.
     * <br>
     * <br>If not set, [property&#64;AboutWindow:version] will be used instead.
     * <br>
     * <br>For example, an application with the current version 2.0.2 might want to
     * <br>keep the release notes from 2.0.0, and set the release notes version
     * <br>accordingly.
     * <br>
     * <br>See [property&#64;AboutWindow:release-notes].
     * @param version the release notes version
    */
    public void setReleaseNotesVersion(@Nonnull ch.bailu.gtk.type.Str version)  {
        JnaAboutWindow.INST().adw_about_window_set_release_notes_version(asCPointer(), asCPointerNotNull(version));
    }

    /**
     * Sets the version described by the application's release notes.
     * <br>
     * <br>The release notes version is displayed on the What's New page, above the
     * <br>release notes.
     * <br>
     * <br>If not set, [property&#64;AboutWindow:version] will be used instead.
     * <br>
     * <br>For example, an application with the current version 2.0.2 might want to
     * <br>keep the release notes from 2.0.0, and set the release notes version
     * <br>accordingly.
     * <br>
     * <br>See [property&#64;AboutWindow:release-notes].
     * @param version the release notes version
    */
    public void setReleaseNotesVersion(String version)  {
        JnaAboutWindow.INST().adw_about_window_set_release_notes_version(asCPointer(), version);
    }

    /**
     * Sets the URL of the support page for &#64;self.
     * <br>
     * <br>The support page link is displayed on the main page.
     * @param support_url the support page URL
    */
    public void setSupportUrl(@Nonnull ch.bailu.gtk.type.Str support_url)  {
        JnaAboutWindow.INST().adw_about_window_set_support_url(asCPointer(), asCPointerNotNull(support_url));
    }

    /**
     * Sets the URL of the support page for &#64;self.
     * <br>
     * <br>The support page link is displayed on the main page.
     * @param support_url the support page URL
    */
    public void setSupportUrl(String support_url)  {
        JnaAboutWindow.INST().adw_about_window_set_support_url(asCPointer(), support_url);
    }

    /**
     * Sets the translator credits string.
     * <br>
     * <br>It will be displayed on the Credits page.
     * <br>
     * <br>This string should be `&quot;translator-credits&quot;` or `&quot;translator_credits&quot;` and
     * <br>should be marked as translatable.
     * <br>
     * <br>The string may contain email addresses and URLs, see the introduction for
     * <br>more details.
     * <br>
     * <br>See also:
     * <br>
     * <br>* [property&#64;AboutWindow:developers]
     * <br>* [property&#64;AboutWindow:designers]
     * <br>* [property&#64;AboutWindow:artists]
     * <br>* [property&#64;AboutWindow:documenters]
     * <br>* [method&#64;AboutWindow.add_credit_section]
     * <br>* [method&#64;AboutWindow.add_acknowledgement_section]
     * @param translator_credits the translator credits
    */
    public void setTranslatorCredits(@Nonnull ch.bailu.gtk.type.Str translator_credits)  {
        JnaAboutWindow.INST().adw_about_window_set_translator_credits(asCPointer(), asCPointerNotNull(translator_credits));
    }

    /**
     * Sets the translator credits string.
     * <br>
     * <br>It will be displayed on the Credits page.
     * <br>
     * <br>This string should be `&quot;translator-credits&quot;` or `&quot;translator_credits&quot;` and
     * <br>should be marked as translatable.
     * <br>
     * <br>The string may contain email addresses and URLs, see the introduction for
     * <br>more details.
     * <br>
     * <br>See also:
     * <br>
     * <br>* [property&#64;AboutWindow:developers]
     * <br>* [property&#64;AboutWindow:designers]
     * <br>* [property&#64;AboutWindow:artists]
     * <br>* [property&#64;AboutWindow:documenters]
     * <br>* [method&#64;AboutWindow.add_credit_section]
     * <br>* [method&#64;AboutWindow.add_acknowledgement_section]
     * @param translator_credits the translator credits
    */
    public void setTranslatorCredits(String translator_credits)  {
        JnaAboutWindow.INST().adw_about_window_set_translator_credits(asCPointer(), translator_credits);
    }

    /**
     * Sets the version for &#64;self.
     * <br>
     * <br>The version is displayed on the main page.
     * <br>
     * <br>If [property&#64;AboutWindow:release-notes-version] is not set, the version will
     * <br>also be displayed above the release notes on the What's New page.
     * @param version the version
    */
    public void setVersion(@Nonnull ch.bailu.gtk.type.Str version)  {
        JnaAboutWindow.INST().adw_about_window_set_version(asCPointer(), asCPointerNotNull(version));
    }

    /**
     * Sets the version for &#64;self.
     * <br>
     * <br>The version is displayed on the main page.
     * <br>
     * <br>If [property&#64;AboutWindow:release-notes-version] is not set, the version will
     * <br>also be displayed above the release notes on the What's New page.
     * @param version the version
    */
    public void setVersion(String version)  {
        JnaAboutWindow.INST().adw_about_window_set_version(asCPointer(), version);
    }

    /**
     * Sets the application website URL for &#64;self.
     * <br>
     * <br>Website is displayed on the Details page, below comments, or on the main page
     * <br>if the Details page doesn't have any other content.
     * <br>
     * <br>Applications can add other links below, see [method&#64;AboutWindow.add_link].
     * @param website the website URL
    */
    public void setWebsite(@Nonnull ch.bailu.gtk.type.Str website)  {
        JnaAboutWindow.INST().adw_about_window_set_website(asCPointer(), asCPointerNotNull(website));
    }

    /**
     * Sets the application website URL for &#64;self.
     * <br>
     * <br>Website is displayed on the Details page, below comments, or on the main page
     * <br>if the Details page doesn't have any other content.
     * <br>
     * <br>Applications can add other links below, see [method&#64;AboutWindow.add_link].
     * @param website the website URL
    */
    public void setWebsite(String website)  {
        JnaAboutWindow.INST().adw_about_window_set_website(asCPointer(), website);
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
     * Implements interface {@link ch.bailu.gtk.gtk.Accessible}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Accessible}
    */
    public ch.bailu.gtk.gtk.Accessible asAccessible() {
        return new ch.bailu.gtk.gtk.Accessible(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Buildable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Buildable}
    */
    public ch.bailu.gtk.gtk.Buildable asBuildable() {
        return new ch.bailu.gtk.gtk.Buildable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ConstraintTarget}
    */
    public ch.bailu.gtk.gtk.ConstraintTarget asConstraintTarget() {
        return new ch.bailu.gtk.gtk.ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Native}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Native}
    */
    public ch.bailu.gtk.gtk.Native asNative() {
        return new ch.bailu.gtk.gtk.Native(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Root}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Root}
    */
    public ch.bailu.gtk.gtk.Root asRoot() {
        return new ch.bailu.gtk.gtk.Root(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ShortcutManager}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ShortcutManager}
    */
    public ch.bailu.gtk.gtk.ShortcutManager asShortcutManager() {
        return new ch.bailu.gtk.gtk.ShortcutManager(cast());
    }

    public static long getTypeID() { 
        return JnaAboutWindow.INST().adw_about_window_get_type(); 
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
