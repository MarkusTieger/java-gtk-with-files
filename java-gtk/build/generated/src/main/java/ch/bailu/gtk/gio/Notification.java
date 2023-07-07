/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GNotification is a mechanism for creating a notification to be shown
 * <br>to the user -- typically as a pop-up notification presented by the
 * <br>desktop environment shell.
 * <br>
 * <br>The key difference between &#35;GNotification and other similar APIs is
 * <br>that, if supported by the desktop environment, notifications sent
 * <br>with &#35;GNotification will persist after the application has exited,
 * <br>and even across system reboots.
 * <br>
 * <br>Since the user may click on a notification while the application is
 * <br>not running, applications using &#35;GNotification should be able to be
 * <br>started as a D-Bus service, using &#35;GApplication.
 * <br>
 * <br>In order for &#35;GNotification to work, the application must have installed
 * <br>a `.desktop` file. For example:
 * <pre>
 *  [Desktop Entry]
 *   Name=Test Application
 *   Comment=Description of what Test Application does
 *   Exec=gnome-test-application
 *   Icon=org.gnome.TestApplication
 *   Terminal=false
 *   Type=Application
 *   Categories=GNOME;GTK;TestApplication Category;
 *   StartupNotify=true
 *   DBusActivatable=true
 *   X-GNOME-UsesNotifications=true
 * </pre>
 * <br>
 * <br>The `X-GNOME-UsesNotifications` key indicates to GNOME Control Center
 * <br>that this application uses notifications, so it can be listed in the
 * <br>Control Center’s ‘Notifications’ panel.
 * <br>
 * <br>The `.desktop` file must be named as `org.gnome.TestApplication.desktop`,
 * <br>where `org.gnome.TestApplication` is the ID passed to g_application_new().
 * <br>
 * <br>User interaction with a notification (either the default action, or
 * <br>buttons) must be associated with actions on the application (ie:
 * <br>&quot;app.&quot; actions).  It is not possible to route user interaction
 * <br>through the notification itself, because the object will not exist if
 * <br>the application is autostarted as a result of a notification being
 * <br>clicked.
 * <br>
 * <br>A notification can be sent with g_application_send_notification().
 * <p><a href="https://docs.gtk.org/gio/class.Notification.html">https://docs.gtk.org/gio/class.Notification.html</a></p>
