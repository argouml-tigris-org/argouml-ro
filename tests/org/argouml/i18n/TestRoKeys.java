/* $Id$
 *******************************************************************************
 * Copyright (c) 2012 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Linus Tolke
 *******************************************************************************
 */

package org.argouml.i18n;

import java.util.Collection;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestRoKeys extends CheckKey {
    @Parameters
    public static Collection<Object[]> getAllKeys() {
	return CheckKey.getKeysFor(
		new Locale("ro"),
		new CheckKey.IgnoredKey() {
		    public boolean ignore(String theKey,
					  Locale theLocale,
					  ResourceBundle theLabels,
					  ResourceBundle theRootLabels) {
			return theKey.matches("profile..*")
                                || theKey.matches("wfr..*")
                                || theKey.matches("argouml-sql..*")
                                || theKey.matches("cpp..*")
                                || theKey.matches("java..*");
		    }
		}
		);
    }

    public TestRoKeys(String theKey, Locale theLocale,
		      ResourceBundle theLabels,
		      ResourceBundle theRootLabels) {
	super(theKey, theLocale, theLabels, theRootLabels);
    }
}
