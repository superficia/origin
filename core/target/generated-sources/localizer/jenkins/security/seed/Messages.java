// CHECKSTYLE:OFF

package jenkins.security.seed;

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
     * Key {@code UserSeedProperty.DisplayName}: {@code Session Termination}.
     * 
     * @return
     *     {@code Session Termination}
     */
    public static String UserSeedProperty_DisplayName() {
        return holder.format("UserSeedProperty.DisplayName");
    }

    /**
     * Key {@code UserSeedProperty.DisplayName}: {@code Session Termination}.
     * 
     * @return
     *     {@code Session Termination}
     */
    public static Localizable _UserSeedProperty_DisplayName() {
        return new Localizable(holder, "UserSeedProperty.DisplayName");
    }

}
