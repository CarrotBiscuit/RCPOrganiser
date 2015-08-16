package com.vol.organiser.background.view;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.vol.organiser.background.Activator;

public class CardView extends ViewPart {

	public static final String ID = "com.vol.organiser.background.view.CardView";

	private URL pluginInternalURL;
	private String filePath;
	//private static Image image;
	private Rectangle rectangle;

	public CardView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		System.out.println("ONCE");
		try {
			pluginInternalURL = Activator.getDefault().getBundle()
					.getEntry("icons/cardback.jpg");
			filePath = FileLocator.resolve(pluginInternalURL).getFile();
			System.out.println("FP" + filePath);
		} catch (Exception e) {
			System.out.println("ERROR " + e);
		}
		//Image image = new Image(parent.getDisplay(), filePath);
		Image image = ImageDescriptor.createFromURL(pluginInternalURL).createImage();
		Button button = new Button(parent, SWT.PUSH);
		button.setImage(image);
		button.setSize(new Point(100,100));
//
		
//		GC gc = new GC(image);
//		Color color = parent.getDisplay().getSystemColor(SWT.COLOR_RED);
//		gc.setBackground(color);
//		gc.fillRectangle(image.getBounds());
//		//gc.dispose();
//		Label label = new Label(parent.getShell(), SWT.BORDER);
//		label.setImage(image);
//		label.pack();
//		parent.getShell().pack();
//		while (!parent.getShell().isDisposed())
//		{
//			if (!parent.getDisplay().readAndDispatch())
//				parent.getDisplay().sleep();
//		}
		//parent.getDisplay().readAndDispatch();
		//image.dispose();
		//parent.getDisplay().dispose();
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}

	private void adjustSize() {

	}

}
