package com.vol.organiser.managers;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;

public interface IBusinessManager {
	
	public void connectToBusinesses();
	
	public void startupBusinesses();
	
	public void makeActions(IWorkbenchWindow window);

	public void fillMenuBar(IMenuManager menuBar);
	
	public void configureWindow(IWorkbenchWindowConfigurer windowConfigurer);
	
	public void createInitialLayout(IPageLayout layout);
}