package com.vol.organiser;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import com.vol.organiser.managers.IBusinessManager;

public class BusinessHandle {
	
	private static BusinessHandle instance;
	private static IBusinessManager businessManager;

	private static final String NAMESPACE_ID = "com.vol.organiser";
	private static final String BUSINESSMANAGER_EP_NAME = "BusinessManagerEP";
	
	private BusinessHandle() 
	{
		IConfigurationElement[] elements = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(NAMESPACE_ID,
						BUSINESSMANAGER_EP_NAME);
		try {
			businessManager = (IBusinessManager) elements[0]
					.createExecutableExtension("class");
		} catch (CoreException e1) {
			System.out.println("Error connection to BusinessManager "+ e1.getMessage());
		}
	}
	
	public static IBusinessManager getBusinessManager()
	{
		if (BusinessHandle.instance == null)
		{
			BusinessHandle.instance = new BusinessHandle();
		}
		return BusinessHandle.businessManager;
	}
}
