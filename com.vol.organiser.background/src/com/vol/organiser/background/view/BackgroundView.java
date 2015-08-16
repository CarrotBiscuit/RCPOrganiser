package com.vol.organiser.background.view;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Image;
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
<<<<<<< HEAD
=======
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
>>>>>>> 87ec274... Added some UI elements.  Very messy.
=======
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.vol.organiser.background.Activator;

public class BackgroundView extends ViewPart{

<<<<<<< HEAD
<<<<<<< HEAD
	public static final String ID = "com.vol.organiser.background.view.BackgroundView";
=======
	public static final String ID = "com.vol.organiser.background.BackgroundView";
	Canvas photo;
	
	Image scaledImage;
	double zoom;
>>>>>>> 87ec274... Added some UI elements.  Very messy.
=======
	public static final String ID = "com.vol.organiser.background.view.BackgroundView";
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
	
	String filePath;
	URL pluginInternalURL;
	
<<<<<<< HEAD
<<<<<<< HEAD
=======
	private static int ORIG_WIDTH;
	private static int ORIG_HEIGHT;
	private static Rectangle RECTBOUNDS = new Rectangle(0, 0, 100, 100);
	
	private static int WIDTH_SIZE;
	private static int HEIGHT_SIZE;
	
	private static Image image;
	private static Image SCALED_IMAGE;
>>>>>>> 87ec274... Added some UI elements.  Very messy.
=======
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
	
	@Override
	public void createPartControl(Composite parent){
		
<<<<<<< HEAD
<<<<<<< HEAD
		System.out.println("ONCE");
=======
>>>>>>> 87ec274... Added some UI elements.  Very messy.
=======
		System.out.println("ONCE");
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
		try {
			pluginInternalURL = Activator.getDefault().getBundle()
					.getEntry("icons/colour.jpg");
			filePath = FileLocator.resolve(pluginInternalURL).getFile();
<<<<<<< HEAD
<<<<<<< HEAD
			System.out.println("FP" + filePath);
		} catch (Exception e) {
			System.out.println("ERROR " + e);
		}
		
		Image image = ImageDescriptor.createFromURL(pluginInternalURL).createImage();
		Button button = new Button(parent, SWT.PUSH);
		button.setImage(image);
		button.setSize(new Point(100,100));
=======
			System.out.println(filePath);
=======
			System.out.println("FP" + filePath);
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
		} catch (Exception e) {
			System.out.println("ERROR " + e);
		}
		
<<<<<<< HEAD
>>>>>>> 87ec274... Added some UI elements.  Very messy.
=======
		Image image = ImageDescriptor.createFromURL(pluginInternalURL).createImage();
		Button button = new Button(parent, SWT.PUSH);
		button.setImage(image);
		button.setSize(new Point(100,100));
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
	

}
