/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.dr.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.dr.ui.internal.DrActivator;

public class DataRetrievalUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DrActivator.getInstance().getInjector("org.xtext.example.dr.DataRetrieval");
	}

}
