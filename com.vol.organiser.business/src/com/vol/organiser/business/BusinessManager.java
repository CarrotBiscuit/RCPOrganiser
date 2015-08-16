package com.vol.organiser.business;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
import org.eclipse.core.runtime.IExtension;
=======
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
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
	
<<<<<<< HEAD
	private final String extensionPointID = "BusinessEP";
	public final String extensionName = "BusinessExtensionPoint";
	public final String extensionNameSpace = "com.vol.organiser.business";
>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======
	private IConfigurationElement[] elements;
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
	
	public BusinessManager()
	{

	}
	
<<<<<<< HEAD
<<<<<<< HEAD
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
		try {
			windowSettings = (IWindowSettings) (elements[0].createExecutableExtension("class"));
		} catch (CoreException e) {
			System.out.println("Error connecting to window settings.");
			e.printStackTrace();
		}
	}
	

	@Override
	public void startupBusinesses() {


	
	}

	@Override
	public void configureWindow(IWorkbenchWindowConfigurer windowConfigurer) {
		windowSettings.configureWindow(windowConfigurer);
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
<<<<<<< HEAD
		
	}


	
=======
	public void setupBusinesses()
	{

		IExtension[] extensions = Platform.getExtensionRegistry().getExtensions(extensionNameSpace);
		for (IExtension extension : extensions)
		{
			System.out.println(extension.getSimpleIdentifier());
			if (extension.getSimpleIdentifier().equals("background"))
			{
				elementOne = extension.getConfigurationElements();
			}
		}
=======
	@Override
	public void connectToBusinesses() {
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives

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
		try {
			windowSettings = (IWindowSettings) (elements[0].createExecutableExtension("class"));
		} catch (CoreException e) {
			System.out.println("Error connecting to window settings.");
			e.printStackTrace();
		}
	}
	

	@Override
	public void startupBusinesses() {


	
	}

	@Override
	public void configureWindow(IWorkbenchWindowConfigurer windowConfigurer) {
		windowSettings.configureWindow(windowConfigurer);
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
		// TODO Auto-generated method stub
=======
>>>>>>> a9deb43... Added more views.
		
	}

<<<<<<< HEAD
>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======

	
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
	public void addBusiness(IOrganiserBusiness organiserBusiness)
	{
		this.businesses.add(organiserBusiness);
	}
	
	public void removeBusiness(IOrganiserBusiness organiserBusiness)
	{
		this.businesses.remove(organiserBusiness);
	}
	
	public void printBusinesses()
	{
		for (IOrganiserBusiness business : this.businesses)
		{
			System.out.println(business);
		}
	}
<<<<<<< HEAD
<<<<<<< HEAD
=======

	@Override
	public void loadBusinesses() {
		System.out.println("Loading Businesses...");
		
	}

	@Override
	public void exitBusinesses() {
		System.out.println("Exiting Businesses...");
		
	}
>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
}