package com.vol.organiser.background;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IPageLayout;

import com.vol.organiser.background.view.BackgroundView;
import com.vol.organiser.business.BaseOrganiserBusiness;
import com.vol.organiser.business.IOrganiserBusiness;

public class BusinessBackground extends BaseOrganiserBusiness implements
		IOrganiserBusiness {
	
	IContributionItem contribution;

	public BusinessBackground() {
		System.out.println("background");
	}
	
	
	@Override
	public void setup()
	{
		System.out.println("Background OverrideSetup");
	}
	
	@Override
	public void intialUISetup(IPageLayout layout) {

		layout.setEditorAreaVisible(false);
		layout.addView(BackgroundView.ID, IPageLayout.LEFT, 1.0f, layout.getEditorArea());
		
	}
	
	@Override
	public void fillMenuBar(IMenuManager menuBar) 
	{
		
		//contribution = new 
		//MenuItem editMenuItem = new MenuItem(menuBar, SWT.CASCADE);
		
	}
}
