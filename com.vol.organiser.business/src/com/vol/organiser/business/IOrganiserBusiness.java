package com.vol.organiser.business;


import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IPageLayout;

public interface IOrganiserBusiness {
	
	public void setup();
	
	public void intialUISetup(IPageLayout layout);
	
	public void fillMenuBar(IMenuManager menuBar);
}