*/
public class Notification extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Notification.class.getCanonicalName());
    }

    public Notification(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GNotification with &#64;title as its title.
     * <br>
     * <br>After populating &#64;notification with more details, it can be sent to
     * <br>the desktop shell with g_application_send_notification(). Changing
     * <br>any properties after this call will not have any effect until
     * <br>resending &#64;notification.
     * @param title the title of the notification
    */
    public Notification(@Nonnull ch.bailu.gtk.type.Str title) {
        super(cast(JnaNotification.INST().g_notification_new(asCPointerNotNull(title))));
    }

    /**
     * Creates a new &#35;GNotification with &#64;title as its title.
     * <br>
     * <br>After populating &#64;notification with more details, it can be sent to
     * <br>the desktop shell with g_application_send_notification(). Changing
     * <br>any properties after this call will not have any effect until
     * <br>resending &#64;notification.
     * @param title the title of the notification
    */
    public Notification(String title) {
        super(cast(JnaNotification.INST().g_notification_new(title)));
    }

    /**
     * Adds a button to &#64;notification that activates the action in
     * <br>&#64;detailed_action when clicked. That action must be an
     * <br>application-wide action (starting with &quot;app.&quot;). If &#64;detailed_action
     * <br>contains a target, the action will be activated with that target as
     * <br>its parameter.
     * <br>
     * <br>See g_action_parse_detailed_name() for a description of the format
     * <br>for &#64;detailed_action.
     * @param label label of the button
     * @param detailed_action a detailed action name
    */
    public void addButton(@Nonnull ch.bailu.gtk.type.Str label, @Nonnull ch.bailu.gtk.type.Str detailed_action)  {
        JnaNotification.INST().g_notification_add_button(asCPointer(), asCPointerNotNull(label), asCPointerNotNull(detailed_action));
    }

    /**
     * Adds a button to &#64;notification that activates the action in
     * <br>&#64;detailed_action when clicked. That action must be an
     * <br>application-wide action (starting with &quot;app.&quot;). If &#64;detailed_action
     * <br>contains a target, the action will be activated with that target as
     * <br>its parameter.
     * <br>
     * <br>See g_action_parse_detailed_name() for a description of the format
     * <br>for &#64;detailed_action.
     * @param label label of the button
     * @param detailed_action a detailed action name
    */
    public void addButton(String label, String detailed_action)  {
        JnaNotification.INST().g_notification_add_button(asCPointer(), label, detailed_action);
    }

    /**
     * Adds a button to &#64;notification that activates &#64;action when clicked.
     * <br>&#64;action must be an application-wide action (it must start with &quot;app.&quot;).
     * <br>
     * <br>If &#64;target_format is given, it is used to collect remaining
     * <br>positional parameters into a &#35;GVariant instance, similar to
     * <br>g_variant_new(). &#64;action will be activated with that &#35;GVariant as its
     * <br>parameter.
     * @param label label of the button
     * @param action an action name
     * @param target_format a &#35;GVariant format string, or %NULL
     * @param _elipse positional parameters, as determined by &#64;target_format
    */
    public void addButtonWithTarget(@Nonnull ch.bailu.gtk.type.Str label, @Nonnull ch.bailu.gtk.type.Str action, @Nullable ch.bailu.gtk.type.Str target_format, java.lang.Object... _elipse)  {
        JnaNotification.INST().g_notification_add_button_with_target(asCPointer(), asCPointerNotNull(label), asCPointerNotNull(action), asCPointer(target_format), _elipse);
    }

    /**
     * Adds a button to &#64;notification that activates &#64;action when clicked.
     * <br>&#64;action must be an application-wide action (it must start with &quot;app.&quot;).
     * <br>
     * <br>If &#64;target_format is given, it is used to collect remaining
     * <br>positional parameters into a &#35;GVariant instance, similar to
     * <br>g_variant_new(). &#64;action will be activated with that &#35;GVariant as its
     * <br>parameter.
     * @param label label of the button
     * @param action an action name
     * @param target_format a &#35;GVariant format string, or %NULL
     * @param _elipse positional parameters, as determined by &#64;target_format
    */
    public void addButtonWithTarget(String label, String action, String target_format, java.lang.Object... _elipse)  {
        JnaNotification.INST().g_notification_add_button_with_target(asCPointer(), label, action, target_format, _elipse);
    }

    /**
     * Adds a button to &#64;notification that activates &#64;action when clicked.
     * <br>&#64;action must be an application-wide action (it must start with &quot;app.&quot;).
     * <br>
     * <br>If &#64;target is non-%NULL, &#64;action will be activated with &#64;target as
     * <br>its parameter.
     * @param label label of the button
     * @param action an action name
     * @param target a &#35;GVariant to use as &#64;action's parameter, or %NULL
    */
    public void addButtonWithTargetValue(@Nonnull ch.bailu.gtk.type.Str label, @Nonnull ch.bailu.gtk.type.Str action, @Nullable ch.bailu.gtk.glib.Variant target)  {
        JnaNotification.INST().g_notification_add_button_with_target_value(asCPointer(), asCPointerNotNull(label), asCPointerNotNull(action), asCPointer(target));
    }

    /**
     * Adds a button to &#64;notification that activates &#64;action when clicked.
     * <br>&#64;action must be an application-wide action (it must start with &quot;app.&quot;).
     * <br>
     * <br>If &#64;target is non-%NULL, &#64;action will be activated with &#64;target as
     * <br>its parameter.
     * @param label label of the button
     * @param action an action name
     * @param target a &#35;GVariant to use as &#64;action's parameter, or %NULL
    */
    public void addButtonWithTargetValue(String label, String action, @Nullable ch.bailu.gtk.glib.Variant target)  {
        JnaNotification.INST().g_notification_add_button_with_target_value(asCPointer(), label, action, asCPointer(target));
    }

    /**
     * Sets the body of &#64;notification to &#64;body.
     * @param body the new body for &#64;notification, or %NULL
    */
    public void setBody(@Nullable ch.bailu.gtk.type.Str body)  {
        JnaNotification.INST().g_notification_set_body(asCPointer(), asCPointer(body));
    }

    /**
     * Sets the body of &#64;notification to &#64;body.
     * @param body the new body for &#64;notification, or %NULL
    */
    public void setBody(String body)  {
        JnaNotification.INST().g_notification_set_body(asCPointer(), body);
    }

    /**
     * Sets the type of &#64;notification to &#64;category. Categories have a main
     * <br>type like `email`, `im` or `device` and can have a detail separated
     * <br>by a `.`, e.g. `im.received` or `email.arrived`. Setting the category
     * <br>helps the notification server to select proper feedback to the user.
     * <br>
     * <br>Standard categories are [listed in the specification](https://specifications.freedesktop.org/notification-spec/latest/ar01s06.html).
     * @param category the category for &#64;notification, or %NULL for no category
    */
    public void setCategory(@Nullable ch.bailu.gtk.type.Str category)  {
        JnaNotification.INST().g_notification_set_category(asCPointer(), asCPointer(category));
    }

    /**
     * Sets the type of &#64;notification to &#64;category. Categories have a main
     * <br>type like `email`, `im` or `device` and can have a detail separated
     * <br>by a `.`, e.g. `im.received` or `email.arrived`. Setting the category
     * <br>helps the notification server to select proper feedback to the user.
     * <br>
     * <br>Standard categories are [listed in the specification](https://specifications.freedesktop.org/notification-spec/latest/ar01s06.html).
     * @param category the category for &#64;notification, or %NULL for no category
    */
    public void setCategory(String category)  {
        JnaNotification.INST().g_notification_set_category(asCPointer(), category);
    }

    /**
     * Sets the default action of &#64;notification to &#64;detailed_action. This
     * <br>action is activated when the notification is clicked on.
     * <br>
     * <br>The action in &#64;detailed_action must be an application-wide action (it
     * <br>must start with &quot;app.&quot;). If &#64;detailed_action contains a target, the
     * <br>given action will be activated with that target as its parameter.
     * <br>See g_action_parse_detailed_name() for a description of the format
     * <br>for &#64;detailed_action.
     * <br>
     * <br>When no default action is set, the application that the notification
     * <br>was sent on is activated.
     * @param detailed_action a detailed action name
    */
    public void setDefaultAction(@Nonnull ch.bailu.gtk.type.Str detailed_action)  {
        JnaNotification.INST().g_notification_set_default_action(asCPointer(), asCPointerNotNull(detailed_action));
    }

    /**
     * Sets the default action of &#64;notification to &#64;detailed_action. This
     * <br>action is activated when the notification is clicked on.
     * <br>
     * <br>The action in &#64;detailed_action must be an application-wide action (it
     * <br>must start with &quot;app.&quot;). If &#64;detailed_action contains a target, the
     * <br>given action will be activated with that target as its parameter.
     * <br>See g_action_parse_detailed_name() for a description of the format
     * <br>for &#64;detailed_action.
     * <br>
     * <br>When no default action is set, the application that the notification
     * <br>was sent on is activated.
     * @param detailed_action a detailed action name
    */
    public void setDefaultAction(String detailed_action)  {
        JnaNotification.INST().g_notification_set_default_action(asCPointer(), detailed_action);
    }

    /**
     * Sets the default action of &#64;notification to &#64;action. This action is
     * <br>activated when the notification is clicked on. It must be an
     * <br>application-wide action (it must start with &quot;app.&quot;).
     * <br>
     * <br>If &#64;target_format is given, it is used to collect remaining
     * <br>positional parameters into a &#35;GVariant instance, similar to
     * <br>g_variant_new(). &#64;action will be activated with that &#35;GVariant as its
     * <br>parameter.
     * <br>
     * <br>When no default action is set, the application that the notification
     * <br>was sent on is activated.
     * @param action an action name
     * @param target_format a &#35;GVariant format string, or %NULL
     * @param _elipse positional parameters, as determined by &#64;target_format
    */
    public void setDefaultActionAndTarget(@Nonnull ch.bailu.gtk.type.Str action, @Nullable ch.bailu.gtk.type.Str target_format, java.lang.Object... _elipse)  {
        JnaNotification.INST().g_notification_set_default_action_and_target(asCPointer(), asCPointerNotNull(action), asCPointer(target_format), _elipse);
    }

    /**
     * Sets the default action of &#64;notification to &#64;action. This action is
     * <br>activated when the notification is clicked on. It must be an
     * <br>application-wide action (it must start with &quot;app.&quot;).
     * <br>
     * <br>If &#64;target_format is given, it is used to collect remaining
     * <br>positional parameters into a &#35;GVariant instance, similar to
     * <br>g_variant_new(). &#64;action will be activated with that &#35;GVariant as its
     * <br>parameter.
     * <br>
     * <br>When no default action is set, the application that the notification
     * <br>was sent on is activated.
     * @param action an action name
     * @param target_format a &#35;GVariant format string, or %NULL
     * @param _elipse positional parameters, as determined by &#64;target_format
    */
    public void setDefaultActionAndTarget(String action, String target_format, java.lang.Object... _elipse)  {
        JnaNotification.INST().g_notification_set_default_action_and_target(asCPointer(), action, target_format, _elipse);
    }

    /**
     * Sets the default action of &#64;notification to &#64;action. This action is
     * <br>activated when the notification is clicked on. It must be an
     * <br>application-wide action (start with &quot;app.&quot;).
     * <br>
     * <br>If &#64;target is non-%NULL, &#64;action will be activated with &#64;target as
     * <br>its parameter.
     * <br>
     * <br>When no default action is set, the application that the notification
     * <br>was sent on is activated.
     * @param action an action name
     * @param target a &#35;GVariant to use as &#64;action's parameter, or %NULL
    */
    public void setDefaultActionAndTargetValue(@Nonnull ch.bailu.gtk.type.Str action, @Nullable ch.bailu.gtk.glib.Variant target)  {
        JnaNotification.INST().g_notification_set_default_action_and_target_value(asCPointer(), asCPointerNotNull(action), asCPointer(target));
    }

    /**
     * Sets the default action of &#64;notification to &#64;action. This action is
     * <br>activated when the notification is clicked on. It must be an
     * <br>application-wide action (start with &quot;app.&quot;).
     * <br>
     * <br>If &#64;target is non-%NULL, &#64;action will be activated with &#64;target as
     * <br>its parameter.
     * <br>
     * <br>When no default action is set, the application that the notification
     * <br>was sent on is activated.
     * @param action an action name
     * @param target a &#35;GVariant to use as &#64;action's parameter, or %NULL
    */
    public void setDefaultActionAndTargetValue(String action, @Nullable ch.bailu.gtk.glib.Variant target)  {
        JnaNotification.INST().g_notification_set_default_action_and_target_value(asCPointer(), action, asCPointer(target));
    }

    /**
     * Sets the icon of &#64;notification to &#64;icon.
     * @param icon the icon to be shown in &#64;notification, as a &#35;GIcon
    */
    public void setIcon(@Nonnull Icon icon)  {
        JnaNotification.INST().g_notification_set_icon(asCPointer(), asCPointerNotNull(icon));
    }

    /**
     * Sets the priority of &#64;notification to &#64;priority. See
     * <br>&#35;GNotificationPriority for possible values.
     * @param priority a &#35;GNotificationPriority
    */
    public void setPriority(int priority)  {
        JnaNotification.INST().g_notification_set_priority(asCPointer(), priority);
    }

    /**
     * Sets the title of &#64;notification to &#64;title.
     * @param title the new title for &#64;notification
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaNotification.INST().g_notification_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * Sets the title of &#64;notification to &#64;title.
     * @param title the new title for &#64;notification
    */
    public void setTitle(String title)  {
        JnaNotification.INST().g_notification_set_title(asCPointer(), title);
    }

    public static long getTypeID() { 
        return JnaNotification.INST().g_notification_get_type(); 
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

[MethodModel:cb-deprecated:setUrgent:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
*/
