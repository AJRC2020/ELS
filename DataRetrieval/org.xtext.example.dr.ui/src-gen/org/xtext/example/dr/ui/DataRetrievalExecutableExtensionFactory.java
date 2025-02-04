/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.dr.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.dr.ui.internal.DrActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DataRetrievalExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(DrActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		DrActivator activator = DrActivator.getInstance();
		return activator != null ? activator.getInjector(DrActivator.ORG_XTEXT_EXAMPLE_DR_DATARETRIEVAL) : null;
	}

}
