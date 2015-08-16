package com.vol.organiser;

<<<<<<< HEAD
<<<<<<< HEAD
=======
import org.eclipse.swt.graphics.Point;
>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new ApplicationActionBarAdvisor(configurer);
    }
    
<<<<<<< HEAD
<<<<<<< HEAD
    IWorkbenchWindowConfigurer configurer;
    public void preWindowOpen() {
        configurer = getWindowConfigurer();
        BusinessHandle.getBusinessManager().configureWindow(configurer);
    }
    
    @Override
    public void postWindowOpen()
    {
    	configurer.getWindow().getShell().setMaximized(true);
=======
    public void preWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
<<<<<<< HEAD
        configurer.setInitialSize(new Point(400, 300));
        configurer.setShowCoolBar(false);
        configurer.setShowStatusLine(false);
        configurer.setTitle("Hello RCP"); //$NON-NLS-1$
>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======
=======
    IWorkbenchWindowConfigurer configurer;
    public void preWindowOpen() {
        configurer = getWindowConfigurer();
>>>>>>> a9deb43... Added more views.
        BusinessHandle.getBusinessManager().configureWindow(configurer);
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
    }
    
    @Override
    public void postWindowOpen()
    {
    	configurer.getWindow().getShell().setMaximized(true);
    }
}
