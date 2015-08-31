package com.vol.organiser.business;


import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IPageLayout;

public class BaseOrganiserBusiness implements IOrganiserBusiness{

	@Override
	public void setup()
	{
		System.out.println("Setting up business");
	}

	@Override
	public void intialUISetup(IPageLayout layout) {
		//Default is to do nothing.
		
	}


	@Override
	public void fillMenuBar(IMenuManager menuBar) {
		// TODO Auto-generated method stub
		
	}
}
