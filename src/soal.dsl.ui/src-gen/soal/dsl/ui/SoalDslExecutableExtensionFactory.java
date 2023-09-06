/*
 * generated by Xtext 2.31.0
 */
package soal.dsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import soal.dsl.ui.internal.DslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SoalDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(DslActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		DslActivator activator = DslActivator.getInstance();
		return activator != null ? activator.getInjector(DslActivator.SOAL_DSL_SOALDSL) : null;
	}

}