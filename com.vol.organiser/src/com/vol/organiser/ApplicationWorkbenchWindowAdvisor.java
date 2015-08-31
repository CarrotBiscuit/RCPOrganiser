package com.vol.organiser;

import org.eclipse.swt.graphics.Point;
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
    

    IWorkbenchWindowConfigurer configurer;
    public void preWindowOpen() {
        configurer = getWindowConfigurer();
        BusinessHandle.getBusinessManager().configureWindow(configurer);
    }
    
    @Override
    public void postWindowOpen()
    {
    	configurer.getWindow().getShell().setMaximized(true);
    }

}
