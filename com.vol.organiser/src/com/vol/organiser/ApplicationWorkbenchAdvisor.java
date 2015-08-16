package com.vol.organiser;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

<<<<<<< HEAD
<<<<<<< HEAD
=======
import com.vol.organiser.controller.BusinessSetup;

>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "com.vol.organiser.perspective"; //$NON-NLS-1$
	
<<<<<<< HEAD
<<<<<<< HEAD
	public ApplicationWorkbenchAdvisor()
	{
		super();
		BusinessHandle.getBusinessManager().connectToBusinesses();
=======
	BusinessSetup businessSetup;
	
	public ApplicationWorkbenchAdvisor()
	{
		super();
		businessSetup = new BusinessSetup();
		businessSetup.setup();
		
>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======
	public ApplicationWorkbenchAdvisor()
	{
		super();
		BusinessHandle.getBusinessManager().connectToBusinesses();
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
	}

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
}
