package com.vol.organiser.business;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;

import com.vol.organiser.business.window.IWindowSettings;
import com.vol.organiser.managers.IBusinessManager;

public final class BusinessManager implements IBusinessManager{
	
	private List<IOrganiserBusiness> businesses = new ArrayList<IOrganiserBusiness>(); 
	private IWindowSettings windowSettings;
	
	private static final String NAMESPACE_ID = "com.vol.organiser.business";
	private static final String BUSINESS_EP_NAME = "BusinessEP";
	private static final String WINDOW_EP_NAME = "WindowEP";
	
	private IConfigurationElement[] elements;


	
	public BusinessManager()
	{

	}
	

	@Override
	public void connectToBusinesses() {

		/**
		 * Load all business classes first.
		 */
		 elements = Platform.getExtensionRegistry()
		.getConfigurationElementsFor(NAMESPACE_ID, BUSINESS_EP_NAME);
		
		for (IConfigurationElement ele: elements)
		{
			try {
				businesses.add((IOrganiserBusiness) ele.createExecutableExtension("class"));
			} catch (CoreException e1) {
				System.out.println("Error connecting to businesses.  Business name = " + ele.getNamespaceIdentifier());
				e1.printStackTrace();
			}
		}
		elements = null;
		
		/**
		 * Connect to window class which has instructions for building windows.
		 * 
		 * There should be only one extension using this extension point.
		 */
		 elements = Platform.getExtensionRegistry()
			.getConfigurationElementsFor(NAMESPACE_ID, WINDOW_EP_NAME);
//		try {
//			windowSettings = (IWindowSettings) (elements[0].createExecutableExtension("class"));
//		} catch (CoreException e) {
//			System.out.println("Error connecting to window settings.");
//			e.printStackTrace();
//		}
	}
	

	@Override
	public void startupBusinesses() {


	
	}

	@Override
	public void configureWindow(IWorkbenchWindowConfigurer windowConfigurer) {
		//windowSettings.configureWindow(windowConfigurer);
	}

	@Override
	public void createInitialLayout(IPageLayout layout) {
		for (IOrganiserBusiness business: businesses)
		{
			business.intialUISetup(layout);
		}
	}
	
	
	@Override
	public void makeActions(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillMenuBar(IMenuManager menuBar) {
		for (IOrganiserBusiness business: businesses)
		{
			business.fillMenuBar(menuBar);
		}

		
	}
	public void setupBusinesses()
	{

//		IExtension[] extensions = Platform.getExtensionRegistry().getExtensions(extensionNameSpace);
//		for (IExtension extension : extensions)
//		{
//			System.out.println(extension.getSimpleIdentifier());
//
//			if (extension.getSimpleIdentifier().equals("background"))
//			{
//				elementOne = extension.getConfigurationElements();
//			}
//
//		}
	}
}