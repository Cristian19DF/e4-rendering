/*******************************************************************************
 * Copyright (c) 2011 Kai Toedter and others.
 * 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Kai Toedter - initial API and implementation
 ******************************************************************************/

package com.toedter.e4.demo.contacts.swing.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;

@SuppressWarnings("restriction")
public class ExitHandler {
	@Execute
	public void exit(MApplication application) {
		System.out.println("Exit...");
		synchronized (application) {
			application.notifyAll();
		}
	}

	// @Execute
	// public void exit(IWorkbench workbench) {
	// workbench.close();
	// }
}
