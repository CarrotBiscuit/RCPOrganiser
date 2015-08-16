package com.vol.organiser.managers;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
<<<<<<< HEAD

public interface IBusinessManager {
	
	public void connectToBusinesses();
	
	public void startupBusinesses();
	
	public void makeActions(IWorkbenchWindow window);

	public void fillMenuBar(IMenuManager menuBar);
	
	public void configureWindow(IWorkbenchWindowConfigurer windowConfigurer);
	
	public void createInitialLayout(IPageLayout layout);
=======
//mport com.vol.organiser.business.IOrganiserBusiness;
=======
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives

public interface IBusinessManager {
	
	public void connectToBusinesses();
	
	public void startupBusinesses();
	
<<<<<<< HEAD
	public void exitBusinesses();
>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======
	public void makeActions(IWorkbenchWindow window);

	public void fillMenuBar(IMenuManager menuBar);
	
	public void configureWindow(IWorkbenchWindowConfigurer windowConfigurer);
	
	public void createInitialLayout(IPageLayout layout);
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives

}
