package com.vol.organiser.calendar;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class CalendarView extends ViewPart {

	public static final String ID = "com.vol.organiser.calendar.calendarview";
	
	private URL pluginInternalURL;
	private String filePath;
	
	public CalendarView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		try {
			pluginInternalURL = Activator.getContext().getBundle()
					.getEntry("icons/Mushroom.png");
			filePath = FileLocator.resolve(pluginInternalURL).getFile();
			System.out.println("FP" + filePath);
		} catch (Exception e) {
			System.out.println("ERROR " + e);
		}
		//Image image = new Image(parent.getDisplay(), filePath);
		Image image = ImageDescriptor.createFromURL(pluginInternalURL).createImage();
		Button btn = new Button(parent, SWT.PUSH);
		btn.setImage(image);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
