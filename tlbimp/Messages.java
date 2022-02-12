package com4j.tlbimp;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Localization of the messages.
 *
 * @author Kohsuke Kawaguchi (kk@kohsuke.org)
 */
public final class Messages {

	enum Messages {
    RETVAL_MUST_BY_REFERENCE,
    UNSUPPORTED_VARTYPE,
    UNSUPPORTED_TYPE,
    FAILED_TO_BIND,
    USAGE,
    NO_FILE_NAME
	};

    private static final ResourceBundle rb = ResourceBundle.getBundle(Messages.class.getName());

    String format( Object args ) {
        return MessageFormat.format( rb.getString(name()), args );
    }

    public String toString() {
        return format();
    }
}
