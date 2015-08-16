package com.vol.organiser.background;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a9deb43... Added more views.
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IPageLayout;

import com.vol.organiser.background.view.BackgroundView;
=======
import org.eclipse.swt.graphics.Point;
=======
>>>>>>> 87ec274... Added some UI elements.  Very messy.
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
=======
import org.eclipse.ui.IPageLayout;
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives

<<<<<<< HEAD
>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======
import com.vol.organiser.background.view.BackgroundView;
>>>>>>> 87ec274... Added some UI elements.  Very messy.
import com.vol.organiser.business.BaseOrganiserBusiness;
import com.vol.organiser.business.IOrganiserBusiness;

public class BusinessBackground extends BaseOrganiserBusiness implements
		IOrganiserBusiness {
<<<<<<< HEAD
<<<<<<< HEAD
	
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
=======
=======
	
	IContributionItem contribution;
>>>>>>> a9deb43... Added more views.

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

<<<<<<< HEAD
>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======
		layout.setEditorAreaVisible(false);
		layout.addView(BackgroundView.ID, IPageLayout.LEFT, 1.0f, layout.getEditorArea());
		
	}
<<<<<<< HEAD
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
=======
	
	@Override
	public void fillMenuBar(IMenuManager menuBar) 
	{
		
		//contribution = new 
		//MenuItem editMenuItem = new MenuItem(menuBar, SWT.CASCADE);
		
	}
>>>>>>> a9deb43... Added more views.
}
