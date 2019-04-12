// CHECKSTYLE:OFF

package hudson;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;
import org.kohsuke.accmod.Restricted;


/**
 * Generated localization support class.
 * 
 */
@SuppressWarnings({
    "",
    "PMD",
    "all"
})
@Restricted(org.kohsuke.accmod.restrictions.NoExternalUse.class)
public class Messages {

    /**
     * The resource bundle reference
     * 
     */
    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Key {@code PluginManager.PluginIsAlreadyInstalled.RestartRequired}:
     * {@code {0} plugin is already installed. Jenkins needs to be restarted
     * for the update to take effect.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} plugin is already installed. Jenkins needs to be restarted
     *     for the update to take effect.}
     */
    public static String PluginManager_PluginIsAlreadyInstalled_RestartRequired(Object arg0) {
        return holder.format("PluginManager.PluginIsAlreadyInstalled.RestartRequired", arg0);
    }

    /**
     * Key {@code PluginManager.PluginIsAlreadyInstalled.RestartRequired}:
     * {@code {0} plugin is already installed. Jenkins needs to be restarted
     * for the update to take effect.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} plugin is already installed. Jenkins needs to be restarted
     *     for the update to take effect.}
     */
    public static Localizable _PluginManager_PluginIsAlreadyInstalled_RestartRequired(Object arg0) {
        return new Localizable(holder, "PluginManager.PluginIsAlreadyInstalled.RestartRequired", arg0);
    }

    /**
     * Key {@code ProxyConfiguration.FailedToConnect}: {@code Failed to
     * connect to {0} (code {1}).}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to connect to {0} (code {1}).}
     */
    public static String ProxyConfiguration_FailedToConnect(Object arg0, Object arg1) {
        return holder.format("ProxyConfiguration.FailedToConnect", arg0, arg1);
    }

    /**
     * Key {@code ProxyConfiguration.FailedToConnect}: {@code Failed to
     * connect to {0} (code {1}).}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to connect to {0} (code {1}).}
     */
    public static Localizable _ProxyConfiguration_FailedToConnect(Object arg0, Object arg1) {
        return new Localizable(holder, "ProxyConfiguration.FailedToConnect", arg0, arg1);
    }

    /**
     * Key {@code FilePath.validateAntFileMask.portionMatchAndSuggest}:
     * {@code ‘{0}’ doesn’t match anything, although ‘{1}’ exists}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything, although ‘{1}’ exists}
     */
    public static String FilePath_validateAntFileMask_portionMatchAndSuggest(Object arg0, Object arg1) {
        return holder.format("FilePath.validateAntFileMask.portionMatchAndSuggest", arg0, arg1);
    }

    /**
     * Key {@code FilePath.validateAntFileMask.portionMatchAndSuggest}:
     * {@code ‘{0}’ doesn’t match anything, although ‘{1}’ exists}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything, although ‘{1}’ exists}
     */
    public static Localizable _FilePath_validateAntFileMask_portionMatchAndSuggest(Object arg0, Object arg1) {
        return new Localizable(holder, "FilePath.validateAntFileMask.portionMatchAndSuggest", arg0, arg1);
    }

    /**
     * Key {@code PluginWrapper.Plugin.Disabled}: {@code Plugin ''{0}''
     * disabled}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Plugin ''{0}'' disabled}
     */
    public static String PluginWrapper_Plugin_Disabled(Object arg0) {
        return holder.format("PluginWrapper.Plugin.Disabled", arg0);
    }

    /**
     * Key {@code PluginWrapper.Plugin.Disabled}: {@code Plugin ''{0}''
     * disabled}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Plugin ''{0}'' disabled}
     */
    public static Localizable _PluginWrapper_Plugin_Disabled(Object arg0) {
        return new Localizable(holder, "PluginWrapper.Plugin.Disabled", arg0);
    }

    /**
     * Key {@code PluginManager.PortNotInRange}: {@code Port doesn’t range
     * from {0} to {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Port doesn’t range from {0} to {1}}
     */
    public static String PluginManager_PortNotInRange(Object arg0, Object arg1) {
        return holder.format("PluginManager.PortNotInRange", arg0, arg1);
    }

    /**
     * Key {@code PluginManager.PortNotInRange}: {@code Port doesn’t range
     * from {0} to {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Port doesn’t range from {0} to {1}}
     */
    public static Localizable _PluginManager_PortNotInRange(Object arg0, Object arg1) {
        return new Localizable(holder, "PluginManager.PortNotInRange", arg0, arg1);
    }

    /**
     * Key {@code Util.second}: {@code {0} sec}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} sec}
     */
    public static String Util_second(Object arg0) {
        return holder.format("Util.second", arg0);
    }

    /**
     * Key {@code Util.second}: {@code {0} sec}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} sec}
     */
    public static Localizable _Util_second(Object arg0) {
        return new Localizable(holder, "Util.second", arg0);
    }

    /**
     * Key {@code
     * PluginWrapper.PluginWrapperAdministrativeMonitor.DisplayName}: {@code
     * Plugins Failed To Load}.
     * 
     * @return
     *     {@code Plugins Failed To Load}
     */
    public static String PluginWrapper_PluginWrapperAdministrativeMonitor_DisplayName() {
        return holder.format("PluginWrapper.PluginWrapperAdministrativeMonitor.DisplayName");
    }

    /**
     * Key {@code
     * PluginWrapper.PluginWrapperAdministrativeMonitor.DisplayName}: {@code
     * Plugins Failed To Load}.
     * 
     * @return
     *     {@code Plugins Failed To Load}
     */
    public static Localizable _PluginWrapper_PluginWrapperAdministrativeMonitor_DisplayName() {
        return new Localizable(holder, "PluginWrapper.PluginWrapperAdministrativeMonitor.DisplayName");
    }

    /**
     * Key {@code AboutJenkins.DisplayName}: {@code About Jenkins}.
     * 
     * @return
     *     {@code About Jenkins}
     */
    public static String AboutJenkins_DisplayName() {
        return holder.format("AboutJenkins.DisplayName");
    }

    /**
     * Key {@code AboutJenkins.DisplayName}: {@code About Jenkins}.
     * 
     * @return
     *     {@code About Jenkins}
     */
    public static Localizable _AboutJenkins_DisplayName() {
        return new Localizable(holder, "AboutJenkins.DisplayName");
    }

    /**
     * Key {@code PluginWrapper.Plugin.Has.Dependent}: {@code The plugin
     * ''{0}'' has, at least, one dependent plugin ({1}) and the disable
     * strategy is {2}, so it cannot be disabled}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The plugin ''{0}'' has, at least, one dependent plugin ({1})
     *     and the disable strategy is {2}, so it cannot be disabled}
     */
    public static String PluginWrapper_Plugin_Has_Dependent(Object arg0, Object arg1, Object arg2) {
        return holder.format("PluginWrapper.Plugin.Has.Dependent", arg0, arg1, arg2);
    }

    /**
     * Key {@code PluginWrapper.Plugin.Has.Dependent}: {@code The plugin
     * ''{0}'' has, at least, one dependent plugin ({1}) and the disable
     * strategy is {2}, so it cannot be disabled}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The plugin ''{0}'' has, at least, one dependent plugin ({1})
     *     and the disable strategy is {2}, so it cannot be disabled}
     */
    public static Localizable _PluginWrapper_Plugin_Has_Dependent(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "PluginWrapper.Plugin.Has.Dependent", arg0, arg1, arg2);
    }

    /**
     * Key {@code PluginManager.CheckUpdateServerError}: {@code There were
     * errors checking the update sites: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code There were errors checking the update sites: {0}}
     */
    public static String PluginManager_CheckUpdateServerError(Object arg0) {
        return holder.format("PluginManager.CheckUpdateServerError", arg0);
    }

    /**
     * Key {@code PluginManager.CheckUpdateServerError}: {@code There were
     * errors checking the update sites: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code There were errors checking the update sites: {0}}
     */
    public static Localizable _PluginManager_CheckUpdateServerError(Object arg0) {
        return new Localizable(holder, "PluginManager.CheckUpdateServerError", arg0);
    }

    /**
     * Key {@code Util.hour}: {@code {0} hr}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} hr}
     */
    public static String Util_hour(Object arg0) {
        return holder.format("Util.hour", arg0);
    }

    /**
     * Key {@code Util.hour}: {@code {0} hr}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} hr}
     */
    public static Localizable _Util_hour(Object arg0) {
        return new Localizable(holder, "Util.hour", arg0);
    }

    /**
     * Key {@code PluginManager.ConfigureUpdateCenterPermission.Description}:
     * {@code The "configure update center" permission allows a user to
     * configure update sites and proxy settings.}.
     * 
     * @return
     *     {@code The "configure update center" permission allows a user to
     *     configure update sites and proxy settings.}
     */
    public static String PluginManager_ConfigureUpdateCenterPermission_Description() {
        return holder.format("PluginManager.ConfigureUpdateCenterPermission.Description");
    }

    /**
     * Key {@code PluginManager.ConfigureUpdateCenterPermission.Description}:
     * {@code The "configure update center" permission allows a user to
     * configure update sites and proxy settings.}.
     * 
     * @return
     *     {@code The "configure update center" permission allows a user to
     *     configure update sites and proxy settings.}
     */
    public static Localizable _PluginManager_ConfigureUpdateCenterPermission_Description() {
        return new Localizable(holder, "PluginManager.ConfigureUpdateCenterPermission.Description");
    }

    /**
     * Key {@code Util.pastTime}: {@code {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0}}
     */
    public static String Util_pastTime(Object arg0) {
        return holder.format("Util.pastTime", arg0);
    }

    /**
     * Key {@code Util.pastTime}: {@code {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0}}
     */
    public static Localizable _Util_pastTime(Object arg0) {
        return new Localizable(holder, "Util.pastTime", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.wildcardNotAllowed}: {@code
     * Wildcard is not allowed here}.
     * 
     * @return
     *     {@code Wildcard is not allowed here}
     */
    public static String FilePath_validateRelativePath_wildcardNotAllowed() {
        return holder.format("FilePath.validateRelativePath.wildcardNotAllowed");
    }

    /**
     * Key {@code FilePath.validateRelativePath.wildcardNotAllowed}: {@code
     * Wildcard is not allowed here}.
     * 
     * @return
     *     {@code Wildcard is not allowed here}
     */
    public static Localizable _FilePath_validateRelativePath_wildcardNotAllowed() {
        return new Localizable(holder, "FilePath.validateRelativePath.wildcardNotAllowed");
    }

    /**
     * Key {@code Util.month}: {@code {0} mo}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} mo}
     */
    public static String Util_month(Object arg0) {
        return holder.format("Util.month", arg0);
    }

    /**
     * Key {@code Util.month}: {@code {0} mo}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} mo}
     */
    public static Localizable _Util_month(Object arg0) {
        return new Localizable(holder, "Util.month", arg0);
    }

    /**
     * Key {@code PluginManager.PluginCycleDependenciesMonitor.DisplayName}:
     * {@code Cyclic Dependencies Detector}.
     * 
     * @return
     *     {@code Cyclic Dependencies Detector}
     */
    public static String PluginManager_PluginCycleDependenciesMonitor_DisplayName() {
        return holder.format("PluginManager.PluginCycleDependenciesMonitor.DisplayName");
    }

    /**
     * Key {@code PluginManager.PluginCycleDependenciesMonitor.DisplayName}:
     * {@code Cyclic Dependencies Detector}.
     * 
     * @return
     *     {@code Cyclic Dependencies Detector}
     */
    public static Localizable _PluginManager_PluginCycleDependenciesMonitor_DisplayName() {
        return new Localizable(holder, "PluginManager.PluginCycleDependenciesMonitor.DisplayName");
    }

    /**
     * Key {@code Util.millisecond}: {@code {0} ms}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} ms}
     */
    public static String Util_millisecond(Object arg0) {
        return holder.format("Util.millisecond", arg0);
    }

    /**
     * Key {@code Util.millisecond}: {@code {0} ms}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} ms}
     */
    public static Localizable _Util_millisecond(Object arg0) {
        return new Localizable(holder, "Util.millisecond", arg0);
    }

    /**
     * Key {@code FilePath.TildaDoesntWork}: {@code ‘~’ is only supported in
     * a Unix shell and nowhere else.}.
     * 
     * @return
     *     {@code ‘~’ is only supported in a Unix shell and nowhere else.}
     */
    public static String FilePath_TildaDoesntWork() {
        return holder.format("FilePath.TildaDoesntWork");
    }

    /**
     * Key {@code FilePath.TildaDoesntWork}: {@code ‘~’ is only supported in
     * a Unix shell and nowhere else.}.
     * 
     * @return
     *     {@code ‘~’ is only supported in a Unix shell and nowhere else.}
     */
    public static Localizable _FilePath_TildaDoesntWork() {
        return new Localizable(holder, "FilePath.TildaDoesntWork");
    }

    /**
     * Key {@code
     * FilePath.validateAntFileMask.doesntMatchAnythingAndSuggest}: {@code
     * ‘{0}’ doesn’t match anything: even ‘{1}’ doesn’t exist}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything: even ‘{1}’ doesn’t exist}
     */
    public static String FilePath_validateAntFileMask_doesntMatchAnythingAndSuggest(Object arg0, Object arg1) {
        return holder.format("FilePath.validateAntFileMask.doesntMatchAnythingAndSuggest", arg0, arg1);
    }

    /**
     * Key {@code
     * FilePath.validateAntFileMask.doesntMatchAnythingAndSuggest}: {@code
     * ‘{0}’ doesn’t match anything: even ‘{1}’ doesn’t exist}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything: even ‘{1}’ doesn’t exist}
     */
    public static Localizable _FilePath_validateAntFileMask_doesntMatchAnythingAndSuggest(Object arg0, Object arg1) {
        return new Localizable(holder, "FilePath.validateAntFileMask.doesntMatchAnythingAndSuggest", arg0, arg1);
    }

    /**
     * Key {@code FilePath.validateRelativePath.notDirectory}: {@code ‘{0}’
     * is not a directory}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ is not a directory}
     */
    public static String FilePath_validateRelativePath_notDirectory(Object arg0) {
        return holder.format("FilePath.validateRelativePath.notDirectory", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.notDirectory}: {@code ‘{0}’
     * is not a directory}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ is not a directory}
     */
    public static Localizable _FilePath_validateRelativePath_notDirectory(Object arg0) {
        return new Localizable(holder, "FilePath.validateRelativePath.notDirectory", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.notFile}: {@code ‘{0}’ is not
     * a file}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ is not a file}
     */
    public static String FilePath_validateRelativePath_notFile(Object arg0) {
        return holder.format("FilePath.validateRelativePath.notFile", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.notFile}: {@code ‘{0}’ is not
     * a file}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ is not a file}
     */
    public static Localizable _FilePath_validateRelativePath_notFile(Object arg0) {
        return new Localizable(holder, "FilePath.validateRelativePath.notFile", arg0);
    }

    /**
     * Key {@code PluginWrapper.failed_to_load_dependency}: {@code {0}
     * version {1} failed to load. Fix this plugin first.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} version {1} failed to load. Fix this plugin first.}
     */
    public static String PluginWrapper_failed_to_load_dependency(Object arg0, Object arg1) {
        return holder.format("PluginWrapper.failed_to_load_dependency", arg0, arg1);
    }

    /**
     * Key {@code PluginWrapper.failed_to_load_dependency}: {@code {0}
     * version {1} failed to load. Fix this plugin first.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} version {1} failed to load. Fix this plugin first.}
     */
    public static Localizable _PluginWrapper_failed_to_load_dependency(Object arg0, Object arg1) {
        return new Localizable(holder, "PluginWrapper.failed_to_load_dependency", arg0, arg1);
    }

    /**
     * Key {@code PluginManager.UploadPluginsPermission.Description}: {@code
     * The "upload plugin" permission allows a user to upload arbitrary
     * plugins.}.
     * 
     * @return
     *     {@code The "upload plugin" permission allows a user to upload
     *     arbitrary plugins.}
     */
    public static String PluginManager_UploadPluginsPermission_Description() {
        return holder.format("PluginManager.UploadPluginsPermission.Description");
    }

    /**
     * Key {@code PluginManager.UploadPluginsPermission.Description}: {@code
     * The "upload plugin" permission allows a user to upload arbitrary
     * plugins.}.
     * 
     * @return
     *     {@code The "upload plugin" permission allows a user to upload
     *     arbitrary plugins.}
     */
    public static Localizable _PluginManager_UploadPluginsPermission_Description() {
        return new Localizable(holder, "PluginManager.UploadPluginsPermission.Description");
    }

    /**
     * Key {@code PluginManager.UpdateSiteChangeLogLevel}: {@code Change the
     * log level of {0} logger to WARNING or below to see more information
     * and the error message of every attempt}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Change the log level of {0} logger to WARNING or below to see
     *     more information and the error message of every attempt}
     */
    public static String PluginManager_UpdateSiteChangeLogLevel(Object arg0) {
        return holder.format("PluginManager.UpdateSiteChangeLogLevel", arg0);
    }

    /**
     * Key {@code PluginManager.UpdateSiteChangeLogLevel}: {@code Change the
     * log level of {0} logger to WARNING or below to see more information
     * and the error message of every attempt}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Change the log level of {0} logger to WARNING or below to see
     *     more information and the error message of every attempt}
     */
    public static Localizable _PluginManager_UpdateSiteChangeLogLevel(Object arg0) {
        return new Localizable(holder, "PluginManager.UpdateSiteChangeLogLevel", arg0);
    }

    /**
     * Key {@code ProxyConfiguration.FailedToConnectViaProxy}: {@code Failed
     * to connect to {0}.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to connect to {0}.}
     */
    public static String ProxyConfiguration_FailedToConnectViaProxy(Object arg0) {
        return holder.format("ProxyConfiguration.FailedToConnectViaProxy", arg0);
    }

    /**
     * Key {@code ProxyConfiguration.FailedToConnectViaProxy}: {@code Failed
     * to connect to {0}.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to connect to {0}.}
     */
    public static Localizable _ProxyConfiguration_FailedToConnectViaProxy(Object arg0) {
        return new Localizable(holder, "ProxyConfiguration.FailedToConnectViaProxy", arg0);
    }

    /**
     * Key {@code Functions.NoExceptionDetails}: {@code No Exception
     * details}.
     * 
     * @return
     *     {@code No Exception details}
     */
    public static String Functions_NoExceptionDetails() {
        return holder.format("Functions.NoExceptionDetails");
    }

    /**
     * Key {@code Functions.NoExceptionDetails}: {@code No Exception
     * details}.
     * 
     * @return
     *     {@code No Exception details}
     */
    public static Localizable _Functions_NoExceptionDetails() {
        return new Localizable(holder, "Functions.NoExceptionDetails");
    }

    /**
     * Key {@code PluginWrapper.Already.Disabled}: {@code The plugin ''{0}''
     * was already disabled}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The plugin ''{0}'' was already disabled}
     */
    public static String PluginWrapper_Already_Disabled(Object arg0) {
        return holder.format("PluginWrapper.Already.Disabled", arg0);
    }

    /**
     * Key {@code PluginWrapper.Already.Disabled}: {@code The plugin ''{0}''
     * was already disabled}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The plugin ''{0}'' was already disabled}
     */
    public static Localizable _PluginWrapper_Already_Disabled(Object arg0) {
        return new Localizable(holder, "PluginWrapper.Already.Disabled", arg0);
    }

    /**
     * Key {@code
     * PluginManager.PluginDoesntSupportDynamicLoad.RestartRequired}: {@code
     * {0} plugin doesn’t support dynamic loading. Jenkins needs to be
     * restarted for the update to take effect.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} plugin doesn’t support dynamic loading. Jenkins needs to be
     *     restarted for the update to take effect.}
     */
    public static String PluginManager_PluginDoesntSupportDynamicLoad_RestartRequired(Object arg0) {
        return holder.format("PluginManager.PluginDoesntSupportDynamicLoad.RestartRequired", arg0);
    }

    /**
     * Key {@code
     * PluginManager.PluginDoesntSupportDynamicLoad.RestartRequired}: {@code
     * {0} plugin doesn’t support dynamic loading. Jenkins needs to be
     * restarted for the update to take effect.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} plugin doesn’t support dynamic loading. Jenkins needs to be
     *     restarted for the update to take effect.}
     */
    public static Localizable _PluginManager_PluginDoesntSupportDynamicLoad_RestartRequired(Object arg0) {
        return new Localizable(holder, "PluginManager.PluginDoesntSupportDynamicLoad.RestartRequired", arg0);
    }

    /**
     * Key {@code PluginWrapper.NoSuchPlugin}: {@code No such plugin found
     * with the name ''{0}''}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such plugin found with the name ''{0}''}
     */
    public static String PluginWrapper_NoSuchPlugin(Object arg0) {
        return holder.format("PluginWrapper.NoSuchPlugin", arg0);
    }

    /**
     * Key {@code PluginWrapper.NoSuchPlugin}: {@code No such plugin found
     * with the name ''{0}''}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such plugin found with the name ''{0}''}
     */
    public static Localizable _PluginWrapper_NoSuchPlugin(Object arg0) {
        return new Localizable(holder, "PluginWrapper.NoSuchPlugin", arg0);
    }

    /**
     * Key {@code FilePath.validateAntFileMask.whitespaceSeparator}: {@code
     * Whitespace can no longer be used as the separator. Please Use ‘,’ as
     * the separator instead.}.
     * 
     * @return
     *     {@code Whitespace can no longer be used as the separator. Please Use
     *     ‘,’ as the separator instead.}
     */
    public static String FilePath_validateAntFileMask_whitespaceSeparator() {
        return holder.format("FilePath.validateAntFileMask.whitespaceSeparator");
    }

    /**
     * Key {@code FilePath.validateAntFileMask.whitespaceSeparator}: {@code
     * Whitespace can no longer be used as the separator. Please Use ‘,’ as
     * the separator instead.}.
     * 
     * @return
     *     {@code Whitespace can no longer be used as the separator. Please Use
     *     ‘,’ as the separator instead.}
     */
    public static Localizable _FilePath_validateAntFileMask_whitespaceSeparator() {
        return new Localizable(holder, "FilePath.validateAntFileMask.whitespaceSeparator");
    }

    /**
     * Key {@code FilePath.validateRelativePath.noSuchDirectory}: {@code No
     * such directory: ‘{0}’}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such directory: ‘{0}’}
     */
    public static String FilePath_validateRelativePath_noSuchDirectory(Object arg0) {
        return holder.format("FilePath.validateRelativePath.noSuchDirectory", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.noSuchDirectory}: {@code No
     * such directory: ‘{0}’}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such directory: ‘{0}’}
     */
    public static Localizable _FilePath_validateRelativePath_noSuchDirectory(Object arg0) {
        return new Localizable(holder, "FilePath.validateRelativePath.noSuchDirectory", arg0);
    }

    /**
     * Key {@code PluginWrapper.disabled}: {@code {0} is disabled. To fix,
     * enable it.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is disabled. To fix, enable it.}
     */
    public static String PluginWrapper_disabled(Object arg0) {
        return holder.format("PluginWrapper.disabled", arg0);
    }

    /**
     * Key {@code PluginWrapper.disabled}: {@code {0} is disabled. To fix,
     * enable it.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is disabled. To fix, enable it.}
     */
    public static Localizable _PluginWrapper_disabled(Object arg0) {
        return new Localizable(holder, "PluginWrapper.disabled", arg0);
    }

    /**
     * Key {@code ProxyConfiguration.Success}: {@code Success}.
     * 
     * @return
     *     {@code Success}
     */
    public static String ProxyConfiguration_Success() {
        return holder.format("ProxyConfiguration.Success");
    }

    /**
     * Key {@code ProxyConfiguration.Success}: {@code Success}.
     * 
     * @return
     *     {@code Success}
     */
    public static Localizable _ProxyConfiguration_Success() {
        return new Localizable(holder, "ProxyConfiguration.Success");
    }

    /**
     * Key {@code PluginWrapper.obsolete}: {@code {0} version {1} is older
     * than required. To fix, install version {2} or later.}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} version {1} is older than required. To fix, install version
     *     {2} or later.}
     */
    public static String PluginWrapper_obsolete(Object arg0, Object arg1, Object arg2) {
        return holder.format("PluginWrapper.obsolete", arg0, arg1, arg2);
    }

    /**
     * Key {@code PluginWrapper.obsolete}: {@code {0} version {1} is older
     * than required. To fix, install version {2} or later.}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} version {1} is older than required. To fix, install version
     *     {2} or later.}
     */
    public static Localizable _PluginWrapper_obsolete(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "PluginWrapper.obsolete", arg0, arg1, arg2);
    }

    /**
     * Key {@code PluginWrapper.obsoleteCore}: {@code You must update Jenkins
     * from version {0} to version {1} or later to run this plugin.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code You must update Jenkins from version {0} to version {1} or
     *     later to run this plugin.}
     */
    public static String PluginWrapper_obsoleteCore(Object arg0, Object arg1) {
        return holder.format("PluginWrapper.obsoleteCore", arg0, arg1);
    }

    /**
     * Key {@code PluginWrapper.obsoleteCore}: {@code You must update Jenkins
     * from version {0} to version {1} or later to run this plugin.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code You must update Jenkins from version {0} to version {1} or
     *     later to run this plugin.}
     */
    public static Localizable _PluginWrapper_obsoleteCore(Object arg0, Object arg1) {
        return new Localizable(holder, "PluginWrapper.obsoleteCore", arg0, arg1);
    }

    /**
     * Key {@code PluginWrapper.failed_to_load_plugin}: {@code {0} version
     * {1} failed to load.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} version {1} failed to load.}
     */
    public static String PluginWrapper_failed_to_load_plugin(Object arg0, Object arg1) {
        return holder.format("PluginWrapper.failed_to_load_plugin", arg0, arg1);
    }

    /**
     * Key {@code PluginWrapper.failed_to_load_plugin}: {@code {0} version
     * {1} failed to load.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} version {1} failed to load.}
     */
    public static Localizable _PluginWrapper_failed_to_load_plugin(Object arg0, Object arg1) {
        return new Localizable(holder, "PluginWrapper.failed_to_load_plugin", arg0, arg1);
    }

    /**
     * Key {@code
     * FilePath.validateAntFileMask.portionMatchButPreviousNotMatchAndSuggest}:
     * {@code ‘{0}’ doesn’t match anything: ‘{1}’ exists but not ‘{2}’}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything: ‘{1}’ exists but not ‘{2}’}
     */
    public static String FilePath_validateAntFileMask_portionMatchButPreviousNotMatchAndSuggest(Object arg0, Object arg1, Object arg2) {
        return holder.format("FilePath.validateAntFileMask.portionMatchButPreviousNotMatchAndSuggest", arg0, arg1, arg2);
    }

    /**
     * Key {@code
     * FilePath.validateAntFileMask.portionMatchButPreviousNotMatchAndSuggest}:
     * {@code ‘{0}’ doesn’t match anything: ‘{1}’ exists but not ‘{2}’}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything: ‘{1}’ exists but not ‘{2}’}
     */
    public static Localizable _FilePath_validateAntFileMask_portionMatchButPreviousNotMatchAndSuggest(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "FilePath.validateAntFileMask.portionMatchButPreviousNotMatchAndSuggest", arg0, arg1, arg2);
    }

    /**
     * Key {@code Util.minute}: {@code {0} min}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} min}
     */
    public static String Util_minute(Object arg0) {
        return holder.format("Util.minute", arg0);
    }

    /**
     * Key {@code Util.minute}: {@code {0} min}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} min}
     */
    public static Localizable _Util_minute(Object arg0) {
        return new Localizable(holder, "Util.minute", arg0);
    }

    /**
     * Key {@code AboutJenkins.Description}: {@code See the version and
     * license information.}.
     * 
     * @return
     *     {@code See the version and license information.}
     */
    public static String AboutJenkins_Description() {
        return holder.format("AboutJenkins.Description");
    }

    /**
     * Key {@code AboutJenkins.Description}: {@code See the version and
     * license information.}.
     * 
     * @return
     *     {@code See the version and license information.}
     */
    public static Localizable _AboutJenkins_Description() {
        return new Localizable(holder, "AboutJenkins.Description");
    }

    /**
     * Key {@code PluginWrapper.disabledAndObsolete}: {@code {0} version {1}
     * is disabled and older than required. To fix, install version {2} or
     * later and enable it.}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} version {1} is disabled and older than required. To fix,
     *     install version {2} or later and enable it.}
     */
    public static String PluginWrapper_disabledAndObsolete(Object arg0, Object arg1, Object arg2) {
        return holder.format("PluginWrapper.disabledAndObsolete", arg0, arg1, arg2);
    }

    /**
     * Key {@code PluginWrapper.disabledAndObsolete}: {@code {0} version {1}
     * is disabled and older than required. To fix, install version {2} or
     * later and enable it.}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} version {1} is disabled and older than required. To fix,
     *     install version {2} or later and enable it.}
     */
    public static Localizable _PluginWrapper_disabledAndObsolete(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "PluginWrapper.disabledAndObsolete", arg0, arg1, arg2);
    }

    /**
     * Key {@code PluginWrapper.Error.Disabling}: {@code There was an error
     * disabling the ''{0}'' plugin. Error: ''{1}''}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code There was an error disabling the ''{0}'' plugin. Error:
     *     ''{1}''}
     */
    public static String PluginWrapper_Error_Disabling(Object arg0, Object arg1) {
        return holder.format("PluginWrapper.Error.Disabling", arg0, arg1);
    }

    /**
     * Key {@code PluginWrapper.Error.Disabling}: {@code There was an error
     * disabling the ''{0}'' plugin. Error: ''{1}''}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code There was an error disabling the ''{0}'' plugin. Error:
     *     ''{1}''}
     */
    public static Localizable _PluginWrapper_Error_Disabling(Object arg0, Object arg1) {
        return new Localizable(holder, "PluginWrapper.Error.Disabling", arg0, arg1);
    }

    /**
     * Key {@code PluginManager.PortNotANumber}: {@code Port is not a
     * number}.
     * 
     * @return
     *     {@code Port is not a number}
     */
    public static String PluginManager_PortNotANumber() {
        return holder.format("PluginManager.PortNotANumber");
    }

    /**
     * Key {@code PluginManager.PortNotANumber}: {@code Port is not a
     * number}.
     * 
     * @return
     *     {@code Port is not a number}
     */
    public static Localizable _PluginManager_PortNotANumber() {
        return new Localizable(holder, "PluginManager.PortNotANumber");
    }

    /**
     * Key {@code TcpSlaveAgentListener.PingAgentProtocol.displayName}:
     * {@code Ping protocol}.
     * 
     * @return
     *     {@code Ping protocol}
     */
    public static String TcpSlaveAgentListener_PingAgentProtocol_displayName() {
        return holder.format("TcpSlaveAgentListener.PingAgentProtocol.displayName");
    }

    /**
     * Key {@code TcpSlaveAgentListener.PingAgentProtocol.displayName}:
     * {@code Ping protocol}.
     * 
     * @return
     *     {@code Ping protocol}
     */
    public static Localizable _TcpSlaveAgentListener_PingAgentProtocol_displayName() {
        return new Localizable(holder, "TcpSlaveAgentListener.PingAgentProtocol.displayName");
    }

    /**
     * Key {@code FilePath.validateAntFileMask.matchWithCaseInsensitive}:
     * {@code ‘{0}’ doesn’t match anything because it is treated case
     * sensitively. You can deactivate case sensitivity to get matches}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything because it is treated case
     *     sensitively. You can deactivate case sensitivity to get matches}
     */
    public static String FilePath_validateAntFileMask_matchWithCaseInsensitive(Object arg0) {
        return holder.format("FilePath.validateAntFileMask.matchWithCaseInsensitive", arg0);
    }

    /**
     * Key {@code FilePath.validateAntFileMask.matchWithCaseInsensitive}:
     * {@code ‘{0}’ doesn’t match anything because it is treated case
     * sensitively. You can deactivate case sensitivity to get matches}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything because it is treated case
     *     sensitively. You can deactivate case sensitivity to get matches}
     */
    public static Localizable _FilePath_validateAntFileMask_matchWithCaseInsensitive(Object arg0) {
        return new Localizable(holder, "FilePath.validateAntFileMask.matchWithCaseInsensitive", arg0);
    }

    /**
     * Key {@code PluginManager.UnexpectedException}: {@code Unexpected
     * exception going through the retrying process of checking update
     * servers}.
     * 
     * @return
     *     {@code Unexpected exception going through the retrying process of
     *     checking update servers}
     */
    public static String PluginManager_UnexpectedException() {
        return holder.format("PluginManager.UnexpectedException");
    }

    /**
     * Key {@code PluginManager.UnexpectedException}: {@code Unexpected
     * exception going through the retrying process of checking update
     * servers}.
     * 
     * @return
     *     {@code Unexpected exception going through the retrying process of
     *     checking update servers}
     */
    public static Localizable _PluginManager_UnexpectedException() {
        return new Localizable(holder, "PluginManager.UnexpectedException");
    }

    /**
     * Key {@code PluginManager.PluginUpdateMonitor.DisplayName}: {@code
     * Invalid Plugin Configuration}.
     * 
     * @return
     *     {@code Invalid Plugin Configuration}
     */
    public static String PluginManager_PluginUpdateMonitor_DisplayName() {
        return holder.format("PluginManager.PluginUpdateMonitor.DisplayName");
    }

    /**
     * Key {@code PluginManager.PluginUpdateMonitor.DisplayName}: {@code
     * Invalid Plugin Configuration}.
     * 
     * @return
     *     {@code Invalid Plugin Configuration}
     */
    public static Localizable _PluginManager_PluginUpdateMonitor_DisplayName() {
        return new Localizable(holder, "PluginManager.PluginUpdateMonitor.DisplayName");
    }

    /**
     * Key {@code FilePath.did_not_manage_to_validate_may_be_too_sl}: {@code
     * Did not manage to validate {0} (may be too slow)}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Did not manage to validate {0} (may be too slow)}
     */
    public static String FilePath_did_not_manage_to_validate_may_be_too_sl(Object arg0) {
        return holder.format("FilePath.did_not_manage_to_validate_may_be_too_sl", arg0);
    }

    /**
     * Key {@code FilePath.did_not_manage_to_validate_may_be_too_sl}: {@code
     * Did not manage to validate {0} (may be too slow)}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Did not manage to validate {0} (may be too slow)}
     */
    public static Localizable _FilePath_did_not_manage_to_validate_may_be_too_sl(Object arg0) {
        return new Localizable(holder, "FilePath.did_not_manage_to_validate_may_be_too_sl", arg0);
    }

    /**
     * Key {@code Util.year}: {@code {0} yr}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} yr}
     */
    public static String Util_year(Object arg0) {
        return holder.format("Util.year", arg0);
    }

    /**
     * Key {@code Util.year}: {@code {0} yr}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} yr}
     */
    public static Localizable _Util_year(Object arg0) {
        return new Localizable(holder, "Util.year", arg0);
    }

    /**
     * Key {@code FilePath.validateAntFileMask.doesntMatchAndSuggest}: {@code
     * ‘{0}’ doesn’t match anything, but ‘{1}’ does. Perhaps that’s what you
     * mean?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything, but ‘{1}’ does. Perhaps that’s
     *     what you mean?}
     */
    public static String FilePath_validateAntFileMask_doesntMatchAndSuggest(Object arg0, Object arg1) {
        return holder.format("FilePath.validateAntFileMask.doesntMatchAndSuggest", arg0, arg1);
    }

    /**
     * Key {@code FilePath.validateAntFileMask.doesntMatchAndSuggest}: {@code
     * ‘{0}’ doesn’t match anything, but ‘{1}’ does. Perhaps that’s what you
     * mean?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything, but ‘{1}’ does. Perhaps that’s
     *     what you mean?}
     */
    public static Localizable _FilePath_validateAntFileMask_doesntMatchAndSuggest(Object arg0, Object arg1) {
        return new Localizable(holder, "FilePath.validateAntFileMask.doesntMatchAndSuggest", arg0, arg1);
    }

    /**
     * Key {@code ProxyConfiguration.TestUrlRequired}: {@code Test URL is
     * required.}.
     * 
     * @return
     *     {@code Test URL is required.}
     */
    public static String ProxyConfiguration_TestUrlRequired() {
        return holder.format("ProxyConfiguration.TestUrlRequired");
    }

    /**
     * Key {@code ProxyConfiguration.TestUrlRequired}: {@code Test URL is
     * required.}.
     * 
     * @return
     *     {@code Test URL is required.}
     */
    public static Localizable _ProxyConfiguration_TestUrlRequired() {
        return new Localizable(holder, "ProxyConfiguration.TestUrlRequired");
    }

    /**
     * Key {@code FilePath.validateAntFileMask.doesntMatchAnything}: {@code
     * ‘{0}’ doesn’t match anything}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything}
     */
    public static String FilePath_validateAntFileMask_doesntMatchAnything(Object arg0) {
        return holder.format("FilePath.validateAntFileMask.doesntMatchAnything", arg0);
    }

    /**
     * Key {@code FilePath.validateAntFileMask.doesntMatchAnything}: {@code
     * ‘{0}’ doesn’t match anything}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything}
     */
    public static Localizable _FilePath_validateAntFileMask_doesntMatchAnything(Object arg0) {
        return new Localizable(holder, "FilePath.validateAntFileMask.doesntMatchAnything", arg0);
    }

    /**
     * Key {@code PluginManager.UpdateSiteError}: {@code Error checking
     * update sites for {0} attempt(s). Last exception was: {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Error checking update sites for {0} attempt(s). Last exception
     *     was: {1}}
     */
    public static String PluginManager_UpdateSiteError(Object arg0, Object arg1) {
        return holder.format("PluginManager.UpdateSiteError", arg0, arg1);
    }

    /**
     * Key {@code PluginManager.UpdateSiteError}: {@code Error checking
     * update sites for {0} attempt(s). Last exception was: {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Error checking update sites for {0} attempt(s). Last exception
     *     was: {1}}
     */
    public static Localizable _PluginManager_UpdateSiteError(Object arg0, Object arg1) {
        return new Localizable(holder, "PluginManager.UpdateSiteError", arg0, arg1);
    }

    /**
     * Key {@code PluginWrapper.obsoleteJava}: {@code You must update Java
     * from version {0} to version {1} or later to run this plugin.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code You must update Java from version {0} to version {1} or later
     *     to run this plugin.}
     */
    public static String PluginWrapper_obsoleteJava(Object arg0, Object arg1) {
        return holder.format("PluginWrapper.obsoleteJava", arg0, arg1);
    }

    /**
     * Key {@code PluginWrapper.obsoleteJava}: {@code You must update Java
     * from version {0} to version {1} or later to run this plugin.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code You must update Java from version {0} to version {1} or later
     *     to run this plugin.}
     */
    public static Localizable _PluginWrapper_obsoleteJava(Object arg0, Object arg1) {
        return new Localizable(holder, "PluginWrapper.obsoleteJava", arg0, arg1);
    }

    /**
     * Key {@code PluginWrapper.missing}: {@code {0} version {1} is missing.
     * To fix, install version {1} or later.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} version {1} is missing. To fix, install version {1} or
     *     later.}
     */
    public static String PluginWrapper_missing(Object arg0, Object arg1) {
        return holder.format("PluginWrapper.missing", arg0, arg1);
    }

    /**
     * Key {@code PluginWrapper.missing}: {@code {0} version {1} is missing.
     * To fix, install version {1} or later.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} version {1} is missing. To fix, install version {1} or
     *     later.}
     */
    public static Localizable _PluginWrapper_missing(Object arg0, Object arg1) {
        return new Localizable(holder, "PluginWrapper.missing", arg0, arg1);
    }

    /**
     * Key {@code Util.day}: {@code {0} {0,choice,0#days|1#day|1<days}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, a number.
     * @return
     *     {@code {0} {0,choice,0#days|1#day|1<days}}
     */
    public static String Util_day(Object arg0) {
        return holder.format("Util.day", arg0);
    }

    /**
     * Key {@code Util.day}: {@code {0} {0,choice,0#days|1#day|1<days}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, a number.
     * @return
     *     {@code {0} {0,choice,0#days|1#day|1<days}}
     */
    public static Localizable _Util_day(Object arg0) {
        return new Localizable(holder, "Util.day", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.noSuchFile}: {@code No such
     * file: ‘{0}’}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such file: ‘{0}’}
     */
    public static String FilePath_validateRelativePath_noSuchFile(Object arg0) {
        return holder.format("FilePath.validateRelativePath.noSuchFile", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.noSuchFile}: {@code No such
     * file: ‘{0}’}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such file: ‘{0}’}
     */
    public static Localizable _FilePath_validateRelativePath_noSuchFile(Object arg0) {
        return new Localizable(holder, "FilePath.validateRelativePath.noSuchFile", arg0);
    }

    /**
     * Key {@code ProxyConfiguration.MalformedTestUrl}: {@code Malformed Test
     * URL {0}.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Malformed Test URL {0}.}
     */
    public static String ProxyConfiguration_MalformedTestUrl(Object arg0) {
        return holder.format("ProxyConfiguration.MalformedTestUrl", arg0);
    }

    /**
     * Key {@code ProxyConfiguration.MalformedTestUrl}: {@code Malformed Test
     * URL {0}.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Malformed Test URL {0}.}
     */
    public static Localizable _ProxyConfiguration_MalformedTestUrl(Object arg0) {
        return new Localizable(holder, "ProxyConfiguration.MalformedTestUrl", arg0);
    }

    /**
     * Key {@code PluginManager.DisplayName}: {@code Plugin Manager}.
     * 
     * @return
     *     {@code Plugin Manager}
     */
    public static String PluginManager_DisplayName() {
        return holder.format("PluginManager.DisplayName");
    }

    /**
     * Key {@code PluginManager.DisplayName}: {@code Plugin Manager}.
     * 
     * @return
     *     {@code Plugin Manager}
     */
    public static Localizable _PluginManager_DisplayName() {
        return new Localizable(holder, "PluginManager.DisplayName");
    }

}
