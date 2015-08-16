package com.vol.organiser;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    protected void makeActions(IWorkbenchWindow window) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
=======
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
    	BusinessHandle.getBusinessManager().makeActions(window);
    }

    protected void fillMenuBar(IMenuManager menuBar) {
    	BusinessHandle.getBusinessManager().fillMenuBar(menuBar);
<<<<<<< HEAD
<<<<<<< HEAD
=======
    }

    protected void fillMenuBar(IMenuManager menuBar) {
>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
=======
    }

    protected void fillMenuBar(IMenuManager menuBar) {
>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
    }
    
}
