package com.vol.organiser.window.settings;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;

import com.vol.organiser.business.window.IWindowSettings;


public class WindowSetup implements IWindowSettings{
	
	public WindowSetup()
	{
		System.out.println("Initial Setup");
	}
	
	public void configureWindow(IWorkbenchWindowConfigurer windowConfigurer)
	{
		//PlatformUI.getWorkbench().getDisplay().getActiveShell().setMaximized(true);
		windowConfigurer.setInitialSize(new Point(500, 500));
		windowConfigurer.setShowCoolBar(true);
		windowConfigurer.setShowStatusLine(false);
		windowConfigurer.setShowPerspectiveBar(true);
		windowConfigurer.setTitle("Organiser"); //$NON-NLS-1$		
	}
}
