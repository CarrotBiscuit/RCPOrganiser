package com.vol.organiser.background.view;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.vol.organiser.background.Activator;

public class BackgroundView extends ViewPart{

	public static final String ID = "com.vol.organiser.background.view.BackgroundView";

	
	String filePath;
	URL pluginInternalURL;
	
	
	@Override
	public void createPartControl(Composite parent){
		
		try {
			pluginInternalURL = Activator.getDefault().getBundle()
					.getEntry("icons/colour.jpg");
			filePath = FileLocator.resolve(pluginInternalURL).getFile();
			System.out.println("FP" + filePath);
		} catch (Exception e) {
			System.out.println("ERROR " + e);
		}
//		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
	

}
