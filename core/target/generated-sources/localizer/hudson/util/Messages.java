// CHECKSTYLE:OFF

package hudson.util;

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
     * Key {@code HttpResponses.Saved}: {@code Saved}.
     * 
     * @return
     *     {@code Saved}
     */
    public static String HttpResponses_Saved() {
        return holder.format("HttpResponses.Saved");
    }

    /**
     * Key {@code HttpResponses.Saved}: {@code Saved}.
     * 
     * @return
     *     {@code Saved}
     */
    public static Localizable _HttpResponses_Saved() {
        return new Localizable(holder, "HttpResponses.Saved");
    }

    /**
     * Key {@code FormValidation.Error.Details}: {@code (show details)}.
     * 
     * @return
     *     {@code (show details)}
     */
    public static String FormValidation_Error_Details() {
        return holder.format("FormValidation.Error.Details");
    }

    /**
     * Key {@code FormValidation.Error.Details}: {@code (show details)}.
     * 
     * @return
     *     {@code (show details)}
     */
    public static Localizable _FormValidation_Error_Details() {
        return new Localizable(holder, "FormValidation.Error.Details");
    }

    /**
     * Key {@code ClockDifference.Behind}: {@code {0} behind}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} behind}
     */
    public static String ClockDifference_Behind(Object arg0) {
        return holder.format("ClockDifference.Behind", arg0);
    }

    /**
     * Key {@code ClockDifference.Behind}: {@code {0} behind}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} behind}
     */
    public static Localizable _ClockDifference_Behind(Object arg0) {
        return new Localizable(holder, "ClockDifference.Behind", arg0);
    }

    /**
     * Key {@code ClockDifference.Failed}: {@code Failed to check}.
     * 
     * @return
     *     {@code Failed to check}
     */
    public static String ClockDifference_Failed() {
        return holder.format("ClockDifference.Failed");
    }

    /**
     * Key {@code ClockDifference.Failed}: {@code Failed to check}.
     * 
     * @return
     *     {@code Failed to check}
     */
    public static Localizable _ClockDifference_Failed() {
        return new Localizable(holder, "ClockDifference.Failed");
    }

    /**
     * Key {@code Retrier.AttemptFailed}: {@code The attempt #{0} to do the
     * action {1} failed}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The attempt #{0} to do the action {1} failed}
     */
    public static String Retrier_AttemptFailed(Object arg0, Object arg1) {
        return holder.format("Retrier.AttemptFailed", arg0, arg1);
    }

    /**
     * Key {@code Retrier.AttemptFailed}: {@code The attempt #{0} to do the
     * action {1} failed}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The attempt #{0} to do the action {1} failed}
     */
    public static Localizable _Retrier_AttemptFailed(Object arg0, Object arg1) {
        return new Localizable(holder, "Retrier.AttemptFailed", arg0, arg1);
    }

    /**
     * Key {@code Retrier.Attempt}: {@code Attempt #{0} to do the action
     * {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Attempt #{0} to do the action {1}}
     */
    public static String Retrier_Attempt(Object arg0, Object arg1) {
        return holder.format("Retrier.Attempt", arg0, arg1);
    }

    /**
     * Key {@code Retrier.Attempt}: {@code Attempt #{0} to do the action
     * {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Attempt #{0} to do the action {1}}
     */
    public static Localizable _Retrier_Attempt(Object arg0, Object arg1) {
        return new Localizable(holder, "Retrier.Attempt", arg0, arg1);
    }

    /**
     * Key {@code Retrier.NoSuccess}: {@code Attempted the action {0} for {1}
     * time(s) with no success}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Attempted the action {0} for {1} time(s) with no success}
     */
    public static String Retrier_NoSuccess(Object arg0, Object arg1) {
        return holder.format("Retrier.NoSuccess", arg0, arg1);
    }

    /**
     * Key {@code Retrier.NoSuccess}: {@code Attempted the action {0} for {1}
     * time(s) with no success}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Attempted the action {0} for {1} time(s) with no success}
     */
    public static Localizable _Retrier_NoSuccess(Object arg0, Object arg1) {
        return new Localizable(holder, "Retrier.NoSuccess", arg0, arg1);
    }

    /**
     * Key {@code Retrier.Interruption}: {@code The attempts to do the action
     * {0} have been interrupted}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The attempts to do the action {0} have been interrupted}
     */
    public static String Retrier_Interruption(Object arg0) {
        return holder.format("Retrier.Interruption", arg0);
    }

    /**
     * Key {@code Retrier.Interruption}: {@code The attempts to do the action
     * {0} have been interrupted}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The attempts to do the action {0} have been interrupted}
     */
    public static Localizable _Retrier_Interruption(Object arg0) {
        return new Localizable(holder, "Retrier.Interruption", arg0);
    }

    /**
     * Key {@code ClockDifference.InSync}: {@code In sync}.
     * 
     * @return
     *     {@code In sync}
     */
    public static String ClockDifference_InSync() {
        return holder.format("ClockDifference.InSync");
    }

    /**
     * Key {@code ClockDifference.InSync}: {@code In sync}.
     * 
     * @return
     *     {@code In sync}
     */
    public static Localizable _ClockDifference_InSync() {
        return new Localizable(holder, "ClockDifference.InSync");
    }

    /**
     * Key {@code ClockDifference.Ahead}: {@code {0} ahead}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} ahead}
     */
    public static String ClockDifference_Ahead(Object arg0) {
        return holder.format("ClockDifference.Ahead", arg0);
    }

    /**
     * Key {@code ClockDifference.Ahead}: {@code {0} ahead}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} ahead}
     */
    public static Localizable _ClockDifference_Ahead(Object arg0) {
        return new Localizable(holder, "ClockDifference.Ahead", arg0);
    }

    /**
     * Key {@code Retrier.ExceptionFailed}: {@code The attempt #{0} to do the
     * action {1} failed with an allowed exception:}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The attempt #{0} to do the action {1} failed with an allowed
     *     exception:}
     */
    public static String Retrier_ExceptionFailed(Object arg0, Object arg1) {
        return holder.format("Retrier.ExceptionFailed", arg0, arg1);
    }

    /**
     * Key {@code Retrier.ExceptionFailed}: {@code The attempt #{0} to do the
     * action {1} failed with an allowed exception:}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The attempt #{0} to do the action {1} failed with an allowed
     *     exception:}
     */
    public static Localizable _Retrier_ExceptionFailed(Object arg0, Object arg1) {
        return new Localizable(holder, "Retrier.ExceptionFailed", arg0, arg1);
    }

    /**
     * Key {@code
     * FormFieldValidator.did_not_manage_to_validate_may_be_too_sl}: {@code
     * Did not manage to validate {0} (may be too slow)}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Did not manage to validate {0} (may be too slow)}
     */
    public static String FormFieldValidator_did_not_manage_to_validate_may_be_too_sl(Object arg0) {
        return holder.format("FormFieldValidator.did_not_manage_to_validate_may_be_too_sl", arg0);
    }

    /**
     * Key {@code
     * FormFieldValidator.did_not_manage_to_validate_may_be_too_sl}: {@code
     * Did not manage to validate {0} (may be too slow)}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Did not manage to validate {0} (may be too slow)}
     */
    public static Localizable _FormFieldValidator_did_not_manage_to_validate_may_be_too_sl(Object arg0) {
        return new Localizable(holder, "FormFieldValidator.did_not_manage_to_validate_may_be_too_sl", arg0);
    }

    /**
     * Key {@code Retrier.Success}: {@code Performed the action {0}
     * successfully at the attempt #{1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Performed the action {0} successfully at the attempt #{1}}
     */
    public static String Retrier_Success(Object arg0, Object arg1) {
        return holder.format("Retrier.Success", arg0, arg1);
    }

    /**
     * Key {@code Retrier.Success}: {@code Performed the action {0}
     * successfully at the attempt #{1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Performed the action {0} successfully at the attempt #{1}}
     */
    public static Localizable _Retrier_Success(Object arg0, Object arg1) {
        return new Localizable(holder, "Retrier.Success", arg0, arg1);
    }

    /**
     * Key {@code Retrier.Sleeping}: {@code Sleeping for {0} milliseconds
     * before a new attempt for the action {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Sleeping for {0} milliseconds before a new attempt for the
     *     action {1}}
     */
    public static String Retrier_Sleeping(Object arg0, Object arg1) {
        return holder.format("Retrier.Sleeping", arg0, arg1);
    }

    /**
     * Key {@code Retrier.Sleeping}: {@code Sleeping for {0} milliseconds
     * before a new attempt for the action {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Sleeping for {0} milliseconds before a new attempt for the
     *     action {1}}
     */
    public static Localizable _Retrier_Sleeping(Object arg0, Object arg1) {
        return new Localizable(holder, "Retrier.Sleeping", arg0, arg1);
    }

    /**
     * Key {@code Retrier.CallingListener}: {@code Calling the listener of
     * the allowed exception ''{0}'' at the attempt #{1} to do the action
     * {2}}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Calling the listener of the allowed exception ''{0}'' at the
     *     attempt #{1} to do the action {2}}
     */
    public static String Retrier_CallingListener(Object arg0, Object arg1, Object arg2) {
        return holder.format("Retrier.CallingListener", arg0, arg1, arg2);
    }

    /**
     * Key {@code Retrier.CallingListener}: {@code Calling the listener of
     * the allowed exception ''{0}'' at the attempt #{1} to do the action
     * {2}}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Calling the listener of the allowed exception ''{0}'' at the
     *     attempt #{1} to do the action {2}}
     */
    public static Localizable _Retrier_CallingListener(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "Retrier.CallingListener", arg0, arg1, arg2);
    }

    /**
     * Key {@code FormValidation.ValidateRequired}: {@code Required}.
     * 
     * @return
     *     {@code Required}
     */
    public static String FormValidation_ValidateRequired() {
        return holder.format("FormValidation.ValidateRequired");
    }

    /**
     * Key {@code FormValidation.ValidateRequired}: {@code Required}.
     * 
     * @return
     *     {@code Required}
     */
    public static Localizable _FormValidation_ValidateRequired() {
        return new Localizable(holder, "FormValidation.ValidateRequired");
    }

    /**
     * Key {@code Retrier.ExceptionThrown}: {@code The attempt #{0} to do the
     * action {1} threw a non-allowed exception, re-throwing}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The attempt #{0} to do the action {1} threw a non-allowed
     *     exception, re-throwing}
     */
    public static String Retrier_ExceptionThrown(Object arg0, Object arg1) {
        return holder.format("Retrier.ExceptionThrown", arg0, arg1);
    }

    /**
     * Key {@code Retrier.ExceptionThrown}: {@code The attempt #{0} to do the
     * action {1} threw a non-allowed exception, re-throwing}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The attempt #{0} to do the action {1} threw a non-allowed
     *     exception, re-throwing}
     */
    public static Localizable _Retrier_ExceptionThrown(Object arg0, Object arg1) {
        return new Localizable(holder, "Retrier.ExceptionThrown", arg0, arg1);
    }

}